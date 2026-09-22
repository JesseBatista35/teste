
seluser@firefox-5-26gvg:/$ for B in chrome MicrosoftEdge; do
  echo "=== $B ==="
  S=$(curl -s -X POST $G/session -H 'Content-Type: application/json' \
    -d "{\"capabilities\":{\"alwaysMatch\":{\"browserName\":\"$B\",\"acceptInsecureCerts\":true}}}" \
    | grep -o '"sessionId" *: *"[^"]*"' | cut -d'"' -f4); echo "sessao=$S"
  curl -s -X POST $G/session/$S/timeouts -H 'Content-Type: application/json' -d '{"pageLoad":30000}' >/dev/null
  time curl -s -X POST $G/session/$S/url -H 'Content-Type: application/json' -d '{"url":"https://cdn.perfdrive.com/"}' | head -c 300; echo
  curl -s -X POST $G/session/$S/execute/sync -H 'Content-Type: application/json' \
    -d '{"script":"return [document.readyState, document.documentElement.outerHTML.substring(0,120)]","args":[]}'; echo
  curl -s -X DELETE $G/session/$S >/dev/null
done
=== chrome ===
sessao=69bc785b10d1723aaaeb521b733120b1
{"value":null}
real    0m0.328s
user    0m0.004s
sys     0m0.004s

{"value":["complete","\u003Chtml xmlns=\"http://www.w3.org/1999/xhtml\">\u003Chead>\u003Cstyle id=\"xml-viewer-style\">/* Copyright 2014 The Chromium Authors\n * "]}
=== MicrosoftEdge ===
sessao=4eb13b26082b6c0bebeba2f19bf54f40
{"value":null}
real    0m0.369s
user    0m0.003s
sys     0m0.006s

{"value":["complete","\u003Chtml xmlns=\"http://www.w3.org/1999/xhtml\">\u003Chead>\u003Cstyle id=\"xml-viewer-style\">/* Copyright 2014 The Chromium Authors\n * "]}
seluser@firefox-5-26gvg:/$
