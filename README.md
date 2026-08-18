oc get pod sigfa-api-extratos-des-15-sh4lk -n sigfa-des

oc describe pod sigfa-api-extratos-des-15-sh4lk -n sigfa-des | grep -A30 "Init Containers:\|Events:"

oc logs -n sigfa-des sigfa-api-extratos-des-15-sh4lk -c secrets-agent-sidecar

oc logs -n sigfa-des sigfa-api-extratos-des-15-sh4lk -c secrets-check
