sed -n '370,375p' /opt/jboss-eap/standalone/log/server.log
grep -nE 'ajp-listener|socket-binding name="(ajp|modcluster)"' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml

grep -rniE "mod_cluster|proxy_cluster|ManagerBalancerName" /etc/httpd/ 2>/dev/null

