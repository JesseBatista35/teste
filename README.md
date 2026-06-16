# Ver o log completo
tail -200 /opt/jboss-eap/standalone/log/server.log

# OU se não tiver, tenta ver:
cat /opt/jboss-eap/standalone/log/server.log | tail -200








# Verifica permissões
ls -la /opt/jboss-eap/standalone/log/

# Verifica se há espaço em disco
df -h /opt

# Verifica erros do sistema
dmesg | tail -50
