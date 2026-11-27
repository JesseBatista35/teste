cd /logs/jboss/jboss-eap/standalone/sigec-portabilidade-batch
ls -lh
grep -n -E "WFLYCTL0013|WFLYCTL0080|WFLYSRV0021|Caused by" server.log | tail -40
head -c 3000 /opt/jboss-eap/standalone/deployments/gec-ear.ear.failed
