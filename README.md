
-sh-4.2$
-sh-4.2$ oc rsh firefox-3-rwpfb -n selenium-grid
ERRO[0000] exec failed: unable to start container process: exec: "-n": executable file not found in $PATH
command terminated with exit code 255
-sh-4.2$ oc get pods
NAME                             READY     STATUS      RESTARTS   AGE
chrome-2-deploy                  0/1       Completed   0          388d
chrome-3-deploy                  0/1       Completed   0          368d
chrome-3-wlvwr                   1/1       Running     0          368d
edge-2-deploy                    0/1       Completed   0          388d
edge-3-deploy                    0/1       Completed   0          368d
edge-3-ffdtk                     1/1       Running     0          368d
firefox-2-deploy                 0/1       Completed   0          388d
firefox-3-deploy                 0/1       Completed   0          368d
firefox-3-rwpfb                  1/1       Running     0          368d
selenium-distributor-1-8r8pg     1/1       Running     0          131d
selenium-event-bus-1-xlwdp       1/1       Running     0          412d
selenium-router-1-swksw          1/1       Running     0          412d
selenium-session-queue-1-6zztd   1/1       Running     0          131d
selenium-sessions-1-pnwn4        1/1       Running     0          33d
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh firefox-3-rwpfb -n selenium-grid
ERRO[0000] exec failed: unable to start container process: exec: "-n": executable file not found in $PATH
command terminated with exit code 255
-sh-4.2$
-sh-4.2$
-sh-4.2$
