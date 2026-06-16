# Para o JBoss se tiver rodando
pkill -9 java

sleep 5

# Inicia em background
cd /opt/jboss-eap/bin
nohup ./standalone.sh -c standalone-full-ha.xml > /tmp/jboss-full.log 2>&1 &

# Aguarda um pouco
sleep 15

# Vê o log completo
cat /tmp/jboss-full.log
