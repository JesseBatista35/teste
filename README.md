ps -ef | grep sigec-portabilidade-batch | grep -v grep
tail -300 /opt/jboss/jboss-eap/hc/servers/sigec-portabilidade-batch_node1_lx104/log/server.log
grep -nE "ACTC403|WFLYEJB0241|WFLYEJB0043|OutOfMemory|native thread|stopped" /opt/jboss/jboss-eap/hc/servers/sigec-portabilidade-batch_node1_lx104/log/server.log | tail -50


/usr/lib/jvm/jdk-1.8.0_471-oracle-x64/bin/jstack -F <pid> > /tmp/jstack_batch_$(date +%Y%m%d_%H%M).txt
ss -tnp | grep "pid=<pid>" | grep -cE "10.252.32.6[35]:80"

exit   # sai do root
ssh p585600@10.116.89.0
sudo su
/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999

/host=sbrdeapllx104_credito/server-config=sigec-portabilidade-batch_node1_lx104:read-attribute(name=status)
