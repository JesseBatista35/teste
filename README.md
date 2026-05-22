-sh-4.2$ cat /opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_71_esteiraagil/httpd-eap71-des-sigpf-cca-internet.conf
# VIP: 10.116.180.22
<VirtualHost *:80>
  ServerName  sigpf-cca-internet.esteiras.des.caixa

   ErrorDocument 503 http://sigpf-cca-internet.esteiras.des.caixa/error

  RequestHeader set X-Forwarded-Proto "https"
  ProxyErrorOverride Off
  ProxyRequests Off
  RewriteEngine On
  RewriteRule ^/$ /sigpf_internet [R]

  ProxyPass   ^/sigpf_internet/ balancer://sigpf-cca-internet/sigpf_internet/  stickysession=JSESSIONID|jsessionid  nofailover=On
  ProxyPassReverse ^/sigpf_internet/ balancer://sigpf-cca-internet/sigpf_internet/

  ProxyPass   ^/$(http_context_additional)/ balancer://sigpf-cca-internet/$(http_context_additional)/  stickysession=JSESSIONID|jsessionid  nofailover=On
  ProxyPassReverse ^/$(http_context_additional)/ balancer://sigpf-cca-internet/$(http_context_additional)/

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

  CustomLog /logs/apache2/sigpf-cca-internet/sigpf-cca-internet.esteiras.des.caixa-access.log combined
  ErrorLog /logs/apache2/sigpf-cca-internet/sigpf-cca-internet.esteiras.des.caixa-error.log
</VirtualHost>
-sh-4.2$
