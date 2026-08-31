
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# ^C
[root@sspdeaprlx0027 siavl05]# /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl02-httpd.conf -S 2>&1 | grep -i "agenciadigital\|:80\|:443\|:8"
10.116.82.86:8021      agenciadigital2.des.caixa (/opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl02/siavl02.conf:6)
[root@sspdeaprlx0027 siavl05]# /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl03-httpd.conf -S 2>&1 | grep -i "agenciadigital\|:80\|:443\|:8"
10.116.82.86:8023      agenciadigital3.des.caixa (/opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl03/siavl03.conf:6)
[root@sspdeaprlx0027 siavl05]# /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl04-httpd.conf -S 2>&1 | grep -i "agenciadigital\|:80\|:443\|:8"
10.116.82.86:8025      agenciadigital4.des.caixa (/opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl04/siavl04.conf:6)
[root@sspdeaprlx0027 siavl05]# /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl05-httpd.conf -S 2>&1 | grep -i "agenciadigital\|:80\|:443\|:8"
10.116.82.86:8027      agenciadigital5.des.caixa (/opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl05/siavl05.conf:6)
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
