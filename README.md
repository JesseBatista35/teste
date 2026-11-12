oc get dc -n siepr-des | grep -i bec3
oc set env dc/siepr-curso-bec3-frontend-des -n siepr-des --list | grep -E "^API_|HORARIO|SSO_|REALM"
