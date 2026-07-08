-sh-4.2$ grep -na 'security-domain\|keycloak' /opt/jboss-eap/standalone/deployments/siamc-ear.ear
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ mkdir -p /tmp/ear_check
-sh-4.2$ cd /tmp/ear_check
-sh-4.2$ unzip -o /opt/jboss-eap/standalone/deployments/siamc-ear.ear -d ear_extracted
Archive:  /opt/jboss-eap/standalone/deployments/siamc-ear.ear
   creating: ear_extracted/META-INF/
  inflating: ear_extracted/META-INF/MANIFEST.MF
   creating: ear_extracted/lib/
  inflating: ear_extracted/siamc-ejb-3.0.0-SNAPSHOT.jar
  inflating: ear_extracted/siamc-web-3.0.0-SNAPSHOT.war
  inflating: ear_extracted/lib/siamc-importacao-3.0.0-SNAPSHOT.jar
  inflating: ear_extracted/lib/siico-api-1.0.41.jar
  inflating: ear_extracted/lib/amsfw-api-1.0.55.jar
  inflating: ear_extracted/lib/siamc-api-3.0.0-SNAPSHOT.jar
  inflating: ear_extracted/lib/amsfw-web-1.0.55.jar
  inflating: ear_extracted/lib/sisdu-client-0.0.0.5.jar
  inflating: ear_extracted/siico-ejb-1.0.41.jar
  inflating: ear_extracted/amsfw-ejb-1.0.60.jar
  inflating: ear_extracted/META-INF/application.xml
   creating: ear_extracted/META-INF/maven/
   creating: ear_extracted/META-INF/maven/com.unisys.br.siamc/
   creating: ear_extracted/META-INF/maven/com.unisys.br.siamc/siamc-ear/
  inflating: ear_extracted/META-INF/maven/com.unisys.br.siamc/siamc-ear/pom.xml
  inflating: ear_extracted/META-INF/maven/com.unisys.br.siamc/siamc-ear/pom.properties
-sh-4.2$ unzip -o ear_extracted/siamc-web-3.0.0-SNAPSHOT.war -d war_extracted
Archive:  ear_extracted/siamc-web-3.0.0-SNAPSHOT.war
  inflating: war_extracted/META-INF/MANIFEST.MF
   creating: war_extracted/WEB-INF/
   creating: war_extracted/WEB-INF/lib/
   creating: war_extracted/WEB-INF/relatorios/
   creating: war_extracted/WEB-INF/relatorios/cenarios/
   creating: war_extracted/WEB-INF/relatorios/evento_risco/
   creating: war_extracted/WEB-INF/relatorios/extrato/
   creating: war_extracted/WEB-INF/relatorios/laudo/
   creating: war_extracted/WEB-INF/relatorios/laudo/isolada_construcao/
   creating: war_extracted/WEB-INF/relatorios/laudo/terreno/
   creating: war_extracted/WEB-INF/relatorios/logo/
   creating: war_extracted/WEB-INF/relatorios/relatorio_pesquisa/
   creating: war_extracted/WEB-INF/classes/
   creating: war_extracted/WEB-INF/classes/META-INF/
   creating: war_extracted/WEB-INF/classes/META-INF/services/
   creating: war_extracted/WEB-INF/classes/siamc/
   creating: war_extracted/WEB-INF/classes/br/
   creating: war_extracted/WEB-INF/classes/br/gov/
   creating: war_extracted/WEB-INF/classes/br/gov/cef/
   creating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/
   creating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/
   creating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/util/
   creating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/
   creating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/averbacao/
   creating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/averbacao/util/
   creating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/relatorios/
   creating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/seguranca/
   creating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/upload/
   creating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/margem/
   creating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/margem/consignavel/
   creating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/extrato/
   creating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/log/
   creating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/arquivo/
   creating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/util/
   creating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/telainicial/
   creating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/convenio/
   creating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/auth/
   creating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/jsf/
   creating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/validator/
   creating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/filter/
   creating: war_extracted/pages/
   creating: war_extracted/pages/arquivo/
   creating: war_extracted/pages/averbacao/
   creating: war_extracted/pages/convenio/
   creating: war_extracted/pages/extrato/
   creating: war_extracted/pages/geradorRotinas/
   creating: war_extracted/pages/inicial/
   creating: war_extracted/pages/log/
   creating: war_extracted/pages/manual/
   creating: war_extracted/pages/margemconsignavel/
   creating: war_extracted/pages/relatorios/
   creating: war_extracted/resources/
   creating: war_extracted/resources/imagem/
   creating: war_extracted/resources/js/
   creating: war_extracted/templates/
   creating: war_extracted/templates/components/
  inflating: war_extracted/WEB-INF/.faces-config.xml.jsfdia
  inflating: war_extracted/WEB-INF/faces-config.xml
  inflating: war_extracted/WEB-INF/lib/Arial.jar
  inflating: war_extracted/WEB-INF/lib/javax.annotation-api-1.3.2.jar
  inflating: war_extracted/WEB-INF/lib/javax.faces-2.3.9.jar
  inflating: war_extracted/WEB-INF/lib/primefaces-4.0.jar
  inflating: war_extracted/WEB-INF/lib/jackson-core-2.10.1.jar
  inflating: war_extracted/WEB-INF/lib/jackson-databind-2.10.1.jar
  inflating: war_extracted/WEB-INF/lib/amsfw-web-1.0.55.jar
  inflating: war_extracted/WEB-INF/lib/amsfw-ejb-1.0.60.jar
  inflating: war_extracted/WEB-INF/lib/caixa-web-1.0.26.jar
  inflating: war_extracted/WEB-INF/lib/ldapsearch-1.0.0.jar
  inflating: war_extracted/WEB-INF/lib/siusr-loginModule-1.11.0.jar
  inflating: war_extracted/WEB-INF/lib/sisdu-client-0.0.0.5.jar
  inflating: war_extracted/WEB-INF/lib/siico-api-1.0.41.jar
  inflating: war_extracted/WEB-INF/lib/amsfw-api-1.0.55.jar
  inflating: war_extracted/WEB-INF/lib/siamc-ejb-3.0.0-SNAPSHOT.jar
  inflating: war_extracted/WEB-INF/lib/siamc-importacao-3.0.0-SNAPSHOT.jar
  inflating: war_extracted/WEB-INF/lib/commons-net-3.5.jar
  inflating: war_extracted/WEB-INF/lib/util-1.0.jar
  inflating: war_extracted/WEB-INF/lib/siamc-api-3.0.0-SNAPSHOT.jar
  inflating: war_extracted/WEB-INF/lib/commons-codec-1.8.jar
  inflating: war_extracted/WEB-INF/lib/commons-lang-2.3.jar
  inflating: war_extracted/WEB-INF/lib/commons-logging-1.1.1.jar
  inflating: war_extracted/WEB-INF/lib/jasperreports-5.1.0.jar
  inflating: war_extracted/WEB-INF/lib/commons-beanutils-1.8.0.jar
  inflating: war_extracted/WEB-INF/lib/commons-collections-2.1.jar
  inflating: war_extracted/WEB-INF/lib/commons-digester-2.1.jar
  inflating: war_extracted/WEB-INF/lib/itext-2.1.7.js2.jar
  inflating: war_extracted/WEB-INF/lib/jcommon-1.0.15.jar
  inflating: war_extracted/WEB-INF/lib/jfreechart-1.0.12.jar
  inflating: war_extracted/WEB-INF/lib/xml-apis-1.3.02.jar
  inflating: war_extracted/WEB-INF/lib/jdtcore-3.1.0.jar
  inflating: war_extracted/WEB-INF/lib/castor-1.2.jar
  inflating: war_extracted/WEB-INF/lib/jackson-annotations-2.0.5.jar
  inflating: war_extracted/WEB-INF/lib/commons-fileupload-1.2.1.jar
  inflating: war_extracted/WEB-INF/lib/commons-io-1.4.jar
  inflating: war_extracted/WEB-INF/lib/login-module-externo-1.0.0.jar
  inflating: war_extracted/WEB-INF/relatorios/cenarios/relatorio_acompanhamento_detalhado.jasper
  inflating: war_extracted/WEB-INF/relatorios/cenarios/relatorio_acompanhamento_detalhado.jrxml
  inflating: war_extracted/WEB-INF/relatorios/evento_risco/pesquisar_evento_risco.jasper
  inflating: war_extracted/WEB-INF/relatorios/evento_risco/pesquisar_evento_risco.jrxml
  inflating: war_extracted/WEB-INF/relatorios/extrato/guia_extrato.jasper
  inflating: war_extracted/WEB-INF/relatorios/extrato/guia_extrato.jrxml
  inflating: war_extracted/WEB-INF/relatorios/extrato/guia_extrato_detalhe.jasper
  inflating: war_extracted/WEB-INF/relatorios/extrato/guia_extrato_detalhe.jrxml
  inflating: war_extracted/WEB-INF/relatorios/extrato/guia_extrato_exclusoes.jasper
  inflating: war_extracted/WEB-INF/relatorios/extrato/guia_extrato_exclusoes.jrxml
  inflating: war_extracted/WEB-INF/relatorios/laudo/caracterizacao_imovel.jasper
  inflating: war_extracted/WEB-INF/relatorios/laudo/caracterizacao_imovel.jrxml
  inflating: war_extracted/WEB-INF/relatorios/laudo/isolada_construcao/caracterizacao_imovel.jasper
  inflating: war_extracted/WEB-INF/relatorios/laudo/isolada_construcao/caracterizacao_imovel.jrxml
  inflating: war_extracted/WEB-INF/relatorios/laudo/isolada_construcao/laudo_avaliacao.jasper
  inflating: war_extracted/WEB-INF/relatorios/laudo/isolada_construcao/laudo_avaliacao.jrxml
  inflating: war_extracted/WEB-INF/relatorios/laudo/laudo_avaliacao.jasper
  inflating: war_extracted/WEB-INF/relatorios/laudo/laudo_avaliacao.jrxml
  inflating: war_extracted/WEB-INF/relatorios/laudo/terreno/caracterizacao_imovel.jasper
  inflating: war_extracted/WEB-INF/relatorios/laudo/terreno/caracterizacao_imovel.jrxml
  inflating: war_extracted/WEB-INF/relatorios/laudo/terreno/laudo_avaliacao.jasper
  inflating: war_extracted/WEB-INF/relatorios/laudo/terreno/laudo_avaliacao.jrxml
  inflating: war_extracted/WEB-INF/relatorios/logo/caixa_logo.gif
  inflating: war_extracted/WEB-INF/relatorios/logo/logo.png
  inflating: war_extracted/WEB-INF/relatorios/logo/marca-dagua-rasculho.jpg
  inflating: war_extracted/WEB-INF/relatorios/relatorio_pesquisa/relatorio_pesquisa.jasper
  inflating: war_extracted/WEB-INF/relatorios/relatorio_pesquisa/relatorio_pesquisa.jrxml
  inflating: war_extracted/WEB-INF/relatorios/relatorio_pesquisa/relatorio_pesquisa_paisagem.jasper
  inflating: war_extracted/WEB-INF/relatorios/relatorio_pesquisa/relatorio_pesquisa_paisagem.jrxml
  inflating: war_extracted/WEB-INF/beans.xml
  inflating: war_extracted/WEB-INF/jboss-web.xml
  inflating: war_extracted/WEB-INF/web.xml
  inflating: war_extracted/WEB-INF/classes/META-INF/services/javax.enterprise.inject.spi.CDIProvider
  inflating: war_extracted/WEB-INF/classes/login-external-caixa.properties
  inflating: war_extracted/WEB-INF/classes/login-external.properties
  inflating: war_extracted/WEB-INF/classes/siamc/global_en_US.properties
  inflating: war_extracted/WEB-INF/classes/siamc/global_pt_BR.properties
  inflating: war_extracted/WEB-INF/classes/siamc/icones.properties
  inflating: war_extracted/WEB-INF/classes/siamc/mensagens_pt_BR.properties
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/util/ComboController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/util/NumeroConvenioConverter.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/util/Paginas.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/util/JasperUtil.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/util/SegurancaUtils.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/util/LayoutController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/util/SessionUtils.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/util/MenuController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/util/ComboDinamicoController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/averbacao/AlterarAverbacaoPersistController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/averbacao/BloquearMargemConsignavelPorCpfSearchController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/averbacao/util/AbstractBloquearMargemConsignavelSearchController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/averbacao/util/AbstractBloquearMargemConsignavelPersistController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/averbacao/AutorizarAverbacaoSearchController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/averbacao/AutorizarAverbacaoPersistController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/averbacao/AlterarAverbacaoSearchController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/averbacao/BloquearMargemConsignavelPersistController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/averbacao/BloquearMargemConsignavelCpfPersistController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/averbacao/BloquearMargemConsignavelSearchController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/SIAMCGenericPersistController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/SIAMCGenericSearchController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/relatorios/EmpregadosPorConvenenteSearchController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/relatorios/AcompanhamentoAverbacaoSearchController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/seguranca/LoginCaixaController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/seguranca/SegurancaController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/seguranca/LoginController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/PDFExporterSIAMC.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/upload/FileUploadServlet.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/margem/consignavel/MargemConsignavelSearchController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/margem/consignavel/MargemConsignavelPersistController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/margem/consignavel/CargaMargemConsignavelController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/extrato/GerarExtratoSearchController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/extrato/GerarExtratoPersistController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/log/HistoricoLogSearchController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/arquivo/ConsultaMargemConsignavelSearchController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/arquivo/ConsultaMargemConsignavelPersistController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/util/Relatorios.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/GerarArquivoSiricPersistController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/telainicial/TelaInicialController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/convenio/ConvenioPersistController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/controller/convenio/ConvenioSearchController.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/auth/LogoutServlet.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/jsf/FacesActivator.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/validator/SiamcCpfValidator.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/filter/LoginFilter.class
  inflating: war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/filter/PostLoginFilter.class
  inflating: war_extracted/build.txt
  inflating: war_extracted/error.xhtml
  inflating: war_extracted/favicon.ico
  inflating: war_extracted/login.xhtml
  inflating: war_extracted/logininterno.xhtml
  inflating: war_extracted/pages/arquivo/cadastrarConsultarArquivoMargemEnviado.xhtml
  inflating: war_extracted/pages/arquivo/pesquisarConsultarArquivoMargemEnviado.xhtml
  inflating: war_extracted/pages/averbacao/autorizarAverbacao.xhtml
  inflating: war_extracted/pages/averbacao/bloquearMargemConsignavel.xhtml
  inflating: war_extracted/pages/averbacao/bloquearMargemConsignavelCpf.xhtml
  inflating: war_extracted/pages/averbacao/pesquisarAutorizarAverbacao.xhtml
  inflating: war_extracted/pages/averbacao/pesquisarMargemConsignavelBloqueio.xhtml
  inflating: war_extracted/pages/averbacao/pesquisarMargemConsignavelBloqueioCpf.xhtml
  inflating: war_extracted/pages/averbacao/cadastrarAlterarAverbacao.xhtml
  inflating: war_extracted/pages/averbacao/pesquisarAlterarAverbacao.xhtml
  inflating: war_extracted/pages/convenio/cadastrarConvenio.xhtml
  inflating: war_extracted/pages/convenio/pesquisarConvenio.xhtml
  inflating: war_extracted/pages/extrato/editarExtrato.xhtml
  inflating: war_extracted/pages/extrato/pesquisarExtrato.xhtml
  inflating: war_extracted/pages/geradorRotinas/gerarArquivoSiric.xhtml
  inflating: war_extracted/pages/inicial/telaInicial.xhtml
  inflating: war_extracted/pages/log/pesquisarLog.xhtml
  inflating: war_extracted/pages/manual/manualusuario.xhtml
  inflating: war_extracted/pages/margemconsignavel/cadastrarMargemConsignavel.xhtml
  inflating: war_extracted/pages/margemconsignavel/enviarCargaMargemConsignavel.xhtml
  inflating: war_extracted/pages/margemconsignavel/enviarCargaMargemConsignavelError.xhtml
  inflating: war_extracted/pages/margemconsignavel/pesquisarMargemConsignavel.xhtml
  inflating: war_extracted/pages/relatorios/acompanhamentoAverbacoes.xhtml
  inflating: war_extracted/pages/relatorios/empregadosPorConvenente.xhtml
  inflating: war_extracted/resources/imagem/alert-icon.png
  inflating: war_extracted/resources/imagem/ico-allow.png
  inflating: war_extracted/resources/imagem/ico-locked.png
  inflating: war_extracted/resources/js/funcoes.js
  inflating: war_extracted/senha.xhtml
  inflating: war_extracted/templates/components/menu.xhtml
  inflating: war_extracted/templates/template_caixa_novo_inter_ext_infos.xhtml
  inflating: war_extracted/templates/template_login_caixa_novo_externo.xhtml
  inflating: war_extracted/version.txt
  inflating: war_extracted/META-INF/maven/com.unisys.br.siamc/siamc-web/pom.xml
  inflating: war_extracted/META-INF/maven/com.unisys.br.siamc/siamc-web/pom.properties
-sh-4.2$ grep -rn 'security-domain\|keycloak' war_extracted/WEB-INF/
Arquivo binário war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/auth/LogoutServlet.class coincide com o padrão
Arquivo binário war_extracted/WEB-INF/classes/br/gov/cef/siamc/web/filter/PostLoginFilter.class coincide com o padrão
war_extracted/WEB-INF/jboss-web.xml:7:    <!--<security-domain>keycloak</security-domain>-->
-sh-4.2$ ls war_extracted/WEB-INF/ | grep -i keycloak
-sh-4.2$ cat war_extracted/WEB-INF/keycloak.json 2>/dev/null
-sh-4.2$ cat war_extracted/WEB-INF/jboss-web.xml 2>/dev/null
<?xml version="1.0" encoding="UTF-8"?>
<jboss-web xmlns="https://www.jboss.com/xml/ns/javaee"
           xmlns:xsi="https://www.w3.org/2001/XMLSchema-instance"
           xsi:schemaLocation="https://www.jboss.com/xml/ns/javaee https://www.jboss.org/j2ee/schema/jboss-web_5_1.xsd"
           version="5.1">
    <context-root>siamc</context-root>
    <!--<security-domain>keycloak</security-domain>-->
</jboss-web>-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -n 'subsystem xmlns=.urn:jboss:domain:security' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
459:        <subsystem xmlns="urn:jboss:domain:security:2.0">
496:        <subsystem xmlns="urn:jboss:domain:security-manager:1.0">
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -n 'subsystem xmlns=.urn:jboss:domain:keycloak' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
543:        <subsystem xmlns="urn:jboss:domain:keycloak:1.1">
-sh-4.2$ grep -n 'subsystem xmlns=.urn:jboss:domain:elytron' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
-sh-4.2$
