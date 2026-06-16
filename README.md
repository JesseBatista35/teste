# Muda pra usuário jboss
su - jboss

# Vai pro diretório
cd /opt/jboss-eap

# Inicia com standalone-full-ha.xml
./bin/standalone.sh -c standalone-full-ha.xml > /tmp/jboss-startup.log 2>&1 &

# Volta pra root
exit

# Aguarda inicializar (30 segundos)
sleep 30

# Vê o log
tail -100 /tmp/jboss-startup.log

# Verifica se está rodando
ps aux | grep jboss | grep -v grep










cd /opt/jboss-eap/bin
nohup ./standalone.sh -c standalone-full-ha.xml > /opt/jboss-eap/standalone/log/startup.log 2>&1 &
sleep 30
tail -100 /opt/jboss-eap/standalone/log/startup.log
