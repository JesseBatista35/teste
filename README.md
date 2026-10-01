rdeapllx0005 p585600]#
[root@sbrdeapllx0005 p585600]#
[root@sbrdeapllx0005 p585600]# ./jboss-cli.sh --connect --controller=10.116.88.20:9999
bash: ./jboss-cli.sh: No such file or directory
[root@sbrdeapllx0005 p585600]# /host=<HC>/server-config=sicem_node1_lx0005:stop
bash: HC: No such file or directory
[root@sbrdeapllx0005 p585600]#
[root@sbrdeapllx0005 p585600]#
[root@sbrdeapllx0005 p585600]#
[root@sbrdeapllx0005 p585600]# exit
exit
-sh-4.1$
-sh-4.1$
-sh-4.1$ hostname -f
sbrdeapllx0005
-sh-4.1$ hostname -i
10.116.88.24 10.116.88.24
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ ps -ef | grep sicem
p585600  30021 25851  0 15:44 pts/2    00:00:00 grep sicem
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ tail -f /logs/jboss-eap/hc/servers/sicem_node1_lx0005/server.log
15:38:32,857 INFO  [org.springframework.web.context.support.XmlWebApplicationContext] (ServerService Thread Pool -- 74) Closing Root WebApplicationContext: startup date [Wed Sep 30 20:00:36 BRT 2026]; root of context hierarchy
15:38:32,861 INFO  [org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean] (ServerService Thread Pool -- 74) Closing JPA EntityManagerFactory for persistence unit 'SicemWebPU'
15:38:32,888 INFO  [org.jboss.modcluster] (ServerService Thread Pool -- 73) MODCLUSTER000002: Initiating mod_cluster shutdown
15:38:32,893 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 73) JBAS011403: Interrompendo Persistence Unit Serviço 'SicemWEB_6.1.0.12.03.war#SicemWebPU'
15:38:32,895 INFO  [org.apache.coyote.ajp] (MSC service thread 1-5) JBWEB003048: Pausing Coyote AJP/1.3 on ajp-/10.116.88.24:12809
15:38:32,896 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-4) JBAS010409: Fonte de dados sem limite [java:/jboss/datasources/sicem-ds]
15:38:32,896 INFO  [org.apache.coyote.ajp] (MSC service thread 1-5) JBWEB003051: Stopping Coyote AJP/1.3 on ajp-/10.116.88.24:12809
15:38:32,903 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-5) JBAS015877: Implantação encerrada postgresql-9.1-901-1.jdbc4.jar (runtime-name: postgresql-9.1-901-1.jdbc4.jar) em 104ms
15:38:32,970 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) JBAS015877: Implantação encerrada SICEM (runtime-name: SicemWEB_6.1.0.12.03.war) em 174ms
15:38:32,988 INFO  [org.jboss.as] (MSC service thread 1-7) JBAS015950: JBoss EAP 6.4.24.GA (AS 7.5.24.Final-redhat-00001) interrompido em 191ms



^C
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ tail -f /logs/jboss-eap/hc/servers/sicem_node1_lx0005/server.log
15:38:32,857 INFO  [org.springframework.web.context.support.XmlWebApplicationContext] (ServerService Thread Pool -- 74) Closing Root WebApplicationContext: startup date [Wed Sep 30 20:00:36 BRT 2026]; root of context hierarchy
15:38:32,861 INFO  [org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean] (ServerService Thread Pool -- 74) Closing JPA EntityManagerFactory for persistence unit 'SicemWebPU'
15:38:32,888 INFO  [org.jboss.modcluster] (ServerService Thread Pool -- 73) MODCLUSTER000002: Initiating mod_cluster shutdown
15:38:32,893 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 73) JBAS011403: Interrompendo Persistence Unit Serviço 'SicemWEB_6.1.0.12.03.war#SicemWebPU'
15:38:32,895 INFO  [org.apache.coyote.ajp] (MSC service thread 1-5) JBWEB003048: Pausing Coyote AJP/1.3 on ajp-/10.116.88.24:12809
15:38:32,896 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-4) JBAS010409: Fonte de dados sem limite [java:/jboss/datasources/sicem-ds]
15:38:32,896 INFO  [org.apache.coyote.ajp] (MSC service thread 1-5) JBWEB003051: Stopping Coyote AJP/1.3 on ajp-/10.116.88.24:12809
15:38:32,903 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-5) JBAS015877: Implantação encerrada postgresql-9.1-901-1.jdbc4.jar (runtime-name: postgresql-9.1-901-1.jdbc4.jar) em 104ms
15:38:32,970 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) JBAS015877: Implantação encerrada SICEM (runtime-name: SicemWEB_6.1.0.12.03.war) em 174ms
15:38:32,988 INFO  [org.jboss.as] (MSC service thread 1-7) JBAS015950: JBoss EAP 6.4.24.GA (AS 7.5.24.Final-redhat-00001) interrompido em 191ms
15:46:55,858 INFO  [org.jboss.modules] (main) JBoss Modules version 1.3.11.Final-redhat-1
15:46:56,048 INFO  [org.jboss.msc] (main) JBoss MSC version 1.1.7.SP1-redhat-1
15:46:56,092 INFO  [org.jboss.as] (MSC service thread 1-8) JBAS015899: Iniciando JBoss EAP 6.4.24.GA (AS 7.5.24.Final-redhat-00001)
15:46:56,141 INFO  [org.xnio] (MSC service thread 1-1) XNIO Version 3.0.17.GA-redhat-1
15:46:56,144 INFO  [org.xnio.nio] (MSC service thread 1-1) XNIO NIO Implementation Version 3.0.17.GA-redhat-1
15:46:56,155 INFO  [org.jboss.remoting] (MSC service thread 1-1) JBoss Remoting version 3.3.12.Final-redhat-2
15:46:57,016 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 7) JBAS014627: Attribute 'path' in the resource at address '/subsystem=transactions' is deprecated, and may be removed in future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
15:46:57,017 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 7) JBAS014627: Attribute 'relative-to' in the resource at address '/subsystem=transactions' is deprecated, and may be removed in future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
15:46:57,511 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 6) JBAS010153: A propriedade de identificador do nó é configurado ao valor default. Por favor certifique-se de que isto é único.
15:46:57,514 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 36) JBAS013371: Ativação do Subsistema de Segurança
15:46:57,525 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 52) JBAS010280: Ativação do subsistema Infinispan.
15:46:57,526 INFO  [org.jboss.as.jacorb] (ServerService Thread Pool -- 51) JBAS016300: Ativação do Subsistema JacORB
15:46:57,528 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 25) JBAS015537: Ativação da Extensão WebServices
15:46:57,537 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 40) JBAS011800: Ativação do Subsistema de Nomeação
15:46:57,538 INFO  [org.jboss.as.clustering.jgroups] (ServerService Thread Pool -- 46) JBAS010260: Ativação do subsistema do JGroups.
15:46:57,545 INFO  [org.jboss.as.configadmin] (ServerService Thread Pool -- 56) JBAS016200: Ativação do Subsistema ConfigAdmin
15:46:57,556 INFO  [org.jboss.as.security] (MSC service thread 1-4) JBAS013370: Versão =4.1.7.Final-redhat-1 PicketBox Atual
15:46:57,567 INFO  [org.jboss.as.connector.logging] (MSC service thread 1-2) JBAS010408: Inicialização JCA do Subsistema (IronJacamar 1.0.44.Final-redhat-00001)
15:46:57,648 INFO  [org.jboss.as.naming] (MSC service thread 1-5) JBAS011802: Iniciando o Serviço de Nomeação
15:46:57,649 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-3) JBAS015400: Sessão de correio limitado [java:jboss/mail/SicemMailSession]
15:46:57,672 INFO  [org.jboss.jaxr] (MSC service thread 1-4) JBAS014000: Subsistema JAXR iniciado, efetuando o binding
da criação da conexão JAXR no JNDI como: java:jboss/jaxr/ConnectionFactory
15:46:57,788 INFO  [org.apache.coyote.http11.Http11Protocol] (MSC service thread 1-1) JBWEB003001: Coyote HTTP/1.1 initializing on : http-10.116.88.24:12880
15:46:57,804 INFO  [org.apache.coyote.ajp] (MSC service thread 1-3) JBWEB003046: Starting Coyote AJP/1.3 on ajp-/10.116.88.24:12809
15:46:57,804 INFO  [org.apache.coyote.http11.Http11Protocol] (MSC service thread 1-1) JBWEB003000: Coyote HTTP/1.1 starting on: http-10.116.88.24:12880
15:46:57,843 INFO  [org.jboss.modcluster] (ServerService Thread Pool -- 58) MODCLUSTER000001: Initializing mod_cluster version 1.2.12.Final-redhat-1
15:46:57,861 INFO  [org.jboss.modcluster] (ServerService Thread Pool -- 58) MODCLUSTER000032: Listening to proxy advertisements on /228.0.1.120:23364
15:46:57,921 INFO  [org.jboss.as.jacorb] (MSC service thread 1-4) JBAS016330: Serviço CORBA ORB  iniciado
15:46:57,937 INFO  [org.infinispan.configuration.cache.EvictionConfigurationBuilder] (ServerService Thread Pool -- 52) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
15:46:57,945 INFO  [org.infinispan.configuration.cache.EvictionConfigurationBuilder] (ServerService Thread Pool -- 52) ISPN000152: Passivation configured without an eviction policy being selected. Only manually evicted entities will be passivated.
15:46:57,957 INFO  [org.jboss.ws.common.management] (MSC service thread 1-2) JBWS022052: Starting JBoss Web Services - Stack CXF Server 4.3.7.Final-redhat-1
15:46:57,975 INFO  [org.jboss.as.remoting] (MSC service thread 1-7) JBAS017100: Escutando no 10.116.88.24:9247
15:46:57,983 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-5) JBAS015876: Iniciando a implantação do "postgresql-9.1-901-1.jdbc4.jar" (runtime-name: "postgresql-9.1-901-1.jdbc4.jar")
15:46:57,983 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-8) JBAS015876: Iniciando a implantação do "wmq.jmsra.rar" (runtime-name: "wmq.jmsra.rar")
15:46:57,983 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) JBAS015876: Iniciando a implantação do "SICEM" (runtime-name: "SicemWEB_6.1.0.13.06.war")
15:46:58,024 INFO  [org.jboss.as.jacorb] (MSC service thread 1-7) JBAS016328: Serviço de Nomeação CORBA iniciado
15:46:58,096 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-1) JBAS010404: Deploying non-JDBC-compliant driver class org.postgresql.Driver (version 9.0)
15:46:58,136 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-1) JBAS010400: Limite da fonte de dados [java:/jboss/datasources/sicem-ds]
15:46:58,311 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-5) JBAS015960: A entrada do Caminho de Classe connector.jar no /content/wmq.jmsra.rar/com.ibm.mq.jar não aponta a um jar válido para a referência do Class-Path
15:46:58,318 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-5) JBAS015960: A entrada do Caminho de Classe jta.jar no /content/wmq.jmsra.rar/com.ibm.mq.jmqi.jar não aponta a um jar válido para a referência do Class-Path
15:46:58,319 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-5) JBAS015960: A entrada do Caminho de Classe ldap.jar no /content/wmq.jmsra.rar/com.ibm.mqjms.jar não aponta a um jar válido para a referência do Class-Path
15:46:58,320 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-5) JBAS015960: A entrada do Caminho de Classe jndi.jar no /content/wmq.jmsra.rar/com.ibm.mqjms.jar não aponta a um jar válido para a referência do Class-Path
15:46:58,320 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-5) JBAS015960: A entrada do Caminho de Classe fscontext.jar no /content/wmq.jmsra.rar/com.ibm.mqjms.jar não aponta a um jar válido para a referência do Class-Path
15:46:58,321 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-5) JBAS015960: A entrada do Caminho de Classe providerutil.jar no /content/wmq.jmsra.rar/com.ibm.mqjms.jar não aponta a um jar válido para a referência do Class-Path
15:46:58,324 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-5) JBAS015960: A entrada do Caminho de Classe jms.jar no /content/wmq.jmsra.rar/com.ibm.msg.client.jms.jar não aponta a um jar válido para a referência do Class-Path
15:46:58,326 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-5) JBAS015960: A entrada do Caminho de Classe rmm.jar no /content/wmq.jmsra.rar/com.ibm.msg.client.wmq.v6.jar não aponta a um jar válido para a referência do Class-Path
15:46:58,329 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-5) JBAS015960: A entrada do Caminho de Classe CL3Export.jar no /content/wmq.jmsra.rar/com.ibm.msg.client.wmq.v6.jar não aponta a um jar válido para a referência do Class-Path
15:46:58,330 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-5) JBAS015960: A entrada do Caminho de Classe CL3Nonexport.jar no /content/wmq.jmsra.rar/com.ibm.msg.client.wmq.v6.jar não aponta a um jar válido para a referência do Class-Path
15:46:58,447 INFO  [org.jboss.as.connector.deployers.RADeployer] (MSC service thread 1-3) IJ020001: Required license terms for file:/opt/jboss/jboss-eap/hc/tmp/servers/sicem_node1_lx0005/vfs/temp/tempbc2290c7d8c68fe6/content-7f188464b7615c5e/contents/
15:46:58,709 INFO  [org.jboss.as.connector.deployers.RaXmlDeployer] (MSC service thread 1-3) IJ020001: Required license terms for file:/opt/jboss/jboss-eap/hc/tmp/servers/sicem_node1_lx0005/vfs/temp/tempbc2290c7d8c68fe6/content-7f188464b7615c5e/contents/
15:46:58,719 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-3) JBAS010406: Fábrica de conexão registrada java:jboss/jms/SicemQueueConnectionFactory
15:46:58,753 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-3) JBAS010405: Objeto de admin registrado no java:jboss/jms/rsp_siico_servico_queue
15:46:58,755 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-3) JBAS010405: Objeto de admin registrado no java:jboss/jms/rsp_sicuc_servico_queue
15:46:58,756 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-3) JBAS010405: Objeto de admin registrado no java:jboss/jms/req_siico_servico_queue
15:46:58,757 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-3) JBAS010405: Objeto de admin registrado no java:jboss/jms/req_sicuc_servico_queue
15:46:58,759 INFO  [org.jboss.as.connector.deployers.RaXmlDeployer] (MSC service thread 1-3) IJ020002: Deployed: file:/opt/jboss/jboss-eap/hc/tmp/servers/sicem_node1_lx0005/vfs/temp/tempbc2290c7d8c68fe6/content-7f188464b7615c5e/contents/
15:46:58,760 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-4) JBAS010401: Limite JCA AdminObject [java:jboss/jms/req_sicuc_servico_queue]
15:46:58,760 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-4) JBAS010401: Limite JCA AdminObject [java:jboss/jms/rsp_sicuc_servico_queue]
15:46:58,760 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-4) JBAS010401: Limite JCA ConnectionFactory [java:jboss/jms/SicemQueueConnectionFactory]
15:46:58,760 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-4) JBAS010401: Limite JCA AdminObject [java:jboss/jms/rsp_siico_servico_queue]
15:46:58,761 INFO  [org.jboss.as.connector.deployment] (MSC service thread 1-8) JBAS010401: Limite JCA AdminObject [java:jboss/jms/req_siico_servico_queue]
15:47:00,153 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) JBAS015960: A entrada do Caminho de Classe xercesImpl.jar no /content/SicemWEB_6.1.0.13.06.war/WEB-INF/lib/xalan-2.7.0.jar não aponta a um jar válido para a referência do Class-Path
15:47:00,153 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) JBAS015960: A entrada do Caminho de Classe xml-apis.jar no /content/SicemWEB_6.1.0.13.06.war/WEB-INF/lib/xalan-2.7.0.jar não aponta a um jar válido para a referência do Class-Path
15:47:00,153 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) JBAS015960: A entrada do Caminho de Classe serializer.jar no /content/SicemWEB_6.1.0.13.06.war/WEB-INF/lib/xalan-2.7.0.jar não aponta a um jar válido para a referência do Class-Path
15:47:00,162 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) JBAS015960: A entrada do Caminho de Classe jaxb-api.jar no /content/SicemWEB_6.1.0.13.06.war/WEB-INF/lib/jaxb-impl-2.1.10.jar não aponta a um jar válido para a referência do Class-Path
15:47:00,163 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) JBAS015960: A entrada do Caminho de Classe activation.jar no /content/SicemWEB_6.1.0.13.06.war/WEB-INF/lib/jaxb-impl-2.1.10.jar não aponta a um jar válido para a referência do Class-Path
15:47:00,163 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) JBAS015960: A entrada do Caminho de Classe jsr173_1.0_api.jar no /content/SicemWEB_6.1.0.13.06.war/WEB-INF/lib/jaxb-impl-2.1.10.jar não aponta a um jar válido para a referência do Class-Path
15:47:00,163 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) JBAS015960: A entrada do Caminho de Classe jaxb1-impl.jar no /content/SicemWEB_6.1.0.13.06.war/WEB-INF/lib/jaxb-impl-2.1.10.jar não aponta a um jar válido para a referência do Class-Path
15:47:00,167 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-2) JBAS015960: A entrada do Caminho de Classe activation.jar no /content/SicemWEB_6.1.0.13.06.war/WEB-INF/lib/mail-1.4.jar não aponta a um jar válido para a referência do Class-Path
15:47:00,228 INFO  [org.jboss.as.jpa] (MSC service thread 1-5) JBAS011401: Leia a persistence.xml para SicemWebPU
15:47:00,553 WARN  [org.jboss.as.ee] (MSC service thread 1-3) JBAS011006: Nenhuma instalação do componente org.springframework.http.server.ServletServerHttpAsyncRequestControl opcional devido à uma exceção (habilite o nível do log DEPURAR para verificar a causa)
15:47:00,554 WARN  [org.jboss.as.ee] (MSC service thread 1-3) JBAS011006: Nenhuma instalação do componente org.springframework.web.context.request.async.StandardServletAsyncWebRequest opcional devido à uma exceção (habilite o nível do log DEPURAR para verificar a causa)
15:47:00,555 WARN  [org.jboss.as.ee] (MSC service thread 1-3) JBAS011006: Nenhuma instalação do componente br.gov.caixa.sicem.action.ZerarContasAction opcional devido à uma exceção (habilite o nível do log DEPURAR para verificar a causa)
15:47:00,607 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) JBAS010404: Deploying non-JDBC-compliant driver class org.postgresql.Driver (version 9.3)
15:47:00,626 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 58) JBAS011402: Iniciando Persistence Unit Serviço 'SicemWEB_6.1.0.13.06.war#SicemWebPU'
15:47:00,687 INFO  [org.hibernate.annotations.common.Version] (ServerService Thread Pool -- 58) HCANN000001: Hibernate Commons Annotations {4.0.2.Final-redhat-1}
15:47:00,690 INFO  [org.hibernate.Version] (ServerService Thread Pool -- 58) HHH000412: Hibernate Core {4.2.27.Final-redhat-1}
15:47:00,691 INFO  [org.hibernate.cfg.Environment] (ServerService Thread Pool -- 58) HHH000206: hibernate.properties not found
15:47:00,692 INFO  [org.hibernate.cfg.Environment] (ServerService Thread Pool -- 58) HHH000021: Bytecode provider name : javassist
15:47:00,706 INFO  [org.hibernate.ejb.Ejb3Configuration] (ServerService Thread Pool -- 58) HHH000204: Processing PersistenceUnitInfo [
        name: SicemWebPU
        ...]
15:47:00,763 WARN  [org.hibernate.service.jdbc.connections.internal.ConnectionProviderInitiator] (ServerService Thread Pool -- 58) HHH000181: No appropriate connection provider encountered, assuming application will be supplying connections
15:47:00,775 INFO  [org.hibernate.dialect.Dialect] (ServerService Thread Pool -- 58) HHH000400: Using dialect: org.hibernate.dialect.PostgreSQLDialect
15:47:00,779 INFO  [org.hibernate.engine.jdbc.internal.LobCreatorBuilder] (ServerService Thread Pool -- 58) HHH000422: Disabling contextual LOB creation as connection was null
15:47:00,968 INFO  [org.hibernate.engine.transaction.internal.TransactionFactoryInitiator] (ServerService Thread Pool -- 58) HHH000268: Transaction strategy: org.hibernate.engine.transaction.internal.jdbc.JdbcTransactionFactory
15:47:00,970 INFO  [org.hibernate.hql.internal.ast.ASTQueryTranslatorFactory] (ServerService Thread Pool -- 58) HHH000397: Using ASTQueryTranslatorFactory
15:47:00,999 INFO  [org.hibernate.validator.internal.util.Version] (ServerService Thread Pool -- 58) HV000001: Hibernate Validator 4.3.4.Final-redhat-1
15:47:01,481 WARN  [org.hibernate.internal.SessionFactoryImpl] (ServerService Thread Pool -- 58) HHH000008: JTASessionContext being used with JDBCTransactionFactory; auto-flush will not operate correctly with getCurrentSession()
15:47:01,523 INFO  [org.jboss.web] (ServerService Thread Pool -- 78) JBAS018210: Registra o contexto da web: /sicem
15:47:01,535 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78) No Spring WebApplicationInitializer types detected on classpath
15:47:01,546 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78) Initializing Spring root WebApplicationContext
15:47:01,546 INFO  [org.springframework.web.context.ContextLoader] (ServerService Thread Pool -- 78) Root WebApplicationContext: initialization started
15:47:01,587 INFO  [org.springframework.web.context.support.XmlWebApplicationContext] (ServerService Thread Pool -- 78) Refreshing Root WebApplicationContext: startup date [Thu Oct 01 15:47:01 BRT 2026]; root of context hierarchy
15:47:01,605 INFO  [org.springframework.beans.factory.xml.XmlBeanDefinitionReader] (ServerService Thread Pool -- 78) Loading XML bean definitions from class path resource [applicationContext.xml]
15:47:01,870 INFO  [org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean] (ServerService Thread Pool -- 78) Building JPA container EntityManagerFactory for persistence unit 'SicemWebPU'
15:47:01,871 INFO  [org.hibernate.ejb.Ejb3Configuration] (ServerService Thread Pool -- 78) HHH000204: Processing PersistenceUnitInfo [
        name: SicemWebPU
        ...]
15:47:01,881 INFO  [org.hibernate.service.jdbc.connections.internal.ConnectionProviderInitiator] (ServerService Thread Pool -- 78) HHH000130: Instantiating explicit connection provider: org.hibernate.ejb.connection.InjectedDataSourceConnectionProvider
15:47:02,266 INFO  [org.hibernate.dialect.Dialect] (ServerService Thread Pool -- 78) HHH000400: Using dialect: org.hibernate.dialect.PostgreSQLDialect
15:47:02,272 INFO  [org.hibernate.engine.jdbc.internal.LobCreatorBuilder] (ServerService Thread Pool -- 78) HHH000424: Disabling contextual LOB creation as createClob() method threw error : java.lang.reflect.InvocationTargetException
15:47:02,313 INFO  [org.hibernate.engine.transaction.internal.TransactionFactoryInitiator] (ServerService Thread Pool -- 78) HHH000268: Transaction strategy: org.hibernate.engine.transaction.internal.jdbc.JdbcTransactionFactory
15:47:02,314 INFO  [org.hibernate.hql.internal.ast.ASTQueryTranslatorFactory] (ServerService Thread Pool -- 78) HHH000397: Using ASTQueryTranslatorFactory
15:47:02,396 INFO  [org.hibernate.tool.hbm2ddl.SchemaValidator] (ServerService Thread Pool -- 78) HHH000229: Running schema validator
15:47:02,397 INFO  [org.hibernate.tool.hbm2ddl.SchemaValidator] (ServerService Thread Pool -- 78) HHH000102: Fetching database metadata
15:47:02,414 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.aplicativocliente
15:47:02,414 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [acli_cld_resumodebito, acli_resumo, lsis_func_id, acli_retornoposterior, acli_tdcl_historicodebito, acli_valortarifated, acli_cld_resumocredito, acli_enviatransferencias, acli_zeranumeroob, acli_codmovimentoc, acli_codretornop, acli_retornavalidos, acli_envia_arquivo_sequencial, acli_arquivounico, acli_codretornol, acli_prazoedicao, acli_tdcl_historicocredito, acli_inativo, acli_tipo_resumodebito, acli_codretornoc, acli_codmovimentol, acli_tipo_resumocredito, acli_nomeversao, acli_codmovimentop, lsis_usua_login, acli_nomearquivo, acli_valortarifadoc, acli_layoutarquivo, acli_id, acli_valorminimoted, acli_retornatransferencia, acli_oblista]
15:47:02,419 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.aplicativosicem
15:47:02,420 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [asic_id, asic_nomearquivo, acli_id, asic_dtdisponibilizacao, asic_versao]
15:47:02,424 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.avaliacaoauditoria
15:47:02,425 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [aaud_dthoraavaliacao, usua_login, aaud_parecer, aaud_id]
15:47:02,429 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.codigooperacao
15:47:02,429 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [lsis_usua_login, cope_inativo, lsis_func_id, acli_id, cope_id, cope_descricao, tcop_id, cope_codigo, cope_lista]
15:47:02,434 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.compromisso_siacc
15:47:02,434 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [enti_id, csia_parametrotransmissao, csia_codigotransacao, csia_compromisso, csia_ugesid, csia_id, csia_isencaotarifa, ttra_grupocompromisso, csia_inativo]
15:47:02,438 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.configuracao
15:47:02,438 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [numero_deposito, numero_debito, conf_periodotrocacodigo, conf_diretorio_pacote, conf_atualiza_usuarios, conf_prazotrocacodigo, conf_encerramento_siacc, numero_doc, conf_siacc_limite_sivat, conf_diretorio_pacote_backup, lsis_func_id, conf_reabertura_siacc, conf_siacc_limite_doc, conf_sitlo_horario, id, conf_tempo_espera_arquivo_siart, conf_diretorio_recepcao_critica, conf_tempo_permanencia_arquivo, conf_siacc_limite_ted, numero_sivat, conf_fechamento_siacc, numero_ted, lsis_usua_login, conf_horasiart, conf_siacc_limite_tev, conf_diretorio_recepcao_backup, conf_prazotrocasenha, conf_tempo_espera_arquivo_siacc, conf_textoemail]
15:47:02,441 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.contas
15:47:02,442 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [cont_agencia, cont_tipoinscricao, cont_operacao, cont_nsgd, lsis_usua_login, cont_inativo, cont_cnpj, lsis_func_id, cont_numconta, cont_nomeconta, cont_pacote, uges_id, tcon_id, cont_uggerencial, cont_id]
15:47:02,445 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.contasentidade
15:47:02,445 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [cent_nomeconta, enti_id, cent_nsgd, cent_agencia, cent_tipoinscricao, cent_siacc, cent_operacao, cent_pacote, cent_cnpj, cent_inativo, lsis_usua_login, lsis_func_id, cent_id, cent_numconta, tcon_id]
15:47:02,449 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.entidade
15:47:02,450 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [enti_retornoposterior, enti_id, enti_arquivoconvenio, enti_cnpj, enti_permitezerarcontas, enti_cpfpadrao, lsis_func_id, enti_datalimitepagamento, enti_siart, enti_codigoacessoanterior, cont_transitoria, enti_horamovimento, enti_retornadevolucao, enti_convenioinativo, enti_datalimitecodigoantigo, enti_fnde, enti_contapadrao, enti_sifix, enti_sicex, enti_codibge, enti_pagamentoviacontaunica, enti_numconvenio, enti_migraanoanterior, enti_codigoacesso, enti_horaretorno, enti_datatrocacodigo, lsis_usua_login, enti_valortarifated, ucai_id, acli_id, enti_controlarsaque, enti_nome, enti_enviaarquivosegmentado, enti_datalimiteremessa, enti_retornatransferencia, enti_estrategiaretorno, enti_estrategiaanalisemovimento]
15:47:02,453 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.extrato
15:47:02,454 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [extr_agencia, enti_id, extr_valorlancamento, extr_operacao, extr_data, extr_historico, extr_id, extr_numdocumento, extr_conta]
15:47:02,457 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.feriado
15:47:02,457 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [lsis_usua_login, enti_id, lsis_func_id, feri_data, feri_descricao]
15:47:02,460 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.finalidade
15:47:02,460 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [fina_codigo, fina_fundeb, fina_decreto, fina_descricao]
15:47:02,463 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.funcionalidade
15:47:02,463 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [func_descricao, func_idpai, func_registralog, func_id, func_nome, func_link]
15:47:02,466 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.historicoretorno
15:47:02,467 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [situ_id, movi_dtretorno, hret_id, movi_id, osis_idretorno]
15:47:02,470 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.isencaotarifa
15:47:02,470 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [lsis_usua_login, itar_tipoinscricao, itar_id, enti_id, lsis_func_id, itar_dtatualizacao, itar_inativo, itar_cpfcnpjfavorecido, itar_nomefavorecido]
15:47:02,473 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.logsistema
15:47:02,473 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [lsis_tipo, lsis_dados_new, lsis_observacao, lsis_id, usua_login, func_id, lsis_tabela, lsis_dados_old, lsis_datahora]
15:47:02,476 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.menu
15:47:02,477 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [menu_ordem, menu_nome, func_id, menu_nivel]
15:47:02,479 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.metadado
15:47:02,480 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [meta_id, meta_visualizacao, func_id, meta_campoorigem_fk, meta_campotabela, meta_titulo, meta_tabelaorigem_fk]
15:47:02,483 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.movimento
15:47:02,483 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [movi_codbarras, enti_id, movi_idoblista, movi_numre, osis_idretorno, movi_cpfcnpjfavorecido, movi_bancoorigem, movi_finalidade, movi_codigoug, movi_tipoinscricao, movi_contaorigem, movi_tipo, movi_linhaarquivo, movi_codigoop, movi_dtretorno, movi_dtrecebimento, movi_id, movi_numob, movi_codigotransacao, movi_agenciafavorecido, movi_agenciaorigem, situ_id, movi_nomefavorecido, movi_bancofavorecido, osis_idprocessamento, movi_valorob, movi_contafavorecido, nu_documento_empresa]
15:47:02,486 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.operacaocontas
15:47:02,486 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [ocon_debitosiacc, ocon_operacao, ocon_id, ocon_descricao, ocon_titularpf, ocon_titularpj, ocon_creditosiacc]
15:47:02,489 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.operacaosistema
15:47:02,489 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [osis_usuarioexclusao, osis_id, usua_login, enti_id, osis_dthoraexclusao, osis_resumo, osis_dthorafim, osis_tipo, tope_id, nu_sequencia, osis_dthorainicio]
15:47:02,492 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.pacote
15:47:02,492 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [situ_id, enti_id, usua_login, paco_dthoraretorno, paco_numeronsa, paco_dthoraenvio, tpac_id, paco_id, paco_obscancelamento, paco_arquivo]
15:47:02,496 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.pagamento_com_codbarras
15:47:02,496 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [pccb_campolivre, pccb_id, pccb_ic_tipoconvenio, movi_id, pccb_bancodestino, co_qrcode_txid, ed_url_pix_pagamento, pccb_dvcodigobarras, pccb_valordocumento, pccb_valortitulo, pccb_valormoramulta, pccb_fatorvencimento, pccb_codmoeda, pccb_valordescontoabatimento, pccb_datavencimento, pccb_codbarras]
15:47:02,500 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.pagamento_sem_codbarras
15:47:02,500 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [pscb_id, pscb_numeroreferencia, pscb_periodoapuracao, pscb_valorjurosencargos, pscb_mesanocompetencia, movi_id, pscb_codreceitatributo, pscb_atualizacaomonetaria, pscb_datavencimento, pscb_valoroutrasentidades, pscb_valormulta, pscb_valorprincipal, pscb_valorpaginss, pscb_nomecontribuinte]
15:47:02,503 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.papel
15:47:02,503 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [co_usuario_atualizacao, pape_nome, pape_descricao, ts_atualizacao_papel, no_grupo_protocolo, pape_id]
15:47:02,506 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.parametro
15:47:02,506 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [no_parametro, de_valor, nu_parametro]
15:47:02,509 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.permissaopapel
15:47:02,509 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [ppap_valor, func_id, pape_id]
15:47:02,512 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.rel_aplicativo_situacao
15:47:02,513 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [lsis_usua_login, situ_id, rasi_inativo, lsis_func_id, rasi_codigocliente, rasi_retorna, acli_id]
15:47:02,516 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.rel_entidade_codigooperacao
15:47:02,516 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [enti_id, reco_agrupamentoresumo, reco_gerapacote, reco_restricaopessoa, reco_resumodevolucao, reco_qtddiasvalidade, lsis_usua_login, lsis_func_id, reco_aguardaresumo, cent_id, cope_id, reco_valorlimite, reco_devolucaoautomatica, reco_gerartransferencia, reco_validare, tcon_id]
15:47:02,520 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.rel_movimento_transacao
15:47:02,520 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [movi_id, tran_id]
15:47:02,523 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.rel_tiposituacao_situacao
15:47:02,523 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [situ_id, tsit_id]
15:47:02,526 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.rel_transacao_pacotecorporativo
15:47:02,526 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [csia_compromisso, tran_id, rtpa_nsr, paco_id, rtpa_lote]
15:47:02,529 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.rel_transacao_pacotesiacc_cancelado
15:47:02,529 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [usua_login, rtpc_id, rtpc_nsr, csia_compromisso, rtpc_lote, tran_id, paco_id, rtpc_dtcancelado, resi_codigosiacc]
15:47:02,532 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.rel_usuario_entidade
15:47:02,532 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [usua_login, enti_id]
15:47:02,535 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.resumo
15:47:02,535 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [res_valor, res_contadestino, usua_login, enti_id, res_operacaodestino, res_nusequencia, res_bancodestino, res_bancoorigem, res_contaorigem, res_operacaoorigem, res_nsu, situ_id, res_dthoraatualizada, res_agenciadestino, res_tiporesumo, cope_id, res_id, res_quantidade, res_dthoraexecucao, res_agenciaorigem]
15:47:02,538 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.retorno_siacc
15:47:02,538 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [situ_id, resi_id, resi_posicaocodigo, resi_codigosiacc, resi_descricaocodigo]
15:47:02,540 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.scmtb028_consultaexterna
15:47:02,541 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [co_unidadegestora_fk, co_ipmaquina, nu_documento, co_id, co_usuario, ts_pesquisa]
15:47:02,544 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.scmtb045_edicaosituacao
15:47:02,544 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [es_usuario_fk, es_data, es_id, es_situacaoanterior, es_sistema, es_situacaoatual, es_transacao_fk]
15:47:02,547 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.sequenciaoperacoes
15:47:02,547 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [sope_descricao, lsis_usua_login, enti_id, lsis_func_id, sope_codigotransacao, sope_sequencia]
15:47:02,550 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.situacao
15:47:02,550 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [situ_id, situ_valida, situ_observacao, situ_descricao, situ_inativa]
15:47:02,552 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.solicitacaoimpressao
15:47:02,553 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [situ_id, simp_dthoracriacao, usua_login, simp_motivo, res_id, tran_id, simp_id, simp_loginautorizacao]
15:47:02,555 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.tipoarquivo
15:47:02,556 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [tarq_nome, tarq_id]
15:47:02,558 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.tipocodigooperacao
15:47:02,558 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [tcop_id, tcop_nome]
15:47:02,561 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.tipoconta
15:47:02,561 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [tcon_ug, tcon_descricao, tcon_nome, tcon_id]
15:47:02,564 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.tipofavorecido
15:47:02,564 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [enti_id, tfav_id, tfav_codigoenvio, tfav_siglafavorecido]
15:47:02,566 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.tipooperacao
15:47:02,567 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [tope_descricao, tope_id]
15:47:02,569 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.tipopacote
15:47:02,570 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [tpac_descricao, tpac_id, tpac_nome, tpac_siacc]
15:47:02,572 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.tipopermissao
15:47:02,573 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [tper_descricao, tper_id, tper_nome]
15:47:02,575 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.tiposituacao
15:47:02,575 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [tsit_descricao, tsit_id]
15:47:02,578 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.tipotransacao
15:47:02,579 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [ttra_descricao, ttra_id, ttra_grupocompromisso]
15:47:02,581 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.tipounidade
15:47:02,582 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [tuni_inativo, tuni_id, tuni_descricao, tuni_sigla]
15:47:02,585 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.transacao
15:47:02,585 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [tran_agenciafavorecido, res_idretorno, enti_id, tran_operacaoorigem, osis_idretorno, tran_id, tran_dataexecucao, tran_loginexecutor, ttra_id, tran_agenciaorigem, tran_contafavorecido, tran_retornada, tran_devolucaoconfirmada, res_id, tran_operacaofavorecido, tran_bancofavorecido, tran_isencaotarifa, osis_id, tran_contaorigem, tran_descricao, situ_id, tran_bancoorigem, tran_nsu, tran_cgcunidadeexterna, cope_id, tran_dtconfirmacao, tran_valor, uges_id, tran_dtcriacao, resi_codigosiacc]
15:47:02,588 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.tratamento_tipoarquivo
15:47:02,589 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [ttip_id, enti_id, ttip_inativo, ttip_arquivovalidacaoregistro, ttip_nuordemexibicao, ttip_labelexibicao, ttip_codigoarquivo, ttip_estrategiatratamentoarquivo, ttip_nuprioridade, tarq_id]
15:47:02,591 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.trava_domicilio
15:47:02,592 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [tdom_codigoug, enti_id, tdom_inativo, tdom_nsgd, tdom_id, tdom_operacaocontafavorecido, tdom_dtcadastro, tdom_agenciafavorecido, lsis_usua_login, tdom_contafavorecido, tdom_nomefavorecido, lsis_func_id, tdom_cpfcnpjfavorecido, tdom_tipoinscricao]
15:47:02,594 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.unidadecaixa
15:47:02,595 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [ucai_nome, ucai_id, ucai_email, ucai_inativo, tuni_id, ufed_sigla, ucai_cgc]
15:47:02,597 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.unidadefederativa
15:47:02,597 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [ufed_sigla, ufed_nome]
15:47:02,600 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.unidadegestora
15:47:02,600 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [lsis_usua_login, uges_inativa, enti_id, lsis_func_id, uges_nome, uges_id, uges_nomegestao, uges_codigogestao, uges_codigocliente, uges_cnpj]
15:47:02,603 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.usuario
15:47:02,603 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [usua_matricula, lsis_usua_login, usua_login, lsis_func_id, usua_email, usua_nome, usua_nomefuncao, pape_id, usua_inativo, usua_datahoralogin]
15:47:02,605 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.vinculacao_negocial
15:47:02,606 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [ucai_id, vneg_idnegocial]
15:47:02,608 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000261: Table found: cemsm001.vinculacaotransacao
15:47:02,608 INFO  [org.hibernate.tool.hbm2ddl.TableMetadata] (ServerService Thread Pool -- 78) HHH000037: Columns: [vtra_idfilho, tran_id]
15:47:02,629 INFO  [org.springframework.web.context.ContextLoader] (ServerService Thread Pool -- 78) Root WebApplicationContext: initialization completed in 1082 ms
15:47:02,822 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [trace] Searching for properties at: /org/apache/velocity/tools/view/velocity.properties
15:47:02,823 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [trace] Searching for properties at: /WEB-INF/velocity.properties
15:47:02,823 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [debug] Did not find resource at: /WEB-INF/velocity.properties
15:47:02,823 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [trace] *******************************************************************
15:47:02,823 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [debug] Starting Apache Velocity v1.6.2 (compiled: 2009-02-19 16:29:46)
15:47:02,823 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [trace] RuntimeInstance initializing.
15:47:02,823 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [debug] Default Properties File: org/apache/velocity/runtime/defaults/velocity.properties
15:47:02,824 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [debug] Trying to use logger class org.apache.velocity.runtime.log.ServletLogChute
15:47:02,824 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [debug] Using logger class org.apache.velocity.runtime.log.ServletLogChute
15:47:02,826 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [trace] Default ResourceManager initializing. (class org.apache.velocity.runtime.resource.ResourceManagerImpl)
15:47:02,828 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [debug] ResourceLoader instantiated: org.apache.velocity.tools.view.WebappResourceLoader
15:47:02,828 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [trace] WebappResourceLoader: initialization starting.
15:47:02,828 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [trace] WebappResourceLoader: initialization complete.
15:47:02,830 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [debug] ResourceLoader instantiated: org.apache.velocity.runtime.resource.loader.StringResourceLoader
15:47:02,830 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [trace] StringResourceLoader : initialization starting.
15:47:02,830 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [debug] Creating string repository using class org.apache.velocity.runtime.resource.util.StringResourceRepositoryImpl...
15:47:02,830 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [debug] Default repository encoding is UTF-8
15:47:02,831 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [trace] StringResourceLoader : initialization complete.
15:47:02,837 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [debug] ResourceCache: initialized (class org.apache.velocity.runtime.resource.ResourceCacheImpl) with class java.util.Collections$SynchronizedMap cache map.
15:47:02,838 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [trace] Default ResourceManager initialization complete.
15:47:02,839 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [debug] Loaded System Directive: org.apache.velocity.runtime.directive.Define
15:47:02,839 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [debug] Loaded System Directive: org.apache.velocity.runtime.directive.Break
15:47:02,840 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [debug] Loaded System Directive: org.apache.velocity.runtime.directive.Evaluate
15:47:02,840 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [debug] Loaded System Directive: org.apache.velocity.runtime.directive.Literal
15:47:02,841 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [debug] Loaded System Directive: org.apache.velocity.runtime.directive.Macro
15:47:02,842 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [debug] Loaded System Directive: org.apache.velocity.runtime.directive.Parse
15:47:02,842 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [debug] Loaded System Directive: org.apache.velocity.runtime.directive.Include
15:47:02,843 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [debug] Loaded System Directive: org.apache.velocity.runtime.directive.Foreach
15:47:02,858 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [debug] Created '20' parsers.
15:47:02,859 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [trace] Velocimacro : initialization starting.
15:47:02,859 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [debug] Velocimacro : "velocimacro.library" is not set.  Trying default library: VM_global_library.vm
15:47:02,860 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [debug] Could not load resource 'VM_global_library.vm' from ResourceLoader org.apache.velocity.tools.view.WebappResourceLoader:  - org.apache.velocity.exception.ResourceNotFoundException: WebappResourceLoader: Resource 'VM_global_library.vm' not found.
15:47:02,860 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [debug] Velocimacro : Default library not found.
15:47:02,860 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [debug] Velocimacro : allowInline = true : VMs can be defined inline in templates
15:47:02,860 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [debug] Velocimacro : allowInlineToOverride = false : VMs defined inline may NOT replace previous VM definitions
15:47:02,861 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [debug] Velocimacro : allowInlineLocal = false : VMs defined inline will be global in scope if allowed.
15:47:02,861 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [debug] Velocimacro : autoload off : VM system will not automatically reload global library macros
15:47:02,861 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [trace] Velocimacro : Velocimacro : initialization complete.
15:47:02,861 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [trace] RuntimeInstance successfully initialized.
15:47:02,862 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [trace] Searching for configuration at: /WEB-INF/toolbox.xml
15:47:02,863 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [debug] Did not find resource at: /WEB-INF/toolbox.xml
15:47:02,863 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [trace] Loading default tools configuration...
15:47:02,939 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [trace] Searching for configuration at: /WEB-INF/tools.xml
15:47:02,939 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [debug] Did not find resource at: /WEB-INF/tools.xml
15:47:02,940 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [debug] Configuring factory with:
FactoryConfiguration from 7 sources including 4 data with 3 toolboxes:
 Toolbox 'application' with 1 properties [scope -auto-> application; ] and 12 tools:
  Tool 'alternator' => org.apache.velocity.tools.generic.AlternatorTool
  Tool 'class' => org.apache.velocity.tools.generic.ClassTool
  Tool 'convert' => org.apache.velocity.tools.generic.ConversionTool
  Tool 'date' => org.apache.velocity.tools.generic.ComparisonDateTool
  Tool 'display' => org.apache.velocity.tools.generic.DisplayTool
  Tool 'esc' => org.apache.velocity.tools.generic.EscapeTool
  Tool 'field' => org.apache.velocity.tools.generic.FieldTool
  Tool 'math' => org.apache.velocity.tools.generic.MathTool
  Tool 'number' => org.apache.velocity.tools.generic.NumberTool
  Tool 'sorter' => org.apache.velocity.tools.generic.SortTool
  Tool 'text' => org.apache.velocity.tools.generic.ResourceTool
  Tool 'xml' => org.apache.velocity.tools.generic.XmlTool

 Toolbox 'request' with 1 properties [scope -auto-> request; ] and 10 tools:
  Tool 'context' => org.apache.velocity.tools.view.ViewContextTool
  Tool 'cookies' => org.apache.velocity.tools.view.CookieTool
  Tool 'import' => org.apache.velocity.tools.view.ImportTool
  Tool 'include' => org.apache.velocity.tools.view.IncludeTool
  Tool 'link' => org.apache.velocity.tools.struts.StrutsLinkTool
  Tool 'loop' => org.apache.velocity.tools.generic.LoopTool
  Tool 'pager' => org.apache.velocity.tools.view.PagerTool
  Tool 'params' => org.apache.velocity.tools.view.ParameterTool
  Tool 'render' => org.apache.velocity.tools.generic.RenderTool
  Tool 'tiles' => org.apache.tiles.velocity.template.VelocityStyleTilesTool with 1 properties [key -auto-> tiles; ]

 Toolbox 'session' with 2 properties [createSession -auto-> false; scope -auto-> session; ] and 1 tools:
  Tool 'browser' => org.apache.velocity.tools.view.BrowserTool

 Data 'GENERIC_TOOLS_AVAILABLE' -boolean-> true
 Data 'STRUTS_TOOLS_AVAILABLE' -boolean-> true
 Data 'TOOLS_VERSION' -number-> 2.0
 Data 'VIEW_TOOLS_AVAILABLE' -boolean-> true

 Source 0: org.apache.velocity.tools.config.FactoryConfiguration(VelocityView.configure(config,factory))
 Source 1: org.apache.velocity.tools.config.XmlFactoryConfiguration(ConfigurationUtils.getDefaultTools())
 Source 2:     .read(vfs:/content/SicemWEB_6.1.0.13.06.war/WEB-INF/lib/velocity-tools-2.0.jar/org/apache/velocity/tools/generic/tools.xml)
 Source 3:     .read(vfs:/content/SicemWEB_6.1.0.13.06.war/WEB-INF/lib/velocity-tools-2.0.jar/org/apache/velocity/tools/view/tools.xml)
 Source 4:     .read(vfs:/content/SicemWEB_6.1.0.13.06.war/WEB-INF/lib/velocity-tools-2.0.jar/org/apache/velocity/tools/struts/tools.xml)
 Source 5: org.apache.velocity.tools.config.FactoryConfiguration(ConfigurationUtils.getAutoLoaded(false))
 Source 6: org.apache.velocity.tools.config.XmlFactoryConfiguration(ConfigurationUtils.read(vfs:/content/SicemWEB_6.1.0.13.06.war/WEB-INF/lib/tiles-velocity-3.0.5.jar/tools.xml))

15:47:02,943 INFO  [org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/sicem]] (ServerService Thread Pool -- 78)  Velocity  [debug] Default Content-Type is: text/html
15:47:02,962 INFO  [org.apache.tiles.access.TilesAccess] (ServerService Thread Pool -- 78) Publishing TilesContext for context: org.apache.tiles.request.servlet.wildcard.WildcardServletApplicationContext
15:47:02,970 INFO  [org.apache.commons.vfs.impl.DefaultFileReplicator] (ServerService Thread Pool -- 78) Using "/tmp/vfs_cache" as temporary files store.
15:47:03,088 ERROR [stderr] (ServerService Thread Pool -- 78) ScriptEngineManager providers.next(): javax.script.ScriptEngineFactory: Provider com.sun.script.javascript.RhinoScriptEngineFactory not found
15:47:03,117 INFO  [stdout] (ServerService Thread Pool -- 78) 2026-10-01 15:47:03,117 ServerService Thread Pool -- 78 ERROR Unable to access file:/content/SicemWEB_6.1.0.13.06.war/WEB-INF/classes/log4j2-linux.xml java.io.FileNotFoundException: /content/SicemWEB_6.1.0.13.06.war/WEB-INF/classes/log4j2-linux.xml (No such file or directory)
15:47:03,118 INFO  [stdout] (ServerService Thread Pool -- 78)   at java.io.FileInputStream.open0(Native Method)
15:47:03,118 INFO  [stdout] (ServerService Thread Pool -- 78)   at java.io.FileInputStream.open(FileInputStream.java:195)
15:47:03,118 INFO  [stdout] (ServerService Thread Pool -- 78)   at java.io.FileInputStream.<init>(FileInputStream.java:138)
15:47:03,118 INFO  [stdout] (ServerService Thread Pool -- 78)   at java.io.FileInputStream.<init>(FileInputStream.java:93)
15:47:03,118 INFO  [stdout] (ServerService Thread Pool -- 78)   at sun.net.www.protocol.file.FileURLConnection.connect(FileURLConnection.java:90)
15:47:03,118 INFO  [stdout] (ServerService Thread Pool -- 78)   at sun.net.www.protocol.file.FileURLConnection.getInputStream(FileURLConnection.java:188)
15:47:03,118 INFO  [stdout] (ServerService Thread Pool -- 78)   at java.net.URL.openStream(URL.java:1092)
15:47:03,118 INFO  [stdout] (ServerService Thread Pool -- 78)   at org.apache.logging.log4j.core.config.ConfigurationFactory.getInputFromUri(ConfigurationFactory.java:307)
15:47:03,119 INFO  [stdout] (ServerService Thread Pool -- 78)   at org.apache.logging.log4j.core.config.ConfigurationFactory.getConfiguration(ConfigurationFactory.java:242)
15:47:03,119 INFO  [stdout] (ServerService Thread Pool -- 78)   at org.apache.logging.log4j.core.config.ConfigurationFactory$Factory.getConfiguration(ConfigurationFactory.java:443)
15:47:03,119 INFO  [stdout] (ServerService Thread Pool -- 78)   at org.apache.logging.log4j.core.config.ConfigurationFactory.getConfiguration(ConfigurationFactory.java:265)
15:47:03,119 INFO  [stdout] (ServerService Thread Pool -- 78)   at org.apache.logging.log4j.core.LoggerContext.reconfigure(LoggerContext.java:613)
15:47:03,119 INFO  [stdout] (ServerService Thread Pool -- 78)   at org.apache.logging.log4j.core.LoggerContext.setConfigLocation(LoggerContext.java:603)
15:47:03,119 INFO  [stdout] (ServerService Thread Pool -- 78)   at br.gov.caixa.sicem.util.Log.<init>(Log.java:25)
15:47:03,119 INFO  [stdout] (ServerService Thread Pool -- 78)   at br.gov.caixa.sicem.util.Log.getInstance(Log.java:57)
15:47:03,119 INFO  [stdout] (ServerService Thread Pool -- 78)   at br.gov.caixa.sicem.dao.AbstractDao.<init>(AbstractDao.java:32)
15:47:03,120 INFO  [stdout] (ServerService Thread Pool -- 78)   at br.gov.caixa.sicem.dao.ConfiguracaoDao.<init>(ConfiguracaoDao.java:21)
15:47:03,120 INFO  [stdout] (ServerService Thread Pool -- 78)   at br.gov.caixa.sicem.action.ApplicationWatch.reiniciaServicoRecepcao(ApplicationWatch.java:76)
15:47:03,120 INFO  [stdout] (ServerService Thread Pool -- 78)   at br.gov.caixa.sicem.action.ApplicationWatch.reiniciarServicos(ApplicationWatch.java:161)
15:47:03,120 INFO  [stdout] (ServerService Thread Pool -- 78)   at br.gov.caixa.sicem.action.ApplicationWatch.contextInitialized(ApplicationWatch.java:60)
15:47:03,120 INFO  [stdout] (ServerService Thread Pool -- 78)   at org.apache.catalina.core.StandardContext.contextListenerStart(StandardContext.java:3339)
15:47:03,120 INFO  [stdout] (ServerService Thread Pool -- 78)   at org.apache.catalina.core.StandardContext.start(StandardContext.java:3780)
15:47:03,120 INFO  [stdout] (ServerService Thread Pool -- 78)   at org.jboss.as.web.deployment.WebDeploymentService.doStart(WebDeploymentService.java:163)
15:47:03,120 INFO  [stdout] (ServerService Thread Pool -- 78)   at org.jboss.as.web.deployment.WebDeploymentService.access$000(WebDeploymentService.java:61)
15:47:03,120 INFO  [stdout] (ServerService Thread Pool -- 78)   at org.jboss.as.web.deployment.WebDeploymentService$1.run(WebDeploymentService.java:96)
15:47:03,121 INFO  [stdout] (ServerService Thread Pool -- 78)   at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
15:47:03,121 INFO  [stdout] (ServerService Thread Pool -- 78)   at java.util.concurrent.FutureTask.run(FutureTask.java:266)
15:47:03,121 INFO  [stdout] (ServerService Thread Pool -- 78)   at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
15:47:03,121 INFO  [stdout] (ServerService Thread Pool -- 78)   at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
15:47:03,121 INFO  [stdout] (ServerService Thread Pool -- 78)   at java.lang.Thread.run(Thread.java:750)
15:47:03,121 INFO  [stdout] (ServerService Thread Pool -- 78)   at org.jboss.threads.JBossThread.run(JBossThread.java:122)
15:47:03,121 INFO  [stdout] (ServerService Thread Pool -- 78)
15:47:03,123 INFO  [stdout] (ServerService Thread Pool -- 78) 2026-10-01 15:47:03,122 ServerService Thread Pool -- 78 ERROR Unable to access file:/content/SicemWEB_6.1.0.13.06.war/WEB-INF/classes/log4j2-linux.xml java.io.FileNotFoundException: /content/SicemWEB_6.1.0.13.06.war/WEB-INF/classes/log4j2-linux.xml (No such file or directory)
15:47:03,123 INFO  [stdout] (ServerService Thread Pool -- 78)   at java.io.FileInputStream.open0(Native Method)
15:47:03,123 INFO  [stdout] (ServerService Thread Pool -- 78)   at java.io.FileInputStream.open(FileInputStream.java:195)
15:47:03,123 INFO  [stdout] (ServerService Thread Pool -- 78)   at java.io.FileInputStream.<init>(FileInputStream.java:138)
15:47:03,123 INFO  [stdout] (ServerService Thread Pool -- 78)   at java.io.FileInputStream.<init>(FileInputStream.java:93)
15:47:03,123 INFO  [stdout] (ServerService Thread Pool -- 78)   at sun.net.www.protocol.file.FileURLConnection.connect(FileURLConnection.java:90)
15:47:03,123 INFO  [stdout] (ServerService Thread Pool -- 78)   at sun.net.www.protocol.file.FileURLConnection.getInputStream(FileURLConnection.java:188)
15:47:03,123 INFO  [stdout] (ServerService Thread Pool -- 78)   at java.net.URL.openStream(URL.java:1092)
15:47:03,124 INFO  [stdout] (ServerService Thread Pool -- 78)   at org.apache.logging.log4j.core.config.ConfigurationFactory.getInputFromUri(ConfigurationFactory.java:307)
15:47:03,124 INFO  [stdout] (ServerService Thread Pool -- 78)   at org.apache.logging.log4j.core.config.ConfigurationFactory.getConfiguration(ConfigurationFactory.java:242)
15:47:03,124 INFO  [stdout] (ServerService Thread Pool -- 78)   at org.apache.logging.log4j.core.config.ConfigurationFactory$Factory.getConfiguration(ConfigurationFactory.java:443)
15:47:03,124 INFO  [stdout] (ServerService Thread Pool -- 78)   at org.apache.logging.log4j.core.config.ConfigurationFactory.getConfiguration(ConfigurationFactory.java:265)
15:47:03,124 INFO  [stdout] (ServerService Thread Pool -- 78)   at org.apache.logging.log4j.core.LoggerContext.reconfigure(LoggerContext.java:613)
15:47:03,124 INFO  [stdout] (ServerService Thread Pool -- 78)   at org.apache.logging.log4j.core.LoggerContext.setConfigLocation(LoggerContext.java:603)
15:47:03,124 INFO  [stdout] (ServerService Thread Pool -- 78)   at br.gov.caixa.sicem.util.Log.<init>(Log.java:25)
15:47:03,124 INFO  [stdout] (ServerService Thread Pool -- 78)   at br.gov.caixa.sicem.util.Log.getInstance(Log.java:57)
15:47:03,124 INFO  [stdout] (ServerService Thread Pool -- 78)   at br.gov.caixa.sicem.dao.AbstractDao.<init>(AbstractDao.java:32)
15:47:03,125 INFO  [stdout] (ServerService Thread Pool -- 78)   at br.gov.caixa.sicem.dao.ConfiguracaoDao.<init>(ConfiguracaoDao.java:21)
15:47:03,125 INFO  [stdout] (ServerService Thread Pool -- 78)   at br.gov.caixa.sicem.action.ApplicationWatch.reiniciaServicoRecepcao(ApplicationWatch.java:76)
15:47:03,125 INFO  [stdout] (ServerService Thread Pool -- 78)   at br.gov.caixa.sicem.action.ApplicationWatch.reiniciarServicos(ApplicationWatch.java:161)
15:47:03,125 INFO  [stdout] (ServerService Thread Pool -- 78)   at br.gov.caixa.sicem.action.ApplicationWatch.contextInitialized(ApplicationWatch.java:60)
15:47:03,125 INFO  [stdout] (ServerService Thread Pool -- 78)   at org.apache.catalina.core.StandardContext.contextListenerStart(StandardContext.java:3339)
15:47:03,125 INFO  [stdout] (ServerService Thread Pool -- 78)   at org.apache.catalina.core.StandardContext.start(StandardContext.java:3780)
15:47:03,125 INFO  [stdout] (ServerService Thread Pool -- 78)   at org.jboss.as.web.deployment.WebDeploymentService.doStart(WebDeploymentService.java:163)
15:47:03,125 INFO  [stdout] (ServerService Thread Pool -- 78)   at org.jboss.as.web.deployment.WebDeploymentService.access$000(WebDeploymentService.java:61)
15:47:03,125 INFO  [stdout] (ServerService Thread Pool -- 78)   at org.jboss.as.web.deployment.WebDeploymentService$1.run(WebDeploymentService.java:96)
15:47:03,126 INFO  [stdout] (ServerService Thread Pool -- 78)   at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
15:47:03,126 INFO  [stdout] (ServerService Thread Pool -- 78)   at java.util.concurrent.FutureTask.run(FutureTask.java:266)
15:47:03,126 INFO  [stdout] (ServerService Thread Pool -- 78)   at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
15:47:03,126 INFO  [stdout] (ServerService Thread Pool -- 78)   at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
15:47:03,126 INFO  [stdout] (ServerService Thread Pool -- 78)   at java.lang.Thread.run(Thread.java:750)
15:47:03,126 INFO  [stdout] (ServerService Thread Pool -- 78)   at org.jboss.threads.JBossThread.run(JBossThread.java:122)
15:47:03,126 INFO  [stdout] (ServerService Thread Pool -- 78)
15:47:03,134 ERROR [stderr] (ServerService Thread Pool -- 78) ScriptEngineManager providers.next(): javax.script.ScriptEngineFactory: Provider com.sun.script.javascript.RhinoScriptEngineFactory not found
15:47:03,797 INFO  [org.quartz.simpl.SimpleThreadPool] (ServerService Thread Pool -- 78) Job execution threads will use class loader of thread: ServerService Thread Pool -- 78
15:47:03,810 INFO  [org.quartz.core.SchedulerSignalerImpl] (ServerService Thread Pool -- 78) Initialized Scheduler Signaller of type: class org.quartz.core.SchedulerSignalerImpl
15:47:03,811 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 78) Quartz Scheduler v.1.8.5 created.
15:47:03,812 INFO  [org.quartz.simpl.RAMJobStore] (ServerService Thread Pool -- 78) RAMJobStore initialized.
15:47:03,812 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 78) Scheduler meta-data: Quartz Scheduler (v1.8.5) 'DefaultQuartzScheduler' with instanceId 'NON_CLUSTERED'
  Scheduler class: 'org.quartz.core.QuartzScheduler' - running locally.
  NOT STARTED.
  Currently in standby mode.
  Number of jobs executed: 0
  Using thread pool 'org.quartz.simpl.SimpleThreadPool' - with 10 threads.
  Using job-store 'org.quartz.simpl.RAMJobStore' - which does not support persistence. and is not clustered.

15:47:03,813 INFO  [org.quartz.impl.StdSchedulerFactory] (ServerService Thread Pool -- 78) Quartz scheduler 'DefaultQuartzScheduler' initialized from default resource file in Quartz package: 'quartz.properties'
15:47:03,813 INFO  [org.quartz.impl.StdSchedulerFactory] (ServerService Thread Pool -- 78) Quartz scheduler version: 1.8.5
15:47:03,821 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 78) Scheduler DefaultQuartzScheduler_$_NON_CLUSTERED started.
15:47:03,823 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 78) Scheduler DefaultQuartzScheduler_$_NON_CLUSTERED started.
15:47:03,824 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 78) Scheduler DefaultQuartzScheduler_$_NON_CLUSTERED started.
15:47:03,825 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 78) Scheduler DefaultQuartzScheduler_$_NON_CLUSTERED started.
15:47:03,826 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 78) Scheduler DefaultQuartzScheduler_$_NON_CLUSTERED started.
15:47:03,827 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 78) Scheduler DefaultQuartzScheduler_$_NON_CLUSTERED started.
15:47:03,829 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 78) Scheduler DefaultQuartzScheduler_$_NON_CLUSTERED started.
15:47:03,829 INFO  [br.gov.caixa.sicem.action.ApplicationWatch] (ServerService Thread Pool -- 78) INICIANDO PROCEDIMENTO DE TRATAR ARQUIVOS NÃO PROCESSADOS
15:47:03,832 INFO  [br.gov.caixa.sicem.action.ApplicationWatch] (ServerService Thread Pool -- 78) NÃO EXISTE ARQUIVO SEM PROCESSAMENTO
15:47:03,833 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 78) Scheduler DefaultQuartzScheduler_$_NON_CLUSTERED started.
15:47:03,835 INFO  [org.quartz.core.QuartzScheduler] (ServerService Thread Pool -- 78) Scheduler DefaultQuartzScheduler_$_NON_CLUSTERED started.
15:47:03,913 INFO  [com.opensymphony.xwork2.config.providers.XmlConfigurationProvider] (ServerService Thread Pool -- 78) Parsing configuration file [struts-default.xml]
15:47:03,940 INFO  [com.opensymphony.xwork2.config.providers.XmlConfigurationProvider] (ServerService Thread Pool -- 78) Parsing configuration file [struts-plugin.xml]
15:47:03,957 INFO  [com.opensymphony.xwork2.config.providers.XmlConfigurationProvider] (ServerService Thread Pool -- 78) Parsing configuration file [struts.xml]
15:47:03,959 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (spring) for (com.opensymphony.xwork2.ObjectFactory)
15:47:03,959 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.factory.ActionFactory)
15:47:03,959 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.factory.ResultFactory)
15:47:03,959 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.factory.ConverterFactory)
15:47:03,959 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.factory.InterceptorFactory)
15:47:03,959 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.factory.ValidatorFactory)
15:47:03,960 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.factory.UnknownHandlerFactory)
15:47:03,960 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.FileManagerFactory)
15:47:03,960 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.impl.XWorkConverter)
15:47:03,960 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.impl.CollectionConverter)
15:47:03,960 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.impl.ArrayConverter)
15:47:03,960 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.impl.DateConverter)
15:47:03,960 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.impl.NumberConverter)
15:47:03,960 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.impl.StringConverter)
15:47:03,960 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.ConversionPropertiesProcessor)
15:47:03,960 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.ConversionFileProcessor)
15:47:03,961 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.ConversionAnnotationProcessor)
15:47:03,962 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.TypeConverterCreator)
15:47:03,962 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.TypeConverterHolder)
15:47:03,962 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.TextProvider)
15:47:03,962 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.LocaleProvider)
15:47:03,963 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.ActionProxyFactory)
15:47:03,963 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.conversion.ObjectTypeDeterminer)
15:47:03,963 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (org.apache.struts2.dispatcher.mapper.ActionMapper)
15:47:03,963 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (jakarta) for (org.apache.struts2.dispatcher.multipart.MultiPartRequest)
15:47:03,970 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (org.apache.struts2.views.freemarker.FreemarkerManager)
15:47:03,970 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (org.apache.struts2.views.velocity.VelocityManager)
15:47:03,970 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (org.apache.struts2.components.UrlRenderer)
15:47:03,970 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.validator.ActionValidatorManager)
15:47:03,971 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.util.ValueStackFactory)
15:47:03,971 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.util.reflection.ReflectionProvider)
15:47:03,971 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.util.reflection.ReflectionContextFactory)
15:47:03,971 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.util.PatternMatcher)
15:47:03,971 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (org.apache.struts2.util.ContentTypeMatcher)
15:47:03,971 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (org.apache.struts2.dispatcher.StaticContentLoader)
15:47:03,971 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.UnknownHandlerManager)
15:47:03,971 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (org.apache.struts2.views.util.UrlHelper)
15:47:03,971 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.util.TextParser)
15:47:03,972 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (org.apache.struts2.dispatcher.DispatcherErrorHandler)
15:47:03,972 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.security.ExcludedPatternsChecker)
15:47:03,972 INFO  [org.apache.struts2.config.AbstractBeanSelectionProvider] (ServerService Thread Pool -- 78) Choosing bean (struts) for (com.opensymphony.xwork2.security.AcceptedPatternsChecker)
15:47:03,974 INFO  [org.apache.struts2.config.DefaultBeanSelectionProvider] (ServerService Thread Pool -- 78) Loading global messages from [applicationResources]
15:47:03,981 INFO  [org.apache.struts2.spring.StrutsSpringObjectFactory] (ServerService Thread Pool -- 78) Initializing Struts-Spring integration...
15:47:03,981 INFO  [com.opensymphony.xwork2.spring.SpringObjectFactory] (ServerService Thread Pool -- 78) Setting autowire strategy to name
15:47:03,981 INFO  [org.apache.struts2.spring.StrutsSpringObjectFactory] (ServerService Thread Pool -- 78) ... initialized Struts-Spring integration successfully
15:47:04,342 INFO  [org.jboss.as.server] (Controller Boot Thread) JBAS015859: Implantado "SICEM" (runtime-name: "SicemWEB_6.1.0.13.06.war")
15:47:04,343 INFO  [org.jboss.as.server] (Controller Boot Thread) JBAS015859: Implantado "postgresql-9.1-901-1.jdbc4.jar" (runtime-name: "postgresql-9.1-901-1.jdbc4.jar")
15:47:04,343 INFO  [org.jboss.as.server] (Controller Boot Thread) JBAS015859: Implantado "wmq.jmsra.rar" (runtime-name: "wmq.jmsra.rar")
15:47:04,346 INFO  [org.jboss.as] (Controller Boot Thread) JBAS015874: JBoss EAP 6.4.24.GA (AS 7.5.24.Final-redhat-00001) iniciado em 8693ms - Iniciado 687 de serviços 788 (os serviços 131 são lazy, passivos ou em demanda)

