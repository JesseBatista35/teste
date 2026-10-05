D=/usr/src/app/secrets_files/SIMPI_DES

for s in SIMPI_USER_KEYSTORE SIMPI_KAFKA; do oc exec $P -c simpi-dict-api-des -- sha256sum $D/$s; done

for s in SIMPI_KAFKA SIMPI_KAFKA_TRUSTSTORE SIMPI_KSPIX_01; do
  echo "== $s"
  oc exec $P -c simpi-dict-api-des -- keytool -list -storetype PKCS12 \
    -keystore /deployments/sispi_user_keystore_kafka_des.p12 -storepass:file $D/$s 2>&1 | head -2
done

oc logs $P -c simpi-dict-api-des | grep -i -m5 -E "SRMSG|keystore"
