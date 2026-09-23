
-sh-4.2$
-sh-4.2$ oc set env dc/sipnc-manutseletjudicialpj-backend-tqs --list -n sipnc-tqs
# deploymentconfigs/sipnc-manutseletjudicialpj-backend-tqs, container sipnc-manutseletjudicialpj-backend-tqs
TZ=America/Sao_Paulo
# INSTANCE_IP from field path status.podIP
APPLICATIONINSIGHTS_ROLE_NAME=SIPNC-MANUTSELETJUDICIALPJ-TQS
JAVA_OPTIONS_APPEND=-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-azure2024.jks -Xms512m -Xmx512m
JAVA_OPTIONS=-Dserver.address=0.0.0.0 -Dserver.port=8080
JAVA_OPTS_MONITORING=-javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sipnc-manutseletjudicialpj-backend -Delastic.apm.environment=tqs -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sipnc-manutseletjudicialpj-backend
LOG_LEVEL=ERROR
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sipnc-manutseletjudicialpj-backend-tqs -n sipnc-tqs -o jsonpath='{.spec.template.spec.containers[0].envFrom}'
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get cm,secret -n sipnc-tqs | grep -i manutseletjudicialpj

secret/sipnc-manutseletjudicialpj-backend-tqs      Opaque                                0         15m
-sh-4.2$
