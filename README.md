
-sh-4.1$ tail -f /logs/jboss-eap/hc/servers/sicem_node1_lx0005/server.log
15:38:32,857 INFO  [org.springframework.web.context.support.XmlWebApplicationContext] (ServerService Thread Pool -- 74) Closing Root WebApplicationContext: startup date [Wed Sep 30 20:00:36 BRT 2026]; root of context hierarchy
15:38:32,861 INFO  [org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean] (ServerService Thread Pool -- 74) Closing JPA EntityManagerFactory for persistence unit 'SicemWebPU'
15:38:32,888 INFO  [org.jboss.modcluster] (ServerService Thread Pool -- 73) MODCLUSTER000002: Initiating mod_cluster shutdown
15:38:32,893 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 73) JBAS011403: Interrompendo Persistence Unit Serviço 'SicemWEB_6.1.0.12.03.war#SicemWebPU'
15:38:32,895 INFO  [org.apache.coyote.ajp] (MSC service thread 1-5) JBWEB003048: Pausing Coyote AJP/1.3 on ajp-/10.116.88.24:12809
15:38:32,896 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-4) JBAS010409: Fonte de dados sem limite [java:/jboss/datasources/sicem-ds]
15:38:32,896 INFO  [org.apache.coyote.ajp] (MSC service thread 1-5) JBWEB003051: Stopping Coyote AJP/1.3 on ajp-/10.116.88.24:12809
15:38:32,903 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-5) JBAS015877: Implantação encerrada postgresql-9.1-901-1.jdbc4.jar (runtime-name: postgresql-9.1-901-1.jdbc4.jar) em 104ms
15:38:32,970 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) JBAS015877: Implantação encerrada SICEM (runtime-name: SicemWEB_6.1.0.12.03.war) em 174ms
15:38:32,988 INFO  [org.jboss.as] (MSC service thread 1-7) JBAS015950: JBoss EAP 6.4.24.GA (AS 7.5.24.Final-redhat-00001) interrompido em 191ms




ta pegando o antigo ainda
