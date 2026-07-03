<VirtualHost  *:80>
        ServerName __URL_CUSTOMIZADA__

        RewriteEngine On
        RewriteCond %{HTTPS} off
        RewriteRule (.*) https://%{HTTP_HOST}%{REQUEST_URI}
</VirtualHost>
<VirtualHost *:443>
        ServerName __URL_CUSTOMIZADA__

        KeepAlive On
        KeepAliveTimeout 60
        MaxKeepAliveRequests 0
        
        ProxyRequests Off
        ProxyPreserveHost On
        Timeout 300

        
        RequestHeader set X-Forwarded-Proto "https"
        RequestHeader set X-Forwarded-Port "443"
        #RequestHeader set X-Forwarded-Host "__URL_CUSTOMIZADA__"

        
        # SSL Configuration
        SSLEngine on
        SSLProtocol all -SSLv2 -SSLv3
        SSLCipherSuite HIGH:MEDIUM:!aNULL:!MD5:!SEED:!IDEA
        SSLCACertificatePath __APACHE_SSLCACERTIFICATEPATH__
        SSLCertificateFile __APACHE_SSLCACERTIFICATEPATH__/__APACHE_SSLCERTIFICATEFILE__
        SSLCertificateKeyFile __APACHE_SSLCACERTIFICATEPATH__/__APACHE_SSLCERTIFICATEKEYFILE__

        # Headers
        Header always set Strict-Transport-Security "max-age=63072000; includeSubDomains; preload"
        Header always set X-Frame-Options DENY
        Header always set X-Content-Type-Options nosniff
          

        ProxyPass / ajp://localhost:8009/ nocanon
        ProxyPassReverse / ajp://localhost:8009/

        <Location "/status">
            SetHandler server-status
            Require all granted
        </Location>

        LogLevel INFO
        #LogLevel debug
        CustomLog /logs/httpd/__sistema_nome__.caixa-access.log combined
        ErrorLog /logs/httpd/__sistema_nome__.caixa-error.log
      
</VirtualHost>
