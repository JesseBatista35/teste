-sh-4.2$ oc get cronjob agendamento-sisou -o jsonpath='{.spec.jobTemplate.spec.template.spec.containers[0].args}' | grep -o 'cacert'
cacert
cacert
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get cronjob agendamento-sisou -o json | \
> python3 -c "
> import json, sys
>
> cj = json.load(sys.stdin)
> job_spec = cj['spec']['jobTemplate']['spec']
>
> job = {
>     'apiVersion': 'batch/v1',
>     'kind': 'Job',
>     'metadata': {
>         'name': 'agendamento-sisou-teste-v4',
>         'namespace': 'sisou-des'
>     },
>     'spec': job_spec
> }
>
> print(json.dumps(job))
> " > ~/job-teste-v4.json
-sh-4.2$
-sh-4.2$ oc create -f ~/job-teste-v4.json
job.batch/agendamento-sisou-teste-v4 created
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -l job-name=agendamento-sisou-teste-v4 -w
NAME                               READY     STATUS    RESTARTS   AGE
agendamento-sisou-teste-v4-4b87p   0/1       Error     0          5s
agendamento-sisou-teste-v4-r9gkp   0/1       Error     0          11s
agendamento-sisou-teste-v4-4b87p   0/1       Error     0         7s
agendamento-sisou-teste-v4-7vckm   0/1       Pending   0         0s
agendamento-sisou-teste-v4-7vckm   0/1       Pending   0         0s
agendamento-sisou-teste-v4-4b87p   0/1       Error     0         17s
agendamento-sisou-teste-v4-7vckm   0/1       ContainerCreating   0         0s
agendamento-sisou-teste-v4-7vckm   0/1       ContainerCreating   0         3s
agendamento-sisou-teste-v4-7vckm   0/1       Error     0         3s
agendamento-sisou-teste-v4-7vckm   0/1       Error     0         6s

