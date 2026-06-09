1️⃣ Procure por SIMCN:
bashfind /opt/jboss -name "*simcn*" -o -name "*SIMCN*" 2>/dev/null
2️⃣ Procure no diretório de upload (onde normalmente ficam os EARs):
bashls -la /upload/des/simcn* 2>/dev/null
ls -la /projetos/simcn* 2>/dev/null
ls -la /uploadintegracao/des/simcn* 2>/dev/null
3️⃣ Verifique qual aplicação está configurada no domain.xml:
bashgrep -i "simcn\|siosp" /opt/jboss/jboss-eap/hc/configuration/domain.xml | grep -i deployment

Execute estes comandos! Aí vamos descobrir onde está a aplicação SIMCN correta! 🎯
