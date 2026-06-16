sudo tee -a /opt/httpd/conf.d/vhost.conf << 'EOF'

<VirtualHost *:443>
        ServerName sicmu-intranet-update.esteiras.des.caixa
        ServerAlias sicmu-intranet-update.esteiras.des.caixa
        SSLEngine on
        SSLProtocol all -SSLv2 -SSLv3
        SSLCertificateFile /opt/httpd/conf/openssl/pki/tls/certs/localhost.crt
        SSLCertificateKeyFile /opt/httpd/conf/openssl/pki/tls/private/localhost.key
        ProxyStatus On
        ProxyRequests Off
        ProxyPreserveHost On
        ProxyTimeout 120
        RewriteEngine On
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
EOF
