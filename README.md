# O que mudou entre 80 e 81 (env, args, probes, volumes)
oc get rc sirex-agenda-api-des-80 -o jsonpath='{.spec.template.spec}' | python -m json.tool > /tmp/rc80.json
oc get rc sirex-agenda-api-des-81 -o jsonpath='{.spec.template.spec}' | python -m json.tool > /tmp/rc81.json
diff /tmp/rc80.json /tmp/rc81.json

# Causa do rollout (ConfigChange x ImageChange)
oc rollout history dc/sirex-agenda-api-des

# Eventos (sem o sort, que essa versão do oc não suporta)
oc get events | grep -i agenda-api
