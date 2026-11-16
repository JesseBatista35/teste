Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/4b2b19fe-41ab-4094-8b8a-aa6802d2f801.sh
QG Script --> Using SonarQube instance http://sonar-esteira.apps.produtos4.caixa
QG Script --> Using SonarQube access login ads-sa
QG Script --> Using task id of AaHk_TPMPmqzl3Vc6_uU
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is IN_PROGRESS
QG Script --> Status of SonarQube task is SUCCESS
QG Script --> Using analysis id of AaHk_UN2Fkwt0Lh6-n5T
QG Script --> Quality Gate status is ERROR
##[error]QG Script --> Ocorrência prevista na TE102 - Não atendimento aos critérios de qualidade
##[error]Bash exited with code '1'.
Finishing: Publish Quality Gate Result

Skip to main content
Logo, link to homepage
Projects
Issues
Rules
Quality Profiles
Quality Gates

Search for projects...
JM
SIGEC-portabilidade


Cesti-test-001
Last analysis of this Branch had 3 warnings
November 16, 2026 at 12:30 PM
Version 5.0.0-online-SNAPSHOT

Overview
Issues
Security Hotspots
Measures
Code
Activity
Project Information
To benefit from more of SonarQube's features, ask a project administrator to set up DevOps platform integration.

Quality Gate Status
Failed
1 conditions failed
The quality gate used by this project does not comply with Clean as You Code.
Fixing this quality gate will help you achieve a Clean Code state.

Learn why
1 condition(s) failed on new code
36.4%
Coverage on New Codeis less than 80.0%
Measures

New Code
From last 428 days

Overall Code
0
New Bugs
Reliability
A
0
New Vulnerabilities
Security
A
0
New Security Hotspots
Reviewed
Security Review
A
1d 1h
Added Debt
42
New Code Smells
Maintainability
B
36.4%
Coverage on 11 New Lines to cover
0.0%
Duplications on 275 New Lines
Activity
Choose graph type
Issues
Bugs
Code Smells
Vulnerabilities
new code
0
1k
2k
3k
4k
5k
Wed 11
Thu 12
Fri 13
Sat 14
Nov 15
Activity
November 16, 2026 at 12:30 PM
5.0.0-online-SNAPSHOT
November 16, 2026 at 9:22 AM
5.0.0-batch-SNAPSHOT
Quality Gate: Failed
SonarQube™ technology is powered by SonarSource SA
Community Editionv9.9.5 (build 90363)NO LONGER ACTIVELGPL v3CommunityDocumentationPluginsWeb API

Skip to main contentSkip to measure filters
Logo, link to homepage
Projects
Issues
Rules
Quality Profiles
Quality Gates

Search for projects...
JM
SIGEC-portabilidade


Cesti-test-001
Last analysis of this Branch had 3 warnings
November 16, 2026 at 12:30 PM
Version 5.0.0-online-SNAPSHOT

Overview
Issues
Security Hotspots
Measures
Code
Activity
Project Information

Project Overview
Reliability
Security
Security Review
Maintainability
Coverage
Coverage on New Code

Overview
On new code

Coverage
0.0%

Lines to Cover
6

Uncovered Lines
6

Line Coverage
0.0%

Conditions to Cover
0

Uncovered Conditions
0
Overall

Coverage
0.0%

Lines to Cover
106

Uncovered Lines
106

Line Coverage
0.0%

Conditions to Cover
32

Uncovered Conditions
32

Condition Coverage
0.0%
Tests

Errors
0

Failures
0

Skipped
0

Success
100%
Duplications
Size
Complexity
Issues
SIGEC-portabilidadegec-websrcmainjava/br/gov/caixasigecutilExportaArquivoUtil.java
Coverage on New Code
0.0%
 SIGEC-portabilidade gec-web/.../main/java/br/gov/caixa/sigec/util/ExportaArquivoUtil.java

package br.gov.caixa.sigec.util;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Singleton;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import br.gov.caixa.sigec.dominio.dto.MovimentoSinafDTO;
import br.gov.caixa.sigec.dominio.dto.TransferenciaMovimentoSinafDTO;
import net.sf.jasperreports.engine.JRAbstractExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRTextExporter;
import net.sf.jasperreports.engine.export.JRXlsAbstractExporterParameter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.engine.util.JRLoader;
/**
 * Classe utilitária para exportar arquivos.
 * 
 * @author Rodrigo Mazoni
 */
@Singleton
public class ExportaArquivoUtil {
	private static final Logger LOG = Logger.getLogger(ExportaArquivoUtil.class.getSimpleName());
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static final DecimalFormat df = new DecimalFormat("#,##0.00");
	private XSSFSheet createSecureSheet(XSSFWorkbook wb, boolean secure) {
		XSSFSheet sheet = wb.createSheet("Sheet1");
		return sheet;
	}
	private File gerarArquivoTemporario(XSSFWorkbook wb, String fileName) {
		FileOutputStream fileOut;
		try {
			fileOut = new FileOutputStream(this.arquivo(fileName));
			wb.write(fileOut);
			fileOut.flush();
			fileOut.close();
		} catch (FileNotFoundException e) {
			LOG.log(Level.SEVERE, e.getMessage(), e);
		} catch (IOException e) {
			LOG.log(Level.SEVERE, e.getMessage(), e);
		}
		return this.arquivo(fileName);
	}
	public File criarArquivoTedsMovimentoSinaf(List<TransferenciaMovimentoSinafDTO> teds) {
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = createSecureSheet(wb, true);
		// header
		XSSFRow header = sheet.createRow(0);
		header.createCell(0).setCellValue("Número da TED");
		header.createCell(1).setCellValue("Tipo TED");
		header.createCell(2).setCellValue("Objeto");
		header.createCell(3).setCellValue("Número FEBRABAN");
		header.createCell(4).setCellValue("Data de Emissão");
		header.createCell(5).setCellValue("Valor da TED");
		for (int i = 0; i < teds.size(); i++) {
			TransferenciaMovimentoSinafDTO t = teds.get(i);
			XSSFRow row = sheet.createRow(i + 1);
			row.createCell(0).setCellValue(t.getNumeroTed());
			row.createCell(1).setCellValue(t.getTipoTed());
			row.createCell(2).setCellValue(t.getObjetoTed());
			row.createCell(3).setCellValue(t.getNumeroFebraban());
			row.createCell(4).setCellValue(sdf.format(t.getDataEmissao()));
			row.createCell(5).setCellValue(df.format(t.getValorTed()));
		}
		return this.gerarArquivoTemporario(wb, "tmpArquivoTedsMovimentoSinaf.xlsx");
	}
	public File criarArquivoMovimentoSinaf(List<MovimentoSinafDTO> movimentos) {
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = createSecureSheet(wb, true);
		// header
		XSSFRow header = sheet.createRow(0);
		header.createCell(0).setCellValue("Linha de Crédito");
		header.createCell(1).setCellValue("Tipo Contrato SCR");
		header.createCell(2).setCellValue("Referência");
		header.createCell(3).setCellValue("Data Efetiva");
		header.createCell(4).setCellValue("Evento contábil");
		header.createCell(5).setCellValue("Agência detentora");
		header.createCell(6).setCellValue("Valor do lançamento");
		for (int i = 0; i < movimentos.size(); i++) {
			MovimentoSinafDTO mov = movimentos.get(i);
			XSSFRow row = sheet.createRow(i + 1);
			row.createCell(0).setCellValue(mov.getLinhaCredito());
			row.createCell(1).setCellValue(mov.getTipoContratoSCR());
			row.createCell(2).setCellValue(sdf.format(mov.getDataMovimento()));
			row.createCell(3).setCellValue(sdf.format(mov.getDataEfetiva()));
			row.createCell(4).setCellValue(mov.getNumeroEventoContabil());
			row.createCell(5).setCellValue(mov.getNumeroAgencia());
			row.createCell(6).setCellValue(df.format(mov.getValorLancamento()));
		}
		return this.gerarArquivoTemporario(wb, "tmpArquivoMovimentoSinaf.xlsx");
	}
	private File arquivo(final String fileName) {
		return new File(tmpdir() + File.separator + fileName);
	}
	private String tmpdir() {
		return System.getProperty("java.io.tmpdir");
	}
	/**
	 * Seta o arquivo na resposta da requisição.
	 * 
	 * @param bytes                  - conteúdo em bytes do arquivo que será
	 *                               exportado.
	 * @param contentType            - content-type do arquivo na resposta da
	 *                               requisição. Veja: {@link ContentTypeFileEnum}.
	 * @param nomeArquivoComExtensao - nome do arquivo com a extensão.
	 * @return resposta da requisição contendo o arquivo
	 */
	public Response setArquivoNoResponse(final byte[] bytes, final ContentTypeFileEnum contentType,
			final String nomeArquivoComExtensao) {
		final ResponseBuilder response = Response.ok(new ByteArrayInputStream(bytes));
		response.type(contentType.getType());
		response.header("cache-control", "max-age=0");
		response.header("content-disposition", "attachment; filename=\"" + nomeArquivoComExtensao + "\"");
		final CacheControl cacheControl = new CacheControl();
		cacheControl.setNoCache(true);
		cacheControl.setNoStore(true);
		cacheControl.setPrivate(true);
		response.cacheControl(cacheControl);
		return response.build();
	}
	/**
	 * Gera o relatório utilizando o JasperReport.
	 * 
	 * @param caminhoArquivoJasper
	 * @param parametros
	 * @param colecao
	 * @param contentType
	 * @param nomeArquivoExportadoComExtensao
	 * @return
	 * @throws Exception
	 */
	public Response exportarViaJasperReport(final String caminhoArquivoJasper, final Map<String, Object> parametros,
			final List<?> colecao, final ContentTypeFileEnum contentType, final String nomeArquivoExportadoComExtensao)
			throws Exception {
		if (ContentTypeFileEnum.XLS == contentType || ContentTypeFileEnum.XLSX == contentType) {
			parametros.put("IS_IGNORE_PAGINATION", true);
		}
		final JasperReport report = (JasperReport) JRLoader.loadObject(new File(caminhoArquivoJasper));
		final JasperPrint print = JasperFillManager.fillReport(report, parametros,
				new JRBeanCollectionDataSource(colecao));
		if (ContentTypeFileEnum.XLS == contentType || ContentTypeFileEnum.XLSX == contentType
				|| ContentTypeFileEnum.TEXT == contentType || ContentTypeFileEnum.CSV == contentType
				|| ContentTypeFileEnum.DOCX == contentType) {
			JRAbstractExporter exporter = null;
			final ByteArrayOutputStream output = new ByteArrayOutputStream();
			if (ContentTypeFileEnum.XLSX == contentType || ContentTypeFileEnum.XLS == contentType) {
				if (ContentTypeFileEnum.XLSX == contentType) {
					exporter = new JRXlsxExporter();
				} else {
					exporter = new JRXlsExporter();
				}
				exporter.setParameter(JRExporterParameter.IGNORE_PAGE_MARGINS, true);
				exporter.setParameter(JRXlsAbstractExporterParameter.IS_WHITE_PAGE_BACKGROUND, false);
			} else if (ContentTypeFileEnum.TEXT == contentType) {
				exporter = new JRTextExporter();
			} else if (ContentTypeFileEnum.CSV == contentType) {
				exporter = new JRCsvExporter();
				exporter.setParameter(JRExporterParameter.CHARACTER_ENCODING, "UTF-8");
				exporter.setParameter(JRExporterParameter.IGNORE_PAGE_MARGINS, true);
				exporter.setParameter(JRExporterParameter.CHARACTER_ENCODING, "UTF-8");
			} else if (ContentTypeFileEnum.DOCX == contentType) {
				exporter = new JRDocxExporter();
			}
			if (exporter != null) {
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
				exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, output);
				exporter.exportReport();
			}
			return this.setArquivoNoResponse(output.toByteArray(), contentType, nomeArquivoExportadoComExtensao);
		}
		return this.setArquivoNoResponse(JasperExportManager.exportReportToPdf(print), contentType,
				nomeArquivoExportadoComExtensao);
	}
	/**
	 * Enumeração que contém o Content Type do arquivo que será exportado.
	 */
	public enum ContentTypeFileEnum {
		TEXT("text/plain"), XLS("application/vnd.ms-excel"),
		XLSX("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"), PDF("application/pdf"),
		CSV("text/plain"),
		// DOC( "application/msword" ),
		DOCX("application/vnd.openxmlformats-officedocument.wordprocessingml.document");
		private String contentType = null;
		private ContentTypeFileEnum(final String contentType) {
			this.contentType = contentType;
		}
		public String getType() {
			return this.contentType;
		}
	}
}
SonarQube™ technology is powered by SonarSource SA



Skip to main contentSkip to measure filters
Logo, link to homepage
Projects
Issues
Rules
Quality Profiles
Quality Gates

Search for projects...
JM
SIGEC-portabilidade


Cesti-test-001
Last analysis of this Branch had 3 warnings
November 16, 2026 at 12:30 PM
Version 5.0.0-online-SNAPSHOT

Overview
Issues
Security Hotspots
Measures
Code
Activity
Project Information

Project Overview
Reliability
Security
Security Review
Maintainability
Coverage
Coverage on New Code

Overview
On new code

Coverage
0.0%

Lines to Cover
1

Uncovered Lines
1

Line Coverage
0.0%

Conditions to Cover
0

Uncovered Conditions
0
Overall

Coverage
0.0%

Lines to Cover
39

Uncovered Lines
39

Line Coverage
0.0%

Conditions to Cover
16

Uncovered Conditions
16

Condition Coverage
0.0%
Tests

Errors
0

Failures
0

Skipped
0

Success
100%
Duplications
Size
Complexity
Issues
SIGEC-portabilidadegec-websrcmainjava/br/gov/caixasigecrestUserProfileRest.java
Coverage on New Code
0.0%
 SIGEC-portabilidade gec-web/.../main/java/br/gov/caixa/sigec/rest/UserProfileRest.java

package br.gov.caixa.sigec.rest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.security.PermitAll;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import br.gov.caixa.arqrefcore.excecao.BusinessException;
import br.gov.caixa.arqrefcore.excecao.SystemException;
import br.gov.caixa.arqrefservices.dominio.Empregado;
import br.gov.caixa.arqrefservices.negocio.EmpregadoService;
import br.gov.caixa.arqrefservices.negocio.UserProfile;
import br.gov.caixa.sifec.componentes.seguranca.sso.rest.AbstractSecurityRest;
@PermitAll
@RequestScoped
@Path("/userprofile")
public class UserProfileRest extends AbstractSecurityRest {
	private static final Logger LOG = Logger.getLogger(UserProfileRest.class.getSimpleName());
	private static final Properties GRUPOS_LDAP = new Properties();
	static {
		try {
			UserProfileRest.GRUPOS_LDAP
					.load(UserProfileRest.class.getClassLoader().getResourceAsStream("ldap_groups.properties"));
		} catch (IOException ioe) {
			LOG.log(Level.SEVERE, ioe.getMessage(), ioe);
		}
	}
	@Inject
	private EmpregadoService empregadoService;
	@POST
	@Path("/load")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public UserProfile loadUserProfile(@Context final HttpServletRequest request) {
		final UserProfile user = new UserProfile();
		final Empregado empregado = this.empregadoService.getEmpregadoPorMatricula(super.getUsuarioLogado());
		if (empregado == null) {
			throw new SystemException("Funcionário não encontrado no SICLI");
		}
		user.setEmpregado(empregado);
		user.getEmpregado().setNumeroIP(user.getNumeroIP(request));
		// user.setGrupoUsuarioList( this.loadgroups() );
		return user;
	}
	@POST
	@Path("/loadgroups")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<String> loadgroups() {
		final Set<String> roles = new TreeSet<>();
		for (Object key : UserProfileRest.GRUPOS_LDAP.keySet()) {
			if (super.possuiFuncao((String) key)) {
				roles.add(UserProfileRest.GRUPOS_LDAP.getProperty((String) key));
			}
		}
		return new ArrayList<>(roles);
	}
	@POST
	@Path("/carregarGrupos")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<String> carregarGrupos() {
		final Set<String> roles = new TreeSet<>();
		for (Object value : UserProfileRest.GRUPOS_LDAP.values()) {
			roles.add((String) value);
		}
		return new ArrayList<>(roles);
	}
	/**
	 * @param role
	 * @return
	 */
	@POST
	@Path("/hasRole/{role}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public boolean hasRole(final @PathParam("role") String role) {
		return this.loadgroups().contains(role);
	}
	/**
	 * @param role
	 * @throws BusinessException
	 */
	void validarRole(final String role) throws BusinessException {
		if (!this.hasRole(role)) {
			throw new BusinessException(
					"Usu\u00E1rio logado n\u00E3o possui permiss\u00E3o para efetuar opera\u00E7\u00E3o desejada.");
		}
	}
	@GET
	@Path("/grupos")
	public String grupos() {
		final StringBuilder buffer = new StringBuilder();
		final List<String> grupos = this.loadgroups();
		if (grupos != null && !grupos.isEmpty()) {
			for (String grupo : grupos) {
				buffer.append(grupo);
				buffer.append("<br/>");
			}
		}
		return buffer.toString();
	}
}
SonarQube™ technology is powered by SonarSource SA
Community Editionv9.9.5 (build 90363)NO LONGER ACTIVELGPL v3CommunityDocumentationPluginsWeb API

