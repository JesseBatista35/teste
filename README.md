curl -s -X POST $G/session/$S/timeouts -H 'Content-Type: application/json' -d '{"pageLoad":30000}'; echo
time curl -s -X POST $G/session/$S/url -H 'Content-Type: application/json' -d '{"url":"https://logindes.caixa.gov.br/"}' | head -c 300; echo
curl -s -X POST $G/session/$S/execute/sync -H 'Content-Type: application/json' \
  -d '{"script":"return [document.readyState, document.title, location.href, performance.getEntriesByType(\"resource\").filter(r=>r.name.includes(\"perfdrive\")).map(r=>r.name+\" \"+Math.round(r.duration)+\"ms\")]","args":[]}'; echo
curl -s -X DELETE $G/session/$S; echo
