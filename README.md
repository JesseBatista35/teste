Para descobrir os outros IPs sem precisar perguntar pro time, execute:
bashgrep -r "sigpf\|194\." /opt/jbcs-httpd24-2.4/httpd/sites-available/httpd-eap71-des-SIGPF-internet-backend.conf
E também:
bashcat /etc/hosts | grep -i sigpf
Pode ser que os outros nós já estejam referenciados em algum lugar nesse servidor.
