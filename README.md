A release 25 com a SNAPSHOT passou. Antes de mandar o texto, rode as duas validações (1 minuto):

oc set env dc/siepr-curso-bec3-frontend-des -n siepr-des --list | grep -E "^API_|HORARIO"
curl -sk https://siepr-curso-bec3-frontend-des.apps.nprd.caixa/$(curl -sk https://siepr-curso-bec3-frontend-des.apps.nprd.caixa/ | grep -oE 'chunk-[A-Za-z0-9]+\.js' | head -1) | grep -c __API_
