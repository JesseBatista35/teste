Nome do Projeto/ Descrição

SICBP-TRILHA-API (DES) - Liberação de acesso aos endpoints do Azure Application Insights / Azure Monitor para envio de telemetria (APM). O proxy DES (Forefront TMG) nega o CONNECT para brazilsoutheast-0.in.applicationinsights.azure.com:443 com "502 Proxy Error (Forefront TMG denied the specified URL)", impedindo a ingestão de dados (abas Performance e Application Map). Evidência anexa. Aplicar a regra em todos os nós do array proxydes.caixa (10.252.32.63 e 10.252.32.65). Referência: REQ000146046751.

Origem (HOSTNAME E IP)

Cluster OKD4 NPRD - namespace sicbp-des (aplicação sicbp-trilha-api-des)
EgressIP: 10.116.222.84

Destino (DOMÍNIO/ URL/ IP)

brazilsoutheast-0.in.applicationinsights.azure.com
*.in.applicationinsights.azure.com
brazilsouth.livediagnostics.monitor.azure.com
brazilsoutheast.livediagnostics.monitor.azure.com
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

Coloquei o brazilsoutheast-0.in.applicationinsights.azure.com explícito no topo, além do wildcard. É o host que está bloqueado, e se o TMG não aplicar o curinga direito, a liberação ainda cobre esse caso.

Protocolo/ Porta

HTTPS / TCP 443 (método CONNECT via proxydes.caixa:80)

Matrícula do aprovador: a do seu gestor chefe da unidade ou do eventual dele.

Anexos: anexe um print ou um .txt com a saída do curl que mostra o 502 Proxy Error ( Forefront TMG denied...) e o Via: 1.1 DADNGITRNT002. Se quiser, anexe também o trecho do log do agente com o HttpProxyConnectException.
