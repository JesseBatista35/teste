-sh-4.2$
-sh-4.2$ oc get dc sicfd-monitoramento-des -n sicfd-des -o jsonpath='{range .spec.template.spec.containers[*].env[*]}{.name}={.value}{"\n"}{end}'
TZ=America/Sao_Paulo
BATCH_QTDE-REGISTROS=10
CRON_EXPR=0 */5 * * * ?
JAVA_OPTIONS_APPEND=-Doracle.jdbc.javaNetNio=false
LOGGING_LEVEL_ROOT=INFO
SISTEMA_AMBIENT=SICFD-des
SISTEMA_NOME=SICFD-monitoramento
SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS=/usr/src/app/secrets_files/SICFD_DES/
SPRING_BATCH_INITIALIZE-SCHEMA=always
SPRING_BATCH_JDBC_TABLE-PREFIX=CFD.CFD_BCH_
SPRING_BATCH_JOB_ENABLED=false
SPRING_DATASOURCE_DRIVER-CLASS-NAME=oracle.jdbc.OracleDriver
SPRING_DATASOURCE_PASSWORD=${SCFDRD01_ORACLE}
SPRING_DATASOURCE_URL=jdbc:oracle:thin:@10.116.101.7:1521/orad01sc
SPRING_DATASOURCE_USERNAME=SCFDRD01
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sicfd-monitoramento-des -n sicfd-des -o jsonpath='{range .spec.template.spec.containers[*].env[*]}{.name}{"\t"}{.valueFrom.secretKeyRef.name}{"\t"}{.valueFrom.secretKeyRef.key}{"\t"}{.valueFrom.configMapKeyRef.name}{"\n"}{end}'
TZ
BATCH_QTDE-REGISTROS
CRON_EXPR
JAVA_OPTIONS_APPEND
LOGGING_LEVEL_ROOT
SISTEMA_AMBIENT
SISTEMA_NOME
SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS
SPRING_BATCH_INITIALIZE-SCHEMA
SPRING_BATCH_JDBC_TABLE-PREFIX
SPRING_BATCH_JOB_ENABLED
SPRING_DATASOURCE_DRIVER-CLASS-NAME
SPRING_DATASOURCE_PASSWORD
SPRING_DATASOURCE_URL
SPRING_DATASOURCE_USERNAME
-sh-4.2$
-sh-4.2$ oc get secret bt-client-secret-sicfd-monitoramento-des -n sicfd-des -o jsonpath='{.data}' | python3 -m json.tool
Expecting value: line 1 column 1 (char 0)
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get configmap -n sicfd-des | grep -i "bt\|beyond\|monitora"
jconnector-config-sicfd-monitoramento                1         6d22h
mgmtlog-config-sicfd-monitoramento                   1         6d22h
portscan-config-sicfd-monitoramento                  1         6d22h
sicfd-after-game-des-script-bt-check                 1         198d
sicfd-consignado-des-script-bt-check                 1         184d
sicfd-consultas-des-script-bt-check                  1         301d
sicfd-cve-des-script-bt-check                        1         183d
sicfd-individualizacao-des-script-bt-check           1         183d
sicfd-monitoramento-des-script-bt-check              1         131d
sicfd-pgfn-des-script-bt-check                       1         347d
sicfd-resposta-assincrona-des-script-bt-check        1         183d
sicfd-resposta-assincrona-pgfn-des-script-bt-check   1         327d
sicfd-retificacao-financeira-des-script-bt-check     1         183d
-sh-4.2$
