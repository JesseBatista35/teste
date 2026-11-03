
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]# ps -ef | gre httpd
bash: gre: command not found
[root@caddeapllx2794 conf.d]# ps -ef | grep httpd
root      577303       1  0 Oct07 ?        00:07:01 /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -k start
root     4148460 4147814  0 11:14 pts/4    00:00:00 vim httpd-sigec-comercial.conf
apache   4149703  577303  0 11:43 ?        00:00:00 /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -k start
apache   4149714  577303  0 11:43 ?        00:00:00 /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -k start
root     4150288 4148740  0 11:44 pts/1    00:00:00 grep --color=auto httpd
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]# curl -sv -o /dev/null -H "Host: sigecpor2.des.caixa" http://10.116.78.14/gec-web/por/ 2>&1 | grep -iE 'HTTP/1.1|JSESSIONID'
> GET /gec-web/por/ HTTP/1.1
< HTTP/1.1 503 Service Unavailable
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]# curl -sv -o /dev/null -H "Host: sigec.des.caixa"     http://10.116.78.14/gec-web/por/ 2>&1 | grep -iE 'HTTP/1.1|JSESSIONID'
> GET /gec-web/por/ HTTP/1.1
< HTTP/1.1 404 Not Found
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#


<img width="1850" height="917" alt="image" src="https://github.com/user-attachments/assets/488f1c39-0c18-4e58-baea-674bb023a937" />
