# 1) Pod novo (deve ser o -253-xxxxx, Running 1/1)
oc get pod -n sisou-des -l name=sisou-sac-okd-des
POD=<nome-do-pod-novo>

# 2) Confirmar que o arquivo no pod é o que você gerou (hash tem que ser 3ce3284e...151d)
oc exec -n sisou-des $POD -c sisou-sac-okd-des -- \
  sha256sum /opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd-sisou-20261126.jks

# 3) Confirmar a raiz da Amazon no truststore em uso (esperado: 40 entradas + Amazon Root CA 1)
oc exec -n sisou-des $POD -c sisou-sac-okd-des -- keytool -list -v -storepass changeit \
  -keystore /opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd-sisou-20261126.jks \
  | grep -E "contains|Owner: CN=Amazon Root"

# 4) Confirmar que a JVM em execução está usando esse arquivo
oc exec -n sisou-des $POD -c sisou-sac-okd-des -- sh -c "ps -ef | grep -o 'trustStore=[^ ]*' | head -1"

# 5) Deploy concluído sem erro
oc logs -n sisou-des $POD -c sisou-sac-okd-des | grep -E "WFLYSRV0025|WFLYSRV0026|WFLYCTL0186|ERROR" | tail -20

# 6) Acompanhar a integração enquanto o dev testa
oc logs -f -n sisou-des $POD -c sisou-sac-okd-des | grep -i -E "indecx|PKIX|SSLHandshake"
