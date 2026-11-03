
-sh-4.2$
-sh-4.2$ grep -niE 'VirtualHost|ServerName|ServerAlias|ProxyPass|balancer://|UseAlias|CreateBalancers|ManagerBalancerName|Listen' <arquivo>
-sh: syntax error near unexpected token `newline'
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ cd /opt/jbcs-httpd24-2.4/httpd
-sh-4.2$ grep -niE 'VirtualHost|ServerName|ServerAlias|ProxyPass|balancer://|UseAlias|CreateBalancers|ManagerBalancerName|Listen|Rewrite' \
>   sites-enabled/eap_des_71/httpd-sigec.conf \
>   sites-enabled/eap_des_71/httpd-sigecpor2.conf
sites-enabled/eap_des_71/httpd-sigec.conf:2:<VirtualHost *:80>
sites-enabled/eap_des_71/httpd-sigec.conf:3:        ServerName  sigec.des.caixa
sites-enabled/eap_des_71/httpd-sigec.conf:7:    RewriteEngine On
sites-enabled/eap_des_71/httpd-sigec.conf:8:        RewriteRule ^/$ /gec-web/por/ [R]
sites-enabled/eap_des_71/httpd-sigec.conf:11:   RewriteRule ^/gec-web/por$ /gec-web/por/ [R]
sites-enabled/eap_des_71/httpd-sigec.conf:12:   ProxyPass ^/gec-web/por/ balancer://mycluster_sigec/gec-web/por/ stickysession=JSESSIONID|jsessionid nofailover=On
sites-enabled/eap_des_71/httpd-sigec.conf:13:        ProxyPassReverse ^/gec-web/por/ balancer://mycluster_sigec/gec-web/por/
sites-enabled/eap_des_71/httpd-sigec.conf:21:</VirtualHost>
sites-enabled/eap_des_71/httpd-sigecpor2.conf:2:<VirtualHost *:80>
sites-enabled/eap_des_71/httpd-sigecpor2.conf:3:        ServerName  sigecpor2.des.caixa
sites-enabled/eap_des_71/httpd-sigecpor2.conf:7:        RewriteEngine On
sites-enabled/eap_des_71/httpd-sigecpor2.conf:8:        #RewriteCond %{HTTPS} off
sites-enabled/eap_des_71/httpd-sigecpor2.conf:9:        #RewriteRule ^(.*)$ https://%{HTTP_HOST}%{REQUEST_URI} [R=301,L]
sites-enabled/eap_des_71/httpd-sigecpor2.conf:11:        #RewriteEngine On
sites-enabled/eap_des_71/httpd-sigecpor2.conf:12:        RewriteRule ^/$ /gec-web/por/ [R]
sites-enabled/eap_des_71/httpd-sigecpor2.conf:14:       RewriteRule ^/gec-web/por$ /gec-web/por/ [R]
sites-enabled/eap_des_71/httpd-sigecpor2.conf:15:       ProxyPass ^/gec-web/por/ balancer://mycluster_sigec2/gec-web/por/ stickysession=JSESSIONID|jsessionid nofailover=On
sites-enabled/eap_des_71/httpd-sigecpor2.conf:16:       ProxyPassReverse ^/gec-web/por/ balancer://mycluster_sigec2/gec-web/por/
sites-enabled/eap_des_71/httpd-sigecpor2.conf:24:</VirtualHost>
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -niE 'Include|sites-enabled|ManagerBalancerName|CreateBalancers|UseAlias|EnableMCPMReceive|Listen' httpd_eap_des_71.conf
1:Listen 10.116.98.52:6666
2:Listen 10.116.98.52:80
3:#Listen 10.116.98.52:443
27:Include /opt/jbcs-httpd24-2.4/httpd/httpd.conf
48:    EnableMCPMReceive
57:IncludeOptional sites-enabled/eap_des_71/*.conf
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
