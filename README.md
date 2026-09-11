find / -xdev \( -iname "server.log*" -o -iname "boot.log*" \) -mmin -4320 2>/dev/null
ls -la /opt | grep -iE 'jboss|eap|wildfly'


tail -n 1000 <caminho>/server.log
