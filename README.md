oc exec $POD -n $NS -- sh -c 'grep -c "__SSO_" /opt/app-root/src/chunk-SUPBJXFF.js; grep -o "https://login.des.caixa/auth" /opt/app-root/src/chunk-SUPBJXFF.js | head -1'

oc exec $POD -n $NS -- sh -c 'cat /proc/1/cmdline | tr "\0" " "; echo'
