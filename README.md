cat /etc/jboss-as/jboss-as.conf


grep -r "port-offset\|socket-binding" /home/siaoi/jboss-eap-6.4/CSD2/configuration/standalone.xml | head -5
grep -r "port-offset\|socket-binding" /home/siaoi/jboss-eap-6.4/CSD6/configuration/standalone.xml | head -5
