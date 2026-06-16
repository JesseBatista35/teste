# Sai do jboss
exit

# Cria a pasta
mkdir -p /logs/jboss

# Muda donos e permissões
chown -R jboss:jboss /logs/jboss
chmod -R 755 /logs/jboss

# Verifica
ls -la /logs/

# Verifica o arquivo de config
grep -i "path=" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml | grep -i log | head -5
