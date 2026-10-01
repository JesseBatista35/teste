Durante a análise, verificamos que o artifact de configuração da release SICOW-seg-okd (alias _SICOW-seg-okd-config) apontava para o repositório SICOW-portal-okd-config. Com isso, o módulo SICOW-seg vinha sendo implantado com os arquivos de configuração do SICOW-portal.

Ações realizadas pela esteira:

Artifact excluído e recriado apontando para o repositório correto, SICOW-seg-okd-config (branch master), mantendo o mesmo Source alias _SICOW-seg-okd-config para preservar as referências das tasks dos estágios EC DES e EC TQS.
Incluída no repositório SICOW-seg-okd-config a pasta configuration, com a configuração do Application Insights.

Pendências sob responsabilidade do time de desenvolvimento:

standalone.conf: incluir o agente do Application Insights:
JAVA_OPTS="$JAVA_OPTS -javaagent:$JBOSS_HOME/standalone/deployments/applicationinsights-agent-3.7.1.jar"
e avaliar a desativação da linha do Elastic APM (-javaagent:/opt/apm_agent/elastic-apm-agent.jar ...), que hoje está ativa. Usar dois agentes de APM ao mesmo tempo não é recomendado.
jboss-deployments: adicionar a linha com.microsoft.azure:applicationinsights-agent:3.7.1:jar, mantendo os artefatos já existentes. Sem esse jar, o -javaagent do item 1 impede a JVM de iniciar.
configuration/applicationinsights.json: ajustar o role.name para identificar o SICOW-seg (o valor atual veio do portal) e validar a connection string.
Revisar os demais arquivos (datasources, jboss-custom.cli, standalone-*.xml) para garantir que refletem o SICOW-seg, já que os deploys anteriores usaram a configuração do portal.


Concluir a configuração do Application Insights no repositório SICOW-seg-okd-config conforme a wiki da Caixa: [inserir link da wiki]. Isso inclui os ajustes no standalone.conf e no jboss-deployments e a revisão dos demais arquivos, já que os deploys anteriores usaram a configuração do portal.

