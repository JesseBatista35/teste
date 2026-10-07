cd /opt/ads-agent/esteira-jboss-vm
grep -rn "Consultar os dados do sistema" roles/ stack_monitoracao.yml -A15

grep -rln "ANSIBLE_VAULT" group_vars/ roles/ 2>/dev/null
git log -5 --format='%h %ad %an %s' --date=iso -- group_vars/ roles/zabbix/

