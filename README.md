oc -n selenium-grid rsh firefox-5-26gvg bash


unset http_proxy https_proxy HTTP_PROXY HTTPS_PROXY
G=http://selenium-router.selenium-grid.svc:4444
curl -s $G/status | head -c 300; echo
