[root@sspdeaprlx0027 siavl]# for n in 02 03 04 05; do
>   dir=/opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl${n}
>   f=$dir/siavl${n}.conf
>   cd "$dir"
>   awk '
>   { lines[NR] = $0 }
>   /<Location \/siavl-web>/ && !locstart { locstart = NR }
>   /<\/Location>/ && locstart && !locend { locend = NR }
>   /RewriteCond %\{REQUEST_METHOD\} =OPTIONS/ && !optline { optline = NR }
>   END {
>     loc = ""
>     for (i = locstart; i <= locend; i++) loc = loc lines[i] "\n"
>     blankafter = (lines[locend+1] == "")
>     for (i = 1; i <= NR; i++) {
>       if (i >= locstart && i <= locend) continue
>       if (blankafter && i == locend+1) continue
>       if (i == optline) printf "%s", loc
>       print lines[i]
>     }
>   }
>   ' "$f" > "${f}.NOVO"
>   echo "=== diff $f ==="
>   diff "$f" "${f}.NOVO"
> done
=== diff /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl02/siavl02.conf ===
44a45,52
>     <Location /siavl-web>
>         SetEnvIf Origin "^(https?://.*)$" CORS_ORIGIN=$1
>         Header always set Access-Control-Allow-Origin "%{CORS_ORIGIN}e" env=CORS_ORIGIN
>         Header always set Access-Control-Allow-Credentials "true"
>         Header always set Vary "Origin"
>         Header always set Access-Control-Allow-Methods "GET, POST, PUT, DELETE, OPTIONS"
>         Header always set Access-Control-Allow-Headers "Accept, Content-Type, Authorization, Origin, X-Requested-With"
>     </Location>
59,67d66
<     <Location /siavl-web>
<         SetEnvIf Origin "^(https?://.*)$" CORS_ORIGIN=$1
<         Header always set Access-Control-Allow-Origin "%{CORS_ORIGIN}e" env=CORS_ORIGIN
<         Header always set Access-Control-Allow-Credentials "true"
<         Header always set Vary "Origin"
<         Header always set Access-Control-Allow-Methods "GET, POST, PUT, DELETE, OPTIONS"
<         Header always set Access-Control-Allow-Headers "Accept, Content-Type, Authorization, Origin, X-Requested-With"
<     </Location>
<
=== diff /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl03/siavl03.conf ===
44a45,52
>     <Location /siavl-web>
>         SetEnvIf Origin "^(https?://.*)$" CORS_ORIGIN=$1
>         Header always set Access-Control-Allow-Origin "%{CORS_ORIGIN}e" env=CORS_ORIGIN
>         Header always set Access-Control-Allow-Credentials "true"
>         Header always set Vary "Origin"
>         Header always set Access-Control-Allow-Methods "GET, POST, PUT, DELETE, OPTIONS"
>         Header always set Access-Control-Allow-Headers "Accept, Content-Type, Authorization, Origin, X-Requested-With"
>     </Location>
63,71d70
<     <Location /siavl-web>
<         SetEnvIf Origin "^(https?://.*)$" CORS_ORIGIN=$1
<         Header always set Access-Control-Allow-Origin "%{CORS_ORIGIN}e" env=CORS_ORIGIN
<         Header always set Access-Control-Allow-Credentials "true"
<         Header always set Vary "Origin"
<         Header always set Access-Control-Allow-Methods "GET, POST, PUT, DELETE, OPTIONS"
<         Header always set Access-Control-Allow-Headers "Accept, Content-Type, Authorization, Origin, X-Requested-With"
<     </Location>
<
=== diff /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl04/siavl04.conf ===
44a45,52
>     <Location /siavl-web>
>         SetEnvIf Origin "^(https?://.*)$" CORS_ORIGIN=$1
>         Header always set Access-Control-Allow-Origin "%{CORS_ORIGIN}e" env=CORS_ORIGIN
>         Header always set Access-Control-Allow-Credentials "true"
>         Header always set Vary "Origin"
>         Header always set Access-Control-Allow-Methods "GET, POST, PUT, DELETE, OPTIONS"
>         Header always set Access-Control-Allow-Headers "Accept, Content-Type, Authorization, Origin, X-Requested-With"
>     </Location>
63,71d70
<     <Location /siavl-web>
<         SetEnvIf Origin "^(https?://.*)$" CORS_ORIGIN=$1
<         Header always set Access-Control-Allow-Origin "%{CORS_ORIGIN}e" env=CORS_ORIGIN
<         Header always set Access-Control-Allow-Credentials "true"
<         Header always set Vary "Origin"
<         Header always set Access-Control-Allow-Methods "GET, POST, PUT, DELETE, OPTIONS"
<         Header always set Access-Control-Allow-Headers "Accept, Content-Type, Authorization, Origin, X-Requested-With"
<     </Location>
<
=== diff /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl05/siavl05.conf ===
44a45,52
>     <Location /siavl-web>
>         SetEnvIf Origin "^(https?://.*)$" CORS_ORIGIN=$1
>         Header always set Access-Control-Allow-Origin "%{CORS_ORIGIN}e" env=CORS_ORIGIN
>         Header always set Access-Control-Allow-Credentials "true"
>         Header always set Vary "Origin"
>         Header always set Access-Control-Allow-Methods "GET, POST, PUT, DELETE, OPTIONS"
>         Header always set Access-Control-Allow-Headers "Accept, Content-Type, Authorization, Origin, X-Requested-With"
>     </Location>
63,71d70
<     <Location /siavl-web>
<         SetEnvIf Origin "^(https?://.*)$" CORS_ORIGIN=$1
<         Header always set Access-Control-Allow-Origin "%{CORS_ORIGIN}e" env=CORS_ORIGIN
<         Header always set Access-Control-Allow-Credentials "true"
<         Header always set Vary "Origin"
<         Header always set Access-Control-Allow-Methods "GET, POST, PUT, DELETE, OPTIONS"
<         Header always set Access-Control-Allow-Headers "Accept, Content-Type, Authorization, Origin, X-Requested-With"
<     </Location>
<
[root@sspdeaprlx0027 siavl05]#
