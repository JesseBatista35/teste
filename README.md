recebi essa demanda e fiz o atendimeno

O que você deseja?*:	Suporte ao ambiente de aplicação Multiplataformas
***Atenção***:	Essa opção deve ser utilizada para obter suporte para ambientes e produtos que não são relacionados às Esteiras DevOps.
.:	Ex: Aplicações Jboss legado, Aplicações Windows legado, Jenkins departamental, Git Lab Departamental, Nexus Departamental, Sonar Departamental.
Qual o ambiente*:	DES
Qual é o site?*:	Bancário-São Paulo
Qual o nome do sistema?*:	SISAG-PROV
Selecione a sua Comunidade*:	Canais Próprios Clientes
Formas de contato*:	teams
Descrição da necessidade*:	

Prezados(as),

1. Solicito realizar os ajustes necessários para que o módulo de provisionamento do SISAG possa ser monitorado em DES pelo appinsights

SISAG-PROV - sspdeapllx0041

2. A aplicação também será ajustada.

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


Prezados(as),

1. O módulo é SISAG-provisionamento-saque-backend


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

À
Suporte/CAIXA

Favor encaminhar para equipe nprd para ajuste de configuração no pipeline.

Analista: Wanderson França
Matricula: P911751
CTIS/CESTI/ESTEIRA - APLICAÇÃO/DEVOPS



CAIXA,
 
Prezados,

Poderia informar o nome do host ou ip de referencia citado para que possa analisar a configuração desejada?


Atenciosamente,
Cid Reis
CTIS/CESTI/ESTEIRAS DEVOPS


À CAIXA, 


Prezados,


Conclusão da Configuração — Application Insights / SISAG-PROV (DES)

Servidor: sspdeapllx0041
Módulo: SISAG-provisionamento-saque-backend
Instância JBoss: sisag-lx0041


Foi identificado que o ambiente opera em modo JBoss Domain, onde os parâmetros de JVM são controlados pelo domain.xml no servidor master (sspdeapllx0040) e pelo host.xml no servidor slave (sspdeapllx0041), e não via standalone.conf como em ambientes standalone.
As seguintes configurações foram aplicadas:

host.xml (sspdeapllx0041) — adicionado bloco <jvm> com environment-variables para o servidor sisag-lx0041, incluindo a variável APPLICATIONINSIGHTS_ROLE_INSTANCE.
domain.xml (sspdeapllx0040) — adicionadas jvm-options no server-group do grupo sisag com os parâmetros:

-javaagent:/opt/azure/config/appinsights/applicationinsights-agent.jar
-Dapplicationinsights.configuration.file=/opt/azure/config/appinsights/applicationinsights.json
Configurações de proxy (proxydes.caixa:80) e nonProxyHosts


applicationinsights.json — atualizado com connectionString, role.name e sampling percentage: 100 referentes ao ambiente DES do SISAG-PROV.
Reinicialização — o host-controller foi reiniciado para aplicar as novas jvm-options do domain.xml, e o servidor sisag-lx0041 subiu corretamente com o parâmetro -javaagent ativo, confirmado via ps -ef.

Evidência:

O agente Application Insights 3.3.1 iniciou com sucesso (PID 3717) conforme log em /opt/azure/config/appinsights/applicationinsights.log:
ApplicationInsights Java Agent 3.3.1 started successfully (PID 3717)
O processo sisag-lx0041 confirmado rodando com -javaagent ativo via ps -ef.
Observação: O arquivo applicationinsights.json e o agente .jar em /opt/azure/config/appinsights/ são compartilhados entre os módulos do host. Alterações nesse arquivo impactam todos os servidores que utilizam o mesmo agente. 


Atenciosamente,

Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD


porem agora o demandete me questinou isso:


bom dia Jesse, tudo bem?
 
sobre o atendimento da REQ000144260334, como posso ver essa monitoração do appinsights em DES?
 
Wendel Lopes dos Santos, bom dia tudo bem e  com voce? 
 
só finalizar uma sala aqui e já te mando o caminho
 
tudo caminhando... 
 
Jesse Mouta Pereira Batista
Wendel Lopes dos Santos, bom dia tudo bem e  com voce?   só finalizar uma sala aqui e já te mando o caminho
obrigado
 
dei uma pesquisada no https://portal.azure.com/ mas não achei...
Microsoft Azure
 
Conclusão da Configuração — Application Insights / SISAG-PROV (DES)
 
Servidor: sspdeapllx0041

Módulo: SISAG-provisionamento-saque-backend

Instância JBoss: sisag-lx0041
 
achei como SISAG-provisionamento-saque-backend
 
 é esse mesmo?
 
isso é esse mesmo
 
Conclusão da Configuração — Application Insights / SISAG-PROV (DES)
 
Servidor: sspdeapllx0041

Módulo: SISAG-provisionamento-saque-backend

Instância JBoss: sisag-lx0041
 
 
Foi identificado que o ambiente opera em modo JBoss Domain, onde os parâmetros de JVM são controlados pelo domain.xml no servidor master (sspdeapllx0040) e pelo host.xml no servidor slave (sspdeapllx0041), e não via standalone.conf como em ambientes standalone.

As seguintes configurações foram aplicadas:
 
host.xml (sspdeapllx0041) — adicionado bloco <jvm> com environment-variables para o servidor sisag-lx0041, incluindo a variável APPLICATIONINSIGHTS_ROLE_INSTANCE.

domain.xml (sspdeapllx0040) — adicionadas jvm-options no server-group do grupo sisag com os parâmetros:
 
é porque adicionei no servidor
 
mais o modulo é esse mesmo
 
já temos um módulo na esteira com esse nome: SISAG-provisionamento-saque-backend
 
será que não vai causar confusão?? rs
 
acredito que não, mais esse foi o modulo referenciado na REQ. rsrs 
 
eu abri como 
 

SISAG-PROV
 
 
 
O que você deseja?*:	Suporte ao ambiente de aplicação Multiplataformas
***Atenção***:	Essa opção deve ser utilizada para obter suporte para ambientes e produtos que não são relacionados às Esteiras DevOps.
.:	Ex: Aplicações Jboss legado, Aplicações Windows legado, Jenkins departamental, Git Lab Departamental, Nexus Departamental, Sonar Departamental.
Qual o ambiente*:	DES
Qual é o site?*:	Bancário-São Paulo
Qual o nome do sistema?*:	SISAG-PROV
Selecione a sua Comunidade*:	Canais Próprios Clientes
Formas de contato*:	teams
Descrição da necessidade*:	Prezados(as),
1. Solicito realizar os ajustes necessários para que o módulo de provisionamento do SISAG possa ser monitorado em DES pelo appinsights
SISAG-PROV - sspdeapllx0041
2. A aplicação também será ajustada.
 
 
a gente consegue mudar o nome para SISAG-PROV?
 
Wendel Lopes dos Santos, eu vou consultar aqui com os outros analistas se é possível essa alteração 
 
só um momento
 
obrigado



 
