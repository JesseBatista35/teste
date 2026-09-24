
-sh-4.2$ oc project
Using project "simcn-des" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ POD=$(oc get pod -n simcn-des -l deploymentconfig=simcn-backend-des -o name | head -1)
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -n simcn-des $POD -- df -h /simcn /upload/des/simcn 2>&1
error: invalid resource name "pod/simcn-backend-des-255-cft7g": [may not contain '/']
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -n simcn-des $POD -- ls -la /upload/des/simcn /uploadintegracao/des/simcn /simcn 2>&1
error: invalid resource name "pod/simcn-backend-des-255-cft7g": [may not contain '/']
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods
NAME                           READY     STATUS      RESTARTS   AGE
simcn-backend-des-254-deploy   0/1       Completed   0          45h
simcn-backend-des-255-cft7g    1/1       Running     0          4m3s
simcn-backend-des-255-deploy   0/1       Completed   0          4m6s
simcn-frontend-des-60-deploy   0/1       Completed   0          45h
simcn-frontend-des-61-deploy   0/1       Completed   0          24h
simcn-frontend-des-61-gccqn    2/2       Running     0          24h
-sh-4.2$
