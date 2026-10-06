ip neigh show dev ens224          # esperado: 10.188.0.14 FAILED/INCOMPLETE
arping -c3 -I ens224 10.188.0.14  # esperado: 0 respostas
