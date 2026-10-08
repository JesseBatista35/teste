Prezados!

Solicito apoio para resolver o problema que estamos tendo ao rodar a release do SIHDG-JBOSS8-TQS.

Foi feito o refactory da aplicação do SIHDG, em TQS, (para jboss 8, angular 19 e java 21), estamos tentando implantar a primeira release e não estamos conseguindo. 

*** Foi criada regra de firewall na CRQ000001499711.

*** Foi dado permissões ao usuario de serviço SHDGTB01 na REQ000146465331.

https://console-openshift-console.apps.nprd.caixa/k8s/ns/sihdg-tqs/pods/sihdg-jboss8-tqs-31-5q4xb/logs 

https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=537625&environmentId=2498030

Segue detalhes do erro:

15:48:28,442 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Operation ("deploy") failed - address: ([("deployment" => "sihdg-3.18.0.1.ear")]) - failure description: {"WFLYCTL0080: Failed services" => {
"jboss.deployment.subunit.\"sihdg-3.18.0.1.ear\".\"sihdg-api.war\".component.CacheConfig.START" => "java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
Caused by: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
Caused by: jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
Caused by: jakarta.resource.ResourceException: IJ031084: Unable to create connection
Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: The TCP/IP connection to the host 10.116.29.201, port 31153 has failed. Error: \"Connect timed out. Verify the connection properties. Make sure that an instance of SQL Server is running on the host and accepting TCP/IP connections at the port. Make sure that TCP connections to the port are not blocked by a firewall.\".",
"jboss.deployment.subunit.\"sihdg-3.18.0.1.ear\".\"sihdg-api.war\".component.SecurityConfig.START" => "java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
Caused by: java.lang.IllegalStateException: WFLYEE0042: Failed to construct component instance
Caused by: jakarta.ejb.EJBTransactionRolledbackException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS] [n/a]
Caused by: java.sql.SQLException: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
Caused by: jakarta.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/jdbc/sihdgDS
Caused by: jakarta.resource.ResourceException: IJ031084: Unable to create connection
Caused by: com.microsoft.sqlserver.jdbc.SQLServerException: The TCP/IP connection to the host 10.116.29.201, port 31153 has failed. Error: \"Connect timed out. Verify the connection properties. Make sure that an instance of SQL Server is running on the host and accepting TCP/IP connections at the port. Make sure that TCP connections to the port are not blocked by a firewall.\"."


Atenciosamente,
Sandra
