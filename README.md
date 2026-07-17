-sh-4.2$ oc get dc sihdg-jboss8-des -n sihdg-des -o yaml | grep -B5 -A30 "initContainers\|command:\|args:\|lifecycle:"
                f:imagePullPolicy: {}
                f:livenessProbe:
                  .: {}
                  f:exec:
                    .: {}
                    f:command: {}
                  f:failureThreshold: {}
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
                  k:{"containerPort":8778,"protocol":"TCP"}:
                    .: {}
                    f:containerPort: {}
                    f:name: {}
                    f:protocol: {}
                f:readinessProbe:
                  .: {}
                  f:exec:
                    .: {}
                    f:command: {}
                  f:failureThreshold: {}
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
            f:dnsPolicy: {}
            f:restartPolicy: {}
            f:schedulerName: {}
            f:securityContext: {}
            f:terminationGracePeriodSeconds: {}
        f:triggers: {}
    manager: kubectl-create
    operation: Update
    time: 2026-07-10T16:31:06Z
  - apiVersion: apps.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:metadata:
--
          value: sihdguser
        image: default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sihdg-jboss8:3.12.0.7
        imagePullPolicy: Always
        livenessProbe:
          exec:
            command:
            - /bin/bash
            - -c
            - /opt/jboss/bin/livenessProbe.sh
          failureThreshold: 3
          initialDelaySeconds: 60
          periodSeconds: 10
          successThreshold: 1
          timeoutSeconds: 1
        name: sihdg-jboss8-des
        ports:
        - containerPort: 8778
          name: jmx
          protocol: TCP
        - containerPort: 8080
          protocol: TCP
        readinessProbe:
          exec:
            command:
            - /bin/bash
            - -c
            - /opt/jboss/bin/readinessProbe.sh
          failureThreshold: 3
          initialDelaySeconds: 60
          periodSeconds: 10
          successThreshold: 1
          timeoutSeconds: 1
        resources:
          limits:
            cpu: "1"
            memory: 2Gi
          requests:
            cpu: 10m
            memory: 2Gi
        terminationMessagePath: /dev/termination-log
        terminationMessagePolicy: File
        volumeMounts:
        - mountPath: /opt/server/standalone/configuration/standalone-okd.xml
          name: jboss-config-sihdg-jboss8
          subPath: standalone-okd.xml
        - mountPath: /opt/server/bin/standalone.conf
          name: java-config-sihdg-jboss8
          subPath: standalone.conf
      dnsPolicy: ClusterFirst
      imagePullSecrets:
      - name: registry-secret
      restartPolicy: Always
      schedulerName: default-scheduler
      securityContext: {}
-sh-4.2$ oc get dc sihdg-jboss8-des -n sihdg-des -o yaml | grep -B10 "standalone.xml"
-sh-4.2$
-sh-4.2$
-sh-4.2$
