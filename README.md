026-10-09T18:41:39.4494776Z ##[section]Starting: SAST: Análise Java [Síncrona]
2026-10-09T18:41:39.4499326Z ==============================================================================
2026-10-09T18:41:39.4499411Z Task         : Fortify ScanCentral SAST Assessment
2026-10-09T18:41:39.4499477Z Description  : Installs ScanCentral client and performs a static analysis using ScanCentral
2026-10-09T18:41:39.4499582Z Version      : 7.5.0
2026-10-09T18:41:39.4499628Z Author       : Micro Focus
2026-10-09T18:41:39.4499738Z Help         : 
2026-10-09T18:41:39.4499806Z ==============================================================================
2026-10-09T18:41:39.7342040Z ScanCentral Controller URL: http://sast.caixa/scancentral-ctrl
2026-10-09T18:41:40.5232551Z Caching tool: scancentral 24.4.0 x64
2026-10-09T18:41:40.5812107Z Prepending PATH environment variable with directory: /opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/bin
2026-10-09T18:41:40.5818731Z Setting scancentral home
2026-10-09T18:41:40.5819160Z Skipping scan central home as it is self-hosted
2026-10-09T18:41:40.5819670Z Working Directory: /opt/ads-agent/_work/13/s
2026-10-09T18:41:40.5868609Z [command]/opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/bin/scancentral -url http://sast.caixa/scancentral-ctrl start --upload-to-ssc --ssc-upload-token *** --application SIIFX-api-aplicacao --application-version 1.77.18 --build-tool mvn --build-command package -U -Dproject.version=1.77.18.1 -DskipTests=true --build-file /opt/ads-agent/_work/13/s/pom.xml --translation-args -Dcom.fortify.sca.NullPtrMaxFunctionTime=30000 --translation-args -Dcom.fortify.sca.exclude.unimported.node.modules=true --translation-args -Dcom.fortify.sca.EnableDOMModeling=true --translation-args -Dcom.fortify.sca.fileextensions.inc=PHP --translation-args -Dcom.fortify.sca.rules.password_regex.global=(?i)(s|_)?(user|usr|member|admin|guest|login|default|new|current|old|client|server|proxy|sqlserver|my|mysql|mongo|mongodb|db|database|ldap|smtp|email|email(_)?smtp)?(_|\.)?(pass(wd|word|phrase)|secret|senha) -exclude ./**/node_modules/**/* -exclude ./**/*.min.js -exclude ./**/dist/**/* --scan-args -build-label 1.77.18.1 --scan-args -build-version 1.77.18.1-1.77.18.1 -pool 3bc7860a-0df2-40da-8133-81850b28adba -block --log-file /opt/ads-agent/_work/13/s/SIIFX-api-aplicacao-1.77.18-1.77.18.1.log --overwrite
2026-10-09T18:41:40.6966143Z launcher.log will be stored in "/root/.fortify/scancentral-24.4.0/log" directory.
2026-10-09T18:41:41.1158188Z Checking for updates...
2026-10-09T18:41:41.1383852Z No update available or auto update is disabled on the controller.
2026-10-09T18:41:41.2469595Z scancentral.log will be stored in "/root/.fortify/scancentral-24.4.0/log" directory.
2026-10-09T18:41:42.6557845Z Verifying controller URL...
2026-10-09T18:41:42.7408899Z The Controller at http://sast.caixa/scancentral-ctrl is UP
2026-10-09T18:41:42.7556305Z No email address detected. No status emails will be sent for this job.
2026-10-09T18:41:42.7658885Z Gathering project information...
2026-10-09T18:41:42.7670544Z Run packaging with MAVEN integration and /opt/ads-agent/_work/13/s/pom.xml build file.
2026-10-09T18:41:43.9313193Z [INFO] Scanning for projects...
2026-10-09T18:41:44.0753858Z [INFO] 
2026-10-09T18:41:44.0758052Z [INFO] ---------------< com.fortify.cloudscan:project-packager >---------------
2026-10-09T18:41:44.0758576Z [INFO] Building Fortify ScanCentral: project-packager 24.4.0.0060
2026-10-09T18:41:44.0759273Z [INFO] --------------------------------[ jar ]---------------------------------
2026-10-09T18:41:44.0783849Z [INFO] 
2026-10-09T18:41:44.0784401Z [INFO] --- maven-install-plugin:2.4:install-file (default-cli) @ project-packager ---
2026-10-09T18:41:44.2334338Z [INFO] Installing /opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/Core/lib/project-packager-24.4.0.0060.jar to /opt/ads-agent/cache-tools/.m2/repository/com/fortify/cloudscan/project-packager/24.4.0.0060/project-packager-24.4.0.0060.jar
2026-10-09T18:41:44.2455441Z [INFO] Installing /opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/Core/resources/scancentral/project-packager/pom.xml to /opt/ads-agent/cache-tools/.m2/repository/com/fortify/cloudscan/project-packager/24.4.0.0060/project-packager-24.4.0.0060.pom
2026-10-09T18:41:44.2552299Z [INFO] ------------------------------------------------------------------------
2026-10-09T18:41:44.2552660Z [INFO] BUILD SUCCESS
2026-10-09T18:41:44.2553005Z [INFO] ------------------------------------------------------------------------
2026-10-09T18:41:44.2581534Z [INFO] Total time:  0.342 s
2026-10-09T18:41:44.2583261Z [INFO] Finished at: 2026-10-09T15:41:44-03:00
2026-10-09T18:41:44.2583712Z [INFO] ------------------------------------------------------------------------
2026-10-09T18:41:45.2136284Z [INFO] Scanning for projects...
2026-10-09T18:41:45.3816718Z [INFO] 
2026-10-09T18:41:45.3817314Z [INFO] ---< com.fortify.cloudscan.plugins.maven:project-spec-maven-plugin >----
2026-10-09T18:41:45.3817619Z [INFO] Building Fortify Project Spec Maven Plugin: project-spec-maven-plugin 24.4.0.0060
2026-10-09T18:41:45.3818090Z [INFO] ----------------------------[ maven-plugin ]----------------------------
2026-10-09T18:41:45.3939809Z [INFO] 
2026-10-09T18:41:45.3940436Z [INFO] --- maven-install-plugin:2.4:install-file (default-cli) @ project-spec-maven-plugin ---
2026-10-09T18:41:45.5663263Z [INFO] Installing /opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/Core/lib/project-spec-maven-plugin-24.4.0.0060.jar to /opt/ads-agent/cache-tools/.m2/repository/com/fortify/cloudscan/plugins/maven/project-spec-maven-plugin/24.4.0.0060/project-spec-maven-plugin-24.4.0.0060.jar
2026-10-09T18:41:45.5723181Z [INFO] Installing /opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/Core/resources/scancentral/maven-plugin/pom.xml to /opt/ads-agent/cache-tools/.m2/repository/com/fortify/cloudscan/plugins/maven/project-spec-maven-plugin/24.4.0.0060/project-spec-maven-plugin-24.4.0.0060.pom
2026-10-09T18:41:45.5973423Z [INFO] ------------------------------------------------------------------------
2026-10-09T18:41:45.5973685Z [INFO] BUILD SUCCESS
2026-10-09T18:41:45.5974138Z [INFO] ------------------------------------------------------------------------
2026-10-09T18:41:45.6023867Z [INFO] Total time:  0.404 s
2026-10-09T18:41:45.6024573Z [INFO] Finished at: 2026-10-09T15:41:45-03:00
2026-10-09T18:41:45.6024941Z [INFO] ------------------------------------------------------------------------
2026-10-09T18:41:45.8475073Z Apache Maven 3.8.5 (3599d3414f046de2324203b78ddcf9b5e4388aa0)
2026-10-09T18:41:45.8475797Z Maven home: /opt/apache-maven/apache-maven-3.8.5
2026-10-09T18:41:45.8476248Z Java version: 11, vendor: Oracle Corporation, runtime: /usr/java/open-jdk-11
2026-10-09T18:41:45.8476538Z Default locale: pt_BR, platform encoding: UTF-8
2026-10-09T18:41:45.8477104Z OS name: "linux", version: "5.18.5-100.fc35.x86_64", arch: "amd64", family: "unix"
2026-10-09T18:41:46.7329212Z [INFO] Scanning for projects...
2026-10-09T18:41:47.9506511Z [WARNING] 
2026-10-09T18:41:47.9507228Z [WARNING] Some problems were encountered while building the effective model for br.gov.caixa.investimentos:siifx-api-aplicacao:jar:1.77.18.1
2026-10-09T18:41:47.9508269Z [WARNING] 'version' contains an expression but should be a constant. @ br.gov.caixa.investimentos:siifx-api-aplicacao:${project.version}, /opt/ads-agent/_work/13/s/pom.xml, line 9, column 11
2026-10-09T18:41:47.9508488Z [WARNING] 
2026-10-09T18:41:47.9508629Z [WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
2026-10-09T18:41:47.9508974Z [WARNING] 
2026-10-09T18:41:47.9509621Z [WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
2026-10-09T18:41:47.9509823Z [WARNING] 
2026-10-09T18:41:48.0009093Z [INFO] 
2026-10-09T18:41:48.0010077Z [INFO] -----------< br.gov.caixa.investimentos:siifx-api-aplicacao >-----------
2026-10-09T18:41:48.0010494Z [INFO] Building siifx-api-aplicacao 1.77.18.1
2026-10-09T18:41:48.0010857Z [INFO] --------------------------------[ jar ]---------------------------------
2026-10-09T18:41:49.9668588Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/br/gov/caixa/siifx/core/siifx-core-calculo-remuneracao/1.1.13-SNAPSHOT/maven-metadata.xml
2026-10-09T18:41:50.7458190Z Progress (1): 806 B
2026-10-09T18:41:51.0531875Z                    
2026-10-09T18:41:51.0532995Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/br/gov/caixa/siifx/core/siifx-core-calculo-remuneracao/1.1.13-SNAPSHOT/maven-metadata.xml (806 B at 743 B/s)
2026-10-09T18:41:51.2675767Z [INFO] 
2026-10-09T18:41:51.2676721Z [INFO] --- jacoco-maven-plugin:0.8.10:prepare-agent (default-prepare-agent) @ siifx-api-aplicacao ---
2026-10-09T18:41:51.3346263Z [INFO] argLine set to -javaagent:/opt/ads-agent/cache-tools/.m2/repository/org/jacoco/org.jacoco.agent/0.8.10/org.jacoco.agent-0.8.10-runtime.jar=destfile=/opt/ads-agent/_work/13/s/target/jacoco.exec
2026-10-09T18:41:51.3346737Z [INFO] 
2026-10-09T18:41:51.3347226Z [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ siifx-api-aplicacao ---
2026-10-09T18:41:51.3943475Z [INFO] Using 'UTF-8' encoding to copy filtered resources.
2026-10-09T18:41:51.4047860Z [INFO] Copying 16 resources
2026-10-09T18:41:51.4048110Z [INFO] 
2026-10-09T18:41:51.4048622Z [INFO] --- quarkus-maven-plugin:2.16.5.Final:generate-code (default) @ siifx-api-aplicacao ---
2026-10-09T18:41:54.2347500Z [INFO] 
2026-10-09T18:41:54.2348383Z [INFO] --- maven-compiler-plugin:3.10.1:compile (default-compile) @ siifx-api-aplicacao ---
2026-10-09T18:41:54.4960142Z [INFO] Nothing to compile - all classes are up to date
2026-10-09T18:41:54.4960509Z [INFO] 
2026-10-09T18:41:54.4960832Z [INFO] --- quarkus-maven-plugin:2.16.5.Final:generate-code-tests (default) @ siifx-api-aplicacao ---
2026-10-09T18:41:55.7522719Z [INFO] 
2026-10-09T18:41:55.7524333Z [INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ siifx-api-aplicacao ---
2026-10-09T18:41:55.7546174Z [INFO] Using 'UTF-8' encoding to copy filtered resources.
2026-10-09T18:41:55.7547866Z [INFO] Copying 4 resources
2026-10-09T18:41:55.7549607Z [INFO] 
2026-10-09T18:41:55.7550028Z [INFO] --- maven-compiler-plugin:3.10.1:testCompile (default-testCompile) @ siifx-api-aplicacao ---
2026-10-09T18:41:55.8138965Z [INFO] Changes detected - recompiling the module!
2026-10-09T18:41:55.8293514Z [INFO] Compiling 422 source files to /opt/ads-agent/_work/13/s/target/test-classes
2026-10-09T18:42:13.3622315Z [INFO] /opt/ads-agent/_work/13/s/src/test/java/br/gov/caixa/siifx/service/devolucaoimposto/RegistraTransacaoDevolveImpostosServiceTest.java: Some input files use or override a deprecated API.
2026-10-09T18:42:13.3623121Z [INFO] /opt/ads-agent/_work/13/s/src/test/java/br/gov/caixa/siifx/service/devolucaoimposto/RegistraTransacaoDevolveImpostosServiceTest.java: Recompile with -Xlint:deprecation for details.
2026-10-09T18:42:13.3623495Z [INFO] /opt/ads-agent/_work/13/s/src/test/java/br/gov/caixa/siifx/service/informemensal/GerarInformePdfServiceTest.java: Some input files use unchecked or unsafe operations.
2026-10-09T18:42:13.3624137Z [INFO] /opt/ads-agent/_work/13/s/src/test/java/br/gov/caixa/siifx/service/informemensal/GerarInformePdfServiceTest.java: Recompile with -Xlint:unchecked for details.
2026-10-09T18:42:13.3624333Z [INFO] 
2026-10-09T18:42:13.3626056Z [INFO] --- maven-surefire-plugin:3.0.0-M7:test (default-test) @ siifx-api-aplicacao ---
2026-10-09T18:42:13.5904320Z [INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
2026-10-09T18:42:13.7841751Z [INFO] 
2026-10-09T18:42:13.7842265Z [INFO] -------------------------------------------------------
2026-10-09T18:42:13.7842442Z [INFO]  T E S T S
2026-10-09T18:42:13.7842654Z [INFO] -------------------------------------------------------
2026-10-09T18:42:18.2812846Z [INFO] Running br.gov.caixa.siifx.assembler.DatasComImpeditivoAssemblerTest
2026-10-09T18:42:19.9915839Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.737 s - in br.gov.caixa.siifx.assembler.DatasComImpeditivoAssemblerTest
2026-10-09T18:42:19.9916440Z [INFO] Running br.gov.caixa.siifx.assembler.SaldosAssemblerTest
2026-10-09T18:42:20.0106737Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.035 s - in br.gov.caixa.siifx.assembler.SaldosAssemblerTest
2026-10-09T18:42:20.0107179Z [INFO] Running br.gov.caixa.siifx.concurrency.ConcurrencyControlFilterTest
2026-10-09T18:42:22.8770291Z 2026-10-09 15:42:22,825 WARN  [br.gov.cai.sii.con.ConcurrencyControlFilter] (main) @ConcurrencyControlled aplicado sem 'value' (nome da transacao). Filtro ignorado para path=v2/aplicacao/registraContrato
2026-10-09T18:42:23.0713440Z 2026-10-09 15:42:23,012 INFO  [br.gov.cai.sii.con.ConcurrencyControlFilter] (main) [CONCURRENCY] Verificando lock: transactionName=TX_CLASSE hash=aeeed082a7de5e6f31c1d506f0c69fefea31f701bcbee9bf70a4346a08829e56 ttlSeconds=30
2026-10-09T18:42:23.0714156Z 2026-10-09 15:42:23,019 INFO  [br.gov.cai.sii.con.ConcurrencyControlFilter] (main) [CONCURRENCY] Lock adquirido: transactionName=TX_CLASSE hash=aeeed082a7de5e6f31c1d506f0c69fefea31f701bcbee9bf70a4346a08829e56 ttlSeconds=30
2026-10-09T18:42:23.2823133Z 2026-10-09 15:42:23,209 INFO  [br.gov.cai.sii.con.ConcurrencyControlFilter] (main) [CONCURRENCY] Verificando lock: transactionName=APLICACAO_REGISTRA_CONTRATO hash=6b55a1abb2a3d8cbf4db66fba5d7509a71178c3358c9e66a77ebc9752d52abfb ttlSeconds=5
2026-10-09T18:42:23.2933381Z 2026-10-09 15:42:23,210 WARN  [br.gov.cai.sii.con.ConcurrencyControlFilter] (main) [CONCURRENCY] BLOQUEADO! transactionName=APLICACAO_REGISTRA_CONTRATO hash=6b55a1abb2a3d8cbf4db66fba5d7509a71178c3358c9e66a77ebc9752d52abfb
2026-10-09T18:42:23.5913506Z 2026-10-09 15:42:23,580 INFO  [br.gov.cai.sii.con.ConcurrencyControlFilter] (main) [CONCURRENCY] Verificando lock: transactionName=APLICACAO_REGISTRA_CONTRATO hash=6b55a1abb2a3d8cbf4db66fba5d7509a71178c3358c9e66a77ebc9752d52abfb ttlSeconds=5
2026-10-09T18:42:23.6022079Z 2026-10-09 15:42:23,580 INFO  [br.gov.cai.sii.con.ConcurrencyControlFilter] (main) [CONCURRENCY] Lock adquirido: transactionName=APLICACAO_REGISTRA_CONTRATO hash=6b55a1abb2a3d8cbf4db66fba5d7509a71178c3358c9e66a77ebc9752d52abfb ttlSeconds=5
2026-10-09T18:42:23.6022772Z [INFO] Tests run: 15, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.576 s - in br.gov.caixa.siifx.concurrency.ConcurrencyControlFilterTest
2026-10-09T18:42:23.6024352Z [INFO] Running br.gov.caixa.siifx.concurrency.DataGridTransactionLockStoreTest
2026-10-09T18:42:24.1046697Z 2026-10-09 15:42:24,102 INFO  [br.gov.cai.sii.con.DataGridTransactionLockStore] (main) [CONCURRENCY] tryAcquireLock ADQUIRIDO: hash= ttlSeconds=15
2026-10-09T18:42:24.5351824Z 2026-10-09 15:42:24,532 INFO  [br.gov.cai.sii.con.DataGridTransactionLockStore] (main) [CONCURRENCY] Conexao com Data Grid encerrada.
2026-10-09T18:42:24.5473215Z 2026-10-09 15:42:24,543 INFO  [br.gov.cai.sii.con.DataGridTransactionLockStore] (main) [CONCURRENCY] Conectando ao Data Grid: server-list=localhost:11222, cache=cache-inexistente
2026-10-09T18:42:24.5482701Z 2026-10-09 15:42:24,547 INFO  [br.gov.cai.sii.con.DataGridTransactionLockStore] (main) [CONCURRENCY] DataGridTransactionLockStore pronto no startup.
2026-10-09T18:42:24.5521154Z 2026-10-09 15:42:24,550 INFO  [br.gov.cai.sii.con.DataGridTransactionLockStore] (main) [CONCURRENCY] tryAcquireLock BLOQUEADO: hash=abc123def456789abcdef0123456789abcdef0123456789abcdef0123456789a (lock ja existe)
2026-10-09T18:42:24.5610159Z 2026-10-09 15:42:24,555 INFO  [br.gov.cai.sii.con.DataGridTransactionLockStore] (main) [CONCURRENCY] tryAcquireLock ADQUIRIDO: hash=abc123def456789abcdef0123456789abcdef0123456789abcdef0123456789a ttlSeconds=15
2026-10-09T18:42:24.5610766Z 2026-10-09 15:42:24,555 INFO  [br.gov.cai.sii.con.DataGridTransactionLockStore] (main) [CONCURRENCY] tryAcquireLock ADQUIRIDO: hash=abc123def456789abcdef0123456789abcdef0123456789abcdef0123456789a ttlSeconds=15
2026-10-09T18:42:24.5755729Z 2026-10-09 15:42:24,574 INFO  [br.gov.cai.sii.con.DataGridTransactionLockStore] (main) [CONCURRENCY] tryAcquireLock ADQUIRIDO: hash=abc123def456789abcdef0123456789abcdef0123456789abcdef0123456789a ttlSeconds=0
2026-10-09T18:42:24.5787837Z 2026-10-09 15:42:24,577 INFO  [br.gov.cai.sii.con.DataGridTransactionLockStore] (main) [CONCURRENCY] tryAcquireLock ADQUIRIDO: hash=abc123def456789abcdef0123456789abcdef0123456789abcdef0123456789a ttlSeconds=15
2026-10-09T18:42:24.5788690Z 2026-10-09 15:42:24,577 INFO  [br.gov.cai.sii.con.DataGridTransactionLockStore] (main) [CONCURRENCY] tryAcquireLock BLOQUEADO: hash=abc123def456789abcdef0123456789abcdef0123456789abcdef0123456789a (lock ja existe)
2026-10-09T18:42:24.5790649Z 2026-10-09 15:42:24,578 INFO  [br.gov.cai.sii.con.DataGridTransactionLockStore] (main) [CONCURRENCY] tryAcquireLock ADQUIRIDO: hash=abc123def456789abcdef0123456789abcdef0123456789abcdef0123456789a ttlSeconds=15
2026-10-09T18:42:24.5816220Z 2026-10-09 15:42:24,580 INFO  [br.gov.cai.sii.con.DataGridTransactionLockStore] (main) [CONCURRENCY] tryAcquireLock ADQUIRIDO: hash=abc123def456789abcdef0123456789abcdef0123456789abcdef0123456789a ttlSeconds=15
2026-10-09T18:42:24.5817021Z 2026-10-09 15:42:24,580 INFO  [br.gov.cai.sii.con.DataGridTransactionLockStore] (main) [CONCURRENCY] tryAcquireLock ADQUIRIDO: hash=zzz999def456789abcdef0123456789abcdef0123456789abcdef0123456789b ttlSeconds=15
2026-10-09T18:42:24.6201944Z 2026-10-09 15:42:24,589 INFO  [br.gov.cai.sii.con.DataGridTransactionLockStore] (main) [CONCURRENCY] Conectando ao Data Grid: server-list=localhost:11222, cache=siifx-controle-concorrencia
2026-10-09T18:42:24.6913563Z 2026-10-09 15:42:24,686 INFO  [br.gov.cai.sii.con.DataGridTransactionLockStore] (main) [CONCURRENCY] DataGridTransactionLockStore inicializado com sucesso.
2026-10-09T18:42:24.6961696Z [INFO] Tests run: 18, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.101 s - in br.gov.caixa.siifx.concurrency.DataGridTransactionLockStoreTest
2026-10-09T18:42:24.6962129Z [INFO] Running br.gov.caixa.siifx.conversores.ConversorCamaraRegistroDTOTest
2026-10-09T18:42:24.8368973Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.137 s - in br.gov.caixa.siifx.conversores.ConversorCamaraRegistroDTOTest
2026-10-09T18:42:24.8369322Z [INFO] Running br.gov.caixa.siifx.conversores.contabil.ConversorTransacaoContabilDTOTest
2026-10-09T18:42:24.8708760Z [INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.01 s - in br.gov.caixa.siifx.conversores.contabil.ConversorTransacaoContabilDTOTest
2026-10-09T18:42:24.8709261Z [INFO] Running br.gov.caixa.siifx.conversores.contabil.ConversorTransacaoContabilEventosDTOTest
2026-10-09T18:42:24.8934406Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.036 s - in br.gov.caixa.siifx.conversores.contabil.ConversorTransacaoContabilEventosDTOTest
2026-10-09T18:42:24.8934890Z [INFO] Running br.gov.caixa.siifx.domain.DadosClienteDevolveImpostoTest
2026-10-09T18:42:24.8953201Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.003 s - in br.gov.caixa.siifx.domain.DadosClienteDevolveImpostoTest
2026-10-09T18:42:24.8953840Z [INFO] Running br.gov.caixa.siifx.domain.DadosClienteResgateVencimentoTest
2026-10-09T18:42:24.9233581Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.029 s - in br.gov.caixa.siifx.domain.DadosClienteResgateVencimentoTest
2026-10-09T18:42:24.9233949Z [INFO] Running br.gov.caixa.siifx.domain.DadosSaidaResgateVencimentoTest
2026-10-09T18:42:24.9826705Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.059 s - in br.gov.caixa.siifx.domain.DadosSaidaResgateVencimentoTest
2026-10-09T18:42:24.9827134Z [INFO] Running br.gov.caixa.siifx.domain.DadosTransacaoDevolucaoDevolveImpostoTest
2026-10-09T18:42:24.9871295Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.003 s - in br.gov.caixa.siifx.domain.DadosTransacaoDevolucaoDevolveImpostoTest
2026-10-09T18:42:24.9871814Z [INFO] Running br.gov.caixa.siifx.domain.DetalhesDevolucaoImpostosDevolveImpostosTest
2026-10-09T18:42:24.9960506Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.005 s - in br.gov.caixa.siifx.domain.DetalhesDevolucaoImpostosDevolveImpostosTest
2026-10-09T18:42:24.9961248Z [INFO] Running br.gov.caixa.siifx.domain.DetalhesLoteDevolveImpostosTest
2026-10-09T18:42:24.9993406Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.003 s - in br.gov.caixa.siifx.domain.DetalhesLoteDevolveImpostosTest
2026-10-09T18:42:24.9993788Z [INFO] Running br.gov.caixa.siifx.domain.ResgateVencimentoParametrosTest
2026-10-09T18:42:25.0066313Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.003 s - in br.gov.caixa.siifx.domain.ResgateVencimentoParametrosTest
2026-10-09T18:42:25.0066728Z [INFO] Running br.gov.caixa.siifx.domain.ResgateVencimentoTest
2026-10-09T18:42:25.0758636Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.015 s - in br.gov.caixa.siifx.domain.ResgateVencimentoTest
2026-10-09T18:42:25.0758944Z [INFO] Running br.gov.caixa.siifx.domain.RetornoIdentificaResgateVencimentoTest
2026-10-09T18:42:25.0961772Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.012 s - in br.gov.caixa.siifx.domain.RetornoIdentificaResgateVencimentoTest
2026-10-09T18:42:25.0962301Z [INFO] Running br.gov.caixa.siifx.domain.TransacaoImpostoTest
2026-10-09T18:42:25.0962635Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 s - in br.gov.caixa.siifx.domain.TransacaoImpostoTest
2026-10-09T18:42:25.0962866Z [INFO] Running br.gov.caixa.siifx.domain.ativofinanceiro.ParametrosAtivoFinanceiroTest
2026-10-09T18:42:25.1050400Z [INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.011 s - in br.gov.caixa.siifx.domain.ativofinanceiro.ParametrosAtivoFinanceiroTest
2026-10-09T18:42:25.1051347Z [INFO] Running br.gov.caixa.siifx.dto.openfinance.ResponseBankfixedIncomesBalancesTest
2026-10-09T18:42:25.6777400Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.566 s - in br.gov.caixa.siifx.dto.openfinance.ResponseBankfixedIncomesBalancesTest
2026-10-09T18:42:25.6786687Z [INFO] Running br.gov.caixa.siifx.dto.openfinance.ResponseBankfixedIncomesTransactionsTest
2026-10-09T18:42:25.8370014Z [INFO] Tests run: 45, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.153 s - in br.gov.caixa.siifx.dto.openfinance.ResponseBankfixedIncomesTransactionsTest
2026-10-09T18:42:25.8370698Z [INFO] Running br.gov.caixa.siifx.filter.CpfCnpjVersionResponseFilterTest
2026-10-09T18:42:26.0026983Z [INFO] Tests run: 14, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.163 s - in br.gov.caixa.siifx.filter.CpfCnpjVersionResponseFilterTest
2026-10-09T18:42:26.0108173Z [INFO] Running br.gov.caixa.siifx.filter.JsonViewRequestFilterTest
2026-10-09T18:42:26.0231112Z [INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.018 s - in br.gov.caixa.siifx.filter.JsonViewRequestFilterTest
2026-10-09T18:42:26.0231725Z [INFO] Running br.gov.caixa.siifx.filter.ViewContextHolderTest
2026-10-09T18:42:26.0272950Z [INFO] Tests run: 10, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.003 s - in br.gov.caixa.siifx.filter.ViewContextHolderTest
2026-10-09T18:42:26.0273890Z [INFO] Running br.gov.caixa.siifx.infra.ApiManagerExceptionMapperTest
2026-10-09T18:42:26.2068268Z 2026-10-09 15:42:26,200 WARN  [br.gov.cai.sii.inf.ApiManagerExceptionMapper] (main) *** Erro 401 Unauthorized ao chamar o API-MANAGER :: Invalidando cache de token
2026-10-09T18:42:26.2092315Z 2026-10-09 15:42:26,207 WARN  [br.gov.cai.sii.inf.ApiManagerExceptionMapper] (main) *** Erro 401 Unauthorized ao chamar o API-MANAGER :: Invalidando cache de token
2026-10-09T18:42:26.2160891Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.186 s - in br.gov.caixa.siifx.infra.ApiManagerExceptionMapperTest
2026-10-09T18:42:26.2161368Z [INFO] Running br.gov.caixa.siifx.infra.TokenServicoAndApiKeyHeaderFactoryTest
2026-10-09T18:42:26.2254458Z [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.008 s - in br.gov.caixa.siifx.infra.TokenServicoAndApiKeyHeaderFactoryTest
2026-10-09T18:42:26.2255165Z [INFO] Running br.gov.caixa.siifx.infra.exception.CustomHttpExceptionTest
2026-10-09T18:42:26.2288477Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 s - in br.gov.caixa.siifx.infra.exception.CustomHttpExceptionTest
2026-10-09T18:42:26.2289065Z [INFO] Running br.gov.caixa.siifx.infra.nsgd.mappers.ApiNsgdConsultaExceptionMapperTest
2026-10-09T18:42:26.3236212Z 2026-10-09 15:42:26,321 WARN  [br.gov.cai.sii.inf.nsg.map.ApiNsgdConsultaExceptionMapper] (main) [NSGD_401] Erro 401 Unauthorized detectado em consulta. Invalidando cache de token...
2026-10-09T18:42:26.4269250Z [INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.187 s - in br.gov.caixa.siifx.infra.nsgd.mappers.ApiNsgdConsultaExceptionMapperTest
2026-10-09T18:42:26.4270371Z [INFO] Running br.gov.caixa.siifx.infra.request.credito.MontarRequisicaoCreditoContaTest
2026-10-09T18:42:26.4678710Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.022 s - in br.gov.caixa.siifx.infra.request.credito.MontarRequisicaoCreditoContaTest
2026-10-09T18:42:26.4679300Z [INFO] Running br.gov.caixa.siifx.infra.request.credito.cancelaresgate.MontarRequisicaoCancelamentoResgateTest
2026-10-09T18:42:26.4680641Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.004 s - in br.gov.caixa.siifx.infra.request.credito.cancelaresgate.MontarRequisicaoCancelamentoResgateTest
2026-10-09T18:42:26.4681119Z [INFO] Running br.gov.caixa.siifx.infra.request.credito.estornoresgate.MontarRequisicaoEstornoResgateTest
2026-10-09T18:42:26.9372993Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.472 s - in br.gov.caixa.siifx.infra.request.credito.estornoresgate.MontarRequisicaoEstornoResgateTest
2026-10-09T18:42:26.9373473Z [INFO] Running br.gov.caixa.siifx.infra.response.debito.RespostaContaDepositoNSGDDTOTest
2026-10-09T18:42:26.9631703Z [INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.024 s - in br.gov.caixa.siifx.infra.response.debito.RespostaContaDepositoNSGDDTOTest
2026-10-09T18:42:26.9632129Z [INFO] Running br.gov.caixa.siifx.infra.response.perfilinvestidorsigpi.PerfilInvestidorFallbackDTOTest
2026-10-09T18:42:26.9740567Z [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.004 s - in br.gov.caixa.siifx.infra.response.perfilinvestidorsigpi.PerfilInvestidorFallbackDTOTest
2026-10-09T18:42:26.9741165Z [INFO] Running br.gov.caixa.siifx.infra.timeout.service.ParametrosTimeoutServiceTest
2026-10-09T18:42:27.0587154Z [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.087 s - in br.gov.caixa.siifx.infra.timeout.service.ParametrosTimeoutServiceTest
2026-10-09T18:42:27.0587604Z [INFO] Running br.gov.caixa.siifx.mapper.DadosOrigemMapperTest
2026-10-09T18:42:27.0637919Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 s - in br.gov.caixa.siifx.mapper.DadosOrigemMapperTest
2026-10-09T18:42:27.0638339Z [INFO] Running br.gov.caixa.siifx.mapper.ParametrosEntradaDevolveImpostosMapperTest
2026-10-09T18:42:27.0911833Z [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.028 s - in br.gov.caixa.siifx.mapper.ParametrosEntradaDevolveImpostosMapperTest
2026-10-09T18:42:27.0912569Z [INFO] Running br.gov.caixa.siifx.mapper.RetornoTransacaoDevolucaoDevolveImpostoMapperTest
2026-10-09T18:42:27.1060573Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.016 s - in br.gov.caixa.siifx.mapper.RetornoTransacaoDevolucaoDevolveImpostoMapperTest
2026-10-09T18:42:27.1061072Z [INFO] Running br.gov.caixa.siifx.mapper.ativofinanceiro.ClienteMapperTest
2026-10-09T18:42:27.1104712Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.003 s - in br.gov.caixa.siifx.mapper.ativofinanceiro.ClienteMapperTest
2026-10-09T18:42:27.1105513Z [INFO] Running br.gov.caixa.siifx.mapper.ativofinanceiro.ConsultaDetalhaAtivoFinanceiroMapperTest
2026-10-09T18:42:27.1159091Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.004 s - in br.gov.caixa.siifx.mapper.ativofinanceiro.ConsultaDetalhaAtivoFinanceiroMapperTest
2026-10-09T18:42:27.1159892Z [INFO] Running br.gov.caixa.siifx.mapper.ativofinanceiro.ParametrosAtivoFinanceiroMapperTest
2026-10-09T18:42:27.1198843Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 s - in br.gov.caixa.siifx.mapper.ativofinanceiro.ParametrosAtivoFinanceiroMapperTest
2026-10-09T18:42:27.1199336Z [INFO] Running br.gov.caixa.siifx.mapper.ativofinanceiro.RetornoDetalheTransacaoRendaFixaMapperTest
2026-10-09T18:42:27.1235377Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.003 s - in br.gov.caixa.siifx.mapper.ativofinanceiro.RetornoDetalheTransacaoRendaFixaMapperTest
2026-10-09T18:42:27.1235857Z [INFO] Running br.gov.caixa.siifx.mapper.ativofinanceiro.RetornoTransacoesAtivoRendaFixaMapperTest
2026-10-09T18:42:27.1415337Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.014 s - in br.gov.caixa.siifx.mapper.ativofinanceiro.RetornoTransacoesAtivoRendaFixaMapperTest
2026-10-09T18:42:27.1416358Z [INFO] Running br.gov.caixa.siifx.mapper.ativofinanceiro.TransacaoAtivoFinanceiroMapperTest
2026-10-09T18:42:27.1473331Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 s - in br.gov.caixa.siifx.mapper.ativofinanceiro.TransacaoAtivoFinanceiroMapperTest
2026-10-09T18:42:27.1474068Z [INFO] Running br.gov.caixa.siifx.mapper.ativofinanceiro.TransacaoAtvMapperTest
2026-10-09T18:42:27.1511822Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 s - in br.gov.caixa.siifx.mapper.ativofinanceiro.TransacaoAtvMapperTest
2026-10-09T18:42:27.1512281Z [INFO] Running br.gov.caixa.siifx.mapper.comprovante.RetornoServicoMapperTest
2026-10-09T18:42:27.1547295Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 s - in br.gov.caixa.siifx.mapper.comprovante.RetornoServicoMapperTest
2026-10-09T18:42:27.1547732Z [INFO] Running br.gov.caixa.siifx.mapper.devolucaoimposto.DadosClienteResgateVencimentoMapperTest
2026-10-09T18:42:27.1608636Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.004 s - in br.gov.caixa.siifx.mapper.devolucaoimposto.DadosClienteResgateVencimentoMapperTest
2026-10-09T18:42:27.1609003Z [INFO] Running br.gov.caixa.siifx.mapper.devolucaoimposto.DadosSaidaResgateVencimentoMapperTest
2026-10-09T18:42:27.1632200Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.007 s - in br.gov.caixa.siifx.mapper.devolucaoimposto.DadosSaidaResgateVencimentoMapperTest
2026-10-09T18:42:27.1632693Z [INFO] Running br.gov.caixa.siifx.mapper.devolucaoimposto.ParamentrosEntradaIdentificaResgateVencimentoMapperTest
2026-10-09T18:42:27.1658220Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.004 s - in br.gov.caixa.siifx.mapper.devolucaoimposto.ParamentrosEntradaIdentificaResgateVencimentoMapperTest
2026-10-09T18:42:27.1659060Z [INFO] Running br.gov.caixa.siifx.mapper.devolucaoimposto.ResgateVencimentoMapperTest
2026-10-09T18:42:27.1695177Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.003 s - in br.gov.caixa.siifx.mapper.devolucaoimposto.ResgateVencimentoMapperTest
2026-10-09T18:42:27.1695703Z [INFO] Running br.gov.caixa.siifx.mapper.devolucaoimposto.RetornoIdentificaResgateVencimentoMapperTest
2026-10-09T18:42:27.1729706Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.004 s - in br.gov.caixa.siifx.mapper.devolucaoimposto.RetornoIdentificaResgateVencimentoMapperTest
2026-10-09T18:42:27.1730352Z [INFO] Running br.gov.caixa.siifx.mapper.devolucaoimposto.TransacaoImpostoMapperTest
2026-10-09T18:42:27.1767974Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 s - in br.gov.caixa.siifx.mapper.devolucaoimposto.TransacaoImpostoMapperTest
2026-10-09T18:42:27.1768500Z [INFO] Running br.gov.caixa.siifx.model.HistoricoModalidadeProdutoDepositoModelTest
2026-10-09T18:42:27.1807507Z [INFO] Tests run: 10, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.005 s - in br.gov.caixa.siifx.model.HistoricoModalidadeProdutoDepositoModelTest
2026-10-09T18:42:27.1808473Z [INFO] Running br.gov.caixa.siifx.model.HistoricoModalidadeSegmentoModelTest
2026-10-09T18:42:27.1854774Z [INFO] Tests run: 12, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.003 s - in br.gov.caixa.siifx.model.HistoricoModalidadeSegmentoModelTest
2026-10-09T18:42:27.1855180Z [INFO] Running br.gov.caixa.siifx.model.HistoricoValorIndiceRentabilidadeModelTest
2026-10-09T18:42:27.1894696Z [INFO] Tests run: 12, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.003 s - in br.gov.caixa.siifx.model.HistoricoValorIndiceRentabilidadeModelTest
2026-10-09T18:42:27.1895612Z [INFO] Running br.gov.caixa.siifx.model.ModalidadeSegmentoRendaFixaModelTest
2026-10-09T18:42:27.1947094Z [INFO] Tests run: 11, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.003 s - in br.gov.caixa.siifx.model.ModalidadeSegmentoRendaFixaModelTest
2026-10-09T18:42:27.1947480Z [INFO] Running br.gov.caixa.siifx.model.MovimentoTransacaoConsultaModel2Test
2026-10-09T18:42:27.3181367Z [INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.12 s - in br.gov.caixa.siifx.model.MovimentoTransacaoConsultaModel2Test
2026-10-09T18:42:27.3181871Z [INFO] Running br.gov.caixa.siifx.model.MovimentoTransacaoConsultaModelTest
2026-10-09T18:42:27.3346259Z [INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.016 s - in br.gov.caixa.siifx.model.MovimentoTransacaoConsultaModelTest
2026-10-09T18:42:27.3346561Z [INFO] Running br.gov.caixa.siifx.pub.InvestidorDevolucaoImpostoResourceTest
2026-10-09T18:42:27.4965533Z 2026-10-09 15:42:27,493 INFO  [br.gov.cai.sii.pub.InvestidorDevolucaoImpostoResource] (main) ********** devolucaoImpostoIdentificaEtapa1(/pub/investimentos/renda-fixa/movimentacoes-investidor/v1/investidores/{tipo_pessoa}/{documento}/devolucao-imposto/) *********** 
2026-10-09T18:42:27.4966529Z 2026-10-09 15:42:27,493 INFO  [br.gov.cai.sii.pub.InvestidorDevolucaoImpostoResource] (main) tipo_pessoa: 1 | documento: 12345678901 | codigoCanalOrigem: 1 | codigoSistemaOrigem: 2  | nsuSistemaOrigem: null |  codigoAcaoTransacao: 1 | codigoComandoTransacao: 11 | codigoAntecedenteTransacao: 14 | dataMovimento: 01/01/2024  |  
2026-10-09T18:42:27.4967660Z 2026-10-09 15:42:27,494 INFO  [br.gov.cai.sii.pub.InvestidorDevolucaoImpostoResource] (main) ********** fim devolucaoImpostoIdentificaEtapa1 /v1/investidores/{tipo_pessoa}/{documento}/devolucao-imposto ***********  ->1
2026-10-09T18:42:27.5001807Z 2026-10-09 15:42:27,498 INFO  [br.gov.cai.sii.pub.InvestidorDevolucaoImpostoResource] (main) ********** devolucaoImpostoIdentificaEtapa1(/pub/investimentos/renda-fixa/movimentacoes-investidor/v1/investidores/{tipo_pessoa}/{documento}/devolucao-imposto/) *********** 
2026-10-09T18:42:27.5002686Z 2026-10-09 15:42:27,498 INFO  [br.gov.cai.sii.pub.InvestidorDevolucaoImpostoResource] (main) tipo_pessoa: 1 | documento: 12345678901 | codigoCanalOrigem: 1 | codigoSistemaOrigem: 2  | nsuSistemaOrigem: 3 |  codigoAcaoTransacao: 1 | codigoComandoTransacao: 11 | codigoAntecedenteTransacao: 14 | dataMovimento: 01/01/2024  |  
2026-10-09T18:42:27.5003276Z 2026-10-09 15:42:27,499 INFO  [br.gov.cai.sii.pub.InvestidorDevolucaoImpostoResource] (main) ********** fim devolucaoImpostoIdentificaEtapa1 /v1/investidores/{tipo_pessoa}/{documento}/devolucao-imposto ***********  ->1
2026-10-09T18:42:27.5083893Z 2026-10-09 15:42:27,502 INFO  [br.gov.cai.sii.pub.InvestidorDevolucaoImpostoResource] (main) ********** devolucaoImpostoRegistraEtapa2(/pub/investimentos/renda-fixa/movimentacoes-investidor/v1/investidores/{tipo_pessoa}/{documento}/devolucao-imposto) *********** 
2026-10-09T18:42:27.5084853Z 2026-10-09 15:42:27,503 INFO  [br.gov.cai.sii.pub.InvestidorDevolucaoImpostoResource] (main) tipo_pessoa: 1 | documento: 12345678901 |  | devolucaoImposto EntradaDevolucaoImpostoDTO(codigoCanalOrigem=2, codigoSistemaOrigem=1, nsuSistemaOrigem=3, codigoSistemaIntermediario=null, nsuSistemaIntermediario=null, unidadeOrigem=10, codigoAcaoTransacao=1, codigoComandoTransacao=11, codigoAntecedenteTransacao=14, dataMovimento=01/01/2024, tipoPessoa=1, cpfCnpj=12345678901, cnae=null, tipoNotaTransacao=null, assinaturaCliente=null, operador=null, terminal=null, quantidadeDevolucoes=1, transacaoDevolucao=null)
2026-10-09T18:42:27.5086016Z 2026-10-09 15:42:27,503 INFO  [br.gov.cai.sii.pub.InvestidorDevolucaoImpostoResource] (main) ********** fim devolucaoImpostoRegistraEtapa2  /v1/investidores/{tipo_pessoa}/{documento}/devolucao-imposto ***********  ->1
2026-10-09T18:42:27.5094436Z [INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.172 s - in br.gov.caixa.siifx.pub.InvestidorDevolucaoImpostoResourceTest
2026-10-09T18:42:27.5094702Z [INFO] Running br.gov.caixa.siifx.pub.InvestidorEstornaAplicacaoResourceTest
2026-10-09T18:42:27.6044704Z 2026-10-09 15:42:27,584 INFO  [br.gov.cai.sii.pub.InvestidorEstornaAplicacaoResource] (main) ********** estornaAplicacaoRegistra(/pub/investimentos/renda-fixa/movimentacoes-investidor/v1/investidores/{tipo_pessoa}/{documento}/aplicacoes/contrato/estorno) *********** 
2026-10-09T18:42:27.6045978Z 2026-10-09 15:42:27,601 INFO  [br.gov.cai.sii.pub.InvestidorEstornaAplicacaoResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: POST /aplicacoes/contrato/estorno tipo_pessoa: 1, documento 1, CorrelationID: 6cd0e84d-6767-42cd-8a95-67fd6c7923de, Body: ParametrosEstornaAplicacaoDTO(codigoCanalOrigem=1, codigoSistemaOrigem=1, nsuSistemaOrigem=1, codigoSistemaIntermediario=1, nsuSistemaIntermediario=1, unidadeOrigem=1, codigoAcaoTransacao=1, codigoComandoTransacao=1, codigoAntecedenteTransacao=1, dataMovimento=null, tipoPessoa=1, cpfCnpj=1, cpfCnpjAlfanumerico=null, cnae=1, codigoProduto=1, codigoModalidade=1, notaAplicacao=1, tipoNotaTransacao=1, assinaturaCliente=1, operador=1, terminal=1, solicitante=1, notaTransacao=1, nsuTransacaoOriginal=1, sequencialTransacao=1, valorAplicacao=1, ufUnidadeDeposito=1, unidadeDeposito=1, produtoDeposito=1, contaDeposito=1, digitoDeposito=1, valorTarifa=1, dataReferencia=null, justificativa=1)
2026-10-09T18:42:27.6046901Z 2026-10-09 15:42:27,602 INFO  [br.gov.cai.sii.pub.InvestidorEstornaAplicacaoResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: POST /aplicacoes/contrato/estorno  CorrelationID: 6cd0e84d-6767-42cd-8a95-67fd6c7923de  HTTP Status: 200 OK   Tempo: 18 ms.
2026-10-09T18:42:27.6140811Z 2026-10-09 15:42:27,607 INFO  [br.gov.cai.sii.pub.InvestidorEstornaAplicacaoResource] (main) ********** estornaAplicacaoIdentifica(/pub/investimentos/renda-fixa/movimentacoes-investidor/v1/investidores/{tipo_pessoa}/{documento}/aplicacoes/contrato/estorno) ***********
2026-10-09T18:42:27.6141913Z 2026-10-09 15:42:27,607 INFO  [br.gov.cai.sii.pub.InvestidorEstornaAplicacaoResource] (main)  codigoCanalOrigem: 1 | codigoSistemaOrigem: 2 | codigoSistemaIntermediario: 0  | nsuSistemaOrigem: 3 |  codigoAcaoTransacao: 1 | codigoComandoTransacao: 11 | codigoAntecedenteTransacao: 14 | dataMovimento: 01/01/2024 | tipo_pessoa: 1 | documento: 1  | codigoProduto: 1 | codigoModalidade: 1 |   notaTransacao: 1 notaAplicacao: 1 |   operador: 1 |  terminal: 1 | 
2026-10-09T18:42:27.6142565Z 2026-10-09 15:42:27,608 INFO  [br.gov.cai.sii.pub.InvestidorEstornaAplicacaoResource] (main) ********** fim do estornaAplicacaoIdentifica(/pub/investimentos/renda-fixa/movimentacoes-investidor/v1/investidores/{tipo_pessoa}/{documento}/aplicacoes/contrato/estorno) *********** -> 1ms
2026-10-09T18:42:27.6143210Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.101 s - in br.gov.caixa.siifx.pub.InvestidorEstornaAplicacaoResourceTest
2026-10-09T18:42:27.6249729Z [INFO] Running br.gov.caixa.siifx.pub.InvestidoresResourceTest
2026-10-09T18:42:28.1722248Z 2026-10-09 15:42:28,155 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"1","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"1","codigoAntecedenteTransacao":"1","dataMovimento":"1","mes":null,"ano":null,"codigoProduto":null,"unidadeDeposito":"1","produtoDeposito":"1","contaDeposito":"1","digitoDeposito":1,"codigoModalidade":null,"situacaoAtivo":1,"motivoAtivo":1,"operador":"1","terminal":"1"}
2026-10-09T18:42:28.1723865Z 2026-10-09 15:42:28,169 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourcesaldoConsolidado. ProcessingExceptions Status: Erro de processamentoStatus code: 504. Parametros: null Mensagem: Erro de processamento
2026-10-09T18:42:28.1794727Z 2026-10-09 15:42:28,177 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"1","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"1","codigoAntecedenteTransacao":"1","dataMovimento":null,"mes":1,"ano":1,"codigoProduto":"1","unidadeDeposito":"1","produtoDeposito":"1","contaDeposito":"1","digitoDeposito":1,"codigoModalidade":null,"situacaoAtivo":null,"motivoAtivo":null,"operador":"1","terminal":"1"}
2026-10-09T18:42:28.1795984Z 2026-10-09 15:42:28,178 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: null CorrelationID: null HTTP Status: "200 OK" Tempo: 1 ms.
2026-10-09T18:42:28.1842983Z 2026-10-09 15:42:28,182 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"1","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"1","codigoAntecedenteTransacao":"1","dataMovimento":null,"mes":1,"ano":1,"codigoProduto":"1","unidadeDeposito":"1","produtoDeposito":"1","contaDeposito":null,"digitoDeposito":0,"codigoModalidade":null,"situacaoAtivo":null,"motivoAtivo":null,"operador":"1","terminal":"1"}
2026-10-09T18:42:28.1844127Z 2026-10-09 15:42:28,182 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: null CorrelationID: null HTTP Status: "200 OK" Tempo: 1 ms.
2026-10-09T18:42:28.1884618Z 2026-10-09 15:42:28,186 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"1","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"1","codigoAntecedenteTransacao":"1","dataMovimento":null,"mes":1,"ano":1,"codigoProduto":"1","unidadeDeposito":"1","produtoDeposito":"1","contaDeposito":"1","digitoDeposito":0,"codigoModalidade":null,"situacaoAtivo":null,"motivoAtivo":null,"operador":"1","terminal":"1"}
2026-10-09T18:42:28.1886473Z 2026-10-09 15:42:28,186 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: null CorrelationID: null HTTP Status: "200 OK" Tempo: 1 ms.
2026-10-09T18:42:28.1926836Z 2026-10-09 15:42:28,190 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"1","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"1","codigoAntecedenteTransacao":"1","dataMovimento":null,"mes":1,"ano":1,"codigoProduto":"1","unidadeDeposito":null,"produtoDeposito":null,"contaDeposito":null,"digitoDeposito":0,"codigoModalidade":null,"situacaoAtivo":null,"motivoAtivo":null,"operador":"1","terminal":"1"}
2026-10-09T18:42:28.1929002Z 2026-10-09 15:42:28,191 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: null CorrelationID: null HTTP Status: "200 OK" Tempo: 1 ms.
2026-10-09T18:42:28.1982441Z 2026-10-09 15:42:28,195 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"1","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"1","codigoAntecedenteTransacao":"1","dataMovimento":"1","mes":null,"ano":null,"codigoProduto":null,"unidadeDeposito":"1","produtoDeposito":"1","contaDeposito":"1","digitoDeposito":1,"codigoModalidade":null,"situacaoAtivo":1,"motivoAtivo":1,"operador":"1","terminal":"1"}
2026-10-09T18:42:28.1983794Z 2026-10-09 15:42:28,195 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourcesaldoConsolidado. WebApplicationExceptions Status: Internal Server ErrorStatus code: 500. Parametros: null Mensagem: HTTP 500 Internal Server Error
2026-10-09T18:42:28.2053148Z 2026-10-09 15:42:28,202 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"1","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"1","codigoAntecedenteTransacao":"1","dataMovimento":"1","mes":null,"ano":null,"codigoProduto":null,"unidadeDeposito":"1","produtoDeposito":"1","contaDeposito":"1","digitoDeposito":1,"codigoModalidade":null,"situacaoAtivo":1,"motivoAtivo":1,"operador":"1","terminal":"1"}
2026-10-09T18:42:28.2054098Z 2026-10-09 15:42:28,203 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourcesaldoConsolidado. WebApplicationExceptions Status: OKStatus code: 200. Parametros: null Mensagem: 
2026-10-09T18:42:28.2100053Z 2026-10-09 15:42:28,207 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"1","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"1","codigoAntecedenteTransacao":"1","dataMovimento":null,"mes":1,"ano":1,"codigoProduto":"1","unidadeDeposito":"1","produtoDeposito":"1","contaDeposito":"1","digitoDeposito":1,"codigoModalidade":null,"situacaoAtivo":null,"motivoAtivo":null,"operador":"1","terminal":"1"}
2026-10-09T18:42:28.2101958Z 2026-10-09 15:42:28,208 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourceinformativoMensal. Exception  Status: Status code: 0. Parametros: null Mensagem: HTTP 500 Internal Server Error
2026-10-09T18:42:28.2162801Z 2026-10-09 15:42:28,214 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"1","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"1","codigoAntecedenteTransacao":"1","dataMovimento":"1","mes":null,"ano":null,"codigoProduto":"1","unidadeDeposito":"1","produtoDeposito":"1","contaDeposito":"1","digitoDeposito":1,"codigoModalidade":1,"situacaoAtivo":1,"motivoAtivo":1,"operador":"1","terminal":"1"}
2026-10-09T18:42:28.2163844Z 2026-10-09 15:42:28,214 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: null CorrelationID: null HTTP Status: "200 OK" Tempo: 1 ms.
2026-10-09T18:42:28.2248821Z 2026-10-09 15:42:28,219 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"12345678901","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":null,"codigoComandoTransacao":null,"codigoAntecedenteTransacao":null,"dataMovimento":null,"codigoProduto":null,"codigoModalidade":null,"notaAplicacao":null,"codigoAtivo":null,"notaTransacao":null,"cnae":null,"operador":null,"terminal":null}SEG
2026-10-09T18:42:28.2249780Z 2026-10-09 15:42:28,223 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourcecatalogo. Exception  Status: Status code: 0. Parametros: null Mensagem: java.io.IOException: Erro qualquer
2026-10-09T18:42:28.2250327Z Erro de IO: Erro qualquer
2026-10-09T18:42:28.2293923Z 2026-10-09 15:42:28,226 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"12345678901","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":null,"codigoComandoTransacao":null,"codigoAntecedenteTransacao":null,"dataMovimento":null,"codigoProduto":null,"codigoModalidade":null,"notaAplicacao":null,"codigoAtivo":null,"notaTransacao":null,"cnae":null,"operador":null,"terminal":null}SEG
2026-10-09T18:42:28.2295308Z 2026-10-09 15:42:28,227 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourcecatalogo. Exception  Status: Too Many Requests - Muitas requisições em pouco tempo.Status code: 429. Parametros: null Mensagem: java.io.IOException: Erro 429 many requests
2026-10-09T18:42:28.2362666Z 2026-10-09 15:42:28,231 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"1","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"1","codigoAntecedenteTransacao":"1","dataMovimento":"1","mes":null,"ano":null,"codigoProduto":"1","unidadeDeposito":"1","produtoDeposito":"1","contaDeposito":"1","digitoDeposito":1,"codigoModalidade":1,"situacaoAtivo":1,"motivoAtivo":1,"operador":"1","terminal":"1"}
2026-10-09T18:42:28.2363584Z 2026-10-09 15:42:28,232 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourcesaldoAnalitico. Exception  Status: Status code: 0. Parametros: null Mensagem: HTTP 500 Internal Server Error
2026-10-09T18:42:28.2408990Z 2026-10-09 15:42:28,238 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"12345678901","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":null,"codigoComandoTransacao":null,"codigoAntecedenteTransacao":null,"dataMovimento":null,"codigoProduto":null,"codigoModalidade":null,"notaAplicacao":null,"codigoAtivo":null,"notaTransacao":null,"cnae":null,"operador":null,"terminal":null}SEG
2026-10-09T18:42:28.2409943Z 2026-10-09 15:42:28,239 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourcecatalogo. Exception  Status: Gateway Timeout - O servidor demorou para responder.Status code: 504. Parametros: null Mensagem: java.io.IOException: Erro 504 no gateway
2026-10-09T18:42:28.2446783Z 2026-10-09 15:42:28,242 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"1","codigoCanalOrigem":12345678901234567,"codigoSistemaOrigem":3,"nsuSistemaOrigem":1,"codigoAcaoTransacao":null,"codigoComandoTransacao":null,"codigoAntecedenteTransacao":null,"dataMovimento":null,"codigoProduto":null,"codigoModalidade":null,"notaAplicacao":null,"codigoAtivo":null,"notaTransacao":null,"cnae":null,"operador":null,"terminal":null}1
2026-10-09T18:42:28.2448227Z 2026-10-09 15:42:28,243 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: null CorrelationID: null HTTP Status: "201 Created" Tempo: 1 ms.
2026-10-09T18:42:28.2484670Z 2026-10-09 15:42:28,246 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"12345678901","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":null,"codigoComandoTransacao":null,"codigoAntecedenteTransacao":null,"dataMovimento":null,"codigoProduto":null,"codigoModalidade":null,"notaAplicacao":null,"codigoAtivo":null,"notaTransacao":null,"cnae":null,"operador":null,"terminal":null}SEG
2026-10-09T18:42:28.2485782Z 2026-10-09 15:42:28,247 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourcecatalogo. Exception  Status: Serviço temporariamente indisponível. Tente novamente mais tarde.Status code: 503. Parametros: null Mensagem: java.net.ConnectException: Falha conexão
2026-10-09T18:42:28.2532760Z 2026-10-09 15:42:28,251 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"12345678901","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":null,"codigoComandoTransacao":null,"codigoAntecedenteTransacao":null,"dataMovimento":null,"codigoProduto":null,"codigoModalidade":null,"notaAplicacao":null,"codigoAtivo":null,"notaTransacao":null,"cnae":null,"operador":null,"terminal":null}SEG
2026-10-09T18:42:28.2534149Z 2026-10-09 15:42:28,251 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourcecatalogo. Exception  Status: Status code: 0. Parametros: null Mensagem: Erro desconhecido
2026-10-09T18:42:28.2746910Z 2026-10-09 15:42:28,271 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"1","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"1","codigoAntecedenteTransacao":"1","dataMovimento":"1","mes":null,"ano":null,"codigoProduto":null,"unidadeDeposito":"1","produtoDeposito":"1","contaDeposito":"1","digitoDeposito":1,"codigoModalidade":null,"situacaoAtivo":1,"motivoAtivo":1,"operador":"1","terminal":"1"}
2026-10-09T18:42:28.2748167Z 2026-10-09 15:42:28,272 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourcesaldoConsolidado. Exception  Status: Status code: 0. Parametros: null Mensagem: null
2026-10-09T18:42:28.2773917Z 2026-10-09 15:42:28,275 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"1","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"1","codigoAntecedenteTransacao":"1","dataMovimento":"1","mes":null,"ano":null,"codigoProduto":null,"unidadeDeposito":"1","produtoDeposito":"1","contaDeposito":"1","digitoDeposito":1,"codigoModalidade":null,"situacaoAtivo":1,"motivoAtivo":1,"operador":"1","terminal":"1"}
2026-10-09T18:42:28.2774882Z 2026-10-09 15:42:28,275 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: null CorrelationID: null HTTP Status: "200 OK" Tempo: 0 ms.
2026-10-09T18:42:28.2866543Z [INFO] Tests run: 18, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.658 s - in br.gov.caixa.siifx.pub.InvestidoresResourceTest
2026-10-09T18:42:28.2867631Z [INFO] Running br.gov.caixa.siifx.pub2.InformacoesProdutosResourceTest
2026-10-09T18:42:28.4353708Z 2026-10-09 15:42:28,432 INFO  [br.gov.cai.sii.pub.InformacoesProdutosResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: GET /v2/instrumento-financeiro/catalogo 
2026-10-09T18:42:28.4354401Z  codigoCanalOrigem 1 codigoSistemaOrigem 2 codigoSistemaIntermediario 0 nsuSistemaOrigem 3 
2026-10-09T18:42:28.4355007Z  codigoAcaoTransacao 1 codigoComandoTransacao 11 codigoAntecedenteTransacao 14 dataMovimento 01/01/2026 
2026-10-09T18:42:28.4355386Z  tipoConsulta 1 codigoAtivo ATIVO1 notaAplicacao 123 codigoProduto 2069 
2026-10-09T18:42:28.4355836Z  CorrelationID: 7de7775d-63e8-4d3f-99f8-c423ee6b40a1 
2026-10-09T18:42:28.4356068Z  Body: {}
2026-10-09T18:42:28.4356568Z 2026-10-09 15:42:28,433 INFO  [br.gov.cai.sii.pub.InformacoesProdutosResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: GET /v2/instrumento-financeiro/catalogo 
2026-10-09T18:42:28.4357336Z  CorrelationID: 7de7775d-63e8-4d3f-99f8-c423ee6b40a1 
2026-10-09T18:42:28.4357535Z  HTTP Status: 200 
2026-10-09T18:42:28.4357769Z  Tempo: 1 ms 
2026-10-09T18:42:28.4401073Z 2026-10-09 15:42:28,438 INFO  [br.gov.cai.sii.pub.InformacoesProdutosResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: GET /v2/instrumento-financeiro/catalogo/geral 
2026-10-09T18:42:28.4401611Z  codigoCanalOrigem: 1, codigoSistemaOrigem 2, nsuSistemaOrigem null 
2026-10-09T18:42:28.4401872Z  CorrelationID: 4fa8c787-00ef-429c-88a6-8117718c1b67 
2026-10-09T18:42:28.4402043Z  Body: {}
2026-10-09T18:42:28.4402390Z 2026-10-09 15:42:28,438 INFO  [br.gov.cai.sii.pub.InformacoesProdutosResource] (main) codigoCanalOrigem 1 codigoSistemaOrigem 2 codigoSistemaIntermediario 0 nsuSistemaOrigem 0 
2026-10-09T18:42:28.4402782Z 2026-10-09 15:42:28,438 INFO  [br.gov.cai.sii.pub.InformacoesProdutosResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: GET /v2/instrumento-financeiro/catalogo/geral 
2026-10-09T18:42:28.4403110Z  CorrelationID: 4fa8c787-00ef-429c-88a6-8117718c1b67 
2026-10-09T18:42:28.4403261Z  HTTP Status: 200 
2026-10-09T18:42:28.4403357Z  Tempo: 0 ms 
2026-10-09T18:42:28.4423994Z 2026-10-09 15:42:28,440 INFO  [br.gov.cai.sii.pub.InformacoesProdutosResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: GET /v2/instrumento-financeiro/catalogo/geral 
2026-10-09T18:42:28.4424365Z  codigoCanalOrigem: 1, codigoSistemaOrigem 2, nsuSistemaOrigem 3 
2026-10-09T18:42:28.4424622Z  CorrelationID: 04c9104c-36d5-4dce-a0e5-e395059ae022 
2026-10-09T18:42:28.4424779Z  Body: {}
2026-10-09T18:42:28.4425122Z 2026-10-09 15:42:28,440 INFO  [br.gov.cai.sii.pub.InformacoesProdutosResource] (main) codigoCanalOrigem 1 codigoSistemaOrigem 2 codigoSistemaIntermediario 0 nsuSistemaOrigem 3 
2026-10-09T18:42:28.4426678Z 2026-10-09 15:42:28,440 INFO  [br.gov.cai.sii.pub.InformacoesProdutosResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: GET /v2/instrumento-financeiro/catalogo/geral 
2026-10-09T18:42:28.4428452Z  CorrelationID: 04c9104c-36d5-4dce-a0e5-e395059ae022 
2026-10-09T18:42:28.4429962Z  HTTP Status: 200 
2026-10-09T18:42:28.4431649Z  Tempo: 0 ms 
2026-10-09T18:42:28.4444664Z 2026-10-09 15:42:28,443 INFO  [br.gov.cai.sii.pub.InformacoesProdutosResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: GET /v2/instrumento-financeiro/catalogo/geral 
2026-10-09T18:42:28.4446265Z  codigoCanalOrigem: 1, codigoSistemaOrigem 2, nsuSistemaOrigem 3 
2026-10-09T18:42:28.4447919Z  CorrelationID: 0465dbac-79a4-47d6-afc1-67314f4fc042 
2026-10-09T18:42:28.4449946Z  Body: {}
2026-10-09T18:42:28.4452370Z 2026-10-09 15:42:28,443 INFO  [br.gov.cai.sii.pub.InformacoesProdutosResource] (main) codigoCanalOrigem 1 codigoSistemaOrigem 2 codigoSistemaIntermediario 0 nsuSistemaOrigem 3 
2026-10-09T18:42:28.4460616Z 2026-10-09 15:42:28,444 INFO  [br.gov.cai.sii.pub.InformacoesProdutosResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: GET /v2/instrumento-financeiro/catalogo 
2026-10-09T18:42:28.4463422Z  codigoCanalOrigem 1 codigoSistemaOrigem 2 codigoSistemaIntermediario 0 nsuSistemaOrigem 3 
2026-10-09T18:42:28.4465787Z  codigoAcaoTransacao 1 codigoComandoTransacao 11 codigoAntecedenteTransacao 14 dataMovimento 01/01/2026 
2026-10-09T18:42:28.4468733Z  tipoConsulta 1 codigoAtivo A notaAplicacao 123 codigoProduto 2069 
2026-10-09T18:42:28.4471040Z  CorrelationID: 0d7643ee-35e4-4cad-b0fa-83c7295ba2e3 
2026-10-09T18:42:28.4473235Z  Body: {}
2026-10-09T18:42:28.4479984Z 2026-10-09 15:42:28,447 INFO  [br.gov.cai.sii.pub.InformacoesProdutosResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: GET /v2/instrumento-financeiro/catalogo 
2026-10-09T18:42:28.4482518Z  codigoCanalOrigem 1 codigoSistemaOrigem 2 codigoSistemaIntermediario 0 nsuSistemaOrigem null 
2026-10-09T18:42:28.4484740Z  codigoAcaoTransacao 1 codigoComandoTransacao 11 codigoAntecedenteTransacao 14 dataMovimento 01/01/2026 
2026-10-09T18:42:28.4486919Z  tipoConsulta 1 codigoAtivo null notaAplicacao null codigoProduto null 
2026-10-09T18:42:28.4489556Z  CorrelationID: 7c7e5213-60e3-4f13-9361-15e68b805608 
2026-10-09T18:42:28.4491759Z  Body: {}
2026-10-09T18:42:28.4494169Z 2026-10-09 15:42:28,447 INFO  [br.gov.cai.sii.pub.InformacoesProdutosResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: GET /v2/instrumento-financeiro/catalogo 
2026-10-09T18:42:28.4496538Z  CorrelationID: 7c7e5213-60e3-4f13-9361-15e68b805608 
2026-10-09T18:42:28.4498642Z  HTTP Status: 200 
2026-10-09T18:42:28.4500696Z  Tempo: 1 ms 
2026-10-09T18:42:28.4537256Z [INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.167 s - in br.gov.caixa.siifx.pub2.InformacoesProdutosResourceTest
2026-10-09T18:42:28.4550909Z [INFO] Running br.gov.caixa.siifx.pub2.InvestidorAlteraCodigoResourceTest
2026-10-09T18:42:28.7708571Z 2026-10-09 15:42:28,750 INFO  [br.gov.cai.sii.pub.InvestidorAlteraCodigoResource] (main) ********** alteraCodigoRegistraAtivo(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/instrumento-financeiro) ***********
2026-10-09T18:42:28.7710816Z 2026-10-09 15:42:28,751 INFO  [br.gov.cai.sii.pub.InvestidorAlteraCodigoResource] (main) tipoPessoa pessoas-juridicas documento 12345678901234  
2026-10-09T18:42:28.7712866Z 2026-10-09 15:42:28,767 INFO  [br.gov.cai.sii.pub.InvestidorAlteraCodigoResource] (main) entradaContaAtivoFinanceiro ParametrosRegistraAtivoFinanceiroDTO(codigoCanalOrigem=22, codigoSistemaOrigem=3274, nsuSistemaOrigem=null, codigoSistemaIntermediario=null, nsuSistemaIntermediario=null, unidadeOrigem=null, codigoAcao=null, codigoComando=null, codigoAntecedente=null, dataMovimento=null, dataReferencia=null, tipoPessoa=null, cpfCnpj=null, cpfCnpjAlfanumerico=null, cnae=null, codigoProduto=null, codigoModalidade=null, notaAplicacao=null, solicitante=null, tipoNotaTransacao=null, assinaturaCliente=null, operador=null, terminal=null, indicadorAlteraCodigoAtivo=null, codigoAtivoAnterior=null, codigoAtivoNovo=null, indicadorAlteraCodigoAtivoSwap=null, codigoAtivoSwapAnterior=null, codigoAtivoSwapNovo=null, observacao=null, dtMovimento=null, dtReferencia=null)
2026-10-09T18:42:28.7714572Z 2026-10-09 15:42:28,768 INFO  [br.gov.cai.sii.pub.InvestidorAlteraCodigoResource] (main) ********** alteraCodigoRegistraAtivo(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/instrumento-financeiro) ->17
2026-10-09T18:42:28.7743398Z 2026-10-09 15:42:28,772 INFO  [br.gov.cai.sii.pub.InvestidorAlteraCodigoResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: GET /v2/investidores/{tipo_pessoa}/{documento}/instrumento-financeiro 
2026-10-09T18:42:28.7744069Z  tipo_pessoa pessoas-juridicas documento 12345678901234 
2026-10-09T18:42:28.7744973Z  codigoCanalOrigem 22 
2026-10-09T18:42:28.7745378Z  codigoSistemaOrigem 3274 
2026-10-09T18:42:28.7745616Z  codigoSistemaIntermediario 
2026-10-09T18:42:28.7745838Z  0 nsuSistemaOrigem 1 
2026-10-09T18:42:28.7746057Z  codigoAcaoTransacao 1 
2026-10-09T18:42:28.7746301Z  codigoComandoTransacao 11 
2026-10-09T18:42:28.7746555Z  codigoAntecedenteTransacao 14 
2026-10-09T18:42:28.7747053Z  dataMovimento 09/04/2026 
2026-10-09T18:42:28.7747279Z  cnae null 
2026-10-09T18:42:28.7747515Z  codigoProduto 2068 
2026-10-09T18:42:28.7747732Z  codigoModalidade 5 
2026-10-09T18:42:28.7747951Z  notaAplicacao 2026032783471902 
2026-10-09T18:42:28.7748184Z  notaTransacao 2026032783471903 
2026-10-09T18:42:28.7748425Z  operador f609700 
2026-10-09T18:42:28.7748634Z  terminal 5191 
2026-10-09T18:42:28.7748937Z CorrelationID: a51b2c6a-47d4-4cc5-a246-2c1cb6caac1f 
2026-10-09T18:42:28.7749168Z  Body: {}
2026-10-09T18:42:28.7749702Z 2026-10-09 15:42:28,773 INFO  [br.gov.cai.sii.pub.InvestidorAlteraCodigoResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: GET /v2/investidores/{tipo_pessoa}/{documento}/instrumento-financeiro 
2026-10-09T18:42:28.7750199Z  CorrelationID: a51b2c6a-47d4-4cc5-a246-2c1cb6caac1f 
2026-10-09T18:42:28.7750443Z  HTTP Status: 200 
2026-10-09T18:42:28.7750645Z  Tempo: 1 ms 
2026-10-09T18:42:28.7771481Z 2026-10-09 15:42:28,774 INFO  [br.gov.cai.sii.pub.InvestidorAlteraCodigoResource] (main) ********** alteraCodigoRegistraAtivo(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/instrumento-financeiro) ***********
2026-10-09T18:42:28.7772576Z 2026-10-09 15:42:28,774 INFO  [br.gov.cai.sii.pub.InvestidorAlteraCodigoResource] (main) tipoPessoa pessoas-fisicas documento 12345678901  
2026-10-09T18:42:28.7774202Z 2026-10-09 15:42:28,775 INFO  [br.gov.cai.sii.pub.InvestidorAlteraCodigoResource] (main) entradaContaAtivoFinanceiro ParametrosRegistraAtivoFinanceiroDTO(codigoCanalOrigem=22, codigoSistemaOrigem=3274, nsuSistemaOrigem=null, codigoSistemaIntermediario=null, nsuSistemaIntermediario=null, unidadeOrigem=null, codigoAcao=null, codigoComando=null, codigoAntecedente=null, dataMovimento=null, dataReferencia=null, tipoPessoa=null, cpfCnpj=null, cpfCnpjAlfanumerico=null, cnae=null, codigoProduto=null, codigoModalidade=null, notaAplicacao=null, solicitante=null, tipoNotaTransacao=null, assinaturaCliente=null, operador=null, terminal=null, indicadorAlteraCodigoAtivo=null, codigoAtivoAnterior=null, codigoAtivoNovo=null, indicadorAlteraCodigoAtivoSwap=null, codigoAtivoSwapAnterior=null, codigoAtivoSwapNovo=null, observacao=null, dtMovimento=null, dtReferencia=null)
2026-10-09T18:42:28.7775468Z 2026-10-09 15:42:28,775 INFO  [br.gov.cai.sii.pub.InvestidorAlteraCodigoResource] (main) ********** alteraCodigoRegistraAtivo(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/instrumento-financeiro) ->1
2026-10-09T18:42:28.7826793Z 2026-10-09 15:42:28,777 INFO  [br.gov.cai.sii.pub.InvestidorAlteraCodigoResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: GET /v2/investidores/{tipo_pessoa}/{documento}/instrumento-financeiro 
2026-10-09T18:42:28.7828300Z  tipo_pessoa pessoas-fisicas documento 12345678901 
2026-10-09T18:42:28.7828690Z  codigoCanalOrigem null 
2026-10-09T18:42:28.7828947Z  codigoSistemaOrigem null 
2026-10-09T18:42:28.7829217Z  codigoSistemaIntermediario 
2026-10-09T18:42:28.7829470Z  0 nsuSistemaOrigem null 
2026-10-09T18:42:28.7829686Z  codigoAcaoTransacao 1 
2026-10-09T18:42:28.7829861Z  codigoComandoTransacao 11 
2026-10-09T18:42:28.7830239Z  codigoAntecedenteTransacao 14 
2026-10-09T18:42:28.7830644Z  dataMovimento 09/04/2026 
2026-10-09T18:42:28.7830850Z  cnae null 
2026-10-09T18:42:28.7831062Z  codigoProduto 2068 
2026-10-09T18:42:28.7831270Z  codigoModalidade 5 
2026-10-09T18:42:28.7831589Z  notaAplicacao 2026032783471902 
2026-10-09T18:42:28.7831826Z  notaTransacao 2026032783471903 
2026-10-09T18:42:28.7831997Z  operador null 
2026-10-09T18:42:28.7832199Z  terminal null 
2026-10-09T18:42:28.7832561Z CorrelationID: ff749163-4c3b-4175-81bc-9dace3b0644d 
2026-10-09T18:42:28.7832825Z  Body: {}
2026-10-09T18:42:28.7833366Z 2026-10-09 15:42:28,780 INFO  [br.gov.cai.sii.pub.InvestidorAlteraCodigoResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: GET /v2/investidores/{tipo_pessoa}/{documento}/instrumento-financeiro 
2026-10-09T18:42:28.7833839Z  CorrelationID: ff749163-4c3b-4175-81bc-9dace3b0644d 
2026-10-09T18:42:28.7834285Z  HTTP Status: 200 
2026-10-09T18:42:28.7834490Z  Tempo: 3 ms 
2026-10-09T18:42:28.7892297Z [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.327 s - in br.gov.caixa.siifx.pub2.InvestidorAlteraCodigoResourceTest
2026-10-09T18:42:28.7896691Z [INFO] Running br.gov.caixa.siifx.pub2.InvestidorAlteraContaResourceTest
2026-10-09T18:42:28.8724385Z 2026-10-09 15:42:28,863 INFO  [br.gov.cai.sii.pub.InvestidorAlteraContaResource] (main) ********** alteraContaIdentificaAtivoFinanceiro(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/conta-deposito) *********** 
2026-10-09T18:42:28.8725130Z 2026-10-09 15:42:28,863 INFO  [br.gov.cai.sii.pub.InvestidorAlteraContaResource] (main) tipo_pessoa 1 documento 1 
2026-10-09T18:42:28.8725468Z java.text.ParseException: Unparseable date: "1"
2026-10-09T18:42:28.8725692Z 	at java.base/java.text.DateFormat.parse(DateFormat.java:395)
2026-10-09T18:42:28.8726230Z 	at br.gov.caixa.siifx.pub2.BaseRestJsonResource.conveterStringToDate(BaseRestJsonResource.java:89)
2026-10-09T18:42:28.8726502Z 	at br.gov.caixa.siifx.pub2.InvestidorAlteraContaResource.alteraContaIdentificaAtivoFinanceiro(InvestidorAlteraContaResource.java:128)
2026-10-09T18:42:28.8726775Z 	at br.gov.caixa.siifx.pub2.InvestidorAlteraContaResourceTest.test(InvestidorAlteraContaResourceTest.java:49)
2026-10-09T18:42:28.8727152Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-09T18:42:28.8727374Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-10-09T18:42:28.8727847Z 2026-10-09 15:42:28,864 INFO  [br.gov.cai.sii.pub.InvestidorAlteraContaResource] (main) codigoCanalOrigem 1 codigoSistemaOrigem 1 codigoSistemaIntermediario 0 nsuSistemaOrigem 1 
2026-10-09T18:42:28.8728365Z 2026-10-09 15:42:28,864 INFO  [br.gov.cai.sii.pub.InvestidorAlteraContaResource] (main) codigoAcaoTransacao 1 codigoComandoTransacao 1 codigoAntecedenteTransacao 1 dataMovimento 1 
2026-10-09T18:42:28.8728745Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-10-09T18:42:28.8729072Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-10-09T18:42:28.8729288Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
2026-10-09T18:42:28.8729643Z 2026-10-09 15:42:28,864 INFO  [br.gov.cai.sii.pub.InvestidorAlteraContaResource] (main)  codigoProduto 1 codigoModalidade 1 notaAplicacao 1 
2026-10-09T18:42:28.8730013Z 2026-10-09 15:42:28,864 INFO  [br.gov.cai.sii.pub.InvestidorAlteraContaResource] (main) notaTransacao 1 operador 1 terminal 1 
2026-10-09T18:42:28.8730251Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-10-09T18:42:28.8730471Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-10-09T18:42:28.8730804Z 2026-10-09 15:42:28,864 ERROR [br.gov.cai.sii.pub.BaseRestJsonResource] (main) Erro ao formatar a data: -> 1
2026-10-09T18:42:28.8731031Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-10-09T18:42:28.8731314Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-10-09T18:42:28.8731654Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-10-09T18:42:28.8731929Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-10-09T18:42:28.8732224Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-10-09T18:42:28.8732528Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-10-09T18:42:28.8732958Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-10-09T18:42:28.8733214Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-10-09T18:42:28.8733465Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-10-09T18:42:28.8733727Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-10-09T18:42:28.8734126Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-10-09T18:42:28.8734449Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:217)
2026-10-09T18:42:28.8734707Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:28.8734933Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:213)
2026-10-09T18:42:28.8735281Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:138)
2026-10-09T18:42:28.8735608Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:68)
2026-10-09T18:42:28.8735863Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-10-09T18:42:28.8736110Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:28.8736357Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:28.8736604Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:28.8736834Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:28.8737084Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:28.8737351Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:28.8737587Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:28.8737798Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:28.8738018Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:28.8738300Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:28.8738555Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:28.8738797Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:28.8739030Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:28.8739254Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:28.8739519Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:28.8739761Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:28.8739997Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:28.8740206Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:28.8740491Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:28.8740822Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:28.8741063Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:28.8741331Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:28.8741601Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:28.8741863Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:28.8742107Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:28.8742346Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:28.8742590Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:28.8742904Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-10-09T18:42:28.8743176Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-10-09T18:42:28.8743424Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-10-09T18:42:28.8743672Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)
2026-10-09T18:42:28.8743940Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)
2026-10-09T18:42:28.8744181Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)
2026-10-09T18:42:28.8744438Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)
2026-10-09T18:42:28.8744699Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)
2026-10-09T18:42:28.8744921Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)
2026-10-09T18:42:28.8745150Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
2026-10-09T18:42:28.8745386Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
2026-10-09T18:42:28.8745683Z 	at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
2026-10-09T18:42:28.8745920Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:55)
2026-10-09T18:42:28.8746182Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:223)
2026-10-09T18:42:28.8746463Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:175)
2026-10-09T18:42:28.8746744Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:139)
2026-10-09T18:42:28.8746974Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:456)
2026-10-09T18:42:28.8747196Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:169)
2026-10-09T18:42:28.8747501Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:595)
2026-10-09T18:42:28.8747773Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:581)
2026-10-09T18:42:28.8748298Z 2026-10-09 15:42:28,868 INFO  [br.gov.cai.sii.pub.InvestidorAlteraContaResource] (main) ********** fim do alteraContaIdentificaAtivoFinanceiro(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/conta-deposito) *********** ->5
2026-10-09T18:42:28.8829550Z 2026-10-09 15:42:28,876 INFO  [br.gov.cai.sii.pub.InvestidorAlteraContaResource] (main) ********** alteraContaRegistraAtivo(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/conta-deposito) *********** 
2026-10-09T18:42:28.8832094Z 2026-10-09 15:42:28,878 INFO  [br.gov.cai.sii.pub.InvestidorAlteraContaResource] (main) tipo_pessoa: 1 | documento: 1 |  | entradaContaAtivoFinanceiro ParametrosAlteraContaAtivoFinanceiroDTO2(codigoCanalOrigem=1, codigoSistemaOrigem=1, nsuSistemaOrigem=1, codigoSistemaIntermediario=1, nsuSistemaIntermediario=1, unidadeOrigem=1, codigoAcaoTransacao=1, codigoComandoTransacao=1, codigoAntecedenteTransacao=1, dataMovimento=null, tipoPessoa=1, cpfCnpj=1, cnae=1, codigoProduto=1, codigoModalidade=1, notaAplicacao=1, tipoNotaTransacao=1, assinaturaCliente=1, operador=1, terminal=1, ufContaDestino=1, unidadeDepositoDestino=1, produtoDepositoDestino=1, contaDepositoDestino=1, digitoDepositoDestino=1, observacao=1, dtMovimento=null)
2026-10-09T18:42:28.8833398Z 2026-10-09 15:42:28,878 INFO  [br.gov.cai.sii.pub.InvestidorAlteraContaResource] (main) ********** alteraContaRegistraAtivo(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/conta-deposito) ->2
2026-10-09T18:42:28.8885207Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.093 s - in br.gov.caixa.siifx.pub2.InvestidorAlteraContaResourceTest
2026-10-09T18:42:28.8885769Z [INFO] Running br.gov.caixa.siifx.pub2.InvestidorAlteraTitularidadeResourceTest
2026-10-09T18:42:28.9779144Z 2026-10-09 15:42:28,970 INFO  [br.gov.cai.sii.pub.InvestidorAlteraTitularidadeResource] (main) ********** alteraTitularidadeIdentifica(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/titularidade) *********** 
2026-10-09T18:42:28.9780302Z 2026-10-09 15:42:28,971 INFO  [br.gov.cai.sii.pub.InvestidorAlteraTitularidadeResource] (main) tipo_pessoa: 1 | documento: 1 | codigoCanalOrigem: 1 | codigoSistemaOrigem: 1  | nsuSistemaOrigem: 1 |  coAcaoTransacao: 1 | codigoComandoTransacao: 1 | codigoAntecedenteTransacao: 1 | dataMovimento: null | codigoProduto: 1 | codigoModalidade: 1 | notaAplicacao: 1 | notaTransacao: 1 | operador: 1 |  terminal: 1 |  
2026-10-09T18:42:28.9781635Z 2026-10-09 15:42:28,975 INFO  [br.gov.cai.sii.pub.InvestidorAlteraTitularidadeResource] (main) ********** alteraTitularidadeIdentifica(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/titularidade) *********** 4
2026-10-09T18:42:29.0090617Z 2026-10-09 15:42:28,981 INFO  [br.gov.cai.sii.pub.InvestidorAlteraTitularidadeResource] (main) ********** alteraTitularidadeRegistra(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/titularidade) *********** 
2026-10-09T18:42:29.0093802Z 2026-10-09 15:42:29,005 INFO  [br.gov.cai.sii.pub.InvestidorAlteraTitularidadeResource] (main) tipo_pessoa: 1 | documento: 1 |  | entradaAlteraTitularidadeDTO ParametrosInvestidorAlteraTitularidadeDTO2(codigoCanalOrigem=1, codigoSistemaOrigem=1, nsuSistemaOrigem=1, codigoSistemaIntermediario=1, nsuSistemaIntermediario=1, unidadeOrigem=1, codigoAcaoTransacao=1, codigoComandoTransacao=1, codigoAntecedenteTransacao=1, coAcaoTransacao=1, coComandoTransacao=1, coAntecedenteTransacao=1, dataMovimento=1, tipoPessoa=1, cpfCnpj=1, cnae=1, codigoProduto=1, coProduto=1, codigoModalidade=1, coModalidade=1, notaAplicacao=1, tipoNotaTransacao=1, assinaturaCliente=1, operador=1, terminal=1, tipoPessoaCessionario=1, cpfCnpjCessionario=1, cnaeCessionario=1, nomeRazaoSocial=1, nomeSocialFantasia=1, codPerfilInvestidor=1, dataPerfilInvestidor=1, segmento=1, carteira=1, ufUnidadeAtivo=1, unidadeDeposito=1, produtoDeposito=1, contaDeposito=1, digitoDeposito=1, descricaoCartorioRegistro=1, cidade=1, estado=1, dataRegistro=1, observacoes=1, dtMovimento=Fri Oct 09 15:42:28 BRT 2026, dtRegistro=Fri Oct 09 15:42:28 BRT 2026, dtPerfilInvestidor=Fri Oct 09 15:42:28 BRT 2026) | 
2026-10-09T18:42:29.0095938Z 2026-10-09 15:42:29,007 INFO  [br.gov.cai.sii.pub.InvestidorAlteraTitularidadeResource] (main) ********** alteraTitularidadeRegistra(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/titularidade) ->25
2026-10-09T18:42:29.0162465Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.122 s - in br.gov.caixa.siifx.pub2.InvestidorAlteraTitularidadeResourceTest
2026-10-09T18:42:29.0163087Z [INFO] Running br.gov.caixa.siifx.pub2.InvestidorAplicacaoResgateResourceTest
2026-10-09T18:42:29.1302258Z [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.11 s - in br.gov.caixa.siifx.pub2.InvestidorAplicacaoResgateResourceTest
2026-10-09T18:42:29.1349947Z [INFO] Running br.gov.caixa.siifx.pub2.InvestidorAplicacoesResourceTest
2026-10-09T18:42:29.3364566Z 2026-10-09 15:42:29,329 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: POST /v2/investidores/{tipo_pessoa}/{documento}/aplicacoes/contrato/aplicacao tipo_pessoa: 1, documento: 1, CorrelationID: bc97c6b8-ff1c-46a3-a624-c5f63b8ad807, Body: ParametrosRegistraContratoV2DTO(codigoCanalOrigem=1, codigoSistemaOrigem=1, nsuSistemaOrigem=null, codigoSistemaIntermediario=null, nsuSistemaIntermediario=null, unidadeOrigem=null, codigoAcaoTransacao=null, codigoComandoTransacao=null, codigoAntecedenteTransacao=null, coAcaoTransacao=1, coComandoTransacao=1, coAntecedenteTransacao=1, nuProdutoRendaFixa=1, nuModalidadeProdutoRendaFixa=1, tipoPessoa=null, cpfCnpj=null, cocli=null, segmento=null, carteira=null, cnae=null, indicadorPerfilInvestidor=null, codigoPerfilInvestidor=null, dataPerfilInvestidor=null, dataMovimento=null, retroativo=null, dataReferencia=null, codigoProduto=null, codigoModalidade=null, valorAplicacao=null, prazoAplicacao=null, dataVencimento=null, prazoCarenciaNegocial=null, unidadeFederacao=null, unidadeDeposito=null, produtoDeposito=null, contaDeposito=null, digitoDeposito=null, relacionamentoCliente=null, origemRecurso=null, rentabilidade=null, tipoNotaTransacao=null, assinaturaCliente=null, operador=null, terminal=null, observacaoAplicacao=null, dtPerfilInvestidor=null, dtReferencia=null, dtMovimento=null, dtVencimento=null)
2026-10-09T18:42:29.3367557Z 2026-10-09 15:42:29,331 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: POST /v2/investidores/{tipo_pessoa}/{documento}/aplicacoes/contrato/aplicacao  CorrelationID: bc97c6b8-ff1c-46a3-a624-c5f63b8ad807  HTTP Status: 201 Created   Tempo: 26 ms.
2026-10-09T18:42:29.3371207Z 2026-10-09 15:42:29,331 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: POST /v2/investidores/{tipo_pessoa}/{documento}/aplicacoes/contrato/aplicacao tipo_pessoa: 1, documento: 1, CorrelationID: ee963e24-c675-49df-a01e-d84e9eb6579b, Body: ParametrosRegistraContratoV2DTO(codigoCanalOrigem=1, codigoSistemaOrigem=1, nsuSistemaOrigem=null, codigoSistemaIntermediario=0, nsuSistemaIntermediario=0, unidadeOrigem=null, codigoAcaoTransacao=1, codigoComandoTransacao=1, codigoAntecedenteTransacao=1, coAcaoTransacao=1, coComandoTransacao=1, coAntecedenteTransacao=1, nuProdutoRendaFixa=1, nuModalidadeProdutoRendaFixa=null, tipoPessoa=1, cpfCnpj=1, cocli=null, segmento=null, carteira=null, cnae=null, indicadorPerfilInvestidor=null, codigoPerfilInvestidor=null, dataPerfilInvestidor=null, dataMovimento=null, retroativo=null, dataReferencia=null, codigoProduto=1, codigoModalidade=1, valorAplicacao=null, prazoAplicacao=null, dataVencimento=null, prazoCarenciaNegocial=null, unidadeFederacao=null, unidadeDeposito=null, produtoDeposito=null, contaDeposito=null, digitoDeposito=null, relacionamentoCliente=null, origemRecurso=null, rentabilidade=null, tipoNotaTransacao=null, assinaturaCliente=null, operador=null, terminal=null, observacaoAplicacao=null, dtPerfilInvestidor=null, dtReferencia=null, dtMovimento=null, dtVencimento=null)
2026-10-09T18:42:29.3373240Z 2026-10-09 15:42:29,331 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: POST /v2/investidores/{tipo_pessoa}/{documento}/aplicacoes/contrato/aplicacao  CorrelationID: ee963e24-c675-49df-a01e-d84e9eb6579b  HTTP Status: 201 Created   Tempo: 0 ms.
2026-10-09T18:42:29.3375926Z 2026-10-09 15:42:29,331 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: POST /v2/investidores/{tipo_pessoa}/{documento}/aplicacoes/contrato/aplicacao tipo_pessoa: 1, documento: 1, CorrelationID: 3c4f5cc1-6730-4000-86db-d67a393258fb, Body: ParametrosRegistraContratoV2DTO(codigoCanalOrigem=1, codigoSistemaOrigem=1, nsuSistemaOrigem=null, codigoSistemaIntermediario=0, nsuSistemaIntermediario=0, unidadeOrigem=null, codigoAcaoTransacao=1, codigoComandoTransacao=1, codigoAntecedenteTransacao=1, coAcaoTransacao=1, coComandoTransacao=1, coAntecedenteTransacao=1, nuProdutoRendaFixa=null, nuModalidadeProdutoRendaFixa=1, tipoPessoa=1, cpfCnpj=1, cocli=null, segmento=null, carteira=null, cnae=null, indicadorPerfilInvestidor=null, codigoPerfilInvestidor=null, dataPerfilInvestidor=null, dataMovimento=null, retroativo=null, dataReferencia=null, codigoProduto=1, codigoModalidade=1, valorAplicacao=null, prazoAplicacao=null, dataVencimento=null, prazoCarenciaNegocial=null, unidadeFederacao=null, unidadeDeposito=null, produtoDeposito=null, contaDeposito=null, digitoDeposito=null, relacionamentoCliente=null, origemRecurso=null, rentabilidade=null, tipoNotaTransacao=null, assinaturaCliente=null, operador=null, terminal=null, observacaoAplicacao=null, dtPerfilInvestidor=null, dtReferencia=null, dtMovimento=null, dtVencimento=null)
2026-10-09T18:42:29.3377887Z 2026-10-09 15:42:29,332 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: POST /v2/investidores/{tipo_pessoa}/{documento}/aplicacoes/contrato/aplicacao  CorrelationID: 3c4f5cc1-6730-4000-86db-d67a393258fb  HTTP Status: 201 Created   Tempo: 1 ms.
2026-10-09T18:42:29.3380442Z 2026-10-09 15:42:29,332 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: POST /v2/investidores/{tipo_pessoa}/{documento}/aplicacoes/contrato/aplicacao tipo_pessoa: 1, documento: 1, CorrelationID: 1be30c84-76bc-4164-ba4c-d8fda2adb309, Body: ParametrosRegistraContratoV2DTO(codigoCanalOrigem=1, codigoSistemaOrigem=1, nsuSistemaOrigem=null, codigoSistemaIntermediario=0, nsuSistemaIntermediario=0, unidadeOrigem=null, codigoAcaoTransacao=1, codigoComandoTransacao=1, codigoAntecedenteTransacao=1, coAcaoTransacao=1, coComandoTransacao=1, coAntecedenteTransacao=null, nuProdutoRendaFixa=1, nuModalidadeProdutoRendaFixa=1, tipoPessoa=1, cpfCnpj=1, cocli=null, segmento=null, carteira=null, cnae=null, indicadorPerfilInvestidor=null, codigoPerfilInvestidor=null, dataPerfilInvestidor=null, dataMovimento=null, retroativo=null, dataReferencia=null, codigoProduto=1, codigoModalidade=1, valorAplicacao=null, prazoAplicacao=null, dataVencimento=null, prazoCarenciaNegocial=null, unidadeFederacao=null, unidadeDeposito=null, produtoDeposito=null, contaDeposito=null, digitoDeposito=null, relacionamentoCliente=null, origemRecurso=null, rentabilidade=null, tipoNotaTransacao=null, assinaturaCliente=null, operador=null, terminal=null, observacaoAplicacao=null, dtPerfilInvestidor=null, dtReferencia=null, dtMovimento=null, dtVencimento=null)
2026-10-09T18:42:29.3382500Z 2026-10-09 15:42:29,332 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: POST /v2/investidores/{tipo_pessoa}/{documento}/aplicacoes/contrato/aplicacao  CorrelationID: 1be30c84-76bc-4164-ba4c-d8fda2adb309  HTTP Status: 201 Created   Tempo: 0 ms.
2026-10-09T18:42:29.3385162Z 2026-10-09 15:42:29,332 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: POST /v2/investidores/{tipo_pessoa}/{documento}/aplicacoes/contrato/aplicacao tipo_pessoa: 1, documento: 1, CorrelationID: 74d33b12-56f2-48e7-b3f1-9bd98bfc6494, Body: ParametrosRegistraContratoV2DTO(codigoCanalOrigem=1, codigoSistemaOrigem=1, nsuSistemaOrigem=null, codigoSistemaIntermediario=0, nsuSistemaIntermediario=0, unidadeOrigem=null, codigoAcaoTransacao=1, codigoComandoTransacao=1, codigoAntecedenteTransacao=1, coAcaoTransacao=1, coComandoTransacao=null, coAntecedenteTransacao=1, nuProdutoRendaFixa=1, nuModalidadeProdutoRendaFixa=1, tipoPessoa=1, cpfCnpj=1, cocli=null, segmento=null, carteira=null, cnae=null, indicadorPerfilInvestidor=null, codigoPerfilInvestidor=null, dataPerfilInvestidor=null, dataMovimento=null, retroativo=null, dataReferencia=null, codigoProduto=1, codigoModalidade=1, valorAplicacao=null, prazoAplicacao=null, dataVencimento=null, prazoCarenciaNegocial=null, unidadeFederacao=null, unidadeDeposito=null, produtoDeposito=null, contaDeposito=null, digitoDeposito=null, relacionamentoCliente=null, origemRecurso=null, rentabilidade=null, tipoNotaTransacao=null, assinaturaCliente=null, operador=null, terminal=null, observacaoAplicacao=null, dtPerfilInvestidor=null, dtReferencia=null, dtMovimento=null, dtVencimento=null)
2026-10-09T18:42:29.3387220Z 2026-10-09 15:42:29,332 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: POST /v2/investidores/{tipo_pessoa}/{documento}/aplicacoes/contrato/aplicacao  CorrelationID: 74d33b12-56f2-48e7-b3f1-9bd98bfc6494  HTTP Status: 201 Created   Tempo: 0 ms.
2026-10-09T18:42:29.3389958Z 2026-10-09 15:42:29,332 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: POST /v2/investidores/{tipo_pessoa}/{documento}/aplicacoes/contrato/aplicacao tipo_pessoa: 1, documento: 1, CorrelationID: 20af3e11-2efd-465b-8501-75fc198bc68c, Body: ParametrosRegistraContratoV2DTO(codigoCanalOrigem=1, codigoSistemaOrigem=1, nsuSistemaOrigem=null, codigoSistemaIntermediario=0, nsuSistemaIntermediario=0, unidadeOrigem=null, codigoAcaoTransacao=1, codigoComandoTransacao=1, codigoAntecedenteTransacao=1, coAcaoTransacao=null, coComandoTransacao=1, coAntecedenteTransacao=1, nuProdutoRendaFixa=1, nuModalidadeProdutoRendaFixa=1, tipoPessoa=1, cpfCnpj=1, cocli=null, segmento=null, carteira=null, cnae=null, indicadorPerfilInvestidor=null, codigoPerfilInvestidor=null, dataPerfilInvestidor=null, dataMovimento=null, retroativo=null, dataReferencia=null, codigoProduto=1, codigoModalidade=1, valorAplicacao=null, prazoAplicacao=null, dataVencimento=null, prazoCarenciaNegocial=null, unidadeFederacao=null, unidadeDeposito=null, produtoDeposito=null, contaDeposito=null, digitoDeposito=null, relacionamentoCliente=null, origemRecurso=null, rentabilidade=null, tipoNotaTransacao=null, assinaturaCliente=null, operador=null, terminal=null, observacaoAplicacao=null, dtPerfilInvestidor=null, dtReferencia=null, dtMovimento=null, dtVencimento=null)
2026-10-09T18:42:29.3392118Z 2026-10-09 15:42:29,333 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: POST /v2/investidores/{tipo_pessoa}/{documento}/aplicacoes/contrato/aplicacao  CorrelationID: 20af3e11-2efd-465b-8501-75fc198bc68c  HTTP Status: 201 Created   Tempo: 1 ms.
2026-10-09T18:42:29.3410171Z 2026-10-09 15:42:29,339 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: POST /v2/investidores/{tipo_pessoa}/{documento}/aplicacoes/contrato/cancelamento  tipo_pessoa: 1, documento 12345678901  CorrelationID: 99b5fb6f-155c-4fef-97ff-49bb20e22972  Body: ParametrosRegistraCancelamentoAplicacaoDTO2(codigoCanalOrigem=1, codigoSistemaOrigem=1, nsuSistemaOrigem=1, codigoSistemaIntermediario=1, nsuSistemaIntermediario=1, unidadeOrigem=1, codigoAcaoTransacao=1, codigoComandoTransacao=1, codigoAntecedenteTransacao=1, dataMovimento=1, tipoPessoa=1, cpfCnpj=1, cnae=1, codigoProdutoRendaFixa=1, codigoModalidadeProdutoRendaFixa=1, codigoProduto=1, codigoModalidade=1, notaAplicacao=1, tipoNotaTransacao=1, assinaturaCliente=1, operador=1, terminal=1, solicitante=1, notaTransacao=1, nsuTransacaoOriginal=1, sequencialTransacao=1, valorTransacao=1, ufUnidadeDeposito=1, unidadeDeposito=1, produtoDeposito=1, contaDeposito=1, digitoDeposito=1)
2026-10-09T18:42:29.3412294Z 2026-10-09 15:42:29,339 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: POST /v2/investidores/{tipo_pessoa}/{documento}/aplicacoes/contrato/cancelamento  CorrelationID: 99b5fb6f-155c-4fef-97ff-49bb20e22972 HTTP Status: "200 OK" 
2026-10-09T18:42:29.3412942Z  Tempo: 1 ms.
2026-10-09T18:42:29.3429731Z 2026-10-09 15:42:29,340 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) ********** consultarPropostaContrato(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/aplicacoes/contrato/proposta") ***********
2026-10-09T18:42:29.3430371Z 2026-10-09 15:42:29,340 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) tipo_pessoa 1 documento 1 
2026-10-09T18:42:29.3430997Z 2026-10-09 15:42:29,341 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) codigoCanalOrigem 1 codigoSistemaOrigem 1 codigoSistemaIntermediario 0 nsuSistemaOrigem null 
2026-10-09T18:42:29.3431573Z 2026-10-09 15:42:29,341 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) dataMovimento 2026-02-10 
2026-10-09T18:42:29.3432265Z 2026-10-09 15:42:29,341 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) codigoProduto 1 codigoModalidade 1  
2026-10-09T18:42:29.3432849Z 2026-10-09 15:42:29,341 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) operador 1 terminal 1 
2026-10-09T18:42:29.3433506Z 2026-10-09 15:42:29,341 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) ********** fim do consultarPropostaContrato(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/aplicacoes/contrato/proposta") *********** -> 1ms
2026-10-09T18:42:29.3434344Z 2026-10-09 15:42:29,341 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) ********** consultarPropostaContrato(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/aplicacoes/contrato/proposta") ***********
2026-10-09T18:42:29.3434952Z 2026-10-09 15:42:29,341 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) tipo_pessoa 1 documento 1 
2026-10-09T18:42:29.3435439Z 2026-10-09 15:42:29,341 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) codigoCanalOrigem 1 codigoSistemaOrigem 1 codigoSistemaIntermediario 0 nsuSistemaOrigem 1 
2026-10-09T18:42:29.3435893Z 2026-10-09 15:42:29,341 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) dataMovimento 2026-02-10 
2026-10-09T18:42:29.3436326Z 2026-10-09 15:42:29,341 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) codigoProduto null codigoModalidade null  
2026-10-09T18:42:29.3436723Z 2026-10-09 15:42:29,341 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) operador 1 terminal 1 
2026-10-09T18:42:29.3437352Z 2026-10-09 15:42:29,342 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) ********** fim do consultarPropostaContrato(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/aplicacoes/contrato/proposta") *********** -> 1ms
2026-10-09T18:42:29.3450844Z 2026-10-09 15:42:29,342 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) ********** consultarNegociacaoContrato(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/aplicacoes/contrato/remuneracao) *********** 
2026-10-09T18:42:29.3451770Z 2026-10-09 15:42:29,343 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) tipo_pessoa: 1 | documento: 1 | codigoCanalOrigem: 1 | codigoSistemaOrigem: 1 |  codigoSistemaIntermediario: 0 | nsuSistemaOrigem: null |  dataMovimento: 2026-02-10 | dataReferencia: 2026-02-10 | codigoProduto: 1 | codigoModalidade: 1 | segmento: 1 | valorAplicacao: 0 | valorTotalRelacionamento: 0 | dataVencimento: 2026-02-10 | uf: DF |  | prazoCarenciaNegocial: 1 | operador: 1 |  terminal: 1
2026-10-09T18:42:29.3452388Z 2026-10-09 15:42:29,343 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) ********** fim do consultarNegociacaoContrato(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/aplicacoes/contrato/remuneracao") *********** -> 0ms
2026-10-09T18:42:29.3453065Z 2026-10-09 15:42:29,343 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) ********** consultarNegociacaoContrato(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/aplicacoes/contrato/remuneracao) *********** 
2026-10-09T18:42:29.3453757Z 2026-10-09 15:42:29,343 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) tipo_pessoa: 1 | documento: 1 | codigoCanalOrigem: 1 | codigoSistemaOrigem: 1 |  codigoSistemaIntermediario: 0 | nsuSistemaOrigem: 1 |  dataMovimento: 2026-02-10 | dataReferencia: 2026-02-10 | codigoProduto: null | codigoModalidade: null | segmento: 1 | valorAplicacao: 0 | valorTotalRelacionamento: 0 | dataVencimento: 2026-02-10 | uf: DF |  | prazoCarenciaNegocial: null | operador: 1 |  terminal: 1
2026-10-09T18:42:29.3454360Z 2026-10-09 15:42:29,343 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) ********** fim do consultarNegociacaoContrato(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/aplicacoes/contrato/remuneracao") *********** -> 0ms
2026-10-09T18:42:29.3508607Z cancelaAplicacaoResource
2026-10-09T18:42:29.3509266Z 2026-10-09 15:42:29,345 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) ********** cancelaAplicacaoEtapa1(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/aplicacoes/contrato) ***********
2026-10-09T18:42:29.3509979Z 2026-10-09 15:42:29,349 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) tipo_pessoa: 1 | documento: 12345678901 | codigoCanalOrigem: 10 | codigoSistemaOrigem: 20 |  codigoSistemaIntermediario: 0 | nsuSistemaOrigem: 30 |  codigoAcaoTransacao: 1 | codigoComandoTransacao: 2 | codigoAntecedenteTransacao: 3 | dataMovimento: 01/01/2025 | codigoProduto: 100 | codigoModalidade: 200 | notaAplicacao: 300 | notaTransacao: 400 |   operador: uriInfo |  terminal: OPERADOR
2026-10-09T18:42:29.3510802Z 2026-10-09 15:42:29,349 INFO  [br.gov.cai.sii.pub.InvestidorAplicacoesResource] (main) ********** fim do cancelaAplicacaoEtapa1(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/aplicacoes/contrato") *********** -> 4ms
2026-10-09T18:42:29.3568643Z [INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.22 s - in br.gov.caixa.siifx.pub2.InvestidorAplicacoesResourceTest
2026-10-09T18:42:29.3568983Z [INFO] Running br.gov.caixa.siifx.pub2.InvestidorBloqueiaTituloResourceTest
2026-10-09T18:42:29.4595248Z 2026-10-09 15:42:29,449 INFO  [br.gov.cai.sii.pub.InvestidorBloqueiaTituloResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: GET /v2/investidores/{tipo_pessoa}/{documento}/instrumento-financeiro/bloqueio/posicao-titulo-financeiro 
2026-10-09T18:42:29.4596103Z  tipo_pessoa: 1, documento 1 
2026-10-09T18:42:29.4596345Z  CorrelationID: 1d2cc370-8819-414c-a155-55ee858360bc 
2026-10-09T18:42:29.4596855Z  codigoCanalOrigem: 1, codigoSistemaOrigem: 1, nsuSistemaOrigem: 1, codigoAcaoTransacao: 1, codigoComandoTransacao: 1, codigoAntecedenteTransacao: 1, unidadeOrigem 1, dataMovimento: 11/11/1111, codigoCnae: 1, codigoProduto: 1, codigoModalidade: 1, notaAplicacao: 1, notaTransacao: 1, operador: 1, terminal: 1
2026-10-09T18:42:29.4597375Z 2026-10-09 15:42:29,457 INFO  [br.gov.cai.sii.pub.InvestidorBloqueiaTituloResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: GET /v2/investidores/{tipo_pessoa}/{documento}/instrumento-financeiro/bloqueio/posicao-titulo-financeiro 
2026-10-09T18:42:29.4597713Z  CorrelationID: 1d2cc370-8819-414c-a155-55ee858360bc 
2026-10-09T18:42:29.4597865Z  HTTP Status: "200 OK" 
2026-10-09T18:42:29.4598000Z  Tempo: 8 ms.
2026-10-09T18:42:29.4637165Z 2026-10-09 15:42:29,461 INFO  [br.gov.cai.sii.pub.InvestidorBloqueiaTituloResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: GET /v2/investidores/{tipo_pessoa}/{documento}/instrumento-financeiro/bloqueio/valores-calculados 
2026-10-09T18:42:29.4638418Z  tipo_pessoa: 1, documento 1 
2026-10-09T18:42:29.4638700Z  CorrelationID: 3c945a54-58a7-4b88-a45f-47fda8fa0894 
2026-10-09T18:42:29.4639869Z  codigoCanalOrigem: 1, codigoSistemaOrigem: 1, nsuSistemaOrigem: 1, unidadeOrigem 1, dataMovimento: 11/11/1111, codigoCnae: 1, codigoProduto: 1, codigoModalidade: 1, notaAplicacao: 1, notaTransacao: 1, operador: 1, terminal: 1, contratoIdentificador: 1,  tipoBloqueio: 1, descricaoTipoBloqueio: 1, valorSolicitado: 1, observacoes: 1
2026-10-09T18:42:29.4640436Z 2026-10-09 15:42:29,462 INFO  [br.gov.cai.sii.pub.InvestidorBloqueiaTituloResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: GET /v2/investidores/{tipo_pessoa}/{documento}/instrumento-financeiro/bloqueio/valores-calculados 
2026-10-09T18:42:29.4640746Z  CorrelationID: 3c945a54-58a7-4b88-a45f-47fda8fa0894 
2026-10-09T18:42:29.4640898Z  HTTP Status: "200 OK" 
2026-10-09T18:42:29.4641031Z  Tempo: 1 ms.
2026-10-09T18:42:29.4689697Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.108 s - in br.gov.caixa.siifx.pub2.InvestidorBloqueiaTituloResourceTest
2026-10-09T18:42:29.4690423Z [INFO] Running br.gov.caixa.siifx.pub2.InvestidorCancelaResgateResourceTest
2026-10-09T18:42:29.5608754Z [INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.086 s - in br.gov.caixa.siifx.pub2.InvestidorCancelaResgateResourceTest
2026-10-09T18:42:29.5610160Z [INFO] Running br.gov.caixa.siifx.pub2.InvestidorDevolucaoImpostoResourceTest
2026-10-09T18:42:29.6482551Z 2026-10-09 15:42:29,644 INFO  [br.gov.cai.sii.pub.InvestidorDevolucaoImpostoResource] (main) ********** devolucaoImpostoIdentificaEtapa1(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/devolucao-imposto/) *********** 
2026-10-09T18:42:29.6483913Z 2026-10-09 15:42:29,645 INFO  [br.gov.cai.sii.pub.InvestidorDevolucaoImpostoResource] (main) tipo_pessoa: 1 | documento: 12345678901 | codigoCanalOrigem: 1 | codigoSistemaOrigem: 2  | nsuSistemaOrigem: null |  codigoAcaoTransacao: 1 | codigoComandoTransacao: 11 | codigoAntecedenteTransacao: 14 | dataMovimento: 01/01/2024  |  
2026-10-09T18:42:29.6484818Z 2026-10-09 15:42:29,645 INFO  [br.gov.cai.sii.pub.InvestidorDevolucaoImpostoResource] (main) ********** fim devolucaoImpostoIdentificaEtapa1 /v2/investidores/{tipo_pessoa}/{documento}/devolucao-imposto ***********  ->1
2026-10-09T18:42:29.6523218Z 2026-10-09 15:42:29,650 INFO  [br.gov.cai.sii.pub.InvestidorDevolucaoImpostoResource] (main) ********** devolucaoImpostoIdentificaEtapa1(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/devolucao-imposto/) *********** 
2026-10-09T18:42:29.6523987Z 2026-10-09 15:42:29,650 INFO  [br.gov.cai.sii.pub.InvestidorDevolucaoImpostoResource] (main) tipo_pessoa: 1 | documento: 12345678901 | codigoCanalOrigem: 1 | codigoSistemaOrigem: 2  | nsuSistemaOrigem: 3 |  codigoAcaoTransacao: 1 | codigoComandoTransacao: 11 | codigoAntecedenteTransacao: 14 | dataMovimento: 01/01/2024  |  
2026-10-09T18:42:29.6524722Z 2026-10-09 15:42:29,650 INFO  [br.gov.cai.sii.pub.InvestidorDevolucaoImpostoResource] (main) ********** fim devolucaoImpostoIdentificaEtapa1 /v2/investidores/{tipo_pessoa}/{documento}/devolucao-imposto ***********  ->0
2026-10-09T18:42:29.6550108Z 2026-10-09 15:42:29,652 INFO  [br.gov.cai.sii.pub.InvestidorDevolucaoImpostoResource] (main) ********** devolucaoImpostoRegistraEtapa2(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/devolucao-imposto) *********** 
2026-10-09T18:42:29.6551102Z 2026-10-09 15:42:29,653 INFO  [br.gov.cai.sii.pub.InvestidorDevolucaoImpostoResource] (main) tipo_pessoa: 1 | documento: 12345678901 |  | devolucaoImposto EntradaDevolucaoImpostoDTO(codigoCanalOrigem=1, codigoSistemaOrigem=2, nsuSistemaOrigem=3, codigoSistemaIntermediario=null, nsuSistemaIntermediario=null, unidadeOrigem=10, codigoAcaoTransacao=1, codigoComandoTransacao=11, codigoAntecedenteTransacao=14, dataMovimento=null, tipoPessoa=1, cpfCnpj=12345678901, cnae=null, tipoNotaTransacao=null, assinaturaCliente=null, operador=null, terminal=null, quantidadeDevolucoes=1, transacaoDevolucao=null)
2026-10-09T18:42:29.6552148Z 2026-10-09 15:42:29,654 INFO  [br.gov.cai.sii.pub.InvestidorDevolucaoImpostoResource] (main) ********** fim devolucaoImpostoRegistraEtapa2  /v2/investidores/{tipo_pessoa}/{documento}/devolucao-imposto ***********  ->2
2026-10-09T18:42:29.6656902Z [INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.094 s - in br.gov.caixa.siifx.pub2.InvestidorDevolucaoImpostoResourceTest
2026-10-09T18:42:29.6657197Z [INFO] Running br.gov.caixa.siifx.pub2.InvestidorEstornaAplicacaoResourceTest
2026-10-09T18:42:29.7591867Z 2026-10-09 15:42:29,738 INFO  [br.gov.cai.sii.pub.InvestidorEstornaAplicacaoResource] (main) ********** estornaAplicacaoRegistra(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/aplicacoes/contrato/estorno) *********** 
2026-10-09T18:42:29.7593191Z 2026-10-09 15:42:29,755 INFO  [br.gov.cai.sii.pub.InvestidorEstornaAplicacaoResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: POST /aplicacoes/contrato/estorno tipo_pessoa: 1, documento 1, CorrelationID: b664eaac-024f-47bb-a525-8a8bd155c93b, Body: ParametrosEstornaAplicacaoDTO2(codigoCanalOrigem=1, codigoSistemaOrigem=1, nsuSistemaOrigem=1, codigoSistemaIntermediario=1, nsuSistemaIntermediario=1, unidadeOrigem=1, codigoAcaoTransacao=1, codigoComandoTransacao=1, codigoAntecedenteTransacao=1, dataMovimento=null, tipoPessoa=1, cpfCnpj=1, cnae=1, codigoProduto=1, codigoModalidade=1, notaAplicacao=1, tipoNotaTransacao=1, assinaturaCliente=1, operador=1, terminal=1, solicitante=1, notaTransacao=1, nsuTransacaoOriginal=1, sequencialTransacao=1, valorAplicacao=1, ufUnidadeDeposito=1, unidadeDeposito=1, produtoDeposito=1, contaDeposito=1, digitoDeposito=1, valorTarifa=1, dataReferencia=null, justificativa=1)
2026-10-09T18:42:29.7594422Z 2026-10-09 15:42:29,756 INFO  [br.gov.cai.sii.pub.InvestidorEstornaAplicacaoResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: POST /aplicacoes/contrato/estorno  CorrelationID: b664eaac-024f-47bb-a525-8a8bd155c93b  HTTP Status: 200 OK   Tempo: 17 ms.
2026-10-09T18:42:29.7667289Z 2026-10-09 15:42:29,761 INFO  [br.gov.cai.sii.pub.InvestidorEstornaAplicacaoResource] (main) ********** estornaAplicacaoIdentifica(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/aplicacoes/contrato/estorno) ***********
2026-10-09T18:42:29.7668222Z 2026-10-09 15:42:29,761 INFO  [br.gov.cai.sii.pub.InvestidorEstornaAplicacaoResource] (main)  codigoCanalOrigem: 1 | codigoSistemaOrigem: 2 | codigoSistemaIntermediario: 0  | nsuSistemaOrigem: 3 |  codigoAcaoTransacao: 1 | codigoComandoTransacao: 11 | codigoAntecedenteTransacao: 14 | dataMovimento: 01/01/2024 | tipo_pessoa: 1 | documento: 1  | codigoProduto: 1 | codigoModalidade: 1 |   notaTransacao: 1 notaAplicacao: 1 |   operador: 1 |  terminal: 1 | 
2026-10-09T18:42:29.7668865Z 2026-10-09 15:42:29,762 INFO  [br.gov.cai.sii.pub.InvestidorEstornaAplicacaoResource] (main) ********** fim do estornaAplicacaoIdentifica(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/aplicacoes/contrato/estorno) *********** -> 1ms
2026-10-09T18:42:29.7685438Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.104 s - in br.gov.caixa.siifx.pub2.InvestidorEstornaAplicacaoResourceTest
2026-10-09T18:42:29.7685921Z [INFO] Running br.gov.caixa.siifx.pub2.InvestidorEstornoAplicacaoResgateResourceTest
2026-10-09T18:42:29.8644891Z [INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.09 s - in br.gov.caixa.siifx.pub2.InvestidorEstornoAplicacaoResgateResourceTest
2026-10-09T18:42:29.8658553Z [INFO] Running br.gov.caixa.siifx.pub2.InvestidorGeralResourceTest
2026-10-09T18:42:30.1205686Z 2026-10-09 15:42:30,117 INFO  [br.gov.cai.sii.pub.InvestidorGeralResource] (main) ********** consultaTransacoesPendentesAlcada(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/transacoes-pendentes-alcada) ***********
2026-10-09T18:42:30.1206812Z 2026-10-09 15:42:30,117 INFO  [br.gov.cai.sii.pub.InvestidorGeralResource] (main)  codigoCanalOrigem: 1 | codigoSistemaOrigem: 1 | nsuSistemaOrigem: 1 |  codigoSistemaIntermediario: 0  | nsuSistemaIntermediario: 0 |  codigoAcaoTransacao: 1 | codigoComandoTransacao: 1 | codigoAntecedenteTransacao: 1 | dataMovimento: 1 | tipoPessoa: 1 | cpfCnpj: 1 | codigoAcao: 1 | codigoComando | codigoAntecedente: 1 | unidadeAtivo: 1 | notaAplicacao: 1  operador: 1 |  terminal: 1 | 
2026-10-09T18:42:30.1207427Z 2026-10-09 15:42:30,118 INFO  [br.gov.cai.sii.pub.InvestidorGeralResource] (main) ********** fim do consultaTransacoesPendentesAlcada(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/transacoes-pendentes-alcada) *********** -> 1ms
2026-10-09T18:42:30.1365326Z 2026-10-09 15:42:30,123 INFO  [br.gov.cai.sii.pub.InvestidorGeralResource] (main) ********** recusaAprovaTransacaoEtapa1(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/transacoes/autorizacao) ***********
2026-10-09T18:42:30.1367366Z 2026-10-09 15:42:30,134 INFO  [br.gov.cai.sii.pub.InvestidorGeralResource] (main) tipo_pessoa: 1 | documento: 1 |  | recusaAprovaTransacaoDTO EntradaParametrosAprovaRecusaTransacaoDTO2(codigoCanalOrigem=1, codigoSistemaOrigem=1, nsuSistemaOrigem=1, codigoSistemaIntermediario=1, nsuSistemaIntermediario=1, unidadeOrigem=1, codigoAcaoTransacao=1, codigoComandoTransacao=1, codigoAntecedenteTransacao=1, dataMovimento=null, tipoPessoa=1, cpfCnpj=1, cnae=1, codigoProduto=1, codigoModalidade=1, notaAplicacao=1, notaTransacao=1, tipoNotaTransacao=1, assinaturaCliente=1, autorizador=1, terminal=1, codigoAlcada=1, parecerManifestacao=1)
2026-10-09T18:42:30.1368225Z 2026-10-09 15:42:30,135 INFO  [br.gov.cai.sii.pub.InvestidorGeralResource] (main) ********** fim do recusaAprovaTransacaoEtapa1(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/transacoes/autorizacao) *********** -> 1ms
2026-10-09T18:42:30.1463166Z 2026-10-09 15:42:30,137 INFO  [br.gov.cai.sii.pub.InvestidorGeralResource] (main) ********** consultaTabelaComercializacao(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/instrumento-financeiro/tabela-comercializacao) ***********
2026-10-09T18:42:30.1486912Z 2026-10-09 15:42:30,137 INFO  [br.gov.cai.sii.pub.InvestidorGeralResource] (main)  codigoCanalOrigem: 1 | codigoSistemaOrigem: 1 | nsuSistemaOrigem: 1 |  codigoSistemaIntermediario: 0  |  nsuSistemaIntermediario: 1 | dataMovimento: 1 | tipo_pessoa: 1 | documento: 1  | segmento: 1 |codigoProduto: 1 | codigoModalidade: 1 | codigoTabela: 1 |  codigoVersao: 1  operador: 1 |  terminal: 1 | 
2026-10-09T18:42:30.1487647Z 2026-10-09 15:42:30,137 INFO  [br.gov.cai.sii.pub.InvestidorGeralResource] (main) codigoCanalOrigem: 1 | codigoSistemaOrigem: 1 | codigoSistemaIntermediario: 0 | nsuSistemaOrigem: 1 | 
2026-10-09T18:42:30.1488013Z 2026-10-09 15:42:30,137 ERROR [br.gov.cai.sii.pub.BaseRestJsonResource] (main) Erro ao formatar a data: -> 1
2026-10-09T18:42:30.1488368Z java.text.ParseException: Unparseable date: "1"
2026-10-09T18:42:30.1488606Z 	at java.base/java.text.DateFormat.parse(DateFormat.java:395)
2026-10-09T18:42:30.1488832Z 	at br.gov.caixa.siifx.pub2.BaseRestJsonResource.conveterStringToDate(BaseRestJsonResource.java:89)
2026-10-09T18:42:30.1489095Z 	at br.gov.caixa.siifx.pub2.InvestidorGeralResource.consultaTabelaComercializacao(InvestidorGeralResource.java:129)
2026-10-09T18:42:30.1489366Z 	at br.gov.caixa.siifx.pub2.InvestidorGeralResourceTest.consultaTabelaComercializacaoTest(InvestidorGeralResourceTest.java:62)
2026-10-09T18:42:30.1489631Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-09T18:42:30.1489819Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-10-09T18:42:30.1490067Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-10-09T18:42:30.1490487Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-10-09T18:42:30.1490708Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
2026-10-09T18:42:30.1490938Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-10-09T18:42:30.1491210Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-10-09T18:42:30.1491571Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-10-09T18:42:30.1491820Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-10-09T18:42:30.1492091Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-10-09T18:42:30.1492365Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-10-09T18:42:30.1492719Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-10-09T18:42:30.1493049Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-10-09T18:42:30.1493392Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-10-09T18:42:30.1493646Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-10-09T18:42:30.1493898Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-10-09T18:42:30.1494148Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-10-09T18:42:30.1494367Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-10-09T18:42:30.1494651Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:217)
2026-10-09T18:42:30.1494912Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:30.1495173Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:213)
2026-10-09T18:42:30.1495442Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:138)
2026-10-09T18:42:30.1495690Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:68)
2026-10-09T18:42:30.1495947Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-10-09T18:42:30.1496204Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:30.1496454Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:30.1496709Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:30.1496939Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:30.1497183Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:30.1497524Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:30.1497738Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:30.1497975Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:30.1498268Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:30.1498606Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:30.1498854Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:30.1499126Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:30.1499367Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:30.1499611Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:30.1499863Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:30.1500280Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:30.1500573Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:30.1500792Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:30.1501004Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:30.1501289Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:30.1501632Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:30.1501893Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:30.1502126Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:30.1502453Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:30.1502704Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:30.1502953Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:30.1503193Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:30.1503502Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-10-09T18:42:30.1504047Z 2026-10-09 15:42:30,138 INFO  [br.gov.cai.sii.pub.InvestidorGeralResource] (main) ********** fim do consultaTabelaComercializacao(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/instrumento-financeiro/tabela-comercializacao) *********** -> 1ms
2026-10-09T18:42:30.1504378Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-10-09T18:42:30.1504642Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-10-09T18:42:30.1504893Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)
2026-10-09T18:42:30.1505138Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)
2026-10-09T18:42:30.1505388Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)
2026-10-09T18:42:30.1505610Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)
2026-10-09T18:42:30.1505877Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)
2026-10-09T18:42:30.1506136Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)
2026-10-09T18:42:30.1506448Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
2026-10-09T18:42:30.1506671Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
2026-10-09T18:42:30.1506917Z 	at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
2026-10-09T18:42:30.1507165Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:55)
2026-10-09T18:42:30.1507488Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:223)
2026-10-09T18:42:30.1507749Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:175)
2026-10-09T18:42:30.1507997Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:139)
2026-10-09T18:42:30.1508246Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:456)
2026-10-09T18:42:30.1508546Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:169)
2026-10-09T18:42:30.1508725Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:595)
2026-10-09T18:42:30.1508938Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:581)
2026-10-09T18:42:30.1509288Z [INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.273 s - in br.gov.caixa.siifx.pub2.InvestidorGeralResourceTest
2026-10-09T18:42:30.1509503Z [INFO] Running br.gov.caixa.siifx.pub2.InvestidorTransacoesResourceTest
2026-10-09T18:42:30.4458589Z 2026-10-09 15:42:30,438 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: tipo_pessoa:  | documento: , Body: {"codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":null,"codigoSistemaIntermediario":null,"nsuSistemaIntermediario":null,"codigoAcao":null,"codigoComando":null,"codigoAntecedente":null,"dataMovimento":null,"operador":null,"terminal":null,"dataInicio":null,"dataFim":null,"horaInicio":null,"horaFim":null,"unidade":null,"tipoPessoa":null,"cpfCnpj":null,"cpfCnpjAlfanumerico":null,"codigoProduto":null,"codigoModalidade":null,"notaAplicacao":null,"notaTransacao":null,"operadorFiltro":null,"autorizador":null,"unidadeDeposito":null,"produtoDeposito":null,"contaDeposito":null,"digitoDeposito":null,"tipoTransacao":null,"situacaoTransacao":null,"valorMinimo":null,"valorMaximo":null,"token":null}
2026-10-09T18:42:30.4459870Z 2026-10-09 15:42:30,439 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: null CorrelationID: null HTTP Status: "200 OK" Tempo: 51 ms.
2026-10-09T18:42:30.4465843Z 2026-10-09 15:42:30,444 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: tipo_pessoa: 1 | documento: 1, Body: {"codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"1","codigoAntecedenteTransacao":"1","unidadeOrigem":1,"dataMovimento":"1","tipoPessoa":"1","documento":"1","codigoProduto":"1","codigoModalidade":1,"notaTransacao":"1","notaAplicacao":"1","operador":"1","terminal":1}
2026-10-09T18:42:30.4609035Z 2026-10-09 15:42:30,459 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: tipo_pessoa: 1 | documento: 1, Body: {"codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoSistemaIntermediario":1,"codigoAcaoTransacao":"1","nsuSistemaIntermediario":"1","codigoComandoTransacao":"1","codigoAntecedenteTransacao":"1","unidadeOrigem":1,"dataMovimento":{"date":null,"dataString":null},"codigoCnae":"1","codigoProduto":1,"codigoModalidade":1,"operador":"1","terminal":"1","contratoIdentificador":"1","tipoBloqueio":"1","descricaoTipoBloqueio":"1","valorSolicitado":1,"observacoes":"1","notaAplicacao":1,"tipoNotaTransacao":"1","assinaturaCliente":1,"quantidadeTitulos":"1","valorBloqueio":1,"tipoPessoa":1,"cpfCnpj":"1"}
2026-10-09T18:42:30.4691332Z 2026-10-09 15:42:30,466 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: tipo_pessoa: 1 | documento: 1, Body: {"codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoSistemaIntermediario":1,"nsuSistemaIntermediario":"1","unidadeOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"1","codigoAntecedenteTransacao":"1","dataMovimento":{"date":null,"dataString":null},"codigoProduto":1,"tipoPessoa":1,"cpfCnpj":"1","codigoCnae":1,"codigoModalidade":1,"notaAplicacao":1,"assinaturaCliente":1,"operador":"1","terminal":"1","notaTransacao":1,"valorTransacao":1,"contratoIdentificador":"1","justificativa":"1","sequencialTransacao":1,"nsuTransacao":1,"tipoNotaTransacao":"1"}
2026-10-09T18:42:30.4791810Z 2026-10-09 15:42:30,470 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"1","codigoAntecedenteTransacao":"1","dataMovimento":"2026-03-06","operador":"1","terminal":1,"dataInicio":"2026-03-06","dataFim":"2026-03-06","horaInicio":"00:00","horaFim":"00:00","unidadeOrigem":1,"tipoPessoa":1,"documento":"1","codigoProduto":1,"codigoModalidade":1,"notaAplicacao":1,"notaTransacao":1,"operadorFiltro":"1","autorizador":"1","unidadeDeposito":1,"produtoDeposito":1,"contaDeposito":1,"digitoDeposito":1,"tipoTransacao":"1","situacaoTransacao":1,"valorMinimo":1,"valorMaximo":1}
2026-10-09T18:42:30.4793172Z 2026-10-09 15:42:30,471 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: null CorrelationID: null HTTP Status: "200 OK" Tempo: 2 ms.
2026-10-09T18:42:30.4794174Z 2026-10-09 15:42:30,477 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"1","codigoAntecedenteTransacao":"1","dataMovimento":"2026-03-06","operador":"1","terminal":1,"dataInicio":"2026-03-06","dataFim":"2026-03-06","horaInicio":"00:00","horaFim":"00:00","unidadeOrigem":1,"tipoPessoa":1,"documento":"1","codigoProduto":1,"codigoModalidade":1,"notaAplicacao":1,"notaTransacao":1,"operadorFiltro":"1","autorizador":"1","unidadeDeposito":1,"produtoDeposito":1,"contaDeposito":1,"digitoDeposito":1,"tipoTransacao":"1","situacaoTransacao":1,"valorMinimo":1,"valorMaximo":1}
2026-10-09T18:42:30.4795020Z 2026-10-09 15:42:30,477 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidorTransacoesResourcetransacaoGenerica. Exception  Status: Status code: 0. Parametros: null Mensagem: null
2026-10-09T18:42:30.4838018Z [INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.334 s - in br.gov.caixa.siifx.pub2.InvestidorTransacoesResourceTest
2026-10-09T18:42:30.4838341Z [INFO] Running br.gov.caixa.siifx.pub2.InvestidorTransferenciaCustodiaResourceTest
2026-10-09T18:42:30.5759975Z 2026-10-09 15:42:30,572 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main) ********** transferenciaCustodiaIdentificaEtapa1(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/custodia/transferencia) *********** 
2026-10-09T18:42:30.5760826Z 2026-10-09 15:42:30,573 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main)  codigoCanalOrigem: 1 | codigoSistemaOrigem: 2 | nsuSistemaOrigem: 3 |  codigoSistemaIntermediario: 0  |   codigoAcaoTransacao: 1 | codigoComandoTransacao: 11 | codigoAntecedenteTransacao: 14 | dataMovimento: 01/01/2024 | tipo_pessoa: pessoas-fisicas | documento: 12345678901  | codigoProduto: null | codigoModalidade: null |   notaTransacao: null notaAplicacao: null |   operador: null |  terminal: null | 
2026-10-09T18:42:30.5762454Z 2026-10-09 15:42:30,573 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main) **********  fim transferenciaCustodiaIdentificaEtapa1(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/custodia/transferencia) *********** ->0
2026-10-09T18:42:30.5811282Z 2026-10-09 15:42:30,578 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main) ********** alteraContaRegistraAtivo(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/custodia/transferencia) *********** 
2026-10-09T18:42:30.5812631Z 2026-10-09 15:42:30,579 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main) tipo_pessoa: pessoas-fisicas | documento: 12345678901 |  | entradaDevolucaoImpostoEtapa2DTO EntradaParametrosTransferenciaCustodiaDTO(codigoCanalOrigem=1, codigoSistemaOrigem=2, nsuSistemaOrigem=3, codigoSistemaIntermediario=null, nsuSistemaIntermediario=null, unidadeOrigem=null, codigoAcaoTransacao=1, codigoComandoTransacao=11, codigoAntecedenteTransacao=14, dataMovimento=null, tipoPessoa=null, cpfCnpj=null, cpfCnpjAlfanumerico=null, cnae=null, codigoProduto=null, codigoModalidade=null, notaAplicacao=null, tipoNotaTransacao=null, assinaturaCliente=null, operador=null, terminal=null, codigoInstuicaoCessionario=null, cnpjCessionario=null, cnpjCessionarioAlfanumerico=null, contaCessionarioB3=null, codigoContaCliente=null, motivo=null)
2026-10-09T18:42:30.5814122Z 2026-10-09 15:42:30,580 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main) **********  fim transferenciaCustodiaIdentificaEtapa1(/v2/investidores/{tipo_pessoa}/{documento}/custodia/transferencia) *********** ->2
2026-10-09T18:42:30.5825553Z 2026-10-09 15:42:30,581 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main) ********** transferenciaCustodiaIdentificaEtapa1(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/custodia/transferencia) *********** 
2026-10-09T18:42:30.5826334Z 2026-10-09 15:42:30,581 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main)  codigoCanalOrigem: 1 | codigoSistemaOrigem: 2 | nsuSistemaOrigem: 3 |  codigoSistemaIntermediario: 0  |   codigoAcaoTransacao: 1 | codigoComandoTransacao: 11 | codigoAntecedenteTransacao: 14 | dataMovimento: 01/01/2024 | tipo_pessoa: 1 | documento: 12345678901  | codigoProduto: 20 | codigoModalidade: null |   notaTransacao: null notaAplicacao: null |   operador: oper123 |  terminal: term1234 | 
2026-10-09T18:42:30.5827117Z 2026-10-09 15:42:30,581 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main) **********  fim transferenciaCustodiaIdentificaEtapa1(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/custodia/transferencia) *********** ->0
2026-10-09T18:42:30.5842430Z 2026-10-09 15:42:30,583 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main) ********** alteraContaRegistraAtivo(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/custodia/transferencia) *********** 
2026-10-09T18:42:30.5843869Z 2026-10-09 15:42:30,583 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main) tipo_pessoa: null | documento: 12345678901 |  | entradaDevolucaoImpostoEtapa2DTO EntradaParametrosTransferenciaCustodiaDTO(codigoCanalOrigem=1, codigoSistemaOrigem=2, nsuSistemaOrigem=null, codigoSistemaIntermediario=null, nsuSistemaIntermediario=null, unidadeOrigem=null, codigoAcaoTransacao=null, codigoComandoTransacao=null, codigoAntecedenteTransacao=null, dataMovimento=null, tipoPessoa=null, cpfCnpj=null, cpfCnpjAlfanumerico=null, cnae=null, codigoProduto=null, codigoModalidade=null, notaAplicacao=null, tipoNotaTransacao=null, assinaturaCliente=null, operador=null, terminal=null, codigoInstuicaoCessionario=null, cnpjCessionario=null, cnpjCessionarioAlfanumerico=null, contaCessionarioB3=null, codigoContaCliente=null, motivo=null)
2026-10-09T18:42:30.5845200Z 2026-10-09 15:42:30,583 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main) **********  fim transferenciaCustodiaIdentificaEtapa1(/v2/investidores/{tipo_pessoa}/{documento}/custodia/transferencia) *********** ->0
2026-10-09T18:42:30.5858007Z 2026-10-09 15:42:30,584 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main) ********** transferenciaCustodiaIdentificaEtapa1(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/custodia/transferencia) *********** 
2026-10-09T18:42:30.5858763Z 2026-10-09 15:42:30,585 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main)  codigoCanalOrigem: 1 | codigoSistemaOrigem: 2 | nsuSistemaOrigem: 3 |  codigoSistemaIntermediario: 0  |   codigoAcaoTransacao: 1 | codigoComandoTransacao: 11 | codigoAntecedenteTransacao: 14 | dataMovimento: 01/01/2024 | tipo_pessoa: 1 | documento: 12345678901  | codigoProduto: null | codigoModalidade: null |   notaTransacao: null notaAplicacao: 100 |   operador: oper123 |  terminal: term1234 | 
2026-10-09T18:42:30.5859656Z 2026-10-09 15:42:30,585 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main) **********  fim transferenciaCustodiaIdentificaEtapa1(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/custodia/transferencia) *********** ->0
2026-10-09T18:42:30.5875729Z 2026-10-09 15:42:30,586 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main) ********** transferenciaCustodiaIdentificaEtapa1(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/custodia/transferencia) *********** 
2026-10-09T18:42:30.5876643Z 2026-10-09 15:42:30,586 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main)  codigoCanalOrigem: 1 | codigoSistemaOrigem: 2 | nsuSistemaOrigem: 3 |  codigoSistemaIntermediario: 0  |   codigoAcaoTransacao: 1 | codigoComandoTransacao: 11 | codigoAntecedenteTransacao: 14 | dataMovimento: 01/01/2024 | tipo_pessoa: null | documento: 12345678901  | codigoProduto: 20 | codigoModalidade: 30 |   notaTransacao: 200 notaAplicacao: 100 |   operador: oper123 |  terminal: term1234 | 
2026-10-09T18:42:30.5877445Z 2026-10-09 15:42:30,586 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main) **********  fim transferenciaCustodiaIdentificaEtapa1(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/custodia/transferencia) *********** ->0
2026-10-09T18:42:30.5889378Z 2026-10-09 15:42:30,587 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main) ********** transferenciaCustodiaIdentificaEtapa1(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/custodia/transferencia) *********** 
2026-10-09T18:42:30.5890253Z 2026-10-09 15:42:30,588 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main)  codigoCanalOrigem: 1 | codigoSistemaOrigem: 2 | nsuSistemaOrigem: 3 |  codigoSistemaIntermediario: 0  |   codigoAcaoTransacao: 1 | codigoComandoTransacao: 11 | codigoAntecedenteTransacao: 14 | dataMovimento: 01/01/2024 | tipo_pessoa: 1 | documento: 12345678901  | codigoProduto: null | codigoModalidade: null |   notaTransacao: 200 notaAplicacao: null |   operador: oper123 |  terminal: term1234 | 
2026-10-09T18:42:30.5890977Z 2026-10-09 15:42:30,588 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main) **********  fim transferenciaCustodiaIdentificaEtapa1(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/custodia/transferencia) *********** ->0
2026-10-09T18:42:30.5902921Z 2026-10-09 15:42:30,589 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main) ********** transferenciaCustodiaIdentificaEtapa1(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/custodia/transferencia) *********** 
2026-10-09T18:42:30.5904121Z 2026-10-09 15:42:30,589 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main)  codigoCanalOrigem: 1 | codigoSistemaOrigem: 2 | nsuSistemaOrigem: 3 |  codigoSistemaIntermediario: 0  |   codigoAcaoTransacao: 1 | codigoComandoTransacao: 11 | codigoAntecedenteTransacao: 14 | dataMovimento: 01/01/2024 | tipo_pessoa: 1 | documento: 12345678901  | codigoProduto: null | codigoModalidade: 30 |   notaTransacao: null notaAplicacao: null |   operador: oper123 |  terminal: term1234 | 
2026-10-09T18:42:30.5905203Z 2026-10-09 15:42:30,589 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main) **********  fim transferenciaCustodiaIdentificaEtapa1(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/custodia/transferencia) *********** ->0
2026-10-09T18:42:30.5916937Z 2026-10-09 15:42:30,590 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main) ********** transferenciaCustodiaIdentificaEtapa1(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/custodia/transferencia) *********** 
2026-10-09T18:42:30.5917894Z 2026-10-09 15:42:30,590 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main)  codigoCanalOrigem: 1 | codigoSistemaOrigem: 2 | nsuSistemaOrigem: null |  codigoSistemaIntermediario: 0  |   codigoAcaoTransacao: 1 | codigoComandoTransacao: 11 | codigoAntecedenteTransacao: 14 | dataMovimento: 01/01/2024 | tipo_pessoa: pessoas-fisicas | documento: 12345678901  | codigoProduto: 20 | codigoModalidade: 30 |   notaTransacao: 200 notaAplicacao: 100 |   operador: oper123 |  terminal: term1234 | 
2026-10-09T18:42:30.5918513Z 2026-10-09 15:42:30,590 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main) **********  fim transferenciaCustodiaIdentificaEtapa1(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/custodia/transferencia) *********** ->0
2026-10-09T18:42:30.5932060Z 2026-10-09 15:42:30,592 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main) ********** alteraContaRegistraAtivo(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/custodia/transferencia) *********** 
2026-10-09T18:42:30.5933577Z 2026-10-09 15:42:30,592 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main) tipo_pessoa: pessoas-juridicas | documento: 12345678000199 |  | entradaDevolucaoImpostoEtapa2DTO EntradaParametrosTransferenciaCustodiaDTO(codigoCanalOrigem=1, codigoSistemaOrigem=2, nsuSistemaOrigem=3, codigoSistemaIntermediario=null, nsuSistemaIntermediario=null, unidadeOrigem=null, codigoAcaoTransacao=1, codigoComandoTransacao=11, codigoAntecedenteTransacao=14, dataMovimento=null, tipoPessoa=null, cpfCnpj=null, cpfCnpjAlfanumerico=null, cnae=null, codigoProduto=null, codigoModalidade=null, notaAplicacao=null, tipoNotaTransacao=null, assinaturaCliente=null, operador=null, terminal=null, codigoInstuicaoCessionario=null, cnpjCessionario=null, cnpjCessionarioAlfanumerico=null, contaCessionarioB3=null, codigoContaCliente=null, motivo=null)
2026-10-09T18:42:30.5934698Z 2026-10-09 15:42:30,592 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main) **********  fim transferenciaCustodiaIdentificaEtapa1(/v2/investidores/{tipo_pessoa}/{documento}/custodia/transferencia) *********** ->0
2026-10-09T18:42:30.5945762Z 2026-10-09 15:42:30,593 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main) ********** transferenciaCustodiaIdentificaEtapa1(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/custodia/transferencia) *********** 
2026-10-09T18:42:30.5946553Z 2026-10-09 15:42:30,593 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main)  codigoCanalOrigem: 1 | codigoSistemaOrigem: 2 | nsuSistemaOrigem: 3 |  codigoSistemaIntermediario: 0  |   codigoAcaoTransacao: 1 | codigoComandoTransacao: 11 | codigoAntecedenteTransacao: 14 | dataMovimento: 01/01/2024 | tipo_pessoa: pessoas-fisicas | documento: 12345678901  | codigoProduto: 20 | codigoModalidade: 30 |   notaTransacao: 200 notaAplicacao: 100 |   operador: oper123 |  terminal: term1234 | 
2026-10-09T18:42:30.5947348Z 2026-10-09 15:42:30,594 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main) **********  fim transferenciaCustodiaIdentificaEtapa1(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/custodia/transferencia) *********** ->1
2026-10-09T18:42:30.5961357Z 2026-10-09 15:42:30,595 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main) ********** transferenciaCustodiaIdentificaEtapa1(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/custodia/transferencia) *********** 
2026-10-09T18:42:30.5962327Z 2026-10-09 15:42:30,595 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main)  codigoCanalOrigem: 1 | codigoSistemaOrigem: 2 | nsuSistemaOrigem: 3 |  codigoSistemaIntermediario: 0  |   codigoAcaoTransacao: 1 | codigoComandoTransacao: 11 | codigoAntecedenteTransacao: 14 | dataMovimento: 01/01/2024 | tipo_pessoa: pessoas-juridicas | documento: 12345678000199  | codigoProduto: 20 | codigoModalidade: 30 |   notaTransacao: 200 notaAplicacao: 100 |   operador: oper123 |  terminal: term1234 | 
2026-10-09T18:42:30.5963133Z 2026-10-09 15:42:30,595 INFO  [br.gov.cai.sii.pub.InvestidorTransferenciaCustodiaResource] (main) **********  fim transferenciaCustodiaIdentificaEtapa1(/pub2/investimentos/renda-fixa/movimentacoes-investidor/v2/investidores/{tipo_pessoa}/{documento}/custodia/transferencia) *********** ->0
2026-10-09T18:42:30.6015434Z [INFO] Tests run: 12, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.114 s - in br.gov.caixa.siifx.pub2.InvestidorTransferenciaCustodiaResourceTest
2026-10-09T18:42:30.6055167Z [INFO] Running br.gov.caixa.siifx.pub2.InvestidoresResourceTest
2026-10-09T18:42:31.2767026Z 2026-10-09 15:42:31,271 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"1","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"1","codigoAntecedenteTransacao":"1","dataMovimento":"1","mes":null,"ano":null,"codigoProduto":null,"unidadeDeposito":"1","produtoDeposito":"1","contaDeposito":"1","digitoDeposito":1,"codigoModalidade":null,"situacaoAtivo":1,"motivoAtivo":1,"operador":"1","terminal":"1"}
2026-10-09T18:42:31.2768075Z 2026-10-09 15:42:31,273 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourcesaldoConsolidado. ProcessingExceptions Status: Erro de processamentoStatus code: 504. Parametros: null Mensagem: Erro de processamento
2026-10-09T18:42:31.2839222Z 2026-10-09 15:42:31,282 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":null,"cpfCnpj":null,"codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":null,"codigoComandoTransacao":null,"codigoAntecedenteTransacao":null,"dataMovimento":"01/01/2026","codigoProduto":"2069","codigoModalidade":10,"notaAplicacao":null,"codigoAtivo":null,"notaTransacao":null,"cnae":null,"operador":"OP1","terminal":"1"}
2026-10-09T18:42:31.2840090Z 2026-10-09 15:42:31,282 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: null CorrelationID: null HTTP Status: "200 OK" Tempo: 1 ms.
2026-10-09T18:42:31.2868375Z 2026-10-09 15:42:31,285 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"1","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"1","codigoAntecedenteTransacao":"1","dataMovimento":null,"mes":1,"ano":1,"codigoProduto":"1","unidadeDeposito":"1","produtoDeposito":"1","contaDeposito":"1","digitoDeposito":1,"codigoModalidade":null,"situacaoAtivo":null,"motivoAtivo":null,"operador":"1","terminal":"1"}
2026-10-09T18:42:31.2869445Z 2026-10-09 15:42:31,285 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: null CorrelationID: null HTTP Status: "200 OK" Tempo: 0 ms.
2026-10-09T18:42:31.2895137Z 2026-10-09 15:42:31,288 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"1","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"1","codigoAntecedenteTransacao":"1","dataMovimento":null,"mes":1,"ano":1,"codigoProduto":"1","unidadeDeposito":"1","produtoDeposito":"1","contaDeposito":null,"digitoDeposito":0,"codigoModalidade":null,"situacaoAtivo":null,"motivoAtivo":null,"operador":"1","terminal":"1"}
2026-10-09T18:42:31.2896412Z 2026-10-09 15:42:31,288 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: null CorrelationID: null HTTP Status: "200 OK" Tempo: 0 ms.
2026-10-09T18:42:31.2921940Z 2026-10-09 15:42:31,291 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"1","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"1","codigoAntecedenteTransacao":"1","dataMovimento":null,"mes":1,"ano":1,"codigoProduto":"1","unidadeDeposito":"1","produtoDeposito":"1","contaDeposito":"1","digitoDeposito":0,"codigoModalidade":null,"situacaoAtivo":null,"motivoAtivo":null,"operador":"1","terminal":"1"}
2026-10-09T18:42:31.2922854Z 2026-10-09 15:42:31,291 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: null CorrelationID: null HTTP Status: "200 OK" Tempo: 1 ms.
2026-10-09T18:42:31.2950083Z 2026-10-09 15:42:31,293 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"1","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"1","codigoAntecedenteTransacao":"1","dataMovimento":null,"mes":1,"ano":1,"codigoProduto":"1","unidadeDeposito":null,"produtoDeposito":null,"contaDeposito":null,"digitoDeposito":0,"codigoModalidade":null,"situacaoAtivo":null,"motivoAtivo":null,"operador":"1","terminal":"1"}
2026-10-09T18:42:31.2950963Z 2026-10-09 15:42:31,294 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: null CorrelationID: null HTTP Status: "200 OK" Tempo: 1 ms.
2026-10-09T18:42:31.2980155Z 2026-10-09 15:42:31,296 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"1","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"1","codigoAntecedenteTransacao":"1","dataMovimento":"1","mes":null,"ano":null,"codigoProduto":null,"unidadeDeposito":"1","produtoDeposito":"1","contaDeposito":"1","digitoDeposito":1,"codigoModalidade":null,"situacaoAtivo":1,"motivoAtivo":1,"operador":"1","terminal":"1"}
2026-10-09T18:42:31.2980989Z 2026-10-09 15:42:31,297 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourcesaldoConsolidado. WebApplicationExceptions Status: Internal Server ErrorStatus code: 500. Parametros: null Mensagem: HTTP 500 Internal Server Error
2026-10-09T18:42:31.3003919Z 2026-10-09 15:42:31,299 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"1","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"1","codigoAntecedenteTransacao":"1","dataMovimento":"1","mes":null,"ano":null,"codigoProduto":null,"unidadeDeposito":"1","produtoDeposito":"1","contaDeposito":"1","digitoDeposito":1,"codigoModalidade":null,"situacaoAtivo":1,"motivoAtivo":1,"operador":"1","terminal":"1"}
2026-10-09T18:42:31.3005117Z 2026-10-09 15:42:31,299 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourcesaldoConsolidado. WebApplicationExceptions Status: OKStatus code: 200. Parametros: null Mensagem: 
2026-10-09T18:42:31.3030446Z 2026-10-09 15:42:31,301 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"pessoas-fisicas","cpfCnpj":"12345678901","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"11","codigoAntecedenteTransacao":"14","dataMovimento":"01/01/2026","codigoProduto":"2069","codigoModalidade":null,"notaAplicacao":"123","codigoAtivo":"ATIVO1","notaTransacao":null,"cnae":null,"operador":"OP1","terminal":"T1"}
2026-10-09T18:42:31.3031759Z 2026-10-09 15:42:31,302 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: null CorrelationID: null HTTP Status: "200 OK" Tempo: 1 ms.
2026-10-09T18:42:31.3068876Z 2026-10-09 15:42:31,304 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"1","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"1","codigoAntecedenteTransacao":"1","dataMovimento":null,"mes":1,"ano":1,"codigoProduto":"1","unidadeDeposito":"1","produtoDeposito":"1","contaDeposito":"1","digitoDeposito":1,"codigoModalidade":null,"situacaoAtivo":null,"motivoAtivo":null,"operador":"1","terminal":"1"}
2026-10-09T18:42:31.3069782Z 2026-10-09 15:42:31,304 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourceinformativoMensal. Exception  Status: Status code: 0. Parametros: null Mensagem: HTTP 500 Internal Server Error
2026-10-09T18:42:31.3090841Z 2026-10-09 15:42:31,307 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"1","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"1","codigoAntecedenteTransacao":"1","dataMovimento":"1","mes":null,"ano":null,"codigoProduto":"1","unidadeDeposito":"1","produtoDeposito":"1","contaDeposito":"1","digitoDeposito":1,"codigoModalidade":1,"situacaoAtivo":1,"motivoAtivo":1,"operador":"1","terminal":"1"}
2026-10-09T18:42:31.3091727Z 2026-10-09 15:42:31,307 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: null CorrelationID: null HTTP Status: "200 OK" Tempo: 1 ms.
2026-10-09T18:42:31.3106114Z 2026-10-09 15:42:31,309 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"pessoas-fisicas","cpfCnpj":"12345678901","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"11","codigoAntecedenteTransacao":"14","dataMovimento":"01/01/2026","codigoProduto":"2069","codigoModalidade":null,"notaAplicacao":"123","codigoAtivo":"ATIVO1","notaTransacao":null,"cnae":null,"operador":"OP1","terminal":"T1"}
2026-10-09T18:42:31.3107108Z 2026-10-09 15:42:31,309 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: null CorrelationID: null HTTP Status: "200 OK" Tempo: 0 ms.
2026-10-09T18:42:31.3131011Z 2026-10-09 15:42:31,311 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"pessoas-fisicas","cpfCnpj":"12345678901","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"11","codigoAntecedenteTransacao":"14","dataMovimento":"01/01/2026","codigoProduto":"2069","codigoModalidade":null,"notaAplicacao":"123","codigoAtivo":"ATIVO1","notaTransacao":null,"cnae":null,"operador":"OP1","terminal":"T1"}
2026-10-09T18:42:31.3132108Z 2026-10-09 15:42:31,312 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: null CorrelationID: null HTTP Status: "200 OK" Tempo: 1 ms.
2026-10-09T18:42:31.3169658Z 2026-10-09 15:42:31,314 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"12345678901","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":null,"codigoComandoTransacao":null,"codigoAntecedenteTransacao":null,"dataMovimento":null,"codigoProduto":null,"codigoModalidade":null,"notaAplicacao":null,"codigoAtivo":null,"notaTransacao":null,"cnae":null,"operador":null,"terminal":null}SEG
2026-10-09T18:42:31.3171564Z 2026-10-09 15:42:31,315 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourcecatalogo. Exception  Status: java.io.IOException: Erro qualquerStatus code: 0. Parametros: null Mensagem: java.io.IOException: Erro qualquer
2026-10-09T18:42:31.3196510Z Erro de IO: Erro qualquer
2026-10-09T18:42:31.3197341Z 2026-10-09 15:42:31,318 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":null,"cpfCnpj":null,"codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"11","codigoAntecedenteTransacao":"14","dataMovimento":"01/01/2026","codigoProduto":"2069","codigoModalidade":10,"notaAplicacao":"123456","codigoAtivo":null,"notaTransacao":null,"cnae":null,"operador":"OP1","terminal":"1"}
2026-10-09T18:42:31.3198007Z 2026-10-09 15:42:31,318 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: null CorrelationID: null HTTP Status: "200 OK" Tempo: 1 ms.
2026-10-09T18:42:31.3234276Z 2026-10-09 15:42:31,321 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"12345678901","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":null,"codigoComandoTransacao":null,"codigoAntecedenteTransacao":null,"dataMovimento":null,"codigoProduto":null,"codigoModalidade":null,"notaAplicacao":null,"codigoAtivo":null,"notaTransacao":null,"cnae":null,"operador":null,"terminal":null}SEG
2026-10-09T18:42:31.3235132Z 2026-10-09 15:42:31,322 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourcecatalogo. Exception  Status: Too Many Requests - Muitas requisições em pouco tempo.Status code: 429. Parametros: null Mensagem: java.io.IOException: Erro 429 many requests
2026-10-09T18:42:31.3266120Z 2026-10-09 15:42:31,325 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":null,"cpfCnpj":null,"codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"10","codigoComandoTransacao":"1700","codigoAntecedenteTransacao":"0030","dataMovimento":"01/01/2026","codigoProduto":"1000","codigoModalidade":10,"notaAplicacao":"1234567890123456","codigoAtivo":null,"notaTransacao":"6543210987654321","cnae":1,"operador":"OPERADOR","terminal":"1"}
2026-10-09T18:42:31.3267118Z 2026-10-09 15:42:31,325 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourceemiteNotaTransacao. Exception  Status: Status code: 0. Parametros: null Mensagem: null
2026-10-09T18:42:31.3306791Z 2026-10-09 15:42:31,328 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: /v2/investidores/instrumento-financeiro/transacoes/detalhe, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"2","cpfCnpj":"0ER6LAJE000169","codigoCanalOrigem":1,"codigoSistemaOrigem":2076,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"C1","codigoAntecedenteTransacao":"1","dataMovimento":"06/02/2026","codigoProduto":"2069","codigoModalidade":10,"notaAplicacao":"NA1","codigoAtivo":null,"notaTransacao":"2026020682661212","cnae":123,"operador":"c899198","terminal":"1"}
2026-10-09T18:42:31.3308299Z 2026-10-09 15:42:31,329 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: /v2/investidores/instrumento-financeiro/transacoes/detalhe CorrelationID: null HTTP Status: "200 OK" Tempo: 1 ms.
2026-10-09T18:42:31.3336518Z 2026-10-09 15:42:31,331 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":null,"cpfCnpj":null,"codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"11","codigoAntecedenteTransacao":"14","dataMovimento":"01/01/2026","codigoProduto":"2069","codigoModalidade":10,"notaAplicacao":"123456","codigoAtivo":null,"notaTransacao":null,"cnae":null,"operador":"OP1","terminal":"1"}
2026-10-09T18:42:31.3337968Z 2026-10-09 15:42:31,332 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourceinformacoesComplementares. Exception  Status: Status code: 0. Parametros: null Mensagem: Erro
2026-10-09T18:42:31.3362557Z 2026-10-09 15:42:31,334 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":null,"cpfCnpj":null,"codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":null,"codigoComandoTransacao":null,"codigoAntecedenteTransacao":null,"dataMovimento":"01/01/2026","codigoProduto":"2069","codigoModalidade":10,"notaAplicacao":null,"codigoAtivo":null,"notaTransacao":null,"cnae":null,"operador":"OP1","terminal":"1"}
2026-10-09T18:42:31.3388491Z 2026-10-09 15:42:31,335 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourcetabelaImpostos. Exception  Status: Status code: 0. Parametros: null Mensagem: Erro
2026-10-09T18:42:31.3389864Z 2026-10-09 15:42:31,337 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"1","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"1","codigoAntecedenteTransacao":"1","dataMovimento":"1","mes":null,"ano":null,"codigoProduto":"1","unidadeDeposito":"1","produtoDeposito":"1","contaDeposito":"1","digitoDeposito":1,"codigoModalidade":1,"situacaoAtivo":1,"motivoAtivo":1,"operador":"1","terminal":"1"}
2026-10-09T18:42:31.3391123Z 2026-10-09 15:42:31,338 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourcesaldoAnalitico. Exception  Status: Status code: 0. Parametros: null Mensagem: HTTP 500 Internal Server Error
2026-10-09T18:42:31.3413936Z 2026-10-09 15:42:31,340 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"12345678901","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":null,"codigoComandoTransacao":null,"codigoAntecedenteTransacao":null,"dataMovimento":null,"codigoProduto":null,"codigoModalidade":null,"notaAplicacao":null,"codigoAtivo":null,"notaTransacao":null,"cnae":null,"operador":null,"terminal":null}SEG
2026-10-09T18:42:31.3415492Z 2026-10-09 15:42:31,340 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourcecatalogo. Exception  Status: Gateway Timeout - O servidor demorou para responder.Status code: 504. Parametros: null Mensagem: java.io.IOException: Erro 504 no gateway
2026-10-09T18:42:31.3436463Z 2026-10-09 15:42:31,342 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"pessoas-fisicas","cpfCnpj":"12345678901","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"11","codigoAntecedenteTransacao":"14","dataMovimento":"01/01/2026","codigoProduto":"2069","codigoModalidade":null,"notaAplicacao":"123","codigoAtivo":"ATIVO1","notaTransacao":null,"cnae":null,"operador":"OP1","terminal":"T1"}
2026-10-09T18:42:31.3437465Z 2026-10-09 15:42:31,342 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourceativoFinanceiro. Exception  Status: Status code: 0. Parametros: null Mensagem: Erro
2026-10-09T18:42:31.3458698Z 2026-10-09 15:42:31,344 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"pessoas-fisicas","cpfCnpj":"12345678901","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"11","codigoAntecedenteTransacao":"14","dataMovimento":"01/01/2026","codigoProduto":"2069","codigoModalidade":null,"notaAplicacao":"123","codigoAtivo":null,"notaTransacao":null,"cnae":null,"operador":"OP1","terminal":"T1"}
2026-10-09T18:42:31.3459419Z 2026-10-09 15:42:31,345 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourceativoFinanceiroTipo1. Exception  Status: Status code: 0. Parametros: null Mensagem: Erro
2026-10-09T18:42:31.3484691Z 2026-10-09 15:42:31,347 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: /v2/investidores/instrumento-financeiro/transacoes/detalhe, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"2","cpfCnpj":"12345678901","codigoCanalOrigem":1,"codigoSistemaOrigem":2076,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"C1","codigoAntecedenteTransacao":"1","dataMovimento":"06/02/2026","codigoProduto":"2069","codigoModalidade":10,"notaAplicacao":"NA1","codigoAtivo":null,"notaTransacao":"2026020682661212","cnae":123,"operador":"c899198","terminal":"1"}
2026-10-09T18:42:31.3497106Z 2026-10-09 15:42:31,347 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourcedetalhaAtivoFinanceiro. Exception  Status: Status code: 0. Parametros: null Mensagem: Erro
2026-10-09T18:42:31.3504647Z 2026-10-09 15:42:31,349 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"1","codigoCanalOrigem":12345678901234567,"codigoSistemaOrigem":3,"nsuSistemaOrigem":1,"codigoAcaoTransacao":null,"codigoComandoTransacao":null,"codigoAntecedenteTransacao":null,"dataMovimento":null,"codigoProduto":null,"codigoModalidade":null,"notaAplicacao":null,"codigoAtivo":null,"notaTransacao":null,"cnae":null,"operador":null,"terminal":null}1
2026-10-09T18:42:31.3505828Z 2026-10-09 15:42:31,349 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: null CorrelationID: null HTTP Status: "201 Created" Tempo: 0 ms.
2026-10-09T18:42:31.3527947Z 2026-10-09 15:42:31,351 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"pessoas-fisicas","cpfCnpj":"12345678901","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"10","codigoComandoTransacao":"1700","codigoAntecedenteTransacao":"0030","dataMovimento":"01/01/2026","codigoProduto":"1000","codigoModalidade":10,"notaAplicacao":"1234567890123456","codigoAtivo":null,"notaTransacao":"6543210987654321","cnae":1,"operador":"OPERADOR","terminal":"1"}
2026-10-09T18:42:31.3529479Z 2026-10-09 15:42:31,352 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourceemiteNotaTransacao. Exception  Status: Status code: 0. Parametros: null Mensagem: null
2026-10-09T18:42:31.3554673Z 2026-10-09 15:42:31,353 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"12345678901","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":null,"codigoComandoTransacao":null,"codigoAntecedenteTransacao":null,"dataMovimento":null,"codigoProduto":null,"codigoModalidade":null,"notaAplicacao":null,"codigoAtivo":null,"notaTransacao":null,"cnae":null,"operador":null,"terminal":null}SEG
2026-10-09T18:42:31.3555949Z 2026-10-09 15:42:31,354 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourcecatalogo. Exception  Status: Serviço temporariamente indisponível. Tente novamente mais tarde.Status code: 503. Parametros: null Mensagem: java.net.ConnectException: Falha conexão
2026-10-09T18:42:31.3579046Z 2026-10-09 15:42:31,356 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"12345678901","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":null,"codigoComandoTransacao":null,"codigoAntecedenteTransacao":null,"dataMovimento":null,"codigoProduto":null,"codigoModalidade":null,"notaAplicacao":null,"codigoAtivo":null,"notaTransacao":null,"cnae":null,"operador":null,"terminal":null}SEG
2026-10-09T18:42:31.3579877Z 2026-10-09 15:42:31,356 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourcecatalogo. Exception  Status: Erro desconhecidoStatus code: 0. Parametros: null Mensagem: Erro desconhecido
2026-10-09T18:42:31.3606664Z 2026-10-09 15:42:31,359 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: /v2/investidores/instrumento-financeiro/transacao-ativo-financeiro, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":null,"cpfCnpj":null,"codigoCanalOrigem":1,"codigoSistemaOrigem":2,"nsuSistemaOrigem":3,"codigoAcaoTransacao":"A1","codigoComandoTransacao":"C1","codigoAntecedenteTransacao":"AT1","dataMovimento":"2026-04-16","codigoProduto":"P1","codigoModalidade":1,"notaAplicacao":"NA1","codigoAtivo":"CA1","notaTransacao":null,"cnae":null,"operador":"OP1","terminal":"T1"}
2026-10-09T18:42:31.3607429Z 2026-10-09 15:42:31,359 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: /v2/investidores/instrumento-financeiro/transacao-ativo-financeiro CorrelationID: null HTTP Status: "200 OK" Tempo: 0 ms.
2026-10-09T18:42:31.3627928Z 2026-10-09 15:42:31,361 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: /v2/investidores/instrumento-financeiro/transacao-ativo-financeiro, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":null,"cpfCnpj":null,"codigoCanalOrigem":1,"codigoSistemaOrigem":2,"nsuSistemaOrigem":3,"codigoAcaoTransacao":"A1","codigoComandoTransacao":"C1","codigoAntecedenteTransacao":"AT1","dataMovimento":"2026-04-16","codigoProduto":"P1","codigoModalidade":1,"notaAplicacao":"NA1","codigoAtivo":"CA1","notaTransacao":null,"cnae":null,"operador":"OP1","terminal":"T1"}
2026-10-09T18:42:31.3629139Z 2026-10-09 15:42:31,362 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourcetransacaoAtivoFinanceiro. Exception  Status: Status code: 0. Parametros: null Mensagem: Erro
2026-10-09T18:42:31.3648005Z 2026-10-09 15:42:31,363 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"pessoas-fisicas","cpfCnpj":"12345678901","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"11","codigoAntecedenteTransacao":"14","dataMovimento":"01/01/2026","codigoProduto":"2069","codigoModalidade":null,"notaAplicacao":"123","codigoAtivo":"ATIVO1","notaTransacao":null,"cnae":null,"operador":"OP1","terminal":"T1"}
2026-10-09T18:42:31.3648665Z 2026-10-09 15:42:31,364 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourceativoFinanceiroTipo2. Exception  Status: Status code: 0. Parametros: null Mensagem: Erro
2026-10-09T18:42:31.3667839Z 2026-10-09 15:42:31,365 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"1","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"1","codigoAntecedenteTransacao":"1","dataMovimento":"1","mes":null,"ano":null,"codigoProduto":null,"unidadeDeposito":"1","produtoDeposito":"1","contaDeposito":"1","digitoDeposito":1,"codigoModalidade":null,"situacaoAtivo":1,"motivoAtivo":1,"operador":"1","terminal":"1"}
2026-10-09T18:42:31.3668530Z 2026-10-09 15:42:31,366 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) [REQUISICAO REALIZADA][%s][ERRO] Erro ao obter: InvestidoresResourcesaldoConsolidado. Exception  Status: Status code: 0. Parametros: null Mensagem: null
2026-10-09T18:42:31.3693183Z 2026-10-09 15:42:31,368 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][REQUEST] Path: null, CorrelationID: null, Parametros: null, Body: {"tipoPessoa":"1","cpfCnpj":"1","codigoCanalOrigem":1,"codigoSistemaOrigem":1,"nsuSistemaOrigem":1,"codigoAcaoTransacao":"1","codigoComandoTransacao":"1","codigoAntecedenteTransacao":"1","dataMovimento":"1","mes":null,"ano":null,"codigoProduto":null,"unidadeDeposito":"1","produtoDeposito":"1","contaDeposito":"1","digitoDeposito":1,"codigoModalidade":null,"situacaoAtivo":1,"motivoAtivo":1,"operador":"1","terminal":"1"}
2026-10-09T18:42:31.3693880Z 2026-10-09 15:42:31,368 INFO  [br.gov.cai.sii.ser.tra.int.ServiceLogResource] (main) [REQUISICAO_RECEBIDA][RESPONSE] Path: null CorrelationID: null HTTP Status: "200 OK" Tempo: 1 ms.
2026-10-09T18:42:31.3750384Z [INFO] Tests run: 34, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.764 s - in br.gov.caixa.siifx.pub2.InvestidoresResourceTest
2026-10-09T18:42:31.3751891Z [INFO] Running br.gov.caixa.siifx.repository.AprovaRecusaTransacaoPendenteRepositoryTest
2026-10-09T18:42:31.6721941Z 2026-10-09 15:42:31,668 INFO  [br.gov.cai.sii.rep.AprovaRecusaTransacaoPendenteRepository] (main) [BANCO][LEITURA][SUCESSO] AprovaRecusaTransacaoPendenteRepository.verificaTransacaoPendente verificada em 0 ms
2026-10-09T18:42:31.6722548Z 2026-10-09 15:42:31,670 WARN  [br.gov.cai.sii.rep.AprovaRecusaTransacaoPendenteRepository] (main) Erro no método AprovaRecusaTransacaoPendenteRepository.verificaTransacaoPendente, NoResultException = Sem resultado
2026-10-09T18:42:31.6756480Z 2026-10-09 15:42:31,674 INFO  [br.gov.cai.sii.rep.AprovaRecusaTransacaoPendenteRepository] (main) [BANCO][LEITURA][SUCESSO] AprovaRecusaTransacaoPendenteRepository.verificarExisteTransacaoPendente verificada em 0 ms
2026-10-09T18:42:31.6757172Z 2026-10-09 15:42:31,674 WARN  [br.gov.cai.sii.rep.AprovaRecusaTransacaoPendenteRepository] (main) Erro no método AprovaRecusaTransacaoPendenteRepository.verificarExisteTransacaoPendente, NoResultException = Sem resultado
2026-10-09T18:42:31.6778054Z 2026-10-09 15:42:31,676 INFO  [br.gov.cai.sii.rep.AprovaRecusaTransacaoPendenteRepository] (main) [BANCO][LEITURA][SUCESSO] AprovaRecusaTransacaoPendenteRepository.verificaTransacaoPendente verificada em 0 ms
2026-10-09T18:42:31.6786649Z 2026-10-09 15:42:31,677 INFO  [br.gov.cai.sii.rep.AprovaRecusaTransacaoPendenteRepository] (main) [BANCO][LEITURA][SUCESSO] AprovaRecusaTransacaoPendenteRepository.verificaTransacaoPendente verificada em 0 ms
2026-10-09T18:42:31.6787244Z 2026-10-09 15:42:31,678 ERROR [br.gov.cai.sii.rep.AprovaRecusaTransacaoPendenteRepository] (main) [BANCO][LEITURA][ERRO] Erro ao AprovaRecusaTransacaoPendenteRepository.verificaTransacaoPendente. null, SQL: false, Exception: Erro inesperado
2026-10-09T18:42:31.6795608Z 2026-10-09 15:42:31,679 INFO  [br.gov.cai.sii.rep.AprovaRecusaTransacaoPendenteRepository] (main) [BANCO][LEITURA][SUCESSO] AprovaRecusaTransacaoPendenteRepository.verificarExisteTransacaoPendente verificada em 1 ms
2026-10-09T18:42:31.6817115Z 2026-10-09 15:42:31,680 INFO  [br.gov.cai.sii.rep.AprovaRecusaTransacaoPendenteRepository] (main) [BANCO][LEITURA][SUCESSO] AprovaRecusaTransacaoPendenteRepository.verificarExisteTransacaoPendente verificada em 0 ms
2026-10-09T18:42:31.6817764Z 2026-10-09 15:42:31,680 ERROR [br.gov.cai.sii.rep.AprovaRecusaTransacaoPendenteRepository] (main) [BANCO][LEITURA][ERRO] Erro ao AprovaRecusaTransacaoPendenteRepository.verificarExisteTransacaoPendente. null, SQL: FALSE, Exception: Erro inesperado
2026-10-09T18:42:31.6865753Z [INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.311 s - in br.gov.caixa.siifx.repository.AprovaRecusaTransacaoPendenteRepositoryTest
2026-10-09T18:42:31.6914617Z [INFO] Running br.gov.caixa.siifx.repository.ConsultaSaldoRepositoryTest
2026-10-09T18:42:32.5920895Z [INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.894 s - in br.gov.caixa.siifx.repository.ConsultaSaldoRepositoryTest
2026-10-09T18:42:32.5921278Z [INFO] Running br.gov.caixa.siifx.repository.ContabilRepositoryTest
2026-10-09T18:42:32.8414369Z 2026-10-09 15:42:32,835 INFO  [br.gov.cai.sii.rep.con.ContabilRepository] (main) [BANCO][LEITURA][SUCESSO] ContabilRepository.consultarContabil verificada em 0 ms
2026-10-09T18:42:32.8416359Z 2026-10-09 15:42:32,837 WARN  [br.gov.cai.sii.rep.con.ContabilRepository] (main) Erro no método ContabilRepository.consultarContabil, NoResultException = null
2026-10-09T18:42:32.8416811Z 2026-10-09 15:42:32,838 WARN  [br.gov.cai.sii.rep.con.ContabilRepository] (main) Erro no método ContabilRepository.consultarContabil, NoResultException = null
2026-10-09T18:42:32.8417359Z 2026-10-09 15:42:32,839 ERROR [br.gov.cai.sii.rep.con.ContabilRepository] (main) [BANCO][LEITURA][ERRO] Erro ao ContabilRepository.consultarContabil. null, SQL: null, Exception: null
2026-10-09T18:42:32.8459670Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.252 s - in br.gov.caixa.siifx.repository.ContabilRepositoryTest
2026-10-09T18:42:32.8498277Z [INFO] Running br.gov.caixa.siifx.repository.ContingenciaDesligamentoCanaisRepositoryTest
2026-10-09T18:42:32.9953428Z 2026-10-09 15:42:32,985 ERROR [br.gov.cai.sii.ser.mod.ModalidadeService] (main) null
2026-10-09T18:42:32.9954441Z 2026-10-09 15:42:32,988 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) Erro ao ModalidadeService.consultarCanalSistema. null. Parametros: codigoProduto = {}1codigoModalidade = {}1: javax.persistence.NoResultException
2026-10-09T18:42:32.9954880Z 
2026-10-09T18:42:32.9955992Z 2026-10-09 15:42:32,990 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) Erro ao ModalidadeService.consultarCanalSistema. Preencha os campos obrigatórios!. Parametros: codigoProduto = {}nullcodigoModalidade = {}null: br.gov.caixa.siifx.exception.BusinessException: Preencha os campos obrigatórios!
2026-10-09T18:42:32.9956953Z 	at br.gov.caixa.siifx.service.modalidade.ModalidadeService.consultarCanalSistema(ModalidadeService.java:477)
2026-10-09T18:42:32.9957502Z 	at br.gov.caixa.siifx.repository.ContingenciaDesligamentoCanaisRepositoryTest.consultarCanalSistemaTest(ContingenciaDesligamentoCanaisRepositoryTest.java:93)
2026-10-09T18:42:32.9957790Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-09T18:42:32.9958163Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-10-09T18:42:32.9958574Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-10-09T18:42:32.9958821Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-10-09T18:42:32.9959056Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
2026-10-09T18:42:32.9959320Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-10-09T18:42:32.9959612Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-10-09T18:42:32.9960108Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-10-09T18:42:32.9960386Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-10-09T18:42:32.9960681Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-10-09T18:42:32.9960994Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-10-09T18:42:32.9961311Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-10-09T18:42:32.9961756Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-10-09T18:42:32.9962049Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-10-09T18:42:32.9962337Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-10-09T18:42:32.9962620Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-10-09T18:42:32.9963529Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-10-09T18:42:32.9963934Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-10-09T18:42:32.9964439Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:217)
2026-10-09T18:42:32.9964848Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:32.9965174Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:213)
2026-10-09T18:42:32.9965481Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:138)
2026-10-09T18:42:32.9965728Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:68)
2026-10-09T18:42:32.9966524Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-10-09T18:42:32.9966946Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:32.9967245Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:32.9967512Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:32.9967777Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:32.9968050Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:32.9968465Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:32.9968731Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:32.9968962Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:32.9969279Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:32.9969678Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:32.9969953Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:32.9970188Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:32.9970502Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:32.9970761Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:32.9971072Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:32.9971347Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:32.9971715Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:32.9971957Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:32.9972232Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:32.9972553Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:32.9972833Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:32.9973114Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:32.9973404Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:32.9973618Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:32.9973941Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:32.9974220Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:32.9974491Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:32.9974781Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-10-09T18:42:32.9975107Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-10-09T18:42:32.9975397Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-10-09T18:42:32.9975687Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)
2026-10-09T18:42:32.9976123Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)
2026-10-09T18:42:32.9976416Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)
2026-10-09T18:42:32.9976694Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)
2026-10-09T18:42:32.9977912Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)
2026-10-09T18:42:32.9978322Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)
2026-10-09T18:42:32.9978580Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
2026-10-09T18:42:32.9978788Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
2026-10-09T18:42:32.9979059Z 	at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
2026-10-09T18:42:32.9979328Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:55)
2026-10-09T18:42:32.9979651Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:223)
2026-10-09T18:42:32.9979925Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:175)
2026-10-09T18:42:32.9980306Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:139)
2026-10-09T18:42:32.9980586Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:456)
2026-10-09T18:42:32.9980850Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:169)
2026-10-09T18:42:32.9981082Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:595)
2026-10-09T18:42:32.9981315Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:581)
2026-10-09T18:42:32.9981649Z 
2026-10-09T18:42:32.9982361Z 2026-10-09 15:42:32,991 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) Erro ao ModalidadeService.consultarCanalSistema. Preencha os campos obrigatórios!. Parametros: codigoProduto = {}65codigoModalidade = {}null: br.gov.caixa.siifx.exception.BusinessException: Preencha os campos obrigatórios!
2026-10-09T18:42:32.9982765Z 	at br.gov.caixa.siifx.service.modalidade.ModalidadeService.consultarCanalSistema(ModalidadeService.java:477)
2026-10-09T18:42:32.9983082Z 	at br.gov.caixa.siifx.repository.ContingenciaDesligamentoCanaisRepositoryTest.consultarCanalSistemaTest(ContingenciaDesligamentoCanaisRepositoryTest.java:94)
2026-10-09T18:42:32.9983350Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-09T18:42:32.9983591Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-10-09T18:42:32.9983860Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-10-09T18:42:32.9984101Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-10-09T18:42:32.9984342Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
2026-10-09T18:42:32.9984554Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-10-09T18:42:32.9984840Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-10-09T18:42:32.9985146Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-10-09T18:42:32.9987659Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-10-09T18:42:32.9988009Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-10-09T18:42:32.9988318Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-10-09T18:42:32.9988640Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-10-09T18:42:32.9988938Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-10-09T18:42:32.9989243Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-10-09T18:42:32.9989590Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-10-09T18:42:32.9989900Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-10-09T18:42:32.9990171Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-10-09T18:42:32.9990447Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-10-09T18:42:32.9990733Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:217)
2026-10-09T18:42:32.9990975Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:32.9991255Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:213)
2026-10-09T18:42:32.9991656Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:138)
2026-10-09T18:42:32.9991914Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:68)
2026-10-09T18:42:32.9992173Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-10-09T18:42:32.9992522Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:32.9992772Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:32.9993011Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:32.9993245Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:32.9993514Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:32.9993756Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:32.9993994Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:32.9994211Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:32.9994430Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:32.9994728Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:32.9994974Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:32.9995224Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:32.9995473Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:32.9995709Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:32.9995958Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:32.9996203Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:32.9996437Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:32.9996666Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:32.9996912Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:32.9997243Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:32.9997483Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:32.9997693Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:32.9997924Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:32.9998149Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:32.9998398Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:32.9998640Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:32.9998891Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:32.9999206Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-10-09T18:42:32.9999490Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-10-09T18:42:32.9999745Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-10-09T18:42:33.0000000Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)
2026-10-09T18:42:33.0000246Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)
2026-10-09T18:42:33.0000494Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)
2026-10-09T18:42:33.0000819Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)
2026-10-09T18:42:33.0001052Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)
2026-10-09T18:42:33.0001330Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)
2026-10-09T18:42:33.0001632Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
2026-10-09T18:42:33.0001861Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
2026-10-09T18:42:33.0002101Z 	at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
2026-10-09T18:42:33.0002348Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:55)
2026-10-09T18:42:33.0002579Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:223)
2026-10-09T18:42:33.0002832Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:175)
2026-10-09T18:42:33.0003089Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:139)
2026-10-09T18:42:33.0003359Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:456)
2026-10-09T18:42:33.0003579Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:169)
2026-10-09T18:42:33.0003784Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:595)
2026-10-09T18:42:33.0003960Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:581)
2026-10-09T18:42:33.0004078Z 
2026-10-09T18:42:33.0004587Z 2026-10-09 15:42:32,991 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) Erro ao ModalidadeService.consultarCanalSistema. Preencha os campos obrigatórios!. Parametros: codigoProduto = {}nullcodigoModalidade = {}1: br.gov.caixa.siifx.exception.BusinessException: Preencha os campos obrigatórios!
2026-10-09T18:42:33.0005013Z 	at br.gov.caixa.siifx.service.modalidade.ModalidadeService.consultarCanalSistema(ModalidadeService.java:477)
2026-10-09T18:42:33.0005437Z 	at br.gov.caixa.siifx.repository.ContingenciaDesligamentoCanaisRepositoryTest.consultarCanalSistemaTest(ContingenciaDesligamentoCanaisRepositoryTest.java:95)
2026-10-09T18:42:33.0005780Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-09T18:42:33.0006026Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-10-09T18:42:33.0006236Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-10-09T18:42:33.0006457Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-10-09T18:42:33.0006670Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
2026-10-09T18:42:33.0006898Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-10-09T18:42:33.0007196Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-10-09T18:42:33.0007456Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-10-09T18:42:33.0007708Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-10-09T18:42:33.0007955Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-10-09T18:42:33.0008257Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-10-09T18:42:33.0008543Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-10-09T18:42:33.0008813Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-10-09T18:42:33.0009076Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-10-09T18:42:33.0009330Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-10-09T18:42:33.0009653Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-10-09T18:42:33.0009868Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-10-09T18:42:33.0010191Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-10-09T18:42:33.0010458Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:217)
2026-10-09T18:42:33.0010742Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:33.0011004Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:213)
2026-10-09T18:42:33.0011269Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:138)
2026-10-09T18:42:33.0011647Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:68)
2026-10-09T18:42:33.0012001Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-10-09T18:42:33.0012363Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:33.0012628Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:33.0012862Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:33.0013122Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:33.0013425Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:33.0013634Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:33.0013877Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:33.0014091Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:33.0014356Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:33.0014638Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:33.0014940Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:33.0015300Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:33.0015557Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:33.0015784Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:33.0016035Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:33.0016291Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:33.0016667Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:33.0016956Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:33.0017254Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:33.0017653Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:33.0017976Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:33.0018349Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:33.0018670Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:33.0018999Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:33.0019377Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:33.0019757Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:33.0019996Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:33.0020328Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-10-09T18:42:33.0020651Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-10-09T18:42:33.0020939Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-10-09T18:42:33.0021188Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)
2026-10-09T18:42:33.0021546Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)
2026-10-09T18:42:33.0021927Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)
2026-10-09T18:42:33.0022322Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)
2026-10-09T18:42:33.0027483Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)
2026-10-09T18:42:33.0027768Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)
2026-10-09T18:42:33.0028001Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
2026-10-09T18:42:33.0028223Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
2026-10-09T18:42:33.0028567Z 	at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
2026-10-09T18:42:33.0028829Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:55)
2026-10-09T18:42:33.0029088Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:223)
2026-10-09T18:42:33.0029498Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:175)
2026-10-09T18:42:33.0029748Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:139)
2026-10-09T18:42:33.0029983Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:456)
2026-10-09T18:42:33.0030252Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:169)
2026-10-09T18:42:33.0030491Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:595)
2026-10-09T18:42:33.0030698Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:581)
2026-10-09T18:42:33.0030849Z 
2026-10-09T18:42:33.0031317Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.143 s - in br.gov.caixa.siifx.repository.ContingenciaDesligamentoCanaisRepositoryTest
2026-10-09T18:42:33.0031650Z [INFO] Running br.gov.caixa.siifx.repository.HistoricoAlteracaoContaAtivoFinanceiroRepositoryTest
2026-10-09T18:42:33.0054723Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.005 s - in br.gov.caixa.siifx.repository.HistoricoAlteracaoContaAtivoFinanceiroRepositoryTest
2026-10-09T18:42:33.0117777Z [INFO] Running br.gov.caixa.siifx.repository.IdentificaTransacaoRepositoryTest
2026-10-09T18:42:33.1322844Z 2026-10-09 15:42:33,129 ERROR [br.gov.cai.sii.rep.IdentificaTransacaoRepository] (main) [BANCO][LEITURA][ERRO] Erro ao IdentificaTransacaoRepository.getMovimento. [1], SQL: null, Exception: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')
2026-10-09T18:42:33.1323598Z java.lang.ClassCastException: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')
2026-10-09T18:42:33.1324106Z 	at br.gov.caixa.siifx.repository.IdentificaTransacaoRepository.getMovimento(IdentificaTransacaoRepository.java:295)
2026-10-09T18:42:33.1324459Z 	at br.gov.caixa.siifx.repository.IdentificaTransacaoRepository.obterMovimentacaoTransacaoPorNotaTransacao(IdentificaTransacaoRepository.java:200)
2026-10-09T18:42:33.1325125Z 	at br.gov.caixa.siifx.repository.IdentificaTransacaoRepositoryTest.test2(IdentificaTransacaoRepositoryTest.java:143)
2026-10-09T18:42:33.1325524Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-09T18:42:33.1325874Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-10-09T18:42:33.1326235Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-10-09T18:42:33.1326635Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-10-09T18:42:33.1326847Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
2026-10-09T18:42:33.1327081Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-10-09T18:42:33.1327589Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-10-09T18:42:33.1327848Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-10-09T18:42:33.1328112Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-10-09T18:42:33.1328366Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-10-09T18:42:33.1328604Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-10-09T18:42:33.1328901Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-10-09T18:42:33.1329202Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-10-09T18:42:33.1329527Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-10-09T18:42:33.1329784Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-10-09T18:42:33.1330035Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-10-09T18:42:33.1330298Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-10-09T18:42:33.1333579Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-10-09T18:42:33.1335053Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:217)
2026-10-09T18:42:33.1335513Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:33.1335941Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:213)
2026-10-09T18:42:33.1336210Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:138)
2026-10-09T18:42:33.1336467Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:68)
2026-10-09T18:42:33.1336733Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-10-09T18:42:33.1337006Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:33.1337263Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:33.1337516Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:33.1337716Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:33.1337967Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:33.1338235Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:33.1338477Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:33.1338697Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:33.1338963Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:33.1339244Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:33.1339494Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:33.1339929Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:33.1340468Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:33.1340736Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:33.1340981Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:33.1342016Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:33.1342257Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:33.1342476Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:33.1342728Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:33.1343097Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:33.1343347Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:33.1343593Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:33.1343928Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:33.1344170Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:33.1344412Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:33.1344658Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:33.1344903Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:33.1345176Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-10-09T18:42:33.1345467Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-10-09T18:42:33.1345694Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-10-09T18:42:33.1345945Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)
2026-10-09T18:42:33.1346211Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)
2026-10-09T18:42:33.1346471Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)
2026-10-09T18:42:33.1346732Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)
2026-10-09T18:42:33.1346996Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)
2026-10-09T18:42:33.1347250Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)
2026-10-09T18:42:33.1347484Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
2026-10-09T18:42:33.1347705Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
2026-10-09T18:42:33.1347943Z 	at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
2026-10-09T18:42:33.1348207Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:55)
2026-10-09T18:42:33.1348729Z 2026-10-09 15:42:33,131 INFO  [br.gov.cai.sii.rep.IdentificaTransacaoRepository] (main) [BANCO][LEITURA][SUCESSO] IdentificaTransacaoRepository.obterMovimentacaoTransacaoPorNotaTransacao verificada em 3 ms
2026-10-09T18:42:33.1349065Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:223)
2026-10-09T18:42:33.1349315Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:175)
2026-10-09T18:42:33.1349528Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:139)
2026-10-09T18:42:33.1349765Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:456)
2026-10-09T18:42:33.1350402Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:169)
2026-10-09T18:42:33.1350639Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:595)
2026-10-09T18:42:33.1350864Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:581)
2026-10-09T18:42:33.2881345Z 2026-10-09 15:42:33,284 INFO  [br.gov.cai.sii.rep.IdentificaTransacaoRepository] (main) [BANCO][LEITURA][SUCESSO] IdentificaTransacaoRepository.obterMovimentacaoTransacaoPorNotaAplicacaoCodigoTransacao verificada em 1 ms
2026-10-09T18:42:33.2941914Z 2026-10-09 15:42:33,291 INFO  [br.gov.cai.sii.rep.IdentificaTransacaoRepository] (main) [BANCO][LEITURA][SUCESSO] IdentificaTransacaoRepository.getMovimento verificada em 0 ms
2026-10-09T18:42:33.2967984Z 2026-10-09 15:42:33,294 INFO  [br.gov.cai.sii.rep.IdentificaTransacaoRepository] (main) [BANCO][LEITURA][SUCESSO] IdentificaTransacaoRepository.getIdentificaTransacaoOriginalDTO verificada em 0 ms
2026-10-09T18:42:33.3113039Z [INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.291 s - in br.gov.caixa.siifx.repository.IdentificaTransacaoRepositoryTest
2026-10-09T18:42:33.3113455Z [INFO] Running br.gov.caixa.siifx.repository.IdentificaTransacaoUtilTest
2026-10-09T18:42:33.3206060Z [INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.004 s - in br.gov.caixa.siifx.repository.IdentificaTransacaoUtilTest
2026-10-09T18:42:33.3206554Z [INFO] Running br.gov.caixa.siifx.repository.ImpedimentoRendaFixaRepositoryTest
2026-10-09T18:42:33.4161357Z 2026-10-09 15:42:33,412 INFO  [br.gov.cai.sii.rep.ImpedimentoRendaFixaRepository] (main) [BANCO][LEITURA][SUCESSO] ImpedimentoRendaFixaRepository.isImpedimentoCadastrado verificada em 1 ms
2026-10-09T18:42:33.4251130Z 2026-10-09 15:42:33,419 ERROR [br.gov.cai.sii.rep.ImpedimentoRendaFixaRepository] (main) [BANCO][LEITURA][ERRO] Erro ao ImpedimentoRendaFixaRepository.isImpedimentoCadastrado. null, SQL: null, Exception: Falha
2026-10-09T18:42:33.4260430Z 2026-10-09 15:42:33,425 INFO  [br.gov.cai.sii.rep.ImpedimentoRendaFixaRepository] (main) [BANCO][LEITURA][SUCESSO] ImpedimentoRendaFixaRepository.isImpedimentoCadastrado verificada em 0 ms
2026-10-09T18:42:33.5367840Z 2026-10-09 15:42:33,534 INFO  [br.gov.cai.sii.rep.ImpedimentoRendaFixaRepository] (main) [BANCO][LEITURA][SUCESSO] ImpedimentoRendaFixaRepository.consultarImpedimentoAplicacao verificada em 0 ms
2026-10-09T18:42:33.5487509Z 2026-10-09 15:42:33,546 INFO  [br.gov.cai.sii.rep.ImpedimentoRendaFixaRepository] (main) [BANCO][EXCLUSAO][SUCESSO] ImpedimentoRendaFixaRepository.excluirImpedimento realizada em 4 ms
2026-10-09T18:42:33.5488269Z 2026-10-09 15:42:33,547 INFO  [br.gov.cai.sii.rep.ImpedimentoRendaFixaRepository] (main) Fim do método ImpedimentoRendaFixaRepository.excluirImpedimento
2026-10-09T18:42:33.5513584Z 2026-10-09 15:42:33,550 ERROR [br.gov.cai.sii.rep.ImpedimentoRendaFixaRepository] (main) [BANCO][EXCLUSAO][ERRO] Erro ao ImpedimentoRendaFixaRepository.excluirImpedimento. null, SQL: null, Exception: DB
2026-10-09T18:42:33.5514051Z 2026-10-09 15:42:33,550 INFO  [br.gov.cai.sii.rep.ImpedimentoRendaFixaRepository] (main) Fim do método ImpedimentoRendaFixaRepository.excluirImpedimento
2026-10-09T18:42:33.5527481Z 2026-10-09 15:42:33,551 ERROR [br.gov.cai.sii.rep.ImpedimentoRendaFixaRepository] (main) [BANCO][LEITURA][ERRO] Erro ao ImpedimentoRendaFixaRepository.consultarImpedimentoAplicacao. null, SQL: null, Exception: DB error
2026-10-09T18:42:33.5587783Z [INFO] Tests run: 10, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.24 s - in br.gov.caixa.siifx.repository.ImpedimentoRendaFixaRepositoryTest
2026-10-09T18:42:33.5588148Z [INFO] Running br.gov.caixa.siifx.repository.InformativoMensalRepositoryTest
2026-10-09T18:42:33.5683487Z 2026-10-09 15:42:33,567 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) Erro ao recuperarCpfCnpjClienteInformeMensal. null. Parametros: 1. SQL: 1: java.lang.NullPointerException
2026-10-09T18:42:33.5684929Z 
2026-10-09T18:42:33.5758513Z [INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.014 s - in br.gov.caixa.siifx.repository.InformativoMensalRepositoryTest
2026-10-09T18:42:33.5758843Z [INFO] Running br.gov.caixa.siifx.repository.IsencaoImunidadePanacheRepositoryTest
2026-10-09T18:42:33.6782777Z [INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.099 s - in br.gov.caixa.siifx.repository.IsencaoImunidadePanacheRepositoryTest
2026-10-09T18:42:33.6783373Z [INFO] Running br.gov.caixa.siifx.repository.ModalidadeImpostoRepositoryTest
2026-10-09T18:42:33.6810455Z 2026-10-09 15:42:33,678 INFO  [br.gov.cai.sii.rep.ModalidadeImpostoRepository] (main) [BANCO][LEITURA][SUCESSO] .consultarImpostoPorProdutoModalidade verificada em 2 ms
2026-10-09T18:42:33.6811458Z 2026-10-09 15:42:33,679 ERROR [br.gov.cai.sii.rep.ModalidadeImpostoRepository] (main) [BANCO][LEITURA][ERRO] Erro ao .consultarImpostoPorProdutoModalidade. codigoModalidade = {}1codigoProduto = {}1, SQL: SELECT mdi.NU_MODALIDADE_IMPTO_RENDA_FIXA, mdi.CO_IMPOSTO, imp.SG_IMPOSTO, imp.NO_IMPOSTO FROM  IFX.IFXTB066_MODALIDADE_IMPOSTO mdi INNER JOIN  IFX.IFXTB026_IMPOSTO imp ON imp.CO_IMPOSTO = mdi.CO_IMPOSTO WHERE mdi.NU_PRODUTO_RENDA_FIXA = :codigoProduto AND mdi.NU_MODALIDADE_PRDTO_RENDA_FIXA = :codigoModalidade ORDER BY mdi.NU_MODALIDADE_IMPTO_RENDA_FIXA, Exception: null: java.lang.NullPointerException
2026-10-09T18:42:33.6812414Z 
2026-10-09T18:42:33.6897738Z 2026-10-09 15:42:33,681 INFO  [br.gov.cai.sii.rep.ModalidadeImpostoRepository] (main) [BANCO][LEITURA][SUCESSO] .consultarModalidadeImposto verificada em 1 ms
2026-10-09T18:42:33.6899103Z 2026-10-09 15:42:33,681 ERROR [br.gov.cai.sii.rep.ModalidadeImpostoRepository] (main) [BANCO][LEITURA][ERRO] Erro ao .consultarModalidadeImposto. null, SQL: SELECT   MDI.NU_MODALIDADE_IMPTO_RENDA_FIXA,     MDI.NU_PRODUTO_RENDA_FIXA,     MDI.NU_MODALIDADE_PRDTO_RENDA_FIXA,     MDI.CO_IMPOSTO,     IMP.SG_IMPOSTO,     MD.NO_MODALIDADE_PRDTO_RENDA_FIXA FROM  IFX.IFXTB066_MODALIDADE_IMPOSTO   MDI     JOIN  IFX.IFXTB026_IMPOSTO     IMP ON ( IMP.CO_IMPOSTO = MDI.CO_IMPOSTO )     JOIN  IFX.IFXTB010_MODALIDADE_PRODUTO    MD ON ( MD.NU_MODALIDADE_PRDTO_RENDA_FIXA = MDI.NU_MODALIDADE_PRDTO_RENDA_FIXA                                                    AND MD.NU_PRODUTO_RENDA_FIXA = MDI.NU_PRODUTO_RENDA_FIXA )   ORDER BY MDI.NU_PRODUTO_RENDA_FIXA DESC, MDI.NU_MODALIDADE_PRDTO_RENDA_FIXA DESC, Exception: null: java.lang.NullPointerException
2026-10-09T18:42:33.6899602Z 
2026-10-09T18:42:33.6923979Z 2026-10-09 15:42:33,684 INFO  [br.gov.cai.sii.rep.ModalidadeImpostoRepository] (main) [BANCO][LEITURA][SUCESSO] .existeRegistroIgual verificada em 0 ms
2026-10-09T18:42:33.6924541Z 2026-10-09 15:42:33,690 ERROR [br.gov.cai.sii.rep.ModalidadeImpostoRepository] (main) [BANCO][LEITURA][ERRO] Erro ao .existeRegistroIgual. ModalidadeImpostoDTO(nuModalidadeImptoRendaFixa=null, nuProdutoRendaFixa=null, nuModalidadePrdtoRendaFixa=null, coImposto=null), SQL: SELECT *
2026-10-09T18:42:33.6924836Z FROM  IFX.IFXTB066_MODALIDADE_IMPOSTO
2026-10-09T18:42:33.6925018Z WHERE NU_PRODUTO_RENDA_FIXA = null AND NU_MODALIDADE_PRDTO_RENDA_FIXA = null AND CO_IMPOSTO = null, Exception: null: java.lang.NullPointerException
2026-10-09T18:42:33.6925168Z 
2026-10-09T18:42:33.6936740Z 2026-10-09 15:42:33,692 INFO  [br.gov.cai.sii.rep.ModalidadeImpostoRepository] (main) [BANCO][LEITURA][SUCESSO] .encontrarFaixaImpostoIRRF verificada em 0 ms
2026-10-09T18:42:33.6939209Z 2026-10-09 15:42:33,692 ERROR [br.gov.cai.sii.rep.ModalidadeImpostoRepository] (main) [BANCO][LEITURA][ERRO] Erro ao tentar acessar Faixa Imposto codigoModalidade = {} 1, codigoProduto = {} 1, prazo: 1, SQL:  SELECT  IPF.CO_IMPOSTO AS CODIGOIMPOSTO,  IPF.CO_VERSAO_IMPOSTO AS CODIGOIMPOSTOVERSAO,  IPF.CO_FAIXA_VERSAO_IMPOSTO AS CODIGOIMPOSTOVERSAOFAIXA,  IPF.PZ_MINIMO_FAIXA_VERSAO_IMPOSTO AS PRAZOMINIMOFAIXA,  IPF.PZ_MAXIMO_FAIXA_VERSAO_IMPOSTO AS PRAZOMAXIMOFAIXA,  IPF.PC_FAIXA_VERSAO_IMPOSTO AS TAXADIAAPLICACAO  FROM IFX.IFXTB066_MODALIDADE_IMPOSTO MOI   INNER JOIN IFX.IFXTB026_IMPOSTO IMP 	ON ( MOI.CO_IMPOSTO = IMP.CO_IMPOSTO )  INNER JOIN IFX.IFXTB027_IMPOSTO_VERSAO IPV 	ON ( IMP.CO_IMPOSTO = IPV.CO_IMPOSTO )  INNER JOIN IFX.IFXTB028_IMPOSTO_VERSAO_FAIXA IPF 	ON ( IPV.CO_VERSAO_IMPOSTO = IPF.CO_VERSAO_IMPOSTO    AND MOI.CO_IMPOSTO = IPF.CO_IMPOSTO )  WHERE  	MOI.NU_PRODUTO_RENDA_FIXA = :codigoProduto 	AND MOI.NU_MODALIDADE_PRDTO_RENDA_FIXA = :codigoModalidade 	AND ( IPF.CO_IMPOSTO = 2 OR TRIM(imp.SG_IMPOSTO) = 'IRRF' ) 	AND :prazo BETWEEN IPF.PZ_MINIMO_FAIXA_VERSAO_IMPOSTO AND COALESCE(IPF.PZ_MAXIMO_FAIXA_VERSAO_IMPOSTO, :prazo ) 	AND ( ( IPF.CO_IMPOSTO = 3 AND TO_DATE(:dataEmissao, 'DD/MM/YYYY') BETWEEN IPV.TS_INICIO_VERSAO_IMPOSTO AND ( COALESCE(IPV.TS_TERMINO_VERSAO_IMPOSTO, TO_DATE(:dataEmissao, 'DD/MM/YYYY')) ) ) 		OR ( IPF.CO_IMPOSTO <> 3 AND TO_DATE(:dataMovimentoAplicacao, 'DD/MM/YYYY') BETWEEN IPV.TS_INICIO_VERSAO_IMPOSTO AND ( COALESCE(IPV.TS_TERMINO_VERSAO_IMPOSTO, TO_DATE(:dataMovimentoAplicacao, 'DD/MM/YYYY')) ) ) )  : java.lang.NullPointerException
2026-10-09T18:42:33.6940281Z 
2026-10-09T18:42:33.6986385Z 2026-10-09 15:42:33,693 INFO  [br.gov.cai.sii.rep.ModalidadeImpostoRepository] (main) [BANCO][LEITURA][SUCESSO] .excluir verificada em 0 ms
2026-10-09T18:42:33.6986880Z 2026-10-09 15:42:33,694 ERROR [br.gov.cai.sii.rep.ModalidadeImpostoRepository] (main) [BANCO][LEITURA][ERRO] Erro ao .excluir. codigo: 1, SQL: queryMock, Exception: null: java.lang.NullPointerException
2026-10-09T18:42:33.6987038Z 
2026-10-09T18:42:33.6996213Z 2026-10-09 15:42:33,698 INFO  [br.gov.cai.sii.rep.ModalidadeImpostoRepository] (main) [BANCO][LEITURA][SUCESSO] .buscaModalidadeImpostoPorCodigo verificada em 3 ms
2026-10-09T18:42:33.6996783Z 2026-10-09 15:42:33,698 ERROR [br.gov.cai.sii.rep.ModalidadeImpostoRepository] (main) [BANCO][LEITURA][ERRO] Erro ao .buscaModalidadeImpostoPorCodigo. codigo: 1, SQL: null, Exception: null: java.lang.NullPointerException
2026-10-09T18:42:33.6996961Z 
2026-10-09T18:42:33.7007394Z 2026-10-09 15:42:33,699 INFO  [br.gov.cai.sii.rep.ModalidadeImpostoRepository] (main) [BANCO][LEITURA][SUCESSO] .encontrarFaixaImpostoIOF verificada em 0 ms
2026-10-09T18:42:33.7009055Z 2026-10-09 15:42:33,700 ERROR [br.gov.cai.sii.rep.ModalidadeImpostoRepository] (main) [BANCO][LEITURA][ERRO] Erro ao .encontrarFaixaImpostoIOF. codigoModalidade = {}1codigoProduto = {}1, prazo: 1, SQL: SELECT  IPF.CO_IMPOSTO AS CODIGOIMPOSTO,  IPF.CO_VERSAO_IMPOSTO AS CODIGOIMPOSTOVERSAO,  IPF.CO_FAIXA_VERSAO_IMPOSTO AS CODIGOIMPOSTOVERSAOFAIXA,  IPF.PZ_MINIMO_FAIXA_VERSAO_IMPOSTO AS PRAZOMINIMOFAIXA,  IPF.PZ_MAXIMO_FAIXA_VERSAO_IMPOSTO AS PRAZOMAXIMOFAIXA,  IPF.PC_FAIXA_VERSAO_IMPOSTO AS TAXADIAAPLICACAO  FROM IFX.IFXTB066_MODALIDADE_IMPOSTO MOI   INNER JOIN IFX.IFXTB026_IMPOSTO IMP 	ON ( MOI.CO_IMPOSTO = IMP.CO_IMPOSTO )  INNER JOIN IFX.IFXTB027_IMPOSTO_VERSAO IPV 	ON ( IMP.CO_IMPOSTO = IPV.CO_IMPOSTO )  INNER JOIN IFX.IFXTB028_IMPOSTO_VERSAO_FAIXA IPF 	ON ( IPV.CO_VERSAO_IMPOSTO = IPF.CO_VERSAO_IMPOSTO    AND MOI.CO_IMPOSTO = IPF.CO_IMPOSTO )  WHERE  	MOI.NU_PRODUTO_RENDA_FIXA = :codigoProduto 	AND MOI.NU_MODALIDADE_PRDTO_RENDA_FIXA = :codigoModalidade 	AND ( IPF.CO_IMPOSTO = 1 OR TRIM(imp.SG_IMPOSTO) = 'IOF' ) 	AND TO_DATE(:dataMovimentoAplicacao, 'DD/MM/YYYY') BETWEEN IPV.TS_INICIO_VERSAO_IMPOSTO AND ( COALESCE(IPV.TS_TERMINO_VERSAO_IMPOSTO, TO_DATE(:dataMovimentoAplicacao, 'DD/MM/YYYY')) ) 	AND :prazo BETWEEN IPF.PZ_MINIMO_FAIXA_VERSAO_IMPOSTO AND COALESCE(IPF.PZ_MAXIMO_FAIXA_VERSAO_IMPOSTO, :prazo) , Exception: null: java.lang.NullPointerException
2026-10-09T18:42:33.7010244Z 
2026-10-09T18:42:33.7018673Z 2026-10-09 15:42:33,701 INFO  [br.gov.cai.sii.rep.ModalidadeImpostoRepository] (main) [BANCO][LEITURA][SUCESSO] .consultarImpostoVersaoPorProdutoModalidade verificada em 1 ms
2026-10-09T18:42:33.7019430Z 2026-10-09 15:42:33,701 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) Erro ao .consultarImpostoVersaoPorProdutoModalidade. null. Parametros: [1, 1]. SQL: SELECT B.CO_IMPOSTO , CC.CO_VERSAO_IMPOSTO  FROM  IFX.IFXTB066_MODALIDADE_IMPOSTO B INNER JOIN  IFX.IFXTB027_IMPOSTO_VERSAO CC ON B.CO_IMPOSTO = CC.CO_IMPOSTO  WHERE B.NU_PRODUTO_RENDA_FIXA = :codigoProduto AND B.NU_MODALIDADE_PRDTO_RENDA_FIXA = :codigoModalidade AND CC.IC_SITUACAO_VERSAO_IMPOSTO = 3: java.lang.NullPointerException
2026-10-09T18:42:33.7019738Z 
2026-10-09T18:42:33.7078251Z [INFO] Tests run: 9, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.029 s - in br.gov.caixa.siifx.repository.ModalidadeImpostoRepositoryTest
2026-10-09T18:42:33.7078974Z [INFO] Running br.gov.caixa.siifx.repository.MovimentoTransacaoConsultaNovoRepository2Test
2026-10-09T18:42:33.8685265Z 2026-10-09 15:42:33,866 INFO  [br.gov.cai.sii.rep.MovimentoTransacaoConsultaNovoRepository2] (main) [BANCO][LEITURA][SUCESSO] .encontrarTransacao verificada em 6 ms
2026-10-09T18:42:33.8739831Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.165 s - in br.gov.caixa.siifx.repository.MovimentoTransacaoConsultaNovoRepository2Test
2026-10-09T18:42:33.8740330Z [INFO] Running br.gov.caixa.siifx.repository.MovimentoTransacaoConsultaNovoRepositoryTest
2026-10-09T18:42:33.8786240Z 2026-10-09 15:42:33,874 INFO  [br.gov.cai.sii.rep.MovimentoTransacaoConsultaNovoRepository] (main) [BANCO][LEITURA][SUCESSO] .encontrarTransacao verificada em 0 ms
2026-10-09T18:42:33.8806557Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.004 s - in br.gov.caixa.siifx.repository.MovimentoTransacaoConsultaNovoRepositoryTest
2026-10-09T18:42:33.8807104Z [INFO] Running br.gov.caixa.siifx.repository.TransacoesSequenciaisRepositoryTest
2026-10-09T18:42:33.8908670Z [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.009 s - in br.gov.caixa.siifx.repository.TransacoesSequenciaisRepositoryTest
2026-10-09T18:42:33.8909103Z [INFO] Running br.gov.caixa.siifx.repository.alteraconta.AlteraContaAtivoFinanceiroRepositoryTest
2026-10-09T18:42:33.9116689Z [INFO] Tests run: 8, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.015 s - in br.gov.caixa.siifx.repository.alteraconta.AlteraContaAtivoFinanceiroRepositoryTest
2026-10-09T18:42:33.9117033Z [INFO] Running br.gov.caixa.siifx.repository.alteratitularidade.IdentificaAtivoFinanceiroAlteraTitularidadeRepositoryTest
2026-10-09T18:42:34.0263450Z [INFO] Tests run: 8, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.114 s - in br.gov.caixa.siifx.repository.alteratitularidade.IdentificaAtivoFinanceiroAlteraTitularidadeRepositoryTest
2026-10-09T18:42:34.0263914Z [INFO] Running br.gov.caixa.siifx.repository.aplicacao.NegociacaoContratoRepositoryTest
2026-10-09T18:42:34.0312328Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.003 s - in br.gov.caixa.siifx.repository.aplicacao.NegociacaoContratoRepositoryTest
2026-10-09T18:42:34.0312649Z [INFO] Running br.gov.caixa.siifx.repository.aplicacao.PropostaContratoRepositoryTest
2026-10-09T18:42:34.0656607Z [INFO] Tests run: 12, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.031 s - in br.gov.caixa.siifx.repository.aplicacao.PropostaContratoRepositoryTest
2026-10-09T18:42:34.0657124Z [INFO] Running br.gov.caixa.siifx.repository.aplicacao.RegistraContratoRepositoryTest
2026-10-09T18:42:34.0708356Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.003 s - in br.gov.caixa.siifx.repository.aplicacao.RegistraContratoRepositoryTest
2026-10-09T18:42:34.0708681Z [INFO] Running br.gov.caixa.siifx.repository.aplicacao.registra.MovimentoTransacaoPanacheRepositoryTest
2026-10-09T18:42:34.1809144Z [INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.106 s - in br.gov.caixa.siifx.repository.aplicacao.registra.MovimentoTransacaoPanacheRepositoryTest
2026-10-09T18:42:34.1809893Z [INFO] Running br.gov.caixa.siifx.repository.aplicacao.registra.MovimentoTransacaoRepositoryTest
2026-10-09T18:42:34.1810553Z 2026-10-09 15:42:34,177 INFO  [br.gov.cai.sii.rep.apl.reg.MovimentoTransacaoRepository] (main) [BANCO][ATUALIZACAO][SUCESSO] TestableMovimentoTransacaoRepository.editarPanache realizada em 0 ms
2026-10-09T18:42:34.1811008Z 2026-10-09 15:42:34,179 INFO  [br.gov.cai.sii.rep.apl.reg.MovimentoTransacaoRepository] (main) [BANCO][LEITURA][SUCESSO] TestableMovimentoTransacaoRepository.buscarNotaTransacaoPanache verificada em 0 ms
2026-10-09T18:42:34.1821748Z 2026-10-09 15:42:34,181 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) Erro ao TestableMovimentoTransacaoRepository.buscarNotaTransacaoPanache. falha simulada. Parametros: 123456789; 1: java.lang.RuntimeException: falha simulada
2026-10-09T18:42:34.1822789Z 	at br.gov.caixa.siifx.repository.aplicacao.registra.MovimentoTransacaoRepositoryTest.deveEncapsularRuntimeExceptionEmException(MovimentoTransacaoRepositoryTest.java:75)
2026-10-09T18:42:34.1824539Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-09T18:42:34.1824815Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-10-09T18:42:34.1825176Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-10-09T18:42:34.1825675Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-10-09T18:42:34.1825902Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
2026-10-09T18:42:34.1826135Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-10-09T18:42:34.1826389Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-10-09T18:42:34.1826679Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-10-09T18:42:34.1827013Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-10-09T18:42:34.1827264Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-10-09T18:42:34.1827570Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-10-09T18:42:34.1827866Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-10-09T18:42:34.1828142Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-10-09T18:42:34.1828409Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-10-09T18:42:34.1828828Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-10-09T18:42:34.1829154Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-10-09T18:42:34.1829499Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-10-09T18:42:34.1829751Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-10-09T18:42:34.1830022Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:217)
2026-10-09T18:42:34.1830439Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:34.1830839Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:213)
2026-10-09T18:42:34.1831376Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:138)
2026-10-09T18:42:34.1831885Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:68)
2026-10-09T18:42:34.1832285Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-10-09T18:42:34.1832664Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:34.1833078Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:34.1833462Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:34.1833770Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:34.1834024Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:34.1834383Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:34.1834591Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:34.1834817Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:34.1835081Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:34.1835379Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:34.1835719Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:34.1835968Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:34.1836235Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:34.1836461Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:34.1836716Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:34.1836962Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:34.1837273Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:34.1837482Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:34.1837821Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:34.1838147Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:34.1838397Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:34.1838672Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:34.1838978Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:34.1839307Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:34.1839658Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:34.1839934Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:34.1840169Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:34.1840435Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-10-09T18:42:34.1840785Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-10-09T18:42:34.1841086Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-10-09T18:42:34.1841345Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)
2026-10-09T18:42:34.1841847Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)
2026-10-09T18:42:34.1842114Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)
2026-10-09T18:42:34.1842334Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)
2026-10-09T18:42:34.1842758Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)
2026-10-09T18:42:34.1843168Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)
2026-10-09T18:42:34.1843511Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
2026-10-09T18:42:34.1843853Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
2026-10-09T18:42:34.1844134Z 	at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
2026-10-09T18:42:34.1844373Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:55)
2026-10-09T18:42:34.1844710Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:223)
2026-10-09T18:42:34.1845072Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:175)
2026-10-09T18:42:34.1845335Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:139)
2026-10-09T18:42:34.1845707Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:456)
2026-10-09T18:42:34.1846003Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:169)
2026-10-09T18:42:34.1846181Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:595)
2026-10-09T18:42:34.1846405Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:581)
2026-10-09T18:42:34.1846633Z 
2026-10-09T18:42:34.2075667Z 2026-10-09 15:42:34,205 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) Erro ao TestableMovimentoTransacaoRepository.editarPanache. erro merge. Parametros: MovimentoTransacaoModel(codigoMovimentacao=null, numeroNSUTransacaoAplicacao=null, numeroSequenciaTransacaoProposta=null, codigoProduto=null, codigoModalidadeProduto=null, nuContratoAtivo=null, tsTransacaoMovimento=null, tsTransacaoMovimentoReferencia=null, nuSituacaoTransacao=null, codigoAcaoTransacao=null, codigoComandoTransacao=null, codigoAntecedenteTransacao=null, valorTransacao=null, codigoCanal=null, nuSegmentoOrigem=null, numeroNSUOrigem=null, numeroNSUIntermediario=null, nuSegmentoIntermediario=null, nuUnidadeOrigem=null, icCpfCnpj=null, cpfCnpjCliente=null, coCpfCnpjCliente=null, nuSegmento=null, siglaSegmento=null, nuCarteira=null, cnae=null, nuPerfilInvestidor=null, dtPerfilInvestidor=null, numeroNSUBarramento=null, numeroNSUDepositoTransacao=null, sgUfUnidadeAgencia=null, nuUnidadeAgencia=null, numeroProdutoConta=null, contaDepositoAtivo=null, digitoDepositoAtivo=null, valorDeposito=null, icAssinatura=null, icTipoNotaTransacao=null, codigoAlcadaAplicacaoProduto=null, codigoUsuario=null, codigoTerminalTransacao=null, ativoNovo=null, saldoAplicacao=null, descricaoTransacao=null, percentuais=null): java.lang.RuntimeException: erro merge
2026-10-09T18:42:34.2077121Z 	at br.gov.caixa.siifx.repository.aplicacao.registra.MovimentoTransacaoRepository.editarPanache(MovimentoTransacaoRepository.java:277)
2026-10-09T18:42:34.2077689Z 	at br.gov.caixa.siifx.repository.aplicacao.registra.MovimentoTransacaoRepositoryTest.lambda$deveEncapsularExcecaoNoEditarPanache$1(MovimentoTransacaoRepositoryTest.java:107)
2026-10-09T18:42:34.2078208Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:53)
2026-10-09T18:42:34.2078446Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:35)
2026-10-09T18:42:34.2078663Z 	at org.junit.jupiter.api.Assertions.assertThrows(Assertions.java:3083)
2026-10-09T18:42:34.2078941Z 	at br.gov.caixa.siifx.repository.aplicacao.registra.MovimentoTransacaoRepositoryTest.deveEncapsularExcecaoNoEditarPanache(MovimentoTransacaoRepositoryTest.java:107)
2026-10-09T18:42:34.2079322Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-09T18:42:34.2079611Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-10-09T18:42:34.2084036Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-10-09T18:42:34.2084272Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-10-09T18:42:34.2084626Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
2026-10-09T18:42:34.2084854Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-10-09T18:42:34.2085081Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-10-09T18:42:34.2085345Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-10-09T18:42:34.2085599Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-10-09T18:42:34.2085852Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-10-09T18:42:34.2086131Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-10-09T18:42:34.2086419Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-10-09T18:42:34.2086691Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-10-09T18:42:34.2086996Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-10-09T18:42:34.2087250Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-10-09T18:42:34.2087498Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-10-09T18:42:34.2087746Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-10-09T18:42:34.2088002Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-10-09T18:42:34.2088264Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:217)
2026-10-09T18:42:34.2088528Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:34.2088795Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:213)
2026-10-09T18:42:34.2089022Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:138)
2026-10-09T18:42:34.2089285Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:68)
2026-10-09T18:42:34.2089542Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-10-09T18:42:34.2089943Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:34.2090197Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:34.2090470Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:34.2090701Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:34.2090956Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:34.2091198Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:34.2091520Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:34.2091737Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:34.2092037Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:34.2092315Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:34.2092528Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:34.2092779Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:34.2093020Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:34.2093251Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:34.2093500Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:34.2093770Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:34.2094005Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:34.2094217Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:34.2094467Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:34.2094743Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:34.2094999Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:34.2095251Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:34.2095480Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:34.2095681Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:34.2095939Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:34.2096179Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:34.2096412Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:34.2096679Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-10-09T18:42:34.2096971Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-10-09T18:42:34.2097223Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-10-09T18:42:34.2097513Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)
2026-10-09T18:42:34.2097758Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)
2026-10-09T18:42:34.2098031Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)
2026-10-09T18:42:34.2098285Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)
2026-10-09T18:42:34.2098544Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)
2026-10-09T18:42:34.2098835Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)
2026-10-09T18:42:34.2099037Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
2026-10-09T18:42:34.2099256Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
2026-10-09T18:42:34.2099527Z 	at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
2026-10-09T18:42:34.2099768Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:55)
2026-10-09T18:42:34.2100047Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:223)
2026-10-09T18:42:34.2100453Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:175)
2026-10-09T18:42:34.2100717Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:139)
2026-10-09T18:42:34.2100974Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:456)
2026-10-09T18:42:34.2101196Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:169)
2026-10-09T18:42:34.2101537Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:595)
2026-10-09T18:42:34.2101775Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:581)
2026-10-09T18:42:34.2101856Z 
2026-10-09T18:42:34.2102769Z 2026-10-09 15:42:34,207 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) Erro ao TestableMovimentoTransacaoRepository.buscarNotaTransacaoPanache. falha simulada nsu. Parametros: 123456789; 987654321; 1: java.lang.RuntimeException: falha simulada nsu
2026-10-09T18:42:34.2103729Z 	at br.gov.caixa.siifx.repository.aplicacao.registra.MovimentoTransacaoRepositoryTest.deveEncapsularRuntimeExceptionEmExceptionNaBuscaComNsu(MovimentoTransacaoRepositoryTest.java:173)
2026-10-09T18:42:34.2104669Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-09T18:42:34.2105015Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-10-09T18:42:34.2105468Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-10-09T18:42:34.2105875Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-10-09T18:42:34.2106223Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
2026-10-09T18:42:34.2106612Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-10-09T18:42:34.2107080Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-10-09T18:42:34.2107547Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-10-09T18:42:34.2107970Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-10-09T18:42:34.2108402Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-10-09T18:42:34.2108890Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-10-09T18:42:34.2109587Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-10-09T18:42:34.2110069Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-10-09T18:42:34.2110493Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-10-09T18:42:34.2110862Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-10-09T18:42:34.2111321Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-10-09T18:42:34.2111845Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-10-09T18:42:34.2112214Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-10-09T18:42:34.2112841Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:217)
2026-10-09T18:42:34.2113240Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:34.2113636Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:213)
2026-10-09T18:42:34.2114041Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:138)
2026-10-09T18:42:34.2114434Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:68)
2026-10-09T18:42:34.2114860Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-10-09T18:42:34.2115260Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:34.2115651Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:34.2116023Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:34.2116397Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:34.2116795Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:34.2117198Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:34.2117533Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:34.2117893Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:34.2118356Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:34.2118827Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:34.2119213Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:34.2119622Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:34.2119987Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:34.2120360Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:34.2120739Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:34.2121146Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:34.2121842Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:34.2122199Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:34.2122596Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:34.2123260Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:34.2123697Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:34.2124098Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:34.2124490Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:34.2124875Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:34.2125386Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:34.2125842Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:34.2126486Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:34.2126985Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-10-09T18:42:34.2127482Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-10-09T18:42:34.2127954Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-10-09T18:42:34.2128464Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)
2026-10-09T18:42:34.2128934Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)
2026-10-09T18:42:34.2129313Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)
2026-10-09T18:42:34.2129719Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)
2026-10-09T18:42:34.2130182Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)
2026-10-09T18:42:34.2130592Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)
2026-10-09T18:42:34.2130974Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
2026-10-09T18:42:34.2131336Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
2026-10-09T18:42:34.2131803Z 	at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
2026-10-09T18:42:34.2132183Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:55)
2026-10-09T18:42:34.2132570Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:223)
2026-10-09T18:42:34.2132979Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:175)
2026-10-09T18:42:34.2133379Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:139)
2026-10-09T18:42:34.2133745Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:456)
2026-10-09T18:42:34.2134095Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:169)
2026-10-09T18:42:34.2134386Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:595)
2026-10-09T18:42:34.2134930Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:581)
2026-10-09T18:42:34.2135123Z 
2026-10-09T18:42:34.2135818Z 2026-10-09 15:42:34,208 INFO  [br.gov.cai.sii.rep.apl.reg.MovimentoTransacaoRepository] (main) [BANCO][LEITURA][SUCESSO] TestableMovimentoTransacaoRepository.buscarNotaTransacaoPanache verificada em 0 ms
2026-10-09T18:42:34.2136534Z 2026-10-09 15:42:34,209 INFO  [br.gov.cai.sii.rep.apl.reg.MovimentoTransacaoRepository] (main) [BANCO][LEITURA][SUCESSO] TestableMovimentoTransacaoRepository.buscarNotaTransacaoPanache verificada em 0 ms
2026-10-09T18:42:34.2137210Z 2026-10-09 15:42:34,209 INFO  [br.gov.cai.sii.rep.apl.reg.MovimentoTransacaoRepository] (main) [BANCO][LEITURA][SUCESSO] TestableMovimentoTransacaoRepository.buscarListaMovimentoPanache verificada em 0 ms
2026-10-09T18:42:34.2170742Z [INFO] Tests run: 8, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.033 s - in br.gov.caixa.siifx.repository.aplicacao.registra.MovimentoTransacaoRepositoryTest
2026-10-09T18:42:34.2225627Z [INFO] Running br.gov.caixa.siifx.repository.ativofinanceiro.AtivoFinanceiroRepositoryTest
2026-10-09T18:42:35.1652611Z 2026-10-09 15:42:35,162 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) Erro ao AtivoFinanceiroRepository.validateCpfCnpjTransacao. null. Parametros: ParametrosAtivoFinanceiro(codigoCanalOrigem=null, codigoSistemaOrigem=null, nsuSistemaOrigem=null, codigoSistemaIntermediario=null, nsuSistemaIntermediario=null, codigoAcaoTransacao=null, codigoComandoTransacao=null, codigoAntecedenteTransacao=null, tipoConsulta=null, dataMovimento=null, codigoTipoPessoa=null, cpfCnpj=321321, codigoProduto=null, notaAplicacao=null, codigoAtivo=null, operador=null, terminal=null, token=null, codigoModalidade=null, notaTransacao=1234, situacaoAtivo=null, tipoMotivo=null, unidadeDeposito=null, produtoDeposito=null, contaDeposito=null, digitoDeposito=null, exibirTransacoesRendimentos=null, situacaoTransacao=null, dataInicio=null, dataFim=null, situacoes=null, motivos=null). SQL: queryMock: javax.persistence.NoResultException
2026-10-09T18:42:35.1653748Z 
2026-10-09T18:42:35.1832555Z 2026-10-09 15:42:35,175 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) Erro ao AtivoFinanceiroRepository.consultarProdutoModalidade. Database error. Parametros: [[Ljava.lang.Object;@6a29ad40]. SQL:  SELECT  PRODUTO.IC_NATUREZA_PRODUTO_RENDA_FIXA,  PRODUTO.IC_PRDTO_RNDA_FIXA_RGSTO_CETIP,  PRODUTO.IC_PRDTO_FNDO_GARANTIDOR_CRDTO,  PRODUTO.IC_PRDTO_RNDA_FIXA_LSTRO,  PRODUTO.IC_TPO_LSTRO_PRDTO_RNDA_FIXA,  PRODUTO.IC_PRDTO_RNDA_FIXA_SWAP,  PRODUTO.IC_PRDTO_RNDA_FIXA_SPREAD,  PRODUTO.IC_MULTIPLA_CURVA_PRODUTO,  MODALIDADE.IC_REMUNERACAO_MDLDE_PRDTO,  MODALIDADE.IC_TIPO_REMUNERACAO_MODALIDADE, MODALIDADE.IC_MDLDE_CARENCIA_NEGOCIAL,  MODALIDADE.VR_UNTRO_VARIACAO_APLCO_MDLDE,  MODALIDADE.PZ_MINIMO_RESGATE_MODALIDADE FROM  IFX.ifxtb010_modalidade_produto modalidade  LEFT JOIN  IFX.ifxtb008_produto_renda_fixa PRODUTO  ON PRODUTO.NU_PRODUTO_RENDA_FIXA  = MODALIDADE.NU_PRODUTO_RENDA_FIXA  WHERE MODALIDADE.NU_PRODUTO_RENDA_FIXA = :nuProdutoRendaFixa  AND MODALIDADE.NU_MODALIDADE_PRDTO_RENDA_FIXA = :nuModalidadeProdutoRendaFixa: java.lang.RuntimeException: Database error
2026-10-09T18:42:35.1833589Z 	at br.gov.caixa.siifx.repository.ativofinanceiro.AtivoFinanceiroRepository.consultarProdutoModalidade(AtivoFinanceiroRepository.java:1723)
2026-10-09T18:42:35.1833930Z 	at br.gov.caixa.siifx.repository.ativofinanceiro.AtivoFinanceiroRepositoryTest.testConsultarProdutoModalidade_Exception(AtivoFinanceiroRepositoryTest.java:1010)
2026-10-09T18:42:35.1834391Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-09T18:42:35.1834716Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-10-09T18:42:35.1835053Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-10-09T18:42:35.1835367Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-10-09T18:42:35.1835581Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
2026-10-09T18:42:35.1836066Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-10-09T18:42:35.1836325Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-10-09T18:42:35.1836550Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-10-09T18:42:35.1836798Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-10-09T18:42:35.1837100Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-10-09T18:42:35.1837385Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-10-09T18:42:35.1837773Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-10-09T18:42:35.1838189Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-10-09T18:42:35.1838446Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-10-09T18:42:35.1838697Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-10-09T18:42:35.1838948Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-10-09T18:42:35.1839211Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-10-09T18:42:35.1839492Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-10-09T18:42:35.1839752Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:217)
2026-10-09T18:42:35.1840021Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.1840277Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:213)
2026-10-09T18:42:35.1840502Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:138)
2026-10-09T18:42:35.1840813Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:68)
2026-10-09T18:42:35.1841077Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-10-09T18:42:35.1841331Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.1841764Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:35.1842049Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:35.1842288Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:35.1842545Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.1842794Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:35.1843042Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:35.1843257Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:35.1843527Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:35.1843809Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:35.1844079Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.1844436Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:35.1844753Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:35.1845061Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:35.1845317Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.1845557Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:35.1845798Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:35.1846010Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:35.1846299Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:35.1846601Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:35.1846850Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.1847094Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:35.1847322Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:35.1847513Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:35.1847764Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.1848008Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:35.1848249Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:35.1848520Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-10-09T18:42:35.1848834Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-10-09T18:42:35.1849097Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-10-09T18:42:35.1849407Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)
2026-10-09T18:42:35.1849764Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)
2026-10-09T18:42:35.1850042Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)
2026-10-09T18:42:35.1850293Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)
2026-10-09T18:42:35.1850562Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)
2026-10-09T18:42:35.1850811Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)
2026-10-09T18:42:35.1851078Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
2026-10-09T18:42:35.1851265Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
2026-10-09T18:42:35.1851604Z 	at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
2026-10-09T18:42:35.1851858Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:55)
2026-10-09T18:42:35.1852169Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:223)
2026-10-09T18:42:35.1852421Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:175)
2026-10-09T18:42:35.1852678Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:139)
2026-10-09T18:42:35.1852920Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:456)
2026-10-09T18:42:35.1853145Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:169)
2026-10-09T18:42:35.1853389Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:595)
2026-10-09T18:42:35.1853604Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:581)
2026-10-09T18:42:35.1853689Z 
2026-10-09T18:42:35.1955625Z [INFO] Tests run: 48, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.967 s - in br.gov.caixa.siifx.repository.ativofinanceiro.AtivoFinanceiroRepositoryTest
2026-10-09T18:42:35.1957323Z [INFO] Running br.gov.caixa.siifx.repository.ativofinanceiro.ConsultaAtivoFinanceiroRepositoryTest
2026-10-09T18:42:35.2031737Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.004 s - in br.gov.caixa.siifx.repository.ativofinanceiro.ConsultaAtivoFinanceiroRepositoryTest
2026-10-09T18:42:35.2032075Z [INFO] Running br.gov.caixa.siifx.repository.ativofinanceiro.SaldoAnaliticoAtivoFinanceiroRepositoryTest
2026-10-09T18:42:35.3171015Z [INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.11 s - in br.gov.caixa.siifx.repository.ativofinanceiro.SaldoAnaliticoAtivoFinanceiroRepositoryTest
2026-10-09T18:42:35.3171507Z [INFO] Running br.gov.caixa.siifx.repository.ativofinanceiro.TransacaoAtivoFinanceiroRepositoryTest
2026-10-09T18:42:35.3654303Z [INFO] Tests run: 8, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.042 s - in br.gov.caixa.siifx.repository.ativofinanceiro.TransacaoAtivoFinanceiroRepositoryTest
2026-10-09T18:42:35.3654738Z [INFO] Running br.gov.caixa.siifx.repository.contingencia.ContingenciaResgateAplicacaoRepositoryTest
2026-10-09T18:42:35.3699968Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 s - in br.gov.caixa.siifx.repository.contingencia.ContingenciaResgateAplicacaoRepositoryTest
2026-10-09T18:42:35.3700672Z [INFO] Running br.gov.caixa.siifx.repository.desbloqueio.DesbloqueioRepositoryTest
2026-10-09T18:42:35.3850963Z [INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.014 s - in br.gov.caixa.siifx.repository.desbloqueio.DesbloqueioRepositoryTest
2026-10-09T18:42:35.3852644Z [INFO] Running br.gov.caixa.siifx.repository.devolucaoimposto.DevolucaoImpostoRepositoryTest
2026-10-09T18:42:35.3864209Z 2026-10-09 15:42:35,384 INFO  [br.gov.cai.sii.rep.dev.DevolucaoImpostoRepository] (main) [BANCO][LEITURA][SUCESSO] DevolucaoImpostoRepository.verificaNotaResgateVencimentoTrasancao verificada em 0 ms
2026-10-09T18:42:35.3891189Z 2026-10-09 15:42:35,387 INFO  [br.gov.cai.sii.rep.dev.DevolucaoImpostoRepository] (main) [BANCO][LEITURA][SUCESSO] DevolucaoImpostoRepository.listarTransacoesResgateVencimento verificada em 1 ms
2026-10-09T18:42:35.3938499Z 2026-10-09 15:42:35,389 INFO  [br.gov.cai.sii.rep.dev.DevolucaoImpostoRepository] (main) [BANCO][ATUALIZACAO][SUCESSO] DevolucaoImpostoRepository.alteraMovimentoTransacaoDevolveImposto realizada em 0 ms
2026-10-09T18:42:35.3984113Z [INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.008 s - in br.gov.caixa.siifx.repository.devolucaoimposto.DevolucaoImpostoRepositoryTest
2026-10-09T18:42:35.3992671Z [INFO] Running br.gov.caixa.siifx.repository.estorno.TransacaoEstornoRepositoryTest
2026-10-09T18:42:35.5381231Z 2026-10-09 15:42:35,535 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) Erro ao TransacaoEstornoRepository.getCliente. null. Parametros: 123; 65; 1: javax.persistence.NoResultException
2026-10-09T18:42:35.5388536Z 	at br.gov.caixa.siifx.repository.estorno.TransacaoEstornoRepository.getCliente(TransacaoEstornoRepository.java:195)
2026-10-09T18:42:35.5389026Z 	at br.gov.caixa.siifx.repository.estorno.TransacaoEstornoRepositoryTest.getClienteTest(TransacaoEstornoRepositoryTest.java:365)
2026-10-09T18:42:35.5390006Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-09T18:42:35.5390686Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-10-09T18:42:35.5391049Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-10-09T18:42:35.5391276Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-10-09T18:42:35.5391598Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
2026-10-09T18:42:35.5391998Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-10-09T18:42:35.5392694Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-10-09T18:42:35.5393300Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-10-09T18:42:35.5393508Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-10-09T18:42:35.5393768Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-10-09T18:42:35.5394062Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-10-09T18:42:35.5394362Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-10-09T18:42:35.5394655Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-10-09T18:42:35.5394930Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-10-09T18:42:35.5395237Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-10-09T18:42:35.5395495Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-10-09T18:42:35.5395750Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-10-09T18:42:35.5396014Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-10-09T18:42:35.5396278Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:217)
2026-10-09T18:42:35.5396541Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.5396807Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:213)
2026-10-09T18:42:35.5397225Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:138)
2026-10-09T18:42:35.5397514Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:68)
2026-10-09T18:42:35.5397737Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-10-09T18:42:35.5398098Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.5398356Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:35.5398607Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:35.5398837Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:35.5399156Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.5399411Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:35.5399655Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:35.5399891Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:35.5400366Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:35.5400682Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:35.5400926Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.5401165Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:35.5401602Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:35.5401833Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:35.5402077Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.5402392Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:35.5402737Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:35.5403172Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:35.5403424Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:35.5403698Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:35.5404110Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.5404364Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:35.5404596Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:35.5404999Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:35.5405297Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.5405507Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:35.5405749Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:35.5406141Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-10-09T18:42:35.5406434Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-10-09T18:42:35.5406695Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-10-09T18:42:35.5406947Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)
2026-10-09T18:42:35.5407194Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)
2026-10-09T18:42:35.5407446Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)
2026-10-09T18:42:35.5408101Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)
2026-10-09T18:42:35.5408446Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)
2026-10-09T18:42:35.5409045Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)
2026-10-09T18:42:35.5409283Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
2026-10-09T18:42:35.5409513Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
2026-10-09T18:42:35.5409718Z 	at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
2026-10-09T18:42:35.5409956Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:55)
2026-10-09T18:42:35.5410430Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:223)
2026-10-09T18:42:35.5410707Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:175)
2026-10-09T18:42:35.5411066Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:139)
2026-10-09T18:42:35.5411307Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:456)
2026-10-09T18:42:35.5411609Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:169)
2026-10-09T18:42:35.5411827Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:595)
2026-10-09T18:42:35.5412041Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:581)
2026-10-09T18:42:35.5412120Z 
2026-10-09T18:42:35.5412690Z 2026-10-09 15:42:35,536 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) Erro ao TransacaoEstornoRepository.getCliente. null. Parametros: 123; 65; 1: java.lang.RuntimeException
2026-10-09T18:42:35.5412820Z 
2026-10-09T18:42:35.6512081Z 2026-10-09 15:42:35,646 INFO  [br.gov.cai.sii.rep.est.TransacaoEstornoRepository] (main) [BANCO][LEITURA][SUCESSO] TransacaoEstornoRepository.getDadosAtivoFinanceiro verificada em 1 ms
2026-10-09T18:42:35.6517735Z 2026-10-09 15:42:35,648 ERROR [br.gov.cai.sii.rep.est.TransacaoEstornoRepository] (main) [BANCO][LEITURA][ERRO] Erro ao TransacaoEstornoRepository.getDadosAtivoFinanceiro. 123, SQL:  SELECT  IAF.NU_PRODUTO_RENDA_FIXA_010,  IAF.NU_MDLDE_PRDTO_RENDA_FIXA_010,  MP.NO_MODALIDADE_PRDTO_RENDA_FIXA,  IAF.NU_CONTRATO_ATIVO,  IAF.CO_ATIVO_CETIP,  IAF.CO_SWAP,  PR.IC_NATUREZA_PRODUTO_RENDA_FIXA,  IAF.VR_EMISSAO_ATIVO,  IAF.DT_REFERENCIA_ATIVO_APLCO,  IAF.PZ_ATIVO_APLICACAO_PRODUTO,  IAF.DT_VENCIMENTO_ATIVO,  MP.IC_TIPO_RESGATE_MODALIDADE,  IAF.SG_UF_UNIDADE_DEPOSITO,  IAF.NU_PRODUTO_DEPOSITO_ATIVO,  IAF.NU_CONTA_DEPOSITO_ATIVO,  IAF.NU_DV_DEPOSITO_ATIVO ,  IAF.NU_SITUACAO_ATIVO_RENDA_FIXA,  IAF.NU_MOTIVO_ATIVO_RENDA_FIXA,  IAF.NU_UNIDADE_ATIVO  FROM  IFX.IFXTB092_ATIVO_FINANCEIRO IAF  INNER JOIN  IFX.IFXTB010_MODALIDADE_PRODUTO MP ON  IAF.NU_PRODUTO_RENDA_FIXA_010 = MP.NU_PRODUTO_RENDA_FIXA  AND IAF.NU_MDLDE_PRDTO_RENDA_FIXA_010 = MP.NU_MODALIDADE_PRDTO_RENDA_FIXA  INNER JOIN  IFX.IFXTB008_PRODUTO_RENDA_FIXA PR ON  PR.NU_PRODUTO_RENDA_FIXA = IAF.NU_PRODUTO_RENDA_FIXA_010  WHERE  IAF.NU_CONTRATO_ATIVO =:notaAplicacao , Exception: null: javax.persistence.NoResultException
2026-10-09T18:42:35.6519019Z 	at br.gov.caixa.siifx.repository.estorno.TransacaoEstornoRepository.getDadosAtivoFinanceiro(TransacaoEstornoRepository.java:337)
2026-10-09T18:42:35.6519321Z 	at br.gov.caixa.siifx.repository.estorno.TransacaoEstornoRepositoryTest.getDadosAtivoFinanceiroTest(TransacaoEstornoRepositoryTest.java:266)
2026-10-09T18:42:35.6519598Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-09T18:42:35.6520163Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-10-09T18:42:35.6520427Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-10-09T18:42:35.6521030Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-10-09T18:42:35.6521324Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
2026-10-09T18:42:35.6521985Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-10-09T18:42:35.6523010Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-10-09T18:42:35.6525294Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-10-09T18:42:35.6525520Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-10-09T18:42:35.6525902Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-10-09T18:42:35.6526183Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-10-09T18:42:35.6526651Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-10-09T18:42:35.6526933Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-10-09T18:42:35.6527201Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-10-09T18:42:35.6527459Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-10-09T18:42:35.6527731Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-10-09T18:42:35.6528050Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-10-09T18:42:35.6528339Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-10-09T18:42:35.6528613Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:217)
2026-10-09T18:42:35.6528884Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.6529144Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:213)
2026-10-09T18:42:35.6529407Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:138)
2026-10-09T18:42:35.6529660Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:68)
2026-10-09T18:42:35.6529931Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-10-09T18:42:35.6531849Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.6532301Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:35.6532683Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:35.6532922Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:35.6533190Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.6533442Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:35.6533696Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:35.6533947Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:35.6534250Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:35.6535283Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:35.6535629Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.6535896Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:35.6536146Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:35.6536355Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:35.6536607Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.6536886Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:35.6537407Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:35.6537645Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:35.6537977Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:35.6538304Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:35.6538561Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.6538818Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:35.6539413Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:35.6539648Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:35.6540243Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.6540619Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:35.6540857Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:35.6541135Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-10-09T18:42:35.6541561Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-10-09T18:42:35.6541833Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-10-09T18:42:35.6542095Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)
2026-10-09T18:42:35.6542367Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)
2026-10-09T18:42:35.6542621Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)
2026-10-09T18:42:35.6542882Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)
2026-10-09T18:42:35.6543157Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)
2026-10-09T18:42:35.6543475Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)
2026-10-09T18:42:35.6543868Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
2026-10-09T18:42:35.6544094Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
2026-10-09T18:42:35.6544436Z 	at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
2026-10-09T18:42:35.6545113Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:55)
2026-10-09T18:42:35.6545356Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:223)
2026-10-09T18:42:35.6546481Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:175)
2026-10-09T18:42:35.6546943Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:139)
2026-10-09T18:42:35.6547237Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:456)
2026-10-09T18:42:35.6547472Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:169)
2026-10-09T18:42:35.6547746Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:595)
2026-10-09T18:42:35.6547985Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:581)
2026-10-09T18:42:35.6548156Z 
2026-10-09T18:42:35.6549758Z 2026-10-09 15:42:35,649 ERROR [br.gov.cai.sii.rep.est.TransacaoEstornoRepository] (main) [BANCO][LEITURA][ERRO] Erro ao TransacaoEstornoRepository.getDadosAtivoFinanceiro. 123, SQL:  SELECT  IAF.NU_PRODUTO_RENDA_FIXA_010,  IAF.NU_MDLDE_PRDTO_RENDA_FIXA_010,  MP.NO_MODALIDADE_PRDTO_RENDA_FIXA,  IAF.NU_CONTRATO_ATIVO,  IAF.CO_ATIVO_CETIP,  IAF.CO_SWAP,  PR.IC_NATUREZA_PRODUTO_RENDA_FIXA,  IAF.VR_EMISSAO_ATIVO,  IAF.DT_REFERENCIA_ATIVO_APLCO,  IAF.PZ_ATIVO_APLICACAO_PRODUTO,  IAF.DT_VENCIMENTO_ATIVO,  MP.IC_TIPO_RESGATE_MODALIDADE,  IAF.SG_UF_UNIDADE_DEPOSITO,  IAF.NU_PRODUTO_DEPOSITO_ATIVO,  IAF.NU_CONTA_DEPOSITO_ATIVO,  IAF.NU_DV_DEPOSITO_ATIVO ,  IAF.NU_SITUACAO_ATIVO_RENDA_FIXA,  IAF.NU_MOTIVO_ATIVO_RENDA_FIXA,  IAF.NU_UNIDADE_ATIVO  FROM  IFX.IFXTB092_ATIVO_FINANCEIRO IAF  INNER JOIN  IFX.IFXTB010_MODALIDADE_PRODUTO MP ON  IAF.NU_PRODUTO_RENDA_FIXA_010 = MP.NU_PRODUTO_RENDA_FIXA  AND IAF.NU_MDLDE_PRDTO_RENDA_FIXA_010 = MP.NU_MODALIDADE_PRDTO_RENDA_FIXA  INNER JOIN  IFX.IFXTB008_PRODUTO_RENDA_FIXA PR ON  PR.NU_PRODUTO_RENDA_FIXA = IAF.NU_PRODUTO_RENDA_FIXA_010  WHERE  IAF.NU_CONTRATO_ATIVO =:notaAplicacao , Exception: null: java.lang.RuntimeException
2026-10-09T18:42:35.6550680Z 
2026-10-09T18:42:35.6574148Z 2026-10-09 15:42:35,655 INFO  [br.gov.cai.sii.rep.est.TransacaoEstornoRepository] (main) [BANCO][LEITURA][SUCESSO] TransacaoEstornoRepository.getTransacaoEstorno verificada em 4 ms
2026-10-09T18:42:35.6577809Z 2026-10-09 15:42:35,655 ERROR [br.gov.cai.sii.rep.est.TransacaoEstornoRepository] (main) [BANCO][LEITURA][ERRO] Erro ao TransacaoEstornoRepository.getTransacaoEstorno. [123, 123], SQL:  SELECT  IMT.TS_TRANSACAO_MOVIMENTO AS DTMOVIMENTO,  IMT.TS_TRANSACAO_MVMTO_REFERENCIA AS DTREFERENCIA,  IMT.NU_NSU_TRANSACAO_APLICACAO AS NSUTRANSACAO,  IMT.NU_SEQUENCIA_TRANSACAO_PRPSA AS SEQEUENCIALTRANSACAO,  IMT.CO_MOVIMENTACAO_RENDA_FIXA AS NOTATRANSCAO,  IMT.NU_PRODUTO_RENDA_FIXA AS COPRODUTO,  IMT.NU_MODALIDADE_PRDTO_RENDA_FIXA AS NUMODALIDADE,  IMT.NU_CONTRATO_ATIVO_092 AS NOTAAPLICACAO ,  IMT.IC_TIPO_NOTA_TRANSACAO AS TIPONOTATRANSACAO,  IMT.IC_ASSINATURA_TRANSACAO AS ASSINATURACLIENTE ,  IMT.NU_CANAL_ORIGEM AS CODIGOCANAL,  IMT.NU_SEGMENTO_ORIGEM AS SISTEMAORIGEM,  IMT.NU_NSU_ORIGEM AS NSUSISTEMAORIGEM,  IMT.NU_NSU_INTERMEDIARIO AS NSUSISTEMAINTERMEDIARIO,  IMT.NU_UNIDADE_ORIGEM AS UNIDADEORIGEM,  IMT.IC_CPF_CNPJ AS TIPOPESSOA,  IMT.CO_CPF_CNPJ_CLIENTE AS NU_CPF_CNPJ,  IMT.VR_TRANSACAO_RENDA_FIXA AS VALORTRANSACAO,  IAF.NU_UNIDADE_DEPOSITO_ATIVO AS UNIDADE_DEPOSITO,  IAF.NU_PRODUTO_DEPOSITO_ATIVO AS PRODUTO_DEPOSITO,  IAF.NU_CONTA_DEPOSITO_ATIVO AS CONTA_DEPOSITO,  IAF.NU_DV_DEPOSITO_ATIVO AS DIGITO_DEPOSITO,  IMT.VR_DEPOSITO_RENDA_FIXA AS VR_DEPOSITO,  IMT.NU_NSU_BARRAMENTO AS NSU_BARRAMENTO,  IMT.NU_NSU_DEPOSITO_TRANSACAO AS NSU_DEPOSITO_TRANSACAO,  IMT.CO_USUARIO AS OPERADOR ,  IMT.NU_SITUACAO_TRANSACAO_RENDA AS CO_SITUACAO_TRANSACAO,  IST.NO_SITUACAO_TRANSACAO_RENDA AS DESCRICAO_SITUACAO,  IMT.CO_ALCADA_APLICACAO_PRODUTO AS CO_ALCADA ,  IMT.CO_ACAO_TRANSACAO AS ACAO,  IMT.CO_COMANDO_TRANSACAO AS COMANDO,  imt.CO_ANTECEDENTE_TRANSACAO AS CO_ANTECEDENTE,  IMT.NU_SEGMENTO_INTERMEDIARIO,  IMT.CO_TERMINAL_TRANSACAO,  TRF.NO_TRANSACAO_COMPLETA descricao_transacao  FROM  IFX.IFXTB094_MOVIMENTO_TRANSACAO IMT  INNER JOIN  IFX.IFXTB092_ATIVO_FINANCEIRO IAF ON  IMT.NU_CONTRATO_ATIVO_092 = IAF.NU_CONTRATO_ATIVO  AND IAF.NU_PRODUTO_RENDA_FIXA_010 = IMT.NU_PRODUTO_RENDA_FIXA  AND IMT.NU_MODALIDADE_PRDTO_RENDA_FIXA = IAF.NU_MDLDE_PRDTO_RENDA_FIXA_010  INNER JOIN  IFX.IFXTB037_SITUACAO_TRANSACAO IST ON  IST.NU_SITUACAO_TRANSACAO_RENDA = IMT.NU_SITUACAO_TRANSACAO_RENDA  INNER JOIN  IFX.IFXTB033_TRANSACAO_RENDA_FIXA TRF ON TRF.CO_ACAO_TRANSACAO = IMT.CO_ACAO_TRANSACAO  AND TRF.CO_COMANDO_TRANSACAO = IMT.CO_COMANDO_TRANSACAO AND TRF.CO_ANTECEDENTE_TRANSACAO = IMT.CO_ANTECEDENTE_TRANSACAO  WHERE  IAF.NU_CONTRATO_ATIVO =:notaAplicacao  AND CO_MOVIMENTACAO_RENDA_FIXA =:notaTransacao , Exception: null: java.lang.RuntimeException
2026-10-09T18:42:35.6580147Z 
2026-10-09T18:42:35.6686918Z [INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.266 s - in br.gov.caixa.siifx.repository.estorno.TransacaoEstornoRepositoryTest
2026-10-09T18:42:35.6701538Z [INFO] Running br.gov.caixa.siifx.repository.estornoresgate.TransacaoEstornoResgateRepositoryTest
2026-10-09T18:42:35.6908385Z 2026-10-09 15:42:35,689 INFO  [br.gov.cai.sii.rep.est.TransacaoEstornoResgateRepository] (main) [BANCO][LEITURA][SUCESSO] TransacaoEstornoResgateRepository.getDadosTransacaoSequencial verificada em 1 ms
2026-10-09T18:42:35.6973582Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.022 s - in br.gov.caixa.siifx.repository.estornoresgate.TransacaoEstornoResgateRepositoryTest
2026-10-09T18:42:35.6974323Z [INFO] Running br.gov.caixa.siifx.repository.historico.HistoricoIsencaoImunidadePanacheRepositoryTest
2026-10-09T18:42:35.7023763Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.003 s - in br.gov.caixa.siifx.repository.historico.HistoricoIsencaoImunidadePanacheRepositoryTest
2026-10-09T18:42:35.7024133Z [INFO] Running br.gov.caixa.siifx.repository.openfinance.OpenFinanceRepositoryTest
2026-10-09T18:42:35.7082071Z 2026-10-09 15:42:35,701 INFO  [br.gov.cai.sii.rep.ope.OpenFinanceRepository] (main) [OPENFINANCE][ID ] notaAplicacao:  encontrada transacoes
2026-10-09T18:42:35.7082573Z 2026-10-09 15:42:35,702 INFO  [br.gov.cai.sii.rep.ope.OpenFinanceRepository] (main) [BANCO][LEITURA][SUCESSO] OpenFinanceRepository.buscaDadosTransacoesTransactions verificada em 1 ms
2026-10-09T18:42:35.7082945Z 2026-10-09 15:42:35,702 INFO  [br.gov.cai.sii.rep.ope.OpenFinanceRepository] (main) [OPENFINANCE][ID ] notaAplicacao:  encontrada transacoes
2026-10-09T18:42:35.7083351Z 2026-10-09 15:42:35,702 INFO  [br.gov.cai.sii.rep.ope.OpenFinanceRepository] (main) [BANCO][LEITURA][SUCESSO] OpenFinanceRepository.buscaDadosTransacoesTransactions verificada em 0 ms
2026-10-09T18:42:35.7083711Z 2026-10-09 15:42:35,702 INFO  [br.gov.cai.sii.rep.ope.OpenFinanceRepository] (main) [OPENFINANCE][ID ] notaAplicacao:  encontrada transacoes
2026-10-09T18:42:35.7084111Z 2026-10-09 15:42:35,702 INFO  [br.gov.cai.sii.rep.ope.OpenFinanceRepository] (main) [BANCO][LEITURA][SUCESSO] OpenFinanceRepository.buscaDadosTransacoesTransactions verificada em 0 ms
2026-10-09T18:42:35.7084464Z 2026-10-09 15:42:35,702 INFO  [br.gov.cai.sii.rep.ope.OpenFinanceRepository] (main) [OPENFINANCE][ID ] notaAplicacao:  encontrada transacoes
2026-10-09T18:42:35.7084967Z 2026-10-09 15:42:35,702 INFO  [br.gov.cai.sii.rep.ope.OpenFinanceRepository] (main) [BANCO][LEITURA][SUCESSO] OpenFinanceRepository.buscaDadosTransacoesTransactions verificada em 0 ms
2026-10-09T18:42:35.7085358Z 2026-10-09 15:42:35,703 INFO  [br.gov.cai.sii.rep.ope.OpenFinanceRepository] (main) [OPENFINANCE][ID ] notaAplicacao:  não encontrada transacoes
2026-10-09T18:42:35.7085802Z 2026-10-09 15:42:35,704 ERROR [br.gov.cai.sii.rep.ope.OpenFinanceRepository] (main) [BANCO][LEITURA][ERRO] Erro ao OpenFinanceRepository.buscaDadosTransacoesTransactions. [], SQL: null, Exception: null: javax.persistence.NoResultException
2026-10-09T18:42:35.7086357Z 	at br.gov.caixa.siifx.repository.openfinance.OpenFinanceRepository.buscaDadosTransacoesTransactions(OpenFinanceRepository.java:151)
2026-10-09T18:42:35.7086658Z 	at br.gov.caixa.siifx.repository.openfinance.OpenFinanceRepositoryTest.lambda$buscaDadosTransacoesTransactionsTest$3(OpenFinanceRepositoryTest.java:112)
2026-10-09T18:42:35.7086924Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:53)
2026-10-09T18:42:35.7087182Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:35)
2026-10-09T18:42:35.7087362Z 	at org.junit.jupiter.api.Assertions.assertThrows(Assertions.java:3083)
2026-10-09T18:42:35.7087635Z 	at br.gov.caixa.siifx.repository.openfinance.OpenFinanceRepositoryTest.buscaDadosTransacoesTransactionsTest(OpenFinanceRepositoryTest.java:111)
2026-10-09T18:42:35.7087917Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-09T18:42:35.7088207Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-10-09T18:42:35.7088454Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-10-09T18:42:35.7088682Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-10-09T18:42:35.7088898Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
2026-10-09T18:42:35.7089132Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-10-09T18:42:35.7089405Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-10-09T18:42:35.7089666Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-10-09T18:42:35.7089940Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-10-09T18:42:35.7090670Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-10-09T18:42:35.7090916Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-10-09T18:42:35.7091213Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-10-09T18:42:35.7091570Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-10-09T18:42:35.7091843Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-10-09T18:42:35.7092105Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-10-09T18:42:35.7092371Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-10-09T18:42:35.7092778Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-10-09T18:42:35.7093041Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-10-09T18:42:35.7093266Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:217)
2026-10-09T18:42:35.7093532Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.7093788Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:213)
2026-10-09T18:42:35.7094083Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:138)
2026-10-09T18:42:35.7094339Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:68)
2026-10-09T18:42:35.7094656Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-10-09T18:42:35.7094908Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.7095175Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:35.7095408Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:35.7095640Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:35.7095879Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.7096132Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:35.7096415Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:35.7096628Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:35.7096880Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:35.7097303Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:35.7097617Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.7097866Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:35.7098105Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:35.7098358Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:35.7098615Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.7098865Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:35.7099112Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:35.7099327Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:35.7099602Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:35.7099880Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:35.7100453Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.7100727Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:35.7100982Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:35.7101213Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:35.7101516Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.7101795Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:35.7102175Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:35.7102546Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-10-09T18:42:35.7102974Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-10-09T18:42:35.7103435Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-10-09T18:42:35.7103803Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)
2026-10-09T18:42:35.7104120Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)
2026-10-09T18:42:35.7104373Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)
2026-10-09T18:42:35.7104631Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)
2026-10-09T18:42:35.7104859Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)
2026-10-09T18:42:35.7105145Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)
2026-10-09T18:42:35.7105383Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
2026-10-09T18:42:35.7105670Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
2026-10-09T18:42:35.7105912Z 	at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
2026-10-09T18:42:35.7106212Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:55)
2026-10-09T18:42:35.7106449Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:223)
2026-10-09T18:42:35.7106701Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:175)
2026-10-09T18:42:35.7106953Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:139)
2026-10-09T18:42:35.7107218Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:456)
2026-10-09T18:42:35.7107458Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:169)
2026-10-09T18:42:35.7107678Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:595)
2026-10-09T18:42:35.7107854Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:581)
2026-10-09T18:42:35.7107971Z 
2026-10-09T18:42:35.7108353Z 2026-10-09 15:42:35,705 INFO  [br.gov.cai.sii.rep.ope.OpenFinanceRepository] (main) [OPENFINANCE][ID ] notaAplicacao:  não encontrada transacoes
2026-10-09T18:42:35.7108797Z 2026-10-09 15:42:35,705 ERROR [br.gov.cai.sii.rep.ope.OpenFinanceRepository] (main) [BANCO][LEITURA][ERRO] Erro ao OpenFinanceRepository.buscaDadosTransacoesTransactions. [], SQL: null, Exception: null: javax.persistence.NoResultException
2026-10-09T18:42:35.7109133Z 	at br.gov.caixa.siifx.repository.openfinance.OpenFinanceRepository.buscaDadosTransacoesTransactions(OpenFinanceRepository.java:151)
2026-10-09T18:42:35.7109432Z 	at br.gov.caixa.siifx.repository.openfinance.OpenFinanceRepositoryTest.lambda$buscaDadosTransacoesTransactionsTest$4(OpenFinanceRepositoryTest.java:118)
2026-10-09T18:42:35.7109735Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:53)
2026-10-09T18:42:35.7109910Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:35)
2026-10-09T18:42:35.7110273Z 	at org.junit.jupiter.api.Assertions.assertThrows(Assertions.java:3083)
2026-10-09T18:42:35.7110535Z 	at br.gov.caixa.siifx.repository.openfinance.OpenFinanceRepositoryTest.buscaDadosTransacoesTransactionsTest(OpenFinanceRepositoryTest.java:117)
2026-10-09T18:42:35.7110782Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-09T18:42:35.7110995Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-10-09T18:42:35.7111238Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-10-09T18:42:35.7111523Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-10-09T18:42:35.7111798Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
2026-10-09T18:42:35.7112071Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-10-09T18:42:35.7112326Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-10-09T18:42:35.7112578Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-10-09T18:42:35.7112824Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-10-09T18:42:35.7113036Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-10-09T18:42:35.7113312Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-10-09T18:42:35.7113598Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-10-09T18:42:35.7113913Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-10-09T18:42:35.7114185Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-10-09T18:42:35.7114459Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-10-09T18:42:35.7114706Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-10-09T18:42:35.7114995Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-10-09T18:42:35.7115250Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-10-09T18:42:35.7115520Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:217)
2026-10-09T18:42:35.7115790Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.7116055Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:213)
2026-10-09T18:42:35.7116318Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:138)
2026-10-09T18:42:35.7116590Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:68)
2026-10-09T18:42:35.7116814Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-10-09T18:42:35.7117066Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.7117317Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:35.7117559Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:35.7117816Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:35.7118065Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.7118324Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:35.7118567Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:35.7118807Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:35.7119062Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:35.7119378Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:35.7119624Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.7119869Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:35.7120065Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:35.7120310Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:35.7120558Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.7120802Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:35.7121068Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:35.7121317Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:35.7121626Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:35.7121912Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:35.7122175Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.7122421Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:35.7122657Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:35.7122888Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:35.7123153Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:35.7123366Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:35.7123669Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:35.7123940Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-10-09T18:42:35.7124242Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-10-09T18:42:35.7124511Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-10-09T18:42:35.7124818Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)
2026-10-09T18:42:35.7125173Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)
2026-10-09T18:42:35.7125567Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)
2026-10-09T18:42:35.7125933Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)
2026-10-09T18:42:35.7126205Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)
2026-10-09T18:42:35.7126467Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)
2026-10-09T18:42:35.7126712Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
2026-10-09T18:42:35.7126941Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
2026-10-09T18:42:35.7127147Z 	at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
2026-10-09T18:42:35.7127486Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:55)
2026-10-09T18:42:35.7127721Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:223)
2026-10-09T18:42:35.7127977Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:175)
2026-10-09T18:42:35.7128257Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:139)
2026-10-09T18:42:35.7128494Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:456)
2026-10-09T18:42:35.7128735Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:169)
2026-10-09T18:42:35.7128952Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:595)
2026-10-09T18:42:35.7129166Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:581)
2026-10-09T18:42:35.7129246Z 
2026-10-09T18:42:35.7129642Z 2026-10-09 15:42:35,708 INFO  [br.gov.cai.sii.rep.ope.OpenFinanceRepository] (main) [OPENFINANCE][ID ] notaAplicacao:  encontrada
2026-10-09T18:42:35.7130023Z 2026-10-09 15:42:35,708 INFO  [br.gov.cai.sii.rep.ope.OpenFinanceRepository] (main) [BANCO][LEITURA][SUCESSO] OpenFinanceRepository.buscaDadosNotaBalance verificada em 0 ms
2026-10-09T18:42:35.7130383Z 2026-10-09 15:42:35,708 INFO  [br.gov.cai.sii.rep.ope.OpenFinanceRepository] (main) [OPENFINANCE][ID ] notaAplicacao:  não encontrada
2026-10-09T18:42:35.7130850Z 2026-10-09 15:42:35,709 ERROR [br.gov.cai.sii.rep.ope.OpenFinanceRepository] (main) [BANCO][LEITURA][ERRO] Erro ao OpenFinanceRepository.buscaDadosNotaBalance. [], SQL: null, Exception: null: javax.persistence.NoResultException
2026-10-09T18:42:35.7130998Z 
2026-10-09T18:42:35.7131301Z 2026-10-09 15:42:35,710 INFO  [br.gov.cai.sii.rep.ope.OpenFinanceRepository] (main) [OPENFINANCE][ID ] notaAplicacao:  encontrada
2026-10-09T18:42:35.7131812Z 2026-10-09 15:42:35,710 INFO  [br.gov.cai.sii.rep.ope.OpenFinanceRepository] (main) [BANCO][LEITURA][SUCESSO] OpenFinanceRepository.buscaDadosNotaTransactions verificada em 0 ms
2026-10-09T18:42:35.7132198Z 2026-10-09 15:42:35,711 INFO  [br.gov.cai.sii.rep.ope.OpenFinanceRepository] (main) [OPENFINANCE][ID ] notaAplicacao:  não encontrada
2026-10-09T18:42:35.7132622Z 2026-10-09 15:42:35,711 ERROR [br.gov.cai.sii.rep.ope.OpenFinanceRepository] (main) [BANCO][LEITURA][ERRO] Erro ao OpenFinanceRepository.buscaDadosNotaTransactions. [], SQL: null, Exception: null: javax.persistence.NoResultException
2026-10-09T18:42:35.7132809Z 
2026-10-09T18:42:35.7147488Z 2026-10-09 15:42:35,713 INFO  [br.gov.cai.sii.rep.ope.OpenFinanceRepository] (main) [OPENFINANCE][ID ] notaAplicacao:  encontrada
2026-10-09T18:42:35.7148001Z 2026-10-09 15:42:35,713 INFO  [br.gov.cai.sii.rep.ope.OpenFinanceRepository] (main) [BANCO][LEITURA][SUCESSO] OpenFinanceRepository.buscaDadosNotaIdentifica verificada em 1 ms
2026-10-09T18:42:35.7148411Z 2026-10-09 15:42:35,713 INFO  [br.gov.cai.sii.rep.ope.OpenFinanceRepository] (main) [OPENFINANCE][ID ] notaAplicacao:  não encontrada
2026-10-09T18:42:35.7149009Z 2026-10-09 15:42:35,714 ERROR [br.gov.cai.sii.rep.ope.OpenFinanceRepository] (main) [BANCO][LEITURA][ERRO] Erro ao OpenFinanceRepository.buscaDadosNotaIdentifica. [], SQL: null, Exception: null: javax.persistence.NoResultException
2026-10-09T18:42:35.7149209Z 
2026-10-09T18:42:35.7197253Z [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.015 s - in br.gov.caixa.siifx.repository.openfinance.OpenFinanceRepositoryTest
2026-10-09T18:42:35.7198200Z [INFO] Running br.gov.caixa.siifx.repository.openfinance.ProdutctListRepositoryTest
2026-10-09T18:42:35.7199465Z 2026-10-09 15:42:35,718 INFO  [br.gov.cai.sii.rep.ope.ProdutctListRepository] (main) [BANCO][LEITURA][SUCESSO] ProdutctListRepository.consultaPorCpfCnpj verificada em 0 ms
2026-10-09T18:42:35.7200123Z 2026-10-09 15:42:35,719 ERROR [br.gov.cai.sii.rep.ope.ProdutctListRepository] (main) [BANCO][LEITURA][ERRO] Erro ao ProdutctListRepository.consultaPorCpfCnpj. [], SQL: null, Exception: null
2026-10-09T18:42:35.7246507Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.003 s - in br.gov.caixa.siifx.repository.openfinance.ProdutctListRepositoryTest
2026-10-09T18:42:35.7247006Z [INFO] Running br.gov.caixa.siifx.repository.propostamarca.PropostaMarcaRepositoryTest
2026-10-09T18:42:35.7340964Z [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.007 s - in br.gov.caixa.siifx.repository.propostamarca.PropostaMarcaRepositoryTest
2026-10-09T18:42:35.7352516Z [INFO] Running br.gov.caixa.siifx.repository.transacao.ConsultaTransacoesRepositoryTest
2026-10-09T18:42:36.1619610Z 2026-10-09 15:42:36,153 INFO  [br.gov.cai.sii.rep.tra.ConsultaTransacoesRepository] (main) Inicio metodo consultaProximosVencimentos: 1791571356153
2026-10-09T18:42:36.1620195Z 2026-10-09 15:42:36,160 INFO  [br.gov.cai.sii.rep.tra.ConsultaTransacoesRepository] (main) Fim metodo consultaProximosVencimentos: 7
2026-10-09T18:42:36.4680359Z 2026-10-09 15:42:36,459 INFO  [br.gov.cai.sii.rep.tra.ConsultaTransacoesRepository] (main) Inicio metodo consultaTransacao: 1791571356459
2026-10-09T18:42:36.4680741Z 2026-10-09 15:42:36,465 INFO  [br.gov.cai.sii.rep.tra.ConsultaTransacoesRepository] (main) Fim metodo consultaTransacao: 6
2026-10-09T18:42:36.4681197Z 2026-10-09 15:42:36,466 INFO  [br.gov.cai.sii.rep.tra.ConsultaTransacoesRepository] (main) Inicio metodo consultaTransacao: 1791571356466
2026-10-09T18:42:36.4681581Z 2026-10-09 15:42:36,466 INFO  [br.gov.cai.sii.rep.tra.ConsultaTransacoesRepository] (main) Fim metodo consultaTransacao: 0
2026-10-09T18:42:36.4921485Z 2026-10-09 15:42:36,488 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) Erro ao ConsultaTransacoesRepository.buscarMotivosAlcadaPorSubquery. Database error. Parametros: ParametrosConsultaTransacaoPendenteAlcadaDTO(codigoCanalOrigem=1, codigoSistemaOrigem=1, nsuSistemaOrigem=1, codigoSistemaIntermediario=1, nsuSistemaIntermediario=1, codigoAcaoTransacao=1, codigoComandoTransacao=1, codigoAntecedenteTransacao=1, dataMovimento=Fri Oct 09 15:42:36 BRT 2026, tipoPessoa=1, cpfCnpj=1, cnpjAlfanumerico=null, codigoAcao=1, codigoComando=1, codigoAntecedente=1, unidadeAtivo=1, notaAplicacao=1, notaTransacao=null, operador=1, terminal=1, situacaoAtivo=null). SQL: erro ao consultar motivos (native/dynamic): java.lang.RuntimeException: Database error
2026-10-09T18:42:36.4922366Z 	at br.gov.caixa.siifx.repository.transacao.ConsultaTransacoesRepository.buscarMotivosAlcadaPorSubquery(ConsultaTransacoesRepository.java:2004)
2026-10-09T18:42:36.4922695Z 	at br.gov.caixa.siifx.repository.transacao.ConsultaTransacoesRepositoryTest.lambda$testBuscarMotivosAlcadaPorSubquery_Error$17(ConsultaTransacoesRepositoryTest.java:1248)
2026-10-09T18:42:36.4923168Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:53)
2026-10-09T18:42:36.4923555Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:35)
2026-10-09T18:42:36.4923768Z 	at org.junit.jupiter.api.Assertions.assertThrows(Assertions.java:3083)
2026-10-09T18:42:36.4924049Z 	at br.gov.caixa.siifx.repository.transacao.ConsultaTransacoesRepositoryTest.testBuscarMotivosAlcadaPorSubquery_Error(ConsultaTransacoesRepositoryTest.java:1247)
2026-10-09T18:42:36.4924314Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-09T18:42:36.4924535Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-10-09T18:42:36.4924781Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-10-09T18:42:36.4925016Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-10-09T18:42:36.4925197Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
2026-10-09T18:42:36.4925434Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-10-09T18:42:36.4925715Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-10-09T18:42:36.4926226Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-10-09T18:42:36.4926476Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-10-09T18:42:36.4926728Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-10-09T18:42:36.4927012Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-10-09T18:42:36.4927321Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-10-09T18:42:36.4927603Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-10-09T18:42:36.4927864Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-10-09T18:42:36.4928198Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-10-09T18:42:36.4928450Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-10-09T18:42:36.4928706Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-10-09T18:42:36.4928961Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-10-09T18:42:36.4929189Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:217)
2026-10-09T18:42:36.4929470Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.4929726Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:213)
2026-10-09T18:42:36.4929991Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:138)
2026-10-09T18:42:36.4930239Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:68)
2026-10-09T18:42:36.4930609Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-10-09T18:42:36.4930872Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.4931122Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:36.4931362Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:36.4931674Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:36.4931927Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.4932174Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:36.4932417Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:36.4932596Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:36.4932871Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:36.4933153Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:36.4933406Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.4933662Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:36.4933940Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:36.4934173Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:36.4934426Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.4934669Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:36.4934927Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:36.4935135Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:36.4935398Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:36.4935676Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:36.4935918Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.4936158Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:36.4936386Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:36.4936614Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:36.4936858Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.4937127Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:36.4937376Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:36.4937645Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-10-09T18:42:36.4937933Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-10-09T18:42:36.4938187Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-10-09T18:42:36.4938431Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)
2026-10-09T18:42:36.4938672Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)
2026-10-09T18:42:36.4938986Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)
2026-10-09T18:42:36.4939203Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)
2026-10-09T18:42:36.4939496Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)
2026-10-09T18:42:36.4939765Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)
2026-10-09T18:42:36.4940023Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
2026-10-09T18:42:36.4940248Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
2026-10-09T18:42:36.4940487Z 	at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
2026-10-09T18:42:36.4940725Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:55)
2026-10-09T18:42:36.4940955Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:223)
2026-10-09T18:42:36.4941208Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:175)
2026-10-09T18:42:36.4941581Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:139)
2026-10-09T18:42:36.4941820Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:456)
2026-10-09T18:42:36.4942043Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:169)
2026-10-09T18:42:36.4942256Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:595)
2026-10-09T18:42:36.4942432Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:581)
2026-10-09T18:42:36.4942547Z 
2026-10-09T18:42:36.6050206Z 2026-10-09 15:42:36,601 INFO  [br.gov.cai.sii.rep.tra.ConsultaTransacoesRepository] (main) Inicio metodo consultaTransacao: 1791571356601
2026-10-09T18:42:36.6050756Z 2026-10-09 15:42:36,603 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) Erro ao ConsultaTransacoesRepository.consultaTransacao. mocked RuntimeException. Parametros: null: java.lang.RuntimeException: mocked RuntimeException
2026-10-09T18:42:36.6051530Z 	at br.gov.caixa.siifx.repository.transacao.ConsultaTransacoesRepository.consultaTransacao(ConsultaTransacoesRepository.java:109)
2026-10-09T18:42:36.6051847Z 	at br.gov.caixa.siifx.repository.transacao.ConsultaTransacoesRepositoryTest.lambda$testConsultaTransacao_RuntimeException$22(ConsultaTransacoesRepositoryTest.java:1446)
2026-10-09T18:42:36.6052120Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:53)
2026-10-09T18:42:36.6052330Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:35)
2026-10-09T18:42:36.6052711Z 	at org.junit.jupiter.api.Assertions.assertThrows(Assertions.java:3083)
2026-10-09T18:42:36.6052943Z 	at br.gov.caixa.siifx.repository.transacao.ConsultaTransacoesRepositoryTest.testConsultaTransacao_RuntimeException(ConsultaTransacoesRepositoryTest.java:1445)
2026-10-09T18:42:36.6053203Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-09T18:42:36.6053430Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-10-09T18:42:36.6053677Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-10-09T18:42:36.6053891Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-10-09T18:42:36.6054102Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
2026-10-09T18:42:36.6054438Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-10-09T18:42:36.6054712Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-10-09T18:42:36.6055004Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-10-09T18:42:36.6055252Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-10-09T18:42:36.6055505Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-10-09T18:42:36.6055783Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-10-09T18:42:36.6056033Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-10-09T18:42:36.6056307Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-10-09T18:42:36.6056569Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-10-09T18:42:36.6056821Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-10-09T18:42:36.6057089Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-10-09T18:42:36.6057440Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-10-09T18:42:36.6057695Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-10-09T18:42:36.6057956Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:217)
2026-10-09T18:42:36.6058217Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.6058472Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:213)
2026-10-09T18:42:36.6058730Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:138)
2026-10-09T18:42:36.6058985Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:68)
2026-10-09T18:42:36.6059322Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-10-09T18:42:36.6059594Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.6059811Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:36.6060049Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:36.6060279Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:36.6060529Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.6060779Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:36.6061035Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:36.6061257Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:36.6061597Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:36.6061920Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:36.6062168Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.6062418Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:36.6062648Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:36.6062888Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:36.6063099Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.6063349Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:36.6063595Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:36.6063808Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:36.6064088Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:36.6064367Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:36.6064615Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.6064859Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:36.6065151Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:36.6065373Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:36.6066237Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.6066729Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:36.6067002Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:36.6067235Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-10-09T18:42:36.6067516Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-10-09T18:42:36.6067839Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-10-09T18:42:36.6068087Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)
2026-10-09T18:42:36.6068371Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)
2026-10-09T18:42:36.6068764Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)
2026-10-09T18:42:36.6069021Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)
2026-10-09T18:42:36.6069287Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)
2026-10-09T18:42:36.6069558Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)
2026-10-09T18:42:36.6069786Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
2026-10-09T18:42:36.6070023Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
2026-10-09T18:42:36.6070264Z 	at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
2026-10-09T18:42:36.6070496Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:55)
2026-10-09T18:42:36.6070727Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:223)
2026-10-09T18:42:36.6070940Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:175)
2026-10-09T18:42:36.6071188Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:139)
2026-10-09T18:42:36.6071583Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:456)
2026-10-09T18:42:36.6071845Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:169)
2026-10-09T18:42:36.6072067Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:595)
2026-10-09T18:42:36.6072277Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:581)
2026-10-09T18:42:36.6072358Z 
2026-10-09T18:42:36.6303152Z 2026-10-09 15:42:36,617 INFO  [br.gov.cai.sii.rep.tra.ConsultaTransacoesRepository] (main) ConsultaTransacoesRepository.consultaTransacoesManifestacaoPendentesAlcada:  1791571356617 
2026-10-09T18:42:36.6303782Z 2026-10-09 15:42:36,618 INFO  [br.gov.cai.sii.rep.tra.ConsultaTransacoesRepository] (main) Fim metodoConsultaTransacoesRepository.consultaTransacoesManifestacaoPendentesAlcada:  -1 
2026-10-09T18:42:36.8823722Z 2026-10-09 15:42:36,878 INFO  [br.gov.cai.sii.rep.tra.ConsultaTransacoesRepository] (main) Inicio metodo consultaTransacao: 1791571356878
2026-10-09T18:42:36.8824237Z 2026-10-09 15:42:36,880 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) Erro ao ConsultaTransacoesRepository.consultaTransacao. mocked IOException. Parametros: null: java.io.IOException: mocked IOException
2026-10-09T18:42:36.8826825Z 	at br.gov.caixa.siifx.repository.transacao.ConsultaTransacoesRepositoryTest.lambda$testConsultaTransacao_IOException$20(ConsultaTransacoesRepositoryTest.java:1431)
2026-10-09T18:42:36.8827125Z 	at org.mockito.internal.stubbing.StubbedInvocationMatcher.answer(StubbedInvocationMatcher.java:42)
2026-10-09T18:42:36.8827535Z 	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:103)
2026-10-09T18:42:36.8827729Z 	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
2026-10-09T18:42:36.8828066Z 	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
2026-10-09T18:42:36.8828317Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
2026-10-09T18:42:36.8828575Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:56)
2026-10-09T18:42:36.8829036Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor$DispatcherDefaultingToRealMethod.interceptAbstract(MockMethodInterceptor.java:161)
2026-10-09T18:42:36.8829279Z 	at org.hibernate.Session$MockitoMock$XUX8ympZ.createNativeQuery(Unknown Source)
2026-10-09T18:42:36.8829517Z 	at br.gov.caixa.siifx.repository.transacao.ConsultaTransacoesRepository.consultaTransacao(ConsultaTransacoesRepository.java:109)
2026-10-09T18:42:36.8829858Z 	at br.gov.caixa.siifx.repository.transacao.ConsultaTransacoesRepositoryTest.lambda$testConsultaTransacao_IOException$21(ConsultaTransacoesRepositoryTest.java:1435)
2026-10-09T18:42:36.8830130Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:53)
2026-10-09T18:42:36.8830455Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:35)
2026-10-09T18:42:36.8830812Z 	at org.junit.jupiter.api.Assertions.assertThrows(Assertions.java:3083)
2026-10-09T18:42:36.8831212Z 	at br.gov.caixa.siifx.repository.transacao.ConsultaTransacoesRepositoryTest.testConsultaTransacao_IOException(ConsultaTransacoesRepositoryTest.java:1434)
2026-10-09T18:42:36.8831557Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-09T18:42:36.8831755Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-10-09T18:42:36.8832683Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-10-09T18:42:36.8832928Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-10-09T18:42:36.8833148Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
2026-10-09T18:42:36.8833387Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-10-09T18:42:36.8833653Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-10-09T18:42:36.8833921Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-10-09T18:42:36.8834308Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-10-09T18:42:36.8834641Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-10-09T18:42:36.8834959Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-10-09T18:42:36.8835323Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-10-09T18:42:36.8835607Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-10-09T18:42:36.8835874Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-10-09T18:42:36.8836193Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-10-09T18:42:36.8836524Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-10-09T18:42:36.8836749Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-10-09T18:42:36.8837009Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-10-09T18:42:36.8837295Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:217)
2026-10-09T18:42:36.8837589Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.8837846Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:213)
2026-10-09T18:42:36.8838281Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:138)
2026-10-09T18:42:36.8838582Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:68)
2026-10-09T18:42:36.8838870Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-10-09T18:42:36.8839128Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.8839474Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:36.8839709Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:36.8839962Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:36.8840207Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.8840422Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:36.8840663Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:36.8840877Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:36.8841144Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:36.8841504Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:36.8841779Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.8842034Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:36.8842300Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:36.8842538Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:36.8842787Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.8843035Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:36.8843348Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:36.8843683Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:36.8844014Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:36.8844440Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:36.8844921Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.8845323Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:36.8845572Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:36.8845810Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:36.8846062Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.8846333Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:36.8846575Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:36.8846847Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-10-09T18:42:36.8847191Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-10-09T18:42:36.8847468Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-10-09T18:42:36.8847779Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)
2026-10-09T18:42:36.8848025Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)
2026-10-09T18:42:36.8848244Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)
2026-10-09T18:42:36.8848512Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)
2026-10-09T18:42:36.8848779Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)
2026-10-09T18:42:36.8849044Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)
2026-10-09T18:42:36.8849276Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
2026-10-09T18:42:36.8849496Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
2026-10-09T18:42:36.8849760Z 	at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
2026-10-09T18:42:36.8850004Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:55)
2026-10-09T18:42:36.8850242Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:223)
2026-10-09T18:42:36.8850512Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:175)
2026-10-09T18:42:36.8850828Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:139)
2026-10-09T18:42:36.8851185Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:456)
2026-10-09T18:42:36.8851549Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:169)
2026-10-09T18:42:36.8851743Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:595)
2026-10-09T18:42:36.8851960Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:581)
2026-10-09T18:42:36.8852109Z 
2026-10-09T18:42:36.8892578Z 2026-10-09 15:42:36,887 INFO  [br.gov.cai.sii.rep.tra.ConsultaTransacoesRepository] (main) Iniciando: ConsultaTransacoesRepository.consultaTransacoesPendentesAlcada
2026-10-09T18:42:36.8893286Z 2026-10-09 15:42:36,887 INFO  [br.gov.cai.sii.rep.tra.ConsultaTransacoesRepository] (main) Fim metodo: ConsultaTransacoesRepository.consultaTransacoesPendentesAlcada -> 1 ms
2026-10-09T18:42:36.8893890Z 2026-10-09 15:42:36,887 INFO  [br.gov.cai.sii.rep.tra.ConsultaTransacoesRepository] (main) Iniciando: ConsultaTransacoesRepository.consultaTransacoesPendentesAlcada
2026-10-09T18:42:36.8895404Z 2026-10-09 15:42:36,888 INFO  [br.gov.cai.sii.rep.tra.ConsultaTransacoesRepository] (main) Fim metodo: ConsultaTransacoesRepository.consultaTransacoesPendentesAlcada -> 1 ms
2026-10-09T18:42:36.8940565Z 2026-10-09 15:42:36,891 INFO  [br.gov.cai.sii.rep.tra.ConsultaTransacoesRepository] (main) Iniciando: ConsultaTransacoesRepository.consultaTransacoesPendentesAlcada
2026-10-09T18:42:36.8941034Z 2026-10-09 15:42:36,892 INFO  [br.gov.cai.sii.rep.tra.ConsultaTransacoesRepository] (main) Fim metodo: ConsultaTransacoesRepository.consultaTransacoesPendentesAlcada -> 1 ms
2026-10-09T18:42:36.8941688Z 2026-10-09 15:42:36,892 INFO  [br.gov.cai.sii.rep.tra.ConsultaTransacoesRepository] (main) Iniciando: ConsultaTransacoesRepository.consultaTransacoesPendentesAlcada
2026-10-09T18:42:36.8942063Z 2026-10-09 15:42:36,893 INFO  [br.gov.cai.sii.rep.tra.ConsultaTransacoesRepository] (main) Fim metodo: ConsultaTransacoesRepository.consultaTransacoesPendentesAlcada -> 1 ms
2026-10-09T18:42:36.8975034Z 2026-10-09 15:42:36,895 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) Erro ao ConsultaTransacoesRepository.buscarMotivosAlcada. Query error. Parametros: [1001]. SQL: erro ao consultar motivos: java.lang.RuntimeException: Query error
2026-10-09T18:42:36.8975691Z 	at br.gov.caixa.siifx.repository.transacao.ConsultaTransacoesRepository.buscarMotivosAlcada(ConsultaTransacoesRepository.java:2063)
2026-10-09T18:42:36.8976008Z 	at br.gov.caixa.siifx.repository.transacao.ConsultaTransacoesRepositoryTest.lambda$testBuscarMotivosAlcada_Error$19(ConsultaTransacoesRepositoryTest.java:1296)
2026-10-09T18:42:36.8976283Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:53)
2026-10-09T18:42:36.8976505Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:35)
2026-10-09T18:42:36.8976959Z 	at org.junit.jupiter.api.Assertions.assertThrows(Assertions.java:3083)
2026-10-09T18:42:36.8977365Z 	at br.gov.caixa.siifx.repository.transacao.ConsultaTransacoesRepositoryTest.testBuscarMotivosAlcada_Error(ConsultaTransacoesRepositoryTest.java:1295)
2026-10-09T18:42:36.8977637Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-09T18:42:36.8977907Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-10-09T18:42:36.8978213Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-10-09T18:42:36.8978520Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-10-09T18:42:36.8978809Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
2026-10-09T18:42:36.8979189Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-10-09T18:42:36.8979459Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-10-09T18:42:36.8979952Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-10-09T18:42:36.8980201Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-10-09T18:42:36.8980474Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-10-09T18:42:36.8980832Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-10-09T18:42:36.8981193Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-10-09T18:42:36.8981582Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-10-09T18:42:36.8981858Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-10-09T18:42:36.8982408Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-10-09T18:42:36.8982716Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-10-09T18:42:36.8982990Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-10-09T18:42:36.8983250Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-10-09T18:42:36.8983517Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:217)
2026-10-09T18:42:36.8983880Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.8984218Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:213)
2026-10-09T18:42:36.8984553Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:138)
2026-10-09T18:42:36.8984835Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:68)
2026-10-09T18:42:36.8985111Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-10-09T18:42:36.8985374Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.8985597Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:36.8985844Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:36.8986085Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:36.8986355Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.8986603Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:36.8986849Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:36.8987099Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:36.8987427Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:36.8987718Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:36.8988028Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.8988279Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:36.8988526Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:36.8988813Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:36.8989031Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.8989306Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:36.8989581Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:36.8989803Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:36.8990059Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:36.8990456Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:36.8990801Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.8991166Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:36.8991625Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:36.8991981Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:36.8992382Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.8992753Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:36.8993111Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:36.8993482Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-10-09T18:42:36.8993775Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-10-09T18:42:36.8994189Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-10-09T18:42:36.8994512Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)
2026-10-09T18:42:36.8994911Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)
2026-10-09T18:42:36.8995335Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)
2026-10-09T18:42:36.8995703Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)
2026-10-09T18:42:36.8996059Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)
2026-10-09T18:42:36.8996405Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)
2026-10-09T18:42:36.8996715Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
2026-10-09T18:42:36.8996993Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
2026-10-09T18:42:36.8997338Z 	at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
2026-10-09T18:42:36.8997641Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:55)
2026-10-09T18:42:36.8997860Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:223)
2026-10-09T18:42:36.8998355Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:175)
2026-10-09T18:42:36.8998793Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:139)
2026-10-09T18:42:36.8999042Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:456)
2026-10-09T18:42:36.8999271Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:169)
2026-10-09T18:42:36.8999533Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:595)
2026-10-09T18:42:36.8999784Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:581)
2026-10-09T18:42:36.8999867Z 
2026-10-09T18:42:36.9091670Z 2026-10-09 15:42:36,907 INFO  [br.gov.cai.sii.rep.tra.ConsultaTransacoesRepository] (main) ConsultaTransacoesRepository.consultaTransacoesManifestacaoPendentesAlcada:  1791571356907 
2026-10-09T18:42:36.9092312Z 2026-10-09 15:42:36,907 INFO  [br.gov.cai.sii.rep.tra.ConsultaTransacoesRepository] (main) Fim metodoConsultaTransacoesRepository.consultaTransacoesManifestacaoPendentesAlcada:  0 
2026-10-09T18:42:36.9279025Z 2026-10-09 15:42:36,924 INFO  [br.gov.cai.sii.rep.tra.ConsultaTransacoesRepository] (main) Inicio metodo consultaTransacao: 1791571356924
2026-10-09T18:42:36.9280562Z 2026-10-09 15:42:36,925 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) Erro ao ConsultaTransacoesRepository.consultaTransacao. mocked Checked Exception. Parametros: ParametrosConsultaGenericasTransacoesV2DTO(codigoCanalOrigem=1, codigoSistemaOrigem=1, nsuSistemaOrigem=1, codigoSistemaIntermediario=1, nsuSistemaIntermediario=1, codigoAcao=1, codigoComando=1, codigoAntecedente=1, dataMovimento=null, operador=1, terminal=1, dataInicio=null, dataFim=null, horaInicio=1, horaFim=1, unidade=1, tipoPessoa=1, cpfCnpj=1, cpfCnpjAlfanumerico=null, codigoProduto=1, codigoModalidade=1, notaAplicacao=1, notaTransacao=1, operadorFiltro=1, autorizador=1, unidadeDeposito=1, produtoDeposito=1, contaDeposito=1, digitoDeposito=1, tipoTransacao=1.1.1, situacaoTransacao=1, valorMinimo=1, valorMaximo=1): java.lang.Exception: mocked Checked Exception
2026-10-09T18:42:36.9281828Z 	at br.gov.caixa.siifx.repository.transacao.ConsultaTransacoesRepositoryTest.lambda$testConsultaTransacao_GenericException$23(ConsultaTransacoesRepositoryTest.java:1455)
2026-10-09T18:42:36.9282202Z 	at org.mockito.internal.stubbing.StubbedInvocationMatcher.answer(StubbedInvocationMatcher.java:42)
2026-10-09T18:42:36.9282590Z 	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:103)
2026-10-09T18:42:36.9283056Z 	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
2026-10-09T18:42:36.9283387Z 	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
2026-10-09T18:42:36.9283754Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
2026-10-09T18:42:36.9284121Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:56)
2026-10-09T18:42:36.9285334Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor$DispatcherDefaultingToRealMethod.interceptAbstract(MockMethodInterceptor.java:161)
2026-10-09T18:42:36.9285672Z 	at org.hibernate.Session$MockitoMock$XUX8ympZ.createNativeQuery(Unknown Source)
2026-10-09T18:42:36.9285991Z 	at br.gov.caixa.siifx.repository.transacao.ConsultaTransacoesRepository.consultaTransacao(ConsultaTransacoesRepository.java:109)
2026-10-09T18:42:36.9286282Z 	at br.gov.caixa.siifx.repository.transacao.ConsultaTransacoesRepositoryTest.lambda$testConsultaTransacao_GenericException$24(ConsultaTransacoesRepositoryTest.java:1459)
2026-10-09T18:42:36.9286683Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:53)
2026-10-09T18:42:36.9286907Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:35)
2026-10-09T18:42:36.9287126Z 	at org.junit.jupiter.api.Assertions.assertThrows(Assertions.java:3083)
2026-10-09T18:42:36.9287395Z 	at br.gov.caixa.siifx.repository.transacao.ConsultaTransacoesRepositoryTest.testConsultaTransacao_GenericException(ConsultaTransacoesRepositoryTest.java:1458)
2026-10-09T18:42:36.9288378Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-09T18:42:36.9288631Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-10-09T18:42:36.9289364Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-10-09T18:42:36.9289632Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-10-09T18:42:36.9289902Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
2026-10-09T18:42:36.9290204Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-10-09T18:42:36.9290524Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-10-09T18:42:36.9290990Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-10-09T18:42:36.9291203Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-10-09T18:42:36.9291590Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-10-09T18:42:36.9291907Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-10-09T18:42:36.9292272Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-10-09T18:42:36.9292565Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-10-09T18:42:36.9292866Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-10-09T18:42:36.9293236Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-10-09T18:42:36.9298053Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-10-09T18:42:36.9298393Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-10-09T18:42:36.9298691Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-10-09T18:42:36.9298973Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:217)
2026-10-09T18:42:36.9299254Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.9299521Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:213)
2026-10-09T18:42:36.9299887Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:138)
2026-10-09T18:42:36.9300229Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:68)
2026-10-09T18:42:36.9300578Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-10-09T18:42:36.9300908Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.9301301Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:36.9301807Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:36.9302065Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:36.9302373Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.9302734Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:36.9303037Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:36.9303343Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:36.9303723Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:36.9304162Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:36.9304607Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.9304866Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:36.9305106Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:36.9305478Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:36.9305736Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.9306071Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:36.9306323Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:36.9306555Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:36.9306819Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:36.9307121Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:36.9307432Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.9307687Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:36.9307921Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:36.9308170Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:36.9308430Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:36.9308676Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:36.9308884Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:36.9309158Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-10-09T18:42:36.9309452Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-10-09T18:42:36.9309721Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-10-09T18:42:36.9309975Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)
2026-10-09T18:42:36.9310332Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)
2026-10-09T18:42:36.9310622Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)
2026-10-09T18:42:36.9310906Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)
2026-10-09T18:42:36.9311175Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)
2026-10-09T18:42:36.9311523Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)
2026-10-09T18:42:36.9311771Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
2026-10-09T18:42:36.9311994Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
2026-10-09T18:42:36.9312239Z 	at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
2026-10-09T18:42:36.9312448Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:55)
2026-10-09T18:42:36.9312692Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:223)
2026-10-09T18:42:36.9312992Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:175)
2026-10-09T18:42:36.9313252Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:139)
2026-10-09T18:42:36.9313554Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:456)
2026-10-09T18:42:36.9313783Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:169)
2026-10-09T18:42:36.9313999Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:595)
2026-10-09T18:42:36.9314215Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:581)
2026-10-09T18:42:36.9314297Z 
2026-10-09T18:42:36.9317937Z 2026-10-09 15:42:36,930 INFO  [br.gov.cai.sii.rep.tra.ConsultaTransacoesRepository] (main) ConsultaTransacoesRepository.consultaTransacoesManifestacaoPendentesAlcada:  1791571356930 
2026-10-09T18:42:36.9453049Z [INFO] Tests run: 58, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.2 s - in br.gov.caixa.siifx.repository.transacao.ConsultaTransacoesRepositoryTest
2026-10-09T18:42:36.9453752Z [INFO] Running br.gov.caixa.siifx.repository.validacoes.ValidacoesGenericasSistemaRepositoryTest
2026-10-09T18:42:36.9540410Z [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.007 s - in br.gov.caixa.siifx.repository.validacoes.ValidacoesGenericasSistemaRepositoryTest
2026-10-09T18:42:36.9540865Z [INFO] Running br.gov.caixa.siifx.security.AutorizadoSIIFXInterceptorTest
2026-10-09T18:42:37.1757447Z 2026-10-09 15:42:37,172 ERROR [br.gov.cai.sii.sec.AutorizadoSIIFXInterceptor] (main) ### Funcionalidade e/ou operacao não permitida para o usuario
2026-10-09T18:42:37.1757988Z LogManager error of type FORMAT_FAILURE: Formatting error
2026-10-09T18:42:37.1758503Z java.lang.IllegalArgumentException: can't parse argument number: 
2026-10-09T18:42:37.1759212Z 	at java.base/java.text.MessageFormat.makeFormat(MessageFormat.java:1451)
2026-10-09T18:42:37.1759532Z 	at java.base/java.text.MessageFormat.applyPattern(MessageFormat.java:491)
2026-10-09T18:42:37.1760140Z 	at java.base/java.text.MessageFormat.<init>(MessageFormat.java:370)
2026-10-09T18:42:37.1760501Z 	at java.base/java.text.MessageFormat.format(MessageFormat.java:859)
2026-10-09T18:42:37.1760736Z 	at org.jboss.logmanager.ExtFormatter.formatMessageLegacy(ExtFormatter.java:107)
2026-10-09T18:42:37.1760918Z 	at org.jboss.logmanager.ExtFormatter.formatMessage(ExtFormatter.java:70)
2026-10-09T18:42:37.1761137Z 	at org.jboss.logmanager.formatters.Formatters$16.renderRaw(Formatters.java:781)
2026-10-09T18:42:37.1761369Z 	at org.jboss.logmanager.formatters.Formatters$JustifyingFormatStep.render(Formatters.java:221)
2026-10-09T18:42:37.1761752Z 	at org.jboss.logmanager.formatters.MultistepFormatter.format(MultistepFormatter.java:86)
2026-10-09T18:42:37.1761963Z 	at org.jboss.logmanager.ExtFormatter.format(ExtFormatter.java:32)
2026-10-09T18:42:37.1762178Z 	at org.jboss.logmanager.handlers.WriterHandler.doPublish(WriterHandler.java:43)
2026-10-09T18:42:37.1762392Z 	at org.jboss.logmanager.ExtHandler.publish(ExtHandler.java:66)
2026-10-09T18:42:37.1762604Z 	at org.jboss.logmanager.ExtHandler.publishToNestedHandlers(ExtHandler.java:97)
2026-10-09T18:42:37.1762835Z 	at io.quarkus.bootstrap.logging.QuarkusDelayedHandler.doPublish(QuarkusDelayedHandler.java:81)
2026-10-09T18:42:37.1763067Z 	at org.jboss.logmanager.ExtHandler.publish(ExtHandler.java:66)
2026-10-09T18:42:37.1763276Z 	at org.jboss.logmanager.LoggerNode.publish(LoggerNode.java:327)
2026-10-09T18:42:37.1763435Z 	at org.jboss.logmanager.LoggerNode.publish(LoggerNode.java:334)
2026-10-09T18:42:37.1763637Z 	at org.jboss.logmanager.LoggerNode.publish(LoggerNode.java:334)
2026-10-09T18:42:37.1763831Z 	at org.jboss.logmanager.LoggerNode.publish(LoggerNode.java:334)
2026-10-09T18:42:37.1764026Z 	at org.jboss.logmanager.LoggerNode.publish(LoggerNode.java:334)
2026-10-09T18:42:37.1764220Z 	at org.jboss.logmanager.LoggerNode.publish(LoggerNode.java:334)
2026-10-09T18:42:37.1764662Z 	at org.jboss.logmanager.LoggerNode.publish(LoggerNode.java:334)
2026-10-09T18:42:37.1764920Z 	at org.jboss.logmanager.Logger.logRaw(Logger.java:750)
2026-10-09T18:42:37.1771184Z 	at org.jboss.logmanager.Logger.log(Logger.java:708)
2026-10-09T18:42:37.1771696Z 	at org.jboss.logging.JBossLogManagerLogger.doLog(JBossLogManagerLogger.java:44)
2026-10-09T18:42:37.1771984Z 	at org.jboss.logging.Logger.error(Logger.java:1530)
2026-10-09T18:42:37.1772405Z 	at br.gov.caixa.siifx.security.AutorizadoSIIFXInterceptor.validaAutorizacao(AutorizadoSIIFXInterceptor.java:84)
2026-10-09T18:42:37.1772825Z 	at br.gov.caixa.siifx.security.AutorizadoSIIFXInterceptor.verificaAutorizacao(AutorizadoSIIFXInterceptor.java:61)
2026-10-09T18:42:37.1773303Z 	at br.gov.caixa.siifx.security.AutorizadoSIIFXInterceptorTest.lambda$deveRetornar403QuandoAutorizacaoNormalNegarAcesso$1(AutorizadoSIIFXInterceptorTest.java:139)
2026-10-09T18:42:37.1773733Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:53)
2026-10-09T18:42:37.1774074Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:35)
2026-10-09T18:42:37.1774412Z 	at org.junit.jupiter.api.Assertions.assertThrows(Assertions.java:3083)
2026-10-09T18:42:37.1774994Z 	at br.gov.caixa.siifx.security.AutorizadoSIIFXInterceptorTest.deveRetornar403QuandoAutorizacaoNormalNegarAcesso(AutorizadoSIIFXInterceptorTest.java:139)
2026-10-09T18:42:37.1775403Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-09T18:42:37.1775757Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-10-09T18:42:37.1776158Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-10-09T18:42:37.1776513Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-10-09T18:42:37.1776809Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
2026-10-09T18:42:37.1777175Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-10-09T18:42:37.1777599Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-10-09T18:42:37.1778039Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-10-09T18:42:37.1778460Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-10-09T18:42:37.1778867Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-10-09T18:42:37.1779319Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-10-09T18:42:37.1779884Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-10-09T18:42:37.1780337Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-10-09T18:42:37.1780856Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-10-09T18:42:37.1781277Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-10-09T18:42:37.1781789Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-10-09T18:42:37.1782231Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-10-09T18:42:37.1782650Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-10-09T18:42:37.1783086Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:217)
2026-10-09T18:42:37.1783510Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:37.1783887Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:213)
2026-10-09T18:42:37.1784382Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:138)
2026-10-09T18:42:37.1784783Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:68)
2026-10-09T18:42:37.1785220Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-10-09T18:42:37.1785630Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:37.1786072Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:37.1786508Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:37.1786887Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:37.1787294Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:37.1787737Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:37.1788143Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:37.1788485Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:37.1788845Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:37.1789310Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:37.1789853Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:37.1790257Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:37.1790639Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:37.1791014Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:37.1791502Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:37.1791922Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:37.1792310Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:37.1792654Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:37.1793095Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:37.1793552Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:37.1793982Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:37.1794387Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:37.1794716Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:37.1795105Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:37.1795505Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:37.1795904Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:37.1796291Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:37.1796759Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-10-09T18:42:37.1797278Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-10-09T18:42:37.1797697Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-10-09T18:42:37.1798122Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)
2026-10-09T18:42:37.1798521Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)
2026-10-09T18:42:37.1798939Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)
2026-10-09T18:42:37.1799363Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)
2026-10-09T18:42:37.1799893Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)
2026-10-09T18:42:37.1800262Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)
2026-10-09T18:42:37.1800673Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
2026-10-09T18:42:37.1801031Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
2026-10-09T18:42:37.1801584Z 	at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
2026-10-09T18:42:37.1802001Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:55)
2026-10-09T18:42:37.1802383Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:223)
2026-10-09T18:42:37.1802788Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:175)
2026-10-09T18:42:37.1803195Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:139)
2026-10-09T18:42:37.1803581Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:456)
2026-10-09T18:42:37.1803967Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:169)
2026-10-09T18:42:37.1804322Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:595)
2026-10-09T18:42:37.1804728Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:581)
2026-10-09T18:42:37.1804973Z Caused by: java.lang.NumberFormatException: For input string: ""
2026-10-09T18:42:37.1805220Z 	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
2026-10-09T18:42:37.1805427Z 	at java.base/java.lang.Integer.parseInt(Integer.java:662)
2026-10-09T18:42:37.1805613Z 	at java.base/java.lang.Integer.parseInt(Integer.java:770)
2026-10-09T18:42:37.1805807Z 	at java.base/java.text.MessageFormat.makeFormat(MessageFormat.java:1449)
2026-10-09T18:42:37.1805976Z 	... 103 more
2026-10-09T18:42:37.1816020Z [INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.225 s - in br.gov.caixa.siifx.security.AutorizadoSIIFXInterceptorTest
2026-10-09T18:42:37.1816766Z [INFO] Running br.gov.caixa.siifx.service.CatalogoServiceTest
2026-10-09T18:42:37.7374679Z WARNING: An illegal reflective access operation has occurred
2026-10-09T18:42:37.7375378Z WARNING: Illegal reflective access by com.google.gson.internal.reflect.ReflectionHelper (file:/opt/ads-agent/cache-tools/.m2/repository/com/google/code/gson/gson/2.10/gson-2.10.jar) to field java.time.LocalDateTime.date
2026-10-09T18:42:37.7375719Z WARNING: Please consider reporting this to the maintainers of com.google.gson.internal.reflect.ReflectionHelper
2026-10-09T18:42:37.7375987Z WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
2026-10-09T18:42:37.7376188Z WARNING: All illegal access operations will be denied in a future release
2026-10-09T18:42:37.7717317Z [INFO] Tests run: 15, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.581 s - in br.gov.caixa.siifx.service.CatalogoServiceTest
2026-10-09T18:42:37.7773622Z [INFO] Running br.gov.caixa.siifx.service.ContabilServiceTest
2026-10-09T18:42:38.3906792Z java.lang.NullPointerException
2026-10-09T18:42:38.3907113Z 	at br.gov.caixa.siifx.service.contabil.ContabilService.incluirContabil(ContabilService.java:249)
2026-10-09T18:42:38.3907630Z 	at br.gov.caixa.siifx.service.ContabilServiceTest.testIncluirContabil(ContabilServiceTest.java:429)
2026-10-09T18:42:38.3907854Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-09T18:42:38.3908084Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-10-09T18:42:38.3908413Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-10-09T18:42:38.3908883Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-10-09T18:42:38.3909097Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
2026-10-09T18:42:38.3909300Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-10-09T18:42:38.3909565Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-10-09T18:42:38.3909828Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-10-09T18:42:38.3910109Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-10-09T18:42:38.3910374Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-10-09T18:42:38.3910831Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-10-09T18:42:38.3911129Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-10-09T18:42:38.3911507Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-10-09T18:42:38.3911786Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-10-09T18:42:38.3912043Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-10-09T18:42:38.3912296Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-10-09T18:42:38.3912580Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-10-09T18:42:38.3912843Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-10-09T18:42:38.3913114Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:217)
2026-10-09T18:42:38.3913344Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.3913620Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:213)
2026-10-09T18:42:38.3913891Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:138)
2026-10-09T18:42:38.3914147Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:68)
2026-10-09T18:42:38.3914558Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-10-09T18:42:38.3914815Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.3915182Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:38.3915490Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:38.3915815Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:38.3916068Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.3916370Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:38.3916655Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:38.3916927Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:38.3917158Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:38.3917489Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:38.3917761Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.3918016Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:38.3918243Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:38.3918474Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:38.3918712Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.3918956Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:38.3919190Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:38.3919399Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:38.3919671Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:38.3919960Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:38.3920199Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.3920414Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:38.3920643Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:38.3920869Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:38.3921115Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.3921354Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:38.3921662Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:38.3921953Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-10-09T18:42:38.3922228Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-10-09T18:42:38.3922482Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-10-09T18:42:38.3922729Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)
2026-10-09T18:42:38.3923008Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)
2026-10-09T18:42:38.3923249Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)
2026-10-09T18:42:38.3923498Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)
2026-10-09T18:42:38.3923725Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)
2026-10-09T18:42:38.3923987Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)
2026-10-09T18:42:38.3924287Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
2026-10-09T18:42:38.3924632Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
2026-10-09T18:42:38.3924946Z 	at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
2026-10-09T18:42:38.3925447Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:55)
2026-10-09T18:42:38.3925796Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:223)
2026-10-09T18:42:38.3926166Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:175)
2026-10-09T18:42:38.3926656Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:139)
2026-10-09T18:42:38.3927037Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:456)
2026-10-09T18:42:38.3927329Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:169)
2026-10-09T18:42:38.3927543Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:595)
2026-10-09T18:42:38.3927722Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:581)
2026-10-09T18:42:38.4133545Z 2026-10-09 15:42:38,410 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) Erro ao ContabilService.excluirEvento. null. Parametros: EventoContabilDTO(nuProduto=65, codigoAcaoTransacao=1, codigoComandoTransacao=1, codigoAntecedenteTransacao=1, codigoEvento=1, coDvEvento=1, descricao=Exemplo, tipoEvento=1L, icSituacao=1, icUnidadeMovimento=1, icUnidadeDestinoCredito=1, icUnidadeDestinoDebito=1): java.lang.NullPointerException
2026-10-09T18:42:38.4134160Z 	at br.gov.caixa.siifx.service.contabil.ContabilService.excluirEvento(ContabilService.java:533)
2026-10-09T18:42:38.4135067Z 	at br.gov.caixa.siifx.service.ContabilServiceTest.excluirEventoTeste(ContabilServiceTest.java:248)
2026-10-09T18:42:38.4135322Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-09T18:42:38.4135546Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-10-09T18:42:38.4136380Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-10-09T18:42:38.4136662Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-10-09T18:42:38.4136841Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
2026-10-09T18:42:38.4137075Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-10-09T18:42:38.4138068Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-10-09T18:42:38.4138558Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-10-09T18:42:38.4139133Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-10-09T18:42:38.4139557Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-10-09T18:42:38.4140028Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-10-09T18:42:38.4140752Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-10-09T18:42:38.4141224Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-10-09T18:42:38.4141787Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-10-09T18:42:38.4142220Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-10-09T18:42:38.4142674Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-10-09T18:42:38.4143129Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-10-09T18:42:38.4143627Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-10-09T18:42:38.4144071Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:217)
2026-10-09T18:42:38.4144508Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.4144945Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:213)
2026-10-09T18:42:38.4145433Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:138)
2026-10-09T18:42:38.4145861Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:68)
2026-10-09T18:42:38.4146315Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-10-09T18:42:38.4146751Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.4147222Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:38.4147624Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:38.4148018Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:38.4148447Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.4148871Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:38.4149280Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:38.4149600Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:38.4151160Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:38.4151737Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:38.4152223Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.4152671Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:38.4153077Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:38.4153470Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:38.4153901Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.4154334Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:38.4154823Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:38.4155182Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:38.4155640Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:38.4156082Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:38.4156505Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.4156928Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:38.4157290Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:38.4157691Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:38.4158122Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.4158475Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:38.4158836Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:38.4159295Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-10-09T18:42:38.4159709Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-10-09T18:42:38.4160168Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-10-09T18:42:38.4160618Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)
2026-10-09T18:42:38.4160997Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)
2026-10-09T18:42:38.4161492Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)
2026-10-09T18:42:38.4161910Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)
2026-10-09T18:42:38.4162363Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)
2026-10-09T18:42:38.4162683Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)
2026-10-09T18:42:38.4162993Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
2026-10-09T18:42:38.4163224Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
2026-10-09T18:42:38.4163554Z 	at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
2026-10-09T18:42:38.4163833Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:55)
2026-10-09T18:42:38.4164082Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:223)
2026-10-09T18:42:38.4164341Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:175)
2026-10-09T18:42:38.4164597Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:139)
2026-10-09T18:42:38.4164840Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:456)
2026-10-09T18:42:38.4165099Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:169)
2026-10-09T18:42:38.4166023Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:595)
2026-10-09T18:42:38.4166432Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:581)
2026-10-09T18:42:38.4166586Z 
2026-10-09T18:42:38.4184374Z 2026-10-09 15:42:38,416 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) Erro ao validateRequiredFields. null. Parametros: EventoContabilDTO(nuProduto=null, codigoAcaoTransacao=null, codigoComandoTransacao=null, codigoAntecedenteTransacao=null, codigoEvento=null, coDvEvento=null, descricao=null, tipoEvento=null, icSituacao=null, icUnidadeMovimento=null, icUnidadeDestinoCredito=null, icUnidadeDestinoDebito=null): br.gov.caixa.siifx.infra.LambdaInternaException
2026-10-09T18:42:38.4185575Z 	at br.gov.caixa.siifx.util.UtilsNegocial.lambda$validateRequiredFields$4(UtilsNegocial.java:507)
2026-10-09T18:42:38.4187368Z 	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
2026-10-09T18:42:38.4187673Z 	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:177)
2026-10-09T18:42:38.4187929Z 	at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)
2026-10-09T18:42:38.4188303Z 	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1654)
2026-10-09T18:42:38.4188590Z 	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
2026-10-09T18:42:38.4188816Z 	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
2026-10-09T18:42:38.4189039Z 	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
2026-10-09T18:42:38.4189231Z 	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
2026-10-09T18:42:38.4189455Z 	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
2026-10-09T18:42:38.4189677Z 	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
2026-10-09T18:42:38.4189896Z 	at br.gov.caixa.siifx.util.UtilsNegocial.validateRequiredFields(UtilsNegocial.java:515)
2026-10-09T18:42:38.4190187Z 	at br.gov.caixa.siifx.service.contabil.ContabilService.validarCamposObrigatoriosEvento(ContabilService.java:841)
2026-10-09T18:42:38.4190552Z 	at br.gov.caixa.siifx.service.contabil.ContabilService.incluirEvento(ContabilService.java:454)
2026-10-09T18:42:38.4190881Z 	at br.gov.caixa.siifx.service.ContabilServiceTest.testIncluirEvento(ContabilServiceTest.java:447)
2026-10-09T18:42:38.4191104Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-09T18:42:38.4191323Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-10-09T18:42:38.4191697Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-10-09T18:42:38.4191918Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-10-09T18:42:38.4192129Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
2026-10-09T18:42:38.4192326Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-10-09T18:42:38.4192587Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-10-09T18:42:38.4192864Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-10-09T18:42:38.4193154Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-10-09T18:42:38.4193412Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-10-09T18:42:38.4193690Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-10-09T18:42:38.4193988Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-10-09T18:42:38.4194265Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-10-09T18:42:38.4194609Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-10-09T18:42:38.4194966Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-10-09T18:42:38.4195228Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-10-09T18:42:38.4195513Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-10-09T18:42:38.4195767Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-10-09T18:42:38.4196022Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:217)
2026-10-09T18:42:38.4196252Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.4196556Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:213)
2026-10-09T18:42:38.4196813Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:138)
2026-10-09T18:42:38.4197197Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:68)
2026-10-09T18:42:38.4197467Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-10-09T18:42:38.4197714Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.4197987Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:38.4198217Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:38.4198450Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:38.4198692Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.4198945Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:38.4199184Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:38.4199460Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:38.4199683Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:38.4199959Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:38.4200226Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.4200479Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:38.4200711Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:38.4200937Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:38.4201188Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.4201549Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:38.4201823Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:38.4202031Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:38.4202300Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:38.4202629Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:38.4202868Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.4203076Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:38.4203316Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:38.4203542Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:38.4203783Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.4204047Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:38.4204323Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:38.4204597Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-10-09T18:42:38.4204870Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-10-09T18:42:38.4205144Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-10-09T18:42:38.4205510Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)
2026-10-09T18:42:38.4205907Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)
2026-10-09T18:42:38.4206198Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)
2026-10-09T18:42:38.4206464Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)
2026-10-09T18:42:38.4206732Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)
2026-10-09T18:42:38.4207029Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)
2026-10-09T18:42:38.4207270Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
2026-10-09T18:42:38.4207502Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
2026-10-09T18:42:38.4207739Z 	at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
2026-10-09T18:42:38.4207989Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:55)
2026-10-09T18:42:38.4208223Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:223)
2026-10-09T18:42:38.4208548Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:175)
2026-10-09T18:42:38.4208902Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:139)
2026-10-09T18:42:38.4209270Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:456)
2026-10-09T18:42:38.4209581Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:169)
2026-10-09T18:42:38.4209882Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:595)
2026-10-09T18:42:38.4210170Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:581)
2026-10-09T18:42:38.4210293Z 
2026-10-09T18:42:38.4211565Z 2026-10-09 15:42:38,416 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) Erro ao ContabilService.incluirEvento. Preencha os campos obrigatórios!. Parametros: EventoContabilDTO(nuProduto=null, codigoAcaoTransacao=null, codigoComandoTransacao=null, codigoAntecedenteTransacao=null, codigoEvento=null, coDvEvento=null, descricao=null, tipoEvento=null, icSituacao=null, icUnidadeMovimento=null, icUnidadeDestinoCredito=null, icUnidadeDestinoDebito=null): br.gov.caixa.siifx.exception.BusinessException: Preencha os campos obrigatórios!
2026-10-09T18:42:38.4212410Z 	at br.gov.caixa.siifx.util.UtilsNegocial.validateRequiredFields(UtilsNegocial.java:518)
2026-10-09T18:42:38.4212815Z 	at br.gov.caixa.siifx.service.contabil.ContabilService.validarCamposObrigatoriosEvento(ContabilService.java:841)
2026-10-09T18:42:38.4213202Z 	at br.gov.caixa.siifx.service.contabil.ContabilService.incluirEvento(ContabilService.java:454)
2026-10-09T18:42:38.4213548Z 	at br.gov.caixa.siifx.service.ContabilServiceTest.testIncluirEvento(ContabilServiceTest.java:447)
2026-10-09T18:42:38.4213900Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-09T18:42:38.4214313Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-10-09T18:42:38.4214611Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-10-09T18:42:38.4214917Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-10-09T18:42:38.4215225Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
2026-10-09T18:42:38.4215568Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-10-09T18:42:38.4216023Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-10-09T18:42:38.4216391Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-10-09T18:42:38.4216756Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-10-09T18:42:38.4217145Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-10-09T18:42:38.4217593Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-10-09T18:42:38.4217984Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-10-09T18:42:38.4218279Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-10-09T18:42:38.4218545Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-10-09T18:42:38.4218847Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-10-09T18:42:38.4219062Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-10-09T18:42:38.4219409Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-10-09T18:42:38.4219823Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-10-09T18:42:38.4220097Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:217)
2026-10-09T18:42:38.4220363Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.4220689Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:213)
2026-10-09T18:42:38.4220953Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:138)
2026-10-09T18:42:38.4221234Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:68)
2026-10-09T18:42:38.4221638Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-10-09T18:42:38.4221894Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.4222155Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:38.4222391Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:38.4222622Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:38.4222866Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.4223112Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:38.4223356Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:38.4223672Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:38.4223926Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:38.4224210Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:38.4224457Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.4224704Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:38.4224900Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:38.4225135Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:38.4225389Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.4225661Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:38.4225934Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:38.4226150Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:38.4226401Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:38.4226684Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:38.4226933Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.4227176Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:38.4227424Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:38.4227655Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:38.4227922Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.4228126Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:38.4228364Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:38.4228633Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-10-09T18:42:38.4228914Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-10-09T18:42:38.4229175Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-10-09T18:42:38.4229553Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)
2026-10-09T18:42:38.4229808Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)
2026-10-09T18:42:38.4230063Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)
2026-10-09T18:42:38.4230337Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)
2026-10-09T18:42:38.4230601Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)
2026-10-09T18:42:38.4230858Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)
2026-10-09T18:42:38.4231092Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
2026-10-09T18:42:38.4231362Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
2026-10-09T18:42:38.4231630Z 	at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
2026-10-09T18:42:38.4231875Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:55)
2026-10-09T18:42:38.4232109Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:223)
2026-10-09T18:42:38.4232501Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:175)
2026-10-09T18:42:38.4232757Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:139)
2026-10-09T18:42:38.4232999Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:456)
2026-10-09T18:42:38.4233224Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:169)
2026-10-09T18:42:38.4233440Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:595)
2026-10-09T18:42:38.4233667Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:581)
2026-10-09T18:42:38.4233748Z 
2026-10-09T18:42:38.4234257Z 2026-10-09 15:42:38,419 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) Erro ao ContabilService.detalharTransacaoContabil. null. Parametros: codigoAcaoTransacao0codigoComando0codigoAntecedente0codigoProduto0codigoEvento0: java.lang.NullPointerException
2026-10-09T18:42:38.4234612Z 	at br.gov.caixa.siifx.service.contabil.ContabilService.detalharTransacaoContabil(ContabilService.java:713)
2026-10-09T18:42:38.4234902Z 	at br.gov.caixa.siifx.service.ContabilServiceTest.testDetalharTransacaoContabil(ContabilServiceTest.java:501)
2026-10-09T18:42:38.4235130Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-09T18:42:38.4235350Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-10-09T18:42:38.4235602Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-10-09T18:42:38.4235833Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-10-09T18:42:38.4236049Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
2026-10-09T18:42:38.4236244Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-10-09T18:42:38.4236497Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-10-09T18:42:38.4236784Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-10-09T18:42:38.4237028Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-10-09T18:42:38.4237315Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-10-09T18:42:38.4237806Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-10-09T18:42:38.4238230Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-10-09T18:42:38.4238776Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-10-09T18:42:38.4239167Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-10-09T18:42:38.4239517Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-10-09T18:42:38.4239810Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-10-09T18:42:38.4240118Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-10-09T18:42:38.4240372Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-10-09T18:42:38.4240648Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:217)
2026-10-09T18:42:38.4240872Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.4241135Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:213)
2026-10-09T18:42:38.4241464Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:138)
2026-10-09T18:42:38.4241731Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:68)
2026-10-09T18:42:38.4241988Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-10-09T18:42:38.4242266Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.4242519Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:38.4242755Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:38.4242997Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:38.4243247Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.4243492Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:38.4243730Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:38.4243949Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:38.4244179Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:38.4244635Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:38.4245013Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.4245300Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:38.4245540Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:38.4245768Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:38.4246017Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.4246318Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:38.4246560Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:38.4246798Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
2026-10-09T18:42:38.4247058Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-10-09T18:42:38.4247418Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-10-09T18:42:38.4247887Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.4248103Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-10-09T18:42:38.4248377Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-10-09T18:42:38.4248611Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-10-09T18:42:38.4248862Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-10-09T18:42:38.4249112Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-10-09T18:42:38.4249451Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-10-09T18:42:38.4249723Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-10-09T18:42:38.4250066Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-10-09T18:42:38.4250336Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-10-09T18:42:38.4250731Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)
2026-10-09T18:42:38.4251122Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)
2026-10-09T18:42:38.4251517Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)
2026-10-09T18:42:38.4251883Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)
2026-10-09T18:42:38.4252194Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)
2026-10-09T18:42:38.4252415Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)
2026-10-09T18:42:38.4252756Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
2026-10-09T18:42:38.4253079Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
2026-10-09T18:42:38.4253328Z 	at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
2026-10-09T18:42:38.4253566Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:55)
2026-10-09T18:42:38.4253806Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:223)
2026-10-09T18:42:38.4254056Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:175)
2026-10-09T18:42:38.4254389Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:139)
2026-10-09T18:42:38.4254747Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:456)
2026-10-09T18:42:38.4254977Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:169)
2026-10-09T18:42:38.4255272Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:595)
2026-10-09T18:42:38.4255559Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:581)
2026-10-09T18:42:38.4255663Z 
2026-10-09T18:42:38.4256307Z 2026-10-09 15:42:38,421 ERROR [br.gov.cai.sii.ser.tra.int.ServiceLogError] (main) Erro ao ContabilService.incluirContabil. null. Parametros: ContabilDTO(codigoProduto=1, codigoAcaoTransacao=1, codigoComandoTransacao=1, codigoAntecedenteTransacao=1, icTransacaoContabil=1, descricaoTransacao=null, descricaoProduto=null, eventos=null): java.lang.NullPointerException
2026-10-09T18:42:38.4256680Z 	at br.gov.caixa.siifx.service.contabil.ContabilService.incluirContabil(ContabilService.java:244)
2026-10-09T18:42:38.4256933Z 	at br.gov.caixa.siifx.service.ContabilServiceTest.incluirContabilTeste(ContabilServiceTest.java:350)
2026-10-09T18:42:38.4257157Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-09T18:42:38.4257476Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-10-09T18:42:38.4257805Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-10-09T18:42:38.4258023Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-10-09T18:42:38.4258239Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
2026-10-09T18:42:38.4258562Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-10-09T18:42:38.4258880Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.




ta rodando ha 25min e nada
