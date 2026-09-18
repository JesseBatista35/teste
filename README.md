Skip to main content
projetos
/
Caixa
/
Pipelines
/
Releases
/
SID01-lancamentos-financeiros-OKD4
Search








All pipelines

SID01

SID01-lancamentos-financeiros-OKD4
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
EGRESS_IP_OKD (81)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
SID01-lancamentos-financeiros-OKD4 (19)
Scopes: EC DES
SID01-lancamentos-financeiros-TQS (19)

Scopes: EC TQS
PASS_BASIC_AUTH
********
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=af499966-a437-4fed-9f90-b415f82a8004;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/"
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SID01-lancamentos-financeiros-TQS
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
33
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
_ENV.CAIXA_MP_JWT_VERIFY_SSOINTER2_ISSUER
https://login2tqs.caixa.gov.br/auth/realms/internet
_ENV.CAIXA_MP_JWT_VERIFY_SSOINTER2_PUBLICKEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA01H0wQ9sOd2rmZV11mGIOoAN/Yklz6SuL+eeXJsnak/osL3xkTszTQ+S/8iZScXpmOj5eM3QbncD9yF0/DHEWrS7DzBetrWnlpa53HocW9u+FEcVgtxofKlAz0rcVyOxl4YuKSElDmo0C0qFgLIaiXPKSnGiB5GmBegvK3nBo95/IPUKUxLUJzpOU7/7nkIVlUrHEx68dcWWsZtpRzrblSOIP/P6DX0sCtr0afSGypE8FbFaSw4CnvLpPzHfDWhqW8J8Z1cY6qX9aF8cV5955EOf/QW6LQAK7QZiD3pnOPnnVvRduUtQRfM7C4rT++TmmPhlTmaXeIsrcsZqI8Q5+wIDAQAB
_ENV.CAIXA_MP_JWT_VERIFY_SSOINTER_ISSUER
https://logintqs.caixa.gov.br/auth/realms/internet
_ENV.CAIXA_MP_JWT_VERIFY_SSOINTER_PUBLICKEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnUpqUUzfo9cWEFMy4ycmT1VqSSuvOvVxEbKl8xxyHkJNDEnXJB9Yia5kPYfCcUZrqzbqr06aKYCNITdo4i2UWb/bI4JxN78Uv2rm9v+x/DoEbLGJIq+eq/cezfTnxWdLctCgCKduchr4pSJkw9CTEbyMF/EjcKbwP3l4iKzQ9WKOmYSH3JxKwTQahLnVsGSryEQhJsjM6ixJWdlGe2WonaAzQigEOpb6e79pae1H5QKGNzRIrucPW5ABIK8sZKPeQNZE2+OtajuQckORS5f3w2PsbSfCh+kW81rMnyuxX+0iy6wz6hcJUQVsA60HkIl/hZ90U4DMrD7BwMTDB+5E/wIDAQAB
_ENV.CAIXA_MP_JWT_VERIFY_SSOINTRA_ISSUER
https://login.tqs.caixa/auth/realms/intranet
_ENV.CAIXA_MP_JWT_VERIFY_SSOINTRA_PUBLICKEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnA3K4+m+xZE7pqA4HgFMhpXztxWUwwhDZ1GlWQwqLGOwAj0EjzvhinZ8GG+qAClOSdrMCFbVrMELkvmfK8x/5Xrd70poUkq3x2gUUrJGNkuoxlYI9NKtsbEzRxxroVZVPRbJzrnRv2/kTFFE6SxTOfd0ZGbuV7CIuIAD42RsLvyjZALK9sM+eHJG+W0zb+L5+zfHP2g6y1/Ykf72mXnTKLgMAMGr1eEyVyBF1dOnsH/AOovm6w4Y5IDgnd1aWDN0ywfH9WsIq0ork7Kb/76IjNlS7+BhV2rnlFnvNm4pji6Ft3tkKMd0Gpx+6lHzWMk2kjb5pA5uDGq3lzFhtYqcnQIDAQAB
_ENV.CICSWEB_ROOT_ENDPOINT_HTTP
https://cicsweb.tqs.caixa:2584
_ENV.CICSWEB_ROOT_ENDPOINT_HTTPS
https://cicsweb.tqs.caixa:3024
_ENV.HTTPS_PROXY
http://proxydes.caixa:80
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.4.13.jar"
_ENV.NO_PROXY
".caixa,.caixa.gov.br,10.0.0.0/8"
_ENV.USER_BASIC_AUTH
SNSGSQ01
_SECRET.PASS_BASIC_AUTH
#{PASS_BASIC_AUTH}#
OKD-4-APL (12)
Scopes: EC PRD
SID01-lancamentos-financeiros-prd (19)
Scopes: EC PRD
|Manage variable groups
Showing filters 1 through 2

No pipelines match your search

Select a release pipeline to view its releases

10 pipelines found

Row 7

Showing filters 1 through 2

Showing 21 deployments

Row 3

Row 2

EC TQSDeploy release

Row 3

Row 2

Showing 23 deployments

Expanded

Row 3

Collapsed

Row 2

EC TQSDeploy release

Row 2

Showing filters 1 through 2




exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.4.13.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br|10.0.0.0/8 -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-09-18 10:08:12.593-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.4.13 started successfully (PID 8, JVM running for 8.554 s)
2026-09-18 10:08:12.685-03:00 INFO  c.m.applicationinsights.agent - Java version: 11.0.11, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-11-openjdk-11.0.11.0.9-2.el8_4.x86_64
2026-09-18 10:08:22.094-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - Sending telemetry to the ingestion service: Received response code 400 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (future warnings will be aggregated and logged once every 5 minutes)
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-09-18 10:08:22,102 INFO  [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (main) 
[issuers declarados na aplicacao]
https://login2tqs.caixa.gov.br/auth/realms/internet
https://logintqs.caixa.gov.br/auth/realms/internet
https://login.tqs.caixa/auth/realms/intranet

2026-09-18 10:08:24,592 INFO  [io.qua.sma.ope.run.OpenApiRecorder] (main) CORS filtering is disabled and cross-origin resource sharing is allowed without restriction, which is not recommended in production. Please configure the CORS filter through 'quarkus.http.cors.*' properties. For more information, see Quarkus HTTP CORS documentation
2026-09-18 10:08:25,892 INFO  [io.quarkus] (main) sid01-lancamentos-financeiros 1.5.0.2 on JVM (powered by Quarkus 2.13.8.Final) started in 13.003s. Listening on: http://0.0.0.0:8080
2026-09-18 10:08:25,892 INFO  [io.quarkus] (main) Profile prod activated. 
2026-09-18 10:08:25,892 INFO  [io.quarkus] (main) Installed features: [cdi, hibernate-validator, logging-gelf, resteasy, resteasy-jsonb, smallrye-context-propagation, smallrye-health, smallrye-metrics, smallrye-openapi, swagger-ui, vertx]
2026-09-18 10:09:12.173-03:00 ERROR c.azure.core.http.policy.RetryPolicy - {"az.sdk.message":"Retry attempts have been exhausted.","exception":"http, none, proxydes.caixa/10.252.32.63:80 => /169.254.169.254:80, status: 502 Proxy Error ( The specified Secure Sockets Layer (SSL) port is not allowed. Forefront TMG is not configured to allow SSL requests from this port. Most Web browsers use port 443 for SSL requests.  )","tryCount":3}



troque a porta ali para testr ja que eles nao falaram ual que é rodei a aplicação segue log.. acho que tem que pedir parar eles testare la na me ajda com texto para madnar na sala teamns

