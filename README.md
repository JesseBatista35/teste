ls /etc/init.d/ | grep -iE "jboss|eap"
ls -la /opt | grep -iE "jboss|eap"
find / -maxdepth 5 -iname "domain.sh" 2>/dev/null


find / -maxdepth 6 -iname "jboss-eap*" -type d 2>/dev/null
