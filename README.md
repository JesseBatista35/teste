#!/bin/bash
# Configuração externa do log4j do SIGSJ-boleto
# A aplicação lê o XML em /log_jboss/config-log4j/sigsj_ws_boleto.xml
# e grava o log em /log_jboss/sigsj_internet/<nome-do-servidor>.log (igual ao legado)
set -e

mkdir -p /log_jboss/config-log4j /log_jboss/sigsj_internet

cat > /log_jboss/config-log4j/sigsj_ws_boleto.xml <<'EOF'
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE log4j:configuration SYSTEM "log4j.dtd">
<log4j:configuration xmlns:log4j='http://jakarta.apache.org/log4j/'>
   <appender name="SIGSJ" class="org.apache.log4j.DailyRollingFileAppender">
       <param name="Append" value="true" />
       <param name="Encoding" value="ISO-8859-1" />
       <param name="File" value="/log_jboss/sigsj_internet/${jboss.server.name}.log" />
       <param name="DatePattern" value="'.'yyyy-MM-dd-a"></param>
       <layout class="org.apache.log4j.PatternLayout">
           <param name="ConversionPattern" value="[%5p] %d{yyyy/MM/dd HH:mm:ss} %c{2}[%t] - %m%n" />
       </layout>
   </appender>
   <logger name="br.gov.caixa.sigsj">
       <level value="DEBUG" />
   </logger>
   <root>
       <priority value="INFO" />
       <appender-ref ref="SIGSJ" />
   </root>
</log4j:configuration>
EOF

chown -R jboss:jboss /log_jboss
chmod 755 /log_jboss /log_jboss/config-log4j /log_jboss/sigsj_internet
chmod 644 /log_jboss/config-log4j/sigsj_ws_boleto.xml














No boleto DES (caddeapllx2557, 10.116.201.25)
bash
ssh p585600@10.116.201.25
sudo su
vi /tmp/custom-log4j.sh          # colar o script do boleto
bash /tmp/custom-log4j.sh
ls -la /log_jboss/config-log4j/

O esperado é sigsj_ws_boleto.xml na pasta e o comando rodar sem erro.

Redeploy só do EAR:

bash
cd /opt/jboss-eap/standalone/deployments/
touch boletoService-ear.ear.dodeploy
chown jboss:jboss boletoService-ear.ear.dodeploy

Depois de uns 60 segundos:

bash
ls /opt/jboss-eap/standalone/deployments/ | grep boletoService
ls -la /log_jboss/sigsj_internet/
grep -E 'WFLYSRV0016|log4j:ERROR' /logs/jboss/jboss-eap/standalone/sigsj-boleto/server.log | tail -2

O esperado é .deployed sem .failed, um .log novo em /log_jboss/sigsj_internet/ e a última linha sendo o WFLYSRV0016, sem log4j:ERROR depois.
