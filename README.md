curl -sv -o /dev/null -H "Host: sigecpor2.des.caixa" http://10.116.78.14/gec-web/por/ 2>&1 | grep -iE 'HTTP/1.1 |Server:|JSESSIONID|Location'
curl -sv -o /dev/null -H "Host: sigec.des.caixa"     http://10.116.78.14/gec-web/por/ 2>&1 | grep -iE 'HTTP/1.1 |Server:|JSESSIONID|Location'
curl -s http://10.116.78.14:6666/mod_cluster-manager | grep -E 'Node|Balancer:|Contexts' -A1
tail -5 /logs/apache2/sigec-portabilidade2/sigecpor2.des.caixa-error.log
tail -5 /logs/apache2/gec-web/sigec.des.caixa-error.log
tail -10 /logs/apache2/sigec/mod_cluster-error.log
grep -n ProxyPass /opt/httpd/conf.d/httpd-sigec.des.conf /opt/httpd/conf.d/httpd-sigecpor2.conf
