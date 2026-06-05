-sh-4.2$ oc logs -n sicbc-des sicbc-backend-des-17-5jxn2 --tail=50
exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
-sh-4.2$
