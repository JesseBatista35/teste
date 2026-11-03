ps -ef | grep [h]ttpd | grep -o '\-f [^ ]*' | sort -u

grep -RliE 'sigec|mycluster_sigec' /opt/jbcs-httpd24-2.4/httpd/ 2>/dev/null | grep -v -E 'logs/|\.log'

grep -niE 'VirtualHost|ServerName|ServerAlias|ProxyPass|balancer://|UseAlias|CreateBalancers|ManagerBalancerName|Listen' <arquivo>
