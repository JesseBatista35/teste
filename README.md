oc describe pod sicmo-internet-des-94-kn4qr -n sicmo-des | tail -20
oc get pvc -n sicmo-des
oc get pv | grep sicmo
oc get pv <pv-do-sicmo-internet-data-des> -o yaml | grep -A5 nfs


oc get dc -n sicmo-des -o yaml | grep -B2 -A2 claimName

