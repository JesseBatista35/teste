oc debug simpi-dict-api-des-137-wc8pc -n simpi-des

# 1) o secret existe e tem tamanho plausível?
ls -l /usr/src/app/secrets_files/SIMPI_DES/
wc -c /usr/src/app/secrets_files/SIMPI_DES/SIMPI_USER_KEYSTORE

# 2) a senha do cofre abre o p12 da imagem?
keytool -list -storetype PKCS12 \
  -keystore /deployments/sispi_user_keystore_kafka_des.p12 \
  -storepass:file /usr/src/app/secrets_files/SIMPI_DES/SIMPI_USER_KEYSTORE

# 3) integridade do arquivo
sha256sum /deployments/sispi_user_keystore_kafka_des.p12

