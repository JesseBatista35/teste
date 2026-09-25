sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# runuser -u jboss -- $JS -F $P > /tmp/batch-tdF.txt 2>&1 || $JS -F $P > /tmp/batch-tdF.txt 2>&1
[root@sbrdeapllx104 p585600]# grep -n -A40 "EJB default - 2" /tmp/batch-tdF.txt | head -60
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# # Tudo que a EJB default - 2 escreveu depois das 09:24 (exceto erros de lock)
[root@sbrdeapllx104 p585600]# awk 'NR>17440 && /\(EJB default - 2\)/' $LOG | grep -v WFLYEJB | head -10
2026-09-25 09:24:00,747INFO (EJB default - 2)ID_GERENCIADOR_TIMERS - 1289099247243236_-7196352426767679089_false_-2001356696
2026-09-25 09:24:00,747INFO (EJB default - 2)DATA_HORA: 25/09/2026 09:24:00; ADDRESS: [ 10.116.94.211 ]
2026-09-25 09:24:00,747INFO (EJB default - 2)ENVIRONMENT - DES
2026-09-25 09:24:00,747INFO (EJB default - 2)Verificando calendario envio FEBRABAN - ACTC403
2026-09-25 09:24:00,751INFO (EJB default - 2)Verificando existencia de portabilidades tipo ACTC403
2026-09-25 09:24:00,828WARNING(EJB default - 2)Portabilidades encontradas: 3
2026-09-25 09:24:06,720INFO (EJB default - 2)Gerando XML ACTC403
2026-09-25 09:24:06,828INFO (EJB default - 2)Resposta de portabilidade 32167 inexistente.
2026-09-25 09:24:12,864INFO (EJB default - 2)Resposta de portabilidade 32166 inexistente.
2026-09-25 09:24:12,869INFO (EJB default - 2)Resposta de portabilidade 32164 inexistente.
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# # Execuções bem-sucedidas anteriores: qual é o passo seguinte ao "Gerando XML ACTC"
[root@sbrdeapllx104 p585600]# grep -h -A4 "Gerando XML ACTC" $LOG ${LOG}.2026-09-2* 2>/dev/null | grep -v '^\s*at ' | head -30
2026-09-25 09:00:01,852INFO (EJB default - 4)Gerando XML ACTC403
2026-09-25 09:00:01,945INFO (EJB default - 4)Resposta de portabilidade 32167 inexistente.
2026-09-25 09:00:01,958INFO (EJB default - 4)Resposta de portabilidade 32166 inexistente.
2026-09-25 09:00:01,964INFO (EJB default - 4)Resposta de portabilidade 32164 inexistente.
2026-09-25 09:00:01,964INFO (EJB default - 4)XML ACTC403 não possui portabilidades para envio.
--
2026-09-25 09:00:03,651INFO (EJB default - 7)Gerando XML ACTC103
2026-09-25 09:00:03,658INFO (EJB default - 7)Portabilidade: 53270
2026-09-25 09:00:03,658SEVERE(EJB default - 7)Inserindo historico de situacao: numeroSigec 53.270, responsavel BATCH, data 25/09/26 09:00, situacao 0006, arquivo null
2026-09-25 09:00:03,664SEVERE(EJB default - 7)Incluido historico da portabilidade: 53.270
2026-09-25 09:00:03,667INFO (EJB default - 7)Validando portabilidade 53266 rotina BATCH.
--
2026-09-25 09:01:00,360INFO (EJB default - 1)Gerando XML ACTC403
2026-09-25 09:01:00,371INFO (EJB default - 1)Resposta de portabilidade 32167 inexistente.
2026-09-25 09:01:00,375INFO (EJB default - 1)Resposta de portabilidade 32166 inexistente.
2026-09-25 09:01:00,379INFO (EJB default - 1)Resposta de portabilidade 32164 inexistente.
2026-09-25 09:01:00,379INFO (EJB default - 1)XML ACTC403 não possui portabilidades para envio.
--
2026-09-25 09:02:00,298INFO (EJB default - 9)Gerando XML ACTC403
2026-09-25 09:02:00,306INFO (EJB default - 9)Resposta de portabilidade 32167 inexistente.
2026-09-25 09:02:00,311INFO (EJB default - 9)Resposta de portabilidade 32166 inexistente.
2026-09-25 09:02:00,315INFO (EJB default - 9)Resposta de portabilidade 32164 inexistente.
2026-09-25 09:02:00,316INFO (EJB default - 9)XML ACTC403 não possui portabilidades para envio.
--
2026-09-25 09:03:00,366INFO (EJB default - 2)Gerando XML ACTC403
2026-09-25 09:03:00,376INFO (EJB default - 2)Resposta de portabilidade 32167 inexistente.
2026-09-25 09:03:00,380INFO (EJB default - 2)Resposta de portabilidade 32166 inexistente.
2026-09-25 09:03:00,384INFO (EJB default - 2)Resposta de portabilidade 32164 inexistente.
2026-09-25 09:03:00,385INFO (EJB default - 2)XML ACTC403 não possui portabilidades para envio.
--
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# # Quando o ProcessadorLegado começou a ficar preso
[root@sbrdeapllx104 p585600]# grep -n "WFLYEJB0043" $LOG | grep ProcessadorLegado | head -2
23686:2026-09-25 09:33:43,499WARN (EJB default - 10)WFLYEJB0043: Uma execução prévia do timer [id=020d33bb-333f-493a-8ab6-0b6fed5f33d9 timedObjectId=gec-4.51.3batch-b1472.gec-ejb.ProcessadorLegacyCallTEDNCRBean auto-timer?:false persistent?:false timerService=org.jboss.as.ejb3.timerservice.TimerServiceImpl@172be993 initialExpiration=null intervalDuration(in milli sec)=0 nextExpiration=Fri Sep 25 09:33:35 BRT 2026 timerState=IN_TIMEOUT info=ProcessadorLegadoTEDNCRRECEPCAO] ainda está em curso, ignorando a execução desta superposição programada em: Fri Sep 25 09:33:43 BRT 2026.
25658:2026-09-25 09:34:49,780WARN (EJB default - 4)WFLYEJB0043: Uma execução prévia do timer [id=020d33bb-333f-493a-8ab6-0b6fed5f33d9 timedObjectId=gec-4.51.3batch-b1472.gec-ejb.ProcessadorLegacyCallTEDNCRBean auto-timer?:false persistent?:false timerService=org.jboss.as.ejb3.timerservice.TimerServiceImpl@172be993 initialExpiration=null intervalDuration(in milli sec)=0 nextExpiration=Fri Sep 25 09:34:35 BRT 2026 timerState=IN_TIMEOUT info=ProcessadorLegadoTEDNCRRECEPCAO] ainda está em curso, ignorando a execução desta superposição programada em: Fri Sep 25 09:34:49 BRT 2026.
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# curl -v --max-time 15 https://apim-parceiros-sandbox.azure-api.net/ 2>&1 | tail -5
<
{ [data not shown]
100    54  100    54    0     0    223      0 --:--:-- --:--:-- --:--:--   223
* Connection #0 to host apim-parceiros-sandbox.azure-api.net left intact
{ "statusCode": 404, "message": "Resource not found" }[root@sbrdeapllx104 p585600]# curl -v --max-time 15 -x http://proxydes.caixa:80 https://apim-parceiros-sandbox.azure-api.net/ 2>&1 | tail -5
<
* Received HTTP code 502 from proxy after CONNECT
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
* Connection #0 to host proxydes.caixa left intact
curl: (56) Received HTTP code 502 from proxy after CONNECT
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# curl -v --max-time 15 -x http://proxydes.caixa:80 https://apim-parceiros-sandbox.azure-api.net/ 2>&1 | tail -5
<
* Received HTTP code 502 from proxy after CONNECT
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
* Connection #0 to host proxydes.caixa left intact
curl: (56) Received HTTP code 502 from proxy after CONNECT
[root@sbrdeapllx104 p585600]#
