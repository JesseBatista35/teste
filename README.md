
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ^C
-sh-4.2$ ps -ef | grep -iE '[h]ttpd|[a]pache' | head -3
root      45060      1  0 08:02 ?        00:00:01 /opt/jbcs-httpd24-2.4/httpd/sbin/httpd -d /opt/jbcs-httpd24-2.4/httpd/ -f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_tqs_71_empresarial.conf -k start
root      45061      1  0 08:02 ?        00:00:01 /opt/jbcs-httpd24-2.4/httpd/sbin/httpd -d /opt/jbcs-httpd24-2.4/httpd/ -f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_tqs_71.conf -k start
apache    45132  45060  0 08:02 ?        00:00:00 /opt/jbcs-httpd24-2.4/httpd/sbin/httpd -d /opt/jbcs-httpd24-2.4/httpd/ -f /opt/jbcs-httpd24-2.4/httpd/httpd_eap_tqs_71_empresarial.conf -k start
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ls /opt
azcmagent  CA  ctmage  GC_Ext  GC_Service  jbcs-httpd24-2.4  microsoft  puppetlabs  rh  tivoli
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
