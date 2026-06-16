[root@caddeapllx2484 p585600]# cat -n /opt/httpd/conf.d/vhost.conf
     1  <VirtualHost *:80>
     2
     3          ServerName sicmu-intranet-update.esteiras.des.caixa
     4          ServerAlias sicmu-intranet-update.esteiras.des.caixa
     5
     6          ProxyStatus On
     7          ProxyRequests Off
     8          ProxyPreserveHost On
     9          ProxyTimeout 120
    10
    11          RewriteEngine On
    12          RewriteCond "%{HTTP_HOST}"   "!^sicmu-intranet-update\.esteiras\.des\.caixa" [NC]
    13          RewriteCond "%{HTTP_HOST}"   "!^$"
    14          RewriteRule "^/?(.*)"        "http://sicmu-intranet-update.esteiras.des.caixa/$1" [L,R,NE]
    15          RewriteRule ^/$ /sicmu/ [R]
    16
    17          RequestHeader set X-Forwarded-Proto "https"
    18
    19          ProxyPass / ajp://127.0.0.1:8009/
    20          ProxyPassReverse / ajp://127.0.0.1:8009/
    21
    22          <Location "/status">
    23             SetHandler server-status
    24             Require all granted
    25          </Location>
    26
    27          LogLevel INFO
    28          #LogLevel debug
    29          CustomLog /logs/httpd/sicmu-intranet-update.caixa-access.log combined
    30          ErrorLog /logs/httpd/sicmu-intranet-update.caixa-error.log
    31          LogFormat "%h %{X-Forwarded-For}i %{remote}p %l %u %t %>s %D %b \"%r\ ROUTE=\"%{BALANCER_WORKER_ROUTE}e\" JSESSIONID=\"%{JSESSIONID}C\" \"%{Referer}i\" \"%r\"" customformat
    32
    33  VirtualHost *:443>
    34          ServerName sicmu-intranet-update.esteiras.des.caixa
    35          ServerAlias sicmu-intranet-update.esteiras.des.caixa
    36          ProxyStatus On
    37          ProxyRequests Off
    38          ProxyPreserveHost On
    39          ProxyTimeout 120
    40          RewriteEngine On
    41          RewriteRule ^/$ /sicmu/ [R]
    42          RequestHeader set X-Forwarded-Proto "https"
    43          ProxyPass / ajp://127.0.0.1:8009/
    44          ProxyPassReverse / ajp://127.0.0.1:8009/
    45          LogLevel INFO
    46          CustomLog /logs/httpd/sicmu-intranet-update.caixa-access.log combined
    47          ErrorLog /logs/httpd/sicmu-intranet-update.caixa-error.log
    48  </VirtualHost>
    49
    50
[root@caddeapllx2484 p585600]#
