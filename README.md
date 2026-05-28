mkdir -p /tmp/check-jar
oc image extract default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisgf-backend:20260528.1112-11.01.01.01-SNAPSHOT --path /deployments/lib/main/:/tmp/check-jar/ --insecure=true
ls -la /tmp/check-jar/
