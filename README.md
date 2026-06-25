@Backend @Segurança

Pessoal, atualização importante na REQ000144658129/WO0000080824869.

Conseguimos novo log de hoje (25/06 às 13:59) e ficou claro que um novo client_id foi colocado em produção. Antes era `f514c1cc-08bf-4bcc-80ec-2eed1a5c2d3c`, agora é `b0bbfcbb-e6bc-41cc-b6a8-170ff0edbf77`.

O fluxo OAuth melhorou BASTANTE:
- PUT registration (200) ✅
- POST preauth (401) - challenge retornado
- POST resposta ao challenge (200) ✅
- GET authorization (302) ✅ redirect com código
- POST (200) ✅
- GET (200) ✅

Mas a app ainda falha ao processar o retorno final.

Precisamos confirmar:
- Novo client_id está 100% configurado no servidor?
- Há alguma diferença de política de segurança entre os dois IDs?
- O processamento do redirect_uri está correto para esse novo ID?

Sem esses achados não conseguimos avaçar. SLA segue 24h.

Abs,
Jessé
