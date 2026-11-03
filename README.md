grep -RniE 'CreateBalancers|UseAlias' /opt/jbcs-httpd24-2.4/httpd/ 2>/dev/null | grep -vE 'logs/|\.log'
