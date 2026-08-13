oc get pod sifpp-micro-des-35-8bfs8 -n sifpp-des -o jsonpath='{.spec.containers[0].env}' | python3 -m json.tool


oc set env pod/sifpp-micro-des-35-8bfs8 -n sifpp-des --list


oc get deployment sifpp-micro-des -n sifpp-des -o yaml | grep -A 5 envFrom

oc get deployment sifpp-micro-des -n sifpp-des -o yaml | grep -A 10 volumeMounts

oc rsh sifpp-micro-des-35-8bfs8 find / -name "application*.properties" 2>/dev/null
