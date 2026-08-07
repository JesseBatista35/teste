 @ 
[ERROR] The build could not read 1 project -> [Help 1]
[ERROR]   
[ERROR]   The project br.gov.caixa.sispi:SISPI-qrcode-api-credenciamento:3.0.0-SNAPSHOT (/opt/ads-agent/_work/10559/s/pom.xml) has 22 errors
[ERROR]     Non-resolvable import POM: Could not transfer artifact com.redhat.quarkus.platform:quarkus-bom:pom:3.15.7.redhat-00001 from/to Nexus Caixa (http://binario.caixa:8081/repository/caixa-group-br): /opt/ads-agent/.m2/repository/com/redhat/quarkus/platform/quarkus-bom/3.15.7.redhat-00001/quarkus-bom-3.15.7.redhat-00001.pom.part.lock (Arquivo ou diretório não encontrado) @ line 39, column 25 -> [Help 2]
[ERROR]     'dependencies.dependency.version' for io.quarkus:quarkus-arc:jar is missing. @ line 50, column 21
[ERROR]     'dependencies.dependency.version' for io.quarkus:quarkus-hibernate-orm:jar is missing. @ line 68, column 21
[ERROR]     'dependencies.dependency.version' for io.quarkus:quarkus-jdbc-oracle:jar is missing. @ line 72, column 21
[ERROR]     'dependencies.dependency.version' for io.quarkus:quarkus-hibernate-validator:jar is missing. @ line 78, column 21
[ERROR]     'dependencies.dependency.version' for io.quarkus:quarkus-scheduler:jar is missing. @ line 91, column 21
[ERROR]     'dependencies.dependency.version' for io.quarkus:quarkus-cache:jar is missing. @ line 97, column 21
[ERROR]     'dependencies.dependency.version' for io.quarkus:quarkus-rest:jar is missing. @ line 103, column 21
[ERROR]     'dependencies.dependency.version' for io.quarkus:quarkus-rest-client:jar is missing. @ line 107, column 21
[ERROR]     'dependencies.dependency.version' for io.quarkus:quarkus-smallrye-fault-tolerance:jar is missing. @ line 111, column 21
[ERROR]     'dependencies.dependency.version' for io.quarkus:quarkus-rest-jackson:jar is missing. @ line 115, column 21
[ERROR]     'dependencies.dependency.version' for io.quarkus:quarkus-rest-client-jackson:jar is missing. @ line 119, column 21
[ERROR]     'dependencies.dependency.version' for io.quarkus:quarkus-smallrye-health:jar is missing. @ line 132, column 21
[ERROR]     'dependencies.dependency.version' for io.quarkus:quarkus-undertow:jar is missing. @ line 138, column 21
[ERROR]     'dependencies.dependency.version' for io.quarkus:quarkus-smallrye-openapi:jar is missing. @ line 144, column 21
[ERROR]     'dependencies.dependency.version' for io.quarkus:quarkus-messaging-amqp:jar is missing. @ line 170, column 21
[ERROR]     'dependencies.dependency.version' for io.quarkus:quarkus-jsonb:jar is missing. @ line 174, column 21
[ERROR]     'dependencies.dependency.version' for io.quarkus:quarkus-smallrye-metrics:jar is missing. @ line 203, column 21
[ERROR]     'dependencies.dependency.version' for io.quarkus:quarkus-junit5:jar is missing. @ line 249, column 21
[ERROR]     'dependencies.dependency.version' for io.quarkus:quarkus-junit5-mockito:jar is missing. @ line 254, column 21
[ERROR]     'dependencies.dependency.version' for org.mockito:mockito-junit-jupiter:jar is missing. @ line 259, column 21
[ERROR]     'dependencies.dependency.version' for io.rest-assured:rest-assured:jar is missing. @ line 264, column 21
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/ProjectBuildingException
[ERROR] [Help 2] http://cwiki.apache.org/confluence/display/MAVEN/UnresolvableModelException
The process '/opt/apache-maven/apache-maven-3.8.5/bin/mvn' failed with exit code 1
Could not retrieve code analysis results - Maven run failed.
##[error]Build failed.
Finishing: Maven
