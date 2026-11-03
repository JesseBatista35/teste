curl -sv -o /dev/null -H "Host: sigec.des.caixa" http://10.116.98.52/gec-web/por/ 2>&1 | grep -iE 'HTTP/1.1 |Server:|JSESSIONID'


/opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -k stop
sleep 3; ps -ef | grep [h]ttpd       # confirmar que parou
/opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -k start

curl -s http://10.116.78.14:6666/mod_cluster-manager | grep -E 'Node|Balancer:' -A1
curl -sv -o /dev/null -H "Host: sigecpor2.des.caixa" http://10.116.78.14/gec-web/por/ 2>&1 | grep -iE 'HTTP/1.1 |Server:|JSESSIONID'
