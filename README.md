
[spssodr1@crjtqapllx036 bin]$
[spssodr1@crjtqapllx036 bin]$ tail -f /tmp/jboss_start.log
11:56:16,627 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "user-storage-jpa-siper-jar-with-dependencies.jar" was rolled back with no failure message
11:56:16,627 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "servico.war" was rolled back with no failure message
11:56:16,627 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "loginCaixa-jar-with-dependencies.jar" was rolled back with no failure message
11:56:16,627 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "BrowserPassword-jar-with-dependencies.jar" was rolled back with no failure message
11:56:16,627 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "eventExternal-jar-with-dependencies.jar" was rolled back with no failure message
11:56:16,628 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "directgrantpassword-jar-with-dependencies.jar" was rolled back with no failure message
11:56:16,628 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "OTPCaixaCond.jar" was rolled back with no failure message
11:56:16,628 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 43) WFLYSRV0022: Deploy of deployment "keycloak-server.war" was rolled back with no failure message
11:56:16,634 INFO  [org.jboss.as] (MSC service thread 1-4) WFLYSRV0050: Red Hat Single Sign-On 7.3.3.GA (WildFly Core 6.0.15.Final-redhat-00001) stopped in 639ms
^C
[spssodr1@crjtqapllx036 bin]$ grep -n -E "ERROR|FATAL|WFLYCTL0013|Caused by" /tmp/jboss_start.log | head -30
89:Caused by: java.sql.SQLException: Listener refused the connection with the following error:
99:Caused by: oracle.net.ns.NetException: Listener refused the connection with the following error:
1091:Caused by: java.sql.SQLException: Listener refused the connection with the following error:
1101:Caused by: oracle.net.ns.NetException: Listener refused the connection with the following error:
1177:Caused by: java.sql.SQLException: Listener refused the connection with the following error:
1187:Caused by: oracle.net.ns.NetException: Listener refused the connection with the following error:
1195:11:56:15,643 ERROR [org.hibernate.hql.spi.id.IdTableHelper] (ServerService Thread Pool -- 59) Unable obtain JDBC Connection: java.sql.SQLException: javax.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/datasources/oraset
1218:Caused by: javax.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/datasources/oraset
1224:Caused by: javax.resource.ResourceException: IJ031084: Unable to create connection
1234:Caused by: java.sql.SQLException: Listener refused the connection with the following error:
1244:Caused by: oracle.net.ns.NetException: Listener refused the connection with the following error:
1310:Caused by: java.sql.SQLException: Listener refused the connection with the following error:
1320:Caused by: oracle.net.ns.NetException: Listener refused the connection with the following error:
1329:11:56:15,983 ERROR [org.jboss.msc.service.fail] (ServerService Thread Pool -- 65) MSC000001: Failed to start service jboss.deployment.unit."keycloak-server.war".undertow-deployment: org.jboss.msc.service.StartException in service jboss.deployment.unit."keycloak-server.war".undertow-deployment: java.lang.RuntimeException: RESTEASY003325: Failed to construct public org.keycloak.services.resources.KeycloakApplication(javax.servlet.ServletContext,org.jboss.resteasy.core.Dispatcher)
1339:Caused by: java.lang.RuntimeException: RESTEASY003325: Failed to construct public org.keycloak.services.resources.KeycloakApplication(javax.servlet.ServletContext,org.jboss.resteasy.core.Dispatcher)
1365:Caused by: java.lang.RuntimeException: Failed to connect to database
1380:Caused by: java.sql.SQLException: javax.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/datasources/KeycloakDS
1385:Caused by: javax.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/datasources/KeycloakDS
1391:Caused by: javax.resource.ResourceException: IJ031084: Unable to create connection
1401:Caused by: java.sql.SQLException: Listener refused the connection with the following error:
1411:Caused by: oracle.net.ns.NetException: Listener refused the connection with the following error:
1431:11:56:16,050 ERROR [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0043: Deployment unit processor org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor@372ca300 unexpectedly threw an exception during undeploy phase POST_MODULE of deployment "BrowserPassword-jar-with-dependencies.jar": java.lang.NullPointerException
1447:11:56:16,051 ERROR [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0043: Deployment unit processor org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor@372ca300 unexpectedly threw an exception during undeploy phase POST_MODULE of deployment "validaLogin-jar-with-dependencies.jar": java.lang.NullPointerException
1463:11:56:16,052 ERROR [org.jboss.as.server.deployment] (MSC service thread 1-5) WFLYSRV0043: Deployment unit processor org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor@372ca300 unexpectedly threw an exception during undeploy phase POST_MODULE of deployment "eventExternal-jar-with-dependencies.jar": java.lang.NullPointerException
1479:11:56:16,052 ERROR [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0043: Deployment unit processor org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor@372ca300 unexpectedly threw an exception during undeploy phase POST_MODULE of deployment "loginCaixa-jar-with-dependencies.jar": java.lang.NullPointerException
1495:11:56:16,052 ERROR [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0043: Deployment unit processor org.keycloak.subsystem.server.extension.KeycloakProviderDeploymentProcessor@372ca300 unexpectedly threw an exception during undeploy phase POST_MODULE of deployment "directgrantpassword-jar-with-dependencies.jar": java.lang.NullPointerException
1562:11:56:16,626 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "resource-provider-jar-with-dependencies.jar" was rolled back with no failure message
1563:11:56:16,627 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "siset-user-session-provider.jar" was rolled back with no failure message
1564:11:56:16,627 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "validaLogin-jar-with-dependencies.jar" was rolled back with no failure message
1565:11:56:16,627 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0022: Deploy of deployment "user-storage-jpa-siper-jar-with-dependencies.jar" was rolled back with no failure message
[spssodr1@crjtqapllx036 bin]$
[spssodr1@crjtqapllx036 bin]$
[spssodr1@crjtqapllx036 bin]$
[spssodr1@crjtqapllx036 bin]$ sed -n '85,105p' /tmp/jboss_start.log
        at org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1325)
        at org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.fillTo(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1138)
        at org.jboss.jca.core.connectionmanager.pool.mcp.PoolFiller.run(PoolFiller.java:97)
        at java.lang.Thread.run(Thread.java:745)
Caused by: java.sql.SQLException: Listener refused the connection with the following error:
ORA-12514, TNS:listener does not currently know of service requested in connect descriptor

        at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:419)
        at oracle.jdbc.driver.PhysicalConnection.<init>(PhysicalConnection.java:536)
        at oracle.jdbc.driver.T4CConnection.<init>(T4CConnection.java:228)
        at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:32)
        at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:521)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:321)
        ... 6 more
Caused by: oracle.net.ns.NetException: Listener refused the connection with the following error:
ORA-12514, TNS:listener does not currently know of service requested in connect descriptor

        at oracle.net.ns.NSProtocol.connect(NSProtocol.java:386)
        at oracle.jdbc.driver.T4CConnection.connect(T4CConnection.java:1054)
        at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:308)
        ... 11 more
[spssodr1@crjtqapllx036 bin]$
[spssodr1@crjtqapllx036 bin]$
[spssodr1@crjtqapllx036 bin]$
[spssodr1@crjtqapllx036 bin]$ telnet cnpexdadvm01-scan2.extra.caixa.gov.br 1521
Trying 10.116.33.7...
Connected to cnpexdadvm01-scan2.extra.caixa.gov.br.
Escape character is '^]'.

^C
Connection closed by foreign host.
[spssodr1@crjtqapllx036 bin]$ ^C
[spssodr1@crjtqapllx036 bin]$
[spssodr1@crjtqapllx036 bin]$
[spssodr1@crjtqapllx036 bin]$ timeout 5 bash -c "echo > /dev/tcp/cnpexdadvm01-scan2.extra.caixa.gov.br/1521" && echo "porta aberta" || echo "porta fechada/bloqueada"
porta aberta
[spssodr1@crjtqapllx036 bin]$
