O EAR já está com a correção: o bloco do gec-web.war tem as duas dependências. Então o ConectorException deve ter saído e o erro agora é outro.

Os grep voltaram vazios porque o /tmp/boot.log ficou vazio. O sed rodou como p585600 e deu erro de permissão, ou o horário do filtro não bate com o log. Rode como root, que você já é, e vá direto na fonte do erro. O arquivo .failed guarda a mensagem completa:

cd /opt/jboss-eap/standalone/deployments
ls -l gec-ear.ear.*
cat gec-ear.ear.failed | head -60

Depois, no log do servidor, sem filtro de horário:

L=/logs/jboss/jboss-eap/standalone/sigec-portabilidade/server.log
ls -l $L
grep -n "WFLYCTL0013\|WFLYSRV0059\|WFLYCTL0412\|Caused by\|NoClassDefFound\|ClassNotFound" $L | tail -30

Se o grep mostrar linhas, pegue o número da última WFLYCTL0013 e mande o trecho em volta, por exemplo sed -n '<N-5>,<N+30>p' $L. Me mande a saída do .failed e do grep.
