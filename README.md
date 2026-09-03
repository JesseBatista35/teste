
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc describe resourcequota -n sisgf-des
Name:            quota-resources
Namespace:       sisgf-des
Resource         Used    Hard
--------         ----    ----
limits.cpu       5650m   10
limits.memory    7936Mi  12Gi
pods             6       10
requests.cpu     4050m   5
requests.memory  5264Mi  6Gi
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set resources dc/sisgf-batch-des -c sisgf-batch-des --requests=memory=400Mi -n sisgf-des
deploymentconfig.apps.openshift.io/sisgf-batch-des resource requirements updated
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout status dc/sisgf-batch-des -n sisgf-des
error: replication controller "sisgf-batch-des-299" has failed progressing
-sh-4.2$ oc get pods -n sisgf-des
NAME                            READY     STATUS      RESTARTS       AGE
sisgf-api-des-85-deploy         0/1       Completed   0              45d
sisgf-api-des-86-deploy         0/1       Completed   0              44d
sisgf-api-des-86-vhp4x          1/1       Running     0              44d
sisgf-backend-des-369-deploy    0/1       Completed   0              2d1h
sisgf-backend-des-370-58dxl     1/1       Running     0              22h
sisgf-backend-des-370-deploy    0/1       Completed   0              24h
sisgf-backend-des-370-gpc5z     0/1       Running     1 (2m8s ago)   22h
sisgf-backend-des-370-zg8dc     1/1       Running     0              24h
sisgf-batch-des-292-deploy      0/1       Completed   0              45h
sisgf-batch-des-293-deploy      0/1       Completed   0              44h
sisgf-batch-des-293-ljsg2       1/1       Running     0              44h
sisgf-batch-des-297-deploy      0/1       Error       0              21h
sisgf-batch-des-298-deploy      0/1       Error       0              19h
sisgf-batch-des-299-deploy      0/1       Error       0              4h48m
sisgf-frontend-des-264-deploy   0/1       Completed   0              23h
sisgf-frontend-des-265-2wdmj    2/2       Running     0              23h
sisgf-frontend-des-265-deploy   0/1       Completed   0              23h
sisgf-frontend-des-267-deploy   0/1       Error       0              21h
sisgf-frontend-des-268-deploy   0/1       Error       0              21h
sisgf-frontend-des-269-deploy   0/1       Error       0              5h55m
sisgf-frontend-des-270-deploy   0/1       Error       0              5h24m
sisgf-frontend-des-271-deploy   0/1       Error       0              5h11m
sisgf-frontend-des-272-deploy   0/1       Error       0              4h15m
sisgf-frontend-des-273-deploy   0/1       Error       0              163m
sisgf-frontend-des-274-deploy   0/1       Error       0              24m
-sh-4.2$
