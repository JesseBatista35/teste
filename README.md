oc get deployment sispl-canal-processamento-pix-hmp -n sispl-hmp -o yaml | grep -B 2 -A 10 "livenessProbe\|readinessProbe"


oc get deployment sispl-canal-processamento-pix-hmp -n sispl-hmp -o jsonpath='{.spec.template.spec.containers[0].livenessProbe}'

oc get deployment sispl-canal-processamento-pix-hmp -n sispl-hmp -o jsonpath='{.spec.template.spec.containers[0].readinessProbe}'


oc logs sispl-canal-processamento-pix-hmp-6cf5c667dd-lvggt -n sispl-hmp | grep -i "vault\|unable to resolve\|VAULT::"


oc logs sispl-canal-processamento-pix-hmp-6cf5c667dd-lvggt -n sispl-hmp --previous | grep -E "WFLYSRV0049|WFLYSRV0025|Resuming server"

oc get events -n sispl-hmp --field-selector involvedObject.name=sispl-canal-processamento-pix-hmp-6cf5c667dd-lvggt --sort-by='.lastTimestamp'


-sh-4.2$
-sh-4.2$ oc get project sispl-hmp
NAME        DISPLAY NAME   STATUS
sispl-hmp                  Active
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get deployment sispl-canal-processamento-pix-hmp -n sispl-hmp -o yaml | grep -B 2 -A 10 "livenessProbe\|readinessProbe"
            f:containers:
              k:{"name":"sispl-canal-processamento-pix-hmp"}:
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
--
        image: default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispl-canal-processamento-pix:2.2.0.9
        imagePullPolicy: IfNotPresent
        livenessProbe:
          exec:
            command:
            - /bin/bash
            - -c
            - /opt/jboss/bin/livenessProbe.sh
          failureThreshold: 3
          initialDelaySeconds: 90
          periodSeconds: 10
          successThreshold: 1
          timeoutSeconds: 10
        name: sispl-canal-processamento-pix-hmp
        ports:
        - containerPort: 8080
          name: web
          protocol: TCP
--
          name: ajp
          protocol: TCP
        readinessProbe:
          exec:
            command:
            - /bin/bash
            - -c
            - /opt/jboss/bin/readinessProbe.sh
          failureThreshold: 3
          initialDelaySeconds: 90
          periodSeconds: 10
          successThreshold: 1
          timeoutSeconds: 10
        resources:
          limits:
            cpu: "2"
            memory: 3Gi
          requests:
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get deployment sispl-canal-processamento-pix-hmp -n sispl-hmp -o jsonpath='{.spec.template.spec.containers[0].livenessProbe}'
map[successThreshold:1 failureThreshold:3 exec:map[command:[/bin/bash -c /opt/jboss/bin/livenessProbe.sh]] initialDelaySeconds:90 timeoutSeconds:10 periodSeconds:10]-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get deployment sispl-canal-processamento-pix-hmp -n sispl-hmp -o jsonpath='{.spec.template.spec.containers[0].readinessProbe}'
map[exec:map[command:[/bin/bash -c /opt/jboss/bin/readinessProbe.sh]] initialDelaySeconds:90 timeoutSeconds:10 periodSeconds:10 successThreshold:1 failureThreshold:3]-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs sispl-canal-processamento-pix-hmp-6cf5c667dd-lvggt -n sispl-hmp | grep -i "vault\|unable to resolve\|VAULT::"
16:02:27,841 ERROR [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0230: Vault is not initialized; resolution of vault expressions is not possible
16:02:28,327 INFO  [org.jboss.security] (Controller Boot Thread) PBOX00361: Default Security Vault Implementation Initialized and Ready
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs sispl-canal-processamento-pix-hmp-6cf5c667dd-lvggt -n sispl-hmp --previous | grep -E "WFLYSRV0049|WFLYSRV0025|Resuming server"
15:59:46,032 INFO  [org.jboss.as] (MSC service thread 1-8) WFLYSRV0049: JBoss EAP 7.1.0.GA (WildFly Core 3.0.10.Final-redhat-1) starting
2026-07-30 16:00:01,219 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
2026-07-30 16:02:12,497 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.1.0.GA (WildFly Core 3.0.10.Final-redhat-1) started in 147364ms - Started 619 of 845 services (371 services are lazy, passive or on-demand)
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get events -n sispl-hmp --field-selector involvedObject.name=sispl-canal-processamento-pix-hmp-6cf5c667dd-lvggt --sort-by='.lastTimestamp'
F0730 16:04:53.173613   61162 sorter.go:306] Field {.lastTimestamp} in *unstructured.Unstructured is an unsortable type: interface, err: unsortable interface: interface
-sh-4.2$
