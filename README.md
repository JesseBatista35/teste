LOG=/logs/jboss/jboss-eap/standalone/sigsj-internet/server.log
JH=/opt/jboss-eap

# 1) Erro da datasource no log
grep -nE "WFLYCTL0412|WFLYCTL0180|SIGSJ04|WFLYJCA" $LOG | tail -20

# 2) Datasources e drivers que existem hoje no standalone
grep -nE "<datasource |<xa-datasource |<driver name" $JH/standalone/configuration/standalone-full-ha.xml

# 3) Módulos de driver JDBC já instalados no template
ls -d $JH/modules/com/* $JH/modules/system/layers/base/com/* 2>/dev/null | grep -iE "oracle|ibm|db2|microsoft|sqlserver|postgres"

# 4) Qual banco a aplicação espera (persistence.xml dentro do EAR)
cd /tmp && rm -rf intchk && mkdir intchk && cd intchk
EAR=$(ls $JH/standalone/deployments/*.ear | head -1); echo $EAR
unzip -l $EAR | grep -iE "\.war|\.jar" | head

