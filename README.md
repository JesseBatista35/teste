

[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$ chkconfig --list | grep -i sirpl
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$ sudo chkconfig sirpl.tqs.https off
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$ ls -la /etc/rc3.d/ | grep -i sirpl
lrwxrwxrwx   1 root root   25 Sep  8 15:45 K05sirpl.tqs.https -> ../init.d/sirpl.tqs.https
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$ ls -la /etc/rc5.d/ | grep -i sirpl
lrwxrwxrwx   1 root root   25 Sep  8 15:45 K05sirpl.tqs.https -> ../init.d/sirpl.tqs.https
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$ sudo /etc/init.d/sirpl.tqs.https stop
O site https-sirpl.tqs.intra.corerj.caixa8604 foi parado com sucesso.
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$ ps -ef | grep sirpl
p585600  124196 122903  0 15:46 pts/1    00:00:00 grep sirpl
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$ sudo netstat -tulnp | grep 8604
[p585600@srjtqaprlx015 ~]$ ^C
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$ ps -ef | grep -i node
p585600  124267 122903  0 15:47 pts/1    00:00:00 grep -i node
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$ sudo netstat -tulnp | grep 8601
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$ ls -la /etc/init.d/ | grep -i sirpl
lrwxrwxrwx   1 root root    82 Aug  4  2018 sirpl.tqs.https -> /opt/open/apache/2.4.6/https-sirpl.tqs.intra.corerj.caixa8604/scripts/apache-admin
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$ chkconfig --list | grep -i sirpl
sirpl.tqs.https 0:off   1:off   2:off   3:off   4:off   5:off   6:off
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$ sudo chkconfig sirpl.des.https off
error reading information on service sirpl.des.https: No such file or directory
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$ sudo /etc/init.d/sirpl.des.https stop
sudo: /etc/init.d/sirpl.des.https: command not found
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$ ps -ef | grep sirpl
p585600  124463 122903  0 15:48 pts/1    00:00:00 grep sirpl
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$ sudo netstat -tulnp | grep 8601
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$ sudo mv /opt/open/apache/2.4.6/https-sirpl.tqs.intra.corerj.caixa8604 /opt/open/apache/2.4.6/https-sirpl.tqs.intra.corerj.caixa8604.desmobilizado_20260616
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
[p585600@srjtqaprlx015 ~]$
