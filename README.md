hostname
hostname -I
ip addr show | grep inet


netstat -tlnp | grep -E ':80|:443|:8080|:8443'


ss -tlnp | grep -E ':80|:443|:8080|:8443'

grep -A 5 "interfaces" $JBOSS_HOME/standalone/configuration/standalone.xml


grep -A 5 "interfaces" $JBOSS_HOME/domain/configuration/host.xml

nslookup sisaq-web.esteiras.des.caixa
nslookup sisaq-web.esteiras.tqs.caixa

getent hosts sisaq-web.esteiras.des.caixa
getent hosts sisaq-web.esteiras.tqs.caixa
