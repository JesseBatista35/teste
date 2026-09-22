-sh-4.2$ oc -n selenium-grid get pods | grep -E 'chrome|firefox|edge'
chrome-2-deploy                  0/1       Completed   0          395d
chrome-3-deploy                  0/1       Completed   0          376d
chrome-4-7h2xg                   1/1       Running     0          4m31s
chrome-4-deploy                  0/1       Completed   0          4m47s
edge-2-deploy                    0/1       Completed   0          395d
edge-3-deploy                    0/1       Completed   0          376d
edge-4-deploy                    0/1       Completed   0          4m47s
edge-4-mdsbs                     1/1       Running     0          4m31s
firefox-2-deploy                 0/1       Completed   0          395d
firefox-3-deploy                 0/1       Completed   0          376d
firefox-4-deploy                 0/1       Completed   0          4h2m
firefox-5-26gvg                  1/1       Running     0          4m31s
firefox-5-deploy                 0/1       Completed   0          4m47s
-sh-4.2$ oc -n selenium-grid rsh chrome-4-7h2xg curl -s -o /dev/null -w '%{http_code}\n' --max-time 15 https://cdn.perfdrive.com/
200
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc -n selenium-grid rsh edge-4-mdsbs  curl -s -o /dev/null -w '%{http_code}\n' --max-time 15 https://cdn.perfdrive.com/
200
-sh-4.2$
