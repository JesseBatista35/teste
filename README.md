grep -A1 "socket-binding-group" /home/jboss-eap-6.4/standaloneCSD6/configuration/standaloneCSD6.xml | head -3


mkdir -p /var/log/jboss-as
nohup /home/jboss-eap-6.4/bin/standalone.sh \
  -Djboss.node.name=CSD2 \
  -Djboss.server.base.dir=/home/jboss-eap-6.4/standaloneCSD2 \
  -b 0.0.0.0 -bmanagement 0.0.0.0 \
  -c standaloneCSD2.xml \
  > /var/log/jboss-as/consoleCSD2.log 2>&1 &

sleep 20
tail -60 /var/log/jboss-as/consoleCSD2.log
ps -ef | grep -i CSD2


