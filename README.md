oc project sisns-tqs
oc get pods | grep -i backend


oc get dc sisns-backend -o yaml | grep -A 15 volumeMounts
oc get dc sisns-backend -o yaml | grep -A 10 "nfs\|SISNS_TQS_FGW"


oc get pv | grep -i sisns
oc get pvc -n sisns-tqs
oc describe pvc <nome-do-pvc> -n sisns-tqs

oc exec -it <nome-do-pod> -n sisns-tqs -- df -h | grep -i SISNS
oc exec -it <nome-do-pod> -n sisns-tqs -- ls -la /opt/SISNS/SIB2B/GECIN/DOWNLOAD

