Isso veio da variável DB2_CMU_URL no grupo TQS que tinha o valor jdbcdb2:// em vez de jdbc:db2://. Vamos corrigir direto no arquivo:
bashsudo sed -i 's|jdbcdb2://|jdbc:db2://|g' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
Confirma a correção:
bashgrep "connection-url" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
Depois reinicia:
bashsudo systemctl restart jboss-eap-standalone
