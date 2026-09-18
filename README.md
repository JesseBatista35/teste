
[root@sbrdeaprlx0001 p585600]# md5sum /etc/httpd/sites-avaliable/httpd-sicem-legado.conf
269beee199a4bbb0939e97d4c336e0ce  /etc/httpd/sites-avaliable/httpd-sicem-legado.conf
You have mail in /var/mail/root
[root@sbrdeaprlx0001 p585600]#
[root@sbrdeaprlx0001 p585600]#
[root@sbrdeaprlx0001 p585600]# cat /etc/httpd/sites-avaliable/httpd-sicem-legado.conf
# VIP Compartilhado: 10.116.80.21
<VirtualHost *:80>
        ServerName  sicem-legado.des.caixa

        Header always unset Content-Security-Policy
        Header always set   Content-Security-Policy "frame-ancestors https://sicem-legado.des.caixa"

        RewriteEngine On
        RewriteRule ^/$ /sicem [R]

        RewriteRule ^/sicem$ /sicem/ [R]
        ProxyPass ^/sicem/ balancer://sicem-des/sicem/ stickysession=JSESSIONID|jsessionid nofailover=On
        ProxyPassReverse ^/sicem/ balancer://sicem-des/sicem/
        <Location /balancer-manager>
                SetHandler balancer-manager
                Order deny,allow
                Allow from 10.0.0.0
        </Location>

        CustomLog /logs/apache2/SICEM/sicem-legado.des.caixa-access.log combined
        ErrorLog /logs/apache2/SICEM/sicem-legado.des.caixa-error.log
</VirtualHost>
[root@sbrdeaprlx0001 p585600]#



[root@sbrdeaprlx0002 apache2]#
[root@sbrdeaprlx0002 apache2]#
[root@sbrdeaprlx0002 apache2]# md5sum /etc/httpd/sites-avaliable/httpd-sicem-legado.conf
b61be39f00a87a6ab158f449b3301672  /etc/httpd/sites-avaliable/httpd-sicem-legado.conf
[root@sbrdeaprlx0002 apache2]# cat /etc/httpd/sites-avaliable/httpd-sicem-legado.conf
# VIP Compartilhado: 10.116.80.21
<VirtualHost *:80>
        ServerName  sicem-legado.des.caixa

        Header always unset Content-Security-Policy
        Header always set   Content-Security-Policy "frame-ancestors https://sicem-legado.des.caixa"

        RewriteEngine On
        RewriteRule ^/$ /sicem [R]

        RewriteRule ^/sicem$ /sicem/ [R]
        ProxyPass ^/sicem/ balancer://sicem-des/sicem/ stickysession=JSESSIONID|jsessionid nofailover=On
        ProxyPassReverse ^/sicem/ balancer://sicem-des/sicem/
        <Location /balancer-manager>
                SetHandler balancer-manager
                Order deny,allow
                Allow from 10.0.0.0
        </Location>

        CustomLog /logs/apache2/SICEM/sicem-legado.des.caixa-access.log combined
        ErrorLog /logs/apache2/SICEM/sicem-legado.des.caixa-error.log
</VirtualHost>
[root@sbrdeaprlx0002 apache2]#
