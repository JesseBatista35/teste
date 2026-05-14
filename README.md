

-sh-4.2$ oc debug dc/sitop-frontend-des -- /bin/sh -c 'grep -R "main*.js|/opt/app-root/src/main|sed" /opt/app-root /usr/libexec /usr/local/bin /etc 2>/dev/null | head -80'
Defaulting container name to sitop-frontend-des.
Use 'oc describe pod/sitop-frontend-des-debug -n sitop-des' to see all of the containers in this pod.

Debugging with pod/sitop-frontend-des-debug, original command: <image entrypoint>
Waiting for pod to start ...

Removing debug pod ...
-sh-4.2$

