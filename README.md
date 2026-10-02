À CAIXA,

Prezados,

Conforme solicitado, foi replicada no módulo SICOW-LG-OKD a configuração de monitoramento com Application Insights já implementada no SICOW-PORTAL-OKD.

Ações realizadas:

standalone.conf: arquivo ajustado conforme o modelo do SICOW-PORTAL-OKD, com a inclusão do agente do Application Insights:
JAVA_OPTS="$JAVA_OPTS -javaagent:$JBOSS_HOME/standalone/deployments/applicationinsights-agent-3.7.1.jar"
A linha do agente Elastic APM foi desativada (comentada), em alinhamento com a REQ000143540550.
jboss-deployments: incluído o artefato com.microsoft.azure:applicationinsights-agent:3.7.1:jar.
Variáveis da release: validado que os tokens utilizados no standalone.conf estão disponíveis nos grupos de variáveis vinculados à release e que o grupo SICOW-LG-OKD-DES contém as variáveis do Application Insights (connection string, proxy e role name SICOW-LG-OKD-DES).
Imagem: confirmado o uso da imagem jboss-eap:7.4.11-openjdk-8, a mesma base do SICOW-PORTAL-OKD.

Demanda concluída.

Atenciosamente,
Jessé Batista – Esteiras DevOps (DES/TQS NPRD)
