
[root@sspdeaprlx0027 siavl]# cd /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# awk 'NR==56 {
>   print "    <Location /siavl-web>"
>   print "        Header always set Access-Control-Allow-Origin \"*\""
>   print "        Header always set Access-Control-Allow-Methods \"GET, POST, PUT, DELETE, OPTIONS\""
>   print "        Header always set Access-Control-Allow-Headers \"Accept, Content-Type, Authorization, Origin, X-Requested-With\""
>   print "    </Location>"
>   next
> }
> NR>=57 && NR<=63 { next }
> { print }
> ' siavl.conf > siavl.conf.NOVO
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# diff siavl.conf siavl.conf.NOVO
57,60c57
<         SetEnvIf Origin "^(https?://.*)$" CORS_ORIGIN=$1
<         Header always set Access-Control-Allow-Origin "%{CORS_ORIGIN}e" env=CORS_ORIGIN
<         Header always set Access-Control-Allow-Credentials "true"
<         Header always set Vary "Origin"
---
>         Header always set Access-Control-Allow-Origin "*"
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
