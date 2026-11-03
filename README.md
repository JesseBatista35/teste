

**ls /opt/httpd/conf /opt/httpd/conf.d
cat /opt/httpd/conf.d/mod_cluster.conf
cat /opt/httpd/conf.d/httpd-sigec.des.conf /opt/httpd/conf.d/httpd-sigecpor2.conf
grep -RniE 'ProxyPass|BalancerMember|balancer://|ManagerBalancerName|EnableMCPMReceive|ServerAdvertise|AdvertiseGroup|CreateBalancers|UseAlias|SetHandler' /opt/httpd/conf /opt/httpd/conf.d


curl -s http://10.116.78.14:6666/mod_cluster-manager


curl -sv -o /dev/null -H "Host: sigec.des.caixa"     http://10.116.78.14/
curl -sv -o /dev/null -H "Host: sigecpor2.des.caixa" http://10.116.78.14/


ssh p585600@10.116.89.0
sudo su
/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999

/server-group=sigec-portabilidade-batch:read-attribute(name=profile)
/server-group=sigec-portabilidade2:read-attribute(name=profile)

/profile=<perfil>/subsystem=modcluster:read-resource(recursive=true)
/profile=<perfil>/subsystem=undertow/server=default-server/host=default-host:read-attribute(name=alias)**
