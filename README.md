[root@sbrdeapllx105 p585600]#
[root@sbrdeapllx105 p585600]#
[root@sbrdeapllx105 p585600]# /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --user='admin' --password='jboss!123' --controller=10.116.89.0:9999
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /] /host=sbrdeapllx105_corporativo:read-attribute(name=host-state)
{
    "outcome" => "success",
    "result" => "running"
}
[domain@10.116.89.0:9999 /] undeploy SIMCN --server-groups=simcn
Undeploy failed: java.lang.InterruptedException
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /] undeploy SIMCN --server-groups=simcn
Undeploy failed: java.lang.InterruptedException
[domain@10.116.89.0:9999 /] eixt
Unexpected command 'eixt'. Type 'help --commands' for the list of supported commands.
[domain@10.116.89.0:9999 /] exit
[root@sbrdeapllx105 p585600]# kill -p 53146
bash: kill: p: invalid signal specification
[root@sbrdeapllx105 p585600]# kill-9 53146
bash: kill-9: comando não encontrado
[root@sbrdeapllx105 p585600]# kill -9 53146
[root@sbrdeapllx105 p585600]# /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --user='admin' --password='jboss!123' --controller=10.116.89.0:9999
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /] undeploy SIMCN --server-groups=simcn

