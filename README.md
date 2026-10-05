P=simpi-dict-api-des-135-2l458
oc exec $P -c simpi-dict-api-des -- env | grep -i KAFKA
oc exec $P -c simpi-dict-api-des -- ls -l /deployments/ /usr/src/app/secrets_files/SIMPI_DES/
oc exec $P -c simpi-dict-api-des -- sha256sum /deployments/sispi_user_keystore_kafka_des.p12
oc exec $P -c simpi-dict-api-des -- keytool -list -storetype PKCS12 \
  -keystore /deployments/sispi_user_keystore_kafka_des.p12 \
  -storepass:file /usr/src/app/secrets_files/SIMPI_DES/SIMPI_USER_KEYSTORE


  # imagem de cada revisão
oc get rc simpi-dict-api-des-135 simpi-dict-api-des-137 \
  -o custom-columns=RC:.metadata.name,IMG:.spec.template.spec.containers[*].image

# diferença de variáveis/volumes
diff <(oc get rc simpi-dict-api-des-135 -o yaml | sed -n '/template:/,$p') \
     <(oc get rc simpi-dict-api-des-137 -o yaml | sed -n '/template:/,$p')


     oc debug rc/simpi-dict-api-des-137 -c simpi-dict-api-des -- \
  sha256sum /deployments/sispi_user_keystore_kafka_des.p12

  
