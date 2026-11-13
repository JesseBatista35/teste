85600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "WFLYSRV0010|WFLYSRV0027|WFLYSRV0021|WFLYUT0021|ERROR|Caused by|WELD-001408|Duplicate|ORA-|lcr|LCR|sirur|SIRUR|sifec-2"

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
14:48:56,253 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0027: Iniciando a implantação do "SILCR" (runtime-name: "sifec_lcr_1.117.1.ear")
14:48:56,443 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-1) MSC000001: Failed to start service jboss.deployment.unit."sifec_lcr_1.117.1.ear".STRUCTURE: org.jboss.msc.service.StartException in service jboss.deployment.unit."sifec_lcr_1.117.1.ear".STRUCTURE: WFLYSRV0153: Falha ao processar a fase STRUCTURE de deployment "sifec_lcr_1.117.1.ear"
Caused by: org.jboss.as.server.deployment.DeploymentUnitProcessingException: WFLYSRV0160: Falha ao montar o conteúdo de implantação
Caused by: java.util.zip.ZipException: error in opening zip file
14:48:56,458 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 150) WFLYCTL0013: Falha na operação ("add") - endereço ([("deployment" => "SILCR")]) - falha na descrição: {"WFLYCTL0080: Falha de serviços" => {"jboss.deployment.unit.\"sifec_lcr_1.117.1.ear\".STRUCTURE" => "WFLYSRV0153: Falha ao processar a fase STRUCTURE de deployment \"sifec_lcr_1.117.1.ear\"
    Caused by: org.jboss.as.server.deployment.DeploymentUnitProcessingException: WFLYSRV0160: Falha ao montar o conteúdo de implantação
    Caused by: java.util.zip.ZipException: error in opening zip file"}}
14:48:56,458 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 150) WFLYCTL0013: Falha na operação ("add") - endereço ([("deployment" => "SILCR")]) - falha na descrição: {"WFLYCTL0080: Falha de serviços" => {"jboss.deployment.unit.\"sifec_lcr_1.117.1.ear\".STRUCTURE" => "WFLYSRV0153: Falha ao processar a fase STRUCTURE de deployment \"sifec_lcr_1.117.1.ear\"
    Caused by: org.jboss.as.server.deployment.DeploymentUnitProcessingException: WFLYSRV0160: Falha ao montar o conteúdo de implantação
    Caused by: java.util.zip.ZipException: error in opening zip file"}}
14:48:56,466 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 150) WFLYSRV0021: O procedimento da implantação "sifec_lcr_1.117.1.ear" foi revertido com mensagem de falha:
{"WFLYCTL0080: Falha de serviços" => {"jboss.deployment.unit.\"sifec_lcr_1.117.1.ear\".STRUCTURE" => "WFLYSRV0153: Falha ao processar a fase STRUCTURE de deployment \"sifec_lcr_1.117.1.ear\"
    Caused by: org.jboss.as.server.deployment.DeploymentUnitProcessingException: WFLYSRV0160: Falha ao montar o conteúdo de implantação
    Caused by: java.util.zip.ZipException: error in opening zip file"}}
14:48:56,469 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0028: Implantação interrompida SILCR (runtime-name: sifec_lcr_1.117.1.ear) em 3ms
14:59:15,810 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0027: Iniciando a implantação do "SILCR" (runtime-name: "sifec_lcr_1.117.1.ear")
14:59:18,114 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: A entrada do caminho da classe fop-util-2.10.jar em /content/sifec_lcr_1.117.1.ear/lib/fop.jar não direciona a um jar válido para a referência do caminho da classe.
14:59:18,114 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: A entrada do caminho da classe xmlgraphics-commons-2.10.jar em /content/sifec_lcr_1.117.1.ear/lib/fop.jar não direciona a um jar válido para a referência do caminho da classe.
14:59:18,114 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: A entrada do caminho da classe fop-events-2.10.jar em /content/sifec_lcr_1.117.1.ear/lib/fop.jar não direciona a um jar válido para a referência do caminho da classe.
14:59:18,114 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: A entrada do caminho da classe qdox-1.12.jar em /content/sifec_lcr_1.117.1.ear/lib/fop.jar não direciona a um jar válido para a referência do caminho da classe.
14:59:18,114 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: A entrada do caminho da classe commons-io-2.11.0.jar em /content/sifec_lcr_1.117.1.ear/lib/fop.jar não direciona a um jar válido para a referência do caminho da classe.
14:59:18,114 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: A entrada do caminho da classe fop-core-2.10.jar em /content/sifec_lcr_1.117.1.ear/lib/fop.jar não direciona a um jar válido para a referência do caminho da classe.
14:59:18,114 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: A entrada do caminho da classe batik-anim-1.18.jar em /content/sifec_lcr_1.117.1.ear/lib/fop.jar não direciona a um jar válido para a referência do caminho da classe.
14:59:18,114 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: A entrada do caminho da classe batik-css-1.18.jar em /content/sifec_lcr_1.117.1.ear/lib/fop.jar não direciona a um jar válido para a referência do caminho da classe.
14:59:18,114 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: A entrada do caminho da classe batik-dom-1.18.jar em /content/sifec_lcr_1.117.1.ear/lib/fop.jar não direciona a um jar válido para a referência do caminho da classe.
14:59:18,114 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: A entrada do caminho da classe xml-apis-1.4.01.jar em /content/sifec_lcr_1.117.1.ear/lib/fop.jar não direciona a um jar válido para a referência do caminho da classe.
14:59:18,114 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: A entrada do caminho da classe batik-ext-1.18.jar em /content/sifec_lcr_1.117.1.ear/lib/fop.jar não direciona a um jar válido para a referência do caminho da classe.
14:59:18,114 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: A entrada do caminho da classe batik-parser-1.18.jar em /content/sifec_lcr_1.117.1.ear/lib/fop.jar não direciona a um jar válido para a referência do caminho da classe.
14:59:18,114 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: A entrada do caminho da classe batik-shared-resources-1.18.jar em /content/sifec_lcr_1.117.1.ear/lib/fop.jar não direciona a um jar válido para a referência do caminho da classe.
14:59:18,114 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: A entrada do caminho da classe batik-svg-dom-1.18.jar em /content/sifec_lcr_1.117.1.ear/lib/fop.jar não direciona a um jar válido para a referência do caminho da classe.
14:59:18,114 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: A entrada do caminho da classe batik-util-1.18.jar em /content/sifec_lcr_1.117.1.ear/lib/fop.jar não direciona a um jar válido para a referência do caminho da classe.
14:59:18,114 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: A entrada do caminho da classe batik-constants-1.18.jar em /content/sifec_lcr_1.117.1.ear/lib/fop.jar não direciona a um jar válido para a referência do caminho da classe.
14:59:18,114 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: A entrada do caminho da classe batik-i18n-1.18.jar em /content/sifec_lcr_1.117.1.ear/lib/fop.jar não direciona a um jar válido para a referência do caminho da classe.
14:59:18,114 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: A entrada do caminho da classe xml-apis-ext-1.3.04.jar em /content/sifec_lcr_1.117.1.ear/lib/fop.jar não direciona a um jar válido para a referência do caminho da classe.
14:59:18,114 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: A entrada do caminho da classe batik-awt-util-1.18.jar em /content/sifec_lcr_1.117.1.ear/lib/fop.jar não direciona a um jar válido para a referência do caminho da classe.
14:59:18,114 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: A entrada do caminho da classe batik-bridge-1.18.jar em /content/sifec_lcr_1.117.1.ear/lib/fop.jar não direciona a um jar válido para a referência do caminho da classe.
14:59:18,114 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: A entrada do caminho da classe batik-script-1.18.jar em /content/sifec_lcr_1.117.1.ear/lib/fop.jar não direciona a um jar válido para a referência do caminho da classe.
14:59:18,114 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: A entrada do caminho da classe batik-xml-1.18.jar em /content/sifec_lcr_1.117.1.ear/lib/fop.jar não direciona a um jar válido para a referência do caminho da classe.
14:59:18,114 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: A entrada do caminho da classe batik-extension-1.18.jar em /content/sifec_lcr_1.117.1.ear/lib/fop.jar não direciona a um jar válido para a referência do caminho da classe.
14:59:18,114 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: A entrada do caminho da classe batik-gvt-1.18.jar em /content/sifec_lcr_1.117.1.ear/lib/fop.jar não direciona a um jar válido para a referência do caminho da classe.
14:59:18,114 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: A entrada do caminho da classe batik-transcoder-1.18.jar em /content/sifec_lcr_1.117.1.ear/lib/fop.jar não direciona a um jar válido para a referência do caminho da classe.
14:59:18,114 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: A entrada do caminho da classe batik-svggen-1.18.jar em /content/sifec_lcr_1.117.1.ear/lib/fop.jar não direciona a um jar válido para a referência do caminho da classe.
14:59:18,114 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: A entrada do caminho da classe batik-codec-1.18.jar em /content/sifec_lcr_1.117.1.ear/lib/fop.jar não direciona a um jar válido para a referência do caminho da classe.
14:59:18,114 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: A entrada do caminho da classe commons-logging-1.3.0.jar em /content/sifec_lcr_1.117.1.ear/lib/fop.jar não direciona a um jar válido para a referência do caminho da classe.
14:59:18,115 WARN  [org.jboss.as.server.deployment] (MSC service thread 1-7) WFLYSRV0059: A entrada do caminho da classe fontbox-2.0.27.jar em /content/sifec_lcr_1.117.1.ear/lib/fop.jar não direciona a um jar válido para a referência do caminho da classe.
14:59:21,494 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "lcr-ejb.jar")
14:59:21,494 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-4) WFLYSRV0207: Iniciando a subimplantação (runtime-name: "lcr-web.war")
14:59:22,705 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-1) WFLYSRV0018: A implantação "deployment.sifec_lcr_1.117.1.ear.lcr-ejb.jar" está usando um módulo privado ("org.codehaus.jackson.jackson-mapper-asl") que pode ser alterado ou removido em versões futuras sem nenhum aviso.
14:59:22,705 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-7) WFLYSRV0018: A implantação "deployment.sifec_lcr_1.117.1.ear.lcr-web.war" está usando um módulo privado ("org.codehaus.jackson.jackson-mapper-asl") que pode ser alterado ou removido em versões futuras sem nenhum aviso.
14:59:22,706 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-8) WFLYSRV0018: A implantação "deployment.sifec_lcr_1.117.1.ear" está usando um módulo privado ("org.codehaus.jackson.jackson-mapper-asl") que pode ser alterado ou removido em versões futuras sem nenhum aviso.
14:59:22,706 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-8) WFLYSRV0018: A implantação "deployment.sifec_lcr_1.117.1.ear" está usando um módulo privado ("org.codehaus.jackson.jackson-mapper-asl") que pode ser alterado ou removido em versões futuras sem nenhum aviso.
14:59:22,776 INFO  [org.jipijapa] (MSC service thread 1-6) JIPIORMV53020253: Cache de segundo nível habilitado para sifec_lcr_1.117.1.ear#fecDS
14:59:22,786 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 143) WFLYJPA0010: Iniciando unidade de persistência (fase 1 de 2) Serviço'sifec_lcr_1.117.1.ear#fecDS'
14:59:22,809 INFO  [org.jboss.weld.deployer] (MSC service thread 1-4) WFLYWELD0003: Processando da implantação weld sifec_lcr_1.117.1.ear
14:59:23,316 INFO  [org.jboss.keycloak] (MSC service thread 1-7) Keycloak subsystem override for deployment lcr-web.war
14:59:23,316 INFO  [org.jboss.weld.deployer] (MSC service thread 1-7) WFLYWELD0003: Processando da implantação weld lcr-web.war
14:59:23,328 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-7) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ApiController' na unidade de implementação 'subdeployment "lcr-web.war" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-web/ApiController!br.gov.caixa.lcr.api.controller.ApiController
        java:app/lcr-web/ApiController!br.gov.caixa.lcr.api.controller.ApiController
        java:module/ApiController!br.gov.caixa.lcr.api.controller.ApiController
        java:global/sifec_lcr_1.117.1/lcr-web/ApiController
        java:app/lcr-web/ApiController
14:59:23,721 INFO  [org.jboss.weld.deployer] (MSC service thread 1-4) WFLYWELD0003: Processando da implantação weld lcr-ejb.jar
14:59:23,725 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TarifasPorProdutoBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/TarifasPorProdutoBean!br.gov.caixa.lcr.service.impl.TarifasPorProdutoBean
        java:app/lcr-ejb/TarifasPorProdutoBean!br.gov.caixa.lcr.service.impl.TarifasPorProdutoBean
        java:module/TarifasPorProdutoBean!br.gov.caixa.lcr.service.impl.TarifasPorProdutoBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/TarifasPorProdutoBean!br.gov.caixa.lcr.service.TarifasPorProdutoService
        java:app/lcr-ejb/TarifasPorProdutoBean!br.gov.caixa.lcr.service.TarifasPorProdutoService
        java:module/TarifasPorProdutoBean!br.gov.caixa.lcr.service.TarifasPorProdutoService
14:59:23,726 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'UtilizacaoCROTDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/UtilizacaoCROTDaoImpl!br.gov.caixa.lcr.dao.impl.UtilizacaoCROTDaoImpl
        java:app/lcr-ejb/UtilizacaoCROTDaoImpl!br.gov.caixa.lcr.dao.impl.UtilizacaoCROTDaoImpl
        java:module/UtilizacaoCROTDaoImpl!br.gov.caixa.lcr.dao.impl.UtilizacaoCROTDaoImpl
        java:global/sifec_lcr_1.117.1/lcr-ejb/UtilizacaoCROTDaoImpl!br.gov.caixa.lcr.dao.UtilizacaoCROTDao
        java:app/lcr-ejb/UtilizacaoCROTDaoImpl!br.gov.caixa.lcr.dao.UtilizacaoCROTDao
        java:module/UtilizacaoCROTDaoImpl!br.gov.caixa.lcr.dao.UtilizacaoCROTDao
14:59:23,726 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AvaliacaoRiscoBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/AvaliacaoRiscoBean!br.gov.caixa.lcr.service.AvaliacaoRiscoService
        java:app/lcr-ejb/AvaliacaoRiscoBean!br.gov.caixa.lcr.service.AvaliacaoRiscoService
        java:module/AvaliacaoRiscoBean!br.gov.caixa.lcr.service.AvaliacaoRiscoService
        java:global/sifec_lcr_1.117.1/lcr-ejb/AvaliacaoRiscoBean!br.gov.caixa.lcr.service.impl.AvaliacaoRiscoBean
        java:app/lcr-ejb/AvaliacaoRiscoBean!br.gov.caixa.lcr.service.impl.AvaliacaoRiscoBean
        java:module/AvaliacaoRiscoBean!br.gov.caixa.lcr.service.impl.AvaliacaoRiscoBean
14:59:23,726 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'PropostaContratacaoDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/PropostaContratacaoDaoImpl!br.gov.caixa.lcr.dao.impl.PropostaContratacaoDaoImpl
        java:app/lcr-ejb/PropostaContratacaoDaoImpl!br.gov.caixa.lcr.dao.impl.PropostaContratacaoDaoImpl
        java:module/PropostaContratacaoDaoImpl!br.gov.caixa.lcr.dao.impl.PropostaContratacaoDaoImpl
        java:global/sifec_lcr_1.117.1/lcr-ejb/PropostaContratacaoDaoImpl!br.gov.caixa.lcr.dao.PropostaContratacaoDao
        java:app/lcr-ejb/PropostaContratacaoDaoImpl!br.gov.caixa.lcr.dao.PropostaContratacaoDao
        java:module/PropostaContratacaoDaoImpl!br.gov.caixa.lcr.dao.PropostaContratacaoDao
14:59:23,726 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContratoDetalheBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ContratoDetalheBean!br.gov.caixa.lcr.service.impl.ContratoDetalheBean
        java:app/lcr-ejb/ContratoDetalheBean!br.gov.caixa.lcr.service.impl.ContratoDetalheBean
        java:module/ContratoDetalheBean!br.gov.caixa.lcr.service.impl.ContratoDetalheBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/ContratoDetalheBean!br.gov.caixa.lcr.service.ContratoDetalheService
        java:app/lcr-ejb/ContratoDetalheBean!br.gov.caixa.lcr.service.ContratoDetalheService
        java:module/ContratoDetalheBean!br.gov.caixa.lcr.service.ContratoDetalheService
14:59:23,726 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DadosSICLIDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/DadosSICLIDaoImpl!br.gov.caixa.lcr.sicli.dao.impl.DadosSICLIDaoImpl
        java:app/lcr-ejb/DadosSICLIDaoImpl!br.gov.caixa.lcr.sicli.dao.impl.DadosSICLIDaoImpl
        java:module/DadosSICLIDaoImpl!br.gov.caixa.lcr.sicli.dao.impl.DadosSICLIDaoImpl
        java:global/sifec_lcr_1.117.1/lcr-ejb/DadosSICLIDaoImpl
        java:app/lcr-ejb/DadosSICLIDaoImpl
14:59:23,726 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'PerdaOperacionalDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/PerdaOperacionalDaoImpl!br.gov.caixa.lcr.dao.PerdaOperacionalDao
        java:app/lcr-ejb/PerdaOperacionalDaoImpl!br.gov.caixa.lcr.dao.PerdaOperacionalDao
        java:module/PerdaOperacionalDaoImpl!br.gov.caixa.lcr.dao.PerdaOperacionalDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/PerdaOperacionalDaoImpl!br.gov.caixa.lcr.dao.impl.PerdaOperacionalDaoImpl
        java:app/lcr-ejb/PerdaOperacionalDaoImpl!br.gov.caixa.lcr.dao.impl.PerdaOperacionalDaoImpl
        java:module/PerdaOperacionalDaoImpl!br.gov.caixa.lcr.dao.impl.PerdaOperacionalDaoImpl
14:59:23,726 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SiricConnection' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/SiricConnection!br.gov.caixa.lcr.siric.connection.SiricConnection
        java:app/lcr-ejb/SiricConnection!br.gov.caixa.lcr.siric.connection.SiricConnection
        java:module/SiricConnection!br.gov.caixa.lcr.siric.connection.SiricConnection
        java:global/sifec_lcr_1.117.1/lcr-ejb/SiricConnection
        java:app/lcr-ejb/SiricConnection
14:59:23,726 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TarifaProdutoDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/TarifaProdutoDaoImpl!br.gov.caixa.lcr.dao.TarifaProdutoDao
        java:app/lcr-ejb/TarifaProdutoDaoImpl!br.gov.caixa.lcr.dao.TarifaProdutoDao
        java:module/TarifaProdutoDaoImpl!br.gov.caixa.lcr.dao.TarifaProdutoDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/TarifaProdutoDaoImpl!br.gov.caixa.lcr.dao.impl.TarifaProdutoDaoImpl
        java:app/lcr-ejb/TarifaProdutoDaoImpl!br.gov.caixa.lcr.dao.impl.TarifaProdutoDaoImpl
        java:module/TarifaProdutoDaoImpl!br.gov.caixa.lcr.dao.impl.TarifaProdutoDaoImpl
14:59:23,726 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TaxaJurosDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/TaxaJurosDaoImpl!br.gov.caixa.lcr.dao.TaxaJurosDao
        java:app/lcr-ejb/TaxaJurosDaoImpl!br.gov.caixa.lcr.dao.TaxaJurosDao
        java:module/TaxaJurosDaoImpl!br.gov.caixa.lcr.dao.TaxaJurosDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/TaxaJurosDaoImpl!br.gov.caixa.lcr.dao.impl.TaxaJurosDaoImpl
        java:app/lcr-ejb/TaxaJurosDaoImpl!br.gov.caixa.lcr.dao.impl.TaxaJurosDaoImpl
        java:module/TaxaJurosDaoImpl!br.gov.caixa.lcr.dao.impl.TaxaJurosDaoImpl
14:59:23,726 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'LotacaoBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/LotacaoBean!br.gov.caixa.lcr.service.impl.LotacaoBean
        java:app/lcr-ejb/LotacaoBean!br.gov.caixa.lcr.service.impl.LotacaoBean
        java:module/LotacaoBean!br.gov.caixa.lcr.service.impl.LotacaoBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/LotacaoBean!br.gov.caixa.lcr.service.LotacaoService
        java:app/lcr-ejb/LotacaoBean!br.gov.caixa.lcr.service.LotacaoService
        java:module/LotacaoBean!br.gov.caixa.lcr.service.LotacaoService
14:59:23,726 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TaxaJurosBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/TaxaJurosBean!br.gov.caixa.lcr.service.TaxaJurosService
        java:app/lcr-ejb/TaxaJurosBean!br.gov.caixa.lcr.service.TaxaJurosService
        java:module/TaxaJurosBean!br.gov.caixa.lcr.service.TaxaJurosService
        java:global/sifec_lcr_1.117.1/lcr-ejb/TaxaJurosBean!br.gov.caixa.lcr.service.impl.TaxaJurosBean
        java:app/lcr-ejb/TaxaJurosBean!br.gov.caixa.lcr.service.impl.TaxaJurosBean
        java:module/TaxaJurosBean!br.gov.caixa.lcr.service.impl.TaxaJurosBean
14:59:23,726 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'PropriedadeDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/PropriedadeDaoImpl!br.gov.caixa.lcr.dao.PropriedadeDao
        java:app/lcr-ejb/PropriedadeDaoImpl!br.gov.caixa.lcr.dao.PropriedadeDao
        java:module/PropriedadeDaoImpl!br.gov.caixa.lcr.dao.PropriedadeDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/PropriedadeDaoImpl!br.gov.caixa.lcr.dao.impl.PropriedadeDaoImpl
        java:app/lcr-ejb/PropriedadeDaoImpl!br.gov.caixa.lcr.dao.impl.PropriedadeDaoImpl
        java:module/PropriedadeDaoImpl!br.gov.caixa.lcr.dao.impl.PropriedadeDaoImpl
14:59:23,726 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'BloqueioAgendaDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/BloqueioAgendaDaoImpl!br.gov.caixa.lcr.dao.impl.BloqueioAgendaDaoImpl
        java:app/lcr-ejb/BloqueioAgendaDaoImpl!br.gov.caixa.lcr.dao.impl.BloqueioAgendaDaoImpl
        java:module/BloqueioAgendaDaoImpl!br.gov.caixa.lcr.dao.impl.BloqueioAgendaDaoImpl
        java:global/sifec_lcr_1.117.1/lcr-ejb/BloqueioAgendaDaoImpl!br.gov.caixa.lcr.dao.BloqueioAgendaDao
        java:app/lcr-ejb/BloqueioAgendaDaoImpl!br.gov.caixa.lcr.dao.BloqueioAgendaDao
        java:module/BloqueioAgendaDaoImpl!br.gov.caixa.lcr.dao.BloqueioAgendaDao
14:59:23,726 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'GrupoContabilDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/GrupoContabilDaoImpl!br.gov.caixa.lcr.dao.GrupoContabilDao
        java:app/lcr-ejb/GrupoContabilDaoImpl!br.gov.caixa.lcr.dao.GrupoContabilDao
        java:module/GrupoContabilDaoImpl!br.gov.caixa.lcr.dao.GrupoContabilDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/GrupoContabilDaoImpl!br.gov.caixa.lcr.dao.impl.GrupoContabilDaoImpl
        java:app/lcr-ejb/GrupoContabilDaoImpl!br.gov.caixa.lcr.dao.impl.GrupoContabilDaoImpl
        java:module/GrupoContabilDaoImpl!br.gov.caixa.lcr.dao.impl.GrupoContabilDaoImpl
14:59:23,726 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'UnidadeDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/UnidadeDaoImpl!br.gov.caixa.lcr.dao.impl.UnidadeDaoImpl
        java:app/lcr-ejb/UnidadeDaoImpl!br.gov.caixa.lcr.dao.impl.UnidadeDaoImpl
        java:module/UnidadeDaoImpl!br.gov.caixa.lcr.dao.impl.UnidadeDaoImpl
        java:global/sifec_lcr_1.117.1/lcr-ejb/UnidadeDaoImpl!br.gov.caixa.lcr.dao.UnidadeDao
        java:app/lcr-ejb/UnidadeDaoImpl!br.gov.caixa.lcr.dao.UnidadeDao
        java:module/UnidadeDaoImpl!br.gov.caixa.lcr.dao.UnidadeDao
14:59:23,726 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'PeriodicidadeMensagemDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/PeriodicidadeMensagemDaoImpl!br.gov.caixa.lcr.dao.PeriodicidadeMensagemDao
        java:app/lcr-ejb/PeriodicidadeMensagemDaoImpl!br.gov.caixa.lcr.dao.PeriodicidadeMensagemDao
        java:module/PeriodicidadeMensagemDaoImpl!br.gov.caixa.lcr.dao.PeriodicidadeMensagemDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/PeriodicidadeMensagemDaoImpl!br.gov.caixa.lcr.dao.impl.PeriodicidadeMensagemDaoImpl
        java:app/lcr-ejb/PeriodicidadeMensagemDaoImpl!br.gov.caixa.lcr.dao.impl.PeriodicidadeMensagemDaoImpl
        java:module/PeriodicidadeMensagemDaoImpl!br.gov.caixa.lcr.dao.impl.PeriodicidadeMensagemDaoImpl
14:59:23,726 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MinutaPropostaBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/MinutaPropostaBean!br.gov.caixa.lcr.service.impl.MinutaPropostaBean
        java:app/lcr-ejb/MinutaPropostaBean!br.gov.caixa.lcr.service.impl.MinutaPropostaBean
        java:module/MinutaPropostaBean!br.gov.caixa.lcr.service.impl.MinutaPropostaBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/MinutaPropostaBean!br.gov.caixa.lcr.service.MinutaPropostaService
        java:app/lcr-ejb/MinutaPropostaBean!br.gov.caixa.lcr.service.MinutaPropostaService
        java:module/MinutaPropostaBean!br.gov.caixa.lcr.service.MinutaPropostaService
14:59:23,726 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DadosSICLIBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/DadosSICLIBean!br.gov.caixa.lcr.sicli.service.impl.DadosSICLIBean
        java:app/lcr-ejb/DadosSICLIBean!br.gov.caixa.lcr.sicli.service.impl.DadosSICLIBean
        java:module/DadosSICLIBean!br.gov.caixa.lcr.sicli.service.impl.DadosSICLIBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/DadosSICLIBean!br.gov.caixa.lcr.sicli.service.DadosSICLIService
        java:app/lcr-ejb/DadosSICLIBean!br.gov.caixa.lcr.sicli.service.DadosSICLIService
        java:module/DadosSICLIBean!br.gov.caixa.lcr.sicli.service.DadosSICLIService
14:59:23,726 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ConformidadeBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ConformidadeBean!br.gov.caixa.lcr.conformidade.service.ConformidadeService
        java:app/lcr-ejb/ConformidadeBean!br.gov.caixa.lcr.conformidade.service.ConformidadeService
        java:module/ConformidadeBean!br.gov.caixa.lcr.conformidade.service.ConformidadeService
        java:global/sifec_lcr_1.117.1/lcr-ejb/ConformidadeBean!br.gov.caixa.lcr.conformidade.service.impl.ConformidadeBean
        java:app/lcr-ejb/ConformidadeBean!br.gov.caixa.lcr.conformidade.service.impl.ConformidadeBean
        java:module/ConformidadeBean!br.gov.caixa.lcr.conformidade.service.impl.ConformidadeBean
14:59:23,726 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ProdutoBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ProdutoBean!br.gov.caixa.lcr.service.ProdutoService
        java:app/lcr-ejb/ProdutoBean!br.gov.caixa.lcr.service.ProdutoService
        java:module/ProdutoBean!br.gov.caixa.lcr.service.ProdutoService
        java:global/sifec_lcr_1.117.1/lcr-ejb/ProdutoBean!br.gov.caixa.lcr.service.impl.ProdutoBean
        java:app/lcr-ejb/ProdutoBean!br.gov.caixa.lcr.service.impl.ProdutoBean
        java:module/ProdutoBean!br.gov.caixa.lcr.service.impl.ProdutoBean
14:59:23,726 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SirmcDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/SirmcDaoImpl!br.gov.caixa.lcr.sirmc.dao.impl.SirmcDaoImpl
        java:app/lcr-ejb/SirmcDaoImpl!br.gov.caixa.lcr.sirmc.dao.impl.SirmcDaoImpl
        java:module/SirmcDaoImpl!br.gov.caixa.lcr.sirmc.dao.impl.SirmcDaoImpl
        java:global/sifec_lcr_1.117.1/lcr-ejb/SirmcDaoImpl
        java:app/lcr-ejb/SirmcDaoImpl
14:59:23,726 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ParametrosProdutoCanalBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ParametrosProdutoCanalBean!br.gov.caixa.lcr.service.ParametrosProdutoCanalService
        java:app/lcr-ejb/ParametrosProdutoCanalBean!br.gov.caixa.lcr.service.ParametrosProdutoCanalService
        java:module/ParametrosProdutoCanalBean!br.gov.caixa.lcr.service.ParametrosProdutoCanalService
        java:global/sifec_lcr_1.117.1/lcr-ejb/ParametrosProdutoCanalBean!br.gov.caixa.lcr.service.impl.ParametrosProdutoCanalBean
        java:app/lcr-ejb/ParametrosProdutoCanalBean!br.gov.caixa.lcr.service.impl.ParametrosProdutoCanalBean
        java:module/ParametrosProdutoCanalBean!br.gov.caixa.lcr.service.impl.ParametrosProdutoCanalBean
14:59:23,726 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContaNsgdDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ContaNsgdDaoImpl!br.gov.caixa.lcr.dao.impl.ContaNsgdDaoImpl
        java:app/lcr-ejb/ContaNsgdDaoImpl!br.gov.caixa.lcr.dao.impl.ContaNsgdDaoImpl
        java:module/ContaNsgdDaoImpl!br.gov.caixa.lcr.dao.impl.ContaNsgdDaoImpl
        java:global/sifec_lcr_1.117.1/lcr-ejb/ContaNsgdDaoImpl!br.gov.caixa.lcr.dao.ContaNsgdDao
        java:app/lcr-ejb/ContaNsgdDaoImpl!br.gov.caixa.lcr.dao.ContaNsgdDao
        java:module/ContaNsgdDaoImpl!br.gov.caixa.lcr.dao.ContaNsgdDao
14:59:23,727 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'GarantiaDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/GarantiaDaoImpl!br.gov.caixa.lcr.dao.GarantiaDao
        java:app/lcr-ejb/GarantiaDaoImpl!br.gov.caixa.lcr.dao.GarantiaDao
        java:module/GarantiaDaoImpl!br.gov.caixa.lcr.dao.GarantiaDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/GarantiaDaoImpl!br.gov.caixa.lcr.dao.impl.GarantiaDaoImpl
        java:app/lcr-ejb/GarantiaDaoImpl!br.gov.caixa.lcr.dao.impl.GarantiaDaoImpl
        java:module/GarantiaDaoImpl!br.gov.caixa.lcr.dao.impl.GarantiaDaoImpl
14:59:23,727 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EstornoEncargoBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/EstornoEncargoBean!br.gov.caixa.lcr.service.impl.EstornoEncargoBean
        java:app/lcr-ejb/EstornoEncargoBean!br.gov.caixa.lcr.service.impl.EstornoEncargoBean
        java:module/EstornoEncargoBean!br.gov.caixa.lcr.service.impl.EstornoEncargoBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/EstornoEncargoBean!br.gov.caixa.lcr.service.EstornoEncargoService
        java:app/lcr-ejb/EstornoEncargoBean!br.gov.caixa.lcr.service.EstornoEncargoService
        java:module/EstornoEncargoBean!br.gov.caixa.lcr.service.EstornoEncargoService
14:59:23,727 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MockAberturaContaDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/MockAberturaContaDaoImpl!br.gov.caixa.lcr.mock.conta.dao.MockAberturaContaDao
        java:app/lcr-ejb/MockAberturaContaDaoImpl!br.gov.caixa.lcr.mock.conta.dao.MockAberturaContaDao
        java:module/MockAberturaContaDaoImpl!br.gov.caixa.lcr.mock.conta.dao.MockAberturaContaDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/MockAberturaContaDaoImpl!br.gov.caixa.lcr.mock.conta.dao.MockAberturaContaDaoImpl
        java:app/lcr-ejb/MockAberturaContaDaoImpl!br.gov.caixa.lcr.mock.conta.dao.MockAberturaContaDaoImpl
        java:module/MockAberturaContaDaoImpl!br.gov.caixa.lcr.mock.conta.dao.MockAberturaContaDaoImpl
14:59:23,727 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'CessaoCarteiraBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/CessaoCarteiraBean!br.gov.caixa.lcr.service.impl.CessaoCarteiraBean
        java:app/lcr-ejb/CessaoCarteiraBean!br.gov.caixa.lcr.service.impl.CessaoCarteiraBean
        java:module/CessaoCarteiraBean!br.gov.caixa.lcr.service.impl.CessaoCarteiraBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/CessaoCarteiraBean!br.gov.caixa.lcr.service.CessaoCarteiraService
        java:app/lcr-ejb/CessaoCarteiraBean!br.gov.caixa.lcr.service.CessaoCarteiraService
        java:module/CessaoCarteiraBean!br.gov.caixa.lcr.service.CessaoCarteiraService
14:59:23,727 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'FatoOperacionalDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/FatoOperacionalDaoImpl!br.gov.caixa.lcr.dao.impl.FatoOperacionalDaoImpl
        java:app/lcr-ejb/FatoOperacionalDaoImpl!br.gov.caixa.lcr.dao.impl.FatoOperacionalDaoImpl
        java:module/FatoOperacionalDaoImpl!br.gov.caixa.lcr.dao.impl.FatoOperacionalDaoImpl
        java:global/sifec_lcr_1.117.1/lcr-ejb/FatoOperacionalDaoImpl!br.gov.caixa.lcr.dao.FatoOperacionalDao
        java:app/lcr-ejb/FatoOperacionalDaoImpl!br.gov.caixa.lcr.dao.FatoOperacionalDao
        java:module/FatoOperacionalDaoImpl!br.gov.caixa.lcr.dao.FatoOperacionalDao
14:59:23,727 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContrataProdutoCrotDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ContrataProdutoCrotDaoImpl!br.gov.caixa.lcr.dao.ContrataProdutoCrotDao
        java:app/lcr-ejb/ContrataProdutoCrotDaoImpl!br.gov.caixa.lcr.dao.ContrataProdutoCrotDao
        java:module/ContrataProdutoCrotDaoImpl!br.gov.caixa.lcr.dao.ContrataProdutoCrotDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/ContrataProdutoCrotDaoImpl!br.gov.caixa.lcr.dao.impl.ContrataProdutoCrotDaoImpl
        java:app/lcr-ejb/ContrataProdutoCrotDaoImpl!br.gov.caixa.lcr.dao.impl.ContrataProdutoCrotDaoImpl
        java:module/ContrataProdutoCrotDaoImpl!br.gov.caixa.lcr.dao.impl.ContrataProdutoCrotDaoImpl
14:59:23,727 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SacadosImpedidosImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/SacadosImpedidosImpl!br.gov.caixa.lcr.dao.impl.SacadosImpedidosImpl
        java:app/lcr-ejb/SacadosImpedidosImpl!br.gov.caixa.lcr.dao.impl.SacadosImpedidosImpl
        java:module/SacadosImpedidosImpl!br.gov.caixa.lcr.dao.impl.SacadosImpedidosImpl
        java:global/sifec_lcr_1.117.1/lcr-ejb/SacadosImpedidosImpl!br.gov.caixa.lcr.dao.SacadosImpedidosDao
        java:app/lcr-ejb/SacadosImpedidosImpl!br.gov.caixa.lcr.dao.SacadosImpedidosDao
        java:module/SacadosImpedidosImpl!br.gov.caixa.lcr.dao.SacadosImpedidosDao
14:59:23,727 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'UtilizacaoCROTBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/UtilizacaoCROTBean!br.gov.caixa.lcr.service.UtilizacaoCROTService
        java:app/lcr-ejb/UtilizacaoCROTBean!br.gov.caixa.lcr.service.UtilizacaoCROTService
        java:module/UtilizacaoCROTBean!br.gov.caixa.lcr.service.UtilizacaoCROTService
        java:global/sifec_lcr_1.117.1/lcr-ejb/UtilizacaoCROTBean!br.gov.caixa.lcr.service.impl.UtilizacaoCROTBean
        java:app/lcr-ejb/UtilizacaoCROTBean!br.gov.caixa.lcr.service.impl.UtilizacaoCROTBean
        java:module/UtilizacaoCROTBean!br.gov.caixa.lcr.service.impl.UtilizacaoCROTBean
14:59:23,727 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TrilhaAuditoriaDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/TrilhaAuditoriaDaoImpl!br.gov.caixa.lcr.dao.TrilhaAuditoriaDao
        java:app/lcr-ejb/TrilhaAuditoriaDaoImpl!br.gov.caixa.lcr.dao.TrilhaAuditoriaDao
        java:module/TrilhaAuditoriaDaoImpl!br.gov.caixa.lcr.dao.TrilhaAuditoriaDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/TrilhaAuditoriaDaoImpl!br.gov.caixa.lcr.dao.impl.TrilhaAuditoriaDaoImpl
        java:app/lcr-ejb/TrilhaAuditoriaDaoImpl!br.gov.caixa.lcr.dao.impl.TrilhaAuditoriaDaoImpl
        java:module/TrilhaAuditoriaDaoImpl!br.gov.caixa.lcr.dao.impl.TrilhaAuditoriaDaoImpl
14:59:23,727 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AmortizacaoBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/AmortizacaoBean!br.gov.caixa.lcr.service.impl.AmortizacaoBean
        java:app/lcr-ejb/AmortizacaoBean!br.gov.caixa.lcr.service.impl.AmortizacaoBean
        java:module/AmortizacaoBean!br.gov.caixa.lcr.service.impl.AmortizacaoBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/AmortizacaoBean!br.gov.caixa.lcr.service.AmortizacaoService
        java:app/lcr-ejb/AmortizacaoBean!br.gov.caixa.lcr.service.AmortizacaoService
        java:module/AmortizacaoBean!br.gov.caixa.lcr.service.AmortizacaoService
14:59:23,727 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TipoTarifaDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/TipoTarifaDaoImpl!br.gov.caixa.lcr.dao.impl.TipoTarifaDaoImpl
        java:app/lcr-ejb/TipoTarifaDaoImpl!br.gov.caixa.lcr.dao.impl.TipoTarifaDaoImpl
        java:module/TipoTarifaDaoImpl!br.gov.caixa.lcr.dao.impl.TipoTarifaDaoImpl
        java:global/sifec_lcr_1.117.1/lcr-ejb/TipoTarifaDaoImpl!br.gov.caixa.lcr.dao.TipoTarifaDao
        java:app/lcr-ejb/TipoTarifaDaoImpl!br.gov.caixa.lcr.dao.TipoTarifaDao
        java:module/TipoTarifaDaoImpl!br.gov.caixa.lcr.dao.TipoTarifaDao
14:59:23,727 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'InformacaoSIICODaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/InformacaoSIICODaoImpl!br.gov.caixa.lcr.dao.InformacaoSIICODao
        java:app/lcr-ejb/InformacaoSIICODaoImpl!br.gov.caixa.lcr.dao.InformacaoSIICODao
        java:module/InformacaoSIICODaoImpl!br.gov.caixa.lcr.dao.InformacaoSIICODao
        java:global/sifec_lcr_1.117.1/lcr-ejb/InformacaoSIICODaoImpl!br.gov.caixa.lcr.dao.impl.InformacaoSIICODaoImpl
        java:app/lcr-ejb/InformacaoSIICODaoImpl!br.gov.caixa.lcr.dao.impl.InformacaoSIICODaoImpl
        java:module/InformacaoSIICODaoImpl!br.gov.caixa.lcr.dao.impl.InformacaoSIICODaoImpl
14:59:23,727 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ParametroSistemaBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ParametroSistemaBean!br.gov.caixa.lcr.service.impl.ParametroSistemaBean
        java:app/lcr-ejb/ParametroSistemaBean!br.gov.caixa.lcr.service.impl.ParametroSistemaBean
        java:module/ParametroSistemaBean!br.gov.caixa.lcr.service.impl.ParametroSistemaBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/ParametroSistemaBean!br.gov.caixa.lcr.service.ParametroSistemaService
        java:app/lcr-ejb/ParametroSistemaBean!br.gov.caixa.lcr.service.ParametroSistemaService
        java:module/ParametroSistemaBean!br.gov.caixa.lcr.service.ParametroSistemaService
14:59:23,727 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TarifasPorProdutoDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/TarifasPorProdutoDaoImpl!br.gov.caixa.lcr.dao.TarifasPorProdutoDao
        java:app/lcr-ejb/TarifasPorProdutoDaoImpl!br.gov.caixa.lcr.dao.TarifasPorProdutoDao
        java:module/TarifasPorProdutoDaoImpl!br.gov.caixa.lcr.dao.TarifasPorProdutoDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/TarifasPorProdutoDaoImpl!br.gov.caixa.lcr.dao.impl.TarifasPorProdutoDaoImpl
        java:app/lcr-ejb/TarifasPorProdutoDaoImpl!br.gov.caixa.lcr.dao.impl.TarifasPorProdutoDaoImpl
        java:module/TarifasPorProdutoDaoImpl!br.gov.caixa.lcr.dao.impl.TarifasPorProdutoDaoImpl
14:59:23,727 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TipoServicoDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/TipoServicoDaoImpl!br.gov.caixa.lcr.dao.TipoServicoDao
        java:app/lcr-ejb/TipoServicoDaoImpl!br.gov.caixa.lcr.dao.TipoServicoDao
        java:module/TipoServicoDaoImpl!br.gov.caixa.lcr.dao.TipoServicoDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/TipoServicoDaoImpl!br.gov.caixa.lcr.dao.impl.TipoServicoDaoImpl
        java:app/lcr-ejb/TipoServicoDaoImpl!br.gov.caixa.lcr.dao.impl.TipoServicoDaoImpl
        java:module/TipoServicoDaoImpl!br.gov.caixa.lcr.dao.impl.TipoServicoDaoImpl
14:59:23,727 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TipoTarifaBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/TipoTarifaBean!br.gov.caixa.lcr.service.impl.TipoTarifaBean
        java:app/lcr-ejb/TipoTarifaBean!br.gov.caixa.lcr.service.impl.TipoTarifaBean
        java:module/TipoTarifaBean!br.gov.caixa.lcr.service.impl.TipoTarifaBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/TipoTarifaBean!br.gov.caixa.lcr.service.TipoTarifaService
        java:app/lcr-ejb/TipoTarifaBean!br.gov.caixa.lcr.service.TipoTarifaService
        java:module/TipoTarifaBean!br.gov.caixa.lcr.service.TipoTarifaService
14:59:23,727 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ExcepcionalizacaoTitulosBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ExcepcionalizacaoTitulosBean!br.gov.caixa.lcr.service.impl.ExcepcionalizacaoTitulosBean
        java:app/lcr-ejb/ExcepcionalizacaoTitulosBean!br.gov.caixa.lcr.service.impl.ExcepcionalizacaoTitulosBean
        java:module/ExcepcionalizacaoTitulosBean!br.gov.caixa.lcr.service.impl.ExcepcionalizacaoTitulosBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/ExcepcionalizacaoTitulosBean
        java:app/lcr-ejb/ExcepcionalizacaoTitulosBean
14:59:23,727 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ConformidadeSimtrService' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ConformidadeSimtrService!br.gov.caixa.lcr.simtr.service.ConformidadeSimtrService
        java:app/lcr-ejb/ConformidadeSimtrService!br.gov.caixa.lcr.simtr.service.ConformidadeSimtrService
        java:module/ConformidadeSimtrService!br.gov.caixa.lcr.simtr.service.ConformidadeSimtrService
        java:global/sifec_lcr_1.117.1/lcr-ejb/ConformidadeSimtrService
        java:app/lcr-ejb/ConformidadeSimtrService
14:59:23,727 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'UnidadeBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/UnidadeBean!br.gov.caixa.lcr.service.impl.UnidadeBean
        java:app/lcr-ejb/UnidadeBean!br.gov.caixa.lcr.service.impl.UnidadeBean
        java:module/UnidadeBean!br.gov.caixa.lcr.service.impl.UnidadeBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/UnidadeBean!br.gov.caixa.lcr.service.UnidadeService
        java:app/lcr-ejb/UnidadeBean!br.gov.caixa.lcr.service.UnidadeService
        java:module/UnidadeBean!br.gov.caixa.lcr.service.UnidadeService
14:59:23,727 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DadosClienteBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/DadosClienteBean!br.gov.caixa.lcr.service.DadosClienteService
        java:app/lcr-ejb/DadosClienteBean!br.gov.caixa.lcr.service.DadosClienteService
        java:module/DadosClienteBean!br.gov.caixa.lcr.service.DadosClienteService
        java:global/sifec_lcr_1.117.1/lcr-ejb/DadosClienteBean!br.gov.caixa.lcr.service.impl.DadosClienteBean
        java:app/lcr-ejb/DadosClienteBean!br.gov.caixa.lcr.service.impl.DadosClienteBean
        java:module/DadosClienteBean!br.gov.caixa.lcr.service.impl.DadosClienteBean
14:59:23,727 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'LogApiDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/LogApiDaoImpl!br.gov.caixa.lcr.api.log.dao.LogApiDao
        java:app/lcr-ejb/LogApiDaoImpl!br.gov.caixa.lcr.api.log.dao.LogApiDao
        java:module/LogApiDaoImpl!br.gov.caixa.lcr.api.log.dao.LogApiDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/LogApiDaoImpl!br.gov.caixa.lcr.api.log.dao.LogApiDaoImpl
        java:app/lcr-ejb/LogApiDaoImpl!br.gov.caixa.lcr.api.log.dao.LogApiDaoImpl
        java:module/LogApiDaoImpl!br.gov.caixa.lcr.api.log.dao.LogApiDaoImpl
14:59:23,728 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'InformacoesGerenciaisDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/InformacoesGerenciaisDaoImpl!br.gov.caixa.lcr.dao.InformacoesGerenciaisDao
        java:app/lcr-ejb/InformacoesGerenciaisDaoImpl!br.gov.caixa.lcr.dao.InformacoesGerenciaisDao
        java:module/InformacoesGerenciaisDaoImpl!br.gov.caixa.lcr.dao.InformacoesGerenciaisDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/InformacoesGerenciaisDaoImpl!br.gov.caixa.lcr.dao.impl.InformacoesGerenciaisDaoImpl
        java:app/lcr-ejb/InformacoesGerenciaisDaoImpl!br.gov.caixa.lcr.dao.impl.InformacoesGerenciaisDaoImpl
        java:module/InformacoesGerenciaisDaoImpl!br.gov.caixa.lcr.dao.impl.InformacoesGerenciaisDaoImpl
14:59:23,728 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContratoDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ContratoDaoImpl!br.gov.caixa.lcr.dao.ContratoDao
        java:app/lcr-ejb/ContratoDaoImpl!br.gov.caixa.lcr.dao.ContratoDao
        java:module/ContratoDaoImpl!br.gov.caixa.lcr.dao.ContratoDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/ContratoDaoImpl!br.gov.caixa.lcr.dao.impl.ContratoDaoImpl
        java:app/lcr-ejb/ContratoDaoImpl!br.gov.caixa.lcr.dao.impl.ContratoDaoImpl
        java:module/ContratoDaoImpl!br.gov.caixa.lcr.dao.impl.ContratoDaoImpl
14:59:23,728 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TipoServicoBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/TipoServicoBean!br.gov.caixa.lcr.service.impl.TipoServicoBean
        java:app/lcr-ejb/TipoServicoBean!br.gov.caixa.lcr.service.impl.TipoServicoBean
        java:module/TipoServicoBean!br.gov.caixa.lcr.service.impl.TipoServicoBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/TipoServicoBean!br.gov.caixa.lcr.service.TipoServicoService
        java:app/lcr-ejb/TipoServicoBean!br.gov.caixa.lcr.service.TipoServicoService
        java:module/TipoServicoBean!br.gov.caixa.lcr.service.TipoServicoService
14:59:23,728 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContratoRecuperacaoDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ContratoRecuperacaoDaoImpl!br.gov.caixa.lcr.dao.impl.ContratoRecuperacaoDaoImpl
        java:app/lcr-ejb/ContratoRecuperacaoDaoImpl!br.gov.caixa.lcr.dao.impl.ContratoRecuperacaoDaoImpl
        java:module/ContratoRecuperacaoDaoImpl!br.gov.caixa.lcr.dao.impl.ContratoRecuperacaoDaoImpl
        java:global/sifec_lcr_1.117.1/lcr-ejb/ContratoRecuperacaoDaoImpl!br.gov.caixa.lcr.dao.ContratoRecuperacaoDao
        java:app/lcr-ejb/ContratoRecuperacaoDaoImpl!br.gov.caixa.lcr.dao.ContratoRecuperacaoDao
        java:module/ContratoRecuperacaoDaoImpl!br.gov.caixa.lcr.dao.ContratoRecuperacaoDao
14:59:23,728 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'FuncionalidadeEspeciaoDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/FuncionalidadeEspeciaoDaoImpl!br.gov.caixa.lcr.dao.impl.FuncionalidadeEspeciaoDaoImpl
        java:app/lcr-ejb/FuncionalidadeEspeciaoDaoImpl!br.gov.caixa.lcr.dao.impl.FuncionalidadeEspeciaoDaoImpl
        java:module/FuncionalidadeEspeciaoDaoImpl!br.gov.caixa.lcr.dao.impl.FuncionalidadeEspeciaoDaoImpl
        java:global/sifec_lcr_1.117.1/lcr-ejb/FuncionalidadeEspeciaoDaoImpl
        java:app/lcr-ejb/FuncionalidadeEspeciaoDaoImpl
14:59:23,728 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContratoSemRatingRenovacaoDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ContratoSemRatingRenovacaoDaoImpl!br.gov.caixa.lcr.dao.impl.ContratoSemRatingRenovacaoDaoImpl
        java:app/lcr-ejb/ContratoSemRatingRenovacaoDaoImpl!br.gov.caixa.lcr.dao.impl.ContratoSemRatingRenovacaoDaoImpl
        java:module/ContratoSemRatingRenovacaoDaoImpl!br.gov.caixa.lcr.dao.impl.ContratoSemRatingRenovacaoDaoImpl
        java:global/sifec_lcr_1.117.1/lcr-ejb/ContratoSemRatingRenovacaoDaoImpl!br.gov.caixa.lcr.dao.ContratoSemRatingRenovacaoDao
        java:app/lcr-ejb/ContratoSemRatingRenovacaoDaoImpl!br.gov.caixa.lcr.dao.ContratoSemRatingRenovacaoDao
        java:module/ContratoSemRatingRenovacaoDaoImpl!br.gov.caixa.lcr.dao.ContratoSemRatingRenovacaoDao
14:59:23,728 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'CifBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/CifBean!br.gov.caixa.lcr.service.impl.CifBean
        java:app/lcr-ejb/CifBean!br.gov.caixa.lcr.service.impl.CifBean
        java:module/CifBean!br.gov.caixa.lcr.service.impl.CifBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/CifBean!br.gov.caixa.lcr.service.CifService
        java:app/lcr-ejb/CifBean!br.gov.caixa.lcr.service.CifService
        java:module/CifBean!br.gov.caixa.lcr.service.CifService
14:59:23,728 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContratoDetalheDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ContratoDetalheDaoImpl!br.gov.caixa.lcr.dao.ContratoDetalheDao
        java:app/lcr-ejb/ContratoDetalheDaoImpl!br.gov.caixa.lcr.dao.ContratoDetalheDao
        java:module/ContratoDetalheDaoImpl!br.gov.caixa.lcr.dao.ContratoDetalheDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/ContratoDetalheDaoImpl!br.gov.caixa.lcr.dao.impl.ContratoDetalheDaoImpl
        java:app/lcr-ejb/ContratoDetalheDaoImpl!br.gov.caixa.lcr.dao.impl.ContratoDetalheDaoImpl
        java:module/ContratoDetalheDaoImpl!br.gov.caixa.lcr.dao.impl.ContratoDetalheDaoImpl
14:59:23,728 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'PropostaContratacaoBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/PropostaContratacaoBean!br.gov.caixa.lcr.service.impl.PropostaContratacaoBean
        java:app/lcr-ejb/PropostaContratacaoBean!br.gov.caixa.lcr.service.impl.PropostaContratacaoBean
        java:module/PropostaContratacaoBean!br.gov.caixa.lcr.service.impl.PropostaContratacaoBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/PropostaContratacaoBean!br.gov.caixa.lcr.service.PropostaContratacaoService
        java:app/lcr-ejb/PropostaContratacaoBean!br.gov.caixa.lcr.service.PropostaContratacaoService
        java:module/PropostaContratacaoBean!br.gov.caixa.lcr.service.PropostaContratacaoService
14:59:23,728 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DocxToPdfServiceImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/DocxToPdfServiceImpl!br.gov.caixa.lcr.service.DocxToPdfService
        java:app/lcr-ejb/DocxToPdfServiceImpl!br.gov.caixa.lcr.service.DocxToPdfService
        java:module/DocxToPdfServiceImpl!br.gov.caixa.lcr.service.DocxToPdfService
        java:global/sifec_lcr_1.117.1/lcr-ejb/DocxToPdfServiceImpl
        java:app/lcr-ejb/DocxToPdfServiceImpl
14:59:23,728 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ValoresBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ValoresBean!br.gov.caixa.lcr.service.ValoresService
        java:app/lcr-ejb/ValoresBean!br.gov.caixa.lcr.service.ValoresService
        java:module/ValoresBean!br.gov.caixa.lcr.service.ValoresService
        java:global/sifec_lcr_1.117.1/lcr-ejb/ValoresBean!br.gov.caixa.lcr.service.impl.ValoresBean
        java:app/lcr-ejb/ValoresBean!br.gov.caixa.lcr.service.impl.ValoresBean
        java:module/ValoresBean!br.gov.caixa.lcr.service.impl.ValoresBean
14:59:23,728 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'PropriedadeBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/PropriedadeBean!br.gov.caixa.lcr.service.PropriedadeService
        java:app/lcr-ejb/PropriedadeBean!br.gov.caixa.lcr.service.PropriedadeService
        java:module/PropriedadeBean!br.gov.caixa.lcr.service.PropriedadeService
        java:global/sifec_lcr_1.117.1/lcr-ejb/PropriedadeBean!br.gov.caixa.lcr.service.impl.PropriedadeBean
        java:app/lcr-ejb/PropriedadeBean!br.gov.caixa.lcr.service.impl.PropriedadeBean
        java:module/PropriedadeBean!br.gov.caixa.lcr.service.impl.PropriedadeBean
14:59:23,728 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DeflatorProdutoDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/DeflatorProdutoDaoImpl!br.gov.caixa.lcr.dao.impl.DeflatorProdutoDaoImpl
        java:app/lcr-ejb/DeflatorProdutoDaoImpl!br.gov.caixa.lcr.dao.impl.DeflatorProdutoDaoImpl
        java:module/DeflatorProdutoDaoImpl!br.gov.caixa.lcr.dao.impl.DeflatorProdutoDaoImpl
        java:global/sifec_lcr_1.117.1/lcr-ejb/DeflatorProdutoDaoImpl!br.gov.caixa.lcr.dao.DeflatorProdutoDao
        java:app/lcr-ejb/DeflatorProdutoDaoImpl!br.gov.caixa.lcr.dao.DeflatorProdutoDao
        java:module/DeflatorProdutoDaoImpl!br.gov.caixa.lcr.dao.DeflatorProdutoDao
14:59:23,728 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DebitosProgramadosDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/DebitosProgramadosDaoImpl!br.gov.caixa.lcr.dao.DebitosProgramadosDao
        java:app/lcr-ejb/DebitosProgramadosDaoImpl!br.gov.caixa.lcr.dao.DebitosProgramadosDao
        java:module/DebitosProgramadosDaoImpl!br.gov.caixa.lcr.dao.DebitosProgramadosDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/DebitosProgramadosDaoImpl!br.gov.caixa.lcr.dao.impl.DebitosProgramadosDaoImpl
        java:app/lcr-ejb/DebitosProgramadosDaoImpl!br.gov.caixa.lcr.dao.impl.DebitosProgramadosDaoImpl
        java:module/DebitosProgramadosDaoImpl!br.gov.caixa.lcr.dao.impl.DebitosProgramadosDaoImpl
14:59:23,728 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MinutaPropostaDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/MinutaPropostaDaoImpl!br.gov.caixa.lcr.dao.MinutaPropostaDao
        java:app/lcr-ejb/MinutaPropostaDaoImpl!br.gov.caixa.lcr.dao.MinutaPropostaDao
        java:module/MinutaPropostaDaoImpl!br.gov.caixa.lcr.dao.MinutaPropostaDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/MinutaPropostaDaoImpl!br.gov.caixa.lcr.dao.impl.MinutaPropostaDaoImpl
        java:app/lcr-ejb/MinutaPropostaDaoImpl!br.gov.caixa.lcr.dao.impl.MinutaPropostaDaoImpl
        java:module/MinutaPropostaDaoImpl!br.gov.caixa.lcr.dao.impl.MinutaPropostaDaoImpl
14:59:23,728 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ServicoMinutaDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ServicoMinutaDaoImpl!br.gov.caixa.lcr.dao.ServicoMinutaDao
        java:app/lcr-ejb/ServicoMinutaDaoImpl!br.gov.caixa.lcr.dao.ServicoMinutaDao
        java:module/ServicoMinutaDaoImpl!br.gov.caixa.lcr.dao.ServicoMinutaDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/ServicoMinutaDaoImpl!br.gov.caixa.lcr.dao.impl.ServicoMinutaDaoImpl
        java:app/lcr-ejb/ServicoMinutaDaoImpl!br.gov.caixa.lcr.dao.impl.ServicoMinutaDaoImpl
        java:module/ServicoMinutaDaoImpl!br.gov.caixa.lcr.dao.impl.ServicoMinutaDaoImpl
14:59:23,728 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ServicoMinutaBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ServicoMinutaBean!br.gov.caixa.lcr.service.impl.ServicoMinutaBean
        java:app/lcr-ejb/ServicoMinutaBean!br.gov.caixa.lcr.service.impl.ServicoMinutaBean
        java:module/ServicoMinutaBean!br.gov.caixa.lcr.service.impl.ServicoMinutaBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/ServicoMinutaBean!br.gov.caixa.lcr.service.ServicoMinutaService
        java:app/lcr-ejb/ServicoMinutaBean!br.gov.caixa.lcr.service.ServicoMinutaService
        java:module/ServicoMinutaBean!br.gov.caixa.lcr.service.ServicoMinutaService
14:59:23,728 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SigcbDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/SigcbDaoImpl!br.gov.caixa.lcr.cobranca.dao.impl.SigcbDaoImpl
        java:app/lcr-ejb/SigcbDaoImpl!br.gov.caixa.lcr.cobranca.dao.impl.SigcbDaoImpl
        java:module/SigcbDaoImpl!br.gov.caixa.lcr.cobranca.dao.impl.SigcbDaoImpl
        java:global/sifec_lcr_1.117.1/lcr-ejb/SigcbDaoImpl!br.gov.caixa.lcr.cobranca.dao.SigcbDao
        java:app/lcr-ejb/SigcbDaoImpl!br.gov.caixa.lcr.cobranca.dao.SigcbDao
        java:module/SigcbDaoImpl!br.gov.caixa.lcr.cobranca.dao.SigcbDao
14:59:23,728 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'PropriedadeProdutoDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/PropriedadeProdutoDaoImpl!br.gov.caixa.lcr.dao.PropriedadeProdutoDao
        java:app/lcr-ejb/PropriedadeProdutoDaoImpl!br.gov.caixa.lcr.dao.PropriedadeProdutoDao
        java:module/PropriedadeProdutoDaoImpl!br.gov.caixa.lcr.dao.PropriedadeProdutoDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/PropriedadeProdutoDaoImpl!br.gov.caixa.lcr.dao.impl.PropriedadeProdutoDaoImpl
        java:app/lcr-ejb/PropriedadeProdutoDaoImpl!br.gov.caixa.lcr.dao.impl.PropriedadeProdutoDaoImpl
        java:module/PropriedadeProdutoDaoImpl!br.gov.caixa.lcr.dao.impl.PropriedadeProdutoDaoImpl
14:59:23,728 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'FuncionalidadesEspeciaisBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/FuncionalidadesEspeciaisBean!br.gov.caixa.lcr.service.impl.FuncionalidadesEspeciaisBean
        java:app/lcr-ejb/FuncionalidadesEspeciaisBean!br.gov.caixa.lcr.service.impl.FuncionalidadesEspeciaisBean
        java:module/FuncionalidadesEspeciaisBean!br.gov.caixa.lcr.service.impl.FuncionalidadesEspeciaisBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/FuncionalidadesEspeciaisBean
        java:app/lcr-ejb/FuncionalidadesEspeciaisBean
14:59:23,728 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContratacaoCanalDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ContratacaoCanalDaoImpl!br.gov.caixa.lcr.api.contratacao.dao.ContratacaoCanalDao
        java:app/lcr-ejb/ContratacaoCanalDaoImpl!br.gov.caixa.lcr.api.contratacao.dao.ContratacaoCanalDao
        java:module/ContratacaoCanalDaoImpl!br.gov.caixa.lcr.api.contratacao.dao.ContratacaoCanalDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/ContratacaoCanalDaoImpl!br.gov.caixa.lcr.api.contratacao.dao.impl.ContratacaoCanalDaoImpl
        java:app/lcr-ejb/ContratacaoCanalDaoImpl!br.gov.caixa.lcr.api.contratacao.dao.impl.ContratacaoCanalDaoImpl
        java:module/ContratacaoCanalDaoImpl!br.gov.caixa.lcr.api.contratacao.dao.impl.ContratacaoCanalDaoImpl
14:59:23,728 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MovimentacaoContestadaBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/MovimentacaoContestadaBean!br.gov.caixa.lcr.service.impl.MovimentacaoContestadaBean
        java:app/lcr-ejb/MovimentacaoContestadaBean!br.gov.caixa.lcr.service.impl.MovimentacaoContestadaBean
        java:module/MovimentacaoContestadaBean!br.gov.caixa.lcr.service.impl.MovimentacaoContestadaBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/MovimentacaoContestadaBean!br.gov.caixa.lcr.service.MovimentacaoContestadaService
        java:app/lcr-ejb/MovimentacaoContestadaBean!br.gov.caixa.lcr.service.MovimentacaoContestadaService
        java:module/MovimentacaoContestadaBean!br.gov.caixa.lcr.service.MovimentacaoContestadaService
14:59:23,729 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ProdutoContaCorrenteDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ProdutoContaCorrenteDaoImpl!br.gov.caixa.lcr.dao.impl.ProdutoContaCorrenteDaoImpl
        java:app/lcr-ejb/ProdutoContaCorrenteDaoImpl!br.gov.caixa.lcr.dao.impl.ProdutoContaCorrenteDaoImpl
        java:module/ProdutoContaCorrenteDaoImpl!br.gov.caixa.lcr.dao.impl.ProdutoContaCorrenteDaoImpl
        java:global/sifec_lcr_1.117.1/lcr-ejb/ProdutoContaCorrenteDaoImpl!br.gov.caixa.lcr.dao.ProdutoContaCorrenteDao
        java:app/lcr-ejb/ProdutoContaCorrenteDaoImpl!br.gov.caixa.lcr.dao.ProdutoContaCorrenteDao
        java:module/ProdutoContaCorrenteDaoImpl!br.gov.caixa.lcr.dao.ProdutoContaCorrenteDao
14:59:23,729 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TrilhaAuditoriaBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/TrilhaAuditoriaBean!br.gov.caixa.lcr.service.impl.TrilhaAuditoriaBean
        java:app/lcr-ejb/TrilhaAuditoriaBean!br.gov.caixa.lcr.service.impl.TrilhaAuditoriaBean
        java:module/TrilhaAuditoriaBean!br.gov.caixa.lcr.service.impl.TrilhaAuditoriaBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/TrilhaAuditoriaBean!br.gov.caixa.lcr.service.TrilhaAuditoriaService
        java:app/lcr-ejb/TrilhaAuditoriaBean!br.gov.caixa.lcr.service.TrilhaAuditoriaService
        java:module/TrilhaAuditoriaBean!br.gov.caixa.lcr.service.TrilhaAuditoriaService
14:59:23,729 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'InformacoesGerenciaisBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/InformacoesGerenciaisBean!br.gov.caixa.lcr.service.InformacoesGerenciaisService
        java:app/lcr-ejb/InformacoesGerenciaisBean!br.gov.caixa.lcr.service.InformacoesGerenciaisService
        java:module/InformacoesGerenciaisBean!br.gov.caixa.lcr.service.InformacoesGerenciaisService
        java:global/sifec_lcr_1.117.1/lcr-ejb/InformacoesGerenciaisBean!br.gov.caixa.lcr.service.impl.InformacoesGerenciaisBean
        java:app/lcr-ejb/InformacoesGerenciaisBean!br.gov.caixa.lcr.service.impl.InformacoesGerenciaisBean
        java:module/InformacoesGerenciaisBean!br.gov.caixa.lcr.service.impl.InformacoesGerenciaisBean
14:59:23,729 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EventoContabilBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/EventoContabilBean!br.gov.caixa.lcr.service.EventoContabilService
        java:app/lcr-ejb/EventoContabilBean!br.gov.caixa.lcr.service.EventoContabilService
        java:module/EventoContabilBean!br.gov.caixa.lcr.service.EventoContabilService
        java:global/sifec_lcr_1.117.1/lcr-ejb/EventoContabilBean!br.gov.caixa.lcr.service.impl.EventoContabilBean
        java:app/lcr-ejb/EventoContabilBean!br.gov.caixa.lcr.service.impl.EventoContabilBean
        java:module/EventoContabilBean!br.gov.caixa.lcr.service.impl.EventoContabilBean
14:59:23,729 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AliquotasIofDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/AliquotasIofDaoImpl!br.gov.caixa.lcr.dao.impl.AliquotasIofDaoImpl
        java:app/lcr-ejb/AliquotasIofDaoImpl!br.gov.caixa.lcr.dao.impl.AliquotasIofDaoImpl
        java:module/AliquotasIofDaoImpl!br.gov.caixa.lcr.dao.impl.AliquotasIofDaoImpl
        java:global/sifec_lcr_1.117.1/lcr-ejb/AliquotasIofDaoImpl
        java:app/lcr-ejb/AliquotasIofDaoImpl
14:59:23,729 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContratoRecuperacaoBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ContratoRecuperacaoBean!br.gov.caixa.lcr.service.ContratoRecuperacaoService
        java:app/lcr-ejb/ContratoRecuperacaoBean!br.gov.caixa.lcr.service.ContratoRecuperacaoService
        java:module/ContratoRecuperacaoBean!br.gov.caixa.lcr.service.ContratoRecuperacaoService
        java:global/sifec_lcr_1.117.1/lcr-ejb/ContratoRecuperacaoBean!br.gov.caixa.lcr.service.impl.ContratoRecuperacaoBean
        java:app/lcr-ejb/ContratoRecuperacaoBean!br.gov.caixa.lcr.service.impl.ContratoRecuperacaoBean
        java:module/ContratoRecuperacaoBean!br.gov.caixa.lcr.service.impl.ContratoRecuperacaoBean
14:59:23,729 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ConformidadeDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ConformidadeDaoImpl!br.gov.caixa.lcr.conformidade.dao.impl.ConformidadeDaoImpl
        java:app/lcr-ejb/ConformidadeDaoImpl!br.gov.caixa.lcr.conformidade.dao.impl.ConformidadeDaoImpl
        java:module/ConformidadeDaoImpl!br.gov.caixa.lcr.conformidade.dao.impl.ConformidadeDaoImpl
        java:global/sifec_lcr_1.117.1/lcr-ejb/ConformidadeDaoImpl
        java:app/lcr-ejb/ConformidadeDaoImpl
14:59:23,729 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AliquotasIofBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/AliquotasIofBean!br.gov.caixa.lcr.service.impl.AliquotasIofBean
        java:app/lcr-ejb/AliquotasIofBean!br.gov.caixa.lcr.service.impl.AliquotasIofBean
        java:module/AliquotasIofBean!br.gov.caixa.lcr.service.impl.AliquotasIofBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/AliquotasIofBean
        java:app/lcr-ejb/AliquotasIofBean
14:59:23,729 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SimtrDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/SimtrDaoImpl!br.gov.caixa.lcr.conformidade.dao.SimtrDao
        java:app/lcr-ejb/SimtrDaoImpl!br.gov.caixa.lcr.conformidade.dao.SimtrDao
        java:module/SimtrDaoImpl!br.gov.caixa.lcr.conformidade.dao.SimtrDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/SimtrDaoImpl!br.gov.caixa.lcr.conformidade.dao.impl.SimtrDaoImpl
        java:app/lcr-ejb/SimtrDaoImpl!br.gov.caixa.lcr.conformidade.dao.impl.SimtrDaoImpl
        java:module/SimtrDaoImpl!br.gov.caixa.lcr.conformidade.dao.impl.SimtrDaoImpl
14:59:23,729 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'BloqueioAgendaBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/BloqueioAgendaBean!br.gov.caixa.lcr.service.impl.BloqueioAgendaBean
        java:app/lcr-ejb/BloqueioAgendaBean!br.gov.caixa.lcr.service.impl.BloqueioAgendaBean
        java:module/BloqueioAgendaBean!br.gov.caixa.lcr.service.impl.BloqueioAgendaBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/BloqueioAgendaBean!br.gov.caixa.lcr.service.BloqueioAgendaService
        java:app/lcr-ejb/BloqueioAgendaBean!br.gov.caixa.lcr.service.BloqueioAgendaService
        java:module/BloqueioAgendaBean!br.gov.caixa.lcr.service.BloqueioAgendaService
14:59:23,729 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MovimentacaoContestadaDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/MovimentacaoContestadaDaoImpl!br.gov.caixa.lcr.dao.MovimentacaoContestadaDao
        java:app/lcr-ejb/MovimentacaoContestadaDaoImpl!br.gov.caixa.lcr.dao.MovimentacaoContestadaDao
        java:module/MovimentacaoContestadaDaoImpl!br.gov.caixa.lcr.dao.MovimentacaoContestadaDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/MovimentacaoContestadaDaoImpl!br.gov.caixa.lcr.dao.impl.MovimentacaoContestadaDaoImpl
        java:app/lcr-ejb/MovimentacaoContestadaDaoImpl!br.gov.caixa.lcr.dao.impl.MovimentacaoContestadaDaoImpl
        java:module/MovimentacaoContestadaDaoImpl!br.gov.caixa.lcr.dao.impl.MovimentacaoContestadaDaoImpl
14:59:23,729 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EmailBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/EmailBean!br.gov.caixa.lcr.service.impl.EmailBean
        java:app/lcr-ejb/EmailBean!br.gov.caixa.lcr.service.impl.EmailBean
        java:module/EmailBean!br.gov.caixa.lcr.service.impl.EmailBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/EmailBean!br.gov.caixa.lcr.service.EmailService
        java:app/lcr-ejb/EmailBean!br.gov.caixa.lcr.service.EmailService
        java:module/EmailBean!br.gov.caixa.lcr.service.EmailService
14:59:23,729 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MantemContratoCrotBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/MantemContratoCrotBean!br.gov.caixa.lcr.service.impl.MantemContratoCrotBean
        java:app/lcr-ejb/MantemContratoCrotBean!br.gov.caixa.lcr.service.impl.MantemContratoCrotBean
        java:module/MantemContratoCrotBean!br.gov.caixa.lcr.service.impl.MantemContratoCrotBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/MantemContratoCrotBean
        java:app/lcr-ejb/MantemContratoCrotBean
14:59:23,729 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SirmcBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/SirmcBean!br.gov.caixa.lcr.sirmc.service.impl.SirmcBean
        java:app/lcr-ejb/SirmcBean!br.gov.caixa.lcr.sirmc.service.impl.SirmcBean
        java:module/SirmcBean!br.gov.caixa.lcr.sirmc.service.impl.SirmcBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/SirmcBean!br.gov.caixa.lcr.sirmc.service.SirmcService
        java:app/lcr-ejb/SirmcBean!br.gov.caixa.lcr.sirmc.service.SirmcService
        java:module/SirmcBean!br.gov.caixa.lcr.sirmc.service.SirmcService
14:59:23,729 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'PlanilhaEvolucaoBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/PlanilhaEvolucaoBean!br.gov.caixa.lcr.service.impl.PlanilhaEvolucaoBean
        java:app/lcr-ejb/PlanilhaEvolucaoBean!br.gov.caixa.lcr.service.impl.PlanilhaEvolucaoBean
        java:module/PlanilhaEvolucaoBean!br.gov.caixa.lcr.service.impl.PlanilhaEvolucaoBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/PlanilhaEvolucaoBean!br.gov.caixa.lcr.service.PlanilhaEvolucaoService
        java:app/lcr-ejb/PlanilhaEvolucaoBean!br.gov.caixa.lcr.service.PlanilhaEvolucaoService
        java:module/PlanilhaEvolucaoBean!br.gov.caixa.lcr.service.PlanilhaEvolucaoService
14:59:23,729 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DadosClienteDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/DadosClienteDaoImpl!br.gov.caixa.lcr.dao.DadosClienteDao
        java:app/lcr-ejb/DadosClienteDaoImpl!br.gov.caixa.lcr.dao.DadosClienteDao
        java:module/DadosClienteDaoImpl!br.gov.caixa.lcr.dao.DadosClienteDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/DadosClienteDaoImpl!br.gov.caixa.lcr.dao.impl.DadosClienteDaoImpl
        java:app/lcr-ejb/DadosClienteDaoImpl!br.gov.caixa.lcr.dao.impl.DadosClienteDaoImpl
        java:module/DadosClienteDaoImpl!br.gov.caixa.lcr.dao.impl.DadosClienteDaoImpl
14:59:23,729 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContaNsgdBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ContaNsgdBean!br.gov.caixa.lcr.service.impl.ContaNsgdBean
        java:app/lcr-ejb/ContaNsgdBean!br.gov.caixa.lcr.service.impl.ContaNsgdBean
        java:module/ContaNsgdBean!br.gov.caixa.lcr.service.impl.ContaNsgdBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/ContaNsgdBean!br.gov.caixa.lcr.service.ContaNsgdService
        java:app/lcr-ejb/ContaNsgdBean!br.gov.caixa.lcr.service.ContaNsgdService
        java:module/ContaNsgdBean!br.gov.caixa.lcr.service.ContaNsgdService
14:59:23,729 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EstornoEncargoDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/EstornoEncargoDaoImpl!br.gov.caixa.lcr.dao.impl.EstornoEncargoDaoImpl
        java:app/lcr-ejb/EstornoEncargoDaoImpl!br.gov.caixa.lcr.dao.impl.EstornoEncargoDaoImpl
        java:module/EstornoEncargoDaoImpl!br.gov.caixa.lcr.dao.impl.EstornoEncargoDaoImpl
        java:global/sifec_lcr_1.117.1/lcr-ejb/EstornoEncargoDaoImpl!br.gov.caixa.lcr.dao.EstornoEncargoDao
        java:app/lcr-ejb/EstornoEncargoDaoImpl!br.gov.caixa.lcr.dao.EstornoEncargoDao
        java:module/EstornoEncargoDaoImpl!br.gov.caixa.lcr.dao.EstornoEncargoDao
14:59:23,729 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ProdutoContaCorrenteBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ProdutoContaCorrenteBean!br.gov.caixa.lcr.service.ProdutoContaCorrenteService
        java:app/lcr-ejb/ProdutoContaCorrenteBean!br.gov.caixa.lcr.service.ProdutoContaCorrenteService
        java:module/ProdutoContaCorrenteBean!br.gov.caixa.lcr.service.ProdutoContaCorrenteService
        java:global/sifec_lcr_1.117.1/lcr-ejb/ProdutoContaCorrenteBean!br.gov.caixa.lcr.service.impl.ProdutoContaCorrenteBean
        java:app/lcr-ejb/ProdutoContaCorrenteBean!br.gov.caixa.lcr.service.impl.ProdutoContaCorrenteBean
        java:module/ProdutoContaCorrenteBean!br.gov.caixa.lcr.service.impl.ProdutoContaCorrenteBean
14:59:23,729 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'PeriodicidadeMensagemBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/PeriodicidadeMensagemBean!br.gov.caixa.lcr.service.impl.PeriodicidadeMensagemBean
        java:app/lcr-ejb/PeriodicidadeMensagemBean!br.gov.caixa.lcr.service.impl.PeriodicidadeMensagemBean
        java:module/PeriodicidadeMensagemBean!br.gov.caixa.lcr.service.impl.PeriodicidadeMensagemBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/PeriodicidadeMensagemBean!br.gov.caixa.lcr.service.PeriodicidadeMensagemService
        java:app/lcr-ejb/PeriodicidadeMensagemBean!br.gov.caixa.lcr.service.PeriodicidadeMensagemService
        java:module/PeriodicidadeMensagemBean!br.gov.caixa.lcr.service.PeriodicidadeMensagemService
14:59:23,729 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'InformacoesCorporativasService' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/InformacoesCorporativasService!br.gov.caixa.lcr.siico.service.InformacoesCorporativasService
        java:app/lcr-ejb/InformacoesCorporativasService!br.gov.caixa.lcr.siico.service.InformacoesCorporativasService
        java:module/InformacoesCorporativasService!br.gov.caixa.lcr.siico.service.InformacoesCorporativasService
        java:global/sifec_lcr_1.117.1/lcr-ejb/InformacoesCorporativasService
        java:app/lcr-ejb/InformacoesCorporativasService
14:59:23,729 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MensagemDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/MensagemDaoImpl!br.gov.caixa.lcr.dao.MensagemDao
        java:app/lcr-ejb/MensagemDaoImpl!br.gov.caixa.lcr.dao.MensagemDao
        java:module/MensagemDaoImpl!br.gov.caixa.lcr.dao.MensagemDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/MensagemDaoImpl!br.gov.caixa.lcr.dao.impl.MensagemDaoImpl
        java:app/lcr-ejb/MensagemDaoImpl!br.gov.caixa.lcr.dao.impl.MensagemDaoImpl
        java:module/MensagemDaoImpl!br.gov.caixa.lcr.dao.impl.MensagemDaoImpl
14:59:23,729 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AjustesOperacionalDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/AjustesOperacionalDaoImpl!br.gov.caixa.lcr.dao.impl.AjustesOperacionalDaoImpl
        java:app/lcr-ejb/AjustesOperacionalDaoImpl!br.gov.caixa.lcr.dao.impl.AjustesOperacionalDaoImpl
        java:module/AjustesOperacionalDaoImpl!br.gov.caixa.lcr.dao.impl.AjustesOperacionalDaoImpl
        java:global/sifec_lcr_1.117.1/lcr-ejb/AjustesOperacionalDaoImpl!br.gov.caixa.lcr.dao.AjustesOperacionalDao
        java:app/lcr-ejb/AjustesOperacionalDaoImpl!br.gov.caixa.lcr.dao.AjustesOperacionalDao
        java:module/AjustesOperacionalDaoImpl!br.gov.caixa.lcr.dao.AjustesOperacionalDao
14:59:23,729 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ProdutoDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ProdutoDaoImpl!br.gov.caixa.lcr.dao.impl.ProdutoDaoImpl
        java:app/lcr-ejb/ProdutoDaoImpl!br.gov.caixa.lcr.dao.impl.ProdutoDaoImpl
        java:module/ProdutoDaoImpl!br.gov.caixa.lcr.dao.impl.ProdutoDaoImpl
        java:global/sifec_lcr_1.117.1/lcr-ejb/ProdutoDaoImpl!br.gov.caixa.lcr.dao.ProdutoDao
        java:app/lcr-ejb/ProdutoDaoImpl!br.gov.caixa.lcr.dao.ProdutoDao
        java:module/ProdutoDaoImpl!br.gov.caixa.lcr.dao.ProdutoDao
14:59:23,730 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'GarantiaPFBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/GarantiaPFBean!br.gov.caixa.lcr.service.GarantiaPFService
        java:app/lcr-ejb/GarantiaPFBean!br.gov.caixa.lcr.service.GarantiaPFService
        java:module/GarantiaPFBean!br.gov.caixa.lcr.service.GarantiaPFService
        java:global/sifec_lcr_1.117.1/lcr-ejb/GarantiaPFBean!br.gov.caixa.lcr.service.impl.GarantiaPFBean
        java:app/lcr-ejb/GarantiaPFBean!br.gov.caixa.lcr.service.impl.GarantiaPFBean
        java:module/GarantiaPFBean!br.gov.caixa.lcr.service.impl.GarantiaPFBean
14:59:23,730 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'PropostaContratacaoCanalDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/PropostaContratacaoCanalDaoImpl!br.gov.caixa.lcr.api.proposta.dao.PropostaContratacaoCanalDao
        java:app/lcr-ejb/PropostaContratacaoCanalDaoImpl!br.gov.caixa.lcr.api.proposta.dao.PropostaContratacaoCanalDao
        java:module/PropostaContratacaoCanalDaoImpl!br.gov.caixa.lcr.api.proposta.dao.PropostaContratacaoCanalDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/PropostaContratacaoCanalDaoImpl!br.gov.caixa.lcr.api.proposta.dao.impl.PropostaContratacaoCanalDaoImpl
        java:app/lcr-ejb/PropostaContratacaoCanalDaoImpl!br.gov.caixa.lcr.api.proposta.dao.impl.PropostaContratacaoCanalDaoImpl
        java:module/PropostaContratacaoCanalDaoImpl!br.gov.caixa.lcr.api.proposta.dao.impl.PropostaContratacaoCanalDaoImpl
14:59:23,730 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContrataProdutoCrotBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ContrataProdutoCrotBean!br.gov.caixa.lcr.service.ContrataProdutoCrotService
        java:app/lcr-ejb/ContrataProdutoCrotBean!br.gov.caixa.lcr.service.ContrataProdutoCrotService
        java:module/ContrataProdutoCrotBean!br.gov.caixa.lcr.service.ContrataProdutoCrotService
        java:global/sifec_lcr_1.117.1/lcr-ejb/ContrataProdutoCrotBean!br.gov.caixa.lcr.service.impl.ContrataProdutoCrotBean
        java:app/lcr-ejb/ContrataProdutoCrotBean!br.gov.caixa.lcr.service.impl.ContrataProdutoCrotBean
        java:module/ContrataProdutoCrotBean!br.gov.caixa.lcr.service.impl.ContrataProdutoCrotBean
14:59:23,730 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'LotacaoDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/LotacaoDaoImpl!br.gov.caixa.lcr.dao.LotacaoDao
        java:app/lcr-ejb/LotacaoDaoImpl!br.gov.caixa.lcr.dao.LotacaoDao
        java:module/LotacaoDaoImpl!br.gov.caixa.lcr.dao.LotacaoDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/LotacaoDaoImpl!br.gov.caixa.lcr.dao.impl.LotacaoDaoImpl
        java:app/lcr-ejb/LotacaoDaoImpl!br.gov.caixa.lcr.dao.impl.LotacaoDaoImpl
        java:module/LotacaoDaoImpl!br.gov.caixa.lcr.dao.impl.LotacaoDaoImpl
14:59:23,730 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MockAberturaContaBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/MockAberturaContaBean!br.gov.caixa.lcr.mock.conta.service.MockAberturaContaBean
        java:app/lcr-ejb/MockAberturaContaBean!br.gov.caixa.lcr.mock.conta.service.MockAberturaContaBean
        java:module/MockAberturaContaBean!br.gov.caixa.lcr.mock.conta.service.MockAberturaContaBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/MockAberturaContaBean!br.gov.caixa.lcr.mock.conta.service.MockAberturaContaService
        java:app/lcr-ejb/MockAberturaContaBean!br.gov.caixa.lcr.mock.conta.service.MockAberturaContaService
        java:module/MockAberturaContaBean!br.gov.caixa.lcr.mock.conta.service.MockAberturaContaService
14:59:23,730 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ParametrosGeraisDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ParametrosGeraisDaoImpl!br.gov.caixa.lcr.dao.ParametrosGeraisDao
        java:app/lcr-ejb/ParametrosGeraisDaoImpl!br.gov.caixa.lcr.dao.ParametrosGeraisDao
        java:module/ParametrosGeraisDaoImpl!br.gov.caixa.lcr.dao.ParametrosGeraisDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/ParametrosGeraisDaoImpl!br.gov.caixa.lcr.dao.impl.ParametrosGeraisDaoImpl
        java:app/lcr-ejb/ParametrosGeraisDaoImpl!br.gov.caixa.lcr.dao.impl.ParametrosGeraisDaoImpl
        java:module/ParametrosGeraisDaoImpl!br.gov.caixa.lcr.dao.impl.ParametrosGeraisDaoImpl
14:59:23,730 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EmailDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/EmailDaoImpl!br.gov.caixa.lcr.dao.EmailDao
        java:app/lcr-ejb/EmailDaoImpl!br.gov.caixa.lcr.dao.EmailDao
        java:module/EmailDaoImpl!br.gov.caixa.lcr.dao.EmailDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/EmailDaoImpl!br.gov.caixa.lcr.dao.impl.EmailDaoImpl
        java:app/lcr-ejb/EmailDaoImpl!br.gov.caixa.lcr.dao.impl.EmailDaoImpl
        java:module/EmailDaoImpl!br.gov.caixa.lcr.dao.impl.EmailDaoImpl
14:59:23,730 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SacadosImpedidosBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/SacadosImpedidosBean!br.gov.caixa.lcr.service.SacadosImpedidosService
        java:app/lcr-ejb/SacadosImpedidosBean!br.gov.caixa.lcr.service.SacadosImpedidosService
        java:module/SacadosImpedidosBean!br.gov.caixa.lcr.service.SacadosImpedidosService
        java:global/sifec_lcr_1.117.1/lcr-ejb/SacadosImpedidosBean!br.gov.caixa.lcr.service.impl.SacadosImpedidosBean
        java:app/lcr-ejb/SacadosImpedidosBean!br.gov.caixa.lcr.service.impl.SacadosImpedidosBean
        java:module/SacadosImpedidosBean!br.gov.caixa.lcr.service.impl.SacadosImpedidosBean
14:59:23,730 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AvaliacaoRiscoDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/AvaliacaoRiscoDaoImpl!br.gov.caixa.lcr.dao.impl.AvaliacaoRiscoDaoImpl
        java:app/lcr-ejb/AvaliacaoRiscoDaoImpl!br.gov.caixa.lcr.dao.impl.AvaliacaoRiscoDaoImpl
        java:module/AvaliacaoRiscoDaoImpl!br.gov.caixa.lcr.dao.impl.AvaliacaoRiscoDaoImpl
        java:global/sifec_lcr_1.117.1/lcr-ejb/AvaliacaoRiscoDaoImpl!br.gov.caixa.lcr.dao.AvaliacaoRiscoDao
        java:app/lcr-ejb/AvaliacaoRiscoDaoImpl!br.gov.caixa.lcr.dao.AvaliacaoRiscoDao
        java:module/AvaliacaoRiscoDaoImpl!br.gov.caixa.lcr.dao.AvaliacaoRiscoDao
14:59:23,730 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ControleProcessamentoDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ControleProcessamentoDaoImpl!br.gov.caixa.lcr.dao.impl.ControleProcessamentoDaoImpl
        java:app/lcr-ejb/ControleProcessamentoDaoImpl!br.gov.caixa.lcr.dao.impl.ControleProcessamentoDaoImpl
        java:module/ControleProcessamentoDaoImpl!br.gov.caixa.lcr.dao.impl.ControleProcessamentoDaoImpl
        java:global/sifec_lcr_1.117.1/lcr-ejb/ControleProcessamentoDaoImpl!br.gov.caixa.lcr.dao.ControleProcessamentoDao
        java:app/lcr-ejb/ControleProcessamentoDaoImpl!br.gov.caixa.lcr.dao.ControleProcessamentoDao
        java:module/ControleProcessamentoDaoImpl!br.gov.caixa.lcr.dao.ControleProcessamentoDao
14:59:23,730 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'PropriedadeProdutoBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/PropriedadeProdutoBean!br.gov.caixa.lcr.service.impl.PropriedadeProdutoBean
        java:app/lcr-ejb/PropriedadeProdutoBean!br.gov.caixa.lcr.service.impl.PropriedadeProdutoBean
        java:module/PropriedadeProdutoBean!br.gov.caixa.lcr.service.impl.PropriedadeProdutoBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/PropriedadeProdutoBean!br.gov.caixa.lcr.service.PropriedadeProdutoService
        java:app/lcr-ejb/PropriedadeProdutoBean!br.gov.caixa.lcr.service.PropriedadeProdutoService
        java:module/PropriedadeProdutoBean!br.gov.caixa.lcr.service.PropriedadeProdutoService
14:59:23,730 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SimulacaoRecuperacaoBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/SimulacaoRecuperacaoBean!br.gov.caixa.lcr.service.SimulacaoRecuperacaoService
        java:app/lcr-ejb/SimulacaoRecuperacaoBean!br.gov.caixa.lcr.service.SimulacaoRecuperacaoService
        java:module/SimulacaoRecuperacaoBean!br.gov.caixa.lcr.service.SimulacaoRecuperacaoService
        java:global/sifec_lcr_1.117.1/lcr-ejb/SimulacaoRecuperacaoBean!br.gov.caixa.lcr.service.impl.SimulacaoRecuperacaoBean
        java:app/lcr-ejb/SimulacaoRecuperacaoBean!br.gov.caixa.lcr.service.impl.SimulacaoRecuperacaoBean
        java:module/SimulacaoRecuperacaoBean!br.gov.caixa.lcr.service.impl.SimulacaoRecuperacaoBean
14:59:23,730 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'PlanilhaEvolucaoDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/PlanilhaEvolucaoDaoImpl!br.gov.caixa.lcr.dao.impl.PlanilhaEvolucaoDaoImpl
        java:app/lcr-ejb/PlanilhaEvolucaoDaoImpl!br.gov.caixa.lcr.dao.impl.PlanilhaEvolucaoDaoImpl
        java:module/PlanilhaEvolucaoDaoImpl!br.gov.caixa.lcr.dao.impl.PlanilhaEvolucaoDaoImpl
        java:global/sifec_lcr_1.117.1/lcr-ejb/PlanilhaEvolucaoDaoImpl!br.gov.caixa.lcr.dao.PlanilhaEvolucaoDao
        java:app/lcr-ejb/PlanilhaEvolucaoDaoImpl!br.gov.caixa.lcr.dao.PlanilhaEvolucaoDao
        java:module/PlanilhaEvolucaoDaoImpl!br.gov.caixa.lcr.dao.PlanilhaEvolucaoDao
14:59:23,730 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'LogApiBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/LogApiBean!br.gov.caixa.lcr.api.log.service.LogApiBean
        java:app/lcr-ejb/LogApiBean!br.gov.caixa.lcr.api.log.service.LogApiBean
        java:module/LogApiBean!br.gov.caixa.lcr.api.log.service.LogApiBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/LogApiBean!br.gov.caixa.lcr.api.log.service.LogApiService
        java:app/lcr-ejb/LogApiBean!br.gov.caixa.lcr.api.log.service.LogApiService
        java:module/LogApiBean!br.gov.caixa.lcr.api.log.service.LogApiService
14:59:23,730 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ControleProcessamentoBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ControleProcessamentoBean!br.gov.caixa.lcr.service.ControleProcessamentoService
        java:app/lcr-ejb/ControleProcessamentoBean!br.gov.caixa.lcr.service.ControleProcessamentoService
        java:module/ControleProcessamentoBean!br.gov.caixa.lcr.service.ControleProcessamentoService
        java:global/sifec_lcr_1.117.1/lcr-ejb/ControleProcessamentoBean!br.gov.caixa.lcr.service.impl.ControleProcessamentoBean
        java:app/lcr-ejb/ControleProcessamentoBean!br.gov.caixa.lcr.service.impl.ControleProcessamentoBean
        java:module/ControleProcessamentoBean!br.gov.caixa.lcr.service.impl.ControleProcessamentoBean
14:59:23,730 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MinutaContratoBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/MinutaContratoBean!br.gov.caixa.lcr.service.impl.MinutaContratoBean
        java:app/lcr-ejb/MinutaContratoBean!br.gov.caixa.lcr.service.impl.MinutaContratoBean
        java:module/MinutaContratoBean!br.gov.caixa.lcr.service.impl.MinutaContratoBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/MinutaContratoBean!br.gov.caixa.lcr.service.MinutaContratoService
        java:app/lcr-ejb/MinutaContratoBean!br.gov.caixa.lcr.service.MinutaContratoService
        java:module/MinutaContratoBean!br.gov.caixa.lcr.service.MinutaContratoService
14:59:23,730 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SiacgDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/SiacgDaoImpl!br.gov.caixa.lcr.siacg.dao.SiacgDao
        java:app/lcr-ejb/SiacgDaoImpl!br.gov.caixa.lcr.siacg.dao.SiacgDao
        java:module/SiacgDaoImpl!br.gov.caixa.lcr.siacg.dao.SiacgDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/SiacgDaoImpl!br.gov.caixa.lcr.siacg.dao.impl.SiacgDaoImpl
        java:app/lcr-ejb/SiacgDaoImpl!br.gov.caixa.lcr.siacg.dao.impl.SiacgDaoImpl
        java:module/SiacgDaoImpl!br.gov.caixa.lcr.siacg.dao.impl.SiacgDaoImpl
14:59:23,730 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MatrizIndexadoresBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/MatrizIndexadoresBean!br.gov.caixa.lcr.service.MatrizIndexadoresService
        java:app/lcr-ejb/MatrizIndexadoresBean!br.gov.caixa.lcr.service.MatrizIndexadoresService
        java:module/MatrizIndexadoresBean!br.gov.caixa.lcr.service.MatrizIndexadoresService
        java:global/sifec_lcr_1.117.1/lcr-ejb/MatrizIndexadoresBean!br.gov.caixa.lcr.service.impl.MatrizIndexadoresBean
        java:app/lcr-ejb/MatrizIndexadoresBean!br.gov.caixa.lcr.service.impl.MatrizIndexadoresBean
        java:module/MatrizIndexadoresBean!br.gov.caixa.lcr.service.impl.MatrizIndexadoresBean
14:59:23,730 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AjustesOperacionalBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/AjustesOperacionalBean!br.gov.caixa.lcr.service.AjustesOperacionalService
        java:app/lcr-ejb/AjustesOperacionalBean!br.gov.caixa.lcr.service.AjustesOperacionalService
        java:module/AjustesOperacionalBean!br.gov.caixa.lcr.service.AjustesOperacionalService
        java:global/sifec_lcr_1.117.1/lcr-ejb/AjustesOperacionalBean!br.gov.caixa.lcr.service.impl.AjustesOperacionalBean
        java:app/lcr-ejb/AjustesOperacionalBean!br.gov.caixa.lcr.service.impl.AjustesOperacionalBean
        java:module/AjustesOperacionalBean!br.gov.caixa.lcr.service.impl.AjustesOperacionalBean
14:59:23,730 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContratosSemRatingRenovacaoBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ContratosSemRatingRenovacaoBean!br.gov.caixa.lcr.service.ContratosSemRatingRenovacaoService
        java:app/lcr-ejb/ContratosSemRatingRenovacaoBean!br.gov.caixa.lcr.service.ContratosSemRatingRenovacaoService
        java:module/ContratosSemRatingRenovacaoBean!br.gov.caixa.lcr.service.ContratosSemRatingRenovacaoService
        java:global/sifec_lcr_1.117.1/lcr-ejb/ContratosSemRatingRenovacaoBean!br.gov.caixa.lcr.service.impl.ContratosSemRatingRenovacaoBean
        java:app/lcr-ejb/ContratosSemRatingRenovacaoBean!br.gov.caixa.lcr.service.impl.ContratosSemRatingRenovacaoBean
        java:module/ContratosSemRatingRenovacaoBean!br.gov.caixa.lcr.service.impl.ContratosSemRatingRenovacaoBean
14:59:23,730 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'SimulacaoRecuperacaoDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/SimulacaoRecuperacaoDaoImpl!br.gov.caixa.lcr.dao.SimulacaoRecuperacaoDao
        java:app/lcr-ejb/SimulacaoRecuperacaoDaoImpl!br.gov.caixa.lcr.dao.SimulacaoRecuperacaoDao
        java:module/SimulacaoRecuperacaoDaoImpl!br.gov.caixa.lcr.dao.SimulacaoRecuperacaoDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/SimulacaoRecuperacaoDaoImpl!br.gov.caixa.lcr.dao.impl.SimulacaoRecuperacaoDaoImpl
        java:app/lcr-ejb/SimulacaoRecuperacaoDaoImpl!br.gov.caixa.lcr.dao.impl.SimulacaoRecuperacaoDaoImpl
        java:module/SimulacaoRecuperacaoDaoImpl!br.gov.caixa.lcr.dao.impl.SimulacaoRecuperacaoDaoImpl
14:59:23,731 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'CobrancaBancariaDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/CobrancaBancariaDaoImpl!br.gov.caixa.lcr.dao.CobrancaBancariaDao
        java:app/lcr-ejb/CobrancaBancariaDaoImpl!br.gov.caixa.lcr.dao.CobrancaBancariaDao
        java:module/CobrancaBancariaDaoImpl!br.gov.caixa.lcr.dao.CobrancaBancariaDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/CobrancaBancariaDaoImpl!br.gov.caixa.lcr.dao.impl.CobrancaBancariaDaoImpl
        java:app/lcr-ejb/CobrancaBancariaDaoImpl!br.gov.caixa.lcr.dao.impl.CobrancaBancariaDaoImpl
        java:module/CobrancaBancariaDaoImpl!br.gov.caixa.lcr.dao.impl.CobrancaBancariaDaoImpl
14:59:23,731 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DebitosProgramadosBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/DebitosProgramadosBean!br.gov.caixa.lcr.service.DebitosProgramadosService
        java:app/lcr-ejb/DebitosProgramadosBean!br.gov.caixa.lcr.service.DebitosProgramadosService
        java:module/DebitosProgramadosBean!br.gov.caixa.lcr.service.DebitosProgramadosService
        java:global/sifec_lcr_1.117.1/lcr-ejb/DebitosProgramadosBean!br.gov.caixa.lcr.service.impl.DebitosProgramadosBean
        java:app/lcr-ejb/DebitosProgramadosBean!br.gov.caixa.lcr.service.impl.DebitosProgramadosBean
        java:module/DebitosProgramadosBean!br.gov.caixa.lcr.service.impl.DebitosProgramadosBean
14:59:23,731 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ModeloMinutaDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ModeloMinutaDaoImpl!br.gov.caixa.lcr.dao.ModeloMinutaDao
        java:app/lcr-ejb/ModeloMinutaDaoImpl!br.gov.caixa.lcr.dao.ModeloMinutaDao
        java:module/ModeloMinutaDaoImpl!br.gov.caixa.lcr.dao.ModeloMinutaDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/ModeloMinutaDaoImpl!br.gov.caixa.lcr.dao.impl.ModeloMinutaDaoImpl
        java:app/lcr-ejb/ModeloMinutaDaoImpl!br.gov.caixa.lcr.dao.impl.ModeloMinutaDaoImpl
        java:module/ModeloMinutaDaoImpl!br.gov.caixa.lcr.dao.impl.ModeloMinutaDaoImpl
14:59:23,731 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ParametrosProdutoCanalDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ParametrosProdutoCanalDaoImpl!br.gov.caixa.lcr.dao.impl.ParametrosProdutoCanalDaoImpl
        java:app/lcr-ejb/ParametrosProdutoCanalDaoImpl!br.gov.caixa.lcr.dao.impl.ParametrosProdutoCanalDaoImpl
        java:module/ParametrosProdutoCanalDaoImpl!br.gov.caixa.lcr.dao.impl.ParametrosProdutoCanalDaoImpl
        java:global/sifec_lcr_1.117.1/lcr-ejb/ParametrosProdutoCanalDaoImpl
        java:app/lcr-ejb/ParametrosProdutoCanalDaoImpl
14:59:23,731 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DeflatorProdutoBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/DeflatorProdutoBean!br.gov.caixa.lcr.service.DeflatorProdutoService
        java:app/lcr-ejb/DeflatorProdutoBean!br.gov.caixa.lcr.service.DeflatorProdutoService
        java:module/DeflatorProdutoBean!br.gov.caixa.lcr.service.DeflatorProdutoService
        java:global/sifec_lcr_1.117.1/lcr-ejb/DeflatorProdutoBean!br.gov.caixa.lcr.service.impl.DeflatorProdutoBean
        java:app/lcr-ejb/DeflatorProdutoBean!br.gov.caixa.lcr.service.impl.DeflatorProdutoBean
        java:module/DeflatorProdutoBean!br.gov.caixa.lcr.service.impl.DeflatorProdutoBean
14:59:23,731 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'AmortizacaoDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/AmortizacaoDaoImpl!br.gov.caixa.lcr.dao.impl.AmortizacaoDaoImpl
        java:app/lcr-ejb/AmortizacaoDaoImpl!br.gov.caixa.lcr.dao.impl.AmortizacaoDaoImpl
        java:module/AmortizacaoDaoImpl!br.gov.caixa.lcr.dao.impl.AmortizacaoDaoImpl
        java:global/sifec_lcr_1.117.1/lcr-ejb/AmortizacaoDaoImpl
        java:app/lcr-ejb/AmortizacaoDaoImpl
14:59:23,731 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'FatoOperacionalEventoDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/FatoOperacionalEventoDaoImpl!br.gov.caixa.lcr.dao.FatoOperacionalEventoDao
        java:app/lcr-ejb/FatoOperacionalEventoDaoImpl!br.gov.caixa.lcr.dao.FatoOperacionalEventoDao
        java:module/FatoOperacionalEventoDaoImpl!br.gov.caixa.lcr.dao.FatoOperacionalEventoDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/FatoOperacionalEventoDaoImpl!br.gov.caixa.lcr.dao.impl.FatoOperacionalEventoDaoImpl
        java:app/lcr-ejb/FatoOperacionalEventoDaoImpl!br.gov.caixa.lcr.dao.impl.FatoOperacionalEventoDaoImpl
        java:module/FatoOperacionalEventoDaoImpl!br.gov.caixa.lcr.dao.impl.FatoOperacionalEventoDaoImpl
14:59:23,731 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'PerdaOperacionalBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/PerdaOperacionalBean!br.gov.caixa.lcr.service.impl.PerdaOperacionalBean
        java:app/lcr-ejb/PerdaOperacionalBean!br.gov.caixa.lcr.service.impl.PerdaOperacionalBean
        java:module/PerdaOperacionalBean!br.gov.caixa.lcr.service.impl.PerdaOperacionalBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/PerdaOperacionalBean!br.gov.caixa.lcr.service.PerdaOperacionalService
        java:app/lcr-ejb/PerdaOperacionalBean!br.gov.caixa.lcr.service.PerdaOperacionalService
        java:module/PerdaOperacionalBean!br.gov.caixa.lcr.service.PerdaOperacionalService
14:59:23,731 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MatrizIndexadoresDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/MatrizIndexadoresDaoImpl!br.gov.caixa.lcr.dao.impl.MatrizIndexadoresDaoImpl
        java:app/lcr-ejb/MatrizIndexadoresDaoImpl!br.gov.caixa.lcr.dao.impl.MatrizIndexadoresDaoImpl
        java:module/MatrizIndexadoresDaoImpl!br.gov.caixa.lcr.dao.impl.MatrizIndexadoresDaoImpl
        java:global/sifec_lcr_1.117.1/lcr-ejb/MatrizIndexadoresDaoImpl
        java:app/lcr-ejb/MatrizIndexadoresDaoImpl
14:59:23,731 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'EventoContabilDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/EventoContabilDaoImpl!br.gov.caixa.lcr.dao.EventoContabilDao
        java:app/lcr-ejb/EventoContabilDaoImpl!br.gov.caixa.lcr.dao.EventoContabilDao
        java:module/EventoContabilDaoImpl!br.gov.caixa.lcr.dao.EventoContabilDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/EventoContabilDaoImpl!br.gov.caixa.lcr.dao.impl.EventoContabilDaoImpl
        java:app/lcr-ejb/EventoContabilDaoImpl!br.gov.caixa.lcr.dao.impl.EventoContabilDaoImpl
        java:module/EventoContabilDaoImpl!br.gov.caixa.lcr.dao.impl.EventoContabilDaoImpl
14:59:23,731 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'FatoOperacionalEventoBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/FatoOperacionalEventoBean!br.gov.caixa.lcr.service.impl.FatoOperacionalEventoBean
        java:app/lcr-ejb/FatoOperacionalEventoBean!br.gov.caixa.lcr.service.impl.FatoOperacionalEventoBean
        java:module/FatoOperacionalEventoBean!br.gov.caixa.lcr.service.impl.FatoOperacionalEventoBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/FatoOperacionalEventoBean!br.gov.caixa.lcr.service.FatoOperacionalEventoService
        java:app/lcr-ejb/FatoOperacionalEventoBean!br.gov.caixa.lcr.service.FatoOperacionalEventoService
        java:module/FatoOperacionalEventoBean!br.gov.caixa.lcr.service.FatoOperacionalEventoService
14:59:23,731 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ExcepcionalizacaoDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ExcepcionalizacaoDaoImpl!br.gov.caixa.lcr.dao.impl.ExcepcionalizacaoDaoImpl
        java:app/lcr-ejb/ExcepcionalizacaoDaoImpl!br.gov.caixa.lcr.dao.impl.ExcepcionalizacaoDaoImpl
        java:module/ExcepcionalizacaoDaoImpl!br.gov.caixa.lcr.dao.impl.ExcepcionalizacaoDaoImpl
        java:global/sifec_lcr_1.117.1/lcr-ejb/ExcepcionalizacaoDaoImpl!br.gov.caixa.lcr.dao.ExcepcionalizacaoTitulosDao
        java:app/lcr-ejb/ExcepcionalizacaoDaoImpl!br.gov.caixa.lcr.dao.ExcepcionalizacaoTitulosDao
        java:module/ExcepcionalizacaoDaoImpl!br.gov.caixa.lcr.dao.ExcepcionalizacaoTitulosDao
14:59:23,731 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'GarantiaPJBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/GarantiaPJBean!br.gov.caixa.lcr.service.GarantiaPJService
        java:app/lcr-ejb/GarantiaPJBean!br.gov.caixa.lcr.service.GarantiaPJService
        java:module/GarantiaPJBean!br.gov.caixa.lcr.service.GarantiaPJService
        java:global/sifec_lcr_1.117.1/lcr-ejb/GarantiaPJBean!br.gov.caixa.lcr.service.impl.GarantiaPJBean
        java:app/lcr-ejb/GarantiaPJBean!br.gov.caixa.lcr.service.impl.GarantiaPJBean
        java:module/GarantiaPJBean!br.gov.caixa.lcr.service.impl.GarantiaPJBean
14:59:23,731 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ParametrosGeraisBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ParametrosGeraisBean!br.gov.caixa.lcr.service.ParametrosGeraisService
        java:app/lcr-ejb/ParametrosGeraisBean!br.gov.caixa.lcr.service.ParametrosGeraisService
        java:module/ParametrosGeraisBean!br.gov.caixa.lcr.service.ParametrosGeraisService
        java:global/sifec_lcr_1.117.1/lcr-ejb/ParametrosGeraisBean!br.gov.caixa.lcr.service.impl.ParametrosGeraisBean
        java:app/lcr-ejb/ParametrosGeraisBean!br.gov.caixa.lcr.service.impl.ParametrosGeraisBean
        java:module/ParametrosGeraisBean!br.gov.caixa.lcr.service.impl.ParametrosGeraisBean
14:59:23,731 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'CessaoCarteiraDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/CessaoCarteiraDaoImpl!br.gov.caixa.lcr.dao.CessaoCarteiraDao
        java:app/lcr-ejb/CessaoCarteiraDaoImpl!br.gov.caixa.lcr.dao.CessaoCarteiraDao
        java:module/CessaoCarteiraDaoImpl!br.gov.caixa.lcr.dao.CessaoCarteiraDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/CessaoCarteiraDaoImpl!br.gov.caixa.lcr.dao.impl.CessaoCarteiraDaoImpl
        java:app/lcr-ejb/CessaoCarteiraDaoImpl!br.gov.caixa.lcr.dao.impl.CessaoCarteiraDaoImpl
        java:module/CessaoCarteiraDaoImpl!br.gov.caixa.lcr.dao.impl.CessaoCarteiraDaoImpl
14:59:23,731 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'TarifaProdutoBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/TarifaProdutoBean!br.gov.caixa.lcr.service.TarifaProdutoService
        java:app/lcr-ejb/TarifaProdutoBean!br.gov.caixa.lcr.service.TarifaProdutoService
        java:module/TarifaProdutoBean!br.gov.caixa.lcr.service.TarifaProdutoService
        java:global/sifec_lcr_1.117.1/lcr-ejb/TarifaProdutoBean!br.gov.caixa.lcr.service.impl.TarifaProdutoBean
        java:app/lcr-ejb/TarifaProdutoBean!br.gov.caixa.lcr.service.impl.TarifaProdutoBean
        java:module/TarifaProdutoBean!br.gov.caixa.lcr.service.impl.TarifaProdutoBean
14:59:23,731 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'DossieProdutoClient' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/DossieProdutoClient!br.gov.caixa.lcr.simtr.client.DossieProdutoClient
        java:app/lcr-ejb/DossieProdutoClient!br.gov.caixa.lcr.simtr.client.DossieProdutoClient
        java:module/DossieProdutoClient!br.gov.caixa.lcr.simtr.client.DossieProdutoClient
        java:global/sifec_lcr_1.117.1/lcr-ejb/DossieProdutoClient
        java:app/lcr-ejb/DossieProdutoClient
14:59:23,731 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MinutaContratoDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/MinutaContratoDaoImpl!br.gov.caixa.lcr.dao.MinutaContratoDao
        java:app/lcr-ejb/MinutaContratoDaoImpl!br.gov.caixa.lcr.dao.MinutaContratoDao
        java:module/MinutaContratoDaoImpl!br.gov.caixa.lcr.dao.MinutaContratoDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/MinutaContratoDaoImpl!br.gov.caixa.lcr.dao.impl.MinutaContratoDaoImpl
        java:app/lcr-ejb/MinutaContratoDaoImpl!br.gov.caixa.lcr.dao.impl.MinutaContratoDaoImpl
        java:module/MinutaContratoDaoImpl!br.gov.caixa.lcr.dao.impl.MinutaContratoDaoImpl
14:59:23,731 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContratoBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ContratoBean!br.gov.caixa.lcr.service.impl.ContratoBean
        java:app/lcr-ejb/ContratoBean!br.gov.caixa.lcr.service.impl.ContratoBean
        java:module/ContratoBean!br.gov.caixa.lcr.service.impl.ContratoBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/ContratoBean!br.gov.caixa.lcr.service.ContratoService
        java:app/lcr-ejb/ContratoBean!br.gov.caixa.lcr.service.ContratoService
        java:module/ContratoBean!br.gov.caixa.lcr.service.ContratoService
14:59:23,731 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContratacaoExcepcionalDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ContratacaoExcepcionalDaoImpl!br.gov.caixa.lcr.dao.impl.ContratacaoExcepcionalDaoImpl
        java:app/lcr-ejb/ContratacaoExcepcionalDaoImpl!br.gov.caixa.lcr.dao.impl.ContratacaoExcepcionalDaoImpl
        java:module/ContratacaoExcepcionalDaoImpl!br.gov.caixa.lcr.dao.impl.ContratacaoExcepcionalDaoImpl
        java:global/sifec_lcr_1.117.1/lcr-ejb/ContratacaoExcepcionalDaoImpl!br.gov.caixa.lcr.dao.ContratacaoExcepcionalDao
        java:app/lcr-ejb/ContratacaoExcepcionalDaoImpl!br.gov.caixa.lcr.dao.ContratacaoExcepcionalDao
        java:module/ContratacaoExcepcionalDaoImpl!br.gov.caixa.lcr.dao.ContratacaoExcepcionalDao
14:59:23,731 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'CobrancaBancariaBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/CobrancaBancariaBean!br.gov.caixa.lcr.cobranca.service.CobrancaBancariaService
        java:app/lcr-ejb/CobrancaBancariaBean!br.gov.caixa.lcr.cobranca.service.CobrancaBancariaService
        java:module/CobrancaBancariaBean!br.gov.caixa.lcr.cobranca.service.CobrancaBancariaService
        java:global/sifec_lcr_1.117.1/lcr-ejb/CobrancaBancariaBean!br.gov.caixa.lcr.cobranca.service.impl.CobrancaBancariaBean
        java:app/lcr-ejb/CobrancaBancariaBean!br.gov.caixa.lcr.cobranca.service.impl.CobrancaBancariaBean
        java:module/CobrancaBancariaBean!br.gov.caixa.lcr.cobranca.service.impl.CobrancaBancariaBean
14:59:23,731 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'GrupoContabilBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/GrupoContabilBean!br.gov.caixa.lcr.service.impl.GrupoContabilBean
        java:app/lcr-ejb/GrupoContabilBean!br.gov.caixa.lcr.service.impl.GrupoContabilBean
        java:module/GrupoContabilBean!br.gov.caixa.lcr.service.impl.GrupoContabilBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/GrupoContabilBean!br.gov.caixa.lcr.service.GrupoContabilService
        java:app/lcr-ejb/GrupoContabilBean!br.gov.caixa.lcr.service.GrupoContabilService
        java:module/GrupoContabilBean!br.gov.caixa.lcr.service.GrupoContabilService
14:59:23,731 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'HostConnection' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/HostConnection!br.gov.caixa.lcr.service.impl.HostConnection
        java:app/lcr-ejb/HostConnection!br.gov.caixa.lcr.service.impl.HostConnection
        java:module/HostConnection!br.gov.caixa.lcr.service.impl.HostConnection
        java:global/sifec_lcr_1.117.1/lcr-ejb/HostConnection
        java:app/lcr-ejb/HostConnection
14:59:23,731 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'GarantiasPFePJBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/GarantiasPFePJBean!br.gov.caixa.lcr.service.impl.GarantiasPFePJBean
        java:app/lcr-ejb/GarantiasPFePJBean!br.gov.caixa.lcr.service.impl.GarantiasPFePJBean
        java:module/GarantiasPFePJBean!br.gov.caixa.lcr.service.impl.GarantiasPFePJBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/GarantiasPFePJBean!br.gov.caixa.lcr.service.GarantiaPFePJService
        java:app/lcr-ejb/GarantiasPFePJBean!br.gov.caixa.lcr.service.GarantiaPFePJService
        java:module/GarantiasPFePJBean!br.gov.caixa.lcr.service.GarantiaPFePJService
14:59:23,732 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ContratacaoExcepcionalBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ContratacaoExcepcionalBean!br.gov.caixa.lcr.service.ContratacaoExcepcionalService
        java:app/lcr-ejb/ContratacaoExcepcionalBean!br.gov.caixa.lcr.service.ContratacaoExcepcionalService
        java:module/ContratacaoExcepcionalBean!br.gov.caixa.lcr.service.ContratacaoExcepcionalService
        java:global/sifec_lcr_1.117.1/lcr-ejb/ContratacaoExcepcionalBean!br.gov.caixa.lcr.service.impl.ContratacaoExcepcionalBean
        java:app/lcr-ejb/ContratacaoExcepcionalBean!br.gov.caixa.lcr.service.impl.ContratacaoExcepcionalBean
        java:module/ContratacaoExcepcionalBean!br.gov.caixa.lcr.service.impl.ContratacaoExcepcionalBean
14:59:23,732 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MinutaTermoAlienacaoBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/MinutaTermoAlienacaoBean!br.gov.caixa.lcr.service.MinutaTermoAlienacaoService
        java:app/lcr-ejb/MinutaTermoAlienacaoBean!br.gov.caixa.lcr.service.MinutaTermoAlienacaoService
        java:module/MinutaTermoAlienacaoBean!br.gov.caixa.lcr.service.MinutaTermoAlienacaoService
        java:global/sifec_lcr_1.117.1/lcr-ejb/MinutaTermoAlienacaoBean!br.gov.caixa.lcr.service.impl.MinutaTermoAlienacaoBean
        java:app/lcr-ejb/MinutaTermoAlienacaoBean!br.gov.caixa.lcr.service.impl.MinutaTermoAlienacaoBean
        java:module/MinutaTermoAlienacaoBean!br.gov.caixa.lcr.service.impl.MinutaTermoAlienacaoBean
14:59:23,732 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MensagemBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/MensagemBean!br.gov.caixa.lcr.service.MensagemService
        java:app/lcr-ejb/MensagemBean!br.gov.caixa.lcr.service.MensagemService
        java:module/MensagemBean!br.gov.caixa.lcr.service.MensagemService
        java:global/sifec_lcr_1.117.1/lcr-ejb/MensagemBean!br.gov.caixa.lcr.service.impl.MensagemBean
        java:app/lcr-ejb/MensagemBean!br.gov.caixa.lcr.service.impl.MensagemBean
        java:module/MensagemBean!br.gov.caixa.lcr.service.impl.MensagemBean
14:59:23,732 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'MinutaTermoAlienacaoDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/MinutaTermoAlienacaoDaoImpl!br.gov.caixa.lcr.dao.MinutaTermoAlienacaoDao
        java:app/lcr-ejb/MinutaTermoAlienacaoDaoImpl!br.gov.caixa.lcr.dao.MinutaTermoAlienacaoDao
        java:module/MinutaTermoAlienacaoDaoImpl!br.gov.caixa.lcr.dao.MinutaTermoAlienacaoDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/MinutaTermoAlienacaoDaoImpl!br.gov.caixa.lcr.dao.impl.MinutaTermoAlienacaoDaoImpl
        java:app/lcr-ejb/MinutaTermoAlienacaoDaoImpl!br.gov.caixa.lcr.dao.impl.MinutaTermoAlienacaoDaoImpl
        java:module/MinutaTermoAlienacaoDaoImpl!br.gov.caixa.lcr.dao.impl.MinutaTermoAlienacaoDaoImpl
14:59:23,732 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'FatoOperacionalBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/FatoOperacionalBean!br.gov.caixa.lcr.service.FatoOperacionalService
        java:app/lcr-ejb/FatoOperacionalBean!br.gov.caixa.lcr.service.FatoOperacionalService
        java:module/FatoOperacionalBean!br.gov.caixa.lcr.service.FatoOperacionalService
        java:global/sifec_lcr_1.117.1/lcr-ejb/FatoOperacionalBean!br.gov.caixa.lcr.service.impl.FatoOperacionalBean
        java:app/lcr-ejb/FatoOperacionalBean!br.gov.caixa.lcr.service.impl.FatoOperacionalBean
        java:module/FatoOperacionalBean!br.gov.caixa.lcr.service.impl.FatoOperacionalBean
14:59:23,732 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ModeloMinutaBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ModeloMinutaBean!br.gov.caixa.lcr.service.ModeloMinutaService
        java:app/lcr-ejb/ModeloMinutaBean!br.gov.caixa.lcr.service.ModeloMinutaService
        java:module/ModeloMinutaBean!br.gov.caixa.lcr.service.ModeloMinutaService
        java:global/sifec_lcr_1.117.1/lcr-ejb/ModeloMinutaBean!br.gov.caixa.lcr.service.impl.ModeloMinutaBean
        java:app/lcr-ejb/ModeloMinutaBean!br.gov.caixa.lcr.service.impl.ModeloMinutaBean
        java:module/ModeloMinutaBean!br.gov.caixa.lcr.service.impl.ModeloMinutaBean
14:59:23,732 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'CifDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/CifDaoImpl!br.gov.caixa.lcr.dao.CifDao
        java:app/lcr-ejb/CifDaoImpl!br.gov.caixa.lcr.dao.CifDao
        java:module/CifDaoImpl!br.gov.caixa.lcr.dao.CifDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/CifDaoImpl!br.gov.caixa.lcr.dao.impl.CifDaoImpl
        java:app/lcr-ejb/CifDaoImpl!br.gov.caixa.lcr.dao.impl.CifDaoImpl
        java:module/CifDaoImpl!br.gov.caixa.lcr.dao.impl.CifDaoImpl
14:59:23,732 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'ParametroSistemaDaoImpl' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/ParametroSistemaDaoImpl!br.gov.caixa.lcr.dao.ParametroSistemaDao
        java:app/lcr-ejb/ParametroSistemaDaoImpl!br.gov.caixa.lcr.dao.ParametroSistemaDao
        java:module/ParametroSistemaDaoImpl!br.gov.caixa.lcr.dao.ParametroSistemaDao
        java:global/sifec_lcr_1.117.1/lcr-ejb/ParametroSistemaDaoImpl!br.gov.caixa.lcr.dao.impl.ParametroSistemaDaoImpl
        java:app/lcr-ejb/ParametroSistemaDaoImpl!br.gov.caixa.lcr.dao.impl.ParametroSistemaDaoImpl
        java:module/ParametroSistemaDaoImpl!br.gov.caixa.lcr.dao.impl.ParametroSistemaDaoImpl
14:59:23,732 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-4) WFLYEJB0473: As associações JNDI para o bean de sessão chamado 'InformacaoSIICOBean' na unidade de implementação 'subdeployment "lcr-ejb.jar" of deployment "sifec_lcr_1.117.1.ear"' são como segue:
        java:global/sifec_lcr_1.117.1/lcr-ejb/InformacaoSIICOBean!br.gov.caixa.lcr.service.impl.InformacaoSIICOBean
        java:app/lcr-ejb/InformacaoSIICOBean!br.gov.caixa.lcr.service.impl.InformacaoSIICOBean
        java:module/InformacaoSIICOBean!br.gov.caixa.lcr.service.impl.InformacaoSIICOBean
        java:global/sifec_lcr_1.117.1/lcr-ejb/InformacaoSIICOBean!br.gov.caixa.lcr.service.InformacaoSIICOService
        java:app/lcr-ejb/InformacaoSIICOBean!br.gov.caixa.lcr.service.InformacaoSIICOService
        java:module/InformacaoSIICOBean!br.gov.caixa.lcr.service.InformacaoSIICOService
14:59:23,778 INFO  [org.jipijapa] (MSC service thread 1-3) JIPIORMV53020253: Cache de segundo nível habilitado para sifec_lcr_1.117.1.ear#fecDS
14:59:23,991 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 143) WFLYJPA0010: Iniciando unidade de persistência (fase 2 de 2) Serviço'sifec_lcr_1.117.1.ear#fecDS'
14:59:26,876 INFO  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 4) WELD-000119: Not generating any bean definitions from br.gov.caixa.lcr.core.security.SecurityInterceptor because of underlying class loading error: Type org.jboss.resteasy.core.ResourceMethod from [Module "deployment.sifec_lcr_1.117.1.ear.lcr-ejb.jar" from Service Module Loader] not found.  If this is unexpected, enable DEBUG logging to see the full error.
14:59:27,040 INFO  [org.jboss.weld.Bootstrap] (Weld Thread Pool -- 7) WELD-000119: Not generating any bean definitions from br.gov.caixa.arqrefcore.util.ArquillianHelper because of underlying class loading error: Type org.jboss.shrinkwrap.api.asset.Asset from [Module "deployment.sifec_lcr_1.117.1.ear" from Service Module Loader] not found.  If this is unexpected, enable DEBUG logging to see the full error.
14:59:27,934 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-2) MSC000001: Failed to start service jboss.deployment.unit."sifec_lcr_1.117.1.ear".WeldStartService: org.jboss.msc.service.StartException in service jboss.deployment.unit."sifec_lcr_1.117.1.ear".WeldStartService: Failed to start service
Caused by: org.jboss.weld.exceptions.DeploymentException: Exception List with 9 exceptions:
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type SirmcDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject br.gov.caixa.lcr.sirmc.service.impl.SirmcBean.sirmcDao
  at br.gov.caixa.lcr.sirmc.service.impl.SirmcBean.sirmcDao(SirmcBean.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type MatrizIndexadoresDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.service.impl.MatrizIndexadoresBean.matrizIndexadoresDao
  at br.gov.caixa.lcr.service.impl.MatrizIndexadoresBean.matrizIndexadoresDao(MatrizIndexadoresBean.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type AliquotasIofDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.service.impl.AliquotasIofBean.dao
  at br.gov.caixa.lcr.service.impl.AliquotasIofBean.dao(AliquotasIofBean.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type ConformidadeDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.simtr.service.ConformidadeSimtrService.conformidadeDao
  at br.gov.caixa.lcr.simtr.service.ConformidadeSimtrService.conformidadeDao(ConformidadeSimtrService.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type FuncionalidadeEspecialDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.service.impl.FuncionalidadesEspeciaisBean.dao
  at br.gov.caixa.lcr.service.impl.FuncionalidadesEspeciaisBean.dao(FuncionalidadesEspeciaisBean.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type ParametrosProdutoCanalDao with qualifiers @Default
  at injection point [BackedAnnotatedParameter] Parameter 1 of [BackedAnnotatedConstructor] @Inject public br.gov.caixa.lcr.service.impl.ParametrosProdutoCanalBean(ParametrosProdutoCanalDao)
  at br.gov.caixa.lcr.service.impl.ParametrosProdutoCanalBean.<init>(ParametrosProdutoCanalBean.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type DadosSICLIDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.sicli.service.impl.DadosSICLIBean.dao
  at br.gov.caixa.lcr.sicli.service.impl.DadosSICLIBean.dao(DadosSICLIBean.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type AmortizacaoDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.service.impl.AmortizacaoBean.amortizacaoDao
  at br.gov.caixa.lcr.service.impl.AmortizacaoBean.amortizacaoDao(AmortizacaoBean.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type ConformidadeDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.conformidade.service.impl.ConformidadeBean.conformidadeDao
  at br.gov.caixa.lcr.conformidade.service.impl.ConformidadeBean.conformidadeDao(ConformidadeBean.java:0)
        Suppressed: org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type SirmcDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject br.gov.caixa.lcr.sirmc.service.impl.SirmcBean.sirmcDao
  at br.gov.caixa.lcr.sirmc.service.impl.SirmcBean.sirmcDao(SirmcBean.java:0)
        Suppressed: org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type MatrizIndexadoresDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.service.impl.MatrizIndexadoresBean.matrizIndexadoresDao
  at br.gov.caixa.lcr.service.impl.MatrizIndexadoresBean.matrizIndexadoresDao(MatrizIndexadoresBean.java:0)
        Suppressed: org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type AliquotasIofDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.service.impl.AliquotasIofBean.dao
  at br.gov.caixa.lcr.service.impl.AliquotasIofBean.dao(AliquotasIofBean.java:0)
        Suppressed: org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type ConformidadeDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.simtr.service.ConformidadeSimtrService.conformidadeDao
  at br.gov.caixa.lcr.simtr.service.ConformidadeSimtrService.conformidadeDao(ConformidadeSimtrService.java:0)
        Suppressed: org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type FuncionalidadeEspecialDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.service.impl.FuncionalidadesEspeciaisBean.dao
  at br.gov.caixa.lcr.service.impl.FuncionalidadesEspeciaisBean.dao(FuncionalidadesEspeciaisBean.java:0)
        Suppressed: org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type ParametrosProdutoCanalDao with qualifiers @Default
  at injection point [BackedAnnotatedParameter] Parameter 1 of [BackedAnnotatedConstructor] @Inject public br.gov.caixa.lcr.service.impl.ParametrosProdutoCanalBean(ParametrosProdutoCanalDao)
  at br.gov.caixa.lcr.service.impl.ParametrosProdutoCanalBean.<init>(ParametrosProdutoCanalBean.java:0)
        Suppressed: org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type DadosSICLIDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.sicli.service.impl.DadosSICLIBean.dao
  at br.gov.caixa.lcr.sicli.service.impl.DadosSICLIBean.dao(DadosSICLIBean.java:0)
        Suppressed: org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type AmortizacaoDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.service.impl.AmortizacaoBean.amortizacaoDao
  at br.gov.caixa.lcr.service.impl.AmortizacaoBean.amortizacaoDao(AmortizacaoBean.java:0)
        Suppressed: org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type ConformidadeDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.conformidade.service.impl.ConformidadeBean.conformidadeDao
  at br.gov.caixa.lcr.conformidade.service.impl.ConformidadeBean.conformidadeDao(ConformidadeBean.java:0)
14:59:27,945 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 150) WFLYCTL0013: Falha na operação ("add") - endereço ([("deployment" => "SILCR")]) - falha na descrição: {"WFLYCTL0080: Falha de serviços" => {"jboss.deployment.unit.\"sifec_lcr_1.117.1.ear\".WeldStartService" => "Failed to start service
    Caused by: org.jboss.weld.exceptions.DeploymentException: Exception List with 9 exceptions:
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type SirmcDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject br.gov.caixa.lcr.sirmc.service.impl.SirmcBean.sirmcDao
  at br.gov.caixa.lcr.sirmc.service.impl.SirmcBean.sirmcDao(SirmcBean.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type MatrizIndexadoresDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.service.impl.MatrizIndexadoresBean.matrizIndexadoresDao
  at br.gov.caixa.lcr.service.impl.MatrizIndexadoresBean.matrizIndexadoresDao(MatrizIndexadoresBean.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type AliquotasIofDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.service.impl.AliquotasIofBean.dao
  at br.gov.caixa.lcr.service.impl.AliquotasIofBean.dao(AliquotasIofBean.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type ConformidadeDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.simtr.service.ConformidadeSimtrService.conformidadeDao
  at br.gov.caixa.lcr.simtr.service.ConformidadeSimtrService.conformidadeDao(ConformidadeSimtrService.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type FuncionalidadeEspecialDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.service.impl.FuncionalidadesEspeciaisBean.dao
  at br.gov.caixa.lcr.service.impl.FuncionalidadesEspeciaisBean.dao(FuncionalidadesEspeciaisBean.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type ParametrosProdutoCanalDao with qualifiers @Default
  at injection point [BackedAnnotatedParameter] Parameter 1 of [BackedAnnotatedConstructor] @Inject public br.gov.caixa.lcr.service.impl.ParametrosProdutoCanalBean(ParametrosProdutoCanalDao)
  at br.gov.caixa.lcr.service.impl.ParametrosProdutoCanalBean.<init>(ParametrosProdutoCanalBean.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type DadosSICLIDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.sicli.service.impl.DadosSICLIBean.dao
  at br.gov.caixa.lcr.sicli.service.impl.DadosSICLIBean.dao(DadosSICLIBean.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type AmortizacaoDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.service.impl.AmortizacaoBean.amortizacaoDao
  at br.gov.caixa.lcr.service.impl.AmortizacaoBean.amortizacaoDao(AmortizacaoBean.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type ConformidadeDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.conformidade.service.impl.ConformidadeBean.conformidadeDao
  at br.gov.caixa.lcr.conformidade.service.impl.ConformidadeBean.conformidadeDao(ConformidadeBean.java:0)
14:59:27,945 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 150) WFLYCTL0013: Falha na operação ("add") - endereço ([("deployment" => "SILCR")]) - falha na descrição: {"WFLYCTL0080: Falha de serviços" => {"jboss.deployment.unit.\"sifec_lcr_1.117.1.ear\".WeldStartService" => "Failed to start service
    Caused by: org.jboss.weld.exceptions.DeploymentException: Exception List with 9 exceptions:
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type SirmcDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject br.gov.caixa.lcr.sirmc.service.impl.SirmcBean.sirmcDao
  at br.gov.caixa.lcr.sirmc.service.impl.SirmcBean.sirmcDao(SirmcBean.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type MatrizIndexadoresDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.service.impl.MatrizIndexadoresBean.matrizIndexadoresDao
  at br.gov.caixa.lcr.service.impl.MatrizIndexadoresBean.matrizIndexadoresDao(MatrizIndexadoresBean.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type AliquotasIofDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.service.impl.AliquotasIofBean.dao
  at br.gov.caixa.lcr.service.impl.AliquotasIofBean.dao(AliquotasIofBean.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type ConformidadeDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.simtr.service.ConformidadeSimtrService.conformidadeDao
  at br.gov.caixa.lcr.simtr.service.ConformidadeSimtrService.conformidadeDao(ConformidadeSimtrService.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type FuncionalidadeEspecialDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.service.impl.FuncionalidadesEspeciaisBean.dao
  at br.gov.caixa.lcr.service.impl.FuncionalidadesEspeciaisBean.dao(FuncionalidadesEspeciaisBean.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type ParametrosProdutoCanalDao with qualifiers @Default
  at injection point [BackedAnnotatedParameter] Parameter 1 of [BackedAnnotatedConstructor] @Inject public br.gov.caixa.lcr.service.impl.ParametrosProdutoCanalBean(ParametrosProdutoCanalDao)
  at br.gov.caixa.lcr.service.impl.ParametrosProdutoCanalBean.<init>(ParametrosProdutoCanalBean.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type DadosSICLIDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.sicli.service.impl.DadosSICLIBean.dao
  at br.gov.caixa.lcr.sicli.service.impl.DadosSICLIBean.dao(DadosSICLIBean.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type AmortizacaoDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.service.impl.AmortizacaoBean.amortizacaoDao
  at br.gov.caixa.lcr.service.impl.AmortizacaoBean.amortizacaoDao(AmortizacaoBean.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type ConformidadeDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.conformidade.service.impl.ConformidadeBean.conformidadeDao
  at br.gov.caixa.lcr.conformidade.service.impl.ConformidadeBean.conformidadeDao(ConformidadeBean.java:0)
14:59:27,948 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 150) WFLYSRV0021: O procedimento da implantação "sifec_lcr_1.117.1.ear" foi revertido com mensagem de falha:
{"WFLYCTL0080: Falha de serviços" => {"jboss.deployment.unit.\"sifec_lcr_1.117.1.ear\".WeldStartService" => "Failed to start service
    Caused by: org.jboss.weld.exceptions.DeploymentException: Exception List with 9 exceptions:
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type SirmcDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject br.gov.caixa.lcr.sirmc.service.impl.SirmcBean.sirmcDao
  at br.gov.caixa.lcr.sirmc.service.impl.SirmcBean.sirmcDao(SirmcBean.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type MatrizIndexadoresDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.service.impl.MatrizIndexadoresBean.matrizIndexadoresDao
  at br.gov.caixa.lcr.service.impl.MatrizIndexadoresBean.matrizIndexadoresDao(MatrizIndexadoresBean.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type AliquotasIofDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.service.impl.AliquotasIofBean.dao
  at br.gov.caixa.lcr.service.impl.AliquotasIofBean.dao(AliquotasIofBean.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type ConformidadeDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.simtr.service.ConformidadeSimtrService.conformidadeDao
  at br.gov.caixa.lcr.simtr.service.ConformidadeSimtrService.conformidadeDao(ConformidadeSimtrService.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type FuncionalidadeEspecialDao with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.lcr.service.impl.FuncionalidadesEspeciaisBean.dao
  at br.gov.caixa.lcr.service.impl.FuncionalidadesEspeciaisBean.dao(FuncionalidadesEspeciaisBean.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type ParametrosProdutoCanalDao with qualifiers @Default
  at injection point [BackedAnnotatedParameter] Parameter 1 of [BackedAnnotatedConstructor] @Inject public br.gov.caixa.lcr.service.impl.ParametrosProdutoCanalBean(ParametrosProdutoCanalDao)
  at br.gov.caixa.lcr.service.impl.ParametrosProdutoCanalBean.<init>(ParametrosProdutoCanalBean.java:0)
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type DadosSICLIDao with qualifiers @Default
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





o jeferson nao faz assim nao, ele excluio o deplou cria outro e assina o pcaote denovo
