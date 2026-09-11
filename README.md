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
[spssodr1@crjtqapllx036 bin]$
