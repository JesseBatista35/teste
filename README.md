oc get pods -l name=sisns-backend-tqs --sort-by=.metadata.creationTimestamp

oc exec sisns-backend-tqs-119-gjln8 -c sisns-backend-tqs -- df -h

oc exec sisns-backend-tqs-119-gjln8 -c sisns-backend-tqs -- ls -la /opt/SISNS/SIB2B/GECIN/DOWNLOAD
