
-sh-4.2$ oc get events -n simpi-des --sort-by='.lastTimestamp' | grep -i dict-api | tail -30
F0817 12:17:19.935587   31028 sorter.go:306] Field {.lastTimestamp} in *unstructured.Unstructured is an unsortable type: interface, err: unsortable type: <nil>
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout latest dc/simpi-dict-api-des -n simpi-des
deploymentconfig.apps.openshift.io/simpi-dict-api-des rolled out
-sh-4.2$
-sh-4.2$
-sh-4.2$ for i in $(seq 1 60); do
>   POD=$(oc get pod -n simpi-des -l deploymentconfig=simpi-dict-api-des --sort-by=.metadata.creationTimestamp -o jsonpath='{.items[-1:].metadata.name}' 2>/dev/null)
>   if [ -n "$POD" ]; then
>     STATUS=$(oc get pod $POD -n simpi-des -o jsonpath='{.status.phase}' 2>/dev/null)
>     echo "pod=$POD status=$STATUS"
>     if [ "$STATUS" = "Running" ]; then
>       oc exec $POD -c simpi-dict-api-des -n simpi-des -- sh -c 'echo VAULT_LOCATION=$VAULT_LOCATION; echo ---; ls -la $VAULT_LOCATION 2>&1; echo ---; find /usr/src/app/secrets_files -type f 2>&1' && break
>     fi
>   fi
>   sleep 1
> done
pod=simpi-dict-api-des-13-zdvhm status=Running
error: unable to upgrade connection: container not found ("simpi-dict-api-des")
pod=simpi-dict-api-des-13-zdvhm status=Running

error: unable to upgrade connection: container not found ("simpi-dict-api-des")
pod=simpi-dict-api-des-13-zdvhm status=Running
error: unable to upgrade connection: container not found ("simpi-dict-api-des")
pod=simpi-dict-api-des-13-zdvhm status=Running
error: unable to upgrade connection: container not found ("simpi-dict-api-des")
pod=simpi-dict-api-des-13-zdvhm status=Running
error: unable to upgrade connection: container not found ("simpi-dict-api-des")
pod=simpi-dict-api-des-13-zdvhm status=Running
VAULT_LOCATION=
---
total 39024
drwxrwxr-x. 1 1001 root      142 Aug 17 12:18 .
dr-xr-xr-x. 1 root root       47 Aug 17 12:18 ..
drwxr-xr-x. 2 185  root       47 Aug 14 16:22 app
-rw-r--r--. 1 root root    39055 Aug 17 12:17 caixa-truststore-acteste-nprd.jks
drwxr-xr-x. 4 185  root       30 Aug 14 16:22 lib
drwxr-xr-x. 2 185  root       99 Aug 14 16:22 quarkus
-rw-r--r--. 1 185  root    11850 Aug 14 16:22 quarkus-app-dependencies.txt
-rw-r--r--. 1 185  root      705 Aug 14 16:22 quarkus-run.jar
-r-xr-----. 1 185  root    20219 Aug 17 12:18 run-java.sh
-rw-r--r--. 1 root root     8337 Aug 17 12:17 simpi-des-keystore-092025.jks
-rw-r--r--. 1 root root    34101 Aug 17 12:17 simpi-des-truststore-202602.jks
-rw-r--r--. 1 185  root 39831537 Aug 14 16:22 simpi-dict-api-20260814-1621-1-0-0-SNAPSHOT.zip
---
/usr/src/app/secrets_files/SIMPI_DES/SIMPI_KSPIX_01
/usr/src/app/secrets_files/SIMPI_DES/SIMPI_KSPIX_01_Metadata
/usr/src/app/secrets_files/SIMPI_DES/SIMPI_ISSUER_CERT
/usr/src/app/secrets_files/SIMPI_DES/SIMPI_ISSUER_CERT_Metadata
/usr/src/app/secrets_files/SIMPI_DES/SIMPI_SN_CERT
/usr/src/app/secrets_files/SIMPI_DES/SIMPI_SN_CERT_Metadata
/usr/src/app/secrets_files/SIMPI_DES/SIMPI_ALIAS_CERT
/usr/src/app/secrets_files/SIMPI_DES/SIMPI_ALIAS_CERT_Metadata
/usr/src/app/secrets_files/SIMPI_DES/SMPISD01_HSM
/usr/src/app/secrets_files/SIMPI_DES/SMPISD01_HSM_Metadata
-sh-4.2$
-sh-4.2$
