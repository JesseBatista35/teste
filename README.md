
[sudo] senha para p585600:
[root@caddeapllx2854 p585600]# ps -ef | grep [j]ava | grep -oE "jboss.home.dir=[^ ]*|jboss.server.log.dir=[^ ]*|-c [^ ]*"
jboss.home.dir=/opt/jboss-eap
jboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigsj-internet
-c standalone-full-ha.xml
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]# LOG=<jboss.server.log.dir>/server.log
bash: jboss.server.log.dir: Arquivo ou diretório inexistente
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]# grep -nE "WFLYCTL0412|WFLYCTL0180|missing|SIGSJ04|datasources|WFLYJCA|Driver" $LOG | tail -40
^C
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]# grep -nE "WFLYCTL0412|WFLYCTL0180|missing|SIGSJ04|datasources|WFLYJCA|Driver" $LOG | tail -40



^C
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]# JH=<jboss.home.dir>
bash: erro de sintaxe próximo ao token inesperado `newline'
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]# $JH/bin/jboss-cli.sh --connect --controller=10.116.202.45:9990 --commands="/subsystem=datasources:read-children-names(child-type=data-source),/subsystem=datasources:read-children-names(child-type=xa-data-source),/subsystem=datasources:read-children-names(child-type=jdbc-driver)"
ls $JH/modules/com/oracle* $JH/modules/system/layers/base/com/oracle* 2>/dev/null
bash: /bin/jboss-cli.sh: Arquivo ou diretório inexistente
[root@caddeapllx2854 p585600]# ^C
[root@caddeapllx2854 p585600]#
