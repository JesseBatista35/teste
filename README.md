Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
SIMOV-imoveiscaixa-batch
/
1.0-SNAPSHOT
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings
#1.0-SNAPSHOT • feat: correcoes de erros do sonar
SIMOV-imoveiscaixa-batch

Cancel

Summary
Tests
Manually run
 by 
Jesse Mouta Pereira Batista
Repository and version
SIMOV-imoveiscaixa-batch
feature/CorrecoesSonar
1d9b5e80
Time started and elapsed
Today at 14:36
6m 55s
Related
0 work items
1 consumed
Tests and coverage
Get started
Errors
306
Warnings
3K+
14:38:32.107 ERROR: SonarQube server [https://sonar.apps.produtos4.caixa] can not be reached
Run Code Analysis
14:38:32.117 ERROR: Error during SonarScanner execution org.sonarsource.scanner.api.internal.ScannerException: Unable to execute SonarScanner analysis
Run Code Analysis
at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:85)
Run Code Analysis
at java.base/java.security.AccessController.doPrivileged(Native Method) at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:74) at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.createLauncher(IsolatedLauncherFactory.java:70) at org.sonarsource.scanner.api.EmbeddedScanner.doStart(EmbeddedScanner.java:185) at org.sonarsource.scanner.api.EmbeddedScanner.start(EmbeddedScanner.java:123)
Run Code Analysis
at org.sonarsource.scanner.cli.Main.execute(Main.java:73) at org.sonarsource.scanner.cli.Main.main(Main.java:61)
Run Code Analysis
Caused by: java.lang.IllegalStateException: Fail to get bootstrap index from server
Run Code Analysis
at org.sonarsource.scanner.api.internal.BootstrapIndexDownloader.getIndex(BootstrapIndexDownloader.java:42)
Run Code Analysis
at org.sonarsource.scanner.api.internal.JarDownloader.getScannerEngineFiles(JarDownloader.java:58) at org.sonarsource.scanner.api.internal.JarDownloader.download(JarDownloader.java:53)
Run Code Analysis
at org.sonarsource.scanner.api.internal.IsolatedLauncherFactory.lambda$createLauncher$0(IsolatedLauncherFactory.java:76)
Run Code Analysis
... 7 more
Run Code Analysis

View the log to see the remaining 296 errors for this task
Jobs
Showing 25 filtered items.

Get started and run this pipeline for the first time!

Showing 25 filtered items.

Showing 44 filtered items.

Row 2. Clickable
