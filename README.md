oc get pods -n sisgf-des | grep batch

oc delete pod sisgf-batch-des-293-ljsg2 -n sisgf-des --grace-period=0 --force

oc get pods -n sisgf-des -l app=sisgf-batch-des
oc logs -f dc/sisgf-batch-des -n sisgf-des




-sh-4.2$
-sh-4.2$ oc get pods -n sisgf-des | grep batch
sisgf-batch-des-292-deploy      0/1       Completed   0              45h
sisgf-batch-des-293-deploy      0/1       Completed   0              44h
sisgf-batch-des-293-ljsg2       1/1       Running     0              44h
sisgf-batch-des-297-deploy      0/1       Error       0              21h
sisgf-batch-des-298-deploy      0/1       Error       0              19h
sisgf-batch-des-299-deploy      0/1       Error       0              4h51m
sisgf-batch-des-300-7krld       0/1       Running     0              102s
sisgf-batch-des-300-deploy      1/1       Running     0              106s
-sh-4.2$
-sh-4.2$
-sh-4.2$
