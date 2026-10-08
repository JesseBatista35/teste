oc logs -n openshift-sdn sdn-rprgw -c sdn --since=72h | grep -i -E "10.116.221.46|egress" | tail -50

oc logs -n openshift-sdn sdn-rprgw -c sdn > /tmp/sdn-084.log
grep -c . /tmp/sdn-084.log
grep -i "10.116.221.46" /tmp/sdn-084.log | tail -30

oc exec -n openshift-sdn sdn-rprgw -c sdn -- iptables -t nat -S | grep -i 10.116.221.46
oc exec -n openshift-sdn sdn-rprgw -c sdn -- ip -4 addr | grep -B2 10.116.221.46


