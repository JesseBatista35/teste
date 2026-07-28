python3 << 'PYEOF'
import json
import os

script_path = os.path.expanduser('~/agendamento-sisou-script.sh')
patch_path = os.path.expanduser('~/patch-agendamento-sisou-v3.json')

with open(script_path) as f:
    script = f.read()

patch = [
    {
        "op": "replace",
        "path": "/spec/jobTemplate/spec/template/spec/containers/0/command",
        "value": ["/bin/bash", "-c"]
    },
    {
        "op": "replace",
        "path": "/spec/jobTemplate/spec/template/spec/containers/0/args",
        "value": [script]
    }
]

with open(patch_path, 'w') as f:
    json.dump(patch, f)

print("Patch gerado com sucesso em:", patch_path)
PYEOF
















python3 -m json.tool ~/patch-agendamento-sisou-v3.json > /dev/null && echo "JSON válido" || echo "JSON INVÁLIDO"





oc patch cronjob agendamento-sisou --type='json' -p="$(cat ~/patch-agendamento-sisou-v3.json)"
