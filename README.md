me ajuda a corgiri esse prblema, ele ja subiu uma vez porem agora o pod so vem o de deploy naoaparece o da aplicação.

estamos toamdno esse erro na ro deploy azureDevops:


2026-06-10T17:22:40.2758754Z ##[section]Starting: Verificando Status do Deployment
2026-06-10T17:22:40.2762508Z ==============================================================================
2026-06-10T17:22:40.2762670Z Task         : Bash
2026-06-10T17:22:40.2762733Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-10T17:22:40.2762832Z Version      : 3.227.0
2026-06-10T17:22:40.2763040Z Author       : Microsoft Corporation
2026-06-10T17:22:40.2763114Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-10T17:22:40.2763216Z ==============================================================================
2026-06-10T17:22:40.4320555Z Generating script.
2026-06-10T17:22:40.4331325Z ========================== Starting Command Output ===========================
2026-06-10T17:22:40.4338578Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/694c03e1-2eab-47fb-b01a-cf2a01fc4652.sh
2026-06-10T17:22:40.6842498Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-06-10T17:22:42.3787497Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-06-10T17:28:47.7862676Z ##[error]The task has timed out.
2026-06-10T17:28:47.7864378Z ##[section]Finishing: Verificando Status do Deployment


log do pod que esta rodando: 


38411 lines
[10/Jun/2026:04:25:55 -0300] 25.3.36.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1781076355.573 request_time 0.000 200 76901 - kube-probe/1.25 -
[10/Jun/2026:04:25:55 -0300] 25.3.36.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1781076355.573 request_time 0.000 200 76901 - kube-probe/1.25 -
[10/Jun/2026:04:26:05 -0300] 25.3.36.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1781076365.573 request_time 0.000 200 76901 - kube-probe/1.25 -
[10/Jun/2026:04:26:05 -0300] 25.3.36.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1781076365.573 request_time 0.000 200 76901 - kube-probe/1.25 -
[10/Jun/2026:04:26:15 -0300] 25.3.36.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1781076375.573 request_time 0.000 200 76901 - kube-probe/1.25 -
[10/Jun/2026:04:26:15 -0300] 25.3.36.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1781076375.573 request_time 0.000 200 76901 - kube-probe/1.25 -


porem novos pod quebram e nao sobe ao deploy

OKD


Jesse Mouta Pereira Batista

Administrator
Home
Overview
Projects
Search
API Explorer
Events
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
Storage
Builds
Observe
Compute
User Management
Administration

Project: sicia-tqs
Pods

Filter

Name
fron
/
Name
fron

Name

Status

Ready

Restarts

Owner

Memory

CPU

Created
Pod
P
sicia-frontend-tqs-1-cx2cm
Running
2/2	0	
ReplicationController
RC
sicia-frontend-tqs-1
34,1 MiB	0,000 cores	
26 de mai. de 2026, 14:34

Pod
P
sicia-frontend-tqs-1-deploy
Completed
0/1	0	
ReplicationController
RC
sicia-frontend-tqs-1
-	-	
26 de mai. de 2026, 14:34

Pod
P
sicia-frontend-tqs-10-deploy
Running
1/1	0	
ReplicationController
RC
sicia-frontend-tqs-10
19,7 MiB	0,001 cores	
12 de jun. de 2026, 09:39





kind: DeploymentConfig
apiVersion: apps.openshift.io/v1
metadata:
  annotations:
    description: Defines how to deploy the application server
  resourceVersion: '2013004164'
  name: sicia-frontend-tqs
  uid: b54ee2ee-9e3f-4f6e-89b9-9474a5b9dd29
  creationTimestamp: '2026-05-26T17:34:27Z'
  generation: 19
  managedFields:
    - manager: kubectl-create
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-05-26T17:34:27Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:metadata':
          'f:annotations':
            .: {}
            'f:description': {}
          'f:labels':
            .: {}
            'f:app': {}
            'f:application': {}
            'f:template': {}
        'f:spec':
          'f:replicas': {}
          'f:revisionHistoryLimit': {}
          'f:selector':
            .: {}
            'f:name': {}
          'f:strategy':
            'f:activeDeadlineSeconds': {}
            'f:rollingParams':
              .: {}
              'f:intervalSeconds': {}
              'f:maxSurge': {}
              'f:maxUnavailable': {}
              'f:timeoutSeconds': {}
              'f:updatePeriodSeconds': {}
            'f:type': {}
          'f:template':
            .: {}
            'f:metadata':
              .: {}
              'f:creationTimestamp': {}
              'f:labels':
                .: {}
                'f:app': {}
                'f:name': {}
              'f:name': {}
            'f:spec':
              .: {}
              'f:containers':
                .: {}
                'k:{"name":"sicia-frontend-tqs"}':
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
                    .: {}
                    'k:{"name":"TZ"}':
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
                'k:{"name":"sicia-frontend-tqs-exporter"}':
                  .: {}
                  'f:imagePullPolicy': {}
                  'f:name': {}
                  'f:ports':
                    .: {}
                    'k:{"containerPort":9113,"protocol":"TCP"}':
                      .: {}
                      'f:containerPort': {}
                      'f:protocol': {}
                  'f:resources': {}
                  'f:terminationMessagePath': {}
                  'f:terminationMessagePolicy': {}
              'f:dnsPolicy': {}
              'f:restartPolicy': {}
              'f:schedulerName': {}
              'f:securityContext': {}
              'f:terminationGracePeriodSeconds': {}
          'f:triggers': {}
    - manager: kubectl-patch
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-05-26T17:34:31Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:metadata':
          'f:labels':
            'f:CGC_DES': {}
            'f:CGC_OPS': {}
        'f:spec':
          'f:template':
            'f:metadata':
              'f:labels':
                'f:CGC_DES': {}
                'f:CGC_OPS': {}
            'f:spec':
              'f:imagePullSecrets':
                .: {}
                'k:{"name":"registry-secret"}': {}
    - manager: kubectl-set
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-06-10T17:45:59Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:spec':
          'f:template':
            'f:spec':
              'f:containers':
                'k:{"name":"sicia-frontend-tqs"}':
                  'f:image': {}
                  'f:volumeMounts':
                    .: {}
                    'k:{"mountPath":"/opt/app-root/etc/nginx.default.d/sicia-nginx.conf"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
                      'f:subPath': {}
                'k:{"name":"sicia-frontend-tqs-exporter"}':
                  'f:image': {}
                  'f:volumeMounts':
                    .: {}
                    'k:{"mountPath":"/opt/app-root/etc/nginx.default.d/sicia-nginx.conf"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
                      'f:subPath': {}
              'f:volumes':
                .: {}
                'k:{"name":"nginx-conf-d-sicia-frontend"}':
                  .: {}
                  'f:configMap':
                    .: {}
                    'f:defaultMode': {}
                    'f:name': {}
                  'f:name': {}
    - manager: openshift-controller-manager
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-06-12T12:39:43Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:status':
          'f:availableReplicas': {}
          'f:conditions':
            .: {}
            'k:{"type":"Available"}':
              .: {}
              'f:lastTransitionTime': {}
              'f:lastUpdateTime': {}
              'f:message': {}
              'f:status': {}
              'f:type': {}
            'k:{"type":"Progressing"}':
              .: {}
              'f:lastTransitionTime': {}
              'f:lastUpdateTime': {}
              'f:message': {}
              'f:status': {}
              'f:type': {}
          'f:observedGeneration': {}
          'f:readyReplicas': {}
          'f:replicas': {}
          'f:unavailableReplicas': {}
          'f:updatedReplicas': {}
      subresource: status
  namespace: sicia-tqs
  labels:
    CGC_DES: '7390'
    CGC_OPS: '7259'
    app: sicia-frontend-tqs
    application: sicia-frontend-tqs
    template: angular-caixa-release
spec:
  strategy:
    type: Rolling
    rollingParams:
      updatePeriodSeconds: 1
      intervalSeconds: 1
      timeoutSeconds: 600
      maxUnavailable: 25%
      maxSurge: 25%
    resources: {}
    activeDeadlineSeconds: 21600
  triggers: []
  replicas: 1
  revisionHistoryLimit: 1
  test: false
  selector:
    name: sicia-frontend-tqs
  template:
    metadata:
      name: sicia-frontend-tqs
      creationTimestamp: null
      labels:
        CGC_DES: '7390'
        CGC_OPS: '7259'
        app: sicia-frontend-tqs
        name: sicia-frontend-tqs
    spec:
      volumes:
        - name: nginx-conf-d-sicia-frontend
          configMap:
            name: nginx-conf-d-sicia-frontend
            defaultMode: 420
      containers:
        - resources:
            limits:
              cpu: 500m
              memory: 512Mi
            requests:
              cpu: 500m
              memory: 512Mi
          readinessProbe:
            httpGet:
              path: /
              port: 8080
              scheme: HTTP
            initialDelaySeconds: 25
            timeoutSeconds: 5
            periodSeconds: 10
            successThreshold: 1
            failureThreshold: 3
          terminationMessagePath: /dev/termination-log
          name: sicia-frontend-tqs
          livenessProbe:
            httpGet:
              path: /
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
          ports:
            - containerPort: 8080
              protocol: TCP
          imagePullPolicy: Always
          volumeMounts:
            - name: nginx-conf-d-sicia-frontend
              mountPath: /opt/app-root/etc/nginx.default.d/sicia-nginx.conf
              subPath: sicia-nginx.conf
          terminationMessagePolicy: File
          image: >-
            default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicia-frontend:1.0.78.5
        - name: sicia-frontend-tqs-exporter
          image: >-
            default-route-openshift-image-registry.apps.produtos4.caixa/openshift/nginx-prometheus-exporter
          ports:
            - containerPort: 9113
              protocol: TCP
          resources: {}
          volumeMounts:
            - name: nginx-conf-d-sicia-frontend
              mountPath: /opt/app-root/etc/nginx.default.d/sicia-nginx.conf
              subPath: sicia-nginx.conf
          terminationMessagePath: /dev/termination-log
          terminationMessagePolicy: File
          imagePullPolicy: Always
      restartPolicy: Always
      terminationGracePeriodSeconds: 30
      dnsPolicy: ClusterFirst
      securityContext: {}
      imagePullSecrets:
        - name: registry-secret
      schedulerName: default-scheduler
status:
  observedGeneration: 19
  details:
    message: manual change
    causes:
      - type: Manual
  availableReplicas: 1
  unavailableReplicas: 1
  latestVersion: 10
  updatedReplicas: 0
  conditions:
    - type: Available
      status: 'True'
      lastUpdateTime: '2026-05-26T17:35:25Z'
      lastTransitionTime: '2026-05-26T17:35:25Z'
      message: Deployment config has minimum availability.
    - type: Progressing
      status: Unknown
      lastUpdateTime: '2026-06-12T12:39:39Z'
      lastTransitionTime: '2026-06-12T12:39:39Z'
      message: >-
        replication controller "sicia-frontend-tqs-10" is waiting for pod
        "sicia-frontend-tqs-10-deploy" to run
  replicas: 1
  readyReplicas: 1
