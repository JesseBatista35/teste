Pablo, vocês abrem a regra de TQS, igual fizeram em DES. Os dados:

Origem: sipgc-api-informacoes-tqs.apps.nprd.caixa (10.116.180.64), namespace sipgc-tqs
Destino: hom.sigoc.caixa (10.123.20.225 / rs0000sr625.corp.caixa.gov.br)
Protocolo/porta: TCP 443
Evidência: testei de dentro do pod de TQS. O DNS resolve, mas a porta 443 não abre (sem conexão).

Use o mesmo padrão do pedido de DES (98711), com origem e destino iguais.

Duas observações:

Confirma por favor que o SIGOC de TQS é mesmo o hom.sigoc.caixa.
O pod de TQS ainda aponta para des.sigoc.caixa no appsettings. Quando a regra sair, eu troco o Sigoc__BaseUrl na library de TQS para https://hom.sigoc.caixa/sigoc-web/rest. Sem isso a regra sozinha não resolve.

Amanhã cedo eu testo o pod de DES de novo. Se continuar sem conexão, a gente revisa a origem das duas regras juntos, porque o IP da rota pode não ser o IP de saída do pod.
