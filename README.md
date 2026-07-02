oc get dc sibec-arquivos-tqs -n sibec-tqs -o yaml | grep -n "volumes:\|volumeMounts:\|mountPath:\|name: secrets\|- name:"
