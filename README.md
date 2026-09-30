-4.2$
-sh-4.2$ oc logs sirex-agenda-api-des-81-deploy
--> Scaling up sirex-agenda-api-des-81 from 0 to 1, scaling down sirex-agenda-api-des-80 from 1 to 0 (keep 1 pods available, don't exceed 2 pods)
    Scaling sirex-agenda-api-des-81 up to 1
error: timed out waiting for any update progress to be made
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get rc sirex-agenda-api-des-81 sirex-agenda-api-des-80 \
>   -o jsonpath='{range .items[*]}{.metadata.name}{"\t"}{.spec.template.spec.containers[0].image}{"\n"}{end}'
sirex-agenda-api-des-81 default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sirex-agenda-api:20260922.1331-0.2.4.5-SNAPSHOT
sirex-agenda-api-des-80 default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sirex-agenda-api:20260922.1331-0.2.4.5-SNAPSHOT
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get events --sort-by=.lastTimestamp | grep -i agenda-api | tail -20
F0930 11:57:50.548677   38024 sorter.go:306] Field {.lastTimestamp} in *unstructured.Unstructured is an unsortable type: interface, err: unsortable interface: interface
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec sirex-agenda-api-des-80-48n9b -- java -version
openjdk version "21.0.1" 2023-10-17
OpenJDK Runtime Environment (build 21.0.1+12-29)
OpenJDK 64-Bit Server VM (build 21.0.1+12-29, mixed mode, sharing)
-sh-4.2$
