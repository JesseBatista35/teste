hostname; ls -d /opt/ads-agent/esteira-jboss-vm

cd /opt/ads-agent/esteira-jboss-vm
grep -rn "Consultar os dados do sistema" roles/ -A15

grep -rn "<nome_da_variavel>" . --include=*.yml --include=*.yaml
grep -rln "ANSIBLE_VAULT" group_vars/ roles/*/vars/ 2>/dev/null

git log -5 --format='%h %ad %an %s' --date=iso -- <arquivo>
