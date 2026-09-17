
[root@sbrdeapllx093 p585600]# /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect controller=10.116.89.252:9999
[domain@10.116.89.252:9999 /] /host=*:read-children-names(child-type=host)
Failed to get the list of the operation properties: "JBAS014883: No resource definition is registered for address [("host" => "*")]"
[domain@10.116.89.252:9999 /] /host=<nome-do-host>/server=sigfi-ecr_node1_lx0093/subsystem=modcluster/mod-cluster-config=configuration:list-proxies-info
{
    "outcome" => "failed",
    "failure-description" => "JBAS014883: No resource definition is registered for address [
    (\"host\" => \"<nome-do-host>\"),
    (\"server\" => \"sigfi-ecr_node1_lx0093\"),
    (\"subsystem\" => \"modcluster\"),
    (\"mod-cluster-config\" => \"configuration\")
]",
    "rolled-back" => true
}
[domain@10.116.89.252:9999 /]
