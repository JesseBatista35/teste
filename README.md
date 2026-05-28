apiVersion: apps/v1
kind: Deployment
metadata:
  annotations:
    deployment.kubernetes.io/revision: '3'
    kubectl.kubernetes.io/last-applied-configuration: >
      {"apiVersion":"apps/v1","kind":"Deployment","metadata":{"annotations":{},"labels":{"app.kubernetes.io/app":"sigec-opf-des","app.kubernetes.io/instance":"sigec-opf-des","app.kubernetes.io/managed-by":"Helm","app.kubernetes.io/name":"sigec-opf-des","app.kubernetes.io/version":"1.16.0","appName":"sigec-opf","backstage.io/kubernetes-id":"sigec-opf","helm.sh/chart":"caixa-base-chart-1.1.8"},"name":"sigec-opf-des","namespace":"sigec-opf"},"spec":{"revisionHistoryLimit":5,"selector":{"matchLabels":{"app.kubernetes.io/instance":"sigec-opf-des","app.kubernetes.io/name":"sigec-opf-des"}},"strategy":{"rollingUpdate":{"maxSurge":"25%","maxUnavailable":"50%"},"type":"RollingUpdate"},"template":{"metadata":{"labels":{"app.kubernetes.io/app":"sigec-opf-des","app.kubernetes.io/instance":"sigec-opf-des","app.kubernetes.io/managed-by":"Helm","app.kubernetes.io/name":"sigec-opf-des","app.kubernetes.io/version":"1.16.0","appName":"sigec-opf","backstage.io/kubernetes-id":"sigec-opf","helm.sh/chart":"caixa-base-chart-1.1.8"}},"spec":{"containers":[{"env":[{"name":"API_KEY","value":"akvs-api-sigec-opf@azurekeyvault"},{"name":"SPRING__DATASOURCE__PASSWORD","value":"akvs-jdbc-sql-authentication2@azurekeyvault"},{"name":"apim-key","value":"akvs-api-des-caixa@azurekeyvault"},{"name":"login_key","value":"akvs-login-des-caixa@azurekeyvault"}],"envFrom":[{"configMapRef":{"name":"cm-sigec-opf"}}],"image":"acrcentralcaixanprd.azurecr.io/sigec/opf/sigec-opf:26597911912","imagePullPolicy":"Always","livenessProbe":{"failureThreshold":10,"httpGet":{"path":"/sigec-opf-api/actuator/health/liveness","port":8080},"initialDelaySeconds":30,"periodSeconds":15,"successThreshold":1},"name":"sigec-opf-des","ports":[{"containerPort":8080,"name":"port","protocol":"TCP"}],"readinessProbe":{"failureThreshold":3,"httpGet":{"path":"/sigec-opf-api/actuator/health/readiness","port":8080},"initialDelaySeconds":15,"periodSeconds":15,"successThreshold":1},"resources":{"limits":{"cpu":"750m","memory":"1536Mi"},"requests":{"cpu":"250m","memory":"768Mi"}}}],"tolerations":[{"effect":"NoSchedule","key":"kubernetes.azure.com/scalesetpriority","operator":"Equal","value":"spot"}]}}}}
  creationTimestamp: '2026-05-28T16:49:23Z'
  generation: 4
  labels:
    app.kubernetes.io/app: sigec-opf-des
    app.kubernetes.io/instance: sigec-opf-des
    app.kubernetes.io/managed-by: Helm
    app.kubernetes.io/name: sigec-opf-des
    app.kubernetes.io/version: 1.16.0
    appName: sigec-opf
    backstage.io/kubernetes-id: sigec-opf
    helm.sh/chart: caixa-base-chart-1.1.8
  name: sigec-opf-des
  namespace: sigec-opf
  resourceVersion: '190293390'
  uid: 2b8baca2-06cf-4c99-b125-c5076a367f26
spec:
  progressDeadlineSeconds: 600
  replicas: 1
  revisionHistoryLimit: 5
  selector:
    matchLabels:
      app.kubernetes.io/instance: sigec-opf-des
      app.kubernetes.io/name: sigec-opf-des
  strategy:
    rollingUpdate:
      maxSurge: 25%
      maxUnavailable: 50%
    type: RollingUpdate
  template:
    metadata:
      labels:
        app.kubernetes.io/app: sigec-opf-des
        app.kubernetes.io/instance: sigec-opf-des
        app.kubernetes.io/managed-by: Helm
        app.kubernetes.io/name: sigec-opf-des
        app.kubernetes.io/version: 1.16.0
        appName: sigec-opf
        backstage.io/kubernetes-id: sigec-opf
        helm.sh/chart: caixa-base-chart-1.1.8
    spec:
      containers:
        - env:
            - name: API_KEY
              value: akvs-api-sigec-opf@azurekeyvault
            - name: SPRING__DATASOURCE__PASSWORD
              value: akvs-jdbc-sql-authentication2@azurekeyvault
            - name: apim-key
              value: akvs-api-des-caixa@azurekeyvault
            - name: login_key
              value: akvs-login-des-caixa@azurekeyvault
          envFrom:
            - configMapRef:
                name: cm-sigec-opf
          image: acrcentralcaixanprd.azurecr.io/sigec/opf/sigec-opf:26597911912
          imagePullPolicy: Always
          livenessProbe:
            failureThreshold: 10
            httpGet:
              path: /sigec-opf-api/actuator/health/liveness
              port: 8080
              scheme: HTTP
            initialDelaySeconds: 30
            periodSeconds: 15
            successThreshold: 1
            timeoutSeconds: 1
          name: sigec-opf-des
          ports:
            - containerPort: 8080
              name: port
              protocol: TCP
          readinessProbe:
            failureThreshold: 3
            httpGet:
              path: /sigec-opf-api/actuator/health/readiness
              port: 8080
              scheme: HTTP
            initialDelaySeconds: 15
            periodSeconds: 15
            successThreshold: 1
            timeoutSeconds: 1
          resources:
            limits:
              cpu: 750m
              memory: 1536Mi
            requests:
              cpu: 250m
              memory: 768Mi
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
status:
  conditions:
    - lastTransitionTime: '2026-05-28T16:49:23Z'
      lastUpdateTime: '2026-05-28T16:49:23Z'
      message: Deployment does not have minimum availability.
      reason: MinimumReplicasUnavailable
      status: 'False'
      type: Available
    - lastTransitionTime: '2026-05-28T19:56:57Z'
      lastUpdateTime: '2026-05-28T19:56:57Z'
      message: ReplicaSet "sigec-opf-des-d994765f5" has timed out progressing.
      reason: ProgressDeadlineExceeded
      status: 'False'
      type: Progressing
  observedGeneration: 4
  replicas: 2
  unavailableReplicas: 2
  updatedReplicas: 1
