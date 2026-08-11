
-sh-4.2$ oc rsh -n siavl-des siavl-gerencial-frontend-des-5-z86kg
Error from server (NotFound): pods "siavl-gerencial-frontend-des-5-z86kg" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ls -la /opt/app-root/src/
ls: não é possível acessar /opt/app-root/src/: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get is siavl-gerencial-frontend -n build-images-ads -o jsonpath='{range .status.tags[*]}{.tag}{" -> "}{.items[0].image}{"\n"}{end}'
Error from server (NotFound): imagestreams.image.openshift.io "siavl-gerencial-frontend" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
