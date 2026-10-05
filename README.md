oc get dc,rc,pod,svc,route,secret | grep -E 'mapsfeeder|maps-feeder'


oc get dc sicql-mapsfeeder-tqs
oc set resources dc/sicql-mapsfeeder-tqs --limits=memory=2Gi --requests=memory=1Gi


