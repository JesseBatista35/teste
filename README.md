oc get configmap sicfd-monitoramento-des-script-bt-check -n sicfd-des -o yaml


oc get dc sicfd-monitoramento-des -n sicfd-des -o jsonpath='{.spec.template.spec.initContainers[*].name}{"\n"}'
oc get dc sicfd-monitoramento-des -n sicfd-des -o yaml | grep -B2 -A 15 "initContainers:"

oc get dc sicfd-monitoramento-des -n sicfd-des -o yaml | grep -B2 -A 20 "^      volumes:"

oc rsh -n sicfd-des sicfd-monitoramento-des-90-w79z8

xxd /usr/src/app/secrets_files/SICFD_DES/SCFDRD01_ORACLE
wc -c /usr/src/app/secrets_files/SICFD_DES/SCFDRD01_ORACLE
