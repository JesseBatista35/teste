
-sh-4.2$
-sh-4.2$ oc create configmap sso-des-ca-bundle \
>   --from-file=ca-bundle.pem=$HOME/login-des-caixa-chain.pem \
>   -n sisou-des
configmap/sso-des-ca-bundle created
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$   oc get configmap sso-des-ca-bundle -n sisou-des
NAME                DATA      AGE
sso-des-ca-bundle   1         7s
-sh-4.2$
-sh-4.2$
-sh-4.2$

