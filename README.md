-sh-4.2$ sudo ls -la /opt/jboss-eap/standalone/data/content/
total 47088
drwxrwxr-x 6 jboss jboss      198 Jun 11 16:01 .
drwxrwxr-x 8 jboss jboss      118 Jun 11 15:58 ..
drwxr-xr-x 3 root  root        52 Jun 11 12:44 30
drwxr-xr-x 3 root  root        52 Jun 11 12:44 8a
-rw-r--r-- 1 jboss jboss 12054106 Jun 11 15:58 content4269779095287575505.tmp
-rw-r--r-- 1 jboss jboss 12054106 Jun 11 15:58 content6723425251761123067.tmp
-rw-r--r-- 1 jboss jboss 12054106 Jun 11 15:58 content8361036237064005326.tmp
-rw-r--r-- 1 jboss jboss 12054106 Jun 11 16:01 content9065752976073087537.tmp
drwxr-xr-x 3 root  root        52 Jun 11 15:58 db
drwxr-xr-x 3 root  root        52 Jun 11 12:44 e7
-sh-4.2$ sudo chown -R jboss:jboss /opt/jboss-eap/standalone/data/
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ sudo chmod -R 775 /opt/jboss-eap/standalone/data/
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ sudo systemctl restart jboss-eap-standalone
-sh-4.2$ sudo tail -f /logs/jboss/server.log
2026-06-11 12:44:41,201 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0018: Iniciando host default-host
2026-06-11 12:44:41,245 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-1) WFLYELY01084: KeyStore /opt/jboss-eap/standalone/configuration/application.keystore não encontrado; ele será gerado automaticamente na primeira utilização com um certificado autoassinado para o host localhost
2026-06-11 12:44:41,474 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0493: Suspensão completa do subsistema de Jakarta Enterprise Beans
2026-06-11 12:44:41,478 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0006: UndertowHTTP ouvinte default escutando em 127.0.0.1:8080
2026-06-11 12:44:41,633 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-2) WFLYJCA0001: Fonte de dados vinculada[java:jboss/datasources/ExampleDS]
2026-06-11 12:44:41,798 INFO  [org.jboss.as.patching] (MSC service thread 1-4) WFLYPAT0050: A ID de patch cumulativo de JBoss EAP é jboss-eap-7.4.8.CP, os patches únicos incluem: none
2026-06-11 12:44:41,809 WARN  [org.jboss.as.domain.management.security] (MSC service thread 1-1) WFLYDM0111: Keystore /opt/jboss-eap/standalone/configuration/application.keystore não encontrado. Ele será gerado automaticamente na primeira utilização com um certificado autoassinado para o host localhost
2026-06-11 12:44:41,822 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0027: Iniciando a implantação do "wmq.jmsra.rar" (runtime-name: "wmq.jmsra.rar")
2026-06-11 12:44:41,823 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0027: Iniciando a implantação do "framework.jar" (runtime-name: "framework.jar")
2026-06-11 12:44:41,824 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0027: Iniciando a implantação do "applicationinsights-agent.jar" (runtime-name: "applicationinsights-agent.jar")
