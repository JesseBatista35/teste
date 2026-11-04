Jesse Mouta Pereira Batista, pode dar uma olhada por favor?
 
Cleomar Barros de Oliveira Junior
Jesse Mouta Pereira Batista, pode dar uma olhada por favor?
Flavio de Almeida Gagliardi
 
 
regra esta funcional.
 
Cleomar Barros de Oliveira Junior
Jesse Mouta Pereira Batista, pode dar uma olhada por favor?
Cleomar Barros de Oliveira Junior, Bom dia! vou verificar.
 
Pessoal, bom dia! Segue o retorno após a CHG00017497 (regra 98529):
 
De dentro do pod sipdm-api-estudante-des-266-qlttf, o teste TCP para 10.116.100.127:1433 continua em timeout.

Do mesmo pod, outros destinos internos respondem normalmente (ex.: 10.116.81.74:443 -> OK). Ou seja, o egress IP está funcional e o problema é específico do caminho até o banco.

O egress IP 10.116.221.183 está hospedado no nó ceadecldlx084.nprd.caixa (10.116.208.104).
 
O teste do firewall (ping tcp com source 10.116.221.183) valida o trecho firewall -> banco, mas o tráfego real originado no cluster não completa a conexão.
 
Adriano da Silva Fernandes, consegue fazer uma captura no CNPRDFW001-1 (e nos demais equipamentos do caminho CTC <-> Rio) com filtro host 10.116.221.183 e host 10.116.100.127, enquanto eu repito o teste a partir do pod? 
 
Precisamos ver se o SYN chega ao firewall e se o SYN-ACK de retorno volta pelo mesmo caminho ( a minha suspeita é de rota assimétrica ou de outro equipamento no trajeto).
 
Adriano, pode ajudar a gente por favor
 
qual o problema ??
 
Jesse Mouta Pereira Batista
Pessoal, bom dia! Segue o retorno após a CHG00017497 (regra 98529):   De dentro do pod sipdm-api-estudante-des-266-qlttf, o teste TCP para 10.116.100.127:1433 continua em timeout.  Do mesmo pod, outr…
O Jesse solicitou isso aqui pra vc
 
so um momento 
 
pode testar
 
 
 
a regra esta funcional e o IP esta chegando no servidor
 
Jesse, pode validar pra gente por favor?
 
vou testar agora
 
um momento
 
Adriano da Silva Fernandes, obrigado pela captura!
 
Um ponto importante: nos SYNs sem resposta (linhas 64/65/69/70), a origem é 10.116.208.104, que é o IP do nó ceadecldlx084, e não o egress IP 10.116.221.183 da regra. 
 
Esses SYNs não recebem SYN-ACK. O pod do sipdm-api-estudante está rodando justamente nesse nó ceadecldlx084, que é o mesmo que hospeda o egress IP.
 
Estou pronto para o teste. Assim que você montar a captura (filtro dst host 10.116.100.127 and port 1433), me avisa aqui que eu inicio o teste em loop a partir do pod, com uma tentativa a cada 2 segundos.
 
O que precisamos ver é qual IP de origem aparece nos SYNs durante o teste, 10.116.221.183 ou 10.116.208.104.
 
testa ai
 
 
Consegue confirmar qual IP de origem aparece nos SYNs para 10.116.100.127:1433 nesse período: 10.116.221.183 ou 10.116.208.104? E se há algum SYN-ACK de retorno?
 
esse ip de onde ??
 
10.116.221.183
 
O 10.116.221.183 é o egress IP do namespace sipdm-des no cluster OpenShift NPRD. 
 
Ele fica hospedado no nó ceadecldlx084.nprd.caixa 10.116.208.104 como IP secundário, e é por isso que pedimos a regra com essa origem.
 
O que estranhei na sua captura é que os SYNs para 10.116.100.127:1433 aparecem com origem 10.116.208.104 o IP do próprio nó e não com o egress IP.

 
 
 	10.116.208.104	 AUTO BUSCA ICMP	Alocado automaticamente pelo sistema de busca de IPs	CEPTISP	 	 	 	 	 	 	 	 	 	 	 	 
 
 
verifica essa origem ai 
 
o 10.116.208.104 é o nó ceadecldlx084.nprd.caixa do cluster, É nesse nó que o pod do sipdm-api-estudante está rodando, e também é ele que hospeda o egress IP 10.116.221.183.
 
Então, pela captura, o tráfego do pod está saindo com o IP do nó 10.116.208.104 e não com o egress IP (10.116.221.183), por isso a regra não está sendo usada.
 
Só para confirmar, durante o teste das 15:10, os SYNs para 10.116.100.127:1433 apareceram apenas com origem 10.116.208.104 e sem SYN-ACK de retorno, certo?
 
Jesse, Adriano, podemos entrar aqui para agilizar essas verificações?
 
