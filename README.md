
-sh-4.2$
-sh-4.2$ D=/usr/src/app/secrets_files/SIMPI_DES
-sh-4.2$
-sh-4.2$ for s in SIMPI_USER_KEYSTORE SIMPI_KAFKA; do oc exec $P -c simpi-dict-api-des -- sha256sum $D/$s; done
bb877efb680c1ac6b142dbe4ad87929ac4af84f455e9ad2abbf8c5a75a03b75c  /usr/src/app/secrets_files/SIMPI_DES/SIMPI_USER_KEYSTORE
e1331b4a6bdf1206d18b5dffddc0019536918318c6f40c8b9c163a489b0a69ea  /usr/src/app/secrets_files/SIMPI_DES/SIMPI_KAFKA
-sh-4.2$
-sh-4.2$ for s in SIMPI_KAFKA SIMPI_KAFKA_TRUSTSTORE SIMPI_KSPIX_01; do
>   echo "== $s"
>   oc exec $P -c simpi-dict-api-des -- keytool -list -storetype PKCS12 \
>     -keystore /deployments/sispi_user_keystore_kafka_des.p12 -storepass:file $D/$s 2>&1 | head -2
> done
== SIMPI_KAFKA
keytool error: java.io.IOException: keystore password was incorrect
command terminated with exit code 1
== SIMPI_KAFKA_TRUSTSTORE
keytool error: java.io.IOException: keystore password was incorrect
command terminated with exit code 1
== SIMPI_KSPIX_01
keytool error: java.io.IOException: keystore password was incorrect
command terminated with exit code 1
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs $P -c simpi-dict-api-des | grep -i -m5 -E "SRMSG|keystore"
-sh-4.2$
