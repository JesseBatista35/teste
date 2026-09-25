oc rsh -n selenium-grid dc/chrome curl -sv --max-time 15 -o /dev/null https://cdn.perfdrive.com/ 2>&1 | grep -iE "proxy|connected|HTTP/"


oc set env dc/edge dc/firefox -n selenium-grid --list | grep -i proxy
