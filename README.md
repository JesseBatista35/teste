


-sh-4.2$ oc -n selenium-grid rsh firefox-5-26gvg bash
To run a command as administrator (user "root"), use "sudo <command>".
See "man sudo_root" for details.

WARNING: Very high value reported by "ulimit -n". Consider passing "--ulimit nofile=32768" to "docker run".
seluser@firefox-5-26gvg:/$
seluser@firefox-5-26gvg:/$
seluser@firefox-5-26gvg:/$
seluser@firefox-5-26gvg:/$ unset http_proxy https_proxy HTTP_PROXY HTTPS_PROXY
G=http://selenium-router.selenium-grid.svc:8080
curl -s -X POST $G/session -H 'Content-Type: application/json' \
  -d '{"capabilities":{"alwaysMatch":{"browserName":"firefox","acceptInsecureCerts":true}}}' > /tmp/sess.json
head -c 400 /tmp/sess.json; echo
S=$(grep -o '"sessionId" *: *"[^"]*"' /tmp/sess.json | cut -d'"' -f4); echo "sessao=$S"
{
  "value": {
    "sessionId": "28c23cbb-6430-416e-b9b8-61f587ff3c52",
    "capabilities": {
      "acceptInsecureCerts": true,
      "browserName": "firefox",
      "browserVersion": "122.0",
      "moz:accessibilityChecks": false,
      "moz:buildID": "20240118164516",
      "moz:geckodriverVersion": "0.34.0",
      "moz:headless": false,
      "moz:platformVersion": "5.18.5-100.fc35.x86_64",

sessao=28c23cbb-6430-416e-b9b8-61f587ff3c52
seluser@firefox-5-26gvg:/$
