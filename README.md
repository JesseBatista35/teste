/host=sbrdeapllx104_credito/server=sigec-portabilidade-batch_node1_lx104:read-attribute(name=server-state)
/host=sbrdeapllx104_credito/server=sigec-portabilidade-batch_node1_lx104:read-children-resources(child-type=deployment, include-runtime=true)
/host=sbrdeapllx104_credito/server-config=sigec-portabilidade-batch_node1_lx104:read-attribute(name=group)


'

No LX104, como root:

LOG=/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade-batch_node1_lx104/server.log
ls -lt $(dirname $LOG) | head
grep -niE "stopped|WFLYSRV0028|WFLYSRV0010|WFLYCTL0013|deploy" $LOG | tail -40
grep -nE "ACTC403|WFLYEJB0241|WFLYEJB0043|OutOfMemory|native thread" $LOG | tail -30
ss -tnp | grep "pid=72951" | grep -cE "10.252.32.6[35]:80"
