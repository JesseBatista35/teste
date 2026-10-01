Validação da CRQ000001499711 (origem SIHDG-JBOSS8-TQS 10.116.221.46 → CBRDEDADNT002 10.116.29.201:31153), em 01/10 às 12:37:

A origem foi confirmada: o EgressIP do namespace sihdg-tqs no OKD4 NPRD é 10.116.221.46.
O teste TCP a partir do pod para 10.116.29.201:31153 falha por timeout.
O nome CBRDEDADNT002.extra.caixa.gov.br ainda resolve para 10.116.93.230, e não para 10.116.29.201.

Solicitamos verificar a aplicação da regra e da rota para esse fluxo e confirmar se a atualização do DNS faz parte da mudança.
