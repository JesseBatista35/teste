-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get rc sirex-agenda-api-des-80 -o jsonpath='{.spec.template.spec}' | python -m json.tool > /tmp/rc80.json
No JSON object could be decoded
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get rc sirex-agenda-api-des-81 -o jsonpath='{.spec.template.spec}' | python -m json.tool > /tmp/rc81.json
No JSON object could be decoded
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ diff /tmp/rc80.json /tmp/rc81.json
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout history dc/sirex-agenda-api-des
deploymentconfigs "sirex-agenda-api-des"
REVISION        STATUS          CAUSE
79              Complete        manual change
80              Complete        manual change
81              Failed          manual change

-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get events | grep -i agenda-api
10h         Warning   FailedMount                   pod/sirex-agenda-api-des-80-48n9b               MountVolume.SetUp failed for volume "script-bt-volume" : failed to sync configmap cache: timed out waiting for the condition
10h         Warning   FailedMount                   pod/sirex-agenda-api-des-80-48n9b               MountVolume.SetUp failed for volume "kube-api-access-fk57p" : failed to sync configmap cache: timed out waiting for the condition
10h         Warning   FailedMount                   pod/sirex-agenda-api-des-80-48n9b               MountVolume.SetUp failed for volume "caixa-truststore-acteste-nprd" : failed to sync secret cache: timed out waiting for the condition
77m         Normal    Scheduled                     pod/sirex-agenda-api-des-81-8m2ck               Successfully assigned sirex-des/sirex-agenda-api-des-81-8m2ck to ceadecldlx026.nprd.caixa
77m         Normal    AddedInterface                pod/sirex-agenda-api-des-81-8m2ck               Add eth0 [25.1.3.200/23] from openshift-sdn
77m         Normal    Pulled                        pod/sirex-agenda-api-des-81-8m2ck               Container image "default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.2" already present on machine
77m         Normal    Created                       pod/sirex-agenda-api-des-81-8m2ck               Created container secrets-agent-sidecar
77m         Normal    Started                       pod/sirex-agenda-api-des-81-8m2ck               Started container secrets-agent-sidecar
77m         Normal    Pulled                        pod/sirex-agenda-api-des-81-8m2ck               Container image "default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552" already present on machine
77m         Normal    Created                       pod/sirex-agenda-api-des-81-8m2ck               Created container secrets-check
77m         Normal    Started                       pod/sirex-agenda-api-des-81-8m2ck               Started container secrets-check
76m         Normal    Pulling                       pod/sirex-agenda-api-des-81-8m2ck               Pulling image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sirex-agenda-api:20260922.1331-0.2.4.5-SNAPSHOT"
77m         Normal    Pulled                        pod/sirex-agenda-api-des-81-8m2ck               Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sirex-agenda-api:20260922.1331-0.2.4.5-SNAPSHOT" in 8.038699358s (8.038713475s including waiting)
76m         Normal    Created                       pod/sirex-agenda-api-des-81-8m2ck               Created container sirex-agenda-api-des
76m         Normal    Started                       pod/sirex-agenda-api-des-81-8m2ck               Started container sirex-agenda-api-des
77m         Normal    Pulled                        pod/sirex-agenda-api-des-81-8m2ck               Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sirex-agenda-api:20260922.1331-0.2.4.5-SNAPSHOT" in 58.273574ms (58.284888ms including waiting)
72m         Warning   BackOff                       pod/sirex-agenda-api-des-81-8m2ck               Back-off restarting failed container
76m         Normal    Pulled                        pod/sirex-agenda-api-des-81-8m2ck               Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sirex-agenda-api:20260922.1331-0.2.4.5-SNAPSHOT" in 57.535005ms (57.547992ms including waiting)
77m         Normal    Scheduled                     pod/sirex-agenda-api-des-81-deploy              Successfully assigned sirex-des/sirex-agenda-api-des-81-deploy to ceadecldlx026.nprd.caixa
77m         Normal    AddedInterface                pod/sirex-agenda-api-des-81-deploy              Add eth0 [25.1.3.198/23] from openshift-sdn
77m         Normal    Pulled                        pod/sirex-agenda-api-des-81-deploy              Container image "quay.io/openshift/okd-content@sha256:0c49a1e144b537b9c69339d504287fe5c6974ffe69a3212345a5608c06db8a18" already present on machine
77m         Normal    Created                       pod/sirex-agenda-api-des-81-deploy              Created container deployment
77m         Normal    Started                       pod/sirex-agenda-api-des-81-deploy              Started container deployment
77m         Normal    SuccessfulCreate              replicationcontroller/sirex-agenda-api-des-81   Created pod: sirex-agenda-api-des-81-8m2ck
67m         Normal    SuccessfulDelete              replicationcontroller/sirex-agenda-api-des-81   Deleted pod: sirex-agenda-api-des-81-8m2ck
77m         Normal    DeploymentCreated             deploymentconfig/sirex-agenda-api-des           Created new replication controller "sirex-agenda-api-des-81" for version 81
67m         Normal    ReplicationControllerScaled   deploymentconfig/sirex-agenda-api-des           Scaled replication controller "sirex-agenda-api-des-81" from 1 to 0
-sh-4.2$
