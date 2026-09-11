grep -n "orat02sc" /opt/open/sso/7.3.0/standalone/configuration/standalone.xml

sed -i 's/orat02sc/oratO2sc/g' /opt/open/sso/7.3.0/standalone/configuration/standalone.xml

sqlplus SISET_INTER/set3int3@cnpexdadvm01-scan2.extra.caixa.gov.br:1521/oratO2sc

sqlplus SISET_INTER/set3int3@cnpexdadvm01-scan2.extra.caixa.gov.br:1521/oratO2sc


grep -n "oratO2sc" /opt/open/sso/7.3.0/standalone/configuration/standalone.xml


ps -ef | grep java

kill -9 <PID>

su - spssodr1
cd /opt/open/sso/7.3.0/bin
nohup ./standalone.sh -c standalone.xml > /tmp/jboss_start2.log 2>&1 &
tail -f /tmp/jboss_start2.log
