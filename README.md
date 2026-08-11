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
Java version: 21.0.5, vendor: Red Hat, Inc., runtime: /usr/java/open-jdk-21.0.5
Default locale: pt_BR, platform encoding: UTF-8
OS name: "linux", version: "5.18.5-100.fc35.x86_64", arch: "amd64", family: "unix"
/opt/apache-maven/apache-maven-3.8.5/bin/mvn -f /opt/ads-agent/_work/9/s/pom.xml clean package -U
[INFO] Scanning for projects...
Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/platform/quarkus-maven-plugin/3.33.2.1/quarkus-maven-plugin-3.33.2.1.pom
Progress (1): 4.1/10 kB
Progress (1): 8.2/10 kB
Progress (1): 10 kB    
                   
Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/platform/quarkus-maven-plugin/3.33.2.1/quarkus-maven-plugin-3.33.2.1.pom (10 kB at 125 kB/s)
Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/platform/quarkus-bom/3.33.2.1/quarkus-bom-3.33.2.1.pom
Progress (1): 4.1/407 kB
Progress (1): 7.7/407 kB
Progress (1): 12/407 kB 
Progress (1): 16/407 kB
Progress (1): 20/407 kB
Progress (1): 24/407 kB
Progress (1): 28/407 kB
Progress (1): 32/407 kB
Progress (1): 36/407 kB
Progress (1): 41/407 kB


mil linhas .... 


Progress (1): 2.3/2.5 MB
Progress (1): 2.3/2.5 MB
Progress (1): 2.3/2.5 MB
Progress (1): 2.3/2.5 MB
Progress (1): 2.4/2.5 MB
Progress (1): 2.4/2.5 MB
Progress (1): 2.4/2.5 MB
Progress (1): 2.4/2.5 MB
Progress (1): 2.4/2.5 MB
Progress (1): 2.4/2.5 MB
Progress (1): 2.4/2.5 MB
Progress (1): 2.5/2.5 MB
Progress (1): 2.5/2.5 MB
Progress (1): 2.5/2.5 MB
Progress (1): 2.5/2.5 MB
Progress (1): 2.5 MB    
                    
Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/mapstruct/mapstruct-processor/1.6.3/mapstruct-processor-1.6.3.jar (2.5 MB at 38 MB/s)
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 68 source files with javac [debug parameters release 21] to target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
##[error] /opt/ads-agent/_work/9/s/src/main/java/br/gov/caixa/siifx/caixinhas/domain/service/saldo/SaldoDataGeneratorService.java(4,28): error :  /opt/ads-agent/_work/9/s/src/main/java/br/gov/caixa/siifx/caixinhas/domain/service/saldo/SaldoDataGeneratorService.java:[4,28] package com.github.javafaker does not exist
##[error] /opt/ads-agent/_work/9/s/src/main/java/br/gov/caixa/siifx/caixinhas/domain/service/saldo/SaldoDataGeneratorService.java(21,19): error :  /opt/ads-agent/_work/9/s/src/main/java/br/gov/caixa/siifx/caixinhas/domain/service/saldo/SaldoDataGeneratorService.java:[21,19] cannot find symbol
[ERROR] /opt/ads-agent/_work/9/s/src/main/java/br/gov/caixa/siifx/caixinhas/domain/service/saldo/SaldoDataGeneratorService.java:[4,28] package com.github.javafaker does not exist
[ERROR] /opt/ads-agent/_work/9/s/src/main/java/br/gov/caixa/siifx/caixinhas/domain/service/saldo/SaldoDataGeneratorService.java:[21,19] cannot find symbol
  symbol:   class Faker
  location: class br.gov.caixa.siifx.caixinhas.domain.service.saldo.SaldoDataGeneratorService
[INFO] 2 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
