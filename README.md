python3 -m json.tool ~/patch-agendamento-sisou.json > /dev/null && echo "JSON válido" || echo "JSON INVÁLIDO"

oc get cronjob agendamento-sisou -o jsonpath='{.spec.jobTemplate.spec.template.spec.containers[0].command}{"\n"}{.spec.jobTemplate.spec.template.spec.containers[0].args}{"\n"}'


oc create job agendamento-sisou-teste-manual --from=cronjob/agendamento-sisou
oc get pods -w

oc logs -f <nome-do-pod-criado>

oc apply -f ~/backups-sisou/agendamento-sisou-backup-<TIMESTAMP>.yaml
