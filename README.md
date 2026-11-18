
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]# cd /opt/jboss-eap/standalone/deployments
echo "=== libs do EAR (commons-lang) ==="
unzip -l gec-ear.ear | grep -iE "commons-lang|lib/.*lang"
echo "=== conteudo raiz do EAR ==="
unzip -l gec-ear.ear | grep -vE "lib/.*\.jar" | head -40

echo "=== deployment-structure do EAR ==="
unzip -p gec-ear.ear META-INF/jboss-deployment-structure.xml

echo "=== jboss-web / web.xml dos WARs ==="
mkdir -p /tmp/ear_chk && cd /tmp/ear_chk && rm -rf *
unzip -q -o /opt/jboss-eap/standalone/deployments/gec-ear.ear 'gec-web.war' 'gec-api.war'
for w in gec-web gec-api; do
  echo "##### $w jboss-web.xml"; unzip -p $w.war WEB-INF/jboss-web.xml
  echo "##### $w web.xml (security)"; unzip -p $w.war WEB-INF/web.xml | grep -iE -B1 -A3 "security|auth-method|realm|login-config|keycloak"
  echo "##### $w jboss-deployment-structure"; unzip -p $w.war WEB-INF/jboss-deployment-structure.xml
done

echo "=== log ELY01148 com contexto ==="
grep -n -B2 -A12 "ELY01148" /logs/jboss/jboss-eap/standalone/sigec-portabilidade/server.log | head -60
=== libs do EAR (commons-lang) ===
   261809  11-18-2026 10:52   lib/commons-lang-commons-lang-2.4.jar
    11170  11-18-2026 10:52   lib/com.nimbusds-lang-tag-1.7.jar
=== conteudo raiz do EAR ===
Archive:  gec-ear.ear
  Length      Date    Time    Name
---------  ---------- -----   ----
        0  11-18-2026 10:52   META-INF/
      147  11-18-2026 10:52   META-INF/MANIFEST.MF
        0  11-18-2026 10:52   lib/
        0  11-18-2026 10:52   META-INF/maven/
        0  11-18-2026 10:52   META-INF/maven/br.gov.caixa.sigec/
        0  11-18-2026 10:52   META-INF/maven/br.gov.caixa.sigec/gec-ear/
      670  11-18-2026 10:52   META-INF/application.xml
     1510  11-18-2026 10:52   META-INF/jboss-deployment-structure.xml
  3581900  11-18-2026 10:52   gec-ejb.jar
 34794893  11-18-2026 10:52   gec-web.war
 27551968  11-18-2026 10:52   gec-api.war
    14200  11-18-2026 10:51   META-INF/maven/br.gov.caixa.sigec/gec-ear/pom.xml
       76  11-18-2026 10:52   META-INF/maven/br.gov.caixa.sigec/gec-ear/pom.properties
---------                     -------
124822889                     112 files
=== deployment-structure do EAR ===
<jboss-deployment-structure>
        <!-- Make sub deployments isolated by default, so they cannot see each others
                classes without a Class-Path entry -->
        <ear-subdeployments-isolated>false</ear-subdeployments-isolated>
        <!-- This corresponds to the top level deployment. For a war this is the
                war's module, for an ear -->
        <!-- This is the top level ear module, which contains all the classes in
                the EAR's lib folder -->
        <deployment>
                <resources>
                        <resource-root path="gec-ejb.jar" />
                </resources>
                <exclusions>
                        <module name="cef" />
                </exclusions>
                <dependencies>
                        <module name="deployment.framework.jar" />
                        <module name="deployment.framework_sisgd.jar" />
                        <!-- module name="org.jboss.ejb-client" / -->
                </dependencies>

        </deployment>
        <sub-deployment name="gec-web.war">
                <!-- gec-web.war carrega o proprio WEB-INF/lib/arqref-core, que usa
                        br.gov.caixa.bsb.sisgd.framework.cm.ConectorException (framework_sisgd.jar).
                        As dependencias do <deployment> nao sao herdadas pelo subdeployment,
                        entao precisam ser declaradas aqui, como no gec-api.war. -->
                <dependencies>
                        <module name="deployment.framework.jar" />
                        <module name="deployment.framework_sisgd.jar" />
                </dependencies>
        </sub-deployment>
        <sub-deployment name="gec-api.war">
                <exclusions>
                        <module name="cef" />
                </exclusions>
                <dependencies>
                        <module name="deployment.framework.jar" />
                        <module name="deployment.framework_sisgd.jar" />
                </dependencies>
        </sub-deployment>
</jboss-deployment-structure>=== jboss-web / web.xml dos WARs ===
##### gec-web jboss-web.xml
<?xml version="1.0" encoding="UTF-8"?>
<jboss-web>
        <context-root>gec-web/por</context-root>
</jboss-web>##### gec-web web.xml (security)
        </error-page>
        <security-constraint>
                <web-resource-collection>
                        <web-resource-name>Todas as Requisicoes ao servlet action</web-resource-name>
                        <description>Todas requisicoes</description>
--
                </web-resource-collection>
        </security-constraint>
        <security-constraint>
                <web-resource-collection>
                        <web-resource-name>Requisicao do Servlet</web-resource-name>
                        <description>Todas</description>
--
                </auth-constraint>
        </security-constraint>
        <security-constraint>
                <web-resource-collection>
                        <web-resource-name>Todas as Requisicoes ao servlet action</web-resource-name>
                        <description>Todas requisicoes</description>
--
                </web-resource-collection>
        </security-constraint>
        <security-constraint>
                <web-resource-collection>
                        <web-resource-name>Todas as Requisicoes ao servlet action</web-resource-name>
                        <description>Todas requisicoes</description>
--
                </web-resource-collection>
        </security-constraint>
        <login-config>
                <auth-method>FORM</auth-method>
                <realm-name>default</realm-name>
                <form-login-config>
                        <form-login-page>/login.html</form-login-page>
                        <form-error-page>/loginError.html</form-error-page>
                </form-login-config>
        </login-config>
        <security-role>
                <description>.</description>
                <role-name>GEC002</role-name>
        </security-role>
        <security-role>
                <description>.</description>
                <role-name>GEC003</role-name>
        </security-role>
        <security-role>
                <description>.</description>
                <role-name>GEC004</role-name>
        </security-role>
        <security-role>
                <description>.</description>
                <role-name>GEC005</role-name>
        </security-role>
        <security-role>
                <description>.</description>
                <role-name>GEC006</role-name>
        </security-role>
        <security-role>
                <description>.</description>
                <role-name>GE0C07</role-name>
        </security-role>
        <security-role>
                <description>.</description>
                <role-name>GEC008</role-name>
        </security-role>
        <security-role>
                <description>.</description>
                <role-name>GEC009</role-name>
        </security-role>
        <security-role>
                <description>.</description>
                <role-name>GEC010</role-name>
        </security-role>
        <security-role>
                <description>.</description>
                <role-name>GEC011</role-name>
        </security-role>
        <security-role>
                <description>.</description>
                <role-name>GEC012</role-name>
        </security-role>
        <security-role>
                <description>.</description>
                <role-name>GEC013</role-name>
        </security-role>
        <security-role>
                <description>.</description>
                <role-name>GEC014</role-name>
        </security-role>
        <security-role>
                <description>.</description>
                <role-name>GEC015</role-name>
        </security-role>
        <security-role>
                <description>.</description>
                <role-name>GEC016</role-name>
        </security-role>
        <security-role>
                <description>.</description>
                <role-name>GEC017</role-name>
        </security-role>
        <security-role>
                <description>.</description>
                <role-name>GEC018</role-name>
        </security-role>
        <security-role>
                <description>.</description>
                <role-name>GEC019</role-name>
        </security-role>
        <security-role>
                <description>.</description>
                <role-name>GEC020</role-name>
        </security-role>
        <security-role>
                <description>.</description>
                <role-name>GEC021</role-name>
        </security-role>
        <security-role>
                <description>.</description>
                <role-name>GEC022</role-name>
        </security-role>
        <security-role>
                <description>.</description>
                <role-name>GEC023</role-name>
        </security-role>
        <security-role>
                <description>.</description>
                <role-name>GEC024</role-name>
        </security-role>
        <security-role>
                <description>.</description>
                <role-name>GEC025</role-name>
        </security-role>
        <security-role>
                <description>.</description>
                <role-name>GEC026</role-name>
        </security-role>
        <security-role>
                <description>.</description>
                <role-name>GEC027</role-name>
        </security-role>
        <security-role>
                <description>.</description>
                <role-name>GEC028</role-name>
        </security-role>
        <security-role>
                <description>.</description>
                <role-name>GEC029</role-name>
        </security-role>
        <security-role>
                <description>.</description>
                <role-name>GEC030</role-name>
        </security-role>
        <security-role>
                <description>.</description>
                <role-name>GEC031</role-name>
        </security-role>
        <session-config>
                <session-timeout>30</session-timeout>
        </session-config>
##### gec-web jboss-deployment-structure
caution: filename not matched:  WEB-INF/jboss-deployment-structure.xml
##### gec-api jboss-web.xml
<?xml version="1.0" encoding="UTF-8"?>
<!--  -->

<jboss-web>
        <context-root>/*</context-root>
</jboss-web>
##### gec-api web.xml (security)

        <security-constraint>
                <web-resource-collection>
                        <web-resource-name>Segurança Geral do Endpoint v2</web-resource-name>
                        <description>endpoint v2/pessoas-fisicas</description>
--
                </auth-constraint>
        </security-constraint>

        <security-constraint>
                <web-resource-collection>
                        <web-resource-name>Segurança Geral do Endpoint v3</web-resource-name>
                        <description>endpoint v3/pessoas-fisicas</description>
--
                </auth-constraint>
        </security-constraint>

        <security-constraint>
                <web-resource-collection>
                        <web-resource-name>Requisicao do Servlet</web-resource-name>
                        <description>Documentação dos REST</description>
--
                </web-resource-collection>
        </security-constraint>

        <!-- INCLUSAO PROSPECÇÃO CONTA SALARIO -->
        <security-constraint>
                <web-resource-collection>
                        <web-resource-name>Inclui uma Portabilidade do Tipo Conta Salário</web-resource-name>
                        <description>Inclui uma Portabilidade do Tipo Conta Salário</description>
--
                </auth-constraint>
        </security-constraint>

        <!-- CONSULTA PROSPECÇÃO CONTA SALARIO -->
        <security-constraint>
                <web-resource-collection>
                        <web-resource-name>Consulta de Prospecção de uma Portabilidade Conta
                                Salário</web-resource-name>
--
                </auth-constraint>
        </security-constraint>

        <!-- VALIDAR PROSPECÇÃO CONTA SALARIO -->
        <security-constraint>
                <web-resource-collection>
                        <web-resource-name>Validação de Prospecção de uma Portabilidade Conta
                                Salário</web-resource-name>
--
                </auth-constraint>
        </security-constraint>

        <!-- CONSULTA RETENÇÃO CONTA SALARIO -->
        <security-constraint>
                <web-resource-collection>
                        <web-resource-name>Consulta Retenção de uma Portabilidade Conta
                                Salário</web-resource-name>
--
                </auth-constraint>
        </security-constraint>

        <!-- RETENÇÃO CONTA SALARIO -->
        <security-constraint>
                <web-resource-collection>
                        <web-resource-name>Retenção de uma Portabilidade Conta Salário</web-resource-name>
                        <description>Retenção de uma Portabilidade Conta Salário</description>
--
                </auth-constraint>
        </security-constraint>

        <security-role>
                <description>Role padrão do SSO</description>
                <role-name>uma_authorization</role-name>
        </security-role>
        <security-role>
                <description>Role geral de acesso do usuário IBC aos recursos de conta salário</description>
                <role-name>GEC_CANAL_TOKEN_SERVICO</role-name>
        </security-role>
        <security-role>
                <description>Role específica para acesso do usuário PNC ao recruso de inclusão de prospecção de conta salário</description>
                <role-name>GEC401</role-name>
        </security-role>
        <security-role>
                <description>Role específica para acesso do usuário PNC ao recruso de validação de prospecção de conta salário</description>
                <role-name>GEC403</role-name>
        </security-role>
        <security-role>
                <description>Role específica para acesso do usuário PNC ao recruso de consulta de prospecção de conta salário</description>
                <role-name>GEC406</role-name>
        </security-role>

         <error-page>
            <error-code>401</error-code>
--
         <context-param>
        <param-name>keycloak.config.resolver</param-name>
        <param-value>br.gov.caixa.api.portabilidade.sso.multitenancy.MultiTenancyConfigResolver</param-value>
    </context-param>
</web-app>
##### gec-api jboss-deployment-structure
caution: filename not matched:  WEB-INF/jboss-deployment-structure.xml
=== log ELY01148 com contexto ===
15499-  at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1363)
15500-  at java.base/java.lang.Thread.run(Thread.java:840)
15501:Caused by: java.lang.IllegalStateException: ELY01148: A SecurityDomain has already been associated with the specified ClassLoader
15502-  at org.wildfly.security.elytron-private@1.15.23.Final-redhat-00001//org.wildfly.security.auth.server.SecurityDomain.registerWithClassLoader(SecurityDomain.java:151)
15503-  at org.wildfly.security.elytron-web.undertow-server-servlet@1.9.4.Final-redhat-00001//org.wildfly.elytron.web.undertow.server.servlet.AuthenticationManager.configure(AuthenticationManager.java:94)
15504-  at org.wildfly.extension.undertow@7.4.18.GA-redhat-00001//org.wildfly.extension.undertow.ApplicationSecurityDomainDefinition$ApplicationSecurityDomainService.apply(ApplicationSecurityDomainDefinition.java:480)
15505-  at org.wildfly.extension.undertow@7.4.18.GA-redhat-00001//org.wildfly.extension.undertow.ApplicationSecurityDomainDefinition$ApplicationSecurityDomainService.apply(ApplicationSecurityDomainDefinition.java:411)
15506-  at org.wildfly.extension.undertow@7.4.18.GA-redhat-00001//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService.applyElytronSecurity(UndertowDeploymentInfoService.java:1238)
15507-  at org.wildfly.extension.undertow@7.4.18.GA-redhat-00001//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService.createServletConfig(UndertowDeploymentInfoService.java:980)
15508-  at org.wildfly.extension.undertow@7.4.18.GA-redhat-00001//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService.start(UndertowDeploymentInfoService.java:283)
15509-  at org.jboss.msc@1.4.13.Final-redhat-00001//org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1739)
15510-  at org.jboss.msc@1.4.13.Final-redhat-00001//org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1701)
15511-  ... 6 more
15512-
15513-2026-11-18 11:01:00,449 INFO  [AbstractGerenciadorTimers] (ServerService Thread Pool -- 86) Iniciando Timers para processamento do fluxo ProcessadorLegadoTEDNCR...
--
15523-  at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1363)
15524-  at java.base/java.lang.Thread.run(Thread.java:840)
15525:Caused by: java.lang.IllegalStateException: ELY01148: A SecurityDomain has already been associated with the specified ClassLoader
15526-  at org.wildfly.security.elytron-private@1.15.23.Final-redhat-00001//org.wildfly.security.auth.server.SecurityDomain.registerWithClassLoader(SecurityDomain.java:151)
15527-  at org.wildfly.security.elytron-web.undertow-server-servlet@1.9.4.Final-redhat-00001//org.wildfly.elytron.web.undertow.server.servlet.AuthenticationManager.configure(AuthenticationManager.java:94)
15528-  at org.wildfly.extension.undertow@7.4.18.GA-redhat-00001//org.wildfly.extension.undertow.ApplicationSecurityDomainDefinition$ApplicationSecurityDomainService.apply(ApplicationSecurityDomainDefinition.java:480)
15529-  at org.wildfly.extension.undertow@7.4.18.GA-redhat-00001//org.wildfly.extension.undertow.ApplicationSecurityDomainDefinition$ApplicationSecurityDomainService.apply(ApplicationSecurityDomainDefinition.java:411)
15530-  at org.wildfly.extension.undertow@7.4.18.GA-redhat-00001//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService.applyElytronSecurity(UndertowDeploymentInfoService.java:1238)
15531-  at org.wildfly.extension.undertow@7.4.18.GA-redhat-00001//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService.createServletConfig(UndertowDeploymentInfoService.java:980)
15532-  at org.wildfly.extension.undertow@7.4.18.GA-redhat-00001//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService.start(UndertowDeploymentInfoService.java:283)
15533-  at org.jboss.msc@1.4.13.Final-redhat-00001//org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1739)
15534-  at org.jboss.msc@1.4.13.Final-redhat-00001//org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1701)
15535-  ... 6 more
15536-
15537-2026-11-18 11:01:00,474 INFO  [AbstractGerenciadorTimers] (ServerService Thread Pool -- 94) Iniciando Timers para processamento do fluxo ProcessadorLegadoTEDOPF...
--
15562-2026-11-18 11:01:01,844 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "gec-ear.ear")]) - falha na descrição: {"WFLYCTL0080: Falha de serviços" => {
15563-    "jboss.deployment.subunit.\"gec-ear.ear\".\"gec-api.war\".undertow-deployment.UndertowDeploymentInfoService" => "Failed to start service
15564:    Caused by: java.lang.IllegalStateException: ELY01148: A SecurityDomain has already been associated with the specified ClassLoader",
15565-    "jboss.deployment.subunit.\"gec-ear.ear\".\"gec-web.war\".undertow-deployment.UndertowDeploymentInfoService" => "Failed to start service
15566:    Caused by: java.lang.IllegalStateException: ELY01148: A SecurityDomain has already been associated with the specified ClassLoader"
15567-}}
15568-2026-11-18 11:01:01,964 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 48) WFLYSRV0010: "wmq.jmsra.rar" foi implantado (runtime-name: "wmq.jmsra.rar")
15569-2026-11-18 11:01:01,964 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 48) WFLYSRV0010: "framework_sisgd.jar" foi implantado (runtime-name: "framework_sisgd.jar")
15570-2026-11-18 11:01:01,964 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 48) WFLYSRV0010: "framework.jar" foi implantado (runtime-name: "framework.jar")
15571-2026-11-18 11:01:01,964 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 48) WFLYSRV0010: "gec-ear.ear" foi implantado (runtime-name: "gec-ear.ear")
15572-2026-11-18 11:01:01,969 INFO  [org.jboss.as.controller] (Controller Boot Thread) WFLYCTL0183: Relatório
15573- de status de serviçoWFLYCTL0186: Serviços que falham na inicialização:      service jboss.deployment.subunit."gec-ear.ear"."gec-api.war".undertow-deployment.UndertowDeploymentInfoService: Failed to start service
15574-      service jboss.deployment.subunit."gec-ear.ear"."gec-web.war".undertow-deployment.UndertowDeploymentInfoService: Failed to start service
15575-WFLYCTL0448: 5 serviços adicionais estão inativos devido a ausência ou falha das suas dependências
15576-2026-11-18 11:01:02,026 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Retomando servidor
15577-2026-11-18 11:01:02,039 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) iniciado (com erros) em 25733ms - Iniciado(s) 7361 de serviços 7618 (10 serviços falharam ou tinham dependências ausentes, os serviços 551 estão lentos, passivos ou sob demanda)
15578-2026-11-18 11:01:02,042 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: A interface de gerenciamento http escutando em http://0.0.0.0:9990/management
--
35164-  at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1363)
35165-  at java.base/java.lang.Thread.run(Thread.java:840)
35166:Caused by: java.lang.IllegalStateException: ELY01148: A SecurityDomain has already been associated with the specified ClassLoader
35167-  at org.wildfly.security.elytron-private@1.15.23.Final-redhat-00001//org.wildfly.security.auth.server.SecurityDomain.registerWithClassLoader(SecurityDomain.java:151)
35168-  at org.wildfly.security.elytron-web.undertow-server-servlet@1.9.4.Final-redhat-00001//org.wildfly.elytron.web.undertow.server.servlet.AuthenticationManager.configure(AuthenticationManager.java:94)
35169-  at org.wildfly.extension.undertow@7.4.18.GA-redhat-00001//org.wildfly.extension.undertow.ApplicationSecurityDomainDefinition$ApplicationSecurityDomainService.apply(ApplicationSecurityDomainDefinition.java:480)
35170-  at org.wildfly.extension.undertow@7.4.18.GA-redhat-00001//org.wildfly.extension.undertow.ApplicationSecurityDomainDefinition$ApplicationSecurityDomainService.apply(ApplicationSecurityDomainDefinition.java:411)
35171-  at org.wildfly.extension.undertow@7.4.18.GA-redhat-00001//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService.applyElytronSecurity(UndertowDeploymentInfoService.java:1238)
35172-  at org.wildfly.extension.undertow@7.4.18.GA-redhat-00001//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService.createServletConfig(UndertowDeploymentInfoService.java:980)
35173-  at org.wildfly.extension.undertow@7.4.18.GA-redhat-00001//org.wildfly.extension.undertow.deployment.UndertowDeploymentInfoService.start(UndertowDeploymentInfoService.java:283)
[root@caddeapllx2871 ear_chk]#
[root@caddeapllx2871 ear_chk]#
[root@caddeapllx2871 ear_chk]#
[root@caddeapllx2871 ear_chk]#
