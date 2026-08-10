package br.gov.caixa.spi.dict.ejb;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

import br.gov.caixa.dict.comum.enums.StatusDevolucao;
import br.gov.caixa.dict.comum.enums.TipoConta;
import br.gov.caixa.mpi.dict.api.dto.ContaDevolucaoDto;
import br.gov.caixa.spi.dict.dao.*;
import br.gov.caixa.spi.dict.model.*;
import br.gov.caixa.spi.dict.util.JBossProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

import br.gov.caixa.dict.comum.enums.RazaoDevolucao;
import br.gov.caixa.mpi.dict.api.dto.DevolucaoDto;
import java.math.BigDecimal;
import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
public class EventoDevolucaoBacenHelperEjbTest {

	public static final String ID_TRANSACAO = "idtransacao";
	private static final String ID_TRANSACAO_PAGAMENTO = "E0036030520260000000000000000001";
	private static final String ID_TRANSACAO_DEVOLUCAO = "D0036030520260000000000000000001";
	private static final String ID_END_TO_END_ORIGINAL = "E0036030520269999999999999999999";
	public static final String PSPCONTESTADO = "pspcontestado";
	public static final String PSP = "psp";
	public static final String ISPB_CAIXA = "00360305";
	@InjectMocks
	private EventoDevolucaoBacenHelperEjb ejb;
	
	@Mock
    private DevolucaoPagamentoDao devolucaoPagamentoDao;
	
	@Mock
	private SituacaoDevolucaoDao situacaoDevolucaoDao;

	@Mock
	private DevolucaoBacenDao devolucaoBacenDao;

	@Mock
	private JBossProperties jBossProperties;

	@Mock
	private EventoFecharDevolucaoEjb devolucaoEjb;

	@Mock
	private PagamentoDao pagamentoDao;

	@Mock
	private RelatoInfracaoDao relatoInfracaoDao;

	@Mock
	private AntiFraudeEjb antiFraudeEjb;

	@Mock
	private DevolucaoDao devolucaoDao;
	
	@Test
	public void testTrataNovaDevolucaoREFUNDCANCELLED() {
		
		when(devolucaoPagamentoDao.findByIdOperacaoSemLimiteData(Mockito.any())).thenReturn(DevolucaoPagamento.builder().build()); 
		
		Boolean retorno = ejb.trataNovaDevolucao(DevolucaoDto.builder().razao(RazaoDevolucao.REFUND_CANCELLED).build());
		assertFalse(retorno);
	}
	
	@Test
	public void testTrataNovaDevolucaoOPERATIONALFLAW() {
		Boolean retorno = ejb.trataNovaDevolucao(DevolucaoDto.builder().razao(RazaoDevolucao.OPERATIONAL_FLAW).build());
		assertFalse(retorno);
	}

	@Test
	public void testTrataNovaDevolucaoPixAutomaticoSucesso() {

		when(pagamentoDao.findByEndToEndId(anyString())).thenReturn(new Pagamento());
		when(devolucaoDao.save(anyObject())).thenReturn(new Devolucao());
		when(situacaoDevolucaoDao.save(anyObject())).thenReturn(new SituacaoDevolucao());

		boolean retorno = ejb.trataNovaDevolucao(DevolucaoDto.builder().razao(RazaoDevolucao.PIX_AUTOMATICO).build());
		assertTrue(retorno);
	}

	@Test
	public void testTrataNovaDevolucaoPixAutomaticoPagamentoNaoEncontrado() {

		when(pagamentoDao.findByEndToEndId(anyString())).thenReturn(null);
		when(devolucaoDao.save(anyObject())).thenReturn(new Devolucao());
		when(situacaoDevolucaoDao.save(anyObject())).thenReturn(new SituacaoDevolucao());

		boolean retorno = ejb.trataNovaDevolucao(DevolucaoDto.builder().razao(RazaoDevolucao.PIX_AUTOMATICO).build());
		assertFalse(retorno);
	}
	
	@Test
	public void testTrataNovaDevolucaoFRAUD() {
		DevolucaoDto dev = DevolucaoDto.builder()
				.razao(RazaoDevolucao.FRAUD)
				.idTransacao(ID_TRANSACAO_PAGAMENTO)
				.build();
		when(pagamentoDao.findByEndToEndId(ID_TRANSACAO_PAGAMENTO)).thenReturn(null);
		Boolean retorno = ejb.trataNovaDevolucao(dev);
		assertFalse(retorno);
	}

	@Test
	public void testTrataNovaDevolucaoSemIdTransacao() {
		DevolucaoDto dev = DevolucaoDto.builder()
				.razao(RazaoDevolucao.FRAUD)
				.idTransacao(null)
				.build();

		Boolean retorno = ejb.trataNovaDevolucao(dev);

		assertFalse(retorno);
		verifyZeroInteractions(pagamentoDao, devolucaoPagamentoDao);
	}
	
	@Test
	public void testTratarAtualizacaoDevolucao() {
		when(situacaoDevolucaoDao.isSituacaoJaCadastradaParaDevolucao(Mockito.any(), Mockito.any())).thenReturn(false);
		ejb.tratarAtualizacaoDevolucao(DevolucaoDto.builder().build());
	}
	
	@Test
	public void atualizarSituacaoDevolucao() {
		ejb.atualizarSituacaoDevolucao(DevolucaoDto.builder().protocoloBacen(Mockito.any()) .build(), Devolucao.builder().protocoloBacen(Mockito.any()) .build());
	}
	
	@Test
	public void novaDevolucao() {
		ejb.novaDevolucao(DevolucaoDto.builder().build(), Pagamento.builder().build(), RelatoInfracao.builder().build());
	}
	
	@Test
	public void novaDevolucaoRefundCancelled() {
		ejb.novaDevolucaoRefundCancelled(DevolucaoDto.builder().build(), DevolucaoPagamento.builder().build(), RelatoInfracao.builder().build());
	}

	@Test
	public void tratarAtualizacaoDevolucaoTest(){

		DevolucaoDto dev = new DevolucaoDto();
		dev.setStatus(StatusDevolucao.IN_PROGRESS);

		Devolucao devolucaoOld = new Devolucao();
		devolucaoOld.setId(1L);

		when(devolucaoBacenDao.obterDevolucaoPorProtocoloBacen(any())).thenReturn(devolucaoOld);

		ejb.tratarAtualizacaoDevolucao(dev);

		verify(devolucaoBacenDao).obterDevolucaoPorProtocoloBacen(any());
	}

	@Test
	public void tratarAtualizacaoDevolucaoTestSituacaoNaoCadastrada(){
		DevolucaoDto dev = new DevolucaoDto();
		dev.setStatus(StatusDevolucao.IN_PROGRESS);

		Devolucao devolucaoOld = new Devolucao();
		devolucaoOld.setId(1L);

		when(situacaoDevolucaoDao.isSituacaoJaCadastradaParaDevolucao(any(),any())).thenReturn(true);
		when(devolucaoBacenDao.obterDevolucaoPorProtocoloBacen(any())).thenReturn(devolucaoOld);

		ejb.tratarAtualizacaoDevolucao(dev);
		verify(devolucaoBacenDao).obterDevolucaoPorProtocoloBacen(any());
	}

	@Test
	public void atualizarSituacaoDevolucaoTestCatch(){
		DevolucaoDto dev = new DevolucaoDto();

		dev.setStatus(StatusDevolucao.CANCELLED);
		dev.setRazao(RazaoDevolucao.REFUND_CANCELLED);
		Devolucao devolucaoOld = new Devolucao();

		when(devolucaoBacenDao.obterRazaoDevolucaoOriginal(any())).thenReturn(RazaoDevolucao.FRAUD);

		ejb.atualizarSituacaoDevolucao(dev, devolucaoOld);

		verify(situacaoDevolucaoDao).saveNativeQuery(dev,devolucaoOld);
	}
	@Test
	public void atualizarSituacaoDevolucaoTestFraud(){
		DevolucaoDto dev = new DevolucaoDto();

		dev.setStatus(StatusDevolucao.CLOSED);
		dev.setRazao(RazaoDevolucao.FRAUD);
		Devolucao devolucaoOld = new Devolucao();

		when(devolucaoBacenDao.obterRazaoDevolucaoOriginal(any())).thenReturn(RazaoDevolucao.FRAUD);

		ejb.atualizarSituacaoDevolucao(dev, devolucaoOld);
		verify(situacaoDevolucaoDao).saveNativeQuery(dev,devolucaoOld);
	}

	@Test
	public void trataNovaDevolucaoPixAutomatico(){
		Pagamento pagamento = new Pagamento();

		DevolucaoDto dev = new DevolucaoDto();
		dev.setIdTransacao(ID_TRANSACAO);
		dev.setRazao(RazaoDevolucao.PIX_AUTOMATICO);

		when(pagamentoDao.findByEndToEndId(ID_TRANSACAO)).thenReturn(pagamento);

		boolean resultado = ejb.trataNovaDevolucao(dev);

		verify(pagamentoDao).findByEndToEndId(ID_TRANSACAO);

		assertTrue(resultado);
	}


	@Test
	public void trataFechamentoDevolucaoTestRefundCancelled(){
		DevolucaoDto dev = new DevolucaoDto();
		dev.setIdTransacao(ID_TRANSACAO_DEVOLUCAO);
		dev.setPspContestado(PSPCONTESTADO);
		dev.setRazao(RazaoDevolucao.REFUND_CANCELLED);

		when(jBossProperties.getIspbCaixa()).thenReturn(PSPCONTESTADO);
		when(devolucaoPagamentoDao.findByIdOperacaoSemLimiteData(ID_TRANSACAO_DEVOLUCAO)).thenReturn(new DevolucaoPagamento());
		ejb.trataFechamentoDevolucao(dev);
		verify(devolucaoEjb).fecharDevolucaoPagamento(any(),any());
	}

	@Test
	public void trataFechamentoDevolucaoTest(){
		DevolucaoDto dev = new DevolucaoDto();
		dev.setIdTransacao(ID_TRANSACAO_PAGAMENTO);
		dev.setPspContestado(PSPCONTESTADO);
		dev.setRazao(RazaoDevolucao.FRAUD);

		when(jBossProperties.getIspbCaixa()).thenReturn(PSPCONTESTADO);
		when(pagamentoDao.findByEndToEndId(ID_TRANSACAO_PAGAMENTO)).thenReturn(new Pagamento());
		ejb.trataFechamentoDevolucao(dev);
		verify(devolucaoEjb).fecharDevolucao(any(),any());
	}
	@Test
	public void processaDevolucaoPixAutomaticoTestException(){

		DevolucaoDto dev = new DevolucaoDto();
		dev.setIdTransacao(ID_TRANSACAO);
		dev.setRazao(RazaoDevolucao.PIX_AUTOMATICO);

		doThrow(new RuntimeException())
				.when(pagamentoDao).findByEndToEndId(ID_TRANSACAO);
		try {
			ejb.trataNovaDevolucao(dev);
		}
		catch (Exception e){
			assertFalse(ejb.trataNovaDevolucao(dev));
		}
	}
	@Test
	public void processaDevolucaoCanceladaTestRazaoFraud(){
		DevolucaoDto dev = new DevolucaoDto();
		dev.setIdTransacao(ID_TRANSACAO_DEVOLUCAO);
		dev.setRazao(RazaoDevolucao.FRAUD);
		dev.setStatus(StatusDevolucao.CLOSED);
		dev.setValor("100.00");
		dev.setProtocoloBacen("PROTOCOLO-TESTE");
		dev.setPspRequisitante(PSP);
		dev.setPspContestado(PSP);

		DevolucaoPagamento devolucaoPagamento = new DevolucaoPagamento();
		Pagamento pagamentoOriginal = new Pagamento();
		pagamentoOriginal.setIdEndToEnd(ID_END_TO_END_ORIGINAL);
		devolucaoPagamento.setMensagemPagamento(pagamentoOriginal);

		RelatoInfracao relatoInfracao = new RelatoInfracao();

		when(devolucaoPagamentoDao.findByIdOperacaoSemLimiteData(ID_TRANSACAO_DEVOLUCAO)).thenReturn(devolucaoPagamento);
		when(devolucaoBacenDao.obterRazaoDevolucaoOriginal(ID_END_TO_END_ORIGINAL)).thenReturn(RazaoDevolucao.FRAUD);
		when(relatoInfracaoDao.findByDevolucaoPagamentoETipoRelato(any(),any())).thenReturn(Optional.of(relatoInfracao));
		when(jBossProperties.getIspbCaixa()).thenReturn(PSP);

		assertTrue(ejb.trataNovaDevolucao(dev));
	}
	@Test
	public void processaDevolucaoCanceladaTestRazaoFraudRelatoAusente(){
		DevolucaoDto dev = new DevolucaoDto();
		dev.setIdTransacao(ID_TRANSACAO);
		dev.setRazao(RazaoDevolucao.REFUND_CANCELLED);

		DevolucaoPagamento devolucaoPagamento = new DevolucaoPagamento();
		devolucaoPagamento.setMensagemPagamento(new Pagamento());

		when(devolucaoPagamentoDao.findByIdOperacaoSemLimiteData(ID_TRANSACAO)).thenReturn(devolucaoPagamento);
		when(devolucaoBacenDao.obterRazaoDevolucaoOriginal(any())).thenReturn(RazaoDevolucao.FRAUD);
		when(relatoInfracaoDao.findByDevolucaoPagamentoETipoRelato(any(),any())).thenReturn(Optional.empty());

		assertFalse(ejb.trataNovaDevolucao(dev));
	}
	@Test
	public void processaDevolucaoCanceladaTestRazaoDiferenteDeFraud(){
		DevolucaoDto dev = new DevolucaoDto();
		dev.setIdTransacao(ID_TRANSACAO);
		dev.setRazao(RazaoDevolucao.REFUND_CANCELLED);

		DevolucaoPagamento devolucaoPagamento = new DevolucaoPagamento();
		devolucaoPagamento.setMensagemPagamento(new Pagamento());


		when(devolucaoPagamentoDao.findByIdOperacaoSemLimiteData(ID_TRANSACAO)).thenReturn(devolucaoPagamento);
		when(devolucaoBacenDao.obterRazaoDevolucaoOriginal(any())).thenReturn(RazaoDevolucao.REFUND_CANCELLED);

		assertFalse(ejb.trataNovaDevolucao(dev));
	}
	@Test
	public void processaDevolucaoCanceladaTestRazaoNull(){
		DevolucaoDto dev = new DevolucaoDto();
		dev.setIdTransacao(ID_TRANSACAO);
		dev.setRazao(RazaoDevolucao.REFUND_CANCELLED);

		assertFalse(ejb.trataNovaDevolucao(dev));
	}
	@Test
	public void processaDevolucaoFalhaOperacionalTest(){
		DevolucaoDto dev = new DevolucaoDto();
		dev.setIdTransacao(ID_TRANSACAO);
		dev.setRazao(RazaoDevolucao.OPERATIONAL_FLAW);
		dev.setStatus(StatusDevolucao.IN_PROGRESS);

		Pagamento pagamento = new Pagamento();

		when(pagamentoDao.findByEndToEndId(ID_TRANSACAO)).thenReturn(pagamento);

		assertTrue(ejb.trataNovaDevolucao(dev));
	}
	@Test
	public void processaDevolucaoFalhaOperacionalTestException(){
		DevolucaoDto dev = new DevolucaoDto();
		dev.setIdTransacao(ID_TRANSACAO);
		dev.setRazao(RazaoDevolucao.OPERATIONAL_FLAW);
		//faltando status

		Pagamento pagamento = new Pagamento();

		when(pagamentoDao.findByEndToEndId(ID_TRANSACAO)).thenReturn(pagamento);

		assertFalse(ejb.trataNovaDevolucao(dev));
	}
	@Test
	public void  processaDevolucaoFraudeTest(){
		DevolucaoDto dev = new DevolucaoDto();
		dev.setIdTransacao(ID_TRANSACAO_PAGAMENTO);
		dev.setRazao(RazaoDevolucao.FRAUD);
		dev.setStatus(StatusDevolucao.IN_PROGRESS);

		Pagamento pagamento = new Pagamento();

		when(pagamentoDao.findByEndToEndId(ID_TRANSACAO_PAGAMENTO)).thenReturn(pagamento);
		when(relatoInfracaoDao.findByPagamentoETipoRelatoETipoAnalise(any(),any(),any(),any())).thenReturn(Optional.of(BigDecimal.valueOf(101)));

		assertTrue(ejb.trataNovaDevolucao(dev));
	}
	@Test
	public void  processaDevolucaoFraudeTestException(){
		DevolucaoDto dev = new DevolucaoDto();
		dev.setIdTransacao(ID_TRANSACAO);
		dev.setRazao(RazaoDevolucao.FRAUD);

		Pagamento pagamento = new Pagamento();

		when(pagamentoDao.findByEndToEndId(ID_TRANSACAO)).thenReturn(pagamento);
		when(relatoInfracaoDao.findByPagamentoETipoRelatoETipoAnalise(any(),any(),any(),any())).thenReturn(Optional.of(BigDecimal.valueOf(101)));

		assertFalse(ejb.trataNovaDevolucao(dev));
	}
	@Test
	public void  processaDevolucaoFraudeTestIdAusente(){
		DevolucaoDto dev = new DevolucaoDto();
		dev.setIdTransacao(ID_TRANSACAO);
		dev.setRazao(RazaoDevolucao.FRAUD);

		Pagamento pagamento = new Pagamento();

		when(pagamentoDao.findByEndToEndId(ID_TRANSACAO)).thenReturn(pagamento);
		when(relatoInfracaoDao.findByPagamentoETipoRelatoETipoAnalise(any(),any(),any(),any())).thenReturn(Optional.empty());

		assertFalse(ejb.trataNovaDevolucao(dev));
	}

	@Test
	public void processarDevolucaoFraude() {
		DevolucaoDto dev = new DevolucaoDto();
		dev.setIdTransacao(ID_TRANSACAO_PAGAMENTO);
		dev.setRazao(RazaoDevolucao.FRAUD);
		dev.setCodigoRecuperacaoValores("crv");

		Usuario usuario = new Usuario();
		usuario.setCpfCnpj("cpf123");
		usuario.setIspbParticipante(ISPB_CAIXA);
		usuario.setConta("conta123");
		usuario.setTipoConta(TipoConta.CACC);
		Pagamento pagamento = new Pagamento();
		pagamento.setUsuarioPagador(usuario);


		ContaDevolucaoDto contaDevolucao = new ContaDevolucaoDto();
		contaDevolucao.setCpfCnpj("cpf456");
		contaDevolucao.setIspb(ISPB_CAIXA);
		String produto = "1288";
		contaDevolucao.setNumeroConta(produto + "conta456");
		contaDevolucao.setTipoConta(TipoConta.CACC);
		dev.setContaDevolucao(contaDevolucao);

		when(pagamentoDao.findByEndToEndId(anyString())).thenReturn(pagamento);
		when(jBossProperties.getIspbCaixa()).thenReturn(ISPB_CAIXA);
		when(relatoInfracaoDao.findByPagamentoETipoRelatoETipoAnalise(any(),any(),any(),any())).thenReturn(Optional.of(BigDecimal.ONE));

		ejb.trataNovaDevolucao(dev);
	}
}
