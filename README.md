sudo su -
# JVM
ps -ef | grep file.encoding | grep -v grep
# camada web (undertow)
grep -i "default-encoding" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
