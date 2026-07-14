
Using project "default".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get project simpi-des
NAME        DISPLAY NAME   STATUS
simpi-des                  Active
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc/simpi-med-des -n simpi-des
NAME            REVISION   DESIRED   CURRENT   TRIGGERED BY
simpi-med-des   4          1         0
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout status dc/simpi-med-des -n simpi-des
error: replication controller "simpi-med-des-4" has failed progressing
-sh-4.2$ oc get events -n simpi-des --sort-by='.lastTimestamp' | tail -30
F0714 15:49:39.603417  110403 sorter.go:306] Field {.lastTimestamp} in *unstructured.Unstructured is an unsortable type: interface, err: unsortable type: <nil>
-sh-4.2$
