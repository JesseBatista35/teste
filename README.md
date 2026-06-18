oc exec -it pod/sispl-consulta-transacao-ocp4-tqs-15-r82zf -n sispl-tqs -- \
keytool -list -v -keystore /deployments/caixa-truststore-acteste-nprd.jks \
-storepass changeit | grep -i logintqs
