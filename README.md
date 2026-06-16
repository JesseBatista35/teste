🛠️ VAMOS VERIFICAR NO SERVIDOR caddeapllx1945:
PASSO 1 - Conecte ao servidor:
bashssh caddeapllx1945.agil.nprd.caixa.gov.br
sudo su -

PASSO 2 - Procure pelo módulo PostgreSQL:
bashfind / -name "*postgresql*" -type f 2>/dev/null | head -20
Cole aqui o resultado 👇

PASSO 3 - Verifique a estrutura do JBoss:
bashls -la /opt/wildfly/modules/org/postgresql/
(ou onde o JBoss está instalado)
Cole aqui o resultado 👇

PASSO 4 - Verifique o arquivo de configuração do datasource:
bashcat /opt/wildfly/standalone/configuration/standalone.xml | grep -A 5 -B 5 "postgresql"
Cole aqui o resultado 👇

💡 Ou você pode:
Acessar a pipeline:

https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=486099
E copiar os logs completos do erro pra aqui que eu analiso!

Qual informação você consegue me trazer? 🔎
