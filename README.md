
-sh-4.2$ oc get dc sihdg-jboss8-des
NAME               REVISION   DESIRED   CURRENT   TRIGGERED BY
sihdg-jboss8-des   92         1         0
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs dc/sihdg-jboss8-des --version=92
--> Scaling up sihdg-jboss8-des-92 from 0 to 1, scaling down sihdg-jboss8-des-88 from 1 to 0 (keep 1 pods available, don't exceed 2 pods)
    Scaling sihdg-jboss8-des-92 up to 1
error: timed out waiting for any update progress to be made
-sh-4.2$ oc describe rc sihdg-jboss8-des-92
Name:         sihdg-jboss8-des-92
Namespace:    sihdg-des
Selector:     deployment=sihdg-jboss8-des-92,deploymentconfig=sihdg-jboss8-des,name=sihdg-jboss8-des
Labels:       CGC_DES=7390
              CGC_OPS=7259
              app=sihdg-jboss8-des
              application=sihdg-jboss8-des
              openshift.io/deployment-config.name=sihdg-jboss8-des
              template=jboss-caixa-release
Annotations:  kubectl.kubernetes.io/desired-replicas=1
              kubectl.kubernetes.io/update-source-id=sihdg-jboss8-des-88:4c6bba95-5acd-465d-9dfb-6c8a8283d6e4
              openshift.io/deployer-pod.completed-at=2026-09-10 01:02:14 +0000 UTC
              openshift.io/deployer-pod.created-at=2026-09-10 00:52:08 +0000 UTC
              openshift.io/deployer-pod.name=sihdg-jboss8-des-92-deploy
              openshift.io/deployment-config.latest-version=92
              openshift.io/deployment-config.name=sihdg-jboss8-des
              openshift.io/deployment.phase=Failed
              openshift.io/deployment.replicas=0
              openshift.io/deployment.status-reason=manual change
              openshift.io/encoded-deployment-config={"kind":"DeploymentConfig","apiVersion":"apps.openshift.io/v1","metadata":{"name":"sihdg-jboss8-des","namespace":"sihdg-des","uid":"3eab359f-eccc-4b5b-b507-af789...
Replicas:     0 current / 0 desired
Pods Status:  0 Running / 0 Waiting / 0 Succeeded / 0 Failed
Pod Template:
  Labels:       CGC_DES=7390
                CGC_OPS=7259
                app=sihdg-jboss8-des
                deployment=sihdg-jboss8-des-92
                deploymentconfig=sihdg-jboss8-des
                name=sihdg-jboss8-des
  Annotations:  openshift.io/deployment-config.latest-version=92
                openshift.io/deployment-config.name=sihdg-jboss8-des
                openshift.io/deployment.name=sihdg-jboss8-des-92
  Containers:
   sihdg-jboss8-des:
    Image:       default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sihdg-jboss8:3.14.1.0
    Ports:       8778/TCP, 8080/TCP
    Host Ports:  0/TCP, 0/TCP
    Limits:
      cpu:     1
      memory:  2Gi
    Requests:
      cpu:      10m
      memory:   2Gi
    Liveness:   http-get http://:8080/sihdg-api/health/live delay=60s timeout=5s period=10s #success=1 #failure=6
    Readiness:  http-get http://:8080/sihdg-api/health/ready delay=30s timeout=5s period=10s #success=1 #failure=5
    Environment:
      TZ:                America/Sao_Paulo
      INSTANCE_IP:        (v1:status.podIP)
      JAVA_OPTS_APPEND:  -Djavax.net.ssl.trustStore=/opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks  -Djava.security.properties=/opt/server/bin/java.security.override
    Mounts:
      /opt/server/bin/standalone.conf from java-config-sihdg-jboss8 (rw)
      /opt/server/standalone/configuration/caixa-truststore-acteste-nprd.jks from caixa-truststore-acteste-nprd (rw)
      /opt/server/standalone/configuration/standalone.xml from jboss-config-sihdg-jboss8 (rw)
      /sihdg_des from sihdg-jboss8-data-des (rw)
      /sihdg_sinaf from sihdg-sinaf-data-des (rw)
  Volumes:
   sihdg-sinaf-data-des:
    Type:       PersistentVolumeClaim (a reference to a PersistentVolumeClaim in the same namespace)
    ClaimName:  sihdg-sinaf-data-des
    ReadOnly:   false
   sihdg-jboss8-data-des:
    Type:       PersistentVolumeClaim (a reference to a PersistentVolumeClaim in the same namespace)
    ClaimName:  sihdg-jboss8-data-des
    ReadOnly:   false
   caixa-truststore-acteste-nprd:
    Type:        Secret (a volume populated by a Secret)
    SecretName:  caixa-truststore-acteste-nprd
    Optional:    false
   jboss-config-sihdg-jboss8:
    Type:      ConfigMap (a volume populated by a ConfigMap)
    Name:      jboss-config-sihdg-jboss8
    Optional:  false
   java-config-sihdg-jboss8:
    Type:      ConfigMap (a volume populated by a ConfigMap)
    Name:      java-config-sihdg-jboss8
    Optional:  false
-sh-4.2$



