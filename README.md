oc get pods -A -o wide | grep -E '10\.122\.(156\.8[46]|155\.67)'
oc rsh -n <namespace> <pod>
ls /opt/ads-agent/esteira-jboss-vm
