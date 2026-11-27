# 1. Conector com o caminho certo
grep -n 'jconnector' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml

# 2. Datasources (esperado: falha ainda, até o reset da senha)
/opt/jboss-eap/bin/jboss-cli.sh -c --command="/subsystem=datasources/data-source=db2cmu:test-connection-in-pool"

# 3. Algum erro novo do conector CICS no log
grep -niE 'connector|jconnector|cics' /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | tail -20
