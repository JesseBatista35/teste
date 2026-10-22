[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$ ps -ef | grep -E "[h]ttpd" | head -3
apache    66749 120501  0 Oct21 ?        00:00:02 /usr/sbin/httpd.worker -f /opt/apache/2.2/etc/httpd.conf -k start
apache    66800 120501  0 Oct21 ?        00:00:02 /usr/sbin/httpd.worker -f /opt/apache/2.2/etc/httpd.conf -k start
apache   120501      1  0 May21 ?        00:08:32 /usr/sbin/httpd.worker -f /opt/apache/2.2/etc/httpd.conf -k start
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$ grep -rlniE "sigsj" /opt/apache /caixa 2>&1 | head -20
/opt/apache/2.2/htdocs/sigsj_intranet/sigsjintrastatic/sigsjintrastatic/javascript/funcoes.js
/opt/apache/2.2/htdocs/sigsj_intranet/sigsjintrastatic/sigsjintrastatic/arquivos/Tutorial_ID_Agrupador_Empresas.pdf
/opt/apache/2.2/htdocs/sigsj_intranet/sigsjintrastatic/javascript/funcoes.js
/opt/apache/2.2/htdocs/sigsj_intranet/sigsjintrastatic/META-INF/MANIFEST.MF
/opt/apache/2.2/htdocs/sigsj_intranet/sigsjintrastatic/META-INF/maven/br.gov.caixa/sigsj_intranet-static/pom.xml
/opt/apache/2.2/htdocs/sigsj_intranet/sigsjintrastatic/META-INF/maven/br.gov.caixa/sigsj_intranet-static/pom.properties
/opt/apache/2.2/htdocs/sigsj_intranet/sigsjintrastatic/arquivos/Tutorial_ID_Agrupador_Empresas.pdf
grep: /opt/apache/2.2/etc/LX_cxextrlx122.key: Permission denied
/opt/apache/2.2/etc/conf.d/backup/workers.properties.20170912
/opt/apache/2.2/etc/conf.d/backup/workers.properties.20170524
/opt/apache/2.2/etc/conf.d/backup/workers.properties.20170529
/opt/apache/2.2/etc/conf.d/backup/workers.properties.20161219
/opt/apache/2.2/etc/conf.d/backup/workers.properties.20191122.WO0000042656139
/opt/apache/2.2/etc/conf.d/backup/workers.properties.20160212
/opt/apache/2.2/etc/conf.d/backup/workers.properties.20180630.1
/opt/apache/2.2/etc/conf.d/backup/sigsj_boleto.conf.20240202
/opt/apache/2.2/etc/conf.d/backup/sigsj_intranet.conf.20180704
/opt/apache/2.2/etc/conf.d/backup/sigsj_internet.conf.20180630
/opt/apache/2.2/etc/conf.d/backup/workers.properties.20180704
/opt/apache/2.2/etc/conf.d/backup/workers.properties.20160628
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$
[p585600@sspdeaprlx0045 ~]$ cd /etc/httpd/
[p585600@sspdeaprlx0045 httpd]$ ls -la
total 24
drwxr-xr-x.   4 root root  4096 2018-09-28 04:31 .
drwxr-xr-x. 127 root root 12288 2026-10-22 02:05 ..
drwxr-xr-x.   2 root root  4096 2018-09-28 04:31 conf
drwxr-xr-x.   2 root root  4096 2025-11-27 15:10 conf.d
lrwxrwxrwx    1 root root    19 2018-09-28 04:31 logs -> ../../var/log/httpd
lrwxrwxrwx    1 root root    29 2018-09-28 04:31 modules -> ../../usr/lib64/httpd/modules
lrwxrwxrwx    1 root root    19 2018-09-28 04:31 run -> ../../var/run/httpd
[p585600@sspdeaprlx0045 httpd]$ tail -n 3 /log_apache/2.2/sigsj_internet/access.log
tail: cannot open `/log_apache/2.2/sigsj_internet/access.log' for reading: No such file or directory
[p585600@sspdeaprlx0045 httpd]$
[p585600@sspdeaprlx0045 httpd]$
[p585600@sspdeaprlx0045 httpd]$ sudo su

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

Senha SUDO:
Sorry, try again.
Senha SUDO:
[root@sspdeaprlx0045 httpd]#
[root@sspdeaprlx0045 httpd]#
[root@sspdeaprlx0045 httpd]#
[root@sspdeaprlx0045 httpd]# tail -n 3 /log_apache/2.2/sigsj_internet/access.log
tail: cannot open `/log_apache/2.2/sigsj_internet/access.log' for reading: No such file or directory
[root@sspdeaprlx0045 httpd]#
[root@sspdeaprlx0045 httpd]#
[root@sspdeaprlx0045 httpd]#
[root@sspdeaprlx0045 httpd]# tail -n 3 /log_apache/2.2/sigsj_internet/access443.log
tail: cannot open `/log_apache/2.2/sigsj_internet/access443.log' for reading: No such file or directory
[root@sspdeaprlx0045 httpd]#
[root@sspdeaprlx0045 httpd]#
[root@sspdeaprlx0045 httpd]#
[root@sspdeaprlx0045 httpd]# find /opt /caixa /log_jboss \( -name "sigsj_intranet.xml" -o -name "sigsj_ws_boleto.xml" -o -name "*sigsj*log4j*" \) 2>/dev/null
[root@sspdeaprlx0045 httpd]#
