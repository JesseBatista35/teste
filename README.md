# tudo que NÃO é probe no log atual
oc logs <pod> -n sifap-des | grep -v '"GET / HTTP' | grep -vE 'DEBUG \[jdk.eve.security\]' | tail -100

# restarts / OOM
oc get pod <pod> -n sifap-des -o jsonpath='{.status.containerStatuses[*].restartCount} {.status.containerStatuses[*].lastState}'

# acompanhar ao vivo enquanto alguém reproduz
oc logs -f <pod> -n sifap-des | grep -v '"GET / HTTP'
