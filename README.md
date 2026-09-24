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



ELA JA FOI ATENDIDA

Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081676087
Criado em	 18/09/2026 14:17:31
Criado por	 P531441
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados,

Todos os endereços foram analisados em busca de vulnerabilidades. Não foram encontradas em blocklist internacional.

Dessa forma, autorizada conexão com endereço de destino.




Att
Global HITSS - Conectividade Interna
CESET - CN Segurança Cibernética
ID da Ordem de Trabalho	 WO0000081676087
Criado em	 18/09/2026 00:39:30
Criado por	 P584553
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À

HITSS\CESET

Realizada análise das regras existentes no Proxy de Serviços PROXYDES.

Foi localizada a regra OKD OCP que atende ao endereço de Origem solicitado.
- 10.116.222.84

Solicitamos autorização para inclusão dos seguintes DESTINOS na regra ou criação de nova regra a fim de atender o fluxo solicitado.
- southcentralus-3.in.applicationinsights.azure.com
- southcentralus.livediagnostics.monitor.azure.com
- *.in.applicationinsights.azure.com
- brazilsouth.livediagnostics.monitor.azure.com
- brazilsoutheast.livediagnostics.monitor.azure.com

Informamos que as demais URLs já são contemplada pela mesma regra.

Atenciosamente,

CETEL08\CETEL960
-------------------------
ID da Ordem de Trabalho	 WO0000081676087
Criado em	 17/09/2026 17:29:41
Criado por	 P970573
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado (a) usuário (a)

1. Informamos que sua solicitação foi recebida em nossa fila e seguirá o fluxo de atendimento.

2. Trata-se de uma atividade de complexidade baixa e será atendida o mais breve
possível.

3. Esta demanda será apresentada para deliberação na reunião de Overview?
( X ) SIM (  ) NÃO

4. Em complemento as informações, destaca-se que: a atividade será encaminhada para a avaliação e autorização da área de CiberSegurança e será executada a partir das 19:00h, após a aprovação da segurança.

5. Informações futuras serão adicionadas a esta WO.

Atenciosamente,

Josenilton B dos Santos (p970573)
Preposto: CTIS / CETEL / DHCP, DNS e Proxy de Serviços
ID da Ordem de Trabalho	 WO0000081676087
Criado em	 17/09/2026 17:08:23
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Quinta-feira, 24/09/2026 13:50:53
