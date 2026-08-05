-sh-4.2$ oc get configmap java-config-siorf-backend -o yaml
apiVersion: v1
data:
  standalone.conf: "## -*- shell-script -*- ######################################################\n##
    \                                                                         ##\n##
    \ JBoss EAP Bootstrap Script Configuration                                ##\n##
    \                                                                         ##\n##############################################################################\n#\n#
    This file is optional; it may be removed if not needed.\n#\n\n#\n# Specify the
    maximum file descriptor limit, use \"max\" or \"maximum\" to use\n# the default,
    as queried by the system.\n#\n# Defaults to \"maximum\"\n#\n#MAX_FD=\"maximum\"\n\n#\n#
    Specify the profiler configuration file to load.\n#\n# Default is to not load
    profiler configuration file.\n#\n#PROFILER=\"\"\n\n#\n# Specify the location of
    the Java home directory.  If set then $JAVA will\n# be defined to $JAVA_HOME/bin/java,
    else $JAVA will be \"java\".\n#\n#JAVA_HOME=\"/opt/java/jdk\"\n\n#\n# Specify
    the exact Java VM executable to use.\n#\n#JAVA=\"\"\n\nif [ \"x$JBOSS_MODULES_SYSTEM_PKGS\"
    = \"x\" ]; then\n  $JBOSS_MODULES_SYSTEM_PKGS=\"org.jboss.byteman\"\nfi\n\n# Uncomment
    the following line to prevent manipulation of JVM options\n# by shell scripts.\n#\n#PRESERVE_JAVA_OPTS=true\n\n#\n#
    Specify options to pass to the Java VM.\n#\nif [ \"x$JAVA_OPTS\" = \"x\" ]; then\n
    \  JAVA_OPTS=\"-Xms1024m -Xmx2048m -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=512m
    -Djava.net.preferIPv4Stack=true\"\n   JAVA_OPTS=\"$JAVA_OPTS -Djboss.modules.system.pkgs=$JBOSS_MODULES_SYSTEM_PKGS
    -Djava.awt.headless=true\"\n   JAVA_OPTS=\"$JAVA_OPTS -Djavax.net.ssl.trustStore=$JBOSS_HOME/standalone/configuration/caixa-truststore-acteste-nprd.jks
    -Djavax.net.ssl.trustStorePassword=changeit\"\n   JAVA_OPTS=\"$JAVA_OPTS -Dhttps.proxyHost=proxydes.caixa
    -Dhttps.proxyPort=80 -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa\"\n
    \  JAVA_OPTS=\"$JAVA_OPTS -Djboss.modules.policy-permissions=true\"\n   JAVA_OPTS=\"$JAVA_OPTS
    -Xbootclasspath/a:$JBOSS_HOME/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar:$JBOSS_HOME/modules/system/layers/base/org/jboss/log4j/logmanager/main/log4j-jboss-logmanager-1.2.0.Final-redhat-00001.jar:$JBOSS_HOME/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar\"\n
    \  JAVA_OPTS=\"$JAVA_OPTS -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager\"\n
    \  JAVA_OPTS=\"$JAVA_OPTS -Djava.util.logging.manager=org.jboss.logmanager.LogManager
    -Dsun.util.logging.disableCallerCheck=true\"   \n   JAVA_OPTS=\"$JAVA_OPTS -server
    -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500\"\n   JAVA_OPTS=\"$JAVA_OPTS
    -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml\"\n
    \  JAVA_OPTS=\"$JAVA_OPTS -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties
    -Delastic.apm.service_name=siorf -Delastic.apm.environment=TQS -Delastic.apm.application_packages=br.gov.caixa
    -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=siorf-backend-tqs\"\nelse\n
    \  echo \"JAVA_OPTS already set in environment; overriding default settings with
    values: $JAVA_OPTS\"\nfi\n\n# Sample JPDA settings for remote socket debugging\n#JAVA_OPTS=\"$JAVA_OPTS
    -agentlib:jdwp=transport=dt_socket,address=8787,server=y,suspend=n\"\n\n# Sample
    JPDA settings for shared memory debugging\n#JAVA_OPTS=\"$JAVA_OPTS -agentlib:jdwp=transport=dt_shmem,server=y,suspend=n,address=jboss\"\n\n#
    Uncomment to not use JBoss Modules lockless mode\n#JAVA_OPTS=\"$JAVA_OPTS -Djboss.modules.lockless=false\"\n\n#
    Uncomment to gather JBoss Modules metrics\n#JAVA_OPTS=\"$JAVA_OPTS -Djboss.modules.metrics=true\"\n\n#
    Uncomment this to run with a security manager enabled\n# SECMGR=\"true\"\n\n#
    Uncomment this in order to be able to run WildFly on FreeBSD\n# when you get \"epoll_create
    function not implemented\" message in dmesg output\n#JAVA_OPTS=\"$JAVA_OPTS -Djava.nio.channels.spi.SelectorProvider=sun.nio.ch.PollSelectorProvider\"\n\n#
    Use system or custom proxies, but not BOTH.\nJAVA_OPTS=\"$JAVA_OPTS -Djava.net.useSystemProxies=false\"\n\n#
    CUSTOM Proxies.\nJAVA_OPTS=\"$JAVA_OPTS -Dhttp.proxyHost=proxydes.caixa\"\nJAVA_OPTS=\"$JAVA_OPTS
    -Dhttp.proxyPort=80\"\nJAVA_OPTS=\"$JAVA_OPTS -Dhttps.proxyHost=proxydes.caixa\"\nJAVA_OPTS=\"$JAVA_OPTS
    -Dhttps.proxyPort=80\"\nJAVA_OPTS=\"$JAVA_OPTS -Dhttp.nonProxyHosts=localhost\\|127.0.0.1\\|*.caixa\"\n\nexport
    https_proxy=proxydes.caixa:80\nexport http_proxy=proxydes.caixa:80\n\n# proxydes.caixa
    = ip 10.252.32.65\n\n# enable garbage collection logging if not set in environment
    differently\nif [ \"x$GC_LOG\" = \"x\" ]; then\n   GC_LOG=\"true\"\nelse\n   echo
    \"GC_LOG set in environment to $GC_LOG\"\nfi"
kind: ConfigMap
metadata:
  creationTimestamp: 2026-06-15T14:45:16Z
  managedFields:
  - apiVersion: v1
    fieldsType: FieldsV1
    fieldsV1:
      f:data:
        .: {}
        f:standalone.conf: {}
    manager: oc
    operation: Update
    time: 2026-06-15T14:45:16Z
  name: java-config-siorf-backend
  namespace: siorf-tqs
  resourceVersion: "2112850046"
  uid: 2d1e83b8-149b-482b-95b4-ce3149ee1bfd
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get configmap jboss-config-siorf-backend -o yaml
apiVersion: v1
data:
  standalone-okd.xml: "<?xml version='1.0' encoding='UTF-8'?>\n\n<server xmlns=\"urn:jboss:domain:16.0\">\n
    \   <extensions>\n        <extension module=\"org.jboss.as.clustering.infinispan\"/>\n
    \       <extension module=\"org.jboss.as.connector\"/>\n        <extension module=\"org.jboss.as.deployment-scanner\"/>\n
    \       <extension module=\"org.jboss.as.ee\"/>\n        <extension module=\"org.jboss.as.ejb3\"/>\n
    \       <extension module=\"org.jboss.as.jaxrs\"/>\n        <extension module=\"org.jboss.as.jdr\"/>\n
    \       <extension module=\"org.jboss.as.jmx\"/>\n        <extension module=\"org.jboss.as.jpa\"/>\n
    \       <extension module=\"org.jboss.as.jsf\"/>\n        <extension module=\"org.jboss.as.logging\"/>\n
    \       <extension module=\"org.jboss.as.mail\"/>\n        <extension module=\"org.jboss.as.naming\"/>\n
    \       <extension module=\"org.jboss.as.pojo\"/>\n        <extension module=\"org.jboss.as.remoting\"/>\n
    \       <extension module=\"org.jboss.as.sar\"/>\n        <extension module=\"org.jboss.as.security\"/>\n
    \       <extension module=\"org.jboss.as.transactions\"/>\n        <extension
    module=\"org.jboss.as.webservices\"/>\n        <extension module=\"org.jboss.as.weld\"/>\n
    \       <extension module=\"org.wildfly.extension.batch.jberet\"/>\n        <extension
    module=\"org.wildfly.extension.bean-validation\"/>\n        <extension module=\"org.wildfly.extension.clustering.web\"/>\n
    \       <extension module=\"org.wildfly.extension.core-management\"/>\n        <extension
    module=\"org.wildfly.extension.discovery\"/>\n        <extension module=\"org.wildfly.extension.ee-security\"/>\n
    \       <extension module=\"org.wildfly.extension.elytron\"/>\n        <extension
    module=\"org.wildfly.extension.health\"/>\n        <extension module=\"org.wildfly.extension.io\"/>\n
    \       <extension module=\"org.wildfly.extension.metrics\"/>\n        <extension
    module=\"org.wildfly.extension.request-controller\"/>\n        <extension module=\"org.wildfly.extension.security.manager\"/>\n
    \       <extension module=\"org.wildfly.extension.undertow\"/>\n    </extensions>\n
    \   <management>\n        <security-realms>\n            <security-realm name=\"ManagementRealm\">\n
    \               <authentication>\n                    <local default-user=\"$local\"
    skip-group-loading=\"true\"/>\n                    <properties path=\"mgmt-users.properties\"
    relative-to=\"jboss.server.config.dir\"/>\n                </authentication>\n
    \               <authorization map-groups-to-roles=\"false\">\n                    <properties
    path=\"mgmt-groups.properties\" relative-to=\"jboss.server.config.dir\"/>\n                </authorization>\n
    \           </security-realm>\n            <security-realm name=\"ApplicationRealm\">\n
    \               <server-identities>\n                    <ssl>\n                        <keystore
    path=\"application.keystore\" relative-to=\"jboss.server.config.dir\" keystore-password=\"password\"
    alias=\"server\" key-password=\"password\" generate-self-signed-certificate-host=\"localhost\"/>\n
    \                   </ssl>\n                </server-identities>\n                <authentication>\n
    \                   <local default-user=\"$local\" allowed-users=\"*\" skip-group-loading=\"true\"/>\n
    \                   <properties path=\"application-users.properties\" relative-to=\"jboss.server.config.dir\"/>\n
    \               </authentication>\n                <authorization>\n                    <properties
    path=\"application-roles.properties\" relative-to=\"jboss.server.config.dir\"/>\n
    \               </authorization>\n            </security-realm>\n        </security-realms>\n
    \       <audit-log>\n            <formatters>\n                <json-formatter
    name=\"json-formatter\"/>\n            </formatters>\n            <handlers>\n
    \               <file-handler name=\"file\" formatter=\"json-formatter\" path=\"audit-log.log\"
    relative-to=\"jboss.server.data.dir\"/>\n            </handlers>\n            <logger
    log-boot=\"true\" log-read-only=\"false\" enabled=\"false\">\n                <handlers>\n
    \                   <handler name=\"file\"/>\n                </handlers>\n            </logger>\n
    \       </audit-log>\n        <management-interfaces>\n            <http-interface
    security-realm=\"ManagementRealm\">\n                <http-upgrade enabled=\"true\"/>\n
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
    \           <logger category=\"io.jaegertracing.Configuration\">\n                <level
    name=\"WARN\"/>\n            </logger>\n            <logger category=\"org.jboss.as.config\">\n
    \               <level name=\"DEBUG\"/>\n            </logger>\n            <logger
    category=\"sun.rmi\">\n                <level name=\"WARN\"/>\n            </logger>\n
    \           <root-logger>\n                <level name=\"INFO\"/>\n                <handlers>\n
    \                   <handler name=\"CONSOLE\"/>\n                    <handler
    name=\"FILE\"/>\n                </handlers>\n            </root-logger>\n            <formatter
    name=\"PATTERN\">\n                <pattern-formatter pattern=\"%d{yyyy-MM-dd
    HH:mm:ss,SSS} %-5p [%c] (%t) %s%e%n\"/>\n            </formatter>\n            <formatter
    name=\"COLOR-PATTERN\">\n                <pattern-formatter pattern=\"%K{level}%d{HH:mm:ss,SSS}
    %-5p [%c] (%t) %s%e%n\"/>\n            </formatter>\n        </subsystem>\n        <subsystem
    xmlns=\"urn:jboss:domain:batch-jberet:2.0\">\n            <default-job-repository
    name=\"in-memory\"/>\n            <default-thread-pool name=\"batch\"/>\n            <job-repository
    name=\"in-memory\">\n                <in-memory/>\n            </job-repository>\n
    \           <thread-pool name=\"batch\">\n                <max-threads count=\"10\"/>\n
    \               <keepalive-time time=\"30\" unit=\"seconds\"/>\n            </thread-pool>\n
    \       </subsystem>\n        <subsystem xmlns=\"urn:jboss:domain:bean-validation:1.0\"/>\n
    \       <subsystem xmlns=\"urn:jboss:domain:core-management:1.0\"/>\n        <subsystem
    xmlns=\"urn:jboss:domain:datasources:6.0\">\n            <datasources>\n                <datasource
    jndi-name=\"java:jboss/datasources/ExampleDS\" pool-name=\"ExampleDS\" enabled=\"true\"
    use-java-context=\"true\" statistics-enabled=\"${wildfly.datasources.statistics-enabled:${wildfly.statistics-enabled:false}}\">\n
    \                   <connection-url>jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE</connection-url>\n
    \                   <driver>h2</driver>\n                    <security>\n                        <user-name>sa</user-name>\n
    \                       <password>sa</password>\n                    </security>\n
    \               </datasource>\n\t\t\t\t<datasource jta=\"false\" jndi-name=\"java:jboss/jdbc/SIORF04\"
    pool-name=\"SIORF04\" enabled=\"true\" use-ccm=\"false\" statistics-enabled=\"true\">\n
    \                       <connection-url>jdbc:oracle:thin:@cnpexdadvm01-scan5.extra.caixa.gov.br:1521/pdbt001ng
    </connection-url>\n                        <driver-class>oracle.jdbc.OracleDriver</driver-class>\n
    \                       <driver>oracle</driver>\n                        <pool>\n
    \                           <min-pool-size>8</min-pool-size>\n                            <max-pool-size>32</max-pool-size>\n
    \                           <prefill>true</prefill>\n                            <flush-strategy>FailingConnectionOnly</flush-strategy>\n
    \                       </pool>\n                        <security>\n                            <user-name>SORFTB01</user-name>\n
    \                           <credential-reference store=\"DSKeystore\" alias=\"sorftb01\"/>\n
    \                       </security>\n                        <validation>\n                            <valid-connection-checker
    class-name=\"org.jboss.jca.adapters.jdbc.extensions.oracle.OracleValidConnectionChecker\"/>\n
    \                           <validate-on-match>true</validate-on-match>\n                            <background-validation>false</background-validation>\n
    \                           <exception-sorter class-name=\"org.jboss.jca.adapters.jdbc.extensions.oracle.OracleExceptionSorter\"/>\n
    \                       </validation>\n                        <timeout>\n                            <idle-timeout-minutes>3</idle-timeout-minutes>\n
    \                       </timeout>\n                        <statement>\n                            <share-prepared-statements>false</share-prepared-statements>\n
    \                       </statement>\n                    </datasource>\n                <drivers>\n
    \                   <driver name=\"h2\" module=\"com.h2database.h2\">\n                        <xa-datasource-class>org.h2.jdbcx.JdbcDataSource</xa-datasource-class>\n
    \                   </driver>\n\t\t\t\t\t <driver name=\"oracle\" module=\"com.oracle.jdbc\">\n
    \                   <xa-datasource-class>oracle.jdbc.xa.client.OracleXADataSource</xa-datasource-class>\n
    \                   </driver>\n                </drivers>\n            </datasources>\n
    \       </subsystem>\n        <subsystem xmlns=\"urn:jboss:domain:deployment-scanner:2.0\">\n
    \           <deployment-scanner path=\"deployments\" relative-to=\"jboss.server.base.dir\"
    scan-interval=\"5000\" runtime-failure-causes-rollback=\"${jboss.deployment.scanner.rollback.on.failure:false}\"/>\n
    \       </subsystem>\n        <subsystem xmlns=\"urn:jboss:domain:discovery:1.0\"/>\n
    \       <subsystem xmlns=\"urn:jboss:domain:distributable-web:2.0\" default-session-management=\"default\"
    default-single-sign-on-management=\"default\">\n            <infinispan-session-management
    name=\"default\" cache-container=\"web\" granularity=\"SESSION\">\n                <local-affinity/>\n
    \           </infinispan-session-management>\n            <infinispan-single-sign-on-management
    name=\"default\" cache-container=\"web\" cache=\"sso\"/>\n            <local-routing/>\n
    \       </subsystem>\n        <subsystem xmlns=\"urn:jboss:domain:ee:6.0\">\n
    \           <spec-descriptor-property-replacement>false</spec-descriptor-property-replacement>\n\t\t\t<jboss-descriptor-property-replacement>true</jboss-descriptor-property-replacement>\n
    \           <annotation-property-replacement>true</annotation-property-replacement>\n
    \           <concurrent>\n                <context-services>\n                    <context-service
    name=\"default\" jndi-name=\"java:jboss/ee/concurrency/context/default\" use-transaction-setup-provider=\"true\"/>\n
    \               </context-services>\n                <managed-thread-factories>\n
    \                   <managed-thread-factory name=\"default\" jndi-name=\"java:jboss/ee/concurrency/factory/default\"
    context-service=\"default\"/>\n                </managed-thread-factories>\n                <managed-executor-services>\n
    \                   <managed-executor-service name=\"default\" jndi-name=\"java:jboss/ee/concurrency/executor/default\"
    context-service=\"default\" hung-task-termination-period=\"0\" hung-task-threshold=\"60000\"
    keepalive-time=\"5000\"/>\n                </managed-executor-services>\n                <managed-scheduled-executor-services>\n
    \                   <managed-scheduled-executor-service name=\"default\" jndi-name=\"java:jboss/ee/concurrency/scheduler/default\"
    context-service=\"default\" hung-task-termination-period=\"0\" hung-task-threshold=\"60000\"
    keepalive-time=\"3000\"/>\n                </managed-scheduled-executor-services>\n
    \           </concurrent>\n            <default-bindings context-service=\"java:jboss/ee/concurrency/context/default\"
    datasource=\"java:jboss/datasources/ExampleDS\" managed-executor-service=\"java:jboss/ee/concurrency/executor/default\"
    managed-scheduled-executor-service=\"java:jboss/ee/concurrency/scheduler/default\"
    managed-thread-factory=\"java:jboss/ee/concurrency/factory/default\"/>\n        </subsystem>\n
    \       <subsystem xmlns=\"urn:jboss:domain:ee-security:1.0\"/>\n        <subsystem
    xmlns=\"urn:jboss:domain:ejb3:9.0\">\n            <session-bean>\n                <stateless>\n
    \                   <bean-instance-pool-ref pool-name=\"slsb-strict-max-pool\"/>\n
    \               </stateless>\n                <stateful default-access-timeout=\"5000\"
    cache-ref=\"simple\" passivation-disabled-cache-ref=\"simple\"/>\n                <singleton
    default-access-timeout=\"5000\"/>\n            </session-bean>\n            <pools>\n
    \               <bean-instance-pools>\n                    <strict-max-pool name=\"mdb-strict-max-pool\"
    derive-size=\"from-cpu-count\" instance-acquisition-timeout=\"5\" instance-acquisition-timeout-unit=\"MINUTES\"/>\n
    \                   <strict-max-pool name=\"slsb-strict-max-pool\" derive-size=\"from-worker-pools\"
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
    \           <remote cluster=\"ejb\" connectors=\"http-remoting-connector\" thread-pool-name=\"default\">\n
    \               <channel-creation-options>\n                    <option name=\"MAX_OUTBOUND_MESSAGES\"
    value=\"1234\" type=\"remoting\"/>\n                </channel-creation-options>\n
    \           </remote>\n            <thread-pools>\n                <thread-pool
    name=\"default\">\n                    <max-threads count=\"10\"/>\n                    <keepalive-time
    time=\"60\" unit=\"seconds\"/>\n                </thread-pool>\n            </thread-pools>\n
    \           <default-security-domain value=\"other\"/>\n            <default-missing-method-permissions-deny-access
    value=\"true\"/>\n            <statistics enabled=\"${wildfly.ejb3.statistics-enabled:${wildfly.statistics-enabled:false}}\"/>\n
    \           <log-system-exceptions value=\"true\"/>\n        </subsystem>\n        <subsystem
    xmlns=\"urn:wildfly:elytron:13.0\" final-providers=\"combined-providers\" disallowed-providers=\"OracleUcrypto\">\n
    \           <providers>\n                <aggregate-providers name=\"combined-providers\">\n
    \                   <providers name=\"elytron\"/>\n                    <providers
    name=\"openssl\"/>\n                </aggregate-providers>\n                <provider-loader
    name=\"elytron\" module=\"org.wildfly.security.elytron\"/>\n                <provider-loader
    name=\"openssl\" module=\"org.wildfly.openssl\"/>\n            </providers>\n
    \           <audit-logging>\n                <file-audit-log name=\"local-audit\"
    path=\"audit.log\" relative-to=\"jboss.server.log.dir\" format=\"JSON\"/>\n            </audit-logging>\n
    \           <security-domains>\n                <security-domain name=\"ApplicationDomain\"
    default-realm=\"ApplicationRealm\" permission-mapper=\"default-permission-mapper\">\n
    \                   <realm name=\"ApplicationRealm\" role-decoder=\"groups-to-roles\"/>\n
    \                   <realm name=\"local\"/>\n                </security-domain>\n
    \               <security-domain name=\"ManagementDomain\" default-realm=\"ManagementRealm\"
    permission-mapper=\"default-permission-mapper\">\n                    <realm name=\"ManagementRealm\"
    role-decoder=\"groups-to-roles\"/>\n                    <realm name=\"local\"
    role-mapper=\"super-user-mapper\"/>\n                </security-domain>\n            </security-domains>\n
    \           <security-realms>\n                <identity-realm name=\"local\"
    identity=\"$local\"/>\n                <properties-realm name=\"ApplicationRealm\">\n
    \                   <users-properties path=\"application-users.properties\" relative-to=\"jboss.server.config.dir\"
    digest-realm-name=\"ApplicationRealm\"/>\n                    <groups-properties
    path=\"application-roles.properties\" relative-to=\"jboss.server.config.dir\"/>\n
    \               </properties-realm>\n                <properties-realm name=\"ManagementRealm\">\n
    \                   <users-properties path=\"mgmt-users.properties\" relative-to=\"jboss.server.config.dir\"
    digest-realm-name=\"ManagementRealm\"/>\n                    <groups-properties
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
    \           <http>\n                <http-authentication-factory name=\"management-http-authentication\"
    security-domain=\"ManagementDomain\" http-server-mechanism-factory=\"global\">\n
    \                   <mechanism-configuration>\n                        <mechanism
    mechanism-name=\"DIGEST\">\n                            <mechanism-realm realm-name=\"ManagementRealm\"/>\n
    \                       </mechanism>\n                    </mechanism-configuration>\n
    \               </http-authentication-factory>\n                <provider-http-server-mechanism-factory
    name=\"global\"/>\n            </http>\n            <sasl>\n                <sasl-authentication-factory
    name=\"application-sasl-authentication\" sasl-server-factory=\"configured\" security-domain=\"ApplicationDomain\">\n
    \                   <mechanism-configuration>\n                        <mechanism
    mechanism-name=\"JBOSS-LOCAL-USER\" realm-mapper=\"local\"/>\n                        <mechanism
    mechanism-name=\"DIGEST-MD5\">\n                            <mechanism-realm realm-name=\"ApplicationRealm\"/>\n
    \                       </mechanism>\n                    </mechanism-configuration>\n
    \               </sasl-authentication-factory>\n                <sasl-authentication-factory
    name=\"management-sasl-authentication\" sasl-server-factory=\"configured\" security-domain=\"ManagementDomain\">\n
    \                   <mechanism-configuration>\n                        <mechanism
    mechanism-name=\"JBOSS-LOCAL-USER\" realm-mapper=\"local\"/>\n                        <mechanism
    mechanism-name=\"DIGEST-MD5\">\n                            <mechanism-realm realm-name=\"ManagementRealm\"/>\n
    \                       </mechanism>\n                    </mechanism-configuration>\n
    \               </sasl-authentication-factory>\n                <configurable-sasl-server-factory
    name=\"configured\" sasl-server-factory=\"elytron\">\n                    <properties>\n
    \                       <property name=\"wildfly.sasl.local-user.default-user\"
    value=\"$local\"/>\n                    </properties>\n                </configurable-sasl-server-factory>\n
    \               <mechanism-provider-filtering-sasl-server-factory name=\"elytron\"
    sasl-server-factory=\"global\">\n                    <filters>\n                        <filter
    provider-name=\"WildFlyElytron\"/>\n                    </filters>\n                </mechanism-provider-filtering-sasl-server-factory>\n
    \               <provider-sasl-server-factory name=\"global\"/>\n            </sasl>\n\t\t\t
    <credential-stores>\n                <credential-store name=\"DSKeystore\" modifiable=\"true\"
    location=\"/opt/jboss/standalone/configuration/dskeystore_siorf_tqs.jceks\" create=\"false\">\n
    \                   <credential-reference clear-text=\"MASK-06JyVpNXG4Uv279gbCXCAu;F3d3r4d0;33\"/>\n
    \               </credential-store>\n            </credential-stores>\n            <tls>\n
    \               <key-stores>\n                    <key-store name=\"applicationKS\">\n
    \                       <credential-reference clear-text=\"password\"/>\n                        <implementation
    type=\"JKS\"/>\n                        <file path=\"application.keystore\" relative-to=\"jboss.server.config.dir\"/>\n
    \                   </key-store>\n                </key-stores>\n                <key-managers>\n
    \                   <key-manager name=\"applicationKM\" key-store=\"applicationKS\"
    generate-self-signed-certificate-host=\"localhost\">\n                        <credential-reference
    clear-text=\"password\"/>\n                    </key-manager>\n                </key-managers>\n
    \               <server-ssl-contexts>\n                    <server-ssl-context
    name=\"applicationSSC\" key-manager=\"applicationKM\"/>\n                </server-ssl-contexts>\n
    \           </tls>\n        </subsystem>\n        <subsystem xmlns=\"urn:wildfly:health:1.0\"
    security-enabled=\"false\"/>\n        <subsystem xmlns=\"urn:jboss:domain:infinispan:12.0\">\n
    \           <cache-container name=\"ejb\" default-cache=\"passivation\" aliases=\"sfsb\"
    modules=\"org.wildfly.clustering.ejb.infinispan\">\n                <local-cache
    name=\"passivation\">\n                    <file-store passivation=\"true\" purge=\"false\"/>\n
    \               </local-cache>\n            </cache-container>\n            <cache-container
    name=\"web\" default-cache=\"passivation\" modules=\"org.wildfly.clustering.web.infinispan\">\n
    \               <local-cache name=\"passivation\">\n                    <file-store
    passivation=\"true\" purge=\"false\"/>\n                </local-cache>\n                <local-cache
    name=\"sso\"/>\n            </cache-container>\n            <cache-container name=\"server\"
    default-cache=\"default\" modules=\"org.wildfly.clustering.server\">\n                <local-cache
    name=\"default\"/>\n            </cache-container>\n            <cache-container
    name=\"hibernate\" modules=\"org.infinispan.hibernate-cache\">\n                <local-cache
    name=\"entity\">\n                    <heap-memory size=\"10000\"/>\n                    <expiration
    max-idle=\"100000\"/>\n                </local-cache>\n                <local-cache
    name=\"local-query\">\n                    <heap-memory size=\"10000\"/>\n                    <expiration
    max-idle=\"100000\"/>\n                </local-cache>\n                <local-cache
    name=\"timestamps\"/>\n                <local-cache name=\"pending-puts\">\n                    <expiration
    max-idle=\"60000\"/>\n                </local-cache>\n            </cache-container>\n
    \       </subsystem>\n        <subsystem xmlns=\"urn:jboss:domain:io:3.0\">\n
    \           <worker name=\"default\"/>\n            <buffer-pool name=\"default\"/>\n
    \       </subsystem>\n        <subsystem xmlns=\"urn:jboss:domain:jaxrs:2.0\"/>\n
    \       <subsystem xmlns=\"urn:jboss:domain:jca:5.0\">\n            <archive-validation
    enabled=\"true\" fail-on-error=\"true\" fail-on-warn=\"false\"/>\n            <bean-validation
    enabled=\"true\"/>\n            <default-workmanager>\n                <short-running-threads>\n
    \                   <core-threads count=\"50\"/>\n                    <queue-length
    count=\"50\"/>\n                    <max-threads count=\"50\"/>\n                    <keepalive-time
    time=\"10\" unit=\"seconds\"/>\n                </short-running-threads>\n                <long-running-threads>\n
    \                   <core-threads count=\"50\"/>\n                    <queue-length
    count=\"50\"/>\n                    <max-threads count=\"50\"/>\n                    <keepalive-time
    time=\"10\" unit=\"seconds\"/>\n                </long-running-threads>\n            </default-workmanager>\n
    \           <cached-connection-manager/>\n        </subsystem>\n        <subsystem
    xmlns=\"urn:jboss:domain:jdr:1.0\"/>\n        <subsystem xmlns=\"urn:jboss:domain:jmx:1.3\">\n
    \           <expose-resolved-model/>\n            <expose-expression-model/>\n
    \           <remoting-connector/>\n        </subsystem>\n        <subsystem xmlns=\"urn:jboss:domain:jpa:1.1\">\n
    \           <jpa default-extended-persistence-inheritance=\"DEEP\"/>\n        </subsystem>\n
    \       <subsystem xmlns=\"urn:jboss:domain:jsf:1.1\"/>\n        <subsystem xmlns=\"urn:jboss:domain:mail:4.0\">\n
    \           <mail-session name=\"default\" jndi-name=\"java:jboss/mail/Default\">\n
    \               <smtp-server outbound-socket-binding-ref=\"mail-smtp\"/>\n            </mail-session>\n
    \       </subsystem>\n        <subsystem xmlns=\"urn:wildfly:metrics:1.0\" security-enabled=\"false\"
    exposed-subsystems=\"*\" prefix=\"${wildfly.metrics.prefix:jboss}\"/>\n        <subsystem
    xmlns=\"urn:jboss:domain:naming:2.0\">\n            <remote-naming/>\n        </subsystem>\n
    \       <subsystem xmlns=\"urn:jboss:domain:pojo:1.0\"/>\n        <subsystem xmlns=\"urn:jboss:domain:remoting:4.0\">\n
    \           <http-connector name=\"http-remoting-connector\" connector-ref=\"default\"
    security-realm=\"ApplicationRealm\"/>\n        </subsystem>\n        <subsystem
    xmlns=\"urn:jboss:domain:request-controller:1.0\"/>\n        <subsystem xmlns=\"urn:jboss:domain:resource-adapters:6.0\"/>\n
    \       <subsystem xmlns=\"urn:jboss:domain:sar:1.0\"/>\n        <subsystem xmlns=\"urn:jboss:domain:security:2.0\">\n
    \           <security-domains>\n                <security-domain name=\"other\"
    cache-type=\"default\">\n                    <authentication>\n                        <login-module
    code=\"Remoting\" flag=\"optional\">\n                            <module-option
    name=\"password-stacking\" value=\"useFirstPass\"/>\n                        </login-module>\n
    \                       <login-module code=\"RealmDirect\" flag=\"required\">\n
    \                           <module-option name=\"password-stacking\" value=\"useFirstPass\"/>\n
    \                       </login-module>\n                    </authentication>\n
    \               </security-domain>\n                <security-domain name=\"jboss-web-policy\"
    cache-type=\"default\">\n                    <authorization>\n                        <policy-module
    code=\"Delegating\" flag=\"required\"/>\n                    </authorization>\n
    \               </security-domain>\n                <security-domain name=\"jaspitest\"
    cache-type=\"default\">\n                    <authentication-jaspi>\n                        <login-module-stack
    name=\"dummy\">\n                            <login-module code=\"Dummy\" flag=\"optional\"/>\n
    \                       </login-module-stack>\n                        <auth-module
    code=\"Dummy\"/>\n                    </authentication-jaspi>\n                </security-domain>\n
    \               <security-domain name=\"jboss-ejb-policy\" cache-type=\"default\">\n
    \                   <authorization>\n                        <policy-module code=\"Delegating\"
    flag=\"required\"/>\n                    </authorization>\n                </security-domain>\n
    \           </security-domains>\n        </subsystem>\n        <subsystem xmlns=\"urn:jboss:domain:security-manager:1.0\">\n
    \           <deployment-permissions>\n                <maximum-set>\n                    <permission
    class=\"java.security.AllPermission\"/>\n                </maximum-set>\n            </deployment-permissions>\n
    \       </subsystem>\n        <subsystem xmlns=\"urn:jboss:domain:transactions:6.0\">\n
    \           <core-environment node-identifier=\"${jboss.tx.node.id:1}\">\n                <process-id>\n
    \                   <uuid/>\n                </process-id>\n            </core-environment>\n
    \           <recovery-environment socket-binding=\"txn-recovery-environment\"
    status-socket-binding=\"txn-status-manager\"/>\n            <coordinator-environment
    statistics-enabled=\"${wildfly.transactions.statistics-enabled:${wildfly.statistics-enabled:false}}\"/>\n
    \           <object-store path=\"tx-object-store\" relative-to=\"jboss.server.data.dir\"/>\n
    \       </subsystem>\n        <subsystem xmlns=\"urn:jboss:domain:undertow:12.0\"
    default-server=\"default-server\" default-virtual-host=\"default-host\" default-servlet-container=\"default\"
    default-security-domain=\"other\" statistics-enabled=\"${wildfly.undertow.statistics-enabled:${wildfly.statistics-enabled:false}}\">\n
    \           <buffer-cache name=\"default\"/>\n            <server name=\"default-server\">\n
    \               <http-listener name=\"default\" socket-binding=\"http\" redirect-socket=\"https\"
    enable-http2=\"true\"/>\n                <https-listener name=\"https\" socket-binding=\"https\"
    security-realm=\"ApplicationRealm\" enable-http2=\"true\"/>\n                <host
    name=\"default-host\" alias=\"localhost\">\n                    <location name=\"/\"
    handler=\"welcome-content\"/>\n                    <http-invoker security-realm=\"ApplicationRealm\"/>\n
    \               </host>\n            </server>\n            <servlet-container
    name=\"default\">\n                <jsp-config/>\n                <websockets/>\n
    \           </servlet-container>\n            <handlers>\n                <file
    name=\"welcome-content\" path=\"${jboss.home.dir}/welcome-content\"/>\n            </handlers>\n
    \       </subsystem>\n        <subsystem xmlns=\"urn:jboss:domain:webservices:2.0\"
    statistics-enabled=\"${wildfly.webservices.statistics-enabled:${wildfly.statistics-enabled:false}}\">\n
    \           <wsdl-host>${jboss.bind.address:127.0.0.1}</wsdl-host>\n            <endpoint-config
    name=\"Standard-Endpoint-Config\"/>\n            <endpoint-config name=\"Recording-Endpoint-Config\">\n
    \               <pre-handler-chain name=\"recording-handlers\" protocol-bindings=\"##SOAP11_HTTP
    ##SOAP11_HTTP_MTOM ##SOAP12_HTTP ##SOAP12_HTTP_MTOM\">\n                    <handler
    name=\"RecordingHandler\" class=\"org.jboss.ws.common.invocation.RecordingServerHandler\"/>\n
    \               </pre-handler-chain>\n            </endpoint-config>\n            <client-config
    name=\"Standard-Client-Config\"/>\n        </subsystem>\n        <subsystem xmlns=\"urn:jboss:domain:weld:4.0\"/>\n
    \          \n    </profile>\n    <interfaces>\n        <interface name=\"management\">\n
    \           <inet-address value=\"${jboss.bind.address.management:127.0.0.1}\"/>\n
    \       </interface>\n        <interface name=\"public\">\n            <inet-address
    value=\"${jboss.bind.address:127.0.0.1}\"/>\n        </interface>\n    </interfaces>\n
    \   <socket-binding-group name=\"standard-sockets\" default-interface=\"public\"
    port-offset=\"${jboss.socket.binding.port-offset:0}\">\n        <socket-binding
    name=\"ajp\" port=\"${jboss.ajp.port:8009}\"/>\n        <socket-binding name=\"http\"
    port=\"${jboss.http.port:8080}\"/>\n        <socket-binding name=\"https\" port=\"${jboss.https.port:8443}\"/>\n
    \       <socket-binding name=\"management-http\" interface=\"management\" port=\"${jboss.management.http.port:9990}\"/>\n
    \       <socket-binding name=\"management-https\" interface=\"management\" port=\"${jboss.management.https.port:9993}\"/>\n
    \       <socket-binding name=\"txn-recovery-environment\" port=\"4712\"/>\n        <socket-binding
    name=\"txn-status-manager\" port=\"4713\"/>\n        <outbound-socket-binding
    name=\"mail-smtp\">\n            <remote-destination host=\"${jboss.mail.server.host:localhost}\"
    port=\"${jboss.mail.server.port:25}\"/>\n        </outbound-socket-binding>\n
    \   </socket-binding-group>\n</server>"
kind: ConfigMap
metadata:
  creationTimestamp: 2026-06-15T14:45:16Z
  managedFields:
  - apiVersion: v1
    fieldsType: FieldsV1
    fieldsV1:
      f:data:
        .: {}
        f:standalone-okd.xml: {}
    manager: oc
    operation: Update
    time: 2026-06-15T14:45:16Z
  name: jboss-config-siorf-backend
  namespace: siorf-tqs
  resourceVersion: "2112850047"
  uid: a8f8d5b1-dc28-4392-9c8f-8f92027d38cd
-sh-4.2$
