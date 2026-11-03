Apache antigo (sbrdeaprlx052)

O httpd -S não retornou nada. Provavelmente o binário não está no PATH do seu usuário ou o Apache roda de outro diretório:

bash
ps -ef | grep -iE '[h]ttpd|[a]pache' | head -3
ls /opt

Com o caminho do binário (ex.: /opt/httpd/bin/httpd), rode <binário> -S | grep -i sigec e o cat dos vhosts do SIGEC.

Sem precisar de shell, dois testes já dizem muito:

bash
curl -s http://10.116.98.52:6666/mod_cluster-manager | grep -E 'Node|Balancer|Contexts' -A1
curl -sv -o /dev/null -H "Host: sigec.des.caixa" http://10.116.98.52/gec-web/por/ 2>&1 | grep -iE 'JSESSIONID|HTTP/1.1 [0-9]'

Se o antigo, com o Batch fora, devolver 503 para sigec.des.caixa em vez de cair no Online, ele está amarrando o vhost ao balancer. Aí é só copiar o ProxyPass dele.

Correção no caddeapllx2794 (precisa de root)

Restaurar o ProxyPass/ProxyPassReverse dos backups httpd-sigec.des.conf.bkp_20261007 e httpd-sigecpor2.conf_20261007 nos vhosts atuais:

sigec.des.caixa → balancer://mycluster_sigec
sigecpor2.des.caixa → balancer://mycluster_sigec2

Ajuste a sintaxe conforme o Apache antigo, porque o ^ no ProxyPass dos backups é suspeito. Inclua também o /gec-api, se o antigo mapear esse contexto. Depois, httpd -t e reload graceful.

Batch em STARTING

Vale olhar se ele está realmente subindo ou se travou:

bash
$CLI --command='/host=sbrdeapllx104_credito/server-config=sigec-portabilidade-batch_node1_lx104:read-attribute(name=status)'

Repita em alguns minutos. Se continuar em STARTING, olhe o server.log dele no LX104. Pode ser o mesmo padrão de travamento dos timers que já apareceu antes nesse batch.
