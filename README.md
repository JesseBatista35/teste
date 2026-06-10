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
sicim-backend-intranet-des-5-bt5lt
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
Showing 11 events
Older events are not stored.
PodPsicim-backend-intranet-des-5-bt5lt
NamespaceNSsicim-des
10 de jun. de 2026, 17:42
Generated from kubelet on ceadecldlx070.nprd.caixa
Readiness probe failed: Get "http://25.0.35.220:8080/q/health/ready": dial tcp 25.0.35.220:8080: connect: connection refused
PodPsicim-backend-intranet-des-5-bt5lt
NamespaceNSsicim-des
10 de jun. de 2026, 17:42
Generated from kubelet on ceadecldlx070.nprd.caixa
Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicim-backend-intranet:20260610.1738-1.0.0.1-SNAPSHOT" in 63.567917ms (63.57601ms including waiting)
PodPsicim-backend-intranet-des-5-bt5lt
NamespaceNSsicim-des
10 de jun. de 2026, 17:42
Generated from kubelet on ceadecldlx070.nprd.caixa
6 times in the last 0 minutes
Readiness probe failed: HTTP probe failed with statuscode: 404
PodPsicim-backend-intranet-des-5-bt5lt
NamespaceNSsicim-des
10 de jun. de 2026, 17:42
Generated from kubelet on ceadecldlx070.nprd.caixa
2 times in the last 1 minute
Created container sicim-backend-intranet-des
PodPsicim-backend-intranet-des-5-bt5lt
NamespaceNSsicim-des
10 de jun. de 2026, 17:42
Generated from kubelet on ceadecldlx070.nprd.caixa
2 times in the last 1 minute
Started container sicim-backend-intranet-des
PodPsicim-backend-intranet-des-5-bt5lt
NamespaceNSsicim-des
10 de jun. de 2026, 17:42
Generated from kubelet on ceadecldlx070.nprd.caixa
2 times in the last 1 minute
Pulling image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicim-backend-intranet:20260610.1738-1.0.0.1-SNAPSHOT"
PodPsicim-backend-intranet-des-5-bt5lt
NamespaceNSsicim-des
10 de jun. de 2026, 17:42
Generated from kubelet on ceadecldlx070.nprd.caixa
Container sicim-backend-intranet-des failed liveness probe, will be restarted
PodPsicim-backend-intranet-des-5-bt5lt
NamespaceNSsicim-des
10 de jun. de 2026, 17:42
Generated from kubelet on ceadecldlx070.nprd.caixa
3 times in the last 0 minutes
Liveness probe failed: HTTP probe failed with statuscode: 404
PodPsicim-backend-intranet-des-5-bt5lt
NamespaceNSsicim-des
10 de jun. de 2026, 17:41
Generated from kubelet on ceadecldlx070.nprd.caixa
Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicim-backend-intranet:20260610.1738-1.0.0.1-SNAPSHOT" in 3.441311211s (3.441316837s including waiting)


rodei a build com as talreaçoe rodei a release


E ta assim ainda


o yaml:


kind: Pod
apiVersion: v1
metadata:
  generateName: sicim-backend-intranet-des-5-
  annotations:
    k8s.v1.cni.cncf.io/network-status: |-
      [{
          "name": "openshift-sdn",
          "interface": "eth0",
          "ips": [
              "25.0.35.220"
          ],
          "default": true,
          "dns": {}
      }]
    k8s.v1.cni.cncf.io/networks-status: |-
      [{
          "name": "openshift-sdn",
          "interface": "eth0",
          "ips": [
              "25.0.35.220"
          ],
          "default": true,
          "dns": {}
      }]
    openshift.io/deployment-config.latest-version: '5'
    openshift.io/deployment-config.name: sicim-backend-intranet-des
    openshift.io/deployment.name: sicim-backend-intranet-des-5
    openshift.io/scc: anyuid
  resourceVersion: '2009700270'
  name: sicim-backend-intranet-des-5-bt5lt
  uid: d46a1688-db43-4b76-9440-c298ea965550
  creationTimestamp: '2026-06-10T20:41:29Z'
  managedFields:
    - manager: kube-controller-manager
      operation: Update
      apiVersion: v1
      time: '2026-06-10T20:41:29Z'
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
            'k:{"uid":"9b6e9e33-4c26-4ddf-9e07-ca9ad820d839"}': {}
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
      time: '2026-06-10T20:41:31Z'
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
      time: '2026-06-10T20:42:40Z'
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
            'k:{"ip":"25.0.35.220"}':
              .: {}
              'f:ip': {}
          'f:startTime': {}
      subresource: status
  namespace: sicim-des
  ownerReferences:
    - apiVersion: v1
      kind: ReplicationController
      name: sicim-backend-intranet-des-5
      uid: 9b6e9e33-4c26-4ddf-9e07-ca9ad820d839
      controller: true
      blockOwnerDeletion: true
  labels:
    CGC_DES: '7390'
    CGC_OPS: '7259'
    app: sicim-backend-intranet-des
    deployment: sicim-backend-intranet-des-5
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
  nodeName: ceadecldlx070.nprd.caixa
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
        - name: SSO_CLIENT_SECRET
          valueFrom:
            secretKeyRef:
              name: sicim-backend-intranet-des
              key: SSO_CLIENT_SECRET
        - name: DATASOURCE_PASSWORD
          valueFrom:
            secretKeyRef:
              name: sicim-backend-intranet-des
              key: DATASOURCE_PASSWORD
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
        - name: kube-api-access-2j8bj
          readOnly: true
          mountPath: /var/run/secrets/kubernetes.io/serviceaccount
      terminationMessagePolicy: File
      image: >-
        default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicim-backend-intranet:20260610.1738-1.0.0.1-SNAPSHOT
  serviceAccount: default
  volumes:
    - name: caixa-truststore-acteste-nprd
      secret:
        secretName: caixa-truststore-acteste-nprd
        defaultMode: 420
    - name: kube-api-access-2j8bj
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
      lastTransitionTime: '2026-06-10T20:41:29Z'
    - type: Ready
      status: 'False'
      lastProbeTime: null
      lastTransitionTime: '2026-06-10T20:41:29Z'
      reason: ContainersNotReady
      message: 'containers with unready status: [sicim-backend-intranet-des]'
    - type: ContainersReady
      status: 'False'
      lastProbeTime: null
      lastTransitionTime: '2026-06-10T20:41:29Z'
      reason: ContainersNotReady
      message: 'containers with unready status: [sicim-backend-intranet-des]'
    - type: PodScheduled
      status: 'True'
      lastProbeTime: null
      lastTransitionTime: '2026-06-10T20:41:29Z'
  hostIP: 10.116.208.90
  podIP: 25.0.35.220
  podIPs:
    - ip: 25.0.35.220
  startTime: '2026-06-10T20:41:29Z'
  containerStatuses:
    - restartCount: 1
      started: true
      ready: false
      name: sicim-backend-intranet-des
      state:
        running:
          startedAt: '2026-06-10T20:42:39Z'
      imageID: >-
        default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicim-backend-intranet@sha256:444b7b6a23a1997a23c0d356bd27baf7afa7d4f059e539fba0cfcc6c9313c196
      image: >-
        default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicim-backend-intranet:20260610.1738-1.0.0.1-SNAPSHOT
      lastState:
        terminated:
          exitCode: 137
          reason: Error
          startedAt: '2026-06-10T20:41:34Z'
          finishedAt: '2026-06-10T20:42:39Z'
          containerID: >-
            cri-o://1e6e7e455cd7546ed858ae146c32352ea662b0cc9f4d1979ee383d080a793361
      containerID: 'cri-o://10ebb218829baa717aef4950acb291ec28db93f3532a88381ae12b00887e6231'
  qosClass: Guaranteed

