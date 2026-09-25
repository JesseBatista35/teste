
sh-4.4$
sh-4.4$ exit
exit

Removing debug pod ...
-sh-4.2$ oc debug sijur-middleware-backend-v2-des-35-bcrxs -n sijur-des -- sleep 900 </dev/null >/dev/null 2>&1 &
[1] 113618
-sh-4.2$
[1]+  Concluído(1)           oc debug sijur-middleware-backend-v2-des-35-bcrxs -n sijur-des -- sleep 900 < /dev/null > /dev/null 2>&1
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod sijur-middleware-backend-v2-des-35-bcrxs-debug -n sijur-des
No resources found.
Error from server (NotFound): pods "sijur-middleware-backend-v2-des-35-bcrxs-debug" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc cp sijur-des/sijur-middleware-backend-v2-des-35-bcrxs-debug:/deployments/SIJUR-middleware-backend-v2.jar ./sijur-v2-35.jar
error: deployments/SIJUR-middleware-backend-v2.jar no such file or directory
-sh-4.2$
-sh-4.2$
-sh-4.2$ ls -lh sijur-v2-35.jar
ls: não é possível acessar sijur-v2-35.jar: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ unzip -l sijur-v2-35.jar | grep -i -E 'componentes|model/Log.class'
unzip:  cannot find or open sijur-v2-35.jar, sijur-v2-35.jar.zip or sijur-v2-35.jar.ZIP.
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get rc sijur-middleware-backend-v2-des-31 -n sijur-des -o jsonpath='{.spec.template.spec.containers[0].image}{"\n"}'
default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sijur-middleware-backend-v2:2.0.0.51
-sh-4.2$ oc get rc sijur-middleware-backend-v2-des-35 -n sijur-des -o jsonpath='{.spec.template.spec.containers[0].image}{"\n"}'
default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sijur-middleware-backend-v2:2.0.0.56
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc delete pod sijur-middleware-backend-v2-des-35-bcrxs-debug -n sijur-des
Error from server (NotFound): pods "sijur-middleware-backend-v2-des-35-bcrxs-debug" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
