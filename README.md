oc -n selenium-grid get pods | grep -E 'chrome|firefox|edge'
oc -n selenium-grid rsh chrome-4-7h2xg curl -s -o /dev/null -w '%{http_code}\n' --max-time 15 https://cdn.perfdrive.com/
oc -n selenium-grid rsh edge-4-mdsbs  curl -s -o /dev/null -w '%{http_code}\n' --max-time 15 https://cdn.perfdrive.com/
