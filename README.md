Estou configurando o Application Insights na aplicação SICBP-trilha-api (v0.0.0.26, Spring Boot 2.7.7, Java 17), no ambiente de Desenvolvimento (LDAI-Canais-Proprios-Interno), conforme a documentação da Caixa (https://devops.caixa/projetos/Caixa/_wiki/wikis/Caixa.wiki/2937/CONFIGURA%C3%87%C3%83O-do-Application-Insights-no-Spring-Boot). A aplicação está conectada e enviando dados normalmente - as métricas aparecem na aba Live Metrics - porém não consigo visualizar dados nas abas Performance e Application Map, impossibilitando análise de performance e rastreamento de dependências.

Configurações Implementadas:
Foi adicionada a dependência Maven com.microsoft.azure:applicationinsights-runtime-attach:3.7.10 no pom.xml e inicializado o agente chamando ApplicationInsights.attach() na classe RunApplication.java antes do SpringApplication.run(). 
As variáveis de ambiente foram configuradas no DevOps conforme orientado: 
APPLICATIONINSIGHTS_CONNECTION_STRING (com InstrumentationKey válida), APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL=INFO, 
APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE=100, 
APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL=INFO,
APPLICATIONINSIGHTS_PROXY=http://proxydes.caixa:80 



Comportamento:
Live Metrics funciona e exibe métricas em tempo real (https://portal.azure.com/#@caixa.onmicrosoft.com/resource/subscriptions/323f3ed7-7b41-42f2-b116-0a8b58d3e597/resourceGroups/LOGDIGITAL-TROUBLESHOOT-DES/providers/microsoft.insights/components/LDAI-Canais-Proprios-Interno/quickPulse). 
Aba Performance vazia - sem dados de requisições ou dependências (https://portal.azure.com/#@caixa.onmicrosoft.com/resource/subscriptions/323f3ed7-7b41-42f2-b116-0a8b58d3e597/resourceGroups/LOGDIGITAL-TROUBLESHOOT-DES/providers/microsoft.insights/components/LDAI-Canais-Proprios-Interno/performance). 
Application Map não exibe a instância da aplicação (https://portal.azure.com/#@caixa.onmicrosoft.com/resource/subscriptions/323f3ed7-7b41-42f2-b116-0a8b58d3e597/resourceGroups/LOGDIGITAL-TROUBLESHOOT-DES/providers/microsoft.insights/components/LDAI-Canais-Proprios-Interno/applicationMap).
 
Gostaria de suporte para entender se faltou algo na configuração do Application Insghts.




Skip to main content
Azure DevOps
projetos
/
Caixa
/
Overview
/
Wiki
/
Azure Wiki
/
CONFIGURAÇÃO do Application Insights no Spring Boot
Search


Caixa

Overview
Summary
Dashboards
Wiki

Boards

Repos

Pipelines

Test Plans

Artifacts
Project settings

Caixa.wiki

Filter pages by title


New page
CONFIGURAÇÃO do Application Insights no Spring Boot

Follow
1

Edit

Leandro Silveira de Medeiros
23 de jun.
Guilherme Bastos Leone
1 de abr.

Introdução
Este documento descreve os pontos específicos do processo de instrumentação do Azure Application Insights aplicáveis exclusivamente a aplicações desenvolvidas com Spring Boot.
Ele deve ser utilizado como complemento ao documento principal, que detalha o processo para Quarkus. Tudo que for idêntico entre Quarkus e Spring – como tratamento de proxy, liberação de endpoints, configuração de certificados, procedimentos de REQ e aspectos de infraestrutura – permanece válido e não será repetido aqui.

A seguir estão apenas as diferenças relevantes que devem ser observadas por equipes que desenvolvem ou mantêm módulos Spring Boot.

Tutorial baseado na versão 3.7.5 do agente.

Você pode conferir o procedimento utilizando Quarkus em: Configuração do Application Insights no Quarkus - Overview
Tutorial da Microsoft: Configure Azure Monitor Application Insights for Spring Boot - Azure Monitor | Microsoft Learn

Tipo de agente utilizado no Spring Boot
Enquanto o Quarkus utiliza o agente tradicional do Application Insights, anexado por meio do parâmetro -javaagent: e incluído na imagem durante o build S2I, o Spring Boot utiliza um mecanismo alternativo chamado Application Insights Runtime Attach.
Esse modelo dispensa a inclusão manual do agente na imagem e também elimina a necessidade de ajustar o caminho do arquivo applicationinsights-agent.jar.

No Spring Boot, não é necessário trabalhar com:

inclusão do agente em /deployments/lib ou /deployments/lib/main;
configuração do parâmetro _ENV.JAVA_OPTIONS_APPEND;
verificação do caminho correto do jar no processo de build S2I.
Toda a instrumentação ocorre em tempo de execução, por meio da dependência adequada e de chamada explícita no método principal da aplicação.

Dependência obrigatória no pom.xml
Para habilitar o runtime attach, a aplicação Spring Boot deve incluir a seguinte dependência:
<dependency> <groupId>com.microsoft.azure</groupId> <artifactId>applicationinsights-runtime-attach</artifactId> <version>3.7.5</version> </dependency> A ausência dessa dependência impede que o agente seja inicializado durante a execução da aplicação.
Inicialização programática do agente
Ao contrário do que ocorre no Quarkus, onde o agente é carregado automaticamente pelo parâmetro -javaagent, no Spring Boot a inicialização do Application Insights deve ser realizada explicitamente no método main().
A chamada obrigatória é a seguinte:

@SpringBootApplication
public class SpringBootApp {
public static void main(String[] args) {
ApplicationInsights.attach(); // inicializa o agente
SpringApplication.run(SpringBootApp.class, args);
}
}
Caso essa linha não seja incluída, a aplicação iniciará normalmente, porém sem qualquer coleta de telemetria.

Variáveis de ambiente específicas para o Spring Boot
Embora grande parte das variáveis utilizadas para configurar o agente seja comum entre Quarkus e Spring, algumas diferenças precisam ser observadas.
A principal distinção está no fato de que o Spring Boot não utiliza parâmetros de inicialização Java para carregar o agente, como ocorre com _ENV.JAVA_OPTIONS_APPEND.
Assim, as variáveis utilizadas se restringem exclusivamente às configurações próprias do runtime attach e ao comportamento de telemetria.

Exemplo de variáveis comumente utilizadas no Spring Boot (ambiente de DES):

ENV.APPLICATIONINSIGHTS_CONFIGURATION_CONTENT = '{"sampling":{"overrides":[{"telemetryType":"request","attributes":[{"key":"url.path","value":"^(?:/actuator/health)(?😕.*)?$","matchType":"regexp"}],"percentage":0}]}}' <- Regex diferente do Quarkus

_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING = "<valor do campo "Connection String" obtido no workspace da comunidade na Azure, colocar o valor entre "aspas""

_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL = INFO
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL = INFO
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE = 100

_ENV.APPLICATIONINSIGHTS_PROXY = http://proxydes.caixa:80 
_ENV.HTTPS_PROXY = http://proxydes.caixa:80 
_ENV.NO_PROXY = ".caixa,.caixa.gov.br"

_ENV.APPLICATIONINSIGHTS_ROLE_NAME = SIXXX-modulo-DES
O padrão de health check do Spring Boot utiliza o caminho /actuator/health, o que torna necessária a alteração do filtro em APPLICATIONINSIGHTS_CONFIGURATION_CONTENT, diferentemente do Quarkus, que usa /q/health.

Dica: caso haja mais de um projeto Spring utilizando Application Insights, recomenda-se criar uma library comum aos projetos. Por exemplo: SIXXX-spring-insights-des.

Atenção à propriedade _ENV.APPLICATIONINSIGHTS_ROLE_NAME que deve refletir o nome do módulo adequado.

Possíveis conflitos específicos do ecossistema Spring
Alguns componentes amplamente utilizados em projetos Spring Boot podem gerar conflitos com o Application Insights, o que não ocorre da mesma forma no Quarkus. Entre eles:
Spring Boot Actuator
O actuator implementa seus próprios interceptadores e pontos de telemetria. Em determinadas versões, pode gerar duplicidade de requisições ou métricas.

Micrometer e observabilidade nativa do Spring
Caso a aplicação utilize instrumentações próprias do Micrometer ou integrações com OpenTelemetry, pode haver sobreposição na geração de spans ou métricas.

Starters de tracing como Sleuth
Bibliotecas de tracing distribuído podem interferir no comportamento do agente do Application Insights, exigindo ajustes adicionais.

Esses conflitos são particularmente relevantes em aplicações mais complexas, e não se manifestam da mesma forma em Quarkus.

68 visits in last 30 days
Showing filters 1 through 1




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
sicbp

SICBP-trilha-api
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
EGRESS_IP_OKD (81)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
SICBP-TRILHA-API-DES (6)
Grupo de variáveis de SICBP-TRILHA-API-DES

Scopes: EC DES
_ENV.API_IDENTIFICACAO_POSITIVA_IGNORE_PATHS
"/v1/rotas"
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SICBP-TRILHA-API-DES
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.LOG_LEVEL
INFO
_ENV.SITAE_COD_SERVICO
363356
_ENV.SSO_ISSUER
"https://login.des.caixa/auth/realms/intranet","https://logindes.caixa.gov.br/auth/realms/internet"
SICBP-COMMON-BACKEND-DES (45)
SICBP-COMMON-BACKEND-DES
Scopes: EC DES
CLIENT_SECRET
********
CLIENT_SECRET_INTRANET
********
CLIENT_SECRET_SERVICO
********
ORACLE_PASS
********
SICBP-COMMON
SICBP_API_KEY
********
_ENV.AMBIENTE
NACIONAL
_ENV.API_IDENTIFICACAO_POSITIVA_BASE_PATH
https://sicbp-correspondentes-api-des.apps.nprd.caixa
_ENV.API_IDENTIFICACAO_POSITIVA_DISABLED
true
_ENV.API_IDENTIFICACAO_POSITIVA_IGNORE_PATHS
_ENV.API_MANAGER_URL
https://api.des.caixa:8443
_ENV.API_TRILHA_BASEPATH
https://sicbp-trilha-api-des.apps.nprd.caixa
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=b0142390-50c9-495e-85b4-7b2ade8fc1cf;IngestionEndpoint=https://brazilsoutheast-0.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsoutheast.livediagnostics.monitor.azure.com/"
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_PROXY
http://proxydes.caixa:80
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
100
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
_ENV.BLOCK_OBJECT_TYPE
TRUE
_ENV.CLIENT_ID
cli-ser-cbp
_ENV.CLIENT_ID_INTRANET
cli-ser-cbp
_ENV.DATASOURCE_JDBC_URL
jdbc:oracle:thin:@cnpexdadvm01-scan8.extra.caixa.gov.br:1521/orad01bc
_ENV.ENABLE_SWAGGER
FALSE
_ENV.FLAG_CERTIFICADO_DIGITAL
false
_ENV.MESSAGE_ERRORS_COMPLETE
FALSE
_ENV.ORACLE_CONNECTIONTIMEOUT
30000
_ENV.ORACLE_IDLETIMEOUT
900000
_ENV.ORACLE_KEEPALIVETIME
0
_ENV.ORACLE_MAXIMUMPOOLSIZE
60
_ENV.ORACLE_MAXLIFETIME
1800000
_ENV.ORACLE_MINIMUMIDLE
3
_ENV.ORACLE_SHOW_SQL
false
_ENV.ORACLE_USER
SCBPDS01
_ENV.SITAE_OFFLINE
TRUE
_ENV.SPRING_PROFILES_ACTIVE
development
_ENV.SSL_VERIFICATION_DISABLED
true
_ENV.SSO_ISSUER_INTERNET
https://logindes.caixa.gov.br/auth/realms/internet
_ENV.SSO_ISSUER_INTRANET
https://login.des.caixa/auth/realms/intranet
_ENV.SSO_URL
https://logindes.caixa.gov.br
_ENV.SSO_URL_INTRANET
https://login.des.caixa
_ENV.SSO_URL_LOGIN2
https://login2des.caixa.gov.br
_SECRET.CLIENT_SECRET
#{CLIENT_SECRET}#
_SECRET.CLIENT_SECRET_INTRANET
#{CLIENT_SECRET_INTRANET}#
_SECRET.CLIENT_SECRET_SERVICO
#{CLIENT_SECRET_SERVICO}#
_SECRET.ORACLE_PASS
#{ORACLE_PASS}#
_SECRET.SICBP_API_KEY
#{SICBP_API_KEY}#
SICBP-TRILHA-API-TQS (6)
Grupo de variáveis de SICBP-TRILHA-API-TQS
Scopes: EC TQS
SICBP-COMMON-BACKEND-TQS (45)
SICBP-COMMON-BACKEND-TQS
Scopes: EC TQS
SICBP-TRILHA-API-HMP (1)
Grupo de variáveis de SICBP-TRILHA-API-HMP
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SICBP-TRILHA-API-PRD (1)
Grupo de variáveis de SICBP-TRILHA-API-PRD
Scopes: EC PRD
|Manage variable groups
Expanded

Collapsed

1 pipelines found

Row 2

Row 2

Row 2

Showing filters 1 through 2



ta fanado o intrumt key né?
