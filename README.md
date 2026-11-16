package br.gov.caixa.sigec.rest.dev;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.RETURNS_SELF;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.MockedStatic;

/**
 * Testes das acoes NCR desativadas em {@link ProcessadorDevRest}: os metodos
 * listarMensagensEnvioFilaNCR e publicarMensagemEnvioFilaNCR nao existem mais no negocio.
 */
public class ProcessadorDevRestTest {

	@BeforeClass
	public static void definirAmbiente() {
		// AMBIENTE e lido uma unica vez (static final) quando a classe e inicializada.
		System.setProperty("AMBIENTE", "des");
	}

	@Test
	public void acaoListarMensagensEnvioDeveInformarIndisponibilidade() {
		final ProcessadorDevRest rest = new ProcessadorDevRest();
		rest.init();

		final UnsupportedOperationException ex = assertThrows(UnsupportedOperationException.class,
				() -> rest.executar("NCR.listarMensagensEnvio"));

		assertTrue(ex.getMessage().contains("listarMensagensEnvioFilaNCR"));
	}

	@Test
	public void publicarNcrDeveResponder501() {
		final ProcessadorDevRest rest = new ProcessadorDevRest();
		final ResponseBuilder builder = mock(ResponseBuilder.class, RETURNS_SELF);
		final Response resposta = mock(Response.class);
		when(builder.build()).thenReturn(resposta);

		try (MockedStatic<Response> estatico = mockStatic(Response.class)) {
			estatico.when(() -> Response.status(501)).thenReturn(builder);

			final Response retorno = rest.publicarNcr("{}");

			assertSame(resposta, retorno);
			estatico.verify(() -> Response.status(501));
		}

		final ArgumentCaptor<Object> corpo = ArgumentCaptor.forClass(Object.class);
		verify(builder).entity(corpo.capture());
		assertTrue(corpo.getValue().toString().contains("publicarMensagemEnvioFilaNCR"));
	}
}
