[p585600@caddeapllx1945 ~]$ sudo su
[sudo] senha para p585600:
[root@caddeapllx1945 p585600]# mkdir -p/logs/jboss
mkdir: opção inválida -- “/”
Tente "mkdir --help" para mais informações.
[root@caddeapllx1945 p585600]# mkdir -p /logs/jboss
[root@caddeapllx1945 p585600]#
[root@caddeapllx1945 p585600]#
[root@caddeapllx1945 p585600]#
[root@caddeapllx1945 p585600]# chow -R jboss:jboss /logs/jboss
bash: chow: comando não encontrado
[root@caddeapllx1945 p585600]# chown -R jboss:jboss /logs/jboss
[root@caddeapllx1945 p585600]# chmod -R 755 /logs/jboss
[root@caddeapllx1945 p585600]#
[root@caddeapllx1945 p585600]#
[root@caddeapllx1945 p585600]#
[root@caddeapllx1945 p585600]# ls -la /logs/
total 4
drwxr-xr-x.  5 root   root     51 jun 16 11:45 .
dr-xr-xr-x. 20 root   root   4096 jun 16 11:46 ..
drwxrwxr-x   2 apache apache  118 jun 16 11:46 httpd
drwxr-xr-x   3 jboss  jboss    41 jun 16 11:47 jboss
drwxr-xr-x   2 apache apache   46 jun 16 11:45 monitoracao
[root@caddeapllx1945 p585600]#

