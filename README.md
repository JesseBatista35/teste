/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999


:read-children-names(child-type=host)
/host=sbrdeapllx104_credito:read-attribute(name=host-state)
