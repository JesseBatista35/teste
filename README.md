<VirtualHost *:80>

        ServerName __URL_CUSTOMIZADA__
        ServerAlias __URL_ALIAS__

	ProxyStatus On
        ProxyRequests Off
        ProxyPreserveHost On
        ProxyTimeout 120	

        RewriteEngine On
        RewriteCond "%{HTTP_HOST}"   "!^__URL_REWRITE__" [NC]
        RewriteCond "%{HTTP_HOST}"   "!^$"
        RewriteRule "^/?(.*)"        "http://__URL_REDIRECT__/$1" [L,R,NE]
        RewriteRule ^/$ /__http_context_default__/ [R]

        RequestHeader set X-Forwarded-Proto "https"

        ProxyPass / ajp://127.0.0.1:8009/
        ProxyPassReverse / ajp://127.0.0.1:8009/

        <Location "/status">
           SetHandler server-status
           Require all granted
        </Location>

        LogLevel INFO
        #LogLevel debug
        CustomLog /logs/httpd/__sistema_nome__.caixa-access.log combined
        ErrorLog /logs/httpd/__sistema_nome__.caixa-error.log
        LogFormat "%h %{X-Forwarded-For}i %{remote}p %l %u %t %>s %D %b \"%r\ ROUTE=\"%{BALANCER_WORKER_ROUTE}e\" JSESSIONID=\"%{JSESSIONID}C\" \"%{Referer}i\" \"%r\"" customformat

</VirtualHost>
