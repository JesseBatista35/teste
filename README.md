
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]# grep -A 1 "br.gov.caixa.psc.connector.util.Config" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
        <property name="br.gov.caixa.psc.connector.util.Config" value="/opt/jboss-eap/standalone/configuration/sicmu_jconnector.properties" />
        <property name="url.sisgr" value="https://servicossociais.des.corerj.caixa/intranet.do?segmento=INTRANET01" />
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]# cat /etc/systemd/system/jboss-eap.service 2>/dev/null | grep -i "server-config\|standalone"
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]# systemctl cat jboss 2>/dev/null | grep -i "server-config\|standalone"
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]# ps -ef | grep java | grep -o "server-config=[^ ]*"
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
[root@caddeapllx2484 tmp]#
