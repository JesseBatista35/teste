
[root@sspdeaprlx0027 p585600]# ps aux | grep "siavl04-httpd" | grep -v inter
root     57234  0.0  0.1 271112  6232 ?        Ss   17:04   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl04-httpd.conf -k start
apache   57247  0.0  0.1 282584  4464 ?        S    17:04   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl04-httpd.conf -k start
apache   57248  0.0  0.1 1719268 6100 ?        Sl   17:04   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl04-httpd.conf -k start
apache   57249  0.0  0.1 1555364 5900 ?        Sl   17:04   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl04-httpd.conf -k start
root     57898  0.0  0.0 103328   884 pts/2    S+   17:07   0:00 grep siavl04-httpd
[root@sspdeaprlx0027 p585600]#
[root@sspdeaprlx0027 p585600]#
[root@sspdeaprlx0027 p585600]#
[root@sspdeaprlx0027 p585600]# curl -ik -X OPTIONS https://agenciadigital4.des.caixa:8025/siavl-web/index.html -H "Origin: https://exemplo.com" | grep -i "access-control"
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
Access-Control-Allow-Origin: *
Access-Control-Allow-Methods: GET, POST, PUT, DELETE, OPTIONS
Access-Control-Allow-Headers: Accept, Content-Type, Authorization, Origin, X-Requested-With
[root@sspdeaprlx0027 p585600]#
[root@sspdeaprlx0027 p585600]#
[root@sspdeaprlx0027 p585600]#
[root@sspdeaprlx0027 p585600]#
