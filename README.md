cd /opt/jboss-eap/standalone/configuration

# Remove TUDO que é comentário dessa seção
sed -i '/<vault>/,/<\/vault>/{s/^[[:space:]]*<!--[[:space:]]*//; s/[[:space:]]*-->[[:space:]]*$//}' standalone-full-ha.xml

# Verifica
grep -A 8 "<vault>" standalone-full-ha.xml
