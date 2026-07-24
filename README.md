
-sh-4.2$
-sh-4.2$ oc get pods -l name=sisns-backend-tqs --sort-by=.metadata.creationTimestamp
No resources found.
-sh-4.2$ oc exec sisns-backend-tqs-119-gjln8 -c sisns-backend-tqs -- df -h
Error from server (NotFound): pods "sisns-backend-tqs-119-gjln8" not found
-sh-4.2$ oc exec sisns-backend-tqs-119-gjln8 -c sisns-backend-tqs -- ls -la /opt/SISNS/SIB2B/GECIN/DOWNLOAD
Error from server (NotFound): pods "sisns-backend-tqs-119-gjln8" not found
-sh-4.2$
