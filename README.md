Pablo, boa tarde! Fechei o diagnóstico do SIGOC:

DES: do pod, o des.sigoc.caixa resolve (10.116.26.110), mas a porta 443 não abre. É bloqueio de firewall. Já existe um pedido de regra aberto, e vou testar de novo amanhã cedo.

TQS: o pod está com Sigoc:BaseUrl = https://des.sigoc.caixa/sigoc-web/rest no appsettings, ou seja, está batendo no SIGOC de DES, e a 443 de lá também não abre a partir de TQS.

Pra fechar o TQS, me passa o host exato do SIGOC TQS que o SIPGC TQS deve consumir. Com ele eu testo a conexão do pod e peço a regra com o destino certo. Também dá pra eu trocar o Sigoc__BaseUrl na library de TQS, sem precisar de novo build.
