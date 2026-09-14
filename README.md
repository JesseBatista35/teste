
-sh-4.2$
-sh-4.2$ oc set env deploymentconfig "siinp-nucleo-des" -n siinp-des --list -c "siinp-nucleo-des"
# deploymentconfigs/siinp-nucleo-des, container siinp-nucleo-des
TZ=America/Sao_Paulo
-sh-4.2$ oc rsh siinp-nucleo-des-292-nflpk -n siinp-des ls -la /usr/src/app/secrets_files/siinp_des/
Error from server (NotFound): pods "siinp-nucleo-des-292-nflpk" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc debug dc/siinp-nucleo-des -n siinp-des -- ls -la /usr/src/app/secrets_files/siinp_des/
Defaulting container name to siinp-nucleo-des.
Use 'oc describe pod/siinp-nucleo-des-debug -n siinp-des' to see all of the containers in this pod.

Debugging with pod/siinp-nucleo-des-debug, original command: <image entrypoint>
Waiting for pod to start ...
ls: cannot access '/usr/src/app/secrets_files/siinp_des/': No such file or directory

Removing debug pod ...
-sh-4.2$ oc get dc siinp-nucleo-des -n siinp-des -o yaml | grep -A15 "volumeMounts\|volumes:"
                f:volumeMounts:
                  .: {}
                  k:{"mountPath":"/deployments/caixa-truststore-acteste-nprd.jks"}:
                    .: {}
                    f:mountPath: {}
                    f:name: {}
                    f:subPath: {}
                  k:{"mountPath":"/deployments/siinp_mtls_sandbox_of_072025_new.p12"}:
                    .: {}
                    f:mountPath: {}
                    f:name: {}
                    f:subPath: {}
                  k:{"mountPath":"/deployments/siinp_mtls_sandbox_of_072026.p12"}:
                    .: {}
                    f:mountPath: {}
                    f:name: {}
--
                f:volumeMounts:
                  .: {}
                  k:{"mountPath":"/usr/src/app/secrets_files"}:
                    .: {}
                    f:mountPath: {}
                    f:name: {}
              k:{"name":"secrets-check"}:
                .: {}
                f:command: {}
                f:env:
                  .: {}
                  k:{"name":"SECRETS_LIST"}:
                    .: {}
                    f:name: {}
                    f:value: {}
                  k:{"name":"SECRETS_PATH"}:
--
                f:volumeMounts:
                  .: {}
                  k:{"mountPath":"/script"}:
                    .: {}
                    f:mountPath: {}
                    f:name: {}
                  k:{"mountPath":"/usr/src/app/secrets_files"}:
                    .: {}
                    f:mountPath: {}
                    f:name: {}
            f:restartPolicy: {}
            f:schedulerName: {}
            f:securityContext: {}
            f:terminationGracePeriodSeconds: {}
            f:volumes:
              .: {}
              k:{"name":"caixa-truststore-acteste-nprd"}:
                .: {}
                f:name: {}
                f:secret:
                  .: {}
                  f:defaultMode: {}
                  f:secretName: {}
              k:{"name":"script-bt-volume"}:
                .: {}
                f:configMap:
                  .: {}
                  f:defaultMode: {}
                  f:name: {}
                f:name: {}
--
        volumeMounts:
        - mountPath: /usr/src/app/secrets_files
          name: secrets
        - mountPath: /deployments/siinp_mtls_sandbox_of_072025_new.p12
          name: siinp-mtls-sandbox-of-072025-new
          subPath: siinp_mtls_sandbox_of_072025_new.p12
        - mountPath: /deployments/siinp_mtls_sandbox_of_112025.p12
          name: siinp-mtls-sandbox-of-112025
          subPath: siinp_mtls_sandbox_of_112025.p12
        - mountPath: /siinp
          name: siinp-nucleo-data-des
        - mountPath: /deployments/siinp_mtls_sandbox_of_072026.p12
          name: siinp-mtls-sandbox-of-072026
          subPath: siinp_mtls_sandbox_of_072026.p12
        - mountPath: /deployments/caixa-truststore-acteste-nprd.jks
          name: caixa-truststore-acteste-nprd
--
        volumeMounts:
        - mountPath: /usr/src/app/secrets_files
          name: secrets
      - command:
        - /bin/bash
        - /script/bt-check.sh
        env:
        - name: SECRETS_PATH
          value: /usr/src/app/secrets_files
        - name: SECRETS_LIST
          value: SIINP_DES/CLISERACC_SSO_INTRA,SIINP_DES/REDIS_PASSWORD,SIINP_DES/SECURITY_CRYPTO_KEY,SIINP_DES/SICLI/SICLI_APIKEY,SIINP_DES/SIINP_APIKEY,SIINP_DES/SIINP_KEYSTORE_SANDBOX,SIINP_DES/SINPBD01_ORACLE,SIINP_DES/SINPBD01_PROXY,SIINP_DES/SINPSD01_HSM
        image: default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552
        imagePullPolicy: IfNotPresent
        name: secrets-check
        resources: {}
        terminationMessagePath: /dev/termination-log
--
        volumeMounts:
        - mountPath: /usr/src/app/secrets_files
          name: secrets
        - mountPath: /script
          name: script-bt-volume
      restartPolicy: Always
      schedulerName: default-scheduler
      securityContext: {}
      terminationGracePeriodSeconds: 30
      volumes:
      - emptyDir:
          medium: Memory
        name: secrets
      - configMap:
          defaultMode: 420
          name: siinp-nucleo-des-script-bt-check
        name: script-bt-volume
      - name: siinp-mtls-sandbox-of-072025-new
        secret:
          defaultMode: 420
          secretName: siinp-mtls-sandbox-of-072025-new
      - name: siinp-mtls-sandbox-of-112025
        secret:
          defaultMode: 420
          secretName: siinp-mtls-sandbox-of-112025
-sh-4.2$
