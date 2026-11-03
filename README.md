
[p585600@cbrdeapllx476 ~]$ sudo cat /opt/httpd/conf.d/httpd-sifec1.conf
<VirtualHost *:80>

    ServerName migracaosifec.des.caixa

    ProxyPreserveHost On

    RequestHeader set X-Forwarded-Proto "https"
    RequestHeader set X-Forwarded-Port "443"
    RequestHeader set X-Forwarded-Host "migracaosifec.des.caixa"

    RewriteEngine On
    RewriteRule ^/$ /fec-web [R]
    RewriteRule ^/fec-web$ /fec-web/ [R]

    ProxyPass        ^/fec-web/ balancer://mod_cluster_sifec/fec-web/ stickysession=JSESSIONID|jsessionid nofailover=On
    ProxyPassReverse ^/fec-web/ balancer://mod_cluster_sifec/fec-web/

    CustomLog /logs/apache2/SIFEC-INTRANET/sifec1.des.caixa-access.log combined
    ErrorLog /logs/apache2/SIFEC-INTRANET/sifec1.des.caixa-error.log

</VirtualHost>
[p585600@cbrdeapllx476 ~]$
