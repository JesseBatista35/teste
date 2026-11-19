1. Para os aprovadores (Flávio e Rafael)

Bom dia, Flávio e Rafael! Poderiam aprovar a solicitação de regra de firewall ID 99038?

Origem: 10.116.222.85 (egress IP do namespace sipgc-des, no OKD NPRD)
Destino: des.sigoc.caixa (10.116.26.110)
Protocolo/porta: TCP/443
Objetivo: o SIPGC (Api de Informações), em DES, consumir a API REST do SIGOC.

Já existia uma regra para esse fluxo (pedido 98711, regra 1033850), mas ela foi criada com origem 10.116.180.64, que é o IP da rota (ingress) do cluster, e não o IP de saída dos pods. Por isso a CETEL validou o tráfego com essa origem, mas do pod a conexão na 443 continua sem estabelecer. Confirmei o IP de saída correto no netnamespace do cluster.

Esta solicitação corrige a origem. A regra antiga pode permanecer.

2. Para o Flávio, se você quiser um pedido direto e curto

Flávio, bom dia! Preciso da sua aprovação na solicitação de firewall ID 99038 (SIPGC DES → SIGOC DES, TCP/443). A regra anterior saiu com o IP da rota e não com o IP de saída dos pods, então não resolveu. A nova usa o egress IP correto do namespace (10.116.222.85). Sem ela o time do SIPGC segue travado nos testes com o SIGOC.

3. Para a sala (Pablo e Livia)

Pessoal, atualização sobre o acesso ao SIGOC:

O que aconteceu
A regra de DES (pedido 98711) foi aplicada pela CETEL, mas com origem 10.116.180.64, que é o IP da rota (ingress) do cluster. Os pods não saem por esse IP. Eu confirmei isso no cluster: o namespace sipgc-des sai pelo egress IP 10.116.222.85, e o sipgc-tqs por 10.116.222.238.

Por isso o João (CETEL) testou no firewall com a origem 10.116.180.64 e deu “allow”, mas do pod a conexão na 443 continua sem estabelecer. Testei de dentro do pod hoje, 19/11, às 09:26, e deu sem conexão.

O que eu fiz
Abri uma solicitação nova de firewall, ID 99038, só para DES, com a origem correta:
10.116.222.85 → des.sigoc.caixa (10.116.26.110), TCP/443
Ela está em aprovação do Flávio e do Rafael. Pedimos que não abram novos pedidos para esse fluxo, para não duplicar. Quando for aplicada, eu aviso aqui e testo do pod.

Sobre o TQS (Pablo, preciso de uma resposta)

O pod de TQS hoje aponta para des.sigoc.caixa no appsettings (Sigoc:BaseUrl). Qual deve ser o SIGOC de TQS: o hom.sigoc.caixa (10.123.20.225)?
Ao simular o pedido, o formulário bloqueou esse destino: ele está numa faixa classificada como Produção / Corporativo / Intranet (regra de negócio 3549), e a origem é Não Produção. Fluxo de não produção para produção exige PTR, justificativa e aprovação do Gerente ou Superintendente Nacional. Existe outro endereço do SIGOC em rede de não produção para o TQS?
Se hom.sigoc.caixa for a única opção, eu abro a solicitação de TQS à parte, para não segurar a de DES.

Quando a regra de DES sair, eu aviso aqui.

Ao testar depois da aprovação, use o comando do pod que já usamos, com des.sigoc.caixa. Me mande a resposta do Pablo sobre o TQS que eu preparo a justificativa para esse pedido.
