nao iniciou acho que o outro analista fez alguma ateraçao bao ta funcionando

kind: Pod
apiVersion: v1
metadata:
  generateName: sicbc-backend-des-37-
  annotations:
    k8s.v1.cni.cncf.io/network-status: |-
      [{
          "name": "openshift-sdn",
          "interface": "eth0",
          "ips": [
              "25.2.29.251"
          ],
          "default": true,
          "dns": {}
      }]
    k8s.v1.cni.cncf.io/networks-status: |-
      [{
          "name": "openshift-sdn",
          "interface": "eth0",
          "ips": [
              "25.2.29.251"
          ],
          "default": true,
          "dns": {}
      }]
    openshift.io/deployment-config.latest-version: '37'
    openshift.io/deployment-config.name: sicbc-backend-des
    openshift.io/deployment.name: sicbc-backend-des-37
    openshift.io/scc: anyuid
  resourceVersion: '2005149278'
  name: sicbc-backend-des-37-nvjpd
  uid: 34bbd46e-4b9e-4c43-b479-c17f5bd4eeaa
  creationTimestamp: '2026-06-08T14:48:37Z'
  managedFields:
    - manager: kube-controller-manager
      operation: Update
      apiVersion: v1
      time: '2026-06-08T14:48:37Z'
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
            'k:{"uid":"10841801-3d0c-410f-921a-1eefed508dd7"}': {}
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
            'k:{"name":"sicbc-backend-des"}':
              'f:image': {}
              'f:startupProbe':
                .: {}
                'f:failureThreshold': {}
                'f:httpGet':
                  .: {}
                  'f:path': {}
                  'f:port': {}
                  'f:scheme': {}
                'f:periodSeconds': {}
                'f:successThreshold': {}
                'f:timeoutSeconds': {}
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
              'f:env':
                .: {}
                'k:{"name":"TZ"}':
                  .: {}
                  'f:name': {}
                  'f:value': {}
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
      time: '2026-06-08T14:48:39Z'
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
      time: '2026-06-08T14:50:28Z'
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
            'k:{"ip":"25.2.29.251"}':
              .: {}
              'f:ip': {}
          'f:startTime': {}
      subresource: status
  namespace: sicbc-des
  ownerReferences:
    - apiVersion: v1
      kind: ReplicationController
      name: sicbc-backend-des-37
      uid: 10841801-3d0c-410f-921a-1eefed508dd7
      controller: true
      blockOwnerDeletion: true
  labels:
    CGC_DES: '7390'
    CGC_OPS: '7259'
    app: sicbc-backend-des
    deployment: sicbc-backend-des-37
    deploymentconfig: sicbc-backend-des
    name: sicbc-backend-des
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
  nodeName: ceadecldlx059.nprd.caixa
  securityContext:
    seLinuxOptions:
      level: 's0:c97,c94'
  containers:
    - resources:
        limits:
          cpu: '2'
          memory: 2Gi
        requests:
          cpu: '1'
          memory: 1Gi
      terminationMessagePath: /dev/termination-log
      name: sicbc-backend-des
      env:
        - name: TZ
          value: America/Sao_Paulo
      securityContext:
        capabilities:
          drop:
            - MKNOD
      ports:
        - containerPort: 8080
          protocol: TCP
      imagePullPolicy: Always
      startupProbe:
        httpGet:
          path: /
          port: 8080
          scheme: HTTP
        timeoutSeconds: 30
        periodSeconds: 10
        successThreshold: 1
        failureThreshold: 3
      volumeMounts:
        - name: caixa-truststore-acteste-nprd
          mountPath: /deployments/caixa-truststore-acteste-nprd.jks
          subPath: caixa-truststore-acteste-nprd.jks
        - name: kube-api-access-bvslw
          readOnly: true
          mountPath: /var/run/secrets/kubernetes.io/serviceaccount
      terminationMessagePolicy: File
      image: >-
        default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicbc-backend:00.00.01.06
  serviceAccount: default
  volumes:
    - name: caixa-truststore-acteste-nprd
      secret:
        secretName: caixa-truststore-acteste-nprd
        defaultMode: 420
    - name: kube-api-access-bvslw
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
      lastTransitionTime: '2026-06-08T14:48:37Z'
    - type: Ready
      status: 'False'
      lastProbeTime: null
      lastTransitionTime: '2026-06-08T14:48:37Z'
      reason: ContainersNotReady
      message: 'containers with unready status: [sicbc-backend-des]'
    - type: ContainersReady
      status: 'False'
      lastProbeTime: null
      lastTransitionTime: '2026-06-08T14:48:37Z'
      reason: ContainersNotReady
      message: 'containers with unready status: [sicbc-backend-des]'
    - type: PodScheduled
      status: 'True'
      lastProbeTime: null
      lastTransitionTime: '2026-06-08T14:48:37Z'
  hostIP: 10.116.208.79
  podIP: 25.2.29.251
  podIPs:
    - ip: 25.2.29.251
  startTime: '2026-06-08T14:48:37Z'
  containerStatuses:
    - restartCount: 4
      started: false
      ready: false
      name: sicbc-backend-des
      state:
        waiting:
          reason: CrashLoopBackOff
          message: >-
            back-off 1m20s restarting failed container=sicbc-backend-des
            pod=sicbc-backend-des-37-nvjpd_sicbc-des(34bbd46e-4b9e-4c43-b479-c17f5bd4eeaa)
      imageID: >-
        default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicbc-backend@sha256:0971cfd106ab5ee8d0d9e50e21e9455a7d8bc11642ff4fda667e3512ab53b7f2
      image: >-
        default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicbc-backend:00.00.01.06
      lastState:
        terminated:
          exitCode: 1
          reason: Error
          startedAt: '2026-06-08T14:50:18Z'
          finishedAt: '2026-06-08T14:50:18Z'
          containerID: >-
            cri-o://a71258bfa7f5a9b739a01df2505262c3ab8fb7cc05fbcef7dc740e29479d96fb
      containerID: 'cri-o://a71258bfa7f5a9b739a01df2505262c3ab8fb7cc05fbcef7dc740e29479d96fb'
  qosClass: Burstable
