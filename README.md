Boa observação! Mas acho que são dois certificados diferentes no mesmo handshake, com papéis opostos:

O CN=ECO.DATAPREV.PRD.CAIXA.GOV.BR que você citou deve ser o certificado de SERVIDOR do endpoint do Dataprev (o que a Caixa valida contra o truststore quando conecta neles).

O que achamos aqui (IF104.p12, CN=Eco Caixa, O=IF 104) é o certificado de CLIENTE que o SIFUG apresenta pra se autenticar junto ao Dataprev — tem clientAuth no Extended Key Usage e o alerta certificate_expired no log foi recebido por nós, ou seja, é o Dataprev rejeitando esse cert nosso por estar vencido.

Não está pinado nem hardcoded, tá referenciado limpo via property (api.dataprev.consignado.keystore.if104.path). O emissor é a própria CA do Dataprev (CN=Dataprev ECO) — isso é comum em integração institucional, onde o parceiro emite o cert de cliente pra controlar quem pode chamar a API dele.

Resumindo: a arquitetura parece ok pro que é (mTLS com cert de cliente emitido por eles mesmos), só venceu. Renovação depende do Dataprev mesmo (Issuer CN=Dataprev ECO, serial 84).
