
-sh-4.2$ oc -n selenium-grid rsh firefox-5-26gvg bash
To run a command as administrator (user "root"), use "sudo <command>".
See "man sudo_root" for details.

WARNING: Very high value reported by "ulimit -n". Consider passing "--ulimit nofile=32768" to "docker run".
seluser@firefox-5-26gvg:/$ unset http_proxy https_proxy HTTP_PROXY HTTPS_PROXY
G=http://selenium-router.selenium-grid.svc:4444
curl -s $G/status | head -c 300; echo

seluser@firefox-5-26gvg:/$ curl -v --max-time 10 $G/status 2>&1 | head -20
* Uses proxy env variable no_proxy == '.caixa,.caixa.gov.br,.corecaixa,.local,.svc,localhost,127.0.0.1,10.0.0.0/8,25.0.0.0/8'
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0*   Trying 25.128.44.255:4444...
  0     0    0     0    0     0      0      0 --:--:--  0:00:02 --:--:--     0* connect to 25.128.44.255 port 4444 failed: No route to host
* Failed to connect to selenium-router.selenium-grid.svc port 4444 after 3076 ms: No route to host
  0     0    0     0    0     0      0      0 --:--:--  0:00:03 --:--:--     0
* Closing connection 0
curl: (7) Failed to connect to selenium-router.selenium-grid.svc port 4444 after 3076 ms: No route to host
seluser@firefox-5-26gvg:/$ oc -n selenium-grid get svc
oc -n selenium-grid get route
bash: oc: command not found
bash: oc: command not found
seluser@firefox-5-26gvg:/$
