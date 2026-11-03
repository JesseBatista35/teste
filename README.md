
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$
[p585600@caddeapllx2794 ~]$  cd /opt/httpd/conf.d
   diff httpd-sigec.des.conf.bkp_20261007 httpd-sigec.des.conf
   diff httpd-sigecpor2.conf_20261007 httpd-sigecpor2.conf
   cat httpd-sigec.des.conf.bkp_20261007
2,3d1
< <VirtualHost *:80>
<         ServerName  sigec.des.caixa
5d2
<         RequestHeader set X-Forwarded-Proto "https"
7,8c4,6
<         RewriteEngine On
<         RewriteRule ^/$ /gec-web/por/ [R]
---
> <VirtualHost *:80>
>   ServerName  sigec.des.caixa
>   ServerAlias sigec.des.caixa
11,17c9,11
<         RewriteRule ^/gec-web/por$ /gec-web/por/ [R]
<         ProxyPass ^/gec-web/por/ balancer://mycluster_sigec/gec-web/por/ stickysession=JSESSIONID|jsessionid nofailover=On
<         ProxyPassReverse ^/gec-web/por/ balancer://mycluster_sigec/gec-web/por/
<         <Location /balancer-manager>
<                 SetHandler balancer-manager
<                 Require all granted
<         </Location>
---
>   RewriteEngine On
>   RequestHeader set X-Forwarded-Proto "https"
>   RewriteRule ^/$ /gec-web/por/ [R]
21a16
>
2,3d1
< <VirtualHost *:80>
<         ServerName  sigecpor2.des.caixa
5,9c3,5
<         RequestHeader set X-Forwarded-Proto "https"
< #       Redirecionamento permanente para HTTPS
<         RewriteEngine On
<         #RewriteCond %{HTTPS} off
<         #RewriteRule ^(.*)$ https://%{HTTP_HOST}%{REQUEST_URI} [R=301,L]
---
> <VirtualHost *:80>
>   ServerName  sigecpor2.des.caixa
>   ServerAlias sigecpor2.des.caixa
11,12d6
<         #RewriteEngine On
<         RewriteRule ^/$ /gec-web/por/ [R]
14,20c8,10
<         RewriteRule ^/gec-web/por$ /gec-web/por/ [R]
<         ProxyPass ^/gec-web/por/ balancer://mycluster_sigec2/gec-web/por/ stickysession=JSESSIONID|jsessionid nofailover=On
<         ProxyPassReverse ^/gec-web/por/ balancer://mycluster_sigec2/gec-web/por/
<         <Location /balancer-manager>
<                 SetHandler balancer-manager
<                 Require all granted
<         </Location>
---
>   RewriteEngine On
>   RequestHeader set X-Forwarded-Proto "https"
>   RewriteRule ^/$ /gec-web/por/ [R]
# VIP Compartilhado: 10.116.80.1
<VirtualHost *:80>
        ServerName  sigec.des.caixa

        RequestHeader set X-Forwarded-Proto "https"

        RewriteEngine On
        RewriteRule ^/$ /gec-web/por/ [R]


        RewriteRule ^/gec-web/por$ /gec-web/por/ [R]
        ProxyPass ^/gec-web/por/ balancer://mycluster_sigec/gec-web/por/ stickysession=JSESSIONID|jsessionid nofailover=On
        ProxyPassReverse ^/gec-web/por/ balancer://mycluster_sigec/gec-web/por/
        <Location /balancer-manager>
                SetHandler balancer-manager
                Require all granted
        </Location>

        CustomLog /logs/apache2/gec-web/sigec.des.caixa-access.log combined
        ErrorLog /logs/apache2/gec-web/sigec.des.caixa-error.log
</VirtualHost>
[p585600@caddeapllx2794 conf.d]$
[p585600@caddeapllx2794 conf.d]$
[p585600@caddeapllx2794 conf.d]$
