sh-4.4$ export SPRING_DATASOURCE_PASSWORD=c5f8d4des
sh-4.4$ sh /deployments/run-java.sh
exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/monitora-0.0.1-SNAPSHOT.jar

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::               (v2.7.13)

2026-09-16 16:59:47.080  INFO 178 --- [           main] b.g.caixa.monitora.MonitoraApplication   : Starting MonitoraApplication v0.0.1-SNAPSHOT using Java 11.0.14 on sicfd-monitoramento-des-debug with PID 178 (/deployments/monitora-0.0.1-SNAPSHOT.jar started by 1001 in /deployments)
2026-09-16 16:59:47.082  INFO 178 --- [           main] b.g.caixa.monitora.MonitoraApplication   : No active profile set, falling back to 1 default profile: "default"
2026-09-16 16:59:51.677  INFO 178 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2026-09-16 16:59:51.685  INFO 178 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-09-16 16:59:51.685  INFO 178 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.76]
2026-09-16 16:59:51.867  INFO 178 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-09-16 16:59:51.867  INFO 178 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 4496 ms
2026-09-16 16:59:53.173  INFO 178 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-09-16 16:59:54.199  INFO 178 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2026-09-16 16:59:58.575  INFO 178 --- [           main] o.s.b.c.r.s.JobRepositoryFactoryBean     : No database type set, using meta data indicating: ORACLE
2026-09-16 16:59:58.678  INFO 178 --- [           main] o.s.b.c.l.support.SimpleJobLauncher      : No TaskExecutor has been set, defaulting to synchronous executor.
2026-09-16 16:59:59.972  INFO 178 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2026-09-16 17:00:00.062  INFO 178 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 17:00:00.070  INFO 178 --- [           main] b.g.caixa.monitora.MonitoraApplication   : Started MonitoraApplication in 15.294 seconds (JVM running for 16.637)
2026-09-16 17:00:01.286  INFO 178 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789588800065}]
2026-09-16 17:00:01.664  INFO 178 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 17:00:01.762  INFO 178 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 17:00:02.229  INFO 178 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26705145,26710349,26223111,26243077,26243849,26089823,26254134,26256712,26285340,26053718
2026-09-16 17:00:02.229  INFO 178 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 17:00:02.251  INFO 178 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 17:00:02.252  INFO 178 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 17:00:02.252  INFO 178 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 17:00:02.274  INFO 178 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 608ms
2026-09-16 17:00:02.296  INFO 178 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789588800065}] and the following status: [COMPLETED] in 822ms
2026-09-16 17:00:02.296  INFO 178 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED

