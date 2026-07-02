oc get dc sibec-arquivos-tqs -n sibec-tqs -o yaml | grep -B5 -A10 "SBECTR01_DB2"

oc get secrets -n sibec-tqs | grep -i sbec
