# Ver os jobs/scripts do agente Control-M nesse host
ls -la /opt/ctmage/
find /opt/ctmage -iname "*siccp*" -o -iname "*sigdb*" 2>/dev/null

# Ver o usuário sob o qual o agente Control-M roda
ps -ef | grep -i ctm
id ctmagelx

# Procurar scripts em /opt/batch que referenciem sigdb
grep -rl "sigdb" /opt/batch/ 2>/dev/null
