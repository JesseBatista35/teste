<?xml version='1.0' encoding='UTF-8'?>

<server xmlns="urn:jboss:domain:16.0">
    <extensions>
        <extension module="org.jboss.as.modcluster"/>
        <extension module="org.jboss.as.clustering.infinispan"/>
        <extension module="org.jboss.as.clustering.jgroups"/>
        <extension module="org.jboss.as.connector"/>
        <extension module="org.jboss.as.deployment-scanner"/>
        <extension module="org.jboss.as.ee"/>
        <extension module="org.jboss.as.ejb3"/>
        <extension module="org.jboss.as.jaxrs"/>
        <extension module="org.jboss.as.jdr"/>
        <extension module="org.jboss.as.jmx"/>
        <extension module="org.jboss.as.jpa"/>
        <extension module="org.jboss.as.jsf"/>
        <extension module="org.jboss.as.jsr77"/>
        <extension module="org.jboss.as.logging"/>
        <extension module="org.jboss.as.mail"/>
        <extension module="org.jboss.as.naming"/>
        <extension module="org.jboss.as.pojo"/>
        <extension module="org.jboss.as.remoting"/>
        <extension module="org.jboss.as.sar"/>
        <extension module="org.jboss.as.security"/>
        <extension module="org.jboss.as.transactions"/>
        <extension module="org.jboss.as.webservices"/>
        <extension module="org.jboss.as.weld"/>
        <extension module="org.keycloak.keycloak-adapter-subsystem"/>
        <extension module="org.wildfly.extension.batch.jberet"/>
        <extension module="org.wildfly.extension.bean-validation"/>
        <extension module="org.wildfly.extension.clustering.singleton"/>
        <extension module="org.wildfly.extension.clustering.web"/>
        <extension module="org.wildfly.extension.core-management"/>
        <extension module="org.wildfly.extension.discovery"/>
        <extension module="org.wildfly.extension.ee-security"/>
        <extension module="org.wildfly.extension.elytron"/>
        <extension module="org.wildfly.extension.health"/>
        <extension module="org.wildfly.extension.io"/>
        <extension module="org.wildfly.extension.messaging-activemq"/>
        <extension module="org.wildfly.extension.metrics"/>
        <extension module="org.wildfly.extension.request-controller"/>
        <extension module="org.wildfly.extension.security.manager"/>
        <extension module="org.wildfly.extension.undertow"/>
        <extension module="org.wildfly.iiop-openjdk"/>
    </extensions>
    <system-properties>
        <property name="CLIENT_APP_ID" value="cli-ser-gec"/>
        <property name="CLIENT_APP_SECRET" value="385c6032-c152-465c-97cf-7ac351649caa"/>
        <property name="client.secret" value="385c6032-c152-465c-97cf-7ac351649caa"/>
        <property name="USUARIO_SILCR" value="SGECLCRQ"/>
        <property name="QTD_REGISTROS_ARCC001" value="5000"/>
        <property name="QTD_REGISTROS_ARCC002" value="5000"/>
        <property name="PASTA_PUBLICA_APX" value="\\NBTITMA141426/Desenvolvimento/SIGEC/demandas/XML_Fluxos"/>
        <property name="outdir" value="C:/Desenvolvimento/SIGEC/demandas/XML_Fluxos/ARCC"/>
        <property name="API_MANAGER_API_KEY" value="l714f9532275eb495c85015a769ab99181"/>
        <property name="API_MANAGER_URL_BASE" value="https://api.des.caixa:8443"/>
        <property name="BARRAMENTO_URL_BASE" value="http://tqs.barramento.caixa"/>
        <property name="AMBIENTE" value="des"/>
        <property name="PROCESSAR_BATCH" value="SIM"/>
        <property name="http.nonProxyHosts" value="*.caixa"/>
        <property name="javax.net.debug" value="true"/>
        <property name="SIGEC_USUARIO" value="SGECDB01"/>
        <property name="SIGEC_PASSWORD" value="SGECDB01"/>
        <property name="SIFEC_USUARIO" value="SCNLFECD"/>
        <property name="_urlConsultaBoleto" value="http://localhost:8080/fec-web/emprest/consultaBoleto/consulaBoletoRegistrado"/>
        <property name="urlConsultaBoleto" value="http://sifec.desenvolvimento.extracaixa/fec-web/emprest/consultaBoleto/consulaBoletoRegistrado"/>
        <property name="URL_CONSULTAR_BOLETO" value="http://10.1.14.39/sibar/ConsultaCobrancaBancaria/Boleto"/>
        <property name="URL_MANUTENCAO_BOLETO" value="http://10.1.14.39/sibar/ManutencaoCobrancaBancaria/Boleto"/>
        <property name="URL_SIFEC" value="http://localhost:8080/"/>
        <property name="SIPES_USUARIO_CICS" value="F975512"/>
        <property name="SIPES_SENHA_CICS" value="Tivit11"/>
        <property name="_SIPES_USUARIO_CICS" value="SPESDB01"/>
        <property name="_SIPES_SENHA_CICS" value="s739041"/>
        <property name="SICCR_URL_LDAP_INTERNO" value="ldap://10.1.14.45:389"/>
        <property name="SICCR_BASE_INTERNO" value="ou=People,o=caixa"/>
        <property name="SICCR_URL_LDAP_EXTERNO" value="ldap://localhost:389"/>
        <property name="NUCLEA_URL_HOST" value="https://apim-parceiros-sandbox.azure-api.net"/>
        <property name="NUCLEA_URL_BASE" value="/portabilidade"/>
        <property name="SSL_DEBUG" value="true"/>
        <property name="QUEUE_ENVIO_OPF" value="sigec-opf-queue-envia-sigec-por"/>
        <property name="CONNECTION_QUEUE_ENVIO_OPF" value="Endpoint=sb://servicebus-crc-nprd.servicebus.windows.net/;sharedaccesskeyname=SAScrc;SharedAccessKey=bot1WVFQWxfH23Ip+7lrT5ZBhbv1LnkzC+ASbGD2Y60=;EntityPath=sigec-opf-queue-envia-sigec-por"/>
        <property name="SSL_TRUST_ALL_CERTIFICATES" value="true"/>
        <property name="SSL_VERIFY_HOSTNAME" value="false"/>
        <property name="SIMTR_BASE_URL" value="/simtr"/>
        <property name="SICCR_BASE_EXTERNO" value="ou=People,o=caixa_des"/>
        <property name="TESTE_MOCK_RURAL_SISGD" value="true"/>
        <property name="TESTE_MOCK_CONSULTA_AVALIACAO_RISCO" value="true"/>
        <property name="TESTE_MOCK_RENOVAR_CONTRATO_MPOG" value="true"/>
        <property name="TESTE_MOCK_CONSULTA_MARGEM_MPOG" value="true"/>
        <property name="TESTE_MOCK_INCLUIR_CONTRATO_MPOG" value="true"/>
        <property name="TESTE_MOCK_CANCELAR_CONTRATO_MPOG" value="true"/>
        <property name="TESTE_MOCK_LDAP_DESENVOLVIMENTO" value="true"/>
        <property name="TESTE_MOCK_XML_CONSULTA_MARGEM_MPOG" value="*response%*dados_matricula%*cd_orgao%13000*/cd_orgao%*nr_cnpj_orgao%00396895000125*/nr_cnpj_orgao%*cd_matricula%0000013*/cd_matricula%*id_unica%0000013*/id_unica%*org_mat_inst%*/org_mat_inst%*vl_margem_consig%000100000000000*/vl_margem_consig%*vl_margem_utiliz%000001000000000*/vl_margem_utiliz%*vl_margem_disp%00010000000*/vl_margem_disp%*vl_margem_fixa%000100000000000*/vl_margem_fixa%*vl_margem_var%000000100000000*/vl_margem_var%*vl_margem_disp_fixa%000001000000000*/vl_margem_disp_fixa%*dt_prim_desc%201705*/dt_prim_desc%*cd_upag_serv%13000000001203*/cd_upag_serv%*cd_uf_upag_serv%DF*/cd_uf_upag_serv%*bloqueio_judicial%N*/bloqueio_judicial%*cd_ret_code_matricula%0000*/cd_ret_code_matricula%*ds_ret_code_matricula%*/ds_ret_code_matricula%*/dados_matricula%*cd_ret_code%0000*/cd_ret_code%*ds_ret_code%Servico realizado com sucesso.*/ds_ret_code%*/response%"/>
        <property name="TESTE_MOCK_SSO_TOKEN" value="false"/>
        <property name="TESTE_MOCK_SIMTR_GET_DOCUMENTO" value="false"/>
        <property name="TESTE_MOCK_NUCLEA_CONSULTA" value="false"/>
        <property name="TESTE_MOCK_NUCLEA_SOLICITACAO_PDF" value="false"/>
        <property name="TESTE_MOCK_NUCLEA_RETENCAO_PDF" value="false"/>
        <property name="TESTE_MOCK_NUCLEA_RETENCAO_AUDIO" value="false"/>
        <property name="TESTE_MOCK_SICLI_GET_GERAIS" value="false"/>
        <property name="TESTE_MOCK_SICLI_GET_BASICOS" value="false"/>
        <property name="URL_SAP_RURAL_DES" value="http://mo7366ux0007.intra.caixa.gov.br:50000/RESTAdapter/"/>
        <property name="auth.sso.baseurl" value="https://login.des.caixa"/>
        <property name="auth.sso.userinfo" value="${auth.sso.baseurl}/auth/realms/intranet/protocol/openid-connect/userinfo"/>
        <property name="SSO_SERVICO_URL_BASE_INTRANET" value="https://login.des.caixa"/>
        <property name="SSO_INTRANET_REALM_NAME" value="intranet"/>
        <property name="SSO_INTRANET_AUTH_URL" value="https://login.des.caixa/auth"/>
        <property name="SSO_INTRANET_RESOURCE_NAME" value="cli-web-gec"/>
        <property name="SSO_INTRANET_SECRET" value="897f0b68-56da-4a9e-9f94-17feb26d4e56"/>
        <property name="SSO_INTRANET_TYPE_OF_SSL_REQUIRED" value="external"/>
        <property name="SSO_INTRANET_BEARER_ONLY" value="false"/>
        <property name="SSO_INTRANET_PUBLIC_CLIENT" value="false"/>
        <property name="SSO_INTERNET_REALM_NAME" value="internet"/>
        <property name="SSO_INTERNET_AUTH_URL" value="https://logindes.caixa.gov.br/auth"/>
        <property name="SSO_INTERNET_RESOURCE_NAME" value="cli-web-gec"/>
        <property name="SSO_INTERNET_SECRET" value="72dab88a-55a9-4d56-ad2e-79319cdba900"/>
        <property name="SSO_INTERNET_TYPE_OF_SSL_REQUIRED" value="external"/>
        <property name="SSO_INTERNET_BEARER_ONLY" value="false"/>
        <property name="SSO_INTERNET_PUBLIC_CLIENT" value="false"/>
        <property name="SSO_INTERNET2_REALM_NAME" value="r_inter_siper"/>
        <property name="SSO_INTERNET2_AUTH_URL" value="https://loginxdes.caixa.gov.br/auth"/>
        <property name="SSO_INTERNET2_RESOURCE_NAME" value="cli-web-gec"/>
        <property name="SSO_INTERNET2_SECRET" value="72dab88a-55a9-4d56-ad2e-79319cdba900"/>
        <property name="SSO_INTERNET2_TYPE_OF_SSL_REQUIRED" value="external"/>
        <property name="SSO_INTERNET2_BEARER_ONLY" value="false"/>
        <property name="SSO_INTERNET2_PUBLIC_CLIENT" value="false"/>
        <property name="API_SICLI_URL_BASE" value="http://api.des.caixa:8080"/>
        <property name="SICLI_API_URL" value="http://api.des.caixa:8080"/>
        <property name="SICLI_API_KEY" value="l714f9532275eb495c85015a769ab99181"/>
        <property name="CONNECTOR_SOCKET_SERVER_NAME" value="10.116.94.212"/>
        <property name="CONNECTOR_SOCKET_SERVER_PORT" value="3333"/>
        <property name="QUEUE_RSP_PAGAMENTO_TED_NCR" value="queue-rsp-pagamento-ted-des"/>
        <property name="QUEUE_ENVIO_TED_NCR" value="queue-envio-ted-des"/>
        <property name="QUEUE_RECEBIMENTO_TED_NCR" value="queue-recebimento-ted-des"/>
        <property name="QUEUE_VERIFICACAO_TED_NCR" value="queue-verificacao-ted-des"/>
        <property name="TOPIC_RECEBIMENTO_TED_TRC_NCR" value="topic-recebimento-ted-trc"/>
        <property name="SUBSCRIPTION_NAME_TED_NCR" value="SIGEC"/>
        <property name="SUBSCRIPTION_RESPOSTA_NAME_TED_NCR" value="SIGECR1"/>
        <property name="QUALIFIED_NAMESPACE_TED_NCR" value="sb-credito-des.servicebus.windows.net"/>
        <property name="CONNECTION_QUEUE_REQ_PAGAMENTO_TED_NCR" value="Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Sender;SharedAccessKey=qH+NSwQ3yTLPFeGaELSKSDnvLyWYQnuz5+ASbG6XcwQ=;EntityPath=queue-req-pagamneto-ted-des"/>
        <property name="CONNECTION_QUEUE_RSP_PAGAMENTO_TED_NCR" value="Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Listener;SharedAccessKey=kV2eqtd4Ye3vDsItwoQb4jhGwANBa1V5O+ASbPkRCBA=;EntityPath=queue-rsp-pagamento-ted-des"/>
        <property name="CONNECTION_QUEUE_RECEBIMENTO_PAGAMENTO_TED_NCR" value="Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=SIGEC;SharedAccessKey=8bTBB1PnMqDIYCx6g7Q4y3autRZewNkWi+ASbCO48rI=;EntityPath=topic-recebimento-ted-trc"/>
        <property name="CONNECTION_QUEUE_REQ_ENVIO_TED_NCR" value="Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Listner;SharedAccessKey=ZwKtWXstbi4vdaAwEMF/bqFt32Uo1b3pc+ASbKjIkbA=;EntityPath=queue-envio-ted-des"/>
        <property name="CONNECTION_QUEUE_RECEBIMENTO_TED_NCR" value="Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Sender;SharedAccessKey=/w6Lkh4FKsk6iYYnnz2y4Pv4RPrchigZs+ASbL3grQM=;EntityPath=queue-recebimento-ted-des"/>
        <property name="CONNECTION_QUEUE_VERIFICACAO_TED_NCR" value="Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Sender;SharedAccessKey=AkFDPClutoUD69rzUkcbNwRFILo93ICDo+ASbD/CXb4=;EntityPath=queue-verificacao-ted-des"/>
    </system-properties>
    <management>
        <security-realms>
            <security-realm name="ManagementRealm">
                <authentication>
                    <local default-user="$local" skip-group-loading="true"/>
                    <properties path="mgmt-users.properties" relative-to="jboss.server.config.dir"/>
                </authentication>
                <authorization map-groups-to-roles="false">
                    <properties path="mgmt-groups.properties" relative-to="jboss.server.config.dir"/>
                </authorization>
            </security-realm>
            <security-realm name="ApplicationRealm">
                <server-identities>
                    <ssl>
                        <keystore path="application.keystore" relative-to="jboss.server.config.dir" keystore-password="password" alias="server" key-password="password" generate-self-signed-certificate-host="localhost"/>
                    </ssl>
                </server-identities>
                <authentication>
                    <local default-user="$local" allowed-users="*" skip-group-loading="true"/>
                    <properties path="application-users.properties" relative-to="jboss.server.config.dir"/>
                </authentication>
                <authorization>
                    <properties path="application-roles.properties" relative-to="jboss.server.config.dir"/>
                </authorization>
            </security-realm>
        </security-realms>
        <audit-log>
            <formatters>
                <json-formatter name="json-formatter"/>
            </formatters>
            <handlers>
                <file-handler name="file" formatter="json-formatter" path="audit-log.log" relative-to="jboss.server.data.dir"/>
            </handlers>
            <logger log-boot="true" log-read-only="false" enabled="false">
                <handlers>
                    <handler name="file"/>
                </handlers>
            </logger>
        </audit-log>
        <management-interfaces>
            <http-interface security-realm="ManagementRealm">
                <http-upgrade enabled="true"/>
                <socket-binding http="management-http"/>
            </http-interface>
        </management-interfaces>
        <access-control provider="simple">
            <role-mapping>
                <role name="SuperUser">
                    <include>
                        <user name="$local"/>
                    </include>
                </role>
            </role-mapping>
        </access-control>
    </management>
    <profile>
        <subsystem xmlns="urn:jboss:domain:logging:8.0">
            <console-handler name="CONSOLE">
                <level name="INFO"/>
                <formatter>
                    <named-formatter name="COLOR-PATTERN"/>
                </formatter>
            </console-handler>
            <periodic-rotating-file-handler name="FILE" autoflush="true">
                <formatter>
                    <named-formatter name="PATTERN"/>
                </formatter>
                <file relative-to="jboss.server.log.dir" path="server.log"/>
                <suffix value=".yyyy-MM-dd"/>
                <append value="true"/>
            </periodic-rotating-file-handler>
            <periodic-rotating-file-handler name="SIGEC" autoflush="true">
                <level name="FINE"/>
                <file relative-to="jboss.server.log.dir" path="sigec.log"/>
                <suffix value=".yyyy-MM-dd"/>
                <append value="true"/>
            </periodic-rotating-file-handler>
            <logger category="com.arjuna">
                <level name="WARN"/>
            </logger>
            <logger category="io.jaegertracing.Configuration">
                <level name="WARN"/>
            </logger>
            <logger category="org.jboss.as.config">
                <level name="DEBUG"/>
            </logger>
            <logger category="sun.rmi">
                <level name="WARN"/>
            </logger>
            <logger category="org.keycloak">
                <level name="DEBUG"/>
            </logger>
            <logger category="br.gov.caixa" use-parent-handlers="false">
                <level name="FINE"/>
                <handlers>
                    <handler name="SIGEC"/>
                </handlers>
            </logger>
            <root-logger>
                <level name="INFO"/>
                <handlers>
                    <handler name="CONSOLE"/>
                    <handler name="FILE"/>
                </handlers>
            </root-logger>
            <formatter name="PATTERN">
                <pattern-formatter pattern="%d{yyyy-MM-dd HH:mm:ss,SSS} %-5p [%c] (%t) %s%e%n"/>
            </formatter>
            <formatter name="COLOR-PATTERN">
                <pattern-formatter pattern="%K{level}%d{HH:mm:ss,SSS} %-5p [%c] (%t) %s%e%n"/>
            </formatter>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:batch-jberet:2.0">
            <default-job-repository name="in-memory"/>
            <default-thread-pool name="batch"/>
            <job-repository name="in-memory">
                <in-memory/>
            </job-repository>
            <thread-pool name="batch">
                <max-threads count="10"/>
                <keepalive-time time="30" unit="seconds"/>
            </thread-pool>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:bean-validation:1.0"/>
        <subsystem xmlns="urn:jboss:domain:core-management:1.0"/>
        <subsystem xmlns="urn:jboss:domain:datasources:6.0">
            <datasources>
                <datasource jndi-name="java:jboss/datasources/ExampleDS" pool-name="ExampleDS" enabled="true" use-java-context="true" statistics-enabled="${wildfly.datasources.statistics-enabled:${wildfly.statistics-enabled:false}}">
                    <connection-url>jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE</connection-url>
                    <driver>h2</driver>
                    <security>
                        <user-name>sa</user-name>
                        <password>sa</password>
                    </security>
                </datasource>
                <datasource jta="false" jndi-name="java:/jdbc/DB2SiempDS" pool-name="jdbc/DB2SiempDS" enabled="true" use-ccm="false">
                    <connection-url>jdbc:db2://10.192.224.76:5021/CSD1</connection-url>
                    <driver-class>com.ibm.db2.jcc.DB2Driver</driver-class>
                    <driver>db2</driver>
                    <security>
                        <user-name>SEMPDB01</user-name>
                        <password>S208706</password>
                    </security>
                </datasource>
                <xa-datasource jndi-name="java:/jdbc/DB2SigecDS" pool-name="jdbc/DB2SigecDS" enabled="true" use-ccm="false">
                    <xa-datasource-property name="ServerName">
                        10.192.224.76
                    </xa-datasource-property>
                    <xa-datasource-property name="PortNumber">
                        5021
                    </xa-datasource-property>
                    <xa-datasource-property name="DatabaseName">
                        CSD1
                    </xa-datasource-property>
                    <xa-datasource-property name="DriverType">
                        4
                    </xa-datasource-property>
                    <xa-datasource-class>com.ibm.db2.jcc.DB2XADataSource</xa-datasource-class>
                    <driver>db2</driver>
                    <security>
                        <user-name>SGECDB01</user-name>
                        <password>SGECDB01</password>
                    </security>
                    <validation>
                        <valid-connection-checker class-name="org.jboss.jca.adapters.jdbc.extensions.db2.DB2ValidConnectionChecker"/>
                        <validate-on-match>true</validate-on-match>
                        <background-validation>false</background-validation>
                        <exception-sorter class-name="org.jboss.jca.adapters.jdbc.extensions.db2.DB2ExceptionSorter"/>
                    </validation>
                    <timeout>
                        <set-tx-query-timeout>true</set-tx-query-timeout>
                        <blocking-timeout-millis>10000</blocking-timeout-millis>
                        <query-timeout>10000</query-timeout>
                        <use-try-lock>1</use-try-lock>
                        <allocation-retry>1</allocation-retry>
                        <allocation-retry-wait-millis>10000</allocation-retry-wait-millis>
                        <xa-resource-timeout>10000</xa-resource-timeout>
                    </timeout>
                </xa-datasource>
                <xa-datasource jndi-name="java:/jdbc/DB2SifecDS" pool-name="jdbc/DB2SifecDS" enabled="true" use-ccm="false">
                    <xa-datasource-property name="ServerName">
                        10.192.224.76
                    </xa-datasource-property>
                    <xa-datasource-property name="PortNumber">
                        5021
                    </xa-datasource-property>
                    <xa-datasource-property name="DatabaseName">
                        CSD1
                    </xa-datasource-property>
                    <xa-datasource-property name="DriverType">
                        4
                    </xa-datasource-property>
                    <xa-datasource-class>com.ibm.db2.jcc.DB2XADataSource</xa-datasource-class>
                    <driver>db2</driver>
                    <security>
                        <user-name>SFECDB01</user-name>
                        <password>SFECDB01</password>
                    </security>
                    <timeout>
                        <set-tx-query-timeout>true</set-tx-query-timeout>
                        <blocking-timeout-millis>10000</blocking-timeout-millis>
                        <query-timeout>10000</query-timeout>
                        <use-try-lock>1</use-try-lock>
                        <allocation-retry>1</allocation-retry>
                        <allocation-retry-wait-millis>10000</allocation-retry-wait-millis>
                        <xa-resource-timeout>10000</xa-resource-timeout>
                    </timeout>
                </xa-datasource>
                <drivers>
                    <driver name="h2" module="com.h2database.h2">
                        <xa-datasource-class>org.h2.jdbcx.JdbcDataSource</xa-datasource-class>
                    </driver>
                    <driver name="oracle" module="oracle">
                        <driver-class>oracle.jdbc.OracleDriver</driver-class>
                    </driver>
                    <driver name="db2" module="com.ibm.db2">
                        <driver-class>com.ibm.db2.jcc.DB2Driver</driver-class>
                    </driver>
                    <driver name="sybase1" module="sybase"/>
                    <driver name="p6spy" module="com.p6spy">
                        <driver-class>com.p6spy.engine.spy.P6SpyDriver</driver-class>                    </driver>
                </drivers>
            </datasources>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:deployment-scanner:2.0">
            <deployment-scanner path="deployments" relative-to="jboss.server.base.dir" scan-interval="5000" runtime-failure-causes-rollback="${jboss.deployment.scanner.rollback.on.failure:false}"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:discovery:1.0"/>
        <subsystem xmlns="urn:jboss:domain:distributable-web:2.0" default-session-management="default" default-single-sign-on-management="default">
            <infinispan-session-management name="default" cache-container="web" granularity="SESSION">
                <primary-owner-affinity/>
            </infinispan-session-management>
            <infinispan-single-sign-on-management name="default" cache-container="web" cache="sso"/>
            <infinispan-routing cache-container="web" cache="routing"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:ee:6.0">
            <spec-descriptor-property-replacement>true</spec-descriptor-property-replacement>
            <concurrent>
                <context-services>
                    <context-service name="default" jndi-name="java:jboss/ee/concurrency/context/default" use-transaction-setup-provider="true"/>
                </context-services>
                <managed-thread-factories>
                    <managed-thread-factory name="default" jndi-name="java:jboss/ee/concurrency/factory/default" context-service="default"/>
                </managed-thread-factories>
                <managed-executor-services>
                    <managed-executor-service name="default" jndi-name="java:jboss/ee/concurrency/executor/default" context-service="default" hung-task-termination-period="0" hung-task-threshold="60000" keepalive-time="5000"/>
                </managed-executor-services>
                <managed-scheduled-executor-services>
                    <managed-scheduled-executor-service name="default" jndi-name="java:jboss/ee/concurrency/scheduler/default" context-service="default" hung-task-termination-period="0" hung-task-threshold="60000" keepalive-time="3000"/>
                </managed-scheduled-executor-services>
            </concurrent>
            <default-bindings context-service="java:jboss/ee/concurrency/context/default" datasource="java:/jdbc/DB2SigecDS" jms-connection-factory="java:jboss/DefaultJMSConnectionFactory" managed-executor-service="java:jboss/ee/concurrency/executor/default" managed-scheduled-executor-service="java:jboss/ee/concurrency/scheduler/default" managed-thread-factory="java:jboss/ee/concurrency/factory/default"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:ee-security:1.0"/>
        <subsystem xmlns="urn:jboss:domain:ejb3:9.0">
            <session-bean>
                <stateless>
                    <bean-instance-pool-ref pool-name="slsb-strict-max-pool"/>
                </stateless>
                <stateful default-access-timeout="5000" cache-ref="distributable" passivation-disabled-cache-ref="simple"/>
                <singleton default-access-timeout="5000"/>
            </session-bean>
            <mdb>
                <resource-adapter-ref resource-adapter-name="${ejb.resource-adapter-name:activemq-ra.rar}"/>
                <bean-instance-pool-ref pool-name="mdb-strict-max-pool"/>
            </mdb>
            <pools>
                <bean-instance-pools>
                    <strict-max-pool name="mdb-strict-max-pool" derive-size="from-cpu-count" instance-acquisition-timeout="5" instance-acquisition-timeout-unit="MINUTES"/>
                    <strict-max-pool name="slsb-strict-max-pool" derive-size="from-worker-pools" instance-acquisition-timeout="5" instance-acquisition-timeout-unit="MINUTES"/>
                </bean-instance-pools>
            </pools>
            <caches>
                <cache name="simple"/>
                <cache name="distributable" passivation-store-ref="infinispan" aliases="passivating clustered"/>
            </caches>
            <passivation-stores>
                <passivation-store name="infinispan" cache-container="ejb" max-size="10000"/>
            </passivation-stores>
            <async thread-pool-name="default"/>
            <timer-service thread-pool-name="default" default-data-store="default-file-store">
                <data-stores>
                    <file-data-store name="default-file-store" path="timer-service-data" relative-to="jboss.server.data.dir"/>
                </data-stores>
            </timer-service>
            <remote cluster="ejb" connectors="http-remoting-connector" thread-pool-name="default">
                <channel-creation-options>
                    <option name="READ_TIMEOUT" value="${prop.remoting-connector.read.timeout:20}" type="xnio"/>
                    <option name="MAX_OUTBOUND_MESSAGES" value="1234" type="remoting"/>
                </channel-creation-options>
            </remote>
            <thread-pools>
                <thread-pool name="default">
                    <max-threads count="10"/>
                    <keepalive-time time="60" unit="seconds"/>
                </thread-pool>
            </thread-pools>
            <iiop enable-by-default="false" use-qualified-name="false"/>
            <default-security-domain value="other"/>
            <default-missing-method-permissions-deny-access value="false"/>
            <statistics enabled="${wildfly.ejb3.statistics-enabled:${wildfly.statistics-enabled:false}}"/>
            <log-system-exceptions value="true"/>
        </subsystem>
        <subsystem xmlns="urn:wildfly:elytron:13.0" final-providers="combined-providers" disallowed-providers="OracleUcrypto">
            <providers>
                <aggregate-providers name="combined-providers">
                    <providers name="elytron"/>
                    <providers name="openssl"/>
                </aggregate-providers>
                <provider-loader name="elytron" module="org.wildfly.security.elytron"/>
                <provider-loader name="openssl" module="org.wildfly.openssl"/>
            </providers>
            <audit-logging>
                <file-audit-log name="local-audit" path="audit.log" relative-to="jboss.server.log.dir" format="JSON"/>
            </audit-logging>
            <security-domains>
                <security-domain name="ApplicationDomain" default-realm="ApplicationRealm" permission-mapper="default-permission-mapper">
                    <realm name="ApplicationRealm" role-decoder="groups-to-roles"/>
                    <realm name="local"/>
                </security-domain>
                <security-domain name="ManagementDomain" default-realm="ManagementRealm" permission-mapper="default-permission-mapper">
                    <realm name="ManagementRealm" role-decoder="groups-to-roles"/>
                    <realm name="local" role-mapper="super-user-mapper"/>
                </security-domain>
            </security-domains>
            <security-realms>
                <identity-realm name="local" identity="$local"/>
                <properties-realm name="ApplicationRealm">
                    <users-properties path="application-users.properties" relative-to="jboss.server.config.dir" digest-realm-name="ApplicationRealm"/>
                    <groups-properties path="application-roles.properties" relative-to="jboss.server.config.dir"/>
                </properties-realm>
                <properties-realm name="ManagementRealm">
                    <users-properties path="mgmt-users.properties" relative-to="jboss.server.config.dir" digest-realm-name="ManagementRealm"/>
                    <groups-properties path="mgmt-groups.properties" relative-to="jboss.server.config.dir"/>
                </properties-realm>
            </security-realms>
            <mappers>
                <simple-permission-mapper name="default-permission-mapper" mapping-mode="first">
                    <permission-mapping>
                        <principal name="anonymous"/>
                        <permission-set name="default-permissions"/>
                    </permission-mapping>
                    <permission-mapping match-all="true">
                        <permission-set name="login-permission"/>
                        <permission-set name="default-permissions"/>
                    </permission-mapping>
                </simple-permission-mapper>
                <constant-realm-mapper name="local" realm-name="local"/>
                <simple-role-decoder name="groups-to-roles" attribute="groups"/>
                <constant-role-mapper name="super-user-mapper">
                    <role name="SuperUser"/>
                </constant-role-mapper>
            </mappers>
            <permission-sets>
                <permission-set name="login-permission">
                    <permission class-name="org.wildfly.security.auth.permission.LoginPermission"/>
                </permission-set>
                <permission-set name="default-permissions">
                    <permission class-name="org.wildfly.extension.batch.jberet.deployment.BatchPermission" module="org.wildfly.extension.batch.jberet" target-name="*"/>
                    <permission class-name="org.wildfly.transaction.client.RemoteTransactionPermission" module="org.wildfly.transaction.client"/>
                    <permission class-name="org.jboss.ejb.client.RemoteEJBPermission" module="org.jboss.ejb-client"/>
                </permission-set>
            </permission-sets>
            <http>
                <http-authentication-factory name="management-http-authentication" security-domain="ManagementDomain" http-server-mechanism-factory="global">
                    <mechanism-configuration>
                        <mechanism mechanism-name="DIGEST">
                            <mechanism-realm realm-name="ManagementRealm"/>
                        </mechanism>
                    </mechanism-configuration>
                </http-authentication-factory>
                <provider-http-server-mechanism-factory name="global"/>
            </http>
            <sasl>
                <sasl-authentication-factory name="application-sasl-authentication" sasl-server-factory="configured" security-domain="ApplicationDomain">
                    <mechanism-configuration>
                        <mechanism mechanism-name="JBOSS-LOCAL-USER" realm-mapper="local"/>
                        <mechanism mechanism-name="DIGEST-MD5">
                            <mechanism-realm realm-name="ApplicationRealm"/>
                        </mechanism>
                    </mechanism-configuration>
                </sasl-authentication-factory>
                <sasl-authentication-factory name="management-sasl-authentication" sasl-server-factory="configured" security-domain="ManagementDomain">
                    <mechanism-configuration>
                        <mechanism mechanism-name="JBOSS-LOCAL-USER" realm-mapper="local"/>
                        <mechanism mechanism-name="DIGEST-MD5">
                            <mechanism-realm realm-name="ManagementRealm"/>
                        </mechanism>
                    </mechanism-configuration>
                </sasl-authentication-factory>
                <configurable-sasl-server-factory name="configured" sasl-server-factory="elytron">
                    <properties>
                        <property name="wildfly.sasl.local-user.default-user" value="$local"/>
                    </properties>
                </configurable-sasl-server-factory>
                <mechanism-provider-filtering-sasl-server-factory name="elytron" sasl-server-factory="global">
                    <filters>
                        <filter provider-name="WildFlyElytron"/>
                    </filters>
                </mechanism-provider-filtering-sasl-server-factory>
                <provider-sasl-server-factory name="global"/>
            </sasl>
            <tls>
                <key-stores>
                    <key-store name="applicationKS">
                        <credential-reference clear-text="password"/>
                        <implementation type="JKS"/>
                        <file path="application.keystore" relative-to="jboss.server.config.dir"/>
                    </key-store>
                </key-stores>
                <key-managers>
                    <key-manager name="applicationKM" key-store="applicationKS" generate-self-signed-certificate-host="localhost">
                        <credential-reference clear-text="password"/>
                    </key-manager>
                </key-managers>
                <server-ssl-contexts>
                    <server-ssl-context name="applicationSSC" key-manager="applicationKM"/>
                </server-ssl-contexts>
            </tls>
        </subsystem>
        <subsystem xmlns="urn:wildfly:health:1.0" security-enabled="false"/>
        <subsystem xmlns="urn:jboss:domain:iiop-openjdk:2.1">
            <orb socket-binding="iiop"/>
            <initializers security="identity" transactions="spec"/>
            <security server-requires-ssl="false" client-requires-ssl="false"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:infinispan:12.0">
            <cache-container name="ejb" default-cache="dist" aliases="sfsb" modules="org.wildfly.clustering.ejb.infinispan">
                <transport lock-timeout="60000"/>
                <distributed-cache name="dist">
                    <locking isolation="REPEATABLE_READ"/>
                    <transaction mode="BATCH"/>
                    <file-store/>
                </distributed-cache>
            </cache-container>
            <cache-container name="server" default-cache="default" aliases="singleton cluster" modules="org.wildfly.clustering.server">
                <transport lock-timeout="60000"/>
                <replicated-cache name="default">
                    <transaction mode="BATCH"/>
                </replicated-cache>
            </cache-container>
            <cache-container name="web" default-cache="dist" modules="org.wildfly.clustering.web.infinispan">
                <transport lock-timeout="60000"/>
                <replicated-cache name="sso">
                    <locking isolation="REPEATABLE_READ"/>
                    <transaction mode="BATCH"/>
                </replicated-cache>
                <replicated-cache name="routing"/>
                <distributed-cache name="dist">
                    <locking isolation="REPEATABLE_READ"/>
                    <transaction mode="BATCH"/>
                    <file-store/>
                </distributed-cache>
            </cache-container>
            <cache-container name="hibernate" modules="org.infinispan.hibernate-cache">
                <transport lock-timeout="60000"/>
                <local-cache name="local-query">
                    <heap-memory size="10000"/>
                    <expiration max-idle="100000"/>
                </local-cache>
                <local-cache name="pending-puts">
                    <expiration max-idle="60000"/>
                </local-cache>
                <invalidation-cache name="entity">
                    <heap-memory size="10000"/>
                    <expiration max-idle="100000"/>
                </invalidation-cache>
                <replicated-cache name="timestamps"/>
            </cache-container>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:io:3.0">
            <worker name="default"/>
            <buffer-pool name="default"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:jaxrs:2.0"/>
        <subsystem xmlns="urn:jboss:domain:jca:5.0">
            <archive-validation enabled="true" fail-on-error="true" fail-on-warn="false"/>
            <bean-validation enabled="true"/>
            <default-workmanager>
                <short-running-threads>
                    <core-threads count="50"/>
                    <queue-length count="50"/>
                    <max-threads count="50"/>
                    <keepalive-time time="10" unit="seconds"/>
                </short-running-threads>
                <long-running-threads>
                    <core-threads count="50"/>
                    <queue-length count="50"/>
                    <max-threads count="50"/>
                    <keepalive-time time="10" unit="seconds"/>
                </long-running-threads>
            </default-workmanager>
            <cached-connection-manager/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:jdr:1.0"/>
        <subsystem xmlns="urn:jboss:domain:jgroups:8.0">
            <channels default="ee">
                <channel name="ee" stack="udp" cluster="ejb"/>
            </channels>
            <stacks>
                <stack name="udp">
                    <transport type="UDP" socket-binding="jgroups-udp"/>
                    <protocol type="PING"/>
                    <protocol type="MERGE3"/>
                    <socket-protocol type="FD_SOCK" socket-binding="jgroups-udp-fd"/>
                    <protocol type="FD_ALL"/>
                    <protocol type="VERIFY_SUSPECT"/>
                    <protocol type="pbcast.NAKACK2"/>
                    <protocol type="UNICAST3"/>
                    <protocol type="pbcast.STABLE"/>
                    <protocol type="pbcast.GMS"/>
                    <protocol type="UFC"/>
                    <protocol type="MFC"/>
                    <protocol type="FRAG3"/>
                </stack>
                <stack name="tcp">
                    <transport type="TCP" socket-binding="jgroups-tcp"/>
                    <socket-protocol type="MPING" socket-binding="jgroups-mping"/>
                    <protocol type="MERGE3"/>
                    <socket-protocol type="FD_SOCK" socket-binding="jgroups-tcp-fd"/>
                    <protocol type="FD_ALL"/>
                    <protocol type="VERIFY_SUSPECT"/>
                    <protocol type="pbcast.NAKACK2"/>
                    <protocol type="UNICAST3"/>
                    <protocol type="pbcast.STABLE"/>
                    <protocol type="pbcast.GMS"/>
                    <protocol type="MFC"/>
                    <protocol type="FRAG3"/>
                </stack>
            </stacks>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:jmx:1.3">
            <expose-resolved-model/>
            <expose-expression-model/>
            <remoting-connector/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:jpa:1.1">
            <jpa default-extended-persistence-inheritance="DEEP"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:jsf:1.1"/>
        <subsystem xmlns="urn:jboss:domain:jsr77:1.0"/>
        <subsystem xmlns="urn:jboss:domain:keycloak:1.1">
            <secure-deployment name="gec-web.war">
                <realm>intranet</realm>
                <resource>cli-web-gec</resource>
                <auth-server-url>${SSO_INTRANET_AUTH_URL}</auth-server-url>
                <ssl-required>EXTERNAL</ssl-required>
                <credential name="secret">${SSO_INTRANET_SECRET}</credential>
            </secure-deployment>
            <secure-deployment name="gec-api.war">
                <realm>intranet</realm>
                <resource>cli-api-gec</resource>
                <auth-server-url>https://login.des.caixa/auth</auth-server-url>
                <ssl-required>EXTERNAL</ssl-required>
                <credential name="secret">897f0b68-56da-4a9e-9f94-17feb26d4e56</credential>
            </secure-deployment>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:mail:4.0">
            <mail-session name="default" jndi-name="java:jboss/mail/Default">
                <smtp-server outbound-socket-binding-ref="mail-smtp"/>
            </mail-session>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:messaging-activemq:13.0">
            <server name="default">
                <cluster password="${jboss.messaging.cluster.password:CHANGE ME!!}"/>
                <statistics enabled="${wildfly.messaging-activemq.statistics-enabled:${wildfly.statistics-enabled:false}}"/>
                <security-setting name="#">
                    <role name="guest" send="true" consume="true" create-non-durable-queue="true" delete-non-durable-queue="true"/>
                </security-setting>
                <address-setting name="jms.queue.queueRspPagamentoTed" dead-letter-address="jms.queue.queueRspPagamentoTedDQ" expiry-address="jms.queue.queueRspPagamentoTedDQ" max-delivery-attempts="3"/>
                <address-setting name="jms.queue.queueEnvioTed" dead-letter-address="jms.queue.queueEnvioTedDQ" expiry-address="jms.queue.queueEnvioTedDQ" max-delivery-attempts="3"/>
                <address-setting name="#" dead-letter-address="jms.queue.DLQ" expiry-address="jms.queue.ExpiryQueue" max-size-bytes="10485760" page-size-bytes="2097152" message-counter-history-day-limit="10" redistribution-delay="1000"/>
                <http-connector name="http-connector" socket-binding="http" endpoint="http-acceptor"/>
                <http-connector name="http-connector-throughput" socket-binding="http" endpoint="http-acceptor-throughput">
                    <param name="batch-delay" value="50"/>
                </http-connector>
                <in-vm-connector name="in-vm" server-id="0">
                    <param name="buffer-pooling" value="false"/>
                </in-vm-connector>
                <http-acceptor name="http-acceptor" http-listener="default"/>
                <http-acceptor name="http-acceptor-throughput" http-listener="default">
                    <param name="batch-delay" value="50"/>
                    <param name="direct-deliver" value="false"/>
                </http-acceptor>
                <in-vm-acceptor name="in-vm" server-id="0">
                    <param name="buffer-pooling" value="false"/>
                </in-vm-acceptor>
                <jgroups-broadcast-group name="bg-group1" jgroups-cluster="activemq-cluster" connectors="http-connector"/>
                <jgroups-discovery-group name="dg-group1" jgroups-cluster="activemq-cluster"/>
                <cluster-connection name="my-cluster" address="jms" connector-name="http-connector" discovery-group="dg-group1"/>
                <jms-queue name="ExpiryQueue" entries="java:/jms/queue/ExpiryQueue"/>
                <jms-queue name="DLQ" entries="java:/jms/queue/DLQ"/>
                <jms-queue name="RecebimentoTedQueue" entries="java:global/remoteJMS/RecebimentoTedQueue java:/jms/queue/RecebimentoTedQueue"/>
                <jms-queue name="queueRecebimentoTed" entries="java:global/remoteJMS/queueRecebimentoTed java:/jms/queue/queueRecebimentoTed"/>
                <jms-queue name="queueEnvioTed" entries="java:global/remoteJMS/queueEnvioTed java:/jms/queue/queueEnvioTed"/>
                <jms-queue name="queueRspPagamentoTedDQ" entries="java:global/remoteJMS/queueRspPagamentoTedDQ java:/jms/queue/queueRspPagamentoTedDQ"/>
                <jms-queue name="queueEnvioTedDQ" entries="java:global/remoteJMS/queueEnvioTedDQ java:/jms/queue/queueEnvioTedDQ"/>
                <jms-queue name="queueRspPagamentoTed" entries="java:global/remoteJMS/queueRspPagamentoTed java:/jms/queue/queueRspPagamentoTed"/>
                <jms-queue name="queueVerificacaoTed" entries="java:global/remoteJMS/queueVerificacaoTed java:/jms/queue/queueVerificacaoTed"/>
                <jms-topic name="topicRecebimentoTedTrc" entries="java:global/remoteJMS/topicRecebimentoTedTrc java:/jms/topic/topicRecebimentoTedTrc"/>
                <connection-factory name="InVmConnectionFactory" entries="java:/ConnectionFactory" connectors="in-vm"/>
                <connection-factory name="RemoteConnectionFactory" entries="java:jboss/exported/jms/RemoteConnectionFactory" connectors="http-connector" ha="true" block-on-acknowledge="true" reconnect-attempts="-1"/>
                <connection-factory name="RecebimentoTedConnectionFactory" entries="java:global/remoteJMS/RecebimentoTedConnectionFactory java:/jms/RecebimentoTedConnectionFactory" connectors="in-vm"/>
                <connection-factory name="EnvioTedConnectionFactory" entries="java:global/remoteJMS/EnvioTedConnectionFactory java:/jms/EnvioTedConnectionFactory" connectors="in-vm"/>
                <connection-factory name="RspPagamentoConnectionFactory" entries="java:global/remoteJMS/RspPagamentoConnectionFactory java:/jms/RspPagamentoConnectionFactory" connectors="in-vm"/>
                <connection-factory name="RecebimentoTedTrcConnectionFactoryTopic" entries="java:global/remoteJMS/RecebimentoTedTrcConnectionFactoryTopic java:/jms/RecebimentoTedTrcConnectionFactoryTopic" connectors="in-vm"/>
                <connection-factory name="RspPagamentoSenderConnectionFactory" entries="java:global/remoteJMS/RspPagamentoSenderConnectionFactory java:/jms/RspPagamentoSenderConnectionFactory" connectors="in-vm"/>
                <connection-factory name="EnvioTedConnectionSenderFactory" entries="java:global/remoteJMS/EnvioTedConnectionSenderFactory java:/jms/EnvioTedConnectionSenderFactory" connectors="in-vm"/>
                <connection-factory name="verificacaoTedConnectionFactory" entries="java:global/remoteJMS/verificacaoTedConnectionFactory java:/jms/verificacaoTedConnectionFactory" connectors="in-vm"/>
                <pooled-connection-factory name="activemq-ra" entries="java:/JmsXA java:jboss/DefaultJMSConnectionFactory" connectors="in-vm" transaction="xa"/>
            </server>
        </subsystem>
        <subsystem xmlns="urn:wildfly:metrics:1.0" security-enabled="false" exposed-subsystems="*" prefix="${wildfly.metrics.prefix:jboss}"/>
        <subsystem xmlns="urn:jboss:domain:modcluster:5.0">
            <proxy name="default" advertise-socket="modcluster" listener="ajp">
                <dynamic-load-provider>
                    <load-metric type="cpu"/>
                </dynamic-load-provider>
            </proxy>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:naming:2.0">
            <remote-naming/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:pojo:1.0"/>
        <subsystem xmlns="urn:jboss:domain:remoting:4.0">
            <http-connector name="http-remoting-connector" connector-ref="default" security-realm="ApplicationRealm"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:request-controller:1.0"/>
        <subsystem xmlns="urn:jboss:domain:resource-adapters:6.0">
            <resource-adapters>
                <resource-adapter id="wmq.jmsra.rar">
                    <archive>
                        wmq.jmsra.rar
                    </archive>
                    <transaction-support>NoTransaction</transaction-support>
                    <connection-definitions>
                        <connection-definition class-name="com.ibm.mq.connector.outbound.ManagedConnectionFactoryImpl" jndi-name="java:/jms/SicliConnectionFactory" pool-name="SicliConnectionFactory">
                            <config-property name="channel">SIFEC.SVRCONN</config-property>
                            <config-property name="hostName">10.1.14.41</config-property>
                            <config-property name="password">SCNLFECD</config-property>
                            <config-property name="queueManager">BRD3</config-property>
                            <config-property name="port">1415</config-property>
                            <config-property name="username">SCNLFECD</config-property>
                        </connection-definition>
                        <connection-definition class-name="com.ibm.mq.connector.outbound.ManagedConnectionFactoryImpl" jndi-name="java:/jms/SiricConnectionFactory" pool-name="SiricConnectionFactory">
                            <config-property name="channel">SIFEC.SVRCONN</config-property>
                            <config-property name="hostName">10.1.14.41</config-property>
                            <config-property name="password">SCNLFECD</config-property>
                            <config-property name="queueManager">BRD3</config-property>
                            <config-property name="port">1415</config-property>
                            <config-property name="username">SCNLFECD</config-property>
                        </connection-definition>
                        <connection-definition class-name="com.ibm.mq.connector.outbound.ManagedConnectionFactoryImpl" jndi-name="java:/jms/SiapxConnectionFactory" enabled="true" pool-name="java:/jms/SiapxConnectionFactory">
                            <config-property name="channel">SIFEC.SVRCONN</config-property>
                            <config-property name="hostName">10.1.14.41</config-property>
                            <config-property name="password">undefined</config-property>
                            <config-property name="queueManager">BRD3</config-property>
                            <config-property name="port">1415</config-property>
                            <config-property name="username">SCNLAPXD</config-property>
                            <validation>
                                <background-validation>false</background-validation>
                            </validation>
                        </connection-definition>
                        <connection-definition class-name="com.ibm.mq.connector.outbound.ManagedConnectionFactoryImpl" jndi-name="java:/jms/SiempConnectionFactory" pool-name="SiempConnectionFactory">
                            <config-property name="channel">SIEMP.SVRCONN</config-property>
                            <config-property name="hostName">10.1.14.41</config-property>
                            <config-property name="password">SFECEMPD</config-property>
                            <config-property name="queueManager">BRD3</config-property>
                            <config-property name="port">1415</config-property>
                            <config-property name="username">SFECEMPD</config-property>
                        </connection-definition>
                    </connection-definitions>
                    <admin-objects>
                        <admin-object class-name="com.ibm.mq.connector.outbound.MQQueueProxy" jndi-name="java:/jms/SIFEC.RSP.PORTAL" pool-name="java:/jms/SIFEC.RSP.PORTAL">
                            <config-property name="baseQueueName">SIFEC.RSP.PORTAL</config-property>
                            <config-property name="CCSID">1208</config-property>
                        </admin-object>
                        <admin-object class-name="com.ibm.mq.connector.outbound.MQQueueProxy" jndi-name="java:/jms/SIFEC.REQ.PORTAL" pool-name="java:/jms/SIFEC.REQ.PORTAL">
                            <config-property name="baseQueueName">SIFEC.REQ.PORTAL</config-property>
                            <config-property name="CCSID">1208</config-property>
                        </admin-object>
                        <admin-object class-name="com.ibm.mq.connector.outbound.MQQueueProxy" jndi-name="java:/jms/SIEMP.RSP.AVALIACAO_RISCO_CREDITO" pool-name="SIEMP.RSP.AVALIACAO_RISCO_CREDITO">
                            <config-property name="baseQueueName">SIEMP.RSP.AVALIACAO_RISCO_CREDITO</config-property>
                            <config-property name="targetClient">MQ</config-property>
                            <config-property name="CCSID">500</config-property>
                        </admin-object>
                    </admin-objects>
                </resource-adapter>
            </resource-adapters>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:sar:1.0"/>
        <subsystem xmlns="urn:jboss:domain:security:2.0">
            <security-domains>
                <security-domain name="other" cache-type="default">
                    <authentication>
                        <login-module code="Remoting" flag="optional">
                            <module-option name="password-stacking" value="useFirstPass"/>
                        </login-module>
                        <login-module code="RealmDirect" flag="required">
                            <module-option name="password-stacking" value="useFirstPass"/>
                        </login-module>
                    </authentication>
                </security-domain>
                <security-domain name="jaas-sifec-local" cache-type="default">
                    <authentication>
                        <login-module code="Remoting" flag="required">
                            <module-option name="password-stacking" value="useFirstPass"/>
                        </login-module>
                        <login-module code="RealmUsersRoles" flag="required">
                            <module-option name="usersProperties" value="${jboss.server.config.dir}/application-users.properties"/>
                            <module-option name="rolesProperties" value="${jboss.server.config.dir}/application-roles.properties"/>
                            <module-option name="realm" value="ApplicationRealm"/>
                            <module-option name="password-stacking" value="useFirstPass"/>
                        </login-module>
                    </authentication>
                </security-domain>
                <security-domain name="jaas-sigtc-local" cache-type="default">
                    <authentication>
                        <login-module code="Remoting" flag="required">
                            <module-option name="password-stacking" value="useFirstPass"/>
                        </login-module>
                        <login-module code="RealmUsersRoles" flag="required">
                            <module-option name="usersProperties" value="${jboss.server.config.dir}/application-users.properties"/>
                            <module-option name="rolesProperties" value="${jboss.server.config.dir}/application-roles.properties"/>
                            <module-option name="realm" value="ApplicationRealm"/>
                            <module-option name="password-stacking" value="useFirstPass"/>
                        </login-module>
                    </authentication>
                </security-domain>
                <security-domain name="jaas-sifec" cache-type="default">
                    <authentication>
                        <login-module code="org.jboss.security.auth.spi.LdapExtLoginModule" flag="sufficient">
                            <module-option name="allowEmptyPasswords" value="true"/>
                            <module-option name="baseCtxDN" value="ou=people,o=caixa"/>
                            <module-option name="baseFilter" value="(uid={0})"/>
                            <module-option name="java.naming.provider.url" value="ldap://10.1.14.45:389"/>
                            <module-option name="java.naming.security.authentication" value="simple"/>
                            <module-option name="roleAttributeID" value="dn"/>
                            <module-option name="roleAttributeIsDN" value="true"/>
                            <module-option name="roleFilter" value="(uniqueMember=uid={0},ou=people,o=caixa)"/>
                            <module-option name="roleNameAttributeID" value="cn"/>
                            <module-option name="rolesCtxDN" value="cn=SIFEC,ou=Groups,o=caixa"/>
                            <module-option name="searchScope" value="SUBTREE_SCOPE"/>
                            <module-option name="searchTimeLimit" value="5000"/>
                            <module-option name="throwValidateError" value="true"/>
                        </login-module>
                        <login-module code="org.jboss.security.auth.spi.LdapLoginModule" flag="sufficient">
                            <module-option name="java.naming.factory.initial" value="com.sun.jndi.ldap.LdapCtxFactory"/>
                            <module-option name="java.naming.provider.url" value="ldap://df7390sr004:389"/>
                            <module-option name="java.naming.security.authentication" value="simple"/>
                            <module-option name="principalDNPrefix" value="uid="/>
                            <module-option name="principalDNSuffix" value=",ou=People,o=caixa"/>
                            <module-option name="rolesCtxDN" value="ou=Groups,o=caixa"/>
                            <module-option name="uidAttributeID" value="uniqueMember"/>
                            <module-option name="matchOnUserDN" value="true"/>
                            <module-option name="roleAttributeID" value="cn"/>
                            <module-option name="roleAttributeIsDN" value="false"/>
                            <module-option name="searchTimeLimit" value="5000"/>
                            <module-option name="searchScope" value="SUBTREE_SCOPE"/>
                        </login-module>
                        <login-module name="org.jboss.security.auth.spi.LdapLoginModule-2" code="org.jboss.security.auth.spi.LdapLoginModule" flag="sufficient">
                            <module-option name="java.naming.factory.initial" value="com.sun.jndi.ldap.LdapCtxFactory"/>
                            <module-option name="java.naming.provider.url" value="ldap://localhost:389"/>
                            <module-option name="java.naming.security.authentication" value="simple"/>
                            <module-option name="principalDNPrefix" value="uid="/>
                            <module-option name="principalDNSuffix" value=",ou=People,o=caixa_des"/>
                            <module-option name="rolesCtxDN" value="ou=Groups,o=caixa_des"/>
                            <module-option name="uidAttributeID" value="uniqueMember"/>
                            <module-option name="matchOnUserDN" value="true"/>
                            <module-option name="roleAttributeID" value="cn"/>
                            <module-option name="roleAttributeIsDN" value="false"/>
                            <module-option name="searchTimeLimit" value="5000"/>
                            <module-option name="searchScope" value="SUBTREE_SCOPE"/>
                        </login-module>
                    </authentication>
                </security-domain>
                <security-domain name="jaas-sinad" cache-type="default">
                    <authentication>
                        <login-module code="org.jboss.security.auth.spi.LdapExtLoginModule" flag="required">
                            <module-option name="allowEmptyPasswords" value="true"/>
                            <module-option name="baseCtxDN" value="ou=people,o=caixa"/>
                            <module-option name="baseFilter" value="(uid={0})"/>
                            <module-option name="java.naming.provider.url" value="ldap://10.1.14.45:389"/>
                            <module-option name="java.naming.security.authentication" value="simple"/>
                            <module-option name="roleAttributeID" value="dn"/>
                            <module-option name="roleAttributeIsDN" value="true"/>
                            <module-option name="roleFilter" value="(uniqueMember=uid={0},ou=people,o=caixa)"/>
                            <module-option name="roleNameAttributeID" value="cn"/>
                            <module-option name="rolesCtxDN" value="cn=SIFEC,ou=Groups,o=caixa"/>
                            <module-option name="searchScope" value="SUBTREE_SCOPE"/>
                            <module-option name="searchTimeLimit" value="5000"/>
                            <module-option name="throwValidateError" value="true"/>
                        </login-module>
                    </authentication>
                </security-domain>
                <security-domain name="jaas-siric" cache-type="default">
                    <authentication>
                        <login-module code="org.jboss.security.auth.spi.LdapExtLoginModule" flag="sufficient">
                            <module-option name="allowEmptyPasswords" value="true"/>
                            <module-option name="baseCtxDN" value="ou=people,o=caixa"/>
                            <module-option name="baseFilter" value="(uid={0})"/>
                            <module-option name="java.naming.provider.url" value="ldap://10.1.14.45:389"/>
                            <module-option name="java.naming.security.authentication" value="simple"/>
                            <module-option name="roleAttributeID" value="dn"/>
                            <module-option name="roleAttributeIsDN" value="true"/>
                            <module-option name="roleFilter" value="(uniqueMember=uid={0},ou=people,o=caixa)"/>
                            <module-option name="roleNameAttributeID" value="cn"/>
                            <module-option name="rolesCtxDN" value="cn=SIRIC,ou=Groups,o=caixa"/>
                            <module-option name="searchScope" value="SUBTREE_SCOPE"/>
                            <module-option name="searchTimeLimit" value="5000"/>
                            <module-option name="throwValidateError" value="true"/>
                        </login-module>
                        <login-module name="org.jboss.security.auth.spi.LdapLoginModule-2" code="org.jboss.security.auth.spi.LdapLoginModule" flag="sufficient">
                            <module-option name="java.naming.factory.initial" value="com.sun.jndi.ldap.LdapCtxFactory"/>
                            <module-option name="java.naming.provider.url" value="ldap://localhost:389"/>
                            <module-option name="java.naming.security.authentication" value="simple"/>
                            <module-option name="principalDNPrefix" value="uid="/>
                            <module-option name="principalDNSuffix" value=",ou=People,o=caixa_des"/>
                            <module-option name="rolesCtxDN" value="ou=Groups,o=caixa_des"/>
                            <module-option name="uidAttributeID" value="uniqueMember"/>
                            <module-option name="matchOnUserDN" value="true"/>
                            <module-option name="roleAttributeID" value="cn"/>
                            <module-option name="roleAttributeIsDN" value="false"/>
                            <module-option name="searchTimeLimit" value="5000"/>
                            <module-option name="searchScope" value="SUBTREE_SCOPE"/>
                        </login-module>
                    </authentication>
                </security-domain>
                <security-domain name="jaas-sigec" cache-type="default">
                    <authentication>
                        <login-module code="org.jboss.security.auth.spi.LdapExtLoginModule" flag="sufficient">
                            <module-option name="allowEmptyPasswords" value="true"/>
                            <module-option name="baseCtxDN" value="ou=people,o=caixa"/>
                            <module-option name="baseFilter" value="(uid={0})"/>
                            <module-option name="java.naming.provider.url" value="ldap://10.1.14.45:389"/>
                            <module-option name="java.naming.security.authentication" value="simple"/>
                            <module-option name="roleAttributeID" value="dn"/>
                            <module-option name="roleAttributeIsDN" value="true"/>
                            <module-option name="roleFilter" value="(uniqueMember=uid={0},ou=people,o=caixa)"/>
                            <module-option name="roleNameAttributeID" value="cn"/>
                            <module-option name="rolesCtxDN" value="cn=SIGEC,ou=Groups,o=caixa"/>
                            <module-option name="searchScope" value="SUBTREE_SCOPE"/>
                            <module-option name="searchTimeLimit" value="5000"/>
                            <module-option name="throwValidateError" value="true"/>
                        </login-module>
                    </authentication>
                </security-domain>
                <security-domain name="jaas-sifec-tqs" cache-type="default">
                    <authentication>
                        <login-module code="org.jboss.security.auth.spi.LdapExtLoginModule" flag="required">
                            <module-option name="allowEmptyPasswords" value="true"/>
                            <module-option name="baseCtxDN" value="ou=people,o=caixa"/>
                            <module-option name="baseFilter" value="(uid={0})"/>
                            <module-option name="java.naming.provider.url" value="ldap://localhost:1389"/>
                            <module-option name="java.naming.security.authentication" value="simple"/>
                            <module-option name="roleAttributeID" value="dn"/>
                            <module-option name="roleAttributeIsDN" value="true"/>
                            <module-option name="roleFilter" value="(uniqueMember=uid={0},ou=people,o=caixa)"/>
                            <module-option name="roleNameAttributeID" value="cn"/>
                            <module-option name="rolesCtxDN" value="cn=SIFEC,ou=Groups,o=caixa"/>
                            <module-option name="searchScope" value="SUBTREE_SCOPE"/>
                            <module-option name="searchTimeLimit" value="5000"/>
                            <module-option name="throwValidateError" value="true"/>
                        </login-module>
                    </authentication>
                </security-domain>
                <security-domain name="other2" cache-type="default">
                    <authentication>
                        <login-module code="Remoting" flag="optional">
                            <module-option name="password-stacking" value="useFirstPass"/>
                        </login-module>
                        <login-module code="RealmDirect" flag="required">
                            <module-option name="password-stacking" value="useFirstPass"/>
                        </login-module>
                    </authentication>
                </security-domain>
                <security-domain name="keycloak">
                    <authentication>
                        <login-module code="org.keycloak.adapters.jboss.KeycloakLoginModule" flag="required"/>
                    </authentication>
                </security-domain>
                <security-domain name="jboss-web-policy" cache-type="default">
                    <authorization>
                        <policy-module code="Delegating" flag="required"/>
                    </authorization>
                </security-domain>
                <security-domain name="jaspitest" cache-type="default">
                    <authentication-jaspi>
                        <login-module-stack name="dummy">
                            <login-module code="Dummy" flag="optional"/>
                        </login-module-stack>
                        <auth-module code="Dummy"/>
                    </authentication-jaspi>
                </security-domain>
                <security-domain name="jboss-ejb-policy" cache-type="default">
                    <authorization>
                        <policy-module code="Delegating" flag="required"/>
                    </authorization>
                </security-domain>
            </security-domains>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:security-manager:1.0">
            <deployment-permissions>
                <maximum-set>
                    <permission class="java.security.AllPermission"/>
                </maximum-set>
            </deployment-permissions>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:singleton:1.0">
            <singleton-policies default="default">
                <singleton-policy name="default" cache-container="server">
                    <simple-election-policy/>
                </singleton-policy>
            </singleton-policies>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:transactions:6.0">
            <core-environment node-identifier="${jboss.tx.node.id:1}">
                <process-id>
                    <uuid/>
                </process-id>
            </core-environment>
            <recovery-environment socket-binding="txn-recovery-environment" status-socket-binding="txn-status-manager"/>
            <coordinator-environment statistics-enabled="${wildfly.transactions.statistics-enabled:${wildfly.statistics-enabled:false}}"/>
            <object-store path="tx-object-store" relative-to="jboss.server.data.dir"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:undertow:12.0" default-server="default-server" default-virtual-host="default-host" default-servlet-container="default" default-security-domain="other" statistics-enabled="${wildfly.undertow.statistics-enabled:${wildfly.statistics-enabled:false}}">
            <buffer-cache name="default"/>
            <server name="default-server">
                <ajp-listener name="ajp" socket-binding="ajp"/>
                <http-listener name="default" socket-binding="http" redirect-socket="https" enable-http2="true"/>
                <https-listener name="https" socket-binding="https" security-realm="ApplicationRealm" enable-http2="true"/>
                <host name="default-host" alias="localhost">
                    <location name="/" handler="welcome-content"/>
                    <http-invoker security-realm="ApplicationRealm"/>
                </host>
            </server>
            <servlet-container name="default">
                <jsp-config/>
                <websockets/>
            </servlet-container>
            <handlers>
                <file name="welcome-content" path="${jboss.home.dir}/welcome-content"/>
            </handlers>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:webservices:2.0" statistics-enabled="${wildfly.webservices.statistics-enabled:${wildfly.statistics-enabled:false}}">
            <wsdl-host>${jboss.bind.address:127.0.0.1}</wsdl-host>
            <endpoint-config name="Standard-Endpoint-Config"/>
            <endpoint-config name="Recording-Endpoint-Config">
                <pre-handler-chain name="recording-handlers" protocol-bindings="##SOAP11_HTTP ##SOAP11_HTTP_MTOM ##SOAP12_HTTP ##SOAP12_HTTP_MTOM">
                    <handler name="RecordingHandler" class="org.jboss.ws.common.invocation.RecordingServerHandler"/>
                </pre-handler-chain>
            </endpoint-config>
            <client-config name="Standard-Client-Config"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:weld:4.0"/>
    </profile>
    <interfaces>
        <interface name="management">
            <inet-address value="${jboss.bind.address.management:127.0.0.1}"/>
        </interface>
        <interface name="private">
            <inet-address value="${jboss.bind.address.private:127.0.0.1}"/>
        </interface>
        <interface name="public">
            <inet-address value="${jboss.bind.address:127.0.0.1}"/>
        </interface>
        <interface name="unsecure">
            <inet-address value="${jboss.bind.address.unsecure:127.0.0.1}"/>
        </interface>
    </interfaces>
    <socket-binding-group name="standard-sockets" default-interface="public" port-offset="${jboss.socket.binding.port-offset:0}">
        <socket-binding name="ajp" port="${jboss.ajp.port:8009}"/>
        <socket-binding name="http" port="${jboss.http.port:8080}"/>
        <socket-binding name="https" port="${jboss.https.port:8443}"/>
        <socket-binding name="modcluster" multicast-address="${jboss.modcluster.multicast.address:224.0.1.105}" multicast-port="23364"/>
        <socket-binding name="iiop" interface="unsecure" port="3528"/>
        <socket-binding name="iiop-ssl" interface="unsecure" port="3529"/>
        <socket-binding name="jgroups-mping" interface="private" multicast-address="${jboss.default.multicast.address:230.0.0.4}" multicast-port="45700"/>
        <socket-binding name="jgroups-tcp" interface="private" port="7600"/>
        <socket-binding name="jgroups-tcp-fd" interface="private" port="57600"/>
        <socket-binding name="jgroups-udp" interface="private" port="55200" multicast-address="${jboss.default.multicast.address:230.0.0.4}" multicast-port="45688"/>
        <socket-binding name="jgroups-udp-fd" interface="private" port="54200"/>
        <socket-binding name="management-http" interface="management" port="${jboss.management.http.port:9990}"/>
        <socket-binding name="management-https" interface="management" port="${jboss.management.https.port:9993}"/>
        <socket-binding name="txn-recovery-environment" port="4712"/>
        <socket-binding name="txn-status-manager" port="4713"/>
        <outbound-socket-binding name="mail-smtp">
            <remote-destination host="${jboss.mail.server.host:localhost}" port="${jboss.mail.server.port:25}"/>
        </outbound-socket-binding>
    </socket-binding-group>
    
</server>


Skip to main content
Azure DevOps
projetos
/
Caixa
/
Repos
/
Files
/

SIGEC-portabilidade-config
Search


Caixa

Overview

Boards

Repos
Files
Commits
Pushes
Branches
Tags
Pull requests

Pipelines

Test Plans

Artifacts
Project settings
SIGEC-portabilidade-config

jboss
jboss-custom.cli
jboss-deployments
jboss-modules-custom
standalone-full-ha.xml
standalone.conf
README.md

master

/
jboss
/
standalone-full-ha.xml
standalone-full-ha.xml

Edit

Contents
History
Compare
Blame


Updated standalone-full-ha.xml
0e868b3c
Thiago Jeferson de Sousa Silva
Today at 13:07
edit
failed
Updated standalone-full-ha.xml
e1354062
Thiago Jeferson de Sousa Silva
Today at 12:52
edit
failed
Updated standalone-full-ha.xml
77604002
Thiago Jeferson de Sousa Silva
Today at 12:32
edit
failed
Updated standalone-full-ha.xml
76b38cb5
Thiago Jeferson de Sousa Silva
Today at 12:23
edit
failed

Merge branch 'master' of https://devops.caixa/projetos/Caixa/_git/SIGEC-portabilidade-config
409772d1
Fabio
Yesterday at 13:17
edit
failed
Updated standalone-full-ha.xml
321ecfcf
Thiago Jeferson de Sousa Silva
Yesterday at 09:11
edit
failed
Updated standalone-full-ha.xml
6d378787
Thiago Jeferson de Sousa Silva
qua. at 16:53
edit
failed
chore(master): alterações oriundas do ambiente legado, no que seja compátivl com jboss 7.4
3dd709f3
Fabio
Yesterday at 13:17
edit
Updated standalone-full-ha.xml
94258713
Rafael Augusto Soares
27 de set. de 2024 at 16:01
edit
Updated standalone-full-ha.xml
72b4f9f7
Rafael Augusto Soares
27 de set. de 2024 at 16:00
edit
Updated standalone-full-ha.xml to use elytron
30440271
Rafael Augusto Soares
26 de mar. de 2024 at 14:59
edit
Primeiro commit
1d39e649
Rafael Augusto Soares
10 de nov. de 2023 at 14:38
add
Showing 3 items.

Finished loading items

Expanded

Collapsed



ta uma bagunoca pois estamos em contexto de addr o jeferson esta mechenod e  o fabio alterando tudo 

olhao com oque o fabi odeixos a s librarus


Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Library
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings

Library

SIGEC-PORTABILIDADE-DES

Variable group
Properties
Variable group name
SIGEC-PORTABILIDADE-DES
Description
Grupo de variáveis de SIGEC-PORTABILIDADE-DES


Variables
API_MANAGER_API_KEY
l714f9532275eb495c85015a769ab99181
API_MANAGER_URL_BASE
https://api.des.caixa:8443
BARRAMENTO_URL_BASE
http://tqs.barramento.caixa
CLIENT_APP_ID
cli-ser-gec
CLIENT_APP_SECRET
385c6032-c152-465c-97cf-7ac351649caa
client.secret
385c6032-c152-465c-97cf-7ac351649caa
outdir
C:/Desenvolvimento/SIGEC/demandas/XML_Fluxos/ARCC
PASTA_PUBLICA_APX
\\NBTITMA141426/Desenvolvimento/SIGEC/demandas/XML_Fluxos
SIMTR_BASE_URL
/simtr
SSL_DEBUG
true
SSL_TRUST_ALL_CERTIFICATES
true
SSL_VERIFY_HOSTNAME
false
SSO_INTERNET_TYPE_OF_SSL_REQUIRED
external
SSO_INTERNET2_TYPE_OF_SSL_REQUIRED
external
SSO_INTRANET_SECRET
897f0b68-56da-4a9e-9f94-17feb26d4e56
SSO_INTRANET_TYPE_OF_SSL_REQUIRED
external
SSO_SERVICO_URL_BASE_INTRANET
https://login.des.caixa
USUARIO_SILCR
SGECLCRQ




eiu ja tinhao colcoad as coisa da jboss eel arancou tudo


2026-11-13T18:23:33.1304438Z ##[section]Starting: Alterando Valores placeholders nos arquivos de config
2026-11-13T18:23:33.1308137Z ==============================================================================
2026-11-13T18:23:33.1308218Z Task         : Replace Tokens
2026-11-13T18:23:33.1308262Z Description  : Replace tokens in files
2026-11-13T18:23:33.1308322Z Version      : 3.3.1
2026-11-13T18:23:33.1308362Z Author       : Guillaume Rouchon
2026-11-13T18:23:33.1308413Z Help         : v3.3.1 - [More Information](https://github.com/qetza/vsts-replacetokens-task#readme)
2026-11-13T18:23:33.1308497Z ==============================================================================
2026-11-13T18:23:34.1854171Z replacing tokens in: /opt/ads-agent/_work/r18280/a/_SIGEC-portabilidade-config/jboss/standalone-full-ha.xml
2026-11-13T18:23:34.2059364Z replacing tokens in: /opt/ads-agent/_work/r18280/a/_SIGEC-portabilidade-config/jboss/standalone.conf
2026-11-13T18:23:34.2067325Z ##[error]  variable not found: JVM_HEAP_MIN
2026-11-13T18:23:34.2076983Z ##[error]  variable not found: JVM_HEAP_MAX
2026-11-13T18:23:34.2078814Z ##[error]  variable not found: JVM_METASPACE_MIN
2026-11-13T18:23:34.2079963Z ##[error]  variable not found: JVM_METASPACE_MAX
2026-11-13T18:23:34.2081198Z ##[error]  variable not found: PASSWORD_TRUSTSTORE
2026-11-13T18:23:34.2083153Z ##[error]  variable not found: URL_APM_SERVER
2026-11-13T18:23:34.2689856Z ##[section]Finishing: Alterando Valores placeholders nos arquivos de config



agora ta quendaorba qaqui>>



