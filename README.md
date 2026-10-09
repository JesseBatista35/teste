Oi, Sandra. O Fabio tem razão em dizer que a regra não está funcionando para a aplicação, mas o motivo não é a regra em si. A regra da CRQ foi feita para o IP de saída do projeto (10.116.221.46), e a Redes validou com captura que ela funciona quando o tráfego sai com esse IP. O que está acontecendo é que o OKD não está aplicando esse IP ao tráfego dos pods, que saem com o IP do node.

Por isso, o correto é ajustar o egress do projeto no OKD, e não pedir liberação para todos os nodes. Liberar os nodes abriria o banco para todos os projetos do cluster, o que não é recomendado.
