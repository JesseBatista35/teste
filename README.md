cat /proc/net/tcp | awk '{print $2}' | grep -v local_address

lsof -i -P -n 2>/dev/null | grep java

ls -la /proc/13536/fd 2>/dev/null | grep socket | wc -l
cat /proc/13536/net/tcp 2>/dev/null | awk 'NR>1 {print $2}'

/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.88.30:9999

/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=127.0.0.1:9990

/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.88.20:9990

