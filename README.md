
-sh-4.2$ oc debug dc/sitop-frontend-des -- /bin/sh -c 'ls -la /opt/app-root/src/nginx-start'
Defaulting container name to sitop-frontend-des.
Use 'oc describe pod/sitop-frontend-des-debug -n sitop-des' to see all of the containers in this pod.

Debugging with pod/sitop-frontend-des-debug, original command: <image entrypoint>
Waiting for pod to start ...
total 0
drwxr-xr-x. 2 default root  6 Sep 15  2021 .
drwxr-xr-x. 1 default root 18 May 13 18:41 ..

Removing debug pod ...
-sh-4.2$


