
[root@caddeapllx955 earchk]#
[root@caddeapllx955 earchk]#
[root@caddeapllx955 earchk]# unzip -p /tmp/bkp_sirotcon/sirotcon-ejb.jar META-INF/MANIFEST.MF
Manifest-Version: 1.0
Archiver-Version: Plexus Archiver
Created-By: Apache Maven
Built-By: f612413
Build-Jdk: 1.6.0_23

Name: sirotcon-ejb
groupId: br.gov.caixa
implementation-version: LABEL-2.3.0.1
artifactId: sirotcon-ejb
mode: development

[root@caddeapllx955 earchk]#
[root@caddeapllx955 earchk]#
[root@caddeapllx955 earchk]#
[root@caddeapllx955 earchk]# unzip -p /tmp/bkp_sirotcon/sirotcon-ejb.jar 'META-INF/maven/*/pom.xml' 2>/dev/null | grep -B2 -A4 -iE "log|<scope>"
[root@caddeapllx955 earchk]#
[root@caddeapllx955 earchk]#
[root@caddeapllx955 earchk]#
[root@caddeapllx955 earchk]#
