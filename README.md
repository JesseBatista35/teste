
-sh-4.2$ oc get pods -n simtr-des | grep simtr-batch
simtr-batch-des-35-deploy                       0/1       Completed          0               28d
simtr-batch-des-36-deploy                       0/1       Completed          0               24h
simtr-batch-des-36-drx82                        0/1       CrashLoopBackOff   14 (67s ago)    48m
simtr-batch-des-37-deploy                       0/1       Error              0               177m
simtr-batch-des-38-deploy                       0/1       Error              0               163m
simtr-batch-des-39-deploy                       0/1       Error              0               112m
simtr-batch-des-40-deploy                       0/1       Error              0               48m
simtr-batch-des-41-deploy                       0/1       Error              0               37m
simtr-batch-des-42-deploy                       1/1       Running            0               7m46s
simtr-batch-des-42-l42zw                        0/1       CrashLoopBackOff   6 (108s ago)    7m42s
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod -n simtr-des -o jsonpath='{.spec.containers[0].image}{"\n"}'

-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get builds -n simtr-des | grep simtr-batch
No resources found.
-sh-4.2$ oc get istag -n simtr-des | grep simtr-batch
No resources found.
-sh-4.2$ oc rollout latest dc/simtr-batch-des -n simtr-des
error: #42 is already in progress (Running).
-sh-4.2$ oc cancel latest dc/simtr-batch-des -n simtr-des
Error: unknown command "cancel" for "oc"

Did you mean this?
        cancel-build

Run 'oc --help' for usage.
-sh-4.2$ oc rollout latest dc/simtr-batch-des -n simtr-des
error: #42 is already in progress (Running).
-sh-4.2$
