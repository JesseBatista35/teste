
-sh-4.2$ oc set env dc/sigfa-api-aplicacao-okd4-pos-tqs --list -n sigfa-tqs | grep -i client_id
TOKEN_CLIENT_ID=cli-ser-gfa
-sh-4.2$ oc get secret <nome-do-secret-bt> -n sigfa-tqs -o yaml
-sh: nome-do-secret-bt: Arquivo ou diretório não encontrado
-sh-4.2$
