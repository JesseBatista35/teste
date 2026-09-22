# 1. O que mudou hoje (alguém já pôs proxy?)
oc -n selenium-grid set env dc/firefox --list
oc -n selenium-grid set env dc/selenium-router --list
oc -n selenium-grid rollout history dc/firefox

# 2. Confirmar o bloqueio TCP sem depender do curl
oc -n selenium-grid rsh firefox-4-n5rkq bash -c \
 'for ip in 10.252.32.63 10.252.32.65; do timeout 5 bash -c "</dev/tcp/$ip/80" && echo "$ip OK" || echo "$ip FALHA"; done'

# 3. O cluster tem um proxy "oficial" de saída? (a WO do CETEL cita "proxynuvem/DES")
oc get proxy cluster -o jsonpath='{.spec}{"\n"}' 2>/dev/null
oc get dc,deploy -A -o yaml 2>/dev/null | grep -iE 'https?_proxy' | sort | uniq -c
