
-sh-4.2$ oc get project sipsc-des
No resources found.
Error from server (NotFound): namespaces "sipsc-des" not found
-sh-4.2$ oc get project sipcs-des
NAME        DISPLAY NAME   STATUS
sipcs-des                  Active
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sipcs-digital-pay-provisionamento-visa-des -n sipcs-des -o yaml | grep -A15 "livenessProbe|readinessProbe"
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh sipcs-digital-pay-provisionamento-visa-des-14-sx9jc
Error from server (NotFound): pods "sipcs-digital-pay-provisionamento-visa-des-14-sx9jc" not found
-sh-4.2$ curl -s -o /dev/null -w "%{http_code}\n" http://localhost:8080/cartoes/cartao-credito/digital-pay/provisionamento/visa/q/health/live
000
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh sipcs-digital-pay-provisionamento-visa-des-16-m66cr\
>   curl -s -o /dev/null -w "%{http_code}\n" http://localhost:8080/cartoes/cartao-credito/digital-pay/provisionamento/visa/q/health/live
Error from server (NotFound): pods "sipcs-digital-pay-provisionamento-visa-des-16-m66cr" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh sipcs-digital-pay-provisionamento-visa-des-16-m66cr curl -s -o /dev/null -w "%{http_code}\n" http://localhost:8080/cartoes/cartao-credito/digital-pay/provisionamento/visa/q/health/live
Error from server (NotFound): pods "sipcs-digital-pay-provisionamento-visa-des-16-m66cr" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
