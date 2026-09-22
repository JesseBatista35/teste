oc -n selenium-grid rsh firefox-5-26gvg bash


unset http_proxy https_proxy HTTP_PROXY HTTPS_PROXY
G=http://selenium-router.selenium-grid.svc:8080
curl -s $G/status | head -c 300; echo

S=$(curl -s -X POST $G/session -H 'Content-Type: application/json' \
  -d '{"capabilities":{"alwaysMatch":{"browserName":"firefox","acceptInsecureCerts":true}}}' \
  | grep -o '"sessionId":"[^"]*"' | cut -d'"' -f4); echo "sessao=$S"

curl -s -X POST $G/session/$S/timeouts -H 'Content-Type: application/json' -d '{"pageLoad":30000}'; echo
time curl -s -X POST $G/session/$S/url -H 'Content-Type: application/json' -d '{"url":"https://logindes.caixa.gov.br/"}'; echo
curl -s -X POST $G/session/$S/execute/sync -H 'Content-Type: application/json' -d '{"script":"return [document.readyState, document.title, location.href]","args":[]}'; echo
curl -s -X DELETE $G/session/$S; echo
