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
OS name: "linux", version: "5.18.5-100.fc35.x86_64", arch: "amd64", family: "unix"
/opt/apache-maven/apache-maven-3.8.5/bin/mvn -f /opt/ads-agent/_work/48/s/pom.xml clean package -U -Dproject.version= -DskipTests=false
[INFO] Scanning for projects...
[ERROR] Internal error: java.lang.IllegalArgumentException: version can neither be null, empty nor blank -> [Help 1]
org.apache.maven.InternalErrorException: Internal error: java.lang.IllegalArgumentException: version can neither be null, empty nor blank
    at org.apache.maven.DefaultMaven.execute (DefaultMaven.java:120)
    at org.apache.maven.cli.MavenCli.execute (MavenCli.java:960)
    at org.apache.maven.cli.MavenCli.doMain (MavenCli.java:293)
    at org.apache.maven.cli.MavenCli.main (MavenCli.java:196)
    at jdk.internal.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
    at jdk.internal.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:62)
    at jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke (Method.java:566)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced (Launcher.java:282)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launch (Launcher.java:225)
    at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode (Launcher.java:406)
    at org.codehaus.plexus.classworlds.launcher.Launcher.main (Launcher.java:347)
Caused by: java.lang.IllegalArgumentException: version can neither be null, empty nor blank
    at org.apache.commons.lang3.Validate.notBlank (Validate.java:454)
    at org.apache.maven.artifact.ArtifactUtils.notBlank (ArtifactUtils.java:107)
    at org.apache.maven.artifact.ArtifactUtils.toSnapshotVersion (ArtifactUtils.java:57)
    at org.apache.maven.artifact.DefaultArtifact.setBaseVersionInternal (DefaultArtifact.java:389)
    at org.apache.maven.artifact.DefaultArtifact.selectVersion (DefaultArtifact.java:506)
    at org.apache.maven.artifact.DefaultArtifact.selectVersionFromNewRangeIfAvailable (DefaultArtifact.java:494)
    at org.apache.maven.artifact.DefaultArtifact.<init> (DefaultArtifact.java:106)
    at org.apache.maven.bridge.MavenRepositorySystem.createArtifactX (MavenRepositorySystem.java:562)
    at org.apache.maven.bridge.MavenRepositorySystem.createArtifactX (MavenRepositorySystem.java:521)
