oc delete imagestream sicql-maps-feeder-tqs


oc get dc,pod,svc,route,secret | grep mapsfeeder
oc get secret sicql-mapsfeeder-tqs

  oc patch secret sicql-mapsfeeder-tqs -p "{\"data\":{\"DATABASE_PASSWORD\":\"$(oc get secret sicql-mapspegasusenquadramento-tqs -o jsonpath='{.data.DATABASE_PASSWORD}')\"}}"
  oc rollout latest dc/sicql-mapsfeeder-tqs
