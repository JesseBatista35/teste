oc -n selenium-grid get pods | grep -E 'chrome-4|firefox-5|edge-4'
echo $POD

oc -n selenium-grid rsh firefox-5-26gvg env | grep -i proxy
oc -n selenium-grid rsh firefox-5-26gvg curl -s -o /dev/null -w '%{http_code}\n' --max-time 15 https://cdn.perfdrive.com/
oc -n selenium-grid rsh firefox-5-26gvg curl -sk -o /dev/null -w '%{http_code}\n' --max-time 15 https://logindes.caixa.gov.br/
