Pessoal, bom dia! Segue o retorno após a CHG00017497 (regra 98529):

• De dentro do pod sipdm-api-estudante-des-266-qlttf, o teste TCP para 10.116.100.127:1433 continua em timeout.
• Do mesmo pod, outros destinos internos respondem normalmente (ex.: 10.116.81.74:443 → OK). Ou seja, o egress IP está funcional e o problema é específico do caminho até o banco.
• O egress IP 10.116.221.183 está hospedado no nó ceadecldlx084.nprd.caixa (10.116.208.104).

O teste do firewall (ping tcp com source 10.116.221.183) valida o trecho firewall → banco, mas o tráfego real originado no cluster não completa a conexão.

Adriano da Silva Fernandes, consegue fazer uma captura no CNPRDFW001-1 (e nos demais equipamentos do caminho CTC ↔ Rio) com filtro host 10.116.221.183 e host 10.116.100.127, enquanto eu repito o teste a partir do pod? Precisamos ver se o SYN chega ao firewall e se o SYN-ACK de retorno volta pelo mesmo caminho (suspeita de rota assimétrica ou de outro equipamento no trajeto).

Fico à disposição para repetir o teste na hora que for melhor.
