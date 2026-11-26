<img width="1879" height="978" alt="image" src="https://github.com/user-attachments/assets/c187a027-aa72-4ef5-bcfc-f87740d7c93a" />

[root@caddeapllx763 p585600]#
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
[root@caddeapllx763 p585600]# CLI="/opt/jboss/jboss-eap/bin/jboss-cli.sh -c --controller=10.116.193.251:9990"
[root@caddeapllx763 p585600]# $CLI '/subsystem=undertow/server=default-server/ajp-listener=ajp:write-attribute(name=max-post-size,value=209715200)'
{
    "outcome" => "success",
    "response-headers" => {
        "operation-requires-reload" => true,
        "process-state" => "reload-required"
    }
}
[root@caddeapllx763 p585600]# $CLI '/subsystem=modcluster/mod-cluster-config=configuration:write-attribute(name=node-timeout,value=600)'
{
    "outcome" => "success",
    "response-headers" => {
        "operation-requires-reload" => true,
        "process-state" => "reload-required"
    }
}
[root@caddeapllx763 p585600]# $CLI ':reload'
{
    "outcome" => "success",
    "result" => undefined
}
[root@caddeapllx763 p585600]#




-sh-4.2$
-sh-4.2$
-sh-4.2$ sudo su
[sudo] senha para p585600:
[root@caddeapllx137 p585600]#
[root@caddeapllx137 p585600]#
[root@caddeapllx137 p585600]#
[root@caddeapllx137 p585600]#
[root@caddeapllx137 p585600]#
[root@caddeapllx137 p585600]# ls /logs/apache2/sigec-csc/
sigec-csc.esteiras.tqs.caixa-access.log  sigec-csc.esteiras.tqs.caixa-error.log
[root@caddeapllx137 p585600]# grep -E '"POST ' /logs/apache2/sigec-csc/sigec-csc.esteiras.des.caixa-access.log | grep '26/Nov/2026:11:4' | tail
grep: /logs/apache2/sigec-csc/sigec-csc.esteiras.des.caixa-access.log: Arquivo ou diretório não encontrado
[root@caddeapllx137 p585600]# grep '11:4' /logs/apache2/sigec-csc/sigec-csc.esteiras.des.caixa-error.log | grep -iE 'ajp|proxy' | tail
grep: /logs/apache2/sigec-csc/sigec-csc.esteiras.des.caixa-error.log: Arquivo ou diretório não encontrado
[root@caddeapllx137 p585600]#
[root@caddeapllx137 p585600]#
[root@caddeapllx137 p585600]#
[root@caddeapllx137 p585600]#
[root@caddeapllx137 p585600]#
[root@caddeapllx137 p585600]#



