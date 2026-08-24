mkdir -p /var/log/jboss-as
nohup /home/jboss-eap-6.4/bin/standalone.sh \
  -Djboss.node.name=CSD6 \
  -Djboss.server.base.dir=/home/jboss-eap-6.4/standaloneCSD6 \
  -b 0.0.0.0 -bmanagement 0.0.0.0 \
  -c standaloneCSD6.xml \
  > /var/log/jboss-as/consoleCSD6.log 2>&1 &

sleep 20
tail -60 /var/log/jboss-as/consoleCSD6.log
ps -ef | grep -i CSD6
