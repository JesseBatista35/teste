-sh-4.2$ oc rollout status dc/simpi-med-des -n simpi-des
error: replication controller "simpi-med-des-4" has failed progressing
-sh-4.2$ oc get events -n simpi-des --sort-by='.lastTimestamp' | tail -30
F0714 15:49:39.603417  110403 sorter.go:306] Field {.lastTimestamp} in *unstructured.Unstructured is an unsortable type: interface, err: unsortable type: <nil>
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n simpi-des -l deploymentconfig=simpi-med-des --show-labels
No resources found.
-sh-4.2$ oc describe rc/simpi-med-des-4 -n simpi-des
Name:         simpi-med-des-4
Namespace:    simpi-des
Selector:     deployment=simpi-med-des-4,deploymentconfig=simpi-med-des,name=simpi-med-des
Labels:       CGC_DES=7390
              CGC_OPS=7259
              app=simpi-med-des
              application=simpi-med-des
              openshift.io/deployment-config.name=simpi-med-des
              template=quarkus-caixa-release
Annotations:  kubectl.kubernetes.io/desired-replicas=1
              openshift.io/deployer-pod.completed-at=2026-07-14 17:42:51 +0000 UTC
              openshift.io/deployer-pod.created-at=2026-07-14 17:32:47 +0000 UTC
              openshift.io/deployer-pod.name=simpi-med-des-4-deploy
              openshift.io/deployment-config.latest-version=4
              openshift.io/deployment-config.name=simpi-med-des
              openshift.io/deployment.phase=Failed
              openshift.io/deployment.replicas=0
              openshift.io/encoded-deployment-config={"kind":"DeploymentConfig","apiVersion":"apps.openshift.io/v1","metadata":{"name":"simpi-med-des","namespace":"simpi-des","uid":"345f7751-f758-4ab9-836a-25dfee1c...
Replicas:     0 current / 0 desired
Pods Status:  0 Running / 0 Waiting / 0 Succeeded / 0 Failed
Pod Template:
  Labels:       CGC_DES=7390
                CGC_OPS=7259
                app=simpi-med-des
                deployment=simpi-med-des-4
                deploymentconfig=simpi-med-des
                name=simpi-med-des
  Annotations:  openshift.io/deployment-config.latest-version=4
                openshift.io/deployment-config.name=simpi-med-des
                openshift.io/deployment.name=simpi-med-des-4
  Containers:
   simpi-med-des:
    Image:      simpi-med-des
    Port:       8080/TCP
    Host Port:  0/TCP
    Limits:
      cpu:     1
      memory:  1Gi
    Requests:
      cpu:      1
      memory:   1Gi
    Liveness:   http-get http://:8080/q/health/live delay=15s timeout=3s period=10s #success=1 #failure=3
    Readiness:  http-get http://:8080/q/health/ready delay=25s timeout=5s period=10s #success=1 #failure=3
    Environment:
      TZ:    America/Sao_Paulo
    Mounts:  <none>
  Volumes:   <none>
-sh-4.2$ c logs -n simpi-des --previous
-sh: c: comando não encontrado
-sh-4.2$ oc logs -n simpi-des --previous
error: expected 'logs (POD | TYPE/NAME) [CONTAINER_NAME]'.
POD or TYPE/NAME is a required argument for the logs command
See 'oc logs -h' for help and examples.
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
