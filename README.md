mkdir -p ~/bkp-sipar-wo81742301 && cd ~/bkp-sipar-wo81742301
oc get dc sipar-inter-frontend-des -o yaml > dc-frontend.yaml
oc get cm default-virtualhost-ssl-conf-sipar-inter-frontend -o yaml > cm-vhost.yaml
oc get svc sipar-inter-frontend-des -o yaml > svc-frontend.yaml
oc get route sipar-inter-frontend-des -o yaml > route-frontend.yaml
ls -l
