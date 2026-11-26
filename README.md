
[root@caddeapllx763 p585600]#
[root@caddeapllx763 p585600]# ^C
[root@caddeapllx763 p585600]# L=/logs/jboss/jboss-eap/standalone/sigec-csc/server.log
[root@caddeapllx763 p585600]# grep -iE 'UT000020|UT000047|larger than|max-post-size|RequestTooBig' $L | tail -10
[root@caddeapllx763 p585600]# grep -n '11:4[5-9]' $L | grep -iE 'ERROR|WARN' | tail -20
425:2026-11-26 05:11:48,801 INFO  [stdout] (elastic-apm-server-reporter) 2026-11-26 05:11:48.801 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
588:2026-11-26 07:11:49,222 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-11-26 07:11:49.222 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - connect timed out
29808:2026-11-26 11:45:41,945 INFO  [stdout] (elastic-apm-server-reporter) 2026-11-26 11:45:41.945 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
29809:2026-11-26 11:46:32,564 INFO  [stdout] (elastic-apm-server-reporter) 2026-11-26 11:46:32.564 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
29822:2026-11-26 11:46:50,415 INFO  [stdout] (elastic-apm-remote-config-poller) 2026-11-26 11:46:50.415 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - connect timed out
29824:2026-11-26 11:47:25,572 INFO  [stdout] (elastic-apm-server-reporter) 2026-11-26 11:47:25.572 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
29825:2026-11-26 11:48:18,696 INFO  [stdout] (elastic-apm-server-reporter) 2026-11-26 11:48:18.696 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
29827:2026-11-26 11:49:12,851 INFO  [stdout] (elastic-apm-server-reporter) 2026-11-26 11:49:12.851 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: connect timed out
[root@caddeapllx763 p585600]#
[root@caddeapllx763 p585600]#
[root@caddeapllx763 p585600]#
[root@caddeapllx763 p585600]#
[root@caddeapllx763 p585600]#
