

oc debug dc/sitop-frontend-des -- /bin/sh -c 'grep -R "main\*.js\|/opt/app-root/src/main\|sed" /opt/app-root /usr/libexec /usr/local/bin /etc 2>/dev/null | head -80'
