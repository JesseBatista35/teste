<?xml version="1.0" encoding="UTF-8"?>

<server xmlns="urn:jboss:domain:20.0">
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
        <extension module="org.jboss.as.transactions"/>
        <extension module="org.jboss.as.webservices"/>
        <extension module="org.jboss.as.weld"/>
        <extension module="org.wildfly.extension.batch.jberet"/>
        <extension module="org.wildfly.extension.bean-validation"/>
        <extension module="org.wildfly.extension.core-management"/>
        <extension module="org.wildfly.extension.discovery"/>
        <extension module="org.wildfly.extension.ee-security"/>
        <extension module="org.wildfly.extension.elytron"/>
        <extension module="org.wildfly.extension.elytron-oidc-client"/>
        <extension module="org.wildfly.extension.health"/>
        <extension module="org.wildfly.extension.io"/>
        <extension module="org.wildfly.extension.metrics"/>
        <extension module="org.wildfly.extension.request-controller"/>
        <extension module="org.wildfly.extension.security.manager"/>
        <extension module="org.wildfly.extension.undertow"/>
    </extensions>
    <system-properties>
        <property name="br.gov.caixa.sisgr.auth.url" value="https://webservice.acessoseguro.des.corerj.caixa/sisgrauth-web/"/>
        <property name="url_key_cloack" value="https://login.des.caixa/auth"/>
        <property name="url_key_cloack_realm" value="intranet"/>
        <property name="url_sisgr" value="https://webservice.acessoseguro.sso.des.intra.corerj.caixa/sisgrauth-web/v1/"/>
        <property name="url_siico" value="http://des.web.corerj.caixa:8642/siicorjapi/v1/"/>
        <property name="url_siaud_execucao" value="http://localhost:8898/siaud"/>
        <property name="url_siaud_planejamento" value="http://localhost:8898/siaud"/>
        <property name="url_siaud_acompanhamento" value="http://localhost:8888/siaud/siaud-acompanhamento-service"/>
        <property name="url_siaud_acompanhamentoweb" value="http://localhost:8888/siaud/acompanhamento"/>
        <property name="javax.net.ssl.trustStore" value="C:\CAIXA\certs\truststore-logincaixa.jks"/>
        <property name="javax.net.ssl.trustStorePassword" value="changeit"/>
        <property name="javax.net.ssl.trustStoreType" value="jks"/>
        <property name="siaud.INT_URL_API_MANAGER" value="http://des.web.corerj.caixa:8642/"/>
        <property name="siaud.int.siico.api.key" value="l75b3690bee55a4994a4efb88fe248b4d9"/>
        <property name="siaud.int.url.api.manager" value="http://api.des.caixa:8080/"/>
        <property name="siaud.int.url.legado" value="https://des.web.corerj.caixa:8605/siaud/"/>
    </system-properties>
    <management>
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
            <http-interface http-authentication-factory="migration-defaultManagementHttpAuthenticationFactory">
                <http-upgrade enabled="true" sasl-authentication-factory="migration-defaultManagementSaslAuthenticationFactory"/>
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
        <subsystem xmlns="urn:jboss:domain:batch-jberet:3.0">
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
        <subsystem xmlns="urn:jboss:domain:datasources:7.0">
            <datasources>
                <datasource jta="true" jndi-name="java:jboss/jdbc/sihdgDS" pool-name="sihdgDS" enabled="true" use-ccm="true">
                    <connection-url>DATASOURCE_CONNECTION_URL</connection-url>
                    <driver-class>com.microsoft.sqlserver.jdbc.SQLServerDriver</driver-class>
                    <driver>sqlserver</driver>
                    <security>
                        <user-name>DATASOURCE_USER_NAME</user-name>
                        <password>DATASOURCE_PASSWORD</password>
                    </security>
                    <validation>
                        <valid-connection-checker class-name="org.jboss.jca.adapters.jdbc.extensions.mssql.MSSQLValidConnectionChecker"/>
                        <background-validation>true</background-validation>
                    </validation>
                </datasource>
                <drivers>
                    <driver name="sqlserver" module="com.microsoft.sqlserver.jdbc">
                        <driver-class>com.microsoft.sqlserver.jdbc.SQLServerDriver</driver-class>
                    </driver>					
                </drivers>
            </datasources>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:deployment-scanner:2.0">
            <deployment-scanner path="deployments" relative-to="jboss.server.base.dir" scan-interval="5000" runtime-failure-causes-rollback="${jboss.deployment.scanner.rollback.on.failure:false}"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:discovery:1.0"/>
        <subsystem xmlns="urn:jboss:domain:ee:6.0">
            <spec-descriptor-property-replacement>false</spec-descriptor-property-replacement>
            <concurrent>
                <context-services>
                    <context-service name="default" jndi-name="java:jboss/ee/concurrency/context/default" use-transaction-setup-provider="true"/>
                </context-services>
                <managed-thread-factories>
                    <managed-thread-factory name="default" jndi-name="java:jboss/ee/concurrency/factory/default" context-service="default"/>
                </managed-thread-factories>
                <managed-executor-services>
                    <managed-executor-service name="default" jndi-name="java:jboss/ee/concurrency/executor/default" context-service="default" hung-task-threshold="60000" keepalive-time="5000"/>
                </managed-executor-services>
                <managed-scheduled-executor-services>
                    <managed-scheduled-executor-service name="default" jndi-name="java:jboss/ee/concurrency/scheduler/default" context-service="default" hung-task-threshold="60000" keepalive-time="3000"/>
                </managed-scheduled-executor-services>
            </concurrent>
            <default-bindings context-service="java:jboss/ee/concurrency/context/default" datasource="java:jboss/datasources/ExampleDS" managed-executor-service="java:jboss/ee/concurrency/executor/default" managed-scheduled-executor-service="java:jboss/ee/concurrency/scheduler/default" managed-thread-factory="java:jboss/ee/concurrency/factory/default"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:ee-security:1.0"/>
        <subsystem xmlns="urn:jboss:domain:ejb3:10.0">
            <session-bean>
                <stateless>
                    <bean-instance-pool-ref pool-name="slsb-strict-max-pool"/>
                </stateless>
                <stateful default-access-timeout="5000" cache-ref="simple" passivation-disabled-cache-ref="simple"/>
                <singleton default-access-timeout="5000"/>
            </session-bean>
            <pools>
                <bean-instance-pools>
                    <strict-max-pool name="slsb-strict-max-pool" derive-size="from-worker-pools" instance-acquisition-timeout="5" instance-acquisition-timeout-unit="MINUTES"/>
                    <strict-max-pool name="mdb-strict-max-pool" derive-size="from-cpu-count" instance-acquisition-timeout="5" instance-acquisition-timeout-unit="MINUTES"/>
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
            <remote connectors="http-remoting-connector" thread-pool-name="default"/>
            <thread-pools>
                <thread-pool name="default">
                    <max-threads count="10"/>
                    <keepalive-time time="100" unit="milliseconds"/>
                </thread-pool>
            </thread-pools>
            <default-security-domain value="other"/>
            <application-security-domains>
                <application-security-domain name="other" security-domain="migration-defaultApplicationDomain"/>
            </application-security-domains>
            <default-missing-method-permissions-deny-access value="true"/>
            <log-system-exceptions value="true"/>
        </subsystem>
        <subsystem xmlns="urn:wildfly:elytron:18.0" final-providers="combined-providers" disallowed-providers="OracleUcrypto">
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
                <security-domain name="migration-defaultApplicationDomain" default-realm="migration-defaultApplicationRealm" permission-mapper="default-permission-mapper">
                    <realm name="migration-defaultApplicationRealm" role-decoder="groups-to-roles"/>
                    <realm name="local"/>
                </security-domain>
                <security-domain name="migration-defaultManagementDomain" default-realm="migration-defaultManagementRealm" permission-mapper="default-permission-mapper">
                    <realm name="migration-defaultManagementRealm" role-decoder="groups-to-roles"/>
                    <realm name="local" role-mapper="super-user-mapper"/>
                </security-domain>
            </security-domains>
            <security-realms>
                <identity-realm name="local" identity="$local"/>
                <properties-realm name="migration-defaultApplicationRealm">
                    <users-properties path="application-users.properties" relative-to="jboss.server.config.dir" digest-realm-name="migration-defaultApplicationRealm"/>
                    <groups-properties path="application-roles.properties" relative-to="jboss.server.config.dir"/>
                </properties-realm>
                <properties-realm name="migration-defaultManagementRealm">
                    <users-properties path="mgmt-users.properties" relative-to="jboss.server.config.dir" digest-realm-name="migration-defaultManagementRealm"/>
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
                <http-authentication-factory name="migration-defaultApplicationHttpAuthenticationFactory" security-domain="migration-defaultApplicationDomain" http-server-mechanism-factory="global">
                    <mechanism-configuration>
                        <mechanism mechanism-name="BASIC">
                            <mechanism-realm realm-name="migration-defaultApplicationRealm"/>
                        </mechanism>
                    </mechanism-configuration>
                </http-authentication-factory>
                <http-authentication-factory name="migration-defaultManagementHttpAuthenticationFactory" security-domain="migration-defaultManagementDomain" http-server-mechanism-factory="global">
                    <mechanism-configuration>
                        <mechanism mechanism-name="DIGEST">
                            <mechanism-realm realm-name="migration-defaultManagementRealm"/>
                        </mechanism>
                    </mechanism-configuration>
                </http-authentication-factory>
                <provider-http-server-mechanism-factory name="global"/>
            </http>
            <sasl>
                <sasl-authentication-factory name="migration-defaultApplicationSaslAuthenticationFactory" sasl-server-factory="configured" security-domain="migration-defaultApplicationDomain">
                    <mechanism-configuration>
                        <mechanism mechanism-name="JBOSS-LOCAL-USER" realm-mapper="local"/>
                        <mechanism mechanism-name="DIGEST-MD5">
                            <mechanism-realm realm-name="migration-defaultApplicationRealm"/>
                        </mechanism>
                    </mechanism-configuration>
                </sasl-authentication-factory>
                <sasl-authentication-factory name="migration-defaultManagementSaslAuthenticationFactory" sasl-server-factory="configured" security-domain="migration-defaultManagementDomain">
                    <mechanism-configuration>
                        <mechanism mechanism-name="JBOSS-LOCAL-USER" realm-mapper="local"/>
                        <mechanism mechanism-name="DIGEST-MD5">
                            <mechanism-realm realm-name="migration-defaultManagementRealm"/>
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
                    <key-store name="migration-defaultTLSKeyStore">
                        <credential-reference clear-text="password"/>
                        <implementation type="JKS"/>
                        <file path="application.keystore" relative-to="jboss.server.config.dir"/>
                    </key-store>
                </key-stores>
                <key-managers>
                    <key-manager name="migration-defaultTLSKeyManager" key-store="migration-defaultTLSKeyStore" generate-self-signed-certificate-host="localhost">
                        <credential-reference clear-text="password"/>
                    </key-manager>
                </key-managers>
                <server-ssl-contexts>
                    <server-ssl-context name="migration-defaultTLSServerSSLContext" key-manager="migration-defaultTLSKeyManager"/>
                </server-ssl-contexts>
            </tls>
        </subsystem>
        <subsystem xmlns="urn:wildfly:elytron-oidc-client:2.0">
            <secure-deployment name="sihdg-api.war">
                <auth-server-url>https://login.des.caixa/auth</auth-server-url>
                <ssl-required>EXTERNAL</ssl-required>
                <realm>intranet</realm>
                <resource>cli-web-hdg</resource>
                <public-client>true</public-client>
            </secure-deployment>
        </subsystem>
        <subsystem xmlns="urn:wildfly:health:1.0" security-enabled="false"/>
        <subsystem xmlns="urn:jboss:domain:infinispan:14.0">
            <cache-container name="server" default-cache="default" marshaller="LEGACY" modules="org.wildfly.clustering.server">
                <local-cache name="default">
                    <transaction mode="BATCH"/>
                </local-cache>
            </cache-container>
            <cache-container name="web" default-cache="passivation" marshaller="LEGACY" modules="org.wildfly.clustering.web.infinispan">
                <local-cache name="passivation">
                    <locking isolation="REPEATABLE_READ"/>
                    <transaction mode="BATCH"/>
                    <file-store passivation="true" purge="false"/>
                </local-cache>
                <local-cache name="persistent">
                    <locking isolation="REPEATABLE_READ"/>
                    <transaction mode="BATCH"/>
                    <file-store passivation="false" purge="false"/>
                </local-cache>
                <local-cache name="concurrent">
                    <file-store passivation="true" purge="false"/>
                </local-cache>
            </cache-container>
            <cache-container name="ejb" default-cache="passivation" marshaller="LEGACY" aliases="sfsb" modules="org.wildfly.clustering.ejb.infinispan">
                <local-cache name="passivation">
                    <locking isolation="REPEATABLE_READ"/>
                    <transaction mode="BATCH"/>
                    <file-store passivation="true" purge="false"/>
                </local-cache>
                <local-cache name="persistent">
                    <locking isolation="REPEATABLE_READ"/>
                    <transaction mode="BATCH"/>
                    <file-store passivation="false" purge="false"/>
                </local-cache>
            </cache-container>
            <cache-container name="hibernate" default-cache="local-query" marshaller="LEGACY" modules="org.infinispan.hibernate-cache">
                <local-cache name="entity">
                    <transaction mode="NON_XA"/>
                    <heap-memory size="10000"/>
                    <expiration max-idle="100000"/>
                </local-cache>
                <local-cache name="local-query">
                    <heap-memory size="10000"/>
                    <expiration max-idle="100000"/>
                </local-cache>
                <local-cache name="timestamps"/>
            </cache-container>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:io:3.0">
            <worker name="default"/>
            <buffer-pool name="default"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:jaxrs:3.0"/>
        <subsystem xmlns="urn:jboss:domain:jca:6.0">
            <archive-validation enabled="true" fail-on-error="true" fail-on-warn="false"/>
            <bean-validation enabled="true"/>
            <default-workmanager>
                <elytron-enabled>false</elytron-enabled>
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
            <jpa default-datasource="" default-extended-persistence-inheritance="DEEP"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:jsf:1.1"/>
        <subsystem xmlns="urn:jboss:domain:mail:4.0">
            <mail-session name="siaud" jndi-name="java:/mail/siaud">
                <smtp-server outbound-socket-binding-ref="mail-smtp"/>
            </mail-session>
        </subsystem>
        <subsystem xmlns="urn:wildfly:metrics:1.0" security-enabled="false" exposed-subsystems="*" prefix="${wildfly.metrics.prefix:jboss}"/>
        <subsystem xmlns="urn:jboss:domain:naming:2.0">
            <remote-naming/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:pojo:1.0"/>
        <subsystem xmlns="urn:jboss:domain:remoting:5.0">
            <http-connector name="http-remoting-connector" connector-ref="default" sasl-authentication-factory="migration-defaultApplicationSaslAuthenticationFactory"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:request-controller:1.0"/>
        <subsystem xmlns="urn:jboss:domain:resource-adapters:7.0"/>
        <subsystem xmlns="urn:jboss:domain:sar:1.0"/>
        <subsystem xmlns="urn:jboss:domain:security-manager:1.0">
            <deployment-permissions>
                <maximum-set>
                    <permission class="java.security.AllPermission"/>
                </maximum-set>
            </deployment-permissions>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:transactions:6.0">
            <core-environment>
                <process-id>
                    <uuid/>
                </process-id>
            </core-environment>
            <recovery-environment socket-binding="txn-recovery-environment" status-socket-binding="txn-status-manager"/>
            <object-store relative-to="jboss.server.data.dir"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:undertow:14.0">
            <buffer-cache name="default"/>
            <server name="default-server">
                <http-listener name="default" socket-binding="http" redirect-socket="https" enable-http2="true"/>
                <https-listener name="https" socket-binding="https" ssl-context="migration-defaultTLSServerSSLContext" enable-http2="true"/>
                <host name="default-host" alias="localhost">
                    <location name="/" handler="welcome-content"/>
                    <http-invoker http-authentication-factory="migration-defaultApplicationHttpAuthenticationFactory"/>
                </host>
            </server>
            <servlet-container name="default">
                <jsp-config/>
                <websockets/>
            </servlet-container>
            <handlers>
                <file name="welcome-content" path="${jboss.home.dir}/welcome-content"/>
            </handlers>
            <application-security-domains>
                <application-security-domain name="other" security-domain="migration-defaultApplicationDomain"/>
            </application-security-domains>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:webservices:2.0">
            <wsdl-host>${jboss.bind.address:127.0.0.1}</wsdl-host>
            <endpoint-config name="Standard-Endpoint-Config"/>
            <endpoint-config name="Recording-Endpoint-Config">
                <pre-handler-chain name="recording-handlers" protocol-bindings="##SOAP11_HTTP ##SOAP11_HTTP_MTOM ##SOAP12_HTTP ##SOAP12_HTTP_MTOM">
                    <handler name="RecordingHandler" class="org.jboss.ws.common.invocation.RecordingServerHandler"/>
                </pre-handler-chain>
            </endpoint-config>
            <client-config name="Standard-Client-Config"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:weld:5.0"/>
    </profile>
    <interfaces>
        <interface name="management">
            <inet-address value="${jboss.bind.address.management:127.0.0.1}"/>
        </interface>
        <interface name="public">
            <inet-address value="${jboss.bind.address:127.0.0.1}"/>
        </interface>
    </interfaces>
    <socket-binding-group name="standard-sockets" default-interface="public" port-offset="${jboss.socket.binding.port-offset:0}">
        <socket-binding name="ajp" port="${jboss.ajp.port:8009}"/>
        <socket-binding name="http" port="${jboss.http.port:8080}"/>
        <socket-binding name="https" port="${jboss.https.port:8443}"/>
        <socket-binding name="management-http" interface="management" port="${jboss.management.http.port:9990}"/>
        <socket-binding name="management-https" interface="management" port="${jboss.management.https.port:9993}"/>
        <socket-binding name="txn-recovery-environment" port="4712"/>
        <socket-binding name="txn-status-manager" port="4713"/>
        <outbound-socket-binding name="mail-smtp">
            <remote-destination host="localhost" port="25"/>
        </outbound-socket-binding>
    </socket-binding-group>
</server>
