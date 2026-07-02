grep -i "siarg" /logs/jboss/jboss-eap/standalone/siarg-interno/server.log | tail -50



tail -200 /logs/jboss/jboss-eap/standalone/siarg-interno/server.log


grep -n -i "ERROR\|Exception\|Caused by" /logs/jboss/jboss-eap/standalone/siarg-interno/server.log | tail -40


netstat -tlnp | grep java
ss -tlnp | grep java

find / -iname "*httpd*" -path "*log*" 2>/dev/null

tail -100 <caminho_encontrado>/error_log

