
-sh-4.2$ oc delete secret simtx-transacoes-lote-des2 -n simtx-des
secret "simtx-transacoes-lote-des2" deleted
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ rm dc-des2.yaml
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc delete deploymentconfig simtx-transacoes-lote-des2 -n simtx-des --ignore-not-found=true
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get deploymentconfig simtx-transacoes-lote-des -n simtx-des -o yaml > dc-des2.yaml
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ cat dc-des2.yaml | head -20
apiVersion: apps.openshift.io/v1
kind: DeploymentConfig
metadata:
  annotations:
    description: Defines how to deploy the application server
    openshift.io/generated-by: OpenShiftNewApp
  creationTimestamp: 2024-09-15T02:10:09Z
  generation: 61734
  labels:
    CGC_DES: "7390"
    CGC_OPS: "7259"
    UNIDADE: BR
    app: simtx-transacoes-lote-des
    application: simtx-transacoes-lote-des
    template: quarkus-caixa-release
  name: simtx-transacoes-lote-des
  namespace: simtx-des
  resourceVersion: "2027165696"
  uid: a7cb2d84-74b1-46e7-9e56-aee3a5282297
spec:
-sh-4.2$ sed -i 's/  name: simtx-transacoes-lote-des$/  name: simtx-transacoes-lote-des2/g' dc-des2.yaml
-sh-4.2$ sed -i 's/    name: simtx-transacoes-lote-des$/    name: simtx-transacoes-lote-des2/g' dc-des2.yaml
-sh-4.2$ sed -i 's/      name: simtx-transacoes-lote-des$/      name: simtx-transacoes-lote-des2/g' dc-des2.yaml
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep "namespace:" dc-des2.yaml | head -3
  namespace: simtx-des
-sh-4.2$ grep "name:" dc-des2.yaml | head -10
  name: simtx-transacoes-lote-des2
    name: simtx-transacoes-lote-des2
        name: simtx-transacoes-lote-des2
      name: simtx-transacoes-lote-des2
        - name: TZ
        - name: API_APIKEY
        - name: APPLICATIONINSIGHTS_CONFIGURATION_CONTENT
        - name: APPLICATIONINSIGHTS_CONNECTION_STRING
        - name: APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
        - name: APPLICATIONINSIGHTS_PROXY
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ sed -i 's/app: simtx-transacoes-lote-des$/app: simtx-transacoes-lote-des2/g' dc-des2.yaml
-sh-4.2$ sed -i 's/application: simtx-transacoes-lote-des$/application: simtx-transacoes-lote-des2/g' dc-des2.yaml
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ sed -i 's/name: simtx-transacoes-lote-des$/name: simtx-transacoes-lote-des2/g' dc-des2.yaml
-sh-4.2$
-sh-4.2$
-sh-4.2$ sed -i 's/simtx-transacoes-lote-des-script-bt-check/simtx-transacoes-lote-des2-script-bt-check/g' dc-des2.yaml
-sh-4.2$ sed -i 's/bt-client-secret-simtx-transacoes-lote-des/bt-client-secret-simtx-transacoes-lote-des2/g' dc-des2.yaml
-sh-4.2$ sed -i 's/secretName: simtx-transacoes-lote-des$/secretName: simtx-transacoes-lote-des2/g' dc-des2.yaml
-sh-4.2$
-sh-4.2$
-sh-4.2$ echo "=== NAMESPACE ==="
=== NAMESPACE ===
-sh-4.2$ grep "namespace:" dc-des2.yaml | head -1
  namespace: simtx-des
-sh-4.2$
-sh-4.2$ echo -e "\n=== LABELS E SELECTORS ==="

=== LABELS E SELECTORS ===
-sh-4.2$ grep -E "app:|application:|name: simtx" dc-des2.yaml | head -10
    app: simtx-transacoes-lote-des2
    application: simtx-transacoes-lote-des2
  name: simtx-transacoes-lote-des2
    name: simtx-transacoes-lote-des2
        app: simtx-transacoes-lote-des2
        name: simtx-transacoes-lote-des2
      name: simtx-transacoes-lote-des2
              name: simtx-transacoes-lote-des2
              name: simtx-transacoes-lote-des2
              name: simtx-transacoes-lote-des2
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$


# Agora aplicar
oc apply -f dc-des2.yaml
