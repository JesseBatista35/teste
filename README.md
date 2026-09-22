
seluser@firefox-5-26gvg:/$ -sh-4.2$ S=$(curl -s -X POST $G/session -H 'Content-Type: application/json' \
  -d '{"capabilities":{"alwaysMatch":{"browserName":"firefox","acceptInsecureCerts":true}}}' \
  | grep -o '"sessionId" *: *"[^"]*"' | cut -d'"' -f4); echo "sessao=$S"
sessao=
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ curl -s -X POST $G/session/$S/timeouts -H 'Content-Type: application/json' -d '{"pageLoad":30000}'; echo
time curl -s -X POST $G/session/$S/url -H 'Content-Type: application/json' -d '{"url":"https://logindes.caixa.gov.br/"}'; echo
curl -s -X POST $G/session/$S/execute/sync -H 'Content-Type: application/json' -d '{"script":"return [document.readyState, document.title, location.href]","args":[]}'; echo
curl -s -X DELETE $G/session/$S; echo


real    0m0.008s
user    0m0.002s
sys     0m0.002s



-sh-4.2$
