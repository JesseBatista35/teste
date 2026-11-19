<img width="1564" height="922" alt="image" src="https://github.com/user-attachments/assets/f52f93ae-9a7d-4285-9c53-da014b5a1526" />



[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]# CFG=/opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]# grep -n -A12 'datasources/SIGSJ04' $CFG | grep -iE "connection-url|user-name|security|password" | sed -E 's#(<password>).*(</password>)#\1***\2#'
177-                    <connection-url>jdbc:oracle:thin:@CNPEXDADVM01CLU08.EXTRA.CAIXA.GOV.BR:1521/orad01bc</connection-url>
184-                    <security>
185-                        <user-name>F731607</user-name>
186-                        <password>***</password>
187-                    </security>
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]# grep -c 'SIGSJ04_PASSWORD' $CFG
0
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]# /opt/jboss-eap/bin/jboss-cli.sh -c --command="/subsystem=datasources/data-source=SIGSJ04:test-connection-in-pool"
{
    "outcome" => "failed",
    "failure-description" => "WFLYJCA0040: falha ao invocar a operação: WFLYJCA0047: A conexão não é válida",
    "rolled-back" => true
}
[root@caddeapllx2854 ~]# grep -n "SenhasSIIBC\|UnsatisfiedLink\|Autenticacao" /opt/jboss-eap/standalone/log/server.log | tail -20
[root@caddeapllx2854 ~]# grep -n "SenhasSIIBC\|UnsatisfiedLink\|Autenticacao" /opt/jboss-eap/standalone/log/server.log | tail -20
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]# grep -n "SenhasSIIBC\|UnsatisfiedLink\|Autenticacao" /opt/jboss-eap/standalone/log/server.log | tail -20
[root@caddeapllx2854 ~]#
