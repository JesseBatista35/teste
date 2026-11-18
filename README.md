cd /opt/jboss-eap/standalone/deployments
ls -l --time-style=full-iso
cat gec-ear.ear.failed | head -c 4000
echo; echo ===== ERROS DO LOG =====
grep -E "WELD-|ClassNotFound|NoClassDefFound|Unsatisfied|ERROR|WFLYCTL0013|WFLYSRV0021|WFLYSRV0010" \
  /logs/jboss/jboss-eap/standalone/sigec-portabilidade/server.log | tail -n 40
