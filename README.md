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
