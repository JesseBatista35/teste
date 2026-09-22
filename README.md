$
-sh-4.2$
-sh-4.2$ oc -n selenium-grid rsh firefox-3-rwpfb \
>   curl -sv --max-time 15 -x http://proxydes.caixa:80 -o /dev/null https://cdn.perfdrive.com/
Error from server (NotFound): pods "firefox-3-rwpfb" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods
NAME                             READY     STATUS      RESTARTS   AGE
chrome-2-deploy                  0/1       Completed   0          395d
chrome-3-deploy                  0/1       Completed   0          376d
chrome-3-wlvwr                   1/1       Running     0          376d
edge-2-deploy                    0/1       Completed   0          395d
edge-3-deploy                    0/1       Completed   0          376d
edge-3-ffdtk                     1/1       Running     0          376d
firefox-2-deploy                 0/1       Completed   0          395d
firefox-3-deploy                 0/1       Completed   0          376d
firefox-4-deploy                 0/1       Completed   0          3h50m
firefox-4-n5rkq                  1/1       Running     0          3h50m
selenium-distributor-1-8r8pg     1/1       Running     0          139d
selenium-event-bus-1-xlwdp       1/1       Running     0          420d
selenium-router-2-76nqk          1/1       Running     0          3h56m
selenium-router-2-deploy         0/1       Completed   0          3h56m
selenium-session-queue-1-6zztd   1/1       Running     0          139d
selenium-sessions-1-pnwn4        1/1       Running     0          41d
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc -n selenium-grid rsh firefox-4-n5rkq   curl -sv --max-time 15 -x http://proxydes.caixa:80 -o /dev/null https://cdn.perfdrive.com/
*   Trying 10.252.32.63:80...
* After 7495ms connect time, move on!
* connect to 10.252.32.63 port 80 failed: Connection timed out
*   Trying 10.252.32.65:80...
* After 3746ms connect time, move on!
* connect to 10.252.32.65 port 80 failed: Connection timed out
* Failed to connect to proxydes.caixa port 80 after 11252 ms: Connection timed out
* Closing connection 0
command terminated with exit code 28
-sh-4.2$
