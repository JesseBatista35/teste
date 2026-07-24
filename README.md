oc exec -n sipcs-des sipcs-digital-pay-provisionamento-visa-des-17-dmq9x -- curl -s -o /dev/null -w "porta 9000 /q/health/live: %{http_code}\n" http://localhost:9000/q/health/live


oc exec -n sipcs-des sipcs-digital-pay-provisionamento-visa-des-17-dmq9x -- curl -s -o /dev/null -w "raiz: %{http_code}\n" http://localhost:8080/


oc exec -n sipcs-des sipcs-digital-pay-provisionamento-visa-des-17-dmq9x -- curl -s http://localhost:8080/q/openapi 2>&1 | head -30


oc exec -n sipcs-des sipcs-digital-pay-provisionamento-visa-des-17-dmq9x -- env | grep -iE "QUARKUS_HTTP|QUARKUS_MANAGEMENT|ROOT_PATH"
