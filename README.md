Na 2854, confere o datasource sem expor a senha:

bash
CFG=/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
grep -n -A12 'datasources/SIGSJ04' $CFG | grep -iE "connection-url|user-name|security|password" | sed -E 's#(<password>).*(</password>)#\1***\2#'
grep -c 'SIGSJ04_PASSWORD' $CFG     # se der 1+, o token não foi substituído
/opt/jboss-eap/bin/jboss-cli.sh -c --command="/subsystem=datasources/data-source=SIGSJ04:test-connection-in-pool"

Como interpretar:

user-name e connection-url: confirma se são os do DES e não os de TQS ou do legado.
grep -c maior que 0: a variável não foi substituída na release, e o problema é na Library (EC DES).
test-connection-in-pool com erro: confirma o ORA-01017 de forma isolada.

Correção provável: a senha correta do SIGSJ04 de DES precisa estar na variável SIGSJ04_PASSWORD do grupo EC DES. Lembra que no legado (JBoss 5) a senha vinha de um security-domain, então pode ter ido para a Library um valor que não é a senha real. Quem tem a senha certa são os devs/DBA, ou a Segurança, como fizemos em TQS (REQ000147038150). Corrigida a variável, roda a release de DES do internet de novo.

Como sempre, a senha não vai na sala. Se precisar, combina no privado.

O próximo passo é você fazer o teste de login clicando em Confirmar e me mandar:

bash
grep -n "SenhasSIIBC\|UnsatisfiedLink\|Autenticacao" /opt/jboss-eap/standalone/log/server.log | tail -20

e a saída dos comandos do datasource acima.

Como o Claude está se saindo nesta sessão?
