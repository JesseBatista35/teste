Atualizar os arquivos stanalone e setconfig no novo servidor de aplicação do ambiente TQS - loginX
CRJTQAPLLX036 - 10.116.26.227


ELES MANDARAM EM ANEXO O STANDALONE



 
<?xml version='1.0' encoding='UTF-8'?>

<server xmlns="urn:jboss:domain:8.0">
    <extensions>
        <extension module="org.jboss.as.clustering.infinispan"/>
        <extension module="org.jboss.as.connector"/>
        <extension module="org.jboss.as.deployment-scanner"/>
        <extension module="org.jboss.as.ee"/>
        <extension module="org.jboss.as.ejb3"/>
        <extension module="org.jboss.as.jaxrs"/>
        <extension module="org.jboss.as.jmx"/>
        <extension module="org.jboss.as.jpa"/>
        <extension module="org.jboss.as.logging"/>
        <extension module="org.jboss.as.mail"/>
        <extension module="org.jboss.as.naming"/>
        <extension module="org.jboss.as.remoting"/>
        <extension module="org.jboss.as.security"/>
        <extension module="org.jboss.as.transactions"/>
        <extension module="org.jboss.as.weld"/>
        <extension module="org.keycloak.keycloak-adapter-subsystem"/>
        <extension module="org.keycloak.keycloak-server-subsystem"/>
        <extension module="org.wildfly.extension.bean-validation"/>
        <extension module="org.wildfly.extension.core-management"/>
        <extension module="org.wildfly.extension.elytron"/>
        <extension module="org.wildfly.extension.io"/>
        <extension module="org.wildfly.extension.request-controller"/>
        <extension module="org.wildfly.extension.security.manager"/>
        <extension module="org.wildfly.extension.undertow"/>
    </extensions>
    <system-properties>
        <property name="siranpkg.properties.path" value="/pacotes/siper"/>
        <property name="SET_CONFIGURACOES" value="/opt/open/sso/7.3.0/standalone/configuration/set_config.properties"/>
        <property name="javax.net.ssl.trustStore" value="/infra_app/config/siset/cacerts"/>
        <property name="javax.net.ssl.trustStorePassword" value="changeit"/>
        <property name="javax.net.ssl.trustStoreType" value="jks"/>
        <property name="cxf.tls-client.disableCNCheck" value="true"/>
        <property name="java.net.preferIPv4Stack" value="true"/>
        <property name="http.nonProxyHosts" value="*.caixa|*.caixa.gov.br|localhost|fnlogeventos-des.azurewebsites.net"/>
        <property name="https.proxyHost" value="proxydes.caixa"/>
        <property name="https.proxyPort" value="80"/>
        <property name="http.proxyHost" value="proxydes.caixa"/>
        <property name="http.proxyPort" value="80"/>
        <property name="ftp.proxyHost" value="proxydes.caixa"/>
        <property name="ftp.proxyPort" value="80"/>
        <property name="siset.properties.GeoCity" value="/infra_app/config/siset/GeoLite2-City.mmdb"/>
        <property name="keystore.file" value="/pacotes/siran/keystore/.ks31330"/>
        <property name="password.file" value="/pacotes/siran/arquivo_senha/.pw28144"/>
        <property name="hibernate.dialect" value="org.hibernate.dialect.Oracle12cDialect"/>
    </system-properties>
    <vault>
        <vault-option name="KEYSTORE_URL" value="/opt/open/sso/7.3.0/standalone/configuration/jboss.keystore"/>
        <vault-option name="KEYSTORE_PASSWORD" value="MASK-2mSDTeSjJwj.t3Ogt9K0li"/>
        <vault-option name="KEYSTORE_ALIAS" value="jboss"/>
        <vault-option name="SALT" value="F3d3r4d0"/>
        <vault-option name="ITERATION_COUNT" value="33"/>
        <vault-option name="ENC_FILE_DIR" value="/opt/open/sso/7.3.0/standalone/configuration/"/>
    </vault>
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
            <security-realm name="ssl-realm">
                <server-identities>
                    <ssl>
                        <engine enabled-protocols="SSLv3 TLSv1 TLSv1.1 TLSv1.2"/>
                        <keystore path="/infra_app/config/siset/server.jks" keystore-password="Geset07"/>
                    </ssl>
                </server-identities>
                <authentication>
                    <truststore path="/infra_app/config/siset/truststore.jks" keystore-password="Geset07"/>
                </authentication>
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
            <native-interface security-realm="ManagementRealm">
                <socket-binding native="management-native"/>
            </native-interface>
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
                <role name="Deployer">
                    <include>
                        <user name="pedesbr"/>
                    </include>
                </role>
                <role name="Operator">
                    <include>
                        <user name="pedesbr"/>
                    </include>
                </role>
            </role-mapping>
        </access-control>
    </management>
    <profile>
        <subsystem xmlns="urn:jboss:domain:logging:6.0">
            <console-handler name="CONSOLE">
                <level name="INFO"/>
                <formatter>
                    <named-formatter name="COLOR-PATTERN"/>
                </formatter>
            </console-handler>
            <periodic-rotating-file-handler name="FILE" autoflush="true">
                <level name="DEBUG"/>
                <formatter>
                    <named-formatter name="PATTERN"/>
                </formatter>
                <file path="/infra_app/logs/siset/server-${jboss.server.name}.log"/>
                <suffix value=".yyyy-MM-dd-hh"/>
                <append value="true"/>
            </periodic-rotating-file-handler>
            <syslog-handler name="SYSLOG">
                <level name="DEBUG"/>
                <hostname value="${jboss.host.name}"/>
                <app-name value="siset"/>
                <formatter>
                    <syslog-format syslog-type="RFC3164"/>
                </formatter>
                <facility value="local-use-2"/>
            </syslog-handler>
            <logger category="com.arjuna">
                <level name="WARN"/>
            </logger>
            <logger category="org.jboss.as.config">
                <level name="DEBUG"/>
            </logger>
            <logger category="sun.rmi">
                <level name="WARN"/>
            </logger>
            <logger category="br.gov.caixa.siset.internet.spi.session">
                <level name="DEBUG"/>
            </logger>
            <root-logger>
                <level name="INFO"/>
                <handlers>
                    <handler name="CONSOLE"/>
                    <handler name="FILE"/>
                    <handler name="SYSLOG"/>
                </handlers>
            </root-logger>
            <formatter name="PATTERN">
                <pattern-formatter pattern="%d{yyyy-MM-dd HH:mm:ss,SSS} %-5p [%c] (%t) %s%e%n"/>
            </formatter>
            <formatter name="COLOR-PATTERN">
                <pattern-formatter pattern="%K{level}%d{HH:mm:ss,SSS} %-5p [%c] (%t) %s%e%n"/>
            </formatter>
            <logging-profiles>
                <logging-profile name="siset-logger">
                    <periodic-rotating-file-handler name="siset" autoflush="true">
                        <level name="DEBUG"/>
                        <formatter>
                            <pattern-formatter pattern="%d{HH:mm:ss,SSS} %-5p [%c] (%t) %s%E%n"/>
                        </formatter>
                        <file path="/infra_app/logs/siset/${jboss.server.name}.log"/>
                        <suffix value=".yyyy-MM-dd"/>
                    </periodic-rotating-file-handler>
                    <root-logger>
                        <level name="INFO"/>
                        <handlers>
                            <handler name="siset"/>
                        </handlers>
                    </root-logger>
                </logging-profile>
            </logging-profiles>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:bean-validation:1.0"/>
        <subsystem xmlns="urn:jboss:domain:core-management:1.0"/>
        <subsystem xmlns="urn:jboss:domain:datasources:5.0">
            <datasources>
                <datasource jndi-name="java:jboss/datasources/oraset" pool-name="desrep01" enabled="true" use-java-context="true">
                    <connection-url>jdbc:oracle:thin:@cnpexdadvm01-scan2.extra.caixa.gov.br:1521/orat02sc</connection-url>
                    <driver>oracle</driver>
                    <security>
                        <user-name>SISET_INTER</user-name>
                        <password>set3int3</password>
                    </security>
                </datasource>
                <datasource jndi-name="java:jboss/datasources/ExampleDS" pool-name="ExampleDS" enabled="true" use-java-context="true">
                    <connection-url>jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE</connection-url>
                    <driver>h2</driver>
                    <security>
                        <user-name>sa</user-name>
                        <password>sa</password>
                    </security>
                </datasource>
                <datasource jndi-name="java:jboss/datasources/KeycloakDS" pool-name="KeycloakDS" enabled="true" use-java-context="true" use-ccm="true" statistics-enabled="true">
                    <connection-url>jdbc:oracle:thin:@cnpexdadvm01-scan2.extra.caixa.gov.br:1521/orat02sc</connection-url>
                    <driver>oracle</driver>
                    <pool>
                        <min-pool-size>3</min-pool-size>
                        <max-pool-size>100</max-pool-size>
                        <prefill>true</prefill>
                        <use-strict-min>false</use-strict-min>
                        <flush-strategy>FailingConnectionOnly</flush-strategy>
                        <allow-multiple-users>false</allow-multiple-users>
                    </pool>
                    <security>
                        <user-name>SSO_TQS_LOGX</user-name>
                        <password>${VAULT::KEYCLOAK_DS::password::1}</password>
                    </security>
                    <validation>
                        <valid-connection-checker class-name="org.jboss.jca.adapters.jdbc.extensions.oracle.OracleValidConnectionChecker"/>
                        <validate-on-match>true</validate-on-match>
                        <background-validation>false</background-validation>
                        <background-validation-millis>60000</background-validation-millis>
                        <exception-sorter class-name="org.jboss.jca.adapters.jdbc.extensions.oracle.OracleExceptionSorter"/>
                    </validation>
                </datasource>
                <drivers>
                    <driver name="oracle" module="com.oracle.ojdbc6">
                        <driver-class>oracle.jdbc.driver.OracleDriver</driver-class>
                        <xa-datasource-class>oracle.jdbc.xa.client.OracleXADataSource</xa-datasource-class>
                    </driver>
                    <driver name="h2" module="com.h2database.h2">
                        <xa-datasource-class>org.h2.jdbcx.JdbcDataSource</xa-datasource-class>
                    </driver>
                </drivers>
            </datasources>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:deployment-scanner:2.0">
            <deployment-scanner path="deployments" relative-to="jboss.server.base.dir" scan-interval="5000" runtime-failure-causes-rollback="${jboss.deployment.scanner.rollback.on.failure:false}"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:ee:4.0">
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
        <subsystem xmlns="urn:jboss:domain:ejb3:5.0">
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
            <remote connector-ref="http-remoting-connector" thread-pool-name="default">
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
            <log-system-exceptions value="true"/>
        </subsystem>
        <subsystem xmlns="urn:wildfly:elytron:4.0" final-providers="combined-providers" disallowed-providers="OracleUcrypto">
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
                    <permission-mapping match-all="true">
                        <permission-set name="login-permission"/>
                        <permission-set name="default-permissions"/>
                    </permission-mapping>
                    <permission-mapping>
                        <principal name="anonymous"/>
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
                <sasl-authentication-factory name="management-sasl-authentication" sasl-server-factory="configured" security-domain="ManagementDomain">
                    <mechanism-configuration>
                        <mechanism mechanism-name="JBOSS-LOCAL-USER" realm-mapper="local"/>
                        <mechanism mechanism-name="DIGEST-MD5">
                            <mechanism-realm realm-name="ManagementRealm"/>
                        </mechanism>
                    </mechanism-configuration>
                </sasl-authentication-factory>
                <sasl-authentication-factory name="application-sasl-authentication" sasl-server-factory="configured" security-domain="ApplicationDomain">
                    <mechanism-configuration>
                        <mechanism mechanism-name="JBOSS-LOCAL-USER" realm-mapper="local"/>
                        <mechanism mechanism-name="DIGEST-MD5">
                            <mechanism-realm realm-name="ApplicationRealm"/>
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
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:infinispan:7.0">
            <cache-container name="keycloak">
                <local-cache name="realms">
                    <object-memory size="10000"/>
                </local-cache>
                <local-cache name="users">
                    <object-memory size="10000"/>
                </local-cache>
                <local-cache name="sessions"/>
                <local-cache name="offlineSessions"/>
                <local-cache name="loginFailures"/>
                <local-cache name="work"/>
                <local-cache name="authorization">
                    <object-memory size="10000"/>
                </local-cache>
                <local-cache name="keys">
                    <object-memory size="1000"/>
                    <expiration max-idle="3600000"/>
                </local-cache>
                <local-cache name="authenticationSessions"/>
                <local-cache name="actionTokens">
                    <object-memory size="-1"/>
                    <expiration interval="300000" max-idle="-1"/>
                </local-cache>
                <local-cache name="offlineClientSessions"/>
                <local-cache name="clientSessions"/>
            </cache-container>
            <cache-container name="server" default-cache="default" module="org.wildfly.clustering.server">
                <local-cache name="default">
                    <transaction mode="BATCH"/>
                </local-cache>
            </cache-container>
            <cache-container name="web" default-cache="passivation" module="org.wildfly.clustering.web.infinispan">
                <local-cache name="passivation">
                    <locking isolation="REPEATABLE_READ"/>
                    <transaction mode="BATCH"/>
                    <file-store passivation="true" purge="false"/>
                </local-cache>
            </cache-container>
            <cache-container name="ejb" aliases="sfsb" default-cache="passivation" module="org.wildfly.clustering.ejb.infinispan">
                <local-cache name="passivation">
                    <locking isolation="REPEATABLE_READ"/>
                    <transaction mode="BATCH"/>
                    <file-store passivation="true" purge="false"/>
                </local-cache>
            </cache-container>
            <cache-container name="hibernate" module="org.infinispan.hibernate-cache">
                <local-cache name="entity">
                    <transaction mode="NON_XA"/>
                    <object-memory size="10000"/>
                    <expiration max-idle="100000"/>
                </local-cache>
                <local-cache name="local-query">
                    <object-memory size="10000"/>
                    <expiration max-idle="100000"/>
                </local-cache>
                <local-cache name="timestamps"/>
                <local-cache name="offlineSessions">
                    <file-store path="/infinistate/offline-sessions" relative-to="jboss.home.dir" fetch-state="false" passivation="false" preload="false" purge="false"/>
                </local-cache>
            </cache-container>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:io:3.0">
            <worker name="default"/>
            <buffer-pool name="default"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:jaxrs:1.0"/>
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
        <subsystem xmlns="urn:jboss:domain:jmx:1.3">
            <expose-resolved-model/>
            <expose-expression-model/>
            <remoting-connector/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:jpa:1.1">
            <jpa default-datasource="" default-extended-persistence-inheritance="DEEP"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:keycloak:1.1">
            <realm name="r_inter_siper">
                <auth-server-url>https://loginxtqs.caixa.gov.br/auth</auth-server-url>
                <allow-any-hostname>true</allow-any-hostname>
                <disable-trust-manager>false</disable-trust-manager>
                <enable-cors>false</enable-cors>
                <expose-token>false</expose-token>
                <always-refresh-token>true</always-refresh-token>
                <register-node-at-startup>false</register-node-at-startup>
            </realm>
            <secure-deployment name="servico.war">
                <realm>r_inter_siper</realm>
                <resource>cli-ser-set</resource>
                <use-resource-role-mappings>false</use-resource-role-mappings>
                <bearer-only>true</bearer-only>
                <enable-basic-auth>false</enable-basic-auth>
                <public-client>false</public-client>
                <turn-off-change-session-id-on-login>false</turn-off-change-session-id-on-login>
                <ssl-required>EXTERNAL</ssl-required>
                <confidential-port>8443</confidential-port>
                <allow-any-hostname>true</allow-any-hostname>
                <disable-trust-manager>false</disable-trust-manager>
                <enable-cors>false</enable-cors>
                <expose-token>false</expose-token>
                <always-refresh-token>true</always-refresh-token>
                <register-node-at-startup>false</register-node-at-startup>
                <autodetect-bearer-only>false</autodetect-bearer-only>
                <ignore-oauth-query-parameter>false</ignore-oauth-query-parameter>
                <credential name="secret">c26950ff-6a8f-467a-afe7-1135baab04ab</credential>
            </secure-deployment>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:keycloak-server:1.1">
            <web-context>auth</web-context>
            <providers>
                <provider>
                    classpath:${jboss.home.dir}/providers/*
                </provider>
                <provider>
                    module:org.keycloak.examples.hardcoded-ldap-attribute
                </provider>
            </providers>
            <master-realm-name>master</master-realm-name>
            <scheduled-task-interval>900</scheduled-task-interval>
            <theme>
                <staticMaxAge>-1</staticMaxAge>
                <cacheThemes>false</cacheThemes>
                <cacheTemplates>false</cacheTemplates>
                <dir>${jboss.home.dir}/themes</dir>
            </theme>
            <spi name="eventsStore">
                <provider name="jpa" enabled="true">
                    <properties>
                        <property name="exclude-events" value="[&quot;REFRESH_TOKEN&quot;]"/>
                    </properties>
                </provider>
            </spi>
            <spi name="userCache">
                <provider name="default" enabled="true"/>
            </spi>
            <spi name="userSessions">
                <default-provider>siset-user-session</default-provider>
            </spi>
            <spi name="userSessionPersister">
                <default-provider>siset-user-session</default-provider>
            </spi>
            <spi name="timer">
                <default-provider>basic</default-provider>
            </spi>
            <spi name="connectionsHttpClient">
                <provider name="default" enabled="true">
                    <properties>
                        <property name="proxy-mappings" value="[&quot;.*\\.(google|googleapis)\\.com;http://proxydes.caixa:80&quot;]"/>
                    </properties>
                </provider>
            </spi>
            <spi name="connectionsJpa">
                <provider name="default" enabled="true">
                    <properties>
                        <property name="dataSource" value="java:jboss/datasources/KeycloakDS"/>
                        <property name="initializeEmpty" value="true"/>
                        <property name="migrationStrategy" value="manual"/>
                        <property name="migrationExport" value="${jboss.home.dir}/keycloak-database-update.sql"/>
                    </properties>
                </provider>
            </spi>
            <spi name="realmCache">
                <provider name="default" enabled="true"/>
            </spi>
            <spi name="connectionsInfinispan">
                <default-provider>default</default-provider>
                <provider name="default" enabled="true">
                    <properties>
                        <property name="cacheContainer" value="java:jboss/infinispan/container/keycloak"/>
                    </properties>
                </provider>
            </spi>
            <spi name="jta-lookup">
                <default-provider>${keycloak.jta.lookup.provider:jboss}</default-provider>
                <provider name="jboss" enabled="true"/>
            </spi>
            <spi name="publicKeyStorage">
                <provider name="infinispan" enabled="true">
                    <properties>
                        <property name="minTimeBetweenRequests" value="10"/>
                    </properties>
                </provider>
            </spi>
            <spi name="x509cert-lookup">
                <default-provider>apache</default-provider>
                <provider name="apache" enabled="true">
                    <properties>
                        <property name="sslClientCert" value="SSL_CLIENT_CERT"/>
                    </properties>
                </provider>
            </spi>
            <spi name="hostname">
                <default-provider>request</default-provider>
                <provider name="fixed" enabled="true">
                    <properties>
                        <property name="hostname" value="localhost"/>
                        <property name="httpPort" value="-1"/>
                        <property name="httpsPort" value="-1"/>
                    </properties>
                </provider>
            </spi>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:mail:3.0">
            <mail-session name="default" jndi-name="java:jboss/mail/Default">
                <smtp-server outbound-socket-binding-ref="mail-smtp"/>
            </mail-session>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:naming:2.0">
            <remote-naming/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:remoting:4.0">
            <http-connector name="http-remoting-connector" connector-ref="default" security-realm="ApplicationRealm"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:request-controller:1.0"/>
        <subsystem xmlns="urn:jboss:domain:resource-adapters:5.0"/>
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
                <security-domain name="jaspitest" cache-type="default">
                    <authentication-jaspi>
                        <login-module-stack name="dummy">
                            <login-module code="Dummy" flag="optional"/>
                        </login-module-stack>
                        <auth-module code="Dummy"/>
                    </authentication-jaspi>
                </security-domain>
                <security-domain name="keycloak">
                    <authentication>
                        <login-module code="org.keycloak.adapters.jboss.KeycloakLoginModule" flag="required"/>
                    </authentication>
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
        <subsystem xmlns="urn:jboss:domain:transactions:5.0">
            <core-environment node-identifier="${jboss.tx.node.id:1}">
                <process-id>
                    <uuid/>
                </process-id>
            </core-environment>
            <recovery-environment socket-binding="txn-recovery-environment" status-socket-binding="txn-status-manager"/>
            <coordinator-environment statistics-enabled="true"/>
            <object-store relative-to="jboss.server.data.dir"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:undertow:7.0" statistics-enabled="true">
            <buffer-cache name="default"/>
            <server name="default-server">
                <http-listener name="default" max-connections="200" socket-binding="http" record-request-start-time="true" redirect-socket="proxy-https" proxy-address-forwarding="true" enable-http2="true"/>
                <https-listener name="https" socket-binding="https" record-request-start-time="true" security-realm="ssl-realm" enable-http2="true"/>
                <host name="default-host" alias="localhost">
                    <location name="/" handler="welcome-content"/>
                    <location name="/suporte" handler="suporte"/>
                    <http-invoker security-realm="ApplicationRealm"/>
                </host>
            </server>
            <servlet-container name="default">
                <jsp-config/>
                <websockets/>
            </servlet-container>
            <handlers>
                <file name="welcome-content" path="${jboss.home.dir}/welcome-content"/>
                <file name="suporte" path="${jboss.home.dir}/suporte"/>
            </handlers>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:weld:4.0"/>
    </profile>
    <interfaces>
        <interface name="management">
            <inet-address value="${jboss.bind.address.management:10.116.88.148}"/>
        </interface>
        <interface name="public">
            <inet-address value="${jboss.bind.address:10.116.88.148}"/>
        </interface>
        <interface name="private">
            <inet-address value="${jboss.bind.address.private:10.116.88.148}"/>
        </interface>
    </interfaces>
    <socket-binding-group name="standard-sockets" default-interface="public" port-offset="${jboss.socket.binding.port-offset:0}">
        <socket-binding name="management-http" interface="public" port="${jboss.management.http.port:9990}"/>
        <socket-binding name="management-https" interface="management" port="${jboss.management.https.port:9993}"/>
        <socket-binding name="ajp" port="${jboss.ajp.port:8009}"/>
        <socket-binding name="http" port="${jboss.http.port:8080}"/>
        <socket-binding name="https" port="${jboss.https.port:8443}"/>
        <socket-binding name="txn-recovery-environment" port="4712"/>
        <socket-binding name="txn-status-manager" port="4713"/>
        <socket-binding name="proxy-https" port="443"/>
        <socket-binding name="management-native" interface="management" port="${jboss.management.native.port:9999}"/>
        <outbound-socket-binding name="mail-smtp">
            <remote-destination host="localhost" port="25"/>
        </outbound-socket-binding>
    </socket-binding-group>
</server>


E TAMBEM P SET_CONFIG


client_id_siset=cli-web-set

endereco_servico=https://loginxtqs.caixa.gov.br/servico/rest

url_resource_provider_intranet=https://login.tqs.caixa/auth/realms/intranet/resource_provider

servidor_keycloak=https://loginxtqs.caixa.gov.br/auth
siranpkg.properties.path=C:\keycloak-2.5.4.Final\standalone\configuration
rede_account=1234
url_barramento=http://api.des.caixa:8080/seguranca/valida-permissao
usu_servico_barramento=SSETSD01

validador_cpf=http://api.des.caixa:8080/cadastro-receita/v4/pessoas-fisicas

endereco_bar=https://tqs.barramento.caixa 

b2c_endereco_validar_codigo=https://apptokendes.azurewebsites.net/api/Token/v1/validar

#--------------------------------------SIPER-----------------------------------------
#SET_SIPER_OPERACAO=LOGIN_LISTA_CONTAS
SET_SIPER_OPERACAO=VALIDA_USUARIO_APP
SET_SIPER_REDE_ACCOUNT=9886
SET_SIPER_SERVICO_ACCOUNT=550
SET_SIPER_SISTEMA_ORIGEM=SISET
SET_SIPER_UNIDADE=5405
SET_SIPER_USUARIO_SERVICO=SSETSD01
SET_SIPER_VERSAO=1.0

#SET_SIPER_URL_BARRAMENTO=http://api.des.caixa:8080/seguranca/valida-permissao
SET_SIPER_URL_BARRAMENTO=https://tqs.barramento.caixa:443/sibar/ValidaPermissao
SET_SIPER_INDICE=1
SET_SIPER_REDE_CLI-EXT-00489828007400-1=9886
SET_SIPER_SERVICO_CLI-EXT-00489828007400-1=966
SET_SIPER_REDE_DEFAULT=9886
SET_SIPER_SERVICO_DEFAULT=550

#--------------------------------------SIPER - NBM--------------------------------------
SET_NBM_URL_BARRAMENTO=http://api.des.caixa:8080/seguranca/valida-permissao
SET_NBM_USUARIO_SERVICO=SAPPNBMD
SET_NBM_VERSAO=1.0
SET_NBM_SISTEMA_ORIGEM=SINBM
SET_NBM_OPERACAO=VALIDA_ASSINATURA_SIMPLES

SET_NBM_REDE_TRANSMISSORA=9885

#----------------------------------------------------------------------------------------

endereco_mf=http://api.des.caixa:8080
client_mf=newPushSender
client_secret_mf=1234
device_tempo_expira_ativacao_min=30
device_tentativas_ativacao=3
device_tempo_reenvio_min=0
apikey_mf=l7xx60f77f4765464546a9869d2c38e01afc

seguranca_qtd_autoriza_saque=3
seguranca_tempo_autoriza_saque=3

url_kc_internet=https://loginxtqs.caixa.gov.br/auth
realm_kc_internet=master
client_kc_internet=cli-ser-set
secret_kc_internet=04bf10e1-b584-420e-91d3-42024c889230

url_kc_intranet=https://login.tqs.caixa/auth
realm_kc_intranet=master
client_kc_intranet=cli-ser-set
secret_kc_intranet=433f412e-7f4e-4b33-80e7-52be778dc002

url_kc_siset=https://login.tqs.caixa/auth
realm_kc_siset=intranet
client_kc_siset=cli-ser-set
secret_kc_siset=433f412e-7f4e-4b33-80e7-52be778dc002

url_kc_siset_internet=https://loginxtqs.caixa.gov.br/auth
realm_kc_siset_internet=internet
client_kc_siset_internet=cli-ser-set
secret_kc_siset_internet=1355df4a-7222-47df-bb38-3f6d754547b7

url_kc_master=https://loginxtqs.caixa.gov.br/auth
realm_kc_master=master
client_kc_master=cli-ser-set
secret_kc_master=04bf10e1-b584-420e-91d3-42024c889230

url_resource_provider_internet=https://loginxtqs.caixa.gov.br/auth/realms/internet/resource_provider
url_resource_provider_master=https://loginxtqs.caixa.gov.br/auth/realms/master/resource_provider

SGR_URL_REMOVE_AUTORIZACAO=https://webservice.acessoseguro.sso.des.intra.corerj.caixa/sisgrprofile-web/api/autorizacao/remover
SGR_SEGMENTO=CONVENIADO01
sgr_roles=*

fila_mq_host=10.116.95.99
fila_mq_prot=1414
fila_mq_chanel=SISET.SVRCONN
fila_mq_queue_manager=XMQD1
fila_mq_app_user=SSETBD01
fila_mq_app_password=h9g4k3wb
fila_mq_queue_name=LQ.RSP.SISET_CANAL_DIGITAL
fila_mq_integracao_queue_name=LQ.REQ.SISET_INTEGRACAO

seguranca_tempo_expira_codigo_min=30

SET_APIKEY=l7xx60f77f4765464546a9869d2c38e01afc
SET_ENVIO_SMS_V1=http://api.des.caixa:8080/sms/envio/v1/enviar-codigo 
SET_ENVIO_SMS_V2=http://tqs.barramento.caixa/sibar/sms-codigo-ativacao/v2/envio-sms
SET_ENVIO_SMS_V3=https://appenviasmsdes.azurewebsites.net/api/EnviaSMS/v1

TIMEOUT_CONEXAO=5000
TIMEOUT_LEITURA=5000

gms_rede_transmissora=1006


clearsale_endereco=https://loginxtqs.caixa.gov.br/integracao/requisita-score-clersale
clearsale_tempo_reenvio=60
clearsale_tempo_espera=10
clearsale_score_permitido_troca=100.0

cadusu_habilitado=true

servico_sleep=10000

validador_senha_siran=http://api.des.caixa:8080/seguranca/criptografia-senhas/ecc/validasenhaconta

#EVENT_URL=https://fnlogeventos-des.azurewebsites.net/api/FnLogEventos?code=nh5Hu0jAfFnqOsjuhpBiMYmrMbxfQnaa4ykkBQRJhVU5H5fZdKJ5ww==
EVENT_URL=https://fnlogeventos-des.azurewebsites.net/api/FnLogEventosBatch?code=nh5Hu0jAfFnqOsjuhpBiMYmrMbxfQnaa4ykkBQRJhVU5H5fZdKJ5ww==
EVENT_TYPE=SEND_RESET_PASSWORD,SEND_RESET_PASSWORD_ERROR,UPDATE_PASSWORD,UPDATE_PASSWORD_ERROR,EXECUTE_ACTIONS,EXECUTE_ACTIONS_ERROR,LOGIN_ERROR,LOGIN
EVENT_CLIENT=*
EVENT_AMBIENTE=loginx
EVENT_TAM_MAX_FILA=200000
EVENT_TAM_ENVIO_REQUEST=50
EVENT_TEMPO_INTERVALO_ENVIO_BATCH=2
EVENT_TEMPO_INTERVALO_ENVIO=60

token_transacao_client=cli-mob-nbm

log_debug_duracao_chamada=1
