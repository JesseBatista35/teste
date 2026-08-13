
-sh-4.2$ oc rsh sifpp-micro-des-35-8bfs8 sh -c "unzip -p /deployments/app/sifpp-ms-0.0.0.1.jar application.properties"
sh: unzip: command not found
command terminated with exit code 127
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod sifpp-micro-des-35-8bfs8 -n sifpp-des -o yaml | grep -B2 -A10 "valueFrom\|configMapRef\|secretRef"
                .: {}
                f:name: {}
                f:valueFrom:
                  .: {}
                  f:secretKeyRef: {}
              k:{"name":"SSO_CLI_SER_FPP"}:
                .: {}
                f:name: {}
                f:value: {}
              k:{"name":"SSO_PASS_CLI_SER_OBR"}:
                .: {}
                f:name: {}
                f:valueFrom:
                  .: {}
                  f:secretKeyRef: {}
              k:{"name":"TZ"}:
                .: {}
                f:name: {}
                f:value: {}
            f:image: {}
            f:imagePullPolicy: {}
            f:livenessProbe:
              .: {}
--
      value: cli-ser-fpp
    - name: SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS
      valueFrom:
        secretKeyRef:
          key: SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS
          name: sifpp-micro-des
    - name: SSO_PASS_CLI_SER_OBR
      valueFrom:
        secretKeyRef:
          key: SSO_PASS_CLI_SER_OBR
          name: sifpp-micro-des
    image: default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sifpp-micro:20260812.1156-0.0.0.1-SNAPSHOT
    imagePullPolicy: Always
    livenessProbe:
      failureThreshold: 3
      httpGet:
        path: /health/live
        port: 8080
-sh-4.2$
-sh-4.2$
-sh-4.2$
