vamos lá:


1 nova atividade
1 nova notificação
Há menu de contexto
Chat




Não lido
Canais
Chats
Chats de reunião

Mensagem não lidaÚltima mensagemChats em grupoChat de reuniãoChatFuncionários mencionadosMencionar todosImportanteUrgenteRascunhoRascunhoMudo ativadoReunião em andamentoReunião agora em andamentoVocê não pode enviar mensagens porque não é membro do chat.Não é possível enviar mensagens a este botPrivadoCompartilhadoTem um menu de contextoCanal mencionadoEquipe mencionadaFuncionários mencionadosNão lidoNão lidoReunião em andamentoNão lidoCanalEquipeTem mensagens fixadasVer maisComunidadeMostrar temporariamenteTem um menu de contextoChat com emblemaChats com emblema
Tem um menu de contexto

Equipes e canais

Murilo
Sonia


Chat

Compartilhado

Recapitular

Há menu de contexto

Reunir agora


3




Lista de Mensagens
Murilo Silva Andrade Souza adicionou Jesse Mouta Pereira Batista e Sonia de Carvalho Palhares Beira ao chat.
Chamada encerrada às quarta-feira 09:26 após 22 minutos 10 segundos
Jesse   Mouta   Pereira   Batista  - bom di... por Sonia de Carvalho Palhares Beira
Sonia de Carvalho Palhares Beira
quarta-feira 11:05

Jesse Mouta Pereira Batista - bom diaa! Conforme conversamos, favor informar os passos para configuração do app insights para o  SISME.

Estou olhando o link: Configuração do Application Insights no JBoss - VM - Overview -será que estou olhando no lugar certo??


👍
1 Curtir reação.

Uma informação: o SISME não vai pra ambient... por Sonia de Carvalho Palhares Beira
Sonia de Carvalho Palhares Beira
quarta-feira 11:06

Uma informação: o SISME não vai pra ambiente de nuvem, ok? Ele é um sistema departamental que está migrando para a esteira devops.

Sonia   de   Carvalho   Palhares   Beira , ... por Jesse Mouta Pereira Batista
quarta-feira 12:11
Jesse Mouta Pereira Batista

Sonia de Carvalho Palhares Beira, bom dia, o Wendel me passou um contato de um colega, que na época ajudou ele na configuração, eu já perguntei pra ele aqui pelo Teams e estou aguardando retorno, assim que tiver passo aqui as orientações. 


👍
1 Curtir reação.

Jesse   Mouta   Pereira   Batista  - bom di... por Sonia de Carvalho Palhares Beira
Sonia de Carvalho Palhares Beira
Ontem 11:50

Jesse Mouta Pereira Batista - bom diaa!! Como vai você? Já temos os passos pra implantar o app insights?

Sonia   de   Carvalho   Palhares   Beira , ... por Jesse Mouta Pereira Batista
Ontem 11:58
Jesse Mouta Pereira Batista

Sonia de Carvalho Palhares Beira, bom dia tudo bem graças a Deus e com você?  o colega me passou os passou ontem a noite, estou em uma sala aqui. e assim que finalizar vou ler a documentação.


👍
1 Curtir reação.

ok por Sonia de Carvalho Palhares Beira
Sonia de Carvalho Palhares Beira
Ontem 11:59

ok

marquei você no chat em que estamos tratand... por Sonia de Carvalho Palhares Beira
Sonia de Carvalho Palhares Beira
Ontem 11:59

marquei você no chat em que estamos tratando este assunto, ok?

tem menu de contexto


eu fiquie de verificar isso porem o que o cloega me passou foi exatamente a mesma coisa ele me mandou  olink da wiki,..


entao acredito que temos que fazer rodar a build e de alguma foirma ele deve cirar la dentro do azure pois nao tem niguem aqui que saiba quem pede esse acesso e qual o caminho

entao vamos la me ajuda a fazer tudo. vamos pegar o exemplço do silce que ja tem e vamos fazer e tambem me ajuda a reponde a sonia pois ela esta me questionando em sala




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
Configuração do Application Insights no JBoss - VM
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

63 visits in last 30 days
Showing filters 1 through 1
