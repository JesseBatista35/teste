
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get events -n sihdg-tqs --field-selector involvedObject.name=teste-egress
LAST SEEN   TYPE      REASON           OBJECT             MESSAGE
2m11s       Normal    AddedInterface   pod/teste-egress   Add eth0 [25.1.37.45/23] from openshift-sdn
41s         Normal    Pulling          pod/teste-egress   Pulling image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sihdg-jboss8:3.17.0.0"
41s         Warning   Failed           pod/teste-egress   Failed to pull image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sihdg-jboss8:3.17.0.0": rpc error: code = Unknown desc = reading manifest 3.17.0.0 in default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sihdg-jboss8: unauthorized: authentication required
41s         Warning   Failed           pod/teste-egress   Error: ErrImagePull
27s         Normal    BackOff          pod/teste-egress   Back-off pulling image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sihdg-jboss8:3.17.0.0"
52s         Warning   Failed           pod/teste-egress   Error: ImagePullBackOff
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n openshift-sdn sdn-4wz4s -o jsonpath='{.spec.containers[0].image}{"\n"}'
quay.io/openshift/okd-content@sha256:c53bb2c01dc951dfe46ba91d76553d6d16b007de0a5475f05c91e51505900a0c
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc delete pod teste-egress -n sihdg-tqs
pod "teste-egress" deleted
-sh-4.2$
-sh-4.2$
-sh-4.2$
