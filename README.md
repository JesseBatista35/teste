[p585600@sspdeaprlx0027 ~]$ sudo grep -n -B 5 -A 15 "Location /siavl-web" /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl/siavl.conf

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

Senha SUDO:
65-    ProxyPassReverse /siavl-web balancer://httpcluster/siavl-web
66-
67-    ProxyPass /siavl-api balancer://httpcluster/siavl-api
68-    ProxyPassReverse /siavl-api balancer://httpcluster/siavl-api
69-
70:    <Location /siavl-web>
71-        SetEnvIf Origin "^(https?://.*)$" CORS_ORIGIN=$1
72-        Header always set Access-Control-Allow-Origin "%{CORS_ORIGIN}e" env=CORS_ORIGIN
73-        Header always set Access-Control-Allow-Credentials "true"
74-        Header always set Vary "Origin"
75-        Header always set Access-Control-Allow-Methods "GET, POST, PUT, DELETE, OPTIONS"
76-        Header always set Access-Control-Allow-Headers "Accept, Content-Type, Authorization, Origin, X-Requested-With"
77-    </Location>
78-
79-# WO0000042636092
80-    ProxyPass /siavl-api-internet balancer://httpcluster/siavl-api-internet
81-    ProxyPassReverse /siavl-api-internet balancer://httpcluster/siavl-api-internet
82-
83-    SSLEngine on
84-    SSLProtocol all -SSLv2 -SSLv3
85-    SSLCertificateFile /opt/keystore/LX_agdigital.crt
[p585600@sspdeaprlx0027 ~]$
[p585600@sspdeaprlx0027 ~]$
[p585600@sspdeaprlx0027 ~]$ sudo find /opt/apache/jbcs-httpd24-2.4/httpd/conf.d -iname "siavl*.conf"
/opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl04/siavl04.conf
/opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl04-inter/siavl04-inter.conf
/opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl05/siavl05.conf
/opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl/siavl.conf
/opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl02/siavl02.conf
/opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl05-inter/siavl05-inter.conf
/opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl03-inter/siavl03-inter.conf
/opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl-inter/siavl-inter.conf
/opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl02-inter/siavl02-inter.conf
/opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl03/siavl03.conf
[p585600@sspdeaprlx0027 ~]$
[p585600@sspdeaprlx0027 ~]$
[p585600@sspdeaprlx0027 ~]$
[p585600@sspdeaprlx0027 ~]$



