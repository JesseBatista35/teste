
-sh-4.2$
-sh-4.2$ oc exec $POD -n $NS -- sh -c 'ls -la /opt/app-root/src/nginx-start/ /opt/app-root/etc/nginx.d/ /usr/libexec/s2i/ 2>/dev/null; grep -l "Bundle Angular" /opt/app-root/src/nginx-start/* /usr/libexec/s2i/* /usr/share/container-scripts/nginx/* /docker-entrypoint.d/* /*.sh 2>/dev/null'
Defaulting container name to sirep-frontend-intranet-novo-des2-des.
Use 'oc describe pod/sirep-frontend-intranet-novo-des2-des-16-2rsgl -n sirep-des' to see all of the containers in this pod.
/opt/app-root/etc/nginx.d/:
total 0
drwxrwxrwx. 2 default root  6 Sep 15  2021 .
drwxrwxrwx. 1 default root 43 Oct  5 14:41 ..

/opt/app-root/src/nginx-start/:
total 4
drwxr-xr-x. 2 default root    6 Sep 15  2021 .
drwxr-xr-x. 1 default root 4096 Oct  5 14:53 ..

/usr/libexec/s2i/:
total 12
drwxr-xr-x. 2 root root   46 Sep 15  2021 .
drwxr-xr-x. 1 root root   33 Sep 15  2021 ..
-rwxr-xr-x. 1 root root 1354 Sep 15  2021 assemble
-rwxr-xr-x. 1 root root  426 Sep 15  2021 run
-rwxr-xr-x. 1 root root  624 Sep 15  2021 usage
command terminated with exit code 2
-sh-4.2$

