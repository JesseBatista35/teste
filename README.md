
[root@sspdeaprlx0027 siavl]# for n in 02 03 04 05; do
>   echo "=== siavl${n}.conf ==="
>   grep -n -A 8 "<Location /siavl-web>" /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl${n}/siavl${n}.conf
> done
=== siavl02.conf ===
45:    <Location /siavl-web>
46-        SetEnvIf Origin "^(https?://.*)$" CORS_ORIGIN=$1
47-        Header always set Access-Control-Allow-Origin "%{CORS_ORIGIN}e" env=CORS_ORIGIN
48-        Header always set Access-Control-Allow-Credentials "true"
49-        Header always set Vary "Origin"
50-        Header always set Access-Control-Allow-Methods "GET, POST, PUT, DELETE, OPTIONS"
51-        Header always set Access-Control-Allow-Headers "Accept, Content-Type, Authorization, Origin, X-Requested-With"
52-    </Location>
53-    RewriteCond %{REQUEST_METHOD} =OPTIONS
=== siavl03.conf ===
45:    <Location /siavl-web>
46-        SetEnvIf Origin "^(https?://.*)$" CORS_ORIGIN=$1
47-        Header always set Access-Control-Allow-Origin "%{CORS_ORIGIN}e" env=CORS_ORIGIN
48-        Header always set Access-Control-Allow-Credentials "true"
49-        Header always set Vary "Origin"
50-        Header always set Access-Control-Allow-Methods "GET, POST, PUT, DELETE, OPTIONS"
51-        Header always set Access-Control-Allow-Headers "Accept, Content-Type, Authorization, Origin, X-Requested-With"
52-    </Location>
53-    RewriteCond %{REQUEST_METHOD} =OPTIONS
=== siavl04.conf ===
45:    <Location /siavl-web>
46-        SetEnvIf Origin "^(https?://.*)$" CORS_ORIGIN=$1
47-        Header always set Access-Control-Allow-Origin "%{CORS_ORIGIN}e" env=CORS_ORIGIN
48-        Header always set Access-Control-Allow-Credentials "true"
49-        Header always set Vary "Origin"
50-        Header always set Access-Control-Allow-Methods "GET, POST, PUT, DELETE, OPTIONS"
51-        Header always set Access-Control-Allow-Headers "Accept, Content-Type, Authorization, Origin, X-Requested-With"
52-    </Location>
53-   RewriteCond %{REQUEST_METHOD} =OPTIONS
=== siavl05.conf ===
45:    <Location /siavl-web>
46-        SetEnvIf Origin "^(https?://.*)$" CORS_ORIGIN=$1
47-        Header always set Access-Control-Allow-Origin "%{CORS_ORIGIN}e" env=CORS_ORIGIN
48-        Header always set Access-Control-Allow-Credentials "true"
49-        Header always set Vary "Origin"
50-        Header always set Access-Control-Allow-Methods "GET, POST, PUT, DELETE, OPTIONS"
51-        Header always set Access-Control-Allow-Headers "Accept, Content-Type, Authorization, Origin, X-Requested-With"
52-    </Location>
53-    RewriteCond %{REQUEST_METHOD} =OPTIONS
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
