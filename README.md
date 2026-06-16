cd /opt/jboss-eap/standalone/configuration

# Comenta a seção vault inteira
sed -i '/<vault>/,/<\/vault>/s/^/<!-- /; /<\/vault>/s/$/ -->/' standalone-full-ha.xml

# Verifica
grep -A 1 "vault>" standalone-full-ha.xml | head -5
