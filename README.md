ps -ef | grep -i [j]boss | tr ' ' '\n' | grep -E "jboss.home.dir|jboss.server.base.dir|port-offset|jboss.node.name|-c$|\.xml$" | sort -u
ss -ltnp 2>/dev/null | grep -E ":80[0-9]{2} |:8443 |:9990 |:9999 " | awk '{print $4}' | sort -u
find / -maxdepth 7 \( -name "*sigsj*.ear" -o -name "*sigsj*.war" -o -name "boletoService*" \) 2>/dev/null | head -20

ls -l --time-style=long-iso /opt/jboss/jboss-eap/standalone/deployments/
find /opt/jboss /var/log/httpd /logs -name "*access*" -newermt "2026-09-01" 2>/dev/null | head
uptime; last -n 15 | head -15
ss -tn state established '( sport = :8080 or sport = :8009 or sport = :443 or sport = :80 )' 2>/dev/null | head

