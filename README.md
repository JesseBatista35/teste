stack_apache.yml

- hosts: "jboss"
  gather_facts: no
  pre_tasks:
    - name: Sobrescrevendo groups vars
      include_vars: "group_vars/{{ site | default(sistema_ambiente,True) }}"
  roles:
    - apache
  vars:
    sticky: "{{ lookup('env', 'HTTP_ENABLE_STICKS') | default('yes', True) | bool }}"
    when: apache_local is defined and apache_local == true


=====================================
stack_deployments_custom.yml

---
- name: Copiando deployments adicionais
  hosts: jboss
  gather_facts: no
  tasks:
    - name: Cria variável build_repository_name
      set_fact:
        build_repository_name: "{{ '_' ~ build_repository_name_tfs if build_repository_name_tfs is defined else lookup('ansible.builtin.env', 'BUILDNAMEORIG') }}"

    - name: Buscando diretorio de config
      set_fact:
        config_path:
          - "{{ default_working_directory_tfs }}/{{ build_repository_name }}-config"
          - "{{ default_working_directory_tfs }}/{{ build_repository_name }}-config/jboss"
        filetype: deployments

    - name: Buscando diretorio de config
      set_fact:
        dir_dest: "{{ jboss_home }}/standalone/{{ filetype }}"

    - name: Create a symbolic link
      file:
        path: "{{ item | dirname}}/{{ filetype }}"
        state: directory
        mode: 0777
      delegate_to: localhost
      with_items: "{{ config_path }}"

    - name: Verifica se o arquivo  existe
      stat:
        path: "{{ item }}/jboss-deployments"
      register: jbda
      changed_when: false
      delegate_to: localhost
      with_items: "{{ config_path }}"

    - name: Criando artefatos
      include_tasks: "roles/jboss/tasks/stack_deployments_custom_block.yml"
      when:
        - item.stat.exists
      with_items: "{{ jbda.results }}"
