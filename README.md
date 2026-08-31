[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl02-httpd.conf -k graceful
[root@sspdeaprlx0027 siavl05]# /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl03-httpd.conf -k graceful
[root@sspdeaprlx0027 siavl05]# /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl04-httpd.conf -k graceful
[root@sspdeaprlx0027 siavl05]# /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl05-httpd.conf -k graceful
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# curl -ik -X OPTIONS https://agenciadigital2.des.caixa/siavl-web/index.html -H "Origin: https://exemplo.com" | grep -i "access-control"

curl: (7) couldn't connect to host
[root@sspdeaprlx0027 siavl05]# curl -ik -X OPTIONS https://agenciadigital3.des.caixa/siavl-web/index.html -H "Origin: https://exemplo.com" | grep -i "access-control"

curl: (7) couldn't connect to host
[root@sspdeaprlx0027 siavl05]# curl -ik -X OPTIONS https://agenciadigital4.des.caixa/siavl-web/index.html -H "Origin: https://exemplo.com" | grep -i "access-control"

curl: (7) couldn't connect to host
[root@sspdeaprlx0027 siavl05]# curl -ik -X OPTIONS https://agenciadigital5.des.caixa/siavl-web/index.html -H "Origin: https://exemplo.com" | grep -i "access-control"

curl: (7) couldn't connect to host
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
