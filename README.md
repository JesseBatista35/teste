1. Pegue os valores dos servidores primeiro

Em Hostname e IP → Relatório de IP’s, pesquise 10.116.97.116. Anote o que aparecer em Site, Unidade, Vertical, Ambiente, Categoria e Rede. Esses valores vão ser repetidos nos 6 pedidos. Repita para o 10.116.97.117; provavelmente é tudo igual.

2. Preencha um pedido por IP
Campo	O que colocar
Hostname (se pedir)	cbrdeapllx483 (IPs do .116) ou cbrdeapllx485 (IPs do .117)
NAT / VIP	desmarcado
Site	igual ao do relatório (Brasília)
Unidade	igual ao do relatório
Vertical	igual ao do relatório
Ambiente	igual ao do relatório (DES)
Categoria	igual ao do relatório
Rede/IP	10.116.96.0/23
Descrição	uma da lista abaixo
3. As 6 descrições
#	Servidor	Descrição
1	cbrdeapllx483	IP secundario cbrdeapllx483 (10.116.97.116) - JBoss EAP 7.4 domain TQS (DC+HC) - WO0000081869857
2	cbrdeapllx483	IP secundario cbrdeapllx483 (10.116.97.116) - JBoss EAP 7.4 domain PRE (DC+HC) - WO0000081869857
3	cbrdeapllx483	IP secundario cbrdeapllx483 (10.116.97.116) - JBoss EAP 7.4 domain REL (DC+HC) - WO0000081869857
4	cbrdeapllx485	IP secundario cbrdeapllx485 (10.116.97.117) - JBoss EAP 7.4 domain TQS (HC) - WO0000081869857
5	cbrdeapllx485	IP secundario cbrdeapllx485 (10.116.97.117) - JBoss EAP 7.4 domain PRE (HC) - WO0000081869857
6	cbrdeapllx485	IP secundario cbrdeapllx485 (10.116.97.117) - JBoss EAP 7.4 domain REL (HC) - WO0000081869857
4. Anote o retorno

À medida que cada IP sair, anote ao lado do número da tabela (ex.: 1 → 10.116.96.xx). Essa lista vai virar o mapa dos scripts e units.

Abra agora o “Solicitar somente IP” e me mande um print da tela. Esse formulário pode ter campos diferentes do “Hostname e IP” que você mostrou antes; com o print, eu te digo campo a campo o que escolher em cada dropdown.
