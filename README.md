cd /opt/httpd/conf.d
sed -i 's/^\(\s*\)CreateBalancers 0$/\1CreateBalancers 1/' mod_cluster.conf
grep -n -A1 ManagerBalancerName mod_cluster.conf     # tem que mostrar "CreateBalancers 1"
httpd -t
/opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -k stop
sleep 3
/opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -k start
sleep 30


for i in 1 2 3 4 5; do
  echo "== sigec.des";  curl -sv -o /dev/null -H "Host: sigec.des.caixa"     http://10.116.78.14/gec-web/por/ 2>&1 | grep -oE 'sigec-portabilidade[^"]*_lx104|HTTP/1.1 [0-9]+'
  echo "== sigecpor2";  curl -sv -o /dev/null -H "Host: sigecpor2.des.caixa" http://10.116.78.14/gec-web/por/ 2>&1 | grep -oE 'sigec-portabilidade[^"]*_lx104|HTTP/1.1 [0-9]+'
done
