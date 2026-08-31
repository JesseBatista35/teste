
[root@sspdeaprlx0027 siavl]# cp siavl.conf backup/siavl.conf.$(date +%Y%m%d).WO-CORS-fixo-v1
[root@sspdeaprlx0027 siavl]# mv siavl.conf.NOVO siavl.conf
mv: overwrite `siavl.conf'? yes
[root@sspdeaprlx0027 siavl]# /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl-httpd.conf -k graceful
[Mon Aug 31 16:40:19.138014 2026] [so:warn] [pid 52293:tid 139690161788672] AH01574: module remoteip_module is already loaded, skipping
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# curl -ik -X OPTIONS https://agenciadigital.des.caixa:8002/siavl-web/index.html -H "Origin: https://exemplo.com" | grep -i "access-control"
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
Access-Control-Allow-Credentials: true
Access-Control-Allow-Methods: GET, POST, PUT, DELETE, OPTIONS
Access-Control-Allow-Headers: Accept, Content-Type, Authorization, Origin, X-Requested-With
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# /opt/apache/jbcs-httpd24-2.4/httpd/sbin/apachectl configtest
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# grep -n -A 5 "<Location /siavl-web>" /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl/siavl.conf
56:    <Location /siavl-web>
57-        SetEnvIf Origin "^(https?://.*)$" CORS_ORIGIN=$1
58-        Header always set Access-Control-Allow-Origin "%{CORS_ORIGIN}e" env=CORS_ORIGIN
59-        Header always set Access-Control-Allow-Credentials "true"
60-        Header always set Vary "Origin"
61-        Header always set Access-Control-Allow-Methods "GET, POST, PUT, DELETE, OPTIONS"
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl-httpd.conf -S 2>&1 | grep -i 8002
10.116.82.86:8002      agenciadigital.des.caixa (/opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl/siavl.conf:7)
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# ps aux | grep "siavl-httpd" | grep -v inter
apache    7538  0.0  0.1 271116  7824 ?        Ss   Aug28   0:09 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl-httpd.log -k start
apache   52298  0.0  0.0 270744  3248 ?        S    16:40   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl-httpd.log -k start
apache   52299  0.0  0.1 1707160 6908 ?        Sl   16:40   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl-httpd.log -k start
apache   52303  0.0  0.1 1543256 5620 ?        Sl   16:40   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl-httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl-httpd.log -k start
root     52576  0.0  0.0 103328   884 pts/2    S+   16:42   0:00 grep siavl-httpd
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
