le me respondeu  isso. Tá entregando ao backend na 443. Tem que solicitar a reconfiguração d vip em modo ssloffloading então.

16:51
Exato! SSL Offloading é exatamente o que precisamos — o VIP termina o SSL e repassa HTTP para o backend.

Manda para o Daniel:

Daniel, boa tarde!

Confirmo — o backend está recebendo HTTP puro na porta 443. Solicito a reconfiguração dos dois VIPs para modo SSL Offloading, onde o VIP termina o SSL e repassa HTTP para o backend:

VIP DES: 10.116.181.177:443 → backend 10.116.200.228:443 em HTTP
VIP TQS: 10.116.181.178:443 → backend 10.116.201.150:443 em HTTP
Agradeço!
