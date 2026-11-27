Os <...> eram só marcadores. Com os caminhos que você achou (/opt/jboss-eap), estes comandos já estão prontos para colar:

bash
# 1. Datasources db2cmu / db2cdm (senha mascarada)
grep -n -B2 -A14 -E 'java:/(db2cmu|db2cdm)' /opt/jboss-eap/standalone/configuration/standalone*.xml \
  | sed -E 's#(<password>)[^<]*#\1*****#'

# 2. Nomes dos datasources no JBoss (para o teste de conexão)
/opt/jboss-eap/bin/jboss-cli.sh -c --command="/subsystem=datasources:read-children-names(child-type=data-source)"

Com o nome que o comando 2 devolver (ex.: db2cmu), rode:

bash
/opt/jboss-eap/bin/jboss-cli.sh -c --command="/subsystem=datasources/data-source=db2cmu:test-connection-in-pool"
/opt/jboss-eap/bin/jboss-cli.sh -c --command="/subsystem=datasources/data-source=db2cdm:test-connection-in-pool"

Se o CLI pedir autenticação ou não conectar na porta padrão, acrescente --controller=localhost:9990 (ou a porta de management dessa VM).

Se o <user-name> ou o <password> vierem como expressão ${...}, procure o valor nas properties do servidor:

bash
grep -rn -iE 'db2cmu|db2cdm|user|usuario' /opt/jboss-eap/standalone/configuration/*.properties 2>/dev/null \
  | sed -E 's#(pass[a-z]*[=:]).*#\1*****#I'

Me manda a saída do comando 1 e do teste de conexão. Com isso eu digo se o problema é config ou usuário no RACF.
