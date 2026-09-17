
[root@sbrdeapllx093 p585600]#
[root@sbrdeapllx093 p585600]#
[root@sbrdeapllx093 p585600]# nslookup sigfi2.desenvolvimento.extracaixa
Server:         10.116.84.160
Address:        10.116.84.160#53

Non-authoritative answer:
Name:   sigfi2.desenvolvimento.extracaixa
Address: 10.116.80.21

[root@sbrdeapllx093 p585600]# $JBOSS_HOME/bin/jboss-cli.sh --connect controller=10.116.89.252:9990
bash: /bin/jboss-cli.sh: No such file or directory
[root@sbrdeapllx093 p585600]#
[root@sbrdeapllx093 p585600]#
[root@sbrdeapllx093 p585600]# /host=*:read-resource
bash: /host=*:read-resource: No such file or directory
[root@sbrdeapllx093 p585600]#
[root@sbrdeapllx093 p585600]# /host=<nome-do-host>/server=sigfi-ecr_node1_lx0093/subsystem=modcluster/mod-cluster-config=configuration:list-proxies-info
bash: nome-do-host: No such file or directory
[root@sbrdeapllx093 p585600]# /host=<nome-do-host>/server=sigfi-ecr_node1_lx0093/subsystem=modcluster/mod-cluster-config=configuration:enable-context(virtualhost=default-host,context=ecr-web)
bash: syntax error near unexpected token `('
[root@sbrdeapllx093 p585600]#
