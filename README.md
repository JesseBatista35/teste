/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --user='admin' --password='jboss!123' --controller=10.116.89.0:9999


/host=sbrdeapllx105_corporativo:read-attribute(name=host-state)

undeploy SIMCN --server-groups=simcn

# de volta no bash, ainda no sbrdeapllx105
kill -9 53146
