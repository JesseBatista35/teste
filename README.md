oc rollout latest dc/sibec-arquivos-tqs -n sibec-tqs
oc rollout status dc/sibec-arquivos-tqs -n sibec-tqs

oc get pvc -n sibec-tqs | grep arquivos
oc get pv sibec-arquivos-data-tqs
