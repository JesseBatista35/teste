1️⃣ Procure pelo diretório correto de deployments:
bashfind /opt/jboss -type d -name "deployments" 2>/dev/null
2️⃣ Procure pelos arquivos .ear:
bashfind /opt/jboss -name "*.ear" -o -name "*.war" 2>/dev/null | head -20
3️⃣ Verifique o arquivo domain.xml para saber onde procurar deployments:
bashgrep -i "deployment" /opt/jboss/jboss-eap/hc/configuration/domain.xml | head -10

Execute estes comandos e compartilhe os resultados!
Aí vou saber onde está a aplicação SIOSP e como deployá-la corretamente.
