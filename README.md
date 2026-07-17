oc get istag sihdg-jboss8:3.12.0.7 -n build-images-ads -o yaml

oc get builds -n build-images-ads | grep sihdg-jboss8
oc logs build/<nome-do-build> -n build-images-ads | grep -i "Cloning\|commit\|branch"

oc get bc sihdg-jboss8 -n build-images-ads -o yaml

oc image extract image-registry.openshift-image-registry.svc:5000/build-images-ads/sihdg-jboss8@<digest> --path /opt/server/standalone/configuration/standalone.xml:/tmp/verificacao -n build-images-ads
cat /tmp/verificacao/standalone.xml | grep -A2 connection-url

oc logs sihdg-jboss8-des-19-6r65j -n sihdg-des --previous | tail -100
