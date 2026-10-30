
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout latest dc/sihdg-jboss8-hmp -n sihdg-hmp
error: #2 is already in progress (Running).
-sh-4.2$ oc cancel  rollout latest dc/sihdg-jboss8-hmp -n sihdg-hmp
Error: unknown command "cancel" for "oc"

Did you mean this?
        cancel-build

Run 'oc --help' for usage.
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout latest dc/sihdg-jboss8-hmp -n sihdg-hmp
deploymentconfig.apps.openshift.io/sihdg-jboss8-hmp rolled out
-sh-4.2$ oc get pods -n sihdg-hmp -w | grep jboss8
sihdg-jboss8-hmp-3-deploy      1/1       Running             0          8s
sihdg-jboss8-hmp-3-s7gfv       0/1       ContainerCreating   0          6s
sihdg-jboss8-hmp-3-s7gfv   0/1       Running   0         8s
^C
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec sihdg-jboss8-hmp-3-s7gfv -n sihdg-hmp -- curl -s -o /dev/null -w "%{http_code}\n" http://localhost:8080/sihdg-api/health
200
-sh-4.2$
