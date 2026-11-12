Helber me perguntou isso to querneod xingar ele eu posso?

pq o run anterior funcionou?
 



Skip to main content
Azure DevOps
projetos
/
Caixa
/
Repos
/
Commits
/

SIEMP-java-web
Search


Caixa

Overview

Boards

Repos
Files
Commits
Pushes
Branches
Tags
Pull requests

Pipelines

Test Plans

Artifacts
Project settings
Merged PR 169675: fix(relatorios): atualizar JasperReports e substituir iText...
Browse Files




67232d27

Denilson Socrates de Sousa
committed
terça-feira
develop
(
!169675
)
failed
Files
Details
Parent 1 → This commit

Filter
30 changed files

Inline



SIEMP-java-web


jboss-deployment-structure.xml
-1+12
/siemp-ear/src/main/application/META-INF/jboss-deployment-structure.xml
View
<jboss-deployment-structure>
	<ear-subdeployments-isolated>false</ear-subdeployments-isolated>
	<sub-deployment name="siemp-web.war"></sub-deployment>
	<deployment>
		<exclusions>
			<!-- The WAR can also resolve classes through its parent EAR module. -->
			<module name="javax.servlet.jstl.api"/>
		</exclusions>
	</deployment>
	<sub-deployment name="siemp-web.war">
		<exclusions>
			<!-- Keep the legacy EL tags and their support classes in the same JSTL implementation. -->
			<module name="javax.servlet.jstl.api"/>
		</exclusions>
	</sub-deployment>
</jboss-deployment-structure>

pom.xml
-2+2
/siemp-ear/pom.xml
View
			<distributionManagement>
				<repository>
					<id>releases</id>
					<url>http://10.61.1.208:8081/nexus/content/repositories/releases</url>
					<url>http://binario.caixa:8081/nexus/content/repositories/releases</url>
				</repository>
				<snapshotRepository>
					<id>snapshots</id>
					<url>http://10.61.1.208:8081/nexus/content/repositories/snapshots</url>
					<url>http://binario.caixa:8081/nexus/content/repositories/snapshots</url>
				</snapshotRepository>
			</distributionManagement>
		</profile>

ExtratoCreditoRuralAction.java
-7+8
/siemp-web/src/main/java/br/gov/caixa/siemp/creditorural/extrato/ExtratoCreditoRuralAction.java
View
	private static final String PESSOA_JURIDICA = "2";
	private static String pacoteDeRelatorios = "/br/gov/caixa/siemp/relatorios/";
	private static final String pacoteDeSubRelatorios = "br/gov/caixa/siemp/relatorios/";
	protected ExtratoCreditoRuralHelper getNovoHelper(HttpServletRequest request) throws Exception {
		return (ExtratoCreditoRuralHelper) super.getHelper(ExtratoCreditoRuralHelper.class, request, "");
		HashMap<String, Object> p = new HashMap<String, Object>();
		String pathImagem = request.getSession().getServletContext().getRealPath("imagens");
		p.put("pathImagem", pathImagem);
		p.put("pathSubRelGrupoLiberacoes", pacoteDeRelatorios + propsRelatorios.getProperty("creditoRural.extrato.subRelatorio.grupoLiberacoes"));
		p.put("pathSubRelGrupoReembolsos", pacoteDeRelatorios + propsRelatorios.getProperty("creditoRural.extrato.subRelatorio.grupoReembolsos"));
		p.put("pathSubRelGrupoExtrato", pacoteDeRelatorios + propsRelatorios.getProperty("creditoRural.extrato.subRelatorio.grupoExtrato"));
		p.put("pathSubRelGrupoReembolsosVencidos", pacoteDeRelatorios + propsRelatorios.getProperty("creditoRural.extrato.subRelatorio.grupoReembolsosVencidos"));
		p.put("pathSubRelGrupoProAgro", pacoteDeRelatorios + propsRelatorios.getProperty("creditoRural.extrato.subRelatorio.grupoProAgro"));
		p.put("pathSubRelGrupoPosicaoDivida", pacoteDeRelatorios + propsRelatorios.getProperty("creditoRural.extrato.subRelatorio.grupoPosicaoDivida"));
		p.put("pathSubRelGrupoOcorrencias", pacoteDeRelatorios + propsRelatorios.getProperty("creditoRural.extrato.subRelatorio.grupoOcorrencias"));
		p.put("pathSubRelGrupoLiberacoes", pacoteDeSubRelatorios + propsRelatorios.getProperty("creditoRural.extrato.subRelatorio.grupoLiberacoes"));
		p.put("pathSubRelGrupoReembolsos", pacoteDeSubRelatorios + propsRelatorios.getProperty("creditoRural.extrato.subRelatorio.grupoReembolsos"));
		p.put("pathSubRelGrupoExtrato", pacoteDeSubRelatorios + propsRelatorios.getProperty("creditoRural.extrato.subRelatorio.grupoExtrato"));
		p.put("pathSubRelGrupoReembolsosVencidos", pacoteDeSubRelatorios + propsRelatorios.getProperty("creditoRural.extrato.subRelatorio.grupoReembolsosVencidos"));
		p.put("pathSubRelGrupoProAgro", pacoteDeSubRelatorios + propsRelatorios.getProperty("creditoRural.extrato.subRelatorio.grupoProAgro"));
		p.put("pathSubRelGrupoPosicaoDivida", pacoteDeSubRelatorios + propsRelatorios.getProperty("creditoRural.extrato.subRelatorio.grupoPosicaoDivida"));
		p.put("pathSubRelGrupoOcorrencias", pacoteDeSubRelatorios + propsRelatorios.getProperty("creditoRural.extrato.subRelatorio.grupoOcorrencias"));
		p.put("dataGeracao", DataUtil.getDataComoString(DataUtil.getDataAtual(), "dd/MM/yyyy"));

consultarParametrosDoConvenio.jasper
/siemp-web/src/main/java/br/gov/caixa/siemp/relatorios/consignacao/consultarParametrosDoConvenio.jasper
View
The two versions of the file are different.
Download original file
Download modified file

consultarParametrosDoConvenioReport.jasper
/siemp-web/src/main/java/br/gov/caixa/siemp/relatorios/consignacao/consultarParametrosDoConvenioReport.jasper
View
The two versions of the file are different.
Download original file
Download modified file

consultarTabelaDeTACDoConvenio.jasper
/siemp-web/src/main/java/br/gov/caixa/siemp/relatorios/consignacao/consultarTabelaDeTACDoConvenio.jasper
View

consultarTabelaDeTACDoConvenioNovo.jasper
/siemp-web/src/main/java/br/gov/caixa/siemp/relatorios/consignacao/consultarTabelaDeTACDoConvenioNovo.jasper
View

consultarTabelaDeTACDoConvenioSubReport.jasper
/siemp-web/src/main/java/br/gov/caixa/siemp/relatorios/consignacao/consultarTabelaDeTACDoConvenioSubReport.jasper
View

consultarTabelaDeTaxasDoConvenio.jasper
/siemp-web/src/main/java/br/gov/caixa/siemp/relatorios/consignacao/consultarTabelaDeTaxasDoConvenio.jasper
View

consultarTabelaDeTaxasDoConvenioNovo.jasper
/siemp-web/src/main/java/br/gov/caixa/siemp/relatorios/consignacao/consultarTabelaDeTaxasDoConvenioNovo.jasper
View

consultarTabelaDeTaxasDoConvenioSubReport.jasper
/siemp-web/src/main/java/br/gov/caixa/siemp/relatorios/consignacao/consultarTabelaDeTaxasDoConvenioSubReport.jasper
View

relatorioExtratoCreditoRural.jasper
/siemp-web/src/main/java/br/gov/caixa/siemp/relatorios/creditoRural/relatorioExtratoCreditoRural.jasper
View

subRelatorioExtrato.jasper
/siemp-web/src/main/java/br/gov/caixa/siemp/relatorios/creditoRural/subRelatorioExtrato.jasper
View

subRelatorioLiberacoes.jasper
/siemp-web/src/main/java/br/gov/caixa/siemp/relatorios/creditoRural/subRelatorioLiberacoes.jasper
View

subRelatorioOcorrencias.jasper
/siemp-web/src/main/java/br/gov/caixa/siemp/relatorios/creditoRural/subRelatorioOcorrencias.jasper
View

subRelatorioPosicaoDivida.jasper
/siemp-web/src/main/java/br/gov/caixa/siemp/relatorios/creditoRural/subRelatorioPosicaoDivida.jasper
View

subRelatorioProAgro.jasper
/siemp-web/src/main/java/br/gov/caixa/siemp/relatorios/creditoRural/subRelatorioProAgro.jasper
View

subRelatorioReembolsos.jasper
/siemp-web/src/main/java/br/gov/caixa/siemp/relatorios/creditoRural/subRelatorioReembolsos.jasper
View

subRelatorioReembolsosVencidos.jasper
/siemp-web/src/main/java/br/gov/caixa/siemp/relatorios/creditoRural/subRelatorioReembolsosVencidos.jasper
View

relatorioEvolucaoDivida.jasper
/siemp-web/src/main/java/br/gov/caixa/siemp/relatorios/evolucao/consultarPlanilhaEvolucaoDivida/relatorioEvolucaoDivida.jasper
View

subRelatorioEvolucaoDivida.jasper
/siemp-web/src/main/java/br/gov/caixa/siemp/relatorios/evolucao/consultarPlanilhaEvolucaoDivida/subRelatorioEvolucaoDivida.jasper
View

subRelatorioEvolucaoDividaAmortiz.jasper
/siemp-web/src/main/java/br/gov/caixa/siemp/relatorios/evolucao/consultarPlanilhaEvolucaoDivida/subRelatorioEvolucaoDividaAmortiz.jasper
View

subRelatorioEvolucaoDividaReneg.jasper
/siemp-web/src/main/java/br/gov/caixa/siemp/relatorios/evolucao/consultarPlanilhaEvolucaoDivida/subRelatorioEvolucaoDividaReneg.jasper
View

relatorioEvolucaoDividaSeguradora.jasper
/siemp-web/src/main/java/br/gov/caixa/siemp/relatorios/evolucao/consultarPlanilhaEvolucaoDividaSeguradora/relatorioEvolucaoDividaSeguradora.jasper
View

subRelatorioEvolucaoDividaSeguradora.jasper
/siemp-web/src/main/java/br/gov/caixa/siemp/relatorios/evolucao/consultarPlanilhaEvolucaoDividaSeguradora/subRelatorioEvolucaoDividaSeguradora.jasper
View
