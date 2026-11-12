---
- hosts: jboss
  gather_facts: no
  tasks:
  - name: "Verifica se o arquivo {{ jboss_home }}/standalone/configuration/custom.sh existe"
    stat:
      path: "{{ jboss_home }}/standalone/configuration/custom.sh"
    register: custom_result

  - name: "Executa shell customizada (jboss_home)"
    shell: "{{ jboss_home }}/standalone/configuration/custom.sh"
    when: custom_result.stat.exists

  - name: "Verifica se o arquivo {{ batch_path_config }}/configuration/custom.sh existe"
    stat:
      path: "{{ batch_path_config }}/configuration/custom.sh"
    register: custom_batch_result

  - name: "Executa shell customizada (batch_path_config)"
    shell: "{{ batch_path_config }}/configuration/custom.sh"
    when: custom_batch_result.stat.exists



    so lemrbando que esse repo minllheres de aplicaçoes usam ele aqui na caixa
