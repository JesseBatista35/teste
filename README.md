o mavem esta com essas advertencias


Starting: Maven
==============================================================================
Task         : Maven
Description  : Build, test, and deploy with Apache Maven
Version      : 3.225.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/build/maven
==============================================================================
/opt/apache-maven/apache-maven-3.8.5/bin/mvn -version
Apache Maven 3.8.5 (3599d3414f046de2324203b78ddcf9b5e4388aa0)
Maven home: /opt/apache-maven/apache-maven-3.8.5
Java version: 11, vendor: Oracle Corporation, runtime: /usr/java/open-jdk-11
Default locale: pt_BR, platform encoding: UTF-8
OS name: "linux", version: "3.10.0-957.10.1.el7.x86_64", arch: "amd64", family: "unix"
/opt/apache-maven/apache-maven-3.8.5/bin/mvn -f /opt/ads-agent/_work/10540/s/sifug_siofg_api/pom.xml clean package -U
[INFO] Scanning for projects...
[WARNING] 
[WARNING] Some problems were encountered while building the effective model for br.org.caixa:siofg-api:jar:1.0.0.1
[WARNING] 'dependencies.dependency.(groupId:artifactId:type:classifier)' must be unique: io.quarkus:quarkus-smallrye-health:jar -> duplicate declaration of version (?) @ line 140, column 15
[WARNING] 'dependencies.dependency.(groupId:artifactId:type:classifier)' must be unique: io.quarkus:quarkus-smallrye-openapi:jar -> duplicate declaration of version (?) @ line 144, column 15
[WARNING] 'dependencies.dependency.(groupId:artifactId:type:classifier)' must be unique: io.quarkus:quarkus-resteasy-jsonb:jar -> duplicate declaration of version (?) @ line 148, column 15
[WARNING] 'dependencies.dependency.(groupId:artifactId:type:classifier)' must be unique: io.quarkus:quarkus-junit5:jar -> duplicate declaration of version (?) @ line 251, column 15
[WARNING] 'dependencies.dependency.(groupId:artifactId:type:classifier)' must be unique: io.rest-assured:rest-assured:jar -> duplicate declaration of version (?) @ line 291, column 15
[WARNING] 
[WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
[WARNING] 
[WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
[WARNING] 
[INFO] 
[INFO] -----------------------< br.org.caixa:siofg-api >-----------------------
[INFO] Building siofg-api 1.0.0.1
[INFO] --------------------------------[ jar ]---------------------------------
Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/br/gov/caixa/sifug-core/01.06.00.002-build/sifug-core-01.06.00.002-build.pom
[WARNING] The POM for br.gov.caixa:sifug-core:jar:01.06.00.002-build is missing, no dependency information available
Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/br/gov/caixa/sifug-util/03.03.02.001-correcao/sifug-util-03.03.02.001-correcao.pom
[WARNING] The POM for br.gov.caixa:sifug-util:jar:03.03.02.001-correcao is missing, no dependency information available
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ siofg-api ---
[INFO] Deleting /opt/ads-agent/_work/10540/s/sifug_siofg_api/target
[INFO] 
