
-sh-4.2$
-sh-4.2$ oc image extract image-registry.openshift-image-registry.svc:5000/build-images-ads/sihdg-jboss8@sha256:a65a6044971a37d4b6b74e9611365a0e6053fe1ecadd33c31c35922fa2b9d0d4 \
>   --path /opt/server/modules/system/layers/base/org/jboss/as:/tmp/modulos-jboss-as \
>   -n build-images-ads
error: invalid argument: stat /tmp/modulos-jboss-as: no such file or directory
-sh-4.2$ ls /tmp/modulos-jboss-as
ls: não é possível acessar /tmp/modulos-jboss-as: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc image extract image-registry.openshift-image-registry.svc:5000/build-images-ads/sihdg-jboss8@sha256:a65a6044971a37d4b6b74e9611365a0e6053fe1ecadd33c31c35922fa2b9d0d4 \
>   --path /opt/server/standalone/configuration/standalone.xml:/tmp/verificacao \
>   -n build-images-ads
error: invalid argument: stat /tmp/verificacao: no such file or directory
-sh-4.2$ cat /tmp/verificacao/standalone.xml | grep -A40 "<extensions>"
cat: /tmp/verificacao/standalone.xml: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
