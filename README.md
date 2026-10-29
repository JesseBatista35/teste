
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pv sibec-arquivos-data-tqs -o jsonpath='{.spec.nfs}{"\n"}'
map[server:nprdnfs01.ad.caixa path:/fs_sibec_des_nprd]
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh -n sibec-tqs $(oc get pods -n sibec-tqs -o name | grep arquivos-tqs | grep -v deploy | head -1) sh -c 'env | grep -i filestore.path.servidor'
FILESTORE_PATH_SERVIDOR=/sibec
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
