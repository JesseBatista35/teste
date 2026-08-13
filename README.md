
-sh-4.2$
-sh-4.2$ oc set env pod/sifpp-micro-des-35-8bfs8 -n sifpp-des --list
# pods/sifpp-micro-des-35-8bfs8, container sifpp-micro-des
TZ=America/Sao_Paulo
APPLICATIONINSIGHTS_CONNECTION_STRING=InstrumentationKey=f6b9b060-c8fc-4702-a924-a3632ca25bb1;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/
APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL=INFO
APPLICATIONINSIGHTS_ROLE_NAME=SIFPP-DES
HEALTH_URL=https://sifpp-micro-des.apps.nprd.caixa
HTTPS_PROXY=http://proxydes.caixa:80
HTTP_PROXY=http://proxydes.caixa:80
JAVA_OPTIONS_APPEND=-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks
NO_PROXY=.caixa,.caixa.gov.br,10.0.0.0/8
QUARKUS_LOG_LEVEL=INFO
QUARKUS_OIDC_AUTH_SERVER_URL=https://login.des.caixa/auth/realms/intranet
SSO_CLI_SER_FPP=cli-ser-fpp
# SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS from secret sifpp-micro-des, key SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS
# SSO_PASS_CLI_SER_OBR from secret sifpp-micro-des, key SSO_PASS_CLI_SER_OBR
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get deployment sifpp-micro-des -n sifpp-des -o yaml | grep -A 5 envFrom
Error from server (NotFound): deployments.apps "sifpp-micro-des" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get deployment sifpp-micro-des -n sifpp-des -o yaml | grep -A 10 volumeMounts
Error from server (NotFound): deployments.apps "sifpp-micro-des" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh sifpp-micro-des-35-8bfs8 find / -name "application*.properties" 2>/dev/null
find: '/proc/tty/driver': Permission denied
find: '/var/cache/ldconfig': Permission denied
find: '/var/lib/private': Permission denied
find: '/var/lib/portables': Permission denied
find: '/lost+found': Permission denied
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
