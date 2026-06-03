Subject: Continuidade REQ000144260334 — SISAG-PROV não visível no Azure Portal (Application Insights)

Prezados,

Em continuidade ao atendimento da REQ000144260334, encaminhamos para análise da equipe responsável pelo ambiente de VM.

Dados do servidor:
- Servidor: sspdeapllx0041
- IP: 10.116.88.98
- Instância JBoss: sisag-lx0041
- Módulo: SISAG-provisionamento-saque-backend (SISAG-PROV)
- Ambiente: DES

O QUE FOI FEITO:
As configurações do Application Insights foram aplicadas diretamente no servidor, conforme abaixo:

1. host.xml (sspdeapllx0041) — adicionado bloco <jvm> com a variável APPLICATIONINSIGHTS_ROLE_INSTANCE para o servidor sisag-lx0041.

2. domain.xml (sspdeapllx0040 - master) — adicionadas jvm-options no server-group do grupo sisag com os parâmetros:
   - -javaagent:/opt/azure/config/appinsights/applicationinsights-agent.jar
   - -Dapplicationinsights.configuration.file=/opt/azure/config/appinsights/applicationinsights.json
   - Configurações de proxy (proxydes.caixa:80) e nonProxyHosts

3. applicationinsights.json — configurado com connectionString, role.name = SISAG-PROV e sampling percentage = 100.

4. O agente Application Insights 3.3.1 iniciou com sucesso, confirmado via log:
   ApplicationInsights Java Agent 3.3.1 started successfully
   E confirmado via ps -ef com o parâmetro -javaagent ativo.

PROBLEMA ATUAL:
Apesar de o agente estar ativo no servidor, o módulo SISAG-PROV não está aparecendo no portal Azure (https://portal.azure.com/) no recurso LDAI-Canais-Proprios-Interno.

Suspeitas:
- Possível problema de comunicação entre o agente e o endpoint do Azure via proxy (proxydes.caixa)
- Possível problema de certificado no truststore utilizado pela JVM
- Não temos acesso ao portal Azure para validar o recurso diretamente

SOLICITAÇÃO:
1. Verificar se os dados estão chegando no recurso LDAI-Canais-Proprios-Interno no portal Azure
2. Validar a comunicação do servidor sspdeapllx0041 com os endpoints do Application Insights via proxy:
   curl -v -x proxydes.caixa:80 https://brazilsoutheast-0.in.applicationinsights.azure.com
3. Verificar o log do agente em:
   /opt/azure/config/appinsights/applicationinsights.log
4. Caso necessário, reiniciar o servidor sisag-lx0041 via JBoss CLI (não temos acesso às credenciais de management)

Atenciosamente,
Jessé Mouta Pereira Batista
Analista — CTIS / CESTI Esteira DEVOPS DES TQS NPRD
