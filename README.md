sed -i 's/<vault>/<!-- <vault>/g; s/<\/vault>/<\/vault> -->/g' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml

# Verifica
grep -A 2 "vault>" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml | head -5
