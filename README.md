
-sh-4.2$ oc get pods | grep mapsfeeder
sicql-mapsfeeder-tqs-4-btj4f                   1/1       Running     0              3m21s
sicql-mapsfeeder-tqs-4-deploy                  0/1       Completed   0              3m24s
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ POD=$(oc get pods -l deploymentconfig=sicql-mapsfeeder-tqs -o jsonpath='{.items[0].metadata.name}')
-sh-4.2$ oc exec $POD -- curl -s -m 5 -o /dev/null -w '%{http_code}\n' localhost:8080/feeder/
302
-sh-4.2$
-sh-4.2$
-sh-4.2$
