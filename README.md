-sh-4.2$
-sh-4.2$ oc project sisou-des
Now using project "sisou-des" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get cronjob agendamento-sisou -o yaml
apiVersion: batch/v1
kind: CronJob
metadata:
  annotations:
    kubectl.kubernetes.io/last-applied-configuration: |
      {"apiVersion":"batch/v1","kind":"CronJob","metadata":{"annotations":{},"name":"agendamento-sisou","namespace":"sisou-des"},"spec":{"concurrencyPolicy":"Forbid","failedJobsHistoryLimit":10,"jobTemplate":{"spec":{"template":{"spec":{"containers":[{"command":["/bin/bash","-c","set -euo pipefail\necho \"agendamento-SISOU\"\noc get pods -l deploymentconfig=sisou-sac-okd-prd\nPOD=$(oc get pods -l deploymentconfig=sisou-sac-okd-prd --field-selector=status.phase=Running --sort-by=.metadata.creationTimestamp -o jsonpath='{.items[0].metadata.name}')\noc exec \"${POD}\" -- java -jar /deployments/app.jar\n"],"env":[{"name":"TZ","value":"America/Sao_Paulo"}],"image":"image-registry.openshift-image-registry.svc:5000/openshift/cli:latest","name":"executor"}],"restartPolicy":"Never","serviceAccountName":"agendamento-sisou-sa"}}}},"schedule":"*/30 * * * *","successfulJobsHistoryLimit":10}}
  creationTimestamp: 2026-07-16T19:02:59Z
  generation: 2
  managedFields:
  - apiVersion: batch/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:metadata:
        f:annotations:
          .: {}
          f:kubectl.kubernetes.io/last-applied-configuration: {}
      f:spec:
        f:concurrencyPolicy: {}
        f:failedJobsHistoryLimit: {}
        f:jobTemplate:
          f:spec:
            f:template:
              f:spec:
                f:containers:
                  k:{"name":"executor"}:
                    .: {}
                    f:env:
                      .: {}
                      k:{"name":"TZ"}:
                        .: {}
                        f:name: {}
                        f:value: {}
                    f:image: {}
                    f:imagePullPolicy: {}
                    f:name: {}
                    f:resources: {}
                    f:terminationMessagePath: {}
                    f:terminationMessagePolicy: {}
                f:dnsPolicy: {}
                f:restartPolicy: {}
                f:schedulerName: {}
                f:securityContext: {}
                f:serviceAccount: {}
                f:serviceAccountName: {}
                f:terminationGracePeriodSeconds: {}
        f:schedule: {}
        f:successfulJobsHistoryLimit: {}
        f:suspend: {}
    manager: kubectl-client-side-apply
    operation: Update
    time: 2026-07-16T19:02:59Z
  - apiVersion: batch/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:spec:
        f:jobTemplate:
          f:spec:
            f:template:
              f:spec:
                f:containers:
                  k:{"name":"executor"}:
                    f:command: {}
    manager: oc
    operation: Update
    time: 2026-07-22T13:27:44Z
  - apiVersion: batch/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:status:
        f:lastScheduleTime: {}
    manager: kube-controller-manager
    operation: Update
    subresource: status
    time: 2026-07-23T23:30:00Z
  name: agendamento-sisou
  namespace: sisou-des
  resourceVersion: "2097584832"
  uid: 91bb12fb-75f6-4bd5-a48f-a7011c348fe1
spec:
  concurrencyPolicy: Forbid
  failedJobsHistoryLimit: 10
  jobTemplate:
    metadata:
      creationTimestamp: null
    spec:
      template:
        metadata:
          creationTimestamp: null
        spec:
          containers:
          - command:
            - /bin/bash
            - -c
            - |
              curl --fail "http://sisou-sac-okd-des.sisou-des.svc.cluster.local:8080/sac/cronjob/indecx/pesquisa-satisfacao"
            env:
            - name: TZ
              value: America/Sao_Paulo
            image: image-registry.openshift-image-registry.svc:5000/openshift/cli:latest
            imagePullPolicy: Always
            name: executor
            resources: {}
            terminationMessagePath: /dev/termination-log
            terminationMessagePolicy: File
          dnsPolicy: ClusterFirst
          restartPolicy: Never
          schedulerName: default-scheduler
          securityContext: {}
          serviceAccount: agendamento-sisou-sa
          serviceAccountName: agendamento-sisou-sa
          terminationGracePeriodSeconds: 30
  schedule: '*/30 * * * *'
  successfulJobsHistoryLimit: 10
  suspend: false
status:
  lastScheduleTime: 2026-07-23T23:30:00Z
-sh-4.2$
-sh-4.2$
-sh-4.2$ mkdir -p ~/backups-sisou
-sh-4.2$ oc get cronjob agendamento-sisou -o yaml > ~/backups-sisou/agendamento-sisou-backup-$(date +%Y%m%d-%H%M%S).yaml
-sh-4.2$ ls -la ~/backups-sisou/
total 12
drwxr-xr-x  2 p585600 usucef   59 Jul 23 20:48 .
drwx------ 12 p585600 usucef 4096 Jul 23 20:48 ..
-rw-r--r--  1 p585600 usucef 4313 Jul 23 20:48 agendamento-sisou-backup-20260723-204809.yaml
-sh-4.2$ cat ~/backups-sisou/agendamento-sisou-backup-*.yaml | head -50
apiVersion: batch/v1
kind: CronJob
metadata:
  annotations:
    kubectl.kubernetes.io/last-applied-configuration: |
      {"apiVersion":"batch/v1","kind":"CronJob","metadata":{"annotations":{},"name":"agendamento-sisou","namespace":"sisou-des"},"spec":{"concurrencyPolicy":"Forbid","failedJobsHistoryLimit":10,"jobTemplate":{"spec":{"template":{"spec":{"containers":[{"command":["/bin/bash","-c","set -euo pipefail\necho \"agendamento-SISOU\"\noc get pods -l deploymentconfig=sisou-sac-okd-prd\nPOD=$(oc get pods -l deploymentconfig=sisou-sac-okd-prd --field-selector=status.phase=Running --sort-by=.metadata.creationTimestamp -o jsonpath='{.items[0].metadata.name}')\noc exec \"${POD}\" -- java -jar /deployments/app.jar\n"],"env":[{"name":"TZ","value":"America/Sao_Paulo"}],"image":"image-registry.openshift-image-registry.svc:5000/openshift/cli:latest","name":"executor"}],"restartPolicy":"Never","serviceAccountName":"agendamento-sisou-sa"}}}},"schedule":"*/30 * * * *","successfulJobsHistoryLimit":10}}
  creationTimestamp: 2026-07-16T19:02:59Z
  generation: 2
  managedFields:
  - apiVersion: batch/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:metadata:
        f:annotations:
          .: {}
          f:kubectl.kubernetes.io/last-applied-configuration: {}
      f:spec:
        f:concurrencyPolicy: {}
        f:failedJobsHistoryLimit: {}
        f:jobTemplate:
          f:spec:
            f:template:
              f:spec:
                f:containers:
                  k:{"name":"executor"}:
                    .: {}
                    f:env:
                      .: {}
                      k:{"name":"TZ"}:
                        .: {}
                        f:name: {}
                        f:value: {}
                    f:image: {}
                    f:imagePullPolicy: {}
                    f:name: {}
                    f:resources: {}
                    f:terminationMessagePath: {}
                    f:terminationMessagePolicy: {}
                f:dnsPolicy: {}
                f:restartPolicy: {}
                f:schedulerName: {}
                f:securityContext: {}
                f:serviceAccount: {}
                f:serviceAccountName: {}
                f:terminationGracePeriodSeconds: {}
        f:schedule: {}
        f:successfulJobsHistoryLimit: {}
        f:suspend: {}
    manager: kubectl-client-side-apply
    operation: Update
-sh-4.2$ cat > ~/patch-agendamento-sisou.json << 'EOF'
> [
>   {
>     "op": "replace",
>     "path": "/spec/jobTemplate/spec/template/spec/containers/0/command",
>     "value": ["/bin/bash", "-c"]
>   },
>   {
>     "op": "replace",
>     "path": "/spec/jobTemplate/spec/template/spec/containers/0/args",
>     "value": [
>       "KEYCLOAK_URL=\"https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token\"\nCLIENT_ID=\"cli-ser-sou\"\nCLIENT_SECRET=$(printenv KEYCLOAK_SECRET)\n#echo \"teste por fora do cluster\"\nTARGET_DNS=\"https://sisou-sac-okd-des.apps.nprd.caixa\"\nTOKEN=$(curl -s -X POST \"${KEYCLOAK_URL}\" -H \"Content-Type: application/x-www-form-urlencoded\" -d \"grant_type=client_credentials\" -d \"client_id=${CLIENT_ID}\" -d \"client_secret=${CLIENT_SECRET}\" | sed -n 's/.*\"access_token\":\"\\([^\"]*\\)\".*/\\1/p')\n#echo \"Token obtido\"\n[[ -n \"$TOKEN\" ]] && echo \"== TOKEN recuperado ==\"\ncurl -v -w \"\\n HTTP_CODE = %{http_code}\\n\" -H \"Authorization: Bearer ${TOKEN}\" -H \"Content-Type: application/json\" \"$TARGET_DNS/sac/cronjob/indecx/pesquisa-satisfacao\""
>     ]
>   }
> ]
> EOF
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc patch cronjob agendamento-sisou --type='json' -p="$(cat ~/patch-agendamento-sisou.json)"
cronjob.batch/agendamento-sisou patched
-sh-4.2$ oc get cronjob agendamento-sisou -o jsonpath='{.spec.jobTemplate.spec.template.spec.containers[0].command}{"\n"}{.spec.jobTemplate.spec.template.spec.containers[0].args}{"\n"}'
[/bin/bash -c]
[KEYCLOAK_URL="https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token"
CLIENT_ID="cli-ser-sou"
CLIENT_SECRET=$(printenv KEYCLOAK_SECRET)
#echo "teste por fora do cluster"
TARGET_DNS="https://sisou-sac-okd-des.apps.nprd.caixa"
TOKEN=$(curl -s -X POST "${KEYCLOAK_URL}" -H "Content-Type: application/x-www-form-urlencoded" -d "grant_type=client_credentials" -d "client_id=${CLIENT_ID}" -d "client_secret=${CLIENT_SECRET}" | sed -n 's/.*"access_token":"\([^"]*\)".*/\1/p')
#echo "Token obtido"
[[ -n "$TOKEN" ]] && echo "== TOKEN recuperado =="
curl -v -w "\n HTTP_CODE = %{http_code}\n" -H "Authorization: Bearer ${TOKEN}" -H "Content-Type: application/json" "$TARGET_DNS/sac/cronjob/indecx/pesquisa-satisfacao"]
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc create job agendamento-sisou-teste-manual --from=cronjob/agendamento-sisou
error: from must be an existing cronjob: no kind "CronJob" is registered for version "batch/v1" in scheme "k8s.io/kubernetes/pkg/kubectl/scheme/scheme.go:28"
-sh-4.2$
