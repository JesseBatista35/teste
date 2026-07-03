netstat -tlnp 2>/dev/null | grep 8009
ss -tlnp 2>/dev/null | grep 8009

tail -100 /logs/httpd/*caixa-error.log

find /logs/httpd -iname "*siarg*" -o -iname "*error*"

grep -A5 "ajp" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml

