026-07-14 10:45:57,138INFO (EJB default - 9)### Marcacao concluida a demanda  ###
2026-07-14 10:45:57,138INFO (EJB default - 9)### Marcando a demanda 53082730 com processada no BACEN ###
2026-07-14 10:45:57,463INFO (EJB default - 9)### Marcacao concluida a demanda  ###
2026-07-14 10:45:57,463INFO (EJB default - 9)### Marcando a demanda 52894761 com processada no BACEN ###
2026-07-14 10:45:57,813INFO (EJB default - 9)### Marcacao concluida a demanda  ###
2026-07-14 10:45:57,813INFO (EJB default - 9)### Marcando a demanda 53377012 com processada no BACEN ###
2026-07-14 10:45:58,156INFO (EJB default - 9)### Marcacao concluida a demanda  ###
2026-07-14 10:45:58,156INFO (EJB default - 9)### Marcando a demanda 53773109 com processada no BACEN ###
2026-07-14 10:45:58,483INFO (EJB default - 9)### Marcacao concluida a demanda  ###
2026-07-14 10:45:58,483INFO (EJB default - 9)### Marcando a demanda 52187724 com processada no BACEN ###
2026-07-14 10:45:58,807INFO (EJB default - 9)### Marcacao concluida a demanda  ###
2026-07-14 10:45:58,807INFO (EJB default - 9)### Marcando a demanda 52331756 com processada no BACEN ###
2026-07-14 10:45:59,119INFO (EJB default - 9)### Marcacao concluida a demanda  ###
2026-07-14 10:45:59,119INFO (EJB default - 9)### Marcando a demanda 52348715 com processada no BACEN ###
2026-07-14 10:45:59,469INFO (EJB default - 9)### Marcacao concluida a demanda  ###
2026-07-14 10:45:59,469INFO (EJB default - 9)### Marcando a demanda 54338942 com processada no BACEN ###
2026-07-14 10:45:59,806INFO (EJB default - 9)### Marcacao concluida a demanda  ###
2026-07-14 10:45:59,806INFO (EJB default - 9)### Marcando a demanda 54338947 com processada no BACEN ###
2026-07-14 10:46:00,152INFO (EJB default - 9)### Marcacao concluida a demanda  ###
2026-07-14 10:46:00,152INFO (EJB default - 9)### Marcando a demanda 53409008 com processada no BACEN ###
2026-07-14 10:46:00,471INFO (EJB default - 9)### Marcacao concluida a demanda  ###
2026-07-14 10:46:00,471INFO (EJB default - 9)### Marcando a demanda 51251743 com processada no BACEN ###
2026-07-14 10:46:00,802INFO (EJB default - 9)### Marcacao concluida a demanda  ###
2026-07-14 10:46:00,802INFO (EJB default - 9)### Marcando a demanda 52080029 com processada no BACEN ###
2026-07-14 10:46:01,128INFO (EJB default - 9)### Marcacao concluida a demanda  ###
2026-07-14 10:46:01,128INFO (EJB default - 9)### Marcando a demanda 52666826 com processada no BACEN ###
2026-07-14 10:46:01,463INFO (EJB default - 9)### Marcacao concluida a demanda  ###
2026-07-14 10:46:01,463INFO (EJB default - 9)### Marcando a demanda 54338952 com processada no BACEN ###
2026-07-14 10:46:01,796INFO (EJB default - 9)### Marcacao concluida a demanda  ###
2026-07-14 10:46:01,796INFO (EJB default - 9)### Marcando a demanda 53771431 com processada no BACEN ###
-sh-4.1$ tail -200 /logs/jboss-eap/hc/servers/siouv_node1_lx0^C
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ cat /logs/jboss-eap/hc/servers/siouv_node1_lx0002/server.log | grep error
-sh-4.1$ cat /logs/jboss-eap/hc/servers/siouv_node1_lx0002/server.log | grep -i error
2026-07-13 18:02:02,027ERROR(ContainerBackgroundProcessor[StandardEngine[jboss.web]])MODCLUSTER000043: Failed to send STATUS to 10.116.84.136/10.116.84.136:6666: java.net.ConnectException: Connection refused (Connection refused)
2026-07-13 18:02:02,985ERROR(ContainerBackgroundProcessor[StandardEngine[jboss.web]])MODCLUSTER000043: Failed to send STATUS to 10.116.84.137/10.116.84.137:6666: java.net.SocketException: Connection reset
2026-07-13 20:00:06,204ERROR(EJB default - 3)JBAS014134: EJB Invocation failed on component RDRBacenServiceCore for method public abstract void br.gov.caixa.siouv.service.RDRBacenService.verifcaSolicitacaoProrrogacaoPrazo(br.gov.caixa.siouv.builder.DemandaRDR) throws java.lang.Exception: org.jboss.as.ejb3.component.EJBComponentUnavailableException: JBAS014559: Invocation cannot proceed as component is shutting down
2026-07-13 20:00:06,243ERROR(EJB default - 3)JBAS014120: Error invoking timeout for timer: [id=50193fb7-bd09-46de-a1c4-3192c7b386ad timedObjectId=siouv-5.20.03.03-b240.siouv-ejb-5.20.03.03.RDRTask auto-timer?:true persistent?:true timerService=org.jboss.as.ejb3.timerservice.TimerServiceImpl@4ff566aa initialExpiration=null intervalDuration(in milli sec)=0 nextExpiration=Mon Jul 13 20:15:00 BRT 2026 timerState=IN_TIMEOUT info=null]: javax.ejb.EJBException: java.lang.IllegalStateException: JBAS011049: Component is stopped
-sh-4.1$
