oc get dc sisns-backend-tqs -o yaml | grep -A 15 volumes

oc get dc sisns-backend-tqs -o yaml | grep -A 10 volumeMounts

oc rollout latest dc/sisns-backend-tqs

oc get pods -l name=sisns-backend-tqs --sort-by=.metadata.creationTimestamp

oc exec -it <NOME_DO_POD_NOVO> -c sisns-backend-tqs -- df -h | grep -i SISNS

oc exec -it <NOME_DO_POD_NOVO> -c sisns-backend-tqs -- ls -la /opt/SISNS/SIB2B/GECIN/DOWNLOAD
