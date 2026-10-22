   unzip -l /tmp/intchk/../intchk 2>/dev/null; cd /tmp/intchk
   unzip -o -q /opt/jboss-eap/standalone/deployments/sigsj_internet-ear.ear sigsj_internet-war-2.67.war
   unzip -l sigsj_internet-war-2.67.war | grep -i ojdbc
