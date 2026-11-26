CLI="/opt/jboss/jboss-eap/bin/jboss-cli.sh -c --controller=10.116.193.251:9990"
$CLI ':read-attribute(name=server-state)'
$CLI '/subsystem=undertow/server=default-server/ajp-listener=ajp:read-attribute(name=max-post-size)'
