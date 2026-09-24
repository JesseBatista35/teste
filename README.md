
-sh-4.2$
-sh-4.2$ POD=$(oc get pod -n sigsj-des -l name=sigsj-alvara-des -o name --sort-by=.metadata.creationTimestamp | tail -1)
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs $POD -n sigsj-des | grep -Ei 'c.m.applicationinsights|ingestion|telemetry.*fail|403|407|timeout'
2026-09-24 15:26:39.026-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.7.1 started successfully (PID 8, JVM running for 5.804 s)
2026-09-24 15:26:39.028-03:00 INFO  c.m.applicationinsights.agent - Java version: 17.0.7, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-17-openjdk-17.0.7.0.7-3.el8.x86_64
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $POD -n sigsj-des -- curl -sv -x http://proxydes.caixa:80 -o /dev/null -w '%{http_code}\n' \
>   https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track
error: invalid resource name "pod/sigsj-alvara-des-667-64kd5": [may not contain '/']
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $POD -n sigsj-des -- curl -sv -x http://proxydes.caixa:80 -o /dev/null -w '%{http_code}\n' \
> https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track
error: invalid resource name "pod/sigsj-alvara-des-667-64kd5": [may not contain '/']
-sh-4.2$
-sh-4.2$
-sh-4.2$
