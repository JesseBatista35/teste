Entendi. A REQ000146046751 foi finalizada, mas a liberação não teve efeito, e por isso a nova REQ000146189275 é necessária. Seguem os textos finais.

1. Encerramento do chamado original

Prezados,

Concluímos a análise do caso. A configuração do Application Insights na aplicação SICBP-TRILHA-API (DES) está correta: o agente 3.7.10 inicializa normalmente e o Live Metrics recebe dados.

Causa raiz: o proxy corporativo DES (proxydes.caixa, Forefront TMG) está bloqueando o acesso ao endpoint de ingestão do Azure Monitor (brazilsoutheast-0.in.applicationinsights.azure.com:443). Os testes feitos no pod sicbp-trilha-api-des em 24/09/2026 retornam 502 Proxy Error (Forefront TMG denied the specified URL). Esse endpoint é o que recebe requisições e dependências, e sem ele os dados não aparecem nas abas Performance e Application Map. O Live Metrics usa outro endpoint, que já está liberado.

Encaminhamento: a liberação foi solicitada anteriormente na REQ000146046751, que foi finalizada, mas o bloqueio continua. Abrimos a requisição REQ000146189275 para que a equipe de Proxy de Serviços aplique ou corrija a regra, com origem no namespace sicbp-des (EgressIP 10.116.222.84) e destino nos endpoints do Application Insights e do Azure Monitor. Pedimos que acompanhem o andamento por essa REQ.

Depois que a liberação for concluída, não é preciso alterar a aplicação. O agente reenvia automaticamente a telemetria, e os dados devem aparecer em Performance e Application Map em poucos minutos. Se o problema continuar após a conclusão da REQ, abram um novo chamado citando este atendimento e a REQ000146189275.



Oi, [nome], tudo bem?

Abri a REQ000146189275 (liberação de proxy DES) e ela está aguardando sua aprovação.

É para o SICBP-TRILHA-API (DES) enviar telemetria ao Azure Application Insights. Já tínhamos uma REQ para isso (REQ000146046751), mas ela foi finalizada e o proxy continua bloqueando, como confirmei hoje em teste no pod. Sem essa liberação, o time não consegue analisar performance nem dependências no Azure. É só para ambiente não produtivo, com origem no namespace sicbp-des (EgressIP 10.116.222.84), em HTTPS/443.

Consegue aprovar quando puder? Obrigado!
