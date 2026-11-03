root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]# cd /opt/httpd/conf.d
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]# sed -i 's/^\(\s*\)CreateBalancers 0$/\1CreateBalancers 1/' mod_cluster.conf
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]# grep -n -A1 ManagerBalancerName mod_cluster.conf     # tem que mostrar "CreateBalancers 1"
12:  ManagerBalancerName mycluster_sigec
13-  CreateBalancers 1
[root@caddeapllx2794 conf.d]# httpd -t
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]# /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -k stop
[root@caddeapllx2794 conf.d]# /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -k start
[root@caddeapllx2794 conf.d]# sleep 30
[root@caddeapllx2794 conf.d]# for i in 1 2 3 4 5; do
  echo "== sigec.des";  curl -sv -o /dev/null -H "Host: sigec.des.caixa"     http://10.116.78.14/gec-web/por/ 2>&1 | grep -oE 'sigec-portabilidade[^"]*_lx104|HTTP/1.1 [0-9]+'
  echo "== sigecpor2";  curl -sv -o /dev/null -H "Host: sigecpor2.des.caixa" http://10.116.78.14/gec-web/por/ 2>&1 | grep -oE 'sigec-portabilidade[^"]*_lx104|HTTP/1.1 [0-9]+'
done
== sigec.des
HTTP/1.1 302
sigec-portabilidade-batch_node1_lx104
== sigecpor2
HTTP/1.1 302
sigec-portabilidade2_node1_lx104
== sigec.des
HTTP/1.1 302
sigec-portabilidade-batch_node1_lx104
== sigecpor2
HTTP/1.1 302
sigec-portabilidade2_node1_lx104
== sigec.des
HTTP/1.1 302
sigec-portabilidade-batch_node1_lx104
== sigecpor2
HTTP/1.1 302
sigec-portabilidade2_node1_lx104
== sigec.des
HTTP/1.1 302
sigec-portabilidade-batch_node1_lx104
== sigecpor2
HTTP/1.1 302
sigec-portabilidade2_node1_lx104
== sigec.des
HTTP/1.1 302
sigec-portabilidade-batch_node1_lx104
== sigecpor2
HTTP/1.1 302
sigec-portabilidade2_node1_lx104
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]# for i in 1 2 3 4 5; do   echo "== sigec.des";  curl -sv -o /dev/null -H "Host: sigec.des.caixa"     http://10.116.78.14/gec-web/por/ 2>&1 | grep -oE 'sigec-portabilidade[^"]*_lx104|HTTP/1.1 [0-9]+';   echo "== sigecpor2";  curl -sv -o /dev/null -H "Host: sigecpor2.des.caixa" http://10.116.78.14/gec-web/por/ 2>&1 | grep -oE 'sigec-portabilidade[^"]*_lx104|HTTP/1.1 [0-9]+'; done
== sigec.des
HTTP/1.1 302
sigec-portabilidade-batch_node1_lx104
== sigecpor2
HTTP/1.1 302
sigec-portabilidade2_node1_lx104
== sigec.des
HTTP/1.1 302
sigec-portabilidade-batch_node1_lx104
== sigecpor2
HTTP/1.1 302
sigec-portabilidade2_node1_lx104
== sigec.des
HTTP/1.1 302
sigec-portabilidade-batch_node1_lx104
== sigecpor2
HTTP/1.1 302
sigec-portabilidade2_node1_lx104
== sigec.des
HTTP/1.1 302
sigec-portabilidade-batch_node1_lx104
== sigecpor2
HTTP/1.1 302
sigec-portabilidade2_node1_lx104
== sigec.des
HTTP/1.1 302
sigec-portabilidade-batch_node1_lx104
== sigecpor2
HTTP/1.1 302
sigec-portabilidade2_node1_lx104
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]# for i in 1 2 3 4 5; do   echo "== sigec.des";  curl -sv -o /dev/null -H "Host: sigec.des.caixa"     http://10.116.78.14/gec-web/por/ 2>&1 | grep -oE 'sigec-portabilidade[^"]*_lx104|HTTP/1.1 [0-9]+';   echo "== sigecpor2";  curl -sv -o /dev/null -H "Host: sigecpor2.des.caixa" http://10.116.78.14/gec-web/por/ 2>&1 | grep -oE 'sigec-portabilidade[^"]*_lx104|HTTP/1.1 [0-9]+'; done
== sigec.des
HTTP/1.1 302
sigec-portabilidade-batch_node1_lx104
== sigecpor2
HTTP/1.1 302
sigec-portabilidade2_node1_lx104
== sigec.des
HTTP/1.1 302
sigec-portabilidade-batch_node1_lx104
== sigecpor2
HTTP/1.1 302
sigec-portabilidade2_node1_lx104
== sigec.des
HTTP/1.1 302
sigec-portabilidade-batch_node1_lx104
== sigecpor2
HTTP/1.1 302
sigec-portabilidade2_node1_lx104
== sigec.des
HTTP/1.1 302
sigec-portabilidade-batch_node1_lx104
== sigecpor2
HTTP/1.1 302
sigec-portabilidade2_node1_lx104
== sigec.des
HTTP/1.1 302
sigec-portabilidade-batch_node1_lx104
== sigecpor2
HTTP/1.1 302
sigec-portabilidade2_node1_lx104
[root@caddeapllx2794 conf.d]#
