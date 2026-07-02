oc get dc sibec-arquivos-tqs -n sibec-tqs -o yaml | grep -n "containers:"


oc get dc sibec-arquivos-tqs -n sibec-tqs -o yaml | grep -n "^        name:"
