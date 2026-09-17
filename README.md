/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect controller=10.116.89.252:9999

/host=*:read-children-names(child-type=host)

/host=<nome-do-host>/server=sigfi-ecr_node1_lx0093/subsystem=modcluster/mod-cluster-config=configuration:list-proxies-info
