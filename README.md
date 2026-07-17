-sh-4.2$ oc rollout history dc/sihdg-jboss8-des -n sihdg-des
deploymentconfigs "sihdg-jboss8-des"
REVISION        STATUS          CAUSE
18              Failed          manual change
19              Complete        manual change
20              Failed          manual change
21              Failed          manual change
22              Failed          manual change
23              Failed          manual change
24              Failed          manual change
25              Failed          manual change
26              Failed          manual change
27              Failed          manual change
28              Failed          manual change
29              Failed          manual change
30              Failed          manual change

-sh-4.2$ oc rollout history dc/sihdg-jboss8-des -n sihdg-des --revision=30
deploymentconfigs "sihdg-jboss8-des" with revision #30
Pod Template:
  Labels:       CGC_DES=7390
        CGC_OPS=7259
        app=sihdg-jboss8-des
        deployment=sihdg-jboss8-des-30
        deploymentconfig=sihdg-jboss8-des
        name=sihdg-jboss8-des
  Annotations:  openshift.io/deployment-config.latest-version=30
        openshift.io/deployment-config.name=sihdg-jboss8-des
        openshift.io/deployment.name=sihdg-jboss8-des-30
  Containers:
   sihdg-jboss8-des:
    Image:      default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sihdg-jboss8:3.12.0.7
    Ports:      8778/TCP, 8080/TCP
    Host Ports: 0/TCP, 0/TCP
    Limits:
      cpu:      1
      memory:   2Gi
    Requests:
      cpu:      10m
      memory:   2Gi
    Liveness:   exec [/bin/bash -c /opt/jboss/bin/livenessProbe.sh] delay=60s timeout=1s period=10s #success=1 #failure=3
    Readiness:  exec [/bin/bash -c /opt/jboss/bin/readinessProbe.sh] delay=60s timeout=1s period=10s #success=1 #failure=3
    Environment:
      TZ:       America/Sao_Paulo
      INSTANCE_IP:       (v1:status.podIP)
      DATASOURCE_CONNECTION_URL:        jdbc:sqlserver://10.116.93.91:1433;DatabaseName=HDGDB001
      DATASOURCE_USER_NAME:     sihdguser
      DATASOURCE_PASSWORD:      sihdguser
    Mounts:
      /opt/server/bin/standalone.conf from java-config-sihdg-jboss8 (rw)
      /opt/server/standalone/configuration/standalone-okd.xml from jboss-config-sihdg-jboss8 (rw)
  Volumes:
   jboss-config-sihdg-jboss8:
    Type:       ConfigMap (a volume populated by a ConfigMap)
    Name:       jboss-config-sihdg-jboss8
    Optional:   false
   java-config-sihdg-jboss8:
    Type:       ConfigMap (a volume populated by a ConfigMap)
    Name:       java-config-sihdg-jboss8
    Optional:   false

-sh-4.2$
