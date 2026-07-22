---

- name: Cria variável build_repository_name
  set_fact:
    build_repository_name: "{{ '_' ~ build_repository_name_tfs if build_repository_name_tfs is defined else lookup('ansible.builtin.env', 'BUILDNAMEORIG') }}"

- name: Buscando diretorio de config
  set_fact:
    config_path_default: "{{ default_working_directory_tfs }}/{{ build_repository_name }}-config/httpd"
    config_path:
      - "{{ default_working_directory_tfs }}/{{ build_repository_name }}-config"
      - "{{ default_working_directory_tfs }}/{{ build_repository_name }}-config/httpd"

# tasks file for apache
- name: "Ansible Create directory {{ http_home }}/conf.d/old if not exists"
  file:
    path: "{{ http_home }}/conf.d/old"
    state: directory
    mode: '0755'
    group: apache
    owner: apache

- name: Listar arquivos da pasta conf.d
  command: ls "{{ http_home }}/conf.d"
  register: lista_arquivos
  changed_when: false

- name: Desabilitando configurações conf.d
  command: mv "{{ http_home }}/conf.d/{{ item }}" "{{ http_home }}/conf.d/old/"
  loop: "{{ lista_arquivos.stdout_lines }}"
  when: item != "vhost.conf" and item != "old"

- name: "Ansible Create directory {{ http_home }}/htdocs/httpd_eap_esteiraagil if not exists"
  file:
    path: "{{ http_home }}/htdocs/httpd_eap_esteiraagil"
    state: directory
    mode: '0755'
    group: apache
    owner: apache

- name: Unarchiving Artifacts [HTDOCS]
  unarchive:
    remote_src: yes
    src: "{{ htdocs_files }}"
    dest: "{{ http_home }}/htdocs/httpd_eap_esteiraagil/"
    list_files: true
    mode: '0755'
    owner: "apache"
    group: "apache"

- name: Allow new incoming SYN packets on TCP port 80 (HTTP)
  iptables:
    chain: INPUT
    protocol: tcp
    destination_port: '80'
    ctstate: NEW
    syn: match
    jump: ACCEPT
    comment: Accept new HTTP connections.

- name: Allow new incoming SYN packets on TCP port 443 (HTTPS)
  iptables:
    chain: INPUT
    protocol: tcp
    destination_port: '443'
    ctstate: NEW
    syn: match
    jump: ACCEPT
    comment: Accept new HTTP connections.

- name: "Cria pasta para monitoração customizada do apache caso não exista"
  file:
    path: "/logs/monitoracao/"
    state: directory
    mode: '0755'
    group: apache
    owner: apache

- name: Create config file httpd.conf
  template:
    src: httpd.conf.j2
    dest: "{{ http_home }}/conf/httpd.conf"
    mode: '0755'
    lstrip_blocks: yes

- name: Extrai linhas entre strings que começam com "# mandatory LogFormat"
  command:  awk '/^# mandatory LogFormat/{flag=(!flag);next}flag' {{ http_home }}/conf/httpd.conf
  register: awk_result

- name: Deploy Virtual Host
  template:
    src: vhost.conf.j2
    dest: "{{ http_home }}/conf.d/vhost.conf"
    owner: "apache"
    group: "apache"
    mode: '0644'
    lstrip_blocks: yes
  notify: Reload Apache

- name: Apache | Create file
  template: src=apache.service.j2 dest=/etc/systemd/system/httpd-eap.service mode=644 owner=apache group=apache
  notify:
    - reload systemctl

- name: Apache | Start apache
  service: name=httpd-eap.service state=started enabled=yes

- name: Get httpd.conf status
  local_action: stat path="{{ item }}/httpd.conf"
  register: httpd
  with_items: "{{ config_path }}"

- name: Get vhost.conf status
  local_action: stat path="{{ item }}/vhost.conf"
  register: vhost
  with_items: "{{ config_path }}"

- name: Get httpd-{{ sistema_ambiente }}.conf status
  local_action: stat path="{{ item }}/httpd-{{ sistema_ambiente }}.conf"
  register: httpdambiente
  with_items: "{{ config_path }}"

- name: Get vhost-{{ sistema_ambiente }}.conf status
  local_action: stat path="{{ item }}/vhost-{{ sistema_ambiente }}.conf"
  register: vhostambiente
  with_items: "{{ config_path }}"

- name: Get 00-mpm.conf status
  local_action: stat path="{{ item }}/00-mpm.conf"
  register: mpm
  with_items: "{{ config_path }}"

- name: Get 00-proxy.conf status
  local_action: stat path="{{ item }}/00-proxy.conf"
  register: proxy_apache_conf
  with_items: "{{ config_path }}"

- name: Copiando arquivo httpd.conf
  copy:
    src: "{{ item.0.item }}/httpd.conf"
    dest: "{{ http_home }}/conf/httpd.conf"
    remote_src: no
    owner: apache
    group: apache
  when: item.0.stat.exists and not item.1.stat.exists
  with_nested:
    - "{{ httpd.results }}"
    - "{{ httpdambiente.results }}"
  notify: Reload Apache

- name: Copiando arquivo vhost.conf
  copy:
    src: "{{ item.0.item }}/vhost.conf"
    dest: "{{ http_home }}/conf.d/vhost.conf"
    remote_src: no
    owner: apache
    group: apache
  when: item.0.stat.exists and not item.1.stat.exists
  with_nested:
    - "{{ vhost.results }}"
    - "{{ vhostambiente.results }}"
  notify: Reload Apache

- name: Copiando arquivo httpd-{{ sistema_ambiente }}
  copy:
    src: "{{ item.item }}/httpd-{{ sistema_ambiente }}.conf"
    dest: "{{ http_home }}/conf/httpd.conf"
    remote_src: no
    owner: apache
    group: apache
  when: item.stat.exists
  notify: Reload Apache
  with_items: "{{ httpdambiente.results }}"

- name: Verifica se existe uma linha que começa com LogFormat no arquivo de destino
  command: grep -q '^LogFormat' {{ http_home }}/conf/httpd.conf
  register: grep_result
  ignore_errors: yes

- name: Verifica se existe uma linha igual
  command: grep -q {{ awk_result.stdout }} {{ http_home }}/conf/httpd.conf
  register: grep_result_igual
  ignore_errors: yes

- name: Adiciona bloco de texto após a última ocorrência de LogFormat se encontrado
  blockinfile:
    path: "{{ http_home }}/conf/httpd.conf"
    block: |
      {{ awk_result.stdout }}
    insertafter: "^LogFormat"
  when: grep_result.rc == 0 and awk_result.stdout != '' and grep_result_igual.rc != 0

- name: Adiciona bloco de texto ao final do arquivo de destino se não encontrado LogFormat
  blockinfile:
    path: "{{ http_home }}/conf/httpd.conf"
    block: |
      {{ awk_result.stdout }}
    insertafter: EOF
    create: yes  # Cria o arquivo se não existir
  when: grep_result.rc != 0 and awk_result.stdout != '' and grep_result_igual.rc != 0

- name: Copiando arquivo vhost-{{ sistema_ambiente }}
  copy:
    src: "{{ item.item }}/vhost-{{ sistema_ambiente }}.conf"
    dest: "{{ http_home }}/conf.d/vhost.conf"
    remote_src: no
    owner: apache
    group: apache
  when: item.stat.exists
  notify: Reload Apache
  with_items: "{{ vhostambiente.results }}"

- name: Copiando arquivo 00-mpm.conf
  copy:
    src: 00-mpm.conf
    dest: "{{ http_home }}/conf.modules.d/00-mpm.conf"
    owner: apache
    group: apache

- name: Copiando arquivo 00-mpm.conf do repo
  copy:
    src: "{{ item.item }}/00-mpm.conf"
    dest: "{{ http_home }}/conf.modules.d/00-mpm.conf"
    remote_src: no
    owner: apache
    group: apache
  when: item.stat.exists
  notify: Reload Apache
  with_items: "{{ mpm.results }}"

- name: Copiando arquivo 00-proxy.conf do repo
  copy:
    src: "{{ item.item }}/00-proxy.conf"
    dest: "{{ http_home }}/conf.modules.d/00-proxy.conf"
    remote_src: no
    owner: apache
    group: apache
  when: item.stat.exists
  notify: Reload Apache
  with_items: "{{ proxy_apache_conf.results }}"

- name: Check directory configuration exists
  stat:
    path: "{{ config_path_default }}/configuration"
  delegate_to: localhost
  register: is_extra_files

- name: "ensures {{ http_home }}/configuration dir exists"
  file:
    path: "{{ http_home }}/configuration"
    state: directory
    mode: '0755'
    group: apache
    owner: apache
#  when: ( is_extra_files.stat.exists and is_extra_files.stat.isdir ) or ( secure_files_list is defined and secure_files_list.split(',') | length > 0 and item != "" )

- name: "Copiando arquivos para {{ http_home }}/configuration"
  copy:
    src: "{{ config_path_default }}/configuration/"
    dest: "{{ http_home }}/configuration/."
    remote_src: no
    owner: apache
    group: apache
    mode: 0755
  notify: Reload Apache
  when: is_extra_files.stat.exists and is_extra_files.stat.isdir

- name: "Copiando arquivos de secure file"
  copy:
    src: "{{ item }}"
    dest: "{{ http_home }}/configuration/."
    owner: apache
    group: apache
    mode: 0755
  loop: "{{ secure_files_list.split(',') }}"
  loop_control:
    label: "{{ item | basename }}"
  notify: Reload Apache
  when: secure_files_list is defined and secure_files_list.split(',') | length > 0 and item != ""
