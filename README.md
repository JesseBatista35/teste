
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# netstat -tlnp 2>/dev/null | grep 8025
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# ss -tlnp | grep 8025
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# ps aux | grep "siavl04-httpd" | grep -v inter
root     57043  0.0  0.0 103324   876 pts/2    S+   17:03   0:00 grep siavl04-httpd
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# tail -20 /opt/apache/jbcs-httpd24-2.4/httpd/logs/siavl04-httpd.log
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
