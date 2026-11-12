Paulo, Rodrigo, como não conseguimos fazer a reunião hoje, segue o ponto do SIEMP que precisa da decisão de vocês.

O problema: o endereço siemp.des.caixa está com dois IPs no DNS. Por isso o acesso fica intermitente, funcionando para uns e não para outros, ou alternando para a mesma pessoa.

IP	O que é	Resultado do teste
10.116.180.9	VIP novo da esteira (JBoss 7.4)	✅ 200, SIEMP 14.37.0.6 abrindo normalmente
10.116.80.1	VIP antigo (legado)	❌ 404 em /siemp e em /siemp_java, com certificado de outro sistema (siecm)

Na solicitação de DNS, o IP novo foi incluído e o antigo foi mantido. Pelo teste, o antigo já não atende o SIEMP por esse nome.

Opções:

Opção A (recomendada): remover o IP antigo (10.116.80.1). O siemp.des.caixa passa a apontar só para o 7.4, e o acesso fica estável para a validação. Não afeta nenhum acesso que funcione hoje, porque o antigo já retorna 404.
Opção B: remover o IP novo (10.116.180.9). O nome volta para o legado, que hoje já dá 404 por esse endereço. A validação do 7.4 ficaria sem endereço até a virada.

Preciso do ok de vocês para abrir a REQ de DNS. Se for a opção A, abro amanhã cedo e aviso quando estiver resolvido.
