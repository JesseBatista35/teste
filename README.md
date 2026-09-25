ot@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# ^C
[root@sbrdeapllx104 p585600]# P=$(pgrep -f 'Server:sigec-portabilidade-batch_node1_lx104')
[root@sbrdeapllx104 p585600]# LOG=/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade-batch_node1_lx104/server.log
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# for i in 1 2 3; do sudo -u jboss jstack -l $P > /tmp/batch-td$i.txt; sleep 10; done
Sinto muito, usuário root não tem permissão para executar "/usr/bin/jstack -l 84756" como jboss em sbrdeapllx104.extra.caixa.gov.br.


^C
[root@sbrdeapllx104 p585600]# grep -n "WFLYEJB0241" $LOG | head -3
17455:2026-09-25 09:24:06,815ERROR(EJB default - 5)WFLYEJB0020: Erro ao invocar o intervalo para o timer: [id=a041c689-2a18-4442-a160-7c0412a81954 timedObjectId=gec-4.51.3batch-b1472.gec-ejb.GerenciadorTimersBean auto-timer?:false persistent?:false timerService=org.jboss.as.ejb3.timerservice.TimerServiceImpl@c1c69fc initialExpiration=null intervalDuration(in milli sec)=0 nextExpiration=Fri Sep 25 09:25:00 BRT 2026 timerState=IN_TIMEOUT info=ACTC801]: javax.ejb.ConcurrentAccessTimeoutException: WFLYEJB0241: O intervalo de acesso atual EJB 3.1 PFD2 4.8.5.5.1 no GerenciadorTimersBean - não foi possível obter bloqueio com o 5000MILLISECONDS
17484:2026-09-25 09:24:06,816ERROR(EJB default - 9)WFLYEJB0020: Erro ao invocar o intervalo para o timer: [id=7392198d-13d1-4855-92d3-67030cd90fc0 timedObjectId=gec-4.51.3batch-b1472.gec-ejb.GerenciadorTimersBean auto-timer?:false persistent?:false timerService=org.jboss.as.ejb3.timerservice.TimerServiceImpl@c1c69fc initialExpiration=null intervalDuration(in milli sec)=0 nextExpiration=Fri Sep 25 09:25:00 BRT 2026 timerState=IN_TIMEOUT info=REPROCESSAMENTO_GMC]: javax.ejb.ConcurrentAccessTimeoutException: WFLYEJB0241: O intervalo de acesso atual EJB 3.1 PFD2 4.8.5.5.1 no GerenciadorTimersBean - não foi possível obter bloqueio com o 5000MILLISECONDS
17512:2026-09-25 09:24:06,816ERROR(EJB default - 1)WFLYEJB0020: Erro ao invocar o intervalo para o timer: [id=a7918a87-58f0-4424-a652-224d4392f621 timedObjectId=gec-4.51.3batch-b1472.gec-ejb.GerenciadorTimersBean auto-timer?:false persistent?:false timerService=org.jboss.as.ejb3.timerservice.TimerServiceImpl@c1c69fc initialExpiration=null intervalDuration(in milli sec)=0 nextExpiration=Fri Sep 25 09:25:00 BRT 2026 timerState=IN_TIMEOUT info=REENVIO_ARQUIVOS_CIP]: javax.ejb.ConcurrentAccessTimeoutException: WFLYEJB0241: O intervalo de acesso atual EJB 3.1 PFD2 4.8.5.5.1 no GerenciadorTimersBean - não foi possível obter bloqueio com o 5000MILLISECONDS
[root@sbrdeapllx104 p585600]# grep "WFLYEJB0241" $LOG | grep -oE "info=[A-Z0-9]+" | sort | uniq -c
     34 info=ACATAMENTO
     47 info=ACTC101
     47 info=ACTC103
     47 info=ACTC301
     50 info=ACTC303
     47 info=ACTC401
     38 info=ACTC403
     40 info=ACTC601
     48 info=ACTC603
     49 info=ACTC701
     45 info=ACTC703
     42 info=ACTC801
     46 info=ACTC803
     43 info=ACTC900
     42 info=ACTC902
     42 info=APCS101
     43 info=APCS103
      2 info=ARCC002
     32 info=EFETUA
     45 info=ENVIO
     82 info=P
     13 info=PROCESSAMENTO
     82 info=R
     47 info=REENVIO
     56 info=REPROCESSAMENTO
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# grep -n "GerenciadorTimersBean\|br.gov.caixa" /tmp/batch-td1.txt | head -30
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
