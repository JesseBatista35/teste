oc get all,cm,secret,route,hpa,pdb,sa 2>/dev/null | grep -E 'mapsfeeder|maps-feeder'


oc delete svc sicql-mapsfeeder-tqs sicql-mapsfeeder-tqs-metrics
oc delete route sicql-mapsfeeder-tqs
oc delete secret sicql-mapsfeeder-tqs


oc delete svc sicql-maps-feeder-tqs sicql-maps-feeder-tqs-metrics
oc delete route sicql-maps-feeder-tqs
oc delete secret sicql-maps-feeder-tqs

oc get dc sicql-mapsfeeder-tqs
oc get secret sicql-mapsfeeder-tqs        # DATA deve ser 1
oc set resources dc/sicql-mapsfeeder-tqs --limits=memory=2Gi --requests=memory=1Gi
