
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc debug dc/simtr-batch-des -n simtr-des -- java -version
Defaulting container name to simtr-batch-des.
Use 'oc describe pod/simtr-batch-des-debug -n simtr-des' to see all of the containers in this pod.

Debugging with pod/simtr-batch-des-debug, original command: <image entrypoint>
Waiting for pod to start ...
openjdk version "11.0.11" 2021-04-20 LTS
OpenJDK Runtime Environment 18.9 (build 11.0.11+9-LTS)
OpenJDK 64-Bit Server VM 18.9 (build 11.0.11+9-LTS, mixed mode, sharing)

Removing debug pod ...
-sh-4.2$ oc run debug-simtr-batch --image=default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/simtr-batch@sha256:d725135cd535529d5963592d77586af1b22522f6c340cc4848edc16f4e87b6de -n simtr-des --restart=Never --command -- java -version
pod/debug-simtr-batch created
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc run debug-simtr-batch --image=default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/simtr-batch@sha256:d725135cd535529d5963592d77586af1b22522f6c340cc4848edc16f4e87b6de -n simtr-des --restart=Never --command -- java -version
Error from server (AlreadyExists): pods "debug-simtr-batch" already exists
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
