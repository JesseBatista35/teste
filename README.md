gec-web/src/test/java/br/gov/caixa/sigec/util/ExportaArquivoUtilTest.java

No Repos, na branch Cesti-test-001, abra gec-web/src/test/java/br/gov/caixa/sigec/. Ao lado da pasta rest deve existir a pasta util.
Se util não existir, use New → File e digite o caminho completo gec-web/src/test/java/br/gov/caixa/sigec/util/ExportaArquivoUtilTest.java. O Azure cria as pastas sozinho.
Cole o conteúdo do arquivo que acabei de enviar, que é o mesmo da versão anterior. A primeira linha deve ser package br.gov.caixa.sigec.util;.
Faça o commit na Cesti-test-001 e rode o -Ponline.

No log novo, procure Running br.gov.caixa.sigec.util.ExportaArquivoUtilTest e Compiling 2 source files ... test-classes. Com isso o Tests run deve passar de 2 para 4.

Se o teste aparecer e falhar, me mande o trecho do erro. Se ele rodar sem erro, a cobertura deve subir para cerca de 10 de 11 linhas, uns 90%.


package br.gov.caixa.sigec.util;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.RETURNS_SELF;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.MockedStatic;
import org.mockito.stubbing.Answer;

import br.gov.caixa.sigec.util.ExportaArquivoUtil.ContentTypeFileEnum;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.base.JRBasePrintPage;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 * Testes de {@link ExportaArquivoUtil#exportarViaJasperReport}: carregamento e preenchimento do
 * relatorio sao substituidos (sem arquivo .jasper); os exportadores do JasperReports rodam de verdade.
 */
public class ExportaArquivoUtilTest {

	private final ExportaArquivoUtil util = new ExportaArquivoUtil();

	private static JasperPrint relatorioVazio() {
		final JasperPrint print = new JasperPrint();
		print.setName("teste");
		print.setPageWidth(595);
		print.setPageHeight(842);
		print.addPage(new JRBasePrintPage());
		return print;
	}

	private static Answer<Object> loaderFalso(final JasperReport relatorio) {
		return inv -> {
			if ("loadObject".equals(inv.getMethod().getName()) && inv.getArguments().length == 1
					&& inv.getArguments()[0] instanceof File) {
				return relatorio;
			}
			return inv.callRealMethod();
		};
	}

	private static Answer<Object> fillFalso(final JasperPrint print) {
		return inv -> {
			if ("fillReport".equals(inv.getMethod().getName()) && inv.getArguments().length == 3
					&& inv.getArguments()[0] instanceof JasperReport && inv.getArguments()[2] instanceof JRDataSource) {
				return print;
			}
			return inv.callRealMethod();
		};
	}

	private ByteArrayInputStream exportar(final ContentTypeFileEnum tipo, final String nomeArquivo) throws Exception {
		final JasperReport relatorio = mock(JasperReport.class);
		final ResponseBuilder builder = mock(ResponseBuilder.class, RETURNS_SELF);
		final Response resposta = mock(Response.class);
		when(builder.build()).thenReturn(resposta);
		final ArgumentCaptor<Object> corpo = ArgumentCaptor.forClass(Object.class);

		try (MockedStatic<JRLoader> loader = mockStatic(JRLoader.class, loaderFalso(relatorio));
				MockedStatic<JasperFillManager> fill = mockStatic(JasperFillManager.class,
						fillFalso(relatorioVazio()));
				MockedStatic<Response> resp = mockStatic(Response.class)) {
			resp.when(() -> Response.ok(any())).thenReturn(builder);

			final Response retorno = util.exportarViaJasperReport("inexistente.jasper", new HashMap<String, Object>(),
					Collections.emptyList(), tipo, nomeArquivo);

			assertSame(resposta, retorno);
			resp.verify(() -> Response.ok(corpo.capture()));
		}

		verify(builder).header("content-disposition", "attachment; filename=\"" + nomeArquivo + "\"");
		return (ByteArrayInputStream) corpo.getValue();
	}

	@Test
	public void deveExportarXlsx() throws Exception {
		final ByteArrayInputStream corpo = exportar(ContentTypeFileEnum.XLSX, "relatorio.xlsx");

		assertTrue(corpo.available() > 0);
	}

	@Test
	public void deveExportarCsv() throws Exception {
		final ByteArrayInputStream corpo = exportar(ContentTypeFileEnum.CSV, "relatorio.csv");

		assertNotNull(corpo);
	}
}
