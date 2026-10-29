ls -l /opt/jboss-eap/standalone/deployments/
grep -nE "WFLYSRV0025|WFLYSRV0026|CONNECTOR-FARM|Caused by" /logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log | tail -10
