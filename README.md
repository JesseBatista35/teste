Você está conectado nos dois servidores. Agora o BNDES:

1. No 473, deixe o log aberto:

bash
tail -f $LOG | grep -aiE "bndes|WFLYSRV00(10|21)|WFLYCTL0013|WFLYCTL0412|WELD-0014|ERROR|Contexto web registrado"

2. No CLI do 471:

/server-group=sifec-intranet/deployment=SIFEC-BNDES-ONLINE:add(enabled=true)

Me mande a saída do CLI e o que aparecer no log.
