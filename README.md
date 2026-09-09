como que ano precisa de ajsutge se o pp0d na ta subindo ta dano erro


P
sisgf-backend-des-375-78c4l
CrashLoopBackOff


exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.2.7.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
Error occurred during initialization of VM
agent library failed to init: instrument
Error opening zip file or JAR manifest missing : /deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.2.7.jar


