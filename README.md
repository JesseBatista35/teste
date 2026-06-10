
Argo
v2.14.21+206a6ee
Argo
Applications
Settings
User Info
Documentation
Resource filters
NAME
NAME
KINDS
KINDS
SYNC STATUS
Synced
6
OutOfSync
0
HEALTH STATUS
Progressing
4
Suspended
0
Healthy
2
Degraded
1
Missing
0
Unknown
0
NAMESPACES
NAMESPACES
Applications
 siiga-frontend-mfe-gestao-canais-tqs
Application Details List
Log out
APP HEALTH 
 Degraded
SYNC STATUS 

 Synced
to HEAD (3990bee)
Auto sync is enabled.
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #49 from caixagithub/update-image-siiga-front
LAST SYNC 

 Sync OK
to 3990bee
Succeeded a minute ago (Wed Jun 10 2026 14:32:26 GMT-0300)
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #49 from caixagithub/update-image-siiga-front
Previous12Next
Items per page: 10 
NAME
GROUP/KIND
SYNC ORDER
NAMESPACE
CREATED AT
STATUS
Pod
pod
siiga-frontend-mfe-gestao-canais-tqs-5479d54696-sgmkp
Pod
-
siiga-frontend-mfe-gestao-canais
4 hours ago   06/10/26
 Progressing  
ReplicaSet
rs
siiga-frontend-mfe-gestao-canais-tqs-5479d54696
apps/ReplicaSet
-
siiga-frontend-mfe-gestao-canais
4 hours ago   06/10/26
 Progressing  
Pod
pod
siiga-frontend-mfe-gestao-canais-tqs-8554f68d68-tm2h9
Pod
-
siiga-frontend-mfe-gestao-canais
4 hours ago   06/10/26
 Progressing  
Secret
secret
akv2k8s-siiga-frontend-mfe-gestao-canais-tqs
Secret
-
siiga-frontend-mfe-gestao-canais
8 days ago   06/02/26
Endpoints
ep
siiga-frontend-mfe-gestao-canais-tqs
Endpoints
-
siiga-frontend-mfe-gestao-canais
8 days ago   06/02/26
Service
svc
siiga-frontend-mfe-gestao-canais-tqs
Service
-
siiga-frontend-mfe-gestao-canais
8 days ago   06/02/26
 Healthy   Synced
Deployment
deploy
siiga-frontend-mfe-gestao-canais-tqs
apps/Deployment
-
siiga-frontend-mfe-gestao-canais
8 days ago   06/02/26
 Degraded   Synced
ReplicaSet
rs
siiga-frontend-mfe-gestao-canais-tqs-5bf4c47dc7
apps/ReplicaSet
-
siiga-frontend-mfe-gestao-canais
8 days ago   06/02/26
 Healthy  
Secret
secret
akvs-siiga-frontend-gestao-canais-des-caixa-ssl-certificate
Secret
-
aks-istio-ingress
8 days ago   06/02/26
ConfigMap
cm
cm-siiga-frontend-mfe-gestao-canais
ConfigMap
-
siiga-frontend-mfe-gestao-canais
8 days ago   06/02/26
 Synced
Previous12Next
Items per page: 10 


apiVersion: apps/v1
kind: Deployment
metadata:
  annotations:
    deployment.kubernetes.io/revision: '3'
    kubectl.kubernetes.io/last-applied-configuration: >
      {"apiVersion":"apps/v1","kind":"Deployment","metadata":{"annotations":{},"labels":{"app.kubernetes.io/app":"siiga-frontend-mfe-gestao-canais-tqs","app.kubernetes.io/instance":"siiga-frontend-mfe-gestao-canais-tqs","app.kubernetes.io/managed-by":"Helm","app.kubernetes.io/name":"siiga-frontend-mfe-gestao-canais-tqs","app.kubernetes.io/version":"1.16.0","appName":"siiga-frontend-mfe-gestao-canais","backstage.io/kubernetes-id":"siiga-frontend-mfe-gestao-canais","helm.sh/chart":"caixa-base-chart-1.1.9"},"name":"siiga-frontend-mfe-gestao-canais-tqs","namespace":"siiga-frontend-mfe-gestao-canais"},"spec":{"replicas":1,"revisionHistoryLimit":5,"selector":{"matchLabels":{"app.kubernetes.io/instance":"siiga-frontend-mfe-gestao-canais-tqs","app.kubernetes.io/name":"siiga-frontend-mfe-gestao-canais-tqs"}},"strategy":{"rollingUpdate":{"maxSurge":"25%","maxUnavailable":"50%"},"type":"RollingUpdate"},"template":{"metadata":{"labels":{"app.kubernetes.io/app":"siiga-frontend-mfe-gestao-canais-tqs","app.kubernetes.io/instance":"siiga-frontend-mfe-gestao-canais-tqs","app.kubernetes.io/managed-by":"Helm","app.kubernetes.io/name":"siiga-frontend-mfe-gestao-canais-tqs","app.kubernetes.io/version":"1.16.0","appName":"siiga-frontend-mfe-gestao-canais","backstage.io/kubernetes-id":"siiga-frontend-mfe-gestao-canais","helm.sh/chart":"caixa-base-chart-1.1.9"}},"spec":{"containers":[{"envFrom":[{"configMapRef":{"name":"cm-siiga-frontend-mfe-gestao-canais"}}],"image":"acrcentralcaixanprd.azurecr.io/siiga/frontend-mfe-gestao-canais/siiga-frontend-mfe-gestao-canais:27280464913","imagePullPolicy":"Always","name":"siiga-frontend-mfe-gestao-canais-tqs","ports":[{"containerPort":8080,"name":"port","protocol":"TCP"}],"resources":{"limits":{"cpu":"500m","memory":"512Mi"},"requests":{"cpu":"250m","memory":"256Mi"}}}],"tolerations":[{"effect":"NoSchedule","key":"kubernetes.azure.com/scalesetpriority","operator":"Equal","value":"spot"},{"effect":"NoSchedule","key":"nuvem.caixa/nodepoolname","operator":"Equal","value":""}]}}}}
  creationTimestamp: '2026-06-02T21:33:09Z'
  generation: 3
  labels:
    app.kubernetes.io/app: siiga-frontend-mfe-gestao-canais-tqs
    app.kubernetes.io/instance: siiga-frontend-mfe-gestao-canais-tqs
    app.kubernetes.io/managed-by: Helm
    app.kubernetes.io/name: siiga-frontend-mfe-gestao-canais-tqs
    app.kubernetes.io/version: 1.16.0
    appName: siiga-frontend-mfe-gestao-canais
    backstage.io/kubernetes-id: siiga-frontend-mfe-gestao-canais
    helm.sh/chart: caixa-base-chart-1.1.9
  name: siiga-frontend-mfe-gestao-canais-tqs
  namespace: siiga-frontend-mfe-gestao-canais
  resourceVersion: '89862361'
  uid: 8043a8f7-70c6-4833-a654-1db775448830
spec:
  progressDeadlineSeconds: 600
  replicas: 1
  revisionHistoryLimit: 5
  selector:
    matchLabels:
      app.kubernetes.io/instance: siiga-frontend-mfe-gestao-canais-tqs
      app.kubernetes.io/name: siiga-frontend-mfe-gestao-canais-tqs
  strategy:
    rollingUpdate:
      maxSurge: 25%
      maxUnavailable: 50%
    type: RollingUpdate
  template:
    metadata:
      creationTimestamp: null
      labels:
        app.kubernetes.io/app: siiga-frontend-mfe-gestao-canais-tqs
        app.kubernetes.io/instance: siiga-frontend-mfe-gestao-canais-tqs
        app.kubernetes.io/managed-by: Helm
        app.kubernetes.io/name: siiga-frontend-mfe-gestao-canais-tqs
        app.kubernetes.io/version: 1.16.0
        appName: siiga-frontend-mfe-gestao-canais
        backstage.io/kubernetes-id: siiga-frontend-mfe-gestao-canais
        helm.sh/chart: caixa-base-chart-1.1.9
    spec:
      containers:
        - envFrom:
            - configMapRef:
                name: cm-siiga-frontend-mfe-gestao-canais
          image: >-
            acrcentralcaixanprd.azurecr.io/siiga/frontend-mfe-gestao-canais/siiga-frontend-mfe-gestao-canais:27280464913
          imagePullPolicy: Always
          name: siiga-frontend-mfe-gestao-canais-tqs
          ports:
            - containerPort: 8080
              name: port
              protocol: TCP
          resources:
            limits:
              cpu: 500m
              memory: 512Mi
            requests:
              cpu: 250m
              memory: 256Mi
          terminationMessagePath: /dev/termination-log
          terminationMessagePolicy: File
      dnsPolicy: ClusterFirst
      restartPolicy: Always
      schedulerName: default-scheduler
      securityContext: {}
      terminationGracePeriodSeconds: 30
      tolerations:
        - effect: NoSchedule
          key: kubernetes.azure.com/scalesetpriority
          operator: Equal
          value: spot
        - effect: NoSchedule
          key: nuvem.caixa/nodepoolname
          operator: Equal
status:
  conditions:
    - lastTransitionTime: '2026-06-02T21:33:10Z'
      lastUpdateTime: '2026-06-02T21:33:10Z'
      message: Deployment does not have minimum availability.
      reason: MinimumReplicasUnavailable
      status: 'False'
      type: Available
    - lastTransitionTime: '2026-06-10T13:56:03Z'
      lastUpdateTime: '2026-06-10T13:56:03Z'
      message: >-
        ReplicaSet "siiga-frontend-mfe-gestao-canais-tqs-5479d54696" has timed
        out progressing.
      reason: ProgressDeadlineExceeded
      status: 'False'
      type: Progressing
  observedGeneration: 3
  replicas: 2
  unavailableReplicas: 2
  updatedReplicas: 1


