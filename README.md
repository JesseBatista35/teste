
seluser@firefox-5-26gvg:/$
seluser@firefox-5-26gvg:/$
seluser@firefox-5-26gvg:/$ curl -s -X POST $G/session/$S/timeouts -H 'Content-Type: application/json' -d '{"pageLoad":30000}'; echo
time curl -s -X POST $G/session/$S/url -H 'Content-Type: application/json' -d '{"url":"https://logindes.caixa.gov.br/"}' | head -c 300; echo
curl -s -X POST $G/session/$S/execute/sync -H 'Content-Type: application/json' \
  -d '{"script":"return [document.readyState, document.title, location.href, performance.getEntriesByType(\"resource\").filter(r=>r.name.includes(\"perfdrive\")).map(r=>r.name+\" \"+Math.round(r.duration)+\"ms\")]","args":[]}'; echo
curl -s -X DELETE $G/session/$S; echo
{"value":null}
{"value":null}
real    0m1.147s
user    0m0.002s
sys     0m0.005s

{"value":["complete","Login CAIXA - Informe seu CPF","https://logindes.caixa.gov.br/auth/realms/internet/protocol/openid-connect/auth?response_type=code&client_id=cli-web-set-otp&redirect_uri=https%3A%2F%2Flogindes.caixa.gov.br%2Fregotp%2Facesso&state=a210fc75-62c5-4654-9fcf-620ec73f84d8&login=true&scope=openid",[]]}
{"value":null}
seluser@firefox-5-26gvg:/$
