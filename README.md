oc rsh sifpp-micro-des-35-8bfs8 ls -la /usr/src/app/


oc rsh sifpp-micro-des-35-8bfs8 find / -iname "*siobr*" -o -iname "*sifpp*" 2>/dev/null


oc get pod sifpp-micro-des-35-8bfs8 -n sifpp-des -o jsonpath='{.spec.containers[0].volumeMounts}' | python3 -m json.tool

oc get pod sifpp-micro-des-35-8bfs8 -n sifpp-des -o jsonpath='{.spec.volumes}' | python3 -m json.tool
