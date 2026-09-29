# 1. Motivo exato do pull (o describe cortou os eventos por causa do cliente antigo)
oc get events --sort-by=.lastTimestamp | grep -i frontend | tail -15

# 2. Imagem que a DC referencia e se ela ainda existe
oc get dc sipar-inter-frontend-des -o yaml | grep -i -B2 -A6 "image"
oc get is -n openshift | grep -i httpd
oc get istag -n openshift | grep -i httpd

# 3. O vhost SSL do Apache: procurar SSLVerifyClient, SSLCACertificateFile, ProxyPass/AJP
oc get cm default-virtualhost-ssl-conf-sipar-inter-frontend -o yaml

# 4. Confirmar para qual porta a rota "web" aponta (8080 ou 8443)
oc get svc sipar-inter-frontend-des -o yaml | grep -A12 "ports:"
