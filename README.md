cat /opt/jboss-eap/standalone/log/startup.log



# Ver se tem arquivo de erro
ls -la /opt/jboss-eap/standalone/log/ | grep -i error

# Ver todos os logs
cat /opt/jboss-eap/standalone/log/* 2>/dev/null | head -200
