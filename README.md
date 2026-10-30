<?xml version='1.0' encoding='UTF-8'?>

<server xmlns="urn:jboss:domain:16.0">
    <extensions>
        <extension module="org.jboss.as.clustering.infinispan"/>
        <extension module="org.jboss.as.connector"/>
        <extension module="org.jboss.as.deployment-scanner"/>
        <extension module="org.jboss.as.ee"/>
        <extension module="org.jboss.as.ejb3"/>
        <extension module="org.jboss.as.jaxrs"/>
        <extension module="org.jboss.as.jdr"/>
        <extension module="org.jboss.as.jmx"/>
        <extension module="org.jboss.as.jpa"/>
        <extension module="org.jboss.as.jsf"/>
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
    </extensions>

  <system-properties>
    <property name="siali.mq.filaenvmq" value="__FILAENVMQ__"/>
    <property name="siali.mq.filarecmq" value="__FILARECMQ__"/>
    <property name="siali.mq.usrmq" value="__USRMQ__"/>
    <property name="siali.mq.versao" value="__VERSAO__"/>
    <property name="siali.mq.timeoutrspmq" value="__TIMEOUTRSPMQ__"/>
    <property name="siali.mq.timeoutenvmq" value="__TIMEOUTENVMQ__"/>
    <property name="siali.mq.minqm" value="__MINQM__"/>
    <property name="siali.mq.maxqm" value="__MAXQM__"/>
    <property name="siali.mq.canalmq" value="__CANALMQ__"/>
    <property name="siali.mq.hostmq" value="__HOSTMQ__"/>
    <property name="siali.mq.portamq" value="__PORTAMQ__"/>
    <property name="siali.mq.qmmq" value="__QMMQ__"/>
    <property name="siali.mq.logXml" value="__LOGXML__"/>
    <property name="siali.jndi" value="__SIALIDS_JNDI__"/>
    <property name="siali.siico.jndi" value="__SIICODS_JNDI__"/>
    <property name="siali.jpa.jndi" value="__SIALI-JPADS_JNDI__"/>
    <property name="siali.loginx" value="__LOGINX__"/>
    <property name="login.servidor.endereco" value="__ENDERECO__"/>
    <property name="login.servidor.porta" value="__SERVIDOR_PORTA__"/>
    <property name="login.login" value="__LOGIN__"/>
    <property name="login.common.name" value="__COMMON_NAME__"/>
    <property name="login.base" value="__BASE__"/>
    <property name="login.base.grupos" value="__BASE_GRUPOS__"/>
    <property name="login.base.usuarios" value="__BASE_USUARIOS__"/>
    <property name="login.grupos" value="__GRUPOS__"/>
    <property name="login.grupos.tipo" value="__GRUPOS_TIPOS__"/>
    <property name="login.email" value="__MAIL__"/>
    <property name="login.nome" value="__NOME__"/>
    <property name="login.cpf" value="__CPF__"/>
    <property name="login.nascimento" value="__NASCIMENTO__"/>
    <property name="login.funcao.codigo" value="__FUNCAO_CODIGO__"/>
    <property name="login.funcao.nome" value="__FUNCAO_NOME__"/>
    <property name="login.unidade.codigo" value="__UNIDADE_CODIGO__"/>
    <property name="login.unidade.nome" value="__UNIDADE_NOME__"/>
    <property name="login.lotacao.fisica.codigo" value="__LOTACAO_FISICA_CODIGO__"/>
    <property name="login.lotacao.fisica.nome" value="__LOTACAO_FISICA_NOME__"/>
    <property name="login.cargo.codigo" value="__CARGO_CODIGO__"/>
    <property name="login.cargo.nome" value="__CARGO_NOME__"/>
    <property name="siali.mail.fromEmail" value="__FROMEMAIL__"/>
    <property name="siali.mail.jndi" value="__MAIL_JNDI__"/>
    <property name="siali.mail.tempoFinalizacaoProposta" value="__TEMPOFINALIZACAOPROPOSTA__"/>
    <property name="siali.mail.tempoAviso" value="__TEMPOAVISO__"/>
    <property name="siali.mail.horaEnvio" value="__HORAENVIO__"/>
    <property name="siali.mail.to" value="__MAIL_TO__"/>
    <property name="diretorio.temporario" value="__DIRETORIO_TEMPORARIO__"/>
    <property name="diretorio.entrada.sigdb" value="__DIRETORIO_ENTRADA_SIGDB__"/>
    <property name="diretorio.saida.sigdb" value="__DIRETORIO_SAIDA_SIGDB__"/>
    <property name="siali.arquivo.atualiza.tabela.erros" value="__ARQUIVO_ATUALIZA_TABELA_ERROS__"/>
    <property name="siali.parametros.arquivo.atualiza.tabela.erros" value="__PARAMETROS_ARQUIVO_ATUALIZA_TABELA_ERROS__"/>
    <property name="siali.vinculos.representante_legal" value="__VINCULOS_REPRESENTANTE_LEGAL__"/>
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
             <datasource jndi-name="java:jboss/datasources/ExampleDS" pool-name="ExampleDS" enabled="true" use-java-context="true">
                    <connection-url>jdbc:h2:mem:test;DB_CLOSE_DELAY=-1</connection-url>
                    <driver>h2</driver>
                    <security>
                        <user-name>sa</user-name>
                        <password>sa</password>
                    </security>
                </datasource>
                <datasource jta="false" jndi-name="java:jboss/datasources/siali-ds" pool-name="siali-ds" enabled="true" use-ccm="false">
                    <connection-url>__SIALIDS_CONNECTION_URL__</connection-url>
                    <driver-class>org.postgresql.Driver</driver-class>
                    <driver>postgresql</driver>
                    <security>
                        <user-name>__SIALIDS_USER__</user-name>
                        <password>__SIALIDS_PASSWORD_LEGADO__</password>
                    </security>
                    <validation>
                        <validate-on-match>false</validate-on-match>
                        <background-validation>false</background-validation>
                    </validation>
                    <statement>
                        <share-prepared-statements>false</share-prepared-statements>
                    </statement>
                </datasource>
                <datasource jndi-name="java:jboss/datasources/siali-jpa-ds" pool-name="siali-jpa-ds" enabled="true" use-ccm="false">
                    <connection-url>__SIALIJPADS_CONNECTION_URL__</connection-url>
                    <driver-class>org.postgresql.Driver</driver-class>
                    <driver>postgresql</driver>
                    <security>
                        <user-name>__SIALIJPADS_USER__</user-name>
                        <password>__SIALIJPADS_PASSWORD__</password>
                    </security>
                    <validation>
                        <validate-on-match>false</validate-on-match>
                        <background-validation>false</background-validation>
                    </validation>
                    <statement>
                        <share-prepared-statements>false</share-prepared-statements>
                    </statement>
                </datasource>
                <datasource jta="false" jndi-name="java:jboss/datasources/siico-ds" pool-name="siico-ds" enabled="true" use-ccm="false">
                    <connection-url>__SIICODS_CONNECTION_URL__</connection-url>
                    <driver-class>org.postgresql.Driver</driver-class>
                    <driver>postgresql</driver>
                    <security>
                        <user-name>__SIICODS_USER__</user-name>
                        <password>__SIICODS_PASSWORD__</password>
                    </security>
                    <validation>
                        <validate-on-match>false</validate-on-match>
                        <background-validation>false</background-validation>
                    </validation>
                    <statement>
                        <share-prepared-statements>false</share-prepared-statements>
                    </statement>
                </datasource>
                <drivers>
                    <driver name="h2" module="com.h2database.h2">
                        <xa-datasource-class>org.h2.jdbcx.JdbcDataSource</xa-datasource-class>
                    </driver>
                    <driver name="postgresql" module="org.postgresql">
                        <xa-datasource-class>org.postgresql.xa.PGXADataSource</xa-datasource-class>
                    </driver>
            </drivers>
        </datasources>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:deployment-scanner:2.0">
            <deployment-scanner path="deployments" relative-to="jboss.server.base.dir" scan-interval="5000" runtime-failure-causes-rollback="${jboss.deployment.scanner.rollback.on.failure:false}"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:discovery:1.0"/>
        <subsystem xmlns="urn:jboss:domain:distributable-web:2.0" default-session-management="default" default-single-sign-on-management="default">
            <infinispan-session-management name="default" cache-container="web" granularity="SESSION">
                <local-affinity/>
            </infinispan-session-management>
            <infinispan-single-sign-on-management name="default" cache-container="web" cache="sso"/>
            <local-routing/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:ee:6.0">
            <!--
            <global-modules>
                <module name="org.keycloak.keycloak-common" slot="15.0"/>
                <module name="org.keycloak.keycloak-core" slot="15.0"/>
                <module name="org.keycloak.keycloak-adapter-spi" slot="15.0"/>
                <module name="org.keycloak.keycloak-authz-client" slot="15.0"/>
                <module name="org.keycloak.keycloak-adapter-core" slot="15.0"/>
                <module name="org.keycloak.keycloak-jboss-adapter-core" slot="15.0"/>
                <module name="org.keycloak.keycloak-undertow-adapter" slot="15.0"/>
                <module name="org.keycloak.keycloak-undertow-adapter" slot="15.0"/>
                <module name="org.keycloak.keycloak-wildfly-elytron-oidc-adapter" slot="15.0"/>
                <module name="org.keycloak.keycloak-wildfly-subsystem" slot="15.0"/>
            </global-modules>
            !-->
            <spec-descriptor-property-replacement>false</spec-descriptor-property-replacement>
			<jboss-descriptor-property-replacement>true</jboss-descriptor-property-replacement>
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
            <default-bindings context-service="java:jboss/ee/concurrency/context/default" datasource="java:jboss/datasources/ExampleDS" managed-executor-service="java:jboss/ee/concurrency/executor/default" managed-scheduled-executor-service="java:jboss/ee/concurrency/scheduler/default" managed-thread-factory="java:jboss/ee/concurrency/factory/default"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:ee-security:1.0"/>
        <subsystem xmlns="urn:jboss:domain:ejb3:9.0">
            <session-bean>
                <stateless>
                    <bean-instance-pool-ref pool-name="slsb-strict-max-pool"/>
                </stateless>
                <stateful default-access-timeout="5000" cache-ref="simple" passivation-disabled-cache-ref="simple"/>
                <singleton default-access-timeout="5000"/>
            </session-bean>
            <mdb>
                <resource-adapter-ref resource-adapter-name="hornetq-ra"/>
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
                    <keepalive-time time="100" unit="milliseconds"/>
                </thread-pool>
            </thread-pools>
            <default-security-domain value="other"/>
            <default-missing-method-permissions-deny-access value="true"/>
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
        <subsystem xmlns="urn:jboss:domain:infinispan:12.0">
            <cache-container name="ejb" default-cache="passivation" aliases="sfsb" modules="org.wildfly.clustering.ejb.infinispan">
                <local-cache name="passivation">
                    <file-store passivation="true" purge="false"/>
                </local-cache>
            </cache-container>
            <cache-container name="web" default-cache="passivation" modules="org.wildfly.clustering.web.infinispan">
                <local-cache name="passivation">
                    <file-store passivation="true" purge="false"/>
                </local-cache>
                <local-cache name="sso"/>
            </cache-container>
            <cache-container name="server" default-cache="default" modules="org.wildfly.clustering.server">
                <local-cache name="default"/>
            </cache-container>
            <cache-container name="hibernate" modules="org.infinispan.hibernate-cache">
                <local-cache name="entity">
                    <heap-memory size="10000"/>
                    <expiration max-idle="100000"/>
                </local-cache>
                <local-cache name="local-query">
                    <heap-memory size="10000"/>
                    <expiration max-idle="100000"/>
                </local-cache>
                <local-cache name="timestamps"/>
                <local-cache name="pending-puts">
                    <expiration max-idle="60000"/>
                </local-cache>
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
        <subsystem xmlns="urn:jboss:domain:jmx:1.3">
            <expose-resolved-model/>
            <expose-expression-model/>
            <remoting-connector/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:jpa:1.1">
            <jpa default-extended-persistence-inheritance="DEEP"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:jsf:1.1"/>
        <subsystem xmlns="urn:jboss:domain:keycloak:1.1">
            <secure-deployment name="siali.war">
                <realm>intranet</realm>
                <resource>cli-web-ali</resource>
                <auth-server-url>__SSO_AUTH__</auth-server-url>
                <ssl-required>external</ssl-required>
                <enable-cors>true</enable-cors>
                <cors-max-age>10000</cors-max-age>
                <cors-allowed-headers>Content-Type, Access-Control-Allow-Origin, Authorization, X-Screen-Request, apiKey, Referer, User-Agent</cors-allowed-headers>
                <cors-allowed-methods>GET, POST, DELETE, PUT, OPTION</cors-allowed-methods>
                <credential name="secret">__CLI_WEB_ALI__</credential>
                <confidential-port>443</confidential-port>
            </secure-deployment>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:mail:4.0">
            <mail-session name="default" jndi-name="java:jboss/mail/Default">
                <smtp-server outbound-socket-binding-ref="mail-smtp"/>
            </mail-session>
        </subsystem>
        <subsystem xmlns="urn:wildfly:metrics:1.0" security-enabled="false" exposed-subsystems="*" prefix="${wildfly.metrics.prefix:jboss}"/>
        <subsystem xmlns="urn:jboss:domain:naming:2.0">
            <remote-naming/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:pojo:1.0"/>
        <subsystem xmlns="urn:jboss:domain:remoting:4.0">
            <http-connector name="http-remoting-connector" connector-ref="default" security-realm="ApplicationRealm"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:request-controller:1.0"/>
        <subsystem xmlns="urn:jboss:domain:resource-adapters:6.0"/>
        <subsystem xmlns="urn:jboss:domain:sar:1.0"/>
        <subsystem xmlns="urn:jboss:domain:security:2.0">
            <security-domains>
                <security-domain name="other" cache-type="default">
                    <authentication>
                        <login-module code="Remoting" flag="optional">
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
                <security-domain name="jboss-web-policy" cache-type="default">
                    <authorization>
                        <policy-module code="Delegating" flag="required"/>
                    </authorization>
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
        <subsystem xmlns="urn:jboss:domain:transactions:6.0">
            <core-environment node-identifier="1">
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
                <ajp-listener name="ajp" socket-binding="ajp" secure="true" scheme="https"/>
                <http-listener name="default" socket-binding="http" redirect-socket="https" proxy-address-forwarding="true" enable-http2="true"/>
                <https-listener name="https" socket-binding="https" security-realm="ApplicationRealm" enable-http2="true"/>
                <host name="default-host" alias="localhost">
                    <location name="/" handler="welcome-content"/>
                    <filter-ref name="server-header"/>
                    <filter-ref name="x-powered-by-header"/>
                    <filter-ref name="Access-Control-Allow-Origin"/>
                    <filter-ref name="Access-Control-Allow-Methods"/>
                    <filter-ref name="Access-Control-Allow-Headers"/>
                    <filter-ref name="Access-Control-Allow-Credentials"/>
                    <filter-ref name="Access-Control-Max-Age"/>
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
            <filters>
                <response-header name="server-header" header-name="Server" header-value="JBoss-EAP/7"/>
                <response-header name="x-powered-by-header" header-name="X-Powered-By" header-value="Undertow/1"/>
                <response-header name="Access-Control-Allow-Origin" header-name="Access-Control-Allow-Origin" header-value="*"/>
                <response-header name="Access-Control-Allow-Methods" header-name="Access-Control-Allow-Methods" header-value="GET, POST, DELETE, PUT, OPTION"/>
                <response-header name="Access-Control-Allow-Headers" header-name="Access-Control-Allow-Headers" header-value="Content-Type, Access-Control-Allow-Origin, Authorization, X-Screen-Request, apiKey, Referer, User-Agent"/>
                <response-header name="Access-Control-Allow-Credentials" header-name="Access-Control-Allow-Credentials" header-value="true"/>
                <response-header name="Access-Control-Max-Age" header-name="Access-Control-Max-Age" header-value="1"/>
            </filters>
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
            <any-address/>
        </interface>
        <interface name="public">
            <any-address/>
        </interface>
    </interfaces>
    <socket-binding-group name="standard-sockets" default-interface="public" port-offset="${jboss.socket.binding.port-offset:0}">
        <socket-binding name="ajp" port="${jboss.ajp.port:8009}"/>
        <socket-binding name="http" port="${jboss.http.port:8080}"/>
        <socket-binding name="https" port="${jboss.https.port:8443}"/>
        <socket-binding name="management-http" interface="management" port="${jboss.management.http.port:9990}"/>
        <socket-binding name="management-https" interface="management" port="${jboss.management.https.port:9993}"/>
        <socket-binding name="messaging" port="5445"/>
        <socket-binding name="messaging-throughput" port="5455"/>
        <socket-binding name="remoting" port="4447"/>
        <socket-binding name="txn-recovery-environment" port="4712"/>
        <socket-binding name="txn-status-manager" port="4713"/>
        <outbound-socket-binding name="mail-smtp">
            <remote-destination host="${jboss.mail.server.host:localhost}" port="${jboss.mail.server.port:25}"/>
        </outbound-socket-binding>
    </socket-binding-group>
</server>
