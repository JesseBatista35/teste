# Tentar ss em vez de netstat (não depende tanto de privilégio)
ss -tln | grep -E ":86|:87|:99|:47"

# Verificar se há arquivo de env específico por instância (padrão comum: /etc/jboss-as/jboss-as-CSD2.conf ou similar)
find / -iname "*CSD2*" -not -path "/home/siaoi/jboss-eap-6.4/CSD2/*" 2>/dev/null
find / -iname "*CSD6*" -not -path "/home/siaoi/jboss-eap-6.4/CSD6/*" 2>/dev/null

# Verificar histórico do usuário siaoi, se acessível
cat /home/siaoi/.bash_history 2>/dev/null | grep -i "port-offset\|CSD"

# Verificar se há um crontab ou script de boot que referencia todos os nodes com seus offsets
crontab -l -u root 2>/dev/null | grep -i jboss
ls -la /etc/cron.d/ 2>/dev/null | grep -i jboss
cat /etc/rc.local 2>/dev/null | grep -i jboss
