cd /opt/jboss-eap/standalone/configuration

# Substitui pela senha mascarada correta
sed -i 's|value="changeit" />|value="MASK-lHQotGsUSmQ5YQRzdtNLD361rwn0c0oJ" />|g' standalone-full-ha.xml

# Verifica
grep -A 2 "KEYSTORE_PASSWORD" standalone-full-ha.xml


pkill -9 java
sleep 5
cd /opt/jboss-eap/bin
nohup ./standalone.sh -c standalone-full-ha.xml > /tmp/jboss-full.log 2>&1 &
sleep 20
tail -100 /logs/jboss/server.log | grep -i "started\|fatal\|error"
