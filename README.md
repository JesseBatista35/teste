Boa tarde,

Sobre a orientação de abertura de regra em https://regras.cetad.caixa para acesso ao GitHub: identificamos um ponto que precisa ser esclarecido antes da solicitação.

O IP da máquina do empregado é dinâmico (atribuído via DHCP). Se a regra de firewall for baseada no IP de origem da máquina, ela deixará de funcionar assim que o IP for renovado, o que não resolve o problema de forma definitiva.

Solicitamos confirmar:

A regra pode ser criada por domínio/FQDN de destino (github.com, githubassets.com, cdn.mcas.ms), em vez de IP de origem? Essa seria a solução mais adequada para o caso.
Caso a regra só possa ser baseada em IP de origem, é possível a infra local providenciar uma reserva de IP fixo para essa máquina via MAC address no DHCP, para viabilizar a abertura da regra?
