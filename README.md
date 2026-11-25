# 1. Assumir root
sudo su -

# 2. Descobrir o nome exato do serviço do JBoss
systemctl list-units --type=service --all | grep -iE 'jboss|eap|wildfly'

# 3. Restart (troque pelo nome que aparecer acima, ex.: jboss-eap7)
systemctl restart <nome-do-servico>

# 4. Conferir se subiu
systemctl status <nome-do-servico> --no-pager -l
