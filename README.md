
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# ls -la /opt/apache/jbcs-httpd24-2.4/httpd/logs/ | grep siavl04
-rw-r--r--   1 apache apache     0 2021-08-04 16:18 siavl04-httpd.log
-rw-r--r--   1 apache apache     0 2021-08-04 16:18 siavl04-inter-httpd.log
[root@sspdeaprlx0027 siavl05]# tail -50 /opt/apache/jbcs-httpd24-2.4/httpd/logs/error_log 2>/dev/null
[Mon Mar 11 18:58:46.068630 2019] [auth_digest:notice] [pid 64301] AH01757: generating secret for digest authentication ...
[Mon Mar 11 18:58:47.197100 2019] [ssl:warn] [pid 64301] AH01873: Init: Session Cache is not configured [hint: SSLSessionCache]
[Mon Mar 11 18:58:47.441681 2019] [mpm_prefork:notice] [pid 64301] AH00163: Apache/2.4.23 (Red Hat) OpenSSL/1.0.2h-fips mod_auth_kerb/5.4 configured -- resuming normal operations
[Mon Mar 11 18:58:47.441733 2019] [core:notice] [pid 64301] AH00094: Command line: '/opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/httpd.conf -E /opt/apache/jbcs-httpd24-2.4/httpd/logs/httpd.log'
[root@sspdeaprlx0027 siavl05]# grep -i siavl04 /var/log/messages 2>/dev/null | tail -20
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# /opt/apache/jbcs-httpd24-2.4/httpd/sbin/httpd -f /opt/apache/jbcs-httpd24-2.4/httpd/conf/siavl04-httpd.conf -k start
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
