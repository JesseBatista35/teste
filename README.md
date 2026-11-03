sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -RniE 'CreateBalancers|UseAlias' /opt/jbcs-httpd24-2.4/httpd/ 2>/dev/null | grep -vE 'logs/|\.log'
Binary file /opt/jbcs-httpd24-2.4/httpd/modules/mod_proxy_cluster.so matches
/opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_des_71_empresarial/httpd-sinrp.conf:8:    CreateBalancers 1
/opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_des_71_empresarial/.httpd-sinrp.conf.20190408180452.a712753:8:    CreateBalancers 1
/opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_des_71_empresarial/.httpd-sinrp.conf.20190408180411.a712753:8:    CreateBalancers 1
/opt/jbcs-httpd24-2.4/httpd/sites-avaliable/eap_des_71/httpd-sinrp.conf.20180401-1653:8:    CreateBalancers 1
/opt/jbcs-httpd24-2.4/httpd/sites-avaliable/eap_des_71/httpd-sinrp.conf.old:8:#    CreateBalancers 1
/opt/jbcs-httpd24-2.4/httpd/sites-avaliable/eap_des_71/httpd-sinrp.conf:8:    CreateBalancers 1
/opt/jbcs-httpd24-2.4/httpd/sites-avaliable/eap_tqs_71/httpd-simsc.conf:8:    CreateBalancers 1
/opt/jbcs-httpd24-2.4/httpd/sites-avaliable/eap_tqs_71/httpd-siasc.conf:8:    CreateBalancers 1
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ curl -sv -o /dev/null -H "Host: sigec.des.caixa" http://10.116.98.52/gec-web/por/ 2>&1 | grep -iE 'HTTP/1.1 |Server:|JSESSIONID'
< HTTP/1.1 404 Not Found
< Server: Apache
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -k stop
-sh: /opt/httpd/sbin/httpd: No such file or directory
-sh-4.2$
-sh-4.2$
-sh-4.2$ sleep 3; ps -ef | grep [h]ttpd
root      64676      1  0 Oct13 ?        00:05:06 /opt/jbcs-httpd24-2.4/httpd/sbin/httpd -d /opt/jbcs-httpd24-2.4/httpd/ -f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_des_71_empresarial_inter.conf -k start
apache    64678  64676  0 Oct13 ?        00:00:00 /opt/jbcs-httpd24-2.4/httpd/sbin/httpd -d /opt/jbcs-httpd24-2.4/httpd/ -f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_des_71_empresarial_inter.conf -k start
apache    64680  64676  0 Oct13 ?        00:06:18 /opt/jbcs-httpd24-2.4/httpd/sbin/httpd -d /opt/jbcs-httpd24-2.4/httpd/ -f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_des_71_empresarial_inter.conf -k start
apache    64683  64676  0 Oct13 ?        00:07:04 /opt/jbcs-httpd24-2.4/httpd/sbin/httpd -d /opt/jbcs-httpd24-2.4/httpd/ -f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_des_71_empresarial_inter.conf -k start
root      64869      1  0 Oct13 ?        00:05:00 /opt/jbcs-httpd24-2.4/httpd/sbin/httpd -d /opt/jbcs-httpd24-2.4/httpd/ -f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_tqs_71_empresarial_inter.conf -k start
apache    64872  64869  0 Oct13 ?        00:00:00 /opt/jbcs-httpd24-2.4/httpd/sbin/httpd -d /opt/jbcs-httpd24-2.4/httpd/ -f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_tqs_71_empresarial_inter.conf -k start
apache    64874  64869  0 Oct13 ?        00:06:10 /opt/jbcs-httpd24-2.4/httpd/sbin/httpd -d /opt/jbcs-httpd24-2.4/httpd/ -f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_tqs_71_empresarial_inter.conf -k start
apache    64875  64869  0 Oct13 ?        00:06:55 /opt/jbcs-httpd24-2.4/httpd/sbin/httpd -d /opt/jbcs-httpd24-2.4/httpd/ -f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_tqs_71_empresarial_inter.conf -k start
root      65866      1  0 12:02 ?        00:00:00 /opt/jbcs-httpd24-2.4/httpd/sbin/httpd -d /opt/jbcs-httpd24-2.4/httpd/ -f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_tqs_71_empresarial.conf -k start
root      65868      1  0 12:02 ?        00:00:00 /opt/jbcs-httpd24-2.4/httpd/sbin/httpd -d /opt/jbcs-httpd24-2.4/httpd/ -f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_des_71_empresarial.conf -k start
root      65872      1  0 12:02 ?        00:00:00 /opt/jbcs-httpd24-2.4/httpd/sbin/httpd -d /opt/jbcs-httpd24-2.4/httpd/ -f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_tqs_71.conf -k start
apache    66055  65866  0 12:02 ?        00:00:00 /opt/jbcs-httpd24-2.4/httpd/sbin/httpd -d /opt/jbcs-httpd24-2.4/httpd/ -f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_tqs_71_empresarial.conf -k start
apache    66056  65872  0 12:02 ?        00:00:00 /opt/jbcs-httpd24-2.4/httpd/sbin/httpd -d /opt/jbcs-httpd24-2.4/httpd/ -f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_tqs_71.conf -k start
apache    66057  65868  0 12:02 ?        00:00:00 /opt/jbcs-httpd24-2.4/httpd/sbin/httpd -d /opt/jbcs-httpd24-2.4/httpd/ -f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_des_71_empresarial.conf -k start
apache    66060  65866  0 12:02 ?        00:00:00 /opt/jbcs-httpd24-2.4/httpd/sbin/httpd -d /opt/jbcs-httpd24-2.4/httpd/ -f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_tqs_71_empresarial.conf -k start
apache    66062  65868  0 12:02 ?        00:00:00 /opt/jbcs-httpd24-2.4/httpd/sbin/httpd -d /opt/jbcs-httpd24-2.4/httpd/ -f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_des_71_empresarial.conf -k start
apache    66063  65866  0 12:02 ?        00:00:00 /opt/jbcs-httpd24-2.4/httpd/sbin/httpd -d /opt/jbcs-httpd24-2.4/httpd/ -f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_tqs_71_empresarial.conf -k start
apache    66064  65872  0 12:02 ?        00:00:00 /opt/jbcs-httpd24-2.4/httpd/sbin/httpd -d /opt/jbcs-httpd24-2.4/httpd/ -f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_tqs_71.conf -k start
apache    66065  65872  0 12:02 ?        00:00:00 /opt/jbcs-httpd24-2.4/httpd/sbin/httpd -d /opt/jbcs-httpd24-2.4/httpd/ -f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_tqs_71.conf -k start
apache    66085  65868  0 12:02 ?        00:00:00 /opt/jbcs-httpd24-2.4/httpd/sbin/httpd -d /opt/jbcs-httpd24-2.4/httpd/ -f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_des_71_empresarial.conf -k start
root      66291      1  0 12:02 ?        00:00:00 /opt/jbcs-httpd24-2.4/httpd/sbin/httpd -d /opt/jbcs-httpd24-2.4/httpd/ -f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_des_71.conf -k start
apache    66293  66291  0 12:02 ?        00:00:00 /opt/jbcs-httpd24-2.4/httpd/sbin/httpd -d /opt/jbcs-httpd24-2.4/httpd/ -f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_des_71.conf -k start
apache    66295  66291  0 12:02 ?        00:00:01 /opt/jbcs-httpd24-2.4/httpd/sbin/httpd -d /opt/jbcs-httpd24-2.4/httpd/ -f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_des_71.conf -k start
apache    66313  66291  0 12:02 ?        00:00:01 /opt/jbcs-httpd24-2.4/httpd/sbin/httpd -d /opt/jbcs-httpd24-2.4/httpd/ -f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_des_71.conf -k start
-sh-4.2$ /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -k start
-sh: /opt/httpd/sbin/httpd: No such file or directory
-sh-4.2$ curl -s http://10.116.78.14:6666/mod_cluster-manager | grep -E 'Node|Balancer:' -A1
-sh-4.2$ curl -sv -o /dev/null -H "Host: sigecpor2.des.caixa" http://10.116.78.14/gec-web/por/ 2>&1 | grep -iE 'HTTP/1.1 |Server:|JSESSIONID'
< HTTP/1.1 503 Service Unavailable
< Server: Apache/2.4.57 (Red Hat)
-sh-4.2$
