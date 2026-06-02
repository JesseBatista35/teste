
-sh-4.2$ oc get dc/sifug-siofg-api-des -n sifug-des -o jsonpath='{range .spec.template.spec.containers[*]}{"CONTAINER: "}{.name}{"\n"}{range .volumeMounts[*]}{"  - "}{.mountPath}{" (vol="}{.name}{")\n"}{end}{end}'
CONTAINER: sifug-siofg-api-des
  - /deployments/caixa-truststore-azure.jks (vol=caixa-truststore-azure)
  - /deployments/caixa-truststore-sifug-insights.jks (vol=caixa-truststore-sifug-insights)
  - /usr/src/app/secrets_files (vol=secrets)
  - /deployments/caixa-truststore-acteste-nprd.jks (vol=caixa-truststore-acteste-nprd)
-sh-4.2$ echo "---- INIT CONTAINERS ----"
---- INIT CONTAINERS ----
-sh-4.2$ oc get dc/sifug-siofg-api-des -n sifug-des -o jsonpath='{range .spec.template.spec.initContainers[*]}{"INIT: "}{.name}{"\n"}{range .volumeMounts[*]}{"  - "}{.mountPath}{" (vol="}{.name}{")\n"}{end}{end}'
INIT: secrets-agent-sidecar
  - /usr/src/app/secrets_files (vol=secrets)
INIT: secrets-check
  - /usr/src/app/secrets_files (vol=secrets)
  - /script (vol=script-bt-volume)
-sh-4.2$

