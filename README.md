package br.gov.caixa.sigec.rest.dev;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.RETURNS_SELF;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;

import javax.enterprise.inject.Instance;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.MockedStatic;

import br.gov.caixa.azure.servicebus.dto.DadosGECTedDTO;
import br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCR;

/**
 * Testes de {@link ProcessadorDevRest}: acoes NCR desativadas (os metodos
 * listarMensagensEnvioFilaNCR e publicarMensagemEnvioFilaNCR nao existem mais no negocio) e
 * acoes NCR que resolvem o negocio via {@link Instance} (resolucao tardia).
 */
public class ProcessadorDevRestTest {

	@BeforeClass
	public static void definirAmbiente() {
		// AMBIENTE e lido uma unica vez (static final) quando a classe e inicializada.
		System.setProperty("AMBIENTE", "des");
	}

	/**
	 * Cria o REST com o NCR resolvido por um {@link Instance} falso (equivale ao que o CDI injeta).
	 */
	@SuppressWarnings("unchecked")
	private static ProcessadorDevRest restComNcr(final TransferenciaEletronicaLegacyCallNCR ncr) throws Exception {
		final ProcessadorDevRest rest = new ProcessadorDevRest();
		final Instance<TransferenciaEletronicaLegacyCallNCR> instancia = mock(Instance.class);
		when(instancia.get()).thenReturn(ncr);

		final Field campo = ProcessadorDevRest.class.getDeclaredField("transferenciaEletronicaLegacyCallNCR");
		campo.setAccessible(true);
		campo.set(rest, instancia);

		rest.init();
		return rest;
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

	@Test
	public void acoesNcrDevemResolverNegocioPorInstanceEInvocalo() throws Exception {
		final TransferenciaEletronicaLegacyCallNCR ncr = mock(TransferenciaEletronicaLegacyCallNCR.class);
		final ProcessadorDevRest rest = restComNcr(ncr);
		final ResponseBuilder builder = mock(ResponseBuilder.class, RETURNS_SELF);
		final Response resposta = mock(Response.class);
		when(builder.build()).thenReturn(resposta);

		try (MockedStatic<Response> estatico = mockStatic(Response.class)) {
			estatico.when(() -> Response.ok(any())).thenReturn(builder);

			assertSame(resposta, rest.executar("NCR.processarRecebimentosBaseEnvioNCR"));
			assertSame(resposta, rest.executar("NCR.recuperarDadosEnvioFilaNCR"));
			assertSame(resposta, rest.executar("NCR.processarRecebimentoNCR"));
		}

		verify(ncr).processarRecebimentosBaseEnvioNCR();
		verify(ncr).recuperarDadosEnvioFilaNCR();
		verify(ncr).processarRecebimentoNCR();
	}

	@Test
	public void enviarNcrDeveProcessarEnvioPeloNegocioResolvidoPorInstance() throws Exception {
		final TransferenciaEletronicaLegacyCallNCR ncr = mock(TransferenciaEletronicaLegacyCallNCR.class);
		final ProcessadorDevRest rest = restComNcr(ncr);
		final ResponseBuilder builder = mock(ResponseBuilder.class, RETURNS_SELF);
		final Response resposta = mock(Response.class);
		when(builder.build()).thenReturn(resposta);

		try (MockedStatic<Response> estatico = mockStatic(Response.class)) {
			estatico.when(() -> Response.ok(any())).thenReturn(builder);

			assertSame(resposta, rest.enviarNcr("{}"));
		}

		verify(ncr).processarEnvioTRC(any(DadosGECTedDTO.class));
	}
}
