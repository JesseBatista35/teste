foi me pedido essa demanda:

1. Solicito realizar os ajustes necessários para que o módulo de provisionamento do SISAG possa ser monitorado em DES pelo appinsights

SISAG-PROV - sspdeapllx0041

2. A aplicação também será ajustada


de acordo com a wiki segui esses passos:


Configuração do Application Insights no JBoss - VM

Follow
1

Edit

Guilherme Gomes Soares da Silva
17 de abr. de 2025
O artigo abaixo é baseado na versão 3.5.1 Versões mais recentes podem ser obtidas em: https://github.com/microsoft/ApplicationInsights-Java/releases 

O Azure Application Insights é uma ferramenta que faz parte do Azure Monitor, usado para coleta e análise de dados telemétricos de ambientes locais e da Azure (na nuvem).

Application Insights instrumentation in your app sends telemetry to your Application Insights resource.
Como a quantidade de dados enviados a nuvem impacta no custo de utilização da ferramenta, temos adotado o procedimento de validar as configurações apenas em DES e, uma vez que os parâmetros de análise estejam corretamente ajustados, partimos direto para o ambiente PRD.

Para que os dados da aplicação sejam coletados corretamente alguns requisitos devem ser atendidos (tanto em DES quanto em PRD).

Equipes envolvidas:

CEDES (Apoio na geração dos builds e configuração do ambiente DES)
CEPTI (configuração do ambiente PRD, após validação em DES)
CETAD (configuração do ambiente PRD, após validação em DES)
Contents
1. Solicitar regras de firewall para o proxynuvem.caixa
2. Liberar o acesso aos endpoints da Azure no Proxy
Instruções para preenchimento da REQ
3. Adicionar o agente na VM/Container atráves do JBoss Deployments;
4. Importar os certificados dos endpoints no JKS usado na aplicação
5. Incluir o arquivo JSON no repo de config
6. Remover a configuração do APM Elastic (se houver), acrescentar o agente do Application Insights e configurar o proxy
8. Erros comuns
Caminho incorreto para o agente
Ausência dos certificados no JKS
Falha de comunicação com o Proxy
Ausência de Instrumentation Key
Referências
1. Solicitar regras de firewall para o proxynuvem.caixa
Em ambiente DES/TQS/HMP:

Nesses ambientes não é necessário solicitar regra de firewall pois eles já comunicam com o proxydes.caixa.

Em ambiente PRD:
Responsável: CEPTI

Para saber se as regras já existem é recomendável executar um teste. Dentro do terminal basta executar: curl -v proxyprd.caixa:80 ou curl -v proxynuvem.caixa:80

Se não houver nenhuma mensagem de "connection refused", as regras estão funcionais.

Caso o sistema ainda não tenha regras para o proxy, basta solicitar uma regra adicional (via infradevops) e usar os backends PROXYPRD.CAIXA e PROXYNUVEM.CAIXA.

2. Liberar o acesso aos endpoints da Azure no Proxy
Em ambiente DES/TQS/HMP:

Seguir o processo abaixo, que é o mesmo dos ambientes de PRD:

Responsável pela abertura da REQ em PRD: CEPTI

Usar a REQ:
Tecnologia da Informação e Comunicação
Centralizadoras de Tecnologia da Informação
Ambiente de Alta Disponibilidade
CETAD - Serviços - Proxy

Instruções para preenchimento da REQ
Em ambientes DES/TQS/HMP: Solicitar liberação no proxydes.caixa
Em ambientes PRD: Solicitar liberação no proxynuvem.caixa

No campo "Origem (HOSTNAME E IP)", informar o endereço IP de saída do projeto, disponível no infradevops.apl.caixa em:

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

Após a liberação do proxy, execute o seguinte comando para testar a conexão:

curl -v -x proxynuvem.caixa:80 https://southcentralus-3.in.applicationinsights.azure.com
ou
curl -v -x proxyprd.caixa:80 https://southcentralus-3.in.applicationinsights.azure.com
ou
curl -v -x proxydes.caixa:80 https://southcentralus-3.in.applicationinsights.azure.com

3. Adicionar o agente na VM/Container atráves do JBoss Deployments;
Responsável: Comunidades

Executar o procedimento descrito na página Deployments adicionais JBOSS

Preencher o arquivo com a informação abaixo:

com.microsoft.azure:applicationinsights-agent:3.3.1:jar

Por fim, executar uma nova build para que o agente seja incluído na imagem.

4. Importar os certificados dos endpoints no JKS usado na aplicação
Responsável em DES/TQS: Comunidades
Responsável em HMP/PRD: CEPTI

Se a sua aplicação está utilizando o "caixa-truststore.jks" padrão da esteira, é possível trocar pelo "caixa-truststore-azure.jks" que já contém os certificados da Azure.

O procedimento de alteração do arquivo JKS pode ser consultado aqui: Trocar o arquivo JKS padrão do pipeline

Será necessário adicionar apenas o certificado raiz da cadeia, obtido nos links recomendados pela Microsoft:

https://rt.services.visualstudio.com/ 
https://southcentralus-3.in.applicationinsights.azure.com/ 

O procedimento está descrito aqui: https://go.microsoft.com/fwlink/?linkid=2151450 

5. Incluir o arquivo JSON no repo de config
Caso ainda não exista, crie uma pasta "configuration" e dentro dela crie um arquivo "applicationinsights.json" como na imagem abaixo:

configurationJSON.png

Tudo que estiver dentro dessa pasta será levado para a pasta configuration do JBoss.

Esse arquivo será responsável pela configuração do agente, suas coletas e o local na Azure onde esses dados serão processados. Fique atento ao branch utilizado no release, para saber qual está em uso siga este caminho:

Releases > Selecione o pipeline desejado na lista > Clique em "View" ou "Edit" no canto superior direito > Dentro das configurações do Pipeline, localize o artefato de config semelhante ao da imagem abaixo (procure pelo simbolo do GIT):

artefatoConfig.png

Ao clicar nesse artefato, um painel se abrirá do lado direito da tela. Procure pelo trecho abaixo no painel e saberá qual o repositório e a branch utilizados nesse release:

defaultBranch.png

IMPORTANTE!

Para usar essa opção de configuração é necessário acrescentar as variáveis abaixo no variable group:

APPLICATIONINSIGHTS_CONNECTION_STRING = <Connection string obtida na Azure. Não é necessário utilizar aspas>
APPLICATIONINSIGHTS_ROLE_NAME = <Identificação do sistema na Azure>
APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE = <Por recomendação da GESTI, valor padrão para DES e PRD = 100>
APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL = INFO
APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL = INFO
URL_PROXY = <proxydes.caixa ou proxynuvem.caixa, se ambiente de produção>
O valor dessas variáveis será incluído no arquivo durante o release. Abaixo um exemplo básico do conteúdo do arquivo JSON:

{
    "connectionString": "__APPLICATIONINSIGHTS_CONNECTION_STRING__",
    "role": {
        "name": "__APPLICATIONINSIGHTS_ROLE_NAME__"
    },
    "sampling": {
        "percentage": __APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE__
    },
    "instrumentation": {
        "logging": {
            "level": "__APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL__"
        }
    },
    "selfDiagnostics": {
        "destination": "file+console",
        "level": "__APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL__",
        "file": {
            "path": "applicationinsights.log",
            "maxSizeMb": 5,
            "maxHistory": 1
        }
    },
    "proxy": {
        "host": "__URL_PROXY__",
        "port": 80
    }
}
6. Remover a configuração do APM Elastic (se houver), acrescentar o agente do Application Insights e configurar o proxy
Responsável em DES/TQS: CETAD36 (solicitar na mesma REQ do item 4)
Responsável em HMP/PRD: CEPTI

Remover ou comentar toda e qualquer referência ao APM no pipeline (variáveis) e no arquivo "standalone.conf".

Comentar ou remover as linhas do arquivo standalone.conf deve ser suficiente, caso não tenha nenhuma referência em variáveis de ambiente. As referências geralmente aparecem como nas linas abaixo:

JAVA_OPTS="$JAVA_OPTS -javaagent:/opt/apm_agent/elastic-apm-agent-1.15.0.jar ...
Para adicionar o agente do Application Insights, basta acrescentar a linha abaixo na seção "# Specify options to pass to the Java VM" do arquivo standalone.conf:

JAVA_OPTS="$JAVA_OPTS -javaagent:$JBOSS_HOME/standalone/deployments/applicationinsights-agent.jar -Dapplicationinsights.configuration.file=$JBOSS_HOME/standalone/configuration/applicationinsights.json"
Após a seção "Specify options to pass to the Java VM", incluir a configuração do proxy como segue:

# CONFIGURACAO DE PROXY PARA O APPLICATION INSIGHTS

# Use system or custom proxies, but not BOTH.
JAVA_OPTS="$JAVA_OPTS -Djava.net.useSystemProxies=false"

# CUSTOM Proxies.
JAVA_OPTS="$JAVA_OPTS -Dhttp.proxyHost=__URL_PROXY__"
JAVA_OPTS="$JAVA_OPTS -Dhttp.proxyPort=80"

JAVA_OPTS="$JAVA_OPTS -Dhttps.proxyHost=__URL_PROXY__"
JAVA_OPTS="$JAVA_OPTS -Dhttps.proxyPort=80"

# NO_PROXY
JAVA_OPTS="$JAVA_OPTS -Dhttp.nonProxyHosts=localhost\|127.0.0.1\|*.caixa\|*.caixa.gov.br"
IMPORTANTE!

As informações de NO_PROXY devem ser avaliadas com o time de desenvolvimento, este valor genérico é apenas uma sugestão.

Finalizados os procedimentos acima, basta gerar uma nova release, aguardar a finalização e verificar se os dados já estão chegando na Azure.

Se possível acompanhar os logs de inicialização do JBoss para identificar possíveis erros de comunicação entre o agente do Application Insights e a nuvem.

8. Erros comuns
Um passo importante antes de determinar o erro é coletar as informações geradas pelo agente do Application Insights no arquivo "applicationinsights.log" que é criado automaticamente no mesmo diretório onde o agente foi instalado.

No caso do JBoss esse arquivo pode ser acessado em:

$JBOSS_HOME/standalone/deployments/applicationinsights.log
Caminho incorreto para o agente
Caso o caminho definido no arquivo "standalone.conf" esteja incorreto ou o agente não esteja presente na imagem, o erro abaixo será exibido no log do Pod impedindo a aplicação de iniciar:

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

Referências
https://docs.microsoft.com/pt-br/azure/azure-monitor/app/app-insights-overview 
https://skrift.io/issues/the-insightful-azure-application-insights/ 
https://docs.microsoft.com/pt-br/azure/azure-monitor/app/java-standalone-troubleshoot 
https://docs.microsoft.com/pt-br/azure/azure-monitor/app/java-in-process-agent 
http://wikiprd.corecaixa/index.php/Criação_de_monitoração_no_Azure_(insights) 


pedi isso:


À CAIXA

Prezados,

Ao analisar o servidor sspdeapllx0041, identifiquei que o ambiente está em modo JBoss Domain, onde múltiplos módulos do SISAG são executados de forma centralizada, não sendo possível determinar diretamente pelo host qual aplicação específica corresponde ao SISAG-PROV mencionado.

Dessa forma, solicito a gentileza de informar qual módulo/pipeline do provisionamento deve ser considerado para configuração do Application Insights em ambiente DES.

identificados no Azure DevOps:

SISAG-provisionamento-saque-backend
SISAG-provisionamento-saque-microfront

Peço confirmar qual deles (ou outro, se aplicável) é o correto para prosseguimento.
Fico no aguardo para continuidade.

Aguardamos retorno para prosseguir com a configuração.

Lembramos que nosso SLA é de 24h após a abertura da REQ e que, conforme orientação da CESTI36, requisições que ultrapassarem esse prazo sem retorno às informações complementares serão encerradas.

Após o encerramento, será necessário registrar uma nova REQ, informando o número da WO finalizada, para fins de continuidade.
 
Ressaltamos ainda que reaberturas serão novamente encerradas, sendo obrigatório o registro de uma nova REQ conforme orientado acima.
 
Atenciosamente,

Jesse Mouta Pereira Batista 
Analista 
CTIS / CESTI - Esteira DEVOPS


eles respoderam isso:

Prezados(as),

1. O módulo é SISAG-provisionamento-saque-backend.


fiz a configuraçao e amndei isso pra infraestrutura:


à Infraestrutura,

Solicito ajuste na configuração do servidor sisag-lx0041 no host sspdeapllx0041 (10.116.88.98), referente à instrumentação do Application Insights.

A esteira de deploy do SISAG já realiza corretamente as seguintes etapas:
- Configura as variáveis de ambiente necessárias (APPLICATIONINSIGHTS_CONNECTION_STRING, APPLICATIONINSIGHTS_ROLE_NAME, etc.)
- Disponibiliza o arquivo applicationinsights.json em /opt/azure/config/appinsights/
- O agente applicationinsights-agent.jar está presente em /opt/azure/config/appinsights/

O servidor sisag-lx0041 está iniciando sem o parâmetro -javaagent na JVM, o que impede o funcionamento do Application Insights. Isso foi confirmado via ps -ef, onde outros servidores do mesmo host (sipdi-lx0041, sicdc-lx0041) já sobem corretamente com o parâmetro:

  -javaagent:/opt/azure/config/appinsights/applicationinsights-agent.jar

Ao verificar o arquivo host.xml, identificamos que os servidores sipdi-lx0041 e sicdc-lx0041 possuem o bloco <jvm> configurado, enquanto o sisag-lx0041 não possui esse bloco. Tentamos aplicar a correção manualmente, porém o arquivo pertence ao usuário jboss7 e não temos permissão de escrita.


Atenciosamente,

Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD


eles so repsoderam isso:


À
Suporte/CAIXA

Favor encaminhar para equipe nprd para ajuste de configuração no pipeline.

Analista: Wanderson França
Matricula: P911751
CTIS/CESTI/ESTEIRA - APLICAÇÃO/DEVOPS


ou seja ainda falta confiugraçoa na pipiline/release pode me ajudar a corrigir...


as variaveis esao assim:


SISAG-PROVISIONAMENTO-SAQUE-BACKEND-DES (29)
Grupo de variáveis de SISAG-PROVISIONAMENTO-SAQUE-BACKEND-DES

Scopes: EC DES
ORACLE_PASS
********
SISAG_API_KEY
********
_ENV.AMBIENTE
NACIONAL
_ENV.API_MANAGER_URL
https://api.des.caixa:8443
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=b0142390-50c9-495e-85b4-7b2ade8fc1cf;IngestionEndpoint=https://brazilsoutheast-0.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsoutheast.livediagnostics.monitor.azure.com/"
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_PROXY
http://proxydes.caixa:80
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SISAG-PROVISIONAMENTO-SAQUE-BACKEND-DES
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
100
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
_ENV.JAVA_OPTIONS
"-Dfile.encoding=UTF-8 -Dsun.jnu.encoding=UTF-8"
_ENV.LOG_LEVEL
INFO
_ENV.LOG_LEVEL_SISAG
INFO
_ENV.ORACLE_CONNECTIONTIMEOUT
30000
_ENV.ORACLE_IDLETIMEOUT
900000
_ENV.ORACLE_KEEPALIVETIME
0
_ENV.ORACLE_MAXIMUMPOOLSIZE
10
_ENV.ORACLE_MAXLIFETIME
1800000
_ENV.ORACLE_MINIMUMIDLE
3
_ENV.ORACLE_SHOW_SQL
false
_ENV.ORACLE_URL
jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(FAILOVER=ON)(LOAD_BALANCE=OFF)(ADDRESS=(PROTOCOL=TCP)(HOST=cnpexdadvm01-scan8.extra.caixa.gov.br)(PORT=1521))(ADDRESS=(PROTOCOL=TCP)(HOST=cnpexdadvm01clu08.extra.caixa.gov.br)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=CDBD02BCPDB001)(FAILOVER_MODE=(TYPE=SELECT)(METHOD=BASIC)(RETRIES=3)(DELAY=3))))
_ENV.ORACLE_USER
SSAGDS07
_ENV.REST_CONNECTION_TIMEOUT
5000
_ENV.REST_READ_TIMEOUT
5000
_ENV.SPRING_PROFILES_ACTIVE
production
_ENV.SSO_ISSUER
https://login.des.caixa/auth/realms/intranet
_ENV.URL_MODULO_PROVISIONAMENTO
https://sisag-provisionamento.des.caixa/sisagprov_intranet/RS
_SECRET.ORACLE_PASS
#{ORACLE_PASS}#
_SECRET.SISAG_API_KEY
#{SISAG_API_KEY}#


e nas taksd adicoinei a taks:  AAP_INSIGHTS_JBOSS - NA PRIMEIRA TAREFA... 

ESSA TASKS FAZ ISSO:


#!/bin/bash

# Script responsável pela instalação do agente do Application Insights nas imagens de container
# Além desse script, é necessário definir o valor do campo "Custom condition" para: ne(variables[VERSAO_INSIGHTS], "")
# Essa expressão irá verificar se a variável de versão está definida. Em caso positivo, o script roda.

echo "################################################################"
echo ""
echo "VERSÃO DO APPLICATION INSIGHTS ESCOLHIDA: ${VERSAO_INSIGHTS}"
echo ""
echo "################################################################"

curl -s -L -X GET "http://binario.caixa:8081/repository/Hortonworks_HDP/com/microsoft/azure/applicationinsights-agent/${VERSAO_INSIGHTS}/applicationinsights-agent-${VERSAO_INSIGHTS}.jar" \
   --output "applicationinsights-agent-${VERSAO_INSIGHTS}.jar"

mv applicationinsights-agent-${VERSAO_INSIGHTS}.jar $(Build.StagingDirectory)..



