
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# lsattr /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl02/siavl02.conf
-------------e- /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl02/siavl02.conf
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# ps aux | grep -iE "puppet|ansible|chef|salt|cfengine"
root     16332  0.0  0.6 316572 24476 ?        Ss   May11   5:32 /opt/puppetlabs/puppet/bin/ruby /opt/puppetlabs/puppet/bin/puppet agent
root     18112  0.0  0.0 103324   944 pts/3    S+   12:24   0:00 grep -iE puppet|ansible|chef|salt|cfengine
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# mv /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl02/siavl02.conf.NOVO /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl02/siavl02.conf
mv: overwrite `/opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl02/siavl02.conf'?
[root@sspdeaprlx0027 siavl05]# mv /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl02/siavl02.conf.NOVO /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl02/siavl02.conf
mv: overwrite `/opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl02/siavl02.conf'? yes
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]# stat /opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl02/siavl02.conf
  File: `/opt/apache/jbcs-httpd24-2.4/httpd/conf.d/siavl02/siavl02.conf'
  Size: 2979            Blocks: 8          IO Block: 4096   regular file
Device: fd07h/64775d    Inode: 12514       Links: 1
Access: (0644/-rw-r--r--)  Uid: (    0/    root)   Gid: (    0/    root)
Access: 2026-08-31 12:15:27.559113832 -0300
Modify: 2026-08-31 12:15:27.535113989 -0300
Change: 2026-08-31 12:24:58.669406959 -0300
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
[root@sspdeaprlx0027 siavl05]#
