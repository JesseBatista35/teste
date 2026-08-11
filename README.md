oc rsh -n siavl-des siavl-gerencial-frontend-des-5-z86kg


ls -la /opt/app-root/src/


oc get is siavl-gerencial-frontend -n build-images-ads -o jsonpath='{range .status.tags[*]}{.tag}{" -> "}{.items[0].image}{"\n"}{end}'


