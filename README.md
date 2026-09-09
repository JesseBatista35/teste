
<img width="1907" height="1002" alt="image" src="https://github.com/user-attachments/assets/b8df82a6-87a3-40f7-aa90-98d892df536c" />

<img width="1899" height="958" alt="image" src="https://github.com/user-attachments/assets/4764fd5e-33d5-483f-8f83-e4ea130e3f13" />


Identificamos que o SIALI já está configurado para utilizar um truststore via JVM/JBoss:
 
-Djavax.net.ssl.trustStore
-Djavax.net.ssl.trustStorePassword
 
Estamos consumindo o endpoint:
 
https://api.des.caixa:8443/plataforma-unificada/trilha/v1/registros
 
e recebendo:
 
SSLHandshakeException
PKIX path building failed
unable to find valid certification path to requested target
 
Poderiam verificar qual truststore está configurado atualmente para o ambiente do SIALI e se a cadeia de certificados do endpoint api.des.caixa:8443 está presente nele?

É provável que o arquivo com os certificados que o Siali esta usando esteja desatualizado


nao sei se e esse aqui no okd ta assim:


09:35:23,984 INFO [stdout] (elastic-apm-server-reporter) 2026-08-21 09:35:23.984 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
09:35:23,984 INFO [stdout] (elastic-apm-server-reporter) 2026-08-21 09:35:23.984 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 36 seconds (+/-10%)
09:36:01,958 INFO [stdout] (elastic-apm-server-reporter) 2026-08-21 09:36:01.958 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
09:36:01,958 INFO [stdout] (elastic-apm-server-reporter) 2026-08-21 09:36:01.958 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 36 seconds (+/-10%)
09:36:43,372 INFO [stdout] (elastic-apm-server-reporter) 2026-08-21 09:36:43.372 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
09:36:43,372 INFO [stdout] (elastic-apm-server-reporter) 2026-08-21 09:36:43.372 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 36 seconds (+/-10%)
09:37:23,642 INFO [stdout] (elastic-apm-server-reporter) 2026-08-21 09:37:23.642 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
09:37:23,642 INFO [stdout] (elastic-apm-server-reporter) 2026-08-21 09:37:23.642 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 36 seconds (+/-10%)
09:37:56,145 INFO [stdout] (elastic-apm-remote-config-poller) 2026-08-21 09:37:56.145 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - connect timed out
09:38:05,045 INFO [stdout] (elastic-apm-server-reporter) 2026-08-21 09:38:05.045 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
09:38:05,045 INFO [stdout] (elastic-apm-server-reporter) 2026-08-21 09:38:05.045 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 36 seconds (+/-10%)
09:38:45,783 INFO [stdout] (elastic-apm-server-reporter) 2026-08-21 09:38:45.783 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
09:38:45,783 INFO [stdout] (elastic-apm-server-reporter) 2026-08-21 09:38:45.783 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 36 seconds (+/-10%)
09:39:28,992 INFO [stdout] (elastic-apm-server-reporter) 2026-08-21 09:39:28.992 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
09:39:28,993 INFO [stdout] (elastic-apm-server-reporter) 2026-08-21 09:39:28.993 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 36 seconds (+/-10%)
09:40:11,281 INFO [stdout] (elastic-apm-server-reporter) 2026-08-21 09:40:11.281 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
09:40:11,281 INFO [stdout] (elastic-apm-server-reporter) 2026-08-21 09:40:11.281 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 36 seconds (+/-10%)
09:40:51,300 INFO [stdout] (elastic-apm-server-reporter) 2026-08-21 09:40:51.300 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
09:40:51,300 INFO [stdout] (elastic-apm-server-reporter) 2026-08-21 09:40:51.300 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 36 seconds (+/-10%)
09:41:32,769 INFO [stdout] (elastic-apm-server-reporter) 2026-08-21 09:41:32.769 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
09:41:32,769 INFO [stdout] (elastic-apm-server-reporter) 2026-08-21 09:41:32.769 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 36 seconds (+/-10%)
09:42:17,228 INFO [stdout] (elastic-apm-server-reporter) 2026-08-21 09:42:17.228 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
09:42:17,228 INFO [stdout] (elastic-apm-server-reporter) 2026-08-21 09:42:17.228 [elastic-apm-server-reporter] INFO co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Backing off for 36 seconds (+/-10%)
09:43:01,398 INFO [stdout] (elastic-apm-server-reporter) 2026-08-21 09:43:01.398 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
