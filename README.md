oc -n selenium-grid rsh firefox-5-26gvg bash


unset http_proxy https_proxy HTTP_PROXY HTTPS_PROXY
G=http://selenium-router.selenium-grid.svc:8080
curl -s -X POST $G/session -H 'Content-Type: application/json' \
  -d '{"capabilities":{"alwaysMatch":{"browserName":"firefox","acceptInsecureCerts":true}}}' > /tmp/sess.json
head -c 400 /tmp/sess.json; echo
S=$(grep -o '"sessionId" *: *"[^"]*"' /tmp/sess.json | cut -d'"' -f4); echo "sessao=$S"
