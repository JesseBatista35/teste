
[root@sspdeaprlx0027 siavl]# awk '
> skipblank && /^$/ { skipblank=0; next }
> /<Location \/siavl-web>/ { collecting=1 }
> collecting { loc = loc $0 "\n"; if (/<\/Location>/) { collecting=0; skipblank=1 }; next }
> /RewriteCond %\{REQUEST_METHOD\} =OPTIONS/ && !inserted {
>   printf "%s", loc
>   inserted=1
> }
> { print }
> ' siavl.conf > siavl.conf.NOVO
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# diff siavl.conf siavl.conf.NOVO
70,78d69
<     <Location /siavl-web>
<         SetEnvIf Origin "^(https?://.*)$" CORS_ORIGIN=$1
<         Header always set Access-Control-Allow-Origin "%{CORS_ORIGIN}e" env=CORS_ORIGIN
<         Header always set Access-Control-Allow-Credentials "true"
<         Header always set Vary "Origin"
<         Header always set Access-Control-Allow-Methods "GET, POST, PUT, DELETE, OPTIONS"
<         Header always set Access-Control-Allow-Headers "Accept, Content-Type, Authorization, Origin, X-Requested-With"
<     </Location>
<
[root@sspdeaprlx0027 siavl]#




<
[root@sspdeaprlx0027 siavl]# grep -n -B 2 -A 10 "Location /siavl-web" siavl.conf.NOVO
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
