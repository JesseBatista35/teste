
-sh-4.2$ oc rsh sipcs-digital-pay-provisionamento-visa-des-16-m66cr
Error from server (NotFound): pods "sipcs-digital-pay-provisionamento-visa-des-16-m66cr" not found
-sh-4.2$ curl -s -o /dev/null -w "%{http_code}\n" http://localhost:8080/cartoes/cartao-credito/digital-pay/provisionamento/visa/q/health/live
000
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs sipcs-digital-pay-provisionamento-visa-des-10-4h6r5 -n sipcs-des --previous
unable to retrieve container logs for cri-o://8782400211fb0303e5e4060cba4edfe409ff214ec2975aefba46c3225390c55f-sh-4.2$
-sh-4.2$
-sh-4.2$


  
