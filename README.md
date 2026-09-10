
-sh-4.2$ oc create -f debug-tcpdump-009.yaml
pod/debug-tcpdump-009 created
-sh-4.2$ oc get pod debug-tcpdump-009 -n openshift-ingress
No resources found.
Error from server (NotFound): pods "debug-tcpdump-009" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods
NAME                                     READY     STATUS      RESTARTS   AGE
sigda-api-quarkus-des-10-deploy          0/1       Completed   0          13d
sigda-api-quarkus-des-11-8f6kd           1/1       Running     0          19h
sigda-api-quarkus-des-11-deploy          0/1       Completed   0          19h
sigda-integracao-filenet-des-20-deploy   0/1       Completed   0          37d
sigda-integracao-filenet-des-21-2p8px    1/1       Running     0          37d
sigda-integracao-filenet-des-21-deploy   0/1       Completed   0          37d
-sh-4.2$
