keytool -list -v -keystore /deployments/caixa-truststore-acteste-nprd.jks -storepass changeit 2>/dev/null | grep -i "alias\|sectigo\|issuer"


exec java -Dquarkus.http.host=0.0.0.0 ... -cp . -jar /deployments/quarkus-run.jar


env | grep -i java_opts
env | grep -i quarkus
