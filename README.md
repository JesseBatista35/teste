---
# file: site.yml
- import_playbook: stack_vm.yml
  tags: vm
- import_playbook: stack_monitoracao.yml
  tags: monitoracao
- import_playbook: stack_ldap.yml
  tags: ldap
- import_playbook: stack_apache.yml
  tags: apache
- import_playbook: stack_jboss.yml
  tags: jboss
- hosts: jboss
  gather_facts: no
  roles:
    - nfs
  tags:
    - git_conf

- hosts: jboss
  gather_facts: no
  roles:
    - nfs
  tags:
    - nfs

- import_playbook: stack_disable_unit_jboss.yml
  tags: git_conf
- import_playbook: stack_deployments_custom.yml
  tags: git_conf
- import_playbook: stack_modules_custom.yml
  tags: git_conf
- import_playbook: stack_jboss_handlers.yml
- import_playbook: stack_hosts.yml
  tags:
    - git_conf
- import_playbook: stack_custom.yml
  tags:
    - git_conf
    - custom
#  tags:
#    - git_conf
#    - deploy
- import_playbook: restart_jboss.yml
  tags: restart_jboss
- import_playbook: stop_jboss.yml
  tags: stop_jboss
- import_playbook: stack_tsm.yml
  tags: tsm
- import_playbook: stack_hosts.yml
  tags: controlm
- import_playbook: stack_controlm.yml
  tags: controlm

- hosts: "jboss"
  roles:
    - satellite
  tags: satellite

- hosts: "jboss"
  roles:
    - logrotate
  tags: logrotate

- import_playbook: stack_batch.yml
  tags: batch

- hosts: "localhost"
  gather_facts: no
  tasks:
     - include_tasks: roles/vm/tasks/size/executed.yml
  tags: size_executado

- hosts: jboss
  roles:
    - relogio
    - tunning
  tags: size_executado

- hosts: jboss
  gather_facts: no
  roles:
    - datagrid
  tags:
    - datagrid


- hosts: jboss
  gather_facts: no
  roles:
    - sigdb
  tags:
    - sigdb
