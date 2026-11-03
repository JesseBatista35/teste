$CLI --command='/host=sbrdeapllx104_credito/server-config=sigec-portabilidade-batch_node1_lx104:read-attribute(name=status)'

cd /opt/httpd/conf.d
cp -p mod_cluster.conf mod_cluster.conf.antes_fix_20261103
sed -i 's/^\(\s*\)ManagerBalancerName mycluster_sigec$/&\n\1CreateBalancers 0/' mod_cluster.conf
grep -n -A1 ManagerBalancerName mod_cluster.conf
httpd -t
/opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -k stop
sleep 3
/opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -k start
sleep 30
curl -sv -o /dev/null -H "Host: sigec.des.caixa"     http://10.116.78.14/gec-web/por/ 2>&1 | grep -iE 'HTTP/1.1 |JSESSIONID'
curl -sv -o /dev/null -H "Host: sigecpor2.des.caixa" http://10.116.78.14/gec-web/por/ 2>&1 | grep -iE 'HTTP/1.1 |JSESSIONID'
