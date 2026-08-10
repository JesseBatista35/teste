Starting: Maven
==============================================================================
Task         : Maven
Description  : Build, test, and deploy with Apache Maven
Version      : 4.225.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/build/maven
==============================================================================
/opt/apache-maven/apache-maven-3.8.5/bin/mvn -version
Apache Maven 3.8.5 (3599d3414f046de2324203b78ddcf9b5e4388aa0)
Maven home: /opt/apache-maven/apache-maven-3.8.5
Java version: 1.8.0_221, vendor: Oracle Corporation, runtime: /usr/java/jdk1.8.0_221/jre
Default locale: pt_BR, platform encoding: UTF-8
OS name: "linux", version: "3.10.0-1062.9.1.el7.x86_64", arch: "amd64", family: "unix"
/opt/apache-maven/apache-maven-3.8.5/bin/mvn -f /opt/ads-agent/_work/7648/s/pom.xml clean compile install -Drevision=790980
[INFO] Scanning for projects...
[WARNING] 
[WARNING] Some problems were encountered while building the effective model for br.gov.caixa.dict:sispi-dict-batch-polling-ear:ear:790980
[WARNING] 'build.plugins.plugin.version' for org.apache.maven.plugins:maven-compiler-plugin is missing. @ br.gov.caixa.dict:sispi-dict-batch-polling:${revision}, /opt/ads-agent/_work/7648/s/pom.xml, line 95, column 12
[WARNING] 'build.plugins.plugin.version' for org.jacoco:jacoco-maven-plugin is missing. @ br.gov.caixa.dict:sispi-dict-batch-polling:${revision}, /opt/ads-agent/_work/7648/s/pom.xml, line 76, column 12
[WARNING] 'build.plugins.plugin.version' for org.jboss.as.plugins:jboss-as-maven-plugin is missing. @ br.gov.caixa.dict:sispi-dict-batch-polling-ear:${revision}, /opt/ads-agent/_work/7648/s/sispi-dict-batch-ear/pom.xml, line 49, column 12
[WARNING] 
[WARNING] Some problems were encountered while building the effective model for br.gov.caixa.dict:sispi-dict-batch-polling-ejb:ejb:790980
[WARNING] 'build.plugins.plugin.version' for org.apache.maven.plugins:maven-compiler-plugin is missing. @ br.gov.caixa.dict:sispi-dict-batch-polling:${revision}, /opt/ads-agent/_work/7648/s/pom.xml, line 95, column 12
[WARNING] 'build.plugins.plugin.version' for org.jacoco:jacoco-maven-plugin is missing. @ br.gov.caixa.dict:sispi-dict-batch-polling:${revision}, /opt/ads-agent/_work/7648/s/pom.xml, line 76, column 12
[WARNING] 
[WARNING] Some problems were encountered while building the effective model for br.gov.caixa.dict:sispi-dict-batch-polling-war:war:790980
[WARNING] 'build.plugins.plugin.version' for org.apache.maven.plugins:maven-compiler-plugin is missing. @ br.gov.caixa.dict:sispi-dict-batch-polling:${revision}, /opt/ads-agent/_work/7648/s/pom.xml, line 95, column 12
[WARNING] 'build.plugins.plugin.version' for org.jacoco:jacoco-maven-plugin is missing. @ br.gov.caixa.dict:sispi-dict-batch-polling:${revision}, /opt/ads-agent/_work/7648/s/pom.xml, line 76, column 12
[WARNING] 
[WARNING] Some problems were encountered while building the effective model for br.gov.caixa.dict:sispi-dict-batch-polling:pom:790980
[WARNING] 'build.plugins.plugin.version' for org.apache.maven.plugins:maven-compiler-plugin is missing. @ br.gov.caixa.dict:sispi-dict-batch-polling:${revision}, /opt/ads-agent/_work/7648/s/pom.xml, line 95, column 12
[WARNING] 'build.plugins.plugin.version' for org.jacoco:jacoco-maven-plugin is missing. @ br.gov.caixa.dict:sispi-dict-batch-polling:${revision}, /opt/ads-agent/_work/7648/s/pom.xml, line 76, column 12
[WARNING] 
[WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.


[WARNING] 
[WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
[WARNING] 
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO] 
[INFO] sispi-dict-batch-polling                                           [pom]
[INFO] sispi-dict-batch-polling-ejb                                       [ejb]
[INFO] sispi-dict-batch-war                                               [war]
[INFO] sispi-dict-batch-polling-ear                                       [ear]
[INFO] 
[INFO] -------------< br.gov.caixa.dict:sispi-dict-batch-polling >-------------
[INFO] Building sispi-dict-batch-polling 790980                           [1/4]
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ sispi-dict-batch-polling ---
[INFO] 
[INFO] --- jacoco-maven-plugin:0.8.15:prepare-agent (agent-for-ut) @ sispi-dict-batch-polling ---
[INFO] argLine set to -javaagent:/opt/ads-agent/.m2/repository/org/jacoco/org.jacoco.agent/0.8.15/org.jacoco.agent-0.8.15-runtime.jar=destfile=/opt/ads-agent/_work/7648/s/target/jacoco.exec
[INFO] 
[INFO] --- jacoco-maven-plugin:0.8.15:prepare-agent (agent-for-ut) @ sispi-dict-batch-polling ---
[INFO] argLine set to -javaagent:/opt/ads-agent/.m2/repository/org/jacoco/org.jacoco.agent/0.8.15/org.jacoco.agent-0.8.15-runtime.jar=destfile=/opt/ads-agent/_work/7648/s/target/jacoco.exec
[INFO] 
[INFO] --- jacoco-maven-plugin:0.8.15:report (post-unit-test) @ sispi-dict-batch-polling ---
[INFO] Skipping JaCoCo execution due to missing execution data file.
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ sispi-dict-batch-polling ---
[INFO] Installing /opt/ads-agent/_work/7648/s/pom.xml to /opt/ads-agent/.m2/repository/br/gov/caixa/dict/sispi-dict-batch-polling/790980/sispi-dict-batch-polling-790980.pom
[INFO] 
[INFO] -----------< br.gov.caixa.dict:sispi-dict-batch-polling-ejb >-----------
[INFO] Building sispi-dict-batch-polling-ejb 790980                       [2/4]
[INFO] --------------------------------[ ejb ]---------------------------------
Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/br/gov/caixa/dict/simpi-dict-api-model/2.26.0.0/simpi-dict-api-model-2.26.0.0.pom
Progress (1): 414 B

Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/br/gov/caixa/dict/simpi-dict-api-model/2.26.0.0/simpi-dict-api-model-2.26.0.0.jar (453 kB at 352 kB/s)
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ sispi-dict-batch-polling-ejb ---
[INFO] Deleting /opt/ads-agent/_work/7648/s/sispi-dict-batch-ejb/target
[INFO] 
[INFO] --- jacoco-maven-plugin:0.8.15:prepare-agent (agent-for-ut) @ sispi-dict-batch-polling-ejb ---
[INFO] argLine set to -javaagent:/opt/ads-agent/.m2/repository/org/jacoco/org.jacoco.agent/0.8.15/org.jacoco.agent-0.8.15-runtime.jar=destfile=/opt/ads-agent/_work/7648/s/sispi-dict-batch-ejb/target/jacoco.exec
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ sispi-dict-batch-polling-ejb ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 3 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ sispi-dict-batch-polling-ejb ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 316 source files to /opt/ads-agent/_work/7648/s/sispi-dict-batch-ejb/target/classes
[WARNING] /opt/ads-agent/_work/7648/s/sispi-dict-batch-ejb/src/main/java/br/gov/caixa/spi/dict/ejb/UsuarioServicoEJB.java: Some input files use or override a deprecated API.
[WARNING] /opt/ads-agent/_work/7648/s/sispi-dict-batch-ejb/src/main/java/br/gov/caixa/spi/dict/ejb/UsuarioServicoEJB.java: Recompile with -Xlint:deprecation for details.
[WARNING] /opt/ads-agent/_work/7648/s/sispi-dict-batch-ejb/src/main/java/br/gov/caixa/spi/dict/dao/ReconciliacaoDao.java: Some input files use unchecked or unsafe operations.
[WARNING] /opt/ads-agent/_work/7648/s/sispi-dict-batch-ejb/src/main/java/br/gov/caixa/spi/dict/dao/ReconciliacaoDao.java: Recompile with -Xlint:unchecked for details.
[INFO] 
[INFO] --- jacoco-maven-plugin:0.8.15:prepare-agent (agent-for-ut) @ sispi-dict-batch-polling-ejb ---
[INFO] argLine set to -javaagent:/opt/ads-agent/.m2/repository/org/jacoco/org.jacoco.agent/0.8.15/org.jacoco.agent-0.8.15-runtime.jar=destfile=/opt/ads-agent/_work/7648/s/sispi-dict-batch-ejb/target/jacoco.exec
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ sispi-dict-batch-polling-ejb ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 3 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ sispi-dict-batch-polling-ejb ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ sispi-dict-batch-polling-ejb ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 2 resources


WARNING] /opt/ads-agent/_work/7648/s/sispi-dict-batch-ejb/src/test/java/br/gov/caixa/spi/dict/ejb/EventoDevolucaoBacenEjbTest.java: Some input files use unchecked or unsafe operations.
[WARNING] /opt/ads-agent/_work/7648/s/sispi-dict-batch-ejb/src/test/java/br/gov/caixa/spi/dict/ejb/EventoDevolucaoBacenEjbTest.java: Recompile with -Xlint:unchecked for details.
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ sispi-dict-batch-polling-ejb ---
[INFO] Surefire report directory: /opt/ads-agent/_work/7648/s/sispi-dict-batch-ejb/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running br.gov.caixa.spi.dict.util.DataUtilsTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.135 sec
Running br.gov.caixa.spi.dict.util.DictNameNormalizerTest
Tests run: 14, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.02 sec
Running br.gov.caixa.spi.dict.util.RelatoInfracaoUtilTest
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec
Running br.gov.caixa.spi.dict.ejb.FilaControleTempoEjbTest
log4j:WARN No appenders could be found for logger (br.gov.caixa.spi.dict.ejb.FilaControleTempoEjb).
log4j:WARN Please initialize the log4j system properly.
log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.32 sec
Running br.gov.caixa.spi.dict.ejb.ValidacaoPosseChaveEjbTest
Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.018 sec


Running br.gov.caixa.spi.dict.factory.ReconciliacaoFactoryTest
Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec
Running br.gov.caixa.spi.dict.factory.PoliticaLimitacaoFactoryTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec
Running br.gov.caixa.spi.dict.sibar.SibarEjbTest
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.004 sec



Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.018 sec
Running br.gov.caixa.spi.dict.ejb.EventoDevolucaoPixAutomaticoTest
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.055 sec
Running br.gov.caixa.spi.dict.ejb.EventoDevolucaoAbertaAutomaticoEjbTest
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.017 sec
Running br.gov.caixa.spi.dict.ejb.FuncionalidadeSistemaEjbTest
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.007 sec
Running br.gov.caixa.spi.dict.ejb.ChavesCorrecaoBacenEjbTest
Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.038 sec
Running br.gov.caixa.spi.dict.ejb.PushEjbTest
Tests run: 15, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.032 sec
Running br.gov.caixa.spi.dict.ejb.PoliticaLimitacaoEjbTest
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.695 sec
Running br.gov.caixa.spi.dict.ejb.PagamentoEjbTest
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.011 sec
Running br.gov.caixa.spi.dict.ejb.CidsEjbTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.014 sec
Running br.gov.caixa.spi.dict.ejb.RelatoInfracaoManualEjbTest
Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.024 sec
Running br.gov.caixa.spi.dict.ejb.ValidacaoPosseChaveDaoTest
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 sec
Running br.gov.caixa.spi.dict.ejb.FecharDevolucaoEjbTest
Tests run: 60, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.149 sec
Running br.gov.caixa.spi.dict.ejb.ChaveEjbTest
Tests run: 58, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 282.353 sec
Running br.gov.caixa.spi.dict.ejb.DevolucaoPagamentoEjbTest
Tests run: 11, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.013 sec
Running br.gov.caixa.spi.dict.ejb.ParametroSPIEjbTest
Tests run: 79, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.017 sec
Running br.gov.caixa.spi.dict.ejb.ContaEjbTest
Tests run: 27, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.033 sec
Running br.gov.caixa.spi.dict.ejb.MigracaoContaEjbTest
Tests run: 9, Failures: 0, Errors: 0, Skipped: 0, Time e
Results :

Failed tests:   testTrataNovaDevolucaoPixAutomaticoSucesso(br.gov.caixa.spi.dict.ejb.EventoDevolucaoBacenHelperEjbTest)

Tests run: 684, Failures: 1, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for sispi-dict-batch-polling 790980:
[INFO] 
[INFO] sispi-dict-batch-polling ........................... SUCCESS [  0.481 s]
[INFO] sispi-dict-batch-polling-ejb ....................... FAILURE [05:02 min]
[INFO] sispi-dict-batch-war ............................... SKIPPED
[INFO] sispi-dict-batch-polling-ear ....................... SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  05:02 min
[INFO] Finished at: 2026-08-06T20:42:15-03:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.12.4:test (default-test) on project sispi-dict-batch-polling-ejb: There are test failures.
[ERROR] 
[ERROR] Please refer to /opt/ads-agent/_work/7648/s/sispi-dict-batch-ejb/target/surefire-reports for the individual test results.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
[ERROR] 
[ERROR] After correcting the problems, you can resume the build with the command
[ERROR]   mvn <args> -rf :sispi-dict-batch-polling-ejb
The process '/opt/apache-maven/apache-maven-3.8.5/bin/mvn' failed with exit code 1
