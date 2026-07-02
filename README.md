-sh-4.2$ cd /tmp/checkver_$$
-sh-4.2$ pws
-sh: pws: comando não encontrado
-sh-4.2$ pwd
/tmp/checkver_6365
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ls -la
total 4
drwxr-xr-x   2 p585600 usucef    6 Jul  2 19:37 .
drwxrwxrwt. 15 root    root   4096 Jul  2 19:37 ..
-sh-4.2$
-sh-4.2$
-sh-4.2$ which unzip
/usr/bin/unzip
-sh-4.2$ unzip -o /opt/jboss-eap/standalone/deployments/sisme-ear.ear -d ear_extracted
Archive:  /opt/jboss-eap/standalone/deployments/sisme-ear.ear
   creating: ear_extracted/META-INF/
  inflating: ear_extracted/META-INF/MANIFEST.MF
   creating: ear_extracted/lib/
  inflating: ear_extracted/META-INF/application.xml
  inflating: ear_extracted/META-INF/jboss-app.xml
  inflating: ear_extracted/sisme-web-2.93.3.0.war
  inflating: ear_extracted/lib/sisme-api-2.93.3.0.jar
  inflating: ear_extracted/lib/siico-api-1.2.0.jar
  inflating: ear_extracted/lib/spring-data-jpa-1.11.8.RELEASE.jar
  inflating: ear_extracted/lib/spring-data-commons-1.13.8.RELEASE.jar
  inflating: ear_extracted/lib/spring-orm-4.3.12.RELEASE.jar
  inflating: ear_extracted/lib/spring-jdbc-4.3.12.RELEASE.jar
  inflating: ear_extracted/lib/spring-context-4.3.12.RELEASE.jar
  inflating: ear_extracted/lib/spring-expression-4.3.12.RELEASE.jar
  inflating: ear_extracted/lib/spring-aop-4.3.12.RELEASE.jar
  inflating: ear_extracted/lib/spring-tx-4.3.12.RELEASE.jar
  inflating: ear_extracted/lib/spring-beans-4.3.12.RELEASE.jar
  inflating: ear_extracted/lib/spring-core-4.3.12.RELEASE.jar
  inflating: ear_extracted/lib/aspectjrt-1.8.10.jar
  inflating: ear_extracted/lib/jcl-over-slf4j-1.7.25.jar
  inflating: ear_extracted/lib/commons-lang3-3.5.jar
  inflating: ear_extracted/lib/mapstruct-1.4.1.Final.jar
  inflating: ear_extracted/lib/mapstruct-processor-1.4.1.Final.jar
  inflating: ear_extracted/lib/amsfw-api-1.0.60.jar
  inflating: ear_extracted/lib/quartz-2.3.2.jar
  inflating: ear_extracted/lib/c3p0-0.9.5.4.jar
  inflating: ear_extracted/lib/mchange-commons-java-0.2.15.jar
  inflating: ear_extracted/lib/HikariCP-java7-2.4.13.jar
  inflating: ear_extracted/lib/logback-classic-1.2.3.jar
  inflating: ear_extracted/lib/logback-core-1.2.3.jar
  inflating: ear_extracted/lib/hibernate-entitymanager-5.0.10.Final.jar
  inflating: ear_extracted/lib/dom4j-1.6.1.jar
  inflating: ear_extracted/lib/xml-apis-1.0.b2.jar
  inflating: ear_extracted/lib/hibernate-jpa-2.1-api-1.0.0.Final.jar
  inflating: ear_extracted/lib/geronimo-jta_1.1_spec-1.1.1.jar
  inflating: ear_extracted/lib/commons-beanutils-1.8.0.jar
  inflating: ear_extracted/lib/commons-logging-1.1.1.jar
  inflating: ear_extracted/lib/commons-io-1.4.jar
  inflating: ear_extracted/lib/itext-2.1.7.jar
  inflating: ear_extracted/lib/jboss-logging-3.4.3.Final.jar
  inflating: ear_extracted/lib/hibernate-commons-annotations-5.1.2.Final.jar
  inflating: ear_extracted/lib/hibernate-annotations-3.5.6-Final.jar
  inflating: ear_extracted/lib/hibernate-commons-annotations-3.2.0.Final.jar
  inflating: ear_extracted/lib/hibernate-jpa-2.0-api-1.0.1.Final.jar
  inflating: ear_extracted/lib/javassist-3.24.1-GA.jar
  inflating: ear_extracted/lib/gson-2.8.5.jar
  inflating: ear_extracted/lib/commons-collections-3.2.2.redhat-2.jar
  inflating: ear_extracted/lib/util-1.0.jar
  inflating: ear_extracted/lib/ffpojo-1.0.jar
  inflating: ear_extracted/lib/infinispan-core-8.1.8.Final-redhat-1.jar
  inflating: ear_extracted/lib/infinispan-commons-8.1.8.Final-redhat-1.jar
  inflating: ear_extracted/lib/jgroups-3.6.4.Final.jar
  inflating: ear_extracted/lib/jboss-transaction-api_1.1_spec-1.0.1.Final.jar
  inflating: ear_extracted/lib/jboss-marshalling-osgi-1.4.10.Final.jar
  inflating: ear_extracted/amsfw-ejb-1.0.60.jar
  inflating: ear_extracted/sisme-ejb-2.93.3.0.jar
   creating: ear_extracted/META-INF/maven/
   creating: ear_extracted/META-INF/maven/br.gov.cef.sisme/
   creating: ear_extracted/META-INF/maven/br.gov.cef.sisme/sisme-ear/
  inflating: ear_extracted/META-INF/maven/br.gov.cef.sisme/sisme-ear/pom.xml
  inflating: ear_extracted/META-INF/maven/br.gov.cef.sisme/sisme-ear/pom.properties
-sh-4.2$ which jar
/usr/bin/which: no jar in (/usr/local/bin:/usr/bin:/usr/local/sbin:/usr/sbin)
-sh-4.2$ jar tf /opt/jboss-eap/standalone/deployments/sisme-ear.ear | head -20
-sh: jar: comando não encontrado
-sh-4.2$ mkdir ear_extracted && cd ear_extracted
mkdir: é impossível criar o diretório “ear_extracted”: Arquivo existe
-sh-4.2$ jar xf /opt/jboss-eap/standalone/deployments/sisme-ear.ear
-sh: jar: comando não encontrado
-sh-4.2$ ls -la
total 4
drwxr-xr-x   3 p585600 usucef   27 Jul  2 19:39 .
drwxrwxrwt. 15 root    root   4096 Jul  2 19:37 ..
drwxr-xr-x   4 p585600 usucef  121 Jul  2 19:39 ear_extracted
-sh-4.2$
