Dados das duas solicitações (um pedido por ambiente)

	DES	TQS
Origem	10.116.222.85 (egress IP do namespace sipgc-des)	10.116.222.238 (egress IP do namespace sipgc-tqs)
Destino	des.sigoc.caixa (10.116.26.110)	hom.sigoc.caixa (10.123.20.225)
Protocolo/porta	TCP/443	TCP/443

Justificativa (vale para os dois)

Liberação de comunicação de saída do SIPGC (Api de Informações) para o SIGOC. O tráfego de saída dos pods sai pelo egress IP do namespace (OpenShift SDN, confirmado no netnamespace). A regra anterior de DES (pedido 98711 / regra 1033850) foi criada com origem 10.116.180.64, que é o IP da rota (ingress) e não o de saída dos pods; por isso os testes no firewall passam, mas do pod a conexão na 443 não estabelece. Teste do pod em 19/11/2026 às 09:26 (UTC-3): sem conexão.

Mensagem para a sala (Pablo, Livia)

Pessoal, achamos a causa: a regra de DES foi pedida com o IP da rota (10.116.180.64), mas os pods saem pelo egress IP do namespace: DES é 10.116.222.85 e TQS é 10.116.222.238. Eu vou abrir as solicitações novas de firewall, de DES e de TQS, com os IPs certos. Por favor, não abram novos pedidos para o mesmo fluxo, pra não duplicar. Avisamos aqui quando as regras forem aplicadas, e aí vocês testam.

Em TQS também preciso trocar o Sigoc:BaseUrl para https://hom.sigoc.caixa/sigoc-web/rest, e eu faço isso na library quando a regra estiver pronta. Confirmem só se hom.sigoc.caixa é mesmo o SIGOC de TQS.

Mensagem curta para o João (CETEL)

João, obrigado pelos testes. Achamos a causa: o namespace sipgc-des sai pelo egress IP 10.116.222.85, e a regra 1033850 libera só o IP da rota (10.116.180.64). Vamos abrir uma solicitação nova com a origem correta, para DES e TQS. A regra antiga pode ficar como está.

Os pedidos precisam do aval do Flávio, como nos outros de firewall que você abriu. Quando a CETEL aplicar a regra de DES, rode o teste do pod (o comando da mensagem anterior) e depois avise o Pablo.
