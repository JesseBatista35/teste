
[root@sspdeaprlx0027 p585600]#
[root@sspdeaprlx0027 p585600]# cd /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# awk 'NR==56 {
>   print "    <Location /siavl-web>"
>   print "        Header unset Access-Control-Allow-Origin"
>   print "        Header unset Access-Control-Allow-Methods"
>   print "        Header unset Access-Control-Allow-Headers"
>   print ""
>   print "        Header always unset Access-Control-Allow-Origin"
>   print "        Header always unset Access-Control-Allow-Methods"
>   print "        Header always unset Access-Control-Allow-Headers"
>   print ""
>   print "        Header always set Access-Control-Allow-Origin \"*\""
>   print "        Header always set Access-Control-Allow-Methods \"GET, POST, PUT, DELETE, OPTIONS\""
>   print "        Header always set Access-Control-Allow-Headers \"Accept, Content-Type, Authorization, Origin, X-Requested-With\""
>   print "    </Location>"
>   next
> }
> NR>=57 && NR<=60 { next }
> { print }
> ' siavl.conf > siavl.conf.NOVO
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# diff siavl.conf siavl.conf.NOVO
56a57,64
>         Header unset Access-Control-Allow-Origin
>         Header unset Access-Control-Allow-Methods
>         Header unset Access-Control-Allow-Headers
>
>         Header always unset Access-Control-Allow-Origin
>         Header always unset Access-Control-Allow-Methods
>         Header always unset Access-Control-Allow-Headers
>
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
