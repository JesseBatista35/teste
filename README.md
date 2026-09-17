$JBOSS_HOME/bin/jboss-cli.sh --connect controller=10.116.89.252:9990

/host=*:read-resource

/host=<nome-do-host>/server=sigfi-ecr_node1_lx0093/subsystem=modcluster/mod-cluster-config=configuration:list-proxies-info

/host=<nome-do-host>/server=sigfi-ecr_node1_lx0093/subsystem=modcluster/mod-cluster-config=configuration:enable-context(virtualhost=default-host,context=ecr-web)

