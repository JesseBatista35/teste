
-sh-4.2$


You have access to 990 projects, the list has been suppressed. You can list all projects with 'oc projects'

Using project "sihdg-tqs".
-sh-4.2$
-sh-4.2$ oc get pod -n siacc-tqs -l name=siacc-pixautomatico-api-simulador-tqs -o jsonpath='{range .items[*]}{.metadata.name}{" -> "}{.spec.containers[*].name}{"\n"}{end}'
siacc-pixautomatico-api-simulador-tqs-63-n5cv9 -> siacc-pixautomatico-api-simulador-tqs
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod -n siacc-tqs -l name=siacc-pixautomatico-api-controle-requisicoes-tqs -o jsonpath='{range .items[*]}{.metadata.name}{" -> "}{.spec.containers[*].name}{"\n"}{end}'
siacc-pixautomatico-api-controle-requisicoes-tqs-69-d4nls -> siacc-pixautomatico-api-controle-requisicoes-tqs
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc/siacc-pixautomatico-api-simulador-tqs -n siacc-tqs -o yaml | grep -A3 -iE 'secrets_files|volumeMounts|volumes:'
                f:volumeMounts:
                  .: {}
                  k:{"mountPath":"/deployments/caixa-truststore-acteste-nprd.jks"}:
                    .: {}
--
                  k:{"mountPath":"/usr/src/app/secrets_files"}:
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
--
                f:volumeMounts:
                  .: {}
                  k:{"mountPath":"/script"}:
                    .: {}
--
                  k:{"mountPath":"/usr/src/app/secrets_files"}:
                    .: {}
                    f:mountPath: {}
                    f:name: {}
--
            f:volumes:
              .: {}
              k:{"name":"caixa-truststore-acteste-nprd"}:
                .: {}
--
          value: /usr/src/app/secrets_files/siacc_tqs/
        - name: QUARKUS_OIDC_CLIENT_CREDENTIALS_SECRET
          valueFrom:
            secretKeyRef:
--
        volumeMounts:
        - mountPath: /usr/src/app/secrets_files
          name: secrets
        - mountPath: /deployments/caixa-truststore-acteste-nprd.jks
          name: caixa-truststore-acteste-nprd
--
          value: /usr/src/app/secrets_files
        - name: BT_API_URL
          value: https://sicsn.caixa/BeyondTrust/api/public/v3
        - name: CLIENT_ID
--
        volumeMounts:
        - mountPath: /usr/src/app/secrets_files
          name: secrets
      - command:
        - /bin/bash
--
          value: /usr/src/app/secrets_files
        - name: SECRETS_LIST
          value: SIACC_TQS/CLISERACC_SSO,SIACC_TQS/CLISERACCPXA_SSO,SIACC_TQS/SACCDB02_MQ_BAIXA,SIACC_TQS/SACCTS01_ORACLE,SIACC_TQS/SACCSD06_MQ_ALTA,SIACC_TQS/SIACC_APIKEY,SIACC_TQS/S739019_PROXY,SIACC_TQS/WEBHOOK_KEYSTORE
        image: default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552
--
        volumeMounts:
        - mountPath: /usr/src/app/secrets_files
          name: secrets
        - mountPath: /script
          name: script-bt-volume
--
      volumes:
      - emptyDir:
          medium: Memory
        name: secrets
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc/siacc-pixautomatico-api-controle-requisicoes-tqs -n siacc-tqs -o yaml | grep -A3 -iE 'secrets_files|volumeMounts|volumes:'
                f:volumeMounts:
                  k:{"mountPath":"/usr/src/app/secrets_files"}:
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
--
                f:volumeMounts:
                  .: {}
                  k:{"mountPath":"/script"}:
                    .: {}
--
                  k:{"mountPath":"/usr/src/app/secrets_files"}:
                    .: {}
                    f:mountPath: {}
                    f:name: {}
            f:volumes:
              k:{"name":"script-bt-volume"}:
                .: {}
                f:configMap:
--
                f:volumeMounts:
                  .: {}
                  k:{"mountPath":"/deployments/caixa-truststore-acteste-nprd.jks"}:
                    .: {}
--
            f:volumes:
              .: {}
              k:{"name":"caixa-truststore-acteste-nprd"}:
                .: {}
--
          value: /usr/src/app/secrets_files/siacc_tqs/
        - name: QUARKUS_OIDC_CLIENT_CREDENTIALS_SECRET
          valueFrom:
            secretKeyRef:
--
        volumeMounts:
        - mountPath: /usr/src/app/secrets_files
          name: secrets
        - mountPath: /deployments/caixa-truststore-acteste-nprd.jks
          name: caixa-truststore-acteste-nprd
--
          value: /usr/src/app/secrets_files
        - name: BT_API_URL
          value: https://sicsn.caixa/BeyondTrust/api/public/v3
        - name: CLIENT_ID
--
        volumeMounts:
        - mountPath: /usr/src/app/secrets_files
          name: secrets
      - command:
        - /bin/bash
--
          value: /usr/src/app/secrets_files
        - name: SECRETS_LIST
          value: SIACC_TQS/CLISERACC_SSO,SIACC_TQS/CLISERACCPXA_SSO,SIACC_TQS/SACCDB02_MQ_BAIXA,SIACC_TQS/SACCTS01_ORACLE,SIACC_TQS/SACCSD06_MQ_ALTA,SIACC_TQS/SIACC_APIKEY,SIACC_TQS/S739019_PROXY,SIACC_TQS/WEBHOOK_KEYSTORE
        image: default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552
--
        volumeMounts:
        - mountPath: /usr/src/app/secrets_files
          name: secrets
        - mountPath: /script
          name: script-bt-volume
--
      volumes:
      - emptyDir:
          medium: Memory
        name: secrets
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec <pod-controle-requisicoes> -n siacc-tqs -c <container> -- ls -la /usr/src/app/secrets_files/siacc_tqs/
-sh: pod-controle-requisicoes: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
