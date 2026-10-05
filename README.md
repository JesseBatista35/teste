# 1) O token foi substituído? Se retornar 1, chegou o texto literal "#{...}#"
oc get secret sicql-mapsfeeder-tqs -o jsonpath='{.data.DATABASE_PASSWORD}' | base64 -d | grep -c '#{'

# 2) Compara com o enquadramento, que usa o MESMO usuário/banco (scqlbt01 @ 10.116.28.37:5204) e funciona
oc get secret sicql-mapsfeeder-tqs               -o jsonpath='{.data.DATABASE_PASSWORD}' | md5sum
oc get secret sicql-mapspegasusenquadramento-tqs -o jsonpath='{.data.DATABASE_PASSWORD}' | md5sum

oc exec <pod> -- curl -s -o /dev/null -w '%{http_code}\n' localhost:8080/actuator/health/liveness
