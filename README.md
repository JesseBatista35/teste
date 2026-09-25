oc get pods -n selenium-grid

oc rsh -n selenium-grid dc/chrome sh -c 'while true; do date +%T; df -h /dev/shm | tail -1; sleep 1; done'

ChromeOptions options = new ChromeOptions();
options.addArguments("--disable-dev-shm-usage");
options.setAcceptInsecureCerts(true);

