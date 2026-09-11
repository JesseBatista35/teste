[p585600@crjtqapllx036 ~]$
[p585600@crjtqapllx036 ~]$ sudo su
[root@crjtqapllx036 p585600]# grep -n "orat02sc" /opt/open/sso/7.3.0/standalone/configuration/standalone.xml
213:                    <connection-url>jdbc:oracle:thin:@cnpexdadvm01-scan2.extra.caixa.gov.br:1521/orat02sc</connection-url>
229:                    <connection-url>jdbc:oracle:thin:@cnpexdadvm01-scan2.extra.caixa.gov.br:1521/orat02sc</connection-url>
[root@crjtqapllx036 p585600]#
[root@crjtqapllx036 p585600]#
[root@crjtqapllx036 p585600]# sed -i 's/orat02sc/oratO2sc/g' /opt/open/sso/7.3.0/standalone/configuration/standalone.xml
[root@crjtqapllx036 p585600]#
[root@crjtqapllx036 p585600]#
[root@crjtqapllx036 p585600]# sqlplus SISET_INTER/set3int3@cnpexdadvm01-scan2.extra.caixa.gov.br:1521/oratO2sc
bash: sqlplus: command not found
[root@crjtqapllx036 p585600]#
[root@crjtqapllx036 p585600]#
[root@crjtqapllx036 p585600]# sqlplus SISET_INTER/set3int3@cnpexdadvm01-scan2.extra.caixa.gov.br:1521/oratO2sc
bash: sqlplus: command not found
[root@crjtqapllx036 p585600]#
[root@crjtqapllx036 p585600]#
[root@crjtqapllx036 p585600]# grep -n "oratO2sc" /opt/open/sso/7.3.0/standalone/configuration/standalone.xml
213:                    <connection-url>jdbc:oracle:thin:@cnpexdadvm01-scan2.extra.caixa.gov.br:1521/oratO2sc</connection-url>
229:                    <connection-url>jdbc:oracle:thin:@cnpexdadvm01-scan2.extra.caixa.gov.br:1521/oratO2sc</connection-url>
[root@crjtqapllx036 p585600]#
[root@crjtqapllx036 p585600]#
[root@crjtqapllx036 p585600]#


ps -ef | grep java

kill -9 <PID>

su - spssodr1
cd /opt/open/sso/7.3.0/bin
nohup ./standalone.sh -c standalone.xml > /tmp/jboss_start2.log 2>&1 &
tail -f /tmp/jboss_start2.log
