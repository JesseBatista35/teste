
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set env dc/sicql-mapsfeeder-tqs --list | grep -i DATABASE_PASSWORD
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc patch secret sicql-mapsfeeder-tqs -p "{\"data\":{\"DATABASE_PASSWORD\":\"$(oc get secret sicql-mapspegasusenquadramento-tqs -o jsonpath='{.data.DATABASE_PASSWORD}')\"}}"
secret/sicql-mapsfeeder-tqs patched
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get secret sicql-mapspegasusenquadramento-tqs -o jsonpath='{.data.DATABASE_PASSWORD}' | base64 -d > /tmp/dbpw
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc create secret generic sicql-mapsfeeder-tqs --from-file=DATABASE_PASSWORD=/tmp/dbpw
Error from server (AlreadyExists): secrets "sicql-mapsfeeder-tqs" already exists
-sh-4.2$
-sh-4.2$ rm -f /tmp/dbpw
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set env dc/sicql-mapsfeeder-tqs --from=secret/sicql-mapsfeeder-tqs
deploymentconfig.apps.openshift.io/sicql-mapsfeeder-tqs updated
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set env dc/sicql-mapsfeeder-tqs --list | grep -i DATABASE_PASSWORD   # deve aparecer como "from secret"
# DATABASE_PASSWORD from secret sicql-mapsfeeder-tqs, key DATABASE_PASSWORD
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sicql-mapsfeeder-tqs -o jsonpath='{.spec.template.spec.containers[0].resources}'   # confirmar 2Gi
map[limits:map[cpu:1 memory:2Gi] requests:map[memory:1Gi cpu:500m]]-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
