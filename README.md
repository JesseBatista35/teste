sudo su -
# charset e locale que a JVM está usando
ps -ef | grep file.encoding
locale
grep -i "encoding\|Dfile" /opt/jboss-eap/bin/standalone.conf
