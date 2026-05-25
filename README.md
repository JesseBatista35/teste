Olá, equipe de Infraestrutura,

Solicito apoio para ajuste na configuração do servidor sisag-lx0041 no host sspdeapllx0041 (10.116.88.98), referente à instrumentação do Application Insights.

CONTEXTO
A esteira de deploy do SISAG já realiza corretamente as seguintes etapas:
- Configura as variáveis de ambiente necessárias (APPLICATIONINSIGHTS_CONNECTION_STRING, APPLICATIONINSIGHTS_ROLE_NAME, etc.)
- Disponibiliza o arquivo applicationinsights.json em /opt/azure/config/appinsights/
- O agente applicationinsights-agent.jar está presente em /opt/azure/config/appinsights/

PROBLEMA
O servidor sisag-lx0041 está iniciando sem o parâmetro -javaagent na JVM, o que impede o funcionamento do Application Insights. Isso foi confirmado via ps -ef, onde outros servidores do mesmo host (sipdi-lx0041, sicdc-lx0041) já sobem corretamente com o parâmetro:

  -javaagent:/opt/azure/config/appinsights/applicationinsights-agent.jar

ANÁLISE
Ao verificar o arquivo host.xml, identificamos que os servidores sipdi-lx0041 e sicdc-lx0041 possuem o bloco <jvm> configurado, enquanto o sisag-lx0041 não possui esse bloco. Tentamos aplicar a correção manualmente, porém o arquivo pertence ao usuário jboss7 e não temos permissão de escrita.
