2026-09-24T13:39:31.2656401Z ##[section]Starting: Maven
2026-09-24T13:39:31.2664747Z ==============================================================================
2026-09-24T13:39:31.2664861Z Task         : Maven
2026-09-24T13:39:31.2664913Z Description  : Build, test, and deploy with Apache Maven
2026-09-24T13:39:31.2665017Z Version      : 3.225.0
2026-09-24T13:39:31.2665065Z Author       : Microsoft Corporation
2026-09-24T13:39:31.2665120Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/build/maven
2026-09-24T13:39:31.2665230Z ==============================================================================
2026-09-24T13:39:31.9038754Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -version
2026-09-24T13:39:31.9905150Z WARNING: A restricted method in java.lang.System has been called
2026-09-24T13:39:31.9906846Z WARNING: java.lang.System::load has been called by org.fusesource.jansi.internal.JansiLoader in an unnamed module (file:/opt/apache-maven/apache-maven-3.8.5/lib/jansi-2.4.0.jar)
2026-09-24T13:39:31.9907599Z WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
2026-09-24T13:39:31.9908642Z WARNING: Restricted methods will be blocked in a future release unless native access is enabled
2026-09-24T13:39:31.9908779Z 
2026-09-24T13:39:32.0229183Z Apache Maven 3.8.5 (3599d3414f046de2324203b78ddcf9b5e4388aa0)
2026-09-24T13:39:32.0229792Z Maven home: /opt/apache-maven/apache-maven-3.8.5
2026-09-24T13:39:32.0230128Z Java version: 25.0.3, vendor: Red Hat, Inc., runtime: /usr/java/open-jdk-25.0.3
2026-09-24T13:39:32.0230314Z Default locale: pt_BR, platform encoding: UTF-8
2026-09-24T13:39:32.0230528Z OS name: "linux", version: "5.18.5-100.fc35.x86_64", arch: "amd64", family: "unix"
2026-09-24T13:39:32.0323938Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -f /opt/ads-agent/_work/26/s/pom.xml clean package -U
2026-09-24T13:39:32.1377367Z WARNING: A restricted method in java.lang.System has been called
2026-09-24T13:39:32.1379536Z WARNING: java.lang.System::load has been called by org.fusesource.jansi.internal.JansiLoader in an unnamed module (file:/opt/apache-maven/apache-maven-3.8.5/lib/jansi-2.4.0.jar)
2026-09-24T13:39:32.1379913Z WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
2026-09-24T13:39:32.1380267Z WARNING: Restricted methods will be blocked in a future release unless native access is enabled
2026-09-24T13:39:32.1380346Z 
2026-09-24T13:39:32.3153542Z WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
2026-09-24T13:39:32.3154366Z WARNING: sun.misc.Unsafe::objectFieldOffset has been called by com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper (file:/opt/apache-maven/apache-maven-3.8.5/lib/guava-25.1-android.jar)
2026-09-24T13:39:32.3154714Z WARNING: Please consider reporting this to the maintainers of class com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper
2026-09-24T13:39:32.3154944Z WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
2026-09-24T13:39:32.8053008Z [INFO] Scanning for projects...
2026-09-24T13:39:33.6559121Z [INFO] 
2026-09-24T13:39:33.6559726Z [INFO] ------------------< br.gov.caixa.sirta.gtt:sirta-gtt >------------------
2026-09-24T13:39:33.6559993Z [INFO] Building sirta-gtt 0.0.0.1-SNAPSHOT
2026-09-24T13:39:33.6560239Z [INFO] ------------------------------[ quarkus ]-------------------------------
2026-09-24T13:39:34.1160145Z [INFO] 
2026-09-24T13:39:34.1161115Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ sirta-gtt ---
2026-09-24T13:39:34.1441895Z [INFO] Deleting /opt/ads-agent/_work/26/s/target
2026-09-24T13:39:34.1562105Z [INFO] 
2026-09-24T13:39:34.1563612Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ sirta-gtt ---
2026-09-24T13:39:34.2181649Z [INFO] Copying 1 resource from src/main/resources to target/classes
2026-09-24T13:39:34.2234410Z [INFO] 
2026-09-24T13:39:34.2235011Z [INFO] --- quarkus-maven-plugin:3.39.5:generate-code (default-generate-code) @ sirta-gtt ---
2026-09-24T13:39:34.4054366Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/br/gov/caixa/sirta/gtt/sirta-gtt/0.0.0.1-SNAPSHOT/maven-metadata.xml
2026-09-24T13:39:36.9094051Z [INFO] 
2026-09-24T13:39:36.9094993Z [INFO] --- maven-compiler-plugin:3.15.0:compile (default-compile) @ sirta-gtt ---
2026-09-24T13:39:36.9853345Z [INFO] Recompiling the module because of changed source code.
2026-09-24T13:39:36.9916551Z [INFO] Compiling 7 source files with javac [debug parameters release 25] to target/classes
2026-09-24T13:39:37.9364656Z [INFO] 
2026-09-24T13:39:37.9365437Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ sirta-gtt ---
2026-09-24T13:39:37.9404591Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/26/s/src/test/resources
2026-09-24T13:39:37.9404985Z [INFO] 
2026-09-24T13:39:37.9405302Z [INFO] --- quarkus-maven-plugin:3.39.5:generate-code-tests (default-generate-code-tests) @ sirta-gtt ---
2026-09-24T13:39:38.9320245Z [INFO] 
2026-09-24T13:39:38.9321286Z [INFO] --- maven-compiler-plugin:3.15.0:testCompile (default-testCompile) @ sirta-gtt ---
2026-09-24T13:39:38.9405164Z [INFO] Recompiling the module because of changed dependency.
2026-09-24T13:39:38.9405948Z [INFO] Compiling 2 source files with javac [debug parameters release 25] to target/test-classes
2026-09-24T13:39:39.3236697Z [INFO] 
2026-09-24T13:39:39.3237300Z [INFO] --- maven-surefire-plugin:3.5.6:test (default-test) @ sirta-gtt ---
2026-09-24T13:39:39.4182887Z [INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
2026-09-24T13:39:39.4415746Z [INFO] 
2026-09-24T13:39:39.4416370Z [INFO] -------------------------------------------------------
2026-09-24T13:39:39.4416781Z [INFO]  T E S T S
2026-09-24T13:39:39.4417036Z [INFO] -------------------------------------------------------
2026-09-24T13:39:43.9391113Z [INFO] Running br.gov.caixa.sirta.gtt.GreetingResourceTest
2026-09-24T13:39:44.3469938Z 2026-09-24 10:39:44,250 INFO  [org.hibernate.orm.jpa] (main) HHH008540: Processing PersistenceUnitInfo [name: <default>]
2026-09-24T13:39:44.4449523Z 2026-09-24 10:39:44,384 INFO  [org.hibernate.orm.core] (main) HHH000001: Hibernate ORM core version 7.4.9.Final
2026-09-24T13:39:44.5459221Z 2026-09-24 10:39:44,529 WARN  [org.hibernate.orm.deprecation] (main) HHH90000025: H2Dialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2026-09-24T13:39:44.5459836Z 2026-09-24 10:39:44,539 INFO  [org.hibernate.orm.connections.pooling] (main) HHH10001005: Database info:
2026-09-24T13:39:44.5460064Z 	Database JDBC URL [undefined/unknown]
2026-09-24T13:39:44.5460370Z 	Database driver: undefined/unknown
2026-09-24T13:39:44.5460545Z 	Database dialect: H2Dialect
2026-09-24T13:39:44.5460690Z 	Database version: 2.4.240
2026-09-24T13:39:44.5460836Z 	Default catalog/schema: unknown/unknown
2026-09-24T13:39:44.5460986Z 	Autocommit mode: undefined/unknown
2026-09-24T13:39:44.5461096Z 	Isolation level: <unknown>
2026-09-24T13:39:44.5461355Z 	JDBC fetch size: undefined/unknown
2026-09-24T13:39:44.5461499Z 	Pool: undefined/unknown
2026-09-24T13:39:44.5461650Z 	Minimum pool size: undefined/unknown
2026-09-24T13:39:44.5461821Z 	Maximum pool size: undefined/unknown
2026-09-24T13:39:44.7465542Z 2026-09-24 10:39:44,681 INFO  [org.hibernate.validator.internal.util.Version] (main) HV000001: Hibernate Validator 9.1.3.Final
2026-09-24T13:39:45.0490419Z 2026-09-24 10:39:45,032 WARN  [io.quarkus.tls.runtime.CertificateRecorder] (main) TLS certificate validation disabled via trust-all configuration - name: <default>
2026-09-24T13:39:45.0490893Z 2026-09-24 10:39:45,032 WARN  [io.quarkus.tls.runtime.CertificateRecorder] (main) This configuration is INSECURE and must not be used in production
2026-09-24T13:39:46.5629288Z 2026-09-24 10:39:46,547 INFO  [io.quarkus] (main) sirta-gtt 0.0.0.1-SNAPSHOT on JVM (powered by Quarkus 3.39.5) started in 5.785s. Listening on: http://localhost:8081
2026-09-24T13:39:46.5630036Z 2026-09-24 10:39:46,548 INFO  [io.quarkus] (main) Profile test activated. 
2026-09-24T13:39:46.5631103Z 2026-09-24 10:39:46,548 INFO  [io.quarkus] (main) Installed features: [agroal, cdi, hibernate-orm, hibernate-orm-panache, hibernate-validator, jdbc-h2, jdbc-oracle, keycloak-authorization, narayana-jta, oidc, rest, rest-jackson, security, smallrye-context-propagation, smallrye-health, smallrye-openapi, swagger-ui, vertx]
2026-09-24T13:39:47.4976163Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.534 s -- in br.gov.caixa.sirta.gtt.GreetingResourceTest
2026-09-24T13:39:47.5117444Z 2026-09-24 10:39:47,500 INFO  [io.quarkus] (main) sirta-gtt stopped in 0.029s
2026-09-24T13:39:47.5540145Z [INFO] 
2026-09-24T13:39:47.5540361Z [INFO] Results:
2026-09-24T13:39:47.5540972Z [INFO] 
2026-09-24T13:39:47.5543454Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
2026-09-24T13:39:47.5544357Z [INFO] 
2026-09-24T13:39:47.5574212Z [INFO] 
2026-09-24T13:39:47.5574770Z [INFO] --- quarkus-maven-plugin:3.39.5:build (default-build) @ sirta-gtt ---
2026-09-24T13:39:51.4457304Z [INFO] [io.quarkus.deployment.QuarkusAugmentor] Quarkus augmentation completed in 3670ms
2026-09-24T13:39:51.5593283Z [INFO] ------------------------------------------------------------------------
2026-09-24T13:39:51.5593942Z [INFO] BUILD SUCCESS
2026-09-24T13:39:51.5594195Z [INFO] ------------------------------------------------------------------------
2026-09-24T13:39:51.5603721Z [INFO] Total time:  18.769 s
2026-09-24T13:39:51.5605860Z [INFO] Finished at: 2026-09-24T10:39:51-03:00
2026-09-24T13:39:51.5606124Z [INFO] ------------------------------------------------------------------------
2026-09-24T13:39:51.6572824Z ##[section]Finishing: Maven
