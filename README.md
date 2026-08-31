
[root@sspdeaprlx0027 siavl]# awk '
> skipblank && /^$/ { skipblank=0; next }
> /<Location \/siavl-web>/ { collecting=1 }
> collecting { loc = loc $0 "\n"; if (/<\/Location>/) { collecting=0; skipblank=1 }; next }
> /RewriteCond %{REQUEST_METHOD} =OPTIONS/ && !inserted {
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
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# cp siavl.conf backup/siavl.conf.$(date +%Y%m%d).WO<WO0000081522583>
bash: syntax error near unexpected token `newline'
[root@sspdeaprlx0027 siavl]# cp siavl.conf backup/siavl.conf.$(date +%Y%m%d).WO0000081522583
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# mv siavl.conf.NOVO siavl.conf
mv: overwrite `siavl.conf'? yes
[root@sspdeaprlx0027 siavl]# apachectl configtest
bash: apachectl: command not found
[root@sspdeaprlx0027 siavl]#
