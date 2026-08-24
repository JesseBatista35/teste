grep -i JBOSS /root/.bash_profile 2>/dev/null
grep -i JBOSS /root/.bashrc 2>/dev/null
grep -i JBOSS /etc/profile 2>/dev/null
grep -rn "JBOSS_HOME" /etc/profile.d/ 2>/dev/null
grep -rn "JBOSS_HOME=/home/siaoi" / --include="*.conf" --include="*.sh" --include=".bash*" 2>/dev/null | grep -v jboss-eap-6.4/bin
