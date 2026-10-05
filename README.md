-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ P=simpi-dict-api-des-135-2l458
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $P -c simpi-dict-api-des -- env | grep -i KAFKA
TRUST_STORE_KAFKA_PASSWORD=${SIMPI_KAFKA_TRUSTSTORE}
KAFKA_BOOTSTRAP_SERVER=development-kafka-bootstrap-cp4i.apps.pixnprd4.caixa
TRUST_STORE_KAFKA_LOCATION=/deployments/keystore_event_streams.p12
KAFKA_BOOTSTRAP_PORT=443
KAFKA_PASS=${SIMPI_KAFKA}
KEY_STORE_KAFKA_CLIENT_LOCATION=/deployments/sispi_user_keystore_kafka_des.p12
KEY_STORE_KAFKA_CLIENT_PASSWORD=${SIMPI_USER_KEYSTORE}
KAFKA_USER=mpiclient
-sh-4.2$ oc exec $P -c simpi-dict-api-des -- ls -l /deployments/ /usr/src/app/secrets_files/SIMPI_DES/
/deployments/:
total 41772
drwxr-xr-x. 2 root root       47 Oct  1 09:53 app
-rw-r--r--. 1 root root    39055 Oct  1 09:55 caixa-truststore-acteste-nprd.jks
-rw-r--r--. 1 root root     1702 Oct  1 09:55 keystore_event_streams.p12
drwxr-xr-x. 4 root root       30 Oct  1 09:53 lib
drwxr-xr-x. 2 root root       99 Oct  1 09:53 quarkus
-rw-r--r--. 1 root root    12400 Oct  1 09:53 quarkus-app-dependencies.txt
-rw-r--r--. 1 root root      709 Oct  1 09:53 quarkus-run.jar
-r-xr-----. 1 1001 root    20219 Oct  1 09:55 run-java.sh
-rw-r--r--. 1 root root     8342 Oct  1 09:55 simpi-des-keystore-082026.jks
-rw-r--r--. 1 root root     8337 Oct  1 09:55 simpi-des-keystore-092025.jks
-rw-r--r--. 1 root root    34101 Oct  1 09:55 simpi-des-truststore-202602.jks
-rw-r--r--. 1 root root 42622807 Oct  1 09:53 simpi-dict-api-20261001-0951-1-0-0-SNAPSHOT.zip
-rw-r--r--. 1 root root     2854 Oct  1 09:55 sispi_user_keystore_kafka_des.p12

/usr/src/app/secrets_files/SIMPI_DES/:
total 64
-rw-r--r--. 1 1337 root   7 Oct  1 09:55 SIMPI_ALIAS_CERT
-rw-r--r--. 1 1337 root 656 Oct  1 09:55 SIMPI_ALIAS_CERT_Metadata
-rw-r--r--. 1 1337 root 133 Oct  1 09:55 SIMPI_ISSUER_CERT
-rw-r--r--. 1 1337 root 652 Oct  1 09:55 SIMPI_ISSUER_CERT_Metadata
-rw-r--r--. 1 1337 root  32 Oct  1 09:55 SIMPI_KAFKA
-rw-r--r--. 1 1337 root 680 Oct  1 09:55 SIMPI_KAFKA_Metadata
-rw-r--r--. 1 1337 root  12 Oct  1 09:55 SIMPI_KAFKA_TRUSTSTORE
-rw-r--r--. 1 1337 root 691 Oct  1 09:55 SIMPI_KAFKA_TRUSTSTORE_Metadata
-rw-r--r--. 1 1337 root   9 Oct  1 09:55 SIMPI_KSPIX_01
-rw-r--r--. 1 1337 root 669 Oct  1 09:55 SIMPI_KSPIX_01_Metadata
-rw-r--r--. 1 1337 root  29 Oct  1 09:55 SIMPI_SN_CERT
-rw-r--r--. 1 1337 root 648 Oct  1 09:55 SIMPI_SN_CERT_Metadata
-rw-r--r--. 1 1337 root  32 Oct  1 09:55 SIMPI_USER_KEYSTORE
-rw-r--r--. 1 1337 root 657 Oct  1 09:55 SIMPI_USER_KEYSTORE_Metadata
-rw-r--r--. 1 1337 root   8 Oct  1 09:55 SMPISD01_HSM
-rw-r--r--. 1 1337 root 703 Oct  1 09:55 SMPISD01_HSM_Metadata
-sh-4.2$ oc exec $P -c simpi-dict-api-des -- sha256sum /deployments/sispi_user_keystore_kafka_des.p12
e7101a164f46384c2bf1d0596c1ed6cdaabb7d16b99a2993548791470a8b280f  /deployments/sispi_user_keystore_kafka_des.p12
-sh-4.2$ oc exec $P -c simpi-dict-api-des -- keytool -list -storetype PKCS12 \
>   -keystore /deployments/sispi_user_keystore_kafka_des.p12 \
>   -storepass:file /usr/src/app/secrets_files/SIMPI_DES/SIMPI_USER_KEYSTORE
keytool error: java.io.IOException: keystore password was incorrect
command terminated with exit code 1
-sh-4.2$
-sh-4.2$
-sh-4.2$
