oc exec -it pod/sispl-consulta-transacao-ocp4-tqs-16-8jlt8 -n sispl-tqs -- \
keytool -list -v -keystore /deployments/caixa-truststore-acteste-nprd.jks \
-storepass changeit | grep -i logintqs
