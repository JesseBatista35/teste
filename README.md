Prezados,

Configurar o appinsights para o SISGF, módulo sisgf-backend-des. LDAI-Programas-sociais no ambiente NPRD.
Chave de Instrumentação: 99ee6c02-0bc8-4c2e-8109-b744a54e07ae.

Para maior contextualização, verifique o anexo ou me chame no teams.

Qualquer dúvida estamos à disposição. 


Configuração do Application Insights no Quarkus

Follow
4

Edit

Daniela Perng
20 de jun. de 2025
O artigo abaixo é baseado na versão 3.7.1. Versões mais recentes podem ser obtidas em: https://github.com/microsoft/ApplicationInsights-Java/releases 

O Azure Application Insights é uma ferramenta que faz parte do Azure Monitor, usado para coleta e análise de dados telemétricos de ambientes locais e da Azure (na nuvem).

Application Insights instrumentation in your app sends telemetry to your Application Insights resource.
Como a quantidade de dados enviados a nuvem impacta no custo de utilização da ferramenta, temos adotado o procedimento de validar as configurações apenas em DES e, uma vez que os parâmetros de análise estejam corretamente ajustados, partimos direto para o ambiente PRD.

Para que os dados da aplicação sejam coletados corretamente alguns requisitos devem ser atendidos (tanto em DES quanto em PRD):

Contents
1. Solicitar regras de firewall para o Proxy
2. Liberar o acesso aos endpoints da Azure no Proxy
Instruções para preenchimento da REQ
3. Adicionar dependência no pom.xml da aplicação para incluir o agente na imagem
4. Adicionar as variáveis de ambiente responsáveis pela configuração do agente
5. Importar os certificados dos endpoints no JKS usado na aplicação
6. Remover a configuração do APM agent (se houver)
7. Verificar em qual path o "applicationinsights-agent.jar" foi incluído (lib/ ou lib/main/)
Erros comuns
Caminho incorreto para o agente
Ausência dos certificados no JKS
Falha de comunicação com o Proxy
Ausência de Instrumentation Key
Falha nos Health Checks (Readiness e Liveness)
Referências
Equipes envolvidas:

CEDES (ajuste da dependência, configuração do ambiente DES)
CEPTI (configuração do ambiente PRD, após validação em DES)
CETAD (prestação de suporte, caso o time ache necessário)
1. Solicitar regras de firewall para o Proxy
Em ambiente DES/TQS/HMP:

Nesses ambientes não é necessário solicitar regra de firewall pois eles já comunicam com o proxydes.caixa.

Em ambiente PRD:
Responsável: CEPTI

Os IPs do proxynuvem estão no mesmo objeto do proxyprd, então se o sistema já possui regras para o proxyprd, naturalmente terá acesso ao proxynuvem.

Para atestar que as regras já existe é recomendável executar um teste. Dentro do terminal do Pod basta executar: curl -v proxynuvem.caixa:80

Se não houver nenhuma mensagem de "connection refused", as regras estão funcionais.

Caso o sistema ainda não tenha regras para o proxy, basta solicitar uma regra adicional (via infradevops) e usar os backends PROXYPRD.CAIXA e PROXYNUVEM.CAIXA.

2. Liberar o acesso aos endpoints da Azure no Proxy
Responsável pela abertura da REQ em DES/TQS/HMP:

Nesses ambientes não é necessário solicitar liberação no proxy pois esses ambientes já estão na regra que autoriza a comunicação com a Azure.

Responsável pela abertura da REQ em HMP/PRD: CEPTI

Usar a REQ:
Tecnologia da Informação e Comunicação
Centralizadoras de Tecnologia da Informação
CETAD - Ambiente de Alta Disponibilidade
CETAD - Serviços - Proxy

Instruções para preenchimento da REQ
Em ambientes DES/TQS/HMP: Solicitar liberação no proxydes.caixa
Em ambientes PRD: Solicitar liberação no proxynuvem.caixa

No campo "Origem (HOSTNAME E IP)", informar o endereço IP de saída do projeto, disponível no infradevops.apl.caixa  em:

Listagens > Suporte > Servidores cadastrados

No campo "Destino (DOMÍNIO/ URL/ IP)", informar os dados abaixo:

southcentralus-3.in.applicationinsights.azure.com
southcentralus.livediagnostics.monitor.azure.com
*.ods.opinsights.azure.com
*.oms.opinsights.azure.com
*.blob.core.windows.net
*.azure-automation.net
dc.applicationinsights.azure.com
dc.applicationinsights.microsoft.com
dc.services.visualstudio.com
live.applicationinsights.azure.com
rt.applicationinsights.microsoft.com
rt.services.visualstudio.com
*.in.applicationinsights.azure.com
brazilsouth.livediagnostics.monitor.azure.com
brazilsoutheast.livediagnostics.monitor.azure.com
No campo "Protocolo / Porta" informar: HTTPS / 443

3. Adicionar dependência no pom.xml da aplicação para incluir o agente na imagem
Responsável: Comunidades

Basta acrescentar o trecho abaixo no pom.xml da aplicação para que o processo de build inclua o agente na imagem que irá para o container.

<dependency>
	<groupId>com.microsoft.azure</groupId>
	<artifactId>applicationinsights-agent</artifactId>
	<version>3.7.1</version>
</dependency>
Após a inclusão basta gerar um novo build para incluir o agente na imagem.

Obs.: Consultar a versão mais recente do agente em https://github.com/microsoft/ApplicationInsights-Java/releases 

4. Adicionar as variáveis de ambiente responsáveis pela configuração do agente
Responsável em HMP/PRD: CEPTI
Responsável em DES/TQS: CETAD36 através da REQ abaixo:

Tecnologia da Informação e Comunicação
Centralizadoras de Tecnologia da Informação
CETAD - Suporte Não-Produção
Suporte à Aplicação Multiplataforma
As seguintes variáveis devem ser incluidas no Variable Group correspondente ao ambiente (DES ou PRD):

_ENV.JAVA_OPTIONS_APPEND = "-javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.7.1.jar"
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING = <valor do campo "Connection String" obtido no workspace da comunidade na Azure, colocar o valor entre "aspas">
_ENV.APPLICATIONINSIGHTS_ROLE_NAME = <SIGLA-MODULO> (para o ambiente DES, acrescentar um "-DES")
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL = INFO
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL = INFO
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE = <Por recomendação da GESTI, valor padrão para DES e PRD = 100>
_ENV.APPLICATIONINSIGHTS_PROXY = Ambiente DES http://proxydes.caixa:80 | Ambiente PRD http://proxynuvem.caixa:80
_ENV.APPLICATIONINSIGHTS_CONFIGURATION_CONTENT = '{"sampling":{"overrides":[{"telemetryType":"request","attributes":[{"key":"url.path","value":"^(\/q)?\/health\/.*","matchType":"regexp"}],"percentage":0}]}}'
Obs.: Opções adicionais de configuração disponíveis em: https://docs.microsoft.com/pt-br/azure/azure-monitor/app/java-standalone-config 

Obs. 2: Não sobrepor os valores que já estejam na variável _ENV.JAVA_OPTIONS_APPEND, apenas acrescentar essa informação do agente no final, um espaço é suficiente para separar os itens nessa variável.

Obs. 3: Para utilizar a variável APPLICATIONINSIGHTS_CONFIGURATION_CONTENT, precisa utilizar no mínimo a versão 3.5 do agent. Mais informações em: https://learn.microsoft.com/en-us/azure/azure-monitor/app/java-standalone-sampling-overrides#getting-started 

5. Importar os certificados dos endpoints no JKS usado na aplicação
Responsável em DES/TQS: Comunidades
Responsável em HMP/PRD: CEPTI

Se a sua aplicação está utilizando o "caixa-truststore.jks" padrão da esteira, é possível trocar pelo "caixa-truststore-azure.jks" que já contém os certificados da Azure.

O procedimento de alteração do arquivo JKS pode ser consultado aqui: Trocar o arquivo JKS padrão do pipeline

Será necessário adicionar apenas o certificado raiz da cadeia, obtido nos links recomendados pela Microsoft:

https://rt.services.visualstudio.com/ 
https://southcentralus-3.in.applicationinsights.azure.com/ 

O procedimento está descrito aqui: https://go.microsoft.com/fwlink/?linkid=2151450 

6. Remover a configuração do APM agent (se houver)
Responsável em DES/TQS: CETAD36 (solicitar na mesma REQ do item 4)
Responsável em HMP/PRD: CEPTI

Remover toda e qualquer referência ao APM no pipeline e nos "Enviroments" do OKD.

Em ambientes Quarkus, geralmente essa configuração está na nas variáveis:

_ENV.JAVA_OPTS_MONITORING
URL_APM_SERVER
Remova essas variáveis do pipeline antes de iniciar o release.

7. Verificar em qual path o "applicationinsights-agent.jar" foi incluído (lib/ ou lib/main/)
Responsável em DES/TQS: CETAD36 (solicitar na mesma REQ do item 4)
Responsável em HMP/PRD: CEPTI

Durante o processo de build da aplicação, o arquivo ".jar" do agente que fará a coleta dos dados para o Application Insights poderá ser salvo em um desses caminhos:

deployments/lib/
deployments/lib/main/

Essa diferença ocorre devido a versão do Quarkus, versões mais antigas (1.x) utilizam apenas /lib/, as mais recentes (2.x) usam /lib/main/.

Essa informação é importante para a configuração da variável "_ENV.JAVA_OPTIONS_APPEND", se o caminho definido nessa variável estiver divergente um erro de "manifest missing" irá ocorrer.

Para descobrir o caminho correto, vá até o step "Executando Build S2I Binary" no processo de build, abra os logs, use o Ctrl+F e busque por "applicationinsights-agent". O caminho estará visível no formato:

'/tmp/src/lib/main/com.microsoft.azure.applicationinsights-agent-3.1.1.jar' -> '/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.1.1.jar'

A informação que aparece após o "->" é o cominho que será usado no container. É esse caminho que deverá constar na variável "_ENV.JAVA_OPTIONS_APPEND".

Erros comuns
Um passo importante antes de determinar o erro é coletar as informações geradas pelo agente do Application Insights no arquivo "applicationinsights.log" que é criado automaticamente no mesmo diretório onde o agente foi instalado.

No caso do Quarkus esse arquivo pode ser acessado em:

/deployments/lib/main/applicationinsights.log

OU

/deployments/lib/applicationinsights.log
Caminho incorreto para o agente
Caso o caminho definido na variável "JAVA_OPTIONS_APPEND" esteja incorreto ou o agente não esteja presente na imagem, o erro abaixo será exibido no log do Pod impedindo a aplicação de iniciar:

Quarkus_manifestMissing.PNG

Ausência dos certificados no JKS
Caso o JKS utilizado na aplicação não possua os certificados da Azure, obtidos no passo 5, o agente do Application Insights irá exibir a mensagem abaixo no log da aplicação:

Quarkus_CertificateError.PNG

Falha de comunicação com o Proxy
Caso, por algum motivo, o agente não consiga enviar os dados através do proxy, o erro abaixo será exibido no log da aplicação:

Quarkus_ProxyError.PNG

Ausência de Instrumentation Key
Se nenhuma Instrumentation Key (variável APPLICATIONINSIGHTS_CONNECTION_STRING) for fornecida para o agente, a inicialização irá falhar e ele não terá nenhuma outra ação, sem impacto na aplicação. A imagem abaixo traz o log que será gerado nesse cenário:

Quarkus_NoInstrument.PNG

Falha nos Health Checks (Readiness e Liveness)
Se logo após a implantação do agente do insights na aplicação os health checks começarem a falhar sem motivo aparente, é possível que o application insights tenha aumentado o tempo de inicialização da aplicação. Erros como os da imagem abaixo irão surgir na aba "Events" do OKD:

readnessLiveness.png

Para resolver esse problema basta ajustar o "Initial Delay" dos probes para um tempo compatível com a nova necessidade do sistema.

Referências
https://docs.microsoft.com/pt-br/azure/azure-monitor/app/app-insights-overview 
https://skrift.io/issues/the-insightful-azure-application-insights/ 
https://docs.microsoft.com/pt-br/azure/azure-monitor/app/java-standalone-troubleshoot 
https://docs.microsoft.com/pt-br/azure/azure-monitor/app/java-in-process-agent 
http://wikiprd.corecaixa/index.php/Criação_de_monitoração_no_Azure_(insights) 

117 visits in last 30 days


Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings
All pipelines

SISGF

SISGF-backend-okd4
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
EGRESS_IP_OKD (81)
WO0000072264656 - Config Portal Infrafácil NO_PROXY

Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
SISGF-backend-des (50)

Scopes: EC DES
JKS_PASS
changeit
VAULT_LOCATION
/usr/src/app/secrets_files/SISGF_DES/
_ENV.API_KEY
'${SISGF_APIKEY}'
_ENV.APPLICATIONINSIGHTS_CONFIGURATION_CONTENT
'{"sampling":{"overrides":[{"telemetryType":"request","attributes":[{"key":"url.path","value":"^(\/q)?\/health\/.*","matchType":"regexp"}],"percentage":0}]}}'
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=99ee6c02-0bc8-4c2e-8109-b744a54e07ae;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/"
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_PROXY
http://proxydes.caixa:80
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SISGF-backend-DES
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
100
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
_ENV.CORS_ORIGINS
"https://sisgf-frontend-des.apps.nprd.caixa"
_ENV.DB2_SIICO_PASSWORD
'${SSGFRD01_DB2}'
_ENV.DB2_SIICO_SCHEMA
DESICO
_ENV.DB2_SIICO_URL
"jdbc:db2://10.216.80.110:448/RJKDB2DSD0"
_ENV.DB2_SIICO_USERNAME
"ssgfrd01"
_ENV.EMAIL_DESTINATARIOS
"jose.ibiapina@caixa.gov.br;daniel.e.araujo@caixa.gov.br"
_ENV.EMAIL_FROM
"sisgf.teste@caixa.gov.br"
_ENV.EMAIL_SMTP_PORT
25
_ENV.EMAIL_SMTP_URL
"smtptest.correiolivre.caixa"
_ENV.HORA_LIMITE_CONTABILIZACAO
18
_ENV.HTTPS_PROXY
http://proxydes.caixa:80
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar"
_ENV.NO_PROXY
.caixa,.caixa.gov.br,.applicationinsights.azure.com,.livediagnostics.monitor.azure.com
_ENV.QUARKUS_DATASOURCE_DB_KIND
"other"
_ENV.QUARKUS_DATASOURCE_JDBC_DRIVER
"oracle.jdbc.driver.OracleDriver"
_ENV.QUARKUS_DATASOURCE_JDBC_MAX_SIZE
"40"
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:oracle:thin:@10.116.101.7:1521/orad01sc"
_ENV.QUARKUS_DATASOURCE_PASSWORD
'${SSGFRD02_ORA}'
_ENV.QUARKUS_DATASOURCE_USERNAME
"SSGFRD02"
_ENV.QUARKUS_HIBERNATE-ORM_DATABASE_DEFAULT_SCHEMA
"SGF"
_ENV.QUARKUS_HIBERNATE_ORB_DIALECT
"org.hibernate.dialect.Oracle10gDialect"
_ENV.QUARKUS_HIBERNATE_ORM_LOG_BIND_PARAMETERS
"false"
_ENV.QUARKUS_HIBERNATE_ORM_LOG_SQL
"false"
_ENV.QUARKUS_HIBERNATE_ORM_PACKAGES
"br.gov.caixa.sisgf.api.domain.model"
_ENV.QUARKUS_LOG_LEVEL
"INFO"
_ENV.QUARKUS_OIDC_AUTH_SERVER_URL
https://login.des.caixa/auth/realms/intranet
_ENV.QUARKUS_OIDC_CREDENTIALS_SECRET
'${CLISERSGF_SSO_INTRA}'
_ENV.SFTP_CLIENT_SECRET
'${SSGFDR01_SFTP}'
_ENV.SFTP_CLIENT_USER
ssgfdr01
_ENV.SFTP_PATH_DIR_LIST
"/SINAF,/SIPAS,/sipas"
_ENV.SFTP_PATH_ENTRADA
/sistemas/sisgf/arquivos/entrada/relatorios
_ENV.SFTP_SERVER_IP
10.116.89.226
_ENV.SFTP_SERVER_PORT
22
_ENV.SIICO_API_PRIVADA_URL
https://api.des.caixa:8443/informacoes-corporativas-privadas/
_ENV.SIICO_API_PUBLICA_URL
https://api.des.caixa:8443/informacoes-corporativas-publicas/
_ENV.SINAF_API_EVENTO_URL
https://api.des.caixa:8443/sinaf-api-evento/
_ENV.SISGF_API_URL
https://sisgf-api-des.apps.nprd.caixa/financeiro-beneficios/faturamento/
_ENV.SISGF_BATCH_UNIDADES_URL
https://sisgf-batch-des.apps.nprd.caixa
_SECRET.QUARKUS_HTTP_SSL_CERTIFICATE_KEY-STORE-PASSWORD
'${JKS_PASS}'
_SECRET.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
#{VAULT_LOCATION}#
SISGF-BACKEND-BT-VAULT-DES (1)
WO0000080005919
Scopes: EC DES
BT_SECRETS_LIST
SISGF_DES/SSGFDR01_SFTP,SISGF_DES/CLISERSGF_SSO_INTRA,SISGF_DES/SISGF_APIKEY,SISGF_DES/SSGFRD01_DB2,SISGF_DES/SSGFRD02_ORA
SISGF-BT-VAULT-SECRET-DES (2)
WO0000080990757
Scopes: EC DES
BT_CLIENT_ID
5d1e14bf-8c30-418f-bf72-5a830be8f846
BT_CLIENT_SECRET
********
SISGF-backend-tqs (34)
Scopes: EC TQS
SISGF-BT-VAULT-SECRET-TQS (2)
WO0000081066792
Scopes: EC TQS
SISGF-BACKEND-BT-VAULT-TQS (1)
WO0000081129210
Scopes: EC TQS
OKD-4-APL (12)
Scopes: EC PRD
SISGF-backend-prd (37)
Scopes: EC PRD
SISGF-BACKEND-BT-VAULT-PRD (1)
CHG00003979
Scopes: EC PRD
SISGF-BT-VAULT-SECRET-PRD (2)
CHG00003979
Scopes: EC PRD
|Manage variable groups
Showing 25 filtered items.

Get started and run this pipeline for the first time!

Showing 25 filtered items.

Showing 50 filtered items.

Expanded

Collapsed

2 pipelines found

Row 3

Showing filters 1 through 2



