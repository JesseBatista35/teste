
-sh-4.2$
-sh-4.2$
-sh-4.2$ ps -ef | grep [h]ttpd | grep -o '\-f [^ ]*' | sort -u
-f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_des_71.conf
-f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_des_71_empresarial.conf
-f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_des_71_empresarial_inter.conf
-f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_tqs_71.conf
-f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_tqs_71_empresarial.conf
-f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_tqs_71_empresarial_inter.conf
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -RliE 'sigec|mycluster_sigec' /opt/jbcs-httpd24-2.4/httpd/ 2>/dev/null | grep -v -E 'logs/|\.log'
/opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_des_71/httpd-sigec.conf
/opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_des_71/.httpd-sigecpor2.conf.20260317150332.p515324
/opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_des_71/httpd-sigecpor2.conf
/opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_des_71/httpd-sigecpor3.conf
/opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_des_71/httpd-sigecpor1.conf
/opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_des_71/.httpd-sigec.conf.20251017101058.a590589
/opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_des_71/.httpd-sigecpor1.conf.20190906150920.a738390
/opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_des_71/.httpd-sigecpor1.conf.20190906150933.a738390
/opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_des_71/.httpd-sigecpor2.conf.20190906150933.a738390
/opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_des_71/.httpd-sigec.conf.20251015201042.a590589
/opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_des_71/.httpd-sigecpor2.conf.20190906150943.a738390
/opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_des_71/.httpd-sigec.conf.20251015211016.a590589
/opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_des_71/.httpd-sigecpor3.conf.20190906150947.a738390
/opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_des_71/httpd-sigec-csc.conf
/opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_des_71/httpd-sigec-comercial.conf
/opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_des_71/.httpd-sigec.conf.20251015211025.a590589
/opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_des_71/.httpd-sigec.conf.20251015211049.a590589
/opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_des_71/.httpd-sigec.conf.20251016111014.a590589
/opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_des_71/.httpd-sigecpor2.conf.20251017101040.a590589
/opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_des_71/.httpd-sigecpor2.conf.20251017101050.a590589
/opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_tqs_71/httpd-sigec.conf
/opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_tqs_71/httpd-sigec-csc.conf
/opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_tqs_71/httpd-sigec-comercial.conf
/opt/jbcs-httpd24-2.4/httpd/sites-avaliable/eap_des_71/httpd-sigec.conf
/opt/jbcs-httpd24-2.4/httpd/sites-avaliable/eap_des_71/httpd-sigec.conf.bkp
/opt/jbcs-httpd24-2.4/httpd/sites-avaliable/eap_des_71/httpd-sigec-csc.conf
/opt/jbcs-httpd24-2.4/httpd/sites-avaliable/eap_des_71/httpd-sigecpor2.conf
/opt/jbcs-httpd24-2.4/httpd/sites-avaliable/eap_des_71/.httpd-sigecpor2.conf.20190829100821.p590589
/opt/jbcs-httpd24-2.4/httpd/sites-avaliable/eap_des_71/httpd-sigecpor3.conf
/opt/jbcs-httpd24-2.4/httpd/sites-avaliable/eap_des_71/.httpd-sigecpor3.conf.20190829100815.p590589
/opt/jbcs-httpd24-2.4/httpd/sites-avaliable/eap_des_71/httpd-sigecpor1.conf
/opt/jbcs-httpd24-2.4/httpd/sites-avaliable/eap_des_71/.httpd-sigecpor2.conf.20190902120921.a738390
/opt/jbcs-httpd24-2.4/httpd/sites-avaliable/eap_des_71/.httpd-sigecpor2.conf.20190902120958.a738390
/opt/jbcs-httpd24-2.4/httpd/sites-avaliable/eap_des_71/.httpd-sigecpor3.conf.20190902120907.a738390
/opt/jbcs-httpd24-2.4/httpd/sites-avaliable/eap_des_71/.httpd-sigecpor1.conf.20190912110904.a738390
/opt/jbcs-httpd24-2.4/httpd/sites-avaliable/eap_des_71/httpd-sigec-comercial.conf
/opt/jbcs-httpd24-2.4/httpd/sites-avaliable/eap_des_71/.httpd-sigec.conf.20250926190912.p635388
/opt/jbcs-httpd24-2.4/httpd/sites-avaliable/eap_des_71/.httpd-sigecpor1.conf.20250926190938.p635388
/opt/jbcs-httpd24-2.4/httpd/sites-avaliable/eap_tqs_71/httpd-sigec.conf
/opt/jbcs-httpd24-2.4/httpd/sites-avaliable/eap_tqs_71/httpd-sigec-comercial.conf
/opt/jbcs-httpd24-2.4/httpd/sites-avaliable/eap_tqs_71/.httpd-sigec.conf.20190318180344.a712753
/opt/jbcs-httpd24-2.4/httpd/sites-avaliable/eap_tqs_71/httpd-sigec-csc.conf
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -niE 'VirtualHost|ServerName|ServerAlias|ProxyPass|balancer://|UseAlias|CreateBalancers|ManagerBalancerName|Listen' <arquivo>
-sh: syntax error near unexpected token `newline'
-sh-4.2$
-sh-4.2$
