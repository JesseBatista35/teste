# Para o JBoss se tiver rodando
pkill -9 java

# Aguarda
sleep 5

# Muda permissões da pasta
chown -R jboss:jboss /opt/jboss-eap/standalone
chmod -R 755 /opt/jboss-eap/standalone

# Verifica
ls -la /opt/jboss-eap/standalone/ | head -20
