Configuração do Application Insights no JBoss (VM e Container)

Follow
3

Edit

Guilherme Gomes Soares da Silva
17 de abr. de 2025
O artigo abaixo é baseado na versão 3.7.1 Versões mais recentes podem ser obtidas em: https://github.com/microsoft/ApplicationInsights-Java/releases 

+ ATENÇÃO: ESTA DOCUMENTAÇÃO É VALIDA APENAS PARA AMBIENTES EM CONTAINER (OKD), PARA AMBIENTES EM VM UTILIZAR ESTE GUIA ABAIXO:
Configuração do Application Insights no JBoss - VM

O Azure Application Insights é uma ferramenta que faz parte do Azure Monitor, usado para coleta e análise de dados telemétricos de ambientes locais e da Azure (na nuvem).

Application Insights instrumentation in your app sends telemetry to your Application Insights resource.
Como a quantidade de dados enviados a nuvem impacta no custo de utilização da ferramenta, temos adotado o procedimento de validar as configurações apenas em DES e, uma vez que os parâmetros de análise estejam corretamente ajustados, partimos direto para o ambiente PRD.

Para que os dados da aplicação sejam coletados corretamente alguns requisitos devem ser atendidos (tanto em DES quanto em PRD):

Contents
1. Solicitar regras de firewall para o proxynuvem.caixa
2. Liberar o acesso aos endpoints da Azure no Proxy
Instruções para preenchimento da REQ
3. Adicionar o agente na VM/Container atráves do JBoss Deployments;
4. Adicionar as variáveis de ambiente responsáveis pela configuração do agente
5. Importar os certificados dos endpoints no JKS usado na aplicação
6. Remover a configuração do APM Elastic (se houver), acrescentar o agente do Application Insights e configurar o proxy
Erros comuns
Caminho incorreto para o agente
Ausência dos certificados no JKS
Falha de comunicação com o Proxy
Ausência de Instrumentation Key
Referências
Equipes envolvidas:

CEDES (Apoio na geração dos builds e configuração do ambiente DES)
CEPTI (configuração do ambiente PRD, após validação em DES)
CETAD (configuração do ambiente PRD, após validação em DES)
1. Solicitar regras de firewall para o proxynuvem.caixa
Em ambiente DES/TQS/HMP:

Nesses ambientes não é necessário solicitar regra de firewall pois eles já comunicam com o proxydes.caixa.

Em ambiente PRD:
Responsável: CEPTI

Para saber se as regras já existem é recomendável executar um teste. Dentro do terminal basta executar: curl -v proxynuvem.caixa:80

Se não houver nenhuma mensagem de "connection refused", as regras estão funcionais.

Caso o sistema ainda não tenha regras para o proxy, basta solicitar uma regra adicional (via infradevops) e usar os backends PROXYNUVEM.CAIXA.

2. Liberar o acesso aos endpoints da Azure no Proxy
Responsável pela abertura da REQ em DES/TQS/HMP: Comunidades

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

com.microsoft.azure:applicationinsights-agent:3.7.1:jar

Por fim, executar uma nova build para que o agente seja incluído na imagem.

4. Adicionar as variáveis de ambiente responsáveis pela configuração do agente
Responsável em HMP/PRD: CEPTI
Responsável em DES/TQS: CETAD36 através da REQ abaixo:

Tecnologia da Informação e Comunicação
Centralizadoras de Tecnologia da Informação
CETAD - Suporte Não-Produção
Suporte à Aplicação Multiplataforma
As seguintes variáveis devem ser incluidas no Variable Group correspondente ao ambiente (DES ou PRD):


_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING = <valor do campo "Connection String" obtido no workspace da comunidade na Azure, colocar o valor entre "aspas">
_ENV.APPLICATIONINSIGHTS_ROLE_NAME = <SIGLA-MODULO> (para o ambiente DES, acrescentar um "-DES")
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL = INFO
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL = INFO
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE = <Por recomendação da GESTI, valor padrão para DES e PRD = 100>
URL_PROXY = <proxydes.caixa ou proxynuvem.caixa>
Obs.: Opções adicionais de configuração disponíveis em: https://docs.microsoft.com/pt-br/azure/azure-monitor/app/java-standalone-config 

5. Importar os certificados dos endpoints no JKS usado na aplicação
Responsável em DES/TQS: Comunidades
Responsável em HMP/PRD: CEPTI

Se a sua aplicação está utilizando o "caixa-truststore.jks" padrão da esteira, é possível trocar pelo "caixa-truststore-azure.jks" que já contém os certificados da Azure.

O procedimento de alteração do arquivo JKS pode ser consultado aqui: Trocar o arquivo JKS padrão do pipeline

Será necessário adicionar apenas o certificado raiz da cadeia, obtido nos links recomendados pela Microsoft:

https://rt.services.visualstudio.com/ 
https://southcentralus-3.in.applicationinsights.azure.com/ 

O procedimento está descrito aqui: https://go.microsoft.com/fwlink/?linkid=2151450 

6. Remover a configuração do APM Elastic (se houver), acrescentar o agente do Application Insights e configurar o proxy
Responsável em DES/TQS: CETAD36 (solicitar na mesma REQ do item 4)
Responsável em HMP/PRD: CEPTI

Remover ou comentar toda e qualquer referência ao APM no pipeline (variáveis) e no arquivo "standalone.conf".

Comentar ou remover as linhas do arquivo standalone.conf deve ser suficiente, caso não tenha nenhuma referência em variáveis de ambiente. As referências geralmente aparecem como nas linas abaixo:

JAVA_OPTS="$JAVA_OPTS -javaagent:/opt/apm_agent/elastic-apm-agent-1.15.0.jar ...
Para adicionar o agente do Application Insights, basta acrescentar a linha abaixo na seção "# Specify options to pass to the Java VM" do arquivo standalone.conf:

JAVA_OPTS="$JAVA_OPTS -javaagent:$JBOSS_HOME/standalone/deployments/applicationinsights-agent.jar"
Após a seção "Specify options to pass to the Java VM", incluir a configuração do do proxy como segue:

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
A variável URL_PROXY será preenchida em tempo de release de acordo com a variável criada no item 4.

Erros comuns
Um passo importante antes de determinar o erro é coletar as informações geradas pelo agente do Application Insights no arquivo "applicationinsights.log" que é criado automaticamente no mesmo diretório onde o agente foi instalado.

No caso do JBoss esse arquivo pode ser acessado em:

/opt/jboss/standalone/deployments/applicationinsights.log
Caminho incorreto para o agente
Caso o caminho definido no arquivo "standalone.conf" esteja incorreto ou o agente não esteja presente na imagem, o erro abaixo será exibido no log do Pod impedindo a aplicação de iniciar:

Quarkus_manifestMissing.PNG

Ausência dos certificados no JKS
Caso o JKS utilizado na aplicação não possua os certificados da Azure, obtidos no passo 5, o agente do Application Insights irá exibir a mensagem abaixo no log da aplicação:

Quarkus_CertificateError.PNG

Falha de comunicação com o Proxy
Caso, por algum motivo, o agente não consiga enviar os dados através do proxy, o erro abaixo será exibido no log da aplicação:

Quarkus_ProxyError.PNG

Verifique a configuração do proxy no arquivo "standalone.conf" e na variável URL_PROXY. o endereço do proxy deve ser preenchido apenas com o FQDN, sem protocolo e porta.

Ausência de Instrumentation Key
Se nenhuma Instrumentation Key (variável APPLICATIONINSIGHTS_CONNECTION_STRING) for fornecida para o agente, a inicialização irá falhar e ele não terá nenhuma outra ação, sem impacto na aplicação. A imagem abaixo traz o log que será gerado nesse cenário:

Quarkus_NoInstrument.PNG

 Finalizados os procedimentos acima, basta gerar uma nova release, aguardar a finalização e verificar se os dados já estão chegando na Azure.

 Se possível acompanhar os logs de inicialização do JBoss para identificar possíveis erros de comunicação entre o agente do Application Insights e a nuvem.

 Em caso de problemas de comunicação, entrar em contato com a equipe da CETAD08 (serviços) para confirmar se os dados estão passando normalmente pelo proxy definido.

Referências
https://docs.microsoft.com/pt-br/azure/azure-monitor/app/app-insights-overview 
https://skrift.io/issues/the-insightful-azure-application-insights/ 
https://docs.microsoft.com/pt-br/azure/azure-monitor/app/java-standalone-troubleshoot 
https://docs.microsoft.com/pt-br/azure/azure-monitor/app/java-in-process-agent 
http://wikiprd.corecaixa/index.php/Criação_de_monitoração_no_Azure_(insights) 

45 visits in last 30 days
