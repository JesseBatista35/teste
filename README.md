[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$ tail -50 /opt/jboss/jboss-4.2.3.GA-jdk6/server/sinac01/log/sinac01.log
  State: FAILED
  Reason: org.jboss.deployment.DeploymentException: Endpoint activation failed ra=jboss.jca:service=RARDeployment,name='wmq-jmsra.rar' activationSpec=javax.jms.Queue:LQ.REQ.SINAC.BATCH@SPP5 <954565797>; - nested throwable: (javax.resource.spi.ResourceAdapterInternalException: com.ibm.msg.client.jms.DetailedIllegalStateException: JMSWMQ0018: Falha ao conectar ao gerenciador de filas 'SPP5' com o modo de conex▒o 'Client' e o nome do host 'ACP3.CORESP.CAIXA(1416)'. Verifique se o gerenciador de filas est▒ iniciado e se est▒ em execu▒▒o no modo do cliente; verifique se h▒ um listener em execu▒▒o. Consulte a exce▒▒o vinculada para obter mais informa▒▒es.)

ObjectName: jboss.j2ee:jar=sinac_scheduler.jar,name=SinacProcessMDB,service=EJB3
  State: FAILED
  Reason: org.jboss.deployment.DeploymentException: Endpoint activation failed ra=jboss.jca:service=RARDeployment,name='wmq-jmsra.rar' activationSpec=javax.jms.Queue:LQ.REQ.SINAC.CLO@SPP5 <213062415>; - nested throwable: (javax.resource.spi.ResourceAdapterInternalException: com.ibm.msg.client.jms.DetailedIllegalStateException: JMSWMQ0018: Falha ao conectar ao gerenciador de filas 'SPP5' com o modo de conex▒o 'Client' e o nome do host 'ACP3.CORESP.CAIXA(1416)'. Verifique se o gerenciador de filas est▒ iniciado e se est▒ em execu▒▒o no modo do cliente; verifique se h▒ um listener em execu▒▒o. Consulte a exce▒▒o vinculada para obter mais informa▒▒es.)

--- MBEANS THAT ARE THE ROOT CAUSE OF THE PROBLEM ---
ObjectName: jboss.j2ee:jar=sinac_scheduler.jar,name=SinacProcessMDB,service=EJB3
  State: FAILED
  Reason: org.jboss.deployment.DeploymentException: Endpoint activation failed ra=jboss.jca:service=RARDeployment,name='wmq-jmsra.rar' activationSpec=javax.jms.Queue:LQ.REQ.SINAC.CLO@SPP5 <213062415>; - nested throwable: (javax.resource.spi.ResourceAdapterInternalException: com.ibm.msg.client.jms.DetailedIllegalStateException: JMSWMQ0018: Falha ao conectar ao gerenciador de filas 'SPP5' com o modo de conex▒o 'Client' e o nome do host 'ACP3.CORESP.CAIXA(1416)'. Verifique se o gerenciador de filas est▒ iniciado e se est▒ em execu▒▒o no modo do cliente; verifique se h▒ um listener em execu▒▒o. Consulte a exce▒▒o vinculada para obter mais informa▒▒es.)

ObjectName: jboss.j2ee:jar=sinac_scheduler.jar,name=SinacBatchMDB,service=EJB3
  State: FAILED
  Reason: org.jboss.deployment.DeploymentException: Endpoint activation failed ra=jboss.jca:service=RARDeployment,name='wmq-jmsra.rar' activationSpec=javax.jms.Queue:LQ.REQ.SINAC.BATCH@SPP5 <954565797>; - nested throwable: (javax.resource.spi.ResourceAdapterInternalException: com.ibm.msg.client.jms.DetailedIllegalStateException: JMSWMQ0018: Falha ao conectar ao gerenciador de filas 'SPP5' com o modo de conex▒o 'Client' e o nome do host 'ACP3.CORESP.CAIXA(1416)'. Verifique se o gerenciador de filas est▒ iniciado e se est▒ em execu▒▒o no modo do cliente; verifique se h▒ um listener em execu▒▒o. Consulte a exce▒▒o vinculada para obter mais informa▒▒es.)


2026-08-21 17:37:23,991 34620 DEBUG [com.arjuna.ats.arjuna.logging.arjLogger] (Thread-6:) Periodic recovery - first pass <Sex, 21 Ago 2026 17:37:23>
2026-08-21 17:37:23,993 34622 DEBUG [com.arjuna.ats.arjuna.logging.arjLogger] (Thread-6:) StatusModule: first pass
2026-08-21 17:37:23,994 34623 DEBUG [com.arjuna.ats.txoj.logging.txojLoggerI18N] (Thread-6:) [com.arjuna.ats.internal.txoj.recovery.TORecoveryModule_3] - TORecoveryModule - first pass
2026-08-21 17:37:23,994 34623 DEBUG [com.arjuna.ats.jta.logging.loggerI18N] (Thread-6:) [com.arjuna.ats.internal.jta.recovery.info.firstpass] Local XARecoveryModule - first pass
2026-08-21 17:37:24,006 34635 INFO  [org.jboss.system.server.Server] (main:) JBoss (MX MicroKernel) [4.2.3.GA (build: SVNTag=JBoss_4_2_3_GA date=200807181439)] Started in 34s:632ms
2026-08-21 17:37:30,992 41621 WARN  [org.jgroups.protocols.UDP] (IncomingPacketHandler (channel=sinac-dsv-rhel-SFSBCache):) discarded message from different group "cma-dsv-rhel-SFSBCache" (our group is "sinac-dsv-rhel-SFSBCache"). Sender was 10.116.95.80:57382
2026-08-21 17:37:31,259 41888 WARN  [org.jgroups.protocols.UDP] (IncomingPacketHandler (channel=sinac-dsv-rhel-SFSBCache):) discarded message from different group "cma-dsv-rhel-SFSBCache" (our group is "sinac-dsv-rhel-SFSBCache"). Sender was 10.116.95.79:50237
2026-08-21 17:37:33,995 44624 DEBUG [com.arjuna.ats.arjuna.logging.arjLogger] (Thread-6:) Periodic recovery - second pass <Sex, 21 Ago 2026 17:37:33>
2026-08-21 17:37:33,995 44624 DEBUG [com.arjuna.ats.arjuna.logging.arjLogger] (Thread-6:) AtomicActionRecoveryModule: Second pass
2026-08-21 17:37:33,995 44624 DEBUG [com.arjuna.ats.txoj.logging.txojLoggerI18N] (Thread-6:) [com.arjuna.ats.internal.txoj.recovery.TORecoveryModule_6] - TORecoveryModule - second pass
2026-08-21 17:37:33,995 44624 DEBUG [com.arjuna.ats.jta.logging.loggerI18N] (Thread-6:) [com.arjuna.ats.internal.jta.recovery.info.secondpass] Local XARecoveryModule - second pass
2026-08-21 17:37:37,391 48020 WARN  [org.jgroups.protocols.UDP] (IncomingPacketHandler (channel=sinac-dsv-rhel-SFSBCache):) discarded message from different group "cma-dsv-rhel-SFSBCache" (our group is "sinac-dsv-rhel-SFSBCache"). Sender was 10.116.95.80:57382
2026-08-21 17:37:43,802 54431 WARN  [org.jgroups.protocols.UDP] (IncomingPacketHandler (channel=Tomcat-sinac-dsv-rhel):) discarded message from different group "Tomcat-cma-dsv-rhel" (our group is "Tomcat-sinac-dsv-rhel"). Sender was 10.116.95.80:36638
2026-08-21 17:37:45,512 56141 WARN  [org.jgroups.protocols.UDP] (IncomingPacketHandler (channel=sinac-dsv-rhel-EntityCache):) discarded message from different group "cma-dsv-rhel-EntityCache" (our group is "sinac-dsv-rhel-EntityCache"). Sender was 10.116.95.80:45494
2026-08-21 17:37:59,878 70507 WARN  [org.jgroups.protocols.UDP] (IncomingPacketHandler (channel=sinac-dsv-rhel-SFSBCache):) discarded message from different group "cma-dsv-rhel-SFSBCache" (our group is "sinac-dsv-rhel-SFSBCache"). Sender was 10.116.95.77:59817
2026-08-21 17:38:02,505 73134 WARN  [org.jgroups.protocols.UDP] (IncomingPacketHandler (channel=sinac-dsv-rhel-SFSBCache):) discarded message from different group "cma-dsv-rhel-SFSBCache" (our group is "sinac-dsv-rhel-SFSBCache"). Sender was 10.116.95.80:57382
2026-08-21 17:38:05,433 76062 WARN  [org.jgroups.protocols.UDP] (IncomingPacketHandler (channel=Tomcat-sinac-dsv-rhel):) discarded message from different group "Tomcat-cma-dsv-rhel" (our group is "Tomcat-sinac-dsv-rhel"). Sender was 10.116.95.80:36638
2026-08-21 17:38:07,254 77883 WARN  [org.jgroups.protocols.UDP] (IncomingPacketHandler (channel=Tomcat-sinac-dsv-rhel):) discarded message from different group "Tomcat-cma-dsv-rhel" (our group is "Tomcat-sinac-dsv-rhel"). Sender was 10.116.95.77:35160
2026-08-21 17:38:07,534 78163 WARN  [org.jgroups.protocols.UDP] (IncomingPacketHandler (channel=Tomcat-sinac-dsv-rhel):) discarded message from different group "Tomcat-cma-dsv-rhel" (our group is "Tomcat-sinac-dsv-rhel"). Sender was 10.116.95.79:54925
2026-08-21 17:38:12,532 83161 WARN  [org.jgroups.protocols.UDP] (IncomingPacketHandler (channel=sinac-dsv-rhel-EntityCache):) discarded message from different group "cma-dsv-rhel-EntityCache" (our group is "sinac-dsv-rhel-EntityCache"). Sender was 10.116.95.80:45494
2026-08-21 17:38:20,759 91388 WARN  [org.jgroups.protocols.UDP] (IncomingPacketHandler (channel=Tomcat-sinac-dsv-rhel):) discarded message from different group "Tomcat-cma-dsv-rhel" (our group is "Tomcat-sinac-dsv-rhel"). Sender was 10.116.95.78:51821
2026-08-21 17:38:41,139 111768 WARN  [org.jgroups.protocols.UDP] (IncomingPacketHandler (channel=sinac-dsv-rhel-SFSBCache):) discarded message from different group "cma-dsv-rhel-SFSBCache" (our group is "sinac-dsv-rhel-SFSBCache"). Sender was 10.116.95.159:34571
2026-08-21 17:38:41,369 111998 WARN  [org.jgroups.protocols.UDP] (IncomingPacketHandler (channel=sinac-dsv-rhel-SFSBCache):) discarded message from different group "cma-dsv-rhel-SFSBCache" (our group is "sinac-dsv-rhel-SFSBCache"). Sender was 10.116.95.160:35606
2026-08-21 17:38:52,164 122793 WARN  [org.jgroups.protocols.UDP] (IncomingPacketHandler (channel=Tomcat-sinac-dsv-rhel):) discarded message from different group "Tomcat-cma-dsv-rhel" (our group is "Tomcat-sinac-dsv-rhel"). Sender was 10.116.95.78:51821
2026-08-21 17:38:53,323 123952 WARN  [org.jgroups.protocols.UDP] (IncomingPacketHandler (channel=sinac-dsv-rhel-EntityCache):) discarded message from different group "cma-dsv-rhel-EntityCache" (our group is "sinac-dsv-rhel-EntityCache"). Sender was 10.116.95.80:45494
2026-08-21 17:38:58,517 129146 WARN  [org.jgroups.protocols.UDP] (IncomingPacketHandler (channel=sinac-dsv-rhel-SFSBCache):) discarded message from different group "cma-dsv-rhel-SFSBCache" (our group is "sinac-dsv-rhel-SFSBCache"). Sender was 10.116.95.80:57382
2026-08-21 17:39:03,055 133684 WARN  [org.jgroups.protocols.UDP] (IncomingPacketHandler (channel=Tomcat-sinac-dsv-rhel):) discarded message from different group "Tomcat-cma-dsv-rhel" (our group is "Tomcat-sinac-dsv-rhel"). Sender was 10.116.95.80:36638
2026-08-21 17:39:23,642 154271 WARN  [org.jgroups.protocols.UDP] (IncomingPacketHandler (channel=sinac-dsv-rhel-SFSBCache):) discarded message from different group "cma-dsv-rhel-SFSBCache" (our group is "sinac-dsv-rhel-SFSBCache"). Sender was 10.116.95.80:57382
2026-08-21 17:39:28,164 158793 WARN  [org.jgroups.protocols.UDP] (IncomingPacketHandler (channel=sinac-dsv-rhel-EntityCache):) discarded message from different group "cma-dsv-rhel-EntityCache" (our group is "sinac-dsv-rhel-EntityCache"). Sender was 10.116.95.78:34211
2026-08-21 17:39:33,995 164624 DEBUG [com.arjuna.ats.arjuna.logging.arjLogger] (Thread-6:) Periodic recovery - first pass <Sex, 21 Ago 2026 17:39:33>
2026-08-21 17:39:33,996 164625 DEBUG [com.arjuna.ats.arjuna.logging.arjLogger] (Thread-6:) StatusModule: first pass
2026-08-21 17:39:33,996 164625 DEBUG [com.arjuna.ats.txoj.logging.txojLoggerI18N] (Thread-6:) [com.arjuna.ats.internal.txoj.recovery.TORecoveryModule_3] - TORecoveryModule - first pass
2026-08-21 17:39:33,996 164625 DEBUG [com.arjuna.ats.jta.logging.loggerI18N] (Thread-6:) [com.arjuna.ats.internal.jta.recovery.info.firstpass] Local XARecoveryModule - first pass
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$
[p585600@cspdeapllx011 ~]$















