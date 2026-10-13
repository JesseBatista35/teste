<img width="1892" height="987" alt="image" src="https://github.com/user-attachments/assets/f3a65051-aa05-4470-8b59-75f50f42a72f" />



Solicitamos verificar indisponibilidade do SIMKT de DES.

A aplicação exibe tela em branco, depois do usuário realizar login.

https://simkt-frontend-des.apps.nprd.caixa/



p585600@10.116.197.219's password:
Creating home directory for p585600.
Last failed login: Tue Oct 13 10:49:11 -03 2026 from 10.122.150.31 on ssh:notty
There was 1 failed login attempt since the last successful login.
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ps -ef | grep jboss
c112141  29653 29514  0 10:45 pts/0    00:00:00 tail -f -n 500 /logs/jboss/jboss-eap/standalone/simkt-backend-vm/server.log
p585600  29890 29846  0 10:49 pts/1    00:00:00 grep --color=auto jboss
root     32240     1  0 Out08 ?        00:00:00 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh                -b 0.0.0.0                -bmanagement 0.0.0.0                -Djboss.server.base.dir=/opt/jboss-eap/standalone                -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/simkt-backend-vm -c standalone-full-ha.xml
jboss    32243 32240  0 Out08 ?        00:00:00 /bin/sh /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/simkt-backend-vm -c standalone-full-ha.xml
jboss    32420 32243  0 Out08 ?        00:25:08 java -D[Standalone] -Xlog:gc*:file=/logs/jboss/jboss-eap/standalone/simkt-backend-vm/gc.log:time,uptimemillis:filecount=5,filesize=3M -Xms4096m -Xmx4096m -XX:MetaspaceSize=512M -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jboss-eap/standalone/deployments/applicationinsights-agent.jar -Dapplicationinsights.configuration.file=/opt/jboss-eap/standalone/configuration/applicationinsights.json --add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-exports=jdk.unsupported/sun.misc=ALL-UNNAMED --add-exports=jdk.unsupported/sun.reflect=ALL-UNNAMED --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/simkt-backend-vm/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/simkt-backend-vm -c standalone-full-ha.xml
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ^C
-sh-4.2$ ps -ef | grep simkt
c112141  29653 29514  0 10:45 pts/0    00:00:00 tail -f -n 500 /logs/jboss/jboss-eap/standalone/simkt-backend-vm/server.log
p585600  29908 29846  0 10:49 pts/1    00:00:00 grep --color=auto simkt
root     32240     1  0 Out08 ?        00:00:00 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh                -b 0.0.0.0                -bmanagement 0.0.0.0                -Djboss.server.base.dir=/opt/jboss-eap/standalone                -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/simkt-backend-vm -c standalone-full-ha.xml
jboss    32243 32240  0 Out08 ?        00:00:00 /bin/sh /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/simkt-backend-vm -c standalone-full-ha.xml
jboss    32420 32243  0 Out08 ?        00:25:08 java -D[Standalone] -Xlog:gc*:file=/logs/jboss/jboss-eap/standalone/simkt-backend-vm/gc.log:time,uptimemillis:filecount=5,filesize=3M -Xms4096m -Xmx4096m -XX:MetaspaceSize=512M -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jboss-eap/standalone/deployments/applicationinsights-agent.jar -Dapplicationinsights.configuration.file=/opt/jboss-eap/standalone/configuration/applicationinsights.json --add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-exports=jdk.unsupported/sun.misc=ALL-UNNAMED --add-exports=jdk.unsupported/sun.reflect=ALL-UNNAMED --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/simkt-backend-vm/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/simkt-backend-vm -c standalone-full-ha.xml
-sh-4.2$
-sh-4.2$
-sh-4.2$ ^C
-sh-4.2$ cat /logs/jboss/jboss-eap/standalone/simkt-backend-vm/server.log
2026-10-13 00:00:00,003 INFO  [br.gov.caixa.pedes.sistemas.simkt.scheduling.ParametrizacaoScheduler] (simkt-scheduler-1) Execução rotina publicar roteiros 13/10/2026 00:00:00
2026-10-13 00:00:02,282 INFO  [br.gov.caixa.pedes.sistemas.simkt.service.ParametrizacaoService] (simkt-scheduler-1) Finalizada publicação de roteiros!
2026-10-13 06:36:37,439 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-13 06:36:37,440 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 06:36:37,440 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) org.keycloak.KeycloakSecurityContext: eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiJjMWMxYTA0Yy1iZGZlLTRhM2ItYTlmYS05NjVmOGMzYTcwNzEiLCJleHAiOjE3OTE4ODQ0ODUsIm5iZiI6MCwiaWF0IjoxNzkxODg0MTg1LCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjMmRkZWRiYy02OTE3LTQyY2YtODlmZi0xNzgwYzBhZDI0NzEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJjbGktd2ViLW1rdCIsIm5vbmNlIjoiZDM5YjZkYTUtYWY1NS00ZjhiLWFkZTQtNzM1ZDY1MDNhOWMwIiwiYXV0aF90aW1lIjoxNzkxODg0MTgzLCJzZXNzaW9uX3N0YXRlIjoiOTJjYTk3ODEtODk5YS00YzRkLTk3MTMtZWUyZjdlYmIwY2Q5IiwiYWNyIjoiMSIsImFsbG93ZWQtb3JpZ2lucyI6WyIqIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJDTUJfQURNSU5JU1RSQURPUiIsIm9mZmxpbmVfYWNjZXNzIiwiQVVEMDAyNCIsIkNQVV9BVEVORF9HRVNUT1IiLCJHT1RfVU5JREFERVNfR0VSQUwiLCJNS1RfQURNSU5JU1RSQURPUiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQiLCJuYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIFVTRVIgQzA3ODYwOCBDRVNPQiIsInByZWZlcnJlZF91c2VybmFtZSI6ImM4OTE3NzAiLCJnaXZlbl9uYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIiwiZmFtaWx5X25hbWUiOiJVU0VSIEMwNzg2MDggQ0VTT0IifQ.S6BqeUpoI9sLHvmtP1jhbGIQuFU01cP5E0dknXf6tqB9JAUPRCdkKb65s5VAp2M-pWKBjTnf0R6fAeK0tE-qvlnSTkjCz2-IL-7sGSKZTm92KVr69K0OZaOpKUQzfNnN5dTrlqXIYoVrWzo0X4ThiZcPlY3HGDfe7C5UzNs8Gmz-lW5hO06MaM1JTL6fA-9c9MBq_pL7sVYgLX5h9o-DT1aNZ_vDm6ds_5cY93S6KOBeHNwT7GnTsI7ZCqzbJwOSygGtmoe1X-MF0f3tP-rnRYNhYEeQNV8YBb6RLBcssbagxuSkEDqwPx5wRdXMLSGfOCHwtNUZGYOskvkaCyGBZw
2026-10-13 06:36:37,440 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 06:36:37,440 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 06:36:37,440 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 06:36:37,440 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 06:36:37,440 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 06:36:37,440 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) SSOAuthenticationService TK: Optional[org.keycloak.representations.AccessToken@45c4666d]
2026-10-13 06:36:37,440 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-13 06:36:37,440 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 06:36:37,440 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) org.keycloak.KeycloakSecurityContext: eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiJjMWMxYTA0Yy1iZGZlLTRhM2ItYTlmYS05NjVmOGMzYTcwNzEiLCJleHAiOjE3OTE4ODQ0ODUsIm5iZiI6MCwiaWF0IjoxNzkxODg0MTg1LCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjMmRkZWRiYy02OTE3LTQyY2YtODlmZi0xNzgwYzBhZDI0NzEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJjbGktd2ViLW1rdCIsIm5vbmNlIjoiZDM5YjZkYTUtYWY1NS00ZjhiLWFkZTQtNzM1ZDY1MDNhOWMwIiwiYXV0aF90aW1lIjoxNzkxODg0MTgzLCJzZXNzaW9uX3N0YXRlIjoiOTJjYTk3ODEtODk5YS00YzRkLTk3MTMtZWUyZjdlYmIwY2Q5IiwiYWNyIjoiMSIsImFsbG93ZWQtb3JpZ2lucyI6WyIqIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJDTUJfQURNSU5JU1RSQURPUiIsIm9mZmxpbmVfYWNjZXNzIiwiQVVEMDAyNCIsIkNQVV9BVEVORF9HRVNUT1IiLCJHT1RfVU5JREFERVNfR0VSQUwiLCJNS1RfQURNSU5JU1RSQURPUiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQiLCJuYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIFVTRVIgQzA3ODYwOCBDRVNPQiIsInByZWZlcnJlZF91c2VybmFtZSI6ImM4OTE3NzAiLCJnaXZlbl9uYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIiwiZmFtaWx5X25hbWUiOiJVU0VSIEMwNzg2MDggQ0VTT0IifQ.S6BqeUpoI9sLHvmtP1jhbGIQuFU01cP5E0dknXf6tqB9JAUPRCdkKb65s5VAp2M-pWKBjTnf0R6fAeK0tE-qvlnSTkjCz2-IL-7sGSKZTm92KVr69K0OZaOpKUQzfNnN5dTrlqXIYoVrWzo0X4ThiZcPlY3HGDfe7C5UzNs8Gmz-lW5hO06MaM1JTL6fA-9c9MBq_pL7sVYgLX5h9o-DT1aNZ_vDm6ds_5cY93S6KOBeHNwT7GnTsI7ZCqzbJwOSygGtmoe1X-MF0f3tP-rnRYNhYEeQNV8YBb6RLBcssbagxuSkEDqwPx5wRdXMLSGfOCHwtNUZGYOskvkaCyGBZw
2026-10-13 06:36:37,440 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 06:36:37,440 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 06:36:37,440 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 06:36:37,440 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 06:36:37,440 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 06:36:37,450 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-1) UserDetails: UserDetails(id=c1c1a04c-bdfe-4a3b-a9fa-965f8c3a7071, userName=C891770, email=null, firstName=USER C078608 CESOB, lastName=USER C078608 CESOB, roles=[CMB_ADMINISTRADOR, offline_access, AUD0024, CPU_ATEND_GESTOR, GOT_UNIDADES_GERAL, MKT_ADMINISTRADOR, uma_authorization], issuedFor=cli-web-mkt)
2026-10-13 06:36:37,463 ERROR [org.springframework.boot.web.servlet.support.ErrorPageFilter] (default task-1) Forwarding to error page from request [/api/v1/privilege] due to exception [java.lang.NullPointerException]: java.lang.IllegalArgumentException: java.lang.NullPointerException
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.filter.PermissionFilter.doFilter(PermissionFilter.java:52)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.doFilter(ErrorPageFilter.java:126)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.access$000(ErrorPageFilter.java:64)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter$1.doFilterInternal(ErrorPageFilter.java:101)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.doFilter(ErrorPageFilter.java:119)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.filter.CORSFilter.doFilter(CORSFilter.java:65)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler.handleRequest(FilterHandler.java:84)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletChain$1.handleRequest(ServletChain.java:68)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.SecurityContextAssociationHandler.handleRequest(SecurityContextAssociationHandler.java:78)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.keycloak.keycloak-undertow-adapter@15.0.2//org.keycloak.adapters.undertow.UndertowAuthenticatedActionsHandler.handleRequest(UndertowAuthenticatedActionsHandler.java:66)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.RedirectDirHandler.handleRequest(RedirectDirHandler.java:68)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.SSLInformationAssociationHandler.handleRequest(SSLInformationAssociationHandler.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletAuthenticationCallHandler.handleRequest(ServletAuthenticationCallHandler.java:57)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AbstractConfidentialityHandler.handleRequest(AbstractConfidentialityHandler.java:46)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletConfidentialityConstraintHandler.handleRequest(ServletConfidentialityConstraintHandler.java:64)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AuthenticationMechanismsHandler.handleRequest(AuthenticationMechanismsHandler.java:60)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.CachedAuthenticatedSessionHandler.handleRequest(CachedAuthenticatedSessionHandler.java:77)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.NotificationReceiverHandler.handleRequest(NotificationReceiverHandler.java:50)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AbstractSecurityContextAssociationHandler.handleRequest(AbstractSecurityContextAssociationHandler.java:43)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.jacc.JACCContextIdHandler.handleRequest(JACCContextIdHandler.java:61)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.GlobalRequestControllerHandler.handleRequest(GlobalRequestControllerHandler.java:68)
        at org.keycloak.keycloak-undertow-adapter@15.0.2//org.keycloak.adapters.undertow.ServletPreAuthActionsHandler.handleRequest(ServletPreAuthActionsHandler.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.SendErrorPageHandler.handleRequest(SendErrorPageHandler.java:52)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:275)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$100(ServletInitialHandler.java:79)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:134)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:131)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:48)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.SecurityContextThreadSetupAction.lambda$create$0(SecurityContextThreadSetupAction.java:105)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:255)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$000(ServletInitialHandler.java:79)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$1.handleRequest(ServletInitialHandler.java:100)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.Connectors.executeRootHandler(Connectors.java:387)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:852)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at org.jboss.xnio@3.8.7.SP1-redhat-00001//org.xnio.XnioWorker$WorkerThreadFactory$1$1.run(XnioWorker.java:1282)
        at java.base/java.lang.Thread.run(Thread.java:834)
Caused by: java.lang.NullPointerException
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository.findByUriAndHttpMethod(PrivilegeRepository.java:47)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository$$FastClassBySpringCGLIB$$704184f2.invoke(<generated>)
        at deployment.simkt.war//org.springframework.cglib.proxy.MethodProxy.invoke(MethodProxy.java:218)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.invokeJoinpoint(CglibAopProxy.java:793)
        at deployment.simkt.war//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:163)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:763)
        at deployment.simkt.war//org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:137)
        at deployment.simkt.war//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:763)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:708)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository$$EnhancerBySpringCGLIB$$1ab4441b.findByUriAndHttpMethod(<generated>)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService.hasPermissionForRequest(PrivilegeService.java:51)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.filter.PermissionFilter.doFilter(PermissionFilter.java:46)
        ... 71 more

2026-10-13 06:36:37,500 DEBUG [org.springframework.web.servlet.DispatcherServlet] (default task-1) "FORWARD" dispatch for GET "/simkt/error?bi=true", parameters={masked}
2026-10-13 06:36:37,545 DEBUG [org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping] (default task-1) Mapped to org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController#error(HttpServletRequest)
2026-10-13 06:36:37,626 DEBUG [org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor] (default task-1) Using 'application/json', given [application/json, text/plain, */*] and supported [application/json, application/*+json, application/json, application/*+json]
2026-10-13 06:36:37,688 DEBUG [org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor] (default task-1) Writing [{timestamp=Tue Oct 13 06:36:37 BRT 2026, status=500, error=Internal Server Error, path=/simkt/api/v1 (truncated)...]
2026-10-13 06:36:37,726 DEBUG [org.springframework.web.servlet.DispatcherServlet] (default task-1) Exiting from "FORWARD" dispatch, status 500
2026-10-13 08:17:39,590 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-13 08:17:39,590 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 08:17:39,590 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) org.keycloak.KeycloakSecurityContext: eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiJiYTNjMmRmMS05NDQ1LTQ4OTMtODgzNC01NDFlNTBlMjhhNjUiLCJleHAiOjE3OTE4OTA1NDgsIm5iZiI6MCwiaWF0IjoxNzkxODkwMjQ4LCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjMmRkZWRiYy02OTE3LTQyY2YtODlmZi0xNzgwYzBhZDI0NzEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJjbGktd2ViLW1rdCIsIm5vbmNlIjoiNTA2OTAzMjUtNDBiNy00NTNlLTgyOGYtNTA2NzU0YWM1ZTZhIiwiYXV0aF90aW1lIjoxNzkxODkwMjQ3LCJzZXNzaW9uX3N0YXRlIjoiZWQyMGMzMjEtODk1NC00YjEwLWIxYzAtNzI2NzFjODU5MmFkIiwiYWNyIjoiMSIsImFsbG93ZWQtb3JpZ2lucyI6WyIqIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJDTUJfQURNSU5JU1RSQURPUiIsIm9mZmxpbmVfYWNjZXNzIiwiQVVEMDAyNCIsIkNQVV9BVEVORF9HRVNUT1IiLCJHT1RfVU5JREFERVNfR0VSQUwiLCJNS1RfQURNSU5JU1RSQURPUiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQiLCJuYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIFVTRVIgQzA3ODYwOCBDRVNPQiIsInByZWZlcnJlZF91c2VybmFtZSI6ImM4OTE3NzAiLCJnaXZlbl9uYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIiwiZmFtaWx5X25hbWUiOiJVU0VSIEMwNzg2MDggQ0VTT0IifQ.xXWPtvvl4TMZUvnGb2NUr1ckfrve-Zfqm_dw_GvrWPuUUoDPNbsa6dCN6-S10v8xQ7usjdZDWjuTcw4rCdmXQ4xJevOhMLQfeBRB6OVpjfQSBwkfGysc5mzy9twuCBHS8k_kDgyWy9oSaIuyu5xZHTq_ffH-UYxuhTF_15vsDjxIOn0d59t2mrCh6S8htKn1PU7i202ohTO6jnWF0y45pDkTyb8FC18_iEoYEyRzhVyZWMEmEWTbyYoIshWNCVFThRw_ei76XkPScECMqLinOpqgbFAy5o2ps8BXGXP7xtw4HDabvQNe0bdQKU5JIqnUkeB-aOwYI_mSw7nkGckKpg
2026-10-13 08:17:39,590 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 08:17:39,590 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 08:17:39,590 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 08:17:39,590 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 08:17:39,590 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 08:17:39,590 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) SSOAuthenticationService TK: Optional[org.keycloak.representations.AccessToken@5eddc194]
2026-10-13 08:17:39,590 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-13 08:17:39,590 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 08:17:39,592 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) org.keycloak.KeycloakSecurityContext: eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiJiYTNjMmRmMS05NDQ1LTQ4OTMtODgzNC01NDFlNTBlMjhhNjUiLCJleHAiOjE3OTE4OTA1NDgsIm5iZiI6MCwiaWF0IjoxNzkxODkwMjQ4LCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjMmRkZWRiYy02OTE3LTQyY2YtODlmZi0xNzgwYzBhZDI0NzEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJjbGktd2ViLW1rdCIsIm5vbmNlIjoiNTA2OTAzMjUtNDBiNy00NTNlLTgyOGYtNTA2NzU0YWM1ZTZhIiwiYXV0aF90aW1lIjoxNzkxODkwMjQ3LCJzZXNzaW9uX3N0YXRlIjoiZWQyMGMzMjEtODk1NC00YjEwLWIxYzAtNzI2NzFjODU5MmFkIiwiYWNyIjoiMSIsImFsbG93ZWQtb3JpZ2lucyI6WyIqIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJDTUJfQURNSU5JU1RSQURPUiIsIm9mZmxpbmVfYWNjZXNzIiwiQVVEMDAyNCIsIkNQVV9BVEVORF9HRVNUT1IiLCJHT1RfVU5JREFERVNfR0VSQUwiLCJNS1RfQURNSU5JU1RSQURPUiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQiLCJuYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIFVTRVIgQzA3ODYwOCBDRVNPQiIsInByZWZlcnJlZF91c2VybmFtZSI6ImM4OTE3NzAiLCJnaXZlbl9uYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIiwiZmFtaWx5X25hbWUiOiJVU0VSIEMwNzg2MDggQ0VTT0IifQ.xXWPtvvl4TMZUvnGb2NUr1ckfrve-Zfqm_dw_GvrWPuUUoDPNbsa6dCN6-S10v8xQ7usjdZDWjuTcw4rCdmXQ4xJevOhMLQfeBRB6OVpjfQSBwkfGysc5mzy9twuCBHS8k_kDgyWy9oSaIuyu5xZHTq_ffH-UYxuhTF_15vsDjxIOn0d59t2mrCh6S8htKn1PU7i202ohTO6jnWF0y45pDkTyb8FC18_iEoYEyRzhVyZWMEmEWTbyYoIshWNCVFThRw_ei76XkPScECMqLinOpqgbFAy5o2ps8BXGXP7xtw4HDabvQNe0bdQKU5JIqnUkeB-aOwYI_mSw7nkGckKpg
2026-10-13 08:17:39,592 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 08:17:39,592 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 08:17:39,592 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 08:17:39,592 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 08:17:39,592 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 08:17:39,592 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-1) UserDetails: UserDetails(id=ba3c2df1-9445-4893-8834-541e50e28a65, userName=C891770, email=null, firstName=USER C078608 CESOB, lastName=USER C078608 CESOB, roles=[CMB_ADMINISTRADOR, offline_access, AUD0024, CPU_ATEND_GESTOR, GOT_UNIDADES_GERAL, MKT_ADMINISTRADOR, uma_authorization], issuedFor=cli-web-mkt)
2026-10-13 08:17:39,592 ERROR [org.springframework.boot.web.servlet.support.ErrorPageFilter] (default task-1) Forwarding to error page from request [/api/v1/privilege] due to exception [java.lang.NullPointerException]: java.lang.IllegalArgumentException: java.lang.NullPointerException
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.filter.PermissionFilter.doFilter(PermissionFilter.java:52)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.doFilter(ErrorPageFilter.java:126)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.access$000(ErrorPageFilter.java:64)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter$1.doFilterInternal(ErrorPageFilter.java:101)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.doFilter(ErrorPageFilter.java:119)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.filter.CORSFilter.doFilter(CORSFilter.java:65)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler.handleRequest(FilterHandler.java:84)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletChain$1.handleRequest(ServletChain.java:68)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.SecurityContextAssociationHandler.handleRequest(SecurityContextAssociationHandler.java:78)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.keycloak.keycloak-undertow-adapter@15.0.2//org.keycloak.adapters.undertow.UndertowAuthenticatedActionsHandler.handleRequest(UndertowAuthenticatedActionsHandler.java:66)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.RedirectDirHandler.handleRequest(RedirectDirHandler.java:68)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.SSLInformationAssociationHandler.handleRequest(SSLInformationAssociationHandler.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletAuthenticationCallHandler.handleRequest(ServletAuthenticationCallHandler.java:57)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AbstractConfidentialityHandler.handleRequest(AbstractConfidentialityHandler.java:46)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletConfidentialityConstraintHandler.handleRequest(ServletConfidentialityConstraintHandler.java:64)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AuthenticationMechanismsHandler.handleRequest(AuthenticationMechanismsHandler.java:60)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.CachedAuthenticatedSessionHandler.handleRequest(CachedAuthenticatedSessionHandler.java:77)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.NotificationReceiverHandler.handleRequest(NotificationReceiverHandler.java:50)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AbstractSecurityContextAssociationHandler.handleRequest(AbstractSecurityContextAssociationHandler.java:43)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.jacc.JACCContextIdHandler.handleRequest(JACCContextIdHandler.java:61)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.GlobalRequestControllerHandler.handleRequest(GlobalRequestControllerHandler.java:68)
        at org.keycloak.keycloak-undertow-adapter@15.0.2//org.keycloak.adapters.undertow.ServletPreAuthActionsHandler.handleRequest(ServletPreAuthActionsHandler.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.SendErrorPageHandler.handleRequest(SendErrorPageHandler.java:52)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:275)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$100(ServletInitialHandler.java:79)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:134)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:131)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:48)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.SecurityContextThreadSetupAction.lambda$create$0(SecurityContextThreadSetupAction.java:105)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:255)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$000(ServletInitialHandler.java:79)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$1.handleRequest(ServletInitialHandler.java:100)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.Connectors.executeRootHandler(Connectors.java:387)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:852)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at org.jboss.xnio@3.8.7.SP1-redhat-00001//org.xnio.XnioWorker$WorkerThreadFactory$1$1.run(XnioWorker.java:1282)
        at java.base/java.lang.Thread.run(Thread.java:834)
Caused by: java.lang.NullPointerException
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository.findByUriAndHttpMethod(PrivilegeRepository.java:47)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository$$FastClassBySpringCGLIB$$704184f2.invoke(<generated>)
        at deployment.simkt.war//org.springframework.cglib.proxy.MethodProxy.invoke(MethodProxy.java:218)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.invokeJoinpoint(CglibAopProxy.java:793)
        at deployment.simkt.war//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:163)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:763)
        at deployment.simkt.war//org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:137)
        at deployment.simkt.war//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:763)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:708)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository$$EnhancerBySpringCGLIB$$1ab4441b.findByUriAndHttpMethod(<generated>)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService.hasPermissionForRequest(PrivilegeService.java:51)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.filter.PermissionFilter.doFilter(PermissionFilter.java:46)
        ... 71 more

2026-10-13 08:17:39,593 DEBUG [org.springframework.web.servlet.DispatcherServlet] (default task-1) "FORWARD" dispatch for GET "/simkt/error?bi=true", parameters={masked}
2026-10-13 08:17:39,594 DEBUG [org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping] (default task-1) Mapped to org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController#error(HttpServletRequest)
2026-10-13 08:17:39,594 DEBUG [org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor] (default task-1) Using 'application/json', given [application/json, text/plain, */*] and supported [application/json, application/*+json, application/json, application/*+json]
2026-10-13 08:17:39,594 DEBUG [org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor] (default task-1) Writing [{timestamp=Tue Oct 13 08:17:39 BRT 2026, status=500, error=Internal Server Error, path=/simkt/api/v1 (truncated)...]
2026-10-13 08:17:39,595 DEBUG [org.springframework.web.servlet.DispatcherServlet] (default task-1) Exiting from "FORWARD" dispatch, status 500
2026-10-13 09:42:33,932 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-13 09:42:33,932 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 09:42:33,932 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) org.keycloak.KeycloakSecurityContext: eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiJhNjlkYmQ0Ny1jZmI2LTQ5Y2ItYjVmNS0yOWFkMDg5MGRiMTYiLCJleHAiOjE3OTE4OTU2NDMsIm5iZiI6MCwiaWF0IjoxNzkxODk1MzQzLCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjMmRkZWRiYy02OTE3LTQyY2YtODlmZi0xNzgwYzBhZDI0NzEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJjbGktd2ViLW1rdCIsIm5vbmNlIjoiNTk5MzdiYjktNGUxMy00YTlkLWFmNTAtNjgzOTE0MDFjZmQwIiwiYXV0aF90aW1lIjoxNzkxODk1MzQxLCJzZXNzaW9uX3N0YXRlIjoiMjU4Y2QwNDYtNWY3NC00MzAzLWFmMDctOWY4Y2ZiMzdjNTlmIiwiYWNyIjoiMSIsImFsbG93ZWQtb3JpZ2lucyI6WyIqIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJDTUJfQURNSU5JU1RSQURPUiIsIm9mZmxpbmVfYWNjZXNzIiwiQVVEMDAyNCIsIkNQVV9BVEVORF9HRVNUT1IiLCJHT1RfVU5JREFERVNfR0VSQUwiLCJNS1RfQURNSU5JU1RSQURPUiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQiLCJuYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIFVTRVIgQzA3ODYwOCBDRVNPQiIsInByZWZlcnJlZF91c2VybmFtZSI6ImM4OTE3NzAiLCJnaXZlbl9uYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIiwiZmFtaWx5X25hbWUiOiJVU0VSIEMwNzg2MDggQ0VTT0IifQ.IhMsK2i1AmxeCPsBAvVyfB1Ou2tIgN2x8vtSb3u2OJZBZ65o_dLTgC8lKvexfUQ6eSJy4M0V9_FEMHgpVtyj_8GI24xofjHIhP3ddCvIKgLWM2_5nYRlwqIg-P8lMPmn5maY_Cj9VN-RHZDY96Sx5wKVOXq3MXSeQsmpTvFBvX2PsjDxF0Z9T4ogh51M7aESD0nnJXSsKUD-0cRRBJIFtPPgV63y38LnXuZ7NBvUQZseJMxueztY41g4xRpdW2aumbTFnavi4MR4cWV_D-GvlEJGAHkwN6ugFJDK9gjG-IvRzZMpW37HC5bsHMZaAtHHfPUQe8zbEz5GFbavGwMhwg
2026-10-13 09:42:33,932 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 09:42:33,932 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 09:42:33,932 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 09:42:33,933 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 09:42:33,933 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 09:42:33,933 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) SSOAuthenticationService TK: Optional[org.keycloak.representations.AccessToken@14051193]
2026-10-13 09:42:33,933 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-13 09:42:33,933 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 09:42:33,933 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) org.keycloak.KeycloakSecurityContext: eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiJhNjlkYmQ0Ny1jZmI2LTQ5Y2ItYjVmNS0yOWFkMDg5MGRiMTYiLCJleHAiOjE3OTE4OTU2NDMsIm5iZiI6MCwiaWF0IjoxNzkxODk1MzQzLCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjMmRkZWRiYy02OTE3LTQyY2YtODlmZi0xNzgwYzBhZDI0NzEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJjbGktd2ViLW1rdCIsIm5vbmNlIjoiNTk5MzdiYjktNGUxMy00YTlkLWFmNTAtNjgzOTE0MDFjZmQwIiwiYXV0aF90aW1lIjoxNzkxODk1MzQxLCJzZXNzaW9uX3N0YXRlIjoiMjU4Y2QwNDYtNWY3NC00MzAzLWFmMDctOWY4Y2ZiMzdjNTlmIiwiYWNyIjoiMSIsImFsbG93ZWQtb3JpZ2lucyI6WyIqIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJDTUJfQURNSU5JU1RSQURPUiIsIm9mZmxpbmVfYWNjZXNzIiwiQVVEMDAyNCIsIkNQVV9BVEVORF9HRVNUT1IiLCJHT1RfVU5JREFERVNfR0VSQUwiLCJNS1RfQURNSU5JU1RSQURPUiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQiLCJuYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIFVTRVIgQzA3ODYwOCBDRVNPQiIsInByZWZlcnJlZF91c2VybmFtZSI6ImM4OTE3NzAiLCJnaXZlbl9uYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIiwiZmFtaWx5X25hbWUiOiJVU0VSIEMwNzg2MDggQ0VTT0IifQ.IhMsK2i1AmxeCPsBAvVyfB1Ou2tIgN2x8vtSb3u2OJZBZ65o_dLTgC8lKvexfUQ6eSJy4M0V9_FEMHgpVtyj_8GI24xofjHIhP3ddCvIKgLWM2_5nYRlwqIg-P8lMPmn5maY_Cj9VN-RHZDY96Sx5wKVOXq3MXSeQsmpTvFBvX2PsjDxF0Z9T4ogh51M7aESD0nnJXSsKUD-0cRRBJIFtPPgV63y38LnXuZ7NBvUQZseJMxueztY41g4xRpdW2aumbTFnavi4MR4cWV_D-GvlEJGAHkwN6ugFJDK9gjG-IvRzZMpW37HC5bsHMZaAtHHfPUQe8zbEz5GFbavGwMhwg
2026-10-13 09:42:33,933 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 09:42:33,933 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 09:42:33,933 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 09:42:33,933 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 09:42:33,933 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 09:42:33,933 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-1) UserDetails: UserDetails(id=a69dbd47-cfb6-49cb-b5f5-29ad0890db16, userName=C891770, email=null, firstName=USER C078608 CESOB, lastName=USER C078608 CESOB, roles=[CMB_ADMINISTRADOR, offline_access, AUD0024, CPU_ATEND_GESTOR, GOT_UNIDADES_GERAL, MKT_ADMINISTRADOR, uma_authorization], issuedFor=cli-web-mkt)
2026-10-13 09:42:33,933 ERROR [org.springframework.boot.web.servlet.support.ErrorPageFilter] (default task-1) Forwarding to error page from request [/api/v1/privilege] due to exception [java.lang.NullPointerException]: java.lang.IllegalArgumentException: java.lang.NullPointerException
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.filter.PermissionFilter.doFilter(PermissionFilter.java:52)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.doFilter(ErrorPageFilter.java:126)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.access$000(ErrorPageFilter.java:64)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter$1.doFilterInternal(ErrorPageFilter.java:101)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.doFilter(ErrorPageFilter.java:119)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.filter.CORSFilter.doFilter(CORSFilter.java:65)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler.handleRequest(FilterHandler.java:84)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletChain$1.handleRequest(ServletChain.java:68)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.SecurityContextAssociationHandler.handleRequest(SecurityContextAssociationHandler.java:78)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.keycloak.keycloak-undertow-adapter@15.0.2//org.keycloak.adapters.undertow.UndertowAuthenticatedActionsHandler.handleRequest(UndertowAuthenticatedActionsHandler.java:66)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.RedirectDirHandler.handleRequest(RedirectDirHandler.java:68)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.SSLInformationAssociationHandler.handleRequest(SSLInformationAssociationHandler.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletAuthenticationCallHandler.handleRequest(ServletAuthenticationCallHandler.java:57)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AbstractConfidentialityHandler.handleRequest(AbstractConfidentialityHandler.java:46)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletConfidentialityConstraintHandler.handleRequest(ServletConfidentialityConstraintHandler.java:64)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AuthenticationMechanismsHandler.handleRequest(AuthenticationMechanismsHandler.java:60)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.CachedAuthenticatedSessionHandler.handleRequest(CachedAuthenticatedSessionHandler.java:77)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.NotificationReceiverHandler.handleRequest(NotificationReceiverHandler.java:50)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AbstractSecurityContextAssociationHandler.handleRequest(AbstractSecurityContextAssociationHandler.java:43)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.jacc.JACCContextIdHandler.handleRequest(JACCContextIdHandler.java:61)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.GlobalRequestControllerHandler.handleRequest(GlobalRequestControllerHandler.java:68)
        at org.keycloak.keycloak-undertow-adapter@15.0.2//org.keycloak.adapters.undertow.ServletPreAuthActionsHandler.handleRequest(ServletPreAuthActionsHandler.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.SendErrorPageHandler.handleRequest(SendErrorPageHandler.java:52)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:275)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$100(ServletInitialHandler.java:79)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:134)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:131)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:48)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.SecurityContextThreadSetupAction.lambda$create$0(SecurityContextThreadSetupAction.java:105)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:255)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$000(ServletInitialHandler.java:79)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$1.handleRequest(ServletInitialHandler.java:100)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.Connectors.executeRootHandler(Connectors.java:387)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:852)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at org.jboss.xnio@3.8.7.SP1-redhat-00001//org.xnio.XnioWorker$WorkerThreadFactory$1$1.run(XnioWorker.java:1282)
        at java.base/java.lang.Thread.run(Thread.java:834)
Caused by: java.lang.NullPointerException
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository.findByUriAndHttpMethod(PrivilegeRepository.java:47)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository$$FastClassBySpringCGLIB$$704184f2.invoke(<generated>)
        at deployment.simkt.war//org.springframework.cglib.proxy.MethodProxy.invoke(MethodProxy.java:218)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.invokeJoinpoint(CglibAopProxy.java:793)
        at deployment.simkt.war//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:163)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:763)
        at deployment.simkt.war//org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:137)
        at deployment.simkt.war//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:763)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:708)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository$$EnhancerBySpringCGLIB$$1ab4441b.findByUriAndHttpMethod(<generated>)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService.hasPermissionForRequest(PrivilegeService.java:51)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.filter.PermissionFilter.doFilter(PermissionFilter.java:46)
        ... 71 more

2026-10-13 09:42:33,936 DEBUG [org.springframework.web.servlet.DispatcherServlet] (default task-1) "FORWARD" dispatch for GET "/simkt/error?bi=true", parameters={masked}
2026-10-13 09:42:33,936 DEBUG [org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping] (default task-1) Mapped to org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController#error(HttpServletRequest)
2026-10-13 09:42:33,937 DEBUG [org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor] (default task-1) Using 'application/json', given [application/json, text/plain, */*] and supported [application/json, application/*+json, application/json, application/*+json]
2026-10-13 09:42:33,937 DEBUG [org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor] (default task-1) Writing [{timestamp=Tue Oct 13 09:42:33 BRT 2026, status=500, error=Internal Server Error, path=/simkt/api/v1 (truncated)...]
2026-10-13 09:42:33,938 DEBUG [org.springframework.web.servlet.DispatcherServlet] (default task-1) Exiting from "FORWARD" dispatch, status 500
2026-10-13 09:44:50,016 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-13 09:44:50,016 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 09:44:50,016 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) org.keycloak.KeycloakSecurityContext: eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiJkOGMwYmIwMy03MzAxLTQxYjYtOTI5OC0yODA5NGZlNTA2ZTAiLCJleHAiOjE3OTE4OTU3ODksIm5iZiI6MCwiaWF0IjoxNzkxODk1NDg5LCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjMmRkZWRiYy02OTE3LTQyY2YtODlmZi0xNzgwYzBhZDI0NzEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJjbGktd2ViLW1rdCIsIm5vbmNlIjoiY2QyMjNlYzEtNTRlZi00ZGUyLTgyZDUtMDkxZjViYzlhN2VkIiwiYXV0aF90aW1lIjoxNzkxODk1MzQxLCJzZXNzaW9uX3N0YXRlIjoiMjU4Y2QwNDYtNWY3NC00MzAzLWFmMDctOWY4Y2ZiMzdjNTlmIiwiYWNyIjoiMCIsImFsbG93ZWQtb3JpZ2lucyI6WyIqIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJDTUJfQURNSU5JU1RSQURPUiIsIm9mZmxpbmVfYWNjZXNzIiwiQVVEMDAyNCIsIkNQVV9BVEVORF9HRVNUT1IiLCJHT1RfVU5JREFERVNfR0VSQUwiLCJNS1RfQURNSU5JU1RSQURPUiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQiLCJuYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIFVTRVIgQzA3ODYwOCBDRVNPQiIsInByZWZlcnJlZF91c2VybmFtZSI6ImM4OTE3NzAiLCJnaXZlbl9uYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIiwiZmFtaWx5X25hbWUiOiJVU0VSIEMwNzg2MDggQ0VTT0IifQ.MNwr4XSEmXiKzIP-81tAcbgKOqiXx5AX1ieung0eZDmiJ8dVm3v2NOBAgjQJzUBHBvs2-LHSRWQs3WQcWkK1wyYJ_JSCqx9OpNRBL2y_0GKjQxiODCISDohAwcl-VJwtrly83Ea1oF1PcZRhC7PrgHJmOqC3hgQb4F-LFEHwZ-Icej06WiuH40Bwat3NSVB5b3ygC-wary1ZaLqHyTOJW3bF-4H6bGwl1-zqPfZRFQGrk78D8FvyaVIhP1A-tQsspVmIGdjjAYvL7vpI2N2lPVB3OeGGnt6r5ebUndFyJeKcfVEQZnextKnv3kHD4pMn79lxwB3kpsjPx7enK84BFA
2026-10-13 09:44:50,016 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 09:44:50,016 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 09:44:50,016 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 09:44:50,016 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 09:44:50,016 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 09:44:50,016 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) SSOAuthenticationService TK: Optional[org.keycloak.representations.AccessToken@70cf120d]
2026-10-13 09:44:50,016 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-13 09:44:50,016 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 09:44:50,016 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) org.keycloak.KeycloakSecurityContext: eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiJkOGMwYmIwMy03MzAxLTQxYjYtOTI5OC0yODA5NGZlNTA2ZTAiLCJleHAiOjE3OTE4OTU3ODksIm5iZiI6MCwiaWF0IjoxNzkxODk1NDg5LCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjMmRkZWRiYy02OTE3LTQyY2YtODlmZi0xNzgwYzBhZDI0NzEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJjbGktd2ViLW1rdCIsIm5vbmNlIjoiY2QyMjNlYzEtNTRlZi00ZGUyLTgyZDUtMDkxZjViYzlhN2VkIiwiYXV0aF90aW1lIjoxNzkxODk1MzQxLCJzZXNzaW9uX3N0YXRlIjoiMjU4Y2QwNDYtNWY3NC00MzAzLWFmMDctOWY4Y2ZiMzdjNTlmIiwiYWNyIjoiMCIsImFsbG93ZWQtb3JpZ2lucyI6WyIqIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJDTUJfQURNSU5JU1RSQURPUiIsIm9mZmxpbmVfYWNjZXNzIiwiQVVEMDAyNCIsIkNQVV9BVEVORF9HRVNUT1IiLCJHT1RfVU5JREFERVNfR0VSQUwiLCJNS1RfQURNSU5JU1RSQURPUiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQiLCJuYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIFVTRVIgQzA3ODYwOCBDRVNPQiIsInByZWZlcnJlZF91c2VybmFtZSI6ImM4OTE3NzAiLCJnaXZlbl9uYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIiwiZmFtaWx5X25hbWUiOiJVU0VSIEMwNzg2MDggQ0VTT0IifQ.MNwr4XSEmXiKzIP-81tAcbgKOqiXx5AX1ieung0eZDmiJ8dVm3v2NOBAgjQJzUBHBvs2-LHSRWQs3WQcWkK1wyYJ_JSCqx9OpNRBL2y_0GKjQxiODCISDohAwcl-VJwtrly83Ea1oF1PcZRhC7PrgHJmOqC3hgQb4F-LFEHwZ-Icej06WiuH40Bwat3NSVB5b3ygC-wary1ZaLqHyTOJW3bF-4H6bGwl1-zqPfZRFQGrk78D8FvyaVIhP1A-tQsspVmIGdjjAYvL7vpI2N2lPVB3OeGGnt6r5ebUndFyJeKcfVEQZnextKnv3kHD4pMn79lxwB3kpsjPx7enK84BFA
2026-10-13 09:44:50,016 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 09:44:50,016 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 09:44:50,016 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 09:44:50,016 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 09:44:50,016 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 09:44:50,016 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-1) UserDetails: UserDetails(id=d8c0bb03-7301-41b6-9298-28094fe506e0, userName=C891770, email=null, firstName=USER C078608 CESOB, lastName=USER C078608 CESOB, roles=[CMB_ADMINISTRADOR, offline_access, AUD0024, CPU_ATEND_GESTOR, GOT_UNIDADES_GERAL, MKT_ADMINISTRADOR, uma_authorization], issuedFor=cli-web-mkt)
2026-10-13 09:44:50,016 ERROR [org.springframework.boot.web.servlet.support.ErrorPageFilter] (default task-1) Forwarding to error page from request [/api/v1/privilege] due to exception [java.lang.NullPointerException]: java.lang.IllegalArgumentException: java.lang.NullPointerException
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.filter.PermissionFilter.doFilter(PermissionFilter.java:52)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.doFilter(ErrorPageFilter.java:126)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.access$000(ErrorPageFilter.java:64)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter$1.doFilterInternal(ErrorPageFilter.java:101)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.doFilter(ErrorPageFilter.java:119)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.filter.CORSFilter.doFilter(CORSFilter.java:65)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler.handleRequest(FilterHandler.java:84)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletChain$1.handleRequest(ServletChain.java:68)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.SecurityContextAssociationHandler.handleRequest(SecurityContextAssociationHandler.java:78)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.keycloak.keycloak-undertow-adapter@15.0.2//org.keycloak.adapters.undertow.UndertowAuthenticatedActionsHandler.handleRequest(UndertowAuthenticatedActionsHandler.java:66)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.RedirectDirHandler.handleRequest(RedirectDirHandler.java:68)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.SSLInformationAssociationHandler.handleRequest(SSLInformationAssociationHandler.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletAuthenticationCallHandler.handleRequest(ServletAuthenticationCallHandler.java:57)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AbstractConfidentialityHandler.handleRequest(AbstractConfidentialityHandler.java:46)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletConfidentialityConstraintHandler.handleRequest(ServletConfidentialityConstraintHandler.java:64)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AuthenticationMechanismsHandler.handleRequest(AuthenticationMechanismsHandler.java:60)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.CachedAuthenticatedSessionHandler.handleRequest(CachedAuthenticatedSessionHandler.java:77)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.NotificationReceiverHandler.handleRequest(NotificationReceiverHandler.java:50)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AbstractSecurityContextAssociationHandler.handleRequest(AbstractSecurityContextAssociationHandler.java:43)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.jacc.JACCContextIdHandler.handleRequest(JACCContextIdHandler.java:61)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.GlobalRequestControllerHandler.handleRequest(GlobalRequestControllerHandler.java:68)
        at org.keycloak.keycloak-undertow-adapter@15.0.2//org.keycloak.adapters.undertow.ServletPreAuthActionsHandler.handleRequest(ServletPreAuthActionsHandler.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.SendErrorPageHandler.handleRequest(SendErrorPageHandler.java:52)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:275)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$100(ServletInitialHandler.java:79)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:134)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:131)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:48)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.SecurityContextThreadSetupAction.lambda$create$0(SecurityContextThreadSetupAction.java:105)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:255)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$000(ServletInitialHandler.java:79)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$1.handleRequest(ServletInitialHandler.java:100)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.Connectors.executeRootHandler(Connectors.java:387)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:852)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at org.jboss.xnio@3.8.7.SP1-redhat-00001//org.xnio.XnioWorker$WorkerThreadFactory$1$1.run(XnioWorker.java:1282)
        at java.base/java.lang.Thread.run(Thread.java:834)
Caused by: java.lang.NullPointerException
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository.findByUriAndHttpMethod(PrivilegeRepository.java:47)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository$$FastClassBySpringCGLIB$$704184f2.invoke(<generated>)
        at deployment.simkt.war//org.springframework.cglib.proxy.MethodProxy.invoke(MethodProxy.java:218)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.invokeJoinpoint(CglibAopProxy.java:793)
        at deployment.simkt.war//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:163)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:763)
        at deployment.simkt.war//org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:137)
        at deployment.simkt.war//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:763)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:708)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository$$EnhancerBySpringCGLIB$$1ab4441b.findByUriAndHttpMethod(<generated>)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService.hasPermissionForRequest(PrivilegeService.java:51)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.filter.PermissionFilter.doFilter(PermissionFilter.java:46)
        ... 71 more

2026-10-13 09:44:50,017 DEBUG [org.springframework.web.servlet.DispatcherServlet] (default task-1) "FORWARD" dispatch for GET "/simkt/error?bi=true", parameters={masked}
2026-10-13 09:44:50,017 DEBUG [org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping] (default task-1) Mapped to org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController#error(HttpServletRequest)
2026-10-13 09:44:50,018 DEBUG [org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor] (default task-1) Using 'application/json', given [application/json, text/plain, */*] and supported [application/json, application/*+json, application/json, application/*+json]
2026-10-13 09:44:50,018 DEBUG [org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor] (default task-1) Writing [{timestamp=Tue Oct 13 09:44:50 BRT 2026, status=500, error=Internal Server Error, path=/simkt/api/v1 (truncated)...]
2026-10-13 09:44:50,019 DEBUG [org.springframework.web.servlet.DispatcherServlet] (default task-1) Exiting from "FORWARD" dispatch, status 500
2026-10-13 09:44:59,496 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-13 09:44:59,496 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 09:44:59,496 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) org.keycloak.KeycloakSecurityContext: eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiIzNjEzMzY3Yy1lZjBhLTQ2Y2ItOTY3NS02ODIxZmUzMmM5ZmUiLCJleHAiOjE3OTE4OTU3OTksIm5iZiI6MCwiaWF0IjoxNzkxODk1NDk5LCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjMmRkZWRiYy02OTE3LTQyY2YtODlmZi0xNzgwYzBhZDI0NzEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJjbGktd2ViLW1rdCIsIm5vbmNlIjoiZDNlYTJhYWYtNzE5YS00NGE5LWExYjAtOTM4YmY1ZDRiMmM4IiwiYXV0aF90aW1lIjoxNzkxODk1MzQxLCJzZXNzaW9uX3N0YXRlIjoiMjU4Y2QwNDYtNWY3NC00MzAzLWFmMDctOWY4Y2ZiMzdjNTlmIiwiYWNyIjoiMCIsImFsbG93ZWQtb3JpZ2lucyI6WyIqIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJDTUJfQURNSU5JU1RSQURPUiIsIm9mZmxpbmVfYWNjZXNzIiwiQVVEMDAyNCIsIkNQVV9BVEVORF9HRVNUT1IiLCJHT1RfVU5JREFERVNfR0VSQUwiLCJNS1RfQURNSU5JU1RSQURPUiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQiLCJuYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIFVTRVIgQzA3ODYwOCBDRVNPQiIsInByZWZlcnJlZF91c2VybmFtZSI6ImM4OTE3NzAiLCJnaXZlbl9uYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIiwiZmFtaWx5X25hbWUiOiJVU0VSIEMwNzg2MDggQ0VTT0IifQ.cfqy6qiqkhGYq2u36eUF8s7vwobk5DCN3aHcmrMZ6QtiKfQoP8PBFfJOqalUATF0hF7OWhMCIG5jL8LIWe6NAn5eDRJ0t7z8Ul9LtHsTCr2g5trKTKWB0WUptabp9HknTuyMAPUTkEf3BcGRBj0YmlqGbZ3Q8fqJLRpKSJwm2ZyYJka47WjVNgY4nwaefQ58p7ppUmk5N0ghI5hSKgad2ZjspvDx_IGhLovamA8x8f6cYBA0VuWAB9lLK7UPnAU5hb6hZ4EhULihQuAV-QmhYy4q33YYpyzLyPodia6K_6uoRZdquZwA4VEyO4AxBw5sLlbMP7De8qNbhIFNlNdKKA
2026-10-13 09:44:59,496 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 09:44:59,496 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 09:44:59,496 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 09:44:59,496 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 09:44:59,496 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 09:44:59,496 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) SSOAuthenticationService TK: Optional[org.keycloak.representations.AccessToken@1c671ba8]
2026-10-13 09:44:59,496 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-13 09:44:59,496 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 09:44:59,496 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) org.keycloak.KeycloakSecurityContext: eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiIzNjEzMzY3Yy1lZjBhLTQ2Y2ItOTY3NS02ODIxZmUzMmM5ZmUiLCJleHAiOjE3OTE4OTU3OTksIm5iZiI6MCwiaWF0IjoxNzkxODk1NDk5LCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjMmRkZWRiYy02OTE3LTQyY2YtODlmZi0xNzgwYzBhZDI0NzEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJjbGktd2ViLW1rdCIsIm5vbmNlIjoiZDNlYTJhYWYtNzE5YS00NGE5LWExYjAtOTM4YmY1ZDRiMmM4IiwiYXV0aF90aW1lIjoxNzkxODk1MzQxLCJzZXNzaW9uX3N0YXRlIjoiMjU4Y2QwNDYtNWY3NC00MzAzLWFmMDctOWY4Y2ZiMzdjNTlmIiwiYWNyIjoiMCIsImFsbG93ZWQtb3JpZ2lucyI6WyIqIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJDTUJfQURNSU5JU1RSQURPUiIsIm9mZmxpbmVfYWNjZXNzIiwiQVVEMDAyNCIsIkNQVV9BVEVORF9HRVNUT1IiLCJHT1RfVU5JREFERVNfR0VSQUwiLCJNS1RfQURNSU5JU1RSQURPUiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQiLCJuYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIFVTRVIgQzA3ODYwOCBDRVNPQiIsInByZWZlcnJlZF91c2VybmFtZSI6ImM4OTE3NzAiLCJnaXZlbl9uYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIiwiZmFtaWx5X25hbWUiOiJVU0VSIEMwNzg2MDggQ0VTT0IifQ.cfqy6qiqkhGYq2u36eUF8s7vwobk5DCN3aHcmrMZ6QtiKfQoP8PBFfJOqalUATF0hF7OWhMCIG5jL8LIWe6NAn5eDRJ0t7z8Ul9LtHsTCr2g5trKTKWB0WUptabp9HknTuyMAPUTkEf3BcGRBj0YmlqGbZ3Q8fqJLRpKSJwm2ZyYJka47WjVNgY4nwaefQ58p7ppUmk5N0ghI5hSKgad2ZjspvDx_IGhLovamA8x8f6cYBA0VuWAB9lLK7UPnAU5hb6hZ4EhULihQuAV-QmhYy4q33YYpyzLyPodia6K_6uoRZdquZwA4VEyO4AxBw5sLlbMP7De8qNbhIFNlNdKKA
2026-10-13 09:44:59,496 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 09:44:59,496 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 09:44:59,496 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 09:44:59,496 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 09:44:59,496 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 09:44:59,496 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-1) UserDetails: UserDetails(id=3613367c-ef0a-46cb-9675-6821fe32c9fe, userName=C891770, email=null, firstName=USER C078608 CESOB, lastName=USER C078608 CESOB, roles=[CMB_ADMINISTRADOR, offline_access, AUD0024, CPU_ATEND_GESTOR, GOT_UNIDADES_GERAL, MKT_ADMINISTRADOR, uma_authorization], issuedFor=cli-web-mkt)
2026-10-13 09:44:59,497 ERROR [org.springframework.boot.web.servlet.support.ErrorPageFilter] (default task-1) Forwarding to error page from request [/api/v1/privilege] due to exception [java.lang.NullPointerException]: java.lang.IllegalArgumentException: java.lang.NullPointerException
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.filter.PermissionFilter.doFilter(PermissionFilter.java:52)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.doFilter(ErrorPageFilter.java:126)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.access$000(ErrorPageFilter.java:64)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter$1.doFilterInternal(ErrorPageFilter.java:101)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.doFilter(ErrorPageFilter.java:119)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.filter.CORSFilter.doFilter(CORSFilter.java:65)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler.handleRequest(FilterHandler.java:84)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletChain$1.handleRequest(ServletChain.java:68)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.SecurityContextAssociationHandler.handleRequest(SecurityContextAssociationHandler.java:78)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.keycloak.keycloak-undertow-adapter@15.0.2//org.keycloak.adapters.undertow.UndertowAuthenticatedActionsHandler.handleRequest(UndertowAuthenticatedActionsHandler.java:66)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.RedirectDirHandler.handleRequest(RedirectDirHandler.java:68)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.SSLInformationAssociationHandler.handleRequest(SSLInformationAssociationHandler.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletAuthenticationCallHandler.handleRequest(ServletAuthenticationCallHandler.java:57)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AbstractConfidentialityHandler.handleRequest(AbstractConfidentialityHandler.java:46)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletConfidentialityConstraintHandler.handleRequest(ServletConfidentialityConstraintHandler.java:64)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AuthenticationMechanismsHandler.handleRequest(AuthenticationMechanismsHandler.java:60)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.CachedAuthenticatedSessionHandler.handleRequest(CachedAuthenticatedSessionHandler.java:77)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.NotificationReceiverHandler.handleRequest(NotificationReceiverHandler.java:50)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AbstractSecurityContextAssociationHandler.handleRequest(AbstractSecurityContextAssociationHandler.java:43)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.jacc.JACCContextIdHandler.handleRequest(JACCContextIdHandler.java:61)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.GlobalRequestControllerHandler.handleRequest(GlobalRequestControllerHandler.java:68)
        at org.keycloak.keycloak-undertow-adapter@15.0.2//org.keycloak.adapters.undertow.ServletPreAuthActionsHandler.handleRequest(ServletPreAuthActionsHandler.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.SendErrorPageHandler.handleRequest(SendErrorPageHandler.java:52)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:275)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$100(ServletInitialHandler.java:79)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:134)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:131)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:48)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.SecurityContextThreadSetupAction.lambda$create$0(SecurityContextThreadSetupAction.java:105)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:255)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$000(ServletInitialHandler.java:79)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$1.handleRequest(ServletInitialHandler.java:100)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.Connectors.executeRootHandler(Connectors.java:387)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:852)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at org.jboss.xnio@3.8.7.SP1-redhat-00001//org.xnio.XnioWorker$WorkerThreadFactory$1$1.run(XnioWorker.java:1282)
        at java.base/java.lang.Thread.run(Thread.java:834)
Caused by: java.lang.NullPointerException
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository.findByUriAndHttpMethod(PrivilegeRepository.java:47)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository$$FastClassBySpringCGLIB$$704184f2.invoke(<generated>)
        at deployment.simkt.war//org.springframework.cglib.proxy.MethodProxy.invoke(MethodProxy.java:218)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.invokeJoinpoint(CglibAopProxy.java:793)
        at deployment.simkt.war//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:163)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:763)
        at deployment.simkt.war//org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:137)
        at deployment.simkt.war//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:763)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:708)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository$$EnhancerBySpringCGLIB$$1ab4441b.findByUriAndHttpMethod(<generated>)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService.hasPermissionForRequest(PrivilegeService.java:51)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.filter.PermissionFilter.doFilter(PermissionFilter.java:46)
        ... 71 more

2026-10-13 09:44:59,497 DEBUG [org.springframework.web.servlet.DispatcherServlet] (default task-1) "FORWARD" dispatch for GET "/simkt/error?bi=true", parameters={masked}
2026-10-13 09:44:59,498 DEBUG [org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping] (default task-1) Mapped to org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController#error(HttpServletRequest)
2026-10-13 09:44:59,498 DEBUG [org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor] (default task-1) Using 'application/json', given [application/json, text/plain, */*] and supported [application/json, application/*+json, application/json, application/*+json]
2026-10-13 09:44:59,498 DEBUG [org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor] (default task-1) Writing [{timestamp=Tue Oct 13 09:44:59 BRT 2026, status=500, error=Internal Server Error, path=/simkt/api/v1 (truncated)...]
2026-10-13 09:44:59,499 DEBUG [org.springframework.web.servlet.DispatcherServlet] (default task-1) Exiting from "FORWARD" dispatch, status 500
2026-10-13 09:47:19,767 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-13 09:47:19,767 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 09:47:19,767 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) org.keycloak.KeycloakSecurityContext: eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiJiZWEwNzg3Yy0xOTJkLTQ0OGUtYjBmMS1lNGI4ZDMzYTQxMTQiLCJleHAiOjE3OTE4OTU5MzksIm5iZiI6MCwiaWF0IjoxNzkxODk1NjM5LCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjMmRkZWRiYy02OTE3LTQyY2YtODlmZi0xNzgwYzBhZDI0NzEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJjbGktd2ViLW1rdCIsIm5vbmNlIjoiMTA5OGJhMGQtYjNjZi00NGZhLWFlNzQtMTE5MWE3ZDcxNWEyIiwiYXV0aF90aW1lIjoxNzkxODk1MzQxLCJzZXNzaW9uX3N0YXRlIjoiMjU4Y2QwNDYtNWY3NC00MzAzLWFmMDctOWY4Y2ZiMzdjNTlmIiwiYWNyIjoiMCIsImFsbG93ZWQtb3JpZ2lucyI6WyIqIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJDTUJfQURNSU5JU1RSQURPUiIsIm9mZmxpbmVfYWNjZXNzIiwiQVVEMDAyNCIsIkNQVV9BVEVORF9HRVNUT1IiLCJHT1RfVU5JREFERVNfR0VSQUwiLCJNS1RfQURNSU5JU1RSQURPUiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQiLCJuYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIFVTRVIgQzA3ODYwOCBDRVNPQiIsInByZWZlcnJlZF91c2VybmFtZSI6ImM4OTE3NzAiLCJnaXZlbl9uYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIiwiZmFtaWx5X25hbWUiOiJVU0VSIEMwNzg2MDggQ0VTT0IifQ.sf56Xai_rnYbhYI0dMT4LE4jVWJK2hyxksJ2it6ayuomPbmAVNXrGYT400oFyZcO_PIsT1S2hUsmNzeUAy53hF5597tanCReUmb1uAUuwJ0qZjtZP0mIuuz7sQGaXrMw7iUy7Hxa0dfiT6fq-V8Koz-ln0Wj7Yur6jZ6s0u6ZH7rwUL3p13yOqbdVVf1WOkDDGAxsHHfEwLkbTELEA8td5ECs7WucNPCtKSMy3O43cukr0De3YQoftYSrQZzW9-qYOPfxZyl2H3UP4oxoLXaGSgUfprwcvUUHY9_slBj9m8YmvviCDR1oJjxjbqgX0KKYhimVB5_ULrlKlTZfGZf0Q
2026-10-13 09:47:19,767 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 09:47:19,767 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 09:47:19,767 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 09:47:19,767 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 09:47:19,767 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 09:47:19,767 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) SSOAuthenticationService TK: Optional[org.keycloak.representations.AccessToken@21fc8359]
2026-10-13 09:47:19,767 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-13 09:47:19,767 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 09:47:19,767 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) org.keycloak.KeycloakSecurityContext: eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiJiZWEwNzg3Yy0xOTJkLTQ0OGUtYjBmMS1lNGI4ZDMzYTQxMTQiLCJleHAiOjE3OTE4OTU5MzksIm5iZiI6MCwiaWF0IjoxNzkxODk1NjM5LCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjMmRkZWRiYy02OTE3LTQyY2YtODlmZi0xNzgwYzBhZDI0NzEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJjbGktd2ViLW1rdCIsIm5vbmNlIjoiMTA5OGJhMGQtYjNjZi00NGZhLWFlNzQtMTE5MWE3ZDcxNWEyIiwiYXV0aF90aW1lIjoxNzkxODk1MzQxLCJzZXNzaW9uX3N0YXRlIjoiMjU4Y2QwNDYtNWY3NC00MzAzLWFmMDctOWY4Y2ZiMzdjNTlmIiwiYWNyIjoiMCIsImFsbG93ZWQtb3JpZ2lucyI6WyIqIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJDTUJfQURNSU5JU1RSQURPUiIsIm9mZmxpbmVfYWNjZXNzIiwiQVVEMDAyNCIsIkNQVV9BVEVORF9HRVNUT1IiLCJHT1RfVU5JREFERVNfR0VSQUwiLCJNS1RfQURNSU5JU1RSQURPUiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQiLCJuYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIFVTRVIgQzA3ODYwOCBDRVNPQiIsInByZWZlcnJlZF91c2VybmFtZSI6ImM4OTE3NzAiLCJnaXZlbl9uYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIiwiZmFtaWx5X25hbWUiOiJVU0VSIEMwNzg2MDggQ0VTT0IifQ.sf56Xai_rnYbhYI0dMT4LE4jVWJK2hyxksJ2it6ayuomPbmAVNXrGYT400oFyZcO_PIsT1S2hUsmNzeUAy53hF5597tanCReUmb1uAUuwJ0qZjtZP0mIuuz7sQGaXrMw7iUy7Hxa0dfiT6fq-V8Koz-ln0Wj7Yur6jZ6s0u6ZH7rwUL3p13yOqbdVVf1WOkDDGAxsHHfEwLkbTELEA8td5ECs7WucNPCtKSMy3O43cukr0De3YQoftYSrQZzW9-qYOPfxZyl2H3UP4oxoLXaGSgUfprwcvUUHY9_slBj9m8YmvviCDR1oJjxjbqgX0KKYhimVB5_ULrlKlTZfGZf0Q
2026-10-13 09:47:19,767 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 09:47:19,767 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 09:47:19,767 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 09:47:19,767 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 09:47:19,767 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 09:47:19,767 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-1) UserDetails: UserDetails(id=bea0787c-192d-448e-b0f1-e4b8d33a4114, userName=C891770, email=null, firstName=USER C078608 CESOB, lastName=USER C078608 CESOB, roles=[CMB_ADMINISTRADOR, offline_access, AUD0024, CPU_ATEND_GESTOR, GOT_UNIDADES_GERAL, MKT_ADMINISTRADOR, uma_authorization], issuedFor=cli-web-mkt)
2026-10-13 09:47:19,768 ERROR [org.springframework.boot.web.servlet.support.ErrorPageFilter] (default task-1) Forwarding to error page from request [/api/v1/privilege] due to exception [java.lang.NullPointerException]: java.lang.IllegalArgumentException: java.lang.NullPointerException
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.filter.PermissionFilter.doFilter(PermissionFilter.java:52)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.doFilter(ErrorPageFilter.java:126)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.access$000(ErrorPageFilter.java:64)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter$1.doFilterInternal(ErrorPageFilter.java:101)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.doFilter(ErrorPageFilter.java:119)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.filter.CORSFilter.doFilter(CORSFilter.java:65)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler.handleRequest(FilterHandler.java:84)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletChain$1.handleRequest(ServletChain.java:68)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.SecurityContextAssociationHandler.handleRequest(SecurityContextAssociationHandler.java:78)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.keycloak.keycloak-undertow-adapter@15.0.2//org.keycloak.adapters.undertow.UndertowAuthenticatedActionsHandler.handleRequest(UndertowAuthenticatedActionsHandler.java:66)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.RedirectDirHandler.handleRequest(RedirectDirHandler.java:68)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.SSLInformationAssociationHandler.handleRequest(SSLInformationAssociationHandler.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletAuthenticationCallHandler.handleRequest(ServletAuthenticationCallHandler.java:57)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AbstractConfidentialityHandler.handleRequest(AbstractConfidentialityHandler.java:46)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletConfidentialityConstraintHandler.handleRequest(ServletConfidentialityConstraintHandler.java:64)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AuthenticationMechanismsHandler.handleRequest(AuthenticationMechanismsHandler.java:60)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.CachedAuthenticatedSessionHandler.handleRequest(CachedAuthenticatedSessionHandler.java:77)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.NotificationReceiverHandler.handleRequest(NotificationReceiverHandler.java:50)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AbstractSecurityContextAssociationHandler.handleRequest(AbstractSecurityContextAssociationHandler.java:43)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.jacc.JACCContextIdHandler.handleRequest(JACCContextIdHandler.java:61)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.GlobalRequestControllerHandler.handleRequest(GlobalRequestControllerHandler.java:68)
        at org.keycloak.keycloak-undertow-adapter@15.0.2//org.keycloak.adapters.undertow.ServletPreAuthActionsHandler.handleRequest(ServletPreAuthActionsHandler.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.SendErrorPageHandler.handleRequest(SendErrorPageHandler.java:52)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:275)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$100(ServletInitialHandler.java:79)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:134)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:131)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:48)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.SecurityContextThreadSetupAction.lambda$create$0(SecurityContextThreadSetupAction.java:105)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:255)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$000(ServletInitialHandler.java:79)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$1.handleRequest(ServletInitialHandler.java:100)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.Connectors.executeRootHandler(Connectors.java:387)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:852)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at org.jboss.xnio@3.8.7.SP1-redhat-00001//org.xnio.XnioWorker$WorkerThreadFactory$1$1.run(XnioWorker.java:1282)
        at java.base/java.lang.Thread.run(Thread.java:834)
Caused by: java.lang.NullPointerException
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository.findByUriAndHttpMethod(PrivilegeRepository.java:47)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository$$FastClassBySpringCGLIB$$704184f2.invoke(<generated>)
        at deployment.simkt.war//org.springframework.cglib.proxy.MethodProxy.invoke(MethodProxy.java:218)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.invokeJoinpoint(CglibAopProxy.java:793)
        at deployment.simkt.war//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:163)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:763)
        at deployment.simkt.war//org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:137)
        at deployment.simkt.war//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:763)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:708)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository$$EnhancerBySpringCGLIB$$1ab4441b.findByUriAndHttpMethod(<generated>)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService.hasPermissionForRequest(PrivilegeService.java:51)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.filter.PermissionFilter.doFilter(PermissionFilter.java:46)
        ... 71 more

2026-10-13 09:47:19,768 DEBUG [org.springframework.web.servlet.DispatcherServlet] (default task-1) "FORWARD" dispatch for GET "/simkt/error?bi=true", parameters={masked}
2026-10-13 09:47:19,769 DEBUG [org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping] (default task-1) Mapped to org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController#error(HttpServletRequest)
2026-10-13 09:47:19,770 DEBUG [org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor] (default task-1) Using 'application/json', given [application/json, text/plain, */*] and supported [application/json, application/*+json, application/json, application/*+json]
2026-10-13 09:47:19,770 DEBUG [org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor] (default task-1) Writing [{timestamp=Tue Oct 13 09:47:19 BRT 2026, status=500, error=Internal Server Error, path=/simkt/api/v1 (truncated)...]
2026-10-13 09:47:19,770 DEBUG [org.springframework.web.servlet.DispatcherServlet] (default task-1) Exiting from "FORWARD" dispatch, status 500
2026-10-13 09:47:22,551 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-13 09:47:22,551 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 09:47:22,551 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) org.keycloak.KeycloakSecurityContext: eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiIxMjNiZTU1NS05N2U2LTQ3ZjMtODBlNi1hM2IwMzY4OTU1OTQiLCJleHAiOjE3OTE4OTU5NDIsIm5iZiI6MCwiaWF0IjoxNzkxODk1NjQyLCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjMmRkZWRiYy02OTE3LTQyY2YtODlmZi0xNzgwYzBhZDI0NzEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJjbGktd2ViLW1rdCIsIm5vbmNlIjoiMTg1OGUwOGItMTc0OC00ZjJhLTg2NmQtZmU0MjY4NmNjNTU1IiwiYXV0aF90aW1lIjoxNzkxODk1MzQxLCJzZXNzaW9uX3N0YXRlIjoiMjU4Y2QwNDYtNWY3NC00MzAzLWFmMDctOWY4Y2ZiMzdjNTlmIiwiYWNyIjoiMCIsImFsbG93ZWQtb3JpZ2lucyI6WyIqIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJDTUJfQURNSU5JU1RSQURPUiIsIm9mZmxpbmVfYWNjZXNzIiwiQVVEMDAyNCIsIkNQVV9BVEVORF9HRVNUT1IiLCJHT1RfVU5JREFERVNfR0VSQUwiLCJNS1RfQURNSU5JU1RSQURPUiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQiLCJuYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIFVTRVIgQzA3ODYwOCBDRVNPQiIsInByZWZlcnJlZF91c2VybmFtZSI6ImM4OTE3NzAiLCJnaXZlbl9uYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIiwiZmFtaWx5X25hbWUiOiJVU0VSIEMwNzg2MDggQ0VTT0IifQ.FBJOAy_v0YaGz3IzVTYxhCp5csWL-6IlJwntvYt-vt9K4w0PW8N3NUbQIcheF9eK1I6Bqk04A9Nt4PBlTTbiFj9rUCyxiH6ea1D90kK0l0q5PPQBpqDj0f0a0LA0M8qNRClHLYqt5oRSquSneCtoCmADSsl9bM298wrEbrkbYMEwiXlfwMQbEhXC7VjpUNbLGqvAbvGlxAfRCgPL-NyOl_vPAa0qoGzLa9-kkwyA03dsHh-Fg13KKy8jy5fQ9O4L-vrWmexUhWwMqbLqK9q8WDJmSi3waSgJ02tdfzfuTGNwMjPSmNGkEowXE3KDOCdaZYqM6aEkjlPZYVak0rpK2w
2026-10-13 09:47:22,551 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 09:47:22,551 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 09:47:22,551 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 09:47:22,551 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 09:47:22,551 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 09:47:22,551 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) SSOAuthenticationService TK: Optional[org.keycloak.representations.AccessToken@357d84de]
2026-10-13 09:47:22,551 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-13 09:47:22,551 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 09:47:22,551 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) org.keycloak.KeycloakSecurityContext: eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiIxMjNiZTU1NS05N2U2LTQ3ZjMtODBlNi1hM2IwMzY4OTU1OTQiLCJleHAiOjE3OTE4OTU5NDIsIm5iZiI6MCwiaWF0IjoxNzkxODk1NjQyLCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjMmRkZWRiYy02OTE3LTQyY2YtODlmZi0xNzgwYzBhZDI0NzEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJjbGktd2ViLW1rdCIsIm5vbmNlIjoiMTg1OGUwOGItMTc0OC00ZjJhLTg2NmQtZmU0MjY4NmNjNTU1IiwiYXV0aF90aW1lIjoxNzkxODk1MzQxLCJzZXNzaW9uX3N0YXRlIjoiMjU4Y2QwNDYtNWY3NC00MzAzLWFmMDctOWY4Y2ZiMzdjNTlmIiwiYWNyIjoiMCIsImFsbG93ZWQtb3JpZ2lucyI6WyIqIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJDTUJfQURNSU5JU1RSQURPUiIsIm9mZmxpbmVfYWNjZXNzIiwiQVVEMDAyNCIsIkNQVV9BVEVORF9HRVNUT1IiLCJHT1RfVU5JREFERVNfR0VSQUwiLCJNS1RfQURNSU5JU1RSQURPUiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQiLCJuYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIFVTRVIgQzA3ODYwOCBDRVNPQiIsInByZWZlcnJlZF91c2VybmFtZSI6ImM4OTE3NzAiLCJnaXZlbl9uYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIiwiZmFtaWx5X25hbWUiOiJVU0VSIEMwNzg2MDggQ0VTT0IifQ.FBJOAy_v0YaGz3IzVTYxhCp5csWL-6IlJwntvYt-vt9K4w0PW8N3NUbQIcheF9eK1I6Bqk04A9Nt4PBlTTbiFj9rUCyxiH6ea1D90kK0l0q5PPQBpqDj0f0a0LA0M8qNRClHLYqt5oRSquSneCtoCmADSsl9bM298wrEbrkbYMEwiXlfwMQbEhXC7VjpUNbLGqvAbvGlxAfRCgPL-NyOl_vPAa0qoGzLa9-kkwyA03dsHh-Fg13KKy8jy5fQ9O4L-vrWmexUhWwMqbLqK9q8WDJmSi3waSgJ02tdfzfuTGNwMjPSmNGkEowXE3KDOCdaZYqM6aEkjlPZYVak0rpK2w
2026-10-13 09:47:22,551 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 09:47:22,551 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 09:47:22,551 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 09:47:22,551 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 09:47:22,551 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 09:47:22,551 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-1) UserDetails: UserDetails(id=123be555-97e6-47f3-80e6-a3b036895594, userName=C891770, email=null, firstName=USER C078608 CESOB, lastName=USER C078608 CESOB, roles=[CMB_ADMINISTRADOR, offline_access, AUD0024, CPU_ATEND_GESTOR, GOT_UNIDADES_GERAL, MKT_ADMINISTRADOR, uma_authorization], issuedFor=cli-web-mkt)
2026-10-13 09:47:22,551 ERROR [org.springframework.boot.web.servlet.support.ErrorPageFilter] (default task-1) Forwarding to error page from request [/api/v1/privilege] due to exception [java.lang.NullPointerException]: java.lang.IllegalArgumentException: java.lang.NullPointerException
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.filter.PermissionFilter.doFilter(PermissionFilter.java:52)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.doFilter(ErrorPageFilter.java:126)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.access$000(ErrorPageFilter.java:64)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter$1.doFilterInternal(ErrorPageFilter.java:101)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.doFilter(ErrorPageFilter.java:119)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.filter.CORSFilter.doFilter(CORSFilter.java:65)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler.handleRequest(FilterHandler.java:84)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletChain$1.handleRequest(ServletChain.java:68)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.SecurityContextAssociationHandler.handleRequest(SecurityContextAssociationHandler.java:78)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.keycloak.keycloak-undertow-adapter@15.0.2//org.keycloak.adapters.undertow.UndertowAuthenticatedActionsHandler.handleRequest(UndertowAuthenticatedActionsHandler.java:66)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.RedirectDirHandler.handleRequest(RedirectDirHandler.java:68)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.SSLInformationAssociationHandler.handleRequest(SSLInformationAssociationHandler.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletAuthenticationCallHandler.handleRequest(ServletAuthenticationCallHandler.java:57)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AbstractConfidentialityHandler.handleRequest(AbstractConfidentialityHandler.java:46)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletConfidentialityConstraintHandler.handleRequest(ServletConfidentialityConstraintHandler.java:64)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AuthenticationMechanismsHandler.handleRequest(AuthenticationMechanismsHandler.java:60)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.CachedAuthenticatedSessionHandler.handleRequest(CachedAuthenticatedSessionHandler.java:77)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.NotificationReceiverHandler.handleRequest(NotificationReceiverHandler.java:50)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AbstractSecurityContextAssociationHandler.handleRequest(AbstractSecurityContextAssociationHandler.java:43)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.jacc.JACCContextIdHandler.handleRequest(JACCContextIdHandler.java:61)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.GlobalRequestControllerHandler.handleRequest(GlobalRequestControllerHandler.java:68)
        at org.keycloak.keycloak-undertow-adapter@15.0.2//org.keycloak.adapters.undertow.ServletPreAuthActionsHandler.handleRequest(ServletPreAuthActionsHandler.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.SendErrorPageHandler.handleRequest(SendErrorPageHandler.java:52)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:275)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$100(ServletInitialHandler.java:79)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:134)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:131)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:48)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.SecurityContextThreadSetupAction.lambda$create$0(SecurityContextThreadSetupAction.java:105)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:255)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$000(ServletInitialHandler.java:79)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$1.handleRequest(ServletInitialHandler.java:100)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.Connectors.executeRootHandler(Connectors.java:387)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:852)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at org.jboss.xnio@3.8.7.SP1-redhat-00001//org.xnio.XnioWorker$WorkerThreadFactory$1$1.run(XnioWorker.java:1282)
        at java.base/java.lang.Thread.run(Thread.java:834)
Caused by: java.lang.NullPointerException
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository.findByUriAndHttpMethod(PrivilegeRepository.java:47)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository$$FastClassBySpringCGLIB$$704184f2.invoke(<generated>)
        at deployment.simkt.war//org.springframework.cglib.proxy.MethodProxy.invoke(MethodProxy.java:218)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.invokeJoinpoint(CglibAopProxy.java:793)
        at deployment.simkt.war//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:163)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:763)
        at deployment.simkt.war//org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:137)
        at deployment.simkt.war//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:763)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:708)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository$$EnhancerBySpringCGLIB$$1ab4441b.findByUriAndHttpMethod(<generated>)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService.hasPermissionForRequest(PrivilegeService.java:51)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.filter.PermissionFilter.doFilter(PermissionFilter.java:46)
        ... 71 more

2026-10-13 09:47:22,552 DEBUG [org.springframework.web.servlet.DispatcherServlet] (default task-1) "FORWARD" dispatch for GET "/simkt/error?bi=true", parameters={masked}
2026-10-13 09:47:22,552 DEBUG [org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping] (default task-1) Mapped to org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController#error(HttpServletRequest)
2026-10-13 09:47:22,553 DEBUG [org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor] (default task-1) Using 'application/json', given [application/json, text/plain, */*] and supported [application/json, application/*+json, application/json, application/*+json]
2026-10-13 09:47:22,553 DEBUG [org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor] (default task-1) Writing [{timestamp=Tue Oct 13 09:47:22 BRT 2026, status=500, error=Internal Server Error, path=/simkt/api/v1 (truncated)...]
2026-10-13 09:47:22,553 DEBUG [org.springframework.web.servlet.DispatcherServlet] (default task-1) Exiting from "FORWARD" dispatch, status 500
2026-10-13 09:47:33,369 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-13 09:47:33,369 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 09:47:33,369 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) org.keycloak.KeycloakSecurityContext: eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiJkN2NlNDYzNC02NGU5LTRlYTYtYmExNS1jMWQ0ZjU0ZGRhYjgiLCJleHAiOjE3OTE4OTU5NTMsIm5iZiI6MCwiaWF0IjoxNzkxODk1NjUzLCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjMmRkZWRiYy02OTE3LTQyY2YtODlmZi0xNzgwYzBhZDI0NzEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJjbGktd2ViLW1rdCIsIm5vbmNlIjoiOTdmYmU1ZDUtZmMwNy00NGNiLWJlYzUtNWMyMzAyYzNhNTA5IiwiYXV0aF90aW1lIjoxNzkxODk1MzQxLCJzZXNzaW9uX3N0YXRlIjoiMjU4Y2QwNDYtNWY3NC00MzAzLWFmMDctOWY4Y2ZiMzdjNTlmIiwiYWNyIjoiMCIsImFsbG93ZWQtb3JpZ2lucyI6WyIqIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJDTUJfQURNSU5JU1RSQURPUiIsIm9mZmxpbmVfYWNjZXNzIiwiQVVEMDAyNCIsIkNQVV9BVEVORF9HRVNUT1IiLCJHT1RfVU5JREFERVNfR0VSQUwiLCJNS1RfQURNSU5JU1RSQURPUiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQiLCJuYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIFVTRVIgQzA3ODYwOCBDRVNPQiIsInByZWZlcnJlZF91c2VybmFtZSI6ImM4OTE3NzAiLCJnaXZlbl9uYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIiwiZmFtaWx5X25hbWUiOiJVU0VSIEMwNzg2MDggQ0VTT0IifQ.TihuJ2we6X-4VHZp3VTBeJJIBZHFSXuikaKxv_xp5KueKL3d-8JBsV8FwMcJbqUL56Qk9PJtg-AbDC7rqvpoFsWFgcJKuYKJyiB78acM3B67ycjCUrzeGbiZwW9yHigGPOof4JWH_b0UlJlZwyac00JLHLOQvp_2yzvN02ibG8KLNQr2nZWlyhqEmgaMOsa_Yd-ELmkp8eGXpwQsJFA3dbWR5RD2fGVOuy5tnrmTW2jor6Tb_0Y6x6DWREcv4ioUAxQk71jb8VG3yOkyMBzBmahC7ZmSH9xmShSlRk-Vjolr7W0rmerSCrkAYi_d6Y5xzEKtYdFcgq_h9fjioFu-bA
2026-10-13 09:47:33,369 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 09:47:33,369 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 09:47:33,369 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 09:47:33,369 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 09:47:33,369 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 09:47:33,369 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) SSOAuthenticationService TK: Optional[org.keycloak.representations.AccessToken@4196f24]
2026-10-13 09:47:33,369 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-13 09:47:33,369 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 09:47:33,369 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) org.keycloak.KeycloakSecurityContext: eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiJkN2NlNDYzNC02NGU5LTRlYTYtYmExNS1jMWQ0ZjU0ZGRhYjgiLCJleHAiOjE3OTE4OTU5NTMsIm5iZiI6MCwiaWF0IjoxNzkxODk1NjUzLCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjMmRkZWRiYy02OTE3LTQyY2YtODlmZi0xNzgwYzBhZDI0NzEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJjbGktd2ViLW1rdCIsIm5vbmNlIjoiOTdmYmU1ZDUtZmMwNy00NGNiLWJlYzUtNWMyMzAyYzNhNTA5IiwiYXV0aF90aW1lIjoxNzkxODk1MzQxLCJzZXNzaW9uX3N0YXRlIjoiMjU4Y2QwNDYtNWY3NC00MzAzLWFmMDctOWY4Y2ZiMzdjNTlmIiwiYWNyIjoiMCIsImFsbG93ZWQtb3JpZ2lucyI6WyIqIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJDTUJfQURNSU5JU1RSQURPUiIsIm9mZmxpbmVfYWNjZXNzIiwiQVVEMDAyNCIsIkNQVV9BVEVORF9HRVNUT1IiLCJHT1RfVU5JREFERVNfR0VSQUwiLCJNS1RfQURNSU5JU1RSQURPUiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQiLCJuYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIFVTRVIgQzA3ODYwOCBDRVNPQiIsInByZWZlcnJlZF91c2VybmFtZSI6ImM4OTE3NzAiLCJnaXZlbl9uYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIiwiZmFtaWx5X25hbWUiOiJVU0VSIEMwNzg2MDggQ0VTT0IifQ.TihuJ2we6X-4VHZp3VTBeJJIBZHFSXuikaKxv_xp5KueKL3d-8JBsV8FwMcJbqUL56Qk9PJtg-AbDC7rqvpoFsWFgcJKuYKJyiB78acM3B67ycjCUrzeGbiZwW9yHigGPOof4JWH_b0UlJlZwyac00JLHLOQvp_2yzvN02ibG8KLNQr2nZWlyhqEmgaMOsa_Yd-ELmkp8eGXpwQsJFA3dbWR5RD2fGVOuy5tnrmTW2jor6Tb_0Y6x6DWREcv4ioUAxQk71jb8VG3yOkyMBzBmahC7ZmSH9xmShSlRk-Vjolr7W0rmerSCrkAYi_d6Y5xzEKtYdFcgq_h9fjioFu-bA
2026-10-13 09:47:33,369 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 09:47:33,369 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 09:47:33,369 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 09:47:33,369 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 09:47:33,369 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 09:47:33,369 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-1) UserDetails: UserDetails(id=d7ce4634-64e9-4ea6-ba15-c1d4f54ddab8, userName=C891770, email=null, firstName=USER C078608 CESOB, lastName=USER C078608 CESOB, roles=[CMB_ADMINISTRADOR, offline_access, AUD0024, CPU_ATEND_GESTOR, GOT_UNIDADES_GERAL, MKT_ADMINISTRADOR, uma_authorization], issuedFor=cli-web-mkt)
2026-10-13 09:47:33,369 ERROR [org.springframework.boot.web.servlet.support.ErrorPageFilter] (default task-1) Forwarding to error page from request [/api/v1/privilege] due to exception [java.lang.NullPointerException]: java.lang.IllegalArgumentException: java.lang.NullPointerException
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.filter.PermissionFilter.doFilter(PermissionFilter.java:52)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.doFilter(ErrorPageFilter.java:126)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.access$000(ErrorPageFilter.java:64)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter$1.doFilterInternal(ErrorPageFilter.java:101)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.doFilter(ErrorPageFilter.java:119)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.filter.CORSFilter.doFilter(CORSFilter.java:65)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler.handleRequest(FilterHandler.java:84)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletChain$1.handleRequest(ServletChain.java:68)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.SecurityContextAssociationHandler.handleRequest(SecurityContextAssociationHandler.java:78)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.keycloak.keycloak-undertow-adapter@15.0.2//org.keycloak.adapters.undertow.UndertowAuthenticatedActionsHandler.handleRequest(UndertowAuthenticatedActionsHandler.java:66)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.RedirectDirHandler.handleRequest(RedirectDirHandler.java:68)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.SSLInformationAssociationHandler.handleRequest(SSLInformationAssociationHandler.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletAuthenticationCallHandler.handleRequest(ServletAuthenticationCallHandler.java:57)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AbstractConfidentialityHandler.handleRequest(AbstractConfidentialityHandler.java:46)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletConfidentialityConstraintHandler.handleRequest(ServletConfidentialityConstraintHandler.java:64)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AuthenticationMechanismsHandler.handleRequest(AuthenticationMechanismsHandler.java:60)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.CachedAuthenticatedSessionHandler.handleRequest(CachedAuthenticatedSessionHandler.java:77)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.NotificationReceiverHandler.handleRequest(NotificationReceiverHandler.java:50)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AbstractSecurityContextAssociationHandler.handleRequest(AbstractSecurityContextAssociationHandler.java:43)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.jacc.JACCContextIdHandler.handleRequest(JACCContextIdHandler.java:61)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.GlobalRequestControllerHandler.handleRequest(GlobalRequestControllerHandler.java:68)
        at org.keycloak.keycloak-undertow-adapter@15.0.2//org.keycloak.adapters.undertow.ServletPreAuthActionsHandler.handleRequest(ServletPreAuthActionsHandler.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.SendErrorPageHandler.handleRequest(SendErrorPageHandler.java:52)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:275)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$100(ServletInitialHandler.java:79)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:134)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:131)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:48)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.SecurityContextThreadSetupAction.lambda$create$0(SecurityContextThreadSetupAction.java:105)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:255)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$000(ServletInitialHandler.java:79)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$1.handleRequest(ServletInitialHandler.java:100)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.Connectors.executeRootHandler(Connectors.java:387)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:852)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at org.jboss.xnio@3.8.7.SP1-redhat-00001//org.xnio.XnioWorker$WorkerThreadFactory$1$1.run(XnioWorker.java:1282)
        at java.base/java.lang.Thread.run(Thread.java:834)
Caused by: java.lang.NullPointerException
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository.findByUriAndHttpMethod(PrivilegeRepository.java:47)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository$$FastClassBySpringCGLIB$$704184f2.invoke(<generated>)
        at deployment.simkt.war//org.springframework.cglib.proxy.MethodProxy.invoke(MethodProxy.java:218)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.invokeJoinpoint(CglibAopProxy.java:793)
        at deployment.simkt.war//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:163)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:763)
        at deployment.simkt.war//org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:137)
        at deployment.simkt.war//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:763)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:708)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository$$EnhancerBySpringCGLIB$$1ab4441b.findByUriAndHttpMethod(<generated>)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService.hasPermissionForRequest(PrivilegeService.java:51)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.filter.PermissionFilter.doFilter(PermissionFilter.java:46)
        ... 71 more

2026-10-13 09:47:33,370 DEBUG [org.springframework.web.servlet.DispatcherServlet] (default task-1) "FORWARD" dispatch for GET "/simkt/error?bi=true", parameters={masked}
2026-10-13 09:47:33,370 DEBUG [org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping] (default task-1) Mapped to org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController#error(HttpServletRequest)
2026-10-13 09:47:33,371 DEBUG [org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor] (default task-1) Using 'application/json', given [application/json, text/plain, */*] and supported [application/json, application/*+json, application/json, application/*+json]
2026-10-13 09:47:33,371 DEBUG [org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor] (default task-1) Writing [{timestamp=Tue Oct 13 09:47:33 BRT 2026, status=500, error=Internal Server Error, path=/simkt/api/v1 (truncated)...]
2026-10-13 09:47:33,371 DEBUG [org.springframework.web.servlet.DispatcherServlet] (default task-1) Exiting from "FORWARD" dispatch, status 500
2026-10-13 09:47:33,736 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-13 09:47:33,736 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 09:47:33,736 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) org.keycloak.KeycloakSecurityContext: eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiJhMTczZjM5Mi04ZDM5LTQ5Y2QtYjc0Yy1mNTE4N2Q5NmFlOWQiLCJleHAiOjE3OTE4OTU5NTMsIm5iZiI6MCwiaWF0IjoxNzkxODk1NjUzLCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjMmRkZWRiYy02OTE3LTQyY2YtODlmZi0xNzgwYzBhZDI0NzEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJjbGktd2ViLW1rdCIsIm5vbmNlIjoiNmZiYTdjNDMtMzUxMi00ZjI4LTg5Y2ItNGExNzZhMmQ3ZTViIiwiYXV0aF90aW1lIjoxNzkxODk1MzQxLCJzZXNzaW9uX3N0YXRlIjoiMjU4Y2QwNDYtNWY3NC00MzAzLWFmMDctOWY4Y2ZiMzdjNTlmIiwiYWNyIjoiMCIsImFsbG93ZWQtb3JpZ2lucyI6WyIqIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJDTUJfQURNSU5JU1RSQURPUiIsIm9mZmxpbmVfYWNjZXNzIiwiQVVEMDAyNCIsIkNQVV9BVEVORF9HRVNUT1IiLCJHT1RfVU5JREFERVNfR0VSQUwiLCJNS1RfQURNSU5JU1RSQURPUiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQiLCJuYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIFVTRVIgQzA3ODYwOCBDRVNPQiIsInByZWZlcnJlZF91c2VybmFtZSI6ImM4OTE3NzAiLCJnaXZlbl9uYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIiwiZmFtaWx5X25hbWUiOiJVU0VSIEMwNzg2MDggQ0VTT0IifQ.r5JuHV7x52qxqZeweoLS4NRwJKRIf3l-OkP7KW-dE5U07IJWNfk76x1A4QF76ZVCF8RZNdQJjzTBfMQ91SJMs1eOIit6eNue4uB4NDUatPzpbsjG4j0jjaEEVOYyUkCdqZgytcuIDuuX6-V2_jWhH1x9OisIjtB3wURK9AjRpd6todwhcg1n8royCERi2NmwMsVtEnCoxAc8tgL_N0s-c3NzJrTswurq1Lo6VLtrRHwN8btaUOuaRqtb9s939dDWgeKJ5GgKWDUNdAS77RAE8iop5S4W6N7jrmNHwrafrLK23gOcVhaFPBChHn9wTTmosPYTdCKYpjZUvxVMk3ee_w
2026-10-13 09:47:33,736 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 09:47:33,736 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 09:47:33,736 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 09:47:33,736 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 09:47:33,736 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 09:47:33,736 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) SSOAuthenticationService TK: Optional[org.keycloak.representations.AccessToken@57caf53a]
2026-10-13 09:47:33,736 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-13 09:47:33,736 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 09:47:33,736 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) org.keycloak.KeycloakSecurityContext: eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiJhMTczZjM5Mi04ZDM5LTQ5Y2QtYjc0Yy1mNTE4N2Q5NmFlOWQiLCJleHAiOjE3OTE4OTU5NTMsIm5iZiI6MCwiaWF0IjoxNzkxODk1NjUzLCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjMmRkZWRiYy02OTE3LTQyY2YtODlmZi0xNzgwYzBhZDI0NzEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJjbGktd2ViLW1rdCIsIm5vbmNlIjoiNmZiYTdjNDMtMzUxMi00ZjI4LTg5Y2ItNGExNzZhMmQ3ZTViIiwiYXV0aF90aW1lIjoxNzkxODk1MzQxLCJzZXNzaW9uX3N0YXRlIjoiMjU4Y2QwNDYtNWY3NC00MzAzLWFmMDctOWY4Y2ZiMzdjNTlmIiwiYWNyIjoiMCIsImFsbG93ZWQtb3JpZ2lucyI6WyIqIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJDTUJfQURNSU5JU1RSQURPUiIsIm9mZmxpbmVfYWNjZXNzIiwiQVVEMDAyNCIsIkNQVV9BVEVORF9HRVNUT1IiLCJHT1RfVU5JREFERVNfR0VSQUwiLCJNS1RfQURNSU5JU1RSQURPUiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQiLCJuYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIFVTRVIgQzA3ODYwOCBDRVNPQiIsInByZWZlcnJlZF91c2VybmFtZSI6ImM4OTE3NzAiLCJnaXZlbl9uYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIiwiZmFtaWx5X25hbWUiOiJVU0VSIEMwNzg2MDggQ0VTT0IifQ.r5JuHV7x52qxqZeweoLS4NRwJKRIf3l-OkP7KW-dE5U07IJWNfk76x1A4QF76ZVCF8RZNdQJjzTBfMQ91SJMs1eOIit6eNue4uB4NDUatPzpbsjG4j0jjaEEVOYyUkCdqZgytcuIDuuX6-V2_jWhH1x9OisIjtB3wURK9AjRpd6todwhcg1n8royCERi2NmwMsVtEnCoxAc8tgL_N0s-c3NzJrTswurq1Lo6VLtrRHwN8btaUOuaRqtb9s939dDWgeKJ5GgKWDUNdAS77RAE8iop5S4W6N7jrmNHwrafrLK23gOcVhaFPBChHn9wTTmosPYTdCKYpjZUvxVMk3ee_w
2026-10-13 09:47:33,736 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 09:47:33,736 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 09:47:33,736 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 09:47:33,736 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 09:47:33,736 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 09:47:33,736 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-1) UserDetails: UserDetails(id=a173f392-8d39-49cd-b74c-f5187d96ae9d, userName=C891770, email=null, firstName=USER C078608 CESOB, lastName=USER C078608 CESOB, roles=[CMB_ADMINISTRADOR, offline_access, AUD0024, CPU_ATEND_GESTOR, GOT_UNIDADES_GERAL, MKT_ADMINISTRADOR, uma_authorization], issuedFor=cli-web-mkt)
2026-10-13 09:47:33,737 ERROR [org.springframework.boot.web.servlet.support.ErrorPageFilter] (default task-1) Forwarding to error page from request [/api/v1/privilege] due to exception [java.lang.NullPointerException]: java.lang.IllegalArgumentException: java.lang.NullPointerException
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.filter.PermissionFilter.doFilter(PermissionFilter.java:52)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.doFilter(ErrorPageFilter.java:126)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.access$000(ErrorPageFilter.java:64)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter$1.doFilterInternal(ErrorPageFilter.java:101)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.doFilter(ErrorPageFilter.java:119)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.filter.CORSFilter.doFilter(CORSFilter.java:65)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler.handleRequest(FilterHandler.java:84)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletChain$1.handleRequest(ServletChain.java:68)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.SecurityContextAssociationHandler.handleRequest(SecurityContextAssociationHandler.java:78)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.keycloak.keycloak-undertow-adapter@15.0.2//org.keycloak.adapters.undertow.UndertowAuthenticatedActionsHandler.handleRequest(UndertowAuthenticatedActionsHandler.java:66)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.RedirectDirHandler.handleRequest(RedirectDirHandler.java:68)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.SSLInformationAssociationHandler.handleRequest(SSLInformationAssociationHandler.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletAuthenticationCallHandler.handleRequest(ServletAuthenticationCallHandler.java:57)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AbstractConfidentialityHandler.handleRequest(AbstractConfidentialityHandler.java:46)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletConfidentialityConstraintHandler.handleRequest(ServletConfidentialityConstraintHandler.java:64)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AuthenticationMechanismsHandler.handleRequest(AuthenticationMechanismsHandler.java:60)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.CachedAuthenticatedSessionHandler.handleRequest(CachedAuthenticatedSessionHandler.java:77)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.NotificationReceiverHandler.handleRequest(NotificationReceiverHandler.java:50)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AbstractSecurityContextAssociationHandler.handleRequest(AbstractSecurityContextAssociationHandler.java:43)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.jacc.JACCContextIdHandler.handleRequest(JACCContextIdHandler.java:61)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.GlobalRequestControllerHandler.handleRequest(GlobalRequestControllerHandler.java:68)
        at org.keycloak.keycloak-undertow-adapter@15.0.2//org.keycloak.adapters.undertow.ServletPreAuthActionsHandler.handleRequest(ServletPreAuthActionsHandler.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.SendErrorPageHandler.handleRequest(SendErrorPageHandler.java:52)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:275)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$100(ServletInitialHandler.java:79)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:134)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:131)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:48)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.SecurityContextThreadSetupAction.lambda$create$0(SecurityContextThreadSetupAction.java:105)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:255)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$000(ServletInitialHandler.java:79)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$1.handleRequest(ServletInitialHandler.java:100)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.Connectors.executeRootHandler(Connectors.java:387)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:852)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at org.jboss.xnio@3.8.7.SP1-redhat-00001//org.xnio.XnioWorker$WorkerThreadFactory$1$1.run(XnioWorker.java:1282)
        at java.base/java.lang.Thread.run(Thread.java:834)
Caused by: java.lang.NullPointerException
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository.findByUriAndHttpMethod(PrivilegeRepository.java:47)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository$$FastClassBySpringCGLIB$$704184f2.invoke(<generated>)
        at deployment.simkt.war//org.springframework.cglib.proxy.MethodProxy.invoke(MethodProxy.java:218)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.invokeJoinpoint(CglibAopProxy.java:793)
        at deployment.simkt.war//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:163)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:763)
        at deployment.simkt.war//org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:137)
        at deployment.simkt.war//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:763)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:708)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository$$EnhancerBySpringCGLIB$$1ab4441b.findByUriAndHttpMethod(<generated>)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService.hasPermissionForRequest(PrivilegeService.java:51)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.filter.PermissionFilter.doFilter(PermissionFilter.java:46)
        ... 71 more

2026-10-13 09:47:33,737 DEBUG [org.springframework.web.servlet.DispatcherServlet] (default task-1) "FORWARD" dispatch for GET "/simkt/error?bi=true", parameters={masked}
2026-10-13 09:47:33,738 DEBUG [org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping] (default task-1) Mapped to org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController#error(HttpServletRequest)
2026-10-13 09:47:33,738 DEBUG [org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor] (default task-1) Using 'application/json', given [application/json, text/plain, */*] and supported [application/json, application/*+json, application/json, application/*+json]
2026-10-13 09:47:33,738 DEBUG [org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor] (default task-1) Writing [{timestamp=Tue Oct 13 09:47:33 BRT 2026, status=500, error=Internal Server Error, path=/simkt/api/v1 (truncated)...]
2026-10-13 09:47:33,739 DEBUG [org.springframework.web.servlet.DispatcherServlet] (default task-1) Exiting from "FORWARD" dispatch, status 500
2026-10-13 09:47:44,385 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-13 09:47:44,386 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 09:47:44,386 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) org.keycloak.KeycloakSecurityContext: eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiJhN2I0ZDk1OC02NDAzLTQzMjctYjAxYS01MGNmMWY5MjdmOTQiLCJleHAiOjE3OTE4OTU5NjQsIm5iZiI6MCwiaWF0IjoxNzkxODk1NjY0LCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjMmRkZWRiYy02OTE3LTQyY2YtODlmZi0xNzgwYzBhZDI0NzEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJjbGktd2ViLW1rdCIsIm5vbmNlIjoiOGIwMzFlYzctYmY2Ny00ZDAyLTk0NDgtMjQzMDAzM2UwOWU4IiwiYXV0aF90aW1lIjoxNzkxODk1MzQxLCJzZXNzaW9uX3N0YXRlIjoiMjU4Y2QwNDYtNWY3NC00MzAzLWFmMDctOWY4Y2ZiMzdjNTlmIiwiYWNyIjoiMCIsImFsbG93ZWQtb3JpZ2lucyI6WyIqIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJDTUJfQURNSU5JU1RSQURPUiIsIm9mZmxpbmVfYWNjZXNzIiwiQVVEMDAyNCIsIkNQVV9BVEVORF9HRVNUT1IiLCJHT1RfVU5JREFERVNfR0VSQUwiLCJNS1RfQURNSU5JU1RSQURPUiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQiLCJuYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIFVTRVIgQzA3ODYwOCBDRVNPQiIsInByZWZlcnJlZF91c2VybmFtZSI6ImM4OTE3NzAiLCJnaXZlbl9uYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIiwiZmFtaWx5X25hbWUiOiJVU0VSIEMwNzg2MDggQ0VTT0IifQ.iJl8kE3yjZiuyMdr18W6214h9w2urbeZF34N6jKtGNTfUlX4_BnOIu3cF_2I4NjGcqDh4aihtQU5lLVjefuS17wFRZcaW7Xq1R0yC8lQSWVOJ7cXUbGzdqqI5i1XqsBdJGBMkyRg0ehrNJx9XRYbMWGgS-TX3P2kK3lOdQPETsWphv3kwH2vkbWcWkFD08uiH82wrwlLDOHW4nq9AeXitDsLvLAmx4H-snOpt00GvvqSQL-tHytDiT9NPCBT0QehLwXzOlWLy99WtBTfmmdWQlG4KGe1jBnZpSWymhFApKSlOUpPQELUAeoyDK7_91lkgsH-SGYkse8dOjXuXhHlDQ
2026-10-13 09:47:44,386 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 09:47:44,386 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 09:47:44,386 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 09:47:44,386 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 09:47:44,386 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 09:47:44,386 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) SSOAuthenticationService TK: Optional[org.keycloak.representations.AccessToken@f18e07d]
2026-10-13 09:47:44,386 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-13 09:47:44,386 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 09:47:44,386 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) org.keycloak.KeycloakSecurityContext: eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiJhN2I0ZDk1OC02NDAzLTQzMjctYjAxYS01MGNmMWY5MjdmOTQiLCJleHAiOjE3OTE4OTU5NjQsIm5iZiI6MCwiaWF0IjoxNzkxODk1NjY0LCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjMmRkZWRiYy02OTE3LTQyY2YtODlmZi0xNzgwYzBhZDI0NzEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJjbGktd2ViLW1rdCIsIm5vbmNlIjoiOGIwMzFlYzctYmY2Ny00ZDAyLTk0NDgtMjQzMDAzM2UwOWU4IiwiYXV0aF90aW1lIjoxNzkxODk1MzQxLCJzZXNzaW9uX3N0YXRlIjoiMjU4Y2QwNDYtNWY3NC00MzAzLWFmMDctOWY4Y2ZiMzdjNTlmIiwiYWNyIjoiMCIsImFsbG93ZWQtb3JpZ2lucyI6WyIqIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJDTUJfQURNSU5JU1RSQURPUiIsIm9mZmxpbmVfYWNjZXNzIiwiQVVEMDAyNCIsIkNQVV9BVEVORF9HRVNUT1IiLCJHT1RfVU5JREFERVNfR0VSQUwiLCJNS1RfQURNSU5JU1RSQURPUiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQiLCJuYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIFVTRVIgQzA3ODYwOCBDRVNPQiIsInByZWZlcnJlZF91c2VybmFtZSI6ImM4OTE3NzAiLCJnaXZlbl9uYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIiwiZmFtaWx5X25hbWUiOiJVU0VSIEMwNzg2MDggQ0VTT0IifQ.iJl8kE3yjZiuyMdr18W6214h9w2urbeZF34N6jKtGNTfUlX4_BnOIu3cF_2I4NjGcqDh4aihtQU5lLVjefuS17wFRZcaW7Xq1R0yC8lQSWVOJ7cXUbGzdqqI5i1XqsBdJGBMkyRg0ehrNJx9XRYbMWGgS-TX3P2kK3lOdQPETsWphv3kwH2vkbWcWkFD08uiH82wrwlLDOHW4nq9AeXitDsLvLAmx4H-snOpt00GvvqSQL-tHytDiT9NPCBT0QehLwXzOlWLy99WtBTfmmdWQlG4KGe1jBnZpSWymhFApKSlOUpPQELUAeoyDK7_91lkgsH-SGYkse8dOjXuXhHlDQ
2026-10-13 09:47:44,386 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 09:47:44,386 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 09:47:44,386 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 09:47:44,386 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 09:47:44,386 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 09:47:44,386 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-1) UserDetails: UserDetails(id=a7b4d958-6403-4327-b01a-50cf1f927f94, userName=C891770, email=null, firstName=USER C078608 CESOB, lastName=USER C078608 CESOB, roles=[CMB_ADMINISTRADOR, offline_access, AUD0024, CPU_ATEND_GESTOR, GOT_UNIDADES_GERAL, MKT_ADMINISTRADOR, uma_authorization], issuedFor=cli-web-mkt)
2026-10-13 09:47:44,386 ERROR [org.springframework.boot.web.servlet.support.ErrorPageFilter] (default task-1) Forwarding to error page from request [/api/v1/privilege] due to exception [java.lang.NullPointerException]: java.lang.IllegalArgumentException: java.lang.NullPointerException
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.filter.PermissionFilter.doFilter(PermissionFilter.java:52)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.doFilter(ErrorPageFilter.java:126)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.access$000(ErrorPageFilter.java:64)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter$1.doFilterInternal(ErrorPageFilter.java:101)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.doFilter(ErrorPageFilter.java:119)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.filter.CORSFilter.doFilter(CORSFilter.java:65)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler.handleRequest(FilterHandler.java:84)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletChain$1.handleRequest(ServletChain.java:68)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.SecurityContextAssociationHandler.handleRequest(SecurityContextAssociationHandler.java:78)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.keycloak.keycloak-undertow-adapter@15.0.2//org.keycloak.adapters.undertow.UndertowAuthenticatedActionsHandler.handleRequest(UndertowAuthenticatedActionsHandler.java:66)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.RedirectDirHandler.handleRequest(RedirectDirHandler.java:68)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.SSLInformationAssociationHandler.handleRequest(SSLInformationAssociationHandler.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletAuthenticationCallHandler.handleRequest(ServletAuthenticationCallHandler.java:57)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AbstractConfidentialityHandler.handleRequest(AbstractConfidentialityHandler.java:46)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletConfidentialityConstraintHandler.handleRequest(ServletConfidentialityConstraintHandler.java:64)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AuthenticationMechanismsHandler.handleRequest(AuthenticationMechanismsHandler.java:60)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.CachedAuthenticatedSessionHandler.handleRequest(CachedAuthenticatedSessionHandler.java:77)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.NotificationReceiverHandler.handleRequest(NotificationReceiverHandler.java:50)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AbstractSecurityContextAssociationHandler.handleRequest(AbstractSecurityContextAssociationHandler.java:43)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.jacc.JACCContextIdHandler.handleRequest(JACCContextIdHandler.java:61)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.GlobalRequestControllerHandler.handleRequest(GlobalRequestControllerHandler.java:68)
        at org.keycloak.keycloak-undertow-adapter@15.0.2//org.keycloak.adapters.undertow.ServletPreAuthActionsHandler.handleRequest(ServletPreAuthActionsHandler.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.SendErrorPageHandler.handleRequest(SendErrorPageHandler.java:52)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:275)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$100(ServletInitialHandler.java:79)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:134)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:131)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:48)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.SecurityContextThreadSetupAction.lambda$create$0(SecurityContextThreadSetupAction.java:105)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:255)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$000(ServletInitialHandler.java:79)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$1.handleRequest(ServletInitialHandler.java:100)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.Connectors.executeRootHandler(Connectors.java:387)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:852)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at org.jboss.xnio@3.8.7.SP1-redhat-00001//org.xnio.XnioWorker$WorkerThreadFactory$1$1.run(XnioWorker.java:1282)
        at java.base/java.lang.Thread.run(Thread.java:834)
Caused by: java.lang.NullPointerException
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository.findByUriAndHttpMethod(PrivilegeRepository.java:47)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository$$FastClassBySpringCGLIB$$704184f2.invoke(<generated>)
        at deployment.simkt.war//org.springframework.cglib.proxy.MethodProxy.invoke(MethodProxy.java:218)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.invokeJoinpoint(CglibAopProxy.java:793)
        at deployment.simkt.war//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:163)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:763)
        at deployment.simkt.war//org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:137)
        at deployment.simkt.war//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:763)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:708)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository$$EnhancerBySpringCGLIB$$1ab4441b.findByUriAndHttpMethod(<generated>)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService.hasPermissionForRequest(PrivilegeService.java:51)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.filter.PermissionFilter.doFilter(PermissionFilter.java:46)
        ... 71 more

2026-10-13 09:47:44,389 DEBUG [org.springframework.web.servlet.DispatcherServlet] (default task-1) "FORWARD" dispatch for GET "/simkt/error?bi=true", parameters={masked}
2026-10-13 09:47:44,389 DEBUG [org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping] (default task-1) Mapped to org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController#error(HttpServletRequest)
2026-10-13 09:47:44,390 DEBUG [org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor] (default task-1) Using 'application/json', given [application/json, text/plain, */*] and supported [application/json, application/*+json, application/json, application/*+json]
2026-10-13 09:47:44,390 DEBUG [org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor] (default task-1) Writing [{timestamp=Tue Oct 13 09:47:44 BRT 2026, status=500, error=Internal Server Error, path=/simkt/api/v1 (truncated)...]
2026-10-13 09:47:44,391 DEBUG [org.springframework.web.servlet.DispatcherServlet] (default task-1) Exiting from "FORWARD" dispatch, status 500
2026-10-13 10:15:51,452 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-13 10:15:51,452 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 10:15:51,452 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) org.keycloak.KeycloakSecurityContext: eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiI2ZGYxZjFiMi0xMDQ0LTRhNjgtODliNS05NDZkMGUxNDllYmMiLCJleHAiOjE3OTE4OTc2NTAsIm5iZiI6MCwiaWF0IjoxNzkxODk3MzUwLCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjMmRkZWRiYy02OTE3LTQyY2YtODlmZi0xNzgwYzBhZDI0NzEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJjbGktd2ViLW1rdCIsIm5vbmNlIjoiYTk4MDNhYzktZTliMi00YmJjLTg1YjctYjY4N2Y1MTVhOTRiIiwiYXV0aF90aW1lIjoxNzkxODk3MzQ5LCJzZXNzaW9uX3N0YXRlIjoiZjRhZmI4OWEtNjY0YS00Zjg3LTkyMDAtMjIwYTdjYmQ4MjA5IiwiYWNyIjoiMSIsImFsbG93ZWQtb3JpZ2lucyI6WyIqIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJDTUJfQURNSU5JU1RSQURPUiIsIm9mZmxpbmVfYWNjZXNzIiwiQVVEMDAyNCIsIkNQVV9BVEVORF9HRVNUT1IiLCJHT1RfVU5JREFERVNfR0VSQUwiLCJNS1RfQURNSU5JU1RSQURPUiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQiLCJuYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIFVTRVIgQzA3ODYwOCBDRVNPQiIsInByZWZlcnJlZF91c2VybmFtZSI6ImM4OTE3NzAiLCJnaXZlbl9uYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIiwiZmFtaWx5X25hbWUiOiJVU0VSIEMwNzg2MDggQ0VTT0IifQ.EempPhzuRWiFmn1uk7pC_7FLXQaFLBYrUtM07UvXqfRJnzrKVzOz3nP8f_mGzPpAUY0QM2vwJWiW1w86A8MptygFNONlwUerGJd4Ca68G_swkrvw6Thb7FjOKFxAJi_dFN3dpXK29DkyvM5zRxv-zMyzNDgF3E7biQBStrEihbq9Iu4IC7L8jItA9jPO0bfJrVUdYq7pcnUrnIr8_PVgRMyZUepc8PXyBxCJ1n-RVrjiJd4geH3Fe-sEdoSyGR3Yje9-uMpiv8v7TMICBUbfJ5jNS3XCKs0OnkFvXJuAoveQ6bbJoj_K7JRteZskrxChEYFDYtkZ6HISNux9cu65MA
2026-10-13 10:15:51,452 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 10:15:51,452 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 10:15:51,452 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 10:15:51,452 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 10:15:51,452 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 10:15:51,452 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) SSOAuthenticationService TK: Optional[org.keycloak.representations.AccessToken@47a1aea3]
2026-10-13 10:15:51,452 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-13 10:15:51,452 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 10:15:51,452 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) org.keycloak.KeycloakSecurityContext: eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiI2ZGYxZjFiMi0xMDQ0LTRhNjgtODliNS05NDZkMGUxNDllYmMiLCJleHAiOjE3OTE4OTc2NTAsIm5iZiI6MCwiaWF0IjoxNzkxODk3MzUwLCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjMmRkZWRiYy02OTE3LTQyY2YtODlmZi0xNzgwYzBhZDI0NzEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJjbGktd2ViLW1rdCIsIm5vbmNlIjoiYTk4MDNhYzktZTliMi00YmJjLTg1YjctYjY4N2Y1MTVhOTRiIiwiYXV0aF90aW1lIjoxNzkxODk3MzQ5LCJzZXNzaW9uX3N0YXRlIjoiZjRhZmI4OWEtNjY0YS00Zjg3LTkyMDAtMjIwYTdjYmQ4MjA5IiwiYWNyIjoiMSIsImFsbG93ZWQtb3JpZ2lucyI6WyIqIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJDTUJfQURNSU5JU1RSQURPUiIsIm9mZmxpbmVfYWNjZXNzIiwiQVVEMDAyNCIsIkNQVV9BVEVORF9HRVNUT1IiLCJHT1RfVU5JREFERVNfR0VSQUwiLCJNS1RfQURNSU5JU1RSQURPUiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQiLCJuYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIFVTRVIgQzA3ODYwOCBDRVNPQiIsInByZWZlcnJlZF91c2VybmFtZSI6ImM4OTE3NzAiLCJnaXZlbl9uYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIiwiZmFtaWx5X25hbWUiOiJVU0VSIEMwNzg2MDggQ0VTT0IifQ.EempPhzuRWiFmn1uk7pC_7FLXQaFLBYrUtM07UvXqfRJnzrKVzOz3nP8f_mGzPpAUY0QM2vwJWiW1w86A8MptygFNONlwUerGJd4Ca68G_swkrvw6Thb7FjOKFxAJi_dFN3dpXK29DkyvM5zRxv-zMyzNDgF3E7biQBStrEihbq9Iu4IC7L8jItA9jPO0bfJrVUdYq7pcnUrnIr8_PVgRMyZUepc8PXyBxCJ1n-RVrjiJd4geH3Fe-sEdoSyGR3Yje9-uMpiv8v7TMICBUbfJ5jNS3XCKs0OnkFvXJuAoveQ6bbJoj_K7JRteZskrxChEYFDYtkZ6HISNux9cu65MA
2026-10-13 10:15:51,452 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 10:15:51,452 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 10:15:51,452 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 10:15:51,452 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 10:15:51,452 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 10:15:51,453 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-1) UserDetails: UserDetails(id=6df1f1b2-1044-4a68-89b5-946d0e149ebc, userName=C891770, email=null, firstName=USER C078608 CESOB, lastName=USER C078608 CESOB, roles=[CMB_ADMINISTRADOR, offline_access, AUD0024, CPU_ATEND_GESTOR, GOT_UNIDADES_GERAL, MKT_ADMINISTRADOR, uma_authorization], issuedFor=cli-web-mkt)
2026-10-13 10:15:51,453 ERROR [org.springframework.boot.web.servlet.support.ErrorPageFilter] (default task-1) Forwarding to error page from request [/api/v1/privilege] due to exception [java.lang.NullPointerException]: java.lang.IllegalArgumentException: java.lang.NullPointerException
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.filter.PermissionFilter.doFilter(PermissionFilter.java:52)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.doFilter(ErrorPageFilter.java:126)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.access$000(ErrorPageFilter.java:64)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter$1.doFilterInternal(ErrorPageFilter.java:101)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.doFilter(ErrorPageFilter.java:119)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.filter.CORSFilter.doFilter(CORSFilter.java:65)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler.handleRequest(FilterHandler.java:84)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletChain$1.handleRequest(ServletChain.java:68)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.SecurityContextAssociationHandler.handleRequest(SecurityContextAssociationHandler.java:78)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.keycloak.keycloak-undertow-adapter@15.0.2//org.keycloak.adapters.undertow.UndertowAuthenticatedActionsHandler.handleRequest(UndertowAuthenticatedActionsHandler.java:66)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.RedirectDirHandler.handleRequest(RedirectDirHandler.java:68)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.SSLInformationAssociationHandler.handleRequest(SSLInformationAssociationHandler.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletAuthenticationCallHandler.handleRequest(ServletAuthenticationCallHandler.java:57)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AbstractConfidentialityHandler.handleRequest(AbstractConfidentialityHandler.java:46)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletConfidentialityConstraintHandler.handleRequest(ServletConfidentialityConstraintHandler.java:64)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AuthenticationMechanismsHandler.handleRequest(AuthenticationMechanismsHandler.java:60)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.CachedAuthenticatedSessionHandler.handleRequest(CachedAuthenticatedSessionHandler.java:77)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.NotificationReceiverHandler.handleRequest(NotificationReceiverHandler.java:50)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AbstractSecurityContextAssociationHandler.handleRequest(AbstractSecurityContextAssociationHandler.java:43)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.jacc.JACCContextIdHandler.handleRequest(JACCContextIdHandler.java:61)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.GlobalRequestControllerHandler.handleRequest(GlobalRequestControllerHandler.java:68)
        at org.keycloak.keycloak-undertow-adapter@15.0.2//org.keycloak.adapters.undertow.ServletPreAuthActionsHandler.handleRequest(ServletPreAuthActionsHandler.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.SendErrorPageHandler.handleRequest(SendErrorPageHandler.java:52)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:275)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$100(ServletInitialHandler.java:79)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:134)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:131)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:48)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.SecurityContextThreadSetupAction.lambda$create$0(SecurityContextThreadSetupAction.java:105)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:255)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$000(ServletInitialHandler.java:79)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$1.handleRequest(ServletInitialHandler.java:100)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.Connectors.executeRootHandler(Connectors.java:387)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:852)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at org.jboss.xnio@3.8.7.SP1-redhat-00001//org.xnio.XnioWorker$WorkerThreadFactory$1$1.run(XnioWorker.java:1282)
        at java.base/java.lang.Thread.run(Thread.java:834)
Caused by: java.lang.NullPointerException
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository.findByUriAndHttpMethod(PrivilegeRepository.java:47)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository$$FastClassBySpringCGLIB$$704184f2.invoke(<generated>)
        at deployment.simkt.war//org.springframework.cglib.proxy.MethodProxy.invoke(MethodProxy.java:218)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.invokeJoinpoint(CglibAopProxy.java:793)
        at deployment.simkt.war//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:163)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:763)
        at deployment.simkt.war//org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:137)
        at deployment.simkt.war//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:763)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:708)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository$$EnhancerBySpringCGLIB$$1ab4441b.findByUriAndHttpMethod(<generated>)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService.hasPermissionForRequest(PrivilegeService.java:51)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.filter.PermissionFilter.doFilter(PermissionFilter.java:46)
        ... 71 more

2026-10-13 10:15:51,454 DEBUG [org.springframework.web.servlet.DispatcherServlet] (default task-1) "FORWARD" dispatch for GET "/simkt/error?bi=true", parameters={masked}
2026-10-13 10:15:51,456 DEBUG [org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping] (default task-1) Mapped to org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController#error(HttpServletRequest)
2026-10-13 10:15:51,456 DEBUG [org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor] (default task-1) Using 'application/json', given [application/json, text/plain, */*] and supported [application/json, application/*+json, application/json, application/*+json]
2026-10-13 10:15:51,456 DEBUG [org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor] (default task-1) Writing [{timestamp=Tue Oct 13 10:15:51 BRT 2026, status=500, error=Internal Server Error, path=/simkt/api/v1 (truncated)...]
2026-10-13 10:15:51,457 DEBUG [org.springframework.web.servlet.DispatcherServlet] (default task-1) Exiting from "FORWARD" dispatch, status 500
2026-10-13 10:30:06,355 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-13 10:30:06,355 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 10:30:06,355 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) org.keycloak.KeycloakSecurityContext: eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiIzZTdjMGI5Ni1mMzRhLTRhMDYtODNjMC1kZGNjZTg3ZDg2OWQiLCJleHAiOjE3OTE4OTg1MDUsIm5iZiI6MCwiaWF0IjoxNzkxODk4MjA1LCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjMmRkZWRiYy02OTE3LTQyY2YtODlmZi0xNzgwYzBhZDI0NzEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJjbGktd2ViLW1rdCIsIm5vbmNlIjoiYzRiZWQzNzgtZmU0Mi00YzljLTkwNTUtNjlkOTlkMTdhOGViIiwiYXV0aF90aW1lIjoxNzkxODk4MjA0LCJzZXNzaW9uX3N0YXRlIjoiYzE3MTQ5MDQtMmE3Mi00YzYyLWE5YmEtYzJlODU2NjNhMzY1IiwiYWNyIjoiMSIsImFsbG93ZWQtb3JpZ2lucyI6WyIqIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJDTUJfQURNSU5JU1RSQURPUiIsIm9mZmxpbmVfYWNjZXNzIiwiQVVEMDAyNCIsIkNQVV9BVEVORF9HRVNUT1IiLCJHT1RfVU5JREFERVNfR0VSQUwiLCJNS1RfQURNSU5JU1RSQURPUiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQiLCJuYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIFVTRVIgQzA3ODYwOCBDRVNPQiIsInByZWZlcnJlZF91c2VybmFtZSI6ImM4OTE3NzAiLCJnaXZlbl9uYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIiwiZmFtaWx5X25hbWUiOiJVU0VSIEMwNzg2MDggQ0VTT0IifQ.Q4gZHy6wQjuNrBVEmbPlePgyHDvuhSYA7GTZStm2uhcvbDYEiV6DA3A9_7Nnr9me-ALSWXrpXY4RCFC6Gp08u4W4OVQbC0NUehCF0fnFR7merrwThOObnExAfi4tKGkuSlJ2a1l6voLXUfmB6m41cBfKc2clLMfsb-OX78ZpOG0342FHUSRBiXZKEgwtN-G94Ssg9DGdUmNoutIuB3UmOcGHzcYMSWx43QXUPE3srxm_fUoJuMboUyk-j4B6xjWnF4sxm4pr2vTKKJ5Itsvp1ExxoG1ElLHzRMfEXrCABUuZQaFKWLkfsfYKgBXPk5aqlEbqfai3Q98v2iBx2QXIww
2026-10-13 10:30:06,355 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 10:30:06,355 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 10:30:06,355 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 10:30:06,355 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 10:30:06,355 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 10:30:06,355 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) SSOAuthenticationService TK: Optional[org.keycloak.representations.AccessToken@7183eadf]
2026-10-13 10:30:06,355 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-13 10:30:06,355 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 10:30:06,355 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) org.keycloak.KeycloakSecurityContext: eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiIzZTdjMGI5Ni1mMzRhLTRhMDYtODNjMC1kZGNjZTg3ZDg2OWQiLCJleHAiOjE3OTE4OTg1MDUsIm5iZiI6MCwiaWF0IjoxNzkxODk4MjA1LCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjMmRkZWRiYy02OTE3LTQyY2YtODlmZi0xNzgwYzBhZDI0NzEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJjbGktd2ViLW1rdCIsIm5vbmNlIjoiYzRiZWQzNzgtZmU0Mi00YzljLTkwNTUtNjlkOTlkMTdhOGViIiwiYXV0aF90aW1lIjoxNzkxODk4MjA0LCJzZXNzaW9uX3N0YXRlIjoiYzE3MTQ5MDQtMmE3Mi00YzYyLWE5YmEtYzJlODU2NjNhMzY1IiwiYWNyIjoiMSIsImFsbG93ZWQtb3JpZ2lucyI6WyIqIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJDTUJfQURNSU5JU1RSQURPUiIsIm9mZmxpbmVfYWNjZXNzIiwiQVVEMDAyNCIsIkNQVV9BVEVORF9HRVNUT1IiLCJHT1RfVU5JREFERVNfR0VSQUwiLCJNS1RfQURNSU5JU1RSQURPUiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQiLCJuYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIFVTRVIgQzA3ODYwOCBDRVNPQiIsInByZWZlcnJlZF91c2VybmFtZSI6ImM4OTE3NzAiLCJnaXZlbl9uYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIiwiZmFtaWx5X25hbWUiOiJVU0VSIEMwNzg2MDggQ0VTT0IifQ.Q4gZHy6wQjuNrBVEmbPlePgyHDvuhSYA7GTZStm2uhcvbDYEiV6DA3A9_7Nnr9me-ALSWXrpXY4RCFC6Gp08u4W4OVQbC0NUehCF0fnFR7merrwThOObnExAfi4tKGkuSlJ2a1l6voLXUfmB6m41cBfKc2clLMfsb-OX78ZpOG0342FHUSRBiXZKEgwtN-G94Ssg9DGdUmNoutIuB3UmOcGHzcYMSWx43QXUPE3srxm_fUoJuMboUyk-j4B6xjWnF4sxm4pr2vTKKJ5Itsvp1ExxoG1ElLHzRMfEXrCABUuZQaFKWLkfsfYKgBXPk5aqlEbqfai3Q98v2iBx2QXIww
2026-10-13 10:30:06,355 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 10:30:06,355 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 10:30:06,355 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 10:30:06,355 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 10:30:06,355 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 10:30:06,355 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-1) UserDetails: UserDetails(id=3e7c0b96-f34a-4a06-83c0-ddcce87d869d, userName=C891770, email=null, firstName=USER C078608 CESOB, lastName=USER C078608 CESOB, roles=[CMB_ADMINISTRADOR, offline_access, AUD0024, CPU_ATEND_GESTOR, GOT_UNIDADES_GERAL, MKT_ADMINISTRADOR, uma_authorization], issuedFor=cli-web-mkt)
2026-10-13 10:30:06,356 ERROR [org.springframework.boot.web.servlet.support.ErrorPageFilter] (default task-1) Forwarding to error page from request [/api/v1/privilege] due to exception [java.lang.NullPointerException]: java.lang.IllegalArgumentException: java.lang.NullPointerException
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.filter.PermissionFilter.doFilter(PermissionFilter.java:52)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.doFilter(ErrorPageFilter.java:126)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.access$000(ErrorPageFilter.java:64)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter$1.doFilterInternal(ErrorPageFilter.java:101)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.doFilter(ErrorPageFilter.java:119)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.filter.CORSFilter.doFilter(CORSFilter.java:65)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler.handleRequest(FilterHandler.java:84)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletChain$1.handleRequest(ServletChain.java:68)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.SecurityContextAssociationHandler.handleRequest(SecurityContextAssociationHandler.java:78)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.keycloak.keycloak-undertow-adapter@15.0.2//org.keycloak.adapters.undertow.UndertowAuthenticatedActionsHandler.handleRequest(UndertowAuthenticatedActionsHandler.java:66)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.RedirectDirHandler.handleRequest(RedirectDirHandler.java:68)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.SSLInformationAssociationHandler.handleRequest(SSLInformationAssociationHandler.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletAuthenticationCallHandler.handleRequest(ServletAuthenticationCallHandler.java:57)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AbstractConfidentialityHandler.handleRequest(AbstractConfidentialityHandler.java:46)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletConfidentialityConstraintHandler.handleRequest(ServletConfidentialityConstraintHandler.java:64)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AuthenticationMechanismsHandler.handleRequest(AuthenticationMechanismsHandler.java:60)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.CachedAuthenticatedSessionHandler.handleRequest(CachedAuthenticatedSessionHandler.java:77)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.NotificationReceiverHandler.handleRequest(NotificationReceiverHandler.java:50)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AbstractSecurityContextAssociationHandler.handleRequest(AbstractSecurityContextAssociationHandler.java:43)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.jacc.JACCContextIdHandler.handleRequest(JACCContextIdHandler.java:61)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.GlobalRequestControllerHandler.handleRequest(GlobalRequestControllerHandler.java:68)
        at org.keycloak.keycloak-undertow-adapter@15.0.2//org.keycloak.adapters.undertow.ServletPreAuthActionsHandler.handleRequest(ServletPreAuthActionsHandler.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.SendErrorPageHandler.handleRequest(SendErrorPageHandler.java:52)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:275)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$100(ServletInitialHandler.java:79)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:134)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:131)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:48)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.SecurityContextThreadSetupAction.lambda$create$0(SecurityContextThreadSetupAction.java:105)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:255)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$000(ServletInitialHandler.java:79)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$1.handleRequest(ServletInitialHandler.java:100)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.Connectors.executeRootHandler(Connectors.java:387)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:852)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at org.jboss.xnio@3.8.7.SP1-redhat-00001//org.xnio.XnioWorker$WorkerThreadFactory$1$1.run(XnioWorker.java:1282)
        at java.base/java.lang.Thread.run(Thread.java:834)
Caused by: java.lang.NullPointerException
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository.findByUriAndHttpMethod(PrivilegeRepository.java:47)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository$$FastClassBySpringCGLIB$$704184f2.invoke(<generated>)
        at deployment.simkt.war//org.springframework.cglib.proxy.MethodProxy.invoke(MethodProxy.java:218)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.invokeJoinpoint(CglibAopProxy.java:793)
        at deployment.simkt.war//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:163)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:763)
        at deployment.simkt.war//org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:137)
        at deployment.simkt.war//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:763)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:708)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository$$EnhancerBySpringCGLIB$$1ab4441b.findByUriAndHttpMethod(<generated>)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService.hasPermissionForRequest(PrivilegeService.java:51)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.filter.PermissionFilter.doFilter(PermissionFilter.java:46)
        ... 71 more

2026-10-13 10:30:06,356 DEBUG [org.springframework.web.servlet.DispatcherServlet] (default task-1) "FORWARD" dispatch for GET "/simkt/error?bi=true", parameters={masked}
2026-10-13 10:30:06,357 DEBUG [org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping] (default task-1) Mapped to org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController#error(HttpServletRequest)
2026-10-13 10:30:06,362 DEBUG [org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor] (default task-1) Using 'application/json', given [application/json, text/plain, */*] and supported [application/json, application/*+json, application/json, application/*+json]
2026-10-13 10:30:06,362 DEBUG [org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor] (default task-1) Writing [{timestamp=Tue Oct 13 10:30:06 BRT 2026, status=500, error=Internal Server Error, path=/simkt/api/v1 (truncated)...]
2026-10-13 10:30:06,363 DEBUG [org.springframework.web.servlet.DispatcherServlet] (default task-1) Exiting from "FORWARD" dispatch, status 500
2026-10-13 10:35:01,197 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-13 10:35:01,197 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 10:35:01,197 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) org.keycloak.KeycloakSecurityContext: eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiI5MzFhZjQyYy1kZjA5LTQ4NGQtOTZiYy0wMTFmZWUzYmU0MzkiLCJleHAiOjE3OTE4OTg4MDEsIm5iZiI6MCwiaWF0IjoxNzkxODk4NTAxLCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJlMjU3OGY0MC01ZTM2LTQ5N2ItYWYwZS02NjEyNTRiMWUzMGEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJjbGktd2ViLW1rdCIsIm5vbmNlIjoiZmM1MjdmZjItYjhhYy00MTRlLTgyMTUtZGZhNTdiMGU3MDBjIiwiYXV0aF90aW1lIjoxNzkxODk4NTAwLCJzZXNzaW9uX3N0YXRlIjoiNjU4ZjBhYTctOWRkOC00ZjhjLWE5MzctMDZkZmZjMzRkZTFjIiwiYWNyIjoiMSIsImFsbG93ZWQtb3JpZ2lucyI6WyIqIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJvZmZsaW5lX2FjY2VzcyIsInVtYV9hdXRob3JpemF0aW9uIiwiUEdDMDAwMiJdfSwicmVzb3VyY2VfYWNjZXNzIjp7ImFjY291bnQiOnsicm9sZXMiOlsibWFuYWdlLWFjY291bnQiLCJtYW5hZ2UtYWNjb3VudC1saW5rcyIsInZpZXctcHJvZmlsZSJdfX0sInNjb3BlIjoib3BlbmlkIiwibmFtZSI6IlJBRkFFTCBBVUdVU1RPIFNPQVJFUyBTT0FSRVMiLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJjMTEyMTQxIiwiZ2l2ZW5fbmFtZSI6IlJBRkFFTCBBVUdVU1RPIFNPQVJFUyIsImZhbWlseV9uYW1lIjoiU09BUkVTIiwiZW1haWwiOiJyYWZhZWwuYS5zb2FyZXNAY2FpeGEuZ292LmJyIn0.FrZhMsYa1hXGzXoRL1vx1w-hSvbSBahmDC0XCm6MMJir0FhxezQpwhPX5h5jT6uZHQzQminanaQCZXmZ1np_8Wcd2ssJRU85i3VW9uTybWJRSBuZTdS1t0DQ_x4Zc1RlrAarqOdxFdGviFAX5I4jNnTh6zFUWVw7cyGJ5SIS3ZCIx8OW_kNruUcJswKggRnTw5HN7KItUWSad8f9x8CoR6eygyU1ITgPQMn16v-IsdlVoGzqXKMwfT4oW4BMSLyg2SP58Re8-rHcKZHt3EJELr2ksjV1IJJSEzLjPyQxIODJjd0DszurBlvLMnDdj8dGGjAT2kyi95HEZr88qlu0sQ
2026-10-13 10:35:01,197 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 10:35:01,197 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 10:35:01,197 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 10:35:01,201 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 10:35:01,201 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 10:35:01,201 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) SSOAuthenticationService TK: Optional[org.keycloak.representations.AccessToken@6b8d82dc]
2026-10-13 10:35:01,201 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-13 10:35:01,201 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 10:35:01,201 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) org.keycloak.KeycloakSecurityContext: eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiI5MzFhZjQyYy1kZjA5LTQ4NGQtOTZiYy0wMTFmZWUzYmU0MzkiLCJleHAiOjE3OTE4OTg4MDEsIm5iZiI6MCwiaWF0IjoxNzkxODk4NTAxLCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJlMjU3OGY0MC01ZTM2LTQ5N2ItYWYwZS02NjEyNTRiMWUzMGEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJjbGktd2ViLW1rdCIsIm5vbmNlIjoiZmM1MjdmZjItYjhhYy00MTRlLTgyMTUtZGZhNTdiMGU3MDBjIiwiYXV0aF90aW1lIjoxNzkxODk4NTAwLCJzZXNzaW9uX3N0YXRlIjoiNjU4ZjBhYTctOWRkOC00ZjhjLWE5MzctMDZkZmZjMzRkZTFjIiwiYWNyIjoiMSIsImFsbG93ZWQtb3JpZ2lucyI6WyIqIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJvZmZsaW5lX2FjY2VzcyIsInVtYV9hdXRob3JpemF0aW9uIiwiUEdDMDAwMiJdfSwicmVzb3VyY2VfYWNjZXNzIjp7ImFjY291bnQiOnsicm9sZXMiOlsibWFuYWdlLWFjY291bnQiLCJtYW5hZ2UtYWNjb3VudC1saW5rcyIsInZpZXctcHJvZmlsZSJdfX0sInNjb3BlIjoib3BlbmlkIiwibmFtZSI6IlJBRkFFTCBBVUdVU1RPIFNPQVJFUyBTT0FSRVMiLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJjMTEyMTQxIiwiZ2l2ZW5fbmFtZSI6IlJBRkFFTCBBVUdVU1RPIFNPQVJFUyIsImZhbWlseV9uYW1lIjoiU09BUkVTIiwiZW1haWwiOiJyYWZhZWwuYS5zb2FyZXNAY2FpeGEuZ292LmJyIn0.FrZhMsYa1hXGzXoRL1vx1w-hSvbSBahmDC0XCm6MMJir0FhxezQpwhPX5h5jT6uZHQzQminanaQCZXmZ1np_8Wcd2ssJRU85i3VW9uTybWJRSBuZTdS1t0DQ_x4Zc1RlrAarqOdxFdGviFAX5I4jNnTh6zFUWVw7cyGJ5SIS3ZCIx8OW_kNruUcJswKggRnTw5HN7KItUWSad8f9x8CoR6eygyU1ITgPQMn16v-IsdlVoGzqXKMwfT4oW4BMSLyg2SP58Re8-rHcKZHt3EJELr2ksjV1IJJSEzLjPyQxIODJjd0DszurBlvLMnDdj8dGGjAT2kyi95HEZr88qlu0sQ
2026-10-13 10:35:01,201 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 10:35:01,201 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 10:35:01,201 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 10:35:01,201 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 10:35:01,201 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 10:35:01,201 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-1) UserDetails: UserDetails(id=931af42c-df09-484d-96bc-011fee3be439, userName=C112141, email=rafael.a.soares@caixa.gov.br, firstName=RAFAEL AUGUSTO SOARES, lastName=SOARES, roles=[offline_access, uma_authorization, PGC0002], issuedFor=cli-web-mkt)
2026-10-13 10:35:01,201 ERROR [org.springframework.boot.web.servlet.support.ErrorPageFilter] (default task-1) Forwarding to error page from request [/api/v1/privilege] due to exception [java.lang.NullPointerException]: java.lang.IllegalArgumentException: java.lang.NullPointerException
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.filter.PermissionFilter.doFilter(PermissionFilter.java:52)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.doFilter(ErrorPageFilter.java:126)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.access$000(ErrorPageFilter.java:64)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter$1.doFilterInternal(ErrorPageFilter.java:101)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.doFilter(ErrorPageFilter.java:119)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.filter.CORSFilter.doFilter(CORSFilter.java:65)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler.handleRequest(FilterHandler.java:84)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletChain$1.handleRequest(ServletChain.java:68)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.SecurityContextAssociationHandler.handleRequest(SecurityContextAssociationHandler.java:78)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.keycloak.keycloak-undertow-adapter@15.0.2//org.keycloak.adapters.undertow.UndertowAuthenticatedActionsHandler.handleRequest(UndertowAuthenticatedActionsHandler.java:66)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.RedirectDirHandler.handleRequest(RedirectDirHandler.java:68)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.SSLInformationAssociationHandler.handleRequest(SSLInformationAssociationHandler.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletAuthenticationCallHandler.handleRequest(ServletAuthenticationCallHandler.java:57)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AbstractConfidentialityHandler.handleRequest(AbstractConfidentialityHandler.java:46)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletConfidentialityConstraintHandler.handleRequest(ServletConfidentialityConstraintHandler.java:64)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AuthenticationMechanismsHandler.handleRequest(AuthenticationMechanismsHandler.java:60)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.CachedAuthenticatedSessionHandler.handleRequest(CachedAuthenticatedSessionHandler.java:77)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.NotificationReceiverHandler.handleRequest(NotificationReceiverHandler.java:50)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AbstractSecurityContextAssociationHandler.handleRequest(AbstractSecurityContextAssociationHandler.java:43)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.jacc.JACCContextIdHandler.handleRequest(JACCContextIdHandler.java:61)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.GlobalRequestControllerHandler.handleRequest(GlobalRequestControllerHandler.java:68)
        at org.keycloak.keycloak-undertow-adapter@15.0.2//org.keycloak.adapters.undertow.ServletPreAuthActionsHandler.handleRequest(ServletPreAuthActionsHandler.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.SendErrorPageHandler.handleRequest(SendErrorPageHandler.java:52)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:275)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$100(ServletInitialHandler.java:79)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:134)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:131)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:48)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.SecurityContextThreadSetupAction.lambda$create$0(SecurityContextThreadSetupAction.java:105)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:255)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$000(ServletInitialHandler.java:79)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$1.handleRequest(ServletInitialHandler.java:100)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.Connectors.executeRootHandler(Connectors.java:387)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:852)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at org.jboss.xnio@3.8.7.SP1-redhat-00001//org.xnio.XnioWorker$WorkerThreadFactory$1$1.run(XnioWorker.java:1282)
        at java.base/java.lang.Thread.run(Thread.java:834)
Caused by: java.lang.NullPointerException
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository.findByUriAndHttpMethod(PrivilegeRepository.java:47)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository$$FastClassBySpringCGLIB$$704184f2.invoke(<generated>)
        at deployment.simkt.war//org.springframework.cglib.proxy.MethodProxy.invoke(MethodProxy.java:218)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.invokeJoinpoint(CglibAopProxy.java:793)
        at deployment.simkt.war//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:163)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:763)
        at deployment.simkt.war//org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:137)
        at deployment.simkt.war//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:763)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:708)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository$$EnhancerBySpringCGLIB$$1ab4441b.findByUriAndHttpMethod(<generated>)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService.hasPermissionForRequest(PrivilegeService.java:51)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.filter.PermissionFilter.doFilter(PermissionFilter.java:46)
        ... 71 more

2026-10-13 10:35:01,202 DEBUG [org.springframework.web.servlet.DispatcherServlet] (default task-1) "FORWARD" dispatch for GET "/simkt/error?bi=true", parameters={masked}
2026-10-13 10:35:01,203 DEBUG [org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping] (default task-1) Mapped to org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController#error(HttpServletRequest)
2026-10-13 10:35:01,204 DEBUG [org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor] (default task-1) Using 'application/json', given [application/json, text/plain, */*] and supported [application/json, application/*+json, application/json, application/*+json]
2026-10-13 10:35:01,204 DEBUG [org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor] (default task-1) Writing [{timestamp=Tue Oct 13 10:35:01 BRT 2026, status=500, error=Internal Server Error, path=/simkt/api/v1 (truncated)...]
2026-10-13 10:35:01,205 DEBUG [org.springframework.web.servlet.DispatcherServlet] (default task-1) Exiting from "FORWARD" dispatch, status 500
2026-10-13 10:39:58,852 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-13 10:39:58,853 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 10:39:58,853 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) org.keycloak.KeycloakSecurityContext: eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiJmN2Q4MjQyNy01MGYxLTQyMjItYWNjNi01YWM2NzJmYzRjNmQiLCJleHAiOjE3OTE4OTkwOTgsIm5iZiI6MCwiaWF0IjoxNzkxODk4Nzk4LCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjMmRkZWRiYy02OTE3LTQyY2YtODlmZi0xNzgwYzBhZDI0NzEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJjbGktd2ViLW1rdCIsIm5vbmNlIjoiMjg4YTNhMjAtZTQxYy00NWY5LWEyMmUtYTQyMjU0ZTgzYjY1IiwiYXV0aF90aW1lIjoxNzkxODk4MjA0LCJzZXNzaW9uX3N0YXRlIjoiYzE3MTQ5MDQtMmE3Mi00YzYyLWE5YmEtYzJlODU2NjNhMzY1IiwiYWNyIjoiMCIsImFsbG93ZWQtb3JpZ2lucyI6WyIqIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJDTUJfQURNSU5JU1RSQURPUiIsIm9mZmxpbmVfYWNjZXNzIiwiQVVEMDAyNCIsIkNQVV9BVEVORF9HRVNUT1IiLCJHT1RfVU5JREFERVNfR0VSQUwiLCJNS1RfQURNSU5JU1RSQURPUiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQiLCJuYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIFVTRVIgQzA3ODYwOCBDRVNPQiIsInByZWZlcnJlZF91c2VybmFtZSI6ImM4OTE3NzAiLCJnaXZlbl9uYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIiwiZmFtaWx5X25hbWUiOiJVU0VSIEMwNzg2MDggQ0VTT0IifQ.A5EAxDa_7ucF2DWZHe-bfURIebgsDus6d2UOvVUn9P5sS4jPA8eXTJgfv5pIo9KjVW-I98XskBGoC1jnmoDhTeeecKkoFfNWNh32O4gELiFi1RM88SsK7gvTl_4gAcpK6atrzcQHh_Qo2pu3kDxjka4dtoiTzr4eoWDAgK89Dr_cDjhWuDqhG7giFIofpkYk52biCxZ2JqmxqxsqllgZgtq8i2ktb7VvjDpixSrXhTADElvpWkjS8qs3uYjeLlTdbLpj4bjjUiUfVxfLkt3Q8r5OZAhG3L6ml1X2AAdr49ZhXBrA8jVCYFjvSwNBhl9Tf8w1R7Lj5SiDxQkiTj0wbg
2026-10-13 10:39:58,853 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 10:39:58,853 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 10:39:58,853 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 10:39:58,853 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 10:39:58,853 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 10:39:58,853 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) SSOAuthenticationService TK: Optional[org.keycloak.representations.AccessToken@3bac082c]
2026-10-13 10:39:58,853 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-13 10:39:58,853 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 10:39:58,853 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) org.keycloak.KeycloakSecurityContext: eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiJmN2Q4MjQyNy01MGYxLTQyMjItYWNjNi01YWM2NzJmYzRjNmQiLCJleHAiOjE3OTE4OTkwOTgsIm5iZiI6MCwiaWF0IjoxNzkxODk4Nzk4LCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjMmRkZWRiYy02OTE3LTQyY2YtODlmZi0xNzgwYzBhZDI0NzEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJjbGktd2ViLW1rdCIsIm5vbmNlIjoiMjg4YTNhMjAtZTQxYy00NWY5LWEyMmUtYTQyMjU0ZTgzYjY1IiwiYXV0aF90aW1lIjoxNzkxODk4MjA0LCJzZXNzaW9uX3N0YXRlIjoiYzE3MTQ5MDQtMmE3Mi00YzYyLWE5YmEtYzJlODU2NjNhMzY1IiwiYWNyIjoiMCIsImFsbG93ZWQtb3JpZ2lucyI6WyIqIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJDTUJfQURNSU5JU1RSQURPUiIsIm9mZmxpbmVfYWNjZXNzIiwiQVVEMDAyNCIsIkNQVV9BVEVORF9HRVNUT1IiLCJHT1RfVU5JREFERVNfR0VSQUwiLCJNS1RfQURNSU5JU1RSQURPUiIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQiLCJuYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIFVTRVIgQzA3ODYwOCBDRVNPQiIsInByZWZlcnJlZF91c2VybmFtZSI6ImM4OTE3NzAiLCJnaXZlbl9uYW1lIjoiVVNFUiBDMDc4NjA4IENFU09CIiwiZmFtaWx5X25hbWUiOiJVU0VSIEMwNzg2MDggQ0VTT0IifQ.A5EAxDa_7ucF2DWZHe-bfURIebgsDus6d2UOvVUn9P5sS4jPA8eXTJgfv5pIo9KjVW-I98XskBGoC1jnmoDhTeeecKkoFfNWNh32O4gELiFi1RM88SsK7gvTl_4gAcpK6atrzcQHh_Qo2pu3kDxjka4dtoiTzr4eoWDAgK89Dr_cDjhWuDqhG7giFIofpkYk52biCxZ2JqmxqxsqllgZgtq8i2ktb7VvjDpixSrXhTADElvpWkjS8qs3uYjeLlTdbLpj4bjjUiUfVxfLkt3Q8r5OZAhG3L6ml1X2AAdr49ZhXBrA8jVCYFjvSwNBhl9Tf8w1R7Lj5SiDxQkiTj0wbg
2026-10-13 10:39:58,853 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 10:39:58,853 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 10:39:58,853 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 10:39:58,853 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 10:39:58,853 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 10:39:58,853 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-1) UserDetails: UserDetails(id=f7d82427-50f1-4222-acc6-5ac672fc4c6d, userName=C891770, email=null, firstName=USER C078608 CESOB, lastName=USER C078608 CESOB, roles=[CMB_ADMINISTRADOR, offline_access, AUD0024, CPU_ATEND_GESTOR, GOT_UNIDADES_GERAL, MKT_ADMINISTRADOR, uma_authorization], issuedFor=cli-web-mkt)
2026-10-13 10:39:58,853 ERROR [org.springframework.boot.web.servlet.support.ErrorPageFilter] (default task-1) Forwarding to error page from request [/api/v1/privilege] due to exception [java.lang.NullPointerException]: java.lang.IllegalArgumentException: java.lang.NullPointerException
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.filter.PermissionFilter.doFilter(PermissionFilter.java:52)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.doFilter(ErrorPageFilter.java:126)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.access$000(ErrorPageFilter.java:64)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter$1.doFilterInternal(ErrorPageFilter.java:101)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at deployment.simkt.war//org.springframework.boot.web.servlet.support.ErrorPageFilter.doFilter(ErrorPageFilter.java:119)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201)
        at deployment.simkt.war//org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.filter.CORSFilter.doFilter(CORSFilter.java:65)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ManagedFilter.doFilter(ManagedFilter.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler$FilterChainImpl.doFilter(FilterHandler.java:131)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.FilterHandler.handleRequest(FilterHandler.java:84)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletSecurityRoleHandler.handleRequest(ServletSecurityRoleHandler.java:62)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletChain$1.handleRequest(ServletChain.java:68)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletDispatchingHandler.handleRequest(ServletDispatchingHandler.java:36)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.SecurityContextAssociationHandler.handleRequest(SecurityContextAssociationHandler.java:78)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.keycloak.keycloak-undertow-adapter@15.0.2//org.keycloak.adapters.undertow.UndertowAuthenticatedActionsHandler.handleRequest(UndertowAuthenticatedActionsHandler.java:66)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.RedirectDirHandler.handleRequest(RedirectDirHandler.java:68)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.SSLInformationAssociationHandler.handleRequest(SSLInformationAssociationHandler.java:117)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletAuthenticationCallHandler.handleRequest(ServletAuthenticationCallHandler.java:57)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AbstractConfidentialityHandler.handleRequest(AbstractConfidentialityHandler.java:46)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.ServletConfidentialityConstraintHandler.handleRequest(ServletConfidentialityConstraintHandler.java:64)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AuthenticationMechanismsHandler.handleRequest(AuthenticationMechanismsHandler.java:60)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.security.CachedAuthenticatedSessionHandler.handleRequest(CachedAuthenticatedSessionHandler.java:77)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.NotificationReceiverHandler.handleRequest(NotificationReceiverHandler.java:50)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.security.handlers.AbstractSecurityContextAssociationHandler.handleRequest(AbstractSecurityContextAssociationHandler.java:43)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.jacc.JACCContextIdHandler.handleRequest(JACCContextIdHandler.java:61)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.GlobalRequestControllerHandler.handleRequest(GlobalRequestControllerHandler.java:68)
        at org.keycloak.keycloak-undertow-adapter@15.0.2//org.keycloak.adapters.undertow.ServletPreAuthActionsHandler.handleRequest(ServletPreAuthActionsHandler.java:69)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.SendErrorPageHandler.handleRequest(SendErrorPageHandler.java:52)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.handlers.PredicateHandler.handleRequest(PredicateHandler.java:43)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.handleFirstRequest(ServletInitialHandler.java:275)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$100(ServletInitialHandler.java:79)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:134)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$2.call(ServletInitialHandler.java:131)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ServletRequestContextThreadSetupAction$1.call(ServletRequestContextThreadSetupAction.java:48)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.core.ContextClassLoaderSetupAction$1.call(ContextClassLoaderSetupAction.java:43)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.security.SecurityContextThreadSetupAction.lambda$create$0(SecurityContextThreadSetupAction.java:105)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at org.wildfly.extension.undertow@7.4.8.GA-redhat-00002//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService$UndertowThreadSetupAction.lambda$create$0(UndertowDeploymentInfoService.java:1555)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.dispatchRequest(ServletInitialHandler.java:255)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler.access$000(ServletInitialHandler.java:79)
        at io.undertow.servlet@2.2.20.SP1-redhat-00001//io.undertow.servlet.handlers.ServletInitialHandler$1.handleRequest(ServletInitialHandler.java:100)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.Connectors.executeRootHandler(Connectors.java:387)
        at io.undertow.core@2.2.20.SP1-redhat-00001//io.undertow.server.HttpServerExchange$1.run(HttpServerExchange.java:852)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at org.jboss.xnio@3.8.7.SP1-redhat-00001//org.xnio.XnioWorker$WorkerThreadFactory$1$1.run(XnioWorker.java:1282)
        at java.base/java.lang.Thread.run(Thread.java:834)
Caused by: java.lang.NullPointerException
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository.findByUriAndHttpMethod(PrivilegeRepository.java:47)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository$$FastClassBySpringCGLIB$$704184f2.invoke(<generated>)
        at deployment.simkt.war//org.springframework.cglib.proxy.MethodProxy.invoke(MethodProxy.java:218)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.invokeJoinpoint(CglibAopProxy.java:793)
        at deployment.simkt.war//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:163)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:763)
        at deployment.simkt.war//org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:137)
        at deployment.simkt.war//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:763)
        at deployment.simkt.war//org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:708)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.repository.PrivilegeRepository$$EnhancerBySpringCGLIB$$1ab4441b.findByUriAndHttpMethod(<generated>)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService.hasPermissionForRequest(PrivilegeService.java:51)
        at deployment.simkt.war//br.gov.caixa.pedes.sistemas.simkt.integration.sso.filter.PermissionFilter.doFilter(PermissionFilter.java:46)
        ... 71 more

2026-10-13 10:39:58,854 DEBUG [org.springframework.web.servlet.DispatcherServlet] (default task-1) "FORWARD" dispatch for GET "/simkt/error?bi=true", parameters={masked}
2026-10-13 10:39:58,855 DEBUG [org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping] (default task-1) Mapped to org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController#error(HttpServletRequest)
2026-10-13 10:39:58,856 DEBUG [org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor] (default task-1) Using 'application/json', given [application/json, text/plain, */*] and supported [application/json, application/*+json, application/json, application/*+json]
2026-10-13 10:39:58,856 DEBUG [org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor] (default task-1) Writing [{timestamp=Tue Oct 13 10:39:58 BRT 2026, status=500, error=Internal Server Error, path=/simkt/api/v1 (truncated)...]
2026-10-13 10:39:58,857 DEBUG [org.springframework.web.servlet.DispatcherServlet] (default task-1) Exiting from "FORWARD" dispatch, status 500
2026-10-13 10:49:40,045 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/ ]
2026-10-13 10:49:40,047 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 10:49:40,047 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 10:49:40,047 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 10:49:40,047 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 10:49:40,047 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 10:49:40,047 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 10:49:40,048 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) SSOAuthenticationService TK: Optional.empty
2026-10-13 10:49:40,048 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/ ]
2026-10-13 10:49:40,048 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 10:49:40,048 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 10:49:40,048 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 10:49:40,048 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 10:49:40,048 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 10:49:40,048 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 10:49:40,048 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-1) UserDetails: null
2026-10-13 10:49:56,118 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/ ]
2026-10-13 10:49:56,118 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 10:49:56,118 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 10:49:56,118 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 10:49:56,118 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 10:49:56,118 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 10:49:56,118 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 10:49:56,118 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) SSOAuthenticationService TK: Optional.empty
2026-10-13 10:49:56,118 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/ ]
2026-10-13 10:49:56,118 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 10:49:56,118 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 10:49:56,118 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 10:49:56,118 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 10:49:56,118 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 10:49:56,118 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 10:49:56,118 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-1) UserDetails: null
2026-10-13 10:49:58,614 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/ ]
2026-10-13 10:49:58,614 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 10:49:58,614 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 10:49:58,614 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 10:49:58,614 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 10:49:58,614 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 10:49:58,614 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 10:49:58,614 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) SSOAuthenticationService TK: Optional.empty
2026-10-13 10:49:58,614 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/ ]
2026-10-13 10:49:58,614 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.module.web.servlet.ConversationContextActivator.contextActivatedInRequest
2026-10-13 10:49:58,614 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: formContentFilter.FILTERED
2026-10-13 10:49:58,614 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: requestContextFilter.FILTERED
2026-10-13 10:49:58,614 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: org.jboss.weld.context.ignore.guard.marker
2026-10-13 10:49:58,614 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: errorPageFilter.FILTERED
2026-10-13 10:49:58,614 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-1) RequestAttributes: characterEncodingFilter.FILTERED
2026-10-13 10:49:58,614 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-1) UserDetails: null
-sh-4.2$
