
-sh-4.2$ oc set env dc/sifug-siofg-api-des QUARKUS_SIOFG_IBM_MQ_PASSWORD='teste123' -n sifug-des
deploymentconfig.apps.openshift.io/sifug-siofg-api-des updated
-sh-4.2$ oc get pods -n sifug-des -w | grep siofg-api-des
sifug-siofg-api-des-213-deploy              0/1       Completed          0          32d
sifug-siofg-api-des-214-deploy              0/1       Completed          0          19d
sifug-siofg-api-des-214-jlkmq               1/1       Running            0          19d
sifug-siofg-api-des-214-wcbk4               1/1       Running            0          19d
sifug-siofg-api-des-258-tl8hd-debug-9m2lt   1/1       Running            0          3d
sifug-siofg-api-des-271-deploy              0/1       Error              0          59m
sifug-siofg-api-des-272-deploy              0/1       Error              0          10m
sifug-siofg-api-des-273-deploy              1/1       Running            0          43s
sifug-siofg-api-des-273-p696z               0/1       Error              2          40s
sifug-siofg-api-des-273-p696z   0/1       CrashLoopBackOff   2         40s
sifug-siofg-api-des-273-p696z   0/1       Running   3         1m
sifug-siofg-api-des-273-p696z   0/1       Error     3         1m
sifug-siofg-api-des-273-p696z   0/1       CrashLoopBackOff   3         1m
^C
-sh-4.2$
