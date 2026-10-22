
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]# grep -nE "global-modules|insight" /opt/jboss/jboss-eap/dc/configuration/domain.xml
859:                <global-modules>
861:                </global-modules>
[root@sbrdeapllx069 p585600]#




[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]# cd /tmp/gec
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]# find . -name "*.jar" -o -name "*.war" | while read j; do unzip -l "$j" 2>/dev/null | grep -qiE "applicationinsights|microsoft/applicationinsights" && echo "$j"; done
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]# ls lib 2>/dev/null | grep -iE "insight|azure|opentelemetry|monitor"
azure-core-1.11.0.jar
azure-core-amqp-2.0.0.jar
azure-core-http-netty-1.7.0.jar
azure-identity-1.2.1.jar
azure-messaging-servicebus-7.0.0.jar
gec-azure-4.53.2-batch.build.1.jar
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]# for w in *.war; do unzip -l $w | grep -iE "WEB-INF/lib/.*(insight|azure-monitor|opentelemetry)"; done
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]# unzip -l /opt/jboss/jboss-eap/hc/data/content/be/e2a4602a1e9785994c5ddf82c3153f64c70fc7/content | grep -iE "insight|telemetry"
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]# tr '\0' '\n' < /proc/72951/environ | grep -iE "insight|APPLICATIONINSIGHTS|OTEL"
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]#
[root@sbrdeapllx104 gec]# cd / && rm -rf /tmp/gec
[root@sbrdeapllx104 /]#
