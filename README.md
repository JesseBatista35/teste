cd /opt/jbcs-httpd24-2.4/httpd
grep -niE 'VirtualHost|ServerName|ServerAlias|ProxyPass|balancer://|UseAlias|CreateBalancers|ManagerBalancerName|Listen|Rewrite' \
  sites-enabled/eap_des_71/httpd-sigec.conf \
  sites-enabled/eap_des_71/httpd-sigecpor2.conf
grep -niE 'Include|sites-enabled|ManagerBalancerName|CreateBalancers|UseAlias|EnableMCPMReceive|Listen' httpd_eap_des_71.conf
