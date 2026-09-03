su - spssodr1 -c "nohup /opt/open/sso/7.3.0/bin/standalone.sh -c standalone.xml -Djboss.server.name=siset_srjdeapllx075_inter_8080 -Djboss.as.management.blocking.timeout=1000 > /dev/null 2>&1 &"


ps -ef | grep jboss
tail -f /opt/open/sso/7.3.0/standalone/log/server.log
