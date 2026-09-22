G=http://selenium-router.selenium-grid.svc:4444
C="curl -s --noproxy * -H Content-Type:application/json"

S=$($C -X POST $G/session -d '{"capabilities":{"alwaysMatch":{"browserName":"firefox","acceptInsecureCerts":true}}}' \
  | grep -o '"sessionId":"[^"]*"' | cut -d'"' -f4); echo "sessao=$S"

$C -X POST $G/session/$S/timeouts -d '{"pageLoad":30000}'; echo
time $C -X POST $G/session/$S/url -d '{"url":"https://logindes.caixa.gov.br/"}'; echo
$C -X POST $G/session/$S/execute/sync -d '{"script":"return [document.readyState, document.title, location.href]","args":[]}'; echo
$C -X DELETE $G/session/$S; echo
