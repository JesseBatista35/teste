root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# type mv
mv is aliased to `mv -i'
[root@sspdeaprlx0027 siavl]# alias | grep -i mv
alias mv='mv -i'
[root@sspdeaprlx0027 siavl]# lsattr siavl.conf
-------------e- siavl.conf
[root@sspdeaprlx0027 siavl]# which incrontab 2>/dev/null && incrontab -l 2>/dev/null
[root@sspdeaprlx0027 siavl]# ps aux | grep -i inotify
root     53394  0.0  0.0 103324   912 pts/2    S+   16:50   0:00 grep -i inotify
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# awk 'NR==56 {
>   print "    <Location /siavl-web>"
>   print "        Header always set Access-Control-Allow-Origin \"*\""
>   print "        Header always set Access-Control-Allow-Methods \"GET, POST, PUT, DELETE, OPTIONS\""
>   print "        Header always set Access-Control-Allow-Headers \"Accept, Content-Type, Authorization, Origin, X-Requested-With\""
>   print "    </Location>"
>   next
> }
> NR>=57 && NR<=63 { next }
> { print }
> ' siavl.conf > siavl.conf.NOVO
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# mv -v siavl.conf.NOVO siavl.conf
mv: overwrite `siavl.conf'? yes
[root@sspdeaprlx0027 siavl]# stat siavl.conf
  File: `siavl.conf'
  Size: 3389            Blocks: 8          IO Block: 4096   regular file
Device: fd07h/64775d    Inode: 12515       Links: 1
Access: (0644/-rw-r--r--)  Uid: (    0/    root)   Gid: (    0/    root)
Access: 2026-08-31 12:12:56.731092545 -0300
Modify: 2026-08-31 12:10:30.530041123 -0300
Change: 2026-08-31 12:10:56.757870965 -0300
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]#
[root@sspdeaprlx0027 siavl]# grep -n -A 5 "<Location /siavl-web>" siavl.conf
56:    <Location /siavl-web>
57-        SetEnvIf Origin "^(https?://.*)$" CORS_ORIGIN=$1
58-        Header always set Access-Control-Allow-Origin "%{CORS_ORIGIN}e" env=CORS_ORIGIN
59-        Header always set Access-Control-Allow-Credentials "true"
60-        Header always set Vary "Origin"
61-        Header always set Access-Control-Allow-Methods "GET, POST, PUT, DELETE, OPTIONS"
[root@sspdeaprlx0027 siavl]#
