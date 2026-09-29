sh-4.2$ oc get cm default-virtualhost-ssl-conf-sipar-inter-frontend -o yaml \
>   | sed '/Listen 0.0.0.0:8443 https/d' | oc replace -f -
configmap/default-virtualhost-ssl-conf-sipar-inter-frontend replaced
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get cm default-virtualhost-ssl-conf-sipar-inter-frontend -o yaml | grep -c Listen
0
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc delete pod sipar-inter-frontend-des-32-l46w8
pod "sipar-inter-frontend-des-32-l46w8" deleted
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods | grep frontend
sipar-inter-frontend-des-28-ks9fm    0/1       ImagePullBackOff    0          116m
sipar-inter-frontend-des-31-deploy   0/1       Error               0          19h
sipar-inter-frontend-des-32-deploy   1/1       Running             0          2m46s
sipar-inter-frontend-des-32-smvvh    0/1       ContainerCreating   0          8s
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods | grep frontend
sipar-inter-frontend-des-28-ks9fm    0/1       ImagePullBackOff   0          116m
sipar-inter-frontend-des-31-deploy   0/1       Error              0          19h
sipar-inter-frontend-des-32-deploy   1/1       Running            0          2m51s
sipar-inter-frontend-des-32-smvvh    0/1       Running            0          13s
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods | grep frontend
sipar-inter-frontend-des-28-ks9fm    0/1       ImagePullBackOff   0          116m
sipar-inter-frontend-des-31-deploy   0/1       Error              0          19h
sipar-inter-frontend-des-32-deploy   1/1       Running            0          3m
sipar-inter-frontend-des-32-smvvh    0/1       Running            0          22s
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods | grep frontend
sipar-inter-frontend-des-28-ks9fm    0/1       ImagePullBackOff   0          116m
sipar-inter-frontend-des-31-deploy   0/1       Error              0          19h
sipar-inter-frontend-des-32-deploy   1/1       Running            0          3m2s
sipar-inter-frontend-des-32-smvvh    0/1       Running            0          24s
-sh-4.2$
