bash

oc create route edge integra.iniciadora \
  --service=siinp-nucleo-tqs \
  --hostname=integra.iniciadora.caixa.gov.br \
  --path=/ \
  -n siinp-tqs


Depois teste:
bash


curl -v -X POST https://integra.iniciadora.caixa.gov.br/inic-pagto/nucleo/v1/jornada \
  -H "Content-Type: application/json" \
  -d '{"valor": "25.00"}' -k


  
Dessa vez deve retornar 401 Unauthorized (que é correto - precisa de autenticação), não 405! 🎉
Manda aí o resultado! 👊





-sh-4.2$ oc create route edge integra.iniciadora \
>   --service=siinp-nucleo-tqs \
>   --hostname=integra.iniciadora.caixa.gov.br \
>   --path=/ \
>   -n siinp-tqs
Error from server (AlreadyExists): routes.route.openshift.io "integra.iniciadora" already exists
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
