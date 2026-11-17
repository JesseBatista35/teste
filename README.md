
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
cd /opt/jboss-eap/standalone/deployments
ls -l gec-ear.ear.*
cat gec-ear.ear.failed | head -60
-rw-r--r-- 1 jboss jboss 199064 nov 17 12:38 gec-ear.ear.failed
"{
    \"WFLYCTL0080: Falha de serviços\" => {\"jboss.deployment.subunit.\\\"gec-ear.ear\\\".\\\"gec-web.war\\\".POST_MODULE\" => \"WFLYSRV0153: Falha ao processar a fase POST_MODULE de subdeployment \\\"gec-web.war\\\" of deployment \\\"gec-ear.ear\\\"
    Caused by: org.jboss.as.server.deployment.DeploymentUnitProcessingException: java.lang.ClassNotFoundException: br.gov.caixa.arqrefweb.controle.AppServlet from [Module \\\"deployment.gec-ear.ear.gec-web.war\\\" from Service Module Loader]
    Caused by: java.lang.ClassNotFoundException: br.gov.caixa.arqrefweb.controle.AppServlet from [Module \\\"deployment.gec-ear.ear.gec-web.war\\\" from Service Module Loader]\"},
    \"WFLYCTL0412: Serviços necessários que não estão instalados:\" => [
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorACTC303Bean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.ProspeccaoRegrasCapitalGiroBean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorACTC702Bean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.HistoricoSituacaoLiquidacaoBean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorLegacyCallTEDNCRBean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorACTC923Bean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.MovimentoSolicitacaoExternaBean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.ManterRegistroArquivoConsignadoBean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.RelatorioCTCBean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorAPCS102Bean\",
        \"jboss.deployment.subunit.\\\"gec-ear.ear\\\".\\\"gec-ejb.jar\\\".beanmanager\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.SicliAPIBean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorAPCS104Bean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.IntegracaoSIAPXConvenenteCanalBean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.ConsultaArquivoSinteticoBean\",
        \"jboss.deployment.unit.\\\"gec-ear.ear\\\".beanmanager\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.CemocProspeccaoBean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorEnvioTEDDesenrolaBean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.DAOBarramentoFactory\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.EvidenciaRetencaoPdfAPIBean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.RelatorioFeeLeadServiceImpl\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorACTC301Bean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.SimuladorCalculoIofComplementarBean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorLegacyCallTEDOPFBean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.CemocProcessarArquivoBean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.SimuladorCalculoRcoExpectativaBean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.TEDSolicitacaoExternaBean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.RelatorioInformeLiquidacaoServiceImpl\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorACTC603Bean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.TransferenciaEletronicaBean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorACTC921Bean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorEventualCorrecaoBaseBean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.ManterEvidenciaPortabilidadeBean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorACTC601Bean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.SituacaoLiquidacaoBean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.EventoTarifaBean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorAPCS201Bean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorARCC001Bean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.ControleProcessamentoEvidenciaService\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorACTC928Bean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.EvidenciaRetencaoAudioAPIBean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.RelatorioFalhaValidacaoServiceImpl\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.EvidenciaSolicitacaoAPIBean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.ManterEventoContabilBean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.ExternalApiConfigurationService\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.LogArquivoCemocBean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorAPCS302Bean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorACTC104Bean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.EvidenciaRetencaoAudioAPIBeanAsync\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.SincrApi\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorACTC804Bean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorAPCS108Bean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.RelatorioFeeQuitacaoServiceImpl\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.AutorizacaoTedCanceladaBean\",
        \"jboss.naming.context.java.comp.gec-ear.gec-ejb.ProcessadorEnvioTEDRCOBean\",
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]# L=/logs/jboss/jboss-eap/standalone/sigec-portabilidade/server.log
[root@caddeapllx2871 deployments]# ls -l $L
-rw-r--r-- 1 jboss jboss 2079765 nov 17 13:49 /logs/jboss/jboss-eap/standalone/sigec-portabilidade/server.log
[root@caddeapllx2871 deployments]# grep -n "WFLYCTL0013\|WFLYSRV0059\|WFLYCTL0412\|Caused by\|NoClassDefFound\|ClassNotFound" $L | tail -30
285:2026-11-17 11:10:03,761 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("add") - endereço ([
289:    "WFLYCTL0412: Serviços necessários que não estão instalados:" => [
939:Caused by: java.lang.RuntimeException: WFLYSRV0177: Ocorreu um erro ao obter a informação reflexiva para o class br.gov.caixa.arqrefcore.siemp.sisgd.api.impl.UpLoadDownloadImpl com o ClassLoader ModuleClassLoader for Module "deployment.gec-ear.ear.gec-web.war" from Service Module Loader
946:Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/bsb/sisgd/framework/cm/ConectorException
953:Caused by: java.lang.ClassNotFoundException: br.gov.caixa.bsb.sisgd.framework.cm.ConectorException from [Module "deployment.gec-ear.ear.gec-web.war" from Service Module Loader]
2481:2026-11-17 11:42:29,364 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "gec-ear.ear")]) - falha na descrição: {
2483:    Caused by: java.lang.RuntimeException: WFLYSRV0177: Ocorreu um erro ao obter a informação reflexiva para o class br.gov.caixa.arqrefcore.siemp.sisgd.api.impl.UpLoadDownloadImpl com o ClassLoader ModuleClassLoader for Module \"deployment.gec-ear.ear.gec-web.war\" from Service Module Loader
2484:    Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/bsb/sisgd/framework/cm/ConectorException
2485:    Caused by: java.lang.ClassNotFoundException: br.gov.caixa.bsb.sisgd.framework.cm.ConectorException from [Module \"deployment.gec-ear.ear.gec-web.war\" from Service Module Loader]"},
2486:    "WFLYCTL0412: Serviços necessários que não estão instalados:" => [
4713:Caused by: java.lang.RuntimeException: WFLYSRV0177: Ocorreu um erro ao obter a informação reflexiva para o class br.gov.caixa.arqrefcore.siemp.sisgd.api.impl.UpLoadDownloadImpl com o ClassLoader ModuleClassLoader for Module "deployment.gec-ear.ear.gec-web.war" from Service Module Loader
4720:Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/bsb/sisgd/framework/cm/ConectorException
4727:Caused by: java.lang.ClassNotFoundException: br.gov.caixa.bsb.sisgd.framework.cm.ConectorException from [Module "deployment.gec-ear.ear.gec-web.war" from Service Module Loader]
6226:2026-11-17 11:48:21,443 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "gec-ear.ear")]) - falha na descrição: {
6228:    Caused by: java.lang.RuntimeException: WFLYSRV0177: Ocorreu um erro ao obter a informação reflexiva para o class br.gov.caixa.arqrefcore.siemp.sisgd.api.impl.UpLoadDownloadImpl com o ClassLoader ModuleClassLoader for Module \"deployment.gec-ear.ear.gec-web.war\" from Service Module Loader
6229:    Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/bsb/sisgd/framework/cm/ConectorException
6230:    Caused by: java.lang.ClassNotFoundException: br.gov.caixa.bsb.sisgd.framework.cm.ConectorException from [Module \"deployment.gec-ear.ear.gec-web.war\" from Service Module Loader]"},
6231:    "WFLYCTL0412: Serviços necessários que não estão instalados:" => [
8522:Caused by: org.jboss.as.server.deployment.DeploymentUnitProcessingException: java.lang.ClassNotFoundException: br.gov.caixa.arqrefweb.controle.AppServlet from [Module "deployment.gec-ear.ear.gec-web.war" from Service Module Loader]
8528:Caused by: java.lang.ClassNotFoundException: br.gov.caixa.arqrefweb.controle.AppServlet from [Module "deployment.gec-ear.ear.gec-web.war" from Service Module Loader]
10061:2026-11-17 12:33:08,164 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "gec-ear.ear")]) - falha na descrição: {
10063:    Caused by: org.jboss.as.server.deployment.DeploymentUnitProcessingException: java.lang.ClassNotFoundException: br.gov.caixa.arqrefweb.controle.AppServlet from [Module \"deployment.gec-ear.ear.gec-web.war\" from Service Module Loader]
10064:    Caused by: java.lang.ClassNotFoundException: br.gov.caixa.arqrefweb.controle.AppServlet from [Module \"deployment.gec-ear.ear.gec-web.war\" from Service Module Loader]"},
10065:    "WFLYCTL0412: Serviços necessários que não estão instalados:" => [
12303:Caused by: org.jboss.as.server.deployment.DeploymentUnitProcessingException: java.lang.ClassNotFoundException: br.gov.caixa.arqrefweb.controle.AppServlet from [Module "deployment.gec-ear.ear.gec-web.war" from Service Module Loader]
12309:Caused by: java.lang.ClassNotFoundException: br.gov.caixa.arqrefweb.controle.AppServlet from [Module "deployment.gec-ear.ear.gec-web.war" from Service Module Loader]
13840:2026-11-17 12:38:56,763 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "gec-ear.ear")]) - falha na descrição: {
13842:    Caused by: org.jboss.as.server.deployment.DeploymentUnitProcessingException: java.lang.ClassNotFoundException: br.gov.caixa.arqrefweb.controle.AppServlet from [Module \"deployment.gec-ear.ear.gec-web.war\" from Service Module Loader]
13843:    Caused by: java.lang.ClassNotFoundException: br.gov.caixa.arqrefweb.controle.AppServlet from [Module \"deployment.gec-ear.ear.gec-web.war\" from Service Module Loader]"},
13844:    "WFLYCTL0412: Serviços necessários que não estão instalados:" => [
[root@caddeapllx2871 deployments]#
