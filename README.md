/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=remote://10.116.89.0:9999

grep -A3 'server-identities' /opt/jboss/jboss-eap/hc/configuration/host-slave.xml
# pegue o valor de <secret value="..."/> e decodifique:
echo '<VALOR>' | base64 -d; echo

/server-group=sigec-portabilidade-batch:restart-servers(blocking=true)
