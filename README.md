oc logs siint-saquetecban-pendencia-api-des-46-bk5s5 --previous > /tmp/crash.log 2>&1
cat /tmp/crash.log
wc -l /tmp/crash.log


oc describe pod siint-saquetecban-pendencia-api-des-46-bk5s5 | grep -A 15 "State:\|Last State:"
