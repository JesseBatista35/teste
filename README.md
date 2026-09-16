exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -Doracle.jdbc.javaNetNio=false -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/monitora-0.0.1-SNAPSHOT.jar

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::               (v2.7.13)

2026-09-15 20:30:41.373  INFO 8 --- [           main] b.g.caixa.monitora.MonitoraApplication   : Starting MonitoraApplication v0.0.1-SNAPSHOT using Java 11.0.14 on sicfd-monitoramento-des-88-l6lxl with PID 8 (/deployments/monitora-0.0.1-SNAPSHOT.jar started by 1001 in /deployments)
2026-09-15 20:30:41.376  INFO 8 --- [           main] b.g.caixa.monitora.MonitoraApplication   : No active profile set, falling back to 1 default profile: "default"
2026-09-15 20:30:46.467  INFO 8 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2026-09-15 20:30:46.556  INFO 8 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-09-15 20:30:46.556  INFO 8 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.76]
2026-09-15 20:30:46.669  INFO 8 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-09-15 20:30:46.670  INFO 8 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 5097 ms
2026-09-15 20:30:48.161  INFO 8 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-09-15 20:30:49.493  INFO 8 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2026-09-15 20:30:53.667  INFO 8 --- [           main] o.s.b.c.r.s.JobRepositoryFactoryBean     : No database type set, using meta data indicating: ORACLE
2026-09-15 20:30:53.763  INFO 8 --- [           main] o.s.b.c.l.support.SimpleJobLauncher      : No TaskExecutor has been set, defaulting to synchronous executor.
2026-09-15 20:30:55.262  INFO 8 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2026-09-15 20:30:55.361  INFO 8 --- [           main] b.g.caixa.monitora.MonitoraApplication   : Started MonitoraApplication in 15.897 seconds (JVM running for 17.159)
2026-09-15 20:35:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 20:35:00.575  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789515300002}]
2026-09-15 20:35:00.617  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 20:35:00.669  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 20:35:00.764  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26484055,26485172,26486381,26494724,26497950,26504502,26505440,26514282,26516613,26518193
2026-09-15 20:35:00.765  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 20:35:00.779  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 20:35:00.779  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 20:35:00.779  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 20:35:00.793  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 176ms
2026-09-15 20:35:00.809  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789515300002}] and the following status: [COMPLETED] in 214ms
2026-09-15 20:35:00.809  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 20:40:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 20:40:00.037  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789515600001}]
2026-09-15 20:40:00.061  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 20:40:00.070  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 20:40:00.153  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26520657,26521781,26522303,26529322,26539594,26542773,26544565,26563233,26559321,26561207
2026-09-15 20:40:00.153  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 20:40:00.160  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 20:40:00.161  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 20:40:00.161  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 20:40:00.176  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 115ms
2026-09-15 20:40:00.193  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789515600001}] and the following status: [COMPLETED] in 148ms
2026-09-15 20:40:00.193  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 20:45:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 20:45:00.035  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789515900001}]
2026-09-15 20:45:00.059  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 20:45:00.068  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 20:45:00.137  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26567565,26568239,26090391,26529316,26568952,26574614,26589801,26580294,26586905,26587527
2026-09-15 20:45:00.137  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 20:45:00.148  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 20:45:00.148  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 20:45:00.148  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 20:45:00.161  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 101ms
2026-09-15 20:45:00.174  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789515900001}] and the following status: [COMPLETED] in 132ms
2026-09-15 20:45:00.174  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 20:50:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 20:50:00.049  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789516200001}]
2026-09-15 20:50:00.074  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 20:50:00.083  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 20:50:00.168  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26590066,26731521,26744650,26744792,27407106,26758725,27029836,27127672,27188067,27206869
2026-09-15 20:50:00.169  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 20:50:00.177  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 20:50:00.178  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 20:50:00.178  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 20:50:00.189  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 115ms
2026-09-15 20:50:00.202  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789516200001}] and the following status: [COMPLETED] in 147ms
2026-09-15 20:50:00.203  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 20:55:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 20:55:00.032  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789516500000}]
2026-09-15 20:55:00.057  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 20:55:00.069  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 20:55:00.136  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27447232,27479047,27485771,26455091,26506401,26686402,26152267,26226774,26230221,26354259
2026-09-15 20:55:00.137  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 20:55:00.145  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 20:55:00.145  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 20:55:00.145  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 20:55:00.156  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 99ms
2026-09-15 20:55:00.174  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789516500000}] and the following status: [COMPLETED] in 136ms
2026-09-15 20:55:00.174  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 21:00:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 21:00:00.033  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789516800001}]
2026-09-15 21:00:00.058  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 21:00:00.073  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 21:00:00.145  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26711465,26901340,27630760,26745355,26748405,26750223,26870172,26859821,27652780,26865019
2026-09-15 21:00:00.145  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 21:00:00.155  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 21:00:00.156  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 21:00:00.156  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 21:00:00.171  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 113ms
2026-09-15 21:00:00.191  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789516800001}] and the following status: [COMPLETED] in 150ms
2026-09-15 21:00:00.191  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 21:05:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 21:05:00.044  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789517100000}]
2026-09-15 21:05:00.069  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 21:05:00.078  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 21:05:00.162  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26897488,26930322,26932446,26949737,26950777,26954886,26840386,26733694,26780185,26811081
2026-09-15 21:05:00.162  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 21:05:00.175  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 21:05:00.175  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 21:05:00.175  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 21:05:00.188  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 119ms
2026-09-15 21:05:00.200  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789517100000}] and the following status: [COMPLETED] in 150ms
2026-09-15 21:05:00.201  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 21:10:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 21:10:00.030  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789517400000}]
2026-09-15 21:10:00.063  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 21:10:00.071  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 21:10:00.313  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26770544,27020298,27047024,27146563,27076570,27076994,27091906,27107379,27135187,27143838
2026-09-15 21:10:00.314  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 21:10:00.321  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 21:10:00.321  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 21:10:00.321  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 21:10:00.336  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 272ms
2026-09-15 21:10:00.350  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789517400000}] and the following status: [COMPLETED] in 314ms
2026-09-15 21:10:00.351  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 21:15:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 21:15:00.029  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789517700000}]
2026-09-15 21:15:00.061  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 21:15:00.070  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 21:15:00.159  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27167934,27182685,27195975,27222105,27047550,27169693,27223347,27209839,26994911,27031846
2026-09-15 21:15:00.159  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 21:15:00.168  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 21:15:00.168  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 21:15:00.168  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 21:15:00.179  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 118ms
2026-09-15 21:15:00.192  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789517700000}] and the following status: [COMPLETED] in 158ms
2026-09-15 21:15:00.192  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 21:20:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 21:20:00.029  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789518000001}]
2026-09-15 21:20:00.049  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 21:20:00.057  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 21:20:00.129  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27287759,26847514,27068302,27078354,27134227,26805267,26825152,27120106,27160556,26824170
2026-09-15 21:20:00.129  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 21:20:00.138  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 21:20:00.138  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 21:20:00.138  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 21:20:00.149  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 100ms
2026-09-15 21:20:00.160  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789518000001}] and the following status: [COMPLETED] in 125ms
2026-09-15 21:20:00.161  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 21:25:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 21:25:00.030  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789518300000}]
2026-09-15 21:25:00.050  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 21:25:00.059  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 21:25:00.136  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27318475,27606822,26771134,27337533,27369175,27345803,27352462,27362366,27364008,27365228
2026-09-15 21:25:00.136  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 21:25:00.145  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 21:25:00.145  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 21:25:00.145  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 21:25:00.155  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 105ms
2026-09-15 21:25:00.167  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789518300000}] and the following status: [COMPLETED] in 132ms
2026-09-15 21:25:00.167  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 21:30:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 21:30:00.062  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789518600001}]
2026-09-15 21:30:00.091  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 21:30:00.100  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 21:30:00.187  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27373308,27393834,27404179,27421155,27471383,27439250,27440145,27447744,27463730,27471274
2026-09-15 21:30:00.187  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 21:30:00.204  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 21:30:00.205  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 21:30:00.205  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 21:30:00.217  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 126ms
2026-09-15 21:30:00.229  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789518600001}] and the following status: [COMPLETED] in 162ms
2026-09-15 21:30:00.230  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 21:35:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 21:35:00.046  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789518900000}]
2026-09-15 21:35:00.079  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 21:35:00.085  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 21:35:00.421  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27471828,27476483,27476935,27478502,27481471,27488284,27514672,27498328,27505788,27509467
2026-09-15 21:35:00.421  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 21:35:00.430  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 21:35:00.431  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 21:35:00.431  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 21:35:00.440  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 361ms
2026-09-15 21:35:00.457  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789518900000}] and the following status: [COMPLETED] in 407ms
2026-09-15 21:35:00.457  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 21:40:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 21:40:00.026  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789519200000}]
2026-09-15 21:40:00.045  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 21:40:00.053  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 21:40:00.121  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27521188,27583915,27592082,27287698,27163252,27164048,27185796,27203050,27217342,27231549
2026-09-15 21:40:00.121  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 21:40:00.130  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 21:40:00.130  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 21:40:00.130  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 21:40:00.140  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 94ms
2026-09-15 21:40:00.151  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789519200000}] and the following status: [COMPLETED] in 119ms
2026-09-15 21:40:00.151  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 21:45:00.004  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 21:45:00.060  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789519500005}]
2026-09-15 21:45:00.094  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 21:45:00.106  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 21:45:00.171  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27301349,27381790,27389041,27460709,27398423,27400301,27408640,27426471,27426803,27449795
2026-09-15 21:45:00.171  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 21:45:00.184  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 21:45:00.184  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 21:45:00.185  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 21:45:00.206  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 111ms
2026-09-15 21:45:00.237  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789519500005}] and the following status: [COMPLETED] in 167ms
2026-09-15 21:45:00.237  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 21:50:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 21:50:00.027  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789519800001}]
2026-09-15 21:50:00.043  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 21:50:00.050  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 21:50:00.104  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27512281,27535239,27536011,27549384,27555104,27587807,27574200,27561147,27561268,27566065
2026-09-15 21:50:00.104  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 21:50:00.113  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 21:50:00.114  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 21:50:00.114  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 21:50:00.123  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 80ms
2026-09-15 21:50:00.133  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789519800001}] and the following status: [COMPLETED] in 102ms
2026-09-15 21:50:00.133  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 21:55:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 21:55:00.028  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789520100001}]
2026-09-15 21:55:00.045  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 21:55:00.052  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 21:55:00.107  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27614251,26724901,26061760,26310284,26094783,26122605,26129242,26135202,26277920,26281902
2026-09-15 21:55:00.107  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 21:55:00.116  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 21:55:00.116  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 21:55:00.116  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 21:55:00.124  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 79ms
2026-09-15 21:55:00.134  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789520100001}] and the following status: [COMPLETED] in 102ms
2026-09-15 21:55:00.134  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 22:00:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 22:00:00.055  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789520400000}]
2026-09-15 22:00:00.102  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 22:00:00.116  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 22:00:00.881  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26322769,26392759,26396845,26403344,26456254,27047970,26896774,26916193,27007431,27036186
2026-09-15 22:00:00.881  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 22:00:00.894  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 22:00:00.894  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 22:00:00.894  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 22:00:00.906  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 804ms
2026-09-15 22:00:00.918  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789520400000}] and the following status: [COMPLETED] in 858ms
2026-09-15 22:00:00.919  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 22:05:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 22:05:00.077  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789520700000}]
2026-09-15 22:05:00.124  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 22:05:00.132  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 22:05:00.643  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27061032,27064459,27069445,27102483,27104876,27574562,27116501,27187398,27203647,27220150
2026-09-15 22:05:00.643  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 22:05:00.654  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 22:05:00.655  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 22:05:00.655  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 22:05:00.665  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 541ms
2026-09-15 22:05:00.676  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789520700000}] and the following status: [COMPLETED] in 594ms
2026-09-15 22:05:00.676  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 22:10:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 22:10:00.028  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789521000001}]
2026-09-15 22:10:00.051  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 22:10:00.058  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 22:10:00.121  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27576466,27576763,27581901,27582369,27583288,27590591,27619320,27591516,27594874,27595532
2026-09-15 22:10:00.121  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 22:10:00.131  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 22:10:00.131  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 22:10:00.131  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 22:10:00.141  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 90ms
2026-09-15 22:10:00.153  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789521000001}] and the following status: [COMPLETED] in 119ms
2026-09-15 22:10:00.153  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 22:15:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 22:15:00.030  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789521300000}]
2026-09-15 22:15:00.050  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 22:15:00.058  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 22:15:00.126  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27624280,27630284,27644500,26835401,26735391,26769314,26804206,26819596,26823478,26831858
2026-09-15 22:15:00.126  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 22:15:00.146  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 22:15:00.146  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 22:15:00.146  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 22:15:00.162  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 112ms
2026-09-15 22:15:00.183  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789521300000}] and the following status: [COMPLETED] in 144ms
2026-09-15 22:15:00.184  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 22:20:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 22:20:00.028  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789521600000}]
2026-09-15 22:20:00.048  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 22:20:00.057  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 22:20:00.118  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27012107,27026361,27056938,27181261,27221170,27221328,27291318,27115446,27157245,27208369
2026-09-15 22:20:00.118  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 22:20:00.128  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 22:20:00.129  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 22:20:00.129  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 22:20:00.138  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 90ms
2026-09-15 22:20:00.152  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789521600000}] and the following status: [COMPLETED] in 117ms
2026-09-15 22:20:00.152  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 22:25:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 22:25:00.029  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789521900000}]
2026-09-15 22:25:00.048  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 22:25:00.057  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 22:25:00.132  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27313205,27317819,27361495,27365151,27366748,27380799,27538456,27411839,27422044,27434441
2026-09-15 22:25:00.133  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 22:25:00.143  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 22:25:00.143  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 22:25:00.143  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 22:25:00.154  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 105ms
2026-09-15 22:25:00.178  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789521900000}] and the following status: [COMPLETED] in 143ms
2026-09-15 22:25:00.178  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 22:30:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 22:30:00.062  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789522200001}]
2026-09-15 22:30:00.103  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 22:30:00.114  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 22:30:00.484  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26515247,26571194,26571911,26618613,26709140,26688652,26697425,26698118,26698853,26704190
2026-09-15 22:30:00.484  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 22:30:00.497  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 22:30:00.497  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 22:30:00.498  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 22:30:00.509  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 405ms
2026-09-15 22:30:00.521  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789522200001}] and the following status: [COMPLETED] in 452ms
2026-09-15 22:30:00.521  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 22:35:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 22:35:00.054  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789522500001}]
2026-09-15 22:35:00.081  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 22:35:00.088  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 22:35:00.171  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26711285,26855714,26861294,26868754,26870573,26929512,26893990,26894546,26903140,26917675
2026-09-15 22:35:00.171  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 22:35:00.182  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 22:35:00.182  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 22:35:00.182  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 22:35:00.193  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 112ms
2026-09-15 22:35:00.204  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789522500001}] and the following status: [COMPLETED] in 144ms
2026-09-15 22:35:00.204  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 22:40:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 22:40:00.029  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789522800001}]
2026-09-15 22:40:00.049  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 22:40:00.057  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 22:40:00.126  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26938285,26953149,26953883,26975897,26976481,27206944,27217345,26842326,26733579,26777946
2026-09-15 22:40:00.126  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 22:40:00.139  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 22:40:00.139  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 22:40:00.139  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 22:40:00.150  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 101ms
2026-09-15 22:40:00.169  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789522800001}] and the following status: [COMPLETED] in 128ms
2026-09-15 22:40:00.169  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 22:45:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 22:45:00.029  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789523100001}]
2026-09-15 22:45:00.047  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 22:45:00.054  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 22:45:00.125  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26781358,26803443,27123869,27146712,26893463,26747765,26938991,27220875,27383774,27471334
2026-09-15 22:45:00.125  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 22:45:00.136  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 22:45:00.136  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 22:45:00.136  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 22:45:00.146  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 99ms
2026-09-15 22:45:00.157  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789523100001}] and the following status: [COMPLETED] in 123ms
2026-09-15 22:45:00.157  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 22:50:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 22:50:00.028  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789523400001}]
2026-09-15 22:50:00.046  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 22:50:00.053  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 22:50:00.120  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27476856,27510829,26046375,26650276,26135855,26167057,26376692,26392688,26448805,26571673
2026-09-15 22:50:00.120  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 22:50:00.132  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 22:50:00.132  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 22:50:00.132  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 22:50:00.143  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 97ms
2026-09-15 22:50:00.153  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789523400001}] and the following status: [COMPLETED] in 121ms
2026-09-15 22:50:00.153  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 22:55:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 22:55:00.026  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789523700001}]
2026-09-15 22:55:00.044  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 22:55:00.051  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 22:55:00.125  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26695398,26776174,26786053,26799553,26806881,27004843,26761184,27620182,27621069,26760393
2026-09-15 22:55:00.126  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 22:55:00.136  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 22:55:00.136  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 22:55:00.136  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 22:55:00.148  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 104ms
2026-09-15 22:55:00.160  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789523700001}] and the following status: [COMPLETED] in 128ms
2026-09-15 22:55:00.160  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 23:00:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 23:00:00.056  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789524000000}]
2026-09-15 23:00:00.084  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 23:00:00.091  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 23:00:00.386  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27631874,27637585,27606890,27630398,27345137,26720458,26763030,27229116,27231787,27309507
2026-09-15 23:00:00.386  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 23:00:00.396  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 23:00:00.396  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 23:00:00.396  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 23:00:00.405  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 321ms
2026-09-15 23:00:00.417  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789524000000}] and the following status: [COMPLETED] in 356ms
2026-09-15 23:00:00.417  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 23:05:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 23:05:00.022  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789524300000}]
2026-09-15 23:05:00.040  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 23:05:00.047  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 23:05:00.134  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27396591,27410148,27454087,27091359,27017884,27029606,27037914,27041727,27065692,27076978
2026-09-15 23:05:00.135  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 23:05:00.145  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 23:05:00.146  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 23:05:00.146  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 23:05:00.155  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 115ms
2026-09-15 23:05:00.164  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789524300000}] and the following status: [COMPLETED] in 138ms
2026-09-15 23:05:00.165  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 23:10:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 23:10:00.035  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789524600000}]
2026-09-15 23:10:00.061  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 23:10:00.067  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 23:10:00.413  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27126595,27174796,27197647,27198274,26737516,27214839,27220006,27501066,27533288,27547333
2026-09-15 23:10:00.413  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 23:10:00.424  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 23:10:00.424  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 23:10:00.424  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 23:10:00.433  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 372ms
2026-09-15 23:10:00.447  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789524600000}] and the following status: [COMPLETED] in 408ms
2026-09-15 23:10:00.447  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 23:15:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 23:15:00.037  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789524900001}]
2026-09-15 23:15:00.059  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 23:15:00.065  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 23:15:00.148  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27048227,27194212,27222167,27224360,27352468,27528216,27532225,27575828,27611858,27623857
2026-09-15 23:15:00.149  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 23:15:00.159  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 23:15:00.159  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 23:15:00.159  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 23:15:00.168  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 108ms
2026-09-15 23:15:00.176  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789524900001}] and the following status: [COMPLETED] in 136ms
2026-09-15 23:15:00.176  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 23:20:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 23:20:00.024  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789525200000}]
2026-09-15 23:20:00.043  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 23:20:00.050  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 23:20:00.118  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27587432,27593270,27596961,26876739,26878774,26189503,26888516,26952711,26748929,26022640
2026-09-15 23:20:00.118  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 23:20:00.127  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 23:20:00.127  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 23:20:00.127  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 23:20:00.136  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 93ms
2026-09-15 23:20:00.146  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789525200000}] and the following status: [COMPLETED] in 117ms
2026-09-15 23:20:00.146  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 23:25:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 23:25:00.022  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789525500000}]
2026-09-15 23:25:00.039  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 23:25:00.046  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 23:25:00.099  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26227914,26248123,26312800,26698546,26336410,26343606,26526360,26560288,26591223,26660034
2026-09-15 23:25:00.099  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 23:25:00.110  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 23:25:00.111  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 23:25:00.111  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 23:25:00.120  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 81ms
2026-09-15 23:25:00.131  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789525500000}] and the following status: [COMPLETED] in 104ms
2026-09-15 23:25:00.131  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 23:30:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 23:30:00.059  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789525800000}]
2026-09-15 23:30:00.086  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 23:30:00.094  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 23:30:00.482  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26700220,26739294,26992253,27001641,26740082,26977667,27650944,26849192,26868984,26948852
2026-09-15 23:30:00.482  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 23:30:00.496  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 23:30:00.496  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 23:30:00.496  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 23:30:00.509  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 423ms
2026-09-15 23:30:00.543  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789525800000}] and the following status: [COMPLETED] in 478ms
2026-09-15 23:30:00.543  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 23:35:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 23:35:00.034  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789526100001}]
2026-09-15 23:35:00.052  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 23:35:00.058  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 23:35:00.199  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26983674,26847287,27013057,27029240,26727320,27215810,27061654,27093001,27114277,27180483
2026-09-15 23:35:00.199  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 23:35:00.206  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 23:35:00.206  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 23:35:00.206  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 23:35:00.216  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 164ms
2026-09-15 23:35:00.227  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789526100001}] and the following status: [COMPLETED] in 188ms
2026-09-15 23:35:00.227  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 23:40:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 23:40:00.024  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789526400000}]
2026-09-15 23:40:00.053  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 23:40:00.060  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 23:40:00.128  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26847579,26884470,26907633,26859052,27392477,26933720,26934096,26720338,27292182,27331360
2026-09-15 23:40:00.128  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 23:40:00.138  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 23:40:00.138  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 23:40:00.138  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 23:40:00.147  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 94ms
2026-09-15 23:40:00.158  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789526400000}] and the following status: [COMPLETED] in 129ms
2026-09-15 23:40:00.158  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 23:45:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 23:45:00.056  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789526700001}]
2026-09-15 23:45:00.101  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 23:45:00.111  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 23:45:00.175  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27415364,27468348,27477606,26737061,27585277,27524311,27542387,27556173,27569278,27582441
2026-09-15 23:45:00.175  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 23:45:00.184  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 23:45:00.184  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 23:45:00.184  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 23:45:00.199  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 98ms
2026-09-15 23:45:00.220  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789526700001}] and the following status: [COMPLETED] in 154ms
2026-09-15 23:45:00.220  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 23:50:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 23:50:00.025  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789527000000}]
2026-09-15 23:50:00.043  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 23:50:00.050  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 23:50:00.130  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27036916,27046876,27054028,27070967,27149336,27178908,27036141,27162984,27143030,27158864
2026-09-15 23:50:00.130  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 23:50:00.147  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 23:50:00.147  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 23:50:00.147  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 23:50:00.158  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 115ms
2026-09-15 23:50:00.176  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789527000000}] and the following status: [COMPLETED] in 143ms
2026-09-15 23:50:00.176  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-15 23:55:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-15 23:55:00.024  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789527300001}]
2026-09-15 23:55:00.039  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-15 23:55:00.046  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-15 23:55:00.114  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27036832,27287513,27293006,27296399,27318751,27392799,27487878,27542585,27538715,27530308
2026-09-15 23:55:00.114  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-15 23:55:00.124  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-15 23:55:00.124  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-15 23:55:00.124  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-15 23:55:00.134  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 94ms
2026-09-15 23:55:00.152  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789527300001}] and the following status: [COMPLETED] in 124ms
2026-09-15 23:55:00.152  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 00:00:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 00:00:00.059  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789527600001}]
2026-09-16 00:00:00.095  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 00:00:00.101  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 00:00:00.505  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27623269,27649555,26128807,26135462,26130274,26194055,26221690,26220452,26146093,26085651
2026-09-16 00:00:00.505  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 00:00:00.515  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 00:00:00.516  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 00:00:00.516  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 00:00:00.541  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 446ms
2026-09-16 00:00:00.572  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789527600001}] and the following status: [COMPLETED] in 499ms
2026-09-16 00:00:00.572  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 00:05:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 00:05:00.031  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789527900001}]
2026-09-16 00:05:00.059  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 00:05:00.066  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 00:05:00.432  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26226728,26037460,26096210,26146922,26101812,26152915,26026983,26107027,26049858,26111842
2026-09-16 00:05:00.432  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 00:05:00.444  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 00:05:00.444  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 00:05:00.444  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 00:05:00.461  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 402ms
2026-09-16 00:05:00.484  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789527900001}] and the following status: [COMPLETED] in 436ms
2026-09-16 00:05:00.484  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 00:10:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 00:10:00.155  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789528200000}]
2026-09-16 00:10:00.278  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 00:10:00.342  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 00:10:00.437  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26156222,26052486,26170148,26104108,26124073,26195260,26203041,27158221,27034175,27057069
2026-09-16 00:10:00.437  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 00:10:00.456  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 00:10:00.457  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 00:10:00.457  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 00:10:00.521  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 243ms
2026-09-16 00:10:00.616  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789528200000}] and the following status: [COMPLETED] in 420ms
2026-09-16 00:10:00.616  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 00:15:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 00:15:00.133  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789528500001}]
2026-09-16 00:15:00.232  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 00:15:00.281  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 00:15:00.359  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27192153,27310686,27329530,26270064,27401272,27453341,27488283,27490850,27435246,27509796
2026-09-16 00:15:00.359  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 00:15:00.376  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 00:15:00.376  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 00:15:00.377  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 00:15:00.431  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 199ms
2026-09-16 00:15:00.506  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789528500001}] and the following status: [COMPLETED] in 340ms
2026-09-16 00:15:00.506  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 00:20:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 00:20:00.157  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789528800001}]
2026-09-16 00:20:00.271  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 00:20:00.321  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 00:20:00.444  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26296112,26301183,26324398,26340453,26548463,26344224,26352708,26379827,26382820,26531818
2026-09-16 00:20:00.444  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 00:20:00.458  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 00:20:00.458  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 00:20:00.458  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 00:20:00.519  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 248ms
2026-09-16 00:20:00.609  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789528800001}] and the following status: [COMPLETED] in 413ms
2026-09-16 00:20:00.609  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 00:25:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 00:25:00.139  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789529100001}]
2026-09-16 00:25:00.248  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 00:25:00.292  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 00:25:00.699  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26593066,26623025,26627389,26559828,26704123,26709919,26056426,26073073,26127350,26131114
2026-09-16 00:25:00.699  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 00:25:00.713  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 00:25:00.714  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 00:25:00.714  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 00:25:00.763  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 515ms
2026-09-16 00:25:00.851  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789529100001}] and the following status: [COMPLETED] in 680ms
2026-09-16 00:25:00.851  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 00:30:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 00:30:00.154  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789529400001}]
2026-09-16 00:30:00.266  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 00:30:00.310  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 00:30:00.402  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26577114,26578934,26590291,26622069,26629036,26641615,26687853,26692845,26696742,26704721
2026-09-16 00:30:00.402  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 00:30:00.419  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 00:30:00.419  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 00:30:00.419  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 00:30:00.481  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 215ms
2026-09-16 00:30:00.581  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789529400001}] and the following status: [COMPLETED] in 382ms
2026-09-16 00:30:00.581  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 00:35:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 00:35:00.162  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789529700001}]
2026-09-16 00:35:00.268  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 00:35:00.319  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 00:35:00.405  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26706473,26711400,26716870,26718247,26720268,26726358,26727317,26735699,26737392,26739883
2026-09-16 00:35:00.405  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 00:35:00.422  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 00:35:00.423  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 00:35:00.423  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 00:35:00.474  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 206ms
2026-09-16 00:35:00.553  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789529700001}] and the following status: [COMPLETED] in 353ms
2026-09-16 00:35:00.553  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 00:40:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 00:40:00.133  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789530000001}]
2026-09-16 00:40:00.234  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 00:40:00.272  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 00:40:00.348  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26744774,26745755,26760399,26769372,26773378,26805602,26775834,26796872,26799475,26801964
2026-09-16 00:40:00.348  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 00:40:00.365  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 00:40:00.365  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 00:40:00.365  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 00:40:00.415  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 181ms
2026-09-16 00:40:00.501  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789530000001}] and the following status: [COMPLETED] in 333ms
2026-09-16 00:40:00.501  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 00:45:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 00:45:00.207  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789530300000}]
2026-09-16 00:45:00.365  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 00:45:00.432  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 00:45:00.512  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26811868,26812182,26812694,26820563,26837153,26887864,26855508,26859591,26872356,26884997
2026-09-16 00:45:00.513  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 00:45:00.532  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 00:45:00.532  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 00:45:00.532  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 00:45:00.607  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 242ms
2026-09-16 00:45:00.715  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789530300000}] and the following status: [COMPLETED] in 459ms
2026-09-16 00:45:00.715  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 00:50:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 00:50:00.092  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789530600000}]
2026-09-16 00:50:00.157  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 00:50:00.184  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 00:50:00.306  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26900489,26942049,26950826,26959783,27003782,26980150,26992465,26993192,26994574,27001410
2026-09-16 00:50:00.306  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 00:50:00.320  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 00:50:00.321  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 00:50:00.321  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 00:50:00.368  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 211ms
2026-09-16 00:50:00.420  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789530600000}] and the following status: [COMPLETED] in 305ms
2026-09-16 00:50:00.420  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 00:55:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 00:55:00.086  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789530900001}]
2026-09-16 00:55:00.144  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 00:55:00.169  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 00:55:00.236  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27167919,27199858,27323591,27434977,27354677,27366472,27375734,27385930,27402086,27415760
2026-09-16 00:55:00.236  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 00:55:00.248  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 00:55:00.248  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 00:55:00.248  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 00:55:00.280  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 136ms
2026-09-16 00:55:00.325  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789530900001}] and the following status: [COMPLETED] in 219ms
2026-09-16 00:55:00.325  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 01:00:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 01:00:00.105  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789531200001}]
2026-09-16 01:00:00.172  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 01:00:00.198  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 01:00:00.278  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27439523,27449555,26764795,26729162,26750231,26761784,26859630,26935578,26937194,26937257
2026-09-16 01:00:00.278  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 01:00:00.291  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 01:00:00.291  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 01:00:00.291  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 01:00:00.324  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 152ms
2026-09-16 01:00:00.367  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789531200001}] and the following status: [COMPLETED] in 242ms
2026-09-16 01:00:00.367  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 01:05:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 01:05:00.088  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789531500000}]
2026-09-16 01:05:00.151  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 01:05:00.175  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 01:05:00.242  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26959641,26982629,26773234,26808024,26816723,26841064,26842446,27003232,27462321,27484152
2026-09-16 01:05:00.242  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 01:05:00.258  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 01:05:00.258  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 01:05:00.258  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 01:05:00.289  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 138ms
2026-09-16 01:05:00.333  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789531500000}] and the following status: [COMPLETED] in 226ms
2026-09-16 01:05:00.333  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 01:10:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 01:10:00.085  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789531800000}]
2026-09-16 01:10:00.159  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 01:10:00.182  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 01:10:00.350  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27490077,27490990,27496351,27506042,27506274,27526325,27581277,27573677,27575460,27577382
2026-09-16 01:10:00.350  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 01:10:00.361  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 01:10:00.361  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 01:10:00.361  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 01:10:00.391  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 232ms
2026-09-16 01:10:00.438  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789531800000}] and the following status: [COMPLETED] in 331ms
2026-09-16 01:10:00.439  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 01:15:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 01:15:00.081  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789532100000}]
2026-09-16 01:15:00.140  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 01:15:00.165  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 01:15:00.254  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27584934,27587730,27589195,27599224,27600842,27616761,27626028,27050098,27639056,27648492
2026-09-16 01:15:00.254  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 01:15:00.273  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 01:15:00.273  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 01:15:00.273  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 01:15:00.335  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 195ms
2026-09-16 01:15:00.450  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789532100000}] and the following status: [COMPLETED] in 315ms
2026-09-16 01:15:00.450  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 01:20:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 01:20:00.083  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789532400001}]
2026-09-16 01:20:00.140  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 01:20:00.163  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 01:20:00.236  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27063483,27079648,27082498,27093105,27101317,27168974,27121042,27150840,27156446,27161536
2026-09-16 01:20:00.236  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 01:20:00.247  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 01:20:00.248  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 01:20:00.248  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 01:20:00.279  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 139ms
2026-09-16 01:20:00.322  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789532400001}] and the following status: [COMPLETED] in 218ms
2026-09-16 01:20:00.322  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 01:25:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 01:25:00.082  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789532700000}]
2026-09-16 01:25:00.140  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 01:25:00.164  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 01:25:00.324  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27172071,27205435,27218280,27477953,27286187,27298205,27318441,27320659,27340578,27353160
2026-09-16 01:25:00.324  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 01:25:00.334  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 01:25:00.334  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 01:25:00.334  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 01:25:00.363  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 223ms
2026-09-16 01:25:00.409  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789532700000}] and the following status: [COMPLETED] in 306ms
2026-09-16 01:25:00.409  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 01:30:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 01:30:00.134  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789533000001}]
2026-09-16 01:30:00.254  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 01:30:00.278  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 01:30:00.663  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27529638,27534249,27536426,26806355,27012644,26732829,27228382,26788462,27595790,26774046
2026-09-16 01:30:00.663  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 01:30:00.746  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 01:30:00.746  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 01:30:00.746  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 01:30:00.777  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 523ms
2026-09-16 01:30:00.819  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789533000001}] and the following status: [COMPLETED] in 666ms
2026-09-16 01:30:00.819  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 01:35:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 01:35:00.079  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789533300000}]
2026-09-16 01:35:00.145  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 01:35:00.167  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 01:35:00.258  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26738459,26761341,27619550,26068196,26072624,26849510,26115145,26124463,26124839,26138763
2026-09-16 01:35:00.258  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 01:35:00.270  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 01:35:00.270  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 01:35:00.270  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 01:35:00.302  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 157ms
2026-09-16 01:35:00.347  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789533300000}] and the following status: [COMPLETED] in 249ms
2026-09-16 01:35:00.347  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 01:40:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 01:40:00.086  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789533600001}]
2026-09-16 01:40:00.140  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 01:40:00.163  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 01:40:00.235  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26955522,27012750,27029460,27063342,27199923,27064336,27093185,27118684,27128314,27168298
2026-09-16 01:40:00.235  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 01:40:00.248  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 01:40:00.248  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 01:40:00.248  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 01:40:00.276  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 136ms
2026-09-16 01:40:00.318  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789533600001}] and the following status: [COMPLETED] in 213ms
2026-09-16 01:40:00.318  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 01:45:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 01:45:00.072  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789533900001}]
2026-09-16 01:45:00.120  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 01:45:00.146  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 01:45:00.213  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27201820,27214422,27228748,27313410,27313693,27411964,27365275,27370274,27382120,27410607
2026-09-16 01:45:00.213  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 01:45:00.225  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 01:45:00.225  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 01:45:00.225  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 01:45:00.249  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 129ms
2026-09-16 01:45:00.283  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789533900001}] and the following status: [COMPLETED] in 196ms
2026-09-16 01:45:00.283  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 01:50:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 01:50:00.069  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789534200000}]
2026-09-16 01:50:00.120  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 01:50:00.138  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 01:50:00.204  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27424377,27430116,27440144,27442368,27449548,26734849,26749548,27514673,26743411,26745500
2026-09-16 01:50:00.204  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 01:50:00.214  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 01:50:00.215  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 01:50:00.215  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 01:50:00.241  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 121ms
2026-09-16 01:50:00.276  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789534200000}] and the following status: [COMPLETED] in 193ms
2026-09-16 01:50:00.276  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 01:55:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 01:55:00.071  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789534500000}]
2026-09-16 01:55:00.119  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 01:55:00.136  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 01:55:00.201  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26749930,26752427,26765256,26773917,27566742,27570847,27573233,27576143,27606256,27601835
2026-09-16 01:55:00.201  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 01:55:00.212  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 01:55:00.212  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 01:55:00.212  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 01:55:00.247  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 128ms
2026-09-16 01:55:00.281  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789534500000}] and the following status: [COMPLETED] in 195ms
2026-09-16 01:55:00.281  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 02:00:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 02:00:00.094  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789534800000}]
2026-09-16 02:00:00.159  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 02:00:00.184  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 02:00:00.266  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27017406,27082779,27217780,27306214,27367949,27382822,27383608,27386406,27300952,27293652
2026-09-16 02:00:00.266  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 02:00:00.283  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 02:00:00.283  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 02:00:00.283  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 02:00:00.318  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 159ms
2026-09-16 02:00:00.360  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789534800000}] and the following status: [COMPLETED] in 247ms
2026-09-16 02:00:00.360  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 02:05:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 02:05:00.070  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789535100000}]
2026-09-16 02:05:00.117  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 02:05:00.137  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 02:05:00.213  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27400523,27417934,27442234,27495425,27518913,27520534,27573103,27561379,27496964,26756453
2026-09-16 02:05:00.213  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 02:05:00.226  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 02:05:00.226  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 02:05:00.226  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 02:05:00.251  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 134ms
2026-09-16 02:05:00.281  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789535100000}] and the following status: [COMPLETED] in 197ms
2026-09-16 02:05:00.281  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 02:10:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 02:10:00.071  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789535400000}]
2026-09-16 02:10:00.138  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 02:10:00.155  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 02:10:00.225  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26734014,27622195,26733914,26725185,27399313,27442296,27375799,27323105,27331427,27335776
2026-09-16 02:10:00.226  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 02:10:00.236  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 02:10:00.236  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 02:10:00.236  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 02:10:00.260  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 122ms
2026-09-16 02:10:00.294  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789535400000}] and the following status: [COMPLETED] in 209ms
2026-09-16 02:10:00.295  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 02:15:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 02:15:00.083  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789535700000}]
2026-09-16 02:15:00.137  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 02:15:00.157  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 02:15:00.230  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27446071,27485002,27497806,27512006,26874629,26842332,26853389,26847774,26885236,26887286
2026-09-16 02:15:00.231  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 02:15:00.242  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 02:15:00.243  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 02:15:00.243  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 02:15:00.266  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 129ms
2026-09-16 02:15:00.301  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789535700000}] and the following status: [COMPLETED] in 203ms
2026-09-16 02:15:00.302  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 02:20:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 02:20:00.071  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789536000000}]
2026-09-16 02:20:00.120  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 02:20:00.141  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 02:20:00.232  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26889839,26907627,26954899,27230121,27232559,27299907,27391623,27100351,27148403,26787160
2026-09-16 02:20:00.232  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 02:20:00.251  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 02:20:00.251  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 02:20:00.251  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 02:20:00.273  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 153ms
2026-09-16 02:20:00.306  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789536000000}] and the following status: [COMPLETED] in 220ms
2026-09-16 02:20:00.306  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 02:25:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 02:25:00.063  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789536300000}]
2026-09-16 02:25:00.112  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 02:25:00.132  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 02:25:00.199  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27479977,27519328,27520921,27525090,27543928,26249235,26250286,26073825,26257109,26065763
2026-09-16 02:25:00.200  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 02:25:00.210  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 02:25:00.210  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 02:25:00.210  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 02:25:00.236  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 124ms
2026-09-16 02:25:00.269  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789536300000}] and the following status: [COMPLETED] in 192ms
2026-09-16 02:25:00.269  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 02:30:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 02:30:00.167  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789536600000}]
2026-09-16 02:30:00.285  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 02:30:00.318  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 02:30:00.852  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26094375,26119471,26150653,27608262,26230855,26722454,26756816,27643474,27645734,27647485
2026-09-16 02:30:00.852  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 02:30:00.884  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 02:30:00.884  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 02:30:00.884  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 02:30:00.908  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 623ms
2026-09-16 02:30:00.947  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789536600000}] and the following status: [COMPLETED] in 762ms
2026-09-16 02:30:00.947  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 02:35:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 02:35:00.071  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789536900001}]
2026-09-16 02:35:00.117  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 02:35:00.135  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 02:35:00.234  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27345079,27367032,27430050,26777493,27457017,27465426,27525054,27543477,27557486,27585275
2026-09-16 02:35:00.234  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 02:35:00.245  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 02:35:00.245  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 02:35:00.245  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 02:35:00.272  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 155ms
2026-09-16 02:35:00.310  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789536900001}] and the following status: [COMPLETED] in 224ms
2026-09-16 02:35:00.310  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 02:40:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 02:40:00.068  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789537200001}]
2026-09-16 02:40:00.115  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 02:40:00.137  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 02:40:00.238  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27012595,27109249,27120273,27644989,26862655,27135548,27182279,26307102,27379043,27621112
2026-09-16 02:40:00.238  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 02:40:00.252  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 02:40:00.252  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 02:40:00.252  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 02:40:00.274  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 158ms
2026-09-16 02:40:00.310  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789537200001}] and the following status: [COMPLETED] in 225ms
2026-09-16 02:40:00.310  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 02:45:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 02:45:00.208  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789537500000}]
2026-09-16 02:45:00.366  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 02:45:00.438  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 02:45:00.533  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26863616,26905930,26917423,27621065,26796744,27652701,27651838,27470791,27627882,26782618
2026-09-16 02:45:00.533  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 02:45:00.554  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 02:45:00.554  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 02:45:00.554  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 02:45:00.631  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 265ms
2026-09-16 02:45:00.666  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789537500000}] and the following status: [COMPLETED] in 443ms
2026-09-16 02:45:00.666  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 02:50:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 02:50:00.063  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789537800000}]
2026-09-16 02:50:00.110  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 02:50:00.132  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 02:50:00.196  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26798150,26814489,26820361,26169728,26774848,26320612,26155403,26162213,26164326,26068019
2026-09-16 02:50:00.196  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 02:50:00.207  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 02:50:00.207  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 02:50:00.207  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 02:50:00.231  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 121ms
2026-09-16 02:50:00.261  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789537800000}] and the following status: [COMPLETED] in 185ms
2026-09-16 02:50:00.261  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 02:55:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 02:55:00.062  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789538100000}]
2026-09-16 02:55:00.125  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 02:55:00.143  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 02:55:00.219  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26231860,27285682,27288654,27295239,27309564,27314846,27419095,27338757,27339531,27418331
2026-09-16 02:55:00.219  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 02:55:00.230  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 02:55:00.230  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 02:55:00.230  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 02:55:00.257  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 132ms
2026-09-16 02:55:00.291  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789538100000}] and the following status: [COMPLETED] in 214ms
2026-09-16 02:55:00.291  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 03:00:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 03:00:00.102  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789538400001}]
2026-09-16 03:00:00.169  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 03:00:00.186  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 03:00:00.571  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27620633,27455100,27475267,27613612,27614999,26809718,27514803,27527942,27548592,27637199
2026-09-16 03:00:00.571  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 03:00:00.597  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 03:00:00.597  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 03:00:00.597  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 03:00:00.623  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 454ms
2026-09-16 03:00:00.669  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789538400001}] and the following status: [COMPLETED] in 550ms
2026-09-16 03:00:00.669  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 03:05:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 03:05:00.061  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789538700001}]
2026-09-16 03:05:00.109  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 03:05:00.127  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 03:05:00.201  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26872054,26779266,26797604,27567308,26887801,26904671,26939687,26948495,26960376,26971795
2026-09-16 03:05:00.201  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 03:05:00.214  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 03:05:00.214  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 03:05:00.214  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 03:05:00.235  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 126ms
2026-09-16 03:05:00.266  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789538700001}] and the following status: [COMPLETED] in 188ms
2026-09-16 03:05:00.266  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 03:10:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 03:10:00.078  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789539000001}]
2026-09-16 03:10:00.132  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 03:10:00.150  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 03:10:00.226  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27600016,26362910,26385840,26481822,26402465,26413635,26414944,26457828,26460321,26466977
2026-09-16 03:10:00.226  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 03:10:00.242  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 03:10:00.242  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 03:10:00.242  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 03:10:00.267  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 134ms
2026-09-16 03:10:00.302  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789539000001}] and the following status: [COMPLETED] in 210ms
2026-09-16 03:10:00.302  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 03:15:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 03:15:00.179  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789539300000}]
2026-09-16 03:15:00.305  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 03:15:00.360  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 03:15:00.451  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26483416,26504977,26510672,26542951,26518874,26524965,26527704,26533396,26537303,26539386
2026-09-16 03:15:00.451  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 03:15:00.471  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 03:15:00.471  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 03:15:00.471  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 03:15:00.572  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 267ms
2026-09-16 03:15:00.667  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789539300000}] and the following status: [COMPLETED] in 435ms
2026-09-16 03:15:00.667  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 03:20:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 03:20:00.065  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789539600001}]
2026-09-16 03:20:00.109  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 03:20:00.126  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 03:20:00.188  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26213000,26441261,26460801,26854279,26134005,26786388,26797473,26831928,26848117,26848782
2026-09-16 03:20:00.188  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 03:20:00.262  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 03:20:00.262  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 03:20:00.262  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 03:20:00.284  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 175ms
2026-09-16 03:20:00.312  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789539600001}] and the following status: [COMPLETED] in 235ms
2026-09-16 03:20:00.312  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 03:25:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 03:25:00.065  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789539900000}]
2026-09-16 03:25:00.113  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 03:25:00.128  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 03:25:00.213  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26867159,26876937,26911799,27101989,26942123,26970900,27028743,27034186,27098667,27101553
2026-09-16 03:25:00.213  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 03:25:00.226  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 03:25:00.226  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 03:25:00.226  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 03:25:00.250  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 137ms
2026-09-16 03:25:00.281  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789539900000}] and the following status: [COMPLETED] in 202ms
2026-09-16 03:25:00.281  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 03:30:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 03:30:00.143  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789540200000}]
2026-09-16 03:30:00.222  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 03:30:00.256  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 03:30:00.623  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27102434,27102605,27104081,27104898,26471066,26692311,26712429,26699338,26709005,26711379
2026-09-16 03:30:00.624  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 03:30:00.633  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 03:30:00.634  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 03:30:00.634  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 03:30:00.664  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 442ms
2026-09-16 03:30:00.703  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789540200000}] and the following status: [COMPLETED] in 547ms
2026-09-16 03:30:00.704  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 03:35:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 03:35:00.090  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789540500000}]
2026-09-16 03:35:00.153  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 03:35:00.169  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 03:35:00.702  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26743226,26771515,26805752,26937529,26826771,26839066,26840824,26847066,26883341,26931277
2026-09-16 03:35:00.702  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 03:35:00.717  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 03:35:00.717  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 03:35:00.717  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 03:35:00.738  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 585ms
2026-09-16 03:35:00.784  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789540500000}] and the following status: [COMPLETED] in 672ms
2026-09-16 03:35:00.784  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 03:40:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 03:40:00.065  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789540800000}]
2026-09-16 03:40:00.106  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 03:40:00.122  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 03:40:00.184  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26972155,26974871,26976169,27046537,27057927,27060553,27061522,27092034,27074870,27088881
2026-09-16 03:40:00.184  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 03:40:00.195  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 03:40:00.195  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 03:40:00.195  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 03:40:00.216  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 110ms
2026-09-16 03:40:00.247  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789540800000}] and the following status: [COMPLETED] in 170ms
2026-09-16 03:40:00.247  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 03:45:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 03:45:00.069  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789541100000}]
2026-09-16 03:45:00.109  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 03:45:00.124  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 03:45:00.185  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27235478,27339009,27377540,27435845,27532202,27380067,27389216,27463398,27473003,27510203
2026-09-16 03:45:00.185  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 03:45:00.195  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 03:45:00.195  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 03:45:00.195  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 03:45:00.225  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 116ms
2026-09-16 03:45:00.258  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789541100000}] and the following status: [COMPLETED] in 176ms
2026-09-16 03:45:00.258  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 03:50:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 03:50:00.066  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789541400001}]
2026-09-16 03:50:00.105  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 03:50:00.126  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 03:50:00.190  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27555626,27556991,27563617,27021332,27576398,27619503,27626312,26342150,26514558,27009728
2026-09-16 03:50:00.190  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 03:50:00.201  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 03:50:00.201  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 03:50:00.201  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 03:50:00.221  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 116ms
2026-09-16 03:50:00.248  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789541400001}] and the following status: [COMPLETED] in 170ms
2026-09-16 03:50:00.248  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 03:55:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 03:55:00.083  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789541700001}]
2026-09-16 03:55:00.139  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 03:55:00.154  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 03:55:00.220  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27022978,27024357,27027002,27033400,27033494,27039752,27040267,27040510,27041589,27054715
2026-09-16 03:55:00.220  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 03:55:00.231  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 03:55:00.231  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 03:55:00.231  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 03:55:00.250  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 111ms
2026-09-16 03:55:00.278  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789541700001}] and the following status: [COMPLETED] in 183ms
2026-09-16 03:55:00.278  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 04:00:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 04:00:00.085  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789542000000}]
2026-09-16 04:00:00.154  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 04:00:00.171  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 04:00:00.499  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27062030,27064144,27064678,27069479,27069937,27071906,27075689,27082563,27084726,27087039
2026-09-16 04:00:00.499  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 04:00:00.514  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 04:00:00.514  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 04:00:00.514  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 04:00:00.537  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 383ms
2026-09-16 04:00:00.571  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789542000000}] and the following status: [COMPLETED] in 472ms
2026-09-16 04:00:00.571  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 04:05:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 04:05:00.059  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789542300001}]
2026-09-16 04:05:00.099  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 04:05:00.115  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 04:05:00.208  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27088307,27089777,27091538,27092862,27107554,27121317,27127341,27186762,27155350,27185145
2026-09-16 04:05:00.208  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 04:05:00.220  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 04:05:00.220  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 04:05:00.220  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 04:05:00.240  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 141ms
2026-09-16 04:05:00.266  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789542300001}] and the following status: [COMPLETED] in 196ms
2026-09-16 04:05:00.266  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 04:10:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 04:10:00.058  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789542600001}]
2026-09-16 04:10:00.116  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 04:10:00.135  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 04:10:00.218  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27194086,27223179,27233193,26753192,27250537,26429920,26597851,26686494,26714542,26745164
2026-09-16 04:10:00.218  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 04:10:00.235  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 04:10:00.235  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 04:10:00.235  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 04:10:00.257  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 141ms
2026-09-16 04:10:00.290  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789542600001}] and the following status: [COMPLETED] in 219ms
2026-09-16 04:10:00.290  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 04:15:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 04:15:00.157  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789542900000}]
2026-09-16 04:15:00.270  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 04:15:00.308  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 04:15:00.404  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26758406,26764636,26773058,26807052,27104015,27215455,26919820,27009603,27178923,27214567
2026-09-16 04:15:00.404  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 04:15:00.421  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 04:15:00.421  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 04:15:00.421  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 04:15:00.480  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 210ms
2026-09-16 04:15:00.567  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789542900000}] and the following status: [COMPLETED] in 373ms
2026-09-16 04:15:00.568  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 04:20:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 04:20:00.061  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789543200000}]
2026-09-16 04:20:00.101  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 04:20:00.116  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 04:20:00.189  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27236332,27258446,27311942,27595692,27413730,27431951,27473039,27634306,27559132,27561284
2026-09-16 04:20:00.190  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 04:20:00.203  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 04:20:00.203  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 04:20:00.203  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 04:20:00.223  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 122ms
2026-09-16 04:20:00.250  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789543200000}] and the following status: [COMPLETED] in 177ms
2026-09-16 04:20:00.250  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 04:25:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 04:25:00.077  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789543500000}]
2026-09-16 04:25:00.126  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 04:25:00.142  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 04:25:00.446  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27597954,27620807,27641780,26111202,26413861,26521348,26609900,27105927,27109798,27109922
2026-09-16 04:25:00.446  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 04:25:00.459  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 04:25:00.459  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 04:25:00.459  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 04:25:00.481  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 355ms
2026-09-16 04:25:00.513  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789543500000}] and the following status: [COMPLETED] in 419ms
2026-09-16 04:25:00.514  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 04:30:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 04:30:00.077  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789543800000}]
2026-09-16 04:30:00.126  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 04:30:00.143  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 04:30:00.234  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26138565,26279807,26350028,27256726,27258452,27160038,26501615,26603115,27112822,27154225
2026-09-16 04:30:00.234  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 04:30:00.256  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 04:30:00.257  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 04:30:00.257  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 04:30:00.279  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 153ms
2026-09-16 04:30:00.309  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789543800000}] and the following status: [COMPLETED] in 219ms
2026-09-16 04:30:00.309  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 04:35:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 04:35:00.058  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789544100000}]
2026-09-16 04:35:00.099  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 04:35:00.115  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 04:35:00.203  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27261204,27265245,27265337,27266756,27269939,27273515,27273717,27274125,27280348,27278543
2026-09-16 04:35:00.203  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 04:35:00.213  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 04:35:00.213  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 04:35:00.213  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 04:35:00.235  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 136ms
2026-09-16 04:35:00.262  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789544100000}] and the following status: [COMPLETED] in 192ms
2026-09-16 04:35:00.262  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 04:40:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 04:40:00.056  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789544400000}]
2026-09-16 04:40:00.095  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 04:40:00.110  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 04:40:00.183  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27281480,27284950,27297430,27298250,27324540,27399801,27371898,27382280,27383047,27384142
2026-09-16 04:40:00.183  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 04:40:00.193  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 04:40:00.194  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 04:40:00.194  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 04:40:00.213  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 118ms
2026-09-16 04:40:00.240  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789544400000}] and the following status: [COMPLETED] in 172ms
2026-09-16 04:40:00.240  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 04:45:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 04:45:00.146  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789544700001}]
2026-09-16 04:45:00.234  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 04:45:00.281  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 04:45:00.361  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27406383,27408113,26711193,26328034,26656400,26773751,26813832,26829162,26788144,26796838
2026-09-16 04:45:00.361  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 04:45:00.382  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 04:45:00.382  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 04:45:00.382  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 04:45:00.428  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 194ms
2026-09-16 04:45:00.455  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789544700001}] and the following status: [COMPLETED] in 297ms
2026-09-16 04:45:00.455  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 04:50:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 04:50:00.054  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789545000000}]
2026-09-16 04:50:00.090  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 04:50:00.117  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 04:50:00.186  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26852216,26865399,26875516,26922799,26979640,26899137,26906959,26932068,26973085,26978568
2026-09-16 04:50:00.186  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 04:50:00.196  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 04:50:00.196  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 04:50:00.196  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 04:50:00.216  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 126ms
2026-09-16 04:50:00.243  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789545000000}] and the following status: [COMPLETED] in 177ms
2026-09-16 04:50:00.243  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 04:55:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 04:55:00.077  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789545300000}]
2026-09-16 04:55:00.124  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 04:55:00.138  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 04:55:00.418  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27017589,27028229,27035903,27234761,27173394,27203604,27204886,27207444,27220981,27225258
2026-09-16 04:55:00.418  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 04:55:00.428  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 04:55:00.428  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 04:55:00.428  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 04:55:00.448  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 324ms
2026-09-16 04:55:00.473  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789545300000}] and the following status: [COMPLETED] in 383ms
2026-09-16 04:55:00.473  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 05:00:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 05:00:00.057  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789545600000}]
2026-09-16 05:00:00.100  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 05:00:00.115  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 05:00:00.188  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27244209,27263069,27276045,27647416,27284016,27327481,27353191,27568782,27603573,27613240
2026-09-16 05:00:00.188  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 05:00:00.205  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 05:00:00.205  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 05:00:00.205  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 05:00:00.223  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 123ms
2026-09-16 05:00:00.248  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789545600000}] and the following status: [COMPLETED] in 180ms
2026-09-16 05:00:00.248  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 05:05:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 05:05:00.051  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789545900000}]
2026-09-16 05:05:00.085  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 05:05:00.098  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 05:05:00.263  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27110819,27112882,27116088,27117756,27118109,27118635,26386062,27311859,26452433,26464938
2026-09-16 05:05:00.263  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 05:05:00.272  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 05:05:00.272  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 05:05:00.272  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 05:05:00.291  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 206ms
2026-09-16 05:05:00.325  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789545900000}] and the following status: [COMPLETED] in 262ms
2026-09-16 05:05:00.325  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 05:10:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 05:10:00.054  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789546200001}]
2026-09-16 05:10:00.090  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 05:10:00.104  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 05:10:00.401  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27381224,27389934,27406437,27426530,27415740,27417775,27418856,27419055,27425077,27425475
2026-09-16 05:10:00.401  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 05:10:00.410  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 05:10:00.411  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 05:10:00.411  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 05:10:00.429  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 339ms
2026-09-16 05:10:00.450  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789546200001}] and the following status: [COMPLETED] in 387ms
2026-09-16 05:10:00.450  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 05:15:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 05:15:00.051  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789546500001}]
2026-09-16 05:15:00.089  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 05:15:00.103  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 05:15:00.164  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27426542,27432566,27433633,27437797,27442429,27442453,27442723,27444807,27459944,27457333
2026-09-16 05:15:00.165  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 05:15:00.176  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 05:15:00.176  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 05:15:00.176  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 05:15:00.194  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 105ms
2026-09-16 05:15:00.217  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789546500001}] and the following status: [COMPLETED] in 156ms
2026-09-16 05:15:00.217  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 05:20:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 05:20:00.049  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789546800000}]
2026-09-16 05:20:00.083  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 05:20:00.097  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 05:20:00.159  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26028068,26691048,26773237,26871614,26778111,26778995,26801410,26808146,26843399,26850498
2026-09-16 05:20:00.159  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 05:20:00.169  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 05:20:00.169  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 05:20:00.169  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 05:20:00.187  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 104ms
2026-09-16 05:20:00.211  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789546800000}] and the following status: [COMPLETED] in 152ms
2026-09-16 05:20:00.211  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 05:25:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 05:25:00.070  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789547100000}]
2026-09-16 05:25:00.110  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 05:25:00.123  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 05:25:00.481  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26877027,26878893,26913540,26931967,27048752,27054666,27060844,26947195,27002184,27036603
2026-09-16 05:25:00.481  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 05:25:00.492  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 05:25:00.492  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 05:25:00.492  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 05:25:00.511  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 401ms
2026-09-16 05:25:00.535  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789547100000}] and the following status: [COMPLETED] in 454ms
2026-09-16 05:25:00.535  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 05:30:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 05:30:00.063  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789547400000}]
2026-09-16 05:30:00.106  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 05:30:00.120  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 05:30:00.189  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27077610,27084433,27092033,27109492,27556135,27118625,27124909,27128594,27492237,27504258
2026-09-16 05:30:00.189  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 05:30:00.199  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 05:30:00.200  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 05:30:00.200  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 05:30:00.228  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 122ms
2026-09-16 05:30:00.253  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789547400000}] and the following status: [COMPLETED] in 179ms
2026-09-16 05:30:00.253  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 05:35:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 05:35:00.048  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789547700001}]
2026-09-16 05:35:00.082  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 05:35:00.095  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 05:35:00.158  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27561292,27602506,27635750,27119879,27122119,27122918,27123353,26579882,26224385,26333494
2026-09-16 05:35:00.158  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 05:35:00.166  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 05:35:00.166  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 05:35:00.166  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 05:35:00.184  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 102ms
2026-09-16 05:35:00.210  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789547700001}] and the following status: [COMPLETED] in 148ms
2026-09-16 05:35:00.210  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 05:40:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 05:40:00.054  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789548000000}]
2026-09-16 05:40:00.088  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 05:40:00.105  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 05:40:00.174  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27124586,27125138,27111565,27134473,27184181,27259079,27221964,26041340,26308166,27233062
2026-09-16 05:40:00.174  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 05:40:00.185  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 05:40:00.185  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 05:40:00.185  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 05:40:00.201  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 113ms
2026-09-16 05:40:00.225  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789548000000}] and the following status: [COMPLETED] in 161ms
2026-09-16 05:40:00.225  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 05:45:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 05:45:00.053  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789548300001}]
2026-09-16 05:45:00.088  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 05:45:00.102  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 05:45:00.170  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27321744,27329039,27346981,27361113,27362401,27367724,27453305,27376343,27424923,27434575
2026-09-16 05:45:00.170  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 05:45:00.185  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 05:45:00.185  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 05:45:00.185  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 05:45:00.247  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 159ms
2026-09-16 05:45:00.270  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789548300001}] and the following status: [COMPLETED] in 207ms
2026-09-16 05:45:00.271  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 05:50:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 05:50:00.054  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789548600000}]
2026-09-16 05:50:00.087  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 05:50:00.101  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 05:50:00.163  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27468056,27470778,27472564,27473433,27477535,27480073,27486363,27487807,27492242,27494201
2026-09-16 05:50:00.163  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 05:50:00.171  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 05:50:00.172  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 05:50:00.172  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 05:50:00.189  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 100ms
2026-09-16 05:50:00.212  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789548600000}] and the following status: [COMPLETED] in 148ms
2026-09-16 05:50:00.212  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 05:55:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 05:55:00.053  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789548900000}]
2026-09-16 05:55:00.092  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 05:55:00.106  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 05:55:00.186  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27494987,27495708,27496933,27499448,27500666,27504983,27505552,27510621,27511147,27512579
2026-09-16 05:55:00.186  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 05:55:00.199  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 05:55:00.199  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 05:55:00.199  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 05:55:00.216  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 124ms
2026-09-16 05:55:00.239  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789548900000}] and the following status: [COMPLETED] in 176ms
2026-09-16 05:55:00.239  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 06:00:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 06:00:00.084  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789549200000}]
2026-09-16 06:00:00.145  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 06:00:00.160  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 06:00:00.549  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27514708,27517956,27519082,26701609,26727955,26868378,26578025,26748055,26785954,26803982
2026-09-16 06:00:00.550  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 06:00:00.566  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 06:00:00.566  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 06:00:00.566  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 06:00:00.589  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 444ms
2026-09-16 06:00:00.621  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789549200000}] and the following status: [COMPLETED] in 523ms
2026-09-16 06:00:00.621  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 06:05:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 06:05:00.054  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789549500000}]
2026-09-16 06:05:00.094  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 06:05:00.107  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 06:05:00.215  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26868801,26869865,26889371,26900220,26942689,26912012,26922622,26923611,26933578,26941764
2026-09-16 06:05:00.215  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 06:05:00.233  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 06:05:00.233  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 06:05:00.233  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 06:05:00.251  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 157ms
2026-09-16 06:05:00.276  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789549500000}] and the following status: [COMPLETED] in 211ms
2026-09-16 06:05:00.276  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 06:10:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 06:10:00.049  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789549800000}]
2026-09-16 06:10:00.086  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 06:10:00.100  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 06:10:00.172  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26954846,26981859,27000897,27009912,27122311,27018955,27060780,27067035,27077702,27120525
2026-09-16 06:10:00.172  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 06:10:00.191  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 06:10:00.191  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 06:10:00.191  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 06:10:00.210  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 124ms
2026-09-16 06:10:00.239  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789549800000}] and the following status: [COMPLETED] in 177ms
2026-09-16 06:10:00.239  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 06:15:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 06:15:00.054  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789550100000}]
2026-09-16 06:15:00.088  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 06:15:00.103  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 06:15:00.188  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27440594,27461697,27627599,27631207,27139579,26311960,26427941,26646398,27129936,27136004
2026-09-16 06:15:00.188  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 06:15:00.202  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 06:15:00.202  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 06:15:00.202  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 06:15:00.221  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 133ms
2026-09-16 06:15:00.244  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789550100000}] and the following status: [COMPLETED] in 180ms
2026-09-16 06:15:00.244  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 06:20:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 06:20:00.052  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789550400001}]
2026-09-16 06:20:00.099  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 06:20:00.129  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 06:20:00.200  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26538925,26646151,26680577,26688401,26706395,26805888,26772053,26715467,26756657,26757240
2026-09-16 06:20:00.200  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 06:20:00.208  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 06:20:00.208  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 06:20:00.208  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 06:20:00.228  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 129ms
2026-09-16 06:20:00.250  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789550400001}] and the following status: [COMPLETED] in 189ms
2026-09-16 06:20:00.251  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 06:25:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 06:25:00.058  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789550700000}]
2026-09-16 06:25:00.095  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 06:25:00.109  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 06:25:00.227  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26818604,26834900,26836669,26839700,26840026,26856319,26859381,26862337,26867805,26870022
2026-09-16 06:25:00.228  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 06:25:00.238  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 06:25:00.238  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 06:25:00.238  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 06:25:00.265  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 170ms
2026-09-16 06:25:00.290  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789550700000}] and the following status: [COMPLETED] in 221ms
2026-09-16 06:25:00.290  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 06:30:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 06:30:00.062  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789551000000}]
2026-09-16 06:30:00.099  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 06:30:00.114  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 06:30:00.192  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26873791,26876386,26890421,26923459,26931291,26958413,26965511,26978245,26981237,26975543
2026-09-16 06:30:00.192  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 06:30:00.201  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 06:30:00.201  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 06:30:00.201  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 06:30:00.220  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 121ms
2026-09-16 06:30:00.245  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789551000000}] and the following status: [COMPLETED] in 172ms
2026-09-16 06:30:00.245  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 06:35:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 06:35:00.052  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789551300000}]
2026-09-16 06:35:00.085  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 06:35:00.098  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 06:35:00.171  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26981737,26985346,26989567,27008248,27016443,27022530,27027409,27059754,27070911,27031249
2026-09-16 06:35:00.172  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 06:35:00.189  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 06:35:00.190  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 06:35:00.190  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 06:35:00.207  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 122ms
2026-09-16 06:35:00.230  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789551300000}] and the following status: [COMPLETED] in 168ms
2026-09-16 06:35:00.230  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 06:40:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 06:40:00.050  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789551600000}]
2026-09-16 06:40:00.085  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 06:40:00.099  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 06:40:00.189  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27088886,27093885,27095112,27099075,27132797,27133929,27155414,27169424,27164799,27166391
2026-09-16 06:40:00.189  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 06:40:00.204  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 06:40:00.204  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 06:40:00.204  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 06:40:00.222  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 137ms
2026-09-16 06:40:00.252  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789551600000}] and the following status: [COMPLETED] in 190ms
2026-09-16 06:40:00.252  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 06:45:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 06:45:00.136  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789551900001}]
2026-09-16 06:45:00.214  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 06:45:00.248  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 06:45:00.360  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27173784,27185182,27223582,27458403,27227522,27232383,27245315,27311239,27353963,27406837
2026-09-16 06:45:00.360  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 06:45:00.373  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 06:45:00.373  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 06:45:00.373  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 06:45:00.424  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 210ms
2026-09-16 06:45:00.503  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789551900001}] and the following status: [COMPLETED] in 331ms
2026-09-16 06:45:00.503  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 06:50:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 06:50:00.052  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789552200000}]
2026-09-16 06:50:00.087  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 06:50:00.100  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 06:50:00.189  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27504958,27527870,27529114,27529611,27530152,27534219,27535342,27535840,27536246,27541849
2026-09-16 06:50:00.189  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 06:50:00.199  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 06:50:00.199  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 06:50:00.199  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 06:50:00.216  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 129ms
2026-09-16 06:50:00.238  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789552200000}] and the following status: [COMPLETED] in 176ms
2026-09-16 06:50:00.238  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 06:55:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 06:55:00.082  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789552500000}]
2026-09-16 06:55:00.164  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 06:55:00.177  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 06:55:00.553  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27542413,27542814,27542890,27544454,27545182,27545743,27545796,27546156,27546695,27546699
2026-09-16 06:55:00.553  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 06:55:00.561  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 06:55:00.562  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 06:55:00.562  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 06:55:00.580  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 416ms
2026-09-16 06:55:00.601  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789552500000}] and the following status: [COMPLETED] in 510ms
2026-09-16 06:55:00.601  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 07:00:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 07:00:00.053  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789552800000}]
2026-09-16 07:00:00.089  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 07:00:00.103  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 07:00:00.180  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27548639,27550695,27553084,27553584,27554914,27555383,27555642,27556070,27556692,27559228
2026-09-16 07:00:00.180  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 07:00:00.191  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 07:00:00.191  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 07:00:00.191  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 07:00:00.209  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 119ms
2026-09-16 07:00:00.233  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789552800000}] and the following status: [COMPLETED] in 170ms
2026-09-16 07:00:00.233  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 07:05:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 07:05:00.046  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789553100000}]
2026-09-16 07:05:00.078  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 07:05:00.091  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 07:05:00.158  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27560013,27562599,27563677,27565335,27571647,27572500,27572664,27574022,27574301,27575731
2026-09-16 07:05:00.158  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 07:05:00.167  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 07:05:00.167  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 07:05:00.167  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 07:05:00.184  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 105ms
2026-09-16 07:05:00.204  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789553100000}] and the following status: [COMPLETED] in 149ms
2026-09-16 07:05:00.204  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 07:10:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 07:10:00.046  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789553400001}]
2026-09-16 07:10:00.080  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 07:10:00.093  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 07:10:00.172  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27576560,27578135,27578225,27584345,27584578,27586335,27589255,27590433,27593315,27592876
2026-09-16 07:10:00.172  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 07:10:00.186  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 07:10:00.186  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 07:10:00.186  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 07:10:00.205  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 125ms
2026-09-16 07:10:00.227  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789553400001}] and the following status: [COMPLETED] in 171ms
2026-09-16 07:10:00.227  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 07:15:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 07:15:00.049  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789553700001}]
2026-09-16 07:15:00.091  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 07:15:00.106  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 07:15:00.179  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27594892,27596076,27596718,27598634,27599287,27600220,27603117,27604847,27604910,26380537
2026-09-16 07:15:00.179  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 07:15:00.189  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 07:15:00.189  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 07:15:00.189  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 07:15:00.206  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 114ms
2026-09-16 07:15:00.230  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789553700001}] and the following status: [COMPLETED] in 170ms
2026-09-16 07:15:00.230  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 07:20:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 07:20:00.048  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789554000000}]
2026-09-16 07:20:00.080  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 07:20:00.093  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 07:20:00.161  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26498352,26552071,26630698,26838510,26749389,26773720,26785197,26796162,26798113,26804337
2026-09-16 07:20:00.161  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 07:20:00.171  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 07:20:00.171  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 07:20:00.171  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 07:20:00.187  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 106ms
2026-09-16 07:20:00.208  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789554000000}] and the following status: [COMPLETED] in 151ms
2026-09-16 07:20:00.208  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 07:25:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 07:25:00.067  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789554300000}]
2026-09-16 07:25:00.116  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 07:25:00.130  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 07:25:00.409  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26850752,26855298,26860169,26866999,26869615,26880945,26903261,26883580,26891305,26897504
2026-09-16 07:25:00.409  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 07:25:00.424  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 07:25:00.424  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 07:25:00.424  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 07:25:00.440  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 323ms
2026-09-16 07:25:00.460  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789554300000}] and the following status: [COMPLETED] in 383ms
2026-09-16 07:25:00.460  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 07:30:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 07:30:00.047  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789554600001}]
2026-09-16 07:30:00.079  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 07:30:00.091  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 07:30:00.149  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26926156,26934523,26945700,27062966,26960505,26974383,26992840,27008396,27027496,27038097
2026-09-16 07:30:00.150  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 07:30:00.163  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 07:30:00.163  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 07:30:00.163  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 07:30:00.180  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 101ms
2026-09-16 07:30:00.201  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789554600001}] and the following status: [COMPLETED] in 144ms
2026-09-16 07:30:00.201  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 07:35:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 07:35:00.045  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789554900000}]
2026-09-16 07:35:00.077  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 07:35:00.089  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 07:35:00.146  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27083829,27087622,27121898,27350469,27158652,27163655,27167401,27215955,27239217,27298357
2026-09-16 07:35:00.146  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 07:35:00.155  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 07:35:00.155  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 07:35:00.155  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 07:35:00.171  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 94ms
2026-09-16 07:35:00.191  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789554900000}] and the following status: [COMPLETED] in 137ms
2026-09-16 07:35:00.191  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 07:40:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 07:40:00.045  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789555200000}]
2026-09-16 07:40:00.075  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 07:40:00.087  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 07:40:00.140  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27350989,27416308,27421053,27443238,27525693,27449133,27465188,27495533,27511746,27523628
2026-09-16 07:40:00.141  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 07:40:00.151  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 07:40:00.151  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 07:40:00.151  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 07:40:00.166  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 91ms
2026-09-16 07:40:00.184  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789555200000}] and the following status: [COMPLETED] in 131ms
2026-09-16 07:40:00.184  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 07:45:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 07:45:00.128  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789555500000}]
2026-09-16 07:45:00.210  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 07:45:00.245  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 07:45:00.309  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27550626,27570913,27572495,27579227,27581974,26542316,27605747,27633936,26215707,26514961
2026-09-16 07:45:00.309  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 07:45:00.325  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 07:45:00.326  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 07:45:00.326  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 07:45:00.376  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 166ms
2026-09-16 07:45:00.443  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789555500000}] and the following status: [COMPLETED] in 285ms
2026-09-16 07:45:00.443  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 07:50:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 07:50:00.044  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789555800000}]
2026-09-16 07:50:00.079  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 07:50:00.091  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 07:50:00.177  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27144593,27144750,27146535,27146630,27147737,27151787,26786192,26973090,26986852,26717456
2026-09-16 07:50:00.177  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 07:50:00.184  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 07:50:00.184  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 07:50:00.184  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 07:50:00.200  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 121ms
2026-09-16 07:50:00.220  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789555800000}] and the following status: [COMPLETED] in 166ms
2026-09-16 07:50:00.220  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 07:55:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 07:55:00.066  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789556100001}]
2026-09-16 07:55:00.111  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 07:55:00.124  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 07:55:00.222  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26998388,27047686,27070252,27245212,27080988,27094504,27207806,27216647,27222264,27238435
2026-09-16 07:55:00.222  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 07:55:00.233  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 07:55:00.233  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 07:55:00.233  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 07:55:00.256  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 145ms
2026-09-16 07:55:00.278  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789556100001}] and the following status: [COMPLETED] in 204ms
2026-09-16 07:55:00.279  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 08:00:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 08:00:00.052  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789556400000}]
2026-09-16 08:00:00.088  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 08:00:00.103  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 08:00:00.180  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27246877,27254530,27261836,27273567,27276965,27289213,27278601,27279857,27281974,27289208
2026-09-16 08:00:00.180  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 08:00:00.190  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 08:00:00.190  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 08:00:00.190  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 08:00:00.207  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 119ms
2026-09-16 08:00:00.233  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789556400000}] and the following status: [COMPLETED] in 171ms
2026-09-16 08:00:00.233  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 08:05:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 08:05:00.049  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789556700000}]
2026-09-16 08:05:00.081  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 08:05:00.093  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 08:05:00.165  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27291231,27291401,27291766,27295524,27301332,27334721,27263032,27348148,27349881,27363432
2026-09-16 08:05:00.166  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 08:05:00.173  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 08:05:00.173  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 08:05:00.173  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 08:05:00.189  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 108ms
2026-09-16 08:05:00.210  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789556700000}] and the following status: [COMPLETED] in 152ms
2026-09-16 08:05:00.210  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 08:10:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 08:10:00.048  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789557000001}]
2026-09-16 08:10:00.081  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 08:10:00.094  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 08:10:00.169  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27605130,27148883,27239546,27607482,27609724,27611023,27617519,27612911,27615376,27615845
2026-09-16 08:10:00.169  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 08:10:00.185  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 08:10:00.185  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 08:10:00.185  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 08:10:00.205  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 124ms
2026-09-16 08:10:00.228  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789557000001}] and the following status: [COMPLETED] in 169ms
2026-09-16 08:10:00.228  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 08:15:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 08:15:00.120  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789557300000}]
2026-09-16 08:15:00.200  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 08:15:00.232  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 08:15:00.324  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27619401,27622267,27622344,27622509,27622600,27624131,27629340,27629745,27629878,27633485
2026-09-16 08:15:00.324  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 08:15:00.340  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 08:15:00.340  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 08:15:00.340  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 08:15:00.380  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 180ms
2026-09-16 08:15:00.433  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789557300000}] and the following status: [COMPLETED] in 285ms
2026-09-16 08:15:00.433  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 08:20:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 08:20:00.050  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789557600000}]
2026-09-16 08:20:00.084  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 08:20:00.097  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 08:20:00.166  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27640382,27642521,27643910,27645776,27650052,27652592,27655498,27655522,26321891,26120304
2026-09-16 08:20:00.166  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 08:20:00.177  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 08:20:00.177  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 08:20:00.177  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 08:20:00.194  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 110ms
2026-09-16 08:20:00.216  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789557600000}] and the following status: [COMPLETED] in 157ms
2026-09-16 08:20:00.216  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 08:25:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 08:25:00.068  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789557900000}]
2026-09-16 08:25:00.112  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 08:25:00.124  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 08:25:00.422  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26351933,26352508,26643658,26703207,26779235,26728840,26737594,26745569,26756542,26774131
2026-09-16 08:25:00.422  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 08:25:00.430  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 08:25:00.430  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 08:25:00.430  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 08:25:00.447  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 335ms
2026-09-16 08:25:00.471  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789557900000}] and the following status: [COMPLETED] in 391ms
2026-09-16 08:25:00.471  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 08:30:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 08:30:00.051  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789558200000}]
2026-09-16 08:30:00.090  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 08:30:00.103  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 08:30:00.228  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26780483,26789319,26819739,26900406,26834653,26843410,26852265,26863351,26875652,26876467
2026-09-16 08:30:00.228  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 08:30:00.244  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 08:30:00.244  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 08:30:00.244  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 08:30:00.261  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 171ms
2026-09-16 08:30:00.284  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789558200000}] and the following status: [COMPLETED] in 224ms
2026-09-16 08:30:00.284  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 08:35:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 08:35:00.045  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789558500001}]
2026-09-16 08:35:00.078  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 08:35:00.091  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 08:35:00.186  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26918437,26922505,26936463,26955446,27012570,26958406,26958531,26975951,26983006,26985990
2026-09-16 08:35:00.186  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 08:35:00.200  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 08:35:00.200  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 08:35:00.200  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 08:35:00.295  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 217ms
2026-09-16 08:35:00.318  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789558500001}] and the following status: [COMPLETED] in 264ms
2026-09-16 08:35:00.318  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 08:40:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 08:40:00.048  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789558800000}]
2026-09-16 08:40:00.081  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 08:40:00.094  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 08:40:00.168  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27025198,27052097,27052906,27065503,27159669,27072372,27082739,27086342,27133608,27139735
2026-09-16 08:40:00.168  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 08:40:00.184  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 08:40:00.184  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 08:40:00.184  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 08:40:00.200  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 119ms
2026-09-16 08:40:00.222  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789558800000}] and the following status: [COMPLETED] in 165ms
2026-09-16 08:40:00.222  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 08:45:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 08:45:00.128  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789559100001}]
2026-09-16 08:45:00.208  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 08:45:00.245  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 08:45:00.322  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27175861,27195652,27256660,27156611,27293252,26616731,27114737,26318741,27154363,27155037
2026-09-16 08:45:00.322  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 08:45:00.336  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 08:45:00.336  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 08:45:00.336  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 08:45:00.384  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 175ms
2026-09-16 08:45:00.452  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789559100001}] and the following status: [COMPLETED] in 287ms
2026-09-16 08:45:00.452  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 08:50:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 08:50:00.066  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789559400001}]
2026-09-16 08:50:00.133  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 08:50:00.145  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 08:50:00.695  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27156673,27157287,27159397,27168630,27169593,27178803,27179671,26598738,27190387,26034021
2026-09-16 08:50:00.696  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 08:50:00.705  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 08:50:00.705  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 08:50:00.705  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 08:50:00.721  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 588ms
2026-09-16 08:50:00.740  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789559400001}] and the following status: [COMPLETED] in 665ms
2026-09-16 08:50:00.740  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 08:55:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 08:55:00.066  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789559700000}]
2026-09-16 08:55:00.111  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 08:55:00.122  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 08:55:00.485  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26706938,26722594,26723948,26738722,26876604,26752371,26786389,26807830,26819230,26841012
2026-09-16 08:55:00.485  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 08:55:00.495  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 08:55:00.495  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 08:55:00.495  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 08:55:00.513  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 402ms
2026-09-16 08:55:00.534  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789559700000}] and the following status: [COMPLETED] in 458ms
2026-09-16 08:55:00.535  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 09:00:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 09:00:00.057  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789560000000}]
2026-09-16 09:00:00.101  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 09:00:00.114  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 09:00:00.222  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26895156,27012283,27025762,26087755,27055838,27094427,27377158,27378661,27378964,26074500
2026-09-16 09:00:00.222  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 09:00:00.238  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 09:00:00.238  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 09:00:00.238  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 09:00:00.253  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 152ms
2026-09-16 09:00:00.274  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789560000000}] and the following status: [COMPLETED] in 208ms
2026-09-16 09:00:00.275  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 09:05:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 09:05:00.043  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789560300000}]
2026-09-16 09:05:00.073  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 09:05:00.084  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 09:05:00.151  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26200943,26229751,26282545,27112559,26328404,26414693,26464944,26607659,26611976,27112192
2026-09-16 09:05:00.151  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 09:05:00.163  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 09:05:00.163  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 09:05:00.163  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 09:05:00.179  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 106ms
2026-09-16 09:05:00.198  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789560300000}] and the following status: [COMPLETED] in 146ms
2026-09-16 09:05:00.198  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 09:10:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 09:10:00.046  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789560600001}]
2026-09-16 09:10:00.075  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 09:10:00.086  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 09:10:00.149  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27252952,27451807,26669387,26776721,26321244,26697558,26713351,26717188,26759689,26775122
2026-09-16 09:10:00.149  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 09:10:00.159  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 09:10:00.159  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 09:10:00.159  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 09:10:00.174  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 99ms
2026-09-16 09:10:00.193  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789560600001}] and the following status: [COMPLETED] in 139ms
2026-09-16 09:10:00.193  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 09:15:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 09:15:00.044  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789560900001}]
2026-09-16 09:15:00.071  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 09:15:00.084  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 09:15:00.139  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26814160,26816946,26834913,26955009,26856191,26907976,26927334,26934856,26941915,26943807
2026-09-16 09:15:00.140  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 09:15:00.150  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 09:15:00.150  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 09:15:00.150  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 09:15:00.165  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 94ms
2026-09-16 09:15:00.184  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789560900001}] and the following status: [COMPLETED] in 132ms
2026-09-16 09:15:00.184  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 09:20:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 09:20:00.043  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789561200000}]
2026-09-16 09:20:00.072  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 09:20:00.084  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 09:20:00.146  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26958076,26974382,26979450,26982399,27034651,26999182,27003708,27010441,27027295,27030908
2026-09-16 09:20:00.146  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 09:20:00.157  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 09:20:00.157  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 09:20:00.157  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 09:20:00.171  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 98ms
2026-09-16 09:20:00.191  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789561200000}] and the following status: [COMPLETED] in 139ms
2026-09-16 09:20:00.191  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 09:25:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 09:25:00.075  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789561500000}]
2026-09-16 09:25:00.116  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 09:25:00.128  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 09:25:00.549  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26380539,26601199,26674191,26862347,26690701,26719515,26776018,26788557,26813678,26836887
2026-09-16 09:25:00.549  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 09:25:00.559  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 09:25:00.559  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 09:25:00.559  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 09:25:00.579  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 463ms
2026-09-16 09:25:00.598  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789561500000}] and the following status: [COMPLETED] in 516ms
2026-09-16 09:25:00.598  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 09:30:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 09:30:00.048  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789561800000}]
2026-09-16 09:30:00.080  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 09:30:00.091  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 09:30:00.185  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26870419,26894401,26904849,26948611,27098079,26960326,26972146,26984765,27010676,27061747
2026-09-16 09:30:00.185  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 09:30:00.200  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 09:30:00.200  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 09:30:00.200  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 09:30:00.215  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 135ms
2026-09-16 09:30:00.237  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789561800000}] and the following status: [COMPLETED] in 179ms
2026-09-16 09:30:00.237  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 09:35:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 09:35:00.045  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789562100000}]
2026-09-16 09:35:00.080  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 09:35:00.092  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 09:35:00.163  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27103942,27171386,27190228,27351769,27201792,27283346,27313450,27340039,27342979,27346477
2026-09-16 09:35:00.163  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 09:35:00.173  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 09:35:00.173  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 09:35:00.173  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 09:35:00.187  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 107ms
2026-09-16 09:35:00.208  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789562100000}] and the following status: [COMPLETED] in 155ms
2026-09-16 09:35:00.208  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 09:40:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 09:40:00.044  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789562400000}]
2026-09-16 09:40:00.073  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 09:40:00.085  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 09:40:00.152  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27390649,27392822,26735039,26780757,26781351,26786102,26799274,26832607,26867942,26898992
2026-09-16 09:40:00.152  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 09:40:00.164  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 09:40:00.164  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 09:40:00.164  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 09:40:00.177  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 104ms
2026-09-16 09:40:00.195  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789562400000}] and the following status: [COMPLETED] in 144ms
2026-09-16 09:40:00.196  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 09:45:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 09:45:00.127  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789562700000}]
2026-09-16 09:45:00.203  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 09:45:00.232  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 09:45:00.307  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26904111,26913028,26920176,26942136,26954753,26964489,26977689,26989980,27005702,27026535
2026-09-16 09:45:00.307  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 09:45:00.319  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 09:45:00.319  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 09:45:00.319  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 09:45:00.337  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 134ms
2026-09-16 09:45:00.360  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789562700000}] and the following status: [COMPLETED] in 224ms
2026-09-16 09:45:00.360  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 09:50:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 09:50:00.057  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789563000000}]
2026-09-16 09:50:00.089  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 09:50:00.101  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 09:50:00.192  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27053943,27055540,26217818,26304379,27199167,27199246,27200527,27208190,27118797,26513659
2026-09-16 09:50:00.192  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 09:50:00.206  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 09:50:00.206  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 09:50:00.206  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 09:50:00.225  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 136ms
2026-09-16 09:50:00.246  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789563000000}] and the following status: [COMPLETED] in 180ms
2026-09-16 09:50:00.246  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 09:55:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 09:55:00.066  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789563300000}]
2026-09-16 09:55:00.120  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 09:55:00.132  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 09:55:00.665  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27209554,27210621,27212572,27213934,27218034,27219814,27219923,27223907,27232596,27232378
2026-09-16 09:55:00.666  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 09:55:00.675  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 09:55:00.675  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 09:55:00.675  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 09:55:00.690  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 570ms
2026-09-16 09:55:00.710  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789563300000}] and the following status: [COMPLETED] in 636ms
2026-09-16 09:55:00.710  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 10:00:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 10:00:00.061  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789563600000}]
2026-09-16 10:00:00.102  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 10:00:00.114  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 10:00:00.795  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27233083,27236151,27239552,27241558,27242841,27242999,27245659,27250200,27254179,27255910
2026-09-16 10:00:00.795  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 10:00:00.809  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 10:00:00.809  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 10:00:00.809  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 10:00:00.824  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 722ms
2026-09-16 10:00:00.844  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789563600000}] and the following status: [COMPLETED] in 774ms
2026-09-16 10:00:00.844  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 10:05:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 10:05:00.047  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789563900000}]
2026-09-16 10:05:00.091  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 10:05:00.101  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 10:05:00.698  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27258739,27262350,27263969,27281024,27284096,27298318,27288975,27294946,27296100,27298623
2026-09-16 10:05:00.698  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 10:05:00.706  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 10:05:00.707  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 10:05:00.707  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 10:05:00.719  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 628ms
2026-09-16 10:05:00.737  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789563900000}] and the following status: [COMPLETED] in 683ms
2026-09-16 10:05:00.737  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 10:10:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 10:10:00.044  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789564200001}]
2026-09-16 10:10:00.072  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 10:10:00.083  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 10:10:00.153  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27298677,27300057,27310224,27330789,27362608,27347073,27350566,27351732,27359484,27361098
2026-09-16 10:10:00.153  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 10:10:00.163  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 10:10:00.163  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 10:10:00.163  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 10:10:00.177  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 105ms
2026-09-16 10:10:00.195  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789564200001}] and the following status: [COMPLETED] in 143ms
2026-09-16 10:10:00.196  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 10:15:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 10:15:00.104  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789564500000}]
2026-09-16 10:15:00.212  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 10:15:00.272  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 10:15:00.357  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27364652,27373525,27374857,27376266,27378796,27379154,27381951,27386940,27388770,27387795
2026-09-16 10:15:00.357  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 10:15:00.369  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 10:15:00.369  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 10:15:00.369  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 10:15:00.411  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 199ms
2026-09-16 10:15:00.480  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789564500000}] and the following status: [COMPLETED] in 349ms
2026-09-16 10:15:00.480  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 10:20:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 10:20:00.077  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789564800000}]
2026-09-16 10:20:00.124  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 10:20:00.136  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 10:20:00.468  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27392563,27395951,27396927,27397498,27400790,26607660,26737012,26650908,26717360,26717938
2026-09-16 10:20:00.468  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 10:20:00.481  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 10:20:00.481  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 10:20:00.481  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 10:20:00.499  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 375ms
2026-09-16 10:20:00.517  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789564800000}] and the following status: [COMPLETED] in 432ms
2026-09-16 10:20:00.517  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 10:25:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 10:25:00.091  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789565100001}]
2026-09-16 10:25:00.153  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 10:25:00.168  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 10:25:00.754  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26739591,26763150,26774808,26797089,26956522,26987766,27001906,27002909,26873932,26831423
2026-09-16 10:25:00.754  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 10:25:00.770  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 10:25:00.770  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 10:25:00.770  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 10:25:00.786  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 633ms
2026-09-16 10:25:00.805  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789565100001}] and the following status: [COMPLETED] in 706ms
2026-09-16 10:25:00.805  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 10:30:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 10:30:00.055  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789565400000}]
2026-09-16 10:30:00.101  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 10:30:00.112  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 10:30:00.437  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27010984,27041921,27044149,26186964,27193577,27261517,27270751,27333898,27334822,27398248
2026-09-16 10:30:00.437  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 10:30:00.449  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 10:30:00.449  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 10:30:00.449  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 10:30:00.465  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 364ms
2026-09-16 10:30:00.487  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789565400000}] and the following status: [COMPLETED] in 423ms
2026-09-16 10:30:00.487  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 10:35:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 10:35:00.043  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789565700001}]
2026-09-16 10:35:00.072  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 10:35:00.089  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 10:35:00.165  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26326560,26354662,26359364,26399679,27188770,27171934,26461984,26582571,27112823,27150588
2026-09-16 10:35:00.166  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 10:35:00.175  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 10:35:00.175  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 10:35:00.175  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 10:35:00.190  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 118ms
2026-09-16 10:35:00.208  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789565700001}] and the following status: [COMPLETED] in 157ms
2026-09-16 10:35:00.208  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 10:40:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 10:40:00.053  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789566000001}]
2026-09-16 10:40:00.087  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 10:40:00.104  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 10:40:00.212  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27188911,27212151,26261011,26774132,26345943,26440385,26579346,26650034,26715195,26746177
2026-09-16 10:40:00.212  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 10:40:00.226  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 10:40:00.226  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 10:40:00.226  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 10:40:00.239  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 152ms
2026-09-16 10:40:00.260  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789566000001}] and the following status: [COMPLETED] in 197ms
2026-09-16 10:40:00.260  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 10:45:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 10:45:00.111  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789566300001}]
2026-09-16 10:45:00.177  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 10:45:00.205  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 10:45:00.298  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26813736,26813867,26838775,26852805,26953419,26864809,26874257,26897843,26941773,26944171
2026-09-16 10:45:00.299  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 10:45:00.312  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 10:45:00.312  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 10:45:00.312  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 10:45:00.346  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 169ms
2026-09-16 10:45:00.396  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789566300001}] and the following status: [COMPLETED] in 265ms
2026-09-16 10:45:00.396  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 10:50:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 10:50:00.075  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789566600000}]
2026-09-16 10:50:00.120  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 10:50:00.131  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 10:50:00.541  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27014730,27030979,27051545,27411079,27070077,27074102,27393764,27395942,27400801,27409641
2026-09-16 10:50:00.541  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 10:50:00.550  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 10:50:00.550  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 10:50:00.551  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 10:50:00.571  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 451ms
2026-09-16 10:50:00.598  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789566600000}] and the following status: [COMPLETED] in 512ms
2026-09-16 10:50:00.598  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 10:55:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 10:55:00.046  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789566900000}]
2026-09-16 10:55:00.081  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 10:55:00.092  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 10:55:00.161  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27411161,27412120,27412714,27416882,27420046,27427735,27430502,27440860,27440563,27440846
2026-09-16 10:55:00.161  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 10:55:00.168  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 10:55:00.168  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 10:55:00.168  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 10:55:00.181  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 100ms
2026-09-16 10:55:00.200  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789566900000}] and the following status: [COMPLETED] in 146ms
2026-09-16 10:55:00.200  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 11:00:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 11:00:00.048  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789567200000}]
2026-09-16 11:00:00.088  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 11:00:00.104  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 11:00:00.183  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27442803,27444679,27445870,27450785,27452874,27456955,27466955,27464578,27464947,27466165
2026-09-16 11:00:00.183  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 11:00:00.196  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 11:00:00.196  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 11:00:00.196  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 11:00:00.212  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 124ms
2026-09-16 11:00:00.233  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789567200000}] and the following status: [COMPLETED] in 176ms
2026-09-16 11:00:00.233  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 11:05:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 11:05:00.047  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789567500001}]
2026-09-16 11:05:00.078  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 11:05:00.091  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 11:05:00.171  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27467211,27468368,27469033,27471940,27474710,27476401,27478696,27478972,27478980,27480048
2026-09-16 11:05:00.171  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 11:05:00.181  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 11:05:00.181  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 11:05:00.181  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 11:05:00.194  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 116ms
2026-09-16 11:05:00.213  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789567500001}] and the following status: [COMPLETED] in 158ms
2026-09-16 11:05:00.213  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 11:10:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 11:10:00.045  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789567800000}]
2026-09-16 11:10:00.080  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 11:10:00.092  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 11:10:00.170  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27480663,27481662,27483763,27483907,27486511,27488143,27489473,27489620,27490110,27490251
2026-09-16 11:10:00.170  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 11:10:00.180  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 11:10:00.180  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 11:10:00.180  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 11:10:00.195  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 115ms
2026-09-16 11:10:00.214  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789567800000}] and the following status: [COMPLETED] in 161ms
2026-09-16 11:10:00.214  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 11:15:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 11:15:00.043  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789568100001}]
2026-09-16 11:15:00.087  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 11:15:00.099  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 11:15:00.181  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27491250,27492204,27494304,27496531,27508819,27509316,27511209,27515765,27512956,27514653
2026-09-16 11:15:00.181  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 11:15:00.191  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 11:15:00.191  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 11:15:00.191  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 11:15:00.205  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 118ms
2026-09-16 11:15:00.224  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789568100001}] and the following status: [COMPLETED] in 173ms
2026-09-16 11:15:00.224  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 11:20:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 11:20:00.064  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789568400001}]
2026-09-16 11:20:00.106  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 11:20:00.117  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 11:20:00.466  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27516453,27521626,27522198,27523759,27531178,27531180,27531271,27532334,27534775,27536219
2026-09-16 11:20:00.466  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 11:20:00.477  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 11:20:00.477  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 11:20:00.477  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 11:20:00.491  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 385ms
2026-09-16 11:20:00.510  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789568400001}] and the following status: [COMPLETED] in 439ms
2026-09-16 11:20:00.510  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 11:25:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 11:25:00.048  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789568700001}]
2026-09-16 11:25:00.076  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 11:25:00.087  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 11:25:00.168  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27537180,27537699,27542970,27543002,27545267,27546455,27549211,26365931,26338594,26712256
2026-09-16 11:25:00.168  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 11:25:00.181  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 11:25:00.181  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 11:25:00.181  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 11:25:00.195  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 119ms
2026-09-16 11:25:00.214  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789568700001}] and the following status: [COMPLETED] in 159ms
2026-09-16 11:25:00.214  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 11:30:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 11:30:00.043  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789569000000}]
2026-09-16 11:30:00.074  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 11:30:00.086  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 11:30:00.149  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26613563,27155089,27206399,27234647,27230863,27231416,27231858,27243620,27240878,27241074
2026-09-16 11:30:00.150  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 11:30:00.159  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 11:30:00.159  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 11:30:00.159  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 11:30:00.174  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 100ms
2026-09-16 11:30:00.193  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789569000000}] and the following status: [COMPLETED] in 142ms
2026-09-16 11:30:00.193  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 11:35:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 11:35:00.043  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789569300001}]
2026-09-16 11:35:00.070  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 11:35:00.095  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 11:35:00.162  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27252477,27262918,27349032,27597289,27354700,27431976,27432115,27446714,27470365,27486997
2026-09-16 11:35:00.162  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 11:35:00.173  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 11:35:00.173  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 11:35:00.173  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 11:35:00.249  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 179ms
2026-09-16 11:35:00.267  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789569300001}] and the following status: [COMPLETED] in 217ms
2026-09-16 11:35:00.267  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 11:40:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 11:40:00.047  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789569600001}]
2026-09-16 11:40:00.083  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 11:40:00.094  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 11:40:00.156  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26403570,26412768,26436633,26622757,26825668,26487025,26627419,26737166,26763309,26809368
2026-09-16 11:40:00.156  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 11:40:00.165  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 11:40:00.165  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 11:40:00.165  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 11:40:00.183  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 100ms
2026-09-16 11:40:00.200  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789569600001}] and the following status: [COMPLETED] in 146ms
2026-09-16 11:40:00.200  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 11:45:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 11:45:00.111  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789569900000}]
2026-09-16 11:45:00.197  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 11:45:00.223  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 11:45:00.303  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26830352,26890425,26935229,26232720,26965410,26981093,27018728,27055927,27064833,27065221
2026-09-16 11:45:00.304  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 11:45:00.316  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 11:45:00.316  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 11:45:00.316  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 11:45:00.359  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 162ms
2026-09-16 11:45:00.412  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789569900000}] and the following status: [COMPLETED] in 278ms
2026-09-16 11:45:00.412  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 11:50:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 11:50:00.049  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789570200001}]
2026-09-16 11:50:00.077  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 11:50:00.087  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 11:50:00.165  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26171204,26232114,27113487,27123356,27361104,27301967,27334605,27337191,27342688,27345689
2026-09-16 11:50:00.166  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 11:50:00.189  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 11:50:00.190  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 11:50:00.190  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 11:50:00.203  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 126ms
2026-09-16 11:50:00.219  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789570200001}] and the following status: [COMPLETED] in 163ms
2026-09-16 11:50:00.219  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 11:55:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 11:55:00.056  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789570500000}]
2026-09-16 11:55:00.098  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 11:55:00.108  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 11:55:00.476  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27404822,27415069,27463394,27550453,27472432,27476377,27483654,27504317,27528816,27530103
2026-09-16 11:55:00.476  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 11:55:00.486  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 11:55:00.486  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 11:55:00.486  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 11:55:00.500  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 402ms
2026-09-16 11:55:00.521  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789570500000}] and the following status: [COMPLETED] in 457ms
2026-09-16 11:55:00.521  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 12:00:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 12:00:00.044  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789570800001}]
2026-09-16 12:00:00.076  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 12:00:00.088  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 12:00:00.171  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27551048,27552546,27553286,27555539,27557338,27557855,27559166,27561079,27564674,27565518
2026-09-16 12:00:00.171  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 12:00:00.181  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 12:00:00.181  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 12:00:00.181  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 12:00:00.195  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 119ms
2026-09-16 12:00:00.213  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789570800001}] and the following status: [COMPLETED] in 161ms
2026-09-16 12:00:00.213  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 12:05:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 12:05:00.047  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789571100000}]
2026-09-16 12:05:00.077  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 12:05:00.088  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 12:05:00.440  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27566477,27566612,27569416,27570140,27574230,27575131,27578724,27579777,27581309,27589618
2026-09-16 12:05:00.440  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 12:05:00.450  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 12:05:00.451  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 12:05:00.451  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 12:05:00.464  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 387ms
2026-09-16 12:05:00.485  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789571100000}] and the following status: [COMPLETED] in 429ms
2026-09-16 12:05:00.485  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 12:10:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 12:10:00.039  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789571400001}]
2026-09-16 12:10:00.067  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 12:10:00.080  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 12:10:00.138  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27590250,27591808,27592228,27593852,27595031,27595660,27596081,27600590,27604601,27604600
2026-09-16 12:10:00.138  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 12:10:00.147  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 12:10:00.147  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 12:10:00.147  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 12:10:00.161  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 94ms
2026-09-16 12:10:00.178  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789571400001}] and the following status: [COMPLETED] in 132ms
2026-09-16 12:10:00.178  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 12:15:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 12:15:00.093  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789571700000}]
2026-09-16 12:15:00.155  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 12:15:00.178  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 12:15:00.242  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27605193,27609134,27611109,27612133,27612202,27613437,27615051,27616277,27616339,27617141
2026-09-16 12:15:00.242  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 12:15:00.252  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 12:15:00.253  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 12:15:00.253  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 12:15:00.279  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 124ms
2026-09-16 12:15:00.297  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789571700000}] and the following status: [COMPLETED] in 196ms
2026-09-16 12:15:00.297  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 12:20:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 12:20:00.069  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789572000000}]
2026-09-16 12:20:00.111  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 12:20:00.122  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 12:20:00.579  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27620123,27620417,27621234,27621270,27623895,27627509,27628368,27628971,27629185,26147083
2026-09-16 12:20:00.579  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 12:20:00.587  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 12:20:00.588  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 12:20:00.588  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 12:20:00.610  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 499ms
2026-09-16 12:20:00.631  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789572000000}] and the following status: [COMPLETED] in 553ms
2026-09-16 12:20:00.631  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 12:25:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 12:25:00.069  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789572300000}]
2026-09-16 12:25:00.113  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 12:25:00.131  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 12:25:00.220  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26688282,26695477,26697466,27129826,27140775,27447811,27155267,26193640,27120161,27443100
2026-09-16 12:25:00.220  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 12:25:00.230  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 12:25:00.230  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 12:25:00.230  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 12:25:00.243  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 130ms
2026-09-16 12:25:00.263  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789572300000}] and the following status: [COMPLETED] in 183ms
2026-09-16 12:25:00.263  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 12:30:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 12:30:00.046  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789572600000}]
2026-09-16 12:30:00.074  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 12:30:00.085  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 12:30:00.152  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27517526,27546594,27557041,27632674,26622977,27639915,26655956,26664332,26716924,26760816
2026-09-16 12:30:00.152  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 12:30:00.162  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 12:30:00.162  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 12:30:00.162  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 12:30:00.176  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 102ms
2026-09-16 12:30:00.195  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789572600000}] and the following status: [COMPLETED] in 140ms
2026-09-16 12:30:00.195  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 12:35:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 12:35:00.036  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789572900000}]
2026-09-16 12:35:00.063  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 12:35:00.073  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 12:35:00.154  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26655466,26809446,26811821,26828839,26873795,26843242,26849487,26850822,26860450,26869065
2026-09-16 12:35:00.154  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 12:35:00.166  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 12:35:00.167  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 12:35:00.167  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 12:35:00.189  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 126ms
2026-09-16 12:35:00.206  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789572900000}] and the following status: [COMPLETED] in 163ms
2026-09-16 12:35:00.206  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 12:40:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 12:40:00.038  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789573200001}]
2026-09-16 12:40:00.064  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 12:40:00.074  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 12:40:00.143  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26877141,26883994,26962759,27153539,27175963,26998916,27019572,27041075,27056277,26019758
2026-09-16 12:40:00.143  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 12:40:00.158  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 12:40:00.158  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 12:40:00.158  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 12:40:00.178  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 114ms
2026-09-16 12:40:00.195  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789573200001}] and the following status: [COMPLETED] in 150ms
2026-09-16 12:40:00.195  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 12:45:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 12:45:00.100  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789573500000}]
2026-09-16 12:45:00.164  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 12:45:00.186  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 12:45:00.262  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27245917,27260076,27261458,27270894,27588157,27625106,27277655,27610022,27388252,27460681
2026-09-16 12:45:00.262  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 12:45:00.275  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 12:45:00.275  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 12:45:00.275  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 12:45:00.312  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 148ms
2026-09-16 12:45:00.358  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789573500000}] and the following status: [COMPLETED] in 236ms
2026-09-16 12:45:00.358  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 12:50:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 12:50:00.065  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789573800000}]
2026-09-16 12:50:00.103  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 12:50:00.113  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 12:50:00.340  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27594889,27609309,27629824,27630367,27632887,27633772,27640941,27635202,27638059,27638205
2026-09-16 12:50:00.340  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 12:50:00.353  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 12:50:00.353  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 12:50:00.353  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 12:50:00.365  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 262ms
2026-09-16 12:50:00.381  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789573800000}] and the following status: [COMPLETED] in 309ms
2026-09-16 12:50:00.381  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 12:55:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 12:55:00.062  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789574100000}]
2026-09-16 12:55:00.102  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 12:55:00.112  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 12:55:00.369  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27641698,27642509,27644399,27645997,27646021,27646040,27647209,27649519,27649549,27650201
2026-09-16 12:55:00.370  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 12:55:00.381  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 12:55:00.381  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 12:55:00.381  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 12:55:00.395  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 293ms
2026-09-16 12:55:00.410  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789574100000}] and the following status: [COMPLETED] in 342ms
2026-09-16 12:55:00.411  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 13:00:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 13:00:00.045  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789574400000}]
2026-09-16 13:00:00.082  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 13:00:00.093  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 13:00:00.179  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27652362,27653147,27653847,27654221,27655666,26676965,26686959,26696108,26703319,26696846
2026-09-16 13:00:00.179  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 13:00:00.190  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 13:00:00.190  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 13:00:00.190  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 13:00:00.204  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 122ms
2026-09-16 13:00:00.221  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789574400000}] and the following status: [COMPLETED] in 169ms
2026-09-16 13:00:00.221  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 13:05:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 13:05:00.041  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789574700001}]
2026-09-16 13:05:00.068  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 13:05:00.078  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 13:05:00.144  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26728561,26729081,27373297,27381890,27473305,27410910,26224840,26302259,27447965,27472890
2026-09-16 13:05:00.144  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 13:05:00.157  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 13:05:00.157  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 13:05:00.157  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 13:05:00.179  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 111ms
2026-09-16 13:05:00.202  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789574700001}] and the following status: [COMPLETED] in 154ms
2026-09-16 13:05:00.202  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 13:10:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 13:10:00.042  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789575000000}]
2026-09-16 13:10:00.073  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 13:10:00.085  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 13:10:00.159  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27477682,27478072,27483658,27487232,27494332,26709833,27542663,27585055,26702778,26706767
2026-09-16 13:10:00.159  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 13:10:00.172  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 13:10:00.172  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 13:10:00.172  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 13:10:00.186  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 113ms
2026-09-16 13:10:00.204  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789575000000}] and the following status: [COMPLETED] in 154ms
2026-09-16 13:10:00.204  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 13:15:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 13:15:00.045  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789575300000}]
2026-09-16 13:15:00.078  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 13:15:00.106  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 13:15:00.186  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26712783,26716112,26718224,26764410,26774217,26802936,26858351,26824750,26838892,26850314
2026-09-16 13:15:00.187  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 13:15:00.201  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 13:15:00.201  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 13:15:00.201  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 13:15:00.228  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 150ms
2026-09-16 13:15:00.263  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789575300000}] and the following status: [COMPLETED] in 203ms
2026-09-16 13:15:00.263  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 13:20:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 13:20:00.097  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789575600000}]
2026-09-16 13:20:00.129  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 13:20:00.155  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 13:20:00.297  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26867116,26895542,26901894,26927789,26931286,27001490,26944846,26956526,26970268,26987769
2026-09-16 13:20:00.297  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 13:20:00.306  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 13:20:00.306  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 13:20:00.306  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 13:20:00.319  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 190ms
2026-09-16 13:20:00.335  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789575600000}] and the following status: [COMPLETED] in 231ms
2026-09-16 13:20:00.335  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 13:25:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 13:25:00.034  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789575900000}]
2026-09-16 13:25:00.056  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 13:25:00.065  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 13:25:00.124  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27030280,27030796,27031238,27034521,27045581,27068119,26281519,27077335,27079604,26082339
2026-09-16 13:25:00.124  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 13:25:00.135  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 13:25:00.135  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 13:25:00.135  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 13:25:00.147  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 91ms
2026-09-16 13:25:00.163  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789575900000}] and the following status: [COMPLETED] in 122ms
2026-09-16 13:25:00.163  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 13:30:00.001  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 13:30:00.041  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789576200001}]
2026-09-16 13:30:00.065  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 13:30:00.076  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 13:30:00.145  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26361471,26501532,27169962,27396946,27241282,27254366,27256296,27269448,27279086,27296136
2026-09-16 13:30:00.145  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 13:30:00.154  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 13:30:00.154  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 13:30:00.154  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 13:30:00.167  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 102ms
2026-09-16 13:30:00.185  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789576200001}] and the following status: [COMPLETED] in 137ms
2026-09-16 13:30:00.185  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 13:35:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 13:35:00.033  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789576500000}]
2026-09-16 13:35:00.059  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 13:35:00.068  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 13:35:00.129  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27429052,27482918,27496379,26280661,27517481,27526218,27588862,27616842,27626651,27634669
2026-09-16 13:35:00.129  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 13:35:00.141  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 13:35:00.141  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 13:35:00.141  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 13:35:00.152  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 93ms
2026-09-16 13:35:00.168  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789576500000}] and the following status: [COMPLETED] in 128ms
2026-09-16 13:35:00.168  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 13:40:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 13:40:00.034  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789576800000}]
2026-09-16 13:40:00.056  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 13:40:00.066  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 13:40:00.122  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26501818,26712967,26738596,27365404,26745618,26184676,27302002,26114492,27323532,27338872
2026-09-16 13:40:00.122  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 13:40:00.130  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 13:40:00.131  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 13:40:00.131  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 13:40:00.143  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 87ms
2026-09-16 13:40:00.158  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789576800000}] and the following status: [COMPLETED] in 118ms
2026-09-16 13:40:00.159  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 13:45:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 13:45:00.088  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789577100000}]
2026-09-16 13:45:00.144  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 13:45:00.164  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 13:45:00.223  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27418313,27493304,27531276,27576640,26718013,26720575,26727552,26410839,27611096,26317695
2026-09-16 13:45:00.224  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 13:45:00.236  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 13:45:00.236  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 13:45:00.236  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 13:45:00.268  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 124ms
2026-09-16 13:45:00.306  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789577100000}] and the following status: [COMPLETED] in 200ms
2026-09-16 13:45:00.306  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 13:50:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 13:50:00.063  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789577400001}]
2026-09-16 13:50:00.102  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 13:50:00.112  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 13:50:00.887  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26761766,26769155,26771102,26821508,26841138,26897213,26848591,26860446,26862771,26871495
2026-09-16 13:50:00.887  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 13:50:00.898  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 13:50:00.898  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 13:50:00.898  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 13:50:00.910  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 808ms
2026-09-16 13:50:00.924  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789577400001}] and the following status: [COMPLETED] in 854ms
2026-09-16 13:50:00.924  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 13:55:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 13:55:00.042  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789577700000}]
2026-09-16 13:55:00.103  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 13:55:00.113  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 13:55:00.365  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26921647,26963551,26965819,26977278,27076137,26980166,27003716,27006495,27022268,27057261
2026-09-16 13:55:00.365  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 13:55:00.376  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 13:55:00.376  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 13:55:00.376  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 13:55:00.389  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 286ms
2026-09-16 13:55:00.405  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789577700000}] and the following status: [COMPLETED] in 356ms
2026-09-16 13:55:00.405  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 14:00:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 14:00:00.040  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789578000000}]
2026-09-16 14:00:00.070  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 14:00:00.081  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 14:00:00.154  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27079516,27080934,27084034,26201596,26296581,27396658,26426637,27150047,27391632,27395995
2026-09-16 14:00:00.154  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 14:00:00.181  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 14:00:00.181  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 14:00:00.181  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 14:00:00.197  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 127ms
2026-09-16 14:00:00.217  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789578000000}] and the following status: [COMPLETED] in 169ms
2026-09-16 14:00:00.217  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 14:05:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 14:05:00.041  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789578300000}]
2026-09-16 14:05:00.066  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 14:05:00.075  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 14:05:00.190  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27404583,27437437,27460435,26363375,27478515,27490333,27615322,27653699,26263134,26347282
2026-09-16 14:05:00.190  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 14:05:00.199  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 14:05:00.199  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 14:05:00.199  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 14:05:00.210  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 144ms
2026-09-16 14:05:00.225  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789578300000}] and the following status: [COMPLETED] in 178ms
2026-09-16 14:05:00.225  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 14:10:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 14:10:00.045  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789578600000}]
2026-09-16 14:10:00.070  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 14:10:00.079  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 14:10:00.150  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26408405,26517685,26534291,26750624,26603124,26702972,26703159,26730455,26733009,26750469
2026-09-16 14:10:00.150  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 14:10:00.160  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 14:10:00.160  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 14:10:00.160  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 14:10:00.171  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 101ms
2026-09-16 14:10:00.187  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789578600000}] and the following status: [COMPLETED] in 135ms
2026-09-16 14:10:00.187  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 14:15:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 14:15:00.087  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789578900000}]
2026-09-16 14:15:00.143  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 14:15:00.165  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 14:15:00.245  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26758118,26760840,26763042,26764475,26766546,26767793,26772472,26772878,26773272,26776722
2026-09-16 14:15:00.245  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 14:15:00.261  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 14:15:00.261  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 14:15:00.261  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 14:15:00.286  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 143ms
2026-09-16 14:15:00.325  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789578900000}] and the following status: [COMPLETED] in 222ms
2026-09-16 14:15:00.325  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 14:20:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 14:20:00.066  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789579200000}]
2026-09-16 14:20:00.109  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 14:20:00.120  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 14:20:00.518  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26777674,26777931,26780104,26780481,26786116,26787805,26788090,26789840,26797858,26797277
2026-09-16 14:20:00.518  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 14:20:00.537  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 14:20:00.537  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 14:20:00.537  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 14:20:00.553  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 444ms
2026-09-16 14:20:00.571  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789579200000}] and the following status: [COMPLETED] in 497ms
2026-09-16 14:20:00.571  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 14:25:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 14:25:00.031  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789579500000}]
2026-09-16 14:25:00.056  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 14:25:00.065  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 14:25:00.130  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26807186,26807533,26813680,26816266,26819306,26825762,26827656,26837515,26843618,27151326
2026-09-16 14:25:00.130  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 14:25:00.138  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 14:25:00.138  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 14:25:00.138  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 14:25:00.150  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 93ms
2026-09-16 14:25:00.170  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789579500000}] and the following status: [COMPLETED] in 126ms
2026-09-16 14:25:00.170  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 14:30:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 14:30:00.038  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789579800000}]
2026-09-16 14:30:00.064  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 14:30:00.073  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 14:30:00.151  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27208127,27309522,27314061,27373224,27573880,26294229,26340293,27439030,27532436,27564195
2026-09-16 14:30:00.151  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 14:30:00.164  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 14:30:00.164  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 14:30:00.164  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 14:30:00.177  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 113ms
2026-09-16 14:30:00.192  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789579800000}] and the following status: [COMPLETED] in 148ms
2026-09-16 14:30:00.192  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 14:35:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 14:35:00.036  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789580100001}]
2026-09-16 14:35:00.059  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 14:35:00.070  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 14:35:00.138  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27584801,27599485,27619933,26826765,27634179,26653677,26709157,26776924,26780012,26800806
2026-09-16 14:35:00.138  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 14:35:00.148  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 14:35:00.148  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 14:35:00.148  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 14:35:00.161  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 102ms
2026-09-16 14:35:00.176  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789580100001}] and the following status: [COMPLETED] in 134ms
2026-09-16 14:35:00.176  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 14:40:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 14:40:00.035  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789580400000}]
2026-09-16 14:40:00.059  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 14:40:00.067  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 14:40:00.151  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26832834,26856326,26875034,27055924,26909335,26947607,26966355,26976283,26980901,26985885
2026-09-16 14:40:00.151  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 14:40:00.161  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 14:40:00.161  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 14:40:00.161  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 14:40:00.172  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 113ms
2026-09-16 14:40:00.186  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789580400000}] and the following status: [COMPLETED] in 145ms
2026-09-16 14:40:00.186  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 14:45:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 14:45:00.034  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789580700000}]
2026-09-16 14:45:00.058  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 14:45:00.067  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 14:45:00.137  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27068582,27079755,27084761,27084901,27085048,27085490,27092916,27464192,27251119,27415979
2026-09-16 14:45:00.137  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 14:45:00.150  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 14:45:00.150  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 14:45:00.150  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 14:45:00.161  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 102ms
2026-09-16 14:45:00.175  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789580700000}] and the following status: [COMPLETED] in 135ms
2026-09-16 14:45:00.175  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 14:50:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 14:50:00.057  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789581000000}]
2026-09-16 14:50:00.094  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 14:50:00.102  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 14:50:00.432  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 27490738,27514456,27531278,26492036,27588825,27589871,27602957,27628022,27639453,27643044
2026-09-16 14:50:00.432  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 14:50:00.446  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 14:50:00.446  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 14:50:00.446  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 14:50:00.463  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 369ms
2026-09-16 14:50:00.481  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789581000000}] and the following status: [COMPLETED] in 418ms
2026-09-16 14:50:00.481  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 14:55:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 14:55:00.032  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789581300000}]
2026-09-16 14:55:00.052  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 14:55:00.060  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 14:55:00.121  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26598249,26703416,26728254,26729448,26845523,26752291,26753092,26773955,26828157,26841237
2026-09-16 14:55:00.122  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 14:55:00.131  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 14:55:00.131  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 14:55:00.131  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 14:55:00.142  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 90ms
2026-09-16 14:55:00.155  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789581300000}] and the following status: [COMPLETED] in 117ms
2026-09-16 14:55:00.155  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 15:00:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 15:00:00.036  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789581600001}]
2026-09-16 15:00:00.060  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 15:00:00.069  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 15:00:00.147  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26846990,26849662,26850642,26851361,26855111,26855940,26856179,26856643,26857322,26868041
2026-09-16 15:00:00.147  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 15:00:00.160  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 15:00:00.160  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 15:00:00.160  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 15:00:00.173  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 113ms
2026-09-16 15:00:00.190  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789581600001}] and the following status: [COMPLETED] in 147ms
2026-09-16 15:00:00.190  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
2026-09-16 15:05:00.000  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Iniciando Job de exclusao.
2026-09-16 15:05:00.031  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] launched with the following parameters: [{executionTime=1789581900001}]
2026-09-16 15:05:00.053  INFO 8 --- [   scheduling-1] o.s.batch.core.job.SimpleStepHandler     : Executing step: [deleteStep]
2026-09-16 15:05:00.062  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --INICIO DA EXECUCAO--
2026-09-16 15:05:00.120  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : NU_CFD003 encontrados: 26868277,26882985,26884058,26888709,26602848,27259443,26345754,26618809,27203249,27237398
2026-09-16 15:05:00.121  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade encontrada para exclus?o: 10
2026-09-16 15:05:00.129  INFO 8 --- [   scheduling-1] b.g.c.m.repository.ErroRepository        : Total de registros exclu?dos: 10
2026-09-16 15:05:00.129  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : Quantidade excluida: 10
2026-09-16 15:05:00.129  INFO 8 --- [   scheduling-1] b.g.c.m.service.ExclusaoCodErroService   : --FIM DA EXECUCAO--
2026-09-16 15:05:00.140  INFO 8 --- [   scheduling-1] o.s.batch.core.step.AbstractStep         : Step: [deleteStep] executed in 87ms
2026-09-16 15:05:00.154  INFO 8 --- [   scheduling-1] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deleteJob]] completed with the following parameters: [{executionTime=1789581900001}] and the following status: [COMPLETED] in 115ms
2026-09-16 15:05:00.154  INFO 8 --- [   scheduling-1] b.g.c.m.scheduler.SchedulerConfig        : Status Job: COMPLETED
