
-sh-4.2$ oc -n selenium-grid set env dc/firefox --list
# deploymentconfigs/firefox, container firefox
SE_EVENT_BUS_HOST=selenium-event-bus
SE_EVENT_BUS_PUBLISH_PORT=4442
SE_EVENT_BUS_SUBSCRIBE_PORT=4443
SE_NODE_MAX_SESSIONS=4
SE_NODE_OVERRIDE_MAX_SESSIONS=true
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc -n selenium-grid set env dc/selenium-router --list
# deploymentconfigs/selenium-router, container selenium-router
SE_DISTRIBUTOR_HOST=selenium-distributor
SE_DISTRIBUTOR_PORT=5553
SE_SESSIONS_MAP_HOST=selenium-sessions
SE_SESSIONS_MAP_PORT=5556
SE_SESSION_QUEUE_HOST=selenium-session-queue
SE_SESSION_QUEUE_PORT=5559
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc -n selenium-grid rollout history dc/firefox
deploymentconfigs "firefox"
REVISION        STATUS          CAUSE
1               Complete        config change
2               Complete        config change
3               Complete        config change
4               Complete        manual change

-sh-4.2$
-sh-4.2$
-sh-4.2$ oc -n selenium-grid rsh firefox-4-n5rkq bash -c \
>  'for ip in 10.252.32.63 10.252.32.65; do timeout 5 bash -c "</dev/tcp/$ip/80" && echo "$ip OK" || echo "$ip FALHA"; done'
10.252.32.63 FALHA
10.252.32.65 FALHA
-sh-4.2$ oc get proxy cluster -o jsonpath='{.spec}{"\n"}' 2>/dev/null
map[httpProxy:http://proxyprd.caixa:80 httpsProxy:http://proxyprd.caixa:80 noProxy:.caixa,.caixa.gov.br,.corecaixa,.local,.svc,localhost,10.0.0.0/8,25.0.0.0/8,10.116.208.20,10.116.208.21,10.121.105.33,10.121.105.34,10.121.105.35 trustedCA:map[name:custom-ca2]]
-sh-4.2$ oc get dc,deploy -A -o yaml 2>/dev/null | grep -iE 'https?_proxy' | sort | uniq -c
-sh-4.2$
-sh-4.2$
-sh-4.2$
