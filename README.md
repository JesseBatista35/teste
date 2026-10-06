# Em qual node estão os pods que funcionam
oc get pod -n sicmo-des -o wide | grep sicmo

# Quais DCs usam o fs_sicmo
oc get dc -n sicmo-des -o yaml | grep -B3 -A3 fs_sicmo


oc get node ceadecldlx019.nprd.caixa -o wide

oc delete pod sicmo-internet-des-97-8bb57 -n sicmo-des
