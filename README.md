
-sh-4.2$ oc set env dc/sipnc-manutseletjudicialpj-backend-des --list -n sipnc-des
# deploymentconfigs/sipnc-manutseletjudicialpj-backend-des, container sipnc-manutseletjudicialpj-backend-des
TZ=America/Sao_Paulo
# INSTANCE_IP from field path status.podIP
AMBIENTE=NACIONAL
API_MANAGER_URL=https://api.des.caixa:8443
API_TRILHA_BASEPATH=/plataforma-unificada/trilha
APPLICATIONINSIGHTS_CONNECTION_STRING=InstrumentationKey=b0142390-50c9-495e-85b4-7b2ade8fc1cf;IngestionEndpoint=https://brazilsoutheast-0.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsoutheast.livediagnostics.monitor.azure.com/
APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL=INFO
APPLICATIONINSIGHTS_PROXY=http://proxydes.caixa:80
APPLICATIONINSIGHTS_ROLE_NAME=SIPNC-MANUTSELETJUDICIALPJ-DES
APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE=100
APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL=INFO
DATASOURCE_JDBC_URL=jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(FAILOVER=ON)(LOAD_BALANCE=OFF)(ADDRESS=(PROTOCOL=TCP)(HOST=cnpexdadvm01-scan8.extra.caixa.gov.br)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=ORAD01BC)(FAILOVER_MODE=(TYPE=SELECT)(METHOD=BASIC)(RETRIES=5)(DELAY=5))))
FLAG_CERTIFICADO_DIGITAL=false
JAVA_OPTIONS_APPEND=-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-azure2024.jks -Xms512m -Xmx512m
JAVA_OPTIONS=-Dserver.address=0.0.0.0 -Dserver.port=8080
JAVA_OPTS_MONITORING=-javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sipnc-manutseletjudicialpj-backend -Delastic.apm.environment=des -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sipnc-manutseletjudicialpj-backend
LOG_LEVEL=ERROR
ORACLE_CONNECTIONTIMEOUT=30000
ORACLE_IDLETIMEOUT=900000
ORACLE_KEEPALIVETIME=0
ORACLE_MAXIMUMPOOLSIZE=25
ORACLE_MAXLIFETIME=1800000
ORACLE_MINIMUMIDLE=3
ORACLE_SHOW_SQL=false
ORACLE_USER=spansd01
SIPNC_SSO_URL=https://login.des.caixa
SPRING_PROFILES_ACTIVE=production
SSL_DISABLED=true
SSO_ISSUER=https://login.des.caixa/auth/realms/intranet
# CLIENT_SECRET from secret sipnc-manutseletjudicialpj-backend-des, key CLIENT_SECRET
# CLIENT_SECRET_INTER from secret sipnc-manutseletjudicialpj-backend-des, key CLIENT_SECRET_INTER
# CLIENT_SECRET_INTER_2 from secret sipnc-manutseletjudicialpj-backend-des, key CLIENT_SECRET_INTER_2
# ORACLE_PASS from secret sipnc-manutseletjudicialpj-backend-des, key ORACLE_PASS
# SIPNC_API_KEY from secret sipnc-manutseletjudicialpj-backend-des, key SIPNC_API_KEY
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get secret sipnc-manutseletjudicialpj-backend-des -n sipnc-des -o jsonpath='{.data}' | tr ',' '\n' | cut -d: -f1
map[CLIENT_SECRET_INTER
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sipnc-manutseletjudicialpj-backend-des -n sipnc-des -o jsonpath='{.spec.template.spec.containers[0].envFrom}'
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc debug dc/sipnc-manutseletjudicialpj-backend-tqs -n sipnc-tqs -- sh -c 'cd /tmp && unzip -l /deployments/SIPNC-manutseletjudicialpj-backend.jar | grep -i "application.*\.\(properties\|yml\)"'
Defaulting container name to sipnc-manutseletjudicialpj-backend-tqs.
Use 'oc describe pod/sipnc-manutseletjudicialpj-backend-tqs-debug -n sipnc-tqs' to see all of the containers in this pod.

Debugging with pod/sipnc-manutseletjudicialpj-backend-tqs-debug, original command: <image entrypoint>
Waiting for pod to start ...
sh: unzip: command not found

Removing debug pod ...
-sh-4.2$ oc set env dc/sipnc-manutseletjudicialpj-backend-tqs SPRING_PROFILES_ACTIVE=tqs -n sipnc-tqs
deploymentconfig.apps.openshift.io/sipnc-manutseletjudicialpj-backend-tqs updated
-sh-4.2$
