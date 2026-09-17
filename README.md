oc get netnamespace sicbp-des -o yaml

oc get pod -l name=sicbp-trilha-api-des -n sicbp-des -o wide

oc get node <nome-do-node> -o wide
