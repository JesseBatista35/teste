2026-07-24T01:34:59.2904507Z ##[section]Starting: Criando Rota Customizada
2026-07-24T01:34:59.2908387Z ==============================================================================
2026-07-24T01:34:59.2908475Z Task         : Bash
2026-07-24T01:34:59.2908518Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-24T01:34:59.2908597Z Version      : 3.227.0
2026-07-24T01:34:59.2908640Z Author       : Microsoft Corporation
2026-07-24T01:34:59.2908691Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-24T01:34:59.2908790Z ==============================================================================
2026-07-24T01:35:00.3895631Z Generating script.
2026-07-24T01:35:00.3908639Z ========================== Starting Command Output ===========================
2026-07-24T01:35:00.3916735Z [command]/bin/bash /opt/ads-agent/_work/_temp/e6194e98-ed0d-47bc-9ab9-f037e4acc72a.sh
2026-07-24T01:35:00.4040055Z ##[section]Finishing: Criando Rota Customizada



2026-07-24T01:35:00.4088468Z ##[section]Starting: Criando arquivo PV
2026-07-24T01:35:00.4093529Z ==============================================================================
2026-07-24T01:35:00.4093656Z Task         : Bash
2026-07-24T01:35:00.4093723Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-24T01:35:00.4093837Z Version      : 3.227.0
2026-07-24T01:35:00.4093905Z Author       : Microsoft Corporation
2026-07-24T01:35:00.4093993Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-24T01:35:00.4094121Z ==============================================================================
2026-07-24T01:35:01.4576580Z Generating script.
2026-07-24T01:35:01.4590648Z ========================== Starting Command Output ===========================
2026-07-24T01:35:01.4601774Z [command]/bin/bash /opt/ads-agent/_work/_temp/5dbffd00-f36e-4cbc-895d-44791b39de82.sh
2026-07-24T01:35:01.4715994Z apiVersion: v1
2026-07-24T01:35:01.4716224Z kind: PersistentVolume
2026-07-24T01:35:01.4716338Z metadata:
2026-07-24T01:35:01.4716534Z   annotations:
2026-07-24T01:35:01.4716873Z     pv.kubernetes.io/bound-by-controller: "yes"
2026-07-24T01:35:01.4717010Z   finalizers:
2026-07-24T01:35:01.4719230Z   - kubernetes.io/pv-protection
2026-07-24T01:35:01.4719555Z   name: sisns-backend-data-tqs
2026-07-24T01:35:01.4719726Z   labels:
2026-07-24T01:35:01.4719947Z     app: sisns-backend-tqs
2026-07-24T01:35:01.4720432Z spec:
2026-07-24T01:35:01.4720603Z   accessModes:
2026-07-24T01:35:01.4720813Z   - ReadWriteMany
2026-07-24T01:35:01.4720969Z   capacity:
2026-07-24T01:35:01.4721144Z     storage: 5Gi
2026-07-24T01:35:01.4721284Z   nfs:
2026-07-24T01:35:01.4721457Z     path: /ifs/CADSVISISD4/SERVIDORES/CETAD/SISNS_TQS_FGW
2026-07-24T01:35:01.4721672Z     server: nfsctcnprd.ctc.caixa
2026-07-24T01:35:01.4721866Z   persistentVolumeReclaimPolicy: Retain
2026-07-24T01:35:01.4785672Z ##[section]Finishing: Criando arquivo PV


2026-07-24T01:35:01.4813584Z ##[section]Starting: Criando Persistente Volume
2026-07-24T01:35:01.4818507Z ==============================================================================
2026-07-24T01:35:01.4818637Z Task         : Bash
2026-07-24T01:35:01.4818705Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-24T01:35:01.4818833Z Version      : 3.227.0
2026-07-24T01:35:01.4818907Z Author       : Microsoft Corporation
2026-07-24T01:35:01.4818987Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-24T01:35:01.4819123Z ==============================================================================
2026-07-24T01:35:02.3166124Z Generating script.
2026-07-24T01:35:02.3177731Z ========================== Starting Command Output ===========================
2026-07-24T01:35:02.3186828Z [command]/bin/bash /opt/ads-agent/_work/_temp/a855156f-13f7-4f30-8100-8abd975cf623.sh
2026-07-24T01:35:02.5483944Z No resources found.
2026-07-24T01:35:02.5484493Z Error from server (NotFound): persistentvolumes "sisns-backend-data-tqs" not found
2026-07-24T01:35:02.8030215Z persistentvolume/sisns-backend-data-tqs created
2026-07-24T01:35:02.8146684Z ##[section]Finishing: Criando Persistente Volume



2026-07-24T01:35:02.8166010Z ##[section]Starting: Criando arquivo PVC
2026-07-24T01:35:02.8170044Z ==============================================================================
2026-07-24T01:35:02.8170126Z Task         : Bash
2026-07-24T01:35:02.8170171Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-24T01:35:02.8170267Z Version      : 3.227.0
2026-07-24T01:35:02.8170311Z Author       : Microsoft Corporation
2026-07-24T01:35:02.8170359Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-24T01:35:02.8170448Z ==============================================================================
2026-07-24T01:35:03.6590129Z Generating script.
2026-07-24T01:35:03.6607336Z ========================== Starting Command Output ===========================
2026-07-24T01:35:03.6622692Z [command]/bin/bash /opt/ads-agent/_work/_temp/80e87c8c-faca-41da-9413-d0194d74d411.sh
2026-07-24T01:35:03.6701990Z apiVersion: v1
2026-07-24T01:35:03.6704422Z kind: PersistentVolumeClaim
2026-07-24T01:35:03.6706499Z metadata:
2026-07-24T01:35:03.6708574Z   annotations:
2026-07-24T01:35:03.6710527Z   finalizers:
2026-07-24T01:35:03.6712693Z   - kubernetes.io/pvc-protection
2026-07-24T01:35:03.6714844Z   name: sisns-backend-data-tqs
2026-07-24T01:35:03.6716814Z   namespace: sisns-tqs
2026-07-24T01:35:03.6719332Z spec:
2026-07-24T01:35:03.6720095Z   accessModes:
2026-07-24T01:35:03.6720377Z   - ReadWriteMany
2026-07-24T01:35:03.6720666Z   resources:
2026-07-24T01:35:03.6720917Z     requests:
2026-07-24T01:35:03.6721169Z       storage: 5Gi
2026-07-24T01:35:03.6721424Z   storageClassName: ""
2026-07-24T01:35:03.6721795Z   volumeName: sisns-backend-data-tqs
2026-07-24T01:35:03.6722152Z   selector:
2026-07-24T01:35:03.6724385Z     matchLabels:
2026-07-24T01:35:03.6724696Z       app: sisns-backend-tqs-esteiras
2026-07-24T01:35:03.6768220Z ##[section]Finishing: Criando arquivo PVC


2026-07-24T01:35:03.6786202Z ##[section]Starting: Criando Persistente Volume Claim
2026-07-24T01:35:03.6790079Z ==============================================================================
2026-07-24T01:35:03.6790166Z Task         : Bash
2026-07-24T01:35:03.6790226Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-24T01:35:03.6790290Z Version      : 3.227.0
2026-07-24T01:35:03.6790456Z Author       : Microsoft Corporation
2026-07-24T01:35:03.6790513Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-24T01:35:03.6790583Z ==============================================================================
2026-07-24T01:35:04.4865175Z Generating script.
2026-07-24T01:35:04.4882333Z ========================== Starting Command Output ===========================
2026-07-24T01:35:04.4889290Z [command]/bin/bash /opt/ads-agent/_work/_temp/4cac43aa-2c2e-4378-9101-04afe33a75cc.sh
2026-07-24T01:35:04.7410203Z No resources found.
2026-07-24T01:35:04.7411514Z Error from server (NotFound): persistentvolumeclaims "sisns-backend-data-tqs" not found
2026-07-24T01:35:04.9980937Z persistentvolumeclaim/sisns-backend-data-tqs created
2026-07-24T01:35:05.0102151Z ##[section]Finishing: Criando Persistente Volume Claim


2026-07-24T01:35:05.0122385Z ##[section]Starting: Verificando se o Volume foi configurado corretamente.
2026-07-24T01:35:05.0126094Z ==============================================================================
2026-07-24T01:35:05.0126188Z Task         : Bash
2026-07-24T01:35:05.0126245Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-24T01:35:05.0126307Z Version      : 3.227.0
2026-07-24T01:35:05.0126363Z Author       : Microsoft Corporation
2026-07-24T01:35:05.0126411Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-24T01:35:05.0126482Z ==============================================================================
2026-07-24T01:35:05.8720478Z Generating script.
2026-07-24T01:35:05.8737938Z ========================== Starting Command Output ===========================
2026-07-24T01:35:05.8762573Z [command]/bin/bash /opt/ads-agent/_work/_temp/281a184d-1095-47db-9be3-a74ef8b7675d.sh
2026-07-24T01:35:06.1770707Z Ocorreu alguma falha no processo de configuração
2026-07-24T01:35:06.1797452Z ##[error]Bash exited with code '1'.
2026-07-24T01:35:06.1818281Z ##[section]Finishing: Verificando se o Volume foi configurado corretamente.


2026-07-24T01:35:06.2212939Z ##[section]Starting: Logs da Aplicação
2026-07-24T01:35:06.2216979Z ==============================================================================
2026-07-24T01:35:06.2217059Z Task         : Bash
2026-07-24T01:35:06.2217118Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-24T01:35:06.2217180Z Version      : 3.227.0
2026-07-24T01:35:06.2217241Z Author       : Microsoft Corporation
2026-07-24T01:35:06.2217289Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-24T01:35:06.2217357Z ==============================================================================
2026-07-24T01:35:06.8886345Z Generating script.
2026-07-24T01:35:06.8898030Z ========================== Starting Command Output ===========================
2026-07-24T01:35:06.8906767Z [command]/bin/bash /opt/ads-agent/_work/_temp/afd1a0c9-e63b-4536-989b-1e95a859cf7a.sh
2026-07-24T01:35:06.8965122Z + shopt -s expand_aliases
2026-07-24T01:35:06.8966087Z + [[ -n okd4_nprd ]]
2026-07-24T01:35:06.8967599Z + [[ okd4_nprd =~ ocp ]]
2026-07-24T01:35:06.8967922Z + [[ -n okd4_nprd ]]
2026-07-24T01:35:06.8970062Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-07-24T01:35:06.8972070Z + app=sisns-backend-tqs
2026-07-24T01:35:06.8974019Z + oc version
2026-07-24T01:35:07.0806745Z oc v3.11.0+0cbc58b
2026-07-24T01:35:07.0806942Z kubernetes v1.11.0+d4cacc0
2026-07-24T01:35:07.0807292Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-07-24T01:35:07.0914588Z 
2026-07-24T01:35:07.0915106Z Server https://api.nprd.caixa:6443
2026-07-24T01:35:07.0915493Z kubernetes v1.25.0-2824+27e744f55d2e99-dirty
2026-07-24T01:35:07.0966026Z ++ oc get pod -l name=sisns-backend-tqs -n sisns-tqs -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-07-24T01:35:07.0982172Z ++ tac
2026-07-24T01:35:07.0982628Z ++ grep -v '^$'
2026-07-24T01:35:07.0983225Z ++ head -n1
2026-07-24T01:35:07.3672876Z + last_pod=sisns-backend-tqs-118-jg2tg
2026-07-24T01:35:07.3673182Z + echo 'Logs do POD: sisns-backend-tqs-118-jg2tg'
2026-07-24T01:35:07.3673448Z + oc logs sisns-backend-tqs-118-jg2tg -c sisns-backend-tqs -n sisns-tqs
2026-07-24T01:35:07.3673698Z Logs do POD: sisns-backend-tqs-118-jg2tg
2026-07-24T01:35:07.7255345Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-07-24T01:35:07.7256375Z __  ____  __  _____   ___  __ ____  ______ 
2026-07-24T01:35:07.7256991Z  --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
2026-07-24T01:35:07.7257456Z  -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
2026-07-24T01:35:07.7258253Z --\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-07-24T01:35:07.7258878Z 2026-07-23 22:29:27,536 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.version" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-07-24T01:35:07.7259381Z 2026-07-23 22:29:29,549 WARN  [org.hib.map.RootClass] (main) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sisns.entity.NqvAnoMesApuracaoPK
2026-07-24T01:35:07.7259772Z 2026-07-23 22:29:29,549 WARN  [org.hib.map.RootClass] (main) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sisns.entity.NqvAnoMesApuracaoPK
2026-07-24T01:35:07.7260347Z 2026-07-23 22:29:34,835 WARN  [io.qua.run.log.LoggingSetupRecorder] (main) Log level TRACE for category 'org.hibernate.type.descriptor.sql.BasicBinder' set below minimum logging level DEBUG, promoting it to DEBUG
2026-07-24T01:35:07.7260728Z 2026-07-23 22:29:35,527 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-01035: ORACLE only available to users with RESTRICTED SESSION privilege
2026-07-24T01:35:07.7260834Z 
2026-07-24T01:35:07.7261105Z 2026-07-23 22:29:35,663 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-01035: ORACLE only available to users with RESTRICTED SESSION privilege
2026-07-24T01:35:07.7261653Z 
2026-07-24T01:35:07.7262025Z 2026-07-23 22:29:35,762 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-01035: ORACLE only available to users with RESTRICTED SESSION privilege
2026-07-24T01:35:07.7262151Z 
2026-07-24T01:35:07.7262425Z 2026-07-23 22:29:36,147 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-01035: ORACLE only available to users with RESTRICTED SESSION privilege
2026-07-24T01:35:07.7262529Z 
2026-07-24T01:35:07.7262920Z 2026-07-23 22:29:36,148 WARN  [org.hib.eng.jdb.env.int.JdbcEnvironmentInitiator] (JPA Startup Thread) HHH000342: Could not obtain connection to query metadata: java.sql.SQLException: ORA-01035: ORACLE only available to users with RESTRICTED SESSION privilege
2026-07-24T01:35:07.7263068Z 
2026-07-24T01:35:07.7263214Z 	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:630)
2026-07-24T01:35:07.7263399Z 	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:559)
2026-07-24T01:35:07.7263598Z 	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:554)
2026-07-24T01:35:07.7263876Z 	at oracle.jdbc.driver.T4CTTIfun.processError(T4CTTIfun.java:1377)
2026-07-24T01:35:07.7264080Z 	at oracle.jdbc.driver.T4CTTIoauthenticate.processError(T4CTTIoauthenticate.java:782)
2026-07-24T01:35:07.7264275Z 	at oracle.jdbc.driver.T4CTTIfun.receive(T4CTTIfun.java:772)
2026-07-24T01:35:07.7264432Z 	at oracle.jdbc.driver.T4CTTIfun.doRPC(T4CTTIfun.java:299)
2026-07-24T01:35:07.7264617Z 	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:450)
2026-07-24T01:35:07.7264832Z 	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTHWithO5Logon(T4CTTIoauthenticate.java:1553)
2026-07-24T01:35:07.7265044Z 	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:1302)
2026-07-24T01:35:07.7265240Z 	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:1256)
2026-07-24T01:35:07.7265440Z 	at oracle.jdbc.driver.T4CConnection.authenticateWithPassword(T4CConnection.java:1445)
2026-07-24T01:35:07.7265643Z 	at oracle.jdbc.driver.T4CConnection.authenticateUserForLogon(T4CConnection.java:1394)
2026-07-24T01:35:07.7265836Z 	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:677)
2026-07-24T01:35:07.7266005Z 	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1089)
2026-07-24T01:35:07.7266199Z 	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:90)
2026-07-24T01:35:07.7266386Z 	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:733)
2026-07-24T01:35:07.7266562Z 	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:649)
2026-07-24T01:35:07.7266744Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
2026-07-24T01:35:07.7266941Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:535)
2026-07-24T01:35:07.7267145Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:516)
2026-07-24T01:35:07.7267330Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-07-24T01:35:07.7267513Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-07-24T01:35:07.7267726Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
2026-07-24T01:35:07.7267935Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
2026-07-24T01:35:07.7268137Z 	at java.base/java.lang.Thread.run(Thread.java:829)
2026-07-24T01:35:07.7268215Z 
2026-07-24T01:35:07.7268598Z 2026-07-23 22:29:37,331 INFO  [io.quarkus] (main) sisns 3.0.0.2-Release on JVM (powered by Quarkus 2.15.2.Final) started in 10.787s. Listening on: http://0.0.0.0:8080
2026-07-24T01:35:07.7268885Z 2026-07-23 22:29:37,331 INFO  [io.quarkus] (main) Profile prod activated. 
2026-07-24T01:35:07.7269586Z 2026-07-23 22:29:37,331 INFO  [io.quarkus] (main) Installed features: [agroal, cdi, hibernate-envers, hibernate-orm, hibernate-orm-panache, hibernate-orm-panache-kotlin, hibernate-orm-rest-data-panache, hibernate-search-elasticsearch, hibernate-validator, jdbc-h2, jdbc-oracle, jdbc-postgresql, keycloak-authorization, kotlin, narayana-jta, oidc, oidc-client, rest-client, resteasy, resteasy-jackson, resteasy-multipart, security, servlet, smallrye-context-propagation, smallrye-health, smallrye-metrics, smallrye-openapi, swagger-ui, vertx]
2026-07-24T01:35:07.7370423Z ##[section]Finishing: Logs da Aplicação
