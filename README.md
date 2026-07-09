
-sh-4.2$ oc get pod - so,tr-des -o jsonpath='{.spec.containers[0].image}{"\n"}'

Error from server (NotFound): pods "-" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get builds -n simtr-des | grep simtr-parametrizacao oc logs -f bc/simtr-parametrizacao-des -n simtr-des
grep: bc/simtr-parametrizacao-des: Arquivo ou diretório não encontrado
No resources found.
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get istag -n simtr-des | grep simtr-batch
No resources found.
-sh-4.2$ oc get dc simtr-batch-des -n simtr-des -o yaml | grep -A5 triggers
        f:triggers: {}
    manager: oc
    operation: Update
    time: 2025-01-15T17:59:24Z
  - apiVersion: apps.openshift.io/v1
    fieldsType: FieldsV1
--
  triggers: []
status:
  availableReplicas: 0
  conditions:
  - lastTransitionTime: 2026-06-12T17:24:27Z
    lastUpdateTime: 2026-06-12T17:24:27Z
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$

