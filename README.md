
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
[root@sspdeaprlx0027 siavl]#
