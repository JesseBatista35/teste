cd /opt/jboss-eap/standalone/configuration

# Remove os <!-- errados
sed -i 's|<!--         |        |g; s| -->||g' standalone-full-ha.xml

# Verifica
grep -A 6 "<vault>" standalone-full-ha.xml
