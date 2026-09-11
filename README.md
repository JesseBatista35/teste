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
Configuração do Application Insights no Quarkus via arquivo JSON
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
Configuração do Application Insights no Quarkus via arquivo JSON

Follow
2

Edit

Monique Alves de Morais
22 de jul.
O artigo abaixo é baseado na versão 3.7.1. Versões mais recentes podem ser obtidas em: https://github.com/microsoft/ApplicationInsights-Java/releases 

O Azure Application Insights é uma ferramenta que faz parte do Azure Monitor, usado para coleta e análise de dados telemétricos de ambientes locais e da Azure (na nuvem).

Application Insights instrumentation in your app sends telemetry to your Application Insights resource.
Como a quantidade de dados enviados a nuvem impacta no custo de utilização da ferramenta, temos adotado o procedimento de validar as configurações apenas em DES e, uma vez que os parâmetros de análise estejam corretamente ajustados, partimos direto para o ambiente PRD.

Para que os dados da aplicação sejam coletados corretamente alguns requisitos devem ser atendidos (tanto em DES quanto em PRD):

Contents
1. Solicitar regras de firewall para o Proxy
2. Liberar o acesso aos endpoints da Azure no Proxy
Instruções para preenchimento da REQ
3. Solicitar criação de um repo de config para o Quarkus
4. Adicionar agente na imagem gerada no build
5. Adicionar as variáveis responsáveis pela configuração do agente
6. Importar os certificados dos endpoints no JKS usado na aplicação
7. Remover a configuração do APM agent (se houver)
8. Verificar em qual path o "applicationinsights-agent.jar" foi incluído (lib/ ou lib/main/)
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
brazilsouth.livediagnostics.monitor.azure.com
brazilsouth-1.in.applicationinsights.azure.com
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
*.livediagnostics.monitor.azure.com
No campo "Protocolo / Porta" informar: HTTPS / 443

3. Solicitar criação de um repo de config para o Quarkus
A criação e vinculação no pipeline pode ser solicitada no caminho abaixo:

Tecnologia da Informação e Comunicação
Centralizadoras de Tecnologia da Informação
CETAD - Suporte Não-Produção
Suporte à Aplicação Multiplataforma
4. Adicionar agente na imagem gerada no build
Responsável: Comunidades

Essa etapa pode ser concluida de duas formas:

1- Instalação do Application Insights no Quarkus via Task Group - Container

2- Seguindo o procedimento abaixo:

Basta acrescentar o trecho abaixo no pom.xml da aplicação para que o processo de build inclua o agente na imagem que irá para o container.

<dependency>
	<groupId>com.microsoft.azure</groupId>
	<artifactId>applicationinsights-agent</artifactId>
	<version>3.7.1</version>
</dependency>
Após a inclusão basta gerar um novo build para incluir o agente na imagem.

Obs.: Consultar a versão mais recente do agente em https://github.com/microsoft/ApplicationInsights-Java/releases 

5. Adicionar as variáveis responsáveis pela configuração do agente
Responsável em HMP/PRD: CEPTI
Responsável em DES/TQS: CETAD36 através da REQ abaixo:

Tecnologia da Informação e Comunicação
Centralizadoras de Tecnologia da Informação
CETAD - Suporte Não-Produção
Suporte à Aplicação Multiplataforma
As seguintes variáveis devem ser incluidas no Variable Group correspondente ao ambiente (DES ou PRD):

_ENV.JAVA_OPTIONS_APPEND = "-javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.7.1.jar"
APPLICATIONINSIGHTS_CONNECTION_STRING = <valor do campo "Connection String" obtido no workspace da comunidade na Azure, colocar o valor entre "aspas">
APPLICATIONINSIGHTS_ROLE_NAME = <SIGLA-MODULO> (para o ambiente DES, acrescentar um "-DES")
APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL = INFO
APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL = INFO
APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE = <Por recomendação da GESTI, valor padrão para DES e PRD = 100>
URL_PROXY = Ambiente DES http://proxydes.caixa:80 | Ambiente PRD http://proxynuvem.caixa:80
_ENV.NO_PROXY = ".caixa,.caixa.gov.br" <esse valor precisa ser adaptado as necessidades do sistema>
_ENV.APPLICATIONINSIGHTS_CONFIGURATION_FILE = "/deployments/applicationinsights.json"
Obs.: Opções adicionais de configuração disponíveis em: https://docs.microsoft.com/pt-br/azure/azure-monitor/app/java-standalone-config 

Obs. 2: Não sobrepor os valores que já estejam na variável _ENV.JAVA_OPTIONS_APPEND, apenas acrescentar essa informação do agente no final, um espaço é suficiente para separar os itens nessa variável.

6. Importar os certificados dos endpoints no JKS usado na aplicação
Responsável em DES/TQS: Comunidades
Responsável em HMP/PRD: CEPTI

Se a sua aplicação está utilizando o "caixa-truststore.jks" padrão da esteira, é possível trocar pelo "caixa-truststore-azure.jks" que já contém os certificados da Azure.

O procedimento de alteração do arquivo JKS pode ser consultado aqui: Trocar o arquivo JKS padrão do pipeline

Será necessário adicionar apenas o certificado raiz da cadeia, obtido nos links recomendados pela Microsoft:

https://rt.services.visualstudio.com/ 
https://southcentralus-3.in.applicationinsights.azure.com/ 

O procedimento está descrito aqui: https://go.microsoft.com/fwlink/?linkid=2151450 

7. Remover a configuração do APM agent (se houver)
Responsável em DES/TQS: CETAD36 (solicitar na mesma REQ do item 4)
Responsável em HMP/PRD: CEPTI

Remover toda e qualquer referência ao APM no pipeline e nos "Enviroments" do OKD.

Em ambientes Quarkus, geralmente essa configuração está na nas variáveis:

_ENV.JAVA_OPTS_MONITORING
URL_APM_SERVER
Remova essas variáveis do pipeline antes de iniciar o release.

8. Verificar em qual path o "applicationinsights-agent.jar" foi incluído (lib/ ou lib/main/)
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

43 visits in last 30 days
Showing filters 1 through 1


essa é o certo entao..
