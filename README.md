16:28:21.447 INFO: Parsing /opt/ads-agent/_work/45/s/reports/sonarqubeTestReport.xml
16:28:21.458 DEBUG: eslint-bridge server will shutdown
16:28:26.459 DEBUG: eslint-bridge server closed
16:28:27.221 INFO: ------------------------------------------------------------------------
16:28:27.221 INFO: EXECUTION FAILURE
16:28:27.221 INFO: ------------------------------------------------------------------------
16:28:27.221 INFO: Total time: 54.631s
16:28:27.310 INFO: Final Memory: 19M/256M
16:28:27.310 INFO: ------------------------------------------------------------------------
16:28:27.310 ERROR: Error during SonarQube Scanner execution
Error during parsing of generic test execution report '/opt/ads-agent/_work/45/s/reports/sonarqubeTestReport.xml'. Look at the SonarQube documentation to know the expected XML format.
Caused by: java.io.FileNotFoundException: /opt/ads-agent/_work/45/s/reports/sonarqubeTestReport.xml (Arquivo ou diretório inexistente)
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(Unknown Source)
	at java.base/java.io.FileInputStream.<init>(Unknown Source)
	at org.sonar.scanner.genericcoverage.GenericTestExecutionReportParser.parse(GenericTestExecutionReportParser.java:75)
	at org.sonar.scanner.genericcoverage.GenericTestExecutionSensor.execute(GenericTestExecutionSensor.java:87)
	at org.sonar.scanner.sensor.AbstractSensorWrapper.analyse(AbstractSensorWrapper.java:64)
	at org.sonar.scanner.sensor.ModuleSensorsExecutor.execute(ModuleSensorsExecutor.java:88)
	at org.sonar.scanner.sensor.ModuleSensorsExecutor.execute(ModuleSensorsExecutor.java:64)
	at org.sonar.scanner.scan.SpringModuleScanContainer.doAfterStart(SpringModuleScanContainer.java:82)
	at org.sonar.core.platform.SpringComponentContainer.startComponents(SpringComponentContainer.java:188)
	at org.sonar.core.platform.SpringComponentContainer.execute(SpringComponentContainer.java:167)
	at org.sonar.scanner.scan.SpringProjectScanContainer.scan(SpringProjectScanContainer.java:403)
	at org.sonar.scanner.scan.SpringProjectScanContainer.scanRecursively(SpringProjectScanContainer.java:399)
	at org.sonar.scanner.scan.SpringProjectScanContainer.doAfterStart(SpringProjectScanContainer.java:368)
	at org.sonar.core.platform.SpringComponentContainer.startComponents(SpringComponentContainer.java:188)
	at org.sonar.core.platform.SpringComponentContainer.execute(SpringComponentContainer.java:167)
	at org.sonar.scanner.bootstrap.SpringGlobalContainer.doAfterStart(SpringGlobalContainer.java:137)
	at org.sonar.core.platform.SpringComponentContainer.startComponents(SpringComponentContainer.java:188)
at org.sonar.core.platform.SpringComponentContainer.execute(SpringComponentContainer.java:167)
	at org.sonar.batch.bootstrapper.Batch.doExecute(Batch.java:72)
	at org.sonar.batch.bootstrapper.Batch.execute(Batch.java:66)
	at org.sonarsource.scanner.api.internal.batch.BatchIsolatedLauncher.execute(BatchIsolatedLauncher.java:46)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
	at java.base/java.lang.reflect.Method.invoke(Unknown Source)
	at org.sonarsource.scanner.api.internal.IsolatedLauncherProxy.invoke(IsolatedLauncherProxy.java:60)
	at com.sun.proxy.$Proxy0.execute(Unknown Source)
	at org.sonarsource.scanner.api.EmbeddedScanner.doExecute(EmbeddedScanner.java:189)
	at org.sonarsource.scanner.api.EmbeddedScanner.execute(EmbeddedScanner.java:138)
	at org.sonarsource.scanner.cli.Main.execute(Main.java:112)
	at org.sonarsource.scanner.cli.Main.execute(Main.java:75)
	at org.sonarsource.scanner.cli.Main.main(Main.java:61)
##[error]Bash exited with code '2'.
Finishing: Run Code Analisis
