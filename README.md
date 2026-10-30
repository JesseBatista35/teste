Por favor, solicito o seguinte ajuste no servidor jboss do ambiente DES do SIALI.
 
Editar o datasource siali-jpa-ds no arquivo standalone.xml de acordo com a imagem enviada.
 
Captura de tela 2026-10-30 120205.png (ver anexo)

<img width="994" height="911" alt="Captura+de+tela+2026-10-30+120205" src="https://github.com/user-attachments/assets/6834dd6f-add9-4283-b6d7-4c44046b3477" />


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

SIALI-config
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
SIALI-config

jboss-modules-custom
README.md
standalone-okd.xml
standalone.conf

main

/
standalone-okd.xml
standalone-okd.xml

Edit

Contents
History
Compare
Blame

123456789101112131415161718192021222324252627282930313233343536373839
<?xml version='1.0' encoding='UTF-8'?>

<server xmlns="urn:jboss:domain:16.0">
    <extensions>
        <extension module="org.jboss.as.clustering.infinispan"/>
        <extension module="org.jboss.as.connector"/>
        <extension module="org.jboss.as.deployment-scanner"/>
        <extension module="org.jboss.as.ee"/>
        <extension module="org.jboss.as.ejb3"/>
        <extension module="org.jboss.as.jaxrs"/>




acehi esse siale aqui masi esta na esteria acho que nao é ele



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



Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIALI
/
SIALI-4.53.12-SNAPSHOT(3)
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
SIALI

SIALI-4.53.12-SNAPSHOT(3)


EC DES

Succeeded


Pipeline

Tasks

Variables

Logs

Tests
Agent job
Started: 01/10/2026, 17:50:11
Pool:
Release-Linux
·
Agent: cadsvaprlx070.intra.caixa.gov.br

4m 41s

Initialize job
·
succeeded
1s

Pre-job: Download secure file
·
succeeded
1s

Download Artifacts
·
succeeded
1 warning
1s

Exportando as variáveis do arquivo Trust Store
·
succeeded
1s

Valida Variáveis Obrigatórias
·
succeeded
<1s

Recuperando URL Pacote Nexus
·
succeeded
2s

Recupera Pacote
·
succeeded
1s

Recuperando nome do repositório
·
succeeded
1s

Convertendo Minúsculo e Definindo nome do Projeto/Repositório
·
succeeded

<1s

Corrigindo Codificação Arquivos dos2unix
·
succeeded
1s

Alterando Valores placeholders nos arquivos de config
·
succeeded
1s

Git clone https://devops.caixa/projetos/Infraestrutura/_git/esteira-logs
·
succeeded
1s

Cria Streams Graylog
·
succeeded
3s

Recupera VEC
·
succeeded
1s

VEC - Aferição
·
succeeded
1 warning
<1s

Login OpenShift
·
succeeded
1s

Criando arquivo PV
·
succeeded
<1s

Criando Persistente Volume
·
succeeded
2s

Criando arquivo PVC
·
succeeded
<1s

Criando Persistente Volume Claim
·
succeeded
1s

Verificando se o Volume foi configurado corretamente.
·
succeeded
1s

Configurando DeploymentConfig para utilizar o Volume Criado
·
succeeded
1s

Exportando Variáveis de Ambiente "_ENV."
·
succeeded
<1s

Criando novo Projeto
·
succeeded
2s

Adicionando ISTIO_INJECTION
·
skipped


Criando nova APP
·
succeeded
1s

Atualizando Variáveis de Ambiente
·
succeeded
1s

Criando Rota Customizada
·
succeeded
<1s

Aplicando Service Mesh
·
skipped


Excluindo Secret ACcaixav4
·
succeeded
1s

Criando o Secret ACcaixav4
·
succeeded
1s

Excluindo ConfigMap jboss-config
·
succeeded
1s

Excluindo ConfigMap java-config
·
succeeded
1s

Criando o ConfigMap jboss-config
·
succeeded
1s

Criando o ConfigMap java-config
·
succeeded
<1s

Configurando o ConfigMap jboss-config
·
succeeded
1s

Configurando o ConfigMap java-config
·
succeeded
1s

Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
·
succeeded
22s

Concedendo Acesso OKD
·
succeeded
1s

Verificando IP de Saída
·
succeeded
1s

Configurando IP de Saída - deployment
·
skipped


Configurando IP de Saída - deploymentconfig
·
succeeded
1s

Cadastrando no Portal IIF
·
succeeded
1s

Verificando Status do Deployment
·
succeeded
3m 16s

Logs da Aplicação
·
succeeded
1s

Resumo da Release
·
succeeded
1s

Coletando dados da imagem
·
succeeded
2s

Atualizando versão no PortalIF
·
succeeded
<1s

Realizando Logout OKD
·
succeeded
1s

Finalize Job
·
succeeded
<1s
Row 2



siali-des-197-2rr8g
Running


=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss

  JAVA: /usr/lib/jvm/java-11-openjdk-11.0.19.0.7-1.el7_9.x86_64/bin/java

  JAVA_OPTS:  -Xlog:gc*:file="/opt/jboss/standalone/log/gc.log":time,uptimemillis:filecount=5,filesize=3M -Xms512m -Xmx1024m -XX:MetaspaceSize=96M -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar:/opt/jboss/modules/system/layers/base/org/jboss/log4j/logmanager/main/log4j-jboss-logmanager-1.2.0.Final-redhat-00001.jar:/opt/jboss/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Dsun.util.logging.disableCallerCheck=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=siali -Delastic.apm.environment=DES -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=https://apm-server-devops.apps.produtos4.caixa/ -Delastic.apm.global_labels=deployment=siali-des  --add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-exports=jdk.unsupported/sun.misc=ALL-UNNAMED --add-exports=jdk.unsupported/sun.reflect=ALL-UNNAMED --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED

=========================================================================

Oct 01, 2026 5:51:35 PM java.lang.System$LoggerFinder lambda$accessProvider$0
WARNING: Failed to instantiate LoggerFinder provider; Using default.
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-10-01 17:51:36.180 [main] INFO co.elastic.apm.agent.util.JmxUtils - Found JVM-specific OperatingSystemMXBean interface: com.sun.management.OperatingSystemMXBean
2026-10-01 17:51:36.212 [main] INFO co.elastic.apm.agent.configuration.StartupInfo - Starting Elastic APM 1.15.0 as siali on Java 11.0.19 (Red Hat, Inc.) Linux 6.1.18-200.fc37.x86_64
2026-10-01 17:51:36.220 [main] INFO co.elastic.apm.agent.impl.ElasticApmTracer - Tracer switched to RUNNING state
2026-10-01 17:51:36.527 [elastic-apm-server-healthcheck] INFO co.elastic.apm.agent.report.ApmServerHealthChecker - Elastic APM server is available: {  "build_date": "2020-05-12T00:04:54Z",  "build_sha": "64e91c95329991c36b16ff94fd34ea75230c06c2",  "version": "7.7.0"}
2026-10-01 17:51:36.606 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Remote configuration is not available. Check the connection between APM Server and Kibana.
[0m17:51:37,446 INFO  [org.jboss.modules] (main) JBoss Modules version 1.12.0.Final-redhat-00001
[0m[0m17:51:38,110 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.12.Final-redhat-00001
[0m[0m17:51:38,155 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
[0m[0m17:51:38,368 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: JBoss EAP 7.4.11.GA (WildFly Core 15.0.26.Final-redhat-00001) starting
[0m[0m17:51:38,545 INFO  [org.jboss.vfs] (MSC service thread 1-1) VFS000002: Failed to clean existing content for temp file provider of type temp. Enable DEBUG level log to find what caused this
[0mWARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by org.wildfly.extension.elytron.SSLDefinitions (jar:file:/opt/jboss/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.11.CP/org/wildfly/extension/elytron/main/wildfly-elytron-integration-15.0.26.Final-redhat-00001.jar!/) to method com.sun.net.ssl.internal.ssl.Provider.isFIPS()
WARNING: Please consider reporting this to the maintainers of org.wildfly.extension.elytron.SSLDefinitions
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
[0m17:51:40,227 INFO  [org.wildfly.security] (ServerService Thread Pool -- 29) ELY00001: WildFly Elytron version 1.15.16.Final-redhat-00001
[0m[0m17:51:40,543 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 8) WFLYCTL0033: Extension 'security' is deprecated and may not be supported in future versions
[0m[0m17:51:41,023 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=http-interface' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m17:51:41,044 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 4) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/subsystem=undertow/server=default-server/https-listener=https' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
[0m[0m17:51:41,314 INFO  [org.jboss.as.repository] (ServerService Thread Pool -- 21) WFLYDR0001: Content added at location /opt/jboss/standalone/data/content/6c/1ff080e2e0dadb6c6a6b5a577e61803d45c029/content
[0m[0m17:51:41,341 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
[0m[0m17:51:41,423 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 51) WFLYCLINF0001: Activating Infinispan subsystem.
[0m[33m17:51:41,423 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 70) WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
[0m[0m17:51:41,426 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 50) WFLYHEALTH0001: Activating Base Health Subsystem
[0m[0m17:51:41,427 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 62) WFLYNAM0001: Activating Naming Subsystem
[0m[0m17:51:41,428 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 68) WFLYSEC0002: Activating Security Subsystem
[0m[0m17:51:41,434 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 72) WFLYWS0002: Activating WebServices Extension
[0m[0m17:51:41,435 INFO  [org.wildfly.extension.metrics] (ServerService Thread Pool -- 61) WFLYMETRICS0001: Activating Base Metrics Subsystem
[0m[0m17:51:41,510 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 58) WFLYJSF0007: Activated the following Jakarta Server Faces Implementations: [main]
[0m[0m17:51:41,518 INFO  [org.xnio] (MSC service thread 1-2) XNIO version 3.8.9.Final-redhat-00001
[0m[0m17:51:41,525 INFO  [org.jboss.as.security] (MSC service thread 1-4) WFLYSEC0001: Current PicketBox version=5.0.3.Final-redhat-00009
[0m[0m17:51:41,540 INFO  [org.xnio.nio] (MSC service thread 1-2) XNIO NIO Implementation Version 3.8.9.Final-redhat-00001
[0m[0m17:51:41,617 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 52) WFLYIO001: Worker 'default' has auto-configured to 4 IO threads with 32 max task threads based on your 2 available processors
[0m[0m17:51:41,709 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 42) WFLYJCA0004: Deploying JDBC-compliant driver class org.h2.Driver (version 1.4)
[0m[0m17:51:41,723 INFO  [org.jboss.as.connector] (MSC service thread 1-2) WFLYJCA0009: Starting Jakarta Connectors Subsystem (WildFly/IronJacamar 1.5.11.Final-redhat-00001)
[0m[0m17:51:41,806 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0003: Undertow 2.2.24.SP1-redhat-00001 starting
[0m[0m17:51:41,809 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 53) WFLYRS0016: RESTEasy version 3.15.7.Final-redhat-00001
[0m[0m17:51:41,827 INFO  [org.jboss.as.naming] (MSC service thread 1-2) WFLYNAM0003: Starting Naming Service
[0m[0m17:51:41,838 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-4) WFLYJCA0018: Started Driver service with driver-name = h2
[0m[0m17:51:41,843 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-4) WFLYMAIL0001: Bound mail session [java:jboss/mail/Default]
[0m[0m17:51:41,932 INFO  [org.jboss.remoting] (MSC service thread 1-2) JBoss Remoting version 5.0.27.Final-redhat-00001
[0m[0m17:51:42,006 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 42) WFLYJCA0005: Deploying non-JDBC-compliant driver class org.postgresql.Driver (version 42.2)
[0m[0m17:51:42,024 INFO  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0482: Strict pool mdb-strict-max-pool is using a max instance size of 8 (per class), which is derived from the number of CPUs on this host.
[0m[0m17:51:42,024 INFO  [org.jboss.as.ejb3] (MSC service thread 1-4) WFLYEJB0481: Strict pool slsb-strict-max-pool is using a max instance size of 32 (per class), which is derived from thread worker pool sizing.
[0m[0m17:51:42,117 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0018: Started Driver service with driver-name = postgresql
[0m[0m17:51:42,118 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 71) WFLYUT0014: Creating file handler for path '/opt/jboss/welcome-content' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
[0m[33m17:51:42,206 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-1) WFLYELY00023: KeyStore file '/opt/jboss/standalone/configuration/application.keystore' does not exist. Used blank.
[0m[33m17:51:42,312 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-4) WFLYELY01084: KeyStore /opt/jboss/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self-signed certificate for host localhost
[0m[0m17:51:42,340 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-2) WFLYJCA0098: Bound non-transactional data source: java:jboss/datasources/siali-ds
[0m[0m17:51:42,340 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-2) WFLYJCA0098: Bound non-transactional data source: java:jboss/datasources/siico-ds
[0m[0m17:51:42,349 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0012: Started server default-server.
[0m[0m17:51:42,350 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) Queuing requests.
[0m[0m17:51:42,350 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0018: Host default-host starting
[0m[0m17:51:42,409 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0006: Undertow AJP listener ajp listening on 0.0.0.0:8009
[0m[0m17:51:42,409 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0006: Undertow HTTP listener default listening on 0.0.0.0:8080
[0m[0m17:51:42,426 INFO  [org.jboss.as.ejb3] (MSC service thread 1-4) WFLYEJB0493: Jakarta Enterprise Beans subsystem suspension complete
[0m[0m17:51:42,439 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-4) WFLYJCA0001: Bound data source [java:jboss/datasources/ExampleDS]
[0m[0m17:51:42,439 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-4) WFLYJCA0001: Bound data source [java:jboss/datasources/siali-jpa-ds]
[0m[0m17:51:42,723 INFO  [org.jboss.as.patching] (MSC service thread 1-1) WFLYPAT0050: JBoss EAP cumulative patch ID is: base, one-off patches include: none
[0m[33m17:51:42,757 WARN  [org.jboss.as.domain.management.security] (MSC service thread 1-4) WFLYDM0111: Keystore /opt/jboss/standalone/configuration/application.keystore not found, it will be auto generated on first use with a self signed certificate for host localhost
[0m[0m17:51:42,761 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-1) WFLYDS0013: Started FileSystemDeploymentService for directory /opt/jboss/standalone/deployments
[0m[0m17:51:42,769 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0027: Starting deployment of "siali.war" (runtime-name: "siali.war")
[0m[0m17:51:42,813 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0006: Undertow HTTPS listener https listening on 0.0.0.0:8443
[0m[0m17:51:43,024 INFO  [org.jboss.ws.common.management] (MSC service thread 1-2) JBWS022052: Starting JBossWS 5.4.8.Final-redhat-00001 (Apache CXF 3.4.10.redhat-00001) 
[0m[33m17:51:47,192 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0059: Class Path entry jms.jar in /content/siali.war/WEB-INF/lib/com.ibm.mq.allclient-9.3.3.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:51:47,192 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0059: Class Path entry fscontext.jar in /content/siali.war/WEB-INF/lib/com.ibm.mq.allclient-9.3.3.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:51:47,192 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0059: Class Path entry providerutil.jar in /content/siali.war/WEB-INF/lib/com.ibm.mq.allclient-9.3.3.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:51:47,192 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0059: Class Path entry bcpkix-jdk15to18.jar in /content/siali.war/WEB-INF/lib/com.ibm.mq.allclient-9.3.3.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:51:47,192 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0059: Class Path entry bcprov-jdk15to18.jar in /content/siali.war/WEB-INF/lib/com.ibm.mq.allclient-9.3.3.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:51:47,193 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0059: Class Path entry bcutil-jdk15to18.jar in /content/siali.war/WEB-INF/lib/com.ibm.mq.allclient-9.3.3.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:51:47,193 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0059: Class Path entry org.json.jar in /content/siali.war/WEB-INF/lib/com.ibm.mq.allclient-9.3.3.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:51:47,193 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0059: Class Path entry jackson-annotations.jar in /content/siali.war/WEB-INF/lib/com.ibm.mq.allclient-9.3.3.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:51:47,193 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0059: Class Path entry jackson-core.jar in /content/siali.war/WEB-INF/lib/com.ibm.mq.allclient-9.3.3.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:51:47,193 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0059: Class Path entry jackson-databind.jar in /content/siali.war/WEB-INF/lib/com.ibm.mq.allclient-9.3.3.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:51:47,332 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0059: Class Path entry lib/gson-2.2.4.jar in /content/siali.war/WEB-INF/lib/loginx-4.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:51:47,333 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0059: Class Path entry lib/jldap-4.3.jar in /content/siali.war/WEB-INF/lib/loginx-4.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:51:47,333 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0059: Class Path entry lib/xstream-1.4.4.jar in /content/siali.war/WEB-INF/lib/loginx-4.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:51:47,333 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0059: Class Path entry lib/xmlpull-1.1.3.1.jar in /content/siali.war/WEB-INF/lib/loginx-4.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:51:47,333 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0059: Class Path entry lib/jopt-simple-4.5.jar in /content/siali.war/WEB-INF/lib/loginx-4.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:51:47,333 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0059: Class Path entry lib/log4j-1.2.17.jar in /content/siali.war/WEB-INF/lib/loginx-4.1.jar  does not point to a valid jar for a Class-Path reference.
[0m[33m17:51:47,466 WARN  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0119: [Enterprise Beans 3.1 spec, section 4.9.2] Session bean implementation class MUST be public, not abstract and not final - br.gov.caixa.siali.model.service.ValidacaoService won't be considered as a session bean, since it doesn't meet that requirement
[0m[0m17:51:47,692 INFO  [org.jboss.as.jpa] (MSC service thread 1-4) WFLYJPA0002: Read persistence.xml for SialiPU
[0m[0m17:51:48,391 INFO  [org.jipijapa] (MSC service thread 1-4) JIPIORMV53020253: Second level cache enabled for siali.war#SialiPU
[0m[0m17:51:48,913 INFO  [org.jboss.keycloak] (MSC service thread 1-1) Keycloak subsystem override for deployment siali.war
[0m[0m17:51:48,914 INFO  [org.jboss.weld.deployer] (MSC service thread 1-1) WFLYWELD0003: Processing weld deployment siali.war
[0m[0m17:51:49,166 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-1) HV000001: Hibernate Validator 6.0.23.Final-redhat-00001
[0m[0m17:51:49,348 INFO  [org.infinispan.CONTAINER] (ServerService Thread Pool -- 74) ISPN000128: Infinispan version: Infinispan 'Corona Extra' 11.0.17.Final-redhat-00001
[0m[0m17:51:49,433 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 74) WFLYJPA0010: Starting Persistence Unit (phase 1 of 2) Service 'siali.war#SialiPU'
[0m[0m17:51:49,457 INFO  [org.hibernate.jpa.internal.util.LogHelper] (ServerService Thread Pool -- 74) HHH000204: Processing PersistenceUnitInfo [
	name: SialiPU
	...]
[0m[0m17:51:49,523 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ScheduleSiacc' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ScheduleSiacc!br.gov.caixa.siali.model.scheduler.ScheduleSiacc
	java:app/siali/ScheduleSiacc!br.gov.caixa.siali.model.scheduler.ScheduleSiacc
	java:module/ScheduleSiacc!br.gov.caixa.siali.model.scheduler.ScheduleSiacc
	java:global/siali/ScheduleSiacc
	java:app/siali/ScheduleSiacc
	java:module/ScheduleSiacc

[0m[0m17:51:49,524 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ImportacaoRetornoFinanceiroProcess' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ImportacaoRetornoFinanceiroProcess!br.gov.caixa.siali.model.scheduler.ImportacaoRetornoFinanceiroService
	java:app/siali/ImportacaoRetornoFinanceiroProcess!br.gov.caixa.siali.model.scheduler.ImportacaoRetornoFinanceiroService
	java:module/ImportacaoRetornoFinanceiroProcess!br.gov.caixa.siali.model.scheduler.ImportacaoRetornoFinanceiroService
	java:global/siali/ImportacaoRetornoFinanceiroProcess
	java:app/siali/ImportacaoRetornoFinanceiroProcess
	java:module/ImportacaoRetornoFinanceiroProcess

[0m[0m17:51:49,524 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AdministradoraServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/AdministradoraServiceImpl!br.gov.caixa.siali.model.service.AdministradoraService
	java:app/siali/AdministradoraServiceImpl!br.gov.caixa.siali.model.service.AdministradoraService
	java:module/AdministradoraServiceImpl!br.gov.caixa.siali.model.service.AdministradoraService
	java:global/siali/AdministradoraServiceImpl
	java:app/siali/AdministradoraServiceImpl
	java:module/AdministradoraServiceImpl

[0m[0m17:51:49,524 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TarifaServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/TarifaServiceImpl!br.gov.caixa.siali.model.service.TarifaService
	java:app/siali/TarifaServiceImpl!br.gov.caixa.siali.model.service.TarifaService
	java:module/TarifaServiceImpl!br.gov.caixa.siali.model.service.TarifaService
	java:global/siali/TarifaServiceImpl
	java:app/siali/TarifaServiceImpl
	java:module/TarifaServiceImpl

[0m[0m17:51:49,524 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TarefaAgendadaServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/TarefaAgendadaServiceImpl!br.gov.caixa.siali.model.service.TarefaAgendadaService
	java:app/siali/TarefaAgendadaServiceImpl!br.gov.caixa.siali.model.service.TarefaAgendadaService
	java:module/TarefaAgendadaServiceImpl!br.gov.caixa.siali.model.service.TarefaAgendadaService
	java:global/siali/TarefaAgendadaServiceImpl
	java:app/siali/TarefaAgendadaServiceImpl
	java:module/TarefaAgendadaServiceImpl

[0m[0m17:51:49,524 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'PropostaServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/PropostaServiceImpl!br.gov.caixa.siali.model.service.PropostaService
	java:app/siali/PropostaServiceImpl!br.gov.caixa.siali.model.service.PropostaService
	java:module/PropostaServiceImpl!br.gov.caixa.siali.model.service.PropostaService
	java:global/siali/PropostaServiceImpl
	java:app/siali/PropostaServiceImpl
	java:module/PropostaServiceImpl

[0m[0m17:51:49,524 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'GestorPerfilServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/GestorPerfilServiceImpl!br.gov.caixa.gestorperfis.model.service.GestorPerfilService
	java:app/siali/GestorPerfilServiceImpl!br.gov.caixa.gestorperfis.model.service.GestorPerfilService
	java:module/GestorPerfilServiceImpl!br.gov.caixa.gestorperfis.model.service.GestorPerfilService
	java:global/siali/GestorPerfilServiceImpl
	java:app/siali/GestorPerfilServiceImpl
	java:module/GestorPerfilServiceImpl

[0m[0m17:51:49,524 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'EventoAuditoriaServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/EventoAuditoriaServiceImpl!br.gov.caixa.siali.auditoria.model.service.EventoAuditoriaService
	java:app/siali/EventoAuditoriaServiceImpl!br.gov.caixa.siali.auditoria.model.service.EventoAuditoriaService
	java:module/EventoAuditoriaServiceImpl!br.gov.caixa.siali.auditoria.model.service.EventoAuditoriaService
	java:global/siali/EventoAuditoriaServiceImpl
	java:app/siali/EventoAuditoriaServiceImpl
	java:module/EventoAuditoriaServiceImpl

[0m[0m17:51:49,525 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AuditoriaProcessamentoMPASServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/AuditoriaProcessamentoMPASServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaProcessamentoMPASService
	java:app/siali/AuditoriaProcessamentoMPASServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaProcessamentoMPASService
	java:module/AuditoriaProcessamentoMPASServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaProcessamentoMPASService
	java:global/siali/AuditoriaProcessamentoMPASServiceImpl
	java:app/siali/AuditoriaProcessamentoMPASServiceImpl
	java:module/AuditoriaProcessamentoMPASServiceImpl

[0m[0m17:51:49,525 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ContratoServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ContratoServiceImpl!br.gov.caixa.siali.model.service.ContratoService
	java:app/siali/ContratoServiceImpl!br.gov.caixa.siali.model.service.ContratoService
	java:module/ContratoServiceImpl!br.gov.caixa.siali.model.service.ContratoService
	java:global/siali/ContratoServiceImpl
	java:app/siali/ContratoServiceImpl
	java:module/ContratoServiceImpl

[0m[0m17:51:49,525 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TrilhaServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/TrilhaServiceImpl!br.gov.caixa.siali.model.service.TrilhaService
	java:app/siali/TrilhaServiceImpl!br.gov.caixa.siali.model.service.TrilhaService
	java:module/TrilhaServiceImpl!br.gov.caixa.siali.model.service.TrilhaService
	java:global/siali/TrilhaServiceImpl
	java:app/siali/TrilhaServiceImpl
	java:module/TrilhaServiceImpl

[0m[0m17:51:49,525 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ExportacaoGECRMProcess' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ExportacaoGECRMProcess!br.gov.caixa.siali.ExportacaoGECRMProcess
	java:app/siali/ExportacaoGECRMProcess!br.gov.caixa.siali.ExportacaoGECRMProcess
	java:module/ExportacaoGECRMProcess!br.gov.caixa.siali.ExportacaoGECRMProcess
	java:global/siali/ExportacaoGECRMProcess
	java:app/siali/ExportacaoGECRMProcess
	java:module/ExportacaoGECRMProcess

[0m[0m17:51:49,525 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AuditoriaServiceFactory' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/AuditoriaServiceFactory!br.gov.caixa.siali.auditoria.model.factory.AuditoriaServiceFactory
	java:app/siali/AuditoriaServiceFactory!br.gov.caixa.siali.auditoria.model.factory.AuditoriaServiceFactory
	java:module/AuditoriaServiceFactory!br.gov.caixa.siali.auditoria.model.factory.AuditoriaServiceFactory
	java:global/siali/AuditoriaServiceFactory
	java:app/siali/AuditoriaServiceFactory
	java:module/AuditoriaServiceFactory

[0m[0m17:51:49,525 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AuditoriaPoliticaRemuneracaoFaixaFaturamentoServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/AuditoriaPoliticaRemuneracaoFaixaFaturamentoServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaPoliticaRemuneracaoFaixaFaturamentoService
	java:app/siali/AuditoriaPoliticaRemuneracaoFaixaFaturamentoServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaPoliticaRemuneracaoFaixaFaturamentoService
	java:module/AuditoriaPoliticaRemuneracaoFaixaFaturamentoServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaPoliticaRemuneracaoFaixaFaturamentoService
	java:global/siali/AuditoriaPoliticaRemuneracaoFaixaFaturamentoServiceImpl
	java:app/siali/AuditoriaPoliticaRemuneracaoFaixaFaturamentoServiceImpl
	java:module/AuditoriaPoliticaRemuneracaoFaixaFaturamentoServiceImpl

[0m[0m17:51:49,525 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ExpurgoLgpdProcess' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ExpurgoLgpdProcess!br.gov.caixa.siali.model.scheduler.ExpurgoLgpdService
	java:app/siali/ExpurgoLgpdProcess!br.gov.caixa.siali.model.scheduler.ExpurgoLgpdService
	java:module/ExpurgoLgpdProcess!br.gov.caixa.siali.model.scheduler.ExpurgoLgpdService
	java:global/siali/ExpurgoLgpdProcess
	java:app/siali/ExpurgoLgpdProcess
	java:module/ExpurgoLgpdProcess

[0m[0m17:51:49,525 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'TipoEmpresaServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/TipoEmpresaServiceImpl!br.gov.caixa.siali.model.service.TipoEmpresaService
	java:app/siali/TipoEmpresaServiceImpl!br.gov.caixa.siali.model.service.TipoEmpresaService
	java:module/TipoEmpresaServiceImpl!br.gov.caixa.siali.model.service.TipoEmpresaService
	java:global/siali/TipoEmpresaServiceImpl
	java:app/siali/TipoEmpresaServiceImpl
	java:module/TipoEmpresaServiceImpl

[0m[0m17:51:49,525 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ScheduleExpurgoLGPD' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ScheduleExpurgoLGPD!br.gov.caixa.siali.model.scheduler.ScheduleExpurgoLGPD
	java:app/siali/ScheduleExpurgoLGPD!br.gov.caixa.siali.model.scheduler.ScheduleExpurgoLGPD
	java:module/ScheduleExpurgoLGPD!br.gov.caixa.siali.model.scheduler.ScheduleExpurgoLGPD
	java:global/siali/ScheduleExpurgoLGPD
	java:app/siali/ScheduleExpurgoLGPD
	java:module/ScheduleExpurgoLGPD

[0m[0m17:51:49,525 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ExportacaoGecalVendasProcess' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ExportacaoGecalVendasProcess!br.gov.caixa.siali.ExportacaoGecalVendasProcess
	java:app/siali/ExportacaoGecalVendasProcess!br.gov.caixa.siali.ExportacaoGecalVendasProcess
	java:module/ExportacaoGecalVendasProcess!br.gov.caixa.siali.ExportacaoGecalVendasProcess
	java:global/siali/ExportacaoGecalVendasProcess
	java:app/siali/ExportacaoGecalVendasProcess
	java:module/ExportacaoGecalVendasProcess

[0m[0m17:51:49,525 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AtualizaTabelaErrosProcess' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/AtualizaTabelaErrosProcess!br.gov.caixa.siali.model.scheduler.AtualizaTabelaErrosService
	java:app/siali/AtualizaTabelaErrosProcess!br.gov.caixa.siali.model.scheduler.AtualizaTabelaErrosService
	java:module/AtualizaTabelaErrosProcess!br.gov.caixa.siali.model.scheduler.AtualizaTabelaErrosService
	java:global/siali/AtualizaTabelaErrosProcess
	java:app/siali/AtualizaTabelaErrosProcess
	java:module/AtualizaTabelaErrosProcess

[0m[0m17:51:49,525 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AtesteFinanceiroServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/AtesteFinanceiroServiceImpl!br.gov.caixa.siali.model.service.AtesteFinanceiroService
	java:app/siali/AtesteFinanceiroServiceImpl!br.gov.caixa.siali.model.service.AtesteFinanceiroService
	java:module/AtesteFinanceiroServiceImpl!br.gov.caixa.siali.model.service.AtesteFinanceiroService
	java:global/siali/AtesteFinanceiroServiceImpl
	java:app/siali/AtesteFinanceiroServiceImpl
	java:module/AtesteFinanceiroServiceImpl

[0m[0m17:51:49,525 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AuditoriaGerarSidemServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/AuditoriaGerarSidemServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaGerarSidemService
	java:app/siali/AuditoriaGerarSidemServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaGerarSidemService
	java:module/AuditoriaGerarSidemServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaGerarSidemService
	java:global/siali/AuditoriaGerarSidemServiceImpl
	java:app/siali/AuditoriaGerarSidemServiceImpl
	java:module/AuditoriaGerarSidemServiceImpl

[0m[0m17:51:49,526 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'FuncaoServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/FuncaoServiceImpl!br.gov.caixa.siico.model.service.FuncaoService
	java:app/siali/FuncaoServiceImpl!br.gov.caixa.siico.model.service.FuncaoService
	java:module/FuncaoServiceImpl!br.gov.caixa.siico.model.service.FuncaoService
	java:global/siali/FuncaoServiceImpl
	java:app/siali/FuncaoServiceImpl
	java:module/FuncaoServiceImpl

[0m[0m17:51:49,526 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ExportacaoSidemProcess' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ExportacaoSidemProcess!br.gov.caixa.siali.ExportacaoSidemProcess
	java:app/siali/ExportacaoSidemProcess!br.gov.caixa.siali.ExportacaoSidemProcess
	java:module/ExportacaoSidemProcess!br.gov.caixa.siali.ExportacaoSidemProcess
	java:global/siali/ExportacaoSidemProcess
	java:app/siali/ExportacaoSidemProcess
	java:module/ExportacaoSidemProcess

[0m[0m17:51:49,526 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ScheduleMVR' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ScheduleMVR!br.gov.caixa.siali.model.scheduler.ScheduleMVR
	java:app/siali/ScheduleMVR!br.gov.caixa.siali.model.scheduler.ScheduleMVR
	java:module/ScheduleMVR!br.gov.caixa.siali.model.scheduler.ScheduleMVR
	java:global/siali/ScheduleMVR
	java:app/siali/ScheduleMVR
	java:module/ScheduleMVR

[0m[0m17:51:49,526 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ScheduleATVR' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ScheduleATVR!br.gov.caixa.siali.model.scheduler.ScheduleATVR
	java:app/siali/ScheduleATVR!br.gov.caixa.siali.model.scheduler.ScheduleATVR
	java:module/ScheduleATVR!br.gov.caixa.siali.model.scheduler.ScheduleATVR
	java:global/siali/ScheduleATVR
	java:app/siali/ScheduleATVR
	java:module/ScheduleATVR

[0m[0m17:51:49,526 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'GestaoMatrizAcessoServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/GestaoMatrizAcessoServiceImpl!br.gov.caixa.siali.model.service.GestaoMatrizAcessoService
	java:app/siali/GestaoMatrizAcessoServiceImpl!br.gov.caixa.siali.model.service.GestaoMatrizAcessoService
	java:module/GestaoMatrizAcessoServiceImpl!br.gov.caixa.siali.model.service.GestaoMatrizAcessoService
	java:global/siali/GestaoMatrizAcessoServiceImpl
	java:app/siali/GestaoMatrizAcessoServiceImpl
	java:module/GestaoMatrizAcessoServiceImpl

[0m[0m17:51:49,526 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ScheduleMmf' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ScheduleMmf!br.gov.caixa.siali.model.scheduler.ScheduleMmf
	java:app/siali/ScheduleMmf!br.gov.caixa.siali.model.scheduler.ScheduleMmf
	java:module/ScheduleMmf!br.gov.caixa.siali.model.scheduler.ScheduleMmf
	java:global/siali/ScheduleMmf
	java:app/siali/ScheduleMmf
	java:module/ScheduleMmf

[0m[0m17:51:49,526 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'SinafAgendamentoServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/SinafAgendamentoServiceImpl!br.gov.caixa.siali.model.scheduler.SinafAgendamentoService
	java:app/siali/SinafAgendamentoServiceImpl!br.gov.caixa.siali.model.scheduler.SinafAgendamentoService
	java:module/SinafAgendamentoServiceImpl!br.gov.caixa.siali.model.scheduler.SinafAgendamentoService
	java:global/siali/SinafAgendamentoServiceImpl
	java:app/siali/SinafAgendamentoServiceImpl
	java:module/SinafAgendamentoServiceImpl

[0m[0m17:51:49,526 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AuditoriaPropostaServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/AuditoriaPropostaServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaPropostaService
	java:app/siali/AuditoriaPropostaServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaPropostaService
	java:module/AuditoriaPropostaServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaPropostaService
	java:global/siali/AuditoriaPropostaServiceImpl
	java:app/siali/AuditoriaPropostaServiceImpl
	java:module/AuditoriaPropostaServiceImpl

[0m[0m17:51:49,526 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'FeriadoServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/FeriadoServiceImpl!br.gov.caixa.siico.model.service.FeriadoService
	java:app/siali/FeriadoServiceImpl!br.gov.caixa.siico.model.service.FeriadoService
	java:module/FeriadoServiceImpl!br.gov.caixa.siico.model.service.FeriadoService
	java:global/siali/FeriadoServiceImpl
	java:app/siali/FeriadoServiceImpl
	java:module/FeriadoServiceImpl

[0m[0m17:51:49,526 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'DocumentoAjudaServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/DocumentoAjudaServiceImpl!br.gov.caixa.siali.model.service.DocumentoAjudaService
	java:app/siali/DocumentoAjudaServiceImpl!br.gov.caixa.siali.model.service.DocumentoAjudaService
	java:module/DocumentoAjudaServiceImpl!br.gov.caixa.siali.model.service.DocumentoAjudaService
	java:global/siali/DocumentoAjudaServiceImpl
	java:app/siali/DocumentoAjudaServiceImpl
	java:module/DocumentoAjudaServiceImpl

[0m[0m17:51:49,526 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ResumoDebitoMesCaixaServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ResumoDebitoMesCaixaServiceImpl!br.gov.caixa.siali.model.service.ResumoDebitoMesCaixaService
	java:app/siali/ResumoDebitoMesCaixaServiceImpl!br.gov.caixa.siali.model.service.ResumoDebitoMesCaixaService
	java:module/ResumoDebitoMesCaixaServiceImpl!br.gov.caixa.siali.model.service.ResumoDebitoMesCaixaService
	java:global/siali/ResumoDebitoMesCaixaServiceImpl
	java:app/siali/ResumoDebitoMesCaixaServiceImpl
	java:module/ResumoDebitoMesCaixaServiceImpl

[0m[0m17:51:49,527 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ScheduleSinaf' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ScheduleSinaf!br.gov.caixa.siali.model.scheduler.ScheduleSinaf
	java:app/siali/ScheduleSinaf!br.gov.caixa.siali.model.scheduler.ScheduleSinaf
	java:module/ScheduleSinaf!br.gov.caixa.siali.model.scheduler.ScheduleSinaf
	java:global/siali/ScheduleSinaf
	java:app/siali/ScheduleSinaf
	java:module/ScheduleSinaf

[0m[0m17:51:49,527 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ClausulaContratoServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ClausulaContratoServiceImpl!br.gov.caixa.siali.model.service.ClausulaContratoService
	java:app/siali/ClausulaContratoServiceImpl!br.gov.caixa.siali.model.service.ClausulaContratoService
	java:module/ClausulaContratoServiceImpl!br.gov.caixa.siali.model.service.ClausulaContratoService
	java:global/siali/ClausulaContratoServiceImpl
	java:app/siali/ClausulaContratoServiceImpl
	java:module/ClausulaContratoServiceImpl

[0m[0m17:51:49,527 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'AuditoriaTarifaBalcaoServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/AuditoriaTarifaBalcaoServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaTarifaBalcaoService
	java:app/siali/AuditoriaTarifaBalcaoServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaTarifaBalcaoService
	java:module/AuditoriaTarifaBalcaoServiceImpl!br.gov.caixa.siali.auditoria.model.service.AuditoriaTarifaBalcaoService
	java:global/siali/AuditoriaTarifaBalcaoServiceImpl
	java:app/siali/AuditoriaTarifaBalcaoServiceImpl
	java:module/AuditoriaTarifaBalcaoServiceImpl

[0m[0m17:51:49,527 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'MatrizAcessoProcess' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/MatrizAcessoProcess!br.gov.caixa.siali.model.scheduler.ProcessamentoMatrizAcessoService
	java:app/siali/MatrizAcessoProcess!br.gov.caixa.siali.model.scheduler.ProcessamentoMatrizAcessoService
	java:module/MatrizAcessoProcess!br.gov.caixa.siali.model.scheduler.ProcessamentoMatrizAcessoService
	java:global/siali/MatrizAcessoProcess
	java:app/siali/MatrizAcessoProcess
	java:module/MatrizAcessoProcess

[0m[0m17:51:49,527 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ImportacaoRetornoCartaoProcess' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ImportacaoRetornoCartaoProcess!br.gov.caixa.siali.model.scheduler.ImportacaoCartoesAtivadosService
	java:app/siali/ImportacaoRetornoCartaoProcess!br.gov.caixa.siali.model.scheduler.ImportacaoCartoesAtivadosService
	java:module/ImportacaoRetornoCartaoProcess!br.gov.caixa.siali.model.scheduler.ImportacaoCartoesAtivadosService
	java:global/siali/ImportacaoRetornoCartaoProcess
	java:app/siali/ImportacaoRetornoCartaoProcess
	java:module/ImportacaoRetornoCartaoProcess

[0m[0m17:51:49,527 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'DebitoAgendamentoServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/DebitoAgendamentoServiceImpl!br.gov.caixa.siali.model.scheduler.DebitoAgendamentoService
	java:app/siali/DebitoAgendamentoServiceImpl!br.gov.caixa.siali.model.scheduler.DebitoAgendamentoService
	java:module/DebitoAgendamentoServiceImpl!br.gov.caixa.siali.model.scheduler.DebitoAgendamentoService
	java:global/siali/DebitoAgendamentoServiceImpl
	java:app/siali/DebitoAgendamentoServiceImpl
	java:module/DebitoAgendamentoServiceImpl

[0m[0m17:51:49,527 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ScheduleAtualizaTabelaErros' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ScheduleAtualizaTabelaErros!br.gov.caixa.siali.model.scheduler.ScheduleAtualizaTabelaErros
	java:app/siali/ScheduleAtualizaTabelaErros!br.gov.caixa.siali.model.scheduler.ScheduleAtualizaTabelaErros
	java:module/ScheduleAtualizaTabelaErros!br.gov.caixa.siali.model.scheduler.ScheduleAtualizaTabelaErros
	java:global/siali/ScheduleAtualizaTabelaErros
	java:app/siali/ScheduleAtualizaTabelaErros
	java:module/ScheduleAtualizaTabelaErros

[0m[0m17:51:49,527 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ErroAdministradoraServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ErroAdministradoraServiceImpl!br.gov.caixa.siali.model.service.ErroAdministradoraService
	java:app/siali/ErroAdministradoraServiceImpl!br.gov.caixa.siali.model.service.ErroAdministradoraService
	java:module/ErroAdministradoraServiceImpl!br.gov.caixa.siali.model.service.ErroAdministradoraService
	java:global/siali/ErroAdministradoraServiceImpl
	java:app/siali/ErroAdministradoraServiceImpl
	java:module/ErroAdministradoraServiceImpl

[0m[0m17:51:49,527 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'ScheduleSigcb' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/ScheduleSigcb!br.gov.caixa.siali.model.scheduler.ScheduleSigcb
	java:app/siali/ScheduleSigcb!br.gov.caixa.siali.model.scheduler.ScheduleSigcb
	java:module/ScheduleSigcb!br.gov.caixa.siali.model.scheduler.ScheduleSigcb
	java:global/siali/ScheduleSigcb
	java:app/siali/ScheduleSigcb
	java:module/ScheduleSigcb

[0m[0m17:51:49,527 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'GestaoPropostaServiceImpl' in deployment unit 'deployment "siali.war"' are as follows:

	java:global/siali/GestaoPropostaServiceImpl!br.gov.caixa.siali.model.service.GestaoPropostaService
	java:app/siali/GestaoPropostaServiceImpl!br.gov.caixa.siali.model.service.GestaoPropostaService
	java:module/GestaoPropostaServiceImpl!br.gov.caixa.siali.model.service.GestaoPropostaService
	java:global/siali/GestaoPropostaServiceImpl
	java:app/siali/GestaoPropostaServiceImpl
	java:module/GestaoPropostaServiceImpl

[0m[0m17:51:49,527 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: JNDI bindings for session bean named 'RetornoFinanceiroAdministradoraServiceImpl' in deployment unit 'deployment "siali.war"' are as foll
