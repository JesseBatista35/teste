[p585600@caddeapllx2835 ~]$ curl -sv  -H "Host: sibdo-web.esteiras.des.caixa" http://localhost/  -o /dev/null
curl -svL --max-redirs 5 http://localhost/ -o /dev/null      # confirma se é loop
curl -skv https://localhost/ -o /dev/null                    # Apache na 443
curl -skv -H "Host: sibdo-web.esteiras.des.caixa" https://localhost/sibdo/ -o /dev/null
grep -RniE 'ServerName|VirtualHost|Redirect|RewriteRule|ProxyPass' /opt/httpd/conf* 2>/dev/null
*   Trying ::1:80...
* Connected to localhost (::1) port 80 (#0)
> GET / HTTP/1.1
> Host: sibdo-web.esteiras.des.caixa
> User-Agent: curl/7.76.1
> Accept: */*
>
* Mark bundle as not supporting multiuse
< HTTP/1.1 302 Found
< Date: Fri, 06 Nov 2026 17:41:01 GMT
< Server: Apache
< Location: http://sibdo-web.esteiras.des.caixa/
< Content-Length: 220
< Content-Type: text/html; charset=iso-8859-1
<
{ [220 bytes data]
* Connection #0 to host localhost left intact
*   Trying ::1:80...
* Connected to localhost (::1) port 80 (#0)
> GET / HTTP/1.1
> Host: localhost
> User-Agent: curl/7.76.1
> Accept: */*
>
* Mark bundle as not supporting multiuse
< HTTP/1.1 302 Found
< Date: Fri, 06 Nov 2026 17:41:01 GMT
< Server: Apache
< Location: http://localhost/
< Content-Length: 201
< Content-Type: text/html; charset=iso-8859-1
<
* Ignoring the response-body
{ [201 bytes data]
* Connection #0 to host localhost left intact
* Issue another request to this URL: 'http://localhost/'
* Found bundle for host localhost: 0x55d3c0fde2f0 [serially]
* Can not multiplex, even if we wanted to!
* Re-using existing connection! (#0) with host localhost
* Connected to localhost (::1) port 80 (#0)
> GET / HTTP/1.1
> Host: localhost
> User-Agent: curl/7.76.1
> Accept: */*
>
* Mark bundle as not supporting multiuse
< HTTP/1.1 302 Found
< Date: Fri, 06 Nov 2026 17:41:01 GMT
< Server: Apache
< Location: http://localhost/
< Content-Length: 201
< Content-Type: text/html; charset=iso-8859-1
<
* Ignoring the response-body
{ [201 bytes data]
* Connection #0 to host localhost left intact
* Issue another request to this URL: 'http://localhost/'
* Found bundle for host localhost: 0x55d3c0fde2f0 [serially]
* Can not multiplex, even if we wanted to!
* Re-using existing connection! (#0) with host localhost
* Connected to localhost (::1) port 80 (#0)
> GET / HTTP/1.1
> Host: localhost
> User-Agent: curl/7.76.1
> Accept: */*
>
* Mark bundle as not supporting multiuse
< HTTP/1.1 302 Found
< Date: Fri, 06 Nov 2026 17:41:01 GMT
< Server: Apache
< Location: http://localhost/
< Content-Length: 201
< Content-Type: text/html; charset=iso-8859-1
<
* Ignoring the response-body
{ [201 bytes data]
* Connection #0 to host localhost left intact
* Issue another request to this URL: 'http://localhost/'
* Found bundle for host localhost: 0x55d3c0fde2f0 [serially]
* Can not multiplex, even if we wanted to!
* Re-using existing connection! (#0) with host localhost
* Connected to localhost (::1) port 80 (#0)
> GET / HTTP/1.1
> Host: localhost
> User-Agent: curl/7.76.1
> Accept: */*
>
* Mark bundle as not supporting multiuse
< HTTP/1.1 302 Found
< Date: Fri, 06 Nov 2026 17:41:01 GMT
< Server: Apache
< Location: http://localhost/
< Content-Length: 201
< Content-Type: text/html; charset=iso-8859-1
<
* Ignoring the response-body
{ [201 bytes data]
* Connection #0 to host localhost left intact
* Issue another request to this URL: 'http://localhost/'
* Found bundle for host localhost: 0x55d3c0fde2f0 [serially]
* Can not multiplex, even if we wanted to!
* Re-using existing connection! (#0) with host localhost
* Connected to localhost (::1) port 80 (#0)
> GET / HTTP/1.1
> Host: localhost
> User-Agent: curl/7.76.1
> Accept: */*
>
* Mark bundle as not supporting multiuse
< HTTP/1.1 302 Found
< Date: Fri, 06 Nov 2026 17:41:01 GMT
< Server: Apache
< Location: http://localhost/
< Content-Length: 201
< Content-Type: text/html; charset=iso-8859-1
<
* Ignoring the response-body
{ [201 bytes data]
* Connection #0 to host localhost left intact
* Issue another request to this URL: 'http://localhost/'
* Found bundle for host localhost: 0x55d3c0fde2f0 [serially]
* Can not multiplex, even if we wanted to!
* Re-using existing connection! (#0) with host localhost
* Connected to localhost (::1) port 80 (#0)
> GET / HTTP/1.1
> Host: localhost
> User-Agent: curl/7.76.1
> Accept: */*
>
* Mark bundle as not supporting multiuse
< HTTP/1.1 302 Found
< Date: Fri, 06 Nov 2026 17:41:01 GMT
< Server: Apache
< Location: http://localhost/
< Content-Length: 201
< Content-Type: text/html; charset=iso-8859-1
<
* Ignoring the response-body
{ [201 bytes data]
* Connection #0 to host localhost left intact
* Maximum (5) redirects followed
*   Trying ::1:443...
* Connected to localhost (::1) port 443 (#0)
* ALPN, offering h2
* ALPN, offering http/1.1
*  CAfile: /etc/pki/tls/certs/ca-bundle.crt
* TLSv1.0 (OUT), TLS header, Certificate Status (22):
} [5 bytes data]
* TLSv1.3 (OUT), TLS handshake, Client hello (1):
} [512 bytes data]
* (5454) (IN), , Unknown (72):
{ [5 bytes data]
* error:0A00010B:SSL routines::wrong version number
* Closing connection 0
*   Trying ::1:443...
* Connected to localhost (::1) port 443 (#0)
* ALPN, offering h2
* ALPN, offering http/1.1
*  CAfile: /etc/pki/tls/certs/ca-bundle.crt
* TLSv1.0 (OUT), TLS header, Certificate Status (22):
} [5 bytes data]
* TLSv1.3 (OUT), TLS handshake, Client hello (1):
} [512 bytes data]
* (5454) (IN), , Unknown (72):
{ [5 bytes data]
* error:0A00010B:SSL routines::wrong version number
* Closing connection 0
/opt/httpd/conf/httpd.conf:95:# ports, in addition to the default. See also the <VirtualHost>
/opt/httpd/conf/httpd.conf:124:ProxyPass /status !
/opt/httpd/conf/httpd.conf:141:# <VirtualHost> definition.  These values also provide defaults for
/opt/httpd/conf/httpd.conf:142:# any <VirtualHost> containers you may define later in the file.
/opt/httpd/conf/httpd.conf:144:# All of these directives may appear inside <VirtualHost> containers,
/opt/httpd/conf/httpd.conf:157:# ServerName gives the name and port that the server uses to identify itself.
/opt/httpd/conf/httpd.conf:162:# redirections will not work.  See also the UseCanonicalName directive.
/opt/httpd/conf/httpd.conf:166:# redirections work in a sensible way.
/opt/httpd/conf/httpd.conf:168:ServerName localhost:80
/opt/httpd/conf/httpd.conf:175:# ServerName directive.
/opt/httpd/conf/httpd.conf:325:# If you do not specify an ErrorLog directive within a <VirtualHost>
/opt/httpd/conf/httpd.conf:327:# logged here.  If you *do* define an error logfile for a <VirtualHost>
/opt/httpd/conf/httpd.conf:373:LogFormat "{ \"requestTime\":\"%{%Y-%m-%d %T}t.%{msec_frac}t %{%z}t\", \"sigla\":\"SIBDO\", \"responseTime\":\"%D\", \"filename\":\"%f\", \"forwardedIP\":\"%{X-Forwarded-For}i\", \"remoteIP\":\"%h\", \"virtualHost\":\"%V\", \"request\":\"%U\", \"query\":\"%q\", \"method\":\"%m\", \"status\":\"%>s\", \"userAgent\":\"%{User-agent}i\", \"referer\":\"%{Referer}i\", \"bytesResponse\":\"%B\" }" monitoracao
/opt/httpd/conf/httpd.conf:376:LogFormat "{ \"requestTime\":\"%{%Y-%m-%d %T}t.%{msec_frac}t %{%z}t\", \"sigla\":\"SIBDO\", \"responseTime\":\"%D\", \"filename\":\"%f\", \"forwardedIP\":\"%{X-Forwarded-For}i\", \"remoteIP\":\"%h\", \"virtualHost\":\"%V\", \"request\":\"%U\", \"query\":\"%q\", \"method\":\"%m\", \"status\":\"%>s\", \"userAgent\":\"%{User-agent}i\", \"referer\":\"%{Referer}i\", \"bytesResponse\":\"%B\" }" monitoracao
/opt/httpd/conf/httpd.conf:388:# If you do not define any access logfiles within a <VirtualHost>
/opt/httpd/conf/httpd.conf:390:# define per-<VirtualHost> access logfiles, transactions will be
/opt/httpd/conf/httpd.conf:471:# Redirect allows you to tell clients about documents which used to exist in
/opt/httpd/conf/httpd.conf:475:# Redirect permanent /foo http://www.example.com/bar
/opt/httpd/conf/httpd.conf:704:# 1) plain text 2) local redirects 3) external redirects
/opt/httpd/conf/httpd.conf:716:# We use Alias to redirect any /error/HTTP_<error>.html.var response to
/opt/httpd/conf/httpd.conf:727:# copying them to /your/include/path/, even on a per-VirtualHost basis.
/opt/httpd/conf/httpd.conf:776:# The following directive disables redirects on non-GET requests for
/opt/httpd/conf/httpd.conf:779:# redirects for folders with DAV methods.
/opt/httpd/conf/httpd.conf:782:BrowserMatch "Microsoft Data Access Internet Publishing Provider" redirect-carefully
/opt/httpd/conf/httpd.conf:783:BrowserMatch "MS FrontPage" redirect-carefully
/opt/httpd/conf/httpd.conf:784:BrowserMatch "^WebDrive" redirect-carefully
/opt/httpd/conf/httpd.conf:785:BrowserMatch "^WebDAVFS/1.[0123]" redirect-carefully
/opt/httpd/conf/httpd.conf:786:BrowserMatch "^gnome-vfs/1.0" redirect-carefully
/opt/httpd/conf/httpd.conf:787:BrowserMatch "^XML Spy" redirect-carefully
/opt/httpd/conf/httpd.conf:788:BrowserMatch "^Dreamweaver-WebDAV-SCM1" redirect-carefully
/opt/httpd/conf/httpd.conf:792:# with the URL of http://servername/server-status
/opt/httpd/conf/httpd.conf:802:#  http://servername/server-info (requires that mod_info.c be loaded).
/opt/httpd/conf/httpd.conf:843:# VirtualHost: If you want to maintain multiple domains/hostnames on your
/opt/httpd/conf/httpd.conf:844:# machine you can setup VirtualHost containers for them. Most configurations
/opt/httpd/conf/httpd.conf:858:#NameVirtualHost *:80
/opt/httpd/conf/httpd.conf:860:# NOTE: NameVirtualHost cannot be used without a port specifier
/opt/httpd/conf/httpd.conf:866:# VirtualHost example:
/opt/httpd/conf/httpd.conf:867:# Almost any Apache directive may go into a VirtualHost container.
/opt/httpd/conf/httpd.conf:868:# The first VirtualHost section is used for requests without a known
/opt/httpd/conf/httpd.conf:871:#<VirtualHost *:80>
/opt/httpd/conf/httpd.conf:874:#    ServerName dummy-host.example.com
/opt/httpd/conf/httpd.conf:877:#</VirtualHost>
/opt/httpd/conf/openssl/pki/tls/openssl.cnf:218:#nsSslServerName
/opt/httpd/conf/openssl/pki/tls/openssl.cnf:319:#nsSslServerName
/opt/httpd/conf/httpd.conf.bkp:94:# ports, in addition to the default. See also the <VirtualHost>
/opt/httpd/conf/httpd.conf.bkp:139:# <VirtualHost> definition.  These values also provide defaults for
/opt/httpd/conf/httpd.conf.bkp:140:# any <VirtualHost> containers you may define later in the file.
/opt/httpd/conf/httpd.conf.bkp:142:# All of these directives may appear inside <VirtualHost> containers,
/opt/httpd/conf/httpd.conf.bkp:155:# ServerName gives the name and port that the server uses to identify itself.
/opt/httpd/conf/httpd.conf.bkp:160:# redirections will not work.  See also the UseCanonicalName directive.
/opt/httpd/conf/httpd.conf.bkp:164:# redirections work in a sensible way.
/opt/httpd/conf/httpd.conf.bkp:166:ServerName localhost:80
/opt/httpd/conf/httpd.conf.bkp:173:# ServerName directive.
/opt/httpd/conf/httpd.conf.bkp:323:# If you do not specify an ErrorLog directive within a <VirtualHost>
/opt/httpd/conf/httpd.conf.bkp:325:# logged here.  If you *do* define an error logfile for a <VirtualHost>
/opt/httpd/conf/httpd.conf.bkp:352:# If you do not define any access logfiles within a <VirtualHost>
/opt/httpd/conf/httpd.conf.bkp:354:# define per-<VirtualHost> access logfiles, transactions will be
/opt/httpd/conf/httpd.conf.bkp:432:# Redirect allows you to tell clients about documents which used to exist in
/opt/httpd/conf/httpd.conf.bkp:436:# Redirect permanent /foo http://www.example.com/bar
/opt/httpd/conf/httpd.conf.bkp:665:# 1) plain text 2) local redirects 3) external redirects
/opt/httpd/conf/httpd.conf.bkp:677:# We use Alias to redirect any /error/HTTP_<error>.html.var response to
/opt/httpd/conf/httpd.conf.bkp:688:# copying them to /your/include/path/, even on a per-VirtualHost basis.
/opt/httpd/conf/httpd.conf.bkp:737:# The following directive disables redirects on non-GET requests for
/opt/httpd/conf/httpd.conf.bkp:740:# redirects for folders with DAV methods.
/opt/httpd/conf/httpd.conf.bkp:743:BrowserMatch "Microsoft Data Access Internet Publishing Provider" redirect-carefully
/opt/httpd/conf/httpd.conf.bkp:744:BrowserMatch "MS FrontPage" redirect-carefully
/opt/httpd/conf/httpd.conf.bkp:745:BrowserMatch "^WebDrive" redirect-carefully
/opt/httpd/conf/httpd.conf.bkp:746:BrowserMatch "^WebDAVFS/1.[0123]" redirect-carefully
/opt/httpd/conf/httpd.conf.bkp:747:BrowserMatch "^gnome-vfs/1.0" redirect-carefully
/opt/httpd/conf/httpd.conf.bkp:748:BrowserMatch "^XML Spy" redirect-carefully
/opt/httpd/conf/httpd.conf.bkp:749:BrowserMatch "^Dreamweaver-WebDAV-SCM1" redirect-carefully
/opt/httpd/conf/httpd.conf.bkp:753:# with the URL of http://servername/server-status
/opt/httpd/conf/httpd.conf.bkp:763:#  http://servername/server-info (requires that mod_info.c be loaded).
/opt/httpd/conf/httpd.conf.bkp:804:# VirtualHost: If you want to maintain multiple domains/hostnames on your
/opt/httpd/conf/httpd.conf.bkp:805:# machine you can setup VirtualHost containers for them. Most configurations
/opt/httpd/conf/httpd.conf.bkp:819:#NameVirtualHost *:80
/opt/httpd/conf/httpd.conf.bkp:821:# NOTE: NameVirtualHost cannot be used without a port specifier
/opt/httpd/conf/httpd.conf.bkp:827:# VirtualHost example:
/opt/httpd/conf/httpd.conf.bkp:828:# Almost any Apache directive may go into a VirtualHost container.
/opt/httpd/conf/httpd.conf.bkp:829:# The first VirtualHost section is used for requests without a known
/opt/httpd/conf/httpd.conf.bkp:832:#<VirtualHost *:80>
/opt/httpd/conf/httpd.conf.bkp:835:#    ServerName dummy-host.example.com
/opt/httpd/conf/httpd.conf.bkp:838:#</VirtualHost>
/opt/httpd/conf.d/vhost.conf:2:<VirtualHost *:80>
/opt/httpd/conf.d/vhost.conf:3:  ServerName  sibdo-web.esteiras.des.caixa
/opt/httpd/conf.d/vhost.conf:17:  RewriteRule ^/$ / [R]
/opt/httpd/conf.d/vhost.conf:19:  ProxyPass / ajp://127.0.0.1:8009/
/opt/httpd/conf.d/vhost.conf:20:  ProxyPassReverse / ajp://127.0.0.1:8009/
/opt/httpd/conf.d/vhost.conf:51:</VirtualHost>
[p585600@caddeapllx2835 ~]$


[p585600@cbrdeapllx473 tmp]$
[p585600@cbrdeapllx473 tmp]$
[p585600@cbrdeapllx473 tmp]$
[p585600@cbrdeapllx473 tmp]$
[p585600@cbrdeapllx473 tmp]$ nc -zv 10.116.202.37 443
Ncat: Version 7.92 ( https://nmap.org/ncat )
Ncat: TIMEOUT.
[p585600@cbrdeapllx473 tmp]$ nc -zv 10.116.202.37 80
nc -zv 10.116.181.213 443
Ncat: Version 7.92 ( https://nmap.org/ncat )
Ncat: TIMEOUT.
Ncat: Version 7.92 ( https://nmap.org/ncat )
Ncat: TIMEOUT.
[p585600@cbrdeapllx473 tmp]$

