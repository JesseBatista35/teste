 Downloaded from central: https://repo.maven.apache.org/maven2/org/xmlunit/xmlunit-parent/2.10.2/xmlunit-parent-2.10.2.pom (23 kB at 1.1 MB/s)
  #16 59.72 Downloading from github: https://maven.pkg.github.com/caixagithub/siaci-lib-integracao-core-java/com/oracle/database/jdbc/ojdbc11/23.7.0.25.01/ojdbc11-23.7.0.25.01.pom
  #16 59.85 Downloading from central: https://repo.maven.apache.org/maven2/com/oracle/database/jdbc/ojdbc11/23.7.0.25.01/ojdbc11-23.7.0.25.01.pom
  #16 59.87 Progress (1): 996 B
  Progress (1): 1.5 kB
                      
  Downloaded from central: https://repo.maven.apache.org/maven2/com/oracle/database/jdbc/ojdbc11/23.7.0.25.01/ojdbc11-23.7.0.25.01.pom (1.5 kB at 73 kB/s)
  #16 59.87 Downloading from github: https://maven.pkg.github.com/caixagithub/siaci-lib-integracao-core-java/com/unisys/br/jrac/jrac/17.0/jrac-17.0.pom
  #16 59.99 Downloading from central: https://repo.maven.apache.org/maven2/com/unisys/br/jrac/jrac/17.0/jrac-17.0.pom
  #16 60.31 Downloading from github: https://maven.pkg.github.com/caixagithub/siaci-lib-integracao-core-java/br/gov/caixa/siaci/lib-integracao-core-java-comunicacao/0.0.1/lib-integracao-core-java-comunicacao-0.0.1.pom
  #16 60.44 Downloading from central: https://repo.maven.apache.org/maven2/br/gov/caixa/siaci/lib-integracao-core-java-comunicacao/0.0.1/lib-integracao-core-java-comunicacao-0.0.1.pom
  #16 60.70 Downloading from github: https://maven.pkg.github.com/caixagithub/siaci-lib-integracao-core-java/br/gov/caixa/siaci/lib-integracao-core-java-resolver/0.0.1/lib-integracao-core-java-resolver-0.0.1.pom
  #16 60.82 Downloading from central: https://repo.maven.apache.org/maven2/br/gov/caixa/siaci/lib-integracao-core-java-resolver/0.0.1/lib-integracao-core-java-resolver-0.0.1.pom
  #16 61.08 Downloading from github: https://maven.pkg.github.com/caixagithub/siaci-lib-integracao-core-java/br/gov/caixa/siaci/lib-integracao-core-java-autorizacao/0.0.1/lib-integracao-core-java-autorizacao-0.0.1.pom
  #16 61.20 Downloading from central: https://repo.maven.apache.org/maven2/br/gov/caixa/siaci/lib-integracao-core-java-autorizacao/0.0.1/lib-integracao-core-java-autorizacao-0.0.1.pom
  #16 61.49 [INFO] ------------------------------------------------------------------------
  #16 61.49 [INFO] BUILD FAILURE
  #16 61.49 [INFO] ------------------------------------------------------------------------
  #16 61.49 [INFO] Total time:  59.727 s
  #16 61.49 [INFO] Finished at: 2026-08-05T20:38:43Z
  #16 61.49 [INFO] ------------------------------------------------------------------------
  #16 61.49 [ERROR] Failed to execute goal on project api-integracao-padrao-java: Could not collect dependencies for project br.gov.caixa.siaci:api-integracao-padrao-java:jar:0.0.1
  #16 61.49 [ERROR] Failed to read artifact descriptor for com.unisys.br.jrac:jrac:jar:17.0
  #16 61.49 [ERROR] 	Caused by: The following artifacts could not be resolved: com.unisys.br.jrac:jrac:pom:17.0 (absent): Could not transfer artifact com.unisys.br.jrac:jrac:pom:17.0 from/to github (https://maven.pkg.github.com/caixagithub/siaci-lib-integracao-core-java): status code: 401, reason phrase: Unauthorized (401)
  #16 61.49 [ERROR] Failed to read artifact descriptor for br.gov.caixa.siaci:lib-integracao-core-java-comunicacao:jar:0.0.1
  #16 61.49 [ERROR] 	Caused by: The following artifacts could not be resolved: br.gov.caixa.siaci:lib-integracao-core-java-comunicacao:pom:0.0.1 (absent): Could not transfer artifact br.gov.caixa.siaci:lib-integracao-core-java-comunicacao:pom:0.0.1 from/to github (https://maven.pkg.github.com/caixagithub/siaci-lib-integracao-core-java): status code: 401, reason phrase: Unauthorized (401)
  #16 61.49 [ERROR] Failed to read artifact descriptor for br.gov.caixa.siaci:lib-integracao-core-java-resolver:jar:0.0.1
  #16 61.49 [ERROR] 	Caused by: The following artifacts could not be resolved: br.gov.caixa.siaci:lib-integracao-core-java-resolver:pom:0.0.1 (absent): Could not transfer artifact br.gov.caixa.siaci:lib-integracao-core-java-resolver:pom:0.0.1 from/to github (https://maven.pkg.github.com/caixagithub/siaci-lib-integracao-core-java): status code: 401, reason phrase: Unauthorized (401)
  #16 61.49 [ERROR] Failed to read artifact descriptor for br.gov.caixa.siaci:lib-integracao-core-java-autorizacao:jar:0.0.1
  #16 61.49 [ERROR] 	Caused by: The following artifacts could not be resolved: br.gov.caixa.siaci:lib-integracao-core-java-autorizacao:pom:0.0.1 (absent): Could not transfer artifact br.gov.caixa.siaci:lib-integracao-core-java-autorizacao:pom:0.0.1 from/to github (https://maven.pkg.github.com/caixagithub/siaci-lib-integracao-core-java): status code: 401, reason phrase: Unauthorized (401)
  #16 61.49 [ERROR] 
  #16 61.49 [ERROR] -> [Help 1]
  #16 61.49 [ERROR] 
  #16 61.49 [ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
  #16 61.49 [ERROR] Re-run Maven using the -X switch to enable full debug logging.
  #16 61.49 [ERROR] 
  #16 61.49 [ERROR] For more information about the errors and possible solutions, please read the following articles:
  #16 61.49 [ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/DependencyResolutionException
  #16 ERROR: process "/bin/sh -c ./mvnw clean package -DskipTests" did not complete successfully: exit code: 1
  ------
   > importing cache manifest from acrcentralcaixanprd.azurecr.io/siaci/api-integracao-padrao-java/siaci-api-integracao-padrao-java:buildcache:
  ------
  ------
   > [build 8/8] RUN ./mvnw clean package -DskipTests:
  61.49 [ERROR] Failed to read artifact descriptor for br.gov.caixa.siaci:lib-integracao-core-java-autorizacao:jar:0.0.1
  61.49 [ERROR] 	Caused by: The following artifacts could not be resolved: br.gov.caixa.siaci:lib-integracao-core-java-autorizacao:pom:0.0.1 (absent): Could not transfer artifact br.gov.caixa.siaci:lib-integracao-core-java-autorizacao:pom:0.0.1 from/to github (https://maven.pkg.github.com/caixagithub/siaci-lib-integracao-core-java): status code: 401, reason phrase: Unauthorized (401)
  61.49 [ERROR] 
  61.49 [ERROR] -> [Help 1]
  61.49 [ERROR] 
  61.49 [ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
  61.49 [ERROR] Re-run Maven using the -X switch to enable full debug logging.
  61.49 [ERROR] 
  61.49 [ERROR] For more information about the errors and possible solutions, please read the following articles:
  61.49 [ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/DependencyResolutionException
  ------
  Dockerfile:18
  --------------------
    16 |     
    17 |     # Compila o projeto
    18 | >>> RUN ./mvnw clean package -DskipTests
    19 |     
    20 |     # Imagem final
  --------------------
  ERROR: failed to build: failed to solve: process "/bin/sh -c ./mvnw clean package -DskipTests" did not complete successfully: exit code: 1
Reference
Check build summary support
  Error: buildx failed with: ERROR: failed to build: failed to solve: process "/bin/sh -c ./mvnw clean package -DskipTests" did not complete successfully: exit code: 1
