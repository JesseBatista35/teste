cd /opt/jboss-eap/standalone/configuration

# Restaura do backup
cp standalone-full-ha.xml.backup standalone-full-ha.xml

# Verifica se restaurou
wc -l standalone-full-ha.xml
grep "<vault>" standalone-full-ha.xml | head -3
