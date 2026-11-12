
-sh-4.2$ oc get dc -n siepr-des | grep -i bec3
siepr-curso-bec3-frontend-des   17         1         1
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set env dc/siepr-curso-bec3-frontend-des -n siepr-des --list | grep -E "^API_|HORARIO|SSO_|REALM"
API_BASE_PATH=https://siepr-curso-bec3-frontend-des.apps.nprd.caixa
REALM=internet
SSO_BASE_PATH=https://logindes.caixa.gov.br/auth
SSO_CLIENT_ID=cli-web-epr
-sh-4.2$
