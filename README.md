find /opt/jboss/jboss-eap -iname "*.xml" 2>/dev/null | grep -i "domain\|host"


grep -ril "orad01ng\|cnpexdadvm01\|siouv" /opt/jboss/jboss-eap/hc/ 2>/dev/null

grep -i "orad01ng\|connection-url\|jndi-name\|pool-name" -B5 -A5 <caminho_do_arquivo_encontrado>

cat /opt/jboss/jboss-eap/hc/configuration/host-slave.xml | grep -i "domain-controller\|remote"

/opt/jboss/jboss-eap/bin/jboss-cli.sh -c --controller=10.116.88.30:9990

/host=*/server=siouv_node1_lx0002/subsystem=datasources:read-resource(recursive=true)**

**
