
QUARKUS_OIDC_CLIENT_CREDENTIALS_SECRET
-sh-4.2$
-sh-4.2$
-sh-4.2$ for s in siacc-pixautomatico-api-simulador-tqs siacc-pixautomatico-api-controle-requisicoes-tqs; do
>   echo -n "$s: "
>   oc get secret $s -n siacc-tqs -o jsonpath='{.data.QUARKUS_DATASOURCE_PASSWORD}' | base64 -d | sha256sum
> done
siacc-pixautomatico-api-simulador-tqs: e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855  -
siacc-pixautomatico-api-controle-requisicoes-tqs: e86bebeb68fa08e553545d1317bc353d8c9ff957d65c813992f9b89152461e32  -
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get secret siacc-pixautomatico-api-controle-requisicoes-tqs -n siacc-tqs -o jsonpath='{.data.QUARKUS_DATASOURCE_PASSWORD}' | base64 -d; echo
DE65GHJU3
-sh-4.2$
-sh-4.2$
-sh-4.2$



precsa memso fazer isso entao ja quem vem do cofre?
