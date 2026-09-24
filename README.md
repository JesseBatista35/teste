oc describe rolebinding admin -n selenium-grid
oc rsh -n selenium-grid dc/chrome google-chrome --version
oc rsh -n selenium-grid dc/chrome df -h /dev/shm
oc get dc chrome -n selenium-grid -o yaml | grep -iA3 shm
