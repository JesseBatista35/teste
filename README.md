oc get secret sicql-mapsfeeder-tqs
oc set env dc/sicql-mapsfeeder-tqs --list | grep -i DATABASE_PASSWORD

oc patch secret sicql-mapsfeeder-tqs -p "{\"data\":{\"DATABASE_PASSWORD\":\"$(oc get secret sicql-mapspegasusenquadramento-tqs -o jsonpath='{.data.DATABASE_PASSWORD}')\"}}"

oc get secret sicql-mapspegasusenquadramento-tqs -o jsonpath='{.data.DATABASE_PASSWORD}' | base64 -d > /tmp/dbpw
oc create secret generic sicql-mapsfeeder-tqs --from-file=DATABASE_PASSWORD=/tmp/dbpw
rm -f /tmp/dbpw

oc set env dc/sicql-mapsfeeder-tqs --from=secret/sicql-mapsfeeder-tqs

oc set env dc/sicql-mapsfeeder-tqs --list | grep -i DATABASE_PASSWORD   # deve aparecer como "from secret"
oc get dc sicql-mapsfeeder-tqs -o jsonpath='{.spec.template.spec.containers[0].resources}'   # confirmar 2Gi
