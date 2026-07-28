oc get cronjob agendamento-sisou -o jsonpath='{.spec.jobTemplate.spec.template.spec.containers[0].command}{"\n"}{.spec.jobTemplate.spec.template.spec.containers[0].args}{"\n"}'


oc create job agendamento-sisou-teste-v3 --from=cronjob.batch/agendamento-sisou


oc get pods -l job-name=agendamento-sisou-teste-v3 -w

oc logs -l job-name=agendamento-sisou-teste-v3
