
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
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set volume dc/sibec-arquivos-tqs -n sibec-tqs --remove --name=sibec-arquivos-data-tqs
deploymentconfig.apps.openshift.io/sibec-arquivos-tqs volume updated
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc delete pvc sibec-arquivos-data-tqs -n sibec-tqs
persistentvolumeclaim "sibec-arquivos-data-tqs" deleted
^C
-sh-4.2$ oc delete pv sibec-arquivos-data-tqs
persistentvolume "sibec-arquivos-data-tqs" deleted
^C
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sibec-arquivos-tqs -n sibec-tqs -o jsonpath='{range .spec.template.spec.containers[*].volumeMounts[*]}{.name}{" -> "}{.mountPath}{"\n"}{end}'
secrets -> /usr/src/app/secrets_files
sibec-arquivos-nfs-data-tqs -> /sibec
caixa-truststore-acteste-nprd -> /deployments/caixa-truststore-acteste-nprd.jks
-sh-4.2$
