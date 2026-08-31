
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# grep -n -A 5 "<Location /siavl-web>" siavl.conf.NOVO 2>&1
56:    <Location /siavl-web>
57-        Header always set Access-Control-Allow-Origin "*"
58-        Header always set Access-Control-Allow-Methods "GET, POST, PUT, DELETE, OPTIONS"
59-        Header always set Access-Control-Allow-Headers "Accept, Content-Type, Authorization, Origin, X-Requested-With"
60-    </Location>
61-    RewriteCond %{REQUEST_METHOD} =OPTIONS
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# \mv -f siavl.conf.NOVO siavl.conf
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# stat siavl.conf
  File: `siavl.conf'
  Size: 3196            Blocks: 8          IO Block: 4096   regular file
Device: fd07h/64775d    Inode: 12516       Links: 1
Access: (0644/-rw-r--r--)  Uid: (    0/    root)   Gid: (    0/    root)
Access: 2026-08-31 16:54:08.762618162 -0300
Modify: 2026-08-31 16:50:32.495140324 -0300
Change: 2026-08-31 16:54:16.066566775 -0300
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# grep -n -A 5 "<Location /siavl-web>" siavl.conf
56:    <Location /siavl-web>
57-        Header always set Access-Control-Allow-Origin "*"
58-        Header always set Access-Control-Allow-Methods "GET, POST, PUT, DELETE, OPTIONS"
59-        Header always set Access-Control-Allow-Headers "Accept, Content-Type, Authorization, Origin, X-Requested-With"
60-    </Location>
61-    RewriteCond %{REQUEST_METHOD} =OPTIONS
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
