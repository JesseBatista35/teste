oc project sirex-des

# 1. Limpar o pod de debug que pode ter ficado para trás
oc delete pod sirex-agenda-api-des-81-debug --ignore-not-found

# 2. Refazer só o 81 e comparar
oc get rc sirex-agenda-api-des-81 -o json | python -c 'import json,sys; print(json.dumps(json.load(sys.stdin)["spec"]["template"]["spec"], indent=2, sort_keys=True))' > /tmp/rc81.json
diff /tmp/rc80.json /tmp/rc81.json
