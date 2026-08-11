Maven

View raw log

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
[ERROR] [ERROR] Some problems were encountered while processing the POMs:
[FATAL] Non-parseable POM /opt/ads-agent/_work/9/s/pom.xml: Expected root element 'project' but found 'modelVersion' (position: START_TAG seen <modelVersion>... @1:14)  @ line 1, column 14
 @ 
[ERROR] The build could not read 1 project -> [Help 1]
[ERROR]   
[ERROR]   The project  (/opt/ads-agent/_work/9/s/pom.xml) has 1 error
[ERROR]     Non-parseable POM /opt/ads-agent/_work/9/s/pom.xml: Expected root element 'project' but found 'modelVersion' (position: START_TAG seen <modelVersion>... @1:14)  @ line 1, column 14 -> [Help 2]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/ProjectBuildingException
[ERROR] [Help 2] http://cwiki.apache.org/confluence/display/MAVEN/ModelParseException
The process '/opt/apache-maven/apache-maven-3.8.5/bin/mvn' failed with exit code 1
Could not retrieve code analysis results - Maven run failed.
##[error]Build failed.
Finishing: Mave
