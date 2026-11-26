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





[root@caddeapllx763 p585600]#
[root@caddeapllx763 p585600]#
[root@caddeapllx763 p585600]#
[root@caddeapllx763 p585600]#
[root@caddeapllx763 p585600]# CFG=/opt/jboss/jboss-eap/standalone/configuration/standalone-full-ha.xml
[root@caddeapllx763 p585600]#
[root@caddeapllx763 p585600]#
[root@caddeapllx763 p585600]# grep -n 'ajp-listener\|max-post-size\|node-timeout' $CFG
589:                <ajp-listener name="ajp" socket-binding="ajp"/>
590:                <http-listener name="default" socket-binding="http" max-post-size="209715200" redirect-socket="https" enable-http2="true"/>
591:                <https-listener name="https" socket-binding="https" max-post-size="209715200" security-realm="ApplicationRealm" enable-http2="true"/>                                <host name="default-host" alias="localhost">
[root@caddeapllx763 p585600]# grep -iE 'UT000020|UT000047|larger than|max-post-size' /opt/jboss/jboss-eap/standalone/log/server.log | tail
grep: /opt/jboss/jboss-eap/standalone/log/server.log: Arquivo ou diretório não encontrado
[root@caddeapllx763 p585600]#
[root@caddeapllx763 p585600]#
[root@caddeapllx763 p585600]#
[root@caddeapllx763 p585600]#
[root@caddeapllx763 p585600]# ps -ef | grep '[j]boss-modules' | tr ' ' '\n' | grep -i 'log'
-Xloggc:/logs/jboss/jboss-eap/standalone/sigec-csc/gc.log
-XX:+UseGCLogFileRotation
-XX:NumberOfGCLogFiles=5
-XX:GCLogFileSize=3M
-Xbootclasspath/p:/opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.0.7.Final-redhat-1.jar
-Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager
-Djava.util.logging.manager=org.jboss.logmanager.LogManager
-Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sigec-csc/server.log
-Dlogging.configuration=file:/opt/jboss/jboss-eap/standalone/configuration/logging.properties
-Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigec-csc
[root@caddeapllx763 p585600]# find / -name server.log -path '*jboss*' 2>/dev/null | head



/logs/jboss/jboss-eap/standalone/sigec-csc/server.log
[root@caddeapllx763 p585600]#
[root@caddeapllx763 p585600]#
[root@caddeapllx763 p585600]#
[root@caddeapllx763 p585600]#
