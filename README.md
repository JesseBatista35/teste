apos adicnoa nos eventos deu isso:


OKD


Jesse Mouta Pereira Batista

Administrator
Home
Operators
Workloads
Pods
Deployments
DeploymentConfigs
StatefulSets
Secrets
ConfigMaps
CronJobs
Jobs
DaemonSets
ReplicaSets
ReplicationControllers
HorizontalPodAutoscalers
PodDisruptionBudgets
Networking
Services
Routes
Ingresses
NetworkPolicies
Storage
PersistentVolumes
PersistentVolumeClaims
StorageClasses
VolumeSnapshots
VolumeSnapshotClasses
VolumeSnapshotContents
Builds
Observe
Compute
User Management
Administration

Project: sicim-des
Pods
Pod details
Pod
P
sicim-backend-intranet-des-3-txl5g
Running

Actions
Details
Metrics
YAML
Environment
Logs
Events
Terminal
Streaming events...
Showing 9 events
Older events are not stored.
PodPsicim-backend-intranet-des-3-txl5g
NamespaceNSsicim-des
10 de jun. de 2026, 17:26
Generated from kubelet on ceadecldlx030.nprd.caixa
4 times in the last 0 minutes
Readiness probe failed: HTTP probe failed with statuscode: 404
PodPsicim-backend-intranet-des-3-txl5g
NamespaceNSsicim-des
10 de jun. de 2026, 17:26
Generated from kubelet on ceadecldlx030.nprd.caixa
Container sicim-backend-intranet-des failed liveness probe, will be restarted
PodPsicim-backend-intranet-des-3-txl5g
NamespaceNSsicim-des
10 de jun. de 2026, 17:26
Generated from kubelet on ceadecldlx030.nprd.caixa
3 times in the last 0 minutes
Liveness probe failed: HTTP probe failed with statuscode: 404
PodPsicim-backend-intranet-des-3-txl5g
NamespaceNSsicim-des
10 de jun. de 2026, 17:26
Generated from kubelet on ceadecldlx030.nprd.caixa
Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicim-backend-intranet:20260610.0845-1.0.0.1-SNAPSHOT" in 3.322159056s (3.32216988s including waiting)
PodPsicim-backend-intranet-des-3-txl5g
NamespaceNSsicim-des
10 de jun. de 2026, 17:26
Generated from kubelet on ceadecldlx030.nprd.caixa
Created container sicim-backend-intranet-des
PodPsicim-backend-intranet-des-3-txl5g
NamespaceNSsicim-des
10 de jun. de 2026, 17:26
Generated from kubelet on ceadecldlx030.nprd.caixa
Started container sicim-backend-intranet-des
PodPsicim-backend-intranet-des-3-txl5g
NamespaceNSsicim-des
10 de jun. de 2026, 17:26
Generated from multus
Add eth0 [25.2.15.83/23] from openshift-sdn
PodPsicim-backend-intranet-des-3-txl5g
NamespaceNSsicim-des
10 de jun. de 2026, 17:26
Generated from kubelet on ceadecldlx030.nprd.caixa
Pulling image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicim-backend-intranet:20260610.0845-1.0.0.1-SNAPSHOT"
PodPsicim-backend-intranet-des-3-txl5g
NamespaceNSsicim-des
10 de jun. de 2026, 17:26
Generated from default-scheduler
Successfully assigned sicim-des/sicim-backend-intranet-des-3-txl5g to ceadecldlx030.nprd.caixa


o log ta assim/:



exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-06-10 17:27:19,015 INFO  [br.gov.caixa.arquitetura.config.AppConfig] (main) 
2026-06-10 17:27:19,017 INFO  [br.gov.caixa.arquitetura.config.AppConfig] (main)    _    _                     _   ____ ___    ******
2026-06-10 17:27:19,017 INFO  [br.gov.caixa.arquitetura.config.AppConfig] (main)   | \  / |_  __ _ __ ___     / \  |  _ \_ _|   ******
2026-06-10 17:27:19,018 INFO  [br.gov.caixa.arquitetura.config.AppConfig] (main)   |  \/  | |/ _\ '__/ _ \   / _ \ | |_) | |     ******
2026-06-10 17:27:19,018 INFO  [br.gov.caixa.arquitetura.config.AppConfig] (main)   |  __  | | |_  | | (_) | / ___ \|  __/| |     ******
2026-06-10 17:27:19,018 INFO  [br.gov.caixa.arquitetura.config.AppConfig] (main)   |_|  |_|_|\__/_|  \___/ /_/   \_\_|  |___|   ******
2026-06-10 17:27:19,018 INFO  [br.gov.caixa.arquitetura.config.AppConfig] (main)  ============================================ ******
2026-06-10 17:27:19,018 INFO  [br.gov.caixa.arquitetura.config.AppConfig] (main)    :: CEF-SICIM-INTRANET - v1.0.0.1 [prod] ::
2026-06-10 17:27:19,019 INFO  [br.gov.caixa.arquitetura.config.AppConfig] (main) 
2026-06-10 17:27:19,092 INFO  [io.quarkus.bootstrap.runner.Timing] (main) SICIM-INTRANET 1.0.0.1 on JVM (powered by Quarkus 3.33.1.1) started in 5.156s. Listening on: http://0.0.0.0:8080
2026-06-10 17:27:19,093 INFO  [io.quarkus.bootstrap.runner.Timing] (main) Profile prod activated. 
2026-06-10 17:27:19,093 INFO  [io.quarkus.bootstrap.runner.Timing] (main) Installed features: [agroal, cdi, hibernate-orm, hibernate-orm-panache, hibernate-validator, jdbc-oracle, mapstruct, narayana-jta, oidc, oidc-client, rest, rest-client, rest-client-jackson, rest-client-oidc-filter, rest-jackson, security, smallrye-context-propagation, smallrye-fault-tolerance, smallrye-health, vertx]




e o ymal ta assim:

kind: Pod
apiVersion: v1
metadata:
  generateName: sicim-backend-intranet-des-3-
  annotations:
    k8s.v1.cni.cncf.io/network-status: |-
      [{
          "name": "openshift-sdn",
          "interface": "eth0",
          "ips": [
              "25.2.15.83"
          ],
          "default": true,
          "dns": {}
      }]
    k8s.v1.cni.cncf.io/networks-status: |-
      [{
          "name": "openshift-sdn",
          "interface": "eth0",
          "ips": [
              "25.2.15.83"
          ],
          "default": true,
          "dns": {}
      }]
    openshift.io/deployment-config.latest-version: '3'
    openshift.io/deployment-config.name: sicim-backend-intranet-des
    openshift.io/deployment.name: sicim-backend-intranet-des-3
    openshift.io/scc: anyuid
  resourceVersion: '2009676875'
  name: sicim-backend-intranet-des-3-txl5g
  uid: 0b37ea25-651a-4104-8e47-b47356a6694c
  creationTimestamp: '2026-06-10T20:26:02Z'
  managedFields:
    - manager: kube-controller-manager
      operation: Update
      apiVersion: v1
      time: '2026-06-10T20:26:02Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:metadata':
          'f:annotations':
            .: {}
            'f:openshift.io/deployment-config.latest-version': {}
            'f:openshift.io/deployment-config.name': {}
            'f:openshift.io/deployment.name': {}
          'f:generateName': {}
          'f:labels':
            .: {}
            'f:CGC_DES': {}
            'f:CGC_OPS': {}
            'f:app': {}
            'f:deployment': {}
            'f:deploymentconfig': {}
            'f:name': {}
          'f:ownerReferences':
            .: {}
            'k:{"uid":"7a6041ac-b461-4d7e-9011-88101eb1ebd9"}': {}
        'f:spec':
          'f:volumes':
            .: {}
            'k:{"name":"caixa-truststore-acteste-nprd"}':
              .: {}
              'f:name': {}
              'f:secret':
                .: {}
                'f:defaultMode': {}
                'f:secretName': {}
          'f:containers':
            'k:{"name":"sicim-backend-intranet-des"}':
              'f:image': {}
              'f:volumeMounts':
                .: {}
                'k:{"mountPath":"/deployments/caixa-truststore-acteste-nprd.jks"}':
                  .: {}
                  'f:mountPath': {}
                  'f:name': {}
                  'f:subPath': {}
              'f:terminationMessagePolicy': {}
              .: {}
              'f:resources':
                .: {}
                'f:limits':
                  .: {}
                  'f:cpu': {}
                  'f:memory': {}
                'f:requests':
                  .: {}
                  'f:cpu': {}
                  'f:memory': {}
              'f:livenessProbe':
                .: {}
                'f:failureThreshold': {}
                'f:httpGet':
                  .: {}
                  'f:path': {}
                  'f:port': {}
                  'f:scheme': {}
                'f:initialDelaySeconds': {}
                'f:periodSeconds': {}
                'f:successThreshold': {}
                'f:timeoutSeconds': {}
              'f:env':
                'k:{"name":"DATASOURCE_USERNAME"}':
                  .: {}
                  'f:name': {}
                  'f:value': {}
                'k:{"name":"SSO_CLIENT_SECRET"}':
                  .: {}
                  'f:name': {}
                  'f:valueFrom':
                    .: {}
                    'f:secretKeyRef': {}
                'k:{"name":"DATASOURCE_PASSWORD"}':
                  .: {}
                  'f:name': {}
                  'f:valueFrom':
                    .: {}
                    'f:secretKeyRef': {}
                'k:{"name":"CORS_ALLOWED_ORIGINS"}':
                  .: {}
                  'f:name': {}
                  'f:value': {}
                'k:{"name":"TZ"}':
                  .: {}
                  'f:name': {}
                  'f:value': {}
                'k:{"name":"CLIENTID"}':
                  .: {}
                  'f:name': {}
                  'f:value': {}
                'k:{"name":"JAVA_OPTIONS_APPEND"}':
                  .: {}
                  'f:name': {}
                  'f:value': {}
                .: {}
                'k:{"name":"SSO_URL"}':
                  .: {}
                  'f:name': {}
                  'f:value': {}
                'k:{"name":"DATASOURCE_URL"}':
                  .: {}
                  'f:name': {}
                  'f:value': {}
              'f:readinessProbe':
                .: {}
                'f:failureThreshold': {}
                'f:httpGet':
                  .: {}
                  'f:path': {}
                  'f:port': {}
                  'f:scheme': {}
                'f:initialDelaySeconds': {}
                'f:periodSeconds': {}
                'f:successThreshold': {}
                'f:timeoutSeconds': {}
              'f:terminationMessagePath': {}
              'f:imagePullPolicy': {}
              'f:ports':
                .: {}
                'k:{"containerPort":8080,"protocol":"TCP"}':
                  .: {}
                  'f:containerPort': {}
                  'f:protocol': {}
              'f:name': {}
          'f:dnsPolicy': {}
          'f:restartPolicy': {}
          'f:schedulerName': {}
          'f:terminationGracePeriodSeconds': {}
          'f:imagePullSecrets':
            .: {}
            'k:{"name":"registry-secret"}': {}
          'f:enableServiceLinks': {}
          'f:securityContext': {}
    - manager: multus
      operation: Update
      apiVersion: v1
      time: '2026-06-10T20:26:05Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:metadata':
          'f:annotations':
            'f:k8s.v1.cni.cncf.io/network-status': {}
            'f:k8s.v1.cni.cncf.io/networks-status': {}
      subresource: status
    - manager: kubelet
      operation: Update
      apiVersion: v1
      time: '2026-06-10T20:27:13Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:status':
          'f:conditions':
            'k:{"type":"ContainersReady"}':
              .: {}
              'f:lastProbeTime': {}
              'f:lastTransitionTime': {}
              'f:message': {}
              'f:reason': {}
              'f:status': {}
              'f:type': {}
            'k:{"type":"Initialized"}':
              .: {}
              'f:lastProbeTime': {}
              'f:lastTransitionTime': {}
              'f:status': {}
              'f:type': {}
            'k:{"type":"Ready"}':
              .: {}
              'f:lastProbeTime': {}
              'f:lastTransitionTime': {}
              'f:message': {}
              'f:reason': {}
              'f:status': {}
              'f:type': {}
          'f:containerStatuses': {}
          'f:hostIP': {}
          'f:phase': {}
          'f:podIP': {}
          'f:podIPs':
            .: {}
            'k:{"ip":"25.2.15.83"}':
              .: {}
              'f:ip': {}
          'f:startTime': {}
      subresource: status
  namespace: sicim-des
  ownerReferences:
    - apiVersion: v1
      kind: ReplicationController
      name: sicim-backend-intranet-des-3
      uid: 7a6041ac-b461-4d7e-9011-88101eb1ebd9
      controller: true
      blockOwnerDeletion: true
  labels:
    CGC_DES: '7390'
    CGC_OPS: '7259'
    app: sicim-backend-intranet-des
    deployment: sicim-backend-intranet-des-3
    deploymentconfig: sicim-backend-intranet-des
    name: sicim-backend-intranet-des
spec:
  restartPolicy: Always
  serviceAccountName: default
  imagePullSecrets:
    - name: registry-secret
  priority: 0
  schedulerName: default-scheduler
  enableServiceLinks: true
  terminationGracePeriodSeconds: 30
  preemptionPolicy: PreemptLowerPriority
  nodeName: ceadecldlx030.nprd.caixa
  securityContext:
    seLinuxOptions:
      level: 's0:c98,c12'
  containers:
    - resources:
        limits:
          cpu: '1'
          memory: 1Gi
        requests:
          cpu: '1'
          memory: 1Gi
      readinessProbe:
        httpGet:
          path: /q/health/ready
          port: 8080
          scheme: HTTP
        initialDelaySeconds: 25
        timeoutSeconds: 5
        periodSeconds: 10
        successThreshold: 1
        failureThreshold: 3
      terminationMessagePath: /dev/termination-log
      name: sicim-backend-intranet-des
      livenessProbe:
        httpGet:
          path: /q/health/live
          port: 8080
          scheme: HTTP
        initialDelaySeconds: 15
        timeoutSeconds: 3
        periodSeconds: 10
        successThreshold: 1
        failureThreshold: 3
      env:
        - name: TZ
          value: America/Sao_Paulo
        - name: CLIENTID
          value: cli-ser-cim
        - name: CORS_ALLOWED_ORIGINS
          value: >-
            https://sicim-frontend-intranet-des.apps.nprd.caixa,http://localhost:4200
        - name: DATASOURCE_URL
          value: >-
            jdbc:oracle:thin:@CNPEXDADVM01-SCAN4.EXTRA.CAIXA.GOV.BR:1521/ORAD01NG
        - name: DATASOURCE_USERNAME
          value: SCIMDB01
        - name: JAVA_OPTIONS_APPEND
          value: >-
            -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks
        - name: SSO_URL
          value: 'https://login.des.caixa/auth/realms/intranet'
        - name: DATASOURCE_PASSWORD
          valueFrom:
            secretKeyRef:
              name: sicim-backend-intranet-des
              key: DATASOURCE_PASSWORD
        - name: SSO_CLIENT_SECRET
          valueFrom:
            secretKeyRef:
              name: sicim-backend-intranet-des
              key: SSO_CLIENT_SECRET
      securityContext:
        capabilities:
          drop:
            - MKNOD
      ports:
        - containerPort: 8080
          protocol: TCP
      imagePullPolicy: Always
      volumeMounts:
        - name: caixa-truststore-acteste-nprd
          mountPath: /deployments/caixa-truststore-acteste-nprd.jks
          subPath: caixa-truststore-acteste-nprd.jks
        - name: kube-api-access-kldzz
          readOnly: true
          mountPath: /var/run/secrets/kubernetes.io/serviceaccount
      terminationMessagePolicy: File
      image: >-
        default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicim-backend-intranet:20260610.0845-1.0.0.1-SNAPSHOT
  serviceAccount: default
  volumes:
    - name: caixa-truststore-acteste-nprd
      secret:
        secretName: caixa-truststore-acteste-nprd
        defaultMode: 420
    - name: kube-api-access-kldzz
      projected:
        sources:
          - serviceAccountToken:
              expirationSeconds: 3607
              path: token
          - configMap:
              name: kube-root-ca.crt
              items:
                - key: ca.crt
                  path: ca.crt
          - downwardAPI:
              items:
                - path: namespace
                  fieldRef:
                    apiVersion: v1
                    fieldPath: metadata.namespace
          - configMap:
              name: openshift-service-ca.crt
              items:
                - key: service-ca.crt
                  path: service-ca.crt
        defaultMode: 420
  dnsPolicy: ClusterFirst
  tolerations:
    - key: node.kubernetes.io/not-ready
      operator: Exists
      effect: NoExecute
      tolerationSeconds: 300
    - key: node.kubernetes.io/unreachable
      operator: Exists
      effect: NoExecute
      tolerationSeconds: 300
    - key: node.kubernetes.io/memory-pressure
      operator: Exists
      effect: NoSchedule
status:
  phase: Running
  conditions:
    - type: Initialized
      status: 'True'
      lastProbeTime: null
      lastTransitionTime: '2026-06-10T20:26:02Z'
    - type: Ready
      status: 'False'
      lastProbeTime: null
      lastTransitionTime: '2026-06-10T20:26:02Z'
      reason: ContainersNotReady
      message: 'containers with unready status: [sicim-backend-intranet-des]'
    - type: ContainersReady
      status: 'False'
      lastProbeTime: null
      lastTransitionTime: '2026-06-10T20:26:02Z'
      reason: ContainersNotReady
      message: 'containers with unready status: [sicim-backend-intranet-des]'
    - type: PodScheduled
      status: 'True'
      lastProbeTime: null
      lastTransitionTime: '2026-06-10T20:26:02Z'
  hostIP: 10.116.208.50
  podIP: 25.2.15.83
  podIPs:
    - ip: 25.2.15.83
  startTime: '2026-06-10T20:26:02Z'
  containerStatuses:
    - restartCount: 1
      started: true
      ready: false
      name: sicim-backend-intranet-des
      state:
        running:
          startedAt: '2026-06-10T20:27:13Z'
      imageID: >-
        default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicim-backend-intranet@sha256:4561761ad617e0147517059242d335c27f9f231d391f1ce898ebf4b85dded722
      image: >-
        default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicim-backend-intranet:20260610.0845-1.0.0.1-SNAPSHOT
      lastState:
        terminated:
          exitCode: 137
          reason: Error
          startedAt: '2026-06-10T20:26:08Z'
          finishedAt: '2026-06-10T20:27:13Z'
          containerID: >-
            cri-o://983fb05357f6d5668b0ed45a450341d456741e418849ed42191de091d2de943e
      containerID: 'cri-o://449418376b485e19fa0553d66d1180a2ec8fd5cb88605061239a937adbf8744b'
  qosClass: Guaranteed

