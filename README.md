
[root@caddeapllx2557 p585600]#
[root@caddeapllx2557 p585600]#
[root@caddeapllx2557 p585600]#
[root@caddeapllx2557 p585600]#
[root@caddeapllx2557 p585600]#
[root@caddeapllx2557 p585600]#
[root@caddeapllx2557 p585600]# grep -n '2026-11-03 13:27:1[34]' /logs/jboss/jboss-eap/standalone/sigsj-boleto/server.log | grep -v '^\S*\s*\S*\s*ERROR \[stderr\].*\sat ' | head -30
490:2026-11-03 13:27:13,045 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-4) HV000001: Hibernate Validator 6.0.23.Final-redhat-00001
491:2026-11-03 13:27:13,280 INFO  [org.jboss.weld.deployer] (MSC service thread 1-3) WFLYWELD0003: Processando da implantação weld boletoService-war-2.0.2.8.war
492:2026-11-03 13:27:13,297 INFO  [org.jboss.weld.deployer] (MSC service thread 1-2) WFLYWELD0003: Processando da implantação weld sirotcon-ejb-2.3.0.1-farm.jar
493:2026-11-03 13:27:13,308 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SIROTConBean' na unidade de implementação 'subdeployment "sirotcon-ejb-2.3.0.1-farm.jar" of deployment "boletoService-ear.ear"' são como segue:
504:2026-11-03 13:27:13,452 INFO  [org.jboss.weld.Version] (MSC service thread 1-3) WELD-000900: 3.1.10 (redhat)
505:2026-11-03 13:27:13,825 INFO  [org.infinispan.CONTAINER] (ServerService Thread Pool -- 74) ISPN000128: Infinispan version: Infinispan 'Corona Extra' 11.0.19.Final-redhat-00001
506:2026-11-03 13:27:13,858 INFO  [org.infinispan.CONFIG] (MSC service thread 1-4) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
507:2026-11-03 13:27:13,860 INFO  [org.infinispan.CONFIG] (MSC service thread 1-4) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
508:2026-11-03 13:27:13,924 INFO  [org.infinispan.PERSISTENCE] (ServerService Thread Pool -- 74) ISPN000556: Starting user marshaller 'org.wildfly.clustering.infinispan.spi.marshalling.InfinispanProtoStreamMarshaller'
509:2026-11-03 13:27:14,064 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 74) WFLYCLINF0002: Cache http-remoting-connector inicializado a partir do recipiente ejb
510:2026-11-03 13:27:14,870 ERROR [stderr] (ServerService Thread Pool -- 77) log4j:ERROR Could not parse file [/log_jboss/config-log4j/sigsj_ws_boleto.xml].
511:2026-11-03 13:27:14,872 ERROR [stderr] (ServerService Thread Pool -- 77) java.io.FileNotFoundException: /log_jboss/config-log4j/sigsj_ws_boleto.xml (Arquivo ou diretório inexistente)
557:2026-11-03 13:27:14,918 INFO  [br.gov.caixa.sigsj.boletoservice.common.sirot.IsoXmlMapeamento] (ServerService Thread Pool -- 77) Lendo XML : 530051
558:2026-11-03 13:27:14,961 WARN  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 77) RESTEASY002150: resteasy.scan.resources is no longer supported.  Use a servlet 3.0 container and the ResteasyServletInitializer
[root@caddeapllx2557 p585600]#    ls -la /log_jboss/config-log4j/
ls: não foi possível acessar '/log_jboss/config-log4j/': Arquivo ou diretório inexistente
[root@caddeapllx2557 p585600]# ls -la /log_jboss/config-log4j/
ls: não foi possível acessar '/log_jboss/config-log4j/': Arquivo ou diretório inexistente
[root@caddeapllx2557 p585600]#
