
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# find /opt/httpd/conf.d -type f
/opt/httpd/conf.d/vhost.conf
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# find /opt/httpd -iname "*.conf" 2>/dev/null | grep -v conf.modules.d
/opt/httpd/conf/httpd.conf
/opt/httpd/conf.d/vhost.conf
/opt/httpd/modsecurity.d/activated_rules/modsecurity_activatedrules.conf
/opt/httpd/modsecurity.d/local_rules/modsecurity_localrules.conf
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# grep -rl -i siarg /opt/httpd/conf/
/opt/httpd/conf/httpd.conf
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# tail -100 /logs/httpd/siarg-interno.caixa-error.log
[root@caddeapllx2577 p585600]#
