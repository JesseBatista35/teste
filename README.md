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
import net.sf.jasperreports.engine.export.JRCsvExporterParameter;
import net.sf.jasperreports.engine.export.JRTextExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
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
				exporter.setParameter(JRXlsExporterParameter.IGNORE_PAGE_MARGINS, true);
				exporter.setParameter(JRXlsExporterParameter.IS_WHITE_PAGE_BACKGROUND, false);
			} else if (ContentTypeFileEnum.TEXT == contentType) {
				exporter = new JRTextExporter();
			} else if (ContentTypeFileEnum.CSV == contentType) {
				exporter = new JRCsvExporter();
				exporter.setParameter(JRCsvExporterParameter.CHARACTER_ENCODING, "UTF-8");
				exporter.setParameter(JRCsvExporterParameter.IGNORE_PAGE_MARGINS, true);
				exporter.setParameter(JRExporterParameter.CHARACTER_ENCODING, "UTF-8");
			} else if (ContentTypeFileEnum.DOCX == contentType) {
				exporter = new JRDocxExporter();
			}

			if (exporter != null) {
				exporter.setParameter(JRXlsExporterParameter.JASPER_PRINT, print);
				exporter.setParameter(JRXlsExporterParameter.OUTPUT_STREAM, output);
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
