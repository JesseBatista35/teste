# Arquivo do conector: onde ele realmente está
ls -l /opt/jboss-eap/standalone/configuration/sicmu_jconnector* /opt/jboss/jboss-eap 2>&1

# Placeholders que sobraram sem valor
grep -rnE '#\{[A-Za-z_]+\}|__[A-Z_]+__' /opt/jboss-eap/standalone/configuration/ 2>/dev/null | head

# Qual variável de URL o config espera
grep -rn 'CMU_INTRA_URL' /opt/jboss-eap/standalone/configuration/ 2>/dev/null
