
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh sibec-arquivos-des-210-hkjgk sh -c 'cp -p "/sibec/Manutencao/BECT.E2.BOD1.M09.C3001.P1466.A4312054.C.ZIP" "/sibec3/Manutencao/" && ls -ln /sibec/Manutencao/BECT.E2.BOD1.M09.C3001.P1466.A4312054.C.ZIP /sibec3/Manutencao/BECT.E2.BOD1.M09.C3001.P1466.A4312054.C.ZIP'
-rw-r-xr-x. 1 193291257 120 630 Sep 30 16:38 /sibec/Manutencao/BECT.E2.BOD1.M09.C3001.P1466.A4312054.C.ZIP
-rw-r-xr-x. 1       185  99 630 Sep 30 16:38 /sibec3/Manutencao/BECT.E2.BOD1.M09.C3001.P1466.A4312054.C.ZIP
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh -n sibec-des sibec-arquivos-des-210-hkjgk sh -c 'env | grep -i filestore.path.servidor'
FILESTORE_PATH_SERVIDOR=/sibec3
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sibec-arquivos-tqs -n sibec-tqs -o jsonpath='{range .spec.template.spec.containers[*].volumeMounts[*]}{.name}{" -> "}{.mountPath}{"\n"}{end}'
secrets -> /usr/src/app/secrets_files
sibec-arquivos-nfs-data-tqs -> /sibec
sibec-arquivos-data-tqs -> /sibec3
caixa-truststore-acteste-nprd -> /deployments/caixa-truststore-acteste-nprd.jks
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pvc -n sibec-tqs
NAME                          STATUS    VOLUME                        CAPACITY   ACCESS MODES   STORAGECLASS      AGE
sibec-arquivos-data-tqs       Bound     sibec-arquivos-data-tqs       50Gi       RWX                              58m
sibec-arquivos-nfs-data-tqs   Bound     sibec-arquivos-nfs-data-tqs   50Gi       RWX            rook-ceph-block   56m
sibec-data-tqs                Bound     sibec-data-tqs                10Gi       RWX                              637d
sibec-internet-data-tqs       Bound     sibec-internet-data-tqs       50Gi       RWX                              622d
-sh-4.2$
