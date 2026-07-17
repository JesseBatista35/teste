


C:\Users\p585600>nslookup ceadecldlx062.nprd.caixa
Servidor:  dfaddssd001.corp.caixa.gov.br
Address:  10.222.149.10

Não é resposta autoritativa:
Nome:    ceadecldlx062.nprd.caixa
Address:  10.116.208.82


C:\Users\p585600>ping -t ceadecldlx062.nprd.caixa

Disparando ceadecldlx062.nprd.caixa [10.116.208.82] com 32 bytes de dados:
Resposta de 10.116.208.82: bytes=32 tempo=5ms TTL=55
Resposta de 10.116.208.82: bytes=32 tempo=5ms TTL=55
Resposta de 10.116.208.82: bytes=32 tempo=5ms TTL=55
Resposta de 10.116.208.82: bytes=32 tempo=5ms TTL=55
Resposta de 10.116.208.82: bytes=32 tempo=5ms TTL=55
Resposta de 10.116.208.82: bytes=32 tempo=5ms TTL=55
Resposta de 10.116.208.82: bytes=32 tempo=5ms TTL=55
Resposta de 10.116.208.82: bytes=32 tempo=5ms TTL=55
Resposta de 10.116.208.82: bytes=32 tempo=5ms TTL=55


-sh-4.2$ oc debug node/ceadecldlx062.nprd.caixa
error: cannot debug ceadecldlx062.nprd.caixa: unable to extract pod template from type *v1.Node
-sh-4.2$ ^C
-sh-4.2$

