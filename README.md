S=$(curl -s -X POST $G/session -H 'Content-Type: application/json' \
  -d '{"capabilities":{"alwaysMatch":{"browserName":"firefox","acceptInsecureCerts":true}}}' \
  | grep -o '"sessionId" *: *"[^"]*"' | cut -d'"' -f4); echo "sessao=$S"
curl -s -X POST $G/session/$S/timeouts -H 'Content-Type: application/json' -d '{"pageLoad":30000}'; echo
time curl -s -X POST $G/session/$S/url -H 'Content-Type: application/json' -d '{"url":"https://cdn.perfdrive.com/"}' | head -c 300; echo
curl -s -X POST $G/session/$S/execute/sync -H 'Content-Type: application/json' \
  -d '{"script":"return [document.readyState, location.href, document.documentElement.outerHTML.substring(0,150)]","args":[]}'; echo
curl -s -X DELETE $G/session/$S; echo
