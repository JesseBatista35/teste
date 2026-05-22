-sh-4.2$ cat /opt/jbcs-httpd24-2.4/httpd/conf.d/mod_cluster.conf.disabled
# mod_proxy_balancer should be disabled when mod_cluster is used
LoadModule proxy_cluster_module modules/mod_proxy_cluster.so
LoadModule cluster_slotmem_module modules/mod_cluster_slotmem.so
LoadModule manager_module modules/mod_manager.so
LoadModule advertise_module modules/mod_advertise.so

MemManagerFile /opt/jbcs-httpd24-2.4/httpd/cache/mod_cluster

<IfModule manager_module>
  Listen 6666
  <VirtualHost *:6666>
    <Directory />
      Require ip 127.0.0.1
    </Directory>
    ServerAdvertise on
    EnableMCPMReceive
    <Location /mod_cluster_manager>
      SetHandler mod_cluster-manager
      Require ip 127.0.0.1
   </Location>
  </VirtualHost>
</IfModule>
-sh-4.2$ stat /opt/jbcs-httpd24-2.4/httpd/conf.d/mod_cluster.conf.disabled
  File: “/opt/jbcs-httpd24-2.4/httpd/conf.d/mod_cluster.conf.disabled”
  Size: 671             Blocks: 8          IO Block: 4096   arquivo comum
Device: fd03h/64771d    Inode: 35032143    Links: 1
Access: (0644/-rw-r--r--)  Uid: ( 1001/  apache)   Gid: ( 1001/  apache)
Access: 2026-05-22 11:04:54.919101331 -0300
Modify: 2019-12-18 15:41:04.217450695 -0300
Change: 2022-04-26 17:27:44.199276725 -0300
 Birth: -
-sh-4.2$ apachectl --help
-sh: apachectl: comando não encontrado
-sh-4.2$ ps aux
USER        PID %CPU %MEM    VSZ   RSS TTY      STAT START   TIME COMMAND
root          1  0.0  0.0 191284  4144 ?        Ss    2025  76:26 /usr/lib/systemd/systemd --switched-root --system --deserialize 22
root          2  0.0  0.0      0     0 ?        S     2025   0:32 [kthreadd]
root          4  0.0  0.0      0     0 ?        S<    2025   0:00 [kworker/0:0H]
root          6  0.0  0.0      0     0 ?        S     2025   5:12 [ksoftirqd/0]
root          7  0.0  0.0      0     0 ?        S     2025   0:19 [migration/0]
root          8  0.0  0.0      0     0 ?        S     2025   0:00 [rcu_bh]
root          9  0.0  0.0      0     0 ?        S     2025 131:09 [rcu_sched]
root         10  0.0  0.0      0     0 ?        S<    2025   0:00 [lru-add-drain]
root         11  0.0  0.0      0     0 ?        S     2025   1:15 [watchdog/0]
root         12  0.0  0.0      0     0 ?        S     2025   1:01 [watchdog/1]
root         13  0.0  0.0      0     0 ?        S     2025   0:19 [migration/1]
root         14  0.0  0.0      0     0 ?        S     2025   5:04 [ksoftirqd/1]
root         16  0.0  0.0      0     0 ?        S<    2025   0:00 [kworker/1:0H]
root         17  0.0  0.0      0     0 ?        S     2025   0:58 [watchdog/2]
root         18  0.0  0.0      0     0 ?        S     2025   0:19 [migration/2]
root         19  0.0  0.0      0     0 ?        S     2025   5:12 [ksoftirqd/2]





[root@caddeapllx135 sites-available]# cat ./httpd-sisou-des-websocket.conf
Listen 10.116.223.231:80
<VirtualHost 10.116.223.231:80>

        ServerName sisou.esteiras.des.caixa
        RedirectMatch ^/$ /sisou-web/


# SISOU-WEB #

        RedirectMatch ^/sisou-web$ /sisou-web/
        ProxyPass /sisou-web/ balancer://httpsisou/sisou-web/
        ProxyPassReverse /sisou-web/ balancer://httpsisou/sisou-web/

        Header add Set-Cookie "ROUTESISOU-WEB=.%{BALANCER_WORKER_ROUTE}e; path=/sisou-web/" env=BALANCER_ROUTE_CHANGED
        <Proxy balancer://httpsisou>
                BalancerMember http://10.116.193.208:8080 retry=180 connectiontimeout=1000ms ping=500ms
                ProxySet stickysession=ROUTESISOU-WEB
        </Proxy>

# WEBSOCKET #

        <Proxy balancer://wscluster>
            BalancerMember ws://10.116.193.208:8080 route=node1
            ProxySet stickysession=JSESSIONID|jsessionid
        </Proxy>

        <Proxy balancer://httpcluster>
            BalancerMember http://10.116.193.208:8080 route=node1
            ProxySet stickysession=JSESSIONID|jsessionid
        </Proxy>

        RewriteEngine On
        RewriteCond %{HTTP:Connection} upgrade [NC]
        RewriteCond %{HTTP:Upgrade} websocket [NC]
        RewriteRule /sisou-api(.*) balancer://wscluster/sisou-api$1 [P,L]

        ProxyPass /sisou-api balancer://httpcluster/sisou-api
        ProxyPassReverse /sisou-api balancer://httpcluster/sisou-api

        CustomLog /logs/apache2/sisou/sisou.esteiras.des.websocket.caixa-access.log combined
        ErrorLog /logs/apache2/sisou/sisou.esteiras.des.websocket.caixa-error.log

</VirtualHost>
[root@caddeapllx135 sites-available]# cat httpd-eap71-des-sisou-intranet.conf
# VIP: 10.116.180.22
<VirtualHost *:80>
  ServerName  sisou-intranet.esteiras.des.caixa

   ErrorDocument 503 http://sisou-intranet.esteiras.des.caixa/error

  ProxyErrorOverride Off
  ProxyRequests Off
  RewriteEngine On
  RewriteRule ^/$ /sisou-web [R]

  ProxyPass   ^/sisou-web/ balancer://sisou-intranet/sisou-web/  stickysession=JSESSIONID|jsessionid  nofailover=On
  ProxyPassReverse ^/sisou-web/ balancer://sisou-intranet/sisou-web/

  <Location /balancer-manager>
          SetHandler balancer-manager
          Require all granted
  </Location>

   <Location /errors>
     Require all granted
     Options All MultiViews
  </Location>

  <Location /styles>
     Require all granted
     Options All MultiViews
  </Location>

  <Location /scripts>
     Require all granted
     Options All MultiViews
 </Location>

  <Location /fonts>
     Require all granted
     Options All MultiViews
 </Location>

  <Location /images>
     Require all granted
     Options All MultiViews
 </Location>

  CustomLog /logs/apache2/sisou-intranet/sisou-intranet.esteiras.des.caixa-access.log combined
  ErrorLog /logs/apache2/sisou-intranet/sisou-intranet.esteiras.des.caixa-error.log
</VirtualHost>
[root@caddeapllx135 sites-available]# cat httpd-eap71-des-sigpf-internet.conf
# VIP: 10.116.180.22
<VirtualHost *:80>
  ServerName  sigpf-internet.esteiras.des.caixa

   ErrorDocument 503 http://sigpf-internet.esteiras.des.caixa/error

  RequestHeader set X-Forwarded-Proto "https"
  ProxyErrorOverride Off
  ProxyRequests Off
  RewriteEngine On
  RewriteRule ^/$ /sigpf_internet [R]

  ProxyPass   ^/sigpf_internet/ balancer://sigpf-internet/sigpf_internet/  stickysession=JSESSIONID|jsessionid  nofailover=On
  ProxyPassReverse ^/sigpf_internet/ balancer://sigpf-internet/sigpf_internet/

  ProxyPass   ^/$(http_context_additional)/ balancer://sigpf-internet/$(http_context_additional)/  stickysession=JSESSIONID|jsessionid                             nofailover=On
  ProxyPassReverse ^/$(http_context_additional)/ balancer://sigpf-internet/$(http_context_additional)/

  <Location /balancer-manager>
          SetHandler balancer-manager
          Require all granted
  </Location>

   <Location /errors>
     Require all granted
     Options All MultiViews
  </Location>

  <Location /styles>
     Require all granted
     Options All MultiViews
  </Location>

  <Location /scripts>
     Require all granted
     Options All MultiViews
 </Location>

  <Location /fonts>
     Require all granted
     Options All MultiViews
 </Location>

  <Location /images>
     Require all granted
     Options All MultiViews
 </Location>

  CustomLog /logs/apache2/sigpf-internet/sigpf-internet.esteiras.des.caixa-access.log combined
  ErrorLog /logs/apache2/sigpf-internet/sigpf-internet.esteiras.des.caixa-error.log
</VirtualHost>
[root@caddeapllx135 sites-available]#
