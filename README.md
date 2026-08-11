/logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log


scp -F /dev/null p585600@10.116.200.228:/logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log ./server.log



-sh-4.2$ /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log
-sh: /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log: Permissão negada
-sh-4.2$
-sh-4.2$
-sh-4.2$ sudo su

Presumimos que você recebeu as instruções de sempre do administrador
de sistema local. Basicamente, resume-se a estas três coisas:

    #1) Respeite a privacidade dos outros.
    #2) Pense antes de digitar.
    #3) Com grandes poderes vêm grandes responsabilidades.

[sudo] senha para p585600:
[root@caddeapllx2484 p585600]# /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log
bash: /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log: Permissão negada
[root@caddeapllx2484 p585600]# scp -F /dev/null p585600@10.116.200.228:/logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log ./server.log
The authenticity of host '10.116.200.228 (10.116.200.228)' can't be established.
ECDSA key fingerprint is SHA256:xkjohp18ZK8P189dz6QtUSfyYHcAs3p/NFdVzjbCuPE.
ECDSA key fingerprint is MD5:15:45:45:d7:74:54:06:d6:77:5e:23:4b:36:10:89:41.
Are you sure you want to continue connecting (yes/no)? yes
Warning: Permanently added '10.116.200.228' (ECDSA) to the list of known hosts.
p585600@10.116.200.228's password:
server.log                                                                                                                                 100% 1666KB  69.4MB/s   00:00
[root@caddeapllx2484 p585600]#



04:00:01,271 INFO  [org.apache.coyote.http11.Http11Protocol] (MSC service thread 1-4) Pausing Coyote HTTP/1.1 on http-/0.0.0.0:8080
04:00:01,272 INFO  [org.apache.coyote.http11.Http11Protocol] (MSC service thread 1-4) Stopping Coyote HTTP/1.1 on http-/0.0.0.0:8080
04:00:01,280 INFO  [org.apache.coyote.http11.Http11Protocol] (MSC service thread 1-4) Pausing Coyote HTTP/1.1 on http-/0.0.0.0:8443
04:00:01,298 INFO  [org.apache.coyote.http11.Http11Protocol] (MSC service thread 1-4) Stopping Coyote HTTP/1.1 on http-/0.0.0.0:8443
04:00:01,292 INFO  [org.jboss.as.osgi] (MSC service thread 1-3) JBAS011908: Cancelamento do registro do módulo: Module "deployment.simil.ear.simil-ejb-2.67.5.4-20260411.3.jar:main" from Service Module Loader
04:00:01,301 INFO  [org.apache.catalina.core.StandardContext] (MSC service thread 1-4) Container org.apache.catalina.core.ContainerBase.[jboss.web].[default-host].[/] has not been started
04:00:01,286 INFO  [org.jboss.as.osgi] (MSC service thread 1-2) JBAS011908: Cancelamento do registro do módulo: Module "deployment.simil.ear.simil-web-2.67.5.4-20260411.3.war:main" from Service Module Loader
04:00:18,842 INFO  [org.jboss.as.configadmin] (ServerService Thread Pool -- 26) JBAS016200: Ativação do Sub-sistema ConfigAdmin
04:00:18,856 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 31) JBAS010280: Ativação do subsistema Infinispan.
04:00:18,906 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 27) JBAS010404: Deploying non-JDBC-compliant driver class org.postgresql.Driver (version 42.2)
04:00:18,910 INFO  [org.jboss.as.connector.logging] (MSC service thread 1-1) JBAS010408: Inicialização JCA do Sub-sistema (JBoss IronJacamar 1.0.13.Final-redhat-1)
04:00:18,920 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 27) JBAS010403: Implantação do driver compatível-JDBC class org.h2.Driver (versão 1.3)
04:00:18,924 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 38) JBAS011800: Ativação do Sub-sistema de Nomeação
04:00:18,931 INFO  [org.jboss.as.osgi] (ServerService Thread Pool -- 39) JBAS011906: Ativação do Sub-sistema OSGi
04:00:18,949 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 44) JBAS013171: Ativação do Sub-sistema de Segurança
04:00:18,978 INFO  [org.jboss.as.security] (MSC service thread 1-1) JBAS013170: Versão =4.0.14.Final-redhat-2 PicketBox Atual


04:00:18,987 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 48) JBAS015537: Ativação da Extensão WebServices
04:00:19,021 INFO  [org.jboss.as.naming] (MSC service thread 1-2) JBAS011802: Iniciando o Serviço de Nomeação
04:00:19,023 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-4) JBAS015400: Sessão de correio limitado [java:jboss/mail/expresso]
04:00:19,194 INFO  [org.jboss.ws.common.management.AbstractServerConfig] (MSC service thread 1-1) JBoss Web Services - Stack CXF Server 4.0.6.GA-redhat-2
04:00:19,252 INFO  [org.apache.coyote.http11.Http11Protocol] (MSC service thread 1-3) Starting Coyote HTTP/1.1 on http-/0.0.0.0:8080
04:00:19,478 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-2) JBAS010400: Limite da fonte de dados [java:/SimilDS]
04:00:19,668 INFO  [org.apache.coyote.http11.Http11Protocol] (MSC service thread 1-1) Starting Coyote HTTP/1.1 on http-/0.0.0.0:8443
04:00:19,849 INFO  [org.jboss.as.remoting] (MSC service thread 1-1) JBAS017100: Escutando no 0.0.0.0:4447
04:00:19,850 INFO  [org.jboss.as.remoting] (MSC service thread 1-2) JBAS017100: Escutando no 0.0.0.0:9999
04:00:19,852 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-4) JBAS015012: Foi iniciado o FileSystemDeploymentService para o diretório /opt/EAP-6.0.1/jboss-eap-6.0/standalone/deployments
04:00:19,854 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) JBAS015876: Iniciando a implantação do "simil.ear"
04:00:20,760 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) JBAS015876: Iniciando a implantação do "simil-web-2.67.5.4-20260411.3.war"
04:00:20,760 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) JBAS015876: Iniciando a implantação do "amsfw-ejb-1.7.0.jar"
04:00:20,761 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) JBAS015876: Iniciando a implantação do "simil-ejb-2.67.5.4-20260411.3.jar"
04:00:20,761 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) JBAS015876: Iniciando a implantação do "siico-ejb-1.0.29.jar"
04:00:20,761 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) JBAS015876: Iniciando a implantação do "amsfw-ws-1.7.0.jar"
04:00:20,766 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) JBAS015960: A entrada do Caminho da Classe javax.jms-api-2.0.jar no /content/simil.ear/simil-ejb-2.67.5.4-20260411.3.jar não aponta a um jar válido da referência do Class-Path
04:00:20,766 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) JBAS015960: A entrada do Caminho da Classe commons-beanutils-1.8.0.jar no /content/simil.ear/simil-ejb-2.67.5.4-20260411.3.jar não aponta a um jar válido da referência do Class-Path
04:00:20,766 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) JBAS015960: A entrada do Caminho da Classe commons-logging-1.1.1.jar no /content/simil.ear/simil-ejb-2.67.5.4-20260411.3.jar não aponta a um jar válido da referência do Class-Path
04:00:20,766 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) JBAS015960: A entrada do Caminho da Classe commons-lang-2.3.jar no /content/simil.ear/simil-ejb-2.67.5.4-20260411.3.jar não aponta a um jar válido da referência do Class-Path
04:00:20,766 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) JBAS015960: A entrada do Caminho da Classe recaptcha4j-0.0.7.jar no /content/simil.ear/simil-ejb-2.67.5.4-20260411.3.jar não aponta a um jar válido da referência do Class-Path
04:00:22,702 WARN  [org.jboss.as.ejb3] (MSC service thread 1-2) JBAS014219: [EJB3.1 spec, section 4.9.2] Session bean implementation class MUST be public, not abstract and not final - br.com.unisys.simil.dao.laudo.DeterminacaoValorVenalDAO won't be considered as a session bean, since it doesn't meet that requirement
04:00:22,740 INFO  [org.jboss.as.jpa] (MSC service thread 1-2) JBAS011401: Leia a persistence.xml para simil
04:00:22,899 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-1) JBAS018567: A implantação "deployment.simil.ear.simil-ejb-2.67.5.4-20260411.3.jar" está usando um módulo privado ("com.sun.xml.messaging.saaj:main") que pode ser alteradp ou removido em versões futuras sem nenhum aviso.
04:00:22,901 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-2) JBAS018567: A implantação "deployment.simil.ear.siico-ejb-1.0.29.jar" está usando um módulo privado ("com.sun.xml.messaging.saaj:main") que pode ser alteradp ou removido em versões futuras sem nenhum aviso.
04:00:22,922 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-2) JBAS018567: A implantação "deployment.simil.ear.amsfw-ejb-1.7.0.jar" está usando um módulo privado ("com.sun.xml.messaging.saaj:main") que pode ser alteradp ou removido em versões futuras sem nenhum aviso.
04:00:22,942 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-3) JBAS018567: A implantação "deployment.simil.ear" está usando um módulo privado ("com.sun.xml.messaging.saaj:main") que pode ser alteradp ou removido em versões futuras sem nenhum aviso.
04:00:22,946 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-4) JBAS018567: A implantação "deployment.simil.ear.amsfw-ws-1.7.0.jar" está usando um módulo privado ("com.sun.xml.messaging.saaj:main") que pode ser alteradp ou removido em versões futuras sem nenhum aviso.
04:00:23,096 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-2) JBAS018567: A implantação "deployment.simil.ear.simil-web-2.67.5.4-20260411.3.war" está usando um módulo privado ("com.sun.xml.messaging.saaj:main") que pode ser alteradp ou removido em versões futuras sem nenhum aviso.
04:00:23,206 INFO  [org.jboss.as.ejb3.deployment.processors.EjbJndiBindingsDeploymentUnitProcessor] (MSC service thread 1-1) JNDI bindings for session bean named EmailService in deployment unit subdeployment "amsfw-ejb-1.7.0.jar" of deployment "simil.ear" are as follows:

	java:global/simil/amsfw-ejb-1.7.0/EmailService!com.unisys.br.amsfw.dao.util.service.email.EmailService
	java:app/amsfw-ejb-1.7.0/EmailService!com.unisys.br.amsfw.dao.util.service.email.EmailService
	java:module/EmailService!com.unisys.br.amsfw.dao.util.service.email.EmailService
	java:global/simil/amsfw-ejb-1.7.0/EmailService
	java:app/amsfw-ejb-1.7.0/EmailService
	java:module/EmailService

04:00:23,206 INFO  [org.jboss.as.ejb3.deployment.processors.EjbJndiBindingsDeploymentUnitProcessor] (MSC service thread 1-1) JNDI bindings for session bean named EmailServiceImpl in deployment unit subdeployment "amsfw-ejb-1.7.0.jar" of deployment "simil.ear" are as follows:

	java:global/simil/amsfw-ejb-1.7.0/EmailServiceImpl!com.unisys.br.amsfw.dao.util.service.email.EmailServiceLocal
	java:app/amsfw-ejb-1.7.0/EmailServiceImpl!com.unisys.br.amsfw.dao.util.service.email.EmailServiceLocal
	java:module/EmailServiceImpl!com.unisys.br.amsfw.dao.util.service.email.EmailServiceLocal
	java:global/simil/amsfw-ejb-1.7.0/EmailServiceImpl
	java:app/amsfw-ejb-1.7.0/EmailServiceImpl
	java:module/EmailServiceImpl

04:00:23,270 INFO  [org.jboss.as.ejb3.deployment.processors.EjbJndiBindingsDeploymentUnitProcessor] (MSC service thread 1-4) JNDI bindings for session bean named LocalidadeDAO in deployment unit subdeployment "siico-ejb-1.0.29.jar" of deployment "simil.ear" are as follows:

	java:global/simil/siico-ejb-1.0.29/LocalidadeDAO!br.gov.cef.siico.dao.endereco.LocalidadeDAOLocal
	java:app/siico-ejb-1.0.29/LocalidadeDAO!br.gov.cef.siico.dao.endereco.LocalidadeDAOLocal
	java:module/LocalidadeDAO!br.gov.cef.siico.dao.endereco.LocalidadeDAOLocal
	java:global/simil/siico-ejb-1.0.29/LocalidadeDAO
	java:app/siico-ejb-1.0.29/LocalidadeDAO
	java:module/LocalidadeDAO

04:00:23,270 INFO  [org.jboss.as.ejb3.deployment.processors.EjbJndiBindingsDeploymentUnitProcessor] (MSC service thread 1-4) JNDI bindings for session bean named SistemaDAO in deployment unit subdeployment "siico-ejb-1.0.29.jar" of deployment "simil.ear" are as follows:

	java:global/simil/siico-ejb-1.0.29/SistemaDAO!br.gov.cef.siico.dao.sistema.SistemaDAOLocal
	java:app/siico-ejb-1.0.29/SistemaDAO!br.gov.cef.siico.dao.sistema.SistemaDAOLocal
	java:module/SistemaDAO!br.gov.cef.siico.dao.sistema.SistemaDAOLocal
	java:global/simil/siico-ejb-1.0.29/SistemaDAO
	java:app/siico-ejb-1.0.29/SistemaDAO
	java:module/SistemaDAO

04:00:23,270 INFO  [org.jboss.as.ejb3.deployment.processors.EjbJndiBindingsDeploymentUnitProcessor] (MSC service thread 1-4) JNDI bindings for session bean named EmpregadoDAO in deployment unit subdeployment "siico-ejb-1.0.29.jar" of deployment "simil.ear" are as follows:

	java:global/simil/siico-ejb-1.0.29/EmpregadoDAO!br.gov.cef.siico.dao.empregado.EmpregadoDAOLocal
	java:app/siico-ejb-1.0.29/EmpregadoDAO!br.gov.cef.siico.dao.empregado.EmpregadoDAOLocal
	java:module/EmpregadoDAO!br.gov.cef.siico.dao.empregado.EmpregadoDAOLocal
	java:global/simil/siico-ejb-1.0.29/EmpregadoDAO
	java:app/siico-ejb-1.0.29/EmpregadoDAO
	java:module/EmpregadoDAO

04:00:23,271 INFO  [org.jboss.as.ejb3.deployment.processors.EjbJndiBindingsDeploymentUnitProcessor] (MSC service thread 1-4) JNDI bindings for session bean named GestaoProdutoDAO in deployment unit subdeployment "siico-ejb-1.0.29.jar" of deployment "simil.ear" are as follows:

	java:global/simil/siico-ejb-1.0.29/GestaoProdutoDAO!br.gov.cef.siico.dao.produto.GestaoProdutoDAOLocal
	java:app/siico-ejb-1.0.29/GestaoProdutoDAO!br.gov.cef.siico.dao.produto.GestaoProdutoDAOLocal
	java:module/GestaoProdutoDAO!br.gov.cef.siico.dao.produto.GestaoProdutoDAOLocal
	java:global/simil/siico-ejb-1.0.29/GestaoProdutoDAO
	java:app/siico-ejb-1.0.29/GestaoProdutoDAO
	java:module/GestaoProdutoDAO

04:00:23,271 INFO  [org.jboss.as.ejb3.deployment.processors.EjbJndiBindingsDeploymentUnitProcessor] (MSC service thread 1-4) JNDI bindings for session bean named TipoUnidadeDAO in deployment unit subdeployment "siico-ejb-1.0.29.jar" of deployment "simil.ear" are as follows:

	java:global/simil/siico-ejb-1.0.29/TipoUnidadeDAO!br.gov.cef.siico.dao.unidade.TipoUnidadeDAOLocal
	java:app/siico-ejb-1.0.29/TipoUnidadeDAO!br.gov.cef.siico.dao.unidade.TipoUnidadeDAOLocal
	java:module/TipoUnidadeDAO!br.gov.cef.siico.dao.unidade.TipoUnidadeDAOLocal
	java:global/simil/siico-ejb-1.0.29/TipoUnidadeDAO
	java:app/siico-ejb-1.0.29/TipoUnidadeDAO
	java:module/TipoUnidadeDAO

04:00:23,271 INFO  [org.jboss.as.ejb3.deployment.processors.EjbJndiBindingsDeploymentUnitProcessor] (MSC service thread 1-4) JNDI bindings for session bean named ProdutoDAO in deployment unit subdeployment "siico-ejb-1.0.29.jar" of deployment "simil.ear" are as follows:

	java:global/simil/siico-ejb-1.0.29/ProdutoDAO!br.gov.cef.siico.dao.produto.ProdutoDAOLocal
	java:app/siico-ejb-1.0.29/ProdutoDAO!br.gov.cef.siico.dao.produto.ProdutoDAOLocal
	java:module/ProdutoDAO!br.gov.cef.siico.dao.produto.ProdutoDAOLocal
	java:global/simil/siico-ejb-1.0.29/ProdutoDAO
	java:app/siico-ejb-1.0.29/ProdutoDAO
	java:module/ProdutoDAO

04:00:23,274 INFO  [org.jboss.as.ejb3.deployment.processors.EjbJndiBindingsDeploymentUnitProcessor] (MSC service thread 1-4) JNDI bindings for session bean named SiicoGenericDAO in deployment unit subdeployment "siico-ejb-1.0.29.jar" of deployment "simil.ear" are as follows:

	java:global/simil/siico-ejb-1.0.29/SiicoGenericDAO!br.gov.cef.siico.dao.util.SiicoGenericDAO
	java:app/siico-ejb-1.0.29/SiicoGenericDAO!br.gov.cef.siico.dao.util.SiicoGenericDAO
	java:module/SiicoGenericDAO!br.gov.cef.siico.dao.util.SiicoGenericDAO
	java:global/simil/siico-ejb-1.0.29/SiicoGenericDAO
	java:app/siico-ejb-1.0.29/SiicoGenericDAO
	java:module/SiicoGenericDAO

04:00:23,275 INFO  [org.jboss.as.ejb3.deployment.processors.EjbJndiBindingsDeploymentUnitProcessor] (MSC service thread 1-4) JNDI bindings for session bean named AtendimentoProdutoDAO in deployment unit subdeployment "siico-ejb-1.0.29.jar" of deployment "simil.ear" are as follows:

	java:global/simil/siico-ejb-1.0.29/AtendimentoProdutoDAO!br.gov.cef.siico.dao.produto.AtendimentoProdutoDAOLocal
	java:app/siico-ejb-1.0.29/AtendimentoProdutoDAO!br.gov.cef.siico.dao.produto.AtendimentoProdutoDAOLocal
	java:module/AtendimentoProdutoDAO!br.gov.cef.siico.dao.produto.AtendimentoProdutoDAOLocal
	java:global/simil/siico-ejb-1.0.29/AtendimentoProdutoDAO
	java:app/siico-ejb-1.0.29/AtendimentoProdutoDAO
	java:module/AtendimentoProdutoDAO

04:00:23,275 INFO  [org.jboss.as.ejb3.deployment.processors.EjbJndiBindingsDeploymentUnitProcessor] (MSC service thread 1-4) JNDI bindings for session bean named TipoCanalDAO in deployment unit subdeployment "siico-ejb-1.0.29.jar" of deployment "simil.ear" are as follows:

	java:global/simil/siico-ejb-1.0.29/TipoCanalDAO!br.gov.cef.siico.dao.produto.TipoCanalDAOLocal
	java:app/siico-ejb-1.0.29/TipoCanalDAO!br.gov.cef.siico.dao.produto.TipoCanalDAOLocal
	java:module/TipoCanalDAO!br.gov.cef.siico.dao.produto.TipoCanalDAOLocal
	java:global/simil/siico-ejb-1.0.29/TipoCanalDAO
	java:app/siico-ejb-1.0.29/TipoCanalDAO
	java:module/TipoCanalDAO

04:00:23,275 INFO  [org.jboss.as.ejb3.deployment.processors.EjbJndiBindingsDeploymentUnitProcessor] (MSC service thread 1-4) JNDI bindings for session bean named UnidadeDAO in deployment unit subdeployment "siico-ejb-1.0.29.jar" of deployment "simil.ear" are as follows:

	java:global/simil/siico-ejb-1.0.29/UnidadeDAO!br.gov.cef.siico.dao.unidade.UnidadeDAOLocal
	java:app/siico-ejb-1.0.29/UnidadeDAO!br.gov.cef.siico.dao.unidade.UnidadeDAOLocal
	java:module/UnidadeDAO!br.gov.cef.siico.dao.unidade.UnidadeDAOLocal
	java:global/simil/siico-ejb-1.0.29/UnidadeDAO
	java:app/siico-ejb-1.0.29/UnidadeDAO
	java:module/UnidadeDAO

04:00:23,280 INFO  [org.jboss.as.ejb3.deployment.processors.EjbJndiBindingsDeploymentUnitProcessor] (MSC service thread 1-4) JNDI bindings for session bean named UFDAO in deployment unit subdeployment "siico-ejb-1.0.29.jar" of deployment "simil.ear" are as follows:

	java:global/simil/siico-ejb-1.0.29/UFDAO!br.gov.cef.siico.dao.endereco.UFDAOLocal
	java:app/siico-ejb-1.0.29/UFDAO!br.gov.cef.siico.dao.endereco.UFDAOLocal
	java:module/UFDAO!br.gov.cef.siico.dao.endereco.UFDAOLocal
	java:global/simil/siico-ejb-1.0.29/UFDAO
	java:app/siico-ejb-1.0.29/UFDAO
	java:module/UFDAO

04:00:23,532 INFO  [org.jboss.as.ejb3.deployment.processors.EjbJndiBindingsDeploymentUnitProcessor] (MSC service thread 1-2) JNDI bindings for session bean named DocumentoService in deployment unit subdeployment "simil-web-2.67.5.4-20260411.3.war" of deployment "simil.ear" are as follows:

	java:global/simil/simil-web-2.67.5.4-20260411.3/DocumentoService!br.com.unisys.simil.web.service.DocumentosServiceLocal
	java:app/simil-web-2.67.5.4-20260411.3/DocumentoService!br.com.unisys.simil.web.service.DocumentosServiceLocal
	java:module/DocumentoService!br.com.unisys.simil.web.service.DocumentosServiceLocal
	java:global/simil/simil-web-2.67.5.4-20260411.3/DocumentoService
	java:app/simil-web-2.67.5.4-20260411.3/DocumentoService
	java:module/DocumentoService

04:00:23,532 INFO  [org.jboss.as.ejb3.deployment.processors.EjbJndiBindingsDeploymentUnitProcessor] (MSC service thread 1-2) JNDI bindings for session bean named CalcularCamposUnidadeAvalianda in deployment unit subdeployment "simil-web-2.67.5.4-20260411.3.war" of deployment "simil.ear" are as follows:

	java:global/simil/simil-web-2.67.5.4-20260411.3/CalcularCamposUnidadeAvalianda!br.com.unisys.simil.web.service.calculo.CalcularCamposUnidadeAvaliandaService
	java:app/simil-web-2.67.5.4-20260411.3/CalcularCamposUnidadeAvalianda!br.com.unisys.simil.web.service.calculo.CalcularCamposUnidadeAvaliandaService
	java:module/CalcularCamposUnidadeAvalianda!br.com.unisys.simil.web.service.calculo.CalcularCamposUnidadeAvaliandaService
	java:global/simil/simil-web-2.67.5.4-20260411.3/CalcularCamposUnidadeAvalianda
	java:app/simil-web-2.67.5.4-20260411.3/CalcularCamposUnidadeAvalianda
	java:module/CalcularCamposUnidadeAvalianda

04:00:23,532 INFO  [org.jboss.as.ejb3.deployment.processors.EjbJndiBindingsDeploymentUnitProcessor] (MSC service thread 1-2) JNDI bindings for session bean named RelatorioCsvService in deployment unit subdeployment "simil-web-2.67.5.4-20260411.3.war" of deployment "simil.ear" are as follows:

	java:global/simil/simil-web-2.67.5.4-20260411.3/RelatorioCsvService!br.com.unisys.simil.web.service.relatorio.RelatorioCsvServiceLocal
	java:app/simil-web-2.67.5.4-20260411.3/RelatorioCsvService!br.com.unisys.simil.web.service.relatorio.RelatorioCsvServiceLocal
	java:module/RelatorioCsvService!br.com.unisys.simil.web.service.relatorio.RelatorioCsvServiceLocal
	java:global/simil/simil-web-2.67.5.4-20260411.3/RelatorioCsvService
	java:app/simil-web-2.67.5.4-20260411.3/RelatorioCsvService
	java:module/RelatorioCsvService

04:00:23,532 INFO  [org.jboss.as.ejb3.deployment.processors.EjbJndiBindingsDeploymentUnitProcessor] (MSC service thread 1-2) JNDI bindings for session bean named ProcessamentoTask in deployment unit subdeployment "simil-web-2.67.5.4-20260411.3.war" of deployment "simil.ear" are as follows:

	java:global/simil/simil-web-2.67.5.4-20260411.3/ProcessamentoTask!br.com.unisys.simil.web.service.relatorio.ProcessamentoTask
	java:app/simil-web-2.67.5.4-20260411.3/ProcessamentoTask!br.com.unisys.simil.web.service.relatorio.ProcessamentoTask
	java:module/ProcessamentoTask!br.com.unisys.simil.web.service.relatorio.ProcessamentoTask
	java:global/simil/simil-web-2.67.5.4-20260411.3/ProcessamentoTask
	java:app/simil-web-2.67.5.4-20260411.3/ProcessamentoTask
	java:module/ProcessamentoTask

04:00:23,533 INFO  [org.jboss.as.ejb3.deployment.processors.EjbJndiBindingsDeploymentUnitProcessor] (MSC service thread 1-2) JNDI bindings for session bean named ProcessamentoPecasFinalizadasService in deployment unit subdeployment "simil-web-2.67.5.4-20260411.3.war" of deployment "simil.ear" are as follows:

	java:global/simil/simil-web-2.67.5.4-20260411.3/ProcessamentoPecasFinalizadasService!br.com.unisys.simil.web.service.relatorio.ProcessamentoPecasFinalizadasServiceLocal
	java:app/simil-web-2.67.5.4-20260411.3/ProcessamentoPecasFinalizadasService!br.com.unisys.simil.web.service.relatorio.ProcessamentoPecasFinalizadasServiceLocal
	java:module/ProcessamentoPecasFinalizadasService!br.com.unisys.simil.web.service.relatorio.ProcessamentoPecasFinalizadasServiceLocal
	java:global/simil/simil-web-2.67.5.4-20260411.3/ProcessamentoPecasFinalizadasService
	java:app/simil-web-2.67.5.4-20260411.3/ProcessamentoPecasFinalizadasService
	java:module/ProcessamentoPecasFinalizadasService

04:00:23,711 INFO  [org.jboss.as.ejb3.deployment.processors.EjbJndiBindingsDeploymentUnitProcessor] (MSC service thread 1-3) JNDI bindings for session bean named HistoricoSubstituicaoService in deployment unit subdeployment "simil-ejb-2.67.5.4-20260411.3.jar" of deployment "simil.ear" are as follows:

	java:global/simil/simil-ejb-2.67.5.4-20260411.3/HistoricoSubstituicaoService!br.com.unisys.simil.service.historicosubstituicao.HistoricoSubstituicaoServiceLocal
	java:app/simil-ejb-2.67.5.4-20260411.3/HistoricoSubstituicaoService!br.com.unisys.simil.service.historicosubstituicao.HistoricoSubstituicaoServiceLocal
	java:module/HistoricoSubstituicaoService!br.com.unisys.simil.service.historicosubstituicao.HistoricoSubstituicaoServiceLocal
	java:global/simil/simil-ejb-2.67.5.4-20260411.3/HistoricoSubstituicaoService
	java:app/simil-ejb-2.67.5.4-20260411.3/HistoricoSubstituicaoService
	java:module/HistoricoSubstituicaoService

04:00:23,711 INFO  [org.jboss.as.ejb3.deployment.processors.EjbJndiBindingsDeploymentUnitProcessor] (MSC service thread 1-3) JNDI bindings for session bean named EmpreendimentoConstrucaoService in deployment unit subdeployment "simil-ejb-2.67.5.4-20260411.3.jar" of deployment "simil.ear" are as follows:

	java:global/simil/simil-ejb-2.67.5.4-20260411.3/EmpreendimentoConstrucaoService!br.com.unisys.simil.service.empreendimento.EmpreendimentoConstrucaoServiceLocal
	java:app/simil-ejb-2.67.5.4-20260411.3/EmpreendimentoConstrucaoService!br.com.unisys.simil.service.empreendimento.EmpreendimentoConstrucaoServiceLocal
	java:module/EmpreendimentoConstrucaoService!br.com.unisys.simil.service.empreendimento.EmpreendimentoConstrucaoServiceLocal
	java:global/simil/simil-ejb-2.67.5.4-20260411.3/EmpreendimentoConstrucaoService
	java:app/simil-ejb-2.67.5.4-20260411.3/EmpreendimentoConstrucaoService
	java:module/EmpreendimentoConstrucaoService

04:00:23,711 INFO  [org.jboss.as.ejb3.deployment.processors.EjbJndiBindingsDeploymentUnitProcessor] (MSC service thread 1-3) JNDI bindings for session bean named ConsultaHistoricaDAO in deployment unit subdeployment "simil-ejb-2.67.5.4-20260411.3.jar" of deployment "simil.ear" are as follows:

	java:global/simil/simil-ejb-2.67.5.4-20260411.3/ConsultaHistoricaDAO!br.com.unisys.simil.dao.unidade.ConsultaHistoricaDAOLocal
	java:app/simil-ejb-2.67.5.4-20260411.3/ConsultaHistoricaDAO!br.com.unisys.simil.dao.unidade.ConsultaHistoricaDAOLocal
	java:module/ConsultaHistoricaDAO!br.com.unisys.simil.dao.unidade.ConsultaHistoricaDAOLocal
	java:global/simil/simil-ejb-2.67.5.4-20260411.3/ConsultaHistoricaDAO
	java:app/simil-ejb-2.67.5.4-20260411.3/ConsultaHistoricaDAO
	java:module/ConsultaHistoricaDAO

04:00:23,712 INFO  [org.jboss.as.ejb3.deployment.processors.EjbJndiBindingsDeploymentUnitProcessor] (MSC service thread 1-3) JNDI bindings for session bean named VariavelProjecaoLaudoDAO in deployment unit subdeployment "simil-ejb-2.67.5.4-20260411.3.jar" of deployment "simil.ear" are as follows:

	java:global/simil/simil-ejb-2.67.5.4-20260411.3/VariavelProjecaoLaudoDAO!br.com.unisys.simil.dao.variavelprojecaolaudo.VariavelProjecaoLaudoDAOLocal
	java:app/simil-ejb-2.67.5.4-20260411.3/VariavelProjecaoLaudoDA


  18 mml linhas


