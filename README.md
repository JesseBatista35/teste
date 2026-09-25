ot@sbrdeapllx104 p585600]# JS=/usr/lib/jvm/jdk-1.8.0_471-oracle-x64/bin/jstack
[root@sbrdeapllx104 p585600]# ls -l $JS   # se não existir: ls /usr/lib/jvm/jdk-1.8.0_471-oracle-x64/  (pode estar em ../bin ou só haver jre)
-rwxr-xr-x 1 root root 8192 Set 26  2025 /usr/lib/jvm/jdk-1.8.0_471-oracle-x64/bin/jstack
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# for i in 1 2 3; do runuser -u jboss -- $JS -l $P > /tmp/batch-td$i.txt; sleep 10; done
84756: Unable to open socket file: target process not responding or HotSpot VM not loaded
The -F option can be used when the target process is not responding



^C

^C
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# # 1) O WildFly avisa quando um timer ainda está rodando e pula a próxima execução dele
[root@sbrdeapllx104 p585600]# #    → o info= que aparecer aqui é o timer travado
[root@sbrdeapllx104 p585600]# grep -n "WFLYEJB0043" $LOG | tail -5
54095:2026-09-25 10:00:46,982WARN (EJB default - 7)WFLYEJB0043: Uma execução prévia do timer [id=e914484a-f60f-4e2c-a89c-783fe85360e5 timedObjectId=gec-4.51.3batch-b1472.gec-ejb.GerenciadorTimersBean auto-timer?:false persistent?:false timerService=org.jboss.as.ejb3.timerservice.TimerServiceImpl@c1c69fc initialExpiration=null intervalDuration(in milli sec)=0 nextExpiration=Fri Sep 25 09:59:00 BRT 2026 timerState=IN_TIMEOUT info=EFETUA-AUTOMATICO] ainda está em curso, ignorando a execução desta superposição programada em: Fri Sep 25 10:00:46 BRT 2026.
55095:2026-09-25 10:01:04,329WARN (EJB default - 6)WFLYEJB0043: Uma execução prévia do timer [id=020d33bb-333f-493a-8ab6-0b6fed5f33d9 timedObjectId=gec-4.51.3batch-b1472.gec-ejb.ProcessadorLegacyCallTEDNCRBean auto-timer?:false persistent?:false timerService=org.jboss.as.ejb3.timerservice.TimerServiceImpl@172be993 initialExpiration=null intervalDuration(in milli sec)=0 nextExpiration=Fri Sep 25 10:00:35 BRT 2026 timerState=IN_TIMEOUT info=ProcessadorLegadoTEDNCRRECEPCAO] ainda está em curso, ignorando a execução desta superposição programada em: Fri Sep 25 10:01:04 BRT 2026.
55196:2026-09-25 10:01:04,376WARN (EJB default - 9)WFLYEJB0043: Uma execução prévia do timer [id=a7918a87-58f0-4424-a652-224d4392f621 timedObjectId=gec-4.51.3batch-b1472.gec-ejb.GerenciadorTimersBean auto-timer?:false persistent?:false timerService=org.jboss.as.ejb3.timerservice.TimerServiceImpl@c1c69fc initialExpiration=null intervalDuration(in milli sec)=0 nextExpiration=Fri Sep 25 10:01:00 BRT 2026 timerState=IN_TIMEOUT info=REENVIO_ARQUIVOS_CIP] ainda está em curso, ignorando a execução desta superposição programada em: Fri Sep 25 10:01:04 BRT 2026.
58296:2026-09-25 10:03:55,910WARN (EJB default - 1)WFLYEJB0043: Uma execução prévia do timer [id=020d33bb-333f-493a-8ab6-0b6fed5f33d9 timedObjectId=gec-4.51.3batch-b1472.gec-ejb.ProcessadorLegacyCallTEDNCRBean auto-timer?:false persistent?:false timerService=org.jboss.as.ejb3.timerservice.TimerServiceImpl@172be993 initialExpiration=null intervalDuration(in milli sec)=0 nextExpiration=Fri Sep 25 10:03:35 BRT 2026 timerState=IN_TIMEOUT info=ProcessadorLegadoTEDNCRRECEPCAO] ainda está em curso, ignorando a execução desta superposição programada em: Fri Sep 25 10:03:55 BRT 2026.
59275:2026-09-25 10:04:45,898WARN (EJB default - 8)WFLYEJB0043: Uma execução prévia do timer [id=020d33bb-333f-493a-8ab6-0b6fed5f33d9 timedObjectId=gec-4.51.3batch-b1472.gec-ejb.ProcessadorLegacyCallTEDNCRBean auto-timer?:false persistent?:false timerService=org.jboss.as.ejb3.timerservice.TimerServiceImpl@172be993 initialExpiration=null intervalDuration(in milli sec)=0 nextExpiration=Fri Sep 25 10:04:35 BRT 2026 timerState=IN_TIMEOUT info=ProcessadorLegadoTEDNCRRECEPCAO] ainda está em curso, ignorando a execução desta superposição programada em: Fri Sep 25 10:04:45 BRT 2026.
[root@sbrdeapllx104 p585600]# grep "WFLYEJB0043" $LOG | grep -oE "info=[A-Z0-9_]+" | sort | uniq -c
      2 info=ACTC403
      1 info=ARCC001RECEPCAO
      1 info=ARCC002RECEPCAO
      2 info=EFETUA
     21 info=P
      1 info=REENVIO_ARQUIVOS_CIP
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# # 2) O que o batch estava fazendo logo antes de travar (sem as linhas de stack trace)
[root@sbrdeapllx104 p585600]# sed -n '17000,17455p' $LOG | grep -v '^\s*at ' | grep -v '^\s*\.\.\.' | tail -80
2026-09-25 09:23:41,168INFO (EJB default - 9)Respondendo mensagem para a fila verificacao ted
2026-09-25 09:23:41,169INFO (EJB default - 9)Criando mensagem de texto com a fila verificacao ted
2026-09-25 09:23:41,169INFO (EJB default - 9)Enviando mensagem para a fila verificacao ted id STR60723173417652126, str 202607240600071789
2026-09-25 09:23:41,207INFO (EJB default - 9)Mensagem enviada para a fila verificacao ted com sucesso
2026-09-25 09:23:41,208INFO (EJB default - 9)>>>>>>> (STR0048R2) 202607240600071789 enviado!


2026-09-25 09:23:41,208INFO (EJB default - 9)Consultando STR0048R2...
2026-09-25 09:23:41,210INFO (EJB default - 9)

>>>>>>> Atualizando situacao da TED NCR (STR0048R2) 202607210600060674
2026-09-25 09:23:41,211INFO (EJB default - 9)>>>>>>> (STR0048R2) 202607210600060674 atualizado!
2026-09-25 09:23:41,211INFO (EJB default - 9)>>>>>>> Enviando (STR0048R2) 202607210600060674 ao NCR...
2026-09-25 09:23:41,212INFO (EJB default - 9)Respondendo mensagem para a fila verificacao ted
2026-09-25 09:23:41,212INFO (EJB default - 9)Criando mensagem de texto com a fila verificacao ted
2026-09-25 09:23:41,212INFO (EJB default - 9)Enviando mensagem para a fila verificacao ted id STR60721120715303832, str 202607210600060674
2026-09-25 09:23:41,239INFO (EJB default - 9)Mensagem enviada para a fila verificacao ted com sucesso
2026-09-25 09:23:41,239INFO (EJB default - 9)>>>>>>> (STR0048R2) 202607210600060674 enviado!


2026-09-25 09:23:41,240INFO (EJB default - 9)Consultando STR0048R2...
2026-09-25 09:23:41,242INFO (EJB default - 9)

>>>>>>> Atualizando situacao da TED NCR (STR0048R2) 202607151626498888
2026-09-25 09:23:41,243INFO (EJB default - 9)>>>>>>> (STR0048R2) 202607151626498888 atualizado!
2026-09-25 09:23:41,243INFO (EJB default - 9)>>>>>>> Enviando (STR0048R2) 202607151626498888 ao NCR...
2026-09-25 09:23:41,243INFO (EJB default - 9)Respondendo mensagem para a fila verificacao ted
2026-09-25 09:23:41,243INFO (EJB default - 9)Criando mensagem de texto com a fila verificacao ted
2026-09-25 09:23:41,244INFO (EJB default - 9)Enviando mensagem para a fila verificacao ted id STR60717121507001056, str 202607151626498888
2026-09-25 09:23:41,273INFO (EJB default - 9)Mensagem enviada para a fila verificacao ted com sucesso
2026-09-25 09:23:41,273INFO (EJB default - 9)>>>>>>> (STR0048R2) 202607151626498888 enviado!


2026-09-25 09:23:41,273INFO (EJB default - 9)Consultando STR0048R2...
2026-09-25 09:23:41,275INFO (EJB default - 9)

>>>>>>> Atualizando situacao da TED NCR (STR0048R2) 202606230600052133
2026-09-25 09:23:41,276INFO (EJB default - 9)>>>>>>> (STR0048R2) 202606230600052133 atualizado!
2026-09-25 09:23:41,277INFO (EJB default - 9)>>>>>>> Enviando (STR0048R2) 202606230600052133 ao NCR...
2026-09-25 09:23:41,277INFO (EJB default - 9)Respondendo mensagem para a fila verificacao ted
2026-09-25 09:23:41,277INFO (EJB default - 9)Criando mensagem de texto com a fila verificacao ted
2026-09-25 09:23:41,277INFO (EJB default - 9)Enviando mensagem para a fila verificacao ted id STR60622184923425790, str 202606230600052133
2026-09-25 09:23:41,307INFO (EJB default - 9)Mensagem enviada para a fila verificacao ted com sucesso
2026-09-25 09:23:41,308INFO (EJB default - 9)>>>>>>> (STR0048R2) 202606230600052133 enviado!


2026-09-25 09:23:41,308INFO (EJB default - 9)Fechando producer com a fila verificacao ted
2026-09-25 09:23:41,331INFO (EJB default - 9)Fechando sessao com a fila verificacao ted
2026-09-25 09:23:41,356INFO (EJB default - 9)Fechando conexao com a fila verificacao ted
2026-09-25 09:23:41,364INFO (default-threads - 1)

processarRecebimentoNCR >>>>>>>>>>>>>>>>> {"codMsg":"STR0048R2","nsuTrc":"202607240600071789","portddNcr":false}
2026-09-25 09:23:41,402INFO (EJB default - 9)Iniciando processador para recebimento da fila...
2026-09-25 09:23:41,403INFO (EJB default - 9)Processo batch legado do processo batch legado para envio e recebimentop do TRC e disponibilizacao ao NCR finalizado!
2026-09-25 09:23:41,404SEVERE(default-threads - 1)A mensagem não pertence nao atende ao formato esperado STR0047R2
2026-09-25 09:23:41,712INFO (default-threads - 2)

processarRecebimentoNCR >>>>>>>>>>>>>>>>> {"codMsg":"STR0048R2","nsuTrc":"202607210600060674","portddNcr":false}
2026-09-25 09:23:41,713SEVERE(default-threads - 2)A mensagem não pertence nao atende ao formato esperado STR0047R2
2026-09-25 09:23:41,910INFO (default-threads - 3)

processarRecebimentoNCR >>>>>>>>>>>>>>>>> {"codMsg":"STR0048R2","nsuTrc":"202607151626498888","portddNcr":false}
2026-09-25 09:23:41,911SEVERE(default-threads - 3)A mensagem não pertence nao atende ao formato esperado STR0047R2
2026-09-25 09:23:42,225INFO (default-threads - 4)

processarRecebimentoNCR >>>>>>>>>>>>>>>>> {"codMsg":"STR0048R2","nsuTrc":"202606230600052133","portddNcr":false}
2026-09-25 09:23:42,225SEVERE(default-threads - 4)A mensagem não pertence nao atende ao formato esperado STR0047R2
2026-09-25 09:23:47,001INFO (EJB default - 6)ID_GERENCIADOR_TIMERS - 1289099247243236_-7196352426767679089_false_-2001356696
2026-09-25 09:23:47,001INFO (EJB default - 6)DATA_HORA: 25/09/2026 09:23:47; ADDRESS: [ 10.116.94.211 ]
2026-09-25 09:23:47,001INFO (EJB default - 6)ENVIRONMENT - DES
2026-09-25 09:23:47,001INFO (EJB default - 6)processar() - INICIO
2026-09-25 09:23:47,004INFO (EJB default - 6)Nenhum CMD_BATCH para processar.
2026-09-25 09:24:00,747INFO (EJB default - 2)ID_GERENCIADOR_TIMERS - 1289099247243236_-7196352426767679089_false_-2001356696
2026-09-25 09:24:00,747INFO (EJB default - 2)DATA_HORA: 25/09/2026 09:24:00; ADDRESS: [ 10.116.94.211 ]
2026-09-25 09:24:00,747INFO (EJB default - 2)ENVIRONMENT - DES
2026-09-25 09:24:00,747INFO (EJB default - 2)Verificando calendario envio FEBRABAN - ACTC403
2026-09-25 09:24:00,751INFO (EJB default - 2)Verificando existencia de portabilidades tipo ACTC403
2026-09-25 09:24:00,828WARNING(EJB default - 2)Portabilidades encontradas: 3
2026-09-25 09:24:06,720INFO (EJB default - 2)Gerando XML ACTC403
2026-09-25 09:24:06,815ERROR(EJB default - 5)WFLYEJB0020: Erro ao invocar o intervalo para o timer: [id=a041c689-2a18-4442-a160-7c0412a81954 timedObjectId=gec-4.51.3batch-b1472.gec-ejb.GerenciadorTimersBean auto-timer?:false persistent?:false timerService=org.jboss.as.ejb3.timerservice.TimerServiceImpl@c1c69fc initialExpiration=null intervalDuration(in milli sec)=0 nextExpiration=Fri Sep 25 09:25:00 BRT 2026 timerState=IN_TIMEOUT info=ACTC801]: javax.ejb.ConcurrentAccessTimeoutException: WFLYEJB0241: O intervalo de acesso atual EJB 3.1 PFD2 4.8.5.5.1 no GerenciadorTimersBean - não foi possível obter bloqueio com o 5000MILLISECONDS
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
