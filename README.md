
-sh-4.2$ echo "==COMO APACHE INCLUI CONFIGS==" && \
> cat /opt/jbcs-httpd24-2.4/httpd/conf/httpd.conf | grep -i "include\|sites" &&                                                                                                                           \
> echo "==ARQUIVO SIGPF-INTERNET (sem backend)==" && \
> cat /opt/jbcs-httpd24-2.4/httpd/sites-available/httpd-eap71-des-sigpf-internet                                                                                                                          .conf && \
> echo "==SITES-ENABLED COMPLETO==" && \
> ls -la /opt/jbcs-httpd24-2.4/httpd/sites-enabled/
==COMO APACHE INCLUI CONFIGS==
# we are running.  Comment out this line if you don't mind remote sites
Include conf.modules.d/*.conf
#   Indexes Includes FollowSymLinks SymLinksifOwnerMatch ExecCGI MultiViews
# Possible values include: debug, info, notice, warn, error, crit,
# Includes actual counts of actual bytes received (%I) and sent (%O); this
# "combinedio" includes actual counts of actual bytes received (%I) and sent (%O                                                                                                                          ); this
# Set to "EMail" to also include a mailto: link to the ServerAdmin.
# Note that if you include a trailing / on fakename then the server will
# We include the /icons/ alias for FancyIndexed directory listings.  If you
# and not include in the listing.  Shell-style wildcarding is permitted.
# For files that include their own HTTP headers:
# To parse .shtml files for server-side includes (SSI):
# (You will also need to add "Includes" to the "Options" directive.)
AddOutputFilter INCLUDES .shtml
# includes to substitute the appropriate text.
#   Alias /error/include/ "/your/include/path/"
# /opt/jbcs-httpd24-2.4/httpd/www/error/include/ files and
# copying them to /your/include/path/, even on a per-VirtualHost basis.
<IfModule mod_include.c>
        Options IncludesNoExec
        AddOutputFilter Includes html
# a directory that does not include the trailing slash.  This fixes a
IncludeOptional conf.d/*.conf
==ARQUIVO SIGPF-INTERNET (sem backend)==
# VIP: 10.116.180.22
<VirtualHost *:80>
  ServerName  sigpf-internet.esteiras.des.caixa

   ErrorDocument 503 http://sigpf-internet.esteiras.des.caixa/error

  RequestHeader set X-Forwarded-Proto "https"
  ProxyErrorOverride Off
  ProxyRequests Off
  RewriteEngine On
  RewriteRule ^/$ /sigpf_internet [R]

  ProxyPass   ^/sigpf_internet/ balancer://sigpf-internet/sigpf_internet/  stick                                                                                                                          ysession=JSESSIONID|jsessionid  nofailover=On
  ProxyPassReverse ^/sigpf_internet/ balancer://sigpf-internet/sigpf_internet/

  ProxyPass   ^/$(http_context_additional)/ balancer://sigpf-internet/$(http_con                                                                                                                          text_additional)/  stickysession=JSESSIONID|jsessionid  nofailover=On
  ProxyPassReverse ^/$(http_context_additional)/ balancer://sigpf-internet/$(htt                                                                                                                          p_context_additional)/

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

  CustomLog /logs/apache2/sigpf-internet/sigpf-internet.esteiras.des.caixa-acces                                                                                                                          s.log combined
  ErrorLog /logs/apache2/sigpf-internet/sigpf-internet.esteiras.des.caixa-error.                                                                                                                          log
</VirtualHost>
==SITES-ENABLED COMPLETO==
total 24
drwxr-xr-x  5 apache apache    94 Mai 22 12:08 .
drwxr-xr-x 20 apache apache  4096 Abr 27  2022 ..
drwxr-xr-x  2 apache apache   282 Dez 11  2020 eap_70_esteiraagil
drwxr-xr-x  2 apache apache 16384 Mai 22 12:09 eap_71_esteiraagil
lrwxrwxrwx  1 apache apache    19 Mai 13  2021 esteiraagil -> eap_71_esteiraagil                                                                                                                          /
drwxr-xr-x  2 apache apache    44 Ago  2  2022 websocket
-sh-4.2$ ^C
-sh-4.2$
