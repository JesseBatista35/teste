
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# apachectl configtest
bash: apachectl: command not found
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl-httpd.conf -k graceful
[Mon Aug 31 16:55:31.112803 2026] [so:warn] [pid 54245:tid 139772359816960] AH01574: module remoteip_module is already loaded, skipping
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# curl -ik -X OPTIONS https://agenciadigital.des.caixa:8002/siavl-web/index.html -H "Origin: https://exemplo.com" | grep -i "access-control"
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
Access-Control-Allow-Origin: *
Access-Control-Allow-Methods: GET, POST, PUT, DELETE, OPTIONS
Access-Control-Allow-Headers: Accept, Content-Type, Authorization, Origin, X-Requested-With
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
