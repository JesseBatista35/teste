
    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
13511:10:48:22,767 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.4.23.GA (WildFly Core 15.0.43.Final-redhat-00001) iniciado em 36378ms - Iniciado(s) 19323 de serviços 19583 (os serviços 658 estão lentos, passivos ou sob demanda)
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "WFLYSRV0010|WFLYSRV0016|WFLYSRV0027|WFLYSRV0021|WFLYUT0021|WELD-00|ERROR|Caused by|parametros"
15:43:41,126 INFO  [org.jboss.modcluster] (ServerService Thread Pool -- 107) MODCLUSTER000021: All pending requests drained from default-host:/ccr-parametros-web in 0,0 seconds
15:43:41,132 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 107) WFLYUT0022: Contexto web não registrado:'/ccr-parametros-web' do servidor 'default-server'
15:43:41,131 INFO  [org.jboss.modcluster] (ServerService Thread Pool -- 113) MODCLUSTER000021: All pending requests drained from default-host:/ccr-parametros-api in 0,0 seconds
15:43:41,133 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 113) WFLYUT0022: Contexto web não registrado:'/ccr-parametros-api' do servidor 'default-server'
15:43:41,208 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 124) WFLYJPA0011: Interrompendo unidade de persistência (fase 2 de 2) Serviço 'sifec-ccr-parametros.ear/ccr-parametros-ejb.jar#default'
15:43:41,208 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 123) WFLYJPA0011: Interrompendo unidade de persistência (fase 2 de 2) Serviço 'sifec-ccr-parametros.ear#fecDS'
15:43:41,246 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 123) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'sifec-ccr-parametros.ear#fecDS'
15:43:41,293 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 123) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'sifec-ccr-parametros.ear/ccr-parametros-ejb.jar#default'
15:43:41,507 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: ccr-parametros-ejb.jar) em 441ms
15:43:41,522 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: ccr-parametros-web.war) em 456ms
15:43:41,582 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: ccr-parametros-api.war) em 516ms
15:43:41,708 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0028: Implantação interrompida SICCR-PARAMETROS (runtime-name: sifec-ccr-parametros.ear) em 645ms
15:43:41,755 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 6) WFLYSRV0009: "SICCR-PARAMETROS" teve sua implantação cancelada (runtime-name: "sifec-ccr-parametros.ear")
15:45:04,168 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0027: Iniciando a implantação do "SICCR-PARAMETROS" (runtime-name: "sifec-ccr-parametros-spr3.ear")
15:45:07,780 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-5) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "ccr-parametros-api.war")
15:45:07,780 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "ccr-parametros-web.war")
15:45:07,780 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "ccr-parametros-ejb.jar")
15:45:08,592 WARN  [org.jboss.as.dependency.unsupported] (MSC service thread 1-5) WFLYSRV0019: A implantação "deployment.sifec-ccr-parametros-spr3.ear.ccr-parametros-ejb.jar" está usando um módulo não compatível ("org.joda.time") que pode ser alterado ou removido em versões futuras sem nenhum aviso.
15:45:08,592 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-5) WFLYSRV0018: A implantação "deployment.sifec-ccr-parametros-spr3.ear.ccr-parametros-ejb.jar" está usando um módulo privado ("org.codehaus.jackson.jackson-mapper-asl") que pode ser alterado ou removido em versões futuras sem nenhum aviso.
15:45:08,594 WARN  [org.jboss.as.dependency.unsupported] (MSC service thread 1-4) WFLYSRV0019: A implantação "deployment.sifec-ccr-parametros-spr3.ear" está usando um módulo não compatível ("org.joda.time") que pode ser alterado ou removido em versões futuras sem nenhum aviso.
15:45:08,594 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-4) WFLYSRV0018: A implantação "deployment.sifec-ccr-parametros-spr3.ear" está usando um módulo privado ("org.codehaus.jackson.jackson-mapper-asl") que pode ser alterado ou removido em versões futuras sem nenhum aviso.
15:45:08,594 WARN  [org.jboss.as.dependency.unsupported] (MSC service thread 1-4) WFLYSRV0019: A implantação "deployment.sifec-ccr-parametros-spr3.ear" está usando um módulo não compatível ("org.joda.time") que pode ser alterado ou removido em versões futuras sem nenhum aviso.
15:45:08,594 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-4) WFLYSRV0018: A implantação "deployment.sifec-ccr-parametros-spr3.ear" está usando um módulo privado ("org.codehaus.jackson.jackson-mapper-asl") que pode ser alterado ou removido em versões futuras sem nenhum aviso.
15:45:08,595 WARN  [org.jboss.as.dependency.unsupported] (MSC service thread 1-7) WFLYSRV0019: A implantação "deployment.sifec-ccr-parametros-spr3.ear.ccr-parametros-web.war" está usando um módulo não compatível ("org.joda.time") que pode ser alterado ou removido em versões futuras sem nenhum aviso.
15:45:08,595 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-7) WFLYSRV0018: A implantação "deployment.sifec-ccr-parametros-spr3.ear.ccr-parametros-web.war" está usando um módulo privado ("org.codehaus.jackson.jackson-mapper-asl") que pode ser alterado ou removido em versões futuras sem nenhum aviso.
15:45:08,602 INFO  [org.jipijapa] (MSC service thread 1-2) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-ccr-parametros-spr3.ear#fecDS
15:45:08,603 WARN  [org.jboss.as.dependency.unsupported] (MSC service thread 1-6) WFLYSRV0019: A implantação "deployment.sifec-ccr-parametros-spr3.ear.ccr-parametros-api.war" está usando um módulo não compatível ("org.joda.time") que pode ser alterado ou removido em versões futuras sem nenhum aviso.
15:45:08,603 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-6) WFLYSRV0018: A implantação "deployment.sifec-ccr-parametros-spr3.ear.ccr-parametros-api.war" está usando um módulo privado ("org.codehaus.jackson.jackson-mapper-asl") que pode ser alterado ou removido em versões futuras sem nenhum aviso.
15:45:08,604 INFO  [org.jipijapa] (MSC service thread 1-5) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-ccr-parametros-spr3.ear/ccr-parametros-ejb.jar#default
15:45:08,604 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 123) WFLYJPA0010: Iniciando unidade de persistência (fase 1 de 2) Serviço'sifec-ccr-parametros-spr3.ear#fecDS'
15:45:08,609 INFO  [org.jboss.weld.deployer] (MSC service thread 1-8) WFLYWELD0003: Processando da implantação weld sifec-ccr-parametros-spr3.ear
15:45:08,613 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 124) WFLYJPA0010: Iniciando unidade de persistência (fase 1 de 2) Serviço'sifec-ccr-parametros-spr3.ear/ccr-parametros-ejb.jar#default'
15:45:08,770 INFO  [org.jboss.keycloak] (MSC service thread 1-7) Keycloak subsystem override for deployment ccr-parametros-api.war
15:45:08,770 INFO  [org.jboss.keycloak] (MSC service thread 1-6) Keycloak subsystem override for deployment ccr-parametros-web.war
15:45:08,770 INFO  [org.jboss.weld.deployer] (MSC service thread 1-7) WFLYWELD0003: Processando da implantação weld ccr-parametros-api.war
15:45:08,770 INFO  [org.jboss.weld.deployer] (MSC service thread 1-6) WFLYWELD0003: Processando da implantação weld ccr-parametros-web.war
15:45:08,772 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SistemaResource' na unidade de implementação 'subdeployment "ccr-parametros-web.war" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-web/SistemaResource!br.gov.caixa.ccr.parametros.rest.resource.SistemaResource
        java:app/ccr-parametros-web/SistemaResource!br.gov.caixa.ccr.parametros.rest.resource.SistemaResource
        java:module/SistemaResource!br.gov.caixa.ccr.parametros.rest.resource.SistemaResource
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-web/SistemaResource
        java:app/ccr-parametros-web/SistemaResource
15:45:08,772 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'UnidadeResource' na unidade de implementação 'subdeployment "ccr-parametros-web.war" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-web/UnidadeResource!br.gov.caixa.ccr.parametros.rest.resource.UnidadeResource
        java:app/ccr-parametros-web/UnidadeResource!br.gov.caixa.ccr.parametros.rest.resource.UnidadeResource
        java:module/UnidadeResource!br.gov.caixa.ccr.parametros.rest.resource.UnidadeResource
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-web/UnidadeResource
        java:app/ccr-parametros-web/UnidadeResource
15:45:08,772 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'OrigemRecursoResource' na unidade de implementação 'subdeployment "ccr-parametros-web.war" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-web/OrigemRecursoResource!br.gov.caixa.ccr.parametros.rest.resource.OrigemRecursoResource
        java:app/ccr-parametros-web/OrigemRecursoResource!br.gov.caixa.ccr.parametros.rest.resource.OrigemRecursoResource
        java:module/OrigemRecursoResource!br.gov.caixa.ccr.parametros.rest.resource.OrigemRecursoResource
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-web/OrigemRecursoResource
        java:app/ccr-parametros-web/OrigemRecursoResource
15:45:08,772 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ControleExecucaoResource' na unidade de implementação 'subdeployment "ccr-parametros-web.war" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-web/ControleExecucaoResource!br.gov.caixa.ccr.parametros.rest.resource.ControleExecucaoResource
        java:app/ccr-parametros-web/ControleExecucaoResource!br.gov.caixa.ccr.parametros.rest.resource.ControleExecucaoResource
        java:module/ControleExecucaoResource!br.gov.caixa.ccr.parametros.rest.resource.ControleExecucaoResource
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-web/ControleExecucaoResource
        java:app/ccr-parametros-web/ControleExecucaoResource
15:45:08,772 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'IndicadorResource' na unidade de implementação 'subdeployment "ccr-parametros-web.war" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-web/IndicadorResource!br.gov.caixa.ccr.parametros.rest.resource.IndicadorResource
        java:app/ccr-parametros-web/IndicadorResource!br.gov.caixa.ccr.parametros.rest.resource.IndicadorResource
        java:module/IndicadorResource!br.gov.caixa.ccr.parametros.rest.resource.IndicadorResource
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-web/IndicadorResource
        java:app/ccr-parametros-web/IndicadorResource
15:45:08,772 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'RotativoResource' na unidade de implementação 'subdeployment "ccr-parametros-web.war" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-web/RotativoResource!br.gov.caixa.ccr.parametros.rest.resource.RotativoResource
        java:app/ccr-parametros-web/RotativoResource!br.gov.caixa.ccr.parametros.rest.resource.RotativoResource
        java:module/RotativoResource!br.gov.caixa.ccr.parametros.rest.resource.RotativoResource
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-web/RotativoResource
        java:app/ccr-parametros-web/RotativoResource
15:45:08,772 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ModalidadeResource' na unidade de implementação 'subdeployment "ccr-parametros-web.war" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-web/ModalidadeResource!br.gov.caixa.ccr.parametros.rest.resource.ModalidadeResource
        java:app/ccr-parametros-web/ModalidadeResource!br.gov.caixa.ccr.parametros.rest.resource.ModalidadeResource
        java:module/ModalidadeResource!br.gov.caixa.ccr.parametros.rest.resource.ModalidadeResource
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-web/ModalidadeResource
        java:app/ccr-parametros-web/ModalidadeResource
15:45:08,779 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-7) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TributosApiEJB' na unidade de implementação 'subdeployment "ccr-parametros-api.war" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-api/TributosApiEJB!br.gov.caixa.ccr.parametros.rest.service.TributosApiEJB
        java:app/ccr-parametros-api/TributosApiEJB!br.gov.caixa.ccr.parametros.rest.service.TributosApiEJB
        java:module/TributosApiEJB!br.gov.caixa.ccr.parametros.rest.service.TributosApiEJB
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-api/TributosApiEJB
        java:app/ccr-parametros-api/TributosApiEJB
15:45:08,779 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-7) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'seguranca-sso-SecurityKeycloakUtils' na unidade de implementação 'subdeployment "ccr-parametros-api.war" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-api/seguranca-sso-SecurityKeycloakUtils!br.gov.caixa.sifec.componentes.seguranca.sso.utils.SecurityKeycloakUtils
        java:app/ccr-parametros-api/seguranca-sso-SecurityKeycloakUtils!br.gov.caixa.sifec.componentes.seguranca.sso.utils.SecurityKeycloakUtils
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-api/seguranca-sso-SecurityKeycloakUtils
        java:app/ccr-parametros-api/seguranca-sso-SecurityKeycloakUtils
15:45:08,813 INFO  [org.jboss.weld.deployer] (MSC service thread 1-5) WFLYWELD0003: Processando da implantação weld ccr-parametros-ejb.jar
15:45:08,815 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'UnidadeService' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/UnidadeService!br.gov.caixa.ccr.parametros.service.UnidadeService
        java:app/ccr-parametros-ejb/UnidadeService!br.gov.caixa.ccr.parametros.service.UnidadeService
        java:module/UnidadeService!br.gov.caixa.ccr.parametros.service.UnidadeService
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/UnidadeService
        java:app/ccr-parametros-ejb/UnidadeService
15:45:08,815 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ParametrizacaoEspecieTomadorService' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/ParametrizacaoEspecieTomadorService!br.gov.caixa.ccr.parametros.service.ParametrizacaoEspecieTomadorService
        java:app/ccr-parametros-ejb/ParametrizacaoEspecieTomadorService!br.gov.caixa.ccr.parametros.service.ParametrizacaoEspecieTomadorService
        java:module/ParametrizacaoEspecieTomadorService!br.gov.caixa.ccr.parametros.service.ParametrizacaoEspecieTomadorService
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/ParametrizacaoEspecieTomadorService
        java:app/ccr-parametros-ejb/ParametrizacaoEspecieTomadorService
15:45:08,815 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ServicoService' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/ServicoService!br.gov.caixa.ccr.parametros.service.ServicoService
        java:app/ccr-parametros-ejb/ServicoService!br.gov.caixa.ccr.parametros.service.ServicoService
        java:module/ServicoService!br.gov.caixa.ccr.parametros.service.ServicoService
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/ServicoService
        java:app/ccr-parametros-ejb/ServicoService
15:45:08,815 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ParametroTomadorDAO' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/ParametroTomadorDAO!br.gov.caixa.ccr.parametros.dao.ParametroTomadorDAO
        java:app/ccr-parametros-ejb/ParametroTomadorDAO!br.gov.caixa.ccr.parametros.dao.ParametroTomadorDAO
        java:module/ParametroTomadorDAO!br.gov.caixa.ccr.parametros.dao.ParametroTomadorDAO
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/ParametroTomadorDAO
        java:app/ccr-parametros-ejb/ParametroTomadorDAO
15:45:08,815 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DemonstrativoCalculoService' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/DemonstrativoCalculoService!br.gov.caixa.ccr.parametros.service.DemonstrativoCalculoService
        java:app/ccr-parametros-ejb/DemonstrativoCalculoService!br.gov.caixa.ccr.parametros.service.DemonstrativoCalculoService
        java:module/DemonstrativoCalculoService!br.gov.caixa.ccr.parametros.service.DemonstrativoCalculoService
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/DemonstrativoCalculoService
        java:app/ccr-parametros-ejb/DemonstrativoCalculoService
15:45:08,815 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ParametroEspecieTomadorDAO' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/ParametroEspecieTomadorDAO!br.gov.caixa.ccr.parametros.dao.ParametroEspecieTomadorDAO
        java:app/ccr-parametros-ejb/ParametroEspecieTomadorDAO!br.gov.caixa.ccr.parametros.dao.ParametroEspecieTomadorDAO
        java:module/ParametroEspecieTomadorDAO!br.gov.caixa.ccr.parametros.dao.ParametroEspecieTomadorDAO
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/ParametroEspecieTomadorDAO
        java:app/ccr-parametros-ejb/ParametroEspecieTomadorDAO
15:45:08,815 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ParametroEspecieCnaeDAO' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/ParametroEspecieCnaeDAO!br.gov.caixa.ccr.parametros.dao.ParametroEspecieCnaeDAO
        java:app/ccr-parametros-ejb/ParametroEspecieCnaeDAO!br.gov.caixa.ccr.parametros.dao.ParametroEspecieCnaeDAO
        java:module/ParametroEspecieCnaeDAO!br.gov.caixa.ccr.parametros.dao.ParametroEspecieCnaeDAO
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/ParametroEspecieCnaeDAO
        java:app/ccr-parametros-ejb/ParametroEspecieCnaeDAO
15:45:08,815 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ProdutoAtualizacaoService' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/ProdutoAtualizacaoService!br.gov.caixa.ccr.parametros.service.ProdutoAtualizacaoService
        java:app/ccr-parametros-ejb/ProdutoAtualizacaoService!br.gov.caixa.ccr.parametros.service.ProdutoAtualizacaoService
        java:module/ProdutoAtualizacaoService!br.gov.caixa.ccr.parametros.service.ProdutoAtualizacaoService
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/ProdutoAtualizacaoService
        java:app/ccr-parametros-ejb/ProdutoAtualizacaoService
15:45:08,815 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AssinaturaEspecieOperacaoCreditoService' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/AssinaturaEspecieOperacaoCreditoService!br.gov.caixa.ccr.parametros.service.AssinaturaEspecieOperacaoCreditoService
        java:app/ccr-parametros-ejb/AssinaturaEspecieOperacaoCreditoService!br.gov.caixa.ccr.parametros.service.AssinaturaEspecieOperacaoCreditoService
        java:module/AssinaturaEspecieOperacaoCreditoService!br.gov.caixa.ccr.parametros.service.AssinaturaEspecieOperacaoCreditoService
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/AssinaturaEspecieOperacaoCreditoService
        java:app/ccr-parametros-ejb/AssinaturaEspecieOperacaoCreditoService
15:45:08,815 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AssinaturaFiscalService' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/AssinaturaFiscalService!br.gov.caixa.ccr.parametros.service.AssinaturaFiscalService
        java:app/ccr-parametros-ejb/AssinaturaFiscalService!br.gov.caixa.ccr.parametros.service.AssinaturaFiscalService
        java:module/AssinaturaFiscalService!br.gov.caixa.ccr.parametros.service.AssinaturaFiscalService
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/AssinaturaFiscalService
        java:app/ccr-parametros-ejb/AssinaturaFiscalService
15:45:08,815 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ControleExecucaoService' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/ControleExecucaoService!br.gov.caixa.ccr.parametros.service.ControleExecucaoService
        java:app/ccr-parametros-ejb/ControleExecucaoService!br.gov.caixa.ccr.parametros.service.ControleExecucaoService
        java:module/ControleExecucaoService!br.gov.caixa.ccr.parametros.service.ControleExecucaoService
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/ControleExecucaoService
        java:app/ccr-parametros-ejb/ControleExecucaoService
15:45:08,816 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'RotativoService' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/RotativoService!br.gov.caixa.ccr.parametros.service.RotativoService
        java:app/ccr-parametros-ejb/RotativoService!br.gov.caixa.ccr.parametros.service.RotativoService
        java:module/RotativoService!br.gov.caixa.ccr.parametros.service.RotativoService
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/RotativoService
        java:app/ccr-parametros-ejb/RotativoService
15:45:08,816 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'HistoricoIncidenciaService' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/HistoricoIncidenciaService!br.gov.caixa.ccr.parametros.service.HistoricoIncidenciaService
        java:app/ccr-parametros-ejb/HistoricoIncidenciaService!br.gov.caixa.ccr.parametros.service.HistoricoIncidenciaService
        java:module/HistoricoIncidenciaService!br.gov.caixa.ccr.parametros.service.HistoricoIncidenciaService
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/HistoricoIncidenciaService
        java:app/ccr-parametros-ejb/HistoricoIncidenciaService
15:45:08,816 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EspecieOperacaoCreditoService' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/EspecieOperacaoCreditoService!br.gov.caixa.ccr.parametros.service.EspecieOperacaoCreditoService
        java:app/ccr-parametros-ejb/EspecieOperacaoCreditoService!br.gov.caixa.ccr.parametros.service.EspecieOperacaoCreditoService
        java:module/EspecieOperacaoCreditoService!br.gov.caixa.ccr.parametros.service.EspecieOperacaoCreditoService
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/EspecieOperacaoCreditoService
        java:app/ccr-parametros-ejb/EspecieOperacaoCreditoService
15:45:08,816 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'RenegociacaoParcelaService_old' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/RenegociacaoParcelaService_old!br.gov.caixa.ccr.parametros.service.RenegociacaoParcelaService_old
        java:app/ccr-parametros-ejb/RenegociacaoParcelaService_old!br.gov.caixa.ccr.parametros.service.RenegociacaoParcelaService_old
        java:module/RenegociacaoParcelaService_old!br.gov.caixa.ccr.parametros.service.RenegociacaoParcelaService_old
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/RenegociacaoParcelaService_old
        java:app/ccr-parametros-ejb/RenegociacaoParcelaService_old
15:45:08,816 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'FeriadoDAO' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/FeriadoDAO!br.gov.caixa.ccr.parametros.dao.FeriadoDAO
        java:app/ccr-parametros-ejb/FeriadoDAO!br.gov.caixa.ccr.parametros.dao.FeriadoDAO
        java:module/FeriadoDAO!br.gov.caixa.ccr.parametros.dao.FeriadoDAO
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/FeriadoDAO
        java:app/ccr-parametros-ejb/FeriadoDAO
15:45:08,816 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ParametroNaturezaJuridicaDAO' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/ParametroNaturezaJuridicaDAO!br.gov.caixa.ccr.parametros.dao.ParametroNaturezaJuridicaDAO
        java:app/ccr-parametros-ejb/ParametroNaturezaJuridicaDAO!br.gov.caixa.ccr.parametros.dao.ParametroNaturezaJuridicaDAO
        java:module/ParametroNaturezaJuridicaDAO!br.gov.caixa.ccr.parametros.dao.ParametroNaturezaJuridicaDAO
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/ParametroNaturezaJuridicaDAO
        java:app/ccr-parametros-ejb/ParametroNaturezaJuridicaDAO
15:45:08,816 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EspecieTomadorService' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/EspecieTomadorService!br.gov.caixa.ccr.parametros.service.EspecieTomadorService
        java:app/ccr-parametros-ejb/EspecieTomadorService!br.gov.caixa.ccr.parametros.service.EspecieTomadorService
        java:module/EspecieTomadorService!br.gov.caixa.ccr.parametros.service.EspecieTomadorService
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/EspecieTomadorService
        java:app/ccr-parametros-ejb/EspecieTomadorService
15:45:08,816 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'OrigemRecursoService' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/OrigemRecursoService!br.gov.caixa.ccr.parametros.service.OrigemRecursoService
        java:app/ccr-parametros-ejb/OrigemRecursoService!br.gov.caixa.ccr.parametros.service.OrigemRecursoService
        java:module/OrigemRecursoService!br.gov.caixa.ccr.parametros.service.OrigemRecursoService
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/OrigemRecursoService
        java:app/ccr-parametros-ejb/OrigemRecursoService
15:45:08,816 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AliquotaIofService' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/AliquotaIofService!br.gov.caixa.ccr.parametros.service.AliquotaIofService
        java:app/ccr-parametros-ejb/AliquotaIofService!br.gov.caixa.ccr.parametros.service.AliquotaIofService
        java:module/AliquotaIofService!br.gov.caixa.ccr.parametros.service.AliquotaIofService
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/AliquotaIofService
        java:app/ccr-parametros-ejb/AliquotaIofService
15:45:08,816 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'PerguntaAutorizacaoService' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/PerguntaAutorizacaoService!br.gov.caixa.ccr.parametros.service.PerguntaAutorizacaoService
        java:app/ccr-parametros-ejb/PerguntaAutorizacaoService!br.gov.caixa.ccr.parametros.service.PerguntaAutorizacaoService
        java:module/PerguntaAutorizacaoService!br.gov.caixa.ccr.parametros.service.PerguntaAutorizacaoService
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/PerguntaAutorizacaoService
        java:app/ccr-parametros-ejb/PerguntaAutorizacaoService
15:45:08,816 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ModalidadeService' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/ModalidadeService!br.gov.caixa.ccr.parametros.service.ModalidadeService
        java:app/ccr-parametros-ejb/ModalidadeService!br.gov.caixa.ccr.parametros.service.ModalidadeService
        java:module/ModalidadeService!br.gov.caixa.ccr.parametros.service.ModalidadeService
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/ModalidadeService
        java:app/ccr-parametros-ejb/ModalidadeService
15:45:08,816 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ProdutoService' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/ProdutoService!br.gov.caixa.ccr.parametros.service.ProdutoService
        java:app/ccr-parametros-ejb/ProdutoService!br.gov.caixa.ccr.parametros.service.ProdutoService
        java:module/ProdutoService!br.gov.caixa.ccr.parametros.service.ProdutoService
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/ProdutoService
        java:app/ccr-parametros-ejb/ProdutoService
15:45:08,816 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SistemaService' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/SistemaService!br.gov.caixa.ccr.parametros.service.SistemaService
        java:app/ccr-parametros-ejb/SistemaService!br.gov.caixa.ccr.parametros.service.SistemaService
        java:module/SistemaService!br.gov.caixa.ccr.parametros.service.SistemaService
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/SistemaService
        java:app/ccr-parametros-ejb/SistemaService
15:45:08,818 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'IndicadorEconomicoService' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/IndicadorEconomicoService!br.gov.caixa.ccr.parametros.service.IndicadorEconomicoService
        java:app/ccr-parametros-ejb/IndicadorEconomicoService!br.gov.caixa.ccr.parametros.service.IndicadorEconomicoService
        java:module/IndicadorEconomicoService!br.gov.caixa.ccr.parametros.service.IndicadorEconomicoService
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/IndicadorEconomicoService
        java:app/ccr-parametros-ejb/IndicadorEconomicoService
15:45:08,818 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'RenegociacaoParcelaService' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/RenegociacaoParcelaService!br.gov.caixa.ccr.parametros.service.RenegociacaoParcelaService
        java:app/ccr-parametros-ejb/RenegociacaoParcelaService!br.gov.caixa.ccr.parametros.service.RenegociacaoParcelaService
        java:module/RenegociacaoParcelaService!br.gov.caixa.ccr.parametros.service.RenegociacaoParcelaService
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/RenegociacaoParcelaService
        java:app/ccr-parametros-ejb/RenegociacaoParcelaService
15:45:08,818 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'IndicadorService' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/IndicadorService!br.gov.caixa.ccr.parametros.service.IndicadorService
        java:app/ccr-parametros-ejb/IndicadorService!br.gov.caixa.ccr.parametros.service.IndicadorService
        java:module/IndicadorService!br.gov.caixa.ccr.parametros.service.IndicadorService
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/IndicadorService
        java:app/ccr-parametros-ejb/IndicadorService
15:45:08,818 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContratoService' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/ContratoService!br.gov.caixa.ccr.parametros.service.ContratoService
        java:app/ccr-parametros-ejb/ContratoService!br.gov.caixa.ccr.parametros.service.ContratoService
        java:module/ContratoService!br.gov.caixa.ccr.parametros.service.ContratoService
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/ContratoService
        java:app/ccr-parametros-ejb/ContratoService
15:45:08,818 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TLPService' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/TLPService!br.gov.caixa.ccr.parametros.service.TLPService
        java:app/ccr-parametros-ejb/TLPService!br.gov.caixa.ccr.parametros.service.TLPService
        java:module/TLPService!br.gov.caixa.ccr.parametros.service.TLPService
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/TLPService
        java:app/ccr-parametros-ejb/TLPService
15:45:08,818 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AssinaturaEspecieOperacaoCreditoDAO' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/AssinaturaEspecieOperacaoCreditoDAO!br.gov.caixa.ccr.parametros.dao.AssinaturaEspecieOperacaoCreditoDAO
        java:app/ccr-parametros-ejb/AssinaturaEspecieOperacaoCreditoDAO!br.gov.caixa.ccr.parametros.dao.AssinaturaEspecieOperacaoCreditoDAO
        java:module/AssinaturaEspecieOperacaoCreditoDAO!br.gov.caixa.ccr.parametros.dao.AssinaturaEspecieOperacaoCreditoDAO
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/AssinaturaEspecieOperacaoCreditoDAO
        java:app/ccr-parametros-ejb/AssinaturaEspecieOperacaoCreditoDAO
15:45:08,818 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ParametroProdutoAtualizacaoService' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/ParametroProdutoAtualizacaoService!br.gov.caixa.ccr.parametros.service.factory.IParametroProdutoAtualizacaoService
        java:app/ccr-parametros-ejb/ParametroProdutoAtualizacaoService!br.gov.caixa.ccr.parametros.service.factory.IParametroProdutoAtualizacaoService
        java:module/ParametroProdutoAtualizacaoService!br.gov.caixa.ccr.parametros.service.factory.IParametroProdutoAtualizacaoService
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/ParametroProdutoAtualizacaoService
        java:app/ccr-parametros-ejb/ParametroProdutoAtualizacaoService
15:45:08,818 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'LoggerProducer' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/LoggerProducer!br.gov.caixa.ccr.parametros.producer.LoggerProducer
        java:app/ccr-parametros-ejb/LoggerProducer!br.gov.caixa.ccr.parametros.producer.LoggerProducer
        java:module/LoggerProducer!br.gov.caixa.ccr.parametros.producer.LoggerProducer
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/LoggerProducer
        java:app/ccr-parametros-ejb/LoggerProducer
15:45:08,818 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'IndicadorPercentualService' na unidade de implementação 'subdeployment "ccr-parametros-ejb.jar" of deployment "sifec-ccr-parametros-spr3.ear"' são como segue:
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/IndicadorPercentualService!br.gov.caixa.ccr.parametros.service.IndicadorPercentualService
        java:app/ccr-parametros-ejb/IndicadorPercentualService!br.gov.caixa.ccr.parametros.service.IndicadorPercentualService
        java:module/IndicadorPercentualService!br.gov.caixa.ccr.parametros.service.IndicadorPercentualService
        java:global/sifec-ccr-parametros-spr3/ccr-parametros-ejb/IndicadorPercentualService
        java:app/ccr-parametros-ejb/IndicadorPercentualService
15:45:08,823 INFO  [org.jipijapa] (MSC service thread 1-2) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-ccr-parametros-spr3.ear#fecDS
15:45:08,901 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 124) WFLYJPA0010: Iniciando unidade de persistência (fase 2 de 2) Serviço'sifec-ccr-parametros-spr3.ear#fecDS'
15:45:08,928 WARN  [org.jboss.as.ejb3] (MSC service thread 1-7) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.ccr.parametros.service.ParametroProdutoAtualizacaoService não devem ter um método final ou estático (isNecessarioAtualizacao)
15:45:08,934 INFO  [org.jipijapa] (MSC service thread 1-7) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-ccr-parametros-spr3.ear/ccr-parametros-ejb.jar#default
15:45:08,964 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 123) WFLYJPA0010: Iniciando unidade de persistência (fase 2 de 2) Serviço'sifec-ccr-parametros-spr3.ear/ccr-parametros-ejb.jar#default'
15:45:09,238 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 123) HHH000038: Composite-id class does not override equals(): br.gov.caixa.ccr.parametros.dominio.to.pk.IndicadorEconomicoPK
15:45:09,238 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 123) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.ccr.parametros.dominio.to.pk.IndicadorEconomicoPK
15:45:09,342 WARN  [org.hibernate.orm.cache] (ServerService Thread Pool -- 123) HHH90001006: Missing cache[sifec-ccr-parametros-spr3.ear/ccr-parametros-ejb.jar#default.default-update-timestamps-region] was created on-the-fly. The created cache will use a provider-specific default configuration: make sure you defined one. You can disable this warning by setting 'hibernate.cache.ehcache.missing_cache_strategy' to 'create'.
15:45:09,406 WARN  [org.hibernate.orm.cache] (ServerService Thread Pool -- 123) HHH90001006: Missing cache[sifec-ccr-parametros-spr3.ear/ccr-parametros-ejb.jar#default.default-query-results-region] was created on-the-fly. The created cache will use a provider-specific default configuration: make sure you defined one. You can disable this warning by setting 'hibernate.cache.ehcache.missing_cache_strategy' to 'create'.
15:45:09,428 WARN  [org.hibernate.orm.cache] (ServerService Thread Pool -- 123) HHH90001006: Missing cache[sifec-ccr-parametros-spr3.ear/ccr-parametros-ejb.jar#default.br.gov.caixa.ccr.parametros.dominio.entidade.CnaeEntidade] was created on-the-fly. The created cache will use a provider-specific default configuration: make sure you defined one. You can disable this warning by setting 'hibernate.cache.ehcache.missing_cache_strategy' to 'create'.
15:45:09,432 WARN  [org.hibernate.orm.cache] (ServerService Thread Pool -- 123) HHH90001003: Read-only caching was requested for mutable entity [NavigableRole[br.gov.caixa.ccr.parametros.dominio.entidade.CnaeEntidade]]
15:45:09,432 WARN  [org.hibernate.orm.cache] (ServerService Thread Pool -- 123) HHH90001006: Missing cache[sifec-ccr-parametros-spr3.ear/ccr-parametros-ejb.jar#default.br.gov.caixa.ccr.parametros.dominio.entidade.GrupoOperacaoEntidade] was created on-the-fly. The created cache will use a provider-specific default configuration: make sure you defined one. You can disable this warning by setting 'hibernate.cache.ehcache.missing_cache_strategy' to 'create'.
15:45:09,437 WARN  [org.hibernate.orm.cache] (ServerService Thread Pool -- 123) HHH90001006: Missing cache[sifec-ccr-parametros-spr3.ear/ccr-parametros-ejb.jar#default.br.gov.caixa.ccr.parametros.dominio.entidade.IndicadorEconomicoEntidade] was created on-the-fly. The created cache will use a provider-specific default configuration: make sure you defined one. You can disable this warning by setting 'hibernate.cache.ehcache.missing_cache_strategy' to 'create'.
15:45:09,440 WARN  [org.hibernate.orm.cache] (ServerService Thread Pool -- 123) HHH90001003: Read-only caching was requested for mutable entity [NavigableRole[br.gov.caixa.ccr.parametros.dominio.entidade.IndicadorEconomicoEntidade]]
15:45:09,440 WARN  [org.hibernate.orm.cache] (ServerService Thread Pool -- 123) HHH90001006: Missing cache[sifec-ccr-parametros-spr3.ear/ccr-parametros-ejb.jar#default.br.gov.caixa.ccr.parametros.dominio.entidade.NaturezaJuridicaEntidade] was created on-the-fly. The created cache will use a provider-specific default configuration: make sure you defined one. You can disable this warning by setting 'hibernate.cache.ehcache.missing_cache_strategy' to 'create'.
15:45:09,443 WARN  [org.hibernate.orm.cache] (ServerService Thread Pool -- 123) HHH90001003: Read-only caching was requested for mutable entity [NavigableRole[br.gov.caixa.ccr.parametros.dominio.entidade.NaturezaJuridicaEntidade]]
15:45:09,443 WARN  [org.hibernate.orm.cache] (ServerService Thread Pool -- 123) HHH90001006: Missing cache[sifec-ccr-parametros-spr3.ear/ccr-parametros-ejb.jar#default.br.gov.caixa.ccr.parametros.dominio.entidade.EspecieTomadorEntidade] was created on-the-fly. The created cache will use a provider-specific default configuration: make sure you defined one. You can disable this warning by setting 'hibernate.cache.ehcache.missing_cache_strategy' to 'create'.
15:45:09,447 WARN  [org.hibernate.orm.cache] (ServerService Thread Pool -- 123) HHH90001006: Missing cache[sifec-ccr-parametros-spr3.ear/ccr-parametros-ejb.jar#default.br.gov.caixa.ccr.parametros.dominio.entidade.UnidadeEntidade] was created on-the-fly. The created cache will use a provider-specific default configuration: make sure you defined one. You can disable this warning by setting 'hibernate.cache.ehcache.missing_cache_strategy' to 'create'.
15:45:09,451 WARN  [org.hibernate.orm.cache] (ServerService Thread Pool -- 123) HHH90001003: Read-only caching was requested for mutable entity [NavigableRole[br.gov.caixa.ccr.parametros.dominio.entidade.UnidadeEntidade]]
15:45:09,451 WARN  [org.hibernate.orm.cache] (ServerService Thread Pool -- 123) HHH90001006: Missing cache[sifec-ccr-parametros-spr3.ear/ccr-parametros-ejb.jar#default.br.gov.caixa.ccr.parametros.dominio.entidade.SistemaAmortizacaoEntidade] was created on-the-fly. The created cache will use a provider-specific default configuration: make sure you defined one. You can disable this warning by setting 'hibernate.cache.ehcache.missing_cache_strategy' to 'create'.
15:45:09,454 WARN  [org.hibernate.orm.cache] (ServerService Thread Pool -- 123) HHH90001003: Read-only caching was requested for mutable entity [NavigableRole[br.gov.caixa.ccr.parametros.dominio.entidade.SistemaAmortizacaoEntidade]]
15:45:09,454 WARN  [org.hibernate.orm.cache] (ServerService Thread Pool -- 123) HHH90001006: Missing cache[sifec-ccr-parametros-spr3.ear/ccr-parametros-ejb.jar#default.br.gov.caixa.ccr.parametros.dominio.entidade.EspecieRenegociacaoEntidade] was created on-the-fly. The created cache will use a provider-specific default configuration: make sure you defined one. You can disable this warning by setting 'hibernate.cache.ehcache.missing_cache_strategy' to 'create'.
15:45:09,456 WARN  [org.hibernate.orm.cache] (ServerService Thread Pool -- 123) HHH90001003: Read-only caching was requested for mutable entity [NavigableRole[br.gov.caixa.ccr.parametros.dominio.entidade.EspecieRenegociacaoEntidade]]
15:45:09,456 WARN  [org.hibernate.orm.cache] (ServerService Thread Pool -- 123) HHH90001006: Missing cache[sifec-ccr-parametros-spr3.ear/ccr-parametros-ejb.jar#default.br.gov.caixa.ccr.parametros.dominio.entidade.ProdutoEntidade] was created on-the-fly. The created cache will use a provider-specific default configuration: make sure you defined one. You can disable this warning by setting 'hibernate.cache.ehcache.missing_cache_strategy' to 'create'.
15:45:09,459 WARN  [org.hibernate.orm.cache] (ServerService Thread Pool -- 123) HHH90001003: Read-only caching was requested for mutable entity [NavigableRole[br.gov.caixa.ccr.parametros.dominio.entidade.ProdutoEntidade]]
15:45:09,620 WARN  [org.hibernate.tuple.entity.PojoEntityTuplizer] (ServerService Thread Pool -- 123) HHH000305: Could not create proxy factory for:br.gov.caixa.ccr.parametros.dominio.to.AssinaturaEspecieOperacaoCredito: org.hibernate.HibernateException: Setter methods of lazy classes cannot be final: br.gov.caixa.ccr.parametros.dominio.to.AssinaturaEspecieOperacaoCredito#setFimVigencia
15:45:09,923 INFO  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 1) WELD-000119: Not generating any bean definitions from br.gov.caixa.arqrefcore.util.ArquillianHelper because of underlying class loading error: Type org.jboss.shrinkwrap.api.asset.Asset from [Module "deployment.sifec-ccr-parametros-spr3.ear" from Service Module Loader] not found.  If this is unexpected, enable DEBUG logging to see the full error.
15:45:10,118 WARN  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 2) WELD-000167: Class br.gov.caixa.ccr.parametros.rest.resource.concessao.ConcessaoResourceV3Simulacao is annotated with @RequestScoped but it does not declare an appropriate constructor therefore is not registered as a bean!
15:45:10,119 WARN  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 2) WELD-000167: Class br.gov.caixa.ccr.parametros.rest.resource.concessao.ConcessaoResourceV2 is annotated with @RequestScoped but it does not declare an appropriate constructor therefore is not registered as a bean!
15:45:10,120 WARN  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 4) WELD-000167: Class br.gov.caixa.ccr.parametros.rest.resource.concessao.ConcessaoResourceV3 is annotated with @RequestScoped but it does not declare an appropriate constructor therefore is not registered as a bean!
15:45:10,133 INFO  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 2) WELD-001125: Illegal bean type interface br.gov.caixa.arqrefcore.cache.Cache<java.lang.Class<?>,class br.gov.caixa.arqrefcore.reflexao.ReflectorClassCache> ignored on [EnhancedAnnotatedTypeImpl] public @Singleton class br.gov.caixa.arqrefcore.reflexao.ReflectorCache
15:45:10,134 INFO  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 2) WELD-001125: Illegal bean type br.gov.caixa.arqrefcore.cache.AbstractCache<java.lang.Class<?>, br.gov.caixa.arqrefcore.reflexao.ReflectorClassCache> ignored on [EnhancedAnnotatedTypeImpl] public @Singleton class br.gov.caixa.arqrefcore.reflexao.ReflectorCache
15:45:10,406 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 135) RESTEASY002225: Deploying javax.ws.rs.core.Application: class br.gov.caixa.ccr.parametros.rest.JaxRsActivator$Proxy$_$$_WeldClientProxy
15:45:10,426 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 135) WFLYUT0021: Contexto web registrado: '/ccr-parametros-web' para servidor 'default-server'
15:45:10,750 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 138) RESTEASY002225: Deploying javax.ws.rs.core.Application: class br.gov.caixa.ccr.parametros.rest.TributosApplication$Proxy$_$$_WeldClientProxy
15:45:10,857 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 138) RESTEASY002200: Adding class resource br.gov.caixa.ccr.parametros.rest.resource.concessao.ConcessaoResourceImpl from Application class br.gov.caixa.ccr.parametros.rest.TributosApplication$Proxy$_$$_WeldClientProxy
15:45:10,857 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 138) RESTEASY002200: Adding class resource br.gov.caixa.ccr.parametros.rest.resource.renegociacaoconsolidado.RenegociaConsolidadoResourceSimulacaoImpl from Application class br.gov.caixa.ccr.parametros.rest.TributosApplication$Proxy$_$$_WeldClientProxy
15:45:10,857 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 138) RESTEASY002200: Adding class resource br.gov.caixa.ccr.parametros.rest.resource.renegociacaoconsolidado.RenegociaConsolidadoResourceImplV2 from Application class br.gov.caixa.ccr.parametros.rest.TributosApplication$Proxy$_$$_WeldClientProxy
15:45:10,857 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 138) RESTEASY002200: Adding class resource br.gov.caixa.ccr.parametros.rest.resource.renegociacao.RenegociacaoResourceV3Impl from Application class br.gov.caixa.ccr.parametros.rest.TributosApplication$Proxy$_$$_WeldClientProxy
15:45:10,858 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 138) RESTEASY002200: Adding class resource br.gov.caixa.ccr.parametros.rest.resource.renegociacaoconsolidado.RenegociaConsolidadoResourceImpl from Application class br.gov.caixa.ccr.parametros.rest.TributosApplication$Proxy$_$$_WeldClientProxy
15:45:10,858 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 138) RESTEASY002200: Adding class resource br.gov.caixa.ccr.parametros.rest.resource.concessao.ConcessaoResourceV3Impl from Application class br.gov.caixa.ccr.parametros.rest.TributosApplication$Proxy$_$$_WeldClientProxy
15:45:10,858 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 138) RESTEASY002200: Adding class resource br.gov.caixa.ccr.parametros.rest.resource.atraso.AtrasoResourceImpl from Application class br.gov.caixa.ccr.parametros.rest.TributosApplication$Proxy$_$$_WeldClientProxy
15:45:10,858 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 138) RESTEASY002200: Adding class resource br.gov.caixa.ccr.parametros.rest.resource.des.RotinaDesResourceV2Impl from Application class br.gov.caixa.ccr.parametros.rest.TributosApplication$Proxy$_$$_WeldClientProxy
15:45:10,858 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 138) RESTEASY002205: Adding provider class br.gov.caixa.ccr.parametros.rest.mapper.GenericExceptionMapper from Application class br.gov.caixa.ccr.parametros.rest.TributosApplication$Proxy$_$$_WeldClientProxy
15:45:10,858 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 138) RESTEASY002200: Adding class resource br.gov.caixa.ccr.parametros.rest.resource.atraso.AtrasoResourceV2Impl from Application class br.gov.caixa.ccr.parametros.rest.TributosApplication$Proxy$_$$_WeldClientProxy
15:45:10,858 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 138) RESTEASY002205: Adding provider class com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider from Application class br.gov.caixa.ccr.parametros.rest.TributosApplication$Proxy$_$$_WeldClientProxy
15:45:10,858 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 138) RESTEASY002205: Adding provider class io.swagger.jaxrs.listing.SwaggerSerializers from Application class br.gov.caixa.ccr.parametros.rest.TributosApplication$Proxy$_$$_WeldClientProxy
15:45:10,858 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 138) RESTEASY002205: Adding provider class br.gov.caixa.ccr.parametros.rest.JacksonConfig from Application class br.gov.caixa.ccr.parametros.rest.TributosApplication$Proxy$_$$_WeldClientProxy
15:45:10,858 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 138) RESTEASY002205: Adding provider class br.gov.caixa.ccr.parametros.rest.mapper.NotFoundExceptionMapper from Application class br.gov.caixa.ccr.parametros.rest.TributosApplication$Proxy$_$$_WeldClientProxy
15:45:10,858 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 138) RESTEASY002200: Adding class resource br.gov.caixa.ccr.parametros.rest.resource.concessao.ConcessaoResourceV2Impl from Application class br.gov.caixa.ccr.parametros.rest.TributosApplication$Proxy$_$$_WeldClientProxy
15:45:10,858 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 138) RESTEASY002200: Adding class resource br.gov.caixa.ccr.parametros.rest.resource.renegociacao.RenegociacaoResourceV4Impl from Application class br.gov.caixa.ccr.parametros.rest.TributosApplication$Proxy$_$$_WeldClientProxy
15:45:10,858 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 138) RESTEASY002200: Adding class resource br.gov.caixa.ccr.parametros.rest.resource.renegociacao.RenegociacaoResourceV4SimulacaoImpl from Application class br.gov.caixa.ccr.parametros.rest.TributosApplication$Proxy$_$$_WeldClientProxy
15:45:10,858 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 138) RESTEASY002200: Adding class resource br.gov.caixa.ccr.parametros.rest.resource.des.RotinaDesResourceImpl from Application class br.gov.caixa.ccr.parametros.rest.TributosApplication$Proxy$_$$_WeldClientProxy
15:45:10,858 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 138) RESTEASY002205: Adding provider class br.gov.caixa.ccr.parametros.rest.mapper.JsonProcessingExceptionMapper from Application class br.gov.caixa.ccr.parametros.rest.TributosApplication$Proxy$_$$_WeldClientProxy
15:45:10,858 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 138) RESTEASY002200: Adding class resource io.swagger.jaxrs.listing.ApiListingResource from Application class br.gov.caixa.ccr.parametros.rest.TributosApplication$Proxy$_$$_WeldClientProxy
15:45:10,858 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 138) RESTEASY002200: Adding class resource br.gov.caixa.ccr.parametros.rest.resource.rotativo.RotativoMovimentoResourceV1Impl from Application class br.gov.caixa.ccr.parametros.rest.TributosApplication$Proxy$_$$_WeldClientProxy
15:45:10,858 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 138) RESTEASY002200: Adding class resource br.gov.caixa.ccr.parametros.rest.resource.concessao.ConcessaoResourceV3SimulacaoImpl from Application class br.gov.caixa.ccr.parametros.rest.TributosApplication$Proxy$_$$_WeldClientProxy
15:45:10,858 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 138) RESTEASY002205: Adding provider class br.gov.caixa.ccr.parametros.rest.mapper.TributoBusinessExceptionMapper from Application class br.gov.caixa.ccr.parametros.rest.TributosApplication$Proxy$_$$_WeldClientProxy
15:45:10,858 INFO  [org.jboss.resteasy.resteasy_jaxrs.i18n] (ServerService Thread Pool -- 138) RESTEASY002205: Adding provider class br.gov.caixa.ccr.parametros.rest.resource.renegociacao.RenegociacaoResourceImpl from Application class br.gov.caixa.ccr.parametros.rest.TributosApplication$Proxy$_$$_WeldClientProxy
15:45:10,879 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 138) WFLYUT0021: Contexto web registrado: '/ccr-parametros-api' para servidor 'default-server'
15:45:10,905 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 6) WFLYSRV0010: "SICCR-PARAMETROS" foi implantado (runtime-name: "sifec-ccr-parametros-spr3.ear")
