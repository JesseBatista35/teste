
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
