
-sh-4.2$ echo "==HTDOCS CCA==" && \
> ls -la /opt/jbcs-httpd24-2.4/httpd/htdocs/httpd_eap_71_esteiraagil/ | grep -i cca && \
> echo "==CONF CCA ENABLED==" && \
> cat /opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_71_esteiraagil/httpd-eap71-des-sigpf-cca-internet.conf && \
> echo "==BALANCER CCA==" && \
> curl -sk http://localhost/balancer-manager | grep -i cca && \
> echo "==CONF SIGPF-INTERNET ENABLED==" && \
> cat /opt/jbcs-httpd24-2.4/httpd/sites-enabled/eap_71_esteiraagil/httpd-eap71-des-sigpf-internet.conf
==HTDOCS CCA==
-sh-4.2$
