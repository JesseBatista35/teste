NOPROXY=".caixa,.caixa.gov.br,.corecaixa,.local,.svc,localhost,127.0.0.1,10.0.0.0/8,25.0.0.0/8"
for dc in chrome firefox edge; do
  oc -n selenium-grid set env dc/$dc \
    HTTP_PROXY=http://proxyprd.caixa:80  http_proxy=http://proxyprd.caixa:80 \
    HTTPS_PROXY=http://proxyprd.caixa:80 https_proxy=http://proxyprd.caixa:80 \
    NO_PROXY="$NOPROXY" no_proxy="$NOPROXY"
done


oc -n selenium-grid get pods -w          # aguardar chrome-4, firefox-5, edge-4 em Running
oc -n selenium-grid set env dc/firefox --list | grep -i proxy

POD=$(oc -n selenium-grid get pods -l deploymentconfig=firefox -o name | head -1)
oc -n selenium-grid rsh $POD curl -s -o /dev/null -w '%{http_code}\n' --max-time 15 https://cdn.perfdrive.com/                   # esperado 200, sem -x
oc -n selenium-grid rsh $POD curl -s -o /dev/null -w '%{http_code}\n' --max-time 15 https://logindes.caixa.gov.br/              # deve responder direto (no_proxy)
