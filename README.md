oc exec -n sipcs-des sipcs-digital-pay-provisionamento-visa-des-17-dmq9x -- curl -s -o /dev/null -w "path correto: %{http_code}\n" http://localhost:8080/q/health/live


oc exec -n sipcs-des sipcs-digital-pay-provisionamento-visa-des-17-dmq9x -- curl -s -o /dev/null -w "path correto ready: %{http_code}\n" http://localhost:8080/q/health/ready
