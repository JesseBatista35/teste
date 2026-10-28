   mkdir -p /tmp/bkp_sirotcon && mv /opt/jboss-eap/standalone/deployments/sirotcon-ejb.jar* /tmp/bkp_sirotcon/

      cd /opt/jboss-eap/standalone/deployments
   rm -f sigsj_intranet-ear.ear.failed
   touch sigsj_intranet-ear.ear.dodeploy
   sleep 40; ls -l

      grep -nE "WFLYEE0047|WFLYEJB0473|java:global/sigsj_intranet-ear" /logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log | tail -5
