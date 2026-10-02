2026-10-02T18:24:09.8199588Z ##[section]Starting: Logs da Aplicação
2026-10-02T18:24:09.8203239Z ==============================================================================
2026-10-02T18:24:09.8203323Z Task         : Bash
2026-10-02T18:24:09.8203369Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-02T18:24:09.8203444Z Version      : 3.227.0
2026-10-02T18:24:09.8203490Z Author       : Microsoft Corporation
2026-10-02T18:24:09.8203544Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-02T18:24:09.8203626Z ==============================================================================
2026-10-02T18:24:09.9462837Z Generating script.
2026-10-02T18:24:09.9465454Z ========================== Starting Command Output ===========================
2026-10-02T18:24:09.9468386Z [command]/bin/bash /opt/ads-agent/_work/_temp/d7157f55-7887-4325-9c4d-2648bba8335e.sh
2026-10-02T18:24:09.9509395Z + shopt -s expand_aliases
2026-10-02T18:24:09.9510393Z + [[ -n okd4_nprd ]]
2026-10-02T18:24:09.9510961Z + [[ okd4_nprd =~ ocp ]]
2026-10-02T18:24:09.9511292Z + [[ -n okd4_nprd ]]
2026-10-02T18:24:09.9511478Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-10-02T18:24:09.9511733Z + app=sicbp-menudinamico-backend-des
2026-10-02T18:24:09.9511912Z + oc version
2026-10-02T18:24:10.1094803Z oc v3.11.0+0cbc58b
2026-10-02T18:24:10.1094988Z kubernetes v1.11.0+d4cacc0
2026-10-02T18:24:10.1095303Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-10-02T18:24:10.1220371Z 
2026-10-02T18:24:10.1220842Z Server https://api.nprd.caixa:6443
2026-10-02T18:24:10.1221201Z kubernetes v1.25.0-2824+27e744f55d2e99-dirty
2026-10-02T18:24:10.1261279Z ++ oc get pod -l name=sicbp-menudinamico-backend-des -n sicbp-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-10-02T18:24:10.1264007Z ++ tac
2026-10-02T18:24:10.1264553Z ++ grep -v '^$'
2026-10-02T18:24:10.1264691Z ++ head -n1
2026-10-02T18:24:10.4275680Z + last_pod=sicbp-menudinamico-backend-des-154-45tq5
2026-10-02T18:24:10.4277009Z + echo 'Logs do POD: sicbp-menudinamico-backend-des-154-45tq5'
2026-10-02T18:24:10.4277431Z + oc logs sicbp-menudinamico-backend-des-154-45tq5 -c sicbp-menudinamico-backend-des -n sicbp-des
2026-10-02T18:24:10.4277655Z Logs do POD: sicbp-menudinamico-backend-des-154-45tq5
2026-10-02T18:24:10.8679062Z exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sicbp-menudinamico-backend -Delastic.apm.environment=des -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sicbp-menudinamico-backend -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/menudinamico.jar
2026-10-02T18:24:10.8679825Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-10-02T18:24:10.8680434Z WARNING: sun.reflect.Reflection.getCallerClass is not supported. This will impact performance.
2026-10-02T18:24:10.8680755Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-10-02T18:24:10.8681179Z 2026-10-02 15:20:42.887-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.4.13 started successfully (PID 8, JVM running for 6.973 s)
2026-10-02T18:24:10.8681557Z 2026-10-02 15:20:42.893-03:00 INFO  c.m.applicationinsights.agent - Java version: 17.0.7, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-17-openjdk-17.0.7.0.7-3.el8.x86_64
2026-10-02T18:24:10.8681897Z 2026-10-02 15:20:45.696-03:00 WARN  c.m.a.a.i.p.PerformanceMonitoringService - INITIALISING JFR PROFILING SUBSYSTEM THIS FEATURE IS IN BETA
2026-10-02T18:24:10.8682014Z 
2026-10-02T18:24:10.8682119Z   .   ____          _            __ _ _
2026-10-02T18:24:10.8682275Z  /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
2026-10-02T18:24:10.8682522Z ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
2026-10-02T18:24:10.8682639Z  \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
2026-10-02T18:24:10.8682799Z   '  |____| .__|_| |_|_| |_\__, | / / / /
2026-10-02T18:24:10.8682921Z  =========|_|==============|___/=/_/_/_/
2026-10-02T18:24:10.8683043Z  :: Spring Boot ::                (v2.7.7)
2026-10-02T18:24:10.8683093Z 
2026-10-02T18:24:10.8683300Z Logging initialized using 'class org.apache.ibatis.logging.stdout.StdOutImpl' adapter.
2026-10-02T18:24:10.8683616Z 2026-10-02 15:21:07,940 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-10-02T18:24:10.8684132Z 2026-10-02 15:21:37,750 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-10-02T18:24:10.8684622Z 2026-10-02 15:21:37,750 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-10-02T18:24:10.8685124Z 2026-10-02 15:21:45.359-03:00 ERROR c.azure.core.http.policy.RetryPolicy - {"az.sdk.message":"Retry attempts have been exhausted.","exception":"finishConnect(..) failed: Connection refused: /169.254.169.254:80","tryCount":3}
2026-10-02T18:24:10.8685995Z 2026-10-02 15:22:07,776 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-10-02T18:24:10.8686570Z 2026-10-02 15:22:07,776 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-10-02T18:24:10.8687107Z 2026-10-02 15:22:38,736 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-10-02T18:24:10.8687701Z 2026-10-02 15:22:38,736 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-10-02T18:24:10.8688551Z 2026-10-02 15:23:12,815 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-10-02T18:24:10.8689318Z 2026-10-02 15:23:12,816 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-10-02T18:24:10.8690176Z 2026-10-02 15:23:51,775 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-10-02T18:24:10.8690858Z 2026-10-02 15:23:51,775 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-10-02T18:24:10.8691163Z Creating a new SqlSession
2026-10-02T18:24:10.8691416Z Registering transaction synchronization for SqlSession [org.apache.ibatis.session.defaults.DefaultSqlSession@5bf80b69]
2026-10-02T18:24:10.8691738Z JDBC Connection [HikariProxyConnection@232825967 wrapping oracle.jdbc.driver.T4CConnection@3dec769] will be managed by Spring
2026-10-02T18:24:10.8693805Z 2026-10-02 15:24:07,586 DEBUG org.mybatis.mapper.xml.menu-item.obterMenus : ==>  Preparing: SELECT mi.NU_SEQUENCIAL_ITEM_MENU AS "idItem", mi.NU_ORDEM AS "ordem", mi.DE_MAPA_FUNCIONALIDADE AS "mapaFuncionalidade", mi.NO_ITEM_MENU AS "nomeItem", mi.IC_SISTEMA_LEGADO AS "icLegado", mi.IC_OPCAO_PADRAO AS "icOpcaoPadrao", mi.IC_OPCAO_PADRAO_REMOTO AS "icOpcaoPadraoRemoto", mi.NO_ICONE_ITEM_MENU AS "icone", mi.NU_SQNCL_ITEM_MENU_SBRDE AS "itemMenuPai", mi.IC_ATIVACAO_ITEM AS "ativo", mi.IC_TIPO_ATENDIMENTO AS "tipoAtendimento", r.DE_ROTA AS "rota", r.NO_ROTA AS "nomeMfe", coalesce(servico.LISTA_DE_SERVICOS, 'Nenhum') AS "listaServicos" FROM CBP.CBPTB013_MENU_DINAMICO m INNER JOIN CBP.CBPTB014_ITEM_MENU mi ON m.NU_SEQUENCIAL_MENU = mi.NU_SEQUENCIAL_MENU LEFT OUTER JOIN CBP.CBPTB015_ROTA_MENU_DINAMICO r ON r.NU_SEQUENCIAL_ROTA = mi.NU_SEQUENCIAL_ROTA LEFT OUTER JOIN ( SELECT ser.NU_SEQUENCIAL_ITEM_MENU, LISTAGG(ser.NU_SERVICO, ',') within group (order by ser.NU_SERVICO) AS LISTA_DE_SERVICOS FROM CBP.CBPTB019_ITEM_MENU_SERVICO ser GROUP BY ser.NU_SEQUENCIAL_ITEM_MENU ) servico ON mi.NU_SEQUENCIAL_ITEM_MENU = servico.NU_SEQUENCIAL_ITEM_MENU WHERE 1=1 AND m.IC_CADASTRO_CLIENTE = ? AND m.IC_TIPO_PESSOA = ? AND m.NU_AMBIENTE_APLICACAO = ?
2026-10-02T18:24:10.8694704Z 2026-10-02 15:24:07,883 DEBUG org.mybatis.mapper.xml.menu-item.obterMenus : ==> Parameters: 0(Integer), 0(Integer), 1(Integer)
2026-10-02T18:24:10.8694978Z 2026-10-02 15:24:07,988 DEBUG org.mybatis.mapper.xml.menu-item.obterMenus : <==      Total: 13
2026-10-02T18:24:10.8695170Z Releasing transactional SqlSession [org.apache.ibatis.session.defaults.DefaultSqlSession@5bf80b69]
2026-10-02T18:24:10.8695370Z Transaction synchronization committing SqlSession [org.apache.ibatis.session.defaults.DefaultSqlSession@5bf80b69]
2026-10-02T18:24:10.8695571Z Transaction synchronization deregistering SqlSession [org.apache.ibatis.session.defaults.DefaultSqlSession@5bf80b69]
2026-10-02T18:24:10.8695772Z Transaction synchronization closing SqlSession [org.apache.ibatis.session.defaults.DefaultSqlSession@5bf80b69]
2026-10-02T18:24:10.8771950Z ##[section]Finishing: Logs da Aplicação
