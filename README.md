
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# grep -n "Location /siavl-web" /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl02/siavl02.conf
59:    <Location /siavl-web>
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# ls -la /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl02/
total 40
drwxr-xr-x   3 apache apache 4096 2026-08-31 12:15 .
drwxr-xr-x. 27 apache apache 4096 2021-08-04 12:13 ..
drwxr-xr-x   2 apache apache 4096 2026-08-31 12:16 backup
-rw-r--r--   1 apache apache 1536 2021-10-14 12:36 mod_proxy_wstunnel.conf.1
-rw-r--r--   1 apache apache 1548 2021-10-14 12:37 mod_proxy_wstunnel.conf.2
-rw-r--r--   1 apache apache  583 2018-11-07 17:59 proxy_ajp.conf
-rw-r--r--   1 apache apache  193 2021-10-02 20:19 security.conf
-rw-r--r--   1 apache apache 2980 2026-08-28 17:34 siavl02.conf
-rw-r--r--   1 root   root   2382 2026-08-27 15:18 .siavl02.conf.20260827150818.p544858
-rw-r--r--   1 root   root   2979 2026-08-31 12:15 siavl02.conf.NOVO
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# stat /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl02/siavl02.conf
  File: `/opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl02/siavl02.conf'
  Size: 2980            Blocks: 8          IO Block: 4096   regular file
Device: fd07h/64775d    Inode: 12516       Links: 1
Access: (0644/-rw-r--r--)  Uid: (   48/  apache)   Gid: (   48/  apache)
Access: 2026-08-30 19:00:05.112770357 -0300
Modify: 2026-08-28 17:34:34.621593700 -0300
Change: 2026-08-28 17:34:34.625593663 -0300
[root@sspdeaprlx0027 siavl05]#
