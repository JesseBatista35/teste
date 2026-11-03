[p585600@caddeapllx2794 ~]$ ls /opt/httpd/conf /opt/httpd/conf.d
/opt/httpd/conf:
httpd.conf  httpd.conf_BKP  magic  openssl

/opt/httpd/conf.d:
httpd-sigec-comercial.conf  httpd-sigec-csc.conf  httpd-sigec.des.conf  httpd-sigec.des.conf.bkp_20261007  httpd-sigecpor2.conf  httpd-sigecpor2.conf_20261007  mod_cluster.conf  old
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$ cat /opt/httpd/conf.d/mod_cluster.conf
LoadModule proxy_cluster_module modules/mod_proxy_cluster.so
LoadModule cluster_slotmem_module modules/mod_cluster_slotmem.so
LoadModule manager_module modules/mod_manager.so
LoadModule advertise_module modules/mod_advertise.so

MemManagerFile /var/cache/mod_cluster

Maxhost 200

  LISTEN caddeapllx2794:6666

  ManagerBalancerName mycluster_sigec

<IfModule manager_module>
  <VirtualHost caddeapllx2794:6666>

    ServerName MODCLUSTER.CAIXA
    ServerAlias MODCLUSTER.CAIXA

    EnableMCPMReceive
    ServerAdvertise off

    <Directory />
      Require ip 127.0.0.1 10.116.88.
    </Directory>

    <Location /mod_cluster-manager>
      SetHandler mod_cluster-manager
      Require ip 127.0.0.1  10.116.78. 10.1.10. 10.1.11 10.210.0. 10.116.88.
   </Location>

    ErrorLog "/logs/apache2/sigec/mod_cluster-error.log"
    CustomLog "/logs/apache2/sigec/mod_cluster-access.log" common

  </VirtualHost>
</IfModule>

[p585600@caddeapllx2794 ~]$ cat /opt/httpd/conf.d/httpd-sigec.des.conf /opt/httpd/conf.d/httpd-sigecpor2.conf
# VIP Compartilhado: 10.116.80.1


<VirtualHost *:80>
  ServerName  sigec.des.caixa
  ServerAlias sigec.des.caixa


  RewriteEngine On
  RequestHeader set X-Forwarded-Proto "https"
  RewriteRule ^/$ /gec-web/por/ [R]

        CustomLog /logs/apache2/gec-web/sigec.des.caixa-access.log combined
        ErrorLog /logs/apache2/gec-web/sigec.des.caixa-error.log
</VirtualHost>

# VIP Compartilhado: 10.116.80.1

<VirtualHost *:80>
  ServerName  sigecpor2.des.caixa
  ServerAlias sigecpor2.des.caixa


  RewriteEngine On
  RequestHeader set X-Forwarded-Proto "https"
  RewriteRule ^/$ /gec-web/por/ [R]

        CustomLog /logs/apache2/sigec-portabilidade2/sigecpor2.des.caixa-access.log combined
        ErrorLog /logs/apache2/sigec-portabilidade2/sigecpor2.des.caixa-error.log
</VirtualHost>
[p585600@caddeapllx2794 ~]$ grep -RniE 'ProxyPass|BalancerMember|balancer://|ManagerBalancerName|EnableMCPMReceive|ServerAdvertise|AdvertiseGroup|CreateBalancers|UseAlias|SetHandler' /opt/httpd/conf /opt/httpd/conf.d
/opt/httpd/conf/httpd.conf_BKP:124:ProxyPass /status !
/opt/httpd/conf/httpd.conf_BKP:791:#    SetHandler server-status
/opt/httpd/conf/httpd.conf_BKP:801:#    SetHandler server-info
/opt/httpd/conf/.httpd.conf.20260914150921.p515324:122:ProxyPass /status !
/opt/httpd/conf/.httpd.conf.20260914150921.p515324:772:#    SetHandler server-status
/opt/httpd/conf/.httpd.conf.20260914150921.p515324:782:#    SetHandler server-info
/opt/httpd/conf/httpd.conf:122:ProxyPass /status !
/opt/httpd/conf/httpd.conf:772:#    SetHandler server-status
/opt/httpd/conf/httpd.conf:782:#    SetHandler server-info
/opt/httpd/conf/.httpd.conf.20261007111047.p695115:122:ProxyPass /status !
/opt/httpd/conf/.httpd.conf.20261007111047.p695115:772:#    SetHandler server-status
/opt/httpd/conf/.httpd.conf.20261007111047.p695115:782:#    SetHandler server-info
/opt/httpd/conf.d/old/vhost.conf:12:    ProxyPass / ajp://localhost:8009/
/opt/httpd/conf.d/old/vhost.conf:13:    ProxyPassReverse / ajp://localhost:8009/
/opt/httpd/conf.d/old/vhost.conf:16:           SetHandler server-status
/opt/httpd/conf.d/httpd-sigec-comercial.conf:9:        ProxyPass ^/gec-web/ balancer://sigec-com-des/gec-web/ stickysession=JSESSIONID|jsessionid nofailover=On
/opt/httpd/conf.d/httpd-sigec-comercial.conf:10:        ProxyPassReverse ^/gec-web/ balancer://sigec-com-des/gec-web/
/opt/httpd/conf.d/httpd-sigec-comercial.conf:12:                SetHandler balancer-manager
/opt/httpd/conf.d/httpd-sigec-csc.conf:9:        ProxyPass ^/csc-web/ balancer://sigec-csc-des/csc-web/ stickysession=JSESSIONID|jsessionid nofailover=On
/opt/httpd/conf.d/httpd-sigec-csc.conf:10:        ProxyPassReverse ^/csc-web/ balancer://sigec-csc-des/csc-web/
/opt/httpd/conf.d/httpd-sigec-csc.conf:12:                SetHandler balancer-manager
/opt/httpd/conf.d/.mod_cluster.conf.20261007111031.p695115:12:  ManagerBalancerName mycluster_sigec
/opt/httpd/conf.d/.mod_cluster.conf.20261007111031.p695115:20:    EnableMCPMReceive
/opt/httpd/conf.d/.mod_cluster.conf.20261007111031.p695115:21:    ServerAdvertise off
/opt/httpd/conf.d/.mod_cluster.conf.20261007111031.p695115:28:      SetHandler mod_cluster-manager
/opt/httpd/conf.d/mod_cluster.conf:12:  ManagerBalancerName mycluster_sigec
/opt/httpd/conf.d/mod_cluster.conf:20:    EnableMCPMReceive
/opt/httpd/conf.d/mod_cluster.conf:21:    ServerAdvertise off
/opt/httpd/conf.d/mod_cluster.conf:28:      SetHandler mod_cluster-manager
/opt/httpd/conf.d/.mod_cluster.conf.20261007111008.p695115:12:  ManagerBalancerName mycluster_sigec
/opt/httpd/conf.d/.mod_cluster.conf.20261007111008.p695115:20:    EnableMCPMReceive
/opt/httpd/conf.d/.mod_cluster.conf.20261007111008.p695115:21:    ServerAdvertise off
/opt/httpd/conf.d/.mod_cluster.conf.20261007111008.p695115:28:      SetHandler mod_cluster-manager
/opt/httpd/conf.d/httpd-sigec.des.conf.bkp_20261007:12:        ProxyPass ^/gec-web/por/ balancer://mycluster_sigec/gec-web/por/ stickysession=JSESSIONID|jsessionid nofailover=On
/opt/httpd/conf.d/httpd-sigec.des.conf.bkp_20261007:13:        ProxyPassReverse ^/gec-web/por/ balancer://mycluster_sigec/gec-web/por/
/opt/httpd/conf.d/httpd-sigec.des.conf.bkp_20261007:15:                SetHandler balancer-manager
/opt/httpd/conf.d/.httpd-sigec.des.conf.20261007111019.p695115:12:        ProxyPass ^/gec-web/por/ balancer://mycluster_sigec/gec-web/por/ stickysession=JSESSIONID|jsessionid nofailover=On
/opt/httpd/conf.d/.httpd-sigec.des.conf.20261007111019.p695115:13:        ProxyPassReverse ^/gec-web/por/ balancer://mycluster_sigec/gec-web/por/
/opt/httpd/conf.d/.httpd-sigec.des.conf.20261007111019.p695115:15:                SetHandler balancer-manager
/opt/httpd/conf.d/.httpd-sigec.des.conf.20261007111051.p695115:32:        ProxyPass ^/gec-web/por/ balancer://mycluster_sigec/gec-web/por/ stickysession=JSESSIONID|jsessionid nofailover=On
/opt/httpd/conf.d/.httpd-sigec.des.conf.20261007111051.p695115:33:        ProxyPassReverse ^/gec-web/por/ balancer://mycluster_sigec/gec-web/por/
/opt/httpd/conf.d/.httpd-sigec.des.conf.20261007111051.p695115:35:                SetHandler balancer-manager
/opt/httpd/conf.d/httpd-sigecpor2.conf_20261007:15:        ProxyPass ^/gec-web/por/ balancer://mycluster_sigec2/gec-web/por/ stickysession=JSESSIONID|jsessionid nofailover=On
/opt/httpd/conf.d/httpd-sigecpor2.conf_20261007:16:        ProxyPassReverse ^/gec-web/por/ balancer://mycluster_sigec2/gec-web/por/
/opt/httpd/conf.d/httpd-sigecpor2.conf_20261007:18:                SetHandler balancer-manager
/opt/httpd/conf.d/.httpd-sigecpor2.conf.20261007111037.p695115:15:        ProxyPass ^/gec-web/por/ balancer://mycluster_sigec2/gec-web/por/ stickysession=JSESSIONID|jsessionid nofailover=On
/opt/httpd/conf.d/.httpd-sigecpor2.conf.20261007111037.p695115:16:        ProxyPassReverse ^/gec-web/por/ balancer://mycluster_sigec2/gec-web/por/
/opt/httpd/conf.d/.httpd-sigecpor2.conf.20261007111037.p695115:18:                SetHandler balancer-manager
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$ curl -s http://10.116.78.14:6666/mod_cluster-manager
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html><head>
<title>Mod_cluster Status</title>
</head><body>
<h1>mod_cluster/1.3.20.Final-10</h1><a href="/mod_cluster-manager?nonce=6b0c8feb-bb9c-41da-bf7d-238a6dc9573a&refresh=10">Auto Refresh</a> <a href="/mod_cluster-manager?nonce=6b0c8feb-bb9c-41da-bf7d-238a6dc9573a&Cmd=DUMP&Range=ALL">show DUMP output</a> <a href="/mod_cluster-manager?nonce=6b0c8feb-bb9c-41da-bf7d-238a6dc9573a&Cmd=INFO&Range=ALL">show INFO output</a>
<h1> LBGroup mycluster_sigec2: <a href="/mod_cluster-manager?nonce=6b0c8feb-bb9c-41da-bf7d-238a6dc9573a&Cmd=ENABLE-APP&Range=DOMAIN&Domain=mycluster_sigec2">Enable Nodes</a> <a href="/mod_cluster-manager?nonce=6b0c8feb-bb9c-41da-bf7d-238a6dc9573a&Cmd=DISABLE-APP&Range=DOMAIN&Domain=mycluster_sigec2">Disable Nodes</a> <a href="/mod_cluster-manager?nonce=6b0c8feb-bb9c-41da-bf7d-238a6dc9573a&Cmd=STOP-APP&Range=DOMAIN&Domain=mycluster_sigec2">Stop Nodes</a></h1>
<h1> Node sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104 (ajp://10.116.94.211:8829): </h1>
<a href="/mod_cluster-manager?nonce=6b0c8feb-bb9c-41da-bf7d-238a6dc9573a&Cmd=ENABLE-APP&Range=NODE&JVMRoute=sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104">Enable Contexts</a> <a href="/mod_cluster-manager?nonce=6b0c8feb-bb9c-41da-bf7d-238a6dc9573a&Cmd=DISABLE-APP&Range=NODE&JVMRoute=sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104">Disable Contexts</a> <a href="/mod_cluster-manager?nonce=6b0c8feb-bb9c-41da-bf7d-238a6dc9573a&Cmd=STOP-APP&Range=NODE&JVMRoute=sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104">Stop Contexts</a><br/>
Balancer: mycluster_sigec2,LBGroup: mycluster_sigec2,Flushpackets: Off,Flushwait: 10000,Ping: 10000000,Smax: -1,Ttl: 60000000,Status: OK,Elected: 0,Read: 0,Transferred: 0,Connected: 0,Load: 65
<h2> Virtual Host 1:</h2><h3>Contexts:</h3><pre>/gec-web/por, Status: ENABLED Request: 0 <a href="/mod_cluster-manager?nonce=6b0c8feb-bb9c-41da-bf7d-238a6dc9573a&Cmd=DISABLE-APP&Range=CONTEXT&JVMRoute=sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104&Alias=localhost&Context=/gec-web/por">Disable</a> <a href="/mod_cluster-manager?nonce=6b0c8feb-bb9c-41da-bf7d-238a6dc9573a&Cmd=STOP-APP&Range=CONTEXT&JVMRoute=sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104&Alias=localhost&Context=/gec-web/por">Stop</a>
/gec-api, Status: ENABLED Request: 0 <a href="/mod_cluster-manager?nonce=6b0c8feb-bb9c-41da-bf7d-238a6dc9573a&Cmd=DISABLE-APP&Range=CONTEXT&JVMRoute=sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104&Alias=localhost&Context=/gec-api">Disable</a> <a href="/mod_cluster-manager?nonce=6b0c8feb-bb9c-41da-bf7d-238a6dc9573a&Cmd=STOP-APP&Range=CONTEXT&JVMRoute=sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104&Alias=localhost&Context=/gec-api">Stop</a>
</pre><h3>Aliases:</h3><pre>localhost
default-host
</pre></body></html>
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$ curl -sv -o /dev/null -H "Host: sigec.des.caixa"     http://10.116.78.14/
*   Trying 10.116.78.14:80...
* Connected to 10.116.78.14 (10.116.78.14) port 80 (#0)
> GET / HTTP/1.1
> Host: sigec.des.caixa
> User-Agent: curl/7.76.1
> Accept: */*
>
* Mark bundle as not supporting multiuse
< HTTP/1.1 302 Found
< Date: Tue, 03 Nov 2026 13:18:04 GMT
< Server: Apache/2.4.57 (Red Hat)
< Location: http://sigec.des.caixa/gec-web/por/
< Content-Length: 219
< Content-Type: text/html; charset=iso-8859-1
<
{ [219 bytes data]
* Connection #0 to host 10.116.78.14 left intact
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$ curl -sv -o /dev/null -H "Host: sigecpor2.des.caixa" http://10.116.78.14/
*   Trying 10.116.78.14:80...
* Connected to 10.116.78.14 (10.116.78.14) port 80 (#0)
> GET / HTTP/1.1
> Host: sigecpor2.des.caixa
> User-Agent: curl/7.76.1
> Accept: */*
>
* Mark bundle as not supporting multiuse
< HTTP/1.1 302 Found
< Date: Tue, 03 Nov 2026 13:18:11 GMT
< Server: Apache/2.4.57 (Red Hat)
< Location: http://sigecpor2.des.caixa/gec-web/por/
< Content-Length: 223
< Content-Type: text/html; charset=iso-8859-1
<
{ [223 bytes data]
* Connection #0 to host 10.116.78.14 left intact
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$ ssh 10.116.89.0
The authenticity of host '10.116.89.0 (10.116.89.0)' can't be established.
ED25519 key fingerprint is SHA256:NzkgMlqQ9kvH3F3VTiSAMVbiQFAqKKDdc6E1T45NVUY.
This key is not known by any other names
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '10.116.89.0' (ED25519) to the list of known hosts.
***********************************************************************
(1) - Este e um computador privado de propriedade da Caixa Economica
Federal. Usuarios autorizados e nao autorizados nao possuem direitos de
divulgar as informacoes contidas aqui.
(2) - Ao fazer uso do sistema, o usuario esta ciente que pode estar
sendo monitorado, interceptado e auditado pelo departamento competente
da Caixa Economica Federal.
(3) - O uso nao autorizado ou improprio deste sistema pode resultar em
um processo disciplinar administrativo e/ou punicao atraves de acoes
civis ou criminais. Ao continuar o uso deste sistema, indica que voce
esta ciente e concordando com os termos e condicoes acima descritos.

Pressione <Control+D> IMEDIATAMENTE se voce nao concorda com as
condicoes deste aviso
***********************************************************************
p585600@10.116.89.0's password:
Last login: Thu Oct 22 14:23:09 2026 from 10.116.94.211
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ sudo su
[sudo] password for p585600:
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]# /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999
[domain@10.116.89.0:9999 /] /server-group=sigec-portabilidade-batch:read-attribute(name=profile)
{
    "outcome" => "success",
    "result" => "full-ha-sigec-portabilidade-batch"
}
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /] /server-group=sigec-portabilidade-batch:read-attribute(name=profile)
{
    "outcome" => "success",
    "result" => "full-ha-sigec-portabilidade-batch"
}
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /] /profile=<perfil>/subsystem=modcluster:read-resource(recursive=true)
{
    "outcome" => "failed",
    "failure-description" => "WFLYCTL0216: Management resource '[(\"profile\" => \"<perfil>\")]' not found",
    "rolled-back" => true
}
[domain@10.116.89.0:9999 /] /profile=<perfil>/subsystem=undertow/server=default-server/host=default-host:read-attribute(name=alias)**
'**' is not a valid node type name.
[domain@10.116.89.0:9999 /]



O thaigo heferson fez essa analise ta certo isso?


Realizada análise no Apache caddeapllx2794 (10.116.78.14). Foi identificado que o mod_cluster possui registro ativo do nó sbrdeapllx104.extra.caixa.gov.br (10.116.94.211:8829), associado ao JVMRoute sigec-portabilidade2_node1_lx104 e aos contextos /gec-web/por e /gec-api. Nos logs do mod_cluster foram identificadas mensagens indicando os mesmos contextos registrados simultaneamente nos balancers mycluster_sigec e mycluster_sigec2, sugerindo conflito de roteamento entre clusters. Necessária comparação com os Apaches atualmente ativos no balanceamento para validação dos registros mod_cluster e dos backends anunciados pelos JBoss.
