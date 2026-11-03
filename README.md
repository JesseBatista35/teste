hostname                     # tem que ser caddeapllx2794
cd /opt/httpd/conf.d
cp -p mod_cluster.conf mod_cluster.conf.antes_fix_20261103
sed -i 's/^\(\s*\)ManagerBalancerName mycluster_sigec$/&\n\1CreateBalancers 0/' mod_cluster.conf
grep -n -A1 ManagerBalancerName mod_cluster.conf     # tem que aparecer "CreateBalancers 0" logo abaixo
httpd -t                                             # tem que dar "Syntax OK"
/opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -k stop
sleep 3
/opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -k start
sleep 30


for h in sigecpor2.des.caixa:/gec-web/por/ sigec.des.caixa:/gec-web/por/ sigec-comercial.des.caixa:/gec-web/ sigec-csc.des.caixa:/csc-web/; do
  echo "== ${h%%:*}"; curl -sv -o /dev/null -H "Host: ${h%%:*}" http://10.116.78.14${h#*:} 2>&1 | grep -iE 'HTTP/1.1 |JSESSIONID'
done


nslookup sigec-comercial.des.caixa
nslookup sigec-csc.des.caixa
