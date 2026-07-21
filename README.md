find / -iname "*.jar" -path "*wildfly*" 2>/dev/null
find / -iname "jboss-modules.jar" 2>/dev/null
find / -maxdepth 3 -type d 2>/dev/null | grep -iE "wildfly|eap|sirsa"
netstat -tlnp 2>/dev/null | grep -E "8080|9990|8443"
cat /etc/hostname
