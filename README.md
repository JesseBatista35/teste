
-sh-4.2$
-sh-4.2$ oc get pod sihdg-jboss8-tqs-28-q6ngx -n sihdg-tqs -o jsonpath='{.spec.containers[0].image}{"\n"}'
default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sihdg-jboss8:3.17.0.0
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc run teste-egress -n sihdg-tqs --restart=Never --image=IMAGEM \
>   --overrides='{"spec":{"nodeName":"ceadecldlx077.nprd.caixa","containers":[{"name":"teste-egress","image":"IMAGEM","command":["sleep","600"]}]}}'
error: Invalid image name "IMAGEM": invalid reference format
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod teste-egress -n sihdg-tqs -o wide
No resources found.
Error from server (NotFound): pods "teste-egress" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh -n sihdg-tqs teste-egress
Error from server (NotFound): pods "teste-egress" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$


cara ta me drranod canceria ja
