Confirme o hosts e teste a porta sem o nc:

grep -iE "cxextrlx038|crjdeaprlx03" /etc/hosts

timeout 5 bash -c '</dev/tcp/10.192.224.54/7015' && echo "7015 ABERTA" || echo "7015 FECHADA/BLOQUEADA"

Se preferir, use o curl:

curl -v --connect-timeout 5 telnet://10.192.224.54:7015

No curl, “Connected to” significa porta aberta. Timeout é firewall. “Connection refused” quer dizer que a rede chega, mas não há nada escutando nessa porta no servidor.

Aproveite e veja quem é o dono do agente e o que ele está usando hoje:

ps -ef | grep -E "p_ctmag|p_ctmat" | grep -v grep

Com esses resultados:

Porta aberta e /etc/hosts com cxextrlx038: confirme no repositório que o etc/hosts-des tem a mesma linha (10.192.224.54 cxextrlx038) e sem as do crjdeaprlx. Depois rode a release EC DES.
Timeout: registre a regra de 10.116.200.250 para 10.192.224.54 na porta 7015, e de 10.192.224.54 para 10.116.200.250 na porta 7016, vinculada à REQ. Só depois rode a release.

Cola aqui a saída dos três comandos.
