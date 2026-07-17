-sh-4.2$ oc get cm jboss-config-sihdg-jboss8 -n sihdg-des -o yaml
apiVersion: v1
data:
  standalone-okd.xml: "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n\n<server xmlns=\"urn:jboss:domain:20.0\">\n
    \   <extensions>\n        <extension module=\"org.jboss.as.clustering.infinispan\"/>\n
    \       <extension module=\"org.jboss.as.connector\"/>\n        <extension module=\"org.jboss.as.deployment-scanner\"/>\n
    \       <extension module=\"org.jboss.as.ee\"/>\n        <extension module=\"org.jboss.as.ejb3\"/>\n
    \       <extension module=\"org.jboss.as.jaxrs\"/>\n        <extension module=\"org.jboss.as.jdr\"/>\n
    \       <extension module=\"org.jboss.as.jmx\"/>\n        <extension module=\"org.jboss.as.jpa\"/>\n
    \       <extension module=\"org.jboss.as.jsf\"/>\n        <extension module=\"org.jboss.as.logging\"/>\n
    \       <extension module=\"org.jboss.as.mail\"/>\n        <extension module=\"org.jboss.as.naming\"/>\n
    \       <extension module=\"org.jboss.as.pojo\"/>\n        <extension module=\"org.jboss.as.remoting\"/>\n
    \       <extension module=\"org.jboss.as.sar\"/>\n        <extension module=\"org.jboss.as.transactions\"/>\n
    \       <extension module=\"org.jboss.as.webservices\"/>\n        <extension module=\"org.jboss.as.weld\"/>\n
    \       <extension module=\"org.wildfly.extension.batch.jberet\"/>\n        <extension
    module=\"org.wildfly.extension.bean-validation\"/>\n        <extension module=\"org.wildfly.extension.core-management\"/>\n
    \       <extension module=\"org.wildfly.extension.discovery\"/>\n        <extension
    module=\"org.wildfly.extension.ee-security\"/>\n        <extension module=\"org.wildfly.extension.elytron\"/>\n
    \       <extension module=\"org.wildfly.extension.elytron-oidc-client\"/>\n        <extension
    module=\"org.wildfly.extension.health\"/>\n        <extension module=\"org.wildfly.extension.io\"/>\n
    \       <extension module=\"org.wildfly.extension.metrics\"/>\n        <extension
    module=\"org.wildfly.extension.request-controller\"/>\n        <extension module=\"org.wildfly.extension.security.manager\"/>\n
    \       <extension module=\"org.wildfly.extension.undertow\"/>\n    </extensions>\n
    \   <system-properties>\n        <property name=\"br.gov.caixa.sisgr.auth.url\"
    value=\"https://webservice.acessoseguro.des.corerj.caixa/sisgrauth-web/\"/>\n
    \       <property name=\"url_key_cloack\" value=\"https://login.des.caixa/auth\"/>\n
    \       <property name=\"url_key_cloack_realm\" value=\"intranet\"/>\n        <property
    name=\"url_sisgr\" value=\"https://webservice.acessoseguro.sso.des.intra.corerj.caixa/sisgrauth-web/v1/\"/>\n
    \       <property name=\"url_siico\" value=\"http://des.web.corerj.caixa:8642/siicorjapi/v1/\"/>\n
    \       <property name=\"url_siaud_execucao\" value=\"http://localhost:8898/siaud\"/>\n
    \       <property name=\"url_siaud_planejamento\" value=\"http://localhost:8898/siaud\"/>\n
    \       <property name=\"url_siaud_acompanhamento\" value=\"http://localhost:8888/siaud/siaud-acompanhamento-service\"/>\n
    \       <property name=\"url_siaud_acompanhamentoweb\" value=\"http://localhost:8888/siaud/acompanhamento\"/>\n
    \       <property name=\"javax.net.ssl.trustStore\" value=\"C:\\CAIXA\\certs\\truststore-logincaixa.jks\"/>\n
    \       <property name=\"javax.net.ssl.trustStorePassword\" value=\"changeit\"/>\n
    \       <property name=\"javax.net.ssl.trustStoreType\" value=\"jks\"/>\n        <property
    name=\"siaud.INT_URL_API_MANAGER\" value=\"http://des.web.corerj.caixa:8642/\"/>\n
    \       <property name=\"siaud.int.siico.api.key\" value=\"l75b3690bee55a4994a4efb88fe248b4d9\"/>\n
    \       <property name=\"siaud.int.url.api.manager\" value=\"http://api.des.caixa:8080/\"/>\n
    \       <property name=\"siaud.int.url.legado\" value=\"https://des.web.corerj.caixa:8605/siaud/\"/>\n
    \   </system-properties>\n    <management>\n        <audit-log>\n            <formatters>\n
    \               <json-formatter name=\"json-formatter\"/>\n            </formatters>\n
    \           <handlers>\n                <file-handler name=\"file\" formatter=\"json-formatter\"
    path=\"audit-log.log\" relative-to=\"jboss.server.data.dir\"/>\n            </handlers>\n
    \           <logger log-boot=\"true\" log-read-only=\"false\" enabled=\"false\">\n
    \               <handlers>\n                    <handler name=\"file\"/>\n                </handlers>\n
    \           </logger>\n        </audit-log>\n        <management-interfaces>\n
    \           <http-interface http-authentication-factory=\"migration-defaultManagementHttpAuthenticationFactory\">\n
    \               <http-upgrade enabled=\"true\" sasl-authentication-factory=\"migration-defaultManagementSaslAuthenticationFactory\"/>\n
    \               <socket-binding http=\"management-http\"/>\n            </http-interface>\n
    \       </management-interfaces>\n        <access-control provider=\"simple\">\n
    \           <role-mapping>\n                <role name=\"SuperUser\">\n                    <include>\n
    \                       <user name=\"$local\"/>\n                    </include>\n
    \               </role>\n            </role-mapping>\n        </access-control>\n
    \   </management>\n    <profile>\n        <subsystem xmlns=\"urn:jboss:domain:logging:8.0\">\n
    \           <console-handler name=\"CONSOLE\">\n                <level name=\"INFO\"/>\n
    \               <formatter>\n                    <named-formatter name=\"COLOR-PATTERN\"/>\n
    \               </formatter>\n            </console-handler>\n            <periodic-rotating-file-handler
    name=\"FILE\" autoflush=\"true\">\n                <formatter>\n                    <named-formatter
    name=\"PATTERN\"/>\n                </formatter>\n                <file relative-to=\"jboss.server.log.dir\"
    path=\"server.log\"/>\n                <suffix value=\".yyyy-MM-dd\"/>\n                <append
    value=\"true\"/>\n            </periodic-rotating-file-handler>\n            <logger
    category=\"com.arjuna\">\n                <level name=\"WARN\"/>\n            </logger>\n
    \           <logger category=\"org.jboss.as.config\">\n                <level
    name=\"DEBUG\"/>\n            </logger>\n            <logger category=\"sun.rmi\">\n
    \               <level name=\"WARN\"/>\n            </logger>\n            <root-logger>\n
    \               <level name=\"INFO\"/>\n                <handlers>\n                    <handler
    name=\"CONSOLE\"/>\n                    <handler name=\"FILE\"/>\n                </handlers>\n
    \           </root-logger>\n            <formatter name=\"PATTERN\">\n                <pattern-formatter
    pattern=\"%d{yyyy-MM-dd HH:mm:ss,SSS} %-5p [%c] (%t) %s%e%n\"/>\n            </formatter>\n
    \           <formatter name=\"COLOR-PATTERN\">\n                <pattern-formatter
    pattern=\"%K{level}%d{HH:mm:ss,SSS} %-5p [%c] (%t) %s%e%n\"/>\n            </formatter>\n
    \       </subsystem>\n        <subsystem xmlns=\"urn:jboss:domain:batch-jberet:3.0\">\n
    \           <default-job-repository name=\"in-memory\"/>\n            <default-thread-pool
    name=\"batch\"/>\n            <job-repository name=\"in-memory\">\n                <in-memory/>\n
    \           </job-repository>\n            <thread-pool name=\"batch\">\n                <max-threads
    count=\"10\"/>\n                <keepalive-time time=\"30\" unit=\"seconds\"/>\n
    \           </thread-pool>\n        </subsystem>\n        <subsystem xmlns=\"urn:jboss:domain:bean-validation:1.0\"/>\n
    \       <subsystem xmlns=\"urn:jboss:domain:core-management:1.0\"/>\n        <subsystem
    xmlns=\"urn:jboss:domain:datasources:7.0\">\n            <datasources>\n                <datasource
    jta=\"true\" jndi-name=\"java:jboss/datasources/ExampleDS\" pool-name=\"sihdgDS\"
    enabled=\"true\" use-ccm=\"true\">\n                    <connection-url>DATASOURCE_CONNECTION_URL</connection-url>\n
    \                   <driver-class>com.microsoft.sqlserver.jdbc.SQLServerDriver</driver-class>\n
    \                   <driver>sqlserver</driver>\n                    <security>\n
    \                       <user-name>DATASOURCE_USER_NAME</user-name>\n                        <password>DATASOURCE_PASSWORD</password>\n
    \                   </security>\n                    <validation>\n                        <valid-connection-checker
    class-name=\"org.jboss.jca.adapters.jdbc.extensions.mssql.MSSQLValidConnectionChecker\"/>\n
    \                       <background-validation>true</background-validation>\n
    \                   </validation>\n                </datasource>\n                <drivers>\n
    \                   <driver name=\"sqlserver\" module=\"com.microsoft.sqlserver.jdbc\">\n
    \                       <driver-class>com.microsoft.sqlserver.jdbc.SQLServerDriver</driver-class>\n
    \                   </driver>\t\t\t\t\t\n                </drivers>\n            </datasources>\n
    \       </subsystem>\n        <subsystem xmlns=\"urn:jboss:domain:deployment-scanner:2.0\">\n
    \           <deployment-scanner path=\"deployments\" relative-to=\"jboss.server.base.dir\"
    scan-interval=\"5000\" runtime-failure-causes-rollback=\"${jboss.deployment.scanner.rollback.on.failure:false}\"/>\n
    \       </subsystem>\n        <subsystem xmlns=\"urn:jboss:domain:discovery:1.0\"/>\n
    \       <subsystem xmlns=\"urn:jboss:domain:ee:6.0\">\n            <spec-descriptor-property-replacement>false</spec-descriptor-property-replacement>\n
    \           <concurrent>\n                <context-services>\n                    <context-service
    name=\"default\" jndi-name=\"java:jboss/ee/concurrency/context/default\" use-transaction-setup-provider=\"true\"/>\n
    \               </context-services>\n                <managed-thread-factories>\n
    \                   <managed-thread-factory name=\"default\" jndi-name=\"java:jboss/ee/concurrency/factory/default\"
    context-service=\"default\"/>\n                </managed-thread-factories>\n                <managed-executor-services>\n
    \                   <managed-executor-service name=\"default\" jndi-name=\"java:jboss/ee/concurrency/executor/default\"
    context-service=\"default\" hung-task-threshold=\"60000\" keepalive-time=\"5000\"/>\n
    \               </managed-executor-services>\n                <managed-scheduled-executor-services>\n
    \                   <managed-scheduled-executor-service name=\"default\" jndi-name=\"java:jboss/ee/concurrency/scheduler/default\"
    context-service=\"default\" hung-task-threshold=\"60000\" keepalive-time=\"3000\"/>\n
    \               </managed-scheduled-executor-services>\n            </concurrent>\n
    \           <default-bindings context-service=\"java:jboss/ee/concurrency/context/default\"
    datasource=\"java:jboss/datasources/ExampleDS\" managed-executor-service=\"java:jboss/ee/concurrency/executor/default\"
    managed-scheduled-executor-service=\"java:jboss/ee/concurrency/scheduler/default\"
    managed-thread-factory=\"java:jboss/ee/concurrency/factory/default\"/>\n        </subsystem>\n
    \       <subsystem xmlns=\"urn:jboss:domain:ee-security:1.0\"/>\n        <subsystem
    xmlns=\"urn:jboss:domain:ejb3:10.0\">\n            <session-bean>\n                <stateless>\n
    \                   <bean-instance-pool-ref pool-name=\"slsb-strict-max-pool\"/>\n
    \               </stateless>\n                <stateful default-access-timeout=\"5000\"
    cache-ref=\"simple\" passivation-disabled-cache-ref=\"simple\"/>\n                <singleton
    default-access-timeout=\"5000\"/>\n            </session-bean>\n            <pools>\n
    \               <bean-instance-pools>\n                    <strict-max-pool name=\"slsb-strict-max-pool\"
    derive-size=\"from-worker-pools\" instance-acquisition-timeout=\"5\" instance-acquisition-timeout-unit=\"MINUTES\"/>\n
    \                   <strict-max-pool name=\"mdb-strict-max-pool\" derive-size=\"from-cpu-count\"
    instance-acquisition-timeout=\"5\" instance-acquisition-timeout-unit=\"MINUTES\"/>\n
    \               </bean-instance-pools>\n            </pools>\n            <caches>\n
    \               <cache name=\"simple\"/>\n                <cache name=\"distributable\"
    passivation-store-ref=\"infinispan\" aliases=\"passivating clustered\"/>\n            </caches>\n
    \           <passivation-stores>\n                <passivation-store name=\"infinispan\"
    cache-container=\"ejb\" max-size=\"10000\"/>\n            </passivation-stores>\n
    \           <async thread-pool-name=\"default\"/>\n            <timer-service
    thread-pool-name=\"default\" default-data-store=\"default-file-store\">\n                <data-stores>\n
    \                   <file-data-store name=\"default-file-store\" path=\"timer-service-data\"
    relative-to=\"jboss.server.data.dir\"/>\n                </data-stores>\n            </timer-service>\n
    \           <remote connectors=\"http-remoting-connector\" thread-pool-name=\"default\"/>\n
    \           <thread-pools>\n                <thread-pool name=\"default\">\n                    <max-threads
    count=\"10\"/>\n                    <keepalive-time time=\"100\" unit=\"milliseconds\"/>\n
    \               </thread-pool>\n            </thread-pools>\n            <default-security-domain
    value=\"other\"/>\n            <application-security-domains>\n                <application-security-domain
    name=\"other\" security-domain=\"migration-defaultApplicationDomain\"/>\n            </application-security-domains>\n
    \           <default-missing-method-permissions-deny-access value=\"true\"/>\n
    \           <log-system-exceptions value=\"true\"/>\n        </subsystem>\n        <subsystem
    xmlns=\"urn:wildfly:elytron:18.0\" final-providers=\"combined-providers\" disallowed-providers=\"OracleUcrypto\">\n
    \           <providers>\n                <aggregate-providers name=\"combined-providers\">\n
    \                   <providers name=\"elytron\"/>\n                    <providers
    name=\"openssl\"/>\n                </aggregate-providers>\n                <provider-loader
    name=\"elytron\" module=\"org.wildfly.security.elytron\"/>\n                <provider-loader
    name=\"openssl\" module=\"org.wildfly.openssl\"/>\n            </providers>\n
    \           <audit-logging>\n                <file-audit-log name=\"local-audit\"
    path=\"audit.log\" relative-to=\"jboss.server.log.dir\" format=\"JSON\"/>\n            </audit-logging>\n
    \           <security-domains>\n                <security-domain name=\"migration-defaultApplicationDomain\"
    default-realm=\"migration-defaultApplicationRealm\" permission-mapper=\"default-permission-mapper\">\n
    \                   <realm name=\"migration-defaultApplicationRealm\" role-decoder=\"groups-to-roles\"/>\n
    \                   <realm name=\"local\"/>\n                </security-domain>\n
    \               <security-domain name=\"migration-defaultManagementDomain\" default-realm=\"migration-defaultManagementRealm\"
    permission-mapper=\"default-permission-mapper\">\n                    <realm name=\"migration-defaultManagementRealm\"
    role-decoder=\"groups-to-roles\"/>\n                    <realm name=\"local\"
    role-mapper=\"super-user-mapper\"/>\n                </security-domain>\n            </security-domains>\n
    \           <security-realms>\n                <identity-realm name=\"local\"
    identity=\"$local\"/>\n                <properties-realm name=\"migration-defaultApplicationRealm\">\n
    \                   <users-properties path=\"application-users.properties\" relative-to=\"jboss.server.config.dir\"
    digest-realm-name=\"migration-defaultApplicationRealm\"/>\n                    <groups-properties
    path=\"application-roles.properties\" relative-to=\"jboss.server.config.dir\"/>\n
    \               </properties-realm>\n                <properties-realm name=\"migration-defaultManagementRealm\">\n
    \                   <users-properties path=\"mgmt-users.properties\" relative-to=\"jboss.server.config.dir\"
    digest-realm-name=\"migration-defaultManagementRealm\"/>\n                    <groups-properties
    path=\"mgmt-groups.properties\" relative-to=\"jboss.server.config.dir\"/>\n                </properties-realm>\n
    \           </security-realms>\n            <mappers>\n                <simple-permission-mapper
    name=\"default-permission-mapper\" mapping-mode=\"first\">\n                    <permission-mapping>\n
    \                       <principal name=\"anonymous\"/>\n                        <permission-set
    name=\"default-permissions\"/>\n                    </permission-mapping>\n                    <permission-mapping
    match-all=\"true\">\n                        <permission-set name=\"login-permission\"/>\n
    \                       <permission-set name=\"default-permissions\"/>\n                    </permission-mapping>\n
    \               </simple-permission-mapper>\n                <constant-realm-mapper
    name=\"local\" realm-name=\"local\"/>\n                <simple-role-decoder name=\"groups-to-roles\"
    attribute=\"groups\"/>\n                <constant-role-mapper name=\"super-user-mapper\">\n
    \                   <role name=\"SuperUser\"/>\n                </constant-role-mapper>\n
    \           </mappers>\n            <permission-sets>\n                <permission-set
    name=\"login-permission\">\n                    <permission class-name=\"org.wildfly.security.auth.permission.LoginPermission\"/>\n
    \               </permission-set>\n                <permission-set name=\"default-permissions\">\n
    \                   <permission class-name=\"org.wildfly.extension.batch.jberet.deployment.BatchPermission\"
    module=\"org.wildfly.extension.batch.jberet\" target-name=\"*\"/>\n                    <permission
    class-name=\"org.wildfly.transaction.client.RemoteTransactionPermission\" module=\"org.wildfly.transaction.client\"/>\n
    \                   <permission class-name=\"org.jboss.ejb.client.RemoteEJBPermission\"
    module=\"org.jboss.ejb-client\"/>\n                </permission-set>\n            </permission-sets>\n
    \           <http>\n                <http-authentication-factory name=\"migration-defaultApplicationHttpAuthenticationFactory\"
    security-domain=\"migration-defaultApplicationDomain\" http-server-mechanism-factory=\"global\">\n
    \                   <mechanism-configuration>\n                        <mechanism
    mechanism-name=\"BASIC\">\n                            <mechanism-realm realm-name=\"migration-defaultApplicationRealm\"/>\n
    \                       </mechanism>\n                    </mechanism-configuration>\n
    \               </http-authentication-factory>\n                <http-authentication-factory
    name=\"migration-defaultManagementHttpAuthenticationFactory\" security-domain=\"migration-defaultManagementDomain\"
    http-server-mechanism-factory=\"global\">\n                    <mechanism-configuration>\n
    \                       <mechanism mechanism-name=\"DIGEST\">\n                            <mechanism-realm
    realm-name=\"migration-defaultManagementRealm\"/>\n                        </mechanism>\n
    \                   </mechanism-configuration>\n                </http-authentication-factory>\n
    \               <provider-http-server-mechanism-factory name=\"global\"/>\n            </http>\n
    \           <sasl>\n                <sasl-authentication-factory name=\"migration-defaultApplicationSaslAuthenticationFactory\"
    sasl-server-factory=\"configured\" security-domain=\"migration-defaultApplicationDomain\">\n
    \                   <mechanism-configuration>\n                        <mechanism
    mechanism-name=\"JBOSS-LOCAL-USER\" realm-mapper=\"local\"/>\n                        <mechanism
    mechanism-name=\"DIGEST-MD5\">\n                            <mechanism-realm realm-name=\"migration-defaultApplicationRealm\"/>\n
    \                       </mechanism>\n                    </mechanism-configuration>\n
    \               </sasl-authentication-factory>\n                <sasl-authentication-factory
    name=\"migration-defaultManagementSaslAuthenticationFactory\" sasl-server-factory=\"configured\"
    security-domain=\"migration-defaultManagementDomain\">\n                    <mechanism-configuration>\n
    \                       <mechanism mechanism-name=\"JBOSS-LOCAL-USER\" realm-mapper=\"local\"/>\n
    \                       <mechanism mechanism-name=\"DIGEST-MD5\">\n                            <mechanism-realm
    realm-name=\"migration-defaultManagementRealm\"/>\n                        </mechanism>\n
    \                   </mechanism-configuration>\n                </sasl-authentication-factory>\n
    \               <configurable-sasl-server-factory name=\"configured\" sasl-server-factory=\"elytron\">\n
    \                   <properties>\n                        <property name=\"wildfly.sasl.local-user.default-user\"
    value=\"$local\"/>\n                    </properties>\n                </configurable-sasl-server-factory>\n
    \               <mechanism-provider-filtering-sasl-server-factory name=\"elytron\"
    sasl-server-factory=\"global\">\n                    <filters>\n                        <filter
    provider-name=\"WildFlyElytron\"/>\n                    </filters>\n                </mechanism-provider-filtering-sasl-server-factory>\n
    \               <provider-sasl-server-factory name=\"global\"/>\n            </sasl>\n
    \           <tls>\n                <key-stores>\n                    <key-store
    name=\"migration-defaultTLSKeyStore\">\n                        <credential-reference
    clear-text=\"password\"/>\n                        <implementation type=\"JKS\"/>\n
    \                       <file path=\"application.keystore\" relative-to=\"jboss.server.config.dir\"/>\n
    \                   </key-store>\n                </key-stores>\n                <key-managers>\n
    \                   <key-manager name=\"migration-defaultTLSKeyManager\" key-store=\"migration-defaultTLSKeyStore\"
    generate-self-signed-certificate-host=\"localhost\">\n                        <credential-reference
    clear-text=\"password\"/>\n                    </key-manager>\n                </key-managers>\n
    \               <server-ssl-contexts>\n                    <server-ssl-context
    name=\"migration-defaultTLSServerSSLContext\" key-manager=\"migration-defaultTLSKeyManager\"/>\n
    \               </server-ssl-contexts>\n            </tls>\n        </subsystem>\n
    \       <subsystem xmlns=\"urn:wildfly:elytron-oidc-client:2.0\">\n            <secure-deployment
    name=\"sihdg-api.war\">\n                <auth-server-url>https://login.des.caixa/auth</auth-server-url>\n
    \               <ssl-required>EXTERNAL</ssl-required>\n                <realm>intranet</realm>\n
    \               <resource>cli-web-hdg</resource>\n                <public-client>true</public-client>\n
    \           </secure-deployment>\n        </subsystem>\n        <subsystem xmlns=\"urn:wildfly:health:1.0\"
    security-enabled=\"false\"/>\n        <subsystem xmlns=\"urn:jboss:domain:infinispan:14.0\">\n
    \           <cache-container name=\"server\" default-cache=\"default\" marshaller=\"LEGACY\"
    modules=\"org.wildfly.clustering.server\">\n                <local-cache name=\"default\">\n
    \                   <transaction mode=\"BATCH\"/>\n                </local-cache>\n
    \           </cache-container>\n            <cache-container name=\"web\" default-cache=\"passivation\"
    marshaller=\"LEGACY\" modules=\"org.wildfly.clustering.web.infinispan\">\n                <local-cache
    name=\"passivation\">\n                    <locking isolation=\"REPEATABLE_READ\"/>\n
    \                   <transaction mode=\"BATCH\"/>\n                    <file-store
    passivation=\"true\" purge=\"false\"/>\n                </local-cache>\n                <local-cache
    name=\"persistent\">\n                    <locking isolation=\"REPEATABLE_READ\"/>\n
    \                   <transaction mode=\"BATCH\"/>\n                    <file-store
    passivation=\"false\" purge=\"false\"/>\n                </local-cache>\n                <local-cache
    name=\"concurrent\">\n                    <file-store passivation=\"true\" purge=\"false\"/>\n
    \               </local-cache>\n            </cache-container>\n            <cache-container
    name=\"ejb\" default-cache=\"passivation\" marshaller=\"LEGACY\" aliases=\"sfsb\"
    modules=\"org.wildfly.clustering.ejb.infinispan\">\n                <local-cache
    name=\"passivation\">\n                    <locking isolation=\"REPEATABLE_READ\"/>\n
    \                   <transaction mode=\"BATCH\"/>\n                    <file-store
    passivation=\"true\" purge=\"false\"/>\n                </local-cache>\n                <local-cache
    name=\"persistent\">\n                    <locking isolation=\"REPEATABLE_READ\"/>\n
    \                   <transaction mode=\"BATCH\"/>\n                    <file-store
    passivation=\"false\" purge=\"false\"/>\n                </local-cache>\n            </cache-container>\n
    \           <cache-container name=\"hibernate\" default-cache=\"local-query\"
    marshaller=\"LEGACY\" modules=\"org.infinispan.hibernate-cache\">\n                <local-cache
    name=\"entity\">\n                    <transaction mode=\"NON_XA\"/>\n                    <heap-memory
    size=\"10000\"/>\n                    <expiration max-idle=\"100000\"/>\n                </local-cache>\n
    \               <local-cache name=\"local-query\">\n                    <heap-memory
    size=\"10000\"/>\n                    <expiration max-idle=\"100000\"/>\n                </local-cache>\n
    \               <local-cache name=\"timestamps\"/>\n            </cache-container>\n
    \       </subsystem>\n        <subsystem xmlns=\"urn:jboss:domain:io:3.0\">\n
    \           <worker name=\"default\"/>\n            <buffer-pool name=\"default\"/>\n
    \       </subsystem>\n        <subsystem xmlns=\"urn:jboss:domain:jaxrs:3.0\"/>\n
    \       <subsystem xmlns=\"urn:jboss:domain:jca:6.0\">\n            <archive-validation
    enabled=\"true\" fail-on-error=\"true\" fail-on-warn=\"false\"/>\n            <bean-validation
    enabled=\"true\"/>\n            <default-workmanager>\n                <elytron-enabled>false</elytron-enabled>\n
    \               <short-running-threads>\n                    <core-threads count=\"50\"/>\n
    \                   <queue-length count=\"50\"/>\n                    <max-threads
    count=\"50\"/>\n                    <keepalive-time time=\"10\" unit=\"seconds\"/>\n
    \               </short-running-threads>\n                <long-running-threads>\n
    \                   <core-threads count=\"50\"/>\n                    <queue-length
    count=\"50\"/>\n                    <max-threads count=\"50\"/>\n                    <keepalive-time
    time=\"10\" unit=\"seconds\"/>\n                </long-running-threads>\n            </default-workmanager>\n
    \           <cached-connection-manager/>\n        </subsystem>\n        <subsystem
    xmlns=\"urn:jboss:domain:jdr:1.0\"/>\n        <subsystem xmlns=\"urn:jboss:domain:jmx:1.3\">\n
    \           <expose-resolved-model/>\n            <expose-expression-model/>\n
    \           <remoting-connector/>\n        </subsystem>\n        <subsystem xmlns=\"urn:jboss:domain:jpa:1.1\">\n
    \           <jpa default-datasource=\"\" default-extended-persistence-inheritance=\"DEEP\"/>\n
    \       </subsystem>\n        <subsystem xmlns=\"urn:jboss:domain:jsf:1.1\"/>\n
    \       <subsystem xmlns=\"urn:jboss:domain:mail:4.0\">\n            <mail-session
    name=\"siaud\" jndi-name=\"java:/mail/siaud\">\n                <smtp-server outbound-socket-binding-ref=\"mail-smtp\"/>\n
    \           </mail-session>\n        </subsystem>\n        <subsystem xmlns=\"urn:wildfly:metrics:1.0\"
    security-enabled=\"false\" exposed-subsystems=\"*\" prefix=\"${wildfly.metrics.prefix:jboss}\"/>\n
    \       <subsystem xmlns=\"urn:jboss:domain:naming:2.0\">\n            <remote-naming/>\n
    \       </subsystem>\n        <subsystem xmlns=\"urn:jboss:domain:pojo:1.0\"/>\n
    \       <subsystem xmlns=\"urn:jboss:domain:remoting:5.0\">\n            <http-connector
    name=\"http-remoting-connector\" connector-ref=\"default\" sasl-authentication-factory=\"migration-defaultApplicationSaslAuthenticationFactory\"/>\n
    \       </subsystem>\n        <subsystem xmlns=\"urn:jboss:domain:request-controller:1.0\"/>\n
    \       <subsystem xmlns=\"urn:jboss:domain:resource-adapters:7.0\"/>\n        <subsystem
    xmlns=\"urn:jboss:domain:sar:1.0\"/>\n        <subsystem xmlns=\"urn:jboss:domain:security-manager:1.0\">\n
    \           <deployment-permissions>\n                <maximum-set>\n                    <permission
    class=\"java.security.AllPermission\"/>\n                </maximum-set>\n            </deployment-permissions>\n
    \       </subsystem>\n        <subsystem xmlns=\"urn:jboss:domain:transactions:6.0\">\n
    \           <core-environment>\n                <process-id>\n                    <uuid/>\n
    \               </process-id>\n            </core-environment>\n            <recovery-environment
    socket-binding=\"txn-recovery-environment\" status-socket-binding=\"txn-status-manager\"/>\n
    \           <object-store relative-to=\"jboss.server.data.dir\"/>\n        </subsystem>\n
    \       <subsystem xmlns=\"urn:jboss:domain:undertow:14.0\">\n            <buffer-cache
    name=\"default\"/>\n            <server name=\"default-server\">\n                <http-listener
    name=\"default\" socket-binding=\"http\" redirect-socket=\"https\" enable-http2=\"true\"/>\n
    \               <https-listener name=\"https\" socket-binding=\"https\" ssl-context=\"migration-defaultTLSServerSSLContext\"
    enable-http2=\"true\"/>\n                <host name=\"default-host\" alias=\"localhost\">\n
    \                   <location name=\"/\" handler=\"welcome-content\"/>\n                    <http-invoker
    http-authentication-factory=\"migration-defaultApplicationHttpAuthenticationFactory\"/>\n
    \               </host>\n            </server>\n            <servlet-container
    name=\"default\">\n                <jsp-config/>\n                <websockets/>\n
    \           </servlet-container>\n            <handlers>\n                <file
    name=\"welcome-content\" path=\"${jboss.home.dir}/welcome-content\"/>\n            </handlers>\n
    \           <application-security-domains>\n                <application-security-domain
    name=\"other\" security-domain=\"migration-defaultApplicationDomain\"/>\n            </application-security-domains>\n
    \       </subsystem>\n        <subsystem xmlns=\"urn:jboss:domain:webservices:2.0\">\n
    \           <wsdl-host>${jboss.bind.address:127.0.0.1}</wsdl-host>\n            <endpoint-config
    name=\"Standard-Endpoint-Config\"/>\n            <endpoint-config name=\"Recording-Endpoint-Config\">\n
    \               <pre-handler-chain name=\"recording-handlers\" protocol-bindings=\"##SOAP11_HTTP
    ##SOAP11_HTTP_MTOM ##SOAP12_HTTP ##SOAP12_HTTP_MTOM\">\n                    <handler
    name=\"RecordingHandler\" class=\"org.jboss.ws.common.invocation.RecordingServerHandler\"/>\n
    \               </pre-handler-chain>\n            </endpoint-config>\n            <client-config
    name=\"Standard-Client-Config\"/>\n        </subsystem>\n        <subsystem xmlns=\"urn:jboss:domain:weld:5.0\"/>\n
    \   </profile>\n    <interfaces>\n        <interface name=\"management\">\n            <inet-address
    value=\"${jboss.bind.address.management:127.0.0.1}\"/>\n        </interface>\n
    \       <interface name=\"public\">\n            <inet-address value=\"${jboss.bind.address:127.0.0.1}\"/>\n
    \       </interface>\n    </interfaces>\n    <socket-binding-group name=\"standard-sockets\"
    default-interface=\"public\" port-offset=\"${jboss.socket.binding.port-offset:0}\">\n
    \       <socket-binding name=\"ajp\" port=\"${jboss.ajp.port:8009}\"/>\n        <socket-binding
    name=\"http\" port=\"${jboss.http.port:8080}\"/>\n        <socket-binding name=\"https\"
    port=\"${jboss.https.port:8443}\"/>\n        <socket-binding name=\"management-http\"
    interface=\"management\" port=\"${jboss.management.http.port:9990}\"/>\n        <socket-binding
    name=\"management-https\" interface=\"management\" port=\"${jboss.management.https.port:9993}\"/>\n
    \       <socket-binding name=\"txn-recovery-environment\" port=\"4712\"/>\n        <socket-binding
    name=\"txn-status-manager\" port=\"4713\"/>\n        <outbound-socket-binding
    name=\"mail-smtp\">\n            <remote-destination host=\"localhost\" port=\"25\"/>\n
    \       </outbound-socket-binding>\n    </socket-binding-group>\n</server>\n"
kind: ConfigMap
metadata:
  creationTimestamp: 2026-07-17T16:52:29Z
  managedFields:
  - apiVersion: v1
    fieldsType: FieldsV1
    fieldsV1:
      f:data:
        .: {}
        f:standalone-okd.xml: {}
    manager: oc
    operation: Update
    time: 2026-07-17T16:52:29Z
  name: jboss-config-sihdg-jboss8
  namespace: sihdg-des
  resourceVersion: "2084109055"
  uid: 369c3ef3-9352-479f-8c41-3527698f4a7a
-sh-4.2$
