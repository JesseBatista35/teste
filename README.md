Oi! Tudo bem sim. O siifx-caixinhas-api-aplicacao está no OKD4 sim. Como é OKD, na mudança você não informa um servidor específico, e sim o cluster e o namespace.

Conferi na release: o stage de PRD está configurado com SITE = okd4_prd e AMBIENTE = prd. Ou seja, vai subir no cluster OKD4 de produção, no namespace siifx-prd (mesmo padrão do siifx-des).

Na mudança pode colocar: “OKD4 PRD (okd4_prd) – namespace siifx-prd”.

Como é a primeira release em PRD, vale confirmar com o time da esteira de produção se o namespace já está criado. Eu atuo só em DES/TQS e não tenho acesso a PRD.
