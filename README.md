<img width="1696" height="840" alt="image" src="https://github.com/user-attachments/assets/2e22289d-cf95-4c1c-950e-052b115ba6dc" />


a questao qe eque voe ta falando de u mrepo que ano esta configurado aqui


ssh  10.122.155.67
 
cat /opt/ads-agent/esteira-jboss-vm/roles/zabbix/defaults/main.yml

zabbix_log_file_size: 1

zabbix_timeout: 30

zabbix_version: 6.0.23-release1

#Cria grupo/host api zabbix

zabbix_username: api_esteira

zabbix_password: C3m07Z2bb1x2dx

zabbix_token: "1865f89361c9d98b36600ec269f5930bdc66cef246042d05293473235a14d7af"

zabbix_url: https://monitoracao.az.cloud.caixa/zabbixapi/api_jsonrpc.php

zabbix_hostname: "{{ inventory_hostname.split('.')[0] }}"

zabbix_ip: "{{ hostvars[inventory_hostname]['ansible_host'] }}"

zabbix_proxy: "Proxy-Cloud-cadsvaprlx402"

zabbix_host: 10.122.157.167

versao: "1.1.11"

datahora: "{{ now(utc=false,fmt='%Y-%m-%d %H:%M:%S') }}"

tipo_sistema: "ansible"

fonte: "esteiras"

#Consulta e atuliza dados no postgresql

db_tabela: btrad_tb_sistemas

db_ip: 10.244.74.86

db_porta: 5432

db_esquema: mon

db_name: monitordb001

db_user: monitdbadm

db_password: V4rn9xtM

 


[root@cadsvaprlx072 p981778]# cat /opt/ads-agent/esteira-jboss-vm/roles/zabbix/defaults/main.yml

zabbix_log_file_size: 1

zabbix_timeout: 30

zabbix_version: 6.0.23-release1

#Cria grupo/host api zabbix

zabbix_username: api_esteira

zabbix_password: C3m07Z2bb1x2dx

zabbix_token: "1865f89361c9d98b36600ec269f5930bdc66cef246042d05293473235a14d7af"

zabbix_url: https://monitoracao.az.cloud.caixa/zabbixapi/api_jsonrpc.php

zabbix_hostname: "{{ inventory_hostname.split('.')[0] }}"

zabbix_ip: "{{ hostvars[inventory_hostname]['ansible_host'] }}"

zabbix_proxy: "Proxy-Cloud-cadsvaprlx402"

zabbix_host: 10.122.157.167

versao: "1.1.11"

datahora: "{{ now(utc=false,fmt='%Y-%m-%d %H:%M:%S') }}"

tipo_sistema: "ansible"

fonte: "esteiras"

#Consulta e atuliza dados no postgresql

db_tabela: btrad_tb_sistemas

db_ip: 10.244.74.86

db_porta: 5432

db_esquema: mon

db_name: monitordb001

db_user: monitdbadm

db_password: V4rn9xtM
 
[root@cadsvaprlx072 p981778]# cat /opt/ads-agent/esteira-jboss-vm/roles/zabbix/defaults/main.yml

zabbix_log_file_size: 1

zabbix_timeout: 30

zabbix_version: 6.0.23-release1

#Cria grupo/host api zabbix

zabbix_username: api_esteira

zabbix_password: C3m07Z2bb1x2dx

zabbix_token: "1865f89361c9d98b36600ec269f5930bdc66cef246042d05293473235a14d7af"

zabbix_url: https://monitoracao.az.cloud.caixa/zabbixapi/api_jsonrpc.php

zabbix_hostname: "{{ inventory_hostname.split('.')[0] }}"

zabbix_ip: "{{ hostvars[inventory_hostname]['ansible_host'] }}"

zabbix_proxy: "Proxy-Cloud-cadsvaprlx402"

zabbix_host: 10.122.157.167

versao: "1.1.11"

datahora: "{{ now(utc=false,fmt='%Y-%m-%d %H:%M:%S') }}"

tipo_sistema: "ansible"

fonte: "esteiras"

#Consulta e atuliza dados no postgresql

db_tabela: btrad_tb_sistemas

db_ip: 10.244.74.86

db_porta: 5432

db_esquema: mon

db_name: monitordb001

db_user: monitdbadm

db_password: V4rn9xtM
 
[root@cadsvaprlx072 p981778]#

 
