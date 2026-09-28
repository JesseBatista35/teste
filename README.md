Pessoal, segue o resumo do incidente do agente Control-M caddeapllx2695 e o que precisamos de vocês.

Causa:
O release SIIFX-caixinhas-batch (Azure DevOps, estágio EC DES), executado em 26/set, gravou no CONFIG.dat do agente uma configuração antiga do Control-M, que vem das variáveis do próprio pipeline:

CTMSHOST = crjdeaprlx038,sspdeaprlx0028 (dois servidores, valor inválido)
Portas 7015/7016 (as corretas para o sspdeaprlx0028 são 18007/18008)

Situação atual:
O agente foi ajustado manualmente no padrão da caddeapllx2463 (server sspdeaprlx0028, portas 18007/18008). Os pings do ag_diag_comm deram Succeeded e o agente está Available no CCM (CTMD_DES).

Solicitações:

Abertura de REQ para o ajuste das variáveis do release SIIFX-caixinhas-batch, somente no escopo EC DES, com o seguinte conteúdo:
CTMSHOST = sspdeaprlx0028
CTMPERMHOSTS = sspdeaprlx0028
ATCMNDATA = 18007
AGCMNDATA = 18008
Sem esse ajuste, o próximo deploy volta a derrubar o agente. Com a REQ aberta, eu faço a alteração dentro do meu escopo.
Job de teste: executar um job do processo novo nesse agente e confirmar se finaliza com Ended OK.
CCM: remover a entrada duplicada desse agente que aparece em vermelho ("Failed to resolve hostname"). A válida é a do FQDN caddeapllx2695.agil.nprd.caixa.gov.br.
Não executar o release SIIFX-caixinhas-batch em DES até a REQ ser atendida.
