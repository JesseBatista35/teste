
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]# find /opt/jboss -path '*1e/ecf4c6065937c24797bf96123dacdc62730ddf/content'
/opt/jboss/jboss-eap/dc/data/content/1e/ecf4c6065937c24797bf96123dacdc62730ddf/content
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]# unzip -p $(find /opt/jboss -path '*1e/ecf4c6065937c24797bf96123dacdc62730ddf/content') 'META-INF/maven/*/pom.properties'
artifactId=sifec-ccr-parametros
groupId=br.gov.caixa.ccr.parametros
version=3.3.1.1
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]# unzip -p $(find /opt/jboss -path '*1e/ecf4c6065937c24797bf96123dacdc62730ddf/content') META-INF/MANIFEST.MF
Manifest-Version: 1.0
Build-Jdk-Spec: 1.8
Created-By: Maven EAR Plugin 3.2.0
Dependencies: deployment.wmq.jmsra.rar,org.joda.time,org.codehaus.jack
 son.jackson-mapper-asl,deployment.framework.jar

[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
