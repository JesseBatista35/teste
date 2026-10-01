À CAIXA,

Prezados,

Durante a análise, verificamos que o artifact de configuração da release SICOW-nia-okd (alias _SICOW-nia-okd-config) apontava para o repositório SICOW-portal-okd-config. Com isso, o módulo SICOW-nia vinha sendo implantado com os arquivos de configuração do SICOW-portal.

Ações realizadas pela esteira:

Artifact excluído e recriado apontando para o repositório correto, SICOW-nia-okd-config (branch master), mantendo o mesmo Source alias _SICOW-nia-okd-config para preservar as referências das tasks dos estágios EC DES e EC TQS.
Incluída no repositório SICOW-nia-okd-config a pasta configuration, com a configuração do Application Insights.

Pendências sob responsabilidade do time de desenvolvimento:

Concluir a configuração do Application Insights no repositório SICOW-nia-okd-config conforme a wiki da Caixa:
https://devops.caixa/projetos/Caixa/_wiki/wikis/Caixa.wiki/211/Configura%C3%A7%C3%A3o-do-Application-Insights-no-JBoss-(VM-e-Container)

Pontos de atenção:

standalone.conf: incluir o agente do Application Insights:
JAVA_OPTS="$JAVA_OPTS -javaagent:$JBOSS_HOME/standalone/deployments/applicationinsights-agent-3.7.1.jar"
e, caso a linha do Elastic APM (-javaagent:/opt/apm_agent/elastic-apm-agent.jar ...) esteja ativa, avaliar sua desativação. Não é recomendado utilizar dois agentes de APM simultaneamente.
jboss-deployments: adicionar a linha com.microsoft.azure:applicationinsights-agent:3.7.1:jar, mantendo os artefatos já existentes. Sem esse jar, o agente do item 1 impede a JVM de iniciar.
configuration/applicationinsights.json: ajustar o role.name para identificar o SICOW-nia (o valor atual veio do portal) e validar a connection string.
Demais arquivos (datasources, jboss-custom.cli, standalone-*.xml): revisar para garantir que refletem o SICOW-nia, já que os deploys anteriores usaram a configuração do portal.

Com a correção da origem do artifact, a demanda da esteira está concluída. Os ajustes de configuração da aplicação ficam sob responsabilidade do time de desenvolvimento.

Atenciosamente,
Jessé Batista – Esteiras DevOps (DES/TQS NPRD)
