oc get cronjob agendamento-sisou -o jsonpath='{.spec.jobTemplate.spec.template.spec.containers[0].args}' | grep -o 'cacert'


oc get cronjob agendamento-sisou -o json | \
python3 -c "
import json, sys

cj = json.load(sys.stdin)
job_spec = cj['spec']['jobTemplate']['spec']

job = {
    'apiVersion': 'batch/v1',
    'kind': 'Job',
    'metadata': {
        'name': 'agendamento-sisou-teste-v4',
        'namespace': 'sisou-des'
    },
    'spec': job_spec
}

print(json.dumps(job))
" > ~/job-teste-v4.json

oc create -f ~/job-teste-v4.json


oc get pods -l job-name=agendamento-sisou-teste-v4 -w


oc logs -l job-name=agendamento-sisou-teste-v4
