
seluser@firefox-5-26gvg:/$
seluser@firefox-5-26gvg:/$ S=$(curl -s -X POST $G/session -H 'Content-Type: application/json' \
  -d '{"capabilities":{"alwaysMatch":{"browserName":"firefox","acceptInsecureCerts":true}}}' \
  | grep -o '"sessionId" *: *"[^"]*"' | cut -d'"' -f4); echo "sessao=$S"
curl -s -X POST $G/session/$S/timeouts -H 'Content-Type: application/json' -d '{"pageLoad":30000}'; echo
time curl -s -X POST $G/session/$S/url -H 'Content-Type: application/json' -d '{"url":"https://sicbs-frontend-des.apps.nprd.caixa/"}' | head -c 300; echo
sleep 5
curl -s -X POST $G/session/$S/execute/sync -H 'Content-Type: application/json' \
  -d '{"script":"return [document.readyState, document.title, location.href, [...new Set(performance.getEntriesByType(\"resource\").map(r=>new URL(r.name).host))]]","args":[]}'; echo
curl -s -X DELETE $G/session/$S; echo
sessao=c60d62c9-e33e-4107-8b9b-35ed22f57841
{"value":null}
{"value":null}
real    0m2.454s
user    0m0.003s
sys     0m0.003s

{"value":["complete","Portal Cidadão","https://sicbs-frontend-des.apps.nprd.caixa/frontpage",["sicbs-frontend-des.apps.nprd.caixa"]]}
{"value":null}
seluser@firefox-5-26gvg:/$
seluser@firefox-5-26gvg:/$
seluser@firefox-5-26gvg:/$
seluser@firefox-5-26gvg:/$
