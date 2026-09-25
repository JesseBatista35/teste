
-sh-4.2$ oc get pods -n selenium-grid
NAME                             READY     STATUS      RESTARTS   AGE
chrome-2-deploy                  0/1       Completed   0          398d
chrome-3-deploy                  0/1       Completed   0          378d
chrome-4-7h2xg                   1/1       Running     0          2d14h
chrome-4-deploy                  0/1       Completed   0          2d14h
edge-2-deploy                    0/1       Completed   0          398d
edge-3-deploy                    0/1       Completed   0          378d
edge-4-deploy                    0/1       Completed   0          2d14h
edge-4-mdsbs                     1/1       Running     0          2d14h
firefox-2-deploy                 0/1       Completed   0          398d
firefox-3-deploy                 0/1       Completed   0          378d
firefox-5-26gvg                  1/1       Running     0          2d14h
firefox-5-deploy                 0/1       Completed   0          2d14h
selenium-distributor-1-8r8pg     1/1       Running     0          141d
selenium-event-bus-1-xlwdp       1/1       Running     0          422d
selenium-router-2-d6swm          1/1       Running     0          2d1h
selenium-session-queue-1-6zztd   1/1       Running     0          141d
selenium-sessions-1-pnwn4        1/1       Running     0          43d
-sh-4.2$ oc rsh -n selenium-grid dc/chrome sh -c 'while true; do date +%T; df -h /dev/shm | tail -1; sleep 1; done'
13:12:51
shm              64M     0   64M   0% /dev/shm
13:12:52
shm              64M     0   64M   0% /dev/shm
13:12:53
shm              64M     0   64M   0% /dev/shm
13:12:54
shm              64M     0   64M   0% /dev/shm
13:12:55
shm              64M     0   64M   0% /dev/shm
13:12:56
shm              64M     0   64M   0% /dev/shm
13:12:57
shm              64M     0   64M   0% /dev/shm
13:12:58
shm              64M     0   64M   0% /dev/shm
13:12:59
shm              64M     0   64M   0% /dev/shm
13:13:00
shm              64M     0   64M   0% /dev/shm
13:13:01
shm              64M     0   64M   0% /dev/shm
13:13:02
shm              64M     0   64M   0% /dev/shm
13:13:03
shm              64M     0   64M   0% /dev/shm
13:13:04
shm              64M     0   64M   0% /dev/shm
13:13:05
shm              64M     0   64M   0% /dev/shm
13:13:06
shm              64M     0   64M   0% /dev/shm
13:13:07
shm              64M     0   64M   0% /dev/shm
13:13:08
shm              64M     0   64M   0% /dev/shm
13:13:09
shm              64M     0   64M   0% /dev/shm
13:13:10
shm              64M     0   64M   0% /dev/shm
13:13:11
shm              64M     0   64M   0% /dev/shm
13:13:12
shm              64M     0   64M   0% /dev/shm
13:13:13
shm              64M     0   64M   0% /dev/shm
13:13:14
shm              64M     0   64M   0% /dev/shm
13:13:15
shm              64M     0   64M   0% /dev/shm
13:13:16
shm              64M     0   64M   0% /dev/shm
13:13:17
shm              64M     0   64M   0% /dev/shm
13:13:18
shm              64M     0   64M   0% /dev/shm
13:13:19
shm              64M     0   64M   0% /dev/shm
13:13:20
shm              64M     0   64M   0% /dev/shm
13:13:21
shm              64M     0   64M   0% /dev/shm
13:13:22
shm              64M     0   64M   0% /dev/shm
13:13:23
shm              64M     0   64M   0% /dev/shm
13:13:24
shm              64M     0   64M   0% /dev/shm
13:13:25
shm              64M     0   64M   0% /dev/shm
13:13:26
shm              64M     0   64M   0% /dev/shm
13:13:27
shm              64M     0   64M   0% /dev/shm
13:13:28
shm              64M     0   64M   0% /dev/shm
13:13:29
shm              64M     0   64M   0% /dev/shm
13:13:30
shm              64M     0   64M   0% /dev/shm
13:13:31
shm              64M     0   64M   0% /dev/shm
13:13:32
shm              64M     0   64M   0% /dev/shm
13:13:33
shm              64M     0   64M   0% /dev/shm
13:13:34
shm              64M     0   64M   0% /dev/shm
13:13:35
shm              64M     0   64M   0% /dev/shm
^Ccommand terminated with exit code 130
-sh-4.2$ ChromeOptions options = new ChromeOptions();
-sh: erro de sintaxe próximo do `token' não esperado `('
-sh-4.2$ options.addArguments("--disable-dev-shm-usage");
-sh: erro de sintaxe próximo do `token' não esperado `"--disable-dev-shm-usage"'
-sh-4.2$ options.setAcceptInsecureCerts(true);
-sh: erro de sintaxe próximo do `token' não esperado `true'
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
