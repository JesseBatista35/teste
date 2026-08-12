java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -cp . -jar /deployments/quarkus-run.jar > /tmp/out.log 2>&1
echo "EXIT CODE: $?"
cat /tmp/out.log
wc -l /tmp/out.log


java -Dquarkus.log.level=DEBUG -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -cp . -jar /deployments/quarkus-run.jar 2>&1 | tee /tmp/debug.log
