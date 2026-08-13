
-sh-4.2$ oc rsh sifpp-micro-des-35-8bfs8 ls -la /usr/src/app/
ls: cannot access '/usr/src/app/': No such file or directory
command terminated with exit code 2
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh sifpp-micro-des-35-8bfs8 find / -iname "*siobr*" -o -iname "*sifpp*" 2>/dev/null
find: '/proc/tty/driver': Permission denied
find: '/var/cache/ldconfig': Permission denied
find: '/var/lib/private': Permission denied
find: '/var/lib/portables': Permission denied
/tmp/src/app/sifpp-ms-0.0.0.1.jar
/tmp/src/sifpp-ms-20260812-1156-0-0-0-1-SNAPSHOT.zip
find: '/lost+found': Permission denied
/deployments/app/sifpp-ms-0.0.0.1.jar
/deployments/sifpp-ms-20260812-1156-0-0-0-1-SNAPSHOT.zip
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod sifpp-micro-des-35-8bfs8 -n sifpp-des -o jsonpath='{.spec.containers[0].volumeMounts}' | python3 -m json.tool
Expecting value: line 1 column 2 (char 1)
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod sifpp-micro-des-35-8bfs8 -n sifpp-des -o jsonpath='{.spec.volumes}' | python3 -m json.tool
Expecting value: line 1 column 2 (char 1)
-sh-4.2$
