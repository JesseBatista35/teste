
[root@sspdeaprlx0027 siavl]# awk '
> { lines[NR] = $0 }
> /<Location \/siavl-web>/ && !locstart { locstart = NR }
> /<\/Location>/ && locstart && !locend { locend = NR }
> /RewriteCond %\{REQUEST_METHOD\} =OPTIONS/ && !optline { optline = NR }
> END {
>   loc = ""
>   for (i = locstart; i <= locend; i++) loc = loc lines[i] "\n"
>   blankafter = (lines[locend+1] == "")
>   for (i = 1; i <= NR; i++) {
>     if (i >= locstart && i <= locend) continue
>     if (blankafter && i == locend+1) continue
>     if (i == optline) printf "%s", loc
>     print lines[i]
>   }
> }
> ' siavl.conf > siavl.conf.NOVO
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# diff siavl.conf siavl.conf.NOVO
55a56,63
>     <Location /siavl-web>
>         SetEnvIf Origin "^(https?://.*)$" CORS_ORIGIN=$1
>         Header always set Access-Control-Allow-Origin "%{CORS_ORIGIN}e" env=CORS_ORIGIN
>         Header always set Access-Control-Allow-Credentials "true"
>         Header always set Vary "Origin"
>         Header always set Access-Control-Allow-Methods "GET, POST, PUT, DELETE, OPTIONS"
>         Header always set Access-Control-Allow-Headers "Accept, Content-Type, Authorization, Origin, X-Requested-With"
>     </Location>
70,78d77
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
[root@sspdeaprlx0027 siavl]# cp siavl.conf backup/siavl.conf.$(date +%Y%m%d).WO0000081522583-v2
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# mv siavl.conf.NOVO siavl.conf
mv: overwrite `siavl.conf'? yes
[root@sspdeaprlx0027 siavl]# /opt/apache/jbcs-httpd24-2.4/httpd/sbin/apachectl configtest
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#

