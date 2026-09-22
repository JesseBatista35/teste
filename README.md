
seluser@firefox-5-26gvg:/$ S=$(curl -s -X POST $G/session -H 'Content-Type: application/json' \
  -d '{"capabilities":{"alwaysMatch":{"browserName":"firefox","acceptInsecureCerts":true}}}' \
  | grep -o '"sessionId" *: *"[^"]*"' | cut -d'"' -f4); echo "sessao=$S"
curl -s -X POST $G/session/$S/timeouts -H 'Content-Type: application/json' -d '{"pageLoad":30000}'; echo
time curl -s -X POST $G/session/$S/url -H 'Content-Type: application/json' -d '{"url":"https://cdn.perfdrive.com/"}' | head -c 300; echo
curl -s -X POST $G/session/$S/execute/sync -H 'Content-Type: application/json' \
  -d '{"script":"return [document.readyState, location.href, document.documentElement.outerHTML.substring(0,150)]","args":[]}'; echo
curl -s -X DELETE $G/session/$S; echo
sessao=f3bb7c36-2af1-48bd-8e86-ef24a0c18254
{"value":null}
{"value":null}
real    0m1.817s
user    0m0.002s
sys     0m0.005s

{"value":["complete","https://cdn.perfdrive.com/","<ListBucketResult xmlns=\"http://doc.s3.amazonaws.com/2006-03-01\"><Name>prod-ss-javascript-connector</Name><Prefix/><Marker/><IsTruncated>false</IsTrun"]}
{"value":null}
seluser@firefox-5-26gvg:/$
