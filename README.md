-sh-4.2$ curl -vk https://sicmu-intranet-update.esteiras.des.caixa/sicmu 2>&1 | head -30
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0* About to connect() to sicmu-intranet-update.esteiras.des.caixa port 443 (#0)
*   Trying 10.116.180.22...
* Connected to sicmu-intranet-update.esteiras.des.caixa (10.116.180.22) port 443 (#0)
* Initializing NSS with certpath: sql:/etc/pki/nssdb
* skipping SSL peer certificate verification
* SSL connection using TLS_RSA_WITH_AES_256_CBC_SHA
* Server certificate:
*       subject: CN=*.esteiras.des.caixa,O=Caixa Economica Federal,C=BR
*       start date: Abr 18 14:57:45 2024 GMT
*       expire date: Abr 18 15:07:45 2029 GMT
*       common name: *.esteiras.des.caixa
*       issuer: CN=AC Icptestes Sub,O=Caixa Economica Federal,C=BR
> GET /sicmu HTTP/1.1
> User-Agent: curl/7.29.0
> Host: sicmu-intranet-update.esteiras.des.caixa
> Accept: */*
>
< HTTP/1.1 403 Forbidden
< Date: Tue, 16 Jun 2026 14:32:37 GMT
< Server: Apache/2.4.29 (Red Hat)
< Last-Modified: Fri, 17 Jan 2020 13:41:12 GMT
< ETag: "10f0-59c5618474e00"
< Accept-Ranges: bytes
< Content-Length: 4336
< Connection: close
< Content-Type: text/html; charset=UTF-8
<
{ [data not shown]
-sh-4.2$
-sh-4.2$
-sh-4.2$ cat /opt/httpd/conf.d/vhost.conf
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
        #LogLevel debug
        CustomLog /logs/httpd/sicmu-intranet-update.caixa-access.log combined
        ErrorLog /logs/httpd/sicmu-intranet-update.caixa-error.log
        LogFormat "%h %{X-Forwarded-For}i %{remote}p %l %u %t %>s %D %b \"%r\ ROUTE=\"%{BALANCER_WORKER_ROUTE}e\" JSESSIONID=\"%{JSESSIONID}C\" \"%{Referer}i\" \"%r\"" customformat

</VirtualHost>-sh-4.2$
