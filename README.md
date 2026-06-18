---
- hosts: local
  gather_facts: true
  tasks:
    - include_role:
        name: vm 

       
- name: Configurando o DNS
  hosts: "{{ ( sistema_ambiente != 'prd') | ternary('dns_nprd',  ('dns_prd_'+site)) }}"
  become: False
  gather_facts: no
  tasks:
             
    - name: Atualizando o inventário para garantir a existência de novas instâncias no inventário
      meta: refresh_inventory  

    - name: Consultar DNS
      vars:
        hostname: "{{ hostvars[item].inventory_hostname_short }}"
        ip: "{{ hostvars[item].ansible_host }}"
        dominio: "{{ dns_dominio }}"
      command: dig +short "{{ hostname }}.{{ dominio }}" +timeout=5
      loop: "{{ groups.jboss }}"
      register: dig_result
      delegate_to: localhost
      run_once: true
      
    - name: Verificar se o domínio resolve para um IP
      debug:
        msg: "O domínio {{ item.item }} resolve para os seguintes endereços IP: {{ item.stdout_lines }}"
      when: item.stdout_lines | length > 0
      loop: "{{ dig_result.results }}"
      run_once: true

    - name: Falha se o domínio não resolver para um IP
      debug:
        msg: "O domínio {{ item.item }} não resolve para nenhum endereço IP."
      when: item.stdout_lines | length == 0  
      loop: "{{ dig_result.results }}"
      run_once: true

    - name: Set not created DNS
      set_fact:
        not_created_dns: "{{  not_created_dns | default([]) + [{'host': item.item, 'ip': '' }] }}"
      when: item.stdout_lines | length == 0  
      loop: "{{ dig_result.results }}"
      run_once: true  

    - name: Set created DNS
      set_fact:
        created_dns: "{{  created_dns | default([]) + [{'host': item.item, 'ip': item.stdout_lines[0] }] }}"
      when: item.stdout_lines | length != 0  
      loop: "{{ dig_result.results }}"
      run_once: true    

    - include_role:
        name: dns
      vars:
        hostname: "{{ hostvars[item].inventory_hostname_short }}"
        ip: "{{ hostvars[item].ansible_host }}"
        dominio: "{{ dns_dominio }}"
        hostname_full: "{{ hostvars[item].inventory_hostname_short }}.{{ dns_dominio }}"
        dns_create: yes
      loop: "{{ groups.jboss }}"
      when: (not_created_dns is defined and (not_created_dns | selectattr('host','equalto', hostname_full) | list)) or ( created_dns is defined and (created_dns | selectattr('host','equalto', hostname_full) | selectattr('ip','ne', ip) | list))
  
  tags: 
    - dns


