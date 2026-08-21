stack_deployments_custom.yml


---
- name: Copiando deployments adicionais
  hosts: jboss
  gather_facts: no
  tasks:
    - name: Buscando diretorio de config
      set_fact:
        config_path: "{{ default_working_directory_tfs }}/_{{ build_repository_name_tfs }}-config"
        filetype: deployments
      
    - name: Buscando diretorio de config
      set_fact:
        dir_src: "{{ config_path | dirname }}/{{ filetype }}"
        dir_dest: "{{ jboss_home }}/standalone/{{ filetype }}"

    - name: Create a symbolic link
      file:
        path: "{{ dir_src }}"
        state: directory
        mode: 0777
      delegate_to: localhost

    - name: Verifica se o arquivo  existe
      stat:
        path: "{{ config_path }}/jboss-deployments"
      register: jbda
      changed_when: false
      delegate_to: localhost
    
    - block:
      - name: Lendo artefatos do arquivo CSV
        read_csv:
          path: "{{ config_path }}/jboss-deployments"
          delimiter: ":"
        register: deployments
        delegate_to: localhost
      
      - name: Teste
        debug:
          msg: "Artefato: {{ item.artifact_id }} - versao {{ item.version }}"
        loop: "{{ deployments.list }}"
        delegate_to: localhost

      - maven_artifact:
          group_id: "{{ item.group_id }}"
          artifact_id: "{{ item.artifact_id }}"
          extension: "{{ item.extension|default('jar',true) }}"
          repository_url: "http://binario.caixa:8081/repository/caixa-group-br"
          version: "{{ item.version }}"
          dest: "{{ dir_src }}/{{ item.artifact_id }}.{{ item.extension|default('jar',true) }}"
          timeout: 60
          mode: 0777
        loop: "{{ deployments.list }}"
        delegate_to: localhost

      - name: Copiando artefatos para o(s) servidor(es) Jboss
        copy:
          src: "{{ dir_src }}/"
          dest: "{{ dir_dest }}"
          owner: jboss
          group: jboss
          mode: 0644

      - name: Sem artefatos de deployments
        debug:
          msg: "Sem deployments adicional"
        when: deployments.list | length == 0
      when:
        - jbda.stat.exists
