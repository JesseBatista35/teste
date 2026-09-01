
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# cp siavl.conf backup/siavl.conf.$(date +%Y%m%d).WO-CORS-unset-v1
[root@sspdeaprlx0027 siavl]# \mv -f siavl.conf.NOVO siavl.conf
[root@sspdeaprlx0027 siavl]# /opt/apache/jbcs-httpd24-2.4/httpd/sbin/apachectl configtest
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# cp siavl.conf backup/siavl.conf.$(date +%Y%m%d).WO-CORS-unset-v1
cp: overwrite `backup/siavl.conf.20260901.WO-CORS-unset-v1'? yes
[root@sspdeaprlx0027 siavl]# \mv -f siavl.conf.NOVO siavl.conf
mv: cannot stat `siavl.conf.NOVO': No such file or directory
[root@sspdeaprlx0027 siavl]# /opt/apache/jbcs-httpd24-2.4/httpd/sbin/apachectl configtest
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl-httpd.conf -k graceful
[Tue Sep 01 11:37:41.949363 2026] [so:warn] [pid 13811:tid 140201236444928] AH01574: module remoteip_module is already loaded, skipping
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# curl -ik -X GET "https://agenciadigital4.des.caixa:8025/siavl-web/rs/sec/galeriaImagem/buscaArquivoPorIdMsg/9756" -H "Origin: https://plataforma-des.caixa" | grep -i "access-control-allow-origin"
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
  0    80    0    80    0     0   1142      0 --:--:-- --:--:-- --:--:-- 26666
Access-Control-Allow-Origin: *
Access-Control-Allow-Origin: *
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
