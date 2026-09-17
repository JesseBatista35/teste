Prezados,

Referente à falha de comunicação do módulo SICBP-TRILHA-API com o Application Insights em ambiente DES (erro "Forefront TMG denied the specified URL" ao tentar acessar os endpoints de telemetria do Azure Monitor).

Ação realizada: identificado que o bloqueio ocorre no proxy corporativo (Forefront TMG), que nega o acesso às URLs de telemetria do Application Insights. Foi aberta solicitação de liberação de proxy (Serviço Proxy - Não Produção) com os seguintes dados:
Origem: sicbp-trilha-api-des (namespace sicbp-des) / 10.116.222.84
Destino: brazilsoutheast-0.in.applicationinsights.azure.com, brazilsouth.livediagnostics.monitor.azure.com, brazilsoutheast.livediagnostics.monitor.azure.com
Protocolo/Porta: HTTPS / 443
Protocolo da requisição: REQ000146046751

Pendência: aguardar atendimento e liberação da REQ pela equipe responsável (CETEL/Proxy). Após a liberação, será necessário validar novamente a integração com o Application Insights.

Mensagem no Teams para o supervisor aprovar a REQ:

Bom dia,

Foi aberta a solicitação REQ000146046751 (liberação de proxy para o SICBP-TRILHA-API acessar o Application Insights em ambiente DES) e ela está pendente da sua aprovação como gestor. Poderia aprovar quando possível para não travar o andamento? Qualquer dúvida sobre o conteúdo da requisição fico à disposição.

Obrigado.

Quer que eu ajuste o nome do destinatário na mensagem do Teams, ou fica genérico assim mesmo?
