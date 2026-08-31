
Access-Control-Allow-Methods: GET, POST, PUT, DELETE, OPTIONS
Access-Control-Allow-Headers: Accept, Content-Type, Authorization, Origin, X-Requested-With
Content-Length: 0

[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl-httpd.conf -M 2>&1 | grep -i setenvif
 setenvif_module (shared)
[root@sspdeaprlx0027 siavl05]# curl -ikv -X OPTIONS https://agenciadigital.des.caixa:8002/siavl-web/index.html -H "Origin: https://exemplo.com" 2>&1 | grep -i origin
> Origin: https://exemplo.com
< Vary: Origin
< Access-Control-Allow-Headers: Accept, Content-Type, Authorization, Origin, X-Requested-With
Vary: Origin
Access-Control-Allow-Headers: Accept, Content-Type, Authorization, Origin, X-Requested-With
[root@sspdeaprlx0027 siavl05]#
