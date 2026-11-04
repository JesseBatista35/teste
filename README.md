Cleomar Barros de Oliveira Junior, Adriano da Silva Fernandes, bom dia! Estou em duas salas de ADDR agora e não consigo entrar em chamada, mas consigo seguir por aqui. Acho que resolvemos mais rápido assim.

Resumo de onde estamos:
• A regra 98529 (10.116.221.183 → 10.116.100.127:1433) está funcional no firewall.
• Pela captura do Adriano, os SYNs que chegam ao banco vêm com origem 10.116.208.104 (IP do nó ceadecldlx084), e não com o egress IP 10.116.221.183. Esses SYNs não recebem SYN-ACK.
• O pod do sipdm-api-estudante roda justamente nesse nó, que também hospeda o egress IP. A suspeita é que, por isso, o tráfego esteja saindo com o IP do nó.

Preciso de uma confirmação:
1. Adriano, no teste de ontem às 15:10, os SYNs para 10.116.100.127:1433 apareceram apenas com origem 10.116.208.104 e sem SYN-ACK?

Com essa confirmação, sigo assim:
2. Faço um teste movendo o pod para outro nó do cluster, para confirmar se o problema acontece só quando o pod está no mesmo nó do egress IP. O pod é reiniciado em DES (poucos segundos de indisponibilidade). Posso seguir?
3. Se confirmar, como paliativo podemos liberar também 10.116.208.104 → 10.116.100.127:1433, e eu aciono o time de OpenShift para a correção definitiva do egress.

Assim que sair das salas, executo o teste e retorno aqui.
