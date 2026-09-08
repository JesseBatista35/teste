
[p585600@srjdeaprlx049 ~]$
[p585600@srjdeaprlx049 ~]$ ls -la /etc/init.d/ | grep -i sirpl
lrwxrwxrwx   1 root root    82 Aug  4  2018 sirpl.des.https -> /opt/open/apache/2.4.6/https-sirpl.des.intra.corerj.caixa8601/scripts/apache-admin
[p585600@srjdeaprlx049 ~]$
[p585600@srjdeaprlx049 ~]$
[p585600@srjdeaprlx049 ~]$
[p585600@srjdeaprlx049 ~]$ chkconfig --list | grep -i sirpl
[p585600@srjdeaprlx049 ~]$ sudo chkconfig sirpl.des.https off
[p585600@srjdeaprlx049 ~]$ sudo /etc/init.d/sirpl.des.https stop
O site https-sirpl.des.intra.corerj.caixa8601 foi parado com sucesso.
[p585600@srjdeaprlx049 ~]$ ps -ef | grep sirpl
p585600  13792 13180  0 16:12 pts/1    00:00:00 grep sirpl
[p585600@srjdeaprlx049 ~]$ sudo netstat -tulnp | grep 8601
[p585600@srjdeaprlx049 ~]$
[p585600@srjdeaprlx049 ~]$
[p585600@srjdeaprlx049 ~]$
[p585600@srjdeaprlx049 ~]$
[p585600@srjdeaprlx049 ~]$
[p585600@srjdeaprlx049 ~]$
[p585600@srjdeaprlx049 ~]$ sudo mv /opt/open/apache/2.4.6/https-sirpl.des.intra.corerj.caixa8601 /opt/open/apache/2.4.6/https-sirpl.des.intra.corerj.caixa8601.desmobilizado_20260616
[p585600@srjdeaprlx049 ~]$
[p585600@srjdeaprlx049 ~]$
[p585600@srjdeaprlx049 ~]$
[p585600@srjdeaprlx049 ~]$
