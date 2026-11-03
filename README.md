CLI="/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999"
$CLI --command='/server-group=sigec-portabilidade2:read-attribute(name=profile)'
$CLI --command='/server-group=sigec-portabilidade-batch:read-attribute(name=socket-binding-group)'
$CLI --command='/profile=full-ha-sigec-portabilidade-batch/subsystem=modcluster:read-resource(recursive=true)'

$CLI --command='/socket-binding-group=<nome retornado>:read-resource(recursive=true)' | grep -B2 -A6 -iE 'outbound|6666'
