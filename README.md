ps -ef | grep java | grep -E "jboss-eap-7.4|jboss-eap-7.0" | grep -oE "jboss.bind.address(.management)?=[0-9.]+|jboss.domain.base.dir=[^ ]+"

find /opt -maxdepth 2 -iname "*7.4*" 2>/dev/null
find / -maxdepth 4 -iname "*eap-7.4*" -o -iname "*jboss-eap-7.4*" 2>/dev/null

