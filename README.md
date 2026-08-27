/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --user='admin' --password='jboss!123' --controller=10.116.89.0:9999

undeploy SIMCN --server-groups=simcn

/deployment=SIMCN:read-resource

/deployment=SIMCN:remove

:read-children-names(child-type=deployment)

/host=sbrdeapllx105_corporativo/server-config=simcn_node1_lx103:start

