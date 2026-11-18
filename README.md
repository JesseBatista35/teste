O IP a observar no monitoramento é o do servidor Control-M:

cxextrlx038 (BR DES - Negocial): 10.192.224.54. É essa a origem que precisa aparecer chegando na porta 7016.

Para referência, o IP do agente é:

caddeapllx2501: 10.116.200.250, o destino, porta 7016.

Para filtrar só o que importa:

bash
watch -n1 "ss -tn '( sport = :7016 )' | grep -E '10.192.224.54|State'"
