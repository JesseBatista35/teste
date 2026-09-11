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

67 visits in last 30 days




rodei novamente com espaço aora quebrou 


2026-09-11T15:43:44.8846183Z ##[section]Starting: Logs da Aplicação
2026-09-11T15:43:44.8849867Z ==============================================================================
2026-09-11T15:43:44.8849978Z Task         : Bash
2026-09-11T15:43:44.8850023Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-11T15:43:44.8850103Z Version      : 3.227.0
2026-09-11T15:43:44.8850149Z Author       : Microsoft Corporation
2026-09-11T15:43:44.8850202Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-11T15:43:44.8850275Z ==============================================================================
2026-09-11T15:43:45.8492286Z Generating script.
2026-09-11T15:43:45.8503004Z ========================== Starting Command Output ===========================
2026-09-11T15:43:45.8518723Z [command]/bin/bash /opt/ads-agent/_work/_temp/21c40e50-d14b-4b04-acda-054e4be6201f.sh
2026-09-11T15:43:45.8561635Z + shopt -s expand_aliases
2026-09-11T15:43:45.8561866Z + [[ -n okd4_nprd ]]
2026-09-11T15:43:45.8562257Z + [[ okd4_nprd =~ ocp ]]
2026-09-11T15:43:45.8562490Z + [[ -n okd4_nprd ]]
2026-09-11T15:43:45.8562605Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-09-11T15:43:45.8562780Z + app=siabm-autenticacao-24horas-des
2026-09-11T15:43:45.8562891Z + oc version
2026-09-11T15:43:45.9348817Z Client Version: v4.2.0-alpha.0-1650-g31aa3e8
2026-09-11T15:43:45.9349384Z Kustomize Version: v4.5.7
2026-09-11T15:43:45.9349932Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-09-11T15:43:45.9350916Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-09-11T15:43:45.9375924Z ++ oc get pod -l name=siabm-autenticacao-24horas-des -n siabm-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-09-11T15:43:45.9388784Z ++ tac
2026-09-11T15:43:45.9389669Z ++ grep -v '^$'
2026-09-11T15:43:45.9389894Z ++ head -n1
2026-09-11T15:43:46.0418501Z + last_pod=siabm-autenticacao-24horas-des-164-4fhmg
2026-09-11T15:43:46.0421294Z + echo 'Logs do POD: siabm-autenticacao-24horas-des-164-4fhmg'
2026-09-11T15:43:46.0421716Z + oc logs siabm-autenticacao-24horas-des-164-4fhmg -c siabm-autenticacao-24horas-des -n siabm-des
2026-09-11T15:43:46.0422447Z Logs do POD: siabm-autenticacao-24horas-des-164-4fhmg
2026-09-11T15:43:46.1333921Z exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.7.1.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/SIABM-autenticacao-24horas.jar
2026-09-11T15:43:46.1334417Z Error occurred during initialization of VM
2026-09-11T15:43:46.1334550Z agent library failed to init: instrument
2026-09-11T15:43:46.1334829Z Error opening zip file or JAR manifest missing : /deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.7.1.jar
2026-09-11T15:43:46.1411579Z ##[section]Finishing: Logs da Aplicação


le nao achou o agente

