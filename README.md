
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc whoami --show-server
https://api.nprd.caixa:6443
-sh-4.2$ oc get is quarkus-java-binary-s2i -n openshift -o jsonpath='{.status.tags[*].tag}{"\n"}'
8.2 8.2-hsm
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc describe is quarkus-java-binary-s2i -n openshift | grep -B4 -E 'e2c350a5|ddff87db'
  tagged from quay.io/quarkus/ubi-quarkus-native-binary-s2i:22.3-java17

  ! error: Import failed (NotFound): dockerimage.image.openshift.io "quay.io/quarkus/ubi-quarkus-native-binary-s2i:22.3-java17" not found
      7 months ago
  * image-registry.openshift-image-registry.svc:5000/openshift/quarkus-java-binary-s2i@sha256:ddff87dbc8186441c32fdbc2a030bcabd00616434479e3ad7b04e86c9a42fdc6
-sh-4.2$ oc get pod -n build-images-ads | grep java-check
java-check-8-2   0/1       ImagePullBackOff   0          60m
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc delete pod java-check-8-2 -n build-images-ads --ignore-not-found
pod "java-check-8-2" deleted
-sh-4.2$
