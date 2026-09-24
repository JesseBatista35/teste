-sh-4.2$ java -Djava.security.properties=/opt/server/bin/java.security.override \
>        -XshowSettings:security:properties -version 2>&1 | grep disabledAlgorithms
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n sihdg-des -l name=sihdg-jboss8-des --sort-by=.metadata.creationTimestamp
NAME                        READY     STATUS    RESTARTS   AGE
sihdg-jboss8-des-88-nsrzb   1/1       Running   0          23d
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout latest dc/sihdg-jboss8-des -n sihdg-des
deploymentconfig.apps.openshift.io/sihdg-jboss8-des rolled out
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n sihdg-des -l name=sihdg-jboss8-des --sort-by=.metadata.creationTimestamp
NAME                        READY     STATUS              RESTARTS   AGE
sihdg-jboss8-des-88-nsrzb   1/1       Running             0          23d
sihdg-jboss8-des-99-6q7q2   0/1       ContainerCreating   0          2s
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n sihdg-des -l name=sihdg-jboss8-des --sort-by=.metadata.creationTimestamp
NAME                        READY     STATUS    RESTARTS   AGE
sihdg-jboss8-des-88-nsrzb   1/1       Running   0          23d
sihdg-jboss8-des-99-6q7q2   0/1       Running   0          8s
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc debug dc/sihdg-jboss8-des -n sihdg-des -- bash -c '
>   ls -l /opt/server/bin/java.security.override
>   java -Djava.security.properties=/opt/server/bin/java.security.override \
>        -XshowSettings:security:properties -version 2>&1 | grep disabledAlgorithms'
Defaulting container name to sihdg-jboss8-des.
Use 'oc describe pod/sihdg-jboss8-des-debug -n sihdg-des' to see all of the containers in this pod.

Debugging with pod/sihdg-jboss8-des-debug, original command: <image entrypoint>
Waiting for pod to start ...
-rw-r--r--. 1 root root 916 Sep 24 17:07 /opt/server/bin/java.security.override
        http.auth.digest.disabledAlgorithms=MD5, SHA-1
        jdk.certpath.disabledAlgorithms=
        jdk.jar.disabledAlgorithms=
        jdk.tls.disabledAlgorithms=

Removing debug pod ...
-sh-4.2$ POD=$(oc get pod -l name=sihdg-jboss8-des -n sihdg-des --sort-by=.metadata.creationTimestamp -o name | tail -1)
-sh-4.2$ oc logs -f $POD -n sihdg-des | grep -E "WFLYSRV0025|WFLYSRV0026|SHA1withRSA|sihdgDS"
14:07:00,842 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) started in 4674ms - Started 72 of 84 services (26 services are lazy, passive or on-demand) - Server configuration file in use: standalone.xml
14:07:02,951 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-2) WFLYJCA0001: Bound data source [java:jboss/jdbc/sihdgDS]
14:07:10,077 INFO  [org.jboss.as.jpa] (MSC service thread 1-2) WFLYJPA0002: Read persistence.xml for sihdgDS
14:07:10,544 INFO  [org.jipijapa] (MSC service thread 1-1) JIPIORMV6020260: Second level cache enabled for sihdg-3.15.0.0.ear/sihdg-api.war#sihdgDS
14:07:12,546 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 46) WFLYJPA0010: Starting Persistence Unit (phase 1 of 2) Service 'sihdg-3.15.0.0.ear/sihdg-api.war#sihdgDS'
14:07:12,632 INFO  [org.hibernate.jpa.internal.util.LogHelper] (ServerService Thread Pool -- 46) HHH000204: Processing PersistenceUnitInfo [name: sihdgDS]
14:07:13,041 INFO  [org.jipijapa] (MSC service thread 1-2) JIPIORMV6020260: Second level cache enabled for sihdg-3.15.0.0.ear/sihdg-api.war#sihdgDS
14:07:13,657 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 46) WFLYJPA0010: Starting Persistence Unit (phase 2 of 2) Service 'sihdg-3.15.0.0.ear/sihdg-api.war#sihdgDS'
Caused by: java.security.cert.CertPathValidatorException: Algorithm constraints check failed on signature algorithm: SHA1withRSA
14:07:23,856 ERROR [org.hibernate.engine.jdbc.spi.SqlExceptionHelper] (ServerService Thread Pool -- 52) jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
14:07:23,863 ERROR [org.jboss.as.ejb3.invocation] (ServerService Thread Pool -- 52) WFLYEJB0034: Jakarta Enterprise Beans Invocation failed on component PerfilAS for method public void br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilAS.gravar(br.gov.caixa.arquitetura.javaee.core.comum.dto.PerfilDTO): jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
Caused by: java.security.cert.CertPathValidatorException: Algorithm constraints check failed on signature algorithm: SHA1withRSA
Caused by: jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
Caused by: java.security.cert.CertPathValidatorException: Algorithm constraints check failed on signature algorithm: SHA1withRSA
Caused by: java.security.cert.CertPathValidatorException: Algorithm constraints check failed on signature algorithm: SHA1withRSA
14:07:24,138 ERROR [org.hibernate.engine.jdbc.spi.SqlExceptionHelper] (ServerService Thread Pool -- 50) jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
14:07:24,139 ERROR [org.jboss.as.ejb3.invocation] (ServerService Thread Pool -- 50) WFLYEJB0034: Jakarta Enterprise Beans Invocation failed on component PerfilRecursoAS for method public java.util.List br.gov.caixa.arquitetura.javaee.core.seguranca.PerfilRecursoAS.consultarTodosPerfisRelacionados(): jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
Caused by: java.security.cert.CertPathValidatorException: Algorithm constraints check failed on signature algorithm: SHA1withRSA
14:07:24,140 ERROR [org.jboss.as.ejb3.invocation] (ServerService Thread Pool -- 50) WFLYEJB0034: Jakarta Enterprise Beans Invocation failed on component AtualizadorCacheAS for method public void br.gov.caixa.arquitetura.javaee.core.util.AtualizadorCacheAS.verificarEAtualizarCache(boolean): jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
Caused by: java.security.cert.CertPathValidatorException: Algorithm constraints check failed on signature algorithm: SHA1withRSA
Caused by: jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
Caused by: java.security.cert.CertPathValidatorException: Algorithm constraints check failed on signature algorithm: SHA1withRSA
    Caused by: jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
    Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
    Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
    Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
    Caused by: java.security.cert.CertPathValidatorException: Algorithm constraints check failed on signature algorithm: SHA1withRSA",
    Caused by: jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
    Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
    Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
    Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
    Caused by: java.security.cert.CertPathValidatorException: Algorithm constraints check failed on signature algorithm: SHA1withRSA"
14:07:24,239 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 8.0 Update 12.0 (WildFly Core 21.0.20.Final-redhat-00001) started (with errors) in 22891ms - Started 1176 of 1265 services (7 services failed or missing dependencies, 162 services are lazy, passive or on-demand) - Server configuration file in use: standalone.xml

