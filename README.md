
-sh-4.2$ oc logs siavl-enviomsgativa-microfront-des-3-deploy -n siavl-des
--> Scaling siavl-enviomsgativa-microfront-des-3 to 1
error: update acceptor rejected siavl-enviomsgativa-microfront-des-3: pods for rc 'siavl-des/siavl-enviomsgativa-microfront-des-3' took longer than 600 seconds to become available
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc siavl-enviomsgativa-microfront-des -n siavl-des -o yaml
apiVersion: apps.openshift.io/v1
kind: DeploymentConfig
metadata:
  annotations:
    description: Defines how to deploy the application server
  creationTimestamp: 2026-07-23T19:41:56Z
  generation: 20
  labels:
    CGC_DES: "7390"
    CGC_OPS: "7259"
    app: siavl-enviomsgativa-microfront-des
    application: siavl-enviomsgativa-microfront-des
    template: angular-caixa-release
  managedFields:
  - apiVersion: apps.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:metadata:
        f:annotations:
          .: {}
          f:description: {}
        f:labels:
          .: {}
          f:app: {}
          f:application: {}
          f:template: {}
      f:spec:
        f:replicas: {}
        f:revisionHistoryLimit: {}
        f:selector:
          .: {}
          f:name: {}
        f:strategy:
          f:activeDeadlineSeconds: {}
          f:rollingParams:
            .: {}
            f:intervalSeconds: {}
            f:maxSurge: {}
            f:maxUnavailable: {}
            f:timeoutSeconds: {}
            f:updatePeriodSeconds: {}
          f:type: {}
        f:template:
          .: {}
          f:metadata:
            .: {}
            f:creationTimestamp: {}
            f:labels:
              .: {}
              f:app: {}
              f:name: {}
            f:name: {}
          f:spec:
            .: {}
            f:containers:
              .: {}
              k:{"name":"siavl-enviomsgativa-microfront-des"}:
                .: {}
                f:env:
                  .: {}
                  k:{"name":"TZ"}:
                    .: {}
                    f:name: {}
                    f:value: {}
                f:imagePullPolicy: {}
                f:livenessProbe:
                  .: {}
                  f:failureThreshold: {}
                  f:httpGet:
                    .: {}
                    f:path: {}
                    f:port: {}
                    f:scheme: {}
                  f:initialDelaySeconds: {}
                  f:periodSeconds: {}
                  f:successThreshold: {}
                  f:timeoutSeconds: {}
                f:name: {}
                f:ports:
                  .: {}
                  k:{"containerPort":8080,"protocol":"TCP"}:
                    .: {}
                    f:containerPort: {}
                    f:protocol: {}
                f:readinessProbe:
                  .: {}
                  f:failureThreshold: {}
                  f:httpGet:
                    .: {}
                    f:path: {}
                    f:port: {}
                    f:scheme: {}
                  f:initialDelaySeconds: {}
                  f:periodSeconds: {}
                  f:successThreshold: {}
                  f:timeoutSeconds: {}
                f:resources:
                  .: {}
                  f:limits:
                    .: {}
                    f:cpu: {}
                    f:memory: {}
                  f:requests:
                    .: {}
                    f:cpu: {}
                    f:memory: {}
                f:terminationMessagePath: {}
                f:terminationMessagePolicy: {}
              k:{"name":"siavl-enviomsgativa-microfront-des-exporter"}:
                .: {}
                f:imagePullPolicy: {}
                f:name: {}
                f:ports:
                  .: {}
                  k:{"containerPort":9113,"protocol":"TCP"}:
                    .: {}
                    f:containerPort: {}
                    f:protocol: {}
                f:resources: {}
                f:terminationMessagePath: {}
                f:terminationMessagePolicy: {}
            f:dnsPolicy: {}
            f:restartPolicy: {}
            f:schedulerName: {}
            f:securityContext: {}
            f:terminationGracePeriodSeconds: {}
        f:triggers: {}
    manager: kubectl-create
    operation: Update
    time: 2026-07-23T19:41:56Z
  - apiVersion: apps.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:metadata:
        f:labels:
          f:CGC_DES: {}
          f:CGC_OPS: {}
      f:spec:
        f:template:
          f:metadata:
            f:labels:
              f:CGC_DES: {}
              f:CGC_OPS: {}
          f:spec:
            f:imagePullSecrets:
              .: {}
              k:{"name":"registry-secret"}: {}
    manager: kubectl-patch
    operation: Update
    time: 2026-07-23T19:58:36Z
  - apiVersion: apps.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:spec:
        f:template:
          f:spec:
            f:containers:
              k:{"name":"siavl-enviomsgativa-microfront-des"}:
                f:env:
                  k:{"name":"AMBIENTE"}:
                    .: {}
                    f:name: {}
                    f:value: {}
                  k:{"name":"CERT_REQUIRED"}:
                    .: {}
                    f:name: {}
                    f:value: {}
                f:image: {}
                f:volumeMounts:
                  .: {}
                  k:{"mountPath":"/opt/app-root/etc/nginx.default.d/siavl-nginx.conf"}:
                    .: {}
                    f:mountPath: {}
                    f:name: {}
                    f:subPath: {}
              k:{"name":"siavl-enviomsgativa-microfront-des-exporter"}:
                f:image: {}
                f:volumeMounts:
                  .: {}
                  k:{"mountPath":"/opt/app-root/etc/nginx.default.d/siavl-nginx.conf"}:
                    .: {}
                    f:mountPath: {}
                    f:name: {}
                    f:subPath: {}
            f:volumes:
              .: {}
              k:{"name":"nginx-conf-d-siavl-enviomsgativa-microfront"}:
                .: {}
                f:configMap:
                  .: {}
                  f:defaultMode: {}
                  f:name: {}
                f:name: {}
    manager: kubectl-set
    operation: Update
    time: 2026-07-24T16:52:29Z
  - apiVersion: apps.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:status:
        f:conditions:
          .: {}
          k:{"type":"Available"}:
            .: {}
            f:lastTransitionTime: {}
            f:lastUpdateTime: {}
            f:message: {}
            f:status: {}
            f:type: {}
          k:{"type":"Progressing"}:
            .: {}
            f:lastTransitionTime: {}
            f:lastUpdateTime: {}
            f:message: {}
            f:reason: {}
            f:status: {}
            f:type: {}
        f:observedGeneration: {}
        f:replicas: {}
        f:unavailableReplicas: {}
        f:updatedReplicas: {}
    manager: openshift-controller-manager
    operation: Update
    subresource: status
    time: 2026-07-24T17:02:56Z
  name: siavl-enviomsgativa-microfront-des
  namespace: siavl-des
  resourceVersion: "2098999823"
  uid: d92250c7-e108-488a-a7cf-858cb9bfe609
spec:
  replicas: 1
  revisionHistoryLimit: 1
  selector:
    name: siavl-enviomsgativa-microfront-des
  strategy:
    activeDeadlineSeconds: 21600
    resources: {}
    rollingParams:
      intervalSeconds: 1
      maxSurge: 25%
      maxUnavailable: 25%
      timeoutSeconds: 600
      updatePeriodSeconds: 1
    type: Rolling
  template:
    metadata:
      creationTimestamp: null
      labels:
        CGC_DES: "7390"
        CGC_OPS: "7259"
        app: siavl-enviomsgativa-microfront-des
        name: siavl-enviomsgativa-microfront-des
      name: siavl-enviomsgativa-microfront-des
    spec:
      containers:
      - env:
        - name: TZ
          value: America/Sao_Paulo
        - name: AMBIENTE
          value: des
        - name: CERT_REQUIRED
          value: "false"
        image: default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siavl-enviomsgativa-microfront:1.0.0-SNAPSHOT
        imagePullPolicy: Always
        livenessProbe:
          failureThreshold: 3
          httpGet:
            path: /
            port: 8080
            scheme: HTTP
          initialDelaySeconds: 15
          periodSeconds: 10
          successThreshold: 1
          timeoutSeconds: 3
        name: siavl-enviomsgativa-microfront-des
        ports:
        - containerPort: 8080
          protocol: TCP
        readinessProbe:
          failureThreshold: 3
          httpGet:
            path: /
            port: 8080
            scheme: HTTP
          initialDelaySeconds: 25
          periodSeconds: 10
          successThreshold: 1
          timeoutSeconds: 5
        resources:
          limits:
            cpu: 500m
            memory: 512Mi
          requests:
            cpu: 500m
            memory: 512Mi
        terminationMessagePath: /dev/termination-log
        terminationMessagePolicy: File
        volumeMounts:
        - mountPath: /opt/app-root/etc/nginx.default.d/siavl-nginx.conf
          name: nginx-conf-d-siavl-enviomsgativa-microfront
          subPath: siavl-nginx.conf
      - image: default-route-openshift-image-registry.apps.produtos4.caixa/openshift/nginx-prometheus-exporter
        imagePullPolicy: Always
        name: siavl-enviomsgativa-microfront-des-exporter
        ports:
        - containerPort: 9113
          protocol: TCP
        resources: {}
        terminationMessagePath: /dev/termination-log
        terminationMessagePolicy: File
        volumeMounts:
        - mountPath: /opt/app-root/etc/nginx.default.d/siavl-nginx.conf
          name: nginx-conf-d-siavl-enviomsgativa-microfront
          subPath: siavl-nginx.conf
      dnsPolicy: ClusterFirst
      imagePullSecrets:
      - name: registry-secret
      restartPolicy: Always
      schedulerName: default-scheduler
      securityContext: {}
      terminationGracePeriodSeconds: 30
      volumes:
      - configMap:
          defaultMode: 420
          name: nginx-conf-d-siavl-enviomsgativa-microfront
        name: nginx-conf-d-siavl-enviomsgativa-microfront
  test: false
  triggers: []
status:
  availableReplicas: 0
  conditions:
  - lastTransitionTime: 2026-07-23T19:41:56Z
    lastUpdateTime: 2026-07-23T19:41:56Z
    message: Deployment config does not have minimum availability.
    status: "False"
    type: Available
  - lastTransitionTime: 2026-07-24T17:02:56Z
    lastUpdateTime: 2026-07-24T17:02:56Z
    message: replication controller "siavl-enviomsgativa-microfront-des-3" has failed
      progressing
    reason: ProgressDeadlineExceeded
    status: "False"
    type: Progressing
  details:
    causes:
    - type: Manual
    message: manual change
  latestVersion: 3
  observedGeneration: 20
  replicas: 0
  unavailableReplicas: 0
  updatedReplicas: 0
-sh-4.2$
