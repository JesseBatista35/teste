# Caminho real do JBoss / base dir
ps -ef | grep -o 'jboss.server.base.dir=[^ ]*\|jboss.home.dir=[^ ]*' | sort -u

# Datasources: URL, usuário e origem da senha (mascarando a senha)
grep -n -A12 -E 'jndi-name="java:/(db2cmu|db2cdm)"' <BASE_DIR>/configuration/standalone*.xml \
  | sed -E 's#(<password>)[^<]*#\1*****#'


  <JBOSS_HOME>/bin/jboss-cli.sh -c --command="/subsystem=datasources/data-source=<NOME_DO_DS>:test-connection-in-pool"
