
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc project sirex-des
Already on project "sirex-des" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc delete pod sirex-agenda-api-des-81-debug --ignore-not-found
pod "sirex-agenda-api-des-81-debug" deleted
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get rc sirex-agenda-api-des-81 -o json | python -c 'import json,sys; print(json.dumps(json.load(sys.stdin)["spec"]["template"]["spec"], indent=2, sort_keys=True))' > /tmp/rc81.json
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ diff /tmp/rc80.json /tmp/rc81.json
43c43
<           "value": "-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
---
>           "value": "-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/applicationinsights-agent-3.2.10.jar"
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
