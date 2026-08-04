oc get pods -n sipnc-des -l name=sipnc-beneficiossociais-backend-des
oc describe pod <pod-antigo> -n sipnc-des | tail -40
oc get events -n sipnc-des --sort-by='.lastTimestamp' | tail -20

oc delete pod <pod-antigo> -n sipnc-des --grace-period=0 --force
