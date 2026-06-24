O DNS já está resolvendo para o novo VIP 10.116.181.177, porém a conexão está sendo resetada. Precisamos confirmar como o VIP está encaminhando o tráfego para o backend 10.116.200.228:443:
O backend está respondendo HTTP puro na porta 443 (sem SSL). O VIP está repassando HTTPS (SSL) ou HTTP para o backend?
Se estiver repassando HTTPS, precisamos mudar para HTTP, pois o Apache do backend não tem SSL — o SSL é terminado no VIP.
