-4.2$
-sh-4.2$
-sh-4.2$ mkdir -p $HOME/verificacao
-sh-4.2$ oc image extract image-registry.openshift-image-registry.svc:5000/build-images-ads/sihdg-jboss8@sha256:a65a6044971a37d4b6b74e9611365a0e6053fe1ecadd33c31c35922fa2b9d0d4 \
>   --path /opt/server/standalone/configuration/standalone.xml:$HOME/verificacao \
>   -n build-images-ads
Unable to connect to the server: dial tcp: lookup image-registry.openshift-image-registry.svc on 10.122.150.12:53: no such host
-sh-4.2$ cat $HOME/verificacao/standalone.xml | grep -A40 "<extensions>"
cat: /home/p585600/verificacao/standalone.xml: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc image extract default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sihdg-jboss8@sha256:a65a6044971a37d4b6b74e9611365a0e6053fe1ecadd33c31c35922fa2b9d0d4 \
>   --path /opt/server/modules/system/layers/base/org/jboss/as:$HOME/modulos-jboss-as \
>   -n build-images-ads \
>   --insecure=true
error: unable to read image default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sihdg-jboss8@sha256:a65a6044971a37d4b6b74e9611365a0e6053fe1ecadd33c31c35922fa2b9d0d4: unauthorized: authentication required
-sh-4.2$ ls $HOME/modulos-jboss-as
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc image extract default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sihdg-jboss8@sha256:a65a6044971a37d4b6b74e9611365a0e6053fe1ecadd33c31c35922fa2b9d0d4 \
>   --path /opt/server/standalone/configuration/standalone.xml:$HOME/verificacao \
>   -n build-images-ads \
>   --insecure=true
error: unable to read image default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sihdg-jboss8@sha256:a65a6044971a37d4b6b74e9611365a0e6053fe1ecadd33c31c35922fa2b9d0d4: unauthorized: authentication required
-sh-4.2$ cat $HOME/verificacao/standalone.xml | grep -A40 "<extensions>"
cat: /home/p585600/verificacao/standalone.xml: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
