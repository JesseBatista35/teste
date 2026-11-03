Bom dia, Cavaco, tudo bem?

Estou tratando a WO0000082132530, do redirecionamento cruzado entre Online e Batch do SIGEC Portabilidade em DES. A causa está no Apache novo caddeapllx2794 (10.116.78.14), que hoje está em “down” no service group da VIP 10.116.80.1 desde 28/10, quando o Murilo pediu à CETEL para balancear só nos Apaches antigos (sbrdeaprlx052 e sbrdeaprlx053).

Vi que em 07/10 saíram as linhas de ProxyPass dos vhosts sigec.des.caixa (balancer://mycluster_sigec, Batch) e sigecpor2.des.caixa (balancer://mycluster_sigec2, Online). Sem elas, o mod_cluster entrega /gec-web/por para qualquer node, porque Batch e Online registram o mesmo contexto. O log do mod_cluster acusa isso (“context /gec-web/por is in balancer mycluster_sigec and mycluster_sigec2”). Testando direto no IP, o sigec.des.caixa cai no node sigec-portabilidade2 (Online).

Nos Apaches antigos essas linhas existem, iguais aos backups httpd-sigec.des.conf.bkp_20261007 e httpd-sigecpor2.conf_20261007, que estão no próprio caddeapllx2794.

A remoção teve algum motivo específico? Se não houver impedimento, minha proposta é:

restaurar esses dois backups, guardando a versão atual;
validar pelo IP;
pedir à CETEL para voltar o 10.116.78.14 para “up” na VIP 10.116.80.1.

Pode ser?
