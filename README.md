sudo cp /tmp/framework-2.0.1-des.jar /opt/jboss-eap/standalone/deployments/framework.jar
sudo chown jboss:jboss /opt/jboss-eap/standalone/deployments/framework.jar
sudo rm -f /opt/jboss-eap/standalone/deployments/siemp-ear.ear.failed
sudo touch /opt/jboss-eap/standalone/deployments/siemp-ear.ear.dodeploy
sudo tail -f /logs/jboss/jboss-eap/standalone/siemp-java-web/server.log | grep -E "WFLYSRV0010|WFLYCTL0013|ERROR"
