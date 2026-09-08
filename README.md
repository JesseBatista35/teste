
[root@caddeapllx2577 p585600]# ls -l /proc/750315/exe
lrwxrwxrwx 1 root root 0 set  8 08:45 /proc/750315/exe -> /opt/httpd/sbin/httpd
[root@caddeapllx2577 p585600]# tr '\0' ' ' < /proc/750315/cmdline; echo
/opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -k start
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# lsof -p 750315 | grep -i -E "conf|log"
bash: lsof: comando não encontrado
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# ls -l /proc/750315/fd | grep -i log
l-wx------ 1 root root 64 set  8 09:52 10 -> /logs/httpd/access_log
l-wx------ 1 root root 64 set  8 09:52 11 -> /logs/httpd/siarg-interno.caixa-access.log
l-wx------ 1 root root 64 set  8 09:52 2 -> /logs/httpd/error_log
l-wx------ 1 root root 64 set  8 09:52 9 -> /logs/httpd/siarg-interno.caixa-error.log
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
