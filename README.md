Tem um segundo ponto: o mod_cluster-manager mostrou só o node do Online registrado nesse Apache. Mesmo depois de restaurar o ProxyPass, sigec.des.caixa vai dar 503 se o Batch não estiver se registrando no 10.116.78.14. Isso é o comportamento correto com nofailover=On, mas então falta ajustar o proxies do modcluster do Batch.

Apache antigo (10.116.82.43)

Lá a config não fica em /opt/httpd/conf.d. Descubra o path primeiro:

bash
ps -ef | grep [h]ttpd | head -3      # mostra o binário e o -f/-d usado
httpd -S 2>/dev/null | grep -i sigec # mostra o arquivo de cada vhost do sigec

Com o path em mãos, rode cat nos vhosts sigec.des.caixa e sigecpor2.des.caixa e no mod_cluster.conf de lá. O que interessa é a sintaxe exata do ProxyPass que funciona.

JBoss (comandos de CLI)

Você rodou de novo no shell do caddeapllx2794. Esses comandos só funcionam dentro do jboss-cli, no DC. Para evitar confusão, dá para rodar tudo de uma vez a partir do root no sbrdeapllx069:

bash
CLI="/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999"
$CLI --command='/server-group=sigec-portabilidade2:read-attribute(name=profile)'
$CLI --command='/profile=full-ha-sigec-portabilidade-batch/subsystem=modcluster:read-resource(recursive=true)'

Depois rode o mesmo read-resource com o perfil que o primeiro comando retornar para o Online. Nos dois resultados, procure:

balancer: o esperado é mycluster_sigec no Batch e mycluster_sigec2 no Online.
proxies / outbound-socket-binding: se o 10.116.78.14:6666 (caddeapllx2794) está na lista do Batch.

Com o vhost do Apache antigo e essas duas saídas, dá para fechar a correção: o ProxyPass exato a restaurar e, se precisar, a inclusão do Apache novo nos proxies do Batch.
