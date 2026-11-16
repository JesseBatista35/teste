Matheus Gabriel de Oliveira Rodrigues
Bom dia, Jesse Mouta Pereira Batista, teve algum retorno sobre esse assunto?
Matheus Gabriel de Oliveira Rodrigues e Edson Prokot Boa tarde.
 
 Ainda estou com a análise em andamento. O que já confirmei aqui:
 
O token do cli-web-pnc é emitido pelo realm intranet, e o ccr-api está configurado para o realm internet, tanto no 7.4 quanto no 6.4 (sifec5).

A configuração de autenticação do ccr-api, o web.xml da aplicação e a versão do adaptador Keycloak são idênticos nos dois ambientes, ou seja, a diferença não está na configuração do JBoss. Estou verificando agora a infraestrutura em volta alguma resolução do servidor de login a partir de cada ambiente e o caminho de acesso do sifec5, que é o que ainda difere. Te retorno ainda hoje com o resultado.
 
Marcela Gomes da Silva adicionou Caio Calixto Fasolak Alves ao chat e compartilhou o histórico de chats dos últimos 90 dias.

 
Jesse Mouta Pereira Batista
Michael Lourant de Oliveira Ferreira, Boa Tarde,   fizemos o deploy da 3.55.51.02 às 15:08. O erro anterior foi corrigido, mas o mesmo problema apareceu em outra classe:  WFLYWELD0037: Não é possíve…
Versão nova do SIREFC-SIRUR.ear contendo o ajuste do entityManagerFactory
 
http://binario.caixa:8081/repository/releases/br/gov/caixa/sirur/sifec-sirur/3.55.51.03/sifec-sirur-3.55.51.03.ear
 
14:31 Gustavo Duarte Lepesteur da Costa iniciou uma reunião.

 


[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "WFLYSRV0010|WFLYSRV0027|WFLYSRV0021|WFLYUT0021|ERROR|Caused by|WELD-001408|Duplicate|ORA-|lcr|LCR|sirur|SIRUR|sifec-2"

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
14:48:39,398 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 193) WFLYJPA0011: Interrompendo unidade de persistência (fase 2 de 2) Serviço 'sifec-sirur-3.55.51.03.ear/sirur-ejb.jar#fec.pu'
14:48:39,410 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 193) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'sifec-sirur-3.55.51.03.ear#SIEMP-PU'
14:48:39,411 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 193) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'sifec-sirur-3.55.51.03.ear/sirur-ejb.jar#fec.rur.pu'
14:48:39,411 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 192) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'sifec-sirur-3.55.51.03.ear#fecDS'
14:48:39,411 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 193) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'sifec-sirur-3.55.51.03.ear/sirur-ejb.jar#fec.pu'
14:48:39,439 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-5) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: sirur-ejb.jar) em 47ms
14:48:39,474 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: sirur-web.war) em 82ms
14:48:39,485 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0028: Implantação interrompida SIRUR (runtime-name: sifec-sirur-3.55.51.03.ear) em 93ms





​
14:47:47,745 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0027: Iniciando a implantação do "SIRUR" (runtime-name: "sifec-sirur-3.55.51.03.ear")
14:47:52,378 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0059: A entrada do caminho da classe jaxb-api.jar em /content/sifec-sirur-3.55.51.03.ear/lib/jaxb-impl-2.2.3-1.jar não direciona a um jar válido para a referência do caminho da classe.
14:47:52,379 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0059: A entrada do caminho da classe activation.jar em /content/sifec-sirur-3.55.51.03.ear/lib/jaxb-impl-2.2.3-1.jar não direciona a um jar válido para a referência do caminho da classe.
14:47:52,379 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0059: A entrada do caminho da classe jsr173_1.0_api.jar em /content/sifec-sirur-3.55.51.03.ear/lib/jaxb-impl-2.2.3-1.jar não direciona a um jar válido para a referência do caminho da classe.
14:47:52,379 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0059: A entrada do caminho da classe jaxb1-impl.jar em /content/sifec-sirur-3.55.51.03.ear/lib/jaxb-impl-2.2.3-1.jar não direciona a um jar válido para a referência do caminho da classe.
14:47:56,082 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "sirur-ejb.jar")
14:47:56,082 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "sirur-web.war")
14:47:59,186 INFO  [org.jboss.as.jpa] (MSC service thread 1-3) WFLYJPA0002: Ler persistence.xml para SIEMP-PU
14:47:59,193 INFO  [org.jboss.as.jpa] (MSC service thread 1-3) WFLYJPA0002: Ler persistence.xml para fecDS
14:47:59,295 INFO  [org.jboss.as.jpa] (MSC service thread 1-3) WFLYJPA0002: Ler persistence.xml para fec.rur.pu
14:47:59,296 INFO  [org.jboss.as.jpa] (MSC service thread 1-3) WFLYJPA0002: Ler persistence.xml para fec.pu
14:47:59,746 INFO  [org.jipijapa] (MSC service thread 1-8) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-sirur-3.55.51.03.ear#SIEMP-PU
14:47:59,747 INFO  [org.jipijapa] (MSC service thread 1-8) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-sirur-3.55.51.03.ear#fecDS
14:47:59,754 INFO  [org.jipijapa] (MSC service thread 1-5) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-sirur-3.55.51.03.ear/sirur-ejb.jar#fec.pu
14:47:59,755 INFO  [org.jipijapa] (MSC service thread 1-5) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-sirur-3.55.51.03.ear/sirur-ejb.jar#fec.rur.pu
14:47:59,756 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 188) WFLYJPA0010: Iniciando unidade de persistência (fase 1 de 2) Serviço'sifec-sirur-3.55.51.03.ear/sirur-ejb.jar#fec.pu'
14:47:59,756 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 185) WFLYJPA0010: Iniciando unidade de persistência (fase 1 de 2) Serviço'sifec-sirur-3.55.51.03.ear#SIEMP-PU'
14:47:59,756 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 190) WFLYJPA0010: Iniciando unidade de persistência (fase 1 de 2) Serviço'sifec-sirur-3.55.51.03.ear/sirur-ejb.jar#fec.rur.pu'
14:47:59,759 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 191) WFLYJPA0010: Iniciando unidade de persistência (fase 1 de 2) Serviço'sifec-sirur-3.55.51.03.ear#fecDS'
14:47:59,799 INFO  [org.jboss.weld.deployer] (MSC service thread 1-4) WFLYWELD0003: Processando da implantação weld sifec-sirur-3.55.51.03.ear
14:48:00,111 WARN  [org.hibernate.validator.internal.engine.ValidatorFactoryImpl] (MSC service thread 1-4) HV000258: Expression Language interpolation features are not explicitly enabled/disabled. Use 'ORG_HIBERNATE_VALIDATOR_EXPRESSION_LANGUAGE_ENABLED' environment variable, or 'org.hibernate.validator.expressionLanguageEnabled' system property to define the behavior. Defaulting to expression language features being disabled.
14:48:00,381 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-4) Activating CDI extension for Spring Data JPA repositories.
14:48:00,823 INFO  [org.jboss.keycloak] (MSC service thread 1-6) Keycloak subsystem override for deployment sirur-web.war
14:48:00,823 INFO  [org.jboss.weld.deployer] (MSC service thread 1-6) WFLYWELD0003: Processando da implantação weld sirur-web.war
14:48:00,834 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-6) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'seguranca-sso-SecurityKeycloakUtils' na unidade de implementação 'subdeployment "sirur-web.war" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-web/seguranca-sso-SecurityKeycloakUtils!br.gov.caixa.sifec.componentes.seguranca.sso.utils.SecurityKeycloakUtils
        java:app/sirur-web/seguranca-sso-SecurityKeycloakUtils!br.gov.caixa.sifec.componentes.seguranca.sso.utils.SecurityKeycloakUtils
        java:module/seguranca-sso-SecurityKeycloakUtils!br.gov.caixa.sifec.componentes.seguranca.sso.utils.SecurityKeycloakUtils
        java:global/sifec-sirur-3.55.51.03/sirur-web/seguranca-sso-SecurityKeycloakUtils
        java:app/sirur-web/seguranca-sso-SecurityKeycloakUtils
        java:module/seguranca-sso-SecurityKeycloakUtils

14:48:02,060 INFO  [org.jboss.weld.deployer] (MSC service thread 1-5) WFLYWELD0003: Processando da implantação weld sirur-ejb.jar
14:48:02,065 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ExportacaoCadastroAterBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/ExportacaoCadastroAterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.ExportacaoCadastroAterBean
        java:app/sirur-ejb/ExportacaoCadastroAterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.ExportacaoCadastroAterBean
        java:module/ExportacaoCadastroAterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.ExportacaoCadastroAterBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/ExportacaoCadastroAterBean
        java:app/sirur-ejb/ExportacaoCadastroAterBean
        java:module/ExportacaoCadastroAterBean

14:48:02,065 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DocumentoInformativoBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/DocumentoInformativoBeanImpl!br.gov.caixa.sirur.bean.DocumentoInformativoBean
        java:app/sirur-ejb/DocumentoInformativoBeanImpl!br.gov.caixa.sirur.bean.DocumentoInformativoBean
        java:module/DocumentoInformativoBeanImpl!br.gov.caixa.sirur.bean.DocumentoInformativoBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/DocumentoInformativoBeanImpl
        java:app/sirur-ejb/DocumentoInformativoBeanImpl
        java:module/DocumentoInformativoBeanImpl

14:48:02,065 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MatriculaServiceV2Impl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/MatriculaServiceV2Impl!br.gov.caixa.sirur.service.MatriculaServiceV2
        java:app/sirur-ejb/MatriculaServiceV2Impl!br.gov.caixa.sirur.service.MatriculaServiceV2
        java:module/MatriculaServiceV2Impl!br.gov.caixa.sirur.service.MatriculaServiceV2
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/MatriculaServiceV2Impl
        java:app/sirur-ejb/MatriculaServiceV2Impl
        java:module/MatriculaServiceV2Impl

14:48:02,065 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ViabilidadeEmpreendimentoBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/ViabilidadeEmpreendimentoBean!br.gov.caixa.sirur.bean.impl.orcamento.ViabilidadeEmpreendimentoBean
        java:app/sirur-ejb/ViabilidadeEmpreendimentoBean!br.gov.caixa.sirur.bean.impl.orcamento.ViabilidadeEmpreendimentoBean
        java:module/ViabilidadeEmpreendimentoBean!br.gov.caixa.sirur.bean.impl.orcamento.ViabilidadeEmpreendimentoBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/ViabilidadeEmpreendimentoBean
        java:app/sirur-ejb/ViabilidadeEmpreendimentoBean
        java:module/ViabilidadeEmpreendimentoBean

14:48:02,065 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DomainServiceV2Impl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/DomainServiceV2Impl!br.gov.caixa.sirur.service.DomainServiceV2
        java:app/sirur-ejb/DomainServiceV2Impl!br.gov.caixa.sirur.service.DomainServiceV2
        java:module/DomainServiceV2Impl!br.gov.caixa.sirur.service.DomainServiceV2
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/DomainServiceV2Impl
        java:app/sirur-ejb/DomainServiceV2Impl
        java:module/DomainServiceV2Impl

14:48:02,065 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SituacaoSolicitacaoServiceImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/SituacaoSolicitacaoServiceImpl!br.gov.caixa.sirur.service.SituacaoSolicitacaoService
        java:app/sirur-ejb/SituacaoSolicitacaoServiceImpl!br.gov.caixa.sirur.service.SituacaoSolicitacaoService
        java:module/SituacaoSolicitacaoServiceImpl!br.gov.caixa.sirur.service.SituacaoSolicitacaoService
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/SituacaoSolicitacaoServiceImpl
        java:app/sirur-ejb/SituacaoSolicitacaoServiceImpl
        java:module/SituacaoSolicitacaoServiceImpl

14:48:02,065 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DocumentacaoBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/DocumentacaoBeanImpl!br.gov.caixa.sirur.bean.DocumentacaoBean
        java:app/sirur-ejb/DocumentacaoBeanImpl!br.gov.caixa.sirur.bean.DocumentacaoBean
        java:module/DocumentacaoBeanImpl!br.gov.caixa.sirur.bean.DocumentacaoBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/DocumentacaoBeanImpl
        java:app/sirur-ejb/DocumentacaoBeanImpl
        java:module/DocumentacaoBeanImpl

14:48:02,065 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ConexaoLDAP' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/ConexaoLDAP!br.gov.caixa.sirur.ldap.ConexaoLDAP
        java:app/sirur-ejb/ConexaoLDAP!br.gov.caixa.sirur.ldap.ConexaoLDAP
        java:module/ConexaoLDAP!br.gov.caixa.sirur.ldap.ConexaoLDAP
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/ConexaoLDAP
        java:app/sirur-ejb/ConexaoLDAP
        java:module/ConexaoLDAP

14:48:02,065 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EtapaCadastroProducaoRuralBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/EtapaCadastroProducaoRuralBeanImpl!br.gov.caixa.sirur.bean.EtapaCadastroProducaoRuralBean
        java:app/sirur-ejb/EtapaCadastroProducaoRuralBeanImpl!br.gov.caixa.sirur.bean.EtapaCadastroProducaoRuralBean
        java:module/EtapaCadastroProducaoRuralBeanImpl!br.gov.caixa.sirur.bean.EtapaCadastroProducaoRuralBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/EtapaCadastroProducaoRuralBeanImpl
        java:app/sirur-ejb/EtapaCadastroProducaoRuralBeanImpl
        java:module/EtapaCadastroProducaoRuralBeanImpl

14:48:02,065 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'OrcamentoAnaliticoBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/OrcamentoAnaliticoBean!br.gov.caixa.sirur.bean.impl.orcamento.OrcamentoAnaliticoBean
        java:app/sirur-ejb/OrcamentoAnaliticoBean!br.gov.caixa.sirur.bean.impl.orcamento.OrcamentoAnaliticoBean
        java:module/OrcamentoAnaliticoBean!br.gov.caixa.sirur.bean.impl.orcamento.OrcamentoAnaliticoBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/OrcamentoAnaliticoBean
        java:app/sirur-ejb/OrcamentoAnaliticoBean
        java:module/OrcamentoAnaliticoBean

14:48:02,065 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DominioBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/DominioBean!br.gov.caixa.sirur.bean.impl.oportunidadenegocio.DominioBean
        java:app/sirur-ejb/DominioBean!br.gov.caixa.sirur.bean.impl.oportunidadenegocio.DominioBean
        java:module/DominioBean!br.gov.caixa.sirur.bean.impl.oportunidadenegocio.DominioBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/DominioBean
        java:app/sirur-ejb/DominioBean
        java:module/DominioBean

14:48:02,065 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DadosEmpresaAterBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/DadosEmpresaAterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.DadosEmpresaAterBean
        java:app/sirur-ejb/DadosEmpresaAterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.DadosEmpresaAterBean
        java:module/DadosEmpresaAterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.DadosEmpresaAterBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/DadosEmpresaAterBean
        java:app/sirur-ejb/DadosEmpresaAterBean
        java:module/DadosEmpresaAterBean

14:48:02,065 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'RelatorioAterBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/RelatorioAterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.RelatorioAterBean
        java:app/sirur-ejb/RelatorioAterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.RelatorioAterBean
        java:module/RelatorioAterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.RelatorioAterBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/RelatorioAterBean
        java:app/sirur-ejb/RelatorioAterBean
        java:module/RelatorioAterBean

14:48:02,065 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TecnicoBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/TecnicoBeanImpl!br.gov.caixa.sirur.bean.TecnicoBean
        java:app/sirur-ejb/TecnicoBeanImpl!br.gov.caixa.sirur.bean.TecnicoBean
        java:module/TecnicoBeanImpl!br.gov.caixa.sirur.bean.TecnicoBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/TecnicoBeanImpl
        java:app/sirur-ejb/TecnicoBeanImpl
        java:module/TecnicoBeanImpl

14:48:02,065 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EmpresaBeanImplV2' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/EmpresaBeanImplV2!br.gov.caixa.sirur.bean.EmpresaBeanV2
        java:app/sirur-ejb/EmpresaBeanImplV2!br.gov.caixa.sirur.bean.EmpresaBeanV2
        java:module/EmpresaBeanImplV2!br.gov.caixa.sirur.bean.EmpresaBeanV2
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/EmpresaBeanImplV2
        java:app/sirur-ejb/EmpresaBeanImplV2
        java:module/EmpresaBeanImplV2

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'OrcamentoBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/OrcamentoBeanImpl!br.gov.caixa.sirur.orcamento.OrcamentoBeanRmt
        java:app/sirur-ejb/OrcamentoBeanImpl!br.gov.caixa.sirur.orcamento.OrcamentoBeanRmt
        java:module/OrcamentoBeanImpl!br.gov.caixa.sirur.orcamento.OrcamentoBeanRmt
        java:jboss/exported/sifec-sirur-3.55.51.03/sirur-ejb/OrcamentoBeanImpl!br.gov.caixa.sirur.orcamento.OrcamentoBeanRmt
        ejb:sifec-sirur-3.55.51.03/sirur-ejb/OrcamentoBeanImpl!br.gov.caixa.sirur.orcamento.OrcamentoBeanRmt
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/OrcamentoBeanImpl
        java:app/sirur-ejb/OrcamentoBeanImpl
        java:module/OrcamentoBeanImpl

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'BeanProducaoRuralImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/BeanProducaoRuralImpl!br.gov.caixa.sirur.cadastro.BeanProducaoRural
        java:app/sirur-ejb/BeanProducaoRuralImpl!br.gov.caixa.sirur.cadastro.BeanProducaoRural
        java:module/BeanProducaoRuralImpl!br.gov.caixa.sirur.cadastro.BeanProducaoRural
        java:jboss/exported/sifec-sirur-3.55.51.03/sirur-ejb/BeanProducaoRuralImpl!br.gov.caixa.sirur.cadastro.BeanProducaoRural
        ejb:sifec-sirur-3.55.51.03/sirur-ejb/BeanProducaoRuralImpl!br.gov.caixa.sirur.cadastro.BeanProducaoRural
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/BeanProducaoRuralImpl
        java:app/sirur-ejb/BeanProducaoRuralImpl
        java:module/BeanProducaoRuralImpl

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'BeanClienteImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/BeanClienteImpl!br.gov.caixa.sirur.base.BeanCliente
        java:app/sirur-ejb/BeanClienteImpl!br.gov.caixa.sirur.base.BeanCliente
        java:module/BeanClienteImpl!br.gov.caixa.sirur.base.BeanCliente
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/BeanClienteImpl
        java:app/sirur-ejb/BeanClienteImpl
        java:module/BeanClienteImpl

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'FaseOportunidadeBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/FaseOportunidadeBean!br.gov.caixa.sirur.bean.impl.oportunidadenegocio.FaseOportunidadeBean
        java:app/sirur-ejb/FaseOportunidadeBean!br.gov.caixa.sirur.bean.impl.oportunidadenegocio.FaseOportunidadeBean
        java:module/FaseOportunidadeBean!br.gov.caixa.sirur.bean.impl.oportunidadenegocio.FaseOportunidadeBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/FaseOportunidadeBean
        java:app/sirur-ejb/FaseOportunidadeBean
        java:module/FaseOportunidadeBean

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AterBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/AterBeanImpl!br.gov.caixa.sirur.bean.AterBean
        java:app/sirur-ejb/AterBeanImpl!br.gov.caixa.sirur.bean.AterBean
        java:module/AterBeanImpl!br.gov.caixa.sirur.bean.AterBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/AterBeanImpl
        java:app/sirur-ejb/AterBeanImpl
        java:module/AterBeanImpl

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DadosProprietarioProcessorV2' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/DadosProprietarioProcessorV2!br.gov.caixa.sirur.processor.imovel.DadosProprietarioProcessorV2
        java:app/sirur-ejb/DadosProprietarioProcessorV2!br.gov.caixa.sirur.processor.imovel.DadosProprietarioProcessorV2
        java:module/DadosProprietarioProcessorV2!br.gov.caixa.sirur.processor.imovel.DadosProprietarioProcessorV2
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/DadosProprietarioProcessorV2
        java:app/sirur-ejb/DadosProprietarioProcessorV2
        java:module/DadosProprietarioProcessorV2

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'PropriedadeBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/PropriedadeBeanImpl!br.gov.caixa.sirur.bean.PropriedadeBean
        java:app/sirur-ejb/PropriedadeBeanImpl!br.gov.caixa.sirur.bean.PropriedadeBean
        java:module/PropriedadeBeanImpl!br.gov.caixa.sirur.bean.PropriedadeBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/PropriedadeBeanImpl
        java:app/sirur-ejb/PropriedadeBeanImpl
        java:module/PropriedadeBeanImpl

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DadosTecnicosBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/DadosTecnicosBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.DadosTecnicosBean
        java:app/sirur-ejb/DadosTecnicosBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.DadosTecnicosBean
        java:module/DadosTecnicosBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.DadosTecnicosBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/DadosTecnicosBean
        java:app/sirur-ejb/DadosTecnicosBean
        java:module/DadosTecnicosBean

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'GedBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/GedBean!br.gov.caixa.sirur.bean.impl.GedBean
        java:app/sirur-ejb/GedBean!br.gov.caixa.sirur.bean.impl.GedBean
        java:module/GedBean!br.gov.caixa.sirur.bean.impl.GedBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/GedBean
        java:app/sirur-ejb/GedBean
        java:module/GedBean

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EtapaCadastroOrcamentoBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/EtapaCadastroOrcamentoBean!br.gov.caixa.sirur.bean.impl.orcamento.EtapaCadastroOrcamentoBean
        java:app/sirur-ejb/EtapaCadastroOrcamentoBean!br.gov.caixa.sirur.bean.impl.orcamento.EtapaCadastroOrcamentoBean
        java:module/EtapaCadastroOrcamentoBean!br.gov.caixa.sirur.bean.impl.orcamento.EtapaCadastroOrcamentoBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/EtapaCadastroOrcamentoBean
        java:app/sirur-ejb/EtapaCadastroOrcamentoBean
        java:module/EtapaCadastroOrcamentoBean

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'UnidadeBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/UnidadeBeanImpl!br.gov.caixa.sirur.bean.UnidadeBean
        java:app/sirur-ejb/UnidadeBeanImpl!br.gov.caixa.sirur.bean.UnidadeBean
        java:module/UnidadeBeanImpl!br.gov.caixa.sirur.bean.UnidadeBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/UnidadeBeanImpl
        java:app/sirur-ejb/UnidadeBeanImpl
        java:module/UnidadeBeanImpl

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'CadastroProducaoRuralBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/CadastroProducaoRuralBeanImpl!br.gov.caixa.sirur.bean.CadastroProducaoRuralBean
        java:app/sirur-ejb/CadastroProducaoRuralBeanImpl!br.gov.caixa.sirur.bean.CadastroProducaoRuralBean
        java:module/CadastroProducaoRuralBeanImpl!br.gov.caixa.sirur.bean.CadastroProducaoRuralBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/CadastroProducaoRuralBeanImpl
        java:app/sirur-ejb/CadastroProducaoRuralBeanImpl
        java:module/CadastroProducaoRuralBeanImpl

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'GrupoEconomicoBeanV2' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/GrupoEconomicoBeanV2!br.gov.caixa.sirur.bean.impl.GrupoEconomicoBeanV2
        java:app/sirur-ejb/GrupoEconomicoBeanV2!br.gov.caixa.sirur.bean.impl.GrupoEconomicoBeanV2
        java:module/GrupoEconomicoBeanV2!br.gov.caixa.sirur.bean.impl.GrupoEconomicoBeanV2
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/GrupoEconomicoBeanV2
        java:app/sirur-ejb/GrupoEconomicoBeanV2
        java:module/GrupoEconomicoBeanV2

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'BeanAterEmpresaImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/BeanAterEmpresaImpl!br.gov.caixa.sirur.cadastro.BeanAterEmpresa
        java:app/sirur-ejb/BeanAterEmpresaImpl!br.gov.caixa.sirur.cadastro.BeanAterEmpresa
        java:module/BeanAterEmpresaImpl!br.gov.caixa.sirur.cadastro.BeanAterEmpresa
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/BeanAterEmpresaImpl
        java:app/sirur-ejb/BeanAterEmpresaImpl
        java:module/BeanAterEmpresaImpl

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'HistoricoSituacaoBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/HistoricoSituacaoBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.HistoricoSituacaoBean
        java:app/sirur-ejb/HistoricoSituacaoBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.HistoricoSituacaoBean
        java:module/HistoricoSituacaoBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.HistoricoSituacaoBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/HistoricoSituacaoBean
        java:app/sirur-ejb/HistoricoSituacaoBean
        java:module/HistoricoSituacaoBean

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AterBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/AterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.AterBean
        java:app/sirur-ejb/AterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.AterBean
        java:module/AterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.AterBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/AterBean
        java:app/sirur-ejb/AterBean
        java:module/AterBean

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SicliIntegracaoNegocio' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/SicliIntegracaoNegocio!br.gov.caixa.sirur.integracao.rest.sicli.SicliIntegracaoNegocio
        java:app/sirur-ejb/SicliIntegracaoNegocio!br.gov.caixa.sirur.integracao.rest.sicli.SicliIntegracaoNegocio
        java:module/SicliIntegracaoNegocio!br.gov.caixa.sirur.integracao.rest.sicli.SicliIntegracaoNegocio
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/SicliIntegracaoNegocio
        java:app/sirur-ejb/SicliIntegracaoNegocio
        java:module/SicliIntegracaoNegocio

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ImprimirCadatroBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/ImprimirCadatroBeanImpl!br.gov.caixa.sirur.bean.ImprimirCadatroBean
        java:app/sirur-ejb/ImprimirCadatroBeanImpl!br.gov.caixa.sirur.bean.ImprimirCadatroBean
        java:module/ImprimirCadatroBeanImpl!br.gov.caixa.sirur.bean.ImprimirCadatroBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/ImprimirCadatroBeanImpl
        java:app/sirur-ejb/ImprimirCadatroBeanImpl
        java:module/ImprimirCadatroBeanImpl

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'InscricaoEstadualBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/InscricaoEstadualBeanImpl!br.gov.caixa.sirur.bean.InscricaoEstadualBean
        java:app/sirur-ejb/InscricaoEstadualBeanImpl!br.gov.caixa.sirur.bean.InscricaoEstadualBean
        java:module/InscricaoEstadualBeanImpl!br.gov.caixa.sirur.bean.InscricaoEstadualBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/InscricaoEstadualBeanImpl
        java:app/sirur-ejb/InscricaoEstadualBeanImpl
        java:module/InscricaoEstadualBeanImpl

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'OportunidadeNegocioBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/OportunidadeNegocioBean!br.gov.caixa.sirur.bean.impl.oportunidadenegocio.OportunidadeNegocioBean
        java:app/sirur-ejb/OportunidadeNegocioBean!br.gov.caixa.sirur.bean.impl.oportunidadenegocio.OportunidadeNegocioBean
        java:module/OportunidadeNegocioBean!br.gov.caixa.sirur.bean.impl.oportunidadenegocio.OportunidadeNegocioBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/OportunidadeNegocioBean
        java:app/sirur-ejb/OportunidadeNegocioBean
        java:module/OportunidadeNegocioBean

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EmpresaBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/EmpresaBeanImpl!br.gov.caixa.sirur.bean.EmpresaBean
        java:app/sirur-ejb/EmpresaBeanImpl!br.gov.caixa.sirur.bean.EmpresaBean
        java:module/EmpresaBeanImpl!br.gov.caixa.sirur.bean.EmpresaBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/EmpresaBeanImpl
        java:app/sirur-ejb/EmpresaBeanImpl
        java:module/EmpresaBeanImpl

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SiricBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/SiricBeanImpl!br.gov.caixa.sirur.bean.impl.SiricBeanImpl
        java:app/sirur-ejb/SiricBeanImpl!br.gov.caixa.sirur.bean.impl.SiricBeanImpl
        java:module/SiricBeanImpl!br.gov.caixa.sirur.bean.impl.SiricBeanImpl
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/SiricBeanImpl
        java:app/sirur-ejb/SiricBeanImpl
        java:module/SiricBeanImpl

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ProdutorRuralEmpresaBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/ProdutorRuralEmpresaBeanImpl!br.gov.caixa.sirur.bean.ProdutorRuralEmpresaBean
        java:app/sirur-ejb/ProdutorRuralEmpresaBeanImpl!br.gov.caixa.sirur.bean.ProdutorRuralEmpresaBean
        java:module/ProdutorRuralEmpresaBeanImpl!br.gov.caixa.sirur.bean.ProdutorRuralEmpresaBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/ProdutorRuralEmpresaBeanImpl
        java:app/sirur-ejb/ProdutorRuralEmpresaBeanImpl
        java:module/ProdutorRuralEmpresaBeanImpl

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SituacaoCadastroOrcamentoBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/SituacaoCadastroOrcamentoBean!br.gov.caixa.sirur.bean.impl.orcamento.SituacaoCadastroOrcamentoBean
        java:app/sirur-ejb/SituacaoCadastroOrcamentoBean!br.gov.caixa.sirur.bean.impl.orcamento.SituacaoCadastroOrcamentoBean
        java:module/SituacaoCadastroOrcamentoBean!br.gov.caixa.sirur.bean.impl.orcamento.SituacaoCadastroOrcamentoBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/SituacaoCadastroOrcamentoBean
        java:app/sirur-ejb/SituacaoCadastroOrcamentoBean
        java:module/SituacaoCadastroOrcamentoBean

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'LocalidadeIntegracaoNegocio' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/LocalidadeIntegracaoNegocio!br.gov.caixa.sirur.integracao.rest.localidade.LocalidadeIntegracaoNegocio
        java:app/sirur-ejb/LocalidadeIntegracaoNegocio!br.gov.caixa.sirur.integracao.rest.localidade.LocalidadeIntegracaoNegocio
        java:module/LocalidadeIntegracaoNegocio!br.gov.caixa.sirur.integracao.rest.localidade.LocalidadeIntegracaoNegocio
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/LocalidadeIntegracaoNegocio
        java:app/sirur-ejb/LocalidadeIntegracaoNegocio
        java:module/LocalidadeIntegracaoNegocio

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ParecerTecnicoBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/ParecerTecnicoBean!br.gov.caixa.sirur.bean.impl.orcamento.ParecerTecnicoBean
        java:app/sirur-ejb/ParecerTecnicoBean!br.gov.caixa.sirur.bean.impl.orcamento.ParecerTecnicoBean
        java:module/ParecerTecnicoBean!br.gov.caixa.sirur.bean.impl.orcamento.ParecerTecnicoBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/ParecerTecnicoBean
        java:app/sirur-ejb/ParecerTecnicoBean
        java:module/ParecerTecnicoBean

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SituacaoSolicitacaoBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/SituacaoSolicitacaoBeanImpl!br.gov.caixa.sirur.bean.SituacaoSolicitacaoBean
        java:app/sirur-ejb/SituacaoSolicitacaoBeanImpl!br.gov.caixa.sirur.bean.SituacaoSolicitacaoBean
        java:module/SituacaoSolicitacaoBeanImpl!br.gov.caixa.sirur.bean.SituacaoSolicitacaoBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/SituacaoSolicitacaoBeanImpl
        java:app/sirur-ejb/SituacaoSolicitacaoBeanImpl
        java:module/SituacaoSolicitacaoBeanImpl

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'PerfilProdutorBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/PerfilProdutorBeanImpl!br.gov.caixa.sirur.bean.PerfilProdutorBean
        java:app/sirur-ejb/PerfilProdutorBeanImpl!br.gov.caixa.sirur.bean.PerfilProdutorBean
        java:module/PerfilProdutorBeanImpl!br.gov.caixa.sirur.bean.PerfilProdutorBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/PerfilProdutorBeanImpl
        java:app/sirur-ejb/PerfilProdutorBeanImpl
        java:module/PerfilProdutorBeanImpl

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'IntegranteGrupoEconomicoBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/IntegranteGrupoEconomicoBeanImpl!br.gov.caixa.sirur.bean.IntegranteGrupoEconomicoBean
        java:app/sirur-ejb/IntegranteGrupoEconomicoBeanImpl!br.gov.caixa.sirur.bean.IntegranteGrupoEconomicoBean
        java:module/IntegranteGrupoEconomicoBeanImpl!br.gov.caixa.sirur.bean.IntegranteGrupoEconomicoBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/IntegranteGrupoEconomicoBeanImpl
        java:app/sirur-ejb/IntegranteGrupoEconomicoBeanImpl
        java:module/IntegranteGrupoEconomicoBeanImpl

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'InformeBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/InformeBeanImpl!br.gov.caixa.sirur.bean.InformeBean
        java:app/sirur-ejb/InformeBeanImpl!br.gov.caixa.sirur.bean.InformeBean
        java:module/InformeBeanImpl!br.gov.caixa.sirur.bean.InformeBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/InformeBeanImpl
        java:app/sirur-ejb/InformeBeanImpl
        java:module/InformeBeanImpl

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'OrcamentoBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/OrcamentoBean!br.gov.caixa.sirur.bean.impl.orcamento.OrcamentoBean
        java:app/sirur-ejb/OrcamentoBean!br.gov.caixa.sirur.bean.impl.orcamento.OrcamentoBean
        java:module/OrcamentoBean!br.gov.caixa.sirur.bean.impl.orcamento.OrcamentoBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/OrcamentoBean
        java:app/sirur-ejb/OrcamentoBean
        java:module/OrcamentoBean

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EmpreendimentoBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/EmpreendimentoBean!br.gov.caixa.sirur.bean.impl.orcamento.EmpreendimentoBean
        java:app/sirur-ejb/EmpreendimentoBean!br.gov.caixa.sirur.bean.impl.orcamento.EmpreendimentoBean
        java:module/EmpreendimentoBean!br.gov.caixa.sirur.bean.impl.orcamento.EmpreendimentoBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/EmpreendimentoBean
        java:app/sirur-ejb/EmpreendimentoBean
        java:module/EmpreendimentoBean

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ImovelBeanV2Impl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/ImovelBeanV2Impl!br.gov.caixa.sirur.bean.impl.ImovelBeanV2Impl
        java:app/sirur-ejb/ImovelBeanV2Impl!br.gov.caixa.sirur.bean.impl.ImovelBeanV2Impl
        java:module/ImovelBeanV2Impl!br.gov.caixa.sirur.bean.impl.ImovelBeanV2Impl
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/ImovelBeanV2Impl
        java:app/sirur-ejb/ImovelBeanV2Impl
        java:module/ImovelBeanV2Impl

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ImovelBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/ImovelBeanImpl!br.gov.caixa.sirur.bean.ImovelBean
        java:app/sirur-ejb/ImovelBeanImpl!br.gov.caixa.sirur.bean.ImovelBean
        java:module/ImovelBeanImpl!br.gov.caixa.sirur.bean.ImovelBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/ImovelBeanImpl
        java:app/sirur-ejb/ImovelBeanImpl
        java:module/ImovelBeanImpl

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ProdutorRuralBeanV2' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/ProdutorRuralBeanV2!br.gov.caixa.sirur.bean.impl.ProdutorRuralBeanV2
        java:app/sirur-ejb/ProdutorRuralBeanV2!br.gov.caixa.sirur.bean.impl.ProdutorRuralBeanV2
        java:module/ProdutorRuralBeanV2!br.gov.caixa.sirur.bean.impl.ProdutorRuralBeanV2
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/ProdutorRuralBeanV2
        java:app/sirur-ejb/ProdutorRuralBeanV2
        java:module/ProdutorRuralBeanV2

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TipoProdutorBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/TipoProdutorBeanImpl!br.gov.caixa.sirur.bean.TipoProdutorBean
        java:app/sirur-ejb/TipoProdutorBeanImpl!br.gov.caixa.sirur.bean.TipoProdutorBean
        java:module/TipoProdutorBeanImpl!br.gov.caixa.sirur.bean.TipoProdutorBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/TipoProdutorBeanImpl
        java:app/sirur-ejb/TipoProdutorBeanImpl
        java:module/TipoProdutorBeanImpl

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EnquadramentoDapImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/EnquadramentoDapImpl!br.gov.caixa.sirur.bean.EnquadramentoDap
        java:app/sirur-ejb/EnquadramentoDapImpl!br.gov.caixa.sirur.bean.EnquadramentoDap
        java:module/EnquadramentoDapImpl!br.gov.caixa.sirur.bean.EnquadramentoDap
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/EnquadramentoDapImpl
        java:app/sirur-ejb/EnquadramentoDapImpl
        java:module/EnquadramentoDapImpl

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SiricServiceImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/SiricServiceImpl!br.gov.caixa.sirur.service.impl.SiricServiceImpl
        java:app/sirur-ejb/SiricServiceImpl!br.gov.caixa.sirur.service.impl.SiricServiceImpl
        java:module/SiricServiceImpl!br.gov.caixa.sirur.service.impl.SiricServiceImpl
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/SiricServiceImpl
        java:app/sirur-ejb/SiricServiceImpl
        java:module/SiricServiceImpl

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SiricXMLIntegracaoNegocioImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/SiricXMLIntegracaoNegocioImpl!br.gov.caixa.sirur.integracao.mq.siric.impl.SiricXMLIntegracaoNegocioImpl
        java:app/sirur-ejb/SiricXMLIntegracaoNegocioImpl!br.gov.caixa.sirur.integracao.mq.siric.impl.SiricXMLIntegracaoNegocioImpl
        java:module/SiricXMLIntegracaoNegocioImpl!br.gov.caixa.sirur.integracao.mq.siric.impl.SiricXMLIntegracaoNegocioImpl
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/SiricXMLIntegracaoNegocioImpl
        java:app/sirur-ejb/SiricXMLIntegracaoNegocioImpl
        java:module/SiricXMLIntegracaoNegocioImpl

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DomainBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/DomainBeanImpl!br.gov.caixa.sirur.bean.DomainBean
        java:app/sirur-ejb/DomainBeanImpl!br.gov.caixa.sirur.bean.DomainBean
        java:module/DomainBeanImpl!br.gov.caixa.sirur.bean.DomainBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/DomainBeanImpl
        java:app/sirur-ejb/DomainBeanImpl
        java:module/DomainBeanImpl

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ImovelBeneficiadoBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/ImovelBeneficiadoBean!br.gov.caixa.sirur.bean.impl.orcamento.ImovelBeneficiadoBean
        java:app/sirur-ejb/ImovelBeneficiadoBean!br.gov.caixa.sirur.bean.impl.orcamento.ImovelBeneficiadoBean
        java:module/ImovelBeneficiadoBean!br.gov.caixa.sirur.bean.impl.orcamento.ImovelBeneficiadoBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/ImovelBeneficiadoBean
        java:app/sirur-ejb/ImovelBeneficiadoBean
        java:module/ImovelBeneficiadoBean

14:48:02,067 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DadosMatriculaDtoProcessorV2' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/DadosMatriculaDtoProcessorV2!br.gov.caixa.sirur.processor.imovel.DadosMatriculaDtoProcessorV2
        java:app/sirur-ejb/DadosMatriculaDtoProcessorV2!br.gov.caixa.sirur.processor.imovel.DadosMatriculaDtoProcessorV2
        java:module/DadosMatriculaDtoProcessorV2!br.gov.caixa.sirur.processor.imovel.DadosMatriculaDtoProcessorV2
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/DadosMatriculaDtoProcessorV2
        java:app/sirur-ejb/DadosMatriculaDtoProcessorV2
        java:module/DadosMatriculaDtoProcessorV2

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AnaliseDocumentacaoBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/AnaliseDocumentacaoBean!br.gov.caixa.sirur.bean.impl.orcamento.AnaliseDocumentacaoBean
        java:app/sirur-ejb/AnaliseDocumentacaoBean!br.gov.caixa.sirur.bean.impl.orcamento.AnaliseDocumentacaoBean
        java:module/AnaliseDocumentacaoBean!br.gov.caixa.sirur.bean.impl.orcamento.AnaliseDocumentacaoBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/AnaliseDocumentacaoBean
        java:app/sirur-ejb/AnaliseDocumentacaoBean
        java:module/AnaliseDocumentacaoBean

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AtividadePecuariaBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/AtividadePecuariaBeanImpl!br.gov.caixa.sirur.bean.AtividadePecuariaBean
        java:app/sirur-ejb/AtividadePecuariaBeanImpl!br.gov.caixa.sirur.bean.AtividadePecuariaBean
        java:module/AtividadePecuariaBeanImpl!br.gov.caixa.sirur.bean.AtividadePecuariaBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/AtividadePecuariaBeanImpl
        java:app/sirur-ejb/AtividadePecuariaBeanImpl
        java:module/AtividadePecuariaBeanImpl

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'GlebasBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/GlebasBean!br.gov.caixa.sirur.bean.impl.orcamento.GlebasBean
        java:app/sirur-ejb/GlebasBean!br.gov.caixa.sirur.bean.impl.orcamento.GlebasBean
        java:module/GlebasBean!br.gov.caixa.sirur.bean.impl.orcamento.GlebasBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/GlebasBean
        java:app/sirur-ejb/GlebasBean
        java:module/GlebasBean

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AnaliseDocumentalAterBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/AnaliseDocumentalAterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.AnaliseDocumentalAterBean
        java:app/sirur-ejb/AnaliseDocumentalAterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.AnaliseDocumentalAterBean
        java:module/AnaliseDocumentalAterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.AnaliseDocumentalAterBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/AnaliseDocumentalAterBean
        java:app/sirur-ejb/AnaliseDocumentalAterBean
        java:module/AnaliseDocumentalAterBean

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AvaliacaoRiscoProdutorNegocio' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/AvaliacaoRiscoProdutorNegocio!br.gov.caixa.sirur.bean.impl.AvaliacaoRiscoProdutorNegocio
        java:app/sirur-ejb/AvaliacaoRiscoProdutorNegocio!br.gov.caixa.sirur.bean.impl.AvaliacaoRiscoProdutorNegocio
        java:module/AvaliacaoRiscoProdutorNegocio!br.gov.caixa.sirur.bean.impl.AvaliacaoRiscoProdutorNegocio
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/AvaliacaoRiscoProdutorNegocio
        java:app/sirur-ejb/AvaliacaoRiscoProdutorNegocio
        java:module/AvaliacaoRiscoProdutorNegocio

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MatriculaPrincipalMunicipioProcessorV2' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/MatriculaPrincipalMunicipioProcessorV2!br.gov.caixa.sirur.processor.imovel.MatriculaPrincipalMunicipioProcessorV2
        java:app/sirur-ejb/MatriculaPrincipalMunicipioProcessorV2!br.gov.caixa.sirur.processor.imovel.MatriculaPrincipalMunicipioProcessorV2
        java:module/MatriculaPrincipalMunicipioProcessorV2!br.gov.caixa.sirur.processor.imovel.MatriculaPrincipalMunicipioProcessorV2
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/MatriculaPrincipalMunicipioProcessorV2
        java:app/sirur-ejb/MatriculaPrincipalMunicipioProcessorV2
        java:module/MatriculaPrincipalMunicipioProcessorV2

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SicliXmlIntegracaoNegocio' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/SicliXmlIntegracaoNegocio!br.gov.caixa.sirur.integracao.mq.sicli.SicliXmlIntegracaoNegocio
        java:app/sirur-ejb/SicliXmlIntegracaoNegocio!br.gov.caixa.sirur.integracao.mq.sicli.SicliXmlIntegracaoNegocio
        java:module/SicliXmlIntegracaoNegocio!br.gov.caixa.sirur.integracao.mq.sicli.SicliXmlIntegracaoNegocio
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/SicliXmlIntegracaoNegocio
        java:app/sirur-ejb/SicliXmlIntegracaoNegocio
        java:module/SicliXmlIntegracaoNegocio

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DocumentacaoAterBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/DocumentacaoAterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.DocumentacaoAterBean
        java:app/sirur-ejb/DocumentacaoAterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.DocumentacaoAterBean
        java:module/DocumentacaoAterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.DocumentacaoAterBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/DocumentacaoAterBean
        java:app/sirur-ejb/DocumentacaoAterBean
        java:module/DocumentacaoAterBean

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ConsultaAvaliacaoRiscoOperacao' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/ConsultaAvaliacaoRiscoOperacao!br.gov.caixa.sirur.integracao.mq.siric.operacao.ConsultaAvaliacaoRiscoOperacao
        java:app/sirur-ejb/ConsultaAvaliacaoRiscoOperacao!br.gov.caixa.sirur.integracao.mq.siric.operacao.ConsultaAvaliacaoRiscoOperacao
        java:module/ConsultaAvaliacaoRiscoOperacao!br.gov.caixa.sirur.integracao.mq.siric.operacao.ConsultaAvaliacaoRiscoOperacao
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/ConsultaAvaliacaoRiscoOperacao
        java:app/sirur-ejb/ConsultaAvaliacaoRiscoOperacao
        java:module/ConsultaAvaliacaoRiscoOperacao

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MtrIntegracaoNegocio' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/MtrIntegracaoNegocio!br.gov.caixa.sirur.integracao.rest.mtr.MtrIntegracaoNegocio
        java:app/sirur-ejb/MtrIntegracaoNegocio!br.gov.caixa.sirur.integracao.rest.mtr.MtrIntegracaoNegocio
        java:module/MtrIntegracaoNegocio!br.gov.caixa.sirur.integracao.rest.mtr.MtrIntegracaoNegocio
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/MtrIntegracaoNegocio
        java:app/sirur-ejb/MtrIntegracaoNegocio
        java:module/MtrIntegracaoNegocio

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'UfSimulacaoBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/UfSimulacaoBean!br.gov.caixa.sirur.bean.impl.UfSimulacaoBean
        java:app/sirur-ejb/UfSimulacaoBean!br.gov.caixa.sirur.bean.impl.UfSimulacaoBean
        java:module/UfSimulacaoBean!br.gov.caixa.sirur.bean.impl.UfSimulacaoBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/UfSimulacaoBean
        java:app/sirur-ejb/UfSimulacaoBean
        java:module/UfSimulacaoBean

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DomainBeanV2' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/DomainBeanV2!br.gov.caixa.sirur.bean.impl.DomainBeanV2
        java:app/sirur-ejb/DomainBeanV2!br.gov.caixa.sirur.bean.impl.DomainBeanV2
        java:module/DomainBeanV2!br.gov.caixa.sirur.bean.impl.DomainBeanV2
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/DomainBeanV2
        java:app/sirur-ejb/DomainBeanV2
        java:module/DomainBeanV2

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SiicoIntegracaoNegocio' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/SiicoIntegracaoNegocio!br.gov.caixa.sirur.integracao.rest.siico.SiicoIntegracaoNegocio
        java:app/sirur-ejb/SiicoIntegracaoNegocio!br.gov.caixa.sirur.integracao.rest.siico.SiicoIntegracaoNegocio
        java:module/SiicoIntegracaoNegocio!br.gov.caixa.sirur.integracao.rest.siico.SiicoIntegracaoNegocio
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/SiicoIntegracaoNegocio
        java:app/sirur-ejb/SiicoIntegracaoNegocio
        java:module/SiicoIntegracaoNegocio

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'UnidadeServiceV2Impl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/UnidadeServiceV2Impl!br.gov.caixa.sirur.service.UnidadeServiceV2
        java:app/sirur-ejb/UnidadeServiceV2Impl!br.gov.caixa.sirur.service.UnidadeServiceV2
        java:module/UnidadeServiceV2Impl!br.gov.caixa.sirur.service.UnidadeServiceV2
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/UnidadeServiceV2Impl
        java:app/sirur-ejb/UnidadeServiceV2Impl
        java:module/UnidadeServiceV2Impl

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DocumentoBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/DocumentoBeanImpl!br.gov.caixa.sirur.bean.DocumentoBean
        java:app/sirur-ejb/DocumentoBeanImpl!br.gov.caixa.sirur.bean.DocumentoBean
        java:module/DocumentoBeanImpl!br.gov.caixa.sirur.bean.DocumentoBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/DocumentoBeanImpl
        java:app/sirur-ejb/DocumentoBeanImpl
        java:module/DocumentoBeanImpl

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'GrupoEconomicoBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/GrupoEconomicoBeanImpl!br.gov.caixa.sirur.bean.GrupoEconomicoBean
        java:app/sirur-ejb/GrupoEconomicoBeanImpl!br.gov.caixa.sirur.bean.GrupoEconomicoBean
        java:module/GrupoEconomicoBeanImpl!br.gov.caixa.sirur.bean.GrupoEconomicoBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/GrupoEconomicoBeanImpl
        java:app/sirur-ejb/GrupoEconomicoBeanImpl
        java:module/GrupoEconomicoBeanImpl

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DossieOrcamentoBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/DossieOrcamentoBean!br.gov.caixa.sirur.integracao.rest.mtr.bean.DossieOrcamentoBean
        java:app/sirur-ejb/DossieOrcamentoBean!br.gov.caixa.sirur.integracao.rest.mtr.bean.DossieOrcamentoBean
        java:module/DossieOrcamentoBean!br.gov.caixa.sirur.integracao.rest.mtr.bean.DossieOrcamentoBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/DossieOrcamentoBean
        java:app/sirur-ejb/DossieOrcamentoBean
        java:module/DossieOrcamentoBean

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DocumentoProdutoBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/DocumentoProdutoBean!br.gov.caixa.sirur.integracao.rest.mtr.bean.DocumentoProdutoBean
        java:app/sirur-ejb/DocumentoProdutoBean!br.gov.caixa.sirur.integracao.rest.mtr.bean.DocumentoProdutoBean
        java:module/DocumentoProdutoBean!br.gov.caixa.sirur.integracao.rest.mtr.bean.DocumentoProdutoBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/DocumentoProdutoBean
        java:app/sirur-ejb/DocumentoProdutoBean
        java:module/DocumentoProdutoBean

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SituacaoOrcamentoBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/SituacaoOrcamentoBean!br.gov.caixa.sirur.bean.impl.orcamento.SituacaoOrcamentoBean
        java:app/sirur-ejb/SituacaoOrcamentoBean!br.gov.caixa.sirur.bean.impl.orcamento.SituacaoOrcamentoBean
        java:module/SituacaoOrcamentoBean!br.gov.caixa.sirur.bean.impl.orcamento.SituacaoOrcamentoBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/SituacaoOrcamentoBean
        java:app/sirur-ejb/SituacaoOrcamentoBean
        java:module/SituacaoOrcamentoBean

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MatriculaBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/MatriculaBeanImpl!br.gov.caixa.sirur.bean.MatriculaBean
        java:app/sirur-ejb/MatriculaBeanImpl!br.gov.caixa.sirur.bean.MatriculaBean
        java:module/MatriculaBeanImpl!br.gov.caixa.sirur.bean.MatriculaBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/MatriculaBeanImpl
        java:app/sirur-ejb/MatriculaBeanImpl
        java:module/MatriculaBeanImpl

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'CadastroProducaoRuralBeanImplV2' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/CadastroProducaoRuralBeanImplV2!br.gov.caixa.sirur.bean.impl.CadastroProducaoRuralBeanImplV2
        java:app/sirur-ejb/CadastroProducaoRuralBeanImplV2!br.gov.caixa.sirur.bean.impl.CadastroProducaoRuralBeanImplV2
        java:module/CadastroProducaoRuralBeanImplV2!br.gov.caixa.sirur.bean.impl.CadastroProducaoRuralBeanImplV2
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/CadastroProducaoRuralBeanImplV2
        java:app/sirur-ejb/CadastroProducaoRuralBeanImplV2
        java:module/CadastroProducaoRuralBeanImplV2

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'BeanAterTecnicoImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/BeanAterTecnicoImpl!br.gov.caixa.sirur.cadastro.BeanAterTecnico
        java:app/sirur-ejb/BeanAterTecnicoImpl!br.gov.caixa.sirur.cadastro.BeanAterTecnico
        java:module/BeanAterTecnicoImpl!br.gov.caixa.sirur.cadastro.BeanAterTecnico
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/BeanAterTecnicoImpl
        java:app/sirur-ejb/BeanAterTecnicoImpl
        java:module/BeanAterTecnicoImpl

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SiempIntegracaoNegocio' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/SiempIntegracaoNegocio!br.gov.caixa.sirur.integracao.bd.siemp.SiempIntegracaoNegocio
        java:app/sirur-ejb/SiempIntegracaoNegocio!br.gov.caixa.sirur.integracao.bd.siemp.SiempIntegracaoNegocio
        java:module/SiempIntegracaoNegocio!br.gov.caixa.sirur.integracao.bd.siemp.SiempIntegracaoNegocio
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/SiempIntegracaoNegocio
        java:app/sirur-ejb/SiempIntegracaoNegocio
        java:module/SiempIntegracaoNegocio

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MatriculaPrincipalMunicipioServiceImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/MatriculaPrincipalMunicipioServiceImpl!br.gov.caixa.sirur.service.MatriculaPrincipalMunicipioService
        java:app/sirur-ejb/MatriculaPrincipalMunicipioServiceImpl!br.gov.caixa.sirur.service.MatriculaPrincipalMunicipioService
        java:module/MatriculaPrincipalMunicipioServiceImpl!br.gov.caixa.sirur.service.MatriculaPrincipalMunicipioService
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/MatriculaPrincipalMunicipioServiceImpl
        java:app/sirur-ejb/MatriculaPrincipalMunicipioServiceImpl
        java:module/MatriculaPrincipalMunicipioServiceImpl

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TecnicoBeanV2' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/TecnicoBeanV2!br.gov.caixa.sirur.bean.impl.TecnicoBeanV2
        java:app/sirur-ejb/TecnicoBeanV2!br.gov.caixa.sirur.bean.impl.TecnicoBeanV2
        java:module/TecnicoBeanV2!br.gov.caixa.sirur.bean.impl.TecnicoBeanV2
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/TecnicoBeanV2
        java:app/sirur-ejb/TecnicoBeanV2
        java:module/TecnicoBeanV2

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AtividadeBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/AtividadeBeanImpl!br.gov.caixa.sirur.bean.AtividadeBean
        java:app/sirur-ejb/AtividadeBeanImpl!br.gov.caixa.sirur.bean.AtividadeBean
        java:module/AtividadeBeanImpl!br.gov.caixa.sirur.bean.AtividadeBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/AtividadeBeanImpl
        java:app/sirur-ejb/AtividadeBeanImpl
        java:module/AtividadeBeanImpl

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ExcluirDadosStepsPosImovelBeneficiadoBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/ExcluirDadosStepsPosImovelBeneficiadoBean!br.gov.caixa.sirur.bean.impl.orcamento.ExcluirDadosStepsPosImovelBeneficiadoBean
        java:app/sirur-ejb/ExcluirDadosStepsPosImovelBeneficiadoBean!br.gov.caixa.sirur.bean.impl.orcamento.ExcluirDadosStepsPosImovelBeneficiadoBean
        java:module/ExcluirDadosStepsPosImovelBeneficiadoBean!br.gov.caixa.sirur.bean.impl.orcamento.ExcluirDadosStepsPosImovelBeneficiadoBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/ExcluirDadosStepsPosImovelBeneficiadoBean
        java:app/sirur-ejb/ExcluirDadosStepsPosImovelBeneficiadoBean
        java:module/ExcluirDadosStepsPosImovelBeneficiadoBean

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TecnicoConveniadoBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/TecnicoConveniadoBeanImpl!br.gov.caixa.sirur.bean.TecnicoConveniadoBean
        java:app/sirur-ejb/TecnicoConveniadoBeanImpl!br.gov.caixa.sirur.bean.TecnicoConveniadoBean
        java:module/TecnicoConveniadoBeanImpl!br.gov.caixa.sirur.bean.TecnicoConveniadoBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/TecnicoConveniadoBeanImpl
        java:app/sirur-ejb/TecnicoConveniadoBeanImpl
        java:module/TecnicoConveniadoBeanImpl

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AtividadePecuariaV2ServiceImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/AtividadePecuariaV2ServiceImpl!br.gov.caixa.sirur.service.AtividadePecuriariaV2Service
        java:app/sirur-ejb/AtividadePecuariaV2ServiceImpl!br.gov.caixa.sirur.service.AtividadePecuriariaV2Service
        java:module/AtividadePecuariaV2ServiceImpl!br.gov.caixa.sirur.service.AtividadePecuriariaV2Service
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/AtividadePecuariaV2ServiceImpl
        java:app/sirur-ejb/AtividadePecuariaV2ServiceImpl
        java:module/AtividadePecuariaV2ServiceImpl

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ProdutorRuralBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/ProdutorRuralBeanImpl!br.gov.caixa.sirur.bean.ProdutorRuralBean
        java:app/sirur-ejb/ProdutorRuralBeanImpl!br.gov.caixa.sirur.bean.ProdutorRuralBean
        java:module/ProdutorRuralBeanImpl!br.gov.caixa.sirur.bean.ProdutorRuralBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/ProdutorRuralBeanImpl
        java:app/sirur-ejb/ProdutorRuralBeanImpl
        java:module/ProdutorRuralBeanImpl

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AtividadeAgricolaServiceV2Impl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/AtividadeAgricolaServiceV2Impl!br.gov.caixa.sirur.service.AtividadeAgricolaServiceV2
        java:app/sirur-ejb/AtividadeAgricolaServiceV2Impl!br.gov.caixa.sirur.service.AtividadeAgricolaServiceV2
        java:module/AtividadeAgricolaServiceV2Impl!br.gov.caixa.sirur.service.AtividadeAgricolaServiceV2
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/AtividadeAgricolaServiceV2Impl
        java:app/sirur-ejb/AtividadeAgricolaServiceV2Impl
        java:module/AtividadeAgricolaServiceV2Impl

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DocumentoAterBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/DocumentoAterBeanImpl!br.gov.caixa.sirur.bean.DocumentoAterBean
        java:app/sirur-ejb/DocumentoAterBeanImpl!br.gov.caixa.sirur.bean.DocumentoAterBean
        java:module/DocumentoAterBeanImpl!br.gov.caixa.sirur.bean.DocumentoAterBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/DocumentoAterBeanImpl
        java:app/sirur-ejb/DocumentoAterBeanImpl
        java:module/DocumentoAterBeanImpl

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ComunicadoBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/ComunicadoBeanImpl!br.gov.caixa.sirur.bean.ComunicadoBean
        java:app/sirur-ejb/ComunicadoBeanImpl!br.gov.caixa.sirur.bean.ComunicadoBean
        java:module/ComunicadoBeanImpl!br.gov.caixa.sirur.bean.ComunicadoBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/ComunicadoBeanImpl
        java:app/sirur-ejb/ComunicadoBeanImpl
        java:module/ComunicadoBeanImpl

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'BeanRiscoCreditoImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/BeanRiscoCreditoImpl!br.gov.caixa.sirur.base.BeanRiscoCredito
        java:app/sirur-ejb/BeanRiscoCreditoImpl!br.gov.caixa.sirur.base.BeanRiscoCredito
        java:module/BeanRiscoCreditoImpl!br.gov.caixa.sirur.base.BeanRiscoCredito
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/BeanRiscoCreditoImpl
        java:app/sirur-ejb/BeanRiscoCreditoImpl
        java:module/BeanRiscoCreditoImpl

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'UnidadeIntegracaoNegocio' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/UnidadeIntegracaoNegocio!br.gov.caixa.sirur.integracao.rest.unidade.UnidadeIntegracaoNegocio
        java:app/sirur-ejb/UnidadeIntegracaoNegocio!br.gov.caixa.sirur.integracao.rest.unidade.UnidadeIntegracaoNegocio
        java:module/UnidadeIntegracaoNegocio!br.gov.caixa.sirur.integracao.rest.unidade.UnidadeIntegracaoNegocio
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/UnidadeIntegracaoNegocio
        java:app/sirur-ejb/UnidadeIntegracaoNegocio
        java:module/UnidadeIntegracaoNegocio

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AtividadeAgricolaBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/AtividadeAgricolaBeanImpl!br.gov.caixa.sirur.bean.AtividadeAgricolaBean
        java:app/sirur-ejb/AtividadeAgricolaBeanImpl!br.gov.caixa.sirur.bean.AtividadeAgricolaBean
        java:module/AtividadeAgricolaBeanImpl!br.gov.caixa.sirur.bean.AtividadeAgricolaBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/AtividadeAgricolaBeanImpl
        java:app/sirur-ejb/AtividadeAgricolaBeanImpl
        java:module/AtividadeAgricolaBeanImpl

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TecnicoConveniadoAssistenciaBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/TecnicoConveniadoAssistenciaBeanImpl!br.gov.caixa.sirur.bean.TecnicoConveniadoAssistenciaBean
        java:app/sirur-ejb/TecnicoConveniadoAssistenciaBeanImpl!br.gov.caixa.sirur.bean.TecnicoConveniadoAssistenciaBean
        java:module/TecnicoConveniadoAssistenciaBeanImpl!br.gov.caixa.sirur.bean.TecnicoConveniadoAssistenciaBean
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/TecnicoConveniadoAssistenciaBeanImpl
        java:app/sirur-ejb/TecnicoConveniadoAssistenciaBeanImpl
        java:module/TecnicoConveniadoAssistenciaBeanImpl

14:48:02,068 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'BeanSirurImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.03.ear"' são como segue:

        java:global/sifec-sirur-3.55.51.03/sirur-ejb/BeanSirurImpl!br.gov.caixa.sirur.base.BeanSirur
        java:app/sirur-ejb/BeanSirurImpl!br.gov.caixa.sirur.base.BeanSirur
        java:module/BeanSirurImpl!br.gov.caixa.sirur.base.BeanSirur
        java:global/sifec-sirur-3.55.51.03/sirur-ejb/BeanSirurImpl
        java:app/sirur-ejb/BeanSirurImpl
        java:module/BeanSirurImpl

14:48:02,090 INFO  [org.jipijapa] (MSC service thread 1-3) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-sirur-3.55.51.03.ear#SIEMP-PU
14:48:02,091 INFO  [org.jipijapa] (MSC service thread 1-3) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-sirur-3.55.51.03.ear#fecDS
14:48:02,115 WARN  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0003: Não foi possível instanciar a classe do driver "org.olap4j.driver.xmla.XmlaOlap4jDriver": java.lang.NoSuchMethodException: org.olap4j.driver.xmla.XmlaOlap4jDriver.<init>()
14:48:02,212 WARN  [org.jboss.as.ejb3] (MSC service thread 1-5) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.sifec.componentes.seguranca.sso.utils.SecurityKeycloakUtils não devem ter um método final ou estático (getParamsString)
14:48:02,269 WARN  [org.jboss.as.ejb3] (MSC service thread 1-7) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.sirur.ldap.ConexaoLDAP não devem ter um método final ou estático (getAtributosUsuarioPorLogin)
14:48:02,269 WARN  [org.jboss.as.ejb3] (MSC service thread 1-7) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.sirur.ldap.ConexaoLDAP não devem ter um método final ou estático (getAtributosUsuarioInternoPorLogin)
14:48:02,269 WARN  [org.jboss.as.ejb3] (MSC service thread 1-7) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.sirur.ldap.ConexaoLDAP não devem ter um método final ou estático (getAtributosUsuarioExternoPorLogin)
14:48:02,285 WARN  [org.jboss.as.jaxrs] (MSC service thread 1-5) WFLYRS0018: Uso explícito da anotação Jackson em uma implantação de Jakarta RESTful Web Services; o sistema desativará o processamento de Jakarta JSON Binding para a implantação atual. Considere definir a propriedade 'resteasy.preferJacksonOverJsonB' para 'falso' para restaurar o Jakarta JSON Binding.
14:48:02,324 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 190) WFLYJPA0010: Iniciando unidade de persistência (fase 2 de 2) Serviço'sifec-sirur-3.55.51.03.ear#fecDS'
14:48:02,324 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 188) WFLYJPA0010: Iniciando unidade de persistência (fase 2 de 2) Serviço'sifec-sirur-3.55.51.03.ear#SIEMP-PU'
14:48:02,389 INFO  [org.hibernate.dialect.Dialect] (ServerService Thread Pool -- 188) HHH000400: Using dialect: org.hibernate.dialect.DB2390Dialect
14:48:02,389 INFO  [org.hibernate.dialect.Dialect] (ServerService Thread Pool -- 190) HHH000400: Using dialect: org.hibernate.dialect.DB2Dialect
14:48:02,505 INFO  [org.jipijapa] (MSC service thread 1-7) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-sirur-3.55.51.03.ear/sirur-ejb.jar#fec.pu
14:48:02,507 INFO  [org.jipijapa] (MSC service thread 1-7) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-sirur-3.55.51.03.ear/sirur-ejb.jar#fec.rur.pu
14:48:02,509 INFO  [org.hibernate.envers.boot.internal.EnversServiceImpl] (ServerService Thread Pool -- 190) Envers integration enabled? : true
14:48:02,509 INFO  [org.hibernate.envers.boot.internal.EnversServiceImpl] (ServerService Thread Pool -- 188) Envers integration enabled? : true
14:48:02,587 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 191) WFLYJPA0010: Iniciando unidade de persistência (fase 2 de 2) Serviço'sifec-sirur-3.55.51.03.ear/sirur-ejb.jar#fec.pu'
14:48:02,606 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 185) WFLYJPA0010: Iniciando unidade de persistência (fase 2 de 2) Serviço'sifec-sirur-3.55.51.03.ear/sirur-ejb.jar#fec.rur.pu'
14:48:02,611 INFO  [org.hibernate.dialect.Dialect] (ServerService Thread Pool -- 191) HHH000400: Using dialect: org.hibernate.dialect.DB2Dialect
14:48:02,631 WARN  [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator] (ServerService Thread Pool -- 185) HHH000341: Could not obtain connection metadata : Conexão Fechada
14:48:02,632 INFO  [org.hibernate.envers.boot.internal.EnversServiceImpl] (ServerService Thread Pool -- 191) Envers integration enabled? : true
14:48:02,634 INFO  [org.hibernate.dialect.Dialect] (ServerService Thread Pool -- 185) HHH000400: Using dialect: org.hibernate.dialect.Oracle10gDialect
14:48:02,638 INFO  [org.hibernate.engine.jdbc.env.internal.LobCreatorBuilderImpl] (ServerService Thread Pool -- 185) HHH000422: Disabling contextual LOB creation as connection was null
14:48:02,639 INFO  [org.hibernate.envers.boot.internal.EnversServiceImpl] (ServerService Thread Pool -- 185) Envers integration enabled? : true
14:48:02,899 WARN  [org.hibernate.boot.internal.InFlightMetadataCollectorImpl] (ServerService Thread Pool -- 185) HHH000069: Duplicate generator name gen
14:48:02,899 WARN  [org.hibernate.boot.internal.InFlightMetadataCollectorImpl] (ServerService Thread Pool -- 191) HHH000069: Duplicate generator name gen
14:48:02,908 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 190) HHH000038: Composite-id class does not override equals(): br.gov.caixa.arqrefservices.dominio.usuarioexterno.SolicitacaoUsuarioExternoPK
14:48:02,908 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 190) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.arqrefservices.dominio.usuarioexterno.SolicitacaoUsuarioExternoPK
14:48:02,964 WARN  [org.hibernate.validator.internal.engine.ValidatorFactoryImpl] (ServerService Thread Pool -- 190) HV000258: Expression Language interpolation features are not explicitly enabled/disabled. Use 'ORG_HIBERNATE_VALIDATOR_EXPRESSION_LANGUAGE_ENABLED' environment variable, or 'org.hibernate.validator.expressionLanguageEnabled' system property to define the behavior. Defaulting to expression language features being disabled.
14:48:03,238 WARN  [org.hibernate.boot.internal.InFlightMetadataCollectorImpl] (ServerService Thread Pool -- 185) HHH000069: Duplicate generator name gen
14:48:03,238 WARN  [org.hibernate.boot.internal.InFlightMetadataCollectorImpl] (ServerService Thread Pool -- 191) HHH000069: Duplicate generator name gen
14:48:03,353 WARN  [org.hibernate.boot.internal.InFlightMetadataCollectorImpl] (ServerService Thread Pool -- 185) HHH000069: Duplicate generator name gen
14:48:03,355 WARN  [org.hibernate.boot.internal.InFlightMetadataCollectorImpl] (ServerService Thread Pool -- 191) HHH000069: Duplicate generator name gen
14:48:03,576 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.dominio.DominioPK
14:48:03,576 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.dominio.DominioPK
14:48:03,576 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.ater.EtapaCadastramentoAssistenciaPK
14:48:03,576 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.ater.EtapaCadastramentoAssistenciaPK
14:48:03,576 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.orcamento.UnidadeMedidaOrcamentoPK
14:48:03,576 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.orcamento.UnidadeMedidaOrcamentoPK
14:48:03,576 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.producaorural.EtapaCadastroProducaoRuralPK
14:48:03,576 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.producaorural.EtapaCadastroProducaoRuralPK
14:48:03,577 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.producaorural.imoveis.MatriculaPrincipalMunicipioPK
14:48:03,577 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.producaorural.imoveis.MatriculaPrincipalMunicipioPK
14:48:03,577 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.orcamento.ProducaoAgricola
14:48:03,577 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.orcamento.ProducaoAgricola
14:48:03,577 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.oportunidadenegocio.FaseOportunidadePK
14:48:03,577 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.oportunidadenegocio.FaseOportunidadePK
14:48:03,578 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.dominio.DominioPK
14:48:03,578 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.dominio.DominioPK
14:48:03,578 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.producaorural.atividadeagricola.HistoricoProducaoAgricolaPK
14:48:03,578 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.producaorural.atividadeagricola.HistoricoProducaoAgricolaPK
14:48:03,578 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.sifec.siico.persistence.entity.UnidadeCaixaPK
14:48:03,578 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.sifec.siico.persistence.entity.UnidadeCaixaPK
14:48:03,578 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.tecnicoconveniado.SolicitacaoCadastroTecnicoPK
14:48:03,578 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.tecnicoconveniado.SolicitacaoCadastroTecnicoPK
14:48:03,579 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.ater.ContaCreditoAssistencia
14:48:03,579 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.ater.ContaCreditoAssistencia
14:48:03,579 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.producaorural.atividadepecuaria.RebanhoPecuariaPK
14:48:03,579 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.producaorural.atividadepecuaria.RebanhoPecuariaPK
14:48:03,579 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.orcamento.FaseOrcamentoSolicitacaoPK
14:48:03,579 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.orcamento.FaseOrcamentoSolicitacaoPK
14:48:03,579 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.orcamento.EtapaCadastroOrcamentoPK
14:48:03,579 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.orcamento.EtapaCadastroOrcamentoPK
14:48:03,579 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.orcamento.ReceitaEstimada
14:48:03,579 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.orcamento.ReceitaEstimada
14:48:03,580 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.orcamento.ImovelBeneficiadoPK
14:48:03,580 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 185) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.orcamento.ImovelBeneficiadoPK
14:48:03,589 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.ater.EtapaCadastramentoAssistenciaPK
14:48:03,589 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.ater.EtapaCadastramentoAssistenciaPK
14:48:03,589 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.orcamento.UnidadeMedidaOrcamentoPK
14:48:03,589 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.orcamento.UnidadeMedidaOrcamentoPK
14:48:03,589 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.producaorural.EtapaCadastroProducaoRuralPK
14:48:03,590 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.producaorural.EtapaCadastroProducaoRuralPK
14:48:03,590 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.producaorural.imoveis.MatriculaPrincipalMunicipioPK
14:48:03,590 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.producaorural.imoveis.MatriculaPrincipalMunicipioPK
14:48:03,590 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.orcamento.ProducaoAgricola
14:48:03,590 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.orcamento.ProducaoAgricola
14:48:03,590 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.oportunidadenegocio.FaseOportunidadePK
14:48:03,590 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.oportunidadenegocio.FaseOportunidadePK
14:48:03,595 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.producaorural.atividadeagricola.HistoricoProducaoAgricolaPK
14:48:03,595 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.producaorural.atividadeagricola.HistoricoProducaoAgricolaPK
14:48:03,595 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.sifec.siico.persistence.entity.UnidadeCaixaPK
14:48:03,595 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.sifec.siico.persistence.entity.UnidadeCaixaPK
14:48:03,595 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.tecnicoconveniado.SolicitacaoCadastroTecnicoPK
14:48:03,595 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.tecnicoconveniado.SolicitacaoCadastroTecnicoPK
14:48:03,596 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.ater.ContaCreditoAssistencia
14:48:03,596 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.ater.ContaCreditoAssistencia
14:48:03,596 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.producaorural.atividadepecuaria.RebanhoPecuariaPK
14:48:03,596 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.producaorural.atividadepecuaria.RebanhoPecuariaPK
14:48:03,596 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.orcamento.FaseOrcamentoSolicitacaoPK
14:48:03,597 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.orcamento.FaseOrcamentoSolicitacaoPK
14:48:03,597 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.orcamento.EtapaCadastroOrcamentoPK
14:48:03,597 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.orcamento.EtapaCadastroOrcamentoPK
14:48:03,597 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.orcamento.ReceitaEstimada
14:48:03,597 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.orcamento.ReceitaEstimada
14:48:03,597 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.orcamento.ImovelBeneficiadoPK
14:48:03,597 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 191) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.orcamento.ImovelBeneficiadoPK
14:48:04,013 WARN  [org.hibernate.validator.internal.engine.ValidatorFactoryImpl] (ServerService Thread Pool -- 191) HV000258: Expression Language interpolation features are not explicitly enabled/disabled. Use 'ORG_HIBERNATE_VALIDATOR_EXPRESSION_LANGUAGE_ENABLED' environment variable, or 'org.hibernate.validator.expressionLanguageEnabled' system property to define the behavior. Defaulting to expression language features being disabled.
14:48:05,285 ERROR [org.hibernate.hql.spi.id.IdTableHelper] (ServerService Thread Pool -- 185) Unable to use JDBC Connection to create Statement: java.sql.SQLRecoverableException: Conexão Fechada
        at oracle.jdbc.driver.PhysicalConnection.createStatement(PhysicalConnection.java:1689)
        at oracle.jdbc.driver.PhysicalConnection.createStatement(PhysicalConnection.java:1679)
        at oracle.jdbc.driver.PhysicalConnection.createStatement(PhysicalConnection.java:1648)
        at org.jboss.jca.adapters.jdbc.WrappedConnection$1.produce(WrappedConnection.java:357)
        at org.jboss.jca.adapters.jdbc.WrappedConnection$1.produce(WrappedConnection.java:355)
        at org.jboss.jca.adapters.jdbc.SecurityActions.executeInTccl(SecurityActions.java:103)
        at org.jboss.jca.adapters.jdbc.WrappedConnection.createStatement(WrappedConnection.java:355)
        at org.hibernate.hql.spi.id.IdTableHelper.executeIdTableCreationStatements(IdTableHelper.java:77) [hibernate-core-5.3.37.Final-redhat-00001.jar:5.3.37.Final-redhat-00001]
        at org.hibernate.hql.spi.id.global.GlobalTemporaryTableBulkIdStrategy.finishPreparation(GlobalTemporaryTableBulkIdStrategy.java:125) [hibernate-core-5.3.37.Final-redhat-00001.jar:5.3.37.Final-redhat-00001]
        at org.hibernate.hql.spi.id.global.GlobalTemporaryTableBulkIdStrategy.finishPreparation(GlobalTemporaryTableBulkIdStrategy.java:42) [hibernate-core-5.3.37.Final-redhat-00001.jar:5.3.37.Final-redhat-00001]
        at org.hibernate.hql.spi.id.AbstractMultiTableBulkIdStrategyImpl.prepare(AbstractMultiTableBulkIdStrategyImpl.java:88) [hibernate-core-5.3.37.Final-redhat-00001.jar:5.3.37.Final-redhat-00001]
        at org.hibernate.internal.SessionFactoryImpl.<init>(SessionFactoryImpl.java:303) [hibernate-core-5.3.37.Final-redhat-00001.jar:5.3.37.Final-redhat-00001]
        at org.hibernate.boot.internal.SessionFactoryBuilderImpl.build(SessionFactoryBuilderImpl.java:467) [hibernate-core-5.3.37.Final-redhat-00001.jar:5.3.37.Final-redhat-00001]
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1250) [hibernate-core-5.3.37.Final-redhat-00001.jar:5.3.37.Final-redhat-00001]
        at org.jboss.as.jpa.hibernate5.TwoPhaseBootstrapImpl.build(TwoPhaseBootstrapImpl.java:44)
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1$1.run(PersistenceUnitServiceImpl.java:170) [wildfly-jpa-7.4.23.GA-redhat-00002.jar:7.4.23.GA-redhat-00002]
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1$1.run(PersistenceUnitServiceImpl.java:128) [wildfly-jpa-7.4.23.GA-redhat-00002.jar:7.4.23.GA-redhat-00002]
        at java.security.AccessController.doPrivileged(Native Method) [rt.jar:1.8.0_482]
        at org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:664) [wildfly-elytron-security-manager-1.15.26.Final-redhat-00001.jar:1.15.26.Final-redhat-00001]
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1.run(PersistenceUnitServiceImpl.java:213) [wildfly-jpa-7.4.23.GA-redhat-00002.jar:7.4.23.GA-redhat-00002]
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at java.lang.Thread.run(Thread.java:750) [rt.jar:1.8.0_482]
        at org.jboss.threads.JBossThread.run(JBossThread.java:513)

14:48:05,299 INFO  [org.hibernate.hql.internal.QueryTranslatorFactoryInitiator] (ServerService Thread Pool -- 185) HHH000397: Using ASTQueryTranslatorFactory
14:48:05,590 WARN  [org.hibernate.dialect.function.TemplateRenderer] (ServerService Thread Pool -- 185) HHH000174: Function template anticipated 4 arguments, but 1 arguments encountered
14:48:05,672 INFO  [org.jboss.weld.Event] (MSC service thread 1-6) WELD-000411: Observer method [BackedAnnotatedMethod] protected org.springframework.data.repository.cdi.CdiRepositoryExtensionSupport.processAnnotatedType(@Observes ProcessAnnotatedType<X>) receives events for all annotated types. Consider restricting events using @WithAnnotations or a generic type with bounds.
14:48:39,063 INFO  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 2) WELD-001125: Illegal bean type br.gov.caixa.arqrefcore.cache.AbstractCache<java.lang.Class<?>, br.gov.caixa.arqrefcore.reflexao.ReflectorClassCache> ignored on [EnhancedAnnotatedTypeImpl] public @Singleton class br.gov.caixa.arqrefcore.reflexao.ReflectorCache
14:48:39,064 INFO  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 2) WELD-001125: Illegal bean type interface br.gov.caixa.arqrefcore.cache.Cache<java.lang.Class<?>,class br.gov.caixa.arqrefcore.reflexao.ReflectorClassCache> ignored on [EnhancedAnnotatedTypeImpl] public @Singleton class br.gov.caixa.arqrefcore.reflexao.ReflectorCache
14:48:39,229 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.RegimeExploracaoRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,234 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.ProdutividadeMediaLeiteRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,234 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.MatriculaRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,234 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.ConvenioRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,234 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.AtividadePecuariaRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,234 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.SituacaoSolicitacaoRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,234 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.ModoOperacionalRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,234 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.SituacaoCadastroProducaoRuralRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,234 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.DocumentoInformativoRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,234 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.ExploracaoTerceirosRepositoy' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,234 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.sifec.siico.persistence.repository.UnidadeCaixaRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,234 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.TexturaSoloRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,234 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.ReceitasDividasRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.ImovelRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.CoordenadaImovelRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.ModalidadeProducaoRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.TipoTecnicoRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.ComunicadoRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.NivelTecnologicoProducaoRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.MatriculaPrincipalMunicipioRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.ConselhoRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.CadastroProducaoRuralRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.IntegranteGrupoEconomicoRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.UnidadeMedidaRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.TipoConstrucaoRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.InformeHistoricoRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.TipoAssistenciaTecnicaRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.ProprietarioMatriculaRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.AtividadeRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.CulturaRuralRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.HistoricoProducaoAgricolaRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.ProdutorRuralEmpresaRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.RegistroTecnicoRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.DocumentoRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.DapProducaoRuralRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.TecnicoConveniadoAbrangenciaRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.EtapaCadastroProducaoRuralRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.AtividadeAgricolaRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.DadosProducaoAgricolaRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.RegistroEmpresaRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.NivelTecnologicoPecuariaRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.TecnicoConveniadoRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.RegistroRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.SistemaProducaoPecuariaRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.InscricaoEstadualRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.InformeRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.EmpresaRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.TipoServicoRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,235 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.siemp.persistence.repository.SiempDocumentoRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,236 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.EmpresaConveniadaAgrangenciaRepositoy' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,236 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.TipoDocumentoRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,236 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.ProdutorRuralRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,236 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.TipoAnaliseDocumentoRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,237 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.DocumentoAnaliseRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,237 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.TipoSafraAgricolaRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,237 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.RegistroTecnicoAbrangenciaRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,237 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.AnoAgricolaRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,237 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.SistemaOrdenhaRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,237 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.TipoEmpresaRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,238 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.AvaliacaoProducaoRuralRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,238 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.RebanhoPecuariaRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,238 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.DocumentoInformativoHistoricoRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,238 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.ConstrucaoMatriculaRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,238 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.TipoGravameRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,238 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.GrupoEconomicoRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,238 INFO  [org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension] (MSC service thread 1-6) Registering bean for 'br.gov.caixa.sirur.persistence.repository.CategoriaAnimalRepository' with qualifiers [@javax.enterprise.inject.Default(), @javax.enterprise.inject.Any()].
14:48:39,383 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-6) MSC000001: Failed to start service jboss.deployment.unit."sifec-sirur-3.55.51.03.ear".WeldStartService: org.jboss.msc.service.StartException in service jboss.deployment.unit."sifec-sirur-3.55.51.03.ear".WeldStartService: Failed to start service
        at org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1731)
        at org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1559)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at java.lang.Thread.run(Thread.java:750) [rt.jar:1.8.0_482]
Caused by: org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type SiricXMLIntegracaoNegocio with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.sirur.service.impl.SiricServiceImpl.siricNegocio
  at br.gov.caixa.sirur.service.impl.SiricServiceImpl.siricNegocio(SiricServiceImpl.java:0)

        at org.jboss.weld.bootstrap.Validator.validateInjectionPointForDeploymentProblems(Validator.java:378) [weld-core-impl-3.1.11.Final-redhat-00001.jar:3.1.11.Final-redhat-00001]
        at org.jboss.weld.bootstrap.Validator.validateInjectionPoint(Validator.java:290) [weld-core-impl-3.1.11.Final-redhat-00001.jar:3.1.11.Final-redhat-00001]
        at org.jboss.weld.bootstrap.Validator.validateGeneralBean(Validator.java:143) [weld-core-impl-3.1.11.Final-redhat-00001.jar:3.1.11.Final-redhat-00001]
        at org.jboss.weld.bootstrap.Validator.validateRIBean(Validator.java:164) [weld-core-impl-3.1.11.Final-redhat-00001.jar:3.1.11.Final-redhat-00001]
        at org.jboss.weld.bootstrap.Validator.validateBean(Validator.java:526) [weld-core-impl-3.1.11.Final-redhat-00001.jar:3.1.11.Final-redhat-00001]
        at org.jboss.weld.bootstrap.ConcurrentValidator$1.doWork(ConcurrentValidator.java:64) [weld-core-impl-3.1.11.Final-redhat-00001.jar:3.1.11.Final-redhat-00001]
        at org.jboss.weld.bootstrap.ConcurrentValidator$1.doWork(ConcurrentValidator.java:62) [weld-core-impl-3.1.11.Final-redhat-00001.jar:3.1.11.Final-redhat-00001]
        at org.jboss.weld.executor.IterativeWorkerTaskFactory$1.call(IterativeWorkerTaskFactory.java:62) [weld-core-impl-3.1.11.Final-redhat-00001.jar:3.1.11.Final-redhat-00001]
        at org.jboss.weld.executor.IterativeWorkerTaskFactory$1.call(IterativeWorkerTaskFactory.java:55) [weld-core-impl-3.1.11.Final-redhat-00001.jar:3.1.11.Final-redhat-00001]
        at java.util.concurrent.FutureTask.run(FutureTask.java:266) [rt.jar:1.8.0_482]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) [rt.jar:1.8.0_482]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) [rt.jar:1.8.0_482]
        at java.lang.Thread.run(Thread.java:750) [rt.jar:1.8.0_482]
        at org.jboss.threads.JBossThread.run(JBossThread.java:513)

14:48:39,391 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 181) WFLYCTL0013: Falha na operação ("add") - endereço ([("deployment" => "SIRUR")]) - falha na descrição: {"WFLYCTL0080: Falha de serviços" => {"jboss.deployment.unit.\"sifec-sirur-3.55.51.03.ear\".WeldStartService" => "Failed to start service
    Caused by: org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type SiricXMLIntegracaoNegocio with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.sirur.service.impl.SiricServiceImpl.siricNegocio
  at br.gov.caixa.sirur.service.impl.SiricServiceImpl.siricNegocio(SiricServiceImpl.java:0)
"}}
14:48:39,392 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 181) WFLYCTL0013: Falha na operação ("add") - endereço ([("deployment" => "SIRUR")]) - falha na descrição: {"WFLYCTL0080: Falha de serviços" => {"jboss.deployment.unit.\"sifec-sirur-3.55.51.03.ear\".WeldStartService" => "Failed to start service
    Caused by: org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type SiricXMLIntegracaoNegocio with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.sirur.service.impl.SiricServiceImpl.siricNegocio
  at br.gov.caixa.sirur.service.impl.SiricServiceImpl.siricNegocio(SiricServiceImpl.java:0)
"}}
14:48:39,392 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 181) WFLYSRV0021: O procedimento da implantação "sifec-sirur-3.55.51.03.ear" foi revertido com mensagem de falha:
{"WFLYCTL0080: Falha de serviços" => {"jboss.deployment.unit.\"sifec-sirur-3.55.51.03.ear\".WeldStartService" => "Failed to start service
    Caused by: org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type SiricXMLIntegracaoNegocio with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.sirur.service.impl.SiricServiceImpl.siricNegocio
  at br.gov.caixa.sirur.service.impl.SiricServiceImpl.siricNegocio(SiricServiceImpl.java:0)
"}}
14:48:39,393 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 188) WFLYJPA0011: Interrompendo unidade de persistência (fase 2 de 2) Serviço 'sifec-sirur-3.55.51.03.ear#SIEMP-PU'
14:48:39,393 INFO  [org.hibernate.orm.beans] (ServerService Thread Pool -- 188) HHH10005004: Stopping BeanContainer : org.hibernate.resource.beans.container.internal.CdiBeanContainerExtendedAccessImpl@7528075a
14:48:39,393 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 192) WFLYJPA0011: Interrompendo unidade de persistência (fase 2 de 2) Serviço 'sifec-sirur-3.55.51.03.ear#fecDS'
14:48:39,394 INFO  [org.hibernate.orm.beans] (ServerService Thread Pool -- 192) HHH10005004: Stopping BeanContainer : org.hibernate.resource.beans.container.internal.CdiBeanContainerExtendedAccessImpl@65b815af
14:48:39,397 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 196) WFLYJPA0011: Interrompendo unidade de persistência (fase 2 de 2) Serviço 'sifec-sirur-3.55.51.03.ear/sirur-ejb.jar#fec.rur.pu'
14:48:39,397 INFO  [org.hibernate.orm.beans] (ServerService Thread Pool -- 196) HHH10005004: Stopping BeanContainer : org.hibernate.resource.beans.container.internal.CdiBeanContainerExtendedAccessImpl@12cd2ac4
14:48:39,397 INFO  [org.hibernate.service.internal.AbstractServiceRegistryImpl] (ServerService Thread Pool -- 196) HHH000369: Error stopping service [class org.hibernate.resource.beans.internal.ManagedBeanRegistryImpl] : java.lang.NullPointerException
14:48:39,398 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 193) WFLYJPA0011: Interrompendo unidade de persistência (fase 2 de 2) Serviço 'sifec-sirur-3.55.51.03.ear/sirur-ejb.jar#fec.pu'
14:48:39,399 INFO  [org.hibernate.orm.beans] (ServerService Thread Pool -- 193) HHH10005004: Stopping BeanContainer : org.hibernate.resource.beans.container.internal.CdiBeanContainerExtendedAccessImpl@33b50ee1
14:48:39,399 INFO  [org.hibernate.service.internal.AbstractServiceRegistryImpl] (ServerService Thread Pool -- 193) HHH000369: Error stopping service [class org.hibernate.resource.beans.internal.ManagedBeanRegistryImpl] : java.lang.NullPointerException
14:48:39,410 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 193) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'sifec-sirur-3.55.51.03.ear#SIEMP-PU'
14:48:39,411 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 193) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'sifec-sirur-3.55.51.03.ear/sirur-ejb.jar#fec.rur.pu'
14:48:39,411 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 192) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'sifec-sirur-3.55.51.03.ear#fecDS'
14:48:39,411 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 193) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'sifec-sirur-3.55.51.03.ear/sirur-ejb.jar#fec.pu'
14:48:39,439 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-5) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: sirur-ejb.jar) em 47ms
14:48:39,474 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: sirur-web.war) em 82ms
14:48:39,485 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0028: Implantação interrompida SIRUR (runtime-name: sifec-sirur-3.55.51.03.ear) em 93ms



