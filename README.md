
-sh-4.2$ oc -n selenium-grid rsh firefox-5-26gvg bash
To run a command as administrator (user "root"), use "sudo <command>".
See "man sudo_root" for details.

WARNING: Very high value reported by "ulimit -n". Consider passing "--ulimit nofile=32768" to "docker run".
seluser@firefox-5-26gvg:/$ unset http_proxy https_proxy HTTP_PROXY HTTPS_PROXY
G=http://selenium-router.selenium-grid.svc:4444
curl -s $G/status | head -c 300; echo

seluser@firefox-5-26gvg:/$
