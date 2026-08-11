
-sh-4.2$ oc get is -n build-images-ads | grep -i angular
sample-angular                                    image-registry.openshift-image-registry.svc:5000/build-images-ads/sample-angular                                    1.0.0-snapshot,latest                                           2 years ago
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get bc sample-angular -n build-images-ads -o yaml | grep -A5 sourceStrategy
          f:sourceStrategy:
            .: {}
            f:env: {}
            f:forcePull: {}
            f:from: {}
          f:type: {}
--
    sourceStrategy:
      env:
      - name: TZ
        value: America/Sao_Paulo
      forcePull: true
      from:
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get is nginx -n openshift -o jsonpath='{.status.tags[*].tag}'
1.18 1.18-full 1.18-ubi7 1.18-ubi8 1.20-ubi7 1.20-ubi8 1.20-ubi9 latest teste-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
