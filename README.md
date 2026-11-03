
[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]# curl -sv -o /dev/null -H "Host: sigec-comercial.des.caixa" http://10.116.78.14/gec-web/ 2>&1 | grep -iE 'HTTP/1.1 |Server:|JSESSIONID'
< HTTP/1.1 404 Not Found
< Server: Apache/2.4.57 (Red Hat)
[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]# curl -sv -o /dev/null -H "Host: sigec-csc.des.caixa"       http://10.116.78.14/csc-web/ 2>&1 | grep -iE 'HTTP/1.1 |Server:|JSESSIONID'
< HTTP/1.1 404 Not Found
< Server: Apache/2.4.57 (Red Hat)
[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]# tail -3 /logs/apache2/sigec-portabilidade2/sigecpor2.des.caixa-error.log
[Tue Nov 03 12:08:23.776788 2026] [:error] [pid 4149714:tid 4150159] proxy: CLUSTER: (balancer://mycluster_sigec2). All workers are in error state
[Tue Nov 03 12:10:54.055246 2026] [:error] [pid 4154344:tid 4154785] proxy: CLUSTER: (balancer://mycluster_sigec2). All workers are in error state
[Tue Nov 03 12:10:56.420101 2026] [:error] [pid 4154344:tid 4154787] proxy: CLUSTER: (balancer://mycluster_sigec2). All workers are in error state
[root@caddeapllx2794 p585600]#
