cd /opt/jboss-eap/standalone/deployments
rm -f sigsj_intranet-ear.ear.failed
touch sigsj_intranet-ear.ear.dodeploy
sleep 40; ls -l
grep -nE "WFLYEE0047|WFLYCTL0412|WFLYJCA0018|SIGSJ04|Caused by" /logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log | tail -15
