---
- hosts: local
  gather_facts: true
  tasks:
    - include_role:
        name: jboss 
       
- name: Configurando o DNS
  hosts: "{{ ( sistema_ambiente != 'prd') | ternary('dns_nprd',  ('dns_prd_'+site)) }}"
  become: False
  gather_facts: no
  tasks:
             
    - name: Atualizando o inventário para garantir a existência de novas instâncias no inventário
      meta: refresh_inventory  
      
    - name: Consultar DNS
      debug:
        msg: "DNS configurado com sucesso"
      run_once: true
  
  tags: 
    - dns
