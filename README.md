
-sh-4.2$ oc delete route integra.iniciadora -n siinp-tqs
route.route.openshift.io "integra.iniciadora" deleted
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc create route edge integra.iniciadora \
>   --service=siinp-nucleo-tqs \
>   --hostname=integra.iniciadora.caixa.gov.br \
>   --path=/ \
>   -n siinp-tqs
route.route.openshift.io/integra.iniciadora created
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
