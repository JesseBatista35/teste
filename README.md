Roteiro de verificação

Apache novo (caddeapllx2794)
bash
   httpd -S                                   # mapa de vhosts / ServerName / ServerAlias
   httpd -M | grep -Ei 'cluster|jk|proxy'     # quais módulos estão carregados
   grep -RniE 'ProxyPass|BalancerMember|balancer://|JkMount|ManagerBalancerName|EnableMCPMReceive|ServerAdvertise|AdvertiseGroup' /etc/httpd/conf /etc/httpd/conf.d

Se houver mod_cluster, abra o /mod_cluster-manager (local ou pelo vhost de gerência). Ele mostra se os nodes do Batch e do Online aparecem no mesmo balancer e com quais contextos e aliases.

Comparar com um dos Apaches antigos. Rode os mesmos comandos e faça um diff dos arquivos do SIGEC. A correção é deixar o novo igual ao que funciona.
Lado JBoss (DC sbrdeapllx069, porta 9999)
   /server-group=sigec-portabilidade-batch:read-attribute(name=profile)
   /server-group=sigec-portabilidade2:read-attribute(name=profile)
   /profile=<perfil>/subsystem=modcluster:read-resource(recursive=true)
   /profile=<perfil>/subsystem=undertow/server=default-server/host=default-host:read-attribute(name=alias)

Confira o balancer, o advertise, os proxies e os aliases. Se os dois perfis tiverem o mesmo balancer e o mesmo alias, está confirmado.

Testar sem tirar o Apache do “down” na VIP, batendo direto no IP:
bash
   curl -vk --resolve sigec.des.caixa:443:10.116.78.14 https://sigec.des.caixa/<contexto>/

Faça o mesmo para a URL do Batch. O sufixo do JSESSIONID (jvmRoute) ou o Location do


