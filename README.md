
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# ps aux | grep "siavl-httpd" | grep -v inter | grep -v siavl0
root     16412  0.0  0.0 103324   868 pts/2    S+   11:45   0:00 grep siavl-httpd
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl-httpd.conf -k start
[Tue Sep 01 11:46:03.055600 2026] [so:warn] [pid 16457:tid 139923052947200] AH01574: module remoteip_module is already loaded, skipping
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# ps aux | grep "siavl-httpd" | grep -v inter | grep -v siavl0
root     16459  0.0  0.1 271116  6228 ?        Ss   11:46   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl-httpd.conf -k start
apache   16464  0.0  0.1 282588  4476 ?        S    11:46   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl-httpd.conf -k start
apache   16465  0.0  0.1 867304  5308 ?        Sl   11:46   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl-httpd.conf -k start
apache   16466  0.0  0.1 637864  5080 ?        Sl   11:46   0:00 /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl-httpd.conf -k start
root     16576  0.0  0.0 103324   876 pts/2    S+   11:46   0:00 grep siavl-httpd
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# curl -ik -X GET "https://agenciadigital.des.caixa:8002/siavl-web/rs/sec/galeriaImagem/buscaArquivoPorIdMsg/9756" -H "Origin: https://plataforma-des.caixa" | grep -i "access-control-allow-origin"
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
  0    80    0    80    0     0   1514      0 --:--:-- --:--:-- --:--:-- 20000
Access-Control-Allow-Origin: *
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# ps aux | grep httpd | grep "\-k start" | awk '{print $NF, $(NF-6)}' | sort -u
start 11:43
start 11:46
start /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd
[root@sspdeaprlx0027 siavl05]#
