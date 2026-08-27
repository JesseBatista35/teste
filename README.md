/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --user='admin' --password='jboss!123' --controller=10.116.89.0:9999

:read-children-names(child-type=deployment)

/host=sbrdeapllx105_corporativo:read-attribute(name=host-state)

