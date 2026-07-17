
-sh-4.2$ oc create cm jboss-config-sihdg-jboss8 -n sihdg-des --from-file=standalone-okd.xml=~/standalone-okd.xml --dry-run=true -o yaml | oc apply -f -
error: error reading ~/standalone-okd.xml: no such file or directory
error: no objects passed to apply
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout latest dc/sihdg-jboss8-des -n sihdg-des
deploymentconfig.apps.openshift.io/sihdg-jboss8-des rolled out
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout status dc/sihdg-jboss8-des -n sihdg-des --watch
Waiting for rollout to finish: 1 old replicas are pending termination...
Waiting for rollout to finish: 0 of 1 updated replicas are available...
Waiting for rollout to finish: 1 old replicas are pending terminatio
