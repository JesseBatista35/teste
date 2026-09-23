-sh-4.2$
-sh-4.2$
-sh-4.2$ oc project sicbp-tqs
Now using project "sicbp-tqs" on server "https://api.nprd.caixa:6443".
-sh-4.2$ oc set env dc/sicbp-avaliarisco-backend-tqs --list -n sicbp-tqs | grep -i swagger
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set env dc/sicbp-avaliarisco-backend-des --list -n sicbp-des | grep -i swagger
ENABLE_SWAGGER=FALSE
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc/sicbp-avaliarisco-backend-tqs -n sicbp-tqs -o jsonpath='{.spec.template.spec.containers[0].envFrom}'
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
