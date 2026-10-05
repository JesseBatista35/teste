
-sh-4.2$ oc get secret sicql-mapsfeeder-tqs -o jsonpath='{.data.DATABASE_PASSWORD}' | base64 -d | grep -c '#{'
0
-sh-4.2$ oc get secret sicql-mapsfeeder-tqs               -o jsonpath='{.data.DATABASE_PASSWORD}' | md5sum
8fbc0934fff92efb956c9dad3da876da  -
-sh-4.2$ oc get secret sicql-mapspegasusenquadramento-tqs -o jsonpath='{.data.DATABASE_PASSWORD}' | md5su
-sh: md5su: comando não encontrado
-sh-4.2$ oc exec <pod> -- curl -s -o /dev/null -w '%{http_code}\n' localhost:8080/actuator/health/liveness
-sh: pod: Arquivo ou diretório não encontrado
-sh-4.2$
