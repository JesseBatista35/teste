
NAME                                                  READY     STATUS             RESTARTS        AGE
sipcs-digital-pay-provisionamento-visa-des-10-4h6r5   0/1       CrashLoopBackOff   6 (2m42s ago)   8m40s
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n sipcs-des -l name=sipcs-digital-pay-provisionamento-visa-des
NAME                                                  READY     STATUS             RESTARTS      AGE
sipcs-digital-pay-provisionamento-visa-des-10-m8fkb   0/1       CrashLoopBackOff   1 (18s ago)   21s
sipcs-digital-pay-provisionamento-visa-des-17-dmq9x   0/1       Running            0             10s
-sh-4.2$ oc exec -n sipcs-des sipcs-digital-pay-provisionamento-visa-des-17-dmq9x  -- curl -s -o /dev/null -w "path sem /q/: %{http_code}\n" http://localhost:8080/cartoes/cartao-credito/digital-pay/provisionamento/visa/health/live
path sem /q/: 404
-sh-4.2$ oc exec -n sipcs-des sipcs-digital-pay-provisionamento-visa-des-17-dmq9x  -- curl -s -o /dev/null -w "path com /q/: %{http_code}\n" http://localhost:8080/cartoes/cartao-credito/digital-pay/provisionamento/visa/q/health/live
path com /q/: 404
-sh-4.2$
