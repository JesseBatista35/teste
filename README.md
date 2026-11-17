jtqapllx0056 p585600]#
[root@srjtqapllx0056 p585600]#
[root@srjtqapllx0056 p585600]#
[root@srjtqapllx0056 p585600]#
[root@srjtqapllx0056 p585600]# LOG=/opt/open/jboss/7.0.0/domain/servers/srjtqapllx0056_sigaf_intra_8083/log
[root@srjtqapllx0056 p585600]#
[root@srjtqapllx0056 p585600]#
[root@srjtqapllx0056 p585600]#
[root@srjtqapllx0056 p585600]# ls -lt $LOG | head -20
total 8
-rw-r--r-- 1 spjbotr2 jboss 7742 May 31  2022 server.log
[root@srjtqapllx0056 p585600]#
[root@srjtqapllx0056 p585600]#
[root@srjtqapllx0056 p585600]# grep -c -iE "APFAP327" $LOG/server.log*
0
[root@srjtqapllx0056 p585600]#
[root@srjtqapllx0056 p585600]#
[root@srjtqapllx0056 p585600]# grep -n -iE "APFAP327|indisponibilidade|IdmsJdbc|jcicsdirect|IJ0|SQLException|Exception" $LOG/server.log* | tail -150
[root@srjtqapllx0056 p585600]# grep -n "APFAP327" $LOG/server.log | tail -3
[root@srjtqapllx0056 p585600]# sed -n 'LINHA-10,LINHA+40p' $LOG/server.log
sed: -e expression #1, char 2: extra characters after command
[root@srjtqapllx0056 p585600]# ss -tnp | grep "pid=69590"
[root@srjtqapllx0056 p585600]#



voce ta mandando um monte de comando que ano da anda
