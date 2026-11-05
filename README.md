Pablo, fechei o diagnóstico:

DES: do pod, o des.sigoc.caixa resolve (10.116.26.110), mas a porta 443 não abre. É bloqueio de firewall no egress do namespace. A REQ de DES (…849) eu complemento com origem, destino e porta.
TQS: achei que o pod de TQS está com Sigoc:BaseUrl = https://des.sigoc.caixa/sigoc-web/rest no appsettings, ou seja, o TQS está batendo no SIGOC de DES. E a 443 de lá também não abre a partir de TQS.

Pra fechar o TQS preciso de duas coisas:

O host exato do SIGOC TQS que o SIPGC TQS deve consumir.
Alguém trocar o Sigoc:BaseUrl pro host de TQS. Se quiser, eu configuro _ENV.Sigoc__BaseUrl na library de TQS, sem precisar de novo build.

Com o host eu testo a conexão do pod de TQS e ajusto a REQ …859 com o destino certo. Me passa a URL quando puder.
