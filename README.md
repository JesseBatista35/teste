POD=$(oc get pods -l deploymentconfig=sicql-mapsfeeder-tqs -o jsonpath='{.items[0].metadata.name}')

# Acompanhar o fim do startup
oc logs -f $POD | grep -Ei 'WFLYSRV0010|WFLYSRV0025|WFLYSRV0026|Iniciando Odin|Não foi possível|ERROR|changelog lock'

# Status e restarts
oc get pod $POD

# Testar a probe quando o WildFly terminar de subir
oc exec $POD -- curl -s -o /dev/null -w '%{http_code}\n' localhost:8080/actuator/health/liveness
