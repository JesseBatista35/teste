Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
siarx-backend-autoridade-registro
Repository navigation
Code
Issues
Pull requests
Actions
Projects
Wiki
Security and quality
2
 (2)
Insights
Settings
CI/CD Workflow Generic
caixagithub/siarx-backend-autoridade-registro_main_38740866749.2 #2
All jobs
Run details
CI_DES / BUILD / BUILD
failed 8 minutes ago in 3m 3s
Search logs
7s
1s
1s
1s
13s
0s
10s
1m 14s
0s
46s
  #12 DONE 0.1s
  #13 [build 5/5] RUN mvn clean package -DskipTests -Djavax.net.ssl.trustStore=/tmp/binario.jks
  #13 2.682 [INFO] Scanning for projects...
  #13 3.300 Downloading from Nexus Caixa: https://binario.caixa/repository/caixa-group-br/io/quarkus/platform/quarkus-maven-plugin/3.33.0/quarkus-maven-plugin-3.33.0.pom
  #13 5.638 [WARNING] The POM for io.quarkus.platform:quarkus-maven-plugin:jar:3.33.0 is missing, no dependency information available
  #13 5.708 Downloading from Nexus Caixa: https://binario.caixa/repository/caixa-group-br/io/quarkus/platform/quarkus-maven-plugin/3.33.0/quarkus-maven-plugin-3.33.0.jar
  #13 6.346 Downloading from Nexus Caixa: https://binario.caixa/repository/caixa-group-br/io/quarkus/platform/quarkus-bom/3.33.0/quarkus-bom-3.33.0.pom
  #13 6.695 [ERROR] [ERROR] Some problems were encountered while processing the POMs:
  #13 6.699 [ERROR] Unresolveable build extension: Plugin io.quarkus.platform:quarkus-maven-plugin:3.33.0 or one of its dependencies could not be resolved:
  #13 6.699 	Could not find artifact io.quarkus.platform:quarkus-maven-plugin:jar:3.33.0 in Nexus Caixa (https://binario.caixa/repository/caixa-group-br)
  #13 6.699  @ 
  #13 6.699 [ERROR] Non-resolvable import POM: The following artifacts could not be resolved: io.quarkus.platform:quarkus-bom:pom:3.33.0 (absent): Could not find artifact io.quarkus.platform:quarkus-bom:pom:3.33.0 in Nexus Caixa (https://binario.caixa/repository/caixa-group-br) @ line 22, column 25
  #13 6.699 [ERROR] 'dependencies.dependency.version' for io.quarkus:quarkus-rest:jar is missing. @ line 33, column 21
  #13 6.699 [ERROR] 'dependencies.dependency.version' for io.quarkus:quarkus-rest-jackson:jar is missing. @ line 37, column 21
  #13 6.699 [ERROR] 'dependencies.dependency.version' for io.quarkus:quarkus-hibernate-orm-panache:jar is missing. @ line 41, column 21
  #13 6.699 [ERROR] 'dependencies.dependency.version' for io.quarkus:quarkus-arc:jar is missing. @ line 45, column 21
  #13 6.705 [ERROR] 'dependencies.dependency.version' for io.quarkus:quarkus-hibernate-orm:jar is missing. @ line 49, column 21
  #13 6.705 [ERROR] 'dependencies.dependency.version' for io.quarkus:quarkus-jdbc-h2:jar is missing. @ line 53, column 21
  #13 6.705 [ERROR] 'dependencies.dependency.version' for io.quarkus:quarkus-junit5:jar is missing. @ line 57, column 21
  #13 6.705 [ERROR] 'dependencies.dependency.version' for io.rest-assured:rest-assured:jar is missing. @ line 62, column 21
  #13 6.705  @ 
  #13 6.706 [ERROR] The build could not read 1 project -> [Help 1]
  #13 6.706 [ERROR]   
  #13 6.708 [ERROR]   The project br.caixa.gov.siarx:backend-autoridade-registro:1.0.0 (/pom.xml) has 10 errors
  #13 6.710 [ERROR]     Unresolveable build extension: Plugin io.quarkus.platform:quarkus-maven-plugin:3.33.0 or one of its dependencies could not be resolved:
  #13 6.710 [ERROR]     	Could not find artifact io.quarkus.platform:quarkus-maven-plugin:jar:3.33.0 in Nexus Caixa (https://binario.caixa/repository/caixa-group-br)
  #13 6.712 [ERROR]     -> [Help 2]
  #13 6.714 [ERROR]     Non-resolvable import POM: The following artifacts could not be resolved: io.quarkus.platform:quarkus-bom:pom:3.33.0 (absent): Could not find artifact io.quarkus.platform:quarkus-bom:pom:3.33.0 in Nexus Caixa (https://binario.caixa/repository/caixa-group-br) @ line 22, column 25 -> [Help 3]
  #13 6.716 [ERROR]     'dependencies.dependency.version' for io.quarkus:quarkus-rest:jar is missing. @ line 33, column 21
  #13 6.720 [ERROR]     'dependencies.dependency.version' for io.quarkus:quarkus-rest-jackson:jar is missing. @ line 37, column 21
  #13 6.720 [ERROR]     'dependencies.dependency.version' for io.quarkus:quarkus-hibernate-orm-panache:jar is missing. @ line 41, column 21
  #13 6.720 [ERROR]     'dependencies.dependency.version' for io.quarkus:quarkus-arc:jar is missing. @ line 45, column 21
  #13 6.720 [ERROR]     'dependencies.dependency.version' for io.quarkus:quarkus-hibernate-orm:jar is missing. @ line 49, column 21
  #13 6.720 [ERROR]     'dependencies.dependency.version' for io.quarkus:quarkus-jdbc-h2:jar is missing. @ line 53, column 21
  #13 6.720 [ERROR]     'dependencies.dependency.version' for io.quarkus:quarkus-junit5:jar is missing. @ line 57, column 21
  #13 6.720 [ERROR]     'dependencies.dependency.version' for io.rest-assured:rest-assured:jar is missing. @ line 62, column 21
  #13 6.722 [ERROR] 
  #13 6.722 [ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
  #13 6.722 [ERROR] Re-run Maven using the -X switch to enable full debug logging.
  #13 6.722 [ERROR] 
  #13 6.722 [ERROR] For more information about the errors and possible solutions, please read the following articles:
  #13 6.722 [ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/ProjectBuildingException
  #13 6.722 [ERROR] [Help 2] http://cwiki.apache.org/confluence/display/MAVEN/PluginManagerException
  #13 6.722 [ERROR] [Help 3] http://cwiki.apache.org/confluence/display/MAVEN/UnresolvableModelException
  #13 ERROR: process "/bin/sh -c mvn clean package -DskipTests -Djavax.net.ssl.trustStore=/tmp/binario.jks" did not complete successfully: exit code: 1
  ------
   > importing cache manifest from acrcentralcaixanprd.azurecr.io/siarx/backend-autoridade-registro/siarx-backend-autoridade-registro:buildcache:
  ------
  ------
   > [build 5/5] RUN mvn clean package -DskipTests -Djavax.net.ssl.trustStore=/tmp/binario.jks:
  6.720 [ERROR]     'dependencies.dependency.version' for io.quarkus:quarkus-junit5:jar is missing. @ line 57, column 21
  6.720 [ERROR]     'dependencies.dependency.version' for io.rest-assured:rest-assured:jar is missing. @ line 62, column 21
  6.722 [ERROR] 
  6.722 [ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
  6.722 [ERROR] Re-run Maven using the -X switch to enable full debug logging.
  6.722 [ERROR] 
  6.722 [ERROR] For more information about the errors and possible solutions, please read the following articles:
  6.722 [ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/ProjectBuildingException
  6.722 [ERROR] [Help 2] http://cwiki.apache.org/confluence/display/MAVEN/PluginManagerException
  6.722 [ERROR] [Help 3] http://cwiki.apache.org/confluence/display/MAVEN/UnresolvableModelException
  ------
  Dockerfile:6
  --------------------
     4 |     COPY actions/config/certs/binario.jks /tmp/binario.jks
     5 |     COPY . .
     6 | >>> RUN mvn clean package -DskipTests -Djavax.net.ssl.trustStore=/tmp/binario.jks
     7 |     
     8 |     FROM registry.access.redhat.com/ubi9/openjdk-25:latest AS deploy
  --------------------
  ERROR: failed to build: failed to solve: process "/bin/sh -c mvn clean package -DskipTests -Djavax.net.ssl.trustStore=/tmp/binario.jks" did not complete successfully: exit code: 1
Reference
    builder-68d1f00b-dfb7-4524-a989-47cbd7a6832a/builder-68d1f00b-dfb7-4524-a989-47cbd7a6832a0/xybl7l3lrpfeth561uxlit3yo
Check build summary support
    Build summary supported!
  Error: buildx failed with: ERROR: failed to build: failed to solve: process "/bin/sh -c mvn clean package -DskipTests -Djavax.net.ssl.trustStore=/tmp/binario.jks" did not complete successfully: exit code: 1
0s
14s
Post job cleanup.
Build and push
4s
Checkout DevSecOps config repo
1s
Login to Docker
1s
Set up Docker Buildx
3s
Set up QEMU
6s
  Post job cleanup.
Post cache
    Caching docker.io--tonistiigi--binfmt-latest-linux-x64 to GitHub Actions cache
    (node:4359) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
    (Use `node --trace-deprecation ...` to show where the warning was created)
    /usr/bin/tar --posix -cf cache.tgz --exclude cache.tgz -P -C /home/runner/_work/siarx-backend-autoridade-registro/siarx-backend-autoridade-registro --files-from manifest.txt -z
    (node:4359) [DEP0169] DeprecationWarning: `url.parse()` behavior is not standardized and prone to errors that have security implications. Use the WHATWG URL API instead. CVEs are not issued for `url.parse()` vulnerabilities.
    Sent 1048576 of 32555176 (3.2%), 1.0 MBs/sec
    Sent 23855104 of 32555176 (73.3%), 11.3 MBs/sec
    Sent 32555176 of 32555176 (100.0%), 12.5 MBs/sec
1s
1s
0s
1s
0s
