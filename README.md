
Qual o tipo de serviço?*:	Alterar configurações em balanceador
Detalhe do serviço*:	VIP
Selecione a atividade a ser executada*:	Solicitar inclusão de VIP
Data e Hora de execução*:	16/11/2026 16:56:00
Prazo final do atendimento*:	17/11/2026 16:56:00
Descrição da solicitação*:	CETEL,

1. Solicitamos a criação de um VIP exclusivo para a URL sigpf-vendas.esteiras.tqs.caixa, balanceando para a VM 10.116.202.20 (caddeapllx2818.agil.nprd.caixa.gov.br) na porta 80, e favor vincular a esse VIP o certificado já importado no balanceador CADDEAPRLB003-1 (CT2026_SIGPF-VENDAS.ESTEIRAS.TQS.CAIXA, gerado na REQ000146499953) para responder na porta segura 443.

2. Atenção: hoje a URL resolve para o VIP compartilhado 10.116.180.23 (VS_Esteiras-TQS_BR_https_443), que não balanceia para a nossa VM e retorna 403. O pedido é de um VIP novo e exclusivo, e não do compartilhado.

3. Após a criação, favor informar na resposta o IP do novo VIP, para abrirmos a REQ de DNS.

Contato: C159524 (Lucas Nadier) – VITEC/CESOB
