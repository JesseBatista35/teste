oc get dc,deploy -n sibec-des | grep -i micro
oc get dc sibec-micro-des -n sibec-des -o jsonpath='{..image}{"\n"}'
oc set env dc/sibec-micro-des -n sibec-des --list | grep -iE "sisgr|portal"
oc logs dc/sibec-micro-des -n sibec-des --since=24h | grep -iE -A15 "parametros-portal|parametroPortal|sisgr" | head -60
