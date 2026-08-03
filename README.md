# ver qual o contexto real da aplicação implantada
ls -la /opt/jboss/standalone/deployments/

# testar o endpoint real do webhook (ajusta o path conforme o que aparecer acima)
curl -v -m 5 http://localhost:8080/<contexto-real>/health

ls -la /opt/jboss/standalone/log/

# fora do pod, no bastion:
oc get route -n <namespace> | grep -i pix
oc logs <nome-do-pod> -c sispl-canal-webhook-pix-tqs --since=30m | grep -i -E "POST|webhook|pix"
