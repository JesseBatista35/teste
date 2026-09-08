
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
[p585600@srjtqaprlx015 ~]$
