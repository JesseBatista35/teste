
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -iE --line-buffered "workflow-credito|WFLYSRV0010|WFLYSRV0021|QuerySyntax|FECMail|jaas-sifec|Registered web context"
15:34:18,317 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "ojdbc7-12.1.0.2.jar" foi implantado (runtime-name: "ojdbc7-12.1.0.2.jar")
15:34:18,317 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "ojdbc8-19.19.0.0.jar" foi implantado (runtime-name: "ojdbc8-19.19.0.0.jar")
15:34:18,317 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "wmq.jmsra.rar" foi implantado (runtime-name: "wmq.jmsra.rar")
15:34:18,317 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SICCR-BDCAIXA" foi implantado (runtime-name: "sifec-bdcaixa-2.0.1-b39.ear")
15:34:18,317 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SICCR-HUB-FRONTEND" foi implantado (runtime-name: "hub-web-1.4.0-b378.ear")
15:34:18,317 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SIFEC-MINUTAS-FRONT" foi implantado (runtime-name: "gerenciador-minutas-web-1.0.0-b14.ear")
15:34:18,317 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SQLSERVER-sqljdbc4.jar" foi implantado (runtime-name: "SQLSERVER-sqljdbc4.jar")
15:34:18,317 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0010: "SIFEC-CCR" foi implantado (runtime-name: "SIFEC-CCR-6.3.0-b4587.ear")
15:42:20,591 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "workflow-credito-pj-web.war")
15:42:20,591 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "workflow-credito-pj-ejb.jar")
15:42:21,423 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-7) WFLYSRV0018: A implantação "deployment.sifec-ccr-pj.ear.workflow-credito-pj-ejb.jar" está usando um módulo privado ("org.codehaus.jackson.jackson-mapper-asl") que pode ser alterado ou removido em versões futuras sem nenhum aviso.
15:42:21,463 INFO  [org.jipijapa] (MSC service thread 1-6) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-ccr-pj.ear/workflow-credito-pj-ejb.jar#fec.wpj.pu
15:42:21,626 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 93) WFLYJPA0010: Iniciando unidade de persistência (fase 1 de 2) Serviço'sifec-ccr-pj.ear/workflow-credito-pj-ejb.jar#fec.wpj.pu'
15:42:21,648 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-4) WFLYSRV0018: A implantação "deployment.sifec-ccr-pj.ear.workflow-credito-pj-web.war" está usando um módulo privado ("org.codehaus.jackson.jackson-mapper-asl") que pode ser alterado ou removido em versões futuras sem nenhum aviso.
15:42:21,714 INFO  [org.jboss.keycloak] (MSC service thread 1-1) Keycloak subsystem override for deployment workflow-credito-pj-web.war
15:42:21,714 INFO  [org.jboss.weld.deployer] (MSC service thread 1-1) WFLYWELD0003: Processando da implantação weld workflow-credito-pj-web.war
15:42:21,718 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-1) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SecurityKeycloakUtils' na unidade de implementação 'subdeployment "workflow-credito-pj-web.war" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-web/SecurityKeycloakUtils!br.gov.caixa.sifec.security.sso.utils.SecurityKeycloakUtils
        java:app/workflow-credito-pj-web/SecurityKeycloakUtils!br.gov.caixa.sifec.security.sso.utils.SecurityKeycloakUtils
        java:global/sifec-ccr-pj/workflow-credito-pj-web/SecurityKeycloakUtils
        java:app/workflow-credito-pj-web/SecurityKeycloakUtils
15:42:21,808 INFO  [org.jboss.weld.deployer] (MSC service thread 1-3) WFLYWELD0003: Processando da implantação weld workflow-credito-pj-ejb.jar
15:42:21,814 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MesaNegocioCorporativoEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/MesaNegocioCorporativoEJB!br.gov.caixa.wpj.negocio.mesanegociocorporativo.MesaNegocioCorporativoFacade
        java:app/workflow-credito-pj-ejb/MesaNegocioCorporativoEJB!br.gov.caixa.wpj.negocio.mesanegociocorporativo.MesaNegocioCorporativoFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/MesaNegocioCorporativoEJB
        java:app/workflow-credito-pj-ejb/MesaNegocioCorporativoEJB
15:42:21,815 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EnviarMovimentoCustomPropostaLiberacao' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/EnviarMovimentoCustomPropostaLiberacao!br.gov.caixa.wpj.negocio.bndes.executor.interfaces.EstrategiaRetorno
        java:app/workflow-credito-pj-ejb/EnviarMovimentoCustomPropostaLiberacao!br.gov.caixa.wpj.negocio.bndes.executor.interfaces.EstrategiaRetorno
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/EnviarMovimentoCustomPropostaLiberacao
        java:app/workflow-credito-pj-ejb/EnviarMovimentoCustomPropostaLiberacao
15:42:21,815 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'RelatorioReciprocidadeEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/RelatorioReciprocidadeEJB!br.gov.caixa.wpj.negocio.reciprocidade.relatorio.RelatorioReciprocidadeFacade
        java:app/workflow-credito-pj-ejb/RelatorioReciprocidadeEJB!br.gov.caixa.wpj.negocio.reciprocidade.relatorio.RelatorioReciprocidadeFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/RelatorioReciprocidadeEJB
        java:app/workflow-credito-pj-ejb/RelatorioReciprocidadeEJB
15:42:21,815 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AcessoEmpresaEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/AcessoEmpresaEJB!br.gov.caixa.wpj.negocio.acessoempresa.AcessoEmpresaFacade
        java:app/workflow-credito-pj-ejb/AcessoEmpresaEJB!br.gov.caixa.wpj.negocio.acessoempresa.AcessoEmpresaFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/AcessoEmpresaEJB
        java:app/workflow-credito-pj-ejb/AcessoEmpresaEJB
15:42:21,815 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SolicitacaoAnaliseTomadorEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/SolicitacaoAnaliseTomadorEJB!br.gov.caixa.wpj.negocio.tomador.SolicitacaoAnaliseTomadorFacade
        java:app/workflow-credito-pj-ejb/SolicitacaoAnaliseTomadorEJB!br.gov.caixa.wpj.negocio.tomador.SolicitacaoAnaliseTomadorFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/SolicitacaoAnaliseTomadorEJB
        java:app/workflow-credito-pj-ejb/SolicitacaoAnaliseTomadorEJB
15:42:21,815 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'FluxoCreditoEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/FluxoCreditoEJB!br.gov.caixa.wpj.negocio.fluxocredito.FluxoCreditoFacade
        java:app/workflow-credito-pj-ejb/FluxoCreditoEJB!br.gov.caixa.wpj.negocio.fluxocredito.FluxoCreditoFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/FluxoCreditoEJB
        java:app/workflow-credito-pj-ejb/FluxoCreditoEJB
15:42:21,815 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ItemInvestimentoEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ItemInvestimentoEJB!br.gov.caixa.wpj.negocio.iteminvestimento.ItemInvestimentoFacade
        java:app/workflow-credito-pj-ejb/ItemInvestimentoEJB!br.gov.caixa.wpj.negocio.iteminvestimento.ItemInvestimentoFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ItemInvestimentoEJB
        java:app/workflow-credito-pj-ejb/ItemInvestimentoEJB
15:42:21,815 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ManterDocumentoFacadeEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ManterDocumentoFacadeEJB!br.gov.caixa.wpj.negocio.manterdocumento.ManterDocumentoFacade
        java:app/workflow-credito-pj-ejb/ManterDocumentoFacadeEJB!br.gov.caixa.wpj.negocio.manterdocumento.ManterDocumentoFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ManterDocumentoFacadeEJB
        java:app/workflow-credito-pj-ejb/ManterDocumentoFacadeEJB
15:42:21,815 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'VinculoEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/VinculoEJB!br.gov.caixa.wpj.negocio.vinculo.VinculoFacade
        java:app/workflow-credito-pj-ejb/VinculoEJB!br.gov.caixa.wpj.negocio.vinculo.VinculoFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/VinculoEJB
        java:app/workflow-credito-pj-ejb/VinculoEJB
15:42:21,815 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'CustoFinanceiroBndesEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/CustoFinanceiroBndesEJB!br.gov.caixa.wpj.negocio.custofinanceirobndes.CustoFinanceiroBndesFacade
        java:app/workflow-credito-pj-ejb/CustoFinanceiroBndesEJB!br.gov.caixa.wpj.negocio.custofinanceirobndes.CustoFinanceiroBndesFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/CustoFinanceiroBndesEJB
        java:app/workflow-credito-pj-ejb/CustoFinanceiroBndesEJB
15:42:21,815 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'CeopaEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/CeopaEJB!br.gov.caixa.wpj.negocio.ceopa.CeopaFacade
        java:app/workflow-credito-pj-ejb/CeopaEJB!br.gov.caixa.wpj.negocio.ceopa.CeopaFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/CeopaEJB
        java:app/workflow-credito-pj-ejb/CeopaEJB
15:42:21,815 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'IndexadorContratualEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/IndexadorContratualEJB!br.gov.caixa.wpj.negocio.indexadorcontratual.IndexadorContratualFacade
        java:app/workflow-credito-pj-ejb/IndexadorContratualEJB!br.gov.caixa.wpj.negocio.indexadorcontratual.IndexadorContratualFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/IndexadorContratualEJB
        java:app/workflow-credito-pj-ejb/IndexadorContratualEJB
15:42:21,815 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TipoParametroBndesEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/TipoParametroBndesEJB!br.gov.caixa.wpj.negocio.tipoparametrobndes.TipoParametroBndesFacade
        java:app/workflow-credito-pj-ejb/TipoParametroBndesEJB!br.gov.caixa.wpj.negocio.tipoparametrobndes.TipoParametroBndesFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/TipoParametroBndesEJB
        java:app/workflow-credito-pj-ejb/TipoParametroBndesEJB
15:42:21,816 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EnviarMovimentoPropostaFinanciamentoEmAnalise' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/EnviarMovimentoPropostaFinanciamentoEmAnalise!br.gov.caixa.wpj.negocio.bndes.executor.interfaces.EstrategiaRetorno
        java:app/workflow-credito-pj-ejb/EnviarMovimentoPropostaFinanciamentoEmAnalise!br.gov.caixa.wpj.negocio.bndes.executor.interfaces.EstrategiaRetorno
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/EnviarMovimentoPropostaFinanciamentoEmAnalise
        java:app/workflow-credito-pj-ejb/EnviarMovimentoPropostaFinanciamentoEmAnalise
15:42:21,816 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SiricComponenteImpl' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/SiricComponenteImpl!br.gov.caixa.wpj.componente.siric.v1.impl.SiricComponente
        java:app/workflow-credito-pj-ejb/SiricComponenteImpl!br.gov.caixa.wpj.componente.siric.v1.impl.SiricComponente
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/SiricComponenteImpl
        java:app/workflow-credito-pj-ejb/SiricComponenteImpl
15:42:21,816 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'RetornoComando' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/RetornoComando!br.gov.caixa.wpj.negocio.bndes.executor.RetornoComando
        java:app/workflow-credito-pj-ejb/RetornoComando!br.gov.caixa.wpj.negocio.bndes.executor.RetornoComando
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/RetornoComando
        java:app/workflow-credito-pj-ejb/RetornoComando
15:42:21,816 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AnaliseEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/AnaliseEJB!br.gov.caixa.wpj.negocio.analise.AnaliseFacade
        java:app/workflow-credito-pj-ejb/AnaliseEJB!br.gov.caixa.wpj.negocio.analise.AnaliseFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/AnaliseEJB
        java:app/workflow-credito-pj-ejb/AnaliseEJB
15:42:21,816 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EngenhariaEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/EngenhariaEJB!br.gov.caixa.wpj.negocio.engenharia.EngenhariaFacade
        java:app/workflow-credito-pj-ejb/EngenhariaEJB!br.gov.caixa.wpj.negocio.engenharia.EngenhariaFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/EngenhariaEJB
        java:app/workflow-credito-pj-ejb/EngenhariaEJB
15:42:21,816 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DocumentoEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/DocumentoEJB!br.gov.caixa.wpj.negocio.documento.DocumentoFacade
        java:app/workflow-credito-pj-ejb/DocumentoEJB!br.gov.caixa.wpj.negocio.documento.DocumentoFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/DocumentoEJB
        java:app/workflow-credito-pj-ejb/DocumentoEJB
15:42:21,816 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'FiltroAvaliacaoEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/FiltroAvaliacaoEJB!br.gov.caixa.wpj.negocio.filtroavaliacao.FiltroAvaliacaoFacade
        java:app/workflow-credito-pj-ejb/FiltroAvaliacaoEJB!br.gov.caixa.wpj.negocio.filtroavaliacao.FiltroAvaliacaoFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/FiltroAvaliacaoEJB
        java:app/workflow-credito-pj-ejb/FiltroAvaliacaoEJB
15:42:21,816 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContratadoMovimentoPropostaLiberacao' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ContratadoMovimentoPropostaLiberacao!br.gov.caixa.wpj.negocio.bndes.executor.interfaces.EstrategiaRetorno
        java:app/workflow-credito-pj-ejb/ContratadoMovimentoPropostaLiberacao!br.gov.caixa.wpj.negocio.bndes.executor.interfaces.EstrategiaRetorno
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ContratadoMovimentoPropostaLiberacao
        java:app/workflow-credito-pj-ejb/ContratadoMovimentoPropostaLiberacao
15:42:21,816 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EnviarMovimentoPropostaFinanciamentoConcluida' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/EnviarMovimentoPropostaFinanciamentoConcluida!br.gov.caixa.wpj.negocio.bndes.executor.interfaces.EstrategiaRetorno
        java:app/workflow-credito-pj-ejb/EnviarMovimentoPropostaFinanciamentoConcluida!br.gov.caixa.wpj.negocio.bndes.executor.interfaces.EstrategiaRetorno
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/EnviarMovimentoPropostaFinanciamentoConcluida
        java:app/workflow-credito-pj-ejb/EnviarMovimentoPropostaFinanciamentoConcluida
15:42:21,816 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'BndesEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/BndesEJB!br.gov.caixa.wpj.negocio.bndes.BndesFacade
        java:app/workflow-credito-pj-ejb/BndesEJB!br.gov.caixa.wpj.negocio.bndes.BndesFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/BndesEJB
        java:app/workflow-credito-pj-ejb/BndesEJB
15:42:21,816 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ParametrosRotativosLcrEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ParametrosRotativosLcrEJB!br.gov.caixa.wpj.negocio.tarefa.parametrosrotativoslcr.ParametrosRotativosLcrFacade
        java:app/workflow-credito-pj-ejb/ParametrosRotativosLcrEJB!br.gov.caixa.wpj.negocio.tarefa.parametrosrotativoslcr.ParametrosRotativosLcrFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ParametrosRotativosLcrEJB
        java:app/workflow-credito-pj-ejb/ParametrosRotativosLcrEJB
15:42:21,816 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'OrigemRecursoEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/OrigemRecursoEJB!br.gov.caixa.wpj.negocio.origemrecurso.OrigemRecursoFacade
        java:app/workflow-credito-pj-ejb/OrigemRecursoEJB!br.gov.caixa.wpj.negocio.origemrecurso.OrigemRecursoFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/OrigemRecursoEJB
        java:app/workflow-credito-pj-ejb/OrigemRecursoEJB
15:42:21,816 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ParecerEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ParecerEJB!br.gov.caixa.wpj.negocio.parecer.ParecerFacade
        java:app/workflow-credito-pj-ejb/ParecerEJB!br.gov.caixa.wpj.negocio.parecer.ParecerFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ParecerEJB
        java:app/workflow-credito-pj-ejb/ParecerEJB
15:42:21,816 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'QuadroComunicacaoEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/QuadroComunicacaoEJB!br.gov.caixa.wpj.negocio.quadrocomunicacao.QuadroComunicacaoFacade
        java:app/workflow-credito-pj-ejb/QuadroComunicacaoEJB!br.gov.caixa.wpj.negocio.quadrocomunicacao.QuadroComunicacaoFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/QuadroComunicacaoEJB
        java:app/workflow-credito-pj-ejb/QuadroComunicacaoEJB
15:42:21,816 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EmpresaMgeEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/EmpresaMgeEJB!br.gov.caixa.wpj.negocio.empresamge.EmpresaMgeFacade
        java:app/workflow-credito-pj-ejb/EmpresaMgeEJB!br.gov.caixa.wpj.negocio.empresamge.EmpresaMgeFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/EmpresaMgeEJB
        java:app/workflow-credito-pj-ejb/EmpresaMgeEJB
15:42:21,817 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContratoEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ContratoEJB!br.gov.caixa.wpj.negocio.contrato.ContratoFacade
        java:app/workflow-credito-pj-ejb/ContratoEJB!br.gov.caixa.wpj.negocio.contrato.ContratoFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ContratoEJB
        java:app/workflow-credito-pj-ejb/ContratoEJB
15:42:21,817 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'RenegociacaoEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/RenegociacaoEJB!br.gov.caixa.wpj.negocio.renegociacao.RenegociacaoFacade
        java:app/workflow-credito-pj-ejb/RenegociacaoEJB!br.gov.caixa.wpj.negocio.renegociacao.RenegociacaoFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/RenegociacaoEJB
        java:app/workflow-credito-pj-ejb/RenegociacaoEJB
15:42:21,817 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AnalistaEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/AnalistaEJB!br.gov.caixa.wpj.negocio.analista.AnalistaFacade
        java:app/workflow-credito-pj-ejb/AnalistaEJB!br.gov.caixa.wpj.negocio.analista.AnalistaFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/AnalistaEJB
        java:app/workflow-credito-pj-ejb/AnalistaEJB
15:42:21,817 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EnviarMovimentoPropostaFinanciamentoRejeitada' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/EnviarMovimentoPropostaFinanciamentoRejeitada!br.gov.caixa.wpj.negocio.bndes.executor.interfaces.EstrategiaRetorno
        java:app/workflow-credito-pj-ejb/EnviarMovimentoPropostaFinanciamentoRejeitada!br.gov.caixa.wpj.negocio.bndes.executor.interfaces.EstrategiaRetorno
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/EnviarMovimentoPropostaFinanciamentoRejeitada
        java:app/workflow-credito-pj-ejb/EnviarMovimentoPropostaFinanciamentoRejeitada
15:42:21,817 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TarefaOperacaoEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/TarefaOperacaoEJB!br.gov.caixa.wpj.negocio.tarefa.TarefaOperacaoFacade
        java:app/workflow-credito-pj-ejb/TarefaOperacaoEJB!br.gov.caixa.wpj.negocio.tarefa.TarefaOperacaoFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/TarefaOperacaoEJB
        java:app/workflow-credito-pj-ejb/TarefaOperacaoEJB
15:42:21,817 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MotivoSituacaoDocumentoEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/MotivoSituacaoDocumentoEJB!br.gov.caixa.wpj.negocio.motivo.situacao.MotivoSituacaoDocumentoFacade
        java:app/workflow-credito-pj-ejb/MotivoSituacaoDocumentoEJB!br.gov.caixa.wpj.negocio.motivo.situacao.MotivoSituacaoDocumentoFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/MotivoSituacaoDocumentoEJB
        java:app/workflow-credito-pj-ejb/MotivoSituacaoDocumentoEJB
15:42:21,817 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AtividadeEconomicaEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/AtividadeEconomicaEJB!br.gov.caixa.wpj.negocio.atividadeeconomica.AtividadeEconomicaFacade
        java:app/workflow-credito-pj-ejb/AtividadeEconomicaEJB!br.gov.caixa.wpj.negocio.atividadeeconomica.AtividadeEconomicaFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/AtividadeEconomicaEJB
        java:app/workflow-credito-pj-ejb/AtividadeEconomicaEJB
15:42:21,817 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ConsultasqlEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ConsultasqlEJB!br.gov.caixa.wpj.negocio.consultasql.ConsultasqlFacade
        java:app/workflow-credito-pj-ejb/ConsultasqlEJB!br.gov.caixa.wpj.negocio.consultasql.ConsultasqlFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ConsultasqlEJB
        java:app/workflow-credito-pj-ejb/ConsultasqlEJB
15:42:21,817 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ConformidadeGarantiaGovEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ConformidadeGarantiaGovEJB!br.gov.caixa.wpj.negocio.conformidadegarantiagov.ConformidadeGarantiaGovFacade
        java:app/workflow-credito-pj-ejb/ConformidadeGarantiaGovEJB!br.gov.caixa.wpj.negocio.conformidadegarantiagov.ConformidadeGarantiaGovFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ConformidadeGarantiaGovEJB
        java:app/workflow-credito-pj-ejb/ConformidadeGarantiaGovEJB
15:42:21,817 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SicliComponenteImpl' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/SicliComponenteImpl!br.gov.caixa.wpj.componente.sicli.impl.SicliComponenteImpl
        java:app/workflow-credito-pj-ejb/SicliComponenteImpl!br.gov.caixa.wpj.componente.sicli.impl.SicliComponenteImpl
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/SicliComponenteImpl
        java:app/workflow-credito-pj-ejb/SicliComponenteImpl
15:42:21,817 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AmbientalEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/AmbientalEJB!br.gov.caixa.wpj.negocio.ambiental.AmbientalFacade
        java:app/workflow-credito-pj-ejb/AmbientalEJB!br.gov.caixa.wpj.negocio.ambiental.AmbientalFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/AmbientalEJB
        java:app/workflow-credito-pj-ejb/AmbientalEJB
15:42:21,817 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'QuestionarioEletronicoEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/QuestionarioEletronicoEJB!br.gov.caixa.wpj.negocio.questionarioeletronico.QuestionarioEletronicoFacade
        java:app/workflow-credito-pj-ejb/QuestionarioEletronicoEJB!br.gov.caixa.wpj.negocio.questionarioeletronico.QuestionarioEletronicoFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/QuestionarioEletronicoEJB
        java:app/workflow-credito-pj-ejb/QuestionarioEletronicoEJB
15:42:21,817 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EnviarMovimentoCustomPropostaContratacao' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/EnviarMovimentoCustomPropostaContratacao!br.gov.caixa.wpj.negocio.bndes.executor.interfaces.EstrategiaRetorno
        java:app/workflow-credito-pj-ejb/EnviarMovimentoCustomPropostaContratacao!br.gov.caixa.wpj.negocio.bndes.executor.interfaces.EstrategiaRetorno
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/EnviarMovimentoCustomPropostaContratacao
        java:app/workflow-credito-pj-ejb/EnviarMovimentoCustomPropostaContratacao
15:42:21,817 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AvaliacaoTomadorServico' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/AvaliacaoTomadorServico!br.gov.caixa.analise.tomador.servico.AnaliseTomadorFacade
        java:app/workflow-credito-pj-ejb/AvaliacaoTomadorServico!br.gov.caixa.analise.tomador.servico.AnaliseTomadorFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/AvaliacaoTomadorServico
        java:app/workflow-credito-pj-ejb/AvaliacaoTomadorServico
15:42:21,817 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SadipemEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/SadipemEJB!br.gov.caixa.wpj.negocio.sadipem.SadipemFacade
        java:app/workflow-credito-pj-ejb/SadipemEJB!br.gov.caixa.wpj.negocio.sadipem.SadipemFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/SadipemEJB
        java:app/workflow-credito-pj-ejb/SadipemEJB
15:42:21,817 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'RiscoCreditoEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/RiscoCreditoEJB!br.gov.caixa.wpj.negocio.riscocredito.RiscoCreditoFacade
        java:app/workflow-credito-pj-ejb/RiscoCreditoEJB!br.gov.caixa.wpj.negocio.riscocredito.RiscoCreditoFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/RiscoCreditoEJB
        java:app/workflow-credito-pj-ejb/RiscoCreditoEJB
15:42:21,818 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'CartaConsultaEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/CartaConsultaEJB!br.gov.caixa.wpj.negocio.cartaconsulta.CartaConsultaFacade
        java:app/workflow-credito-pj-ejb/CartaConsultaEJB!br.gov.caixa.wpj.negocio.cartaconsulta.CartaConsultaFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/CartaConsultaEJB
        java:app/workflow-credito-pj-ejb/CartaConsultaEJB
15:42:21,818 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'FavoritoEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/FavoritoEJB!br.gov.caixa.wpj.negocio.favorito.FavoritoFacade
        java:app/workflow-credito-pj-ejb/FavoritoEJB!br.gov.caixa.wpj.negocio.favorito.FavoritoFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/FavoritoEJB
        java:app/workflow-credito-pj-ejb/FavoritoEJB
15:42:21,818 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AnaliseOperacaoEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/AnaliseOperacaoEJB!br.gov.caixa.wpj.negocio.operacao.AnaliseOperacaoFacade
        java:app/workflow-credito-pj-ejb/AnaliseOperacaoEJB!br.gov.caixa.wpj.negocio.operacao.AnaliseOperacaoFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/AnaliseOperacaoEJB
        java:app/workflow-credito-pj-ejb/AnaliseOperacaoEJB
15:42:21,818 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ParametrosSimulacaoEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ParametrosSimulacaoEJB!br.gov.caixa.wpj.negocio.tarefa.parametrossimulacao.ParametrosSimulacaoFacade
        java:app/workflow-credito-pj-ejb/ParametrosSimulacaoEJB!br.gov.caixa.wpj.negocio.tarefa.parametrossimulacao.ParametrosSimulacaoFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ParametrosSimulacaoEJB
        java:app/workflow-credito-pj-ejb/ParametrosSimulacaoEJB
15:42:21,818 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EmproCxaEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/EmproCxaEJB!br.gov.caixa.wpj.negocio.emprocxa.EmproCxaFacade
        java:app/workflow-credito-pj-ejb/EmproCxaEJB!br.gov.caixa.wpj.negocio.emprocxa.EmproCxaFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/EmproCxaEJB
        java:app/workflow-credito-pj-ejb/EmproCxaEJB
15:42:21,818 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EnviarMovimentacaoPropostaLiberacaoAguardandoAnexos' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/EnviarMovimentacaoPropostaLiberacaoAguardandoAnexos!br.gov.caixa.wpj.negocio.bndes.executor.interfaces.EstrategiaRetorno
        java:app/workflow-credito-pj-ejb/EnviarMovimentacaoPropostaLiberacaoAguardandoAnexos!br.gov.caixa.wpj.negocio.bndes.executor.interfaces.EstrategiaRetorno
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/EnviarMovimentacaoPropostaLiberacaoAguardandoAnexos
        java:app/workflow-credito-pj-ejb/EnviarMovimentacaoPropostaLiberacaoAguardandoAnexos
15:42:21,818 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'FacilitadorRetornoIntegracaoEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/FacilitadorRetornoIntegracaoEJB!br.gov.caixa.wpj.componente.bndes.FacilitadorRetornoIntegracaoLocal
        java:app/workflow-credito-pj-ejb/FacilitadorRetornoIntegracaoEJB!br.gov.caixa.wpj.componente.bndes.FacilitadorRetornoIntegracaoLocal
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/FacilitadorRetornoIntegracaoEJB
        java:app/workflow-credito-pj-ejb/FacilitadorRetornoIntegracaoEJB
15:42:21,818 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'BacenEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/BacenEJB!br.gov.caixa.wpj.negocio.bacen.BacenFacade
        java:app/workflow-credito-pj-ejb/BacenEJB!br.gov.caixa.wpj.negocio.bacen.BacenFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/BacenEJB
        java:app/workflow-credito-pj-ejb/BacenEJB
15:42:21,818 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EnviarMovimentacaoPropostaLiberacaoRetorno' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/EnviarMovimentacaoPropostaLiberacaoRetorno!br.gov.caixa.wpj.negocio.bndes.executor.interfaces.EstrategiaRetorno
        java:app/workflow-credito-pj-ejb/EnviarMovimentacaoPropostaLiberacaoRetorno!br.gov.caixa.wpj.negocio.bndes.executor.interfaces.EstrategiaRetorno
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/EnviarMovimentacaoPropostaLiberacaoRetorno
        java:app/workflow-credito-pj-ejb/EnviarMovimentacaoPropostaLiberacaoRetorno
15:42:21,818 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ImpactoPatrimonioEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ImpactoPatrimonioEJB!br.gov.caixa.wpj.negocio.impactopatrimonio.ImpactoPatrimonioFacade
        java:app/workflow-credito-pj-ejb/ImpactoPatrimonioEJB!br.gov.caixa.wpj.negocio.impactopatrimonio.ImpactoPatrimonioFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ImpactoPatrimonioEJB
        java:app/workflow-credito-pj-ejb/ImpactoPatrimonioEJB
15:42:21,818 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'OperacoesConcluidasBndesEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/OperacoesConcluidasBndesEJB!br.gov.caixa.wpj.negocio.bndes.OperacoesConcluidasBndesFacade
        java:app/workflow-credito-pj-ejb/OperacoesConcluidasBndesEJB!br.gov.caixa.wpj.negocio.bndes.OperacoesConcluidasBndesFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/OperacoesConcluidasBndesEJB
        java:app/workflow-credito-pj-ejb/OperacoesConcluidasBndesEJB
15:42:21,818 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'NovidadeEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/NovidadeEJB!br.gov.caixa.wpj.negocio.novidade.NovidadeFacade
        java:app/workflow-credito-pj-ejb/NovidadeEJB!br.gov.caixa.wpj.negocio.novidade.NovidadeFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/NovidadeEJB
        java:app/workflow-credito-pj-ejb/NovidadeEJB
15:42:21,818 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'HistoricoAvaliacoesRiscoEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/HistoricoAvaliacoesRiscoEJB!br.gov.caixa.wpj.negocio.siric.HistoricoAvaliacoesRiscoEJB
        java:app/workflow-credito-pj-ejb/HistoricoAvaliacoesRiscoEJB!br.gov.caixa.wpj.negocio.siric.HistoricoAvaliacoesRiscoEJB
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/HistoricoAvaliacoesRiscoEJB
        java:app/workflow-credito-pj-ejb/HistoricoAvaliacoesRiscoEJB
15:42:21,818 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'FatorKEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/FatorKEJB!br.gov.caixa.wpj.negocio.fatork.FatorKFacade
        java:app/workflow-credito-pj-ejb/FatorKEJB!br.gov.caixa.wpj.negocio.fatork.FatorKFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/FatorKEJB
        java:app/workflow-credito-pj-ejb/FatorKEJB
15:42:21,818 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EnviarMovimentoPropostaFinanciamentoAprovada' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/EnviarMovimentoPropostaFinanciamentoAprovada!br.gov.caixa.wpj.negocio.bndes.executor.interfaces.EstrategiaRetorno
        java:app/workflow-credito-pj-ejb/EnviarMovimentoPropostaFinanciamentoAprovada!br.gov.caixa.wpj.negocio.bndes.executor.interfaces.EstrategiaRetorno
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/EnviarMovimentoPropostaFinanciamentoAprovada
        java:app/workflow-credito-pj-ejb/EnviarMovimentoPropostaFinanciamentoAprovada
15:42:21,819 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'OfertaCombinadaEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/OfertaCombinadaEJB!br.gov.caixa.wpj.negocio.ofertacombinada.OfertaCombinadaFacade
        java:app/workflow-credito-pj-ejb/OfertaCombinadaEJB!br.gov.caixa.wpj.negocio.ofertacombinada.OfertaCombinadaFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/OfertaCombinadaEJB
        java:app/workflow-credito-pj-ejb/OfertaCombinadaEJB
15:42:21,819 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'LicenciamentoAmbientalBndesEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/LicenciamentoAmbientalBndesEJB!br.gov.caixa.wpj.negocio.licenciamentoambientalbndes.LicenciamentoAmbientalBndesFacade
        java:app/workflow-credito-pj-ejb/LicenciamentoAmbientalBndesEJB!br.gov.caixa.wpj.negocio.licenciamentoambientalbndes.LicenciamentoAmbientalBndesFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/LicenciamentoAmbientalBndesEJB
        java:app/workflow-credito-pj-ejb/LicenciamentoAmbientalBndesEJB
15:42:21,819 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EnviarMovimentoPropostaContratacao' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/EnviarMovimentoPropostaContratacao!br.gov.caixa.wpj.negocio.bndes.executor.interfaces.EstrategiaRetorno
        java:app/workflow-credito-pj-ejb/EnviarMovimentoPropostaContratacao!br.gov.caixa.wpj.negocio.bndes.executor.interfaces.EstrategiaRetorno
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/EnviarMovimentoPropostaContratacao
        java:app/workflow-credito-pj-ejb/EnviarMovimentoPropostaContratacao
15:42:21,819 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'CategoriaAnaliseEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/CategoriaAnaliseEJB!br.gov.caixa.wpj.negocio.categoriaanalise.CategoriaAnaliseFacade
        java:app/workflow-credito-pj-ejb/CategoriaAnaliseEJB!br.gov.caixa.wpj.negocio.categoriaanalise.CategoriaAnaliseFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/CategoriaAnaliseEJB
        java:app/workflow-credito-pj-ejb/CategoriaAnaliseEJB
15:42:21,819 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AnalisesDiversasEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/AnalisesDiversasEJB!br.gov.caixa.wpj.negocio.analisesdiversas.AnalisesDiversasFacade
        java:app/workflow-credito-pj-ejb/AnalisesDiversasEJB!br.gov.caixa.wpj.negocio.analisesdiversas.AnalisesDiversasFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/AnalisesDiversasEJB
        java:app/workflow-credito-pj-ejb/AnalisesDiversasEJB
15:42:21,819 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ConglomeradoEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ConglomeradoEJB!br.gov.caixa.wpj.negocio.conglomerado.ConglomeradoFacade
        java:app/workflow-credito-pj-ejb/ConglomeradoEJB!br.gov.caixa.wpj.negocio.conglomerado.ConglomeradoFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ConglomeradoEJB
        java:app/workflow-credito-pj-ejb/ConglomeradoEJB
15:42:21,819 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SimtrCapturarAvaliacaoDocumento' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/SimtrCapturarAvaliacaoDocumento!br.gov.caixa.wpj.negocio.simtr.operacao.SimtrCapturarAvaliacaoDocumento
        java:app/workflow-credito-pj-ejb/SimtrCapturarAvaliacaoDocumento!br.gov.caixa.wpj.negocio.simtr.operacao.SimtrCapturarAvaliacaoDocumento
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/SimtrCapturarAvaliacaoDocumento
        java:app/workflow-credito-pj-ejb/SimtrCapturarAvaliacaoDocumento
15:42:21,819 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'CicobEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/CicobEJB!br.gov.caixa.wpj.negocio.cicob.CicobFacade
        java:app/workflow-credito-pj-ejb/CicobEJB!br.gov.caixa.wpj.negocio.cicob.CicobFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/CicobEJB
        java:app/workflow-credito-pj-ejb/CicobEJB
15:42:21,819 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TarefaCreditoEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/TarefaCreditoEJB!br.gov.caixa.wpj.negocio.tarefacredito.TarefaCreditoFacade
        java:app/workflow-credito-pj-ejb/TarefaCreditoEJB!br.gov.caixa.wpj.negocio.tarefacredito.TarefaCreditoFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/TarefaCreditoEJB
        java:app/workflow-credito-pj-ejb/TarefaCreditoEJB
15:42:21,819 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'CreditoRotativoEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/CreditoRotativoEJB!br.gov.caixa.wpj.negocio.creditorotativo.CreditoRotativoFacade
        java:app/workflow-credito-pj-ejb/CreditoRotativoEJB!br.gov.caixa.wpj.negocio.creditorotativo.CreditoRotativoFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/CreditoRotativoEJB
        java:app/workflow-credito-pj-ejb/CreditoRotativoEJB
15:42:21,819 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ClassificacaoGarantiaEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ClassificacaoGarantiaEJB!br.gov.caixa.wpj.negocio.classificacaogarantia.ClassificacaoGarantiaFacade
        java:app/workflow-credito-pj-ejb/ClassificacaoGarantiaEJB!br.gov.caixa.wpj.negocio.classificacaogarantia.ClassificacaoGarantiaFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ClassificacaoGarantiaEJB
        java:app/workflow-credito-pj-ejb/ClassificacaoGarantiaEJB
15:42:21,819 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ProdutoCfiBndesEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ProdutoCfiBndesEJB!br.gov.caixa.wpj.negocio.produtocfibndes.ProdutoCfiBndesFacade
        java:app/workflow-credito-pj-ejb/ProdutoCfiBndesEJB!br.gov.caixa.wpj.negocio.produtocfibndes.ProdutoCfiBndesFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ProdutoCfiBndesEJB
        java:app/workflow-credito-pj-ejb/ProdutoCfiBndesEJB
15:42:21,819 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SolicitacaoReciprocidadeEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/SolicitacaoReciprocidadeEJB!br.gov.caixa.wpj.negocio.solicitacaoreciprocidade.SolicitacaoReciprocidadeFacade
        java:app/workflow-credito-pj-ejb/SolicitacaoReciprocidadeEJB!br.gov.caixa.wpj.negocio.solicitacaoreciprocidade.SolicitacaoReciprocidadeFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/SolicitacaoReciprocidadeEJB
        java:app/workflow-credito-pj-ejb/SolicitacaoReciprocidadeEJB
15:42:21,819 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'UnidadeEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/UnidadeEJB!br.gov.caixa.wpj.negocio.unidade.UnidadeFacade
        java:app/workflow-credito-pj-ejb/UnidadeEJB!br.gov.caixa.wpj.negocio.unidade.UnidadeFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/UnidadeEJB
        java:app/workflow-credito-pj-ejb/UnidadeEJB
15:42:21,820 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ConcluidoMovimentoPropostaLiberacao' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ConcluidoMovimentoPropostaLiberacao!br.gov.caixa.wpj.negocio.bndes.executor.interfaces.EstrategiaRetorno
        java:app/workflow-credito-pj-ejb/ConcluidoMovimentoPropostaLiberacao!br.gov.caixa.wpj.negocio.bndes.executor.interfaces.EstrategiaRetorno
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ConcluidoMovimentoPropostaLiberacao
        java:app/workflow-credito-pj-ejb/ConcluidoMovimentoPropostaLiberacao
15:42:21,820 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'NaturezaJuridicaEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/NaturezaJuridicaEJB!br.gov.caixa.wpj.negocio.naturezajuridica.NaturezaJuridicaFacade
        java:app/workflow-credito-pj-ejb/NaturezaJuridicaEJB!br.gov.caixa.wpj.negocio.naturezajuridica.NaturezaJuridicaFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/NaturezaJuridicaEJB
        java:app/workflow-credito-pj-ejb/NaturezaJuridicaEJB
15:42:21,820 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ClienteEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ClienteEJB!br.gov.caixa.wpj.negocio.cliente.ClienteFacade
        java:app/workflow-credito-pj-ejb/ClienteEJB!br.gov.caixa.wpj.negocio.cliente.ClienteFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ClienteEJB
        java:app/workflow-credito-pj-ejb/ClienteEJB
15:42:21,820 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ParametrosBndesEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ParametrosBndesEJB!br.gov.caixa.wpj.negocio.parametrosbndes.ParametrosBndesFacade
        java:app/workflow-credito-pj-ejb/ParametrosBndesEJB!br.gov.caixa.wpj.negocio.parametrosbndes.ParametrosBndesFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ParametrosBndesEJB
        java:app/workflow-credito-pj-ejb/ParametrosBndesEJB
15:42:21,820 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TipoGarantiaEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/TipoGarantiaEJB!br.gov.caixa.wpj.negocio.tipogarantia.TipoGarantiaFacade
        java:app/workflow-credito-pj-ejb/TipoGarantiaEJB!br.gov.caixa.wpj.negocio.tipogarantia.TipoGarantiaFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/TipoGarantiaEJB
        java:app/workflow-credito-pj-ejb/TipoGarantiaEJB
15:42:21,820 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ItemInvestimentoBndesEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ItemInvestimentoBndesEJB!br.gov.caixa.wpj.negocio.iteminvestimentobndes.ItemInvestimentoBndesFacade
        java:app/workflow-credito-pj-ejb/ItemInvestimentoBndesEJB!br.gov.caixa.wpj.negocio.iteminvestimentobndes.ItemInvestimentoBndesFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ItemInvestimentoBndesEJB
        java:app/workflow-credito-pj-ejb/ItemInvestimentoBndesEJB
15:42:21,820 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'CheckListRiscoEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/CheckListRiscoEJB!br.gov.caixa.wpj.negocio.checklistrisco.CheckListRiscoFacade
        java:app/workflow-credito-pj-ejb/CheckListRiscoEJB!br.gov.caixa.wpj.negocio.checklistrisco.CheckListRiscoFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/CheckListRiscoEJB
        java:app/workflow-credito-pj-ejb/CheckListRiscoEJB
15:42:21,820 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'PropostaAnaliseEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/PropostaAnaliseEJB!br.gov.caixa.wpj.propostaanalise.PropostaAnaliseFacade
        java:app/workflow-credito-pj-ejb/PropostaAnaliseEJB!br.gov.caixa.wpj.propostaanalise.PropostaAnaliseFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/PropostaAnaliseEJB
        java:app/workflow-credito-pj-ejb/PropostaAnaliseEJB
15:42:21,820 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'OperacaoPrjPreEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/OperacaoPrjPreEJB!br.gov.caixa.wpj.negocio.operacaoPrjPre.OperacaoPrjPreFacade
        java:app/workflow-credito-pj-ejb/OperacaoPrjPreEJB!br.gov.caixa.wpj.negocio.operacaoPrjPre.OperacaoPrjPreFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/OperacaoPrjPreEJB
        java:app/workflow-credito-pj-ejb/OperacaoPrjPreEJB
15:42:21,820 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EnviarMovimentoPropostaFinanciamentoAguardandoAnexos' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/EnviarMovimentoPropostaFinanciamentoAguardandoAnexos!br.gov.caixa.wpj.negocio.bndes.executor.interfaces.EstrategiaRetorno
        java:app/workflow-credito-pj-ejb/EnviarMovimentoPropostaFinanciamentoAguardandoAnexos!br.gov.caixa.wpj.negocio.bndes.executor.interfaces.EstrategiaRetorno
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/EnviarMovimentoPropostaFinanciamentoAguardandoAnexos
        java:app/workflow-credito-pj-ejb/EnviarMovimentoPropostaFinanciamentoAguardandoAnexos
15:42:21,820 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'PesquisaCadastralEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/PesquisaCadastralEJB!br.gov.caixa.wpj.negocio.pesquisacadastral.PesquisaCadastralFacade
        java:app/workflow-credito-pj-ejb/PesquisaCadastralEJB!br.gov.caixa.wpj.negocio.pesquisacadastral.PesquisaCadastralFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/PesquisaCadastralEJB
        java:app/workflow-credito-pj-ejb/PesquisaCadastralEJB
15:42:21,820 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TipoSolicitacaoEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/TipoSolicitacaoEJB!br.gov.caixa.wpj.negocio.tiposolicitacao.TipoSolicitacaoFacade
        java:app/workflow-credito-pj-ejb/TipoSolicitacaoEJB!br.gov.caixa.wpj.negocio.tiposolicitacao.TipoSolicitacaoFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/TipoSolicitacaoEJB
        java:app/workflow-credito-pj-ejb/TipoSolicitacaoEJB
15:42:21,820 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'PosicaoDividaEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/PosicaoDividaEJB!br.gov.caixa.wpj.negocio.posicaodivida.PosicaoDividaFacade
        java:app/workflow-credito-pj-ejb/PosicaoDividaEJB!br.gov.caixa.wpj.negocio.posicaodivida.PosicaoDividaFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/PosicaoDividaEJB
        java:app/workflow-credito-pj-ejb/PosicaoDividaEJB
15:42:21,820 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ClienteServico' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ClienteServico!br.gov.caixa.cliente.servico.ClienteFacade
        java:app/workflow-credito-pj-ejb/ClienteServico!br.gov.caixa.cliente.servico.ClienteFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ClienteServico
        java:app/workflow-credito-pj-ejb/ClienteServico
15:42:21,821 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SimuladorEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/SimuladorEJB!br.gov.caixa.wpj.negocio.simulador.SimuladorFacade
        java:app/workflow-credito-pj-ejb/SimuladorEJB!br.gov.caixa.wpj.negocio.simulador.SimuladorFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/SimuladorEJB
        java:app/workflow-credito-pj-ejb/SimuladorEJB
15:42:21,821 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'NotaFiscalBndesEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/NotaFiscalBndesEJB!br.gov.caixa.wpj.negocio.notafiscalbndes.NotaFiscalBndesFacade
        java:app/workflow-credito-pj-ejb/NotaFiscalBndesEJB!br.gov.caixa.wpj.negocio.notafiscalbndes.NotaFiscalBndesFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/NotaFiscalBndesEJB
        java:app/workflow-credito-pj-ejb/NotaFiscalBndesEJB
15:42:21,821 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EnviarMovimentoPropostaFinanciamentoProcessamento' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/EnviarMovimentoPropostaFinanciamentoProcessamento!br.gov.caixa.wpj.negocio.bndes.executor.interfaces.EstrategiaRetorno
        java:app/workflow-credito-pj-ejb/EnviarMovimentoPropostaFinanciamentoProcessamento!br.gov.caixa.wpj.negocio.bndes.executor.interfaces.EstrategiaRetorno
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/EnviarMovimentoPropostaFinanciamentoProcessamento
        java:app/workflow-credito-pj-ejb/EnviarMovimentoPropostaFinanciamentoProcessamento
15:42:21,821 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TipoTarifaEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/TipoTarifaEJB!br.gov.caixa.wpj.negocio.tipotarifa.TipoTarifaFacade
        java:app/workflow-credito-pj-ejb/TipoTarifaEJB!br.gov.caixa.wpj.negocio.tipotarifa.TipoTarifaFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/TipoTarifaEJB
        java:app/workflow-credito-pj-ejb/TipoTarifaEJB
15:42:21,821 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'CheckListEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/CheckListEJB!br.gov.caixa.wpj.negocio.checklist.CheckListFacade
        java:app/workflow-credito-pj-ejb/CheckListEJB!br.gov.caixa.wpj.negocio.checklist.CheckListFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/CheckListEJB
        java:app/workflow-credito-pj-ejb/CheckListEJB
15:42:21,821 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SegmentoNegocioEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/SegmentoNegocioEJB!br.gov.caixa.wpj.negocio.segmentonegocio.SegmentoNegocioFacade
        java:app/workflow-credito-pj-ejb/SegmentoNegocioEJB!br.gov.caixa.wpj.negocio.segmentonegocio.SegmentoNegocioFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/SegmentoNegocioEJB
        java:app/workflow-credito-pj-ejb/SegmentoNegocioEJB
15:42:21,821 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'WorkflowOperacaoEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/WorkflowOperacaoEJB!br.gov.caixa.wpj.negocio.workflowoperacao.WorkflowOperacaoFacade
        java:app/workflow-credito-pj-ejb/WorkflowOperacaoEJB!br.gov.caixa.wpj.negocio.workflowoperacao.WorkflowOperacaoFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/WorkflowOperacaoEJB
        java:app/workflow-credito-pj-ejb/WorkflowOperacaoEJB
15:42:21,821 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContratoPjEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ContratoPjEJB!br.gov.caixa.wpj.negocio.contratopj.ContratoPjFacade
        java:app/workflow-credito-pj-ejb/ContratoPjEJB!br.gov.caixa.wpj.negocio.contratopj.ContratoPjFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ContratoPjEJB
        java:app/workflow-credito-pj-ejb/ContratoPjEJB
15:42:21,821 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TipoPropostaEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/TipoPropostaEJB!br.gov.caixa.wpj.negocio.tipoproposta.TipoPropostaFacade
        java:app/workflow-credito-pj-ejb/TipoPropostaEJB!br.gov.caixa.wpj.negocio.tipoproposta.TipoPropostaFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/TipoPropostaEJB
        java:app/workflow-credito-pj-ejb/TipoPropostaEJB
15:42:21,821 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MunicipioIbgeEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/MunicipioIbgeEJB!br.gov.caixa.wpj.negocio.bndes.MunicipioIbgeFacade
        java:app/workflow-credito-pj-ejb/MunicipioIbgeEJB!br.gov.caixa.wpj.negocio.bndes.MunicipioIbgeFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/MunicipioIbgeEJB
        java:app/workflow-credito-pj-ejb/MunicipioIbgeEJB
15:42:21,821 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'RenopEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/RenopEJB!br.gov.caixa.wpj.negocio.renop.RenopFacade
        java:app/workflow-credito-pj-ejb/RenopEJB!br.gov.caixa.wpj.negocio.renop.RenopFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/RenopEJB
        java:app/workflow-credito-pj-ejb/RenopEJB
15:42:21,821 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SolicitacaoAnaliseSiricEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/SolicitacaoAnaliseSiricEJB!br.gov.caixa.wpj.negocio.siric.SolicitacaoAnaliseSiricFacede
        java:app/workflow-credito-pj-ejb/SolicitacaoAnaliseSiricEJB!br.gov.caixa.wpj.negocio.siric.SolicitacaoAnaliseSiricFacede
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/SolicitacaoAnaliseSiricEJB
        java:app/workflow-credito-pj-ejb/SolicitacaoAnaliseSiricEJB
15:42:21,821 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'PainelConclusaoEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/PainelConclusaoEJB!br.gov.caixa.wpj.negocio.painelconclusao.PainelConclusaoFacade
        java:app/workflow-credito-pj-ejb/PainelConclusaoEJB!br.gov.caixa.wpj.negocio.painelconclusao.PainelConclusaoFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/PainelConclusaoEJB
        java:app/workflow-credito-pj-ejb/PainelConclusaoEJB
15:42:21,821 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ConformidadeAtacadoEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ConformidadeAtacadoEJB!br.gov.caixa.wpj.negocio.conformidadeatacado.ConformidadeAtacadoFacade
        java:app/workflow-credito-pj-ejb/ConformidadeAtacadoEJB!br.gov.caixa.wpj.negocio.conformidadeatacado.ConformidadeAtacadoFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ConformidadeAtacadoEJB
        java:app/workflow-credito-pj-ejb/ConformidadeAtacadoEJB
15:42:21,821 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'FeriadoEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/FeriadoEJB!br.gov.caixa.wpj.negocio.feriado.FeriadoFacade
        java:app/workflow-credito-pj-ejb/FeriadoEJB!br.gov.caixa.wpj.negocio.feriado.FeriadoFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/FeriadoEJB
        java:app/workflow-credito-pj-ejb/FeriadoEJB
15:42:21,821 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ConectorCdtEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ConectorCdtEJB!br.gov.caixa.wpj.negocio.cdt.ConectorCdtFacade
        java:app/workflow-credito-pj-ejb/ConectorCdtEJB!br.gov.caixa.wpj.negocio.cdt.ConectorCdtFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ConectorCdtEJB
        java:app/workflow-credito-pj-ejb/ConectorCdtEJB
15:42:21,821 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'PeriodicidadeEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/PeriodicidadeEJB!br.gov.caixa.wpj.negocio.periodicidade.PeriodicidadeFacade
        java:app/workflow-credito-pj-ejb/PeriodicidadeEJB!br.gov.caixa.wpj.negocio.periodicidade.PeriodicidadeFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/PeriodicidadeEJB
        java:app/workflow-credito-pj-ejb/PeriodicidadeEJB
15:42:21,821 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'CerisEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/CerisEJB!br.gov.caixa.wpj.negocio.ceris.CerisFacade
        java:app/workflow-credito-pj-ejb/CerisEJB!br.gov.caixa.wpj.negocio.ceris.CerisFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/CerisEJB
        java:app/workflow-credito-pj-ejb/CerisEJB
15:42:21,822 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MovimentacaoPropostaExecutor' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/MovimentacaoPropostaExecutor!br.gov.caixa.wpj.negocio.bndes.executor.interfaces.Executor
        java:app/workflow-credito-pj-ejb/MovimentacaoPropostaExecutor!br.gov.caixa.wpj.negocio.bndes.executor.interfaces.Executor
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/MovimentacaoPropostaExecutor
        java:app/workflow-credito-pj-ejb/MovimentacaoPropostaExecutor
15:42:21,822 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EsteiraDigitalEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/EsteiraDigitalEJB!br.gov.caixa.wpj.negocio.esteiradigital.EsteiraDigitalFacade
        java:app/workflow-credito-pj-ejb/EsteiraDigitalEJB!br.gov.caixa.wpj.negocio.esteiradigital.EsteiraDigitalFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/EsteiraDigitalEJB
        java:app/workflow-credito-pj-ejb/EsteiraDigitalEJB
15:42:21,822 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ResumoOperacaoEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ResumoOperacaoEJB!br.gov.caixa.wpj.negocio.resumooperacao.ResumoOperacaoFacade
        java:app/workflow-credito-pj-ejb/ResumoOperacaoEJB!br.gov.caixa.wpj.negocio.resumooperacao.ResumoOperacaoFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ResumoOperacaoEJB
        java:app/workflow-credito-pj-ejb/ResumoOperacaoEJB
15:42:21,822 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'HistoricoAvaliacaoSicliEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/HistoricoAvaliacaoSicliEJB!br.gov.caixa.wpj.negocio.sicli.HistoricoAvaliacaoSicliEJB
        java:app/workflow-credito-pj-ejb/HistoricoAvaliacaoSicliEJB!br.gov.caixa.wpj.negocio.sicli.HistoricoAvaliacaoSicliEJB
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/HistoricoAvaliacaoSicliEJB
        java:app/workflow-credito-pj-ejb/HistoricoAvaliacaoSicliEJB
15:42:21,822 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-3) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ProdutoEJB' na unidade de implementação 'subdeployment "workflow-credito-pj-ejb.jar" of deployment "sifec-ccr-pj.ear"' são como segue:
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ProdutoEJB!br.gov.caixa.wpj.negocio.produto.ProdutoFacade
        java:app/workflow-credito-pj-ejb/ProdutoEJB!br.gov.caixa.wpj.negocio.produto.ProdutoFacade
        java:global/sifec-ccr-pj/workflow-credito-pj-ejb/ProdutoEJB
        java:app/workflow-credito-pj-ejb/ProdutoEJB
15:42:21,877 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0018: Serviço de driver iniciado com nome-do-driver = workflow-credito-pj-web.war_org.h2.Driver_1_4
15:42:21,995 INFO  [org.jipijapa] (MSC service thread 1-2) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-ccr-pj.ear/workflow-credito-pj-ejb.jar#fec.wpj.pu
15:42:22,282 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 93) WFLYJPA0010: Iniciando unidade de persistência (fase 2 de 2) Serviço'sifec-ccr-pj.ear/workflow-credito-pj-ejb.jar#fec.wpj.pu'
    "WFLYCTL0412: Serviços necessários que não estão instalados:" => ["jboss.security.security-domain.java:/jaas/jaas-sifec"],
    "WFLYCTL0180: Os serviços com falta/indisponibilidade de dependências " => ["jboss.deployment.subunit.\"sifec-ccr-pj.ear\".\"workflow-credito-pj-web.war\".component.SecurityKeycloakUtils.CREATE faltam [jboss.security.security-domain.java:/jaas/jaas-sifec]"]
    "WFLYCTL0412: Serviços necessários que não estão instalados:" => ["jboss.security.security-domain.java:/jaas/jaas-sifec"],
    "WFLYCTL0180: Os serviços com falta/indisponibilidade de dependências " => ["jboss.deployment.subunit.\"sifec-ccr-pj.ear\".\"workflow-credito-pj-web.war\".component.SecurityKeycloakUtils.CREATE faltam [jboss.security.security-domain.java:/jaas/jaas-sifec]"]
15:42:23,145 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 93) WFLYJPA0011: Interrompendo unidade de persistência (fase 2 de 2) Serviço 'sifec-ccr-pj.ear/workflow-credito-pj-ejb.jar#fec.wpj.pu'
15:42:23,147 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 32) WFLYSRV0021: O procedimento da implantação "sifec-ccr-pj.ear" foi revertido com mensagem de falha:
    "WFLYCTL0412: Serviços necessários que não estão instalados:" => ["jboss.security.security-domain.java:/jaas/jaas-sifec"],
    "WFLYCTL0180: Os serviços com falta/indisponibilidade de dependências " => ["jboss.deployment.subunit.\"sifec-ccr-pj.ear\".\"workflow-credito-pj-web.war\".component.SecurityKeycloakUtils.CREATE faltam [jboss.security.security-domain.java:/jaas/jaas-sifec]"]
15:42:23,148 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-8) WFLYJCA0019: Serviço de driver interrompido com nome-do-driver = workflow-credito-pj-web.war_org.h2.Driver_1_4
15:42:23,168 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 93) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'sifec-ccr-pj.ear/workflow-credito-pj-ejb.jar#fec.wpj.pu'
15:42:23,189 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: workflow-credito-pj-ejb.jar) em 43ms
15:42:23,210 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: workflow-credito-pj-web.war) em 64ms

