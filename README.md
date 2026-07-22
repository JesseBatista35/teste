---
- name: Lendo artefatos do arquivo CSV
  read_csv:
    path: "{{ item.item }}/jboss-modules-custom"
    delimiter: ":"
  register: modules
  delegate_to: localhost

- name: Mostra lista de artefatos
  debug:
    msg: "Artefato: {{ item.artifact_id }} - versao {{ item.version }}"
  loop: "{{ modules.list }}"
  delegate_to: localhost

- name: Listar arquivos no diretório baixados anteriormente
  find:
    paths: "{{ dir_dest }}"
    recurse: no
    file_type: file
  register: files_found


- maven_artifact:
    group_id: "{{ inner_item.group_id }}"
    artifact_id: "{{ inner_item.artifact_id }}"
    extension: "{{ inner_item.extension|default('jar',true) }}"
    repository_url: "http://binario.caixa:8081/repository/caixa-group-br"
    version: "{{ inner_item.version }}"
    dest: "{{ item.item }}/{{ filetype }}/{{ inner_item.artifact_id }}-{{ inner_item.version }}.{{ inner_item.extension|default('jar',true) }}"
    timeout: 60
    mode: 0777
  loop: "{{ modules.list }}"
  loop_control:
    loop_var: "inner_item"
  delegate_to: localhost
  when: (inner_item.artifact_id ~ '-' ~ inner_item.version ~ '.' ~ (inner_item.extension | default('jar', true))) not in (files_found.files | map(attribute='path') | map('basename') | list)

- name: Verifica se o arquivo jboss-modules-custom tem conteudo
  stat:
    path: "{{ item.item }}/jboss-custom.cli"
  register: jbosscli
  changed_when: false
  delegate_to: localhost

- name: Copiando artefatos (Modules) para o(s) servidor(es) Jboss
  copy:
    src: "{{ item.item }}/{{ filetype }}/"
    dest: "{{ dir_dest }}"
    owner: jboss
    group: jboss
    mode: 0644 

- name: Copiando artefato (jboss-custom.cli) para o(s) servidor(es) Jboss
  copy:
    src: "{{ item.item }}/jboss-custom.cli"
    dest: "{{ dir_dest }}"
    owner: jboss
    group: jboss
    mode: 0644
  when: jbosscli.stat.exists

- name: Executando o jboss-custom.cli
  shell:
    cmd: ./jboss-cli.sh --file=/tmp/src/jboss-custom.cli
    chdir: "{{ jboss_home }}/bin"
  when: item.stat.exists and jbosscli.stat.exists and item.stat.size > 0 and jbosscli.stat.size > 0

- name: Encontrar todos os arquivos module.xml
  find:
    paths: "{{ jboss_home }}/modules"  # Modifique para o caminho desejado
    patterns: "module.xml"
    excludes: "system"
    recurse: yes
  register: arquivos_encontrados
  when: item.stat.exists and jbosscli.stat.exists and item.stat.size > 0 and jbosscli.stat.size > 0

- name: Filtrar arquivos dentro da pasta system na raiz
  set_fact:
    arquivos_filtrados: "{{ arquivos_encontrados.files | selectattr('path', 'search', '^/opt/jboss-eap/modules/system/') | list }}"
  when: item.stat.exists and jbosscli.stat.exists and item.stat.size > 0 and jbosscli.stat.size > 0  

- name: Filtrar arquivos fora da pasta system na raiz
  set_fact:
    arquivos_validos: "{{ arquivos_encontrados.files | difference(arquivos_filtrados) }}"
  when: item.stat.exists and jbosscli.stat.exists and item.stat.size > 0 and jbosscli.stat.size > 0  

- name: Modificar versões nas dependências dentro das tags <module>
  lineinfile:
    path: "{{ inner_item.path }}"
    regexp: '(module name="[^"]*):slot=([0-9a-zA-Z.-]+)"(.*)/>'
    line: '<\1" slot="\2"\3/>'
    backrefs: yes
  loop: "{{ arquivos_validos }}"
  loop_control:
    loop_var: "inner_item"
  when: item.stat.exists and jbosscli.stat.exists and item.stat.size > 0 and jbosscli.stat.size > 0  

- name: Sem modules adicionais
  debug:
    msg: "Sem modules adicional"
  when: modules.list | length == 0
