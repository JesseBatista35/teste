À CAIXA,

Prezados,

Conforme solicitado, foi replicada no módulo SICOW-IMP-OKD a configuração de monitoramento com Application Insights já implementada no SICOW-PORTAL-OKD.

Ações realizadas:

standalone.conf: arquivo ajustado conforme o modelo do SICOW-PORTAL-OKD, com a inclusão do agente do Application Insights:
JAVA_OPTS="$JAVA_OPTS -javaagent:$JBOSS_HOME/standalone/deployments/applicationinsights-agent-3.7.1.jar"
A linha do agente Elastic APM foi desativada (comentada), em alinhamento com a REQ000143540550.
jboss-deployments: incluído o artefato com.microsoft.azure:applicationinsights-agent:3.7.1:jar.

Demanda concluída.

Atenciosamente,
Jessé Batista – Esteiras DevOps (DES/TQS NPRD)
