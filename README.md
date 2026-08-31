[p585600@sspdeaprlx0027 siavl]$
[p585600@sspdeaprlx0027 siavl]$ grep -n -A 8 "<Location /siavl-web>" siavl.conf
56:    <Location /siavl-web>
57-        SetEnvIf Origin "^(https?://.*)$" CORS_ORIGIN=$1
58-        Header always set Access-Control-Allow-Origin "%{CORS_ORIGIN}e" env=CORS_ORIGIN
59-        Header always set Access-Control-Allow-Credentials "true"
60-        Header always set Vary "Origin"
61-        Header always set Access-Control-Allow-Methods "GET, POST, PUT, DELETE, OPTIONS"
62-        Header always set Access-Control-Allow-Headers "Accept, Content-Type, Authorization, Origin, X-Requested-With"
63-    </Location>
64-    RewriteCond %{REQUEST_METHOD} =OPTIONS
[p585600@sspdeaprlx0027 siavl]$
[p585600@sspdeaprlx0027 siavl]$
[p585600@sspdeaprlx0027 siavl]$
[p585600@sspdeaprlx0027 siavl]$
