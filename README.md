sudo tee /opt/httpd/conf.d/vhost.conf << 'EOF'
<VirtualHost *:80>
        ServerName sicmu-intranet-update.esteiras.des.caixa
        ServerAlias sicmu-intranet-update.esteiras.des.caixa
        ProxyStatus On
        ProxyRequests Off
        ProxyPreserveHost On
        ProxyTimeout 120
        RewriteEngine On
        RewriteCond "%{HTTP_HOST}"   "!^sicmu-intranet-update\.esteiras\.des\.caixa" [NC]
        RewriteCond "%{HTTP_HOST}"   "!^$"
        RewriteRule "^/?(.*)"        "http://sicmu-intranet-update.esteiras.des.caixa/$1" [L,R,NE]
        RewriteRule ^/$ /sicmu/ [R]
        RequestHeader set X-Forwarded-Proto "https"
        ProxyPass / ajp://127.0.0.1:8009/
        ProxyPassReverse / ajp://127.0.0.1:8009/
        <Location "/status">
           SetHandler server-status
           Require all granted
        </Location>
        LogLevel INFO
        CustomLog /logs/httpd/sicmu-intranet-update.caixa-access.log combined
        ErrorLog /logs/httpd/sicmu-intranet-update.caixa-error.log
</VirtualHost>

<VirtualHost *:443>
        ServerName sicmu-intranet-update.esteiras.des.caixa
        ServerAlias sicmu-intranet-update.esteiras.des.caixa
        ProxyStatus On
        ProxyRequests Off
        ProxyPreserveHost On
        ProxyTimeout 120
        RewriteEngine On
        RewriteRule ^/$ /sicmu/ [R]
        RequestHeader set X-Forwarded-Proto "https"
        ProxyPass / ajp://127.0.0.1:8009/
        ProxyPassReverse / ajp://127.0.0.1:8009/
        LogLevel INFO
        CustomLog /logs/httpd/sicmu-intranet-update.caixa-access.log combined
        ErrorLog /logs/httpd/sicmu-intranet-update.caixa-error.log
</VirtualHost>
EOF
