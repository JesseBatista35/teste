- name: Debug grupos
  debug:
    var: groups
  run_once: true

- name: Consultar DNS
  vars:
    hostname: "{{ hostvars[item].inventory_hostname_short }}"
