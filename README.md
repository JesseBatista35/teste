
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set resources dc/sicql-mapsfeeder-tqs --limits=memory=2Gi --requests=memory=1Gi
deploymentconfig.apps.openshift.io/sicql-mapsfeeder-tqs resource requirements updated
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sicql-mapspegasusenquadramento-tqs -o yaml | grep -B2 -A4 -E 'secretKeyRef|envFrom'
                    f:valueFrom:
                      .: {}
                      f:secretKeyRef: {}
                  k:{"name":"DATABASE_PORT"}:
                    .: {}
                    f:name: {}
                    f:value: {}
--
                    f:valueFrom:
                      .: {}
                      f:secretKeyRef: {}
                  k:{"name":"HTTP_BASIC_INTEGRATION_USERNAME"}:
                    .: {}
                    f:name: {}
                    f:value: {}
--
        - name: HTTP_BASIC_INTEGRATION_PASSWORD
          valueFrom:
            secretKeyRef:
              key: HTTP_BASIC_INTEGRATION_PASSWORD
              name: sicql-mapspegasusenquadramento-tqs
        - name: DATABASE_PASSWORD
          valueFrom:
            secretKeyRef:
              key: DATABASE_PASSWORD
              name: sicql-mapspegasusenquadramento-tqs
        image: default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicql-mapspegasusenquadramento:release-26.8.2
        imagePullPolicy: Always
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get secret | grep -Ei 'enquadramento|feeder'
sicql-maps-feeder-tqs                Opaque                                2         2d18h
sicql-mapsfeeder-tqs                 Opaque                                0         10m
sicql-mapspegasusenquadramento-tqs   Opaque                                2         20d
-sh-4.2$
-sh-4.2$
-sh-4.2$ curl -s -o /dev/null -w '%{http_code}\n' localhost:8080/actuator/health/liveness
000
-sh-4.2$
