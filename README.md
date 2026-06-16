cd /opt/jboss-eap/standalone/configuration

# Descomenta a seção vault
sed -i 's|<!-- <vault>|<vault>|g; s|</vault> -->|</vault>|g' standalone-full-ha.xml

# Verifica
grep -A 6 "<vault>" standalone-full-ha.xml
