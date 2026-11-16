<img width="1596" height="799" alt="image" src="https://github.com/user-attachments/assets/b821a6f3-c53e-41af-ba0e-e34011840065" />


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
November 16, 2026 at 10:43 AM
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
November 16, 2026 at 10:43 AM
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
5

Uncovered Lines
5

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
87

Uncovered Lines
87

Line Coverage
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
SIGEC-portabilidadegec-websrcmainjava/br/gov/caixasigecrestdevProcessadorDevRest.java
Coverage on New Code
0.0%
 SIGEC-portabilidade gec-web/.../java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java

package br.gov.caixa.sigec.rest.dev;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import br.gov.caixa.sigec.negocio.ProcessadorACTC101;
import br.gov.caixa.sigec.negocio.ProcessadorACTC102;
import br.gov.caixa.sigec.negocio.ProcessadorACTC103;
import br.gov.caixa.sigec.negocio.ProcessadorACTC104;
import br.gov.caixa.sigec.negocio.ProcessadorACTC301;
import br.gov.caixa.sigec.negocio.ProcessadorACTC302;
import br.gov.caixa.sigec.negocio.ProcessadorACTC303;
import br.gov.caixa.sigec.negocio.ProcessadorACTC401;
import br.gov.caixa.sigec.negocio.ProcessadorACTC402;
import br.gov.caixa.sigec.negocio.ProcessadorACTC403;
import br.gov.caixa.sigec.negocio.ProcessadorEnvioTEDRCO;
import br.gov.caixa.sigec.negocio.PreProcessadorRecebimento;
import br.gov.caixa.sigec.negocio.VerificadorContratosCaixa;
import br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCR;
import br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallOPF;
import br.gov.caixa.azure.servicebus.dto.DadosGECTedDTO;
/**
 * Endpoint genérico para disparo manual de processadores batch em ambiente de desenvolvimento.
 * NAO SUBIR PARA AMBIENTES COMPARTILHADOS OU PRODUCAO.
 *
 * Uso:
 *   GET /dev/processador/listar            → lista todas as acoes disponíveis
 *   GET /dev/processador/executar/{acao}   → executa a acao informada
 *
 * Exemplo:
 *   GET /dev/processador/executar/ACTC102.receberACTC102
 */
@RequestScoped
@Path("/dev/processador")
public class ProcessadorDevRest {
    @Inject
    private ProcessadorACTC101 processadorACTC101;
    @Inject
    private ProcessadorACTC102 processadorACTC102;
    @Inject
    private ProcessadorACTC103 processadorACTC103;
    @Inject
    private ProcessadorACTC104 processadorACTC104;
    @Inject
    private ProcessadorACTC301 processadorACTC301;
    @Inject
    private ProcessadorACTC302 processadorACTC302;
    @Inject
    private ProcessadorACTC303 processadorACTC303;
    @Inject
    private ProcessadorACTC401 processadorACTC401;
    @Inject
    private ProcessadorACTC402 processadorACTC402;
    @Inject
    private ProcessadorACTC403 processadorACTC403;
    @Inject
    private ProcessadorEnvioTEDRCO processadorEnvioTEDRCO;
    @Inject
    private TransferenciaEletronicaLegacyCallNCR transferenciaEletronicaLegacyCallNCR;
    @Inject
    private PreProcessadorRecebimento preProcessadorRecebimento;
    @Inject
    private VerificadorContratosCaixa verificadorContratosCaixa;
    
    @Inject
    private TransferenciaEletronicaLegacyCallOPF transferenciaEletronicaLegacyCallOPF;
    private Map<String, Runnable> acoes;
    @PostConstruct
    public void init() {
        acoes = new HashMap<>();
        // ACTC101
        acoes.put("ACTC101.receberACTC101PRO", () -> processadorACTC101.receberACTC101PRO());
        acoes.put("ACTC101.receberACTC101RET", () -> processadorACTC101.receberACTC101RET());
        acoes.put("ACTC101.receberACTC101ERR", () -> processadorACTC101.receberACTC101ERR());
        acoes.put("ACTC101.enviar",            () -> processadorACTC101.enviar());
        // ACTC102
        acoes.put("ACTC102.receberACTC102",    () -> processadorACTC102.receberACTC102());
        // ACTC103
        acoes.put("ACTC103.enviarACTC103",     () -> processadorACTC103.enviarACTC103());
        acoes.put("ACTC103.receberACTC103PRO", () -> processadorACTC103.receberACTC103PRO());
        acoes.put("ACTC103.receberACTC103RET", () -> processadorACTC103.receberACTC103RET());
        acoes.put("ACTC103.receberACTC103ERR", () -> processadorACTC103.receberACTC103ERR());
        // ACTC104
        acoes.put("ACTC104.receberACTC104",    () -> processadorACTC104.receberACTC104());
        // ACTC301
        acoes.put("ACTC301.enviar",            () -> processadorACTC301.enviar());
        acoes.put("ACTC301.receberACTC301PRO", () -> processadorACTC301.receberACTC301PRO());
        acoes.put("ACTC301.receberACTC301RET", () -> processadorACTC301.receberACTC301RET());
        acoes.put("ACTC301.receberACTC301ERR", () -> processadorACTC301.receberACTC301ERR());
        // ACTC302
        acoes.put("ACTC302.receberACTC302",    () -> processadorACTC302.receberACTC302());
        // ACTC303
        acoes.put("ACTC303.enviar",            () -> processadorACTC303.enviar());
        // ACTC401
        acoes.put("ACTC401.enviar",            () -> processadorACTC401.enviar());
        acoes.put("ACTC401.receberACTC401PRO", () -> processadorACTC401.receberACTC401PRO());
        acoes.put("ACTC401.receberACTC401RET", () -> processadorACTC401.receberACTC401RET());
        acoes.put("ACTC401.receberACTC401ERR", () -> processadorACTC401.receberACTC401ERR());
        // ACTC402
        acoes.put("ACTC402.receberACTC402",    () -> processadorACTC402.receberACTC402());
        // ACTC403
        acoes.put("ACTC403.enviar",            () -> processadorACTC403.enviar());
        // RCO / NCR
        acoes.put("RCO.enviarTED",             () -> processadorEnvioTEDRCO.enviarTED());
        acoes.put("NCR.processarRecebimentosBaseEnvioNCR", () -> transferenciaEletronicaLegacyCallNCR.processarRecebimentosBaseEnvioNCR());
        acoes.put("NCR.recuperarDadosEnvioFilaNCR", () -> {
            try {
                transferenciaEletronicaLegacyCallNCR.recuperarDadosEnvioFilaNCR();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        acoes.put("NCR.processarRecebimentoNCR", () -> {
            try {
                transferenciaEletronicaLegacyCallNCR.processarRecebimentoNCR();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        // PREPROCESSAMENTO
        acoes.put("RECEBIMENTO.preProcessar",  () -> preProcessadorRecebimento.preProcessaArquivoRecebimentoACTCAPCS());
        // RETENCAO
        acoes.put("RETENCAO.verificarContratosCaixa", () -> verificadorContratosCaixa.verificarContratosCaixa());
        // NCR
        // TODO(Cesti-test-001): TransferenciaEletronicaLegacyCallNCR#listarMensagensEnvioFilaNCR() nao existe mais
        // (a interface expoe recuperarDadosEnvioFilaNCR). Acao desativada ate o desenvolvimento definir o substituto.
        acoes.put("NCR.listarMensagensEnvio", () -> {
            throw new UnsupportedOperationException(
                    "NCR.listarMensagensEnvio indisponivel: metodo listarMensagensEnvioFilaNCR nao existe na versao atual do negocio");
        });
        
        //OPF - Recupera STR0010 com dados para envio ao TRC de forma legado (CICs)
        acoes.put("OPF.recuperaSTR", () -> {
            try {
            	transferenciaEletronicaLegacyCallOPF.recuperarDadosEnvioDevolucaoOPF();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        
    }
    private static final String AMBIENTE = System.getProperty("AMBIENTE");
    private boolean isAmbientePermitido() {
        return "des".equalsIgnoreCase(AMBIENTE) || "des_local".equalsIgnoreCase(AMBIENTE);
    }
    private Response ambienteNaoPermitido() {
        return Response.status(Response.Status.FORBIDDEN)
                .entity("Endpoint disponível apenas nos ambientes 'des' e 'des_local'. Ambiente atual: " + AMBIENTE)
                .build();
    }
    /**
     * Lista todas as ações disponíveis.
     */
    @GET
    @Path("/listar")
    @Produces(MediaType.TEXT_PLAIN)
    public Response listar() {
        if (!isAmbientePermitido()) {
            return ambienteNaoPermitido();
        }
        StringBuilder sb = new StringBuilder("Acoes disponíveis:\n\n");
        new TreeMap<>(acoes).keySet().forEach(chave -> sb.append("  GET /dev/processador/executar/").append(chave).append("\n"));
        return Response.ok(sb.toString()).build();
    }
    /**
     * Executa a ação informada.
     *
     * @param acao chave no formato "ACTCXXX.nomeMetodo" (ex: ACTC102.receberACTC102)
     */
    @GET
    @Path("/executar/{acao}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response executar(@PathParam("acao") String acao) {
        if (!isAmbientePermitido()) {
            return ambienteNaoPermitido();
        }
        Runnable runnable = acoes.get(acao);
        if (runnable == null) {
            StringBuilder sb = new StringBuilder("Acao nao encontrada: " + acao + "\n\nDisponiveis:\n");
            new TreeMap<>(acoes).keySet().forEach(chave -> sb.append("  ").append(chave).append("\n"));
            return Response.status(Response.Status.NOT_FOUND).entity(sb.toString()).build();
        }
        runnable.run();
        return Response.ok("Executado com sucesso: " + acao).build();
    }
    /**
     * Recebe um payload STR0047/STR0048 e executa a logica de envio do NCR.
     *
     * Exemplo de uso:
     *   POST /dev/processador/ncr/enviar
     */
    @POST
    @Path("/ncr/enviar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response enviarNcr(String payloadJson) {
        if (!isAmbientePermitido()) {
            return ambienteNaoPermitido();
        }
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.registerModule(new JavaTimeModule());
            DadosGECTedDTO dto = objectMapper.readValue(payloadJson, DadosGECTedDTO.class);
            DadosGECTedDTO retorno = transferenciaEletronicaLegacyCallNCR.processarEnvioTRC(dto);
            return Response.ok(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(retorno)).build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Falha ao processar payload NCR: " + e.getMessage())
                    .build();
        }
    }
    /**
     * Publica um payload STR0047/STR0048 na fila de entrada do NCR.
     *
     * Exemplo de uso:
     *   POST /dev/processador/ncr/publicar
     */
    @POST
    @Path("/ncr/publicar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response publicarNcr(String payloadJson) {
        if (!isAmbientePermitido()) {
            return ambienteNaoPermitido();
        }
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.registerModule(new JavaTimeModule());
            DadosGECTedDTO dto = objectMapper.readValue(payloadJson, DadosGECTedDTO.class);
            // TODO(Cesti-test-001): TransferenciaEletronicaLegacyCallNCR#publicarMensagemEnvioFilaNCR(DadosGECTedDTO)
            // nao existe mais. Endpoint mantido (rota estavel), mas responde 501 ate o desenvolvimento definir o substituto.
            return Response.status(501)
                    .entity("Publicacao NCR indisponivel: metodo publicarMensagemEnvioFilaNCR nao existe na versao atual do negocio. nuTed="
                            + dto.getNuTed())
                    .build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Falha ao publicar payload NCR: " + e.getMessage())
                    .build();
        }
    }
}
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
November 16, 2026 at 10:43 AM
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
38

Uncovered Lines
38

Line Coverage
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
