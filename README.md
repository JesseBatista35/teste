
-sh-4.2$ oc debug dc/sicfd-monitoramento-des -n sicfd-des -c sicfd-monitoramento-des
Debugging with pod/sicfd-monitoramento-des-debug, original command: <image entrypoint>
Waiting for pod to start ...
If you don't see a command prompt, try pressing enter.
sh-4.4$ pwd
/deployments
sh-4.4$ hostname
sh: hostname: command not found
sh-4.4$ hostname
sh: hostname: command not found
sh-4.4$ ls -la /usr/src/app/
total 0
drwxr-xr-x. 3 root root 27 Sep 16 16:55 .
drwxr-xr-x. 1 root root 17 Sep 16 16:55 ..
drwxrwxrwt. 3 root root 60 Sep 16 16:55 secrets_files
sh-4.4$
sh-4.4$
sh-4.4$ find / -maxdepth 4 -iname "*entrypoint*" 2>/dev/null
sh-4.4$ find / -maxdepth 4 -iname "*start*.sh" 2>/dev/null
sh-4.4$
