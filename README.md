
-sh-4.2$
-sh-4.2$ cd /opt/ads-agent/esteira-jboss-vm
-sh-4.2$ rep -rn "Consultar os dados do sistema" roles/ stack_monitoracao.yml -A15
-sh: rep: comando não encontrado
-sh-4.2$ grep -rn "Consultar os dados do sistema" roles/ stack_monitoracao.yml -A15
roles/zabbix/tasks/.criaconsolidado.yml.20240523110533.p947976:32:    - name: Consultar os dados do sistema.
roles/zabbix/tasks/.criaconsolidado.yml.20240523110533.p947976-33-      community.postgresql.postgresql_query:
roles/zabbix/tasks/.criaconsolidado.yml.20240523110533.p947976-34-        connect_params:
roles/zabbix/tasks/.criaconsolidado.yml.20240523110533.p947976-35-          target_session_attrs: read-write
roles/zabbix/tasks/.criaconsolidado.yml.20240523110533.p947976-36-          connect_timeout: 10
roles/zabbix/tasks/.criaconsolidado.yml.20240523110533.p947976-37-        login_host: "{{ db_ip }}"
roles/zabbix/tasks/.criaconsolidado.yml.20240523110533.p947976-38-        login_port: "{{ db_porta }}"
roles/zabbix/tasks/.criaconsolidado.yml.20240523110533.p947976-39-        login_user: "{{ db_user }}"
roles/zabbix/tasks/.criaconsolidado.yml.20240523110533.p947976-40-        login_password: "{{ db_password }}"
roles/zabbix/tasks/.criaconsolidado.yml.20240523110533.p947976-41-        db: "{{ db_name }}"
roles/zabbix/tasks/.criaconsolidado.yml.20240523110533.p947976-42-        query: "SELECT * FROM {{ db_tabela }} WHERE SIGLA = '{{ sistema_nome.split('-')[0] | upper }}'"
roles/zabbix/tasks/.criaconsolidado.yml.20240523110533.p947976-43-      register: sistema_get
roles/zabbix/tasks/.criaconsolidado.yml.20240523110533.p947976-44-      delegate_to: localhost
roles/zabbix/tasks/.criaconsolidado.yml.20240523110533.p947976-45-
roles/zabbix/tasks/.criaconsolidado.yml.20240523110533.p947976-46-    - name: Inserindo sistema quando nÃ£o houver dados!
roles/zabbix/tasks/.criaconsolidado.yml.20240523110533.p947976-47-      community.postgresql.postgresql_query:
--
roles/zabbix/tasks/.criaconsolidado.yml.20240626100600.p947976:32:    - name: Consultar os dados do sistema.
roles/zabbix/tasks/.criaconsolidado.yml.20240626100600.p947976-33-      community.postgresql.postgresql_query:
roles/zabbix/tasks/.criaconsolidado.yml.20240626100600.p947976-34-        connect_params:
roles/zabbix/tasks/.criaconsolidado.yml.20240626100600.p947976-35-          target_session_attrs: read-write
roles/zabbix/tasks/.criaconsolidado.yml.20240626100600.p947976-36-          connect_timeout: 10
roles/zabbix/tasks/.criaconsolidado.yml.20240626100600.p947976-37-        login_host: "{{ db_ip }}"
roles/zabbix/tasks/.criaconsolidado.yml.20240626100600.p947976-38-        login_port: "{{ db_porta }}"
roles/zabbix/tasks/.criaconsolidado.yml.20240626100600.p947976-39-        login_user: "{{ db_user }}"
roles/zabbix/tasks/.criaconsolidado.yml.20240626100600.p947976-40-        login_password: "{{ db_password }}"
roles/zabbix/tasks/.criaconsolidado.yml.20240626100600.p947976-41-        db: "{{ db_name }}"
roles/zabbix/tasks/.criaconsolidado.yml.20240626100600.p947976-42-        query: "SELECT * FROM {{ db_tabela }} WHERE SIGLA = '{{ zabbix_template_grp | upper }}'"
roles/zabbix/tasks/.criaconsolidado.yml.20240626100600.p947976-43-      register: sistema_get
roles/zabbix/tasks/.criaconsolidado.yml.20240626100600.p947976-44-      delegate_to: localhost
roles/zabbix/tasks/.criaconsolidado.yml.20240626100600.p947976-45-
roles/zabbix/tasks/.criaconsolidado.yml.20240626100600.p947976-46-    - name: Inserindo sistema quando nÃ£o houver dados!
roles/zabbix/tasks/.criaconsolidado.yml.20240626100600.p947976-47-      community.postgresql.postgresql_query:
--
roles/zabbix/tasks/.criaconsolidado.yml.20240704180710.p947976:37:    - name: Consultar os dados do sistema.
roles/zabbix/tasks/.criaconsolidado.yml.20240704180710.p947976-38-      community.postgresql.postgresql_query:
roles/zabbix/tasks/.criaconsolidado.yml.20240704180710.p947976-39-        login_host: "{{ db_ip }}"
roles/zabbix/tasks/.criaconsolidado.yml.20240704180710.p947976-40-        login_port: "{{ db_porta }}"
roles/zabbix/tasks/.criaconsolidado.yml.20240704180710.p947976-41-        login_user: "{{ db_user }}"
roles/zabbix/tasks/.criaconsolidado.yml.20240704180710.p947976-42-        login_password: "{{ db_password }}"
roles/zabbix/tasks/.criaconsolidado.yml.20240704180710.p947976-43-        db: "{{ db_name }}"
roles/zabbix/tasks/.criaconsolidado.yml.20240704180710.p947976-44-        query:
roles/zabbix/tasks/.criaconsolidado.yml.20240704180710.p947976-45-          "SELECT
roles/zabbix/tasks/.criaconsolidado.yml.20240704180710.p947976-46-                *
roles/zabbix/tasks/.criaconsolidado.yml.20240704180710.p947976-47-          FROM
roles/zabbix/tasks/.criaconsolidado.yml.20240704180710.p947976-48-                {{ db_tabela }}
roles/zabbix/tasks/.criaconsolidado.yml.20240704180710.p947976-49-          WHERE
roles/zabbix/tasks/.criaconsolidado.yml.20240704180710.p947976-50-                SIGLA = '{{  zabbix_template_grp | upper }}'"
roles/zabbix/tasks/.criaconsolidado.yml.20240704180710.p947976-51-      register: sistema_get
roles/zabbix/tasks/.criaconsolidado.yml.20240704180710.p947976-52-      delegate_to: localhost
--
roles/zabbix/tasks/.criaconsolidado.yml.20240710120714.p513951:39:    - name: Consultar os dados do sistema.
roles/zabbix/tasks/.criaconsolidado.yml.20240710120714.p513951-40-      community.postgresql.postgresql_query:
roles/zabbix/tasks/.criaconsolidado.yml.20240710120714.p513951-41-        login_host: "{{ db_ip }}"
roles/zabbix/tasks/.criaconsolidado.yml.20240710120714.p513951-42-        login_port: "{{ db_porta }}"
roles/zabbix/tasks/.criaconsolidado.yml.20240710120714.p513951-43-        login_user: "{{ db_user }}"
roles/zabbix/tasks/.criaconsolidado.yml.20240710120714.p513951-44-        login_password: "{{ db_password }}"
roles/zabbix/tasks/.criaconsolidado.yml.20240710120714.p513951-45-        db: "{{ db_name }}"
roles/zabbix/tasks/.criaconsolidado.yml.20240710120714.p513951-46-        query:
roles/zabbix/tasks/.criaconsolidado.yml.20240710120714.p513951-47-          "SELECT
roles/zabbix/tasks/.criaconsolidado.yml.20240710120714.p513951-48-                *
roles/zabbix/tasks/.criaconsolidado.yml.20240710120714.p513951-49-          FROM
roles/zabbix/tasks/.criaconsolidado.yml.20240710120714.p513951-50-                {{ db_tabela }}
roles/zabbix/tasks/.criaconsolidado.yml.20240710120714.p513951-51-          WHERE
roles/zabbix/tasks/.criaconsolidado.yml.20240710120714.p513951-52-                SIGLA = '{{  zabbix_template_grp | upper }}'"
roles/zabbix/tasks/.criaconsolidado.yml.20240710120714.p513951-53-      register: sistema_get
roles/zabbix/tasks/.criaconsolidado.yml.20240710120714.p513951-54-      delegate_to: localhost
--
roles/zabbix/tasks/criaconsolidado.yml:39:    - name: Consultar os dados do sistema.
roles/zabbix/tasks/criaconsolidado.yml-40-      community.postgresql.postgresql_query:
roles/zabbix/tasks/criaconsolidado.yml-41-        login_host: "{{ db_ip }}"
roles/zabbix/tasks/criaconsolidado.yml-42-        login_port: "{{ db_porta }}"
roles/zabbix/tasks/criaconsolidado.yml-43-        login_user: "{{ db_user }}"
roles/zabbix/tasks/criaconsolidado.yml-44-        login_password: "{{ db_password }}"
roles/zabbix/tasks/criaconsolidado.yml-45-        db: "{{ db_name }}"
roles/zabbix/tasks/criaconsolidado.yml-46-        query:
roles/zabbix/tasks/criaconsolidado.yml-47-          "SELECT
roles/zabbix/tasks/criaconsolidado.yml-48-                *
roles/zabbix/tasks/criaconsolidado.yml-49-          FROM
roles/zabbix/tasks/criaconsolidado.yml-50-                {{ db_tabela }}
roles/zabbix/tasks/criaconsolidado.yml-51-          WHERE
roles/zabbix/tasks/criaconsolidado.yml-52-                SIGLA = '{{  zabbix_template_grp | upper }}'"
roles/zabbix/tasks/criaconsolidado.yml-53-      register: sistema_get
roles/zabbix/tasks/criaconsolidado.yml-54-      delegate_to: localhost
--
roles/zabbix/tasks/.criaconsolidado.yml.20261006131048.a567498:39:    - name: Consultar os dados do sistema.
roles/zabbix/tasks/.criaconsolidado.yml.20261006131048.a567498-40-      community.postgresql.postgresql_query:
roles/zabbix/tasks/.criaconsolidado.yml.20261006131048.a567498-41-        login_host: "{{ db_ip }}"
roles/zabbix/tasks/.criaconsolidado.yml.20261006131048.a567498-42-        login_port: "{{ db_porta }}"
roles/zabbix/tasks/.criaconsolidado.yml.20261006131048.a567498-43-        login_user: "{{ db_user }}"
roles/zabbix/tasks/.criaconsolidado.yml.20261006131048.a567498-44-        login_password: "{{ db_password }}"
roles/zabbix/tasks/.criaconsolidado.yml.20261006131048.a567498-45-        db: "{{ db_name }}"
roles/zabbix/tasks/.criaconsolidado.yml.20261006131048.a567498-46-        query:
roles/zabbix/tasks/.criaconsolidado.yml.20261006131048.a567498-47-          "SELECT
roles/zabbix/tasks/.criaconsolidado.yml.20261006131048.a567498-48-                *
roles/zabbix/tasks/.criaconsolidado.yml.20261006131048.a567498-49-          FROM
roles/zabbix/tasks/.criaconsolidado.yml.20261006131048.a567498-50-                {{ db_tabela }}
roles/zabbix/tasks/.criaconsolidado.yml.20261006131048.a567498-51-          WHERE
roles/zabbix/tasks/.criaconsolidado.yml.20261006131048.a567498-52-                SIGLA = '{{  zabbix_template_grp | upper }}'"
roles/zabbix/tasks/.criaconsolidado.yml.20261006131048.a567498-53-      register: sistema_get
roles/zabbix/tasks/.criaconsolidado.yml.20261006131048.a567498-54-      delegate_to: localhost
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -rln "ANSIBLE_VAULT" group_vars/ roles/ 2>/dev/null
group_vars/dns_nprd
group_vars/dns_prd
group_vars/dtc_canais_pix
group_vars/pix-dtc
group_vars/.all.20220929170909.a970358
group_vars/.all.20230616150631.a919724
group_vars/.prd.20230812230815.p745573
group_vars/.ctc_canais_pix.20230812230851.p745573
group_vars/.ctc_canais_pix.20230813000834.p745573
group_vars/.prd.20231021181002.p745573
group_vars/.all.20240517160514.p947976
group_vars/.all.20240520140504.p947976
group_vars/.ctc_canais_pix.20240903170923.a919724
group_vars/ctc_canais_pix
group_vars/prd
group_vars/all
-sh-4.2$ git log -5 --format='%h %ad %an %s' --date=iso -- group_vars/ roles/zabbix/
01a50ac 2021-12-09 15:16:02 -0300 root Alteração do vcenter de NPRD e NPCN
44a0273 2021-12-03 14:28:59 -0300 root Alteração do vcenter de NPRD
e2f3654 2021-12-03 14:06:36 -0300 root Alteração do vcenter de NPRD
c3824df 2021-09-27 10:06:21 -0300 Mauricio Alves da Silva Perez Merged PR 6681: Control-M
f5926f3 2021-08-19 17:20:57 -0300 root Configs TSM
-sh-4.2$
