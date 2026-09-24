1. Encerramento do chamado original (resposta ao solicitante)

Prezados,

Concluímos a análise do caso. A configuração do Application Insights na aplicação SICBP-TRILHA-API (DES) está correta: o agente 3.7.10 inicializa normalmente e o Live Metrics recebe dados.

Causa raiz: o proxy corporativo DES (proxydes.caixa, Forefront TMG) está bloqueando o acesso ao endpoint de ingestão do Azure Monitor (brazilsoutheast-0.in.applicationinsights.azure.com:443). Os testes feitos no pod sicbp-trilha-api-des retornam 502 Proxy Error (Forefront TMG denied the specified URL). Esse endpoint é o que recebe requisições e dependências, e sem ele os dados não aparecem nas abas Performance e Application Map. O Live Metrics usa outro endpoint, que já está liberado.

Encaminhamento: abrimos a requisição de liberação de proxy REQ000146189275, com origem no namespace sicbp-des (EgressIP 10.116.222.84) e destino nos endpoints do Application Insights e do Azure Monitor. Pedimos que acompanhem o andamento por essa REQ.

Depois que a liberação for concluída, não é preciso alterar a aplicação. O agente reenvia automaticamente a telemetria, e os dados devem aparecer em Performance e Application Map em poucos minutos. Se o problema continuar após a conclusão da REQ, abram um novo chamado citando este atendimento e a REQ000146189275.

Estamos encerrando este chamado.

2. Mensagem no Teams para o gestor

Oi, [nome], tudo bem?

Abri a REQ000146189275 (liberação de proxy DES) e ela está aguardando sua aprovação.

É para liberar o acesso da aplicação SICBP-TRILHA-API (DES) aos endpoints do Azure Application Insights. Hoje o proxy corporativo está bloqueando o envio de telemetria, e por isso o time não consegue analisar performance nem dependências no Azure. A liberação é só para ambiente não produtivo, com origem no namespace sicbp-des (EgressIP 10.116.222.84), em HTTPS/443.

Consegue aprovar quando puder? Obrigado!

Um ponto de atenção: a REQ anterior (REQ000146046751) ainda está aberta para o mesmo caso. Vale cancelar essa REQ ou vincular as duas, citando a nova, para a equipe de proxy não tratar em duplicidade.
