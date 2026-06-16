sudo sed -i '/^$/,/^<\/VirtualHost>$/{ /^<VirtualHost \*:443>/,/^<\/VirtualHost>$/d }' /opt/httpd/conf.d/vhost.conf




sudo vi /opt/httpd/conf.d/vhost.conf


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


