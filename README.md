[root@caddeapllx2484 verificacao_sicmu2]# cd /tmp/verificacao_sicmu2
[root@caddeapllx2484 verificacao_sicmu2]# cp -f /opt/jboss-eap/standalone/deployments/SICMU-ear.ear .
cp: sobrescrever “./SICMU-ear.ear”?
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]# cd /tmp/verificacao_sicmu2
[root@caddeapllx2484 verificacao_sicmu2]# cp -f /opt/jboss-eap/standalone/deployments/SICMU-ear.ear .
cp: sobrescrever “./SICMU-ear.ear”? yes
[root@caddeapllx2484 verificacao_sicmu2]# unzip -o -p SICMU-ear.ear META-INF/jboss-deployment-structure.xml | grep "psc.connector\|psc.jconnector"
                        <module name="br.gov.caixa.psc.jconnector" />
                        <module name="br.gov.caixa.psc.connector" />
                        <module name="br.gov.caixa.psc.jconnector" />
                        <module name="br.gov.caixa.psc.connector" />
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]# unzip -o -p SICMU-ear.ear SICMU-web.war > SICMU-web.war
[root@caddeapllx2484 verificacao_sicmu2]# unzip -p SICMU-web.war WEB-INF/web.xml | grep -i "distributable"
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]# grep -c "ModuleNotFoundException" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log
8
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]# grep -i "NoClassDefFoundError\|ClassNotFoundException" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | grep -i "jconnector\|sisgr" | tail -10
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]#
[root@caddeapllx2484 verificacao_sicmu2]# tail -f /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | grep --line-buffered "ISPN000299\|ERROR\|SEVERE"

