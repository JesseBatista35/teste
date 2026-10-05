-sh-4.2$
-sh-4.2$ oc get secret sicql-mapsfeeder-tqs               -o jsonpath='{.data.DATABASE_PASSWORD}' | md5sum
8fbc0934fff92efb956c9dad3da876da  -
-sh-4.2$ oc get secret sicql-mapspegasusenquadramento-tqs -o jsonpath='{.data.DATABASE_PASSWORD}' | md5sum
94da807bc6556b72e2357dee148c5709  -
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ POD=$(oc get pods -l deploymentconfig=sicql-mapsfeeder-tqs -o name | head -1)
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ echo $POD
pod/sicql-mapsfeeder-tqs-6-748q5
-sh-4.2$ oc exec $POD -- curl -s -o /dev/null -w '%{http_code}\n' localhost:8080/actuator/health/liveness
error: invalid resource name "pod/sicql-mapsfeeder-tqs-6-748q5": [may not contain '/']
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
