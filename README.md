-sh-4.2$ sh /deployments/run-java.sh
sh: /deployments/run-java.sh: Arquivo ou diretório não encontrado
-sh-4.2$ oc debug dc/sicfd-monitoramento-des -n sicfd-des -c sicfd-monitoramento-des
Debugging with pod/sicfd-monitoramento-des-debug, original command: <image entrypoint>
Waiting for pod to start ...
If you don't see a command prompt, try pressing enter.
sh-4.4$ ls -la /usr/src/app/secrets_files/SICFD_DES/
total 24
drwxr-xr-x. 2 1337 root 160 Sep 16 17:05 .
drwxrwxrwt. 3 root root  60 Sep 16 17:05 ..
-rw-r--r--. 1 1337 root  36 Sep 16 17:05 CLISERCFD_SSO_INTRA
-rw-r--r--. 1 1337 root 661 Sep 16 17:05 CLISERCFD_SSO_INTRA_Metadata
-rw-r--r--. 1 1337 root   8 Sep 16 17:05 SCFDDR02_DB2
-rw-r--r--. 1 1337 root 649 Sep 16 17:05 SCFDDR02_DB2_Metadata
-rw-r--r--. 1 1337 root   9 Sep 16 17:05 SCFDRD01_ORACLE
-rw-r--r--. 1 1337 root 668 Sep 16 17:05 SCFDRD01_ORACLE_Metadata
sh-4.4$ cat /usr/src/app/secrets_files/SICFD_DES/SCFDRD01_ORACLE
c5f8d4dessh-4.4$ export SPRING_DATASOURCE_PASSWORD="$(cat /usr/src/app/secrets_files/SICFD_DES/SCFDRD01_ORACLE)"
sh-4.4$ sh /deployments/run-java.sh
exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/monitora-0.0.1-SNAPSHOT.jar

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::               (v2.7.13)

2026-09-16 17:05:54.721  INFO 10 --- [           main] b.g.caixa.monitora.MonitoraApplication   : Starting MonitoraApplication v0.0.1-SNAPSHOT using Java 11.0.14 on sicfd-monitoramento-des-debug with PID 10 (/deployments/monitora-0.0.1-SNAPSHOT.jar started by 1001 in /deployments)
2026-09-16 17:05:54.724  INFO 10 --- [           main] b.g.caixa.monitora.MonitoraApplication   : No active profile set, falling back to 1 default profile: "default"
2026-09-16 17:05:58.936  INFO 10 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2026-09-16 17:05:59.013  INFO 10 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-09-16 17:05:59.014  INFO 10 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.76]
2026-09-16 17:05:59.118  INFO 10 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-09-16 17:05:59.118  INFO 10 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 4196 ms
2026-09-16 17:06:00.518  INFO 10 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-09-16 17:06:01.439  INFO 10 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2026-09-16 17:06:06.213  INFO 10 --- [           main] o.s.b.c.r.s.JobRepositoryFactoryBean     : No database type set, using meta data indicating: ORACLE
2026-09-16 17:06:06.312  INFO 10 --- [           main] o.s.b.c.l.support.SimpleJobLauncher      : No TaskExecutor has been set, defaulting to synchronous executor.
2026-09-16 17:06:07.808  INFO 10 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2026-09-16 17:06:07.821  INFO 10 --- [           main] b.g.caixa.monitora.MonitoraApplication   : Started MonitoraApplication in 15.51 seconds (JVM running for 16.762)

