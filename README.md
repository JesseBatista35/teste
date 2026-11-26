O log não está no caminho padrão. Para achar:

bash
ps -ef | grep '[j]boss-modules' | tr ' ' '\n' | grep -i 'log'
find / -name server.log -path '*jboss*' 2>/dev/null | head
Correção definitiva (repositório SIGEC-CSC-config, standalone-full-ha.xml)

Linha 589, de:

xml
<ajp-listener name="ajp" socket-binding="ajp"/>

para:

xml
<ajp-listener name="ajp" socket-binding="ajp" max-post-size="209715200"/>

No <mod-cluster-config ...>, acrescente node-timeout="600" junto dos outros atributos.

Depois rode a release em DES (756 e 763) e TQS (765).

Se quiserem testar agora, ainda na sala, sem esperar a release

Na 763 (e depois na 756), como root:

bash
CLI="/opt/jboss/jboss-eap/bin/jboss-cli.sh -c --controller=10.116.193.251:9990"
$CLI '/subsystem=undertow/server=default-server/ajp-listener=ajp:write-attribute(name=max-post-size,value=209715200)'
$CLI '/subsystem=modcluster/mod-cluster-config=configuration:write-attribute(name=node-timeout,value=600)'
$CLI ':reload'

Na 756, troque o --controller pelo IP dela.

Esse ajuste manual é perdido na próxima release se o repositório não for corrigido. Por isso, faça as duas coisas: o ajuste manual para testar agora e o commit no repositório para valer de vez.
