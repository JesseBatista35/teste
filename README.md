grep -nE "ERROR|FATAL|OPVDX|WFLYCTL|Unexpected" /opt/jboss-eap/standalone/log/server.log | tail -30
grep -nE "ERROR|FATAL|OPVDX|WFLYCTL" /logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log | tail -30

grep -n "modcluster" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml | head
