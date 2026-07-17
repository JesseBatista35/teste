
-sh-4.2$
-sh-4.2$ oc registry login --to=$HOME/.docker/config.json oc image extract default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sihdg-jboss8@sha256:a65a6044971a37d4b6b74e9611365a0e6053fe1ecadd33c31c35922fa2b9d0d4
info: Using internal registry hostname image-registry.openshift-image-registry.svc:5000
error: unable to check your credentials - pass --skip-check to bypass this error: Get https://image-registry.openshift-image-registry.svc:5000/v2/: dial tcp: lookup image-registry.openshift-image-registry.svc on 10.122.150.12:53: no such host
-sh-4.2$ --path /opt/server/standalone/configuration/standalone.xml:$HOME/verificacao
-sh: --path: comando não encontrado
-sh-4.2$ -n build-images-ads
-sh: -n: comando não encontrado
-sh-4.2$ --insecure=true
-sh: --insecure=true: comando não encontrado
-sh-4.2$ --registry-config=$HOME/.docker/config.json
-sh: --registry-config=/home/p585600/.docker/config.json: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
