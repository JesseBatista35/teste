
[root@caddeapllx1369 p585600]# ldd --version | head -1
ldd (GNU libc) 2.17
[root@caddeapllx1369 p585600]# cat /etc/redhat-release
Red Hat Enterprise Linux Server release 7.9 (Maipo)
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#



find / -iname "*.conf" -path "*jboss*" 2>/dev/null
find / -iname "jboss-cli.sh" -o -iname "standalone.sh" 2>/dev/null
ls -la /opt/ /app/ 2>/dev/null | grep -i jboss
ps aux | grep -i eap
