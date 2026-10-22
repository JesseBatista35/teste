
[root@sspdeaprlx0045 httpd]#

[root@sspdeaprlx0045 httpd]#
[root@sspdeaprlx0045 httpd]#
[root@sspdeaprlx0045 httpd]#
[root@sspdeaprlx0045 httpd]#

[root@sspdeaprlx0045 httpd]#
[root@sspdeaprlx0045 httpd]# ls -l | grep -iE "sigsj|workers"
[root@sspdeaprlx0045 httpd]#
[root@sspdeaprlx0045 httpd]#
[root@sspdeaprlx0045 httpd]#
[root@sspdeaprlx0045 httpd]# ls -l | grep -iE "sigsj|workers"
[root@sspdeaprlx0045 httpd]# grep -iE "Listen|VirtualHost|ServerName|JkMount|ProxyPass|BalancerMember" sigsj_*.conf
grep: sigsj_*.conf: No such file or directory
[root@sspdeaprlx0045 httpd]#
[root@sspdeaprlx0045 httpd]#
[root@sspdeaprlx0045 httpd]#
[root@sspdeaprlx0045 httpd]# grep -iE "sigsj" workers.properties
grep: workers.properties: No such file or directory
[root@sspdeaprlx0045 httpd]#
[root@sspdeaprlx0045 httpd]#
[root@sspdeaprlx0045 httpd]# grep -iE "sigsj" workers.properties | grep -oE "worker\.[^.]+" | sort -u | while read w; do grep -E "^$w\.(host|port|balance_workers)" workers.properties; done
grep: workers.properties: No such file or directory
[root@sspdeaprlx0045 httpd]#
[root@sspdeaprlx0045 httpd]#
[root@sspdeaprlx0045 httpd]#
[root@sspdeaprlx0045 httpd]# ls -lt /log_apache/2.2/sigsj_internet/ | head -5
total 0
[root@sspdeaprlx0045 httpd]#
