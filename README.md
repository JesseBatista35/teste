A versão do artifact de config agora é a c18e675f, o nosso commit de hoje às 11:37. Era isso que estava errado. A release de 13:02 usou uma versão mais antiga, e por isso o 2884 ficou sem datasources, filas e MQ. Ao recriar o artifact, esse problema deve sair.

Quando a release terminar, confirme no 2884 (como root) antes de olhar o resultado do deploy:

D=/opt/jboss-eap/standalone/configuration
ls -l $D/standalone-full-ha.xml
grep -c "DB2SiempDS\|DB2SigecDS\|RecebimentoTedQueue\|wmq.jmsra" $D/standalone-full-ha.xml
ls -l /opt/jboss-eap/standalone/deployments

O esperado é um arquivo bem maior que 35 KB e o grep com número maior que zero.

Se o gec-ear.ear ainda falhar, o .failed e o grep do server.log mostram a causa seguinte, como fizemos no online. Os candidatos mais prováveis são o módulo com.ibm.db2 do JBoss e o wmq.jmsra.rar.

cat /opt/jboss-eap/standalone/deployments/gec-ear.ear.failed | head -40
L=/logs/jboss/jboss-eap/standalone/sigec-portabilidade-batch/server.log
grep -n "WFLYCTL0013\|Caused by" $L | tail -20

Me mande a saída desses comandos se não passar. O online continua esperando o commit do gec-web/pom.xml, que não depende do batch.
