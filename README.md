[root@caddeapllx1441 p585600]# systemctl status jboss-eap-standalone.service
● jboss-eap-standalone.service - JBoss EAP Systemctl - STANDALONE
   Loaded: loaded (/etc/systemd/system/jboss-eap-standalone.service; enabled; vendor preset: disabled)
   Active: active (running) since Qua 2026-08-05 14:13:19 -03; 13min ago
 Main PID: 8019 (runuser)
   CGroup: /system.slice/jboss-eap-standalone.service
           ├─8019 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh     ...
           ├─8022 /bin/sh /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/...
           └─8182 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sisme/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotati...

Ago 05 14:13:13 caddeapllx1441.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[7899]: Stopping JBoss EAP: [  OK  ]
Ago 05 14:13:13 caddeapllx1441.agil.nprd.caixa.gov.br systemd[1]: Stopped JBoss EAP Systemctl - STANDALONE.
Ago 05 14:13:13 caddeapllx1441.agil.nprd.caixa.gov.br systemd[1]: Starting JBoss EAP Systemctl - STANDALONE...
Ago 05 14:13:13 caddeapllx1441.agil.nprd.caixa.gov.br runuser[8009]: pam_unix(runuser:session): session opened for user jboss by (uid=0)
Ago 05 14:13:13 caddeapllx1441.agil.nprd.caixa.gov.br runuser[8014]: pam_unix(runuser:session): session opened for user jboss by (uid=0)
Ago 05 14:13:13 caddeapllx1441.agil.nprd.caixa.gov.br runuser[8019]: pam_unix(runuser:session): session opened for user jboss by (uid=0)
Ago 05 14:13:19 caddeapllx1441.agil.nprd.caixa.gov.br systemd[1]: Started JBoss EAP Systemctl - STANDALONE.
Ago 05 14:13:19 caddeapllx1441.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[8004]: Starting JBoss EAP: [  OK  ]
[root@caddeapllx1441 p585600]# tail -50 /logs/jboss/jboss-eap/standalone/sisme/server.log
2026-08-05 14:14:05,643 INFO  [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 84) HHH000270: Type registration [java.util.UUID] overrides previous : org.hibernate.type.UUIDBinaryType@2e9d80ee
2026-08-05 14:14:05,649 INFO  [org.hibernate.engine.jdbc.env.internal.LobCreatorBuilderImpl] (ServerService Thread Pool -- 82) HHH000424: Disabling contextual LOB creation as createClob() method threw error : java.lang.reflect.InvocationTargetException
2026-08-05 14:14:05,649 INFO  [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 82) HHH000270: Type registration [java.util.UUID] overrides previous : org.hibernate.type.UUIDBinaryType@2e9d80ee
2026-08-05 14:14:05,650 INFO  [org.hibernate.envers.boot.internal.EnversServiceImpl] (ServerService Thread Pool -- 82) Envers integration enabled? : true
2026-08-05 14:14:05,643 INFO  [org.hibernate.envers.boot.internal.EnversServiceImpl] (ServerService Thread Pool -- 84) Envers integration enabled? : true
2026-08-05 14:14:05,680 INFO  [org.hibernate.engine.jdbc.env.internal.LobCreatorBuilderImpl] (ServerService Thread Pool -- 81) HHH000424: Disabling contextual LOB creation as createClob() method threw error : java.lang.reflect.InvocationTargetException
2026-08-05 14:14:05,680 INFO  [org.hibernate.type.BasicTypeRegistry] (ServerService Thread Pool -- 81) HHH000270: Type registration [java.util.UUID] overrides previous : org.hibernate.type.UUIDBinaryType@2e9d80ee
2026-08-05 14:14:05,703 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 84) HHH000038: Composite-id class does not override equals(): br.gov.cef.sisme.domain.siegh.JuridicaSIEGHPK
2026-08-05 14:14:05,704 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 84) HHH000039: Composite-id class does not override hashCode(): br.gov.cef.sisme.domain.siegh.JuridicaSIEGHPK
2026-08-05 14:14:05,681 INFO  [org.hibernate.envers.boot.internal.EnversServiceImpl] (ServerService Thread Pool -- 81) Envers integration enabled? : true
2026-08-05 14:14:07,457 INFO  [org.hibernate.hql.internal.QueryTranslatorFactoryInitiator] (ServerService Thread Pool -- 83) HHH000397: Using ASTQueryTranslatorFactory
2026-08-05 14:14:09,672 INFO  [org.jboss.weld.Event] (MSC service thread 1-1) WELD-000411: Observer method [BackedAnnotatedMethod] protected org.springframework.data.repository.cdi.CdiRepositoryExtensionSupport.processAnnotatedType(@Observes ProcessAnnotatedType<X>) receives events for all annotated types. Consider restricting events using @WithAnnotations or a generic type with bounds.
2026-08-05 14:14:09,794 WARN  [org.jboss.weld.Bootstrap] (MSC service thread 1-1) WELD-000146: BeforeBeanDiscovery.addAnnotatedType(AnnotatedType<?>) used for class com.sun.faces.flow.FlowDiscoveryCDIHelper is deprecated from CDI 1.1!
2026-08-05 14:14:11,091 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-1) Registering bean for 'br.gov.cef.sisme.repository.ContratoRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
2026-08-05 14:14:11,099 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-1) Registering bean for 'br.gov.cef.sisme.repository.SismeRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
2026-08-05 14:14:11,106 SEVERE [javax.enterprise.resource.webcontainer.jsf.application.view] (MSC service thread 1-1) Unable to obtain CDI 1.1 utilities for Mojarra
2026-08-05 14:14:11,110 SEVERE [javax.enterprise.resource.webcontainer.jsf.flow] (MSC service thread 1-1) Unable to obtain CDI 1.1 utilities for Mojarra
2026-08-05 14:14:12,013 INFO  [org.quartz.impl.StdSchedulerFactory] (ServerService Thread Pool -- 93) Using default implementation for ThreadExecutor
2026-08-05 14:14:12,122 INFO  [org.quartz.core.SchedulerSignalerImpl] (ServerService Thread Pool -- 93) Initialized Scheduler Signaller of type: class org.quartz.core.SchedulerSignalerImpl
2026-08-05 14:14:12,122 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 93) Quartz Scheduler v.2.3.2 created.
2026-08-05 14:14:12,135 INFO  [org.quartz.simpl.RAMJobStore] (ServerService Thread Pool -- 93) RAMJobStore initialized.
2026-08-05 14:14:12,136 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 93) Scheduler meta-data: Quartz Scheduler (v2.3.2) 'SismeRotinasQuartz' with instanceId 'NON_CLUSTERED'
  Scheduler class: 'org.quartz.core.QuartzScheduler' - running locally.
  NOT STARTED.
  Currently in standby mode.
  Number of jobs executed: 0
  Using thread pool 'org.quartz.simpl.SimpleThreadPool' - with 1 threads.
  Using job-store 'org.quartz.simpl.RAMJobStore' - which does not support persistence. and is not clustered.

2026-08-05 14:14:12,137 INFO  [org.quartz.impl.StdSchedulerFactory] (ServerService Thread Pool -- 93) Quartz scheduler 'SismeRotinasQuartz' initialized from default resource file in Quartz package: 'quartz.properties'
2026-08-05 14:14:12,137 INFO  [org.quartz.impl.StdSchedulerFactory] (ServerService Thread Pool -- 93) Quartz scheduler version: 2.3.2
2026-08-05 14:14:12,137 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 93) Scheduler SismeRotinasQuartz_$_NON_CLUSTERED started.
2026-08-05 14:14:12,208 WARN  [org.infinispan.configuration.parsing.Parser80] (ServerService Thread Pool -- 85) ISPN000383: The eviction max-entries attribute has been deprecated. Please use the size attribute instead
2026-08-05 14:14:12,209 WARN  [org.infinispan.configuration.parsing.Parser80] (ServerService Thread Pool -- 85) ISPN000383: The eviction max-entries attribute has been deprecated. Please use the size attribute instead
2026-08-05 14:14:12,210 WARN  [org.infinispan.configuration.parsing.Parser80] (ServerService Thread Pool -- 85) ISPN000383: The eviction max-entries attribute has been deprecated. Please use the size attribute instead
2026-08-05 14:14:12,215 WARN  [org.infinispan.configuration.parsing.Parser80] (ServerService Thread Pool -- 87) ISPN000383: The eviction max-entries attribute has been deprecated. Please use the size attribute instead
2026-08-05 14:14:12,215 WARN  [org.infinispan.configuration.parsing.Parser80] (ServerService Thread Pool -- 87) ISPN000383: The eviction max-entries attribute has been deprecated. Please use the size attribute instead
2026-08-05 14:14:12,216 WARN  [org.infinispan.configuration.parsing.Parser80] (ServerService Thread Pool -- 87) ISPN000383: The eviction max-entries attribute has been deprecated. Please use the size attribute instead
2026-08-05 14:14:12,758 INFO  [org.hibernate.hql.internal.QueryTranslatorFactoryInitiator] (Timer-2) HHH000397: Using ASTQueryTranslatorFactory
2026-08-05 14:14:12,866 INFO  [javax.enterprise.resource.webcontainer.jsf.config] (ServerService Thread Pool -- 87) Inicializando Mojarra 2.3.14.SP06 para o contexto '/sisme_intranet'
2026-08-05 14:14:13,467 WARNING [javax.enterprise.resource.webcontainer.jsf.application] (ServerService Thread Pool -- 87) @FacesConverter is using both value and forClass, only value will be applied.
2026-08-05 14:14:13,908 INFO  [javax.enterprise.resource.webcontainer.jsf.config] (ServerService Thread Pool -- 87) Monitoring file:/opt/jboss-eap/standalone/tmp/vfs/deployment/deploymentb105a82eab712ddb/sisme-web-2.94.1.0.war-deb079e37160f3ec/WEB-INF/faces-config.xml for modifications
2026-08-05 14:14:14,007 INFO  [org.primefaces.webapp.PostConstructApplicationEventListener] (ServerService Thread Pool -- 87) Running on PrimeFaces 6.0
2026-08-05 14:14:14,095 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 87) WFLYUT0021: Contexto web registrado: '/sisme_intranet' para servidor 'default-server'
2026-08-05 14:14:14,204 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 44) WFLYSRV0010: "sisme-ear.ear" foi implantado (runtime-name: "sisme-ear.ear")
2026-08-05 14:14:14,205 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 44) WFLYSRV0010: "applicationinsights-agent.jar" foi implantado (runtime-name: "applicationinsights-agent.jar")
2026-08-05 14:14:14,297 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Retomando servidor
2026-08-05 14:14:14,304 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.4.8.GA (WildFly Core 15.0.19.Final-redhat-00001) iniciado em 31513ms - Iniciado(s) 9530 de serviços 9703 (os serviços 419 estão lentos, passivos ou sob demanda)
2026-08-05 14:14:14,307 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: A interface de gerenciamento http escutando em http://0.0.0.0:9990/management
2026-08-05 14:14:14,307 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0051: O console de administração escutando em http://0.0.0.0:9990
[root@caddeapllx1441 p585600]# watch -n 30 'jcmd $(pgrep -f sisme) VM.metaspace 2>/dev/null | head -20'
[root@caddeapllx1441 p585600]#
