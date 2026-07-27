2026-07-27T19:20:05.2742793Z ##[section]Starting: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
2026-07-27T19:20:05.2745692Z ==============================================================================
2026-07-27T19:20:05.2745875Z Task         : Bash
2026-07-27T19:20:05.2745932Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-27T19:20:05.2745996Z Version      : 3.227.0
2026-07-27T19:20:05.2746042Z Author       : Microsoft Corporation
2026-07-27T19:20:05.2746103Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-27T19:20:05.2746176Z ==============================================================================
2026-07-27T19:20:05.9152154Z Generating script.
2026-07-27T19:20:05.9162048Z ========================== Starting Command Output ===========================
2026-07-27T19:20:05.9168855Z [command]/bin/bash /opt/ads-agent/_work/_temp/1013215a-c58a-42ae-b36f-cebb0dec2e09.sh
2026-07-27T19:20:05.9226748Z + echo okd4_nprd
2026-07-27T19:20:05.9227035Z + egrep -q '^(okd4|ocp|openshift)'
2026-07-27T19:20:05.9250244Z ++ check_status_code https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/sigfa-api-aplicacao/manifests/1.98.0.42
2026-07-27T19:20:05.9250656Z ++ local url=https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/sigfa-api-aplicacao/manifests/1.98.0.42
2026-07-27T19:20:05.9252867Z ++ curl --location --request GET https://default-route-openshift-image-registry.apps.produtos4.caixa/v2/build-images-ads/sigfa-api-aplicacao/manifests/1.98.0.42 --header 'Authorization: Bearer ***' --header 'Content-Type: text/plain' -s -k -o /dev/null -w '%{http_code}'
2026-07-27T19:20:06.1239422Z + status_code=200
2026-07-27T19:20:06.1240076Z + [[ 200 -ne 200 ]]
2026-07-27T19:20:06.1240310Z + [[ tqs == \p\r\d ]]
2026-07-27T19:20:06.1240965Z + build=sigfa-api-aplicacao
2026-07-27T19:20:06.1241221Z + app=sigfa-api-aplicacao-okd4-pos-tqs
2026-07-27T19:20:06.1241340Z + [[ tqs == \p\r\d ]]
2026-07-27T19:20:06.3301107Z + oc set image deploymentconfig/sigfa-api-aplicacao-okd4-pos-tqs sigfa-api-aplicacao-okd4-pos-tqs=default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sigfa-api-aplicacao:1.98.0.42 -n sigfa-tqs
2026-07-27T19:20:06.3301472Z deploymentconfig.apps.openshift.io/sigfa-api-aplicacao-okd4-pos-tqs image updated
2026-07-27T19:20:06.3333006Z + echo openshift/quarkus-caixa-release
2026-07-27T19:20:06.3335024Z + egrep -q openshift/angular-caixa-release
2026-07-27T19:20:06.3364088Z + echo openshift/quarkus-caixa-release
2026-07-27T19:20:06.3367750Z + egrep -q openshift/php-caixa-release
2026-07-27T19:20:06.3390745Z + echo 'Template não é angular nem php e não precisa deste replace'
2026-07-27T19:20:06.3391176Z Template não é angular nem php e não precisa deste replace
2026-07-27T19:20:06.3392426Z + oc patch --type merge deploymentconfig/sigfa-api-aplicacao-okd4-pos-tqs -p '{"spec":{"template":{"spec":{"imagePullSecrets":[{"name":"registry-secret"}]}}}}' -n sigfa-tqs
2026-07-27T19:20:06.5292914Z deploymentconfig.apps.openshift.io/sigfa-api-aplicacao-okd4-pos-tqs not patched
2026-07-27T19:20:06.5323624Z + oc get secret registry-secret -n sigfa-tqs
2026-07-27T19:20:06.7100203Z NAME              TYPE                             DATA      AGE
2026-07-27T19:20:06.7100600Z registry-secret   kubernetes.io/dockerconfigjson   1         2y248d
2026-07-27T19:20:06.7131114Z + [[ deploymentconfig == deployment ]]
2026-07-27T19:20:06.7131344Z + oc rollout cancel deploymentconfig/sigfa-api-aplicacao-okd4-pos-tqs -n sigfa-tqs
2026-07-27T19:20:06.9273875Z No rollout is in progress (latest rollout #243 complete 3 days ago)
2026-07-27T19:20:06.9274881Z error: unable to cancel paused deployment sigfa-tqs/sigfa-api-aplicacao-okd4-pos-tqs
2026-07-27T19:20:06.9303954Z + sleep 20
2026-07-27T19:20:26.9319593Z + oc rollout latest deploymentconfig/sigfa-api-aplicacao-okd4-pos-tqs -n sigfa-tqs
2026-07-27T19:20:27.1414440Z error: cannot deploy a paused deployment config
2026-07-27T19:20:27.1488969Z ##[error]Bash exited with code '1'.
2026-07-27T19:20:27.1491523Z ##[section]Finishing: Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP

2026-07-27T19:20:27.1617009Z ##[section]Starting: Logs da Aplicação
2026-07-27T19:20:27.1619608Z ==============================================================================
2026-07-27T19:20:27.1619694Z Task         : Bash
2026-07-27T19:20:27.1619733Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-27T19:20:27.1619810Z Version      : 3.227.0
2026-07-27T19:20:27.1619850Z Author       : Microsoft Corporation
2026-07-27T19:20:27.1619898Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-27T19:20:27.1619976Z ==============================================================================
2026-07-27T19:20:28.0202988Z Generating script.
2026-07-27T19:20:28.0212619Z ========================== Starting Command Output ===========================
2026-07-27T19:20:28.0219434Z [command]/bin/bash /opt/ads-agent/_work/_temp/63dd395a-c795-4afb-996a-bd315b4193f4.sh
2026-07-27T19:20:28.0264724Z + shopt -s expand_aliases
2026-07-27T19:20:28.0265027Z + [[ -n okd4_nprd ]]
2026-07-27T19:20:28.0265211Z + [[ okd4_nprd =~ ocp ]]
2026-07-27T19:20:28.0266269Z + [[ -n okd4_nprd ]]
2026-07-27T19:20:28.0266727Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-07-27T19:20:28.0267037Z + app=sigfa-api-aplicacao-okd4-pos-tqs
2026-07-27T19:20:28.0267159Z + oc version
2026-07-27T19:20:28.1555522Z oc v3.11.0+0cbc58b
2026-07-27T19:20:28.1555753Z kubernetes v1.11.0+d4cacc0
2026-07-27T19:20:28.1556047Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-07-27T19:20:28.1651274Z 
2026-07-27T19:20:28.1651559Z Server https://api.nprd.caixa:6443
2026-07-27T19:20:28.1651830Z kubernetes v1.25.0-2824+27e744f55d2e99-dirty
2026-07-27T19:20:28.1692982Z ++ oc get pod -l name=sigfa-api-aplicacao-okd4-pos-tqs -n sigfa-tqs -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-07-27T19:20:28.1693199Z ++ tac
2026-07-27T19:20:28.1694912Z ++ grep -v '^$'
2026-07-27T19:20:28.1695333Z ++ head -n1
2026-07-27T19:20:28.3983152Z + last_pod=sigfa-api-aplicacao-okd4-pos-tqs-243-q2c6w
2026-07-27T19:20:28.3983449Z + echo 'Logs do POD: sigfa-api-aplicacao-okd4-pos-tqs-243-q2c6w'
2026-07-27T19:20:28.3983680Z + oc logs sigfa-api-aplicacao-okd4-pos-tqs-243-q2c6w -c sigfa-api-aplicacao-okd4-pos-tqs -n sigfa-tqs
2026-07-27T19:20:28.3983909Z Logs do POD: sigfa-api-aplicacao-okd4-pos-tqs-243-q2c6w
2026-07-27T19:20:28.6742758Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-07-27T19:20:28.6743637Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-27T19:20:28.6744034Z 2026-07-27 14:46:33.997-03:00 INFO  c.m.applicationinsights.agent - ApplicationInsights Java Agent 3.3.1 started successfully (PID 8)
2026-07-27T19:20:28.6744554Z 2026-07-27 14:46:34.000-03:00 INFO  c.m.applicationinsights.agent - Java version: 11.0.11, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-11-openjdk-11.0.11.0.9-2.el8_4.x86_64
2026-07-27T19:20:28.6745152Z __  ____  __  _____   ___  __ ____  ______ 
2026-07-27T19:20:28.6745475Z  --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
2026-07-27T19:20:28.6745645Z  -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
2026-07-27T19:20:28.6746110Z --\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-07-27T19:20:28.6746492Z 2026-07-27 14:46:35,811 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.http.worker-threads" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-07-27T19:20:28.6746858Z 2026-07-27 14:46:38,830 WARN  [org.hib.boo.int.InFlightMetadataCollectorImpl] (main) HHH000069: Duplicate generator name seqProd
2026-07-27T19:20:28.6749772Z 2026-07-27 14:46:39,242 WARN  [org.hib.map.RootClass] (main) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sigfa.entity.documento_cotista_bacen.SituacaoSolicitacaoDocCotistaBacenKey
2026-07-27T19:20:28.6750583Z 2026-07-27 14:46:39,242 WARN  [org.hib.map.RootClass] (main) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sigfa.entity.documento_cotista_bacen.SituacaoSolicitacaoDocCotistaBacenKey
2026-07-27T19:20:28.6751142Z 2026-07-27 14:46:39,245 WARN  [org.hib.map.RootClass] (main) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sigfa.entity.movimentacao.key.HistoricoContaBancariaInvestidorKey
2026-07-27T19:20:28.6751689Z 2026-07-27 14:46:39,245 WARN  [org.hib.map.RootClass] (main) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sigfa.entity.movimentacao.key.HistoricoContaBancariaInvestidorKey
2026-07-27T19:20:28.6752280Z 2026-07-27 14:46:39,248 WARN  [org.hib.map.RootClass] (main) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sigfa.entity.commons.TrasnferenciaPosicaoKeyEntity
2026-07-27T19:20:28.6752813Z 2026-07-27 14:46:39,248 WARN  [org.hib.map.RootClass] (main) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sigfa.entity.commons.TrasnferenciaPosicaoKeyEntity
2026-07-27T19:20:28.6753325Z 2026-07-27 14:46:39,249 WARN  [org.hib.map.RootClass] (main) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sigfa.entity.reinf.SolicitacaoSituacaoReinfKey
2026-07-27T19:20:28.6753850Z 2026-07-27 14:46:39,249 WARN  [org.hib.map.RootClass] (main) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sigfa.entity.reinf.SolicitacaoSituacaoReinfKey
2026-07-27T19:20:28.6754301Z 2026-07-27 14:46:41,924 WARN  [io.qua.run.con.ConfigRecorder] (main) Build time property cannot be changed at runtime:
2026-07-27T19:20:28.6754790Z  - quarkus.swagger-ui.always-include is set to 'true' but it is build time fixed to 'false'. Did you change the property quarkus.swagger-ui.always-include after building the application?
2026-07-27T19:20:28.6755306Z 2026-07-27 14:46:46,186 WARN  [io.qua.run.log.LoggingSetupRecorder] (main) Log level DEBUG for category 'org.apache.http.headers' set below minimum logging level INFO, promoting it to INFO
2026-07-27T19:20:28.6755826Z 2026-07-27 14:46:46,187 WARN  [io.qua.run.log.LoggingSetupRecorder] (main) Log level DEBUG for category 'org.apache.http.impl.conn' set below minimum logging level INFO, promoting it to INFO
2026-07-27T19:20:28.6756335Z 2026-07-27 14:46:46,187 WARN  [io.qua.run.log.LoggingSetupRecorder] (main) Log level DEBUG for category 'org.apache.http.wire' set below minimum logging level INFO, promoting it to INFO
2026-07-27T19:20:28.6756862Z 2026-07-27 14:46:49,443 INFO  [io.quarkus] (main) sigfa-api-aplicacao 1.98.0.0 on JVM (powered by Quarkus 2.16.5.Final) started in 15.342s. Listening on: http://0.0.0.0:8080
2026-07-27T19:20:28.6757332Z 2026-07-27 14:46:49,443 INFO  [io.quarkus] (main) Profile prod activated. 
2026-07-27T19:20:28.6758293Z 2026-07-27 14:46:49,443 INFO  [io.quarkus] (main) Installed features: [agroal, cache, cdi, hibernate-orm, hibernate-orm-panache, hibernate-validator, jdbc-oracle, narayana-jta, oidc, oidc-client, oidc-token-propagation, rest-client, rest-client-jackson, resteasy, resteasy-jackson, resteasy-multipart, security, smallrye-context-propagation, smallrye-fault-tolerance, smallrye-health, smallrye-metrics, smallrye-openapi, vertx]
2026-07-27T19:20:28.6758992Z 2026-07-27 14:55:47,109 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-7) Iniciando listagem de migra??o de fundos.
2026-07-27T19:20:28.6759322Z 2026-07-27 14:55:47,122 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-7) Listagem de migra??o de fundos conclu?da. Total de registros: 54
2026-07-27T19:20:28.6759652Z 2026-07-27 14:57:56,327 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-6) Iniciando listagem de migra??o de fundos.
2026-07-27T19:20:28.6759967Z 2026-07-27 14:57:56,335 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-6) Listagem de migra??o de fundos conclu?da. Total de registros: 54
2026-07-27T19:20:28.6760351Z 2026-07-27 15:00:22,003 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-6) Iniciando listagem de migra??o de fundos.
2026-07-27T19:20:28.6760666Z 2026-07-27 15:00:22,010 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-6) Listagem de migra??o de fundos conclu?da. Total de registros: 54
2026-07-27T19:20:28.6760971Z 2026-07-27 15:04:52,038 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-7) Iniciando listagem de migra??o de fundos.
2026-07-27T19:20:28.6761267Z 2026-07-27 15:04:52,043 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-7) Listagem de migra??o de fundos conclu?da. Total de registros: 54
2026-07-27T19:20:28.6761592Z 2026-07-27 15:04:57,140 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-6) Consulta da migra??o de fundos conclu?da. C?digo: 3
2026-07-27T19:20:28.6761974Z 2026-07-27 15:04:59,869 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-6) Iniciando listagem de migra??o de fundos.
2026-07-27T19:20:28.6762310Z 2026-07-27 15:04:59,874 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-6) Listagem de migra??o de fundos conclu?da. Total de registros: 54
2026-07-27T19:20:28.6762633Z 2026-07-27 15:06:26,221 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-7) Consulta da migra??o de fundos conclu?da. C?digo: 1
2026-07-27T19:20:28.6762947Z 2026-07-27 15:15:06,584 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-7) Consulta da migra??o de fundos conclu?da. C?digo: 1
2026-07-27T19:20:28.6763254Z 2026-07-27 15:16:29,038 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-7) Consulta da migra??o de fundos conclu?da. C?digo: 1
2026-07-27T19:20:28.6763556Z 2026-07-27 15:16:33,048 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-7) Consulta da migra??o de fundos conclu?da. C?digo: 1
2026-07-27T19:20:28.6763850Z 2026-07-27 15:17:00,759 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-6) Consulta da migra??o de fundos conclu?da. C?digo: 1
2026-07-27T19:20:28.6764148Z 2026-07-27 15:19:38,154 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-7) Consulta da migra??o de fundos conclu?da. C?digo: 1
2026-07-27T19:20:28.6764449Z 2026-07-27 15:20:29,270 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-6) Consulta da migra??o de fundos conclu?da. C?digo: 1
2026-07-27T19:20:28.6764751Z 2026-07-27 15:21:23,667 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-7) Iniciando listagem de migra??o de fundos.
2026-07-27T19:20:28.6765070Z 2026-07-27 15:21:23,674 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-7) Listagem de migra??o de fundos conclu?da. Total de registros: 54
2026-07-27T19:20:28.6765371Z 2026-07-27 15:22:14,938 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-6) Iniciando listagem de migra??o de fundos.
2026-07-27T19:20:28.6765684Z 2026-07-27 15:22:14,942 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-6) Listagem de migra??o de fundos conclu?da. Total de registros: 54
2026-07-27T19:20:28.6765972Z 2026-07-27 15:22:28,560 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-6) Iniciando listagem de migra??o de fundos.
2026-07-27T19:20:28.6766409Z 2026-07-27 15:22:28,565 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-6) Listagem de migra??o de fundos conclu?da. Total de registros: 54
2026-07-27T19:20:28.6766753Z 2026-07-27 15:22:35,414 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-6) Consulta da migra??o de fundos conclu?da. C?digo: 1
2026-07-27T19:20:28.6767046Z 2026-07-27 15:23:21,460 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-7) Iniciando listagem de migra??o de fundos.
2026-07-27T19:20:28.6767352Z 2026-07-27 15:23:21,464 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-7) Listagem de migra??o de fundos conclu?da. Total de registros: 54
2026-07-27T19:20:28.6767699Z 2026-07-27 15:23:34,197 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-7) Iniciando listagem de migra??o de fundos.
2026-07-27T19:20:28.6768008Z 2026-07-27 15:23:34,201 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-7) Listagem de migra??o de fundos conclu?da. Total de registros: 54
2026-07-27T19:20:28.6768310Z 2026-07-27 15:23:36,208 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-7) Consulta da migra??o de fundos conclu?da. C?digo: 1
2026-07-27T19:20:28.6768603Z 2026-07-27 15:25:42,532 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-7) Iniciando listagem de migra??o de fundos.
2026-07-27T19:20:28.6768908Z 2026-07-27 15:25:42,537 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-7) Listagem de migra??o de fundos conclu?da. Total de registros: 54
2026-07-27T19:20:28.6769208Z 2026-07-27 15:29:08,735 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-6) Consulta da migra??o de fundos conclu?da. C?digo: 1
2026-07-27T19:20:28.6769507Z 2026-07-27 15:44:17,176 INFO  [br.gov.cai.sig.ser.MigracaoFundosService] (executor-thread-6) Consulta da migra??o de fundos conclu?da. C?digo: 1
2026-07-27T19:20:28.6769813Z 2026-07-27 15:56:43,810 ERROR [br.gov.cai.sig.exc.han.SIGFAExceptionHandlerGeneric] (executor-thread-7) Acesso n?o autorizado ao caminho: /apl/siart
2026-07-27T19:20:28.6770180Z 2026-07-27 15:56:43,811 ERROR [br.gov.cai.sig.exc.han.SIGFAExceptionHandlerGeneric] (executor-thread-7) Ocorreu um erro inesperado: java.lang.SecurityException: Acesso n?o autorizado ao caminho: /apl/siart
2026-07-27T19:20:28.6770404Z 	at br.gov.caixa.sigfa.util.PathUtil.ensureSafePath(PathUtil.java:58)
2026-07-27T19:20:28.6770567Z 	at br.gov.caixa.sigfa.util.PathUtil.of(PathUtil.java:27)
2026-07-27T19:20:28.6770742Z 	at br.gov.caixa.sigfa.service.ConciliacaoService.buscarArquivosERelatorios(ConciliacaoService.java:69)
2026-07-27T19:20:28.6770938Z 	at br.gov.caixa.sigfa.service.ConciliacaoService_ClientProxy.buscarArquivosERelatorios(Unknown Source)
2026-07-27T19:20:28.6771135Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource.buscarArquivosERelatorios(ConciliacaoResource.java:56)
2026-07-27T19:20:28.6771341Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource_Subclass.buscarArquivosERelatorios$$superforward1(Unknown Source)
2026-07-27T19:20:28.6771519Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource_Subclass$$function$$1.apply(Unknown Source)
2026-07-27T19:20:28.6771707Z 	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:54)
2026-07-27T19:20:28.6771957Z 	at io.quarkus.security.runtime.interceptor.SecurityHandler.handle(SecurityHandler.java:47)
2026-07-27T19:20:28.6772173Z 	at io.quarkus.security.runtime.interceptor.AuthenticatedInterceptor.intercept(AuthenticatedInterceptor.java:29)
2026-07-27T19:20:28.6772371Z 	at io.quarkus.security.runtime.interceptor.AuthenticatedInterceptor_Bean.intercept(Unknown Source)
2026-07-27T19:20:28.6772551Z 	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
2026-07-27T19:20:28.6772743Z 	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:41)
2026-07-27T19:20:28.6772928Z 	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:33)
2026-07-27T19:20:28.6773109Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource_Subclass.buscarArquivosERelatorios(Unknown Source)
2026-07-27T19:20:28.6773317Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-27T19:20:28.6773502Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-27T19:20:28.6773709Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-27T19:20:28.6773894Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-07-27T19:20:28.6774054Z 	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:170)
2026-07-27T19:20:28.6774265Z 	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:130)
2026-07-27T19:20:28.6774453Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:660)
2026-07-27T19:20:28.6774662Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:524)
2026-07-27T19:20:28.6774879Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:474)
2026-07-27T19:20:28.6775092Z 	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
2026-07-27T19:20:28.6775309Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:476)
2026-07-27T19:20:28.6775496Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:434)
2026-07-27T19:20:28.6775682Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:408)
2026-07-27T19:20:28.6775869Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:69)
2026-07-27T19:20:28.6776050Z 	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:492)
2026-07-27T19:20:28.6776230Z 	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:261)
2026-07-27T19:20:28.6776431Z 	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
2026-07-27T19:20:28.6776643Z 	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
2026-07-27T19:20:28.6776855Z 	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
2026-07-27T19:20:28.6777043Z 	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
2026-07-27T19:20:28.6777233Z 	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
2026-07-27T19:20:28.6777425Z 	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
2026-07-27T19:20:28.6777626Z 	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
2026-07-27T19:20:28.6777816Z 	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
2026-07-27T19:20:28.6778006Z 	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
2026-07-27T19:20:28.6778189Z 	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
2026-07-27T19:20:28.6778357Z 	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
2026-07-27T19:20:28.6778543Z 	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
2026-07-27T19:20:28.6778736Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-07-27T19:20:28.6778910Z 	at java.base/java.lang.Thread.run(Thread.java:829)
2026-07-27T19:20:28.6778974Z 
2026-07-27T19:20:28.6779242Z 2026-07-27 15:56:48,628 ERROR [br.gov.cai.sig.exc.han.SIGFAExceptionHandlerGeneric] (executor-thread-7) Acesso n?o autorizado ao caminho: /apl/siart
2026-07-27T19:20:28.6779617Z 2026-07-27 15:56:48,629 ERROR [br.gov.cai.sig.exc.han.SIGFAExceptionHandlerGeneric] (executor-thread-7) Ocorreu um erro inesperado: java.lang.SecurityException: Acesso n?o autorizado ao caminho: /apl/siart
2026-07-27T19:20:28.6779869Z 	at br.gov.caixa.sigfa.util.PathUtil.ensureSafePath(PathUtil.java:58)
2026-07-27T19:20:28.6780030Z 	at br.gov.caixa.sigfa.util.PathUtil.of(PathUtil.java:27)
2026-07-27T19:20:28.6780204Z 	at br.gov.caixa.sigfa.service.ConciliacaoService.buscarArquivosERelatorios(ConciliacaoService.java:69)
2026-07-27T19:20:28.6780397Z 	at br.gov.caixa.sigfa.service.ConciliacaoService_ClientProxy.buscarArquivosERelatorios(Unknown Source)
2026-07-27T19:20:28.6780587Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource.buscarArquivosERelatorios(ConciliacaoResource.java:56)
2026-07-27T19:20:28.6780823Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource_Subclass.buscarArquivosERelatorios$$superforward1(Unknown Source)
2026-07-27T19:20:28.6781006Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource_Subclass$$function$$1.apply(Unknown Source)
2026-07-27T19:20:28.6781181Z 	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:54)
2026-07-27T19:20:28.6781380Z 	at io.quarkus.security.runtime.interceptor.SecurityHandler.handle(SecurityHandler.java:47)
2026-07-27T19:20:28.6781582Z 	at io.quarkus.security.runtime.interceptor.AuthenticatedInterceptor.intercept(AuthenticatedInterceptor.java:29)
2026-07-27T19:20:28.6781772Z 	at io.quarkus.security.runtime.interceptor.AuthenticatedInterceptor_Bean.intercept(Unknown Source)
2026-07-27T19:20:28.6782013Z 	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
2026-07-27T19:20:28.6782208Z 	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:41)
2026-07-27T19:20:28.6782393Z 	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:33)
2026-07-27T19:20:28.6782577Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource_Subclass.buscarArquivosERelatorios(Unknown Source)
2026-07-27T19:20:28.6782841Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-27T19:20:28.6783046Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-27T19:20:28.6783249Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-27T19:20:28.6783421Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-07-27T19:20:28.6783588Z 	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:170)
2026-07-27T19:20:28.6783765Z 	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:130)
2026-07-27T19:20:28.6783956Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:660)
2026-07-27T19:20:28.6784158Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:524)
2026-07-27T19:20:28.6784366Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:474)
2026-07-27T19:20:28.6784822Z 	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
2026-07-27T19:20:28.6785163Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:476)
2026-07-27T19:20:28.6785357Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:434)
2026-07-27T19:20:28.6785543Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:408)
2026-07-27T19:20:28.6785729Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:69)
2026-07-27T19:20:28.6785915Z 	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:492)
2026-07-27T19:20:28.6786097Z 	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:261)
2026-07-27T19:20:28.6786295Z 	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
2026-07-27T19:20:28.6786515Z 	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
2026-07-27T19:20:28.6786773Z 	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
2026-07-27T19:20:28.6786958Z 	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
2026-07-27T19:20:28.6787137Z 	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
2026-07-27T19:20:28.6787338Z 	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
2026-07-27T19:20:28.6787575Z 	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
2026-07-27T19:20:28.6787766Z 	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
2026-07-27T19:20:28.6787954Z 	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
2026-07-27T19:20:28.6788142Z 	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
2026-07-27T19:20:28.6788314Z 	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
2026-07-27T19:20:28.6788500Z 	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
2026-07-27T19:20:28.6788745Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-07-27T19:20:28.6788920Z 	at java.base/java.lang.Thread.run(Thread.java:829)
2026-07-27T19:20:28.6788984Z 
2026-07-27T19:20:28.6789248Z 2026-07-27 15:57:40,076 ERROR [br.gov.cai.sig.exc.han.SIGFAExceptionHandlerGeneric] (executor-thread-6) Acesso n?o autorizado ao caminho: /apl/siart
2026-07-27T19:20:28.6789622Z 2026-07-27 15:57:40,076 ERROR [br.gov.cai.sig.exc.han.SIGFAExceptionHandlerGeneric] (executor-thread-6) Ocorreu um erro inesperado: java.lang.SecurityException: Acesso n?o autorizado ao caminho: /apl/siart
2026-07-27T19:20:28.6789841Z 	at br.gov.caixa.sigfa.util.PathUtil.ensureSafePath(PathUtil.java:58)
2026-07-27T19:20:28.6790006Z 	at br.gov.caixa.sigfa.util.PathUtil.of(PathUtil.java:27)
2026-07-27T19:20:28.6790197Z 	at br.gov.caixa.sigfa.service.ConciliacaoService.buscarArquivosERelatorios(ConciliacaoService.java:69)
2026-07-27T19:20:28.6790379Z 	at br.gov.caixa.sigfa.service.ConciliacaoService_ClientProxy.buscarArquivosERelatorios(Unknown Source)
2026-07-27T19:20:28.6790569Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource.buscarArquivosERelatorios(ConciliacaoResource.java:56)
2026-07-27T19:20:28.6790768Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource_Subclass.buscarArquivosERelatorios$$superforward1(Unknown Source)
2026-07-27T19:20:28.6790952Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource_Subclass$$function$$1.apply(Unknown Source)
2026-07-27T19:20:28.6791139Z 	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:54)
2026-07-27T19:20:28.6791337Z 	at io.quarkus.security.runtime.interceptor.SecurityHandler.handle(SecurityHandler.java:47)
2026-07-27T19:20:28.6791530Z 	at io.quarkus.security.runtime.interceptor.AuthenticatedInterceptor.intercept(AuthenticatedInterceptor.java:29)
2026-07-27T19:20:28.6791725Z 	at io.quarkus.security.runtime.interceptor.AuthenticatedInterceptor_Bean.intercept(Unknown Source)
2026-07-27T19:20:28.6791976Z 	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
2026-07-27T19:20:28.6792180Z 	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:41)
2026-07-27T19:20:28.6792375Z 	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:33)
2026-07-27T19:20:28.6792551Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource_Subclass.buscarArquivosERelatorios(Unknown Source)
2026-07-27T19:20:28.6792719Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-27T19:20:28.6792906Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-27T19:20:28.6793145Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-27T19:20:28.6793326Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-07-27T19:20:28.6793494Z 	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:170)
2026-07-27T19:20:28.6793662Z 	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:130)
2026-07-27T19:20:28.6793857Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:660)
2026-07-27T19:20:28.6794097Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:524)
2026-07-27T19:20:28.6794306Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:474)
2026-07-27T19:20:28.6794525Z 	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
2026-07-27T19:20:28.6794743Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:476)
2026-07-27T19:20:28.6794921Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:434)
2026-07-27T19:20:28.6795106Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:408)
2026-07-27T19:20:28.6795289Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:69)
2026-07-27T19:20:28.6795470Z 	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:492)
2026-07-27T19:20:28.6795661Z 	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:261)
2026-07-27T19:20:28.6795847Z 	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
2026-07-27T19:20:28.6796063Z 	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
2026-07-27T19:20:28.6796275Z 	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
2026-07-27T19:20:28.6796460Z 	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
2026-07-27T19:20:28.6796647Z 	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
2026-07-27T19:20:28.6796842Z 	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
2026-07-27T19:20:28.6797033Z 	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
2026-07-27T19:20:28.6797223Z 	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
2026-07-27T19:20:28.6797409Z 	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
2026-07-27T19:20:28.6797594Z 	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
2026-07-27T19:20:28.6797771Z 	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
2026-07-27T19:20:28.6797944Z 	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
2026-07-27T19:20:28.6798140Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-07-27T19:20:28.6798307Z 	at java.base/java.lang.Thread.run(Thread.java:829)
2026-07-27T19:20:28.6798368Z 
2026-07-27T19:20:28.6798629Z 2026-07-27 15:58:17,768 ERROR [br.gov.cai.sig.exc.han.SIGFAExceptionHandlerGeneric] (executor-thread-7) Acesso n?o autorizado ao caminho: /apl/siart
2026-07-27T19:20:28.6799011Z 2026-07-27 15:58:17,768 ERROR [br.gov.cai.sig.exc.han.SIGFAExceptionHandlerGeneric] (executor-thread-7) Ocorreu um erro inesperado: java.lang.SecurityException: Acesso n?o autorizado ao caminho: /apl/siart
2026-07-27T19:20:28.6799223Z 	at br.gov.caixa.sigfa.util.PathUtil.ensureSafePath(PathUtil.java:58)
2026-07-27T19:20:28.6799385Z 	at br.gov.caixa.sigfa.util.PathUtil.of(PathUtil.java:27)
2026-07-27T19:20:28.6799565Z 	at br.gov.caixa.sigfa.service.ConciliacaoService.buscarArquivosERelatorios(ConciliacaoService.java:69)
2026-07-27T19:20:28.6799796Z 	at br.gov.caixa.sigfa.service.ConciliacaoService_ClientProxy.buscarArquivosERelatorios(Unknown Source)
2026-07-27T19:20:28.6799988Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource.buscarArquivosERelatorios(ConciliacaoResource.java:56)
2026-07-27T19:20:28.6800187Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource_Subclass.buscarArquivosERelatorios$$superforward1(Unknown Source)
2026-07-27T19:20:28.6800366Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource_Subclass$$function$$1.apply(Unknown Source)
2026-07-27T19:20:28.6800582Z 	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:54)
2026-07-27T19:20:28.6800765Z 	at io.quarkus.security.runtime.interceptor.SecurityHandler.handle(SecurityHandler.java:47)
2026-07-27T19:20:28.6800967Z 	at io.quarkus.security.runtime.interceptor.AuthenticatedInterceptor.intercept(AuthenticatedInterceptor.java:29)
2026-07-27T19:20:28.6801163Z 	at io.quarkus.security.runtime.interceptor.AuthenticatedInterceptor_Bean.intercept(Unknown Source)
2026-07-27T19:20:28.6801337Z 	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
2026-07-27T19:20:28.6801522Z 	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:41)
2026-07-27T19:20:28.6801713Z 	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:33)
2026-07-27T19:20:28.6801935Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource_Subclass.buscarArquivosERelatorios(Unknown Source)
2026-07-27T19:20:28.6802115Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-27T19:20:28.6802300Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-27T19:20:28.6802503Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-27T19:20:28.6802689Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-07-27T19:20:28.6802847Z 	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:170)
2026-07-27T19:20:28.6803030Z 	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:130)
2026-07-27T19:20:28.6803223Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:660)
2026-07-27T19:20:28.6803431Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:524)
2026-07-27T19:20:28.6803641Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:474)
2026-07-27T19:20:28.6803864Z 	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
2026-07-27T19:20:28.6804066Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:476)
2026-07-27T19:20:28.6804258Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:434)
2026-07-27T19:20:28.6804478Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:408)
2026-07-27T19:20:28.6804662Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:69)
2026-07-27T19:20:28.6804847Z 	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:492)
2026-07-27T19:20:28.6805035Z 	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:261)
2026-07-27T19:20:28.6805224Z 	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
2026-07-27T19:20:28.6805438Z 	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
2026-07-27T19:20:28.6805643Z 	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
2026-07-27T19:20:28.6805826Z 	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
2026-07-27T19:20:28.6806050Z 	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
2026-07-27T19:20:28.6806242Z 	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
2026-07-27T19:20:28.6806445Z 	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
2026-07-27T19:20:28.6806634Z 	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
2026-07-27T19:20:28.6806849Z 	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
2026-07-27T19:20:28.6807037Z 	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
2026-07-27T19:20:28.6807216Z 	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
2026-07-27T19:20:28.6807389Z 	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
2026-07-27T19:20:28.6807588Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-07-27T19:20:28.6807758Z 	at java.base/java.lang.Thread.run(Thread.java:829)
2026-07-27T19:20:28.6807819Z 
2026-07-27T19:20:28.6808082Z 2026-07-27 15:59:00,028 ERROR [br.gov.cai.sig.exc.han.SIGFAExceptionHandlerGeneric] (executor-thread-6) Acesso n?o autorizado ao caminho: /apl/siart
2026-07-27T19:20:28.6808458Z 2026-07-27 15:59:00,028 ERROR [br.gov.cai.sig.exc.han.SIGFAExceptionHandlerGeneric] (executor-thread-6) Ocorreu um erro inesperado: java.lang.SecurityException: Acesso n?o autorizado ao caminho: /apl/siart
2026-07-27T19:20:28.6808678Z 	at br.gov.caixa.sigfa.util.PathUtil.ensureSafePath(PathUtil.java:58)
2026-07-27T19:20:28.6808838Z 	at br.gov.caixa.sigfa.util.PathUtil.of(PathUtil.java:27)
2026-07-27T19:20:28.6809008Z 	at br.gov.caixa.sigfa.service.ConciliacaoService.buscarArquivosERelatorios(ConciliacaoService.java:69)
2026-07-27T19:20:28.6809315Z 	at br.gov.caixa.sigfa.service.ConciliacaoService_ClientProxy.buscarArquivosERelatorios(Unknown Source)
2026-07-27T19:20:28.6809511Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource.buscarArquivosERelatorios(ConciliacaoResource.java:56)
2026-07-27T19:20:28.6809712Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource_Subclass.buscarArquivosERelatorios$$superforward1(Unknown Source)
2026-07-27T19:20:28.6809891Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource_Subclass$$function$$1.apply(Unknown Source)
2026-07-27T19:20:28.6810073Z 	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:54)
2026-07-27T19:20:28.6810260Z 	at io.quarkus.security.runtime.interceptor.SecurityHandler.handle(SecurityHandler.java:47)
2026-07-27T19:20:28.6810462Z 	at io.quarkus.security.runtime.interceptor.AuthenticatedInterceptor.intercept(AuthenticatedInterceptor.java:29)
2026-07-27T19:20:28.6810655Z 	at io.quarkus.security.runtime.interceptor.AuthenticatedInterceptor_Bean.intercept(Unknown Source)
2026-07-27T19:20:28.6810833Z 	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
2026-07-27T19:20:28.6811022Z 	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:41)
2026-07-27T19:20:28.6811211Z 	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:33)
2026-07-27T19:20:28.6811383Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource_Subclass.buscarArquivosERelatorios(Unknown Source)
2026-07-27T19:20:28.6811551Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-27T19:20:28.6811736Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-27T19:20:28.6811993Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-27T19:20:28.6812181Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-07-27T19:20:28.6812339Z 	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:170)
2026-07-27T19:20:28.6812553Z 	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:130)
2026-07-27T19:20:28.6812743Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:660)
2026-07-27T19:20:28.6812949Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:524)
2026-07-27T19:20:28.6813157Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:474)
2026-07-27T19:20:28.6813409Z 	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
2026-07-27T19:20:28.6813612Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:476)
2026-07-27T19:20:28.6813801Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:434)
2026-07-27T19:20:28.6813982Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:408)
2026-07-27T19:20:28.6814166Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:69)
2026-07-27T19:20:28.6814347Z 	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:492)
2026-07-27T19:20:28.6814585Z 	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:261)
2026-07-27T19:20:28.6814788Z 	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
2026-07-27T19:20:28.6815010Z 	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
2026-07-27T19:20:28.6815222Z 	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
2026-07-27T19:20:28.6815408Z 	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
2026-07-27T19:20:28.6815599Z 	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
2026-07-27T19:20:28.6815788Z 	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
2026-07-27T19:20:28.6815993Z 	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
2026-07-27T19:20:28.6816188Z 	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
2026-07-27T19:20:28.6816377Z 	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
2026-07-27T19:20:28.6816562Z 	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
2026-07-27T19:20:28.6816741Z 	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
2026-07-27T19:20:28.6816915Z 	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
2026-07-27T19:20:28.6817109Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-07-27T19:20:28.6817275Z 	at java.base/java.lang.Thread.run(Thread.java:829)
2026-07-27T19:20:28.6817339Z 
2026-07-27T19:20:28.6817605Z 2026-07-27 16:02:56,395 ERROR [br.gov.cai.sig.exc.han.SIGFAExceptionHandlerGeneric] (executor-thread-6) Acesso n?o autorizado ao caminho: /apl/siart
2026-07-27T19:20:28.6817992Z 2026-07-27 16:02:56,395 ERROR [br.gov.cai.sig.exc.han.SIGFAExceptionHandlerGeneric] (executor-thread-6) Ocorreu um erro inesperado: java.lang.SecurityException: Acesso n?o autorizado ao caminho: /apl/siart
2026-07-27T19:20:28.6818215Z 	at br.gov.caixa.sigfa.util.PathUtil.ensureSafePath(PathUtil.java:58)
2026-07-27T19:20:28.6818380Z 	at br.gov.caixa.sigfa.util.PathUtil.of(PathUtil.java:27)
2026-07-27T19:20:28.6818552Z 	at br.gov.caixa.sigfa.service.ConciliacaoService.buscarArquivosERelatorios(ConciliacaoService.java:69)
2026-07-27T19:20:28.6818742Z 	at br.gov.caixa.sigfa.service.ConciliacaoService_ClientProxy.buscarArquivosERelatorios(Unknown Source)
2026-07-27T19:20:28.6818933Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource.buscarArquivosERelatorios(ConciliacaoResource.java:56)
2026-07-27T19:20:28.6819176Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource_Subclass.buscarArquivosERelatorios$$superforward1(Unknown Source)
2026-07-27T19:20:28.6819351Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource_Subclass$$function$$1.apply(Unknown Source)
2026-07-27T19:20:28.6819537Z 	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:54)
2026-07-27T19:20:28.6819720Z 	at io.quarkus.security.runtime.interceptor.SecurityHandler.handle(SecurityHandler.java:47)
2026-07-27T19:20:28.6819954Z 	at io.quarkus.security.runtime.interceptor.AuthenticatedInterceptor.intercept(AuthenticatedInterceptor.java:29)
2026-07-27T19:20:28.6820146Z 	at io.quarkus.security.runtime.interceptor.AuthenticatedInterceptor_Bean.intercept(Unknown Source)
2026-07-27T19:20:28.6820321Z 	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
2026-07-27T19:20:28.6820512Z 	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:41)
2026-07-27T19:20:28.6820705Z 	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:33)
2026-07-27T19:20:28.6820877Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource_Subclass.buscarArquivosERelatorios(Unknown Source)
2026-07-27T19:20:28.6821041Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-27T19:20:28.6821219Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-27T19:20:28.6821421Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-27T19:20:28.6821600Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-07-27T19:20:28.6821758Z 	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:170)
2026-07-27T19:20:28.6821990Z 	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:130)
2026-07-27T19:20:28.6822187Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:660)
2026-07-27T19:20:28.6822397Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:524)
2026-07-27T19:20:28.6822605Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:474)
2026-07-27T19:20:28.6822892Z 	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
2026-07-27T19:20:28.6823096Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:476)
2026-07-27T19:20:28.6823287Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:434)
2026-07-27T19:20:28.6823467Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:408)
2026-07-27T19:20:28.6823649Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:69)
2026-07-27T19:20:28.6823831Z 	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:492)
2026-07-27T19:20:28.6824010Z 	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:261)
2026-07-27T19:20:28.6824208Z 	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
2026-07-27T19:20:28.6824417Z 	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
2026-07-27T19:20:28.6824629Z 	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
2026-07-27T19:20:28.6824814Z 	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
2026-07-27T19:20:28.6825005Z 	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
2026-07-27T19:20:28.6825192Z 	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
2026-07-27T19:20:28.6825437Z 	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
2026-07-27T19:20:28.6825631Z 	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
2026-07-27T19:20:28.6825815Z 	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
2026-07-27T19:20:28.6826001Z 	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
2026-07-27T19:20:28.6826169Z 	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
2026-07-27T19:20:28.6826387Z 	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
2026-07-27T19:20:28.6826583Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-07-27T19:20:28.6826757Z 	at java.base/java.lang.Thread.run(Thread.java:829)
2026-07-27T19:20:28.6826820Z 
2026-07-27T19:20:28.6827085Z 2026-07-27 16:08:07,274 ERROR [br.gov.cai.sig.exc.han.SIGFAExceptionHandlerGeneric] (executor-thread-6) Acesso n?o autorizado ao caminho: /apl/siart
2026-07-27T19:20:28.6827460Z 2026-07-27 16:08:07,275 ERROR [br.gov.cai.sig.exc.han.SIGFAExceptionHandlerGeneric] (executor-thread-6) Ocorreu um erro inesperado: java.lang.SecurityException: Acesso n?o autorizado ao caminho: /apl/siart
2026-07-27T19:20:28.6827679Z 	at br.gov.caixa.sigfa.util.PathUtil.ensureSafePath(PathUtil.java:58)
2026-07-27T19:20:28.6827840Z 	at br.gov.caixa.sigfa.util.PathUtil.of(PathUtil.java:27)
2026-07-27T19:20:28.6828010Z 	at br.gov.caixa.sigfa.service.ConciliacaoService.buscarArquivosERelatorios(ConciliacaoService.java:69)
2026-07-27T19:20:28.6828202Z 	at br.gov.caixa.sigfa.service.ConciliacaoService_ClientProxy.buscarArquivosERelatorios(Unknown Source)
2026-07-27T19:20:28.6828398Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource.buscarArquivosERelatorios(ConciliacaoResource.java:56)
2026-07-27T19:20:28.6828597Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource_Subclass.buscarArquivosERelatorios$$superforward1(Unknown Source)
2026-07-27T19:20:28.6828777Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource_Subclass$$function$$1.apply(Unknown Source)
2026-07-27T19:20:28.6828959Z 	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:54)
2026-07-27T19:20:28.6829143Z 	at io.quarkus.security.runtime.interceptor.SecurityHandler.handle(SecurityHandler.java:47)
2026-07-27T19:20:28.6829344Z 	at io.quarkus.security.runtime.interceptor.AuthenticatedInterceptor.intercept(AuthenticatedInterceptor.java:29)
2026-07-27T19:20:28.6829536Z 	at io.quarkus.security.runtime.interceptor.AuthenticatedInterceptor_Bean.intercept(Unknown Source)
2026-07-27T19:20:28.6829710Z 	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
2026-07-27T19:20:28.6829898Z 	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:41)
2026-07-27T19:20:28.6830081Z 	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:33)
2026-07-27T19:20:28.6830263Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource_Subclass.buscarArquivosERelatorios(Unknown Source)
2026-07-27T19:20:28.6830431Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-27T19:20:28.6830611Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-27T19:20:28.6830812Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-27T19:20:28.6830993Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-07-27T19:20:28.6831149Z 	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:170)
2026-07-27T19:20:28.6831325Z 	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:130)
2026-07-27T19:20:28.6831515Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:660)
2026-07-27T19:20:28.6831748Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:524)
2026-07-27T19:20:28.6832026Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:474)
2026-07-27T19:20:28.6832241Z 	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
2026-07-27T19:20:28.6832457Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:476)
2026-07-27T19:20:28.6832644Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:434)
2026-07-27T19:20:28.6832859Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:408)
2026-07-27T19:20:28.6833042Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:69)
2026-07-27T19:20:28.6833223Z 	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:492)
2026-07-27T19:20:28.6833404Z 	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:261)
2026-07-27T19:20:28.6833598Z 	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
2026-07-27T19:20:28.6833811Z 	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
2026-07-27T19:20:28.6834021Z 	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
2026-07-27T19:20:28.6834206Z 	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
2026-07-27T19:20:28.6834398Z 	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
2026-07-27T19:20:28.6834586Z 	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
2026-07-27T19:20:28.6834785Z 	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
2026-07-27T19:20:28.6834977Z 	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
2026-07-27T19:20:28.6835166Z 	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
2026-07-27T19:20:28.6835350Z 	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
2026-07-27T19:20:28.6835518Z 	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
2026-07-27T19:20:28.6835701Z 	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
2026-07-27T19:20:28.6835897Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-07-27T19:20:28.6836065Z 	at java.base/java.lang.Thread.run(Thread.java:829)
2026-07-27T19:20:28.6836127Z 
2026-07-27T19:20:28.6836223Z Data inv?lida: 25
2026-07-27T19:20:28.6836318Z null
2026-07-27T19:20:28.6836613Z 2026-07-27 16:16:49,398 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=qwCUJ53eQFaKHPmbPC5TOg==)
2026-07-27T19:20:28.6836992Z 2026-07-27 16:16:49,402 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=2BZCj6X0TLCZ6+WOrYJdAQ==)
2026-07-27T19:20:28.6837368Z 2026-07-27 16:16:49,403 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=vuXlYe0nR2WrLk+v7aMW6g==)
2026-07-27T19:20:28.6837738Z 2026-07-27 16:16:49,404 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=gv6LYDhYTr6aVFCwpLxPDQ==)
2026-07-27T19:20:28.6838102Z 2026-07-27 16:16:49,404 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=jWN/m1bUR4uFx2fT0L+txQ==)
2026-07-27T19:20:28.6838456Z 2026-07-27 16:16:49,405 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=DHukT8+2SLWwKKG116Wt/A==)
2026-07-27T19:20:28.6838850Z 2026-07-27 16:16:49,405 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=tZTjl7EYQ0KTEIAGZgJgGg==)
2026-07-27T19:20:28.6839209Z 2026-07-27 16:16:49,406 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=Lciu4sz7TCK+pwM27jNfWA==)
2026-07-27T19:20:28.6839600Z 2026-07-27 16:16:49,406 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=Zp+4R65RTgSAanUUP/31Bg==)
2026-07-27T19:20:28.6839937Z 2026-07-27 16:16:49,407 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=pukEsxQQQvG+PjAekARLJw==)
2026-07-27T19:20:28.6840288Z 2026-07-27 16:16:49,407 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=zg8ld0CBRie3zFZqLkTJsQ==)
2026-07-27T19:20:28.6840634Z 2026-07-27 16:16:49,410 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=uVsilDewRvSEwjxHQXh6bg==)
2026-07-27T19:20:28.6840976Z 2026-07-27 16:16:49,411 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=atRqYP/sTQaBAxMw52UIzg==)
2026-07-27T19:20:28.6841322Z 2026-07-27 16:16:49,411 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=cS9In0hhRKqtNMD7nncBnA==)
2026-07-27T19:20:28.6841665Z 2026-07-27 16:16:49,412 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=Y6kN1zphSJCbATSZ1tDHQQ==)
2026-07-27T19:20:28.6842067Z 2026-07-27 16:16:49,412 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=ocT7bCrdSWiBAzRdrVErFA==)
2026-07-27T19:20:28.6842427Z 2026-07-27 16:16:49,413 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=33PioqlJS3eUIuHmaGYQmg==)
2026-07-27T19:20:28.6842777Z 2026-07-27 16:16:49,413 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=OJp24zd8SYW8AqrkrvZG9A==)
2026-07-27T19:20:28.6843123Z 2026-07-27 16:16:49,414 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=ThyggqJ+TICWZQcE3+mCSA==)
2026-07-27T19:20:28.6843473Z 2026-07-27 16:16:49,414 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=4pNsm/qKRuCFDUgIFrn9Fw==)
2026-07-27T19:20:28.6843822Z 2026-07-27 16:16:49,415 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=I+qMQjo6TwGABPgyUyuqBA==)
2026-07-27T19:20:28.6844176Z 2026-07-27 16:16:49,417 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=j7Gn7OmrT0OpvaFtdsJ2pQ==)
2026-07-27T19:20:28.6844590Z 2026-07-27 16:16:49,418 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=cWo6Ln/BRziIaehAdPrEPA==)
2026-07-27T19:20:28.6844967Z 2026-07-27 16:16:49,419 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=11xgpjmiS/eHYxbQtNk0qQ==)
2026-07-27T19:20:28.6845324Z 2026-07-27 16:16:49,419 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=OJ7SaI56Raq/L3cVl1VI2w==)
2026-07-27T19:20:28.6845733Z 2026-07-27 16:16:49,420 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=ZCyNO2T0Q/SUokVOX5xw4g==)
2026-07-27T19:20:28.6846086Z 2026-07-27 16:16:49,420 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=f20yOofNRe6kg/ihJumGmA==)
2026-07-27T19:20:28.6846458Z 2026-07-27 16:16:49,421 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=ogsGr/nARsSbFazOGFXKMw==)
2026-07-27T19:20:28.6846806Z 2026-07-27 16:16:49,421 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=iSCVZTcfS9iYJjrJJttHnA==)
2026-07-27T19:20:28.6847153Z 2026-07-27 16:16:49,422 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=EXTGVy+tRUOdonqdmVJO9w==)
2026-07-27T19:20:28.6847502Z 2026-07-27 16:16:49,422 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=G8gdqSpjTtSS6W5vaEM+Nw==)
2026-07-27T19:20:28.6847848Z 2026-07-27 16:16:49,425 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=xJFr+g3xTyC1ccAL/zAwtg==)
2026-07-27T19:20:28.6848197Z 2026-07-27 16:16:49,425 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=5scC4czfRT2QgHMcqOeivw==)
2026-07-27T19:20:28.6848550Z 2026-07-27 16:16:49,426 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=FXy2Q6+hT8yUK04f+RT4bw==)
2026-07-27T19:20:28.6848909Z 2026-07-27 16:16:49,426 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=9HGNpuixSXuvkbfk2Qcy4g==)
2026-07-27T19:20:28.6849261Z 2026-07-27 16:16:49,427 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=lkIIAcjdQPWEwFXFgGaQGA==)
2026-07-27T19:20:28.6849602Z 2026-07-27 16:16:49,427 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=F6SzqvGRQ8aRszstVp5Pug==)
2026-07-27T19:20:28.6849959Z 2026-07-27 16:16:49,428 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=7O99AYRpQsqKeZDua+kQ8A==)
2026-07-27T19:20:28.6850311Z 2026-07-27 16:16:49,428 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=HtbaZogASt2ctF/my2gf5w==)
2026-07-27T19:20:28.6850663Z 2026-07-27 16:16:49,429 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=TIKLO1bmRDiD5WhEk3In5A==)
2026-07-27T19:20:28.6851010Z 2026-07-27 16:16:49,429 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=R19CBUecTXWGFw/p5pBmSg==)
2026-07-27T19:20:28.6851387Z 2026-07-27 16:16:49,432 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=qRDGtXLhTzGpibyTpJFnUQ==)
2026-07-27T19:20:28.6851741Z 2026-07-27 16:16:49,433 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=HOEF49dTRpOjeCjkwr4/FQ==)
2026-07-27T19:20:28.6852165Z 2026-07-27 16:16:49,433 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=hKAAKs6TQcSIHlHnCGNfXA==)
2026-07-27T19:20:28.6852558Z 2026-07-27 16:16:49,434 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=8dxk+zmJTAypLy+57snC7g==)
2026-07-27T19:20:28.6852912Z 2026-07-27 16:16:49,434 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=dDYEq6g6S/CHSLnFi7nkJw==)
2026-07-27T19:20:28.6853266Z 2026-07-27 16:16:49,435 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=aqRUfDedTmyDyLYA+o+YOg==)
2026-07-27T19:20:28.6853659Z 2026-07-27 16:16:49,435 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=WACifqsYTq+EhpEZn9gm5Q==)
2026-07-27T19:20:28.6854010Z 2026-07-27 16:16:49,436 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=GCpqNhNQR56OXomJsI1Q6g==)
2026-07-27T19:20:28.6854367Z 2026-07-27 16:16:49,437 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=iM4Cad8kTd+peP07PwwTMQ==)
2026-07-27T19:20:28.6854720Z 2026-07-27 16:16:49,437 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=VluwoZ+0TXmeytjXzyB/5Q==)
2026-07-27T19:20:28.6855075Z 2026-07-27 16:16:49,440 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=sJM9xpPrRaOEr4F6j2vLIQ==)
2026-07-27T19:20:28.6855426Z 2026-07-27 16:16:49,441 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=BAGVJkU/SUyQa9MS5pVw6w==)
2026-07-27T19:20:28.6855772Z 2026-07-27 16:16:49,441 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=2wdT+cUOTNameo4zR/9BZw==)
2026-07-27T19:20:28.6856122Z 2026-07-27 16:16:49,442 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=SzQFUZN2QtC4vyDxIjqHYw==)
2026-07-27T19:20:28.6856472Z 2026-07-27 16:16:49,442 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=DUmJryfdQxumJtfJGl60xA==)
2026-07-27T19:20:28.6856825Z 2026-07-27 16:16:49,443 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=EEkNCstOSRWUkJCHJDb2SQ==)
2026-07-27T19:20:28.6857177Z 2026-07-27 16:16:49,443 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=g8VA45wASfmuPzrSvJJxqA==)
2026-07-27T19:20:28.6857531Z 2026-07-27 16:16:49,444 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=Ua3ezcNeTuOPn99lCwSmpA==)
2026-07-27T19:20:28.6857884Z 2026-07-27 16:16:49,444 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=YUcd8kgOQ8yn7gI7NkFCVA==)
2026-07-27T19:20:28.6858235Z 2026-07-27 16:16:49,445 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=5lRPTJyURE+9rv5GKCW3oQ==)
2026-07-27T19:20:28.6858589Z 2026-07-27 16:16:49,447 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=3LRQf2klSD2Gnk/ASn+5Hw==)
2026-07-27T19:20:28.6858932Z 2026-07-27 16:16:49,448 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=hmjP6h86R5G4C0gdi8fU2w==)
2026-07-27T19:20:28.6859345Z 2026-07-27 16:16:49,449 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=zrucGx8PRRGLxc6+790V9w==)
2026-07-27T19:20:28.6859696Z 2026-07-27 16:16:49,449 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=Ib18ugbYQt6R5bHUIogDhA==)
2026-07-27T19:20:28.6860041Z 2026-07-27 16:16:49,450 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=Wlofub/qQZiCWMXN3fPBTg==)
2026-07-27T19:20:28.6860451Z 2026-07-27 16:16:49,450 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=GPX9u7IzRSSfPzD9NmYXFA==)
2026-07-27T19:20:28.6860801Z 2026-07-27 16:16:49,451 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=7acr/z95QEmkZ8bfTGcH8Q==)
2026-07-27T19:20:28.6861156Z 2026-07-27 16:16:49,451 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=SsqbQzYzR8Cg0316UdtdOg==)
2026-07-27T19:20:28.6861508Z 2026-07-27 16:16:49,452 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=a/YevNuGS2KXyJu8RlcYFQ==)
2026-07-27T19:20:28.6861859Z 2026-07-27 16:16:49,452 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=E4NIAQ0WRVKZIOToYym1sA==)
2026-07-27T19:20:28.6862267Z 2026-07-27 16:16:49,455 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=HWqn0sR9TaybGO1A8u6MDA==)
2026-07-27T19:20:28.6862634Z 2026-07-27 16:16:49,455 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=X9EcyM4fQVGxTX4jR3WzcA==)
2026-07-27T19:20:28.6863044Z 2026-07-27 16:16:49,456 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=GhiebfzBT+6saoWg7CmiDw==)
2026-07-27T19:20:28.6863412Z 2026-07-27 16:16:49,497 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=RPm6mPESR0ak+JVRy/Nqww==)
2026-07-27T19:20:28.6863789Z 2026-07-27 16:16:49,498 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=4Nk5k3+pT5qTQXxvtvw//w==)
2026-07-27T19:20:28.6864139Z 2026-07-27 16:16:49,498 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=OGgnNRv7QkyFwco7fZOoMA==)
2026-07-27T19:20:28.6864502Z 2026-07-27 16:16:49,499 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=7zXUsk2nQMKX9IGmonzpPA==)
2026-07-27T19:20:28.6864859Z 2026-07-27 16:16:49,499 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=oMnuq846T7igD3JbvLcviw==)
2026-07-27T19:20:28.6865211Z 2026-07-27 16:16:49,500 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=ZGMqIyrvT/moKm9HbdHVqg==)
2026-07-27T19:20:28.6865555Z 2026-07-27 16:16:49,500 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=rZB4wsaxTw6cszy+yqYkkg==)
2026-07-27T19:20:28.6865896Z 2026-07-27 16:16:49,503 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=NhM880R+RJqd7GKF0UsbKQ==)
2026-07-27T19:20:28.6866271Z 2026-07-27 16:16:49,504 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=XJEJmah2QnavAZ2MV8Uf4A==)
2026-07-27T19:20:28.6866620Z 2026-07-27 16:16:49,504 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=/OTX1y43SFyVn29zDvoxTA==)
2026-07-27T19:20:28.6866972Z 2026-07-27 16:16:49,505 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=AzZXVvVLSNKJzH9rQYmw8A==)
2026-07-27T19:20:28.6867355Z 2026-07-27 16:16:49,505 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=2MJOF3ABT1CN29eqbwz1mA==)
2026-07-27T19:20:28.6867703Z 2026-07-27 16:16:49,505 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=1Mtl0wHOT46z0KIBz2lTkw==)
2026-07-27T19:20:28.6868053Z 2026-07-27 16:16:49,506 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=dJ9CdCNDQfCSrX+p8VmHuA==)
2026-07-27T19:20:28.6868403Z 2026-07-27 16:16:49,506 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=thh15qSNTB2i+5hVo1RXmg==)
2026-07-27T19:20:28.6868756Z 2026-07-27 16:16:49,507 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=WB/UmQZuTW6fU89Hqwk0JA==)
2026-07-27T19:20:28.6869106Z 2026-07-27 16:16:49,507 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=tgK1UqMtTWa3Ek8uungPhw==)
2026-07-27T19:20:28.6869445Z 2026-07-27 16:16:56,984 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=XXOA92viRoGGCooLcVgqNw==)
2026-07-27T19:20:28.6869796Z 2026-07-27 16:16:56,985 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=RGBWnOa2T0OLa5N2FSaJYQ==)
2026-07-27T19:20:28.6870593Z 2026-07-27 16:16:56,990 INFO  [io.sma.health] (executor-thread-6) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=XXOA92viRoGGCooLcVgqNw==)"}},{"name":"Database connections health check","status":"DOWN","data":{"<default>":"Unable to execute the validation check for the default DataSource: IO Error: The Network Adapter could not establish the connection (CONNECTION_ID=RGBWnOa2T0OLa5N2FSaJYQ==)"}}]}
2026-07-27T19:20:28.6871141Z 2026-07-27 16:19:42,471 ERROR [br.gov.cai.sig.exc.han.SIGFAExceptionHandlerGeneric] (executor-thread-7) Acesso n?o autorizado ao caminho: /apl/siart
2026-07-27T19:20:28.6871515Z 2026-07-27 16:19:42,471 ERROR [br.gov.cai.sig.exc.han.SIGFAExceptionHandlerGeneric] (executor-thread-7) Ocorreu um erro inesperado: java.lang.SecurityException: Acesso n?o autorizado ao caminho: /apl/siart
2026-07-27T19:20:28.6871723Z 	at br.gov.caixa.sigfa.util.PathUtil.ensureSafePath(PathUtil.java:58)
2026-07-27T19:20:28.6871945Z 	at br.gov.caixa.sigfa.util.PathUtil.of(PathUtil.java:27)
2026-07-27T19:20:28.6872138Z 	at br.gov.caixa.sigfa.service.ConciliacaoService.buscarArquivosERelatorios(ConciliacaoService.java:69)
2026-07-27T19:20:28.6872330Z 	at br.gov.caixa.sigfa.service.ConciliacaoService_ClientProxy.buscarArquivosERelatorios(Unknown Source)
2026-07-27T19:20:28.6872522Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource.buscarArquivosERelatorios(ConciliacaoResource.java:56)
2026-07-27T19:20:28.6872764Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource_Subclass.buscarArquivosERelatorios$$superforward1(Unknown Source)
2026-07-27T19:20:28.6872931Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource_Subclass$$function$$1.apply(Unknown Source)
2026-07-27T19:20:28.6873119Z 	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:54)
2026-07-27T19:20:28.6873316Z 	at io.quarkus.security.runtime.interceptor.SecurityHandler.handle(SecurityHandler.java:47)
2026-07-27T19:20:28.6873549Z 	at io.quarkus.security.runtime.interceptor.AuthenticatedInterceptor.intercept(AuthenticatedInterceptor.java:29)
2026-07-27T19:20:28.6873741Z 	at io.quarkus.security.runtime.interceptor.AuthenticatedInterceptor_Bean.intercept(Unknown Source)
2026-07-27T19:20:28.6873920Z 	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
2026-07-27T19:20:28.6874103Z 	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:41)
2026-07-27T19:20:28.6874297Z 	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:33)
2026-07-27T19:20:28.6874482Z 	at br.gov.caixa.sigfa.resource.ConciliacaoResource_Subclass.buscarArquivosERelatorios(Unknown Source)
2026-07-27T19:20:28.6874699Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-27T19:20:28.6874882Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-27T19:20:28.6875077Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-27T19:20:28.6875260Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
2026-07-27T19:20:28.6875431Z 	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:170)
2026-07-27T19:20:28.6875611Z 	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:130)
2026-07-27T19:20:28.6875802Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:660)
2026-07-27T19:20:28.6876011Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:524)
2026-07-27T19:20:28.6876211Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:474)
2026-07-27T19:20:28.6876433Z 	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
2026-07-27T19:20:28.6876648Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:476)
2026-07-27T19:20:28.6876838Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:434)
2026-07-27T19:20:28.6877024Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:408)
2026-07-27T19:20:28.6877198Z 	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:69)
2026-07-27T19:20:28.6877383Z 	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:492)
2026-07-27T19:20:28.6877574Z 	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:261)
2026-07-27T19:20:28.6877773Z 	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
2026-07-27T19:20:28.6877989Z 	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
2026-07-27T19:20:28.6878194Z 	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
2026-07-27T19:20:28.6878373Z 	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
2026-07-27T19:20:28.6878563Z 	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
2026-07-27T19:20:28.6878764Z 	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
2026-07-27T19:20:28.6879003Z 	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
2026-07-27T19:20:28.6879195Z 	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
2026-07-27T19:20:28.6879383Z 	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
2026-07-27T19:20:28.6879563Z 	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
2026-07-27T19:20:28.6879745Z 	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
2026-07-27T19:20:28.6879960Z 	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
2026-07-27T19:20:28.6880157Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-07-27T19:20:28.6880327Z 	at java.base/java.lang.Thread.run(Thread.java:829)
2026-07-27T19:20:28.6880390Z 
2026-07-27T19:20:28.6882718Z ##[section]Finishing: Logs da Aplicação


