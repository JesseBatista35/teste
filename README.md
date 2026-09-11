2026-09-11T15:28:15.2017497Z ##[section]Starting: Atualizando Variáveis de Ambiente
2026-09-11T15:28:15.2020374Z ==============================================================================
2026-09-11T15:28:15.2020464Z Task         : Bash
2026-09-11T15:28:15.2020506Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-11T15:28:15.2020567Z Version      : 3.227.0
2026-09-11T15:28:15.2020704Z Author       : Microsoft Corporation
2026-09-11T15:28:15.2020755Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-11T15:28:15.2020823Z ==============================================================================
2026-09-11T15:28:16.0310750Z Generating script.
2026-09-11T15:28:16.0322825Z ========================== Starting Command Output ===========================
2026-09-11T15:28:16.0329602Z [command]/bin/bash /opt/ads-agent/_work/_temp/c3b1383c-0d51-4c9d-a5d3-a97dc00ac054.sh
2026-09-11T15:28:16.0379259Z Nova APP: false
2026-09-11T15:28:16.9429388Z deploymentconfig.apps.openshift.io/siabm-autenticacao-24horas-des updated
2026-09-11T15:28:16.9543263Z ##[section]Finishing: Atualizando Variáveis de Ambiente


passou mano era só as apas pfaltando. vc temque parar com essas ondas


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
Configuração do Application Insights no Quarkus
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

app


New page
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

121 visits in last 30 days
Showing filters 1 through 1

Collapsed

Expanded

Collapsed

Expanded

Collapsed

Expanded

Showing filters 1 through 1

951 results found

24 results found

951 results found

14 results found



sobre a configuraçao do appinstgs vi que eles nao fizeram conforem a wiki
https://devops.caixa/projetos/Caixa/_wiki/wikis/Caixa.wiki/207/Configura%C3%A7%C3%A3o-do-Application-Insights-no-Quarkus

o pom do xml dele ta falntao acredo que o restante ta certo

<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0">
    <modelVersion>4.0.0</modelVersion>

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.5.15</version>
        <relativePath />
    </parent>

    <groupId>br.gov.caixa</groupId>
    <artifactId>SIABM-autenticacao-24horas</artifactId>
    <version>1.0.0.24</version>
    <name>SIABM-autenticacao-24horas</name>
    <description>SIABM-autenticacao-24horas</description>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>

        <commons-lang3.version>3.19.0</commons-lang3.version>
        <guava.version>33.5.0-jre</guava.version>
        <uuid-creator.version>6.1.1</uuid-creator.version>
        <encoder.version>1.4.0</encoder.version>

        <dinamo-hsm.version>4.27.0</dinamo-hsm.version>

        <springdoc-openapi-starter-webmvc-ui.version>2.8.14</springdoc-openapi-starter-webmvc-ui.version>

        <jacoco.version>0.8.12</jacoco.version>
        <sonar-maven-plugin.version>3.9.0.2155</sonar-maven-plugin.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-oauth2-resource-server</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-oauth2-jose</artifactId>
        </dependency>
        <dependency>
            <groupId>com.oracle.database.jdbc</groupId>
            <artifactId>ojdbc11</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-lang3</artifactId>
            <version>${commons-lang3.version}</version>
        </dependency>
        <dependency>
            <groupId>com.google.guava</groupId>
            <artifactId>guava</artifactId>
            <version>${guava.version}</version>
        </dependency>
        <dependency>
            <groupId>com.github.f4b6a3</groupId>
            <artifactId>uuid-creator</artifactId>
            <version>${uuid-creator.version}</version>
        </dependency>
        <dependency>
            <groupId>org.owasp.encoder</groupId>
            <artifactId>encoder</artifactId>
            <version>1.4.0</version>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>
        <dependency>
            <groupId>io.dinamonetworks.sdk</groupId>
            <artifactId>dinamo-hsm</artifactId>
            <version>${dinamo-hsm.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springdoc</groupId>
            <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
            <version>2.8.14</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-cache</artifactId>
        </dependency>
        <dependency>
            <groupId>com.github.ben-manes.caffeine</groupId>
            <artifactId>caffeine</artifactId>
        </dependency>
    </dependencies>

    <build>
        <finalName>${project.artifactId}</finalName>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <excludes>
                        <exclude>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                        </exclude>
                    </excludes>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.sonarsource.scanner.maven</groupId>
                <artifactId>sonar-maven-plugin</artifactId>
                <version>${sonar-maven-plugin.version}</version>
            </plugin>

            <plugin>
                <groupId>org.jacoco</groupId>
                <artifactId>jacoco-maven-plugin</artifactId>
                <version>${jacoco.version}</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>prepare-agent</goal>
                        </goals>
                    </execution>
                    <execution>
                        <id>post-unit-test</id>
                        <phase>test</phase>
                        <goals>
                            <goal>report</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>

    <repositories>
        <repository>
            <id>central</id>
            <name>Internal Proxy Central</name>
            <url>http://binario.caixa:8081/repository/caixa-group/</url>
            <snapshots>
                <enabled>false</enabled>
            </snapshots>
        </repository>
    </repositories>

    <pluginRepositories>
        <pluginRepository>
            <id>central</id>
            <name>Internal Proxy Central Plugins</name>
            <url>http://binario.caixa:8081/repository/caixa-group/</url>
            <snapshots>
                <enabled>false</enabled>
            </snapshots>
        </pluginRepository>
    </pluginRepositories>

</project>



segue o resumu da realise apos o ajuste.

vamos verificar tambem se  o erro do apm sumiu:



P
siabm-autenticacao-24horas-des-163-pdgs2
Running

log do pod que subiu agora:

exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks-javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.7.1.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/SIABM-autenticacao-24horas.jar
{"version":"1.1","short_message":"Starting SiabmAutenticacao24horasApplication v1.0.0.24 using Java 17.0.7 with PID 8 (/deployments/SIABM-autenticacao-24horas.jar started by 1001 in /deployments)","timestamp":1789140558.604,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.0.24","_log_logger":"br.gov.caixa.SiabmAutenticacao24horasApplication"}
{"version":"1.1","short_message":"No active profile set, falling back to 1 default profile: \"default\"","timestamp":1789140558.611,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.0.24","_log_logger":"br.gov.caixa.SiabmAutenticacao24horasApplication"}
{"version":"1.1","short_message":"Bootstrapping Spring Data JPA repositories in DEFAULT mode.","timestamp":1789140561.109,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.0.24","_log_logger":"org.springframework.data.repository.config.RepositoryConfigurationDelegate"}
{"version":"1.1","short_message":"Finished Spring Data repository scanning in 195 ms. Found 19 JPA repository interfaces.","timestamp":1789140561.408,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.0.24","_log_logger":"org.springframework.data.repository.config.RepositoryConfigurationDelegate"}
{"version":"1.1","short_message":"Tomcat initialized with port 8080 (http)","timestamp":1789140562.783,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.0.24","_log_logger":"org.springframework.boot.web.embedded.tomcat.TomcatWebServer"}
{"version":"1.1","short_message":"Starting service [Tomcat]","timestamp":1789140562.796,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.0.24","_log_logger":"org.apache.catalina.core.StandardService"}
{"version":"1.1","short_message":"Starting Servlet engine: [Apache Tomcat/10.1.55]","timestamp":1789140562.797,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.0.24","_log_logger":"org.apache.catalina.core.StandardEngine"}
{"version":"1.1","short_message":"Initializing Spring embedded WebApplicationContext","timestamp":1789140562.991,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.0.24","_log_logger":"org.apache.catalina.core.ContainerBase.[Tomcat].[localhost].[/siabm-autenticacao-24horas]"}
{"version":"1.1","short_message":"Root WebApplicationContext: initialization completed in 4286 ms","timestamp":1789140562.992,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.0.24","_log_logger":"org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext"}
{"version":"1.1","short_message":"HHH000204: Processing PersistenceUnitInfo [name: default]","timestamp":1789140564.309,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.0.24","_log_logger":"org.hibernate.jpa.internal.util.LogHelper"}
{"version":"1.1","short_message":"HHH000412: Hibernate ORM core version 6.6.53.Final","timestamp":1789140564.418,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.0.24","_log_logger":"org.hibernate.Version"}
{"version":"1.1","short_message":"HHH000026: Second-level cache disabled","timestamp":1789140564.501,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.0.24","_log_logger":"org.hibernate.cache.internal.RegionFactoryInitiator"}
{"version":"1.1","short_message":"No LoadTimeWeaver setup: ignoring JPA class transformer","timestamp":1789140565.012,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.0.24","_log_logger":"org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo"}
{"version":"1.1","short_message":"HikariPool-1 - Starting...","timestamp":1789140565.091,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.0.24","_log_logger":"com.zaxxer.hikari.HikariDataSource"}
{"version":"1.1","short_message":"HikariPool-1 - Added connection oracle.jdbc.driver.T4CConnection@25587290","timestamp":1789140565.891,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.0.24","_log_logger":"com.zaxxer.hikari.pool.HikariPool"}
{"version":"1.1","short_message":"HikariPool-1 - Start completed.","timestamp":1789140565.893,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.0.24","_log_logger":"com.zaxxer.hikari.HikariDataSource"}
{"version":"1.1","short_message":"HHH90000025: OracleDialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)","timestamp":1789140566.199,"level":4,"_level_name":"WARN","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.0.24","_log_logger":"org.hibernate.orm.deprecation"}
{"version":"1.1","short_message":"HHH10001005: Database info:\n\tDatabase JDBC URL [Connecting through datasource 'HikariDataSource (HikariPool-1)']\n\tDatabase driver: undefined/unknown\n\tDatabase version: 19.22\n\tAutocommit mode: undefined/unknown\n\tIsolation level: undefined/unknown\n\tMinimum pool size: undefined/unknown\n\tMaximum pool size: undefined/unknown","timestamp":1789140566.399,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.0.24","_log_logger":"org.hibernate.orm.connections.pooling"}
{"version":"1.1","short_message":"HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)","timestamp":1789140569.697,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.0.24","_log_logger":"org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator"}
{"version":"1.1","short_message":"Initialized JPA EntityManagerFactory for persistence unit 'default'","timestamp":1789140569.700,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.0.24","_log_logger":"org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean"}
{"version":"1.1","short_message":"Hibernate is in classpath; If applicable, HQL parser will be used.","timestamp":1789140570.701,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.0.24","_log_logger":"org.springframework.data.jpa.repository.query.QueryEnhancerFactory"}
{"version":"1.1","short_message":"spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning","timestamp":1789140573.195,"level":4,"_level_name":"WARN","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.0.24","_log_logger":"org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration$JpaWebConfiguration"}
{"version":"1.1","short_message":"Exposing 1 endpoint beneath base path '/actuator'","timestamp":1789140573.796,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.0.24","_log_logger":"org.springframework.boot.actuate.endpoint.web.EndpointLinksResolver"}
{"version":"1.1","short_message":"The cache 'mensagemSistema' is not recording statistics. No meters except 'cache.size' will be registered. Call 'Caffeine#recordStats()' prior to building the cache for metrics to be recorded.","timestamp":1789140574.622,"level":4,"_level_name":"WARN","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.0.24","_log_logger":"io.micrometer.core.instrument.binder.cache.CaffeineCacheMetrics"}
{"version":"1.1","short_message":"Tomcat started on port 8080 (http) with context path '/siabm-autenticacao-24horas'","timestamp":1789140575.018,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.0.24","_log_logger":"org.springframework.boot.web.embedded.tomcat.TomcatWebServer"}
{"version":"1.1","short_message":"Started SiabmAutenticacao24horasApplication in 17.669 seconds (process running for 18.593)","timestamp":1789140575.093,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"main","host":"SIABM-autenticacao-24horas","_service_version":"1.0.0.24","_log_logger":"br.gov.caixa.SiabmAutenticacao24horasApplication"}
{"version":"1.1","short_message":"Initializing Spring DispatcherServlet 'dispatcherServlet'","timestamp":1789140617.993,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"http-nio-0.0.0.0-8080-exec-2","host":"SIABM-autenticacao-24horas","_service_version":"1.0.0.24","_log_logger":"org.apache.catalina.core.ContainerBase.[Tomcat].[localhost].[/siabm-autenticacao-24horas]"}
{"version":"1.1","short_message":"Initializing Servlet 'dispatcherServlet'","timestamp":1789140617.994,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"http-nio-0.0.0.0-8080-exec-2","host":"SIABM-autenticacao-24horas","_service_version":"1.0.0.24","_log_logger":"org.springframework.web.servlet.DispatcherServlet"}
{"version":"1.1","short_message":"Completed initialization in 1 ms","timestamp":1789140617.995,"level":6,"_level_name":"INFO","_process_pid":8,"_process_thread_name":"http-nio-0.0.0.0-8080-exec-2","host":"SIABM-autenticacao-24horas","_service_version":"1.0.0.24","_log_logger":"org.springframework.web.servlet.DispatcherServlet"}



lembrando que o ajuste feito na relase quebrada nao foi solictado na demanda. coloca como observaçao e correçao e pede agora para eles realiazrem o ajuste do pom do xml. apara conlcuir as configuraçoes do ap´pinsgths


<img width="1804" height="912" alt="image" src="https://github.com/user-attachments/assets/26f2dda4-f6d7-4c98-b5cd-ca0a40bc8517" />




