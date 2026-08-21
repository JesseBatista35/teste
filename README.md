---
- name: Parse JSON data
  set_fact:
    nfs_path: "{{ item.NFS_MOUNT_POINT }}"
    nfs_src: "{{ item.NFS_ENDPOINT }}"

- debug:
    msg: "{{ item }}"
- debug:
    msg: "{{ nfs_path }}"    
- debug:
    msg: "{{ nfs_src }}"    


- name: Verificando as variaveis
  assert:
    that:
      - nfs_path is defined
      - nfs_src  is defined
    fail_msg: Favor verificar se as variaveis 'nfs_path' e 'nfs_src' estão definidas

- name: Instalando o NFS Client
  yum:
    name: nfs-utils
    state: present

- name: Install networker lgtoclnt_url
  command: "rpm -ivh --relocate /usr=/opt/networker {{ lgtoclnt_url }}"
  ignore_errors: yes

- name: Install networker lgtonmda_url
  command: "rpm -ivh --relocate /usr=/opt/networker {{ lgtonmda_url }}"  
  ignore_errors: yes

- name: Remove pacote jbcs-httpd
  ansible.builtin.file:
    path: /nsr
    state: absent

- name: Create a symbolic link
  ansible.builtin.file:
    src: /opt/nsr
    dest: /nsr
    state: link
    force: yes    

- name: Networker | Start networker
  service: name=networker.service state=started enabled=yes

- name: Executar o comando abaixo para limitar as portas
  command: /opt/networker/bin/nsrports -S 7937-8057

- name: Networker | Restart networker
  command: systemctl restart networker


- name: Montando volume remoto
  mount:
    path: "{{ nfs_path }}"
    src: "{{ nfs_src }}"
    backup: yes
    fstype: "{{ nfs_fstype }}"
    opts: rw,sync,hard
    state: mounted
  register: mountnfs
  ignore_errors: yes

- name:  Validando Montagem
  assert:
    that:
      - "'Connection refused' in mountnfs.msg"
    fail_msg: "Erro desconhecido: {{ mountnfs.msg }}"
    success_msg: "Por Favor verificar o compartilhamento informado: {{ nfs_src }}"
  when: not mountnfs.changed and mountnfs.msg is defined
  register: assertnfs
