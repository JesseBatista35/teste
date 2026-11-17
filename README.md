O tail que você mandou não mostra o boot das 11:48. Ele termina às 11:42, de uma subida anterior. Pelo sun.java.command e pelo jboss.server.log.dir, o log de verdade do serviço está em outro diretório:

/logs/jboss/jboss-eap/standalone/sigec-portabilidade/server.log

Por isso o arquivo de /opt/jboss-eap/standalone/log/ parecia parado. Rode:

L=/logs/jboss/jboss-eap/standalone/sigec-portabilidade/server.log
ls -l $L
grep -nE "WFLYSRV0021|WFLYCTL0013|WFLYCTL0180|WFLYCTL0412|WFLYSRV0059|Services with missing|ERROR|FATAL" $L | tail -40

Com a linha do erro, pego o contexto:

grep -n -B2 -A25 "WFLYCTL0013\|WFLYSRV0021" $L | tail -120

Se o erro vier como Caused by:, a causa está nas linhas logo abaixo do primeiro ERROR do gec-ear. Mande esse trecho, de preferência inteiro. É de onde sai o motivo concreto:

missing/unavailable dependencies aponta algo que o standalone ainda não tem (um application-security-domain com o nome que o EAR pede, um datasource, uma fila ou o módulo do Keycloak);
uma exceção do Keycloak aponta o secure-deployment ou o adapter.

Se o L não existir, rode ls -lt /logs/jboss/jboss-eap/standalone/sigec-portabilidade/ e me diga o que tem lá.
