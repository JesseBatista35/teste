@Backend @Segurança

Pessoal, atualização importante na REQ000144658129/WO0000080824869.

Reciclagam foi concluída, certificado validado. E agora — o fluxo OAuth está PROGREDINDO. Conseguimos novo log de hoje (24/06 11:16) que mostra:

1º request (401) → esperado
2º request (200) ✅ passou
3º request (302) → redirect com código de autorização ✅
4º request (200) ✅
5º request (200) ✅ (buscando beneficiários, vai longe)
6º request (201) ✅

Antes a app travava no 401. Agora está indo além. Mas ainda falha ao processar o retorno final.

Isso muda o escopo: não é mais bloqueio na preauth. O problema está na forma como o código de autorização está sendo validado ou processado na volta.

Backend, podem revisar:
- Comportamento esperado nesse POST de autorização (request 2)
- Se o código de autorização está sendo rejeitado na validação
- Se há algo errado no processamento do redirect pós-302

Semesses achados não conseguimos avançar. SLA segue 24h.

Abs,
Jessé
