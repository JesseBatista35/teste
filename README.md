
[root@caddeapllx1369 p585600]# ldd --version | head -1
ldd (GNU libc) 2.17
[root@caddeapllx1369 p585600]# cat /etc/redhat-release
Red Hat Enterprise Linux Server release 7.9 (Maipo)
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#



root@caddeapllx1369 p585600]# find / -iname "*.conf" -path "*jboss*" 2>/dev/null
[root@caddeapllx1369 p585600]# find / -iname "jboss-cli.sh" -o -iname "standalone.sh" 2>/dev/null
[root@caddeapllx1369 p585600]# ls -la /opt/ /app/ 2>/dev/null | grep -i jboss
[root@caddeapllx1369 p585600]# ps aux | grep -i eap
root     14603  0.0  0.0 112828   988 pts/0    S+   14:07   0:00 grep --color=auto -i eap
[root@caddeapllx1369 p585600]#
