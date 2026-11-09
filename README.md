sudo grep -nE "WFLYSRV0025|WFLYSRV0026|WFLYCTL|ERROR|modcluster|framework" /logs/jboss/jboss-eap/standalone/siemp-java-web/server.log | tail -30
ss -lnt | grep -E ":9990|:8080|:8009"
ls -l /opt/jboss-eap/standalone/deployments/
