
-sh-4.2$ python3 << 'PYEOF'
> import json
> import os
>
> script_path = os.path.expanduser('~/agendamento-sisou-script.sh')
> patch_path = os.path.expanduser('~/patch-agendamento-sisou-v3.json')
>
> with open(script_path) as f:
>     script = f.read()
>
> patch = [
>     {
>         "op": "replace",
>         "path": "/spec/jobTemplate/spec/template/spec/containers/0/command",
>         "value": ["/bin/bash", "-c"]
>     },
>     {
>         "op": "replace",
>         "path": "/spec/jobTemplate/spec/template/spec/containers/0/args",
>         "value": [script]
>     }
> ]
>
> with open(patch_path, 'w') as f:
>     json.dump(patch, f)
>
> print("Patch gerado com sucesso em:", patch_path)
> PYEOF
Patch gerado com sucesso em: /home/p585600/patch-agendamento-sisou-v3.json
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ python3 -m json.tool ~/patch-agendamento-sisou-v3.json > /dev/null && echo "JSON válido" || echo "JSON INVÁLIDO"
JSON válido
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc patch cronjob agendamento-sisou --type='json' -p="$(cat ~/patch-agendamento-sisou-v3.json)"
cronjob.batch/agendamento-sisou patched
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
