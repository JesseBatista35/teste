curl -v --max-time 10 $G/status 2>&1 | head -20

oc -n selenium-grid get svc
oc -n selenium-grid get route
