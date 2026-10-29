oc get pv sibec-arquivos-data-tqs -o jsonpath='{.spec.nfs}{"\n"}'
oc rsh -n sibec-tqs $(oc get pods -n sibec-tqs -o name | grep arquivos-tqs | grep -v deploy | head -1) sh -c 'env | grep -i filestore.path.servidor'
