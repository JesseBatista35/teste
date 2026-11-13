
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.sicli.service.impl.DadosSICLIBean.dao
  at br.gov.caixa.lcr.sicli.service.impl.DadosSICLIBean.dao(DadosSICLIBean.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type AmortizacaoDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.service.impl.AmortizacaoBean.amortizacaoDao
  at br.gov.caixa.lcr.service.impl.AmortizacaoBean.amortizacaoDao(AmortizacaoBean.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type ConformidadeDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.conformidade.service.impl.ConformidadeBean.conformidadeDao
  at br.gov.caixa.lcr.conformidade.service.impl.ConformidadeBean.conformidadeDao(ConformidadeBean.java:0)
14:59:27,954 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 147) WFLYJPA0011: Interrompendo unidade de persistência (fase 2 de 2) Serviço 'sifec_lcr_1.117.1.ear#fecDS'
14:59:27,999 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 147) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'sifec_lcr_1.117.1.ear#fecDS'
14:59:28,056 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: lcr-ejb.jar) em 110ms
14:59:28,065 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: lcr-web.war) em 118ms
14:59:28,077 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0028: Implantação interrompida SILCR (runtime-name: sifec_lcr_1.117.1.ear) em 131ms
15:08:25,677 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0027: Iniciando a implantação do "SIRUR" (runtime-name: "sifec-sirur-3.55.51.02.ear")
15:08:29,022 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-5) WFLYSRV0059: A entrada do caminho da classe jaxb-api.jar em /content/sifec-sirur-3.55.51.02.ear/lib/jaxb-impl-2.2.3-1.jar não direciona a um jar válido para a referência do caminho da classe.
15:08:29,022 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-5) WFLYSRV0059: A entrada do caminho da classe activation.jar em /content/sifec-sirur-3.55.51.02.ear/lib/jaxb-impl-2.2.3-1.jar não direciona a um jar válido para a referência do caminho da classe.
15:08:29,022 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-5) WFLYSRV0059: A entrada do caminho da classe jsr173_1.0_api.jar em /content/sifec-sirur-3.55.51.02.ear/lib/jaxb-impl-2.2.3-1.jar não direciona a um jar válido para a referência do caminho da classe.
15:08:29,022 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-5) WFLYSRV0059: A entrada do caminho da classe jaxb1-impl.jar em /content/sifec-sirur-3.55.51.02.ear/lib/jaxb-impl-2.2.3-1.jar não direciona a um jar válido para a referência do caminho da classe.
15:08:29,040 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "sirur-ejb.jar")
15:08:29,040 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "sirur-web.war")
15:08:29,648 INFO  [org.jipijapa] (MSC service thread 1-5) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-sirur-3.55.51.02.ear#SIEMP-PU
15:08:29,649 INFO  [org.jipijapa] (MSC service thread 1-5) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-sirur-3.55.51.02.ear#fecDS
15:08:29,650 INFO  [org.jipijapa] (MSC service thread 1-7) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-sirur-3.55.51.02.ear/sirur-ejb.jar#fec.pu
15:08:29,650 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 153) WFLYJPA0010: Iniciando unidade de persistência (fase 1 de 2) Serviço'sifec-sirur-3.55.51.02.ear#fecDS'
15:08:29,650 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 155) WFLYJPA0010: Iniciando unidade de persistência (fase 1 de 2) Serviço'sifec-sirur-3.55.51.02.ear#SIEMP-PU'
15:08:29,651 INFO  [org.jipijapa] (MSC service thread 1-7) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-sirur-3.55.51.02.ear/sirur-ejb.jar#fec.rur.pu
15:08:29,651 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 157) WFLYJPA0010: Iniciando unidade de persistência (fase 1 de 2) Serviço'sifec-sirur-3.55.51.02.ear/sirur-ejb.jar#fec.pu'
15:08:29,651 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 158) WFLYJPA0010: Iniciando unidade de persistência (fase 1 de 2) Serviço'sifec-sirur-3.55.51.02.ear/sirur-ejb.jar#fec.rur.pu'
15:08:29,692 INFO  [org.jboss.weld.deployer] (MSC service thread 1-5) WFLYWELD0003: Processando da implantação weld sifec-sirur-3.55.51.02.ear
15:08:29,947 INFO  [org.jboss.keycloak] (MSC service thread 1-7) Keycloak subsystem override for deployment sirur-web.war
15:08:29,947 INFO  [org.jboss.weld.deployer] (MSC service thread 1-7) WFLYWELD0003: Processando da implantação weld sirur-web.war
15:08:29,955 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-7) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'seguranca-sso-SecurityKeycloakUtils' na unidade de implementação 'subdeployment "sirur-web.war" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-web/seguranca-sso-SecurityKeycloakUtils!br.gov.caixa.sifec.componentes.seguranca.sso.utils.SecurityKeycloakUtils
        java:app/sirur-web/seguranca-sso-SecurityKeycloakUtils!br.gov.caixa.sifec.componentes.seguranca.sso.utils.SecurityKeycloakUtils
        java:global/sifec-sirur-3.55.51.02/sirur-web/seguranca-sso-SecurityKeycloakUtils
        java:app/sirur-web/seguranca-sso-SecurityKeycloakUtils
15:08:30,319 INFO  [org.jboss.weld.deployer] (MSC service thread 1-3) WFLYWELD0003: Processando da implantação weld sirur-ejb.jar
15:08:30,323 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ExportacaoCadastroAterBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/ExportacaoCadastroAterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.ExportacaoCadastroAterBean
        java:app/sirur-ejb/ExportacaoCadastroAterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.ExportacaoCadastroAterBean
        java:module/ExportacaoCadastroAterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.ExportacaoCadastroAterBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/ExportacaoCadastroAterBean
        java:app/sirur-ejb/ExportacaoCadastroAterBean
15:08:30,323 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DocumentoInformativoBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/DocumentoInformativoBeanImpl!br.gov.caixa.sirur.bean.DocumentoInformativoBean
        java:app/sirur-ejb/DocumentoInformativoBeanImpl!br.gov.caixa.sirur.bean.DocumentoInformativoBean
        java:module/DocumentoInformativoBeanImpl!br.gov.caixa.sirur.bean.DocumentoInformativoBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/DocumentoInformativoBeanImpl
        java:app/sirur-ejb/DocumentoInformativoBeanImpl
15:08:30,323 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MatriculaServiceV2Impl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/MatriculaServiceV2Impl!br.gov.caixa.sirur.service.MatriculaServiceV2
        java:app/sirur-ejb/MatriculaServiceV2Impl!br.gov.caixa.sirur.service.MatriculaServiceV2
        java:module/MatriculaServiceV2Impl!br.gov.caixa.sirur.service.MatriculaServiceV2
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/MatriculaServiceV2Impl
        java:app/sirur-ejb/MatriculaServiceV2Impl
15:08:30,323 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ViabilidadeEmpreendimentoBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/ViabilidadeEmpreendimentoBean!br.gov.caixa.sirur.bean.impl.orcamento.ViabilidadeEmpreendimentoBean
        java:app/sirur-ejb/ViabilidadeEmpreendimentoBean!br.gov.caixa.sirur.bean.impl.orcamento.ViabilidadeEmpreendimentoBean
        java:module/ViabilidadeEmpreendimentoBean!br.gov.caixa.sirur.bean.impl.orcamento.ViabilidadeEmpreendimentoBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/ViabilidadeEmpreendimentoBean
        java:app/sirur-ejb/ViabilidadeEmpreendimentoBean
15:08:30,324 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DomainServiceV2Impl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/DomainServiceV2Impl!br.gov.caixa.sirur.service.DomainServiceV2
        java:app/sirur-ejb/DomainServiceV2Impl!br.gov.caixa.sirur.service.DomainServiceV2
        java:module/DomainServiceV2Impl!br.gov.caixa.sirur.service.DomainServiceV2
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/DomainServiceV2Impl
        java:app/sirur-ejb/DomainServiceV2Impl
15:08:30,324 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SituacaoSolicitacaoServiceImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/SituacaoSolicitacaoServiceImpl!br.gov.caixa.sirur.service.SituacaoSolicitacaoService
        java:app/sirur-ejb/SituacaoSolicitacaoServiceImpl!br.gov.caixa.sirur.service.SituacaoSolicitacaoService
        java:module/SituacaoSolicitacaoServiceImpl!br.gov.caixa.sirur.service.SituacaoSolicitacaoService
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/SituacaoSolicitacaoServiceImpl
        java:app/sirur-ejb/SituacaoSolicitacaoServiceImpl
15:08:30,324 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DocumentacaoBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/DocumentacaoBeanImpl!br.gov.caixa.sirur.bean.DocumentacaoBean
        java:app/sirur-ejb/DocumentacaoBeanImpl!br.gov.caixa.sirur.bean.DocumentacaoBean
        java:module/DocumentacaoBeanImpl!br.gov.caixa.sirur.bean.DocumentacaoBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/DocumentacaoBeanImpl
        java:app/sirur-ejb/DocumentacaoBeanImpl
15:08:30,324 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ConexaoLDAP' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/ConexaoLDAP!br.gov.caixa.sirur.ldap.ConexaoLDAP
        java:app/sirur-ejb/ConexaoLDAP!br.gov.caixa.sirur.ldap.ConexaoLDAP
        java:module/ConexaoLDAP!br.gov.caixa.sirur.ldap.ConexaoLDAP
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/ConexaoLDAP
        java:app/sirur-ejb/ConexaoLDAP
15:08:30,324 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EtapaCadastroProducaoRuralBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/EtapaCadastroProducaoRuralBeanImpl!br.gov.caixa.sirur.bean.EtapaCadastroProducaoRuralBean
        java:app/sirur-ejb/EtapaCadastroProducaoRuralBeanImpl!br.gov.caixa.sirur.bean.EtapaCadastroProducaoRuralBean
        java:module/EtapaCadastroProducaoRuralBeanImpl!br.gov.caixa.sirur.bean.EtapaCadastroProducaoRuralBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/EtapaCadastroProducaoRuralBeanImpl
        java:app/sirur-ejb/EtapaCadastroProducaoRuralBeanImpl
15:08:30,324 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'OrcamentoAnaliticoBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/OrcamentoAnaliticoBean!br.gov.caixa.sirur.bean.impl.orcamento.OrcamentoAnaliticoBean
        java:app/sirur-ejb/OrcamentoAnaliticoBean!br.gov.caixa.sirur.bean.impl.orcamento.OrcamentoAnaliticoBean
        java:module/OrcamentoAnaliticoBean!br.gov.caixa.sirur.bean.impl.orcamento.OrcamentoAnaliticoBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/OrcamentoAnaliticoBean
        java:app/sirur-ejb/OrcamentoAnaliticoBean
15:08:30,324 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DominioBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/DominioBean!br.gov.caixa.sirur.bean.impl.oportunidadenegocio.DominioBean
        java:app/sirur-ejb/DominioBean!br.gov.caixa.sirur.bean.impl.oportunidadenegocio.DominioBean
        java:module/DominioBean!br.gov.caixa.sirur.bean.impl.oportunidadenegocio.DominioBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/DominioBean
        java:app/sirur-ejb/DominioBean
15:08:30,324 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DadosEmpresaAterBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/DadosEmpresaAterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.DadosEmpresaAterBean
        java:app/sirur-ejb/DadosEmpresaAterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.DadosEmpresaAterBean
        java:module/DadosEmpresaAterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.DadosEmpresaAterBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/DadosEmpresaAterBean
        java:app/sirur-ejb/DadosEmpresaAterBean
15:08:30,324 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'RelatorioAterBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/RelatorioAterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.RelatorioAterBean
        java:app/sirur-ejb/RelatorioAterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.RelatorioAterBean
        java:module/RelatorioAterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.RelatorioAterBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/RelatorioAterBean
        java:app/sirur-ejb/RelatorioAterBean
15:08:30,324 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TecnicoBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/TecnicoBeanImpl!br.gov.caixa.sirur.bean.TecnicoBean
        java:app/sirur-ejb/TecnicoBeanImpl!br.gov.caixa.sirur.bean.TecnicoBean
        java:module/TecnicoBeanImpl!br.gov.caixa.sirur.bean.TecnicoBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/TecnicoBeanImpl
        java:app/sirur-ejb/TecnicoBeanImpl
15:08:30,324 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EmpresaBeanImplV2' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/EmpresaBeanImplV2!br.gov.caixa.sirur.bean.EmpresaBeanV2
        java:app/sirur-ejb/EmpresaBeanImplV2!br.gov.caixa.sirur.bean.EmpresaBeanV2
        java:module/EmpresaBeanImplV2!br.gov.caixa.sirur.bean.EmpresaBeanV2
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/EmpresaBeanImplV2
        java:app/sirur-ejb/EmpresaBeanImplV2
15:08:30,325 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'OrcamentoBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/OrcamentoBeanImpl!br.gov.caixa.sirur.orcamento.OrcamentoBeanRmt
        java:app/sirur-ejb/OrcamentoBeanImpl!br.gov.caixa.sirur.orcamento.OrcamentoBeanRmt
        java:module/OrcamentoBeanImpl!br.gov.caixa.sirur.orcamento.OrcamentoBeanRmt
        java:jboss/exported/sifec-sirur-3.55.51.02/sirur-ejb/OrcamentoBeanImpl!br.gov.caixa.sirur.orcamento.OrcamentoBeanRmt
        ejb:sifec-sirur-3.55.51.02/sirur-ejb/OrcamentoBeanImpl!br.gov.caixa.sirur.orcamento.OrcamentoBeanRmt
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/OrcamentoBeanImpl
        java:app/sirur-ejb/OrcamentoBeanImpl
15:08:30,325 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'BeanProducaoRuralImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/BeanProducaoRuralImpl!br.gov.caixa.sirur.cadastro.BeanProducaoRural
        java:app/sirur-ejb/BeanProducaoRuralImpl!br.gov.caixa.sirur.cadastro.BeanProducaoRural
        java:module/BeanProducaoRuralImpl!br.gov.caixa.sirur.cadastro.BeanProducaoRural
        java:jboss/exported/sifec-sirur-3.55.51.02/sirur-ejb/BeanProducaoRuralImpl!br.gov.caixa.sirur.cadastro.BeanProducaoRural
        ejb:sifec-sirur-3.55.51.02/sirur-ejb/BeanProducaoRuralImpl!br.gov.caixa.sirur.cadastro.BeanProducaoRural
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/BeanProducaoRuralImpl
        java:app/sirur-ejb/BeanProducaoRuralImpl
15:08:30,325 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'BeanClienteImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/BeanClienteImpl!br.gov.caixa.sirur.base.BeanCliente
        java:app/sirur-ejb/BeanClienteImpl!br.gov.caixa.sirur.base.BeanCliente
        java:module/BeanClienteImpl!br.gov.caixa.sirur.base.BeanCliente
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/BeanClienteImpl
        java:app/sirur-ejb/BeanClienteImpl
15:08:30,325 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'FaseOportunidadeBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/FaseOportunidadeBean!br.gov.caixa.sirur.bean.impl.oportunidadenegocio.FaseOportunidadeBean
        java:app/sirur-ejb/FaseOportunidadeBean!br.gov.caixa.sirur.bean.impl.oportunidadenegocio.FaseOportunidadeBean
        java:module/FaseOportunidadeBean!br.gov.caixa.sirur.bean.impl.oportunidadenegocio.FaseOportunidadeBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/FaseOportunidadeBean
        java:app/sirur-ejb/FaseOportunidadeBean
15:08:30,325 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AterBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/AterBeanImpl!br.gov.caixa.sirur.bean.AterBean
        java:app/sirur-ejb/AterBeanImpl!br.gov.caixa.sirur.bean.AterBean
        java:module/AterBeanImpl!br.gov.caixa.sirur.bean.AterBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/AterBeanImpl
        java:app/sirur-ejb/AterBeanImpl
15:08:30,325 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DadosProprietarioProcessorV2' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/DadosProprietarioProcessorV2!br.gov.caixa.sirur.processor.imovel.DadosProprietarioProcessorV2
        java:app/sirur-ejb/DadosProprietarioProcessorV2!br.gov.caixa.sirur.processor.imovel.DadosProprietarioProcessorV2
        java:module/DadosProprietarioProcessorV2!br.gov.caixa.sirur.processor.imovel.DadosProprietarioProcessorV2
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/DadosProprietarioProcessorV2
        java:app/sirur-ejb/DadosProprietarioProcessorV2
15:08:30,325 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'PropriedadeBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/PropriedadeBeanImpl!br.gov.caixa.sirur.bean.PropriedadeBean
        java:app/sirur-ejb/PropriedadeBeanImpl!br.gov.caixa.sirur.bean.PropriedadeBean
        java:module/PropriedadeBeanImpl!br.gov.caixa.sirur.bean.PropriedadeBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/PropriedadeBeanImpl
        java:app/sirur-ejb/PropriedadeBeanImpl
15:08:30,325 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DadosTecnicosBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/DadosTecnicosBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.DadosTecnicosBean
        java:app/sirur-ejb/DadosTecnicosBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.DadosTecnicosBean
        java:module/DadosTecnicosBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.DadosTecnicosBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/DadosTecnicosBean
        java:app/sirur-ejb/DadosTecnicosBean
15:08:30,325 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'GedBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/GedBean!br.gov.caixa.sirur.bean.impl.GedBean
        java:app/sirur-ejb/GedBean!br.gov.caixa.sirur.bean.impl.GedBean
        java:module/GedBean!br.gov.caixa.sirur.bean.impl.GedBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/GedBean
        java:app/sirur-ejb/GedBean
15:08:30,325 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EtapaCadastroOrcamentoBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/EtapaCadastroOrcamentoBean!br.gov.caixa.sirur.bean.impl.orcamento.EtapaCadastroOrcamentoBean
        java:app/sirur-ejb/EtapaCadastroOrcamentoBean!br.gov.caixa.sirur.bean.impl.orcamento.EtapaCadastroOrcamentoBean
        java:module/EtapaCadastroOrcamentoBean!br.gov.caixa.sirur.bean.impl.orcamento.EtapaCadastroOrcamentoBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/EtapaCadastroOrcamentoBean
        java:app/sirur-ejb/EtapaCadastroOrcamentoBean
15:08:30,325 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'UnidadeBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/UnidadeBeanImpl!br.gov.caixa.sirur.bean.UnidadeBean
        java:app/sirur-ejb/UnidadeBeanImpl!br.gov.caixa.sirur.bean.UnidadeBean
        java:module/UnidadeBeanImpl!br.gov.caixa.sirur.bean.UnidadeBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/UnidadeBeanImpl
        java:app/sirur-ejb/UnidadeBeanImpl
15:08:30,325 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'CadastroProducaoRuralBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/CadastroProducaoRuralBeanImpl!br.gov.caixa.sirur.bean.CadastroProducaoRuralBean
        java:app/sirur-ejb/CadastroProducaoRuralBeanImpl!br.gov.caixa.sirur.bean.CadastroProducaoRuralBean
        java:module/CadastroProducaoRuralBeanImpl!br.gov.caixa.sirur.bean.CadastroProducaoRuralBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/CadastroProducaoRuralBeanImpl
        java:app/sirur-ejb/CadastroProducaoRuralBeanImpl
15:08:30,325 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'GrupoEconomicoBeanV2' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/GrupoEconomicoBeanV2!br.gov.caixa.sirur.bean.impl.GrupoEconomicoBeanV2
        java:app/sirur-ejb/GrupoEconomicoBeanV2!br.gov.caixa.sirur.bean.impl.GrupoEconomicoBeanV2
        java:module/GrupoEconomicoBeanV2!br.gov.caixa.sirur.bean.impl.GrupoEconomicoBeanV2
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/GrupoEconomicoBeanV2
        java:app/sirur-ejb/GrupoEconomicoBeanV2
15:08:30,325 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'BeanAterEmpresaImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/BeanAterEmpresaImpl!br.gov.caixa.sirur.cadastro.BeanAterEmpresa
        java:app/sirur-ejb/BeanAterEmpresaImpl!br.gov.caixa.sirur.cadastro.BeanAterEmpresa
        java:module/BeanAterEmpresaImpl!br.gov.caixa.sirur.cadastro.BeanAterEmpresa
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/BeanAterEmpresaImpl
        java:app/sirur-ejb/BeanAterEmpresaImpl
15:08:30,325 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'HistoricoSituacaoBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/HistoricoSituacaoBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.HistoricoSituacaoBean
        java:app/sirur-ejb/HistoricoSituacaoBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.HistoricoSituacaoBean
        java:module/HistoricoSituacaoBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.HistoricoSituacaoBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/HistoricoSituacaoBean
        java:app/sirur-ejb/HistoricoSituacaoBean
15:08:30,325 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AterBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/AterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.AterBean
        java:app/sirur-ejb/AterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.AterBean
        java:module/AterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.AterBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/AterBean
        java:app/sirur-ejb/AterBean
15:08:30,325 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SicliIntegracaoNegocio' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/SicliIntegracaoNegocio!br.gov.caixa.sirur.integracao.rest.sicli.SicliIntegracaoNegocio
        java:app/sirur-ejb/SicliIntegracaoNegocio!br.gov.caixa.sirur.integracao.rest.sicli.SicliIntegracaoNegocio
        java:module/SicliIntegracaoNegocio!br.gov.caixa.sirur.integracao.rest.sicli.SicliIntegracaoNegocio
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/SicliIntegracaoNegocio
        java:app/sirur-ejb/SicliIntegracaoNegocio
15:08:30,325 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ImprimirCadatroBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/ImprimirCadatroBeanImpl!br.gov.caixa.sirur.bean.ImprimirCadatroBean
        java:app/sirur-ejb/ImprimirCadatroBeanImpl!br.gov.caixa.sirur.bean.ImprimirCadatroBean
        java:module/ImprimirCadatroBeanImpl!br.gov.caixa.sirur.bean.ImprimirCadatroBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/ImprimirCadatroBeanImpl
        java:app/sirur-ejb/ImprimirCadatroBeanImpl
15:08:30,325 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'InscricaoEstadualBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/InscricaoEstadualBeanImpl!br.gov.caixa.sirur.bean.InscricaoEstadualBean
        java:app/sirur-ejb/InscricaoEstadualBeanImpl!br.gov.caixa.sirur.bean.InscricaoEstadualBean
        java:module/InscricaoEstadualBeanImpl!br.gov.caixa.sirur.bean.InscricaoEstadualBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/InscricaoEstadualBeanImpl
        java:app/sirur-ejb/InscricaoEstadualBeanImpl
15:08:30,325 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'OportunidadeNegocioBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/OportunidadeNegocioBean!br.gov.caixa.sirur.bean.impl.oportunidadenegocio.OportunidadeNegocioBean
        java:app/sirur-ejb/OportunidadeNegocioBean!br.gov.caixa.sirur.bean.impl.oportunidadenegocio.OportunidadeNegocioBean
        java:module/OportunidadeNegocioBean!br.gov.caixa.sirur.bean.impl.oportunidadenegocio.OportunidadeNegocioBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/OportunidadeNegocioBean
        java:app/sirur-ejb/OportunidadeNegocioBean
15:08:30,325 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EmpresaBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/EmpresaBeanImpl!br.gov.caixa.sirur.bean.EmpresaBean
        java:app/sirur-ejb/EmpresaBeanImpl!br.gov.caixa.sirur.bean.EmpresaBean
        java:module/EmpresaBeanImpl!br.gov.caixa.sirur.bean.EmpresaBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/EmpresaBeanImpl
        java:app/sirur-ejb/EmpresaBeanImpl
15:08:30,325 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SiricBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/SiricBeanImpl!br.gov.caixa.sirur.bean.impl.SiricBeanImpl
        java:app/sirur-ejb/SiricBeanImpl!br.gov.caixa.sirur.bean.impl.SiricBeanImpl
        java:module/SiricBeanImpl!br.gov.caixa.sirur.bean.impl.SiricBeanImpl
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/SiricBeanImpl
        java:app/sirur-ejb/SiricBeanImpl
15:08:30,326 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ProdutorRuralEmpresaBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/ProdutorRuralEmpresaBeanImpl!br.gov.caixa.sirur.bean.ProdutorRuralEmpresaBean
        java:app/sirur-ejb/ProdutorRuralEmpresaBeanImpl!br.gov.caixa.sirur.bean.ProdutorRuralEmpresaBean
        java:module/ProdutorRuralEmpresaBeanImpl!br.gov.caixa.sirur.bean.ProdutorRuralEmpresaBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/ProdutorRuralEmpresaBeanImpl
        java:app/sirur-ejb/ProdutorRuralEmpresaBeanImpl
15:08:30,326 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SituacaoCadastroOrcamentoBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/SituacaoCadastroOrcamentoBean!br.gov.caixa.sirur.bean.impl.orcamento.SituacaoCadastroOrcamentoBean
        java:app/sirur-ejb/SituacaoCadastroOrcamentoBean!br.gov.caixa.sirur.bean.impl.orcamento.SituacaoCadastroOrcamentoBean
        java:module/SituacaoCadastroOrcamentoBean!br.gov.caixa.sirur.bean.impl.orcamento.SituacaoCadastroOrcamentoBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/SituacaoCadastroOrcamentoBean
        java:app/sirur-ejb/SituacaoCadastroOrcamentoBean
15:08:30,326 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'LocalidadeIntegracaoNegocio' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/LocalidadeIntegracaoNegocio!br.gov.caixa.sirur.integracao.rest.localidade.LocalidadeIntegracaoNegocio
        java:app/sirur-ejb/LocalidadeIntegracaoNegocio!br.gov.caixa.sirur.integracao.rest.localidade.LocalidadeIntegracaoNegocio
        java:module/LocalidadeIntegracaoNegocio!br.gov.caixa.sirur.integracao.rest.localidade.LocalidadeIntegracaoNegocio
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/LocalidadeIntegracaoNegocio
        java:app/sirur-ejb/LocalidadeIntegracaoNegocio
15:08:30,326 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ParecerTecnicoBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/ParecerTecnicoBean!br.gov.caixa.sirur.bean.impl.orcamento.ParecerTecnicoBean
        java:app/sirur-ejb/ParecerTecnicoBean!br.gov.caixa.sirur.bean.impl.orcamento.ParecerTecnicoBean
        java:module/ParecerTecnicoBean!br.gov.caixa.sirur.bean.impl.orcamento.ParecerTecnicoBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/ParecerTecnicoBean
        java:app/sirur-ejb/ParecerTecnicoBean
15:08:30,326 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SituacaoSolicitacaoBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/SituacaoSolicitacaoBeanImpl!br.gov.caixa.sirur.bean.SituacaoSolicitacaoBean
        java:app/sirur-ejb/SituacaoSolicitacaoBeanImpl!br.gov.caixa.sirur.bean.SituacaoSolicitacaoBean
        java:module/SituacaoSolicitacaoBeanImpl!br.gov.caixa.sirur.bean.SituacaoSolicitacaoBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/SituacaoSolicitacaoBeanImpl
        java:app/sirur-ejb/SituacaoSolicitacaoBeanImpl
15:08:30,326 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'PerfilProdutorBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/PerfilProdutorBeanImpl!br.gov.caixa.sirur.bean.PerfilProdutorBean
        java:app/sirur-ejb/PerfilProdutorBeanImpl!br.gov.caixa.sirur.bean.PerfilProdutorBean
        java:module/PerfilProdutorBeanImpl!br.gov.caixa.sirur.bean.PerfilProdutorBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/PerfilProdutorBeanImpl
        java:app/sirur-ejb/PerfilProdutorBeanImpl
15:08:30,326 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'IntegranteGrupoEconomicoBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/IntegranteGrupoEconomicoBeanImpl!br.gov.caixa.sirur.bean.IntegranteGrupoEconomicoBean
        java:app/sirur-ejb/IntegranteGrupoEconomicoBeanImpl!br.gov.caixa.sirur.bean.IntegranteGrupoEconomicoBean
        java:module/IntegranteGrupoEconomicoBeanImpl!br.gov.caixa.sirur.bean.IntegranteGrupoEconomicoBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/IntegranteGrupoEconomicoBeanImpl
        java:app/sirur-ejb/IntegranteGrupoEconomicoBeanImpl
15:08:30,326 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'InformeBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/InformeBeanImpl!br.gov.caixa.sirur.bean.InformeBean
        java:app/sirur-ejb/InformeBeanImpl!br.gov.caixa.sirur.bean.InformeBean
        java:module/InformeBeanImpl!br.gov.caixa.sirur.bean.InformeBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/InformeBeanImpl
        java:app/sirur-ejb/InformeBeanImpl
15:08:30,326 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'OrcamentoBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/OrcamentoBean!br.gov.caixa.sirur.bean.impl.orcamento.OrcamentoBean
        java:app/sirur-ejb/OrcamentoBean!br.gov.caixa.sirur.bean.impl.orcamento.OrcamentoBean
        java:module/OrcamentoBean!br.gov.caixa.sirur.bean.impl.orcamento.OrcamentoBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/OrcamentoBean
        java:app/sirur-ejb/OrcamentoBean
15:08:30,326 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EmpreendimentoBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/EmpreendimentoBean!br.gov.caixa.sirur.bean.impl.orcamento.EmpreendimentoBean
        java:app/sirur-ejb/EmpreendimentoBean!br.gov.caixa.sirur.bean.impl.orcamento.EmpreendimentoBean
        java:module/EmpreendimentoBean!br.gov.caixa.sirur.bean.impl.orcamento.EmpreendimentoBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/EmpreendimentoBean
        java:app/sirur-ejb/EmpreendimentoBean
15:08:30,326 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ImovelBeanV2Impl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/ImovelBeanV2Impl!br.gov.caixa.sirur.bean.impl.ImovelBeanV2Impl
        java:app/sirur-ejb/ImovelBeanV2Impl!br.gov.caixa.sirur.bean.impl.ImovelBeanV2Impl
        java:module/ImovelBeanV2Impl!br.gov.caixa.sirur.bean.impl.ImovelBeanV2Impl
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/ImovelBeanV2Impl
        java:app/sirur-ejb/ImovelBeanV2Impl
15:08:30,326 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ImovelBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/ImovelBeanImpl!br.gov.caixa.sirur.bean.ImovelBean
        java:app/sirur-ejb/ImovelBeanImpl!br.gov.caixa.sirur.bean.ImovelBean
        java:module/ImovelBeanImpl!br.gov.caixa.sirur.bean.ImovelBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/ImovelBeanImpl
        java:app/sirur-ejb/ImovelBeanImpl
15:08:30,326 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ProdutorRuralBeanV2' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/ProdutorRuralBeanV2!br.gov.caixa.sirur.bean.impl.ProdutorRuralBeanV2
        java:app/sirur-ejb/ProdutorRuralBeanV2!br.gov.caixa.sirur.bean.impl.ProdutorRuralBeanV2
        java:module/ProdutorRuralBeanV2!br.gov.caixa.sirur.bean.impl.ProdutorRuralBeanV2
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/ProdutorRuralBeanV2
        java:app/sirur-ejb/ProdutorRuralBeanV2
15:08:30,326 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TipoProdutorBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/TipoProdutorBeanImpl!br.gov.caixa.sirur.bean.TipoProdutorBean
        java:app/sirur-ejb/TipoProdutorBeanImpl!br.gov.caixa.sirur.bean.TipoProdutorBean
        java:module/TipoProdutorBeanImpl!br.gov.caixa.sirur.bean.TipoProdutorBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/TipoProdutorBeanImpl
        java:app/sirur-ejb/TipoProdutorBeanImpl
15:08:30,326 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EnquadramentoDapImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/EnquadramentoDapImpl!br.gov.caixa.sirur.bean.EnquadramentoDap
        java:app/sirur-ejb/EnquadramentoDapImpl!br.gov.caixa.sirur.bean.EnquadramentoDap
        java:module/EnquadramentoDapImpl!br.gov.caixa.sirur.bean.EnquadramentoDap
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/EnquadramentoDapImpl
        java:app/sirur-ejb/EnquadramentoDapImpl
15:08:30,326 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SiricServiceImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/SiricServiceImpl!br.gov.caixa.sirur.service.impl.SiricServiceImpl
        java:app/sirur-ejb/SiricServiceImpl!br.gov.caixa.sirur.service.impl.SiricServiceImpl
        java:module/SiricServiceImpl!br.gov.caixa.sirur.service.impl.SiricServiceImpl
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/SiricServiceImpl
        java:app/sirur-ejb/SiricServiceImpl
15:08:30,326 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SiricXMLIntegracaoNegocioImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/SiricXMLIntegracaoNegocioImpl!br.gov.caixa.sirur.integracao.mq.siric.impl.SiricXMLIntegracaoNegocioImpl
        java:app/sirur-ejb/SiricXMLIntegracaoNegocioImpl!br.gov.caixa.sirur.integracao.mq.siric.impl.SiricXMLIntegracaoNegocioImpl
        java:module/SiricXMLIntegracaoNegocioImpl!br.gov.caixa.sirur.integracao.mq.siric.impl.SiricXMLIntegracaoNegocioImpl
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/SiricXMLIntegracaoNegocioImpl
        java:app/sirur-ejb/SiricXMLIntegracaoNegocioImpl
15:08:30,326 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DomainBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/DomainBeanImpl!br.gov.caixa.sirur.bean.DomainBean
        java:app/sirur-ejb/DomainBeanImpl!br.gov.caixa.sirur.bean.DomainBean
        java:module/DomainBeanImpl!br.gov.caixa.sirur.bean.DomainBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/DomainBeanImpl
        java:app/sirur-ejb/DomainBeanImpl
15:08:30,326 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ImovelBeneficiadoBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/ImovelBeneficiadoBean!br.gov.caixa.sirur.bean.impl.orcamento.ImovelBeneficiadoBean
        java:app/sirur-ejb/ImovelBeneficiadoBean!br.gov.caixa.sirur.bean.impl.orcamento.ImovelBeneficiadoBean
        java:module/ImovelBeneficiadoBean!br.gov.caixa.sirur.bean.impl.orcamento.ImovelBeneficiadoBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/ImovelBeneficiadoBean
        java:app/sirur-ejb/ImovelBeneficiadoBean
15:08:30,326 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DadosMatriculaDtoProcessorV2' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/DadosMatriculaDtoProcessorV2!br.gov.caixa.sirur.processor.imovel.DadosMatriculaDtoProcessorV2
        java:app/sirur-ejb/DadosMatriculaDtoProcessorV2!br.gov.caixa.sirur.processor.imovel.DadosMatriculaDtoProcessorV2
        java:module/DadosMatriculaDtoProcessorV2!br.gov.caixa.sirur.processor.imovel.DadosMatriculaDtoProcessorV2
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/DadosMatriculaDtoProcessorV2
        java:app/sirur-ejb/DadosMatriculaDtoProcessorV2
15:08:30,326 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AnaliseDocumentacaoBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/AnaliseDocumentacaoBean!br.gov.caixa.sirur.bean.impl.orcamento.AnaliseDocumentacaoBean
        java:app/sirur-ejb/AnaliseDocumentacaoBean!br.gov.caixa.sirur.bean.impl.orcamento.AnaliseDocumentacaoBean
        java:module/AnaliseDocumentacaoBean!br.gov.caixa.sirur.bean.impl.orcamento.AnaliseDocumentacaoBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/AnaliseDocumentacaoBean
        java:app/sirur-ejb/AnaliseDocumentacaoBean
15:08:30,326 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AtividadePecuariaBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/AtividadePecuariaBeanImpl!br.gov.caixa.sirur.bean.AtividadePecuariaBean
        java:app/sirur-ejb/AtividadePecuariaBeanImpl!br.gov.caixa.sirur.bean.AtividadePecuariaBean
        java:module/AtividadePecuariaBeanImpl!br.gov.caixa.sirur.bean.AtividadePecuariaBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/AtividadePecuariaBeanImpl
        java:app/sirur-ejb/AtividadePecuariaBeanImpl
15:08:30,326 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'GlebasBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/GlebasBean!br.gov.caixa.sirur.bean.impl.orcamento.GlebasBean
        java:app/sirur-ejb/GlebasBean!br.gov.caixa.sirur.bean.impl.orcamento.GlebasBean
        java:module/GlebasBean!br.gov.caixa.sirur.bean.impl.orcamento.GlebasBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/GlebasBean
        java:app/sirur-ejb/GlebasBean
15:08:30,326 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AnaliseDocumentalAterBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/AnaliseDocumentalAterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.AnaliseDocumentalAterBean
        java:app/sirur-ejb/AnaliseDocumentalAterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.AnaliseDocumentalAterBean
        java:module/AnaliseDocumentalAterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.AnaliseDocumentalAterBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/AnaliseDocumentalAterBean
        java:app/sirur-ejb/AnaliseDocumentalAterBean
15:08:30,326 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AvaliacaoRiscoProdutorNegocio' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/AvaliacaoRiscoProdutorNegocio!br.gov.caixa.sirur.bean.impl.AvaliacaoRiscoProdutorNegocio
        java:app/sirur-ejb/AvaliacaoRiscoProdutorNegocio!br.gov.caixa.sirur.bean.impl.AvaliacaoRiscoProdutorNegocio
        java:module/AvaliacaoRiscoProdutorNegocio!br.gov.caixa.sirur.bean.impl.AvaliacaoRiscoProdutorNegocio
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/AvaliacaoRiscoProdutorNegocio
        java:app/sirur-ejb/AvaliacaoRiscoProdutorNegocio
15:08:30,326 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MatriculaPrincipalMunicipioProcessorV2' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/MatriculaPrincipalMunicipioProcessorV2!br.gov.caixa.sirur.processor.imovel.MatriculaPrincipalMunicipioProcessorV2
        java:app/sirur-ejb/MatriculaPrincipalMunicipioProcessorV2!br.gov.caixa.sirur.processor.imovel.MatriculaPrincipalMunicipioProcessorV2
        java:module/MatriculaPrincipalMunicipioProcessorV2!br.gov.caixa.sirur.processor.imovel.MatriculaPrincipalMunicipioProcessorV2
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/MatriculaPrincipalMunicipioProcessorV2
        java:app/sirur-ejb/MatriculaPrincipalMunicipioProcessorV2
15:08:30,327 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SicliXmlIntegracaoNegocio' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/SicliXmlIntegracaoNegocio!br.gov.caixa.sirur.integracao.mq.sicli.SicliXmlIntegracaoNegocio
        java:app/sirur-ejb/SicliXmlIntegracaoNegocio!br.gov.caixa.sirur.integracao.mq.sicli.SicliXmlIntegracaoNegocio
        java:module/SicliXmlIntegracaoNegocio!br.gov.caixa.sirur.integracao.mq.sicli.SicliXmlIntegracaoNegocio
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/SicliXmlIntegracaoNegocio
        java:app/sirur-ejb/SicliXmlIntegracaoNegocio
15:08:30,327 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DocumentacaoAterBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/DocumentacaoAterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.DocumentacaoAterBean
        java:app/sirur-ejb/DocumentacaoAterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.DocumentacaoAterBean
        java:module/DocumentacaoAterBean!br.gov.caixa.sirur.bean.impl.unificacaocadastroater.DocumentacaoAterBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/DocumentacaoAterBean
        java:app/sirur-ejb/DocumentacaoAterBean
15:08:30,327 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ConsultaAvaliacaoRiscoOperacao' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/ConsultaAvaliacaoRiscoOperacao!br.gov.caixa.sirur.integracao.mq.siric.operacao.ConsultaAvaliacaoRiscoOperacao
        java:app/sirur-ejb/ConsultaAvaliacaoRiscoOperacao!br.gov.caixa.sirur.integracao.mq.siric.operacao.ConsultaAvaliacaoRiscoOperacao
        java:module/ConsultaAvaliacaoRiscoOperacao!br.gov.caixa.sirur.integracao.mq.siric.operacao.ConsultaAvaliacaoRiscoOperacao
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/ConsultaAvaliacaoRiscoOperacao
        java:app/sirur-ejb/ConsultaAvaliacaoRiscoOperacao
15:08:30,327 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MtrIntegracaoNegocio' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/MtrIntegracaoNegocio!br.gov.caixa.sirur.integracao.rest.mtr.MtrIntegracaoNegocio
        java:app/sirur-ejb/MtrIntegracaoNegocio!br.gov.caixa.sirur.integracao.rest.mtr.MtrIntegracaoNegocio
        java:module/MtrIntegracaoNegocio!br.gov.caixa.sirur.integracao.rest.mtr.MtrIntegracaoNegocio
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/MtrIntegracaoNegocio
        java:app/sirur-ejb/MtrIntegracaoNegocio
15:08:30,327 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'UfSimulacaoBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/UfSimulacaoBean!br.gov.caixa.sirur.bean.impl.UfSimulacaoBean
        java:app/sirur-ejb/UfSimulacaoBean!br.gov.caixa.sirur.bean.impl.UfSimulacaoBean
        java:module/UfSimulacaoBean!br.gov.caixa.sirur.bean.impl.UfSimulacaoBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/UfSimulacaoBean
        java:app/sirur-ejb/UfSimulacaoBean
15:08:30,327 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DomainBeanV2' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/DomainBeanV2!br.gov.caixa.sirur.bean.impl.DomainBeanV2
        java:app/sirur-ejb/DomainBeanV2!br.gov.caixa.sirur.bean.impl.DomainBeanV2
        java:module/DomainBeanV2!br.gov.caixa.sirur.bean.impl.DomainBeanV2
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/DomainBeanV2
        java:app/sirur-ejb/DomainBeanV2
15:08:30,327 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SiicoIntegracaoNegocio' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/SiicoIntegracaoNegocio!br.gov.caixa.sirur.integracao.rest.siico.SiicoIntegracaoNegocio
        java:app/sirur-ejb/SiicoIntegracaoNegocio!br.gov.caixa.sirur.integracao.rest.siico.SiicoIntegracaoNegocio
        java:module/SiicoIntegracaoNegocio!br.gov.caixa.sirur.integracao.rest.siico.SiicoIntegracaoNegocio
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/SiicoIntegracaoNegocio
        java:app/sirur-ejb/SiicoIntegracaoNegocio
15:08:30,327 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'UnidadeServiceV2Impl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/UnidadeServiceV2Impl!br.gov.caixa.sirur.service.UnidadeServiceV2
        java:app/sirur-ejb/UnidadeServiceV2Impl!br.gov.caixa.sirur.service.UnidadeServiceV2
        java:module/UnidadeServiceV2Impl!br.gov.caixa.sirur.service.UnidadeServiceV2
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/UnidadeServiceV2Impl
        java:app/sirur-ejb/UnidadeServiceV2Impl
15:08:30,327 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DocumentoBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/DocumentoBeanImpl!br.gov.caixa.sirur.bean.DocumentoBean
        java:app/sirur-ejb/DocumentoBeanImpl!br.gov.caixa.sirur.bean.DocumentoBean
        java:module/DocumentoBeanImpl!br.gov.caixa.sirur.bean.DocumentoBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/DocumentoBeanImpl
        java:app/sirur-ejb/DocumentoBeanImpl
15:08:30,327 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'GrupoEconomicoBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/GrupoEconomicoBeanImpl!br.gov.caixa.sirur.bean.GrupoEconomicoBean
        java:app/sirur-ejb/GrupoEconomicoBeanImpl!br.gov.caixa.sirur.bean.GrupoEconomicoBean
        java:module/GrupoEconomicoBeanImpl!br.gov.caixa.sirur.bean.GrupoEconomicoBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/GrupoEconomicoBeanImpl
        java:app/sirur-ejb/GrupoEconomicoBeanImpl
15:08:30,327 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DossieOrcamentoBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/DossieOrcamentoBean!br.gov.caixa.sirur.integracao.rest.mtr.bean.DossieOrcamentoBean
        java:app/sirur-ejb/DossieOrcamentoBean!br.gov.caixa.sirur.integracao.rest.mtr.bean.DossieOrcamentoBean
        java:module/DossieOrcamentoBean!br.gov.caixa.sirur.integracao.rest.mtr.bean.DossieOrcamentoBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/DossieOrcamentoBean
        java:app/sirur-ejb/DossieOrcamentoBean
15:08:30,327 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DocumentoProdutoBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/DocumentoProdutoBean!br.gov.caixa.sirur.integracao.rest.mtr.bean.DocumentoProdutoBean
        java:app/sirur-ejb/DocumentoProdutoBean!br.gov.caixa.sirur.integracao.rest.mtr.bean.DocumentoProdutoBean
        java:module/DocumentoProdutoBean!br.gov.caixa.sirur.integracao.rest.mtr.bean.DocumentoProdutoBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/DocumentoProdutoBean
        java:app/sirur-ejb/DocumentoProdutoBean
15:08:30,327 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SituacaoOrcamentoBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/SituacaoOrcamentoBean!br.gov.caixa.sirur.bean.impl.orcamento.SituacaoOrcamentoBean
        java:app/sirur-ejb/SituacaoOrcamentoBean!br.gov.caixa.sirur.bean.impl.orcamento.SituacaoOrcamentoBean
        java:module/SituacaoOrcamentoBean!br.gov.caixa.sirur.bean.impl.orcamento.SituacaoOrcamentoBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/SituacaoOrcamentoBean
        java:app/sirur-ejb/SituacaoOrcamentoBean
15:08:30,327 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MatriculaBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/MatriculaBeanImpl!br.gov.caixa.sirur.bean.MatriculaBean
        java:app/sirur-ejb/MatriculaBeanImpl!br.gov.caixa.sirur.bean.MatriculaBean
        java:module/MatriculaBeanImpl!br.gov.caixa.sirur.bean.MatriculaBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/MatriculaBeanImpl
        java:app/sirur-ejb/MatriculaBeanImpl
15:08:30,327 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'CadastroProducaoRuralBeanImplV2' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/CadastroProducaoRuralBeanImplV2!br.gov.caixa.sirur.bean.impl.CadastroProducaoRuralBeanImplV2
        java:app/sirur-ejb/CadastroProducaoRuralBeanImplV2!br.gov.caixa.sirur.bean.impl.CadastroProducaoRuralBeanImplV2
        java:module/CadastroProducaoRuralBeanImplV2!br.gov.caixa.sirur.bean.impl.CadastroProducaoRuralBeanImplV2
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/CadastroProducaoRuralBeanImplV2
        java:app/sirur-ejb/CadastroProducaoRuralBeanImplV2
15:08:30,327 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'BeanAterTecnicoImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/BeanAterTecnicoImpl!br.gov.caixa.sirur.cadastro.BeanAterTecnico
        java:app/sirur-ejb/BeanAterTecnicoImpl!br.gov.caixa.sirur.cadastro.BeanAterTecnico
        java:module/BeanAterTecnicoImpl!br.gov.caixa.sirur.cadastro.BeanAterTecnico
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/BeanAterTecnicoImpl
        java:app/sirur-ejb/BeanAterTecnicoImpl
15:08:30,327 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SiempIntegracaoNegocio' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/SiempIntegracaoNegocio!br.gov.caixa.sirur.integracao.bd.siemp.SiempIntegracaoNegocio
        java:app/sirur-ejb/SiempIntegracaoNegocio!br.gov.caixa.sirur.integracao.bd.siemp.SiempIntegracaoNegocio
        java:module/SiempIntegracaoNegocio!br.gov.caixa.sirur.integracao.bd.siemp.SiempIntegracaoNegocio
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/SiempIntegracaoNegocio
        java:app/sirur-ejb/SiempIntegracaoNegocio
15:08:30,327 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MatriculaPrincipalMunicipioServiceImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/MatriculaPrincipalMunicipioServiceImpl!br.gov.caixa.sirur.service.MatriculaPrincipalMunicipioService
        java:app/sirur-ejb/MatriculaPrincipalMunicipioServiceImpl!br.gov.caixa.sirur.service.MatriculaPrincipalMunicipioService
        java:module/MatriculaPrincipalMunicipioServiceImpl!br.gov.caixa.sirur.service.MatriculaPrincipalMunicipioService
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/MatriculaPrincipalMunicipioServiceImpl
        java:app/sirur-ejb/MatriculaPrincipalMunicipioServiceImpl
15:08:30,327 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TecnicoBeanV2' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/TecnicoBeanV2!br.gov.caixa.sirur.bean.impl.TecnicoBeanV2
        java:app/sirur-ejb/TecnicoBeanV2!br.gov.caixa.sirur.bean.impl.TecnicoBeanV2
        java:module/TecnicoBeanV2!br.gov.caixa.sirur.bean.impl.TecnicoBeanV2
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/TecnicoBeanV2
        java:app/sirur-ejb/TecnicoBeanV2
15:08:30,327 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AtividadeBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/AtividadeBeanImpl!br.gov.caixa.sirur.bean.AtividadeBean
        java:app/sirur-ejb/AtividadeBeanImpl!br.gov.caixa.sirur.bean.AtividadeBean
        java:module/AtividadeBeanImpl!br.gov.caixa.sirur.bean.AtividadeBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/AtividadeBeanImpl
        java:app/sirur-ejb/AtividadeBeanImpl
15:08:30,327 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ExcluirDadosStepsPosImovelBeneficiadoBean' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/ExcluirDadosStepsPosImovelBeneficiadoBean!br.gov.caixa.sirur.bean.impl.orcamento.ExcluirDadosStepsPosImovelBeneficiadoBean
        java:app/sirur-ejb/ExcluirDadosStepsPosImovelBeneficiadoBean!br.gov.caixa.sirur.bean.impl.orcamento.ExcluirDadosStepsPosImovelBeneficiadoBean
        java:module/ExcluirDadosStepsPosImovelBeneficiadoBean!br.gov.caixa.sirur.bean.impl.orcamento.ExcluirDadosStepsPosImovelBeneficiadoBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/ExcluirDadosStepsPosImovelBeneficiadoBean
        java:app/sirur-ejb/ExcluirDadosStepsPosImovelBeneficiadoBean
15:08:30,327 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TecnicoConveniadoBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/TecnicoConveniadoBeanImpl!br.gov.caixa.sirur.bean.TecnicoConveniadoBean
        java:app/sirur-ejb/TecnicoConveniadoBeanImpl!br.gov.caixa.sirur.bean.TecnicoConveniadoBean
        java:module/TecnicoConveniadoBeanImpl!br.gov.caixa.sirur.bean.TecnicoConveniadoBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/TecnicoConveniadoBeanImpl
        java:app/sirur-ejb/TecnicoConveniadoBeanImpl
15:08:30,327 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AtividadePecuariaV2ServiceImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/AtividadePecuariaV2ServiceImpl!br.gov.caixa.sirur.service.AtividadePecuriariaV2Service
        java:app/sirur-ejb/AtividadePecuariaV2ServiceImpl!br.gov.caixa.sirur.service.AtividadePecuriariaV2Service
        java:module/AtividadePecuariaV2ServiceImpl!br.gov.caixa.sirur.service.AtividadePecuriariaV2Service
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/AtividadePecuariaV2ServiceImpl
        java:app/sirur-ejb/AtividadePecuariaV2ServiceImpl
15:08:30,327 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ProdutorRuralBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/ProdutorRuralBeanImpl!br.gov.caixa.sirur.bean.ProdutorRuralBean
        java:app/sirur-ejb/ProdutorRuralBeanImpl!br.gov.caixa.sirur.bean.ProdutorRuralBean
        java:module/ProdutorRuralBeanImpl!br.gov.caixa.sirur.bean.ProdutorRuralBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/ProdutorRuralBeanImpl
        java:app/sirur-ejb/ProdutorRuralBeanImpl
15:08:30,327 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AtividadeAgricolaServiceV2Impl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/AtividadeAgricolaServiceV2Impl!br.gov.caixa.sirur.service.AtividadeAgricolaServiceV2
        java:app/sirur-ejb/AtividadeAgricolaServiceV2Impl!br.gov.caixa.sirur.service.AtividadeAgricolaServiceV2
        java:module/AtividadeAgricolaServiceV2Impl!br.gov.caixa.sirur.service.AtividadeAgricolaServiceV2
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/AtividadeAgricolaServiceV2Impl
        java:app/sirur-ejb/AtividadeAgricolaServiceV2Impl
15:08:30,327 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DocumentoAterBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/DocumentoAterBeanImpl!br.gov.caixa.sirur.bean.DocumentoAterBean
        java:app/sirur-ejb/DocumentoAterBeanImpl!br.gov.caixa.sirur.bean.DocumentoAterBean
        java:module/DocumentoAterBeanImpl!br.gov.caixa.sirur.bean.DocumentoAterBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/DocumentoAterBeanImpl
        java:app/sirur-ejb/DocumentoAterBeanImpl
15:08:30,327 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ComunicadoBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/ComunicadoBeanImpl!br.gov.caixa.sirur.bean.ComunicadoBean
        java:app/sirur-ejb/ComunicadoBeanImpl!br.gov.caixa.sirur.bean.ComunicadoBean
        java:module/ComunicadoBeanImpl!br.gov.caixa.sirur.bean.ComunicadoBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/ComunicadoBeanImpl
        java:app/sirur-ejb/ComunicadoBeanImpl
15:08:30,328 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'BeanRiscoCreditoImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/BeanRiscoCreditoImpl!br.gov.caixa.sirur.base.BeanRiscoCredito
        java:app/sirur-ejb/BeanRiscoCreditoImpl!br.gov.caixa.sirur.base.BeanRiscoCredito
        java:module/BeanRiscoCreditoImpl!br.gov.caixa.sirur.base.BeanRiscoCredito
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/BeanRiscoCreditoImpl
        java:app/sirur-ejb/BeanRiscoCreditoImpl
15:08:30,328 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'UnidadeIntegracaoNegocio' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/UnidadeIntegracaoNegocio!br.gov.caixa.sirur.integracao.rest.unidade.UnidadeIntegracaoNegocio
        java:app/sirur-ejb/UnidadeIntegracaoNegocio!br.gov.caixa.sirur.integracao.rest.unidade.UnidadeIntegracaoNegocio
        java:module/UnidadeIntegracaoNegocio!br.gov.caixa.sirur.integracao.rest.unidade.UnidadeIntegracaoNegocio
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/UnidadeIntegracaoNegocio
        java:app/sirur-ejb/UnidadeIntegracaoNegocio
15:08:30,328 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AtividadeAgricolaBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/AtividadeAgricolaBeanImpl!br.gov.caixa.sirur.bean.AtividadeAgricolaBean
        java:app/sirur-ejb/AtividadeAgricolaBeanImpl!br.gov.caixa.sirur.bean.AtividadeAgricolaBean
        java:module/AtividadeAgricolaBeanImpl!br.gov.caixa.sirur.bean.AtividadeAgricolaBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/AtividadeAgricolaBeanImpl
        java:app/sirur-ejb/AtividadeAgricolaBeanImpl
15:08:30,328 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TecnicoConveniadoAssistenciaBeanImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/TecnicoConveniadoAssistenciaBeanImpl!br.gov.caixa.sirur.bean.TecnicoConveniadoAssistenciaBean
        java:app/sirur-ejb/TecnicoConveniadoAssistenciaBeanImpl!br.gov.caixa.sirur.bean.TecnicoConveniadoAssistenciaBean
        java:module/TecnicoConveniadoAssistenciaBeanImpl!br.gov.caixa.sirur.bean.TecnicoConveniadoAssistenciaBean
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/TecnicoConveniadoAssistenciaBeanImpl
        java:app/sirur-ejb/TecnicoConveniadoAssistenciaBeanImpl
15:08:30,328 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'BeanSirurImpl' na unidade de implementação 'subdeployment "sirur-ejb.jar" of deployment "sifec-sirur-3.55.51.02.ear"' são como segue:
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/BeanSirurImpl!br.gov.caixa.sirur.base.BeanSirur
        java:app/sirur-ejb/BeanSirurImpl!br.gov.caixa.sirur.base.BeanSirur
        java:module/BeanSirurImpl!br.gov.caixa.sirur.base.BeanSirur
        java:global/sifec-sirur-3.55.51.02/sirur-ejb/BeanSirurImpl
        java:app/sirur-ejb/BeanSirurImpl
15:08:30,339 INFO  [org.jipijapa] (MSC service thread 1-2) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-sirur-3.55.51.02.ear#SIEMP-PU
15:08:30,339 INFO  [org.jipijapa] (MSC service thread 1-2) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-sirur-3.55.51.02.ear#fecDS
15:08:30,383 WARN  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.sirur.ldap.ConexaoLDAP não devem ter um método final ou estático (getAtributosUsuarioPorLogin)
15:08:30,384 WARN  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.sirur.ldap.ConexaoLDAP não devem ter um método final ou estático (getAtributosUsuarioInternoPorLogin)
15:08:30,384 WARN  [org.jboss.as.ejb3] (MSC service thread 1-2) WFLYEJB0131: Jakarta Enterprise Beans br.gov.caixa.sirur.ldap.ConexaoLDAP não devem ter um método final ou estático (getAtributosUsuarioExternoPorLogin)
15:08:30,389 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 157) WFLYJPA0010: Iniciando unidade de persistência (fase 2 de 2) Serviço'sifec-sirur-3.55.51.02.ear#fecDS'
15:08:30,389 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 158) WFLYJPA0010: Iniciando unidade de persistência (fase 2 de 2) Serviço'sifec-sirur-3.55.51.02.ear#SIEMP-PU'
15:08:30,560 INFO  [org.jipijapa] (MSC service thread 1-2) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-sirur-3.55.51.02.ear/sirur-ejb.jar#fec.pu
15:08:30,560 INFO  [org.jipijapa] (MSC service thread 1-2) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-sirur-3.55.51.02.ear/sirur-ejb.jar#fec.rur.pu
15:08:30,616 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 158) WFLYJPA0010: Iniciando unidade de persistência (fase 2 de 2) Serviço'sifec-sirur-3.55.51.02.ear/sirur-ejb.jar#fec.rur.pu'
15:08:30,618 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 157) WFLYJPA0010: Iniciando unidade de persistência (fase 2 de 2) Serviço'sifec-sirur-3.55.51.02.ear/sirur-ejb.jar#fec.pu'
15:08:30,762 WARN  [org.hibernate.boot.internal.InFlightMetadataCollectorImpl] (ServerService Thread Pool -- 157) HHH000069: Duplicate generator name gen
15:08:30,762 WARN  [org.hibernate.boot.internal.InFlightMetadataCollectorImpl] (ServerService Thread Pool -- 158) HHH000069: Duplicate generator name gen
15:08:30,812 WARN  [org.hibernate.boot.internal.InFlightMetadataCollectorImpl] (ServerService Thread Pool -- 157) HHH000069: Duplicate generator name gen
15:08:30,836 WARN  [org.hibernate.boot.internal.InFlightMetadataCollectorImpl] (ServerService Thread Pool -- 158) HHH000069: Duplicate generator name gen
15:08:30,854 WARN  [org.hibernate.boot.internal.InFlightMetadataCollectorImpl] (ServerService Thread Pool -- 157) HHH000069: Duplicate generator name gen
15:08:30,857 WARN  [org.hibernate.boot.internal.InFlightMetadataCollectorImpl] (ServerService Thread Pool -- 158) HHH000069: Duplicate generator name gen
15:08:30,922 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.dominio.DominioPK
15:08:30,922 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.dominio.DominioPK
15:08:30,922 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.ater.EtapaCadastramentoAssistenciaPK
15:08:30,922 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.ater.EtapaCadastramentoAssistenciaPK
15:08:30,922 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.orcamento.UnidadeMedidaOrcamentoPK
15:08:30,922 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.orcamento.UnidadeMedidaOrcamentoPK
15:08:30,923 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.producaorural.EtapaCadastroProducaoRuralPK
15:08:30,923 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.producaorural.EtapaCadastroProducaoRuralPK
15:08:30,923 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.dominio.DominioPK
15:08:30,923 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.dominio.DominioPK
15:08:30,923 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.producaorural.imoveis.MatriculaPrincipalMunicipioPK
15:08:30,923 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.producaorural.imoveis.MatriculaPrincipalMunicipioPK
15:08:30,923 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.ater.EtapaCadastramentoAssistenciaPK
15:08:30,923 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.ater.EtapaCadastramentoAssistenciaPK
15:08:30,923 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.orcamento.ProducaoAgricola
15:08:30,923 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.orcamento.ProducaoAgricola
15:08:30,923 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.orcamento.UnidadeMedidaOrcamentoPK
15:08:30,923 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.orcamento.UnidadeMedidaOrcamentoPK
15:08:30,923 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.oportunidadenegocio.FaseOportunidadePK
15:08:30,923 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.oportunidadenegocio.FaseOportunidadePK
15:08:30,924 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.producaorural.EtapaCadastroProducaoRuralPK
15:08:30,924 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.producaorural.EtapaCadastroProducaoRuralPK
15:08:30,924 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.producaorural.imoveis.MatriculaPrincipalMunicipioPK
15:08:30,924 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.producaorural.imoveis.MatriculaPrincipalMunicipioPK
15:08:30,924 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.orcamento.ProducaoAgricola
15:08:30,924 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.orcamento.ProducaoAgricola
15:08:30,924 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.oportunidadenegocio.FaseOportunidadePK
15:08:30,924 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.producaorural.atividadeagricola.HistoricoProducaoAgricolaPK
15:08:30,924 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.producaorural.atividadeagricola.HistoricoProducaoAgricolaPK
15:08:30,924 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.oportunidadenegocio.FaseOportunidadePK
15:08:30,925 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.sifec.siico.persistence.entity.UnidadeCaixaPK
15:08:30,925 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.sifec.siico.persistence.entity.UnidadeCaixaPK
15:08:30,925 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.tecnicoconveniado.SolicitacaoCadastroTecnicoPK
15:08:30,925 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.tecnicoconveniado.SolicitacaoCadastroTecnicoPK
15:08:30,925 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.ater.ContaCreditoAssistencia
15:08:30,925 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.ater.ContaCreditoAssistencia
15:08:30,925 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.producaorural.atividadeagricola.HistoricoProducaoAgricolaPK
15:08:30,925 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.producaorural.atividadeagricola.HistoricoProducaoAgricolaPK
15:08:30,925 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.sifec.siico.persistence.entity.UnidadeCaixaPK
15:08:30,925 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.producaorural.atividadepecuaria.RebanhoPecuariaPK
15:08:30,926 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.sifec.siico.persistence.entity.UnidadeCaixaPK
15:08:30,926 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.producaorural.atividadepecuaria.RebanhoPecuariaPK
15:08:30,926 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.orcamento.FaseOrcamentoSolicitacaoPK
15:08:30,926 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.orcamento.FaseOrcamentoSolicitacaoPK
15:08:30,926 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.tecnicoconveniado.SolicitacaoCadastroTecnicoPK
15:08:30,926 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.tecnicoconveniado.SolicitacaoCadastroTecnicoPK
15:08:30,926 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.ater.ContaCreditoAssistencia
15:08:30,926 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.orcamento.EtapaCadastroOrcamentoPK
15:08:30,926 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.ater.ContaCreditoAssistencia
15:08:30,926 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.orcamento.EtapaCadastroOrcamentoPK
15:08:30,926 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.orcamento.ReceitaEstimada
15:08:30,926 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.orcamento.ReceitaEstimada
15:08:30,926 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.producaorural.atividadepecuaria.RebanhoPecuariaPK
15:08:30,927 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.producaorural.atividadepecuaria.RebanhoPecuariaPK
15:08:30,927 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.orcamento.ImovelBeneficiadoPK
15:08:30,927 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 157) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.orcamento.ImovelBeneficiadoPK
15:08:30,927 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.orcamento.FaseOrcamentoSolicitacaoPK
15:08:30,927 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.orcamento.FaseOrcamentoSolicitacaoPK
15:08:30,927 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.orcamento.EtapaCadastroOrcamentoPK
15:08:30,927 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.orcamento.EtapaCadastroOrcamentoPK
15:08:30,927 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.orcamento.ReceitaEstimada
15:08:30,927 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.orcamento.ReceitaEstimada
15:08:30,927 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sirur.persistence.entity.orcamento.ImovelBeneficiadoPK
15:08:30,927 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 158) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sirur.persistence.entity.orcamento.ImovelBeneficiadoPK
15:08:32,702 ERROR [org.hibernate.hql.spi.id.IdTableHelper] (ServerService Thread Pool -- 158) Unable to use JDBC Connection to create Statement: java.sql.SQLRecoverableException: Conexão Fechada
15:08:33,175 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-7) MSC000001: Failed to start service jboss.deployment.unit."sifec-sirur-3.55.51.02.ear".WeldStartService: org.jboss.msc.service.StartException in service jboss.deployment.unit."sifec-sirur-3.55.51.02.ear".WeldStartService: Failed to start service
Caused by: java.lang.IllegalArgumentException: WFLYWELD0037: Erro injetando unidade de persistência em Jakarta Contexts and Dependency Injection. Não é possível encontrar uma unidade de persistência chamada 'entityManagerFactory' na implantação sirur-ejb.jar para ponto de injeção private javax.persistence.EntityManager br.gov.caixa.sirur.persistence.repository.impl.GrupoEconomicoRepositoryImpl.entityManager
15:08:33,182 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 143) WFLYCTL0013: Falha na operação ("add") - endereço ([("deployment" => "SIRUR")]) - falha na descrição: {"WFLYCTL0080: Falha de serviços" => {"jboss.deployment.unit.\"sifec-sirur-3.55.51.02.ear\".WeldStartService" => "Failed to start service
    Caused by: java.lang.IllegalArgumentException: WFLYWELD0037: Erro injetando unidade de persistência em Jakarta Contexts and Dependency Injection. Não é possível encontrar uma unidade de persistência chamada 'entityManagerFactory' na implantação sirur-ejb.jar para ponto de injeção private javax.persistence.EntityManager br.gov.caixa.sirur.persistence.repository.impl.GrupoEconomicoRepositoryImpl.entityManager"}}
15:08:33,182 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 143) WFLYCTL0013: Falha na operação ("add") - endereço ([("deployment" => "SIRUR")]) - falha na descrição: {"WFLYCTL0080: Falha de serviços" => {"jboss.deployment.unit.\"sifec-sirur-3.55.51.02.ear\".WeldStartService" => "Failed to start service
    Caused by: java.lang.IllegalArgumentException: WFLYWELD0037: Erro injetando unidade de persistência em Jakarta Contexts and Dependency Injection. Não é possível encontrar uma unidade de persistência chamada 'entityManagerFactory' na implantação sirur-ejb.jar para ponto de injeção private javax.persistence.EntityManager br.gov.caixa.sirur.persistence.repository.impl.GrupoEconomicoRepositoryImpl.entityManager"}}
15:08:33,182 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 143) WFLYSRV0021: O procedimento da implantação "sifec-sirur-3.55.51.02.ear" foi revertido com mensagem de falha:
{"WFLYCTL0080: Falha de serviços" => {"jboss.deployment.unit.\"sifec-sirur-3.55.51.02.ear\".WeldStartService" => "Failed to start service
    Caused by: java.lang.IllegalArgumentException: WFLYWELD0037: Erro injetando unidade de persistência em Jakarta Contexts and Dependency Injection. Não é possível encontrar uma unidade de persistência chamada 'entityManagerFactory' na implantação sirur-ejb.jar para ponto de injeção private javax.persistence.EntityManager br.gov.caixa.sirur.persistence.repository.impl.GrupoEconomicoRepositoryImpl.entityManager"}}
15:08:33,183 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 158) WFLYJPA0011: Interrompendo unidade de persistência (fase 2 de 2) Serviço 'sifec-sirur-3.55.51.02.ear#SIEMP-PU'
15:08:33,183 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 153) WFLYJPA0011: Interrompendo unidade de persistência (fase 2 de 2) Serviço 'sifec-sirur-3.55.51.02.ear/sirur-ejb.jar#fec.pu'
15:08:33,183 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 155) WFLYJPA0011: Interrompendo unidade de persistência (fase 2 de 2) Serviço 'sifec-sirur-3.55.51.02.ear/sirur-ejb.jar#fec.rur.pu'
15:08:33,183 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 157) WFLYJPA0011: Interrompendo unidade de persistência (fase 2 de 2) Serviço 'sifec-sirur-3.55.51.02.ear#fecDS'
15:08:33,201 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 158) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'sifec-sirur-3.55.51.02.ear/sirur-ejb.jar#fec.rur.pu'
15:08:33,201 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 155) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'sifec-sirur-3.55.51.02.ear#SIEMP-PU'
15:08:33,201 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 157) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'sifec-sirur-3.55.51.02.ear/sirur-ejb.jar#fec.pu'
15:08:33,202 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 153) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'sifec-sirur-3.55.51.02.ear#fecDS'
15:08:33,234 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: sirur-ejb.jar) em 51ms
15:08:33,265 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: sirur-web.war) em 83ms
15:08:33,278 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0028: Implantação interrompida SIRUR (runtime-name: sifec-sirur-3.55.51.02.ear) em 95ms



[domain@localhost:9999 /]
[domain@localhost:9999 /] /server-group=sifec-intranet/deployment=SIRUR:add(enabled=true)
{
    "outcome" => "failed",
    "result" => undefined,
    "failure-description" => {"WFLYDC0074: Operation failed or was rolled back on all servers. Server failures:" => {"server-group" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-i
ntranet_node1_lx473" => {"WFLYCTL0080: Falha de serviços" => {"jboss.deployment.unit.\"sifec-sirur-3.55.51.02.ear\".WeldStartService" => "Failed to start service
    Caused by: java.lang.IllegalArgumentException: WFLYWELD0037: Erro injetando unidade de persistência em Jakarta Contexts and Dependency Injection. Não é possível encontrar uma unidade de persistên
cia chamada 'entityManagerFactory' na implantação sirur-ejb.jar para ponto de injeção private javax.persistence.EntityManager br.gov.caixa.sirur.persistence.repository.impl.GrupoEconomicoRepositoryIm
pl.entityManager"}}}}}}}},
    "rolled-back" => true,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "failed",
        "result" => undefined,
        "failure-description" => {"WFLYCTL0080: Falha de serviços" => {"jboss.deployment.unit.\"sifec-sirur-3.55.51.02.ear\".WeldStartService" => "Failed to start service
    Caused by: java.lang.IllegalArgumentException: WFLYWELD0037: Erro injetando unidade de persistência em Jakarta Contexts and Dependency Injection. Não é possível encontrar uma unidade de persistên
cia chamada 'entityManagerFactory' na implantação sirur-ejb.jar para ponto de injeção private javax.persistence.EntityManager br.gov.caixa.sirur.persistence.repository.impl.GrupoEconomicoRepositoryIm
pl.entityManager"}},
        "rolled-back" => true
    }}}}}}
}

[domain@localhost:9999 /]

