[root@cbrdeapllx473 p585600]#
[root@cbrdeapllx473 p585600]#
[root@cbrdeapllx473 p585600]# LOG=/opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log
[root@cbrdeapllx473 p585600]#
[root@cbrdeapllx473 p585600]#
[root@cbrdeapllx473 p585600]# tail -f $LOG | grep -aiE "bndes|WFLYSRV00(10|21)|WFLYCTL0013|WFLYCTL0412|WELD-0014|ERROR|Contexto web registrado"
16:13:16,332 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0027: Iniciando a implantação do "SIFEC-BNDES-ONLINE" (runtime-name: "sifec-bndes-1.1.0-b8.ear")
16:13:16,788 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "bndes-web.war")
16:13:16,788 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "bndes-ejb.jar")
16:13:16,858 WARN  [org.jboss.weld.deployer] (MSC service thread 1-3) WFLYWELD0012: Aviso ao pesquisar vfs:/content/sifec-bndes-1.1.0-b8.ear/bndes-ejb.jar/META-INF/beans.xml:11 cvc-complex-type.2.3: Element 'alternatives' cannot have character [children], because the type's content type is element-only.
16:13:16,859 INFO  [org.jboss.as.jpa] (MSC service thread 1-3) WFLYJPA0002: Ler persistence.xml para SIFEC-BNDES-PU
16:13:16,859 INFO  [org.jboss.as.jpa] (MSC service thread 1-3) WFLYJPA0002: Ler persistence.xml para SIFEC-BNDES-PU-FBN
16:13:16,889 INFO  [org.jipijapa] (MSC service thread 1-4) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-bndes-1.1.0-b8.ear#fecDS
16:13:16,889 INFO  [org.jipijapa] (MSC service thread 1-4) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-bndes-1.1.0-b8.ear#SIEMP-PU
16:13:16,890 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 128) WFLYJPA0010: Iniciando unidade de persistência (fase 1 de 2) Serviço'sifec-bndes-1.1.0-b8.ear#fecDS'
16:13:16,890 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 135) WFLYJPA0010: Iniciando unidade de persistência (fase 1 de 2) Serviço'sifec-bndes-1.1.0-b8.ear#SIEMP-PU'
16:13:16,891 INFO  [org.jipijapa] (MSC service thread 1-3) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-bndes-1.1.0-b8.ear/bndes-ejb.jar#SIFEC-BNDES-PU-FBN
16:13:16,891 INFO  [org.jipijapa] (MSC service thread 1-3) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-bndes-1.1.0-b8.ear/bndes-ejb.jar#SIFEC-BNDES-PU
16:13:16,893 INFO  [org.jboss.weld.deployer] (MSC service thread 1-1) WFLYWELD0003: Processando da implantação weld sifec-bndes-1.1.0-b8.ear
16:13:16,893 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 140) WFLYJPA0010: Iniciando unidade de persistência (fase 1 de 2) Serviço'sifec-bndes-1.1.0-b8.ear/bndes-ejb.jar#SIFEC-BNDES-PU'
16:13:16,896 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 141) WFLYJPA0010: Iniciando unidade de persistência (fase 1 de 2) Serviço'sifec-bndes-1.1.0-b8.ear/bndes-ejb.jar#SIFEC-BNDES-PU-FBN'
16:13:16,937 INFO  [org.jboss.keycloak] (MSC service thread 1-3) Keycloak subsystem override for deployment bndes-web.war
16:13:16,937 INFO  [org.jboss.weld.deployer] (MSC service thread 1-3) WFLYWELD0003: Processando da implantação weld bndes-web.war
16:13:17,018 INFO  [org.jboss.weld.deployer] (MSC service thread 1-4) WFLYWELD0003: Processando da implantação weld bndes-ejb.jar
16:13:17,021 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SICLIService' na unidade de implementação 'subdeployment "bndes-ejb.jar" of deployment "sifec-bndes-1.1.0-b8.ear"' são como segue:
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/SICLIService!br.gov.caixa.sicli.negocio.SICLIService
        java:app/bndes-ejb/SICLIService!br.gov.caixa.sicli.negocio.SICLIService
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/SICLIService
        java:app/bndes-ejb/SICLIService
16:13:17,021 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ProdutorLog' na unidade de implementação 'subdeployment "bndes-ejb.jar" of deployment "sifec-bndes-1.1.0-b8.ear"' são como segue:
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/ProdutorLog!br.gov.caixa.log.ProdutorLog
        java:app/bndes-ejb/ProdutorLog!br.gov.caixa.log.ProdutorLog
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/ProdutorLog
        java:app/bndes-ejb/ProdutorLog
16:13:17,021 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DAOBarramentoFactory' na unidade de implementação 'subdeployment "bndes-ejb.jar" of deployment "sifec-bndes-1.1.0-b8.ear"' são como segue:
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/DAOBarramentoFactory!br.gov.caixa.bndes.financiamento.dao.DAOBarramentoFactory
        java:app/bndes-ejb/DAOBarramentoFactory!br.gov.caixa.bndes.financiamento.dao.DAOBarramentoFactory
        java:module/DAOBarramentoFactory!br.gov.caixa.bndes.financiamento.dao.DAOBarramentoFactory
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/DAOBarramentoFactory
        java:app/bndes-ejb/DAOBarramentoFactory
16:13:17,021 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'InclusaoFinanciamento' na unidade de implementação 'subdeployment "bndes-ejb.jar" of deployment "sifec-bndes-1.1.0-b8.ear"' são como segue:
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/InclusaoFinanciamento!br.gov.caixa.bndes.ws.InclusaoFinanciamento
        java:app/bndes-ejb/InclusaoFinanciamento!br.gov.caixa.bndes.ws.InclusaoFinanciamento
        java:module/InclusaoFinanciamento!br.gov.caixa.bndes.ws.InclusaoFinanciamento
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/InclusaoFinanciamento
        java:app/bndes-ejb/InclusaoFinanciamento
16:13:17,021 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ConsultaFinanciamento' na unidade de implementação 'subdeployment "bndes-ejb.jar" of deployment "sifec-bndes-1.1.0-b8.ear"' são como segue:
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/ConsultaFinanciamento!br.gov.caixa.bndes.ws.ConsultaFinanciamento
        java:app/bndes-ejb/ConsultaFinanciamento!br.gov.caixa.bndes.ws.ConsultaFinanciamento
        java:module/ConsultaFinanciamento!br.gov.caixa.bndes.ws.ConsultaFinanciamento
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/ConsultaFinanciamento
        java:app/bndes-ejb/ConsultaFinanciamento
16:13:17,021 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ConsultaContratacao' na unidade de implementação 'subdeployment "bndes-ejb.jar" of deployment "sifec-bndes-1.1.0-b8.ear"' são como segue:
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/ConsultaContratacao!br.gov.caixa.bndes.ws.ConsultaContratacao
        java:app/bndes-ejb/ConsultaContratacao!br.gov.caixa.bndes.ws.ConsultaContratacao
        java:module/ConsultaContratacao!br.gov.caixa.bndes.ws.ConsultaContratacao
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/ConsultaContratacao
        java:app/bndes-ejb/ConsultaContratacao
16:13:17,022 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ConsultaCancelamento' na unidade de implementação 'subdeployment "bndes-ejb.jar" of deployment "sifec-bndes-1.1.0-b8.ear"' são como segue:
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/ConsultaCancelamento!br.gov.caixa.bndes.ws.ConsultaCancelamento
        java:app/bndes-ejb/ConsultaCancelamento!br.gov.caixa.bndes.ws.ConsultaCancelamento
        java:module/ConsultaCancelamento!br.gov.caixa.bndes.ws.ConsultaCancelamento
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/ConsultaCancelamento
        java:app/bndes-ejb/ConsultaCancelamento
16:13:17,022 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AvaliacaoRiscoServicoImpl' na unidade de implementação 'subdeployment "bndes-ejb.jar" of deployment "sifec-bndes-1.1.0-b8.ear"' são como segue:
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/AvaliacaoRiscoServicoImpl!br.gov.caixa.bndes.financiamento.avaliacaoRisco.negocio.AvaliacaoRiscoServico
        java:app/bndes-ejb/AvaliacaoRiscoServicoImpl!br.gov.caixa.bndes.financiamento.avaliacaoRisco.negocio.AvaliacaoRiscoServico
        java:module/AvaliacaoRiscoServicoImpl!br.gov.caixa.bndes.financiamento.avaliacaoRisco.negocio.AvaliacaoRiscoServico
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/AvaliacaoRiscoServicoImpl
        java:app/bndes-ejb/AvaliacaoRiscoServicoImpl
16:13:17,022 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ConsultaLiberacao' na unidade de implementação 'subdeployment "bndes-ejb.jar" of deployment "sifec-bndes-1.1.0-b8.ear"' são como segue:
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/ConsultaLiberacao!br.gov.caixa.bndes.ws.ConsultaLiberacao
        java:app/bndes-ejb/ConsultaLiberacao!br.gov.caixa.bndes.ws.ConsultaLiberacao
        java:module/ConsultaLiberacao!br.gov.caixa.bndes.ws.ConsultaLiberacao
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/ConsultaLiberacao
        java:app/bndes-ejb/ConsultaLiberacao
16:13:17,022 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AvaliacaoRiscoServicosBean' na unidade de implementação 'subdeployment "bndes-ejb.jar" of deployment "sifec-bndes-1.1.0-b8.ear"' são como segue:
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/AvaliacaoRiscoServicosBean!br.gov.caixa.bndes.servico.AvaliacaoRiscoServicosBean
        java:app/bndes-ejb/AvaliacaoRiscoServicosBean!br.gov.caixa.bndes.servico.AvaliacaoRiscoServicosBean
        java:module/AvaliacaoRiscoServicosBean!br.gov.caixa.bndes.servico.AvaliacaoRiscoServicosBean
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/AvaliacaoRiscoServicosBean!br.gov.caixa.bndes.servico.IFAvaliacaoRiscoBean
        java:app/bndes-ejb/AvaliacaoRiscoServicosBean!br.gov.caixa.bndes.servico.IFAvaliacaoRiscoBean
        java:module/AvaliacaoRiscoServicosBean!br.gov.caixa.bndes.servico.IFAvaliacaoRiscoBean
16:13:17,022 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'BndesServicosBean' na unidade de implementação 'subdeployment "bndes-ejb.jar" of deployment "sifec-bndes-1.1.0-b8.ear"' são como segue:
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/BndesServicosBean!br.gov.caixa.bndes.servico.BndesServicosBean
        java:app/bndes-ejb/BndesServicosBean!br.gov.caixa.bndes.servico.BndesServicosBean
        java:module/BndesServicosBean!br.gov.caixa.bndes.servico.BndesServicosBean
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/BndesServicosBean
        java:app/bndes-ejb/BndesServicosBean
        java:module/BndesServicosBean
16:13:17,022 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SiricBean' na unidade de implementação 'subdeployment "bndes-ejb.jar" of deployment "sifec-bndes-1.1.0-b8.ear"' são como segue:
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/SiricBean!br.gov.caixa.siric.negocio.SiricBean
        java:app/bndes-ejb/SiricBean!br.gov.caixa.siric.negocio.SiricBean
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/SiricBean!br.gov.caixa.siric.negocio.SiricService
        java:app/bndes-ejb/SiricBean!br.gov.caixa.siric.negocio.SiricService
16:13:17,022 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SimulacaoServicoImpl' na unidade de implementação 'subdeployment "bndes-ejb.jar" of deployment "sifec-bndes-1.1.0-b8.ear"' são como segue:
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/SimulacaoServicoImpl!br.gov.caixa.bndes.financiamento.simulacao.negocio.SimulacaoServico
        java:app/bndes-ejb/SimulacaoServicoImpl!br.gov.caixa.bndes.financiamento.simulacao.negocio.SimulacaoServico
        java:module/SimulacaoServicoImpl!br.gov.caixa.bndes.financiamento.simulacao.negocio.SimulacaoServico
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/SimulacaoServicoImpl
        java:app/bndes-ejb/SimulacaoServicoImpl
16:13:17,022 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'InclusaoCancelamento' na unidade de implementação 'subdeployment "bndes-ejb.jar" of deployment "sifec-bndes-1.1.0-b8.ear"' são como segue:
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/InclusaoCancelamento!br.gov.caixa.bndes.ws.InclusaoCancelamento
        java:app/bndes-ejb/InclusaoCancelamento!br.gov.caixa.bndes.ws.InclusaoCancelamento
        java:module/InclusaoCancelamento!br.gov.caixa.bndes.ws.InclusaoCancelamento
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/InclusaoCancelamento
        java:app/bndes-ejb/InclusaoCancelamento
16:13:17,022 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'InclusaoLiberacao' na unidade de implementação 'subdeployment "bndes-ejb.jar" of deployment "sifec-bndes-1.1.0-b8.ear"' são como segue:
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/InclusaoLiberacao!br.gov.caixa.bndes.ws.InclusaoLiberacao
        java:app/bndes-ejb/InclusaoLiberacao!br.gov.caixa.bndes.ws.InclusaoLiberacao
        java:module/InclusaoLiberacao!br.gov.caixa.bndes.ws.InclusaoLiberacao
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/InclusaoLiberacao
        java:app/bndes-ejb/InclusaoLiberacao
16:13:17,022 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DadosClienteServicoImpl' na unidade de implementação 'subdeployment "bndes-ejb.jar" of deployment "sifec-bndes-1.1.0-b8.ear"' são como segue:
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/DadosClienteServicoImpl!br.gov.caixa.bndes.financiamento.dadosCliente.negocio.DadosClienteServico
        java:app/bndes-ejb/DadosClienteServicoImpl!br.gov.caixa.bndes.financiamento.dadosCliente.negocio.DadosClienteServico
        java:module/DadosClienteServicoImpl!br.gov.caixa.bndes.financiamento.dadosCliente.negocio.DadosClienteServico
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/DadosClienteServicoImpl
        java:app/bndes-ejb/DadosClienteServicoImpl
16:13:17,022 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'InclusaoContratacao' na unidade de implementação 'subdeployment "bndes-ejb.jar" of deployment "sifec-bndes-1.1.0-b8.ear"' são como segue:
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/InclusaoContratacao!br.gov.caixa.bndes.ws.InclusaoContratacao
        java:app/bndes-ejb/InclusaoContratacao!br.gov.caixa.bndes.ws.InclusaoContratacao
        java:module/InclusaoContratacao!br.gov.caixa.bndes.ws.InclusaoContratacao
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/InclusaoContratacao
        java:app/bndes-ejb/InclusaoContratacao
16:13:17,022 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'GarantiaServicoImpl' na unidade de implementação 'subdeployment "bndes-ejb.jar" of deployment "sifec-bndes-1.1.0-b8.ear"' são como segue:
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/GarantiaServicoImpl!br.gov.caixa.bndes.financiamento.garantia.negocio.GarantiaServico
        java:app/bndes-ejb/GarantiaServicoImpl!br.gov.caixa.bndes.financiamento.garantia.negocio.GarantiaServico
        java:module/GarantiaServicoImpl!br.gov.caixa.bndes.financiamento.garantia.negocio.GarantiaServico
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/GarantiaServicoImpl
        java:app/bndes-ejb/GarantiaServicoImpl
16:13:17,022 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'FbnServicosBean' na unidade de implementação 'subdeployment "bndes-ejb.jar" of deployment "sifec-bndes-1.1.0-b8.ear"' são como segue:
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/FbnServicosBean!br.gov.caixa.bndes.servico.FbnServicosBean
        java:app/bndes-ejb/FbnServicosBean!br.gov.caixa.bndes.servico.FbnServicosBean
        java:module/FbnServicosBean!br.gov.caixa.bndes.servico.FbnServicosBean
        java:global/sifec-bndes-1.1.0-b8/bndes-ejb/FbnServicosBean
        java:app/bndes-ejb/FbnServicosBean
16:13:17,026 INFO  [org.jipijapa] (MSC service thread 1-7) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-bndes-1.1.0-b8.ear#fecDS
16:13:17,026 INFO  [org.jipijapa] (MSC service thread 1-7) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-bndes-1.1.0-b8.ear#SIEMP-PU
16:13:17,061 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 140) WFLYJPA0010: Iniciando unidade de persistência (fase 2 de 2) Serviço'sifec-bndes-1.1.0-b8.ear#SIEMP-PU'
16:13:17,087 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 128) WFLYJPA0010: Iniciando unidade de persistência (fase 2 de 2) Serviço'sifec-bndes-1.1.0-b8.ear#fecDS'
16:13:17,098 INFO  [org.jipijapa] (MSC service thread 1-8) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-bndes-1.1.0-b8.ear/bndes-ejb.jar#SIFEC-BNDES-PU-FBN
16:13:17,098 INFO  [org.jipijapa] (MSC service thread 1-8) JIPIORMV53020253: Cache de segundo nível habilitado para sifec-bndes-1.1.0-b8.ear/bndes-ejb.jar#SIFEC-BNDES-PU
16:13:17,115 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 141) WFLYJPA0010: Iniciando unidade de persistência (fase 2 de 2) Serviço'sifec-bndes-1.1.0-b8.ear/bndes-ejb.jar#SIFEC-BNDES-PU'
16:13:17,117 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 140) WFLYJPA0010: Iniciando unidade de persistência (fase 2 de 2) Serviço'sifec-bndes-1.1.0-b8.ear/bndes-ejb.jar#SIFEC-BNDES-PU-FBN'
16:13:17,195 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 141) HHH000038: Composite-id class does not override equals(): br.gov.caixa.bndes.dominio.transicao.RetornoMensagemFinanciamentoBndesTO
16:13:17,195 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 141) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.bndes.dominio.transicao.RetornoMensagemFinanciamentoBndesTO
16:13:17,195 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 141) HHH000038: Composite-id class does not override equals(): br.gov.caixa.bndes.dominio.transicao.RetornoMensagemContratacaoBndesTO
16:13:17,195 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 141) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.bndes.dominio.transicao.RetornoMensagemContratacaoBndesTO
16:13:17,195 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 141) HHH000038: Composite-id class does not override equals(): br.gov.caixa.bndes.dominio.transicao.ControleMensagemBndesPK
16:13:17,195 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 141) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.bndes.dominio.transicao.ControleMensagemBndesPK
16:13:17,195 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 141) HHH000038: Composite-id class does not override equals(): br.gov.caixa.bndes.dominio.transicao.RetornoInformacoesAdicionaisBndesTO
16:13:17,195 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 141) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.bndes.dominio.transicao.RetornoInformacoesAdicionaisBndesTO
16:13:17,195 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 141) HHH000038: Composite-id class does not override equals(): br.gov.caixa.bndes.dominio.transicao.RetornoMensagemCancelamentoBndesTO
16:13:17,195 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 141) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.bndes.dominio.transicao.RetornoMensagemCancelamentoBndesTO
16:13:17,196 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 141) HHH000038: Composite-id class does not override equals(): br.gov.caixa.bndes.dominio.transicao.RetornoMensagemLiberacaoBndesTO
16:13:17,196 WARN  [org.hibernate.mapping.RootClass] (ServerService Thread Pool -- 141) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.bndes.dominio.transicao.RetornoMensagemLiberacaoBndesTO
^C
[root@cbrdeapllx473 p585600]#





[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /server-group=sifec-intranet/deployment=SIFEC-BNDES-ONLINE:add(enabled=true)

