dentro do agent 

Deu isso


There was 1 failed login attempt since the last successful login.
[p585600@cadsvitrlx104 ~]$
[p585600@cadsvitrlx104 ~]$
[p585600@cadsvitrlx104 ~]$
[p585600@cadsvitrlx104 ~]$
[p585600@cadsvitrlx104 ~]$ ls -lh /opt/ads-agent/_work/26/a/sifap-front-v2.zip
ls: não foi possível acessar '/opt/ads-agent/_work/26/a/sifap-front-v2.zip': Arquivo ou diretório inexistente
[p585600@cadsvitrlx104 ~]$






no cluster:



-sh-4.2$ oc get builds -n build-images-ads | grep sifap-front-v2
No resources found.
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get to
error: the server doesn't have a resource type "to"
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get bc sifap-front-v2 -n build-images-ads
No resources found.
Error from server (NotFound): buildconfigs.build.openshift.io "sifap-front-v2" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get builds -n build-image-ads -l buildconfig=sifap-front-v2
No resources found.
-sh-4.2$
-sh-4.2$
-sh-4.2$ v
