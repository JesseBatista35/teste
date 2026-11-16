Me mande estes 3 arquivos (ou os trechos):

gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCR.java (a interface).

package br.gov.caixa.sigec.negocio;

import javax.ejb.Local;

import br.gov.caixa.arqrefcore.excecao.BusinessException;
import br.gov.caixa.azure.servicebus.dto.DadosGECTedDTO;
import br.gov.caixa.azure.servicebus.dto.DadosNCRTedDTO;

@Local
public interface TransferenciaEletronicaLegacyCallNCR {

	void recuperarDadosEnvioFilaNCR() throws Exception;

	DadosGECTedDTO processarEnvioTRC(DadosGECTedDTO dto) throws BusinessException;

	void processarRecebimentoNCR() throws Exception;

	void processarRecebimentosBaseEnvioNCR();

	void atualizarStatusTedsPropriedadeNCR(DadosNCRTedDTO dto);
}

gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java (a implementação).



package br.gov.caixa.sigec.negocio;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;
import javax.jms.ConnectionFactory;
import javax.jms.Queue;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.commons.lang3.StringUtils;

import com.azure.messaging.servicebus.ServiceBusReceivedMessage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import br.gov.caixa.arqrefcore.excecao.BusinessException;
import br.gov.caixa.arqrefcore.log.Logging;
import br.gov.caixa.azure.servicebus.ReceiverServiceBus;
import br.gov.caixa.azure.servicebus.dto.DadosGECTedDTO;
import br.gov.caixa.azure.servicebus.dto.DadosNCRTedDTO;
import br.gov.caixa.portabilidade.util.DataUtil;
import br.gov.caixa.portabilidade.util.ObjectUtil;
import br.gov.caixa.portabilidade.util.StringUtil;
import br.gov.caixa.sigec.dominio.SituacaoTED;
import br.gov.caixa.sigec.dominio.TEDHabitacao;
import br.gov.caixa.sigec.dominio.TipoContratoEventoContabil;
import br.gov.caixa.sigec.enums.SituacaoTEDEnum;
import br.gov.caixa.sigec.excecao.MessageProcessException;
import br.gov.caixa.sigec.persistencia.DAOTEDHabitacao;
import br.gov.caixa.sigec.persistencia.DAOTipoContratoEventoContabil;
import br.gov.caixa.sigec.util.ConstantesUtil;
import br.gov.caixa.sigec.util.DateUtil;
import br.gov.caixa.sigec.util.NumeroUtil;
import lombok.NoArgsConstructor;

/**
 *
 * @author filipe.gomes
 * 
 */
@Singleton
@LocalBean
@Logging
@NoArgsConstructor
@TransactionManagement(TransactionManagementType.BEAN)
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
public class TransferenciaEletronicaLegacyCallNCRBean extends CMTSuporte implements TransferenciaEletronicaLegacyCallNCR {
	private static final Logger LOG = Logger.getLogger(TransferenciaEletronicaLegacyCallNCRBean.class.getSimpleName());

	private static final String JNDI_VERIFICACAO_TED_CONNECTION_FACTORY = "java:global/remoteJMS/verificacaoTedConnectionFactory";
	private static final String JNDI_VERIFICACAO_TED_QUEUE = "java:global/remoteJMS/queueVerificacaoTed";
	
	private TEDHabitacaoService tedHabitacaoService;
	
	private DAOTEDHabitacao daotedHabitacao;
	
	private DAOTipoContratoEventoContabil daoTipoContratoEventoContabil;
	
	public static boolean PROCESSAR_RECEBIMENTO_BASE = Boolean.TRUE;
	
	/**
	 * Recupera STR0047 e STR0048 com dados para envio ao TRC de forma legado (CICs)
	 * @throws Exception 
	 */
	@Override
	public void recuperarDadosEnvioFilaNCR() throws Exception {
		ReceiverServiceBus receiverServiceBus = new ReceiverServiceBus();
		//Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Listner;SharedAccessKey=ZwKtWXstbi4vdaAwEMF/bqFt32Uo1b3pc+ASbKjIkbA=;EntityPath=queue-envio-ted-des
		String conexao = ConstantesUtil.CONNECTION_QUEUE_REQ_ENVIO_TED_NCR;
		//queue-envio-ted-des
		String fila = ConstantesUtil.QUEUE_ENVIO_TED_NCR;
		receiverServiceBus.receiveMessagesQueue(conexao, fila, (context) -> {
			ServiceBusReceivedMessage message = context.getMessage();
			ObjectMapper om = new ObjectMapper();
			om.registerModule(new JavaTimeModule());
			try {
				final String json = message.getBody().toString();
				final DadosGECTedDTO dto = om.readValue(json, DadosGECTedDTO.class);
				processarEnvioTRC(dto);
				context.complete();
				LOG.log(Level.INFO, "\n\nrecuperarDadosEnvioFilaNCR >>>>>>>>>>>>>>>>> {0}\n", json);
			} catch (JsonProcessingException e) {
				LOG.log(Level.SEVERE, "Falha ao fazer leitura ou parse do json para o objeto.", e);
				LOG.log(Level.SEVERE, e.getLocalizedMessage(), e);
			} catch (IOException e) {
				LOG.log(Level.SEVERE, "Falha ao realizar envio de TED.");
				LOG.log(Level.SEVERE, e.getLocalizedMessage(), e);
			} catch (BusinessException e) {
				LOG.log(Level.SEVERE, "Falha ao realizar envio de TED.");
				LOG.log(Level.SEVERE, e.getLocalizedMessage(), e);
			}
		});
	}

	public DadosGECTedDTO processarEnvioTRC(DadosGECTedDTO dto) throws BusinessException {
		try {
			/**
			 * STR0047
			 */
			if (ObjectUtil.isFilled(dto)) {
				
				if (dto.getCoMensagem().equals(ConstantesUtil.STR0047) || dto.getCoMensagem().equals(ConstantesUtil.STR0048)) {
					TEDHabitacao transferenciaEletronica = new TEDHabitacao();
					Date dataAtual = new Date();
					
					transferenciaEletronica.setNumeroTed(dto.getNuTed());
					transferenciaEletronica.setNumeroFebraban(dto.getNuFebraban());
					transferenciaEletronica.setCodigoISPBCreditada(dto.getNuIspbCredito());
					transferenciaEletronica.setNumeroISPBCreditada(dto.getNuIspbCredito());
					transferenciaEletronica.setNumeroAgenciaCreditada(dto.getNuAgenciaCreditada());
					transferenciaEletronica.setCodigoBacen(dto.getCoBacen());
					transferenciaEletronica.setTipoTed(dto.getCoMensagem());
					transferenciaEletronica.setSistemaDestino(ConstantesUtil.SITRC);
					transferenciaEletronica.setSistemaOrigem(ConstantesUtil.SINCR);
					transferenciaEletronica.setDataEnvio(DateUtil.convertToDateViaInstant(dto.getDtEnvioTed()));
					transferenciaEletronica.setDataTransacao(DateUtil.convertToDateViaInstant(dto.getDtTransacao()));
					transferenciaEletronica.setHoraTransacao(dataAtual);
					transferenciaEletronica.setNomeResponsavelEnvio(dto.getNoResponsavelEnvio());
					transferenciaEletronica.setNumeroFebraban(dto.getNuFebraban());
					transferenciaEletronica.setValorLancamento(dto.getVrLancamento());
					transferenciaEletronica.setNomeClienteCredito(dto.getNomeClienteCredito());
					transferenciaEletronica.setNumeroContaCredito(dto.getNuContaCredito());
					transferenciaEletronica.setNumeroContratoOriginal(dto.getNumeroContratoCredito());
					transferenciaEletronica.setNumeroCnpjClienteCredito(dto.getNuCnpjClienteCredito());
					transferenciaEletronica.setNumeroCpfCnpjSolicitante(dto.getNuCpfCnpjSolicitante());
					transferenciaEletronica.setPvOrigem(dto.getNuPvOrigemTransacao());
					transferenciaEletronica.setNumeroBancoCreditado(dto.getNumeroBanco());
					transferenciaEletronica.setNomeDevedor(dto.getNoDevedor());
					
					try {
						TEDHabitacao transferenciaEletronicaTRC = null;
						DadosGECTedDTO dados = null;

						/**
						 * STR0047
						 */
						if (ConstantesUtil.STR0047.equals(dto.getCoMensagem())) {
							LOG.log(Level.INFO, "\n\n>>>>>>> Enviando TED STR0047...");
							
							super.begin();
							transferenciaEletronicaTRC = tedHabitacaoService.enviarTED(transferenciaEletronica, dto.getNoResponsavelEnvio());
							super.commit();

							LOG.log(Level.INFO, ">>>>>>> Enviando dados TED STR0047 ao NCR...\n\n");
							dados = parseProcessarEnvioToDTOHabitacao(transferenciaEletronicaTRC, dto.getNumeroBanco(), 'R');
						}

						/**
						 * STR0048
						 */
						if (ConstantesUtil.STR0048.equals(dto.getCoMensagem())) {
							LOG.log(Level.INFO, "\n\n>>>>>>> Enviando TED STR0048...");

							super.begin();
							transferenciaEletronicaTRC = tedHabitacaoService.acataDevolveTED(NumeroUtil.nullIfZero(dto.getNuTed()), dto.getNoResponsavelEnvio(), "I", dto.getNuTipoContrato(), NumeroUtil.nullIfZeroInt(dto.getCoMensagemTrc()));
							super.commit();

							LOG.log(Level.INFO, ">>>>>>> Enviando dados TED STR0048 ao NCR...\n\n");
							dados = this.parseProcessarEnvioToDTO(transferenciaEletronicaTRC, dto.getNumeroBanco(), 'R');
							dados.setCoMensagem(ConstantesUtil.STR0048);
						}
						return dados;
					} catch (Exception e) {
						LOG.log(Level.SEVERE, e.getLocalizedMessage(), e);
						throw new MessageProcessException(e);
					}
				}else {
                    LOG.log(Level.SEVERE, "A mensagem não pertence nao atende ao formato esperado STR47/STR48");
                    throw  new BusinessException("A mensagem não pertence nao atende ao formato esperado STR47/STR48");
                }
			}else{
                LOG.log(Level.SEVERE, "A mensagem não pertence nao atende ao formato esperado STR47/STR48");
                throw  new BusinessException("A mensagem não pertence nao atende ao formato esperado STR47/STR48");
            }
			
		} catch(Exception e) {
            if(e instanceof  BusinessException) {
                throw e;
            }
			LOG.log(Level.SEVERE, e.getLocalizedMessage(), e);
			throw new BusinessException(e);
		}
	}
	
	/**
	 * Recupera STR0047R2 do NCR indicando quais as TEDs são e não são de sua propriedade
	 */
	@Override
	public void processarRecebimentoNCR() throws Exception {
		ReceiverServiceBus receiverServiceBus = new ReceiverServiceBus();
		//Endpoint=sb://sb-credito-des.servicebus.windows.net/;SharedAccessKeyName=Listener;SharedAccessKey=kV2eqtd4Ye3vDsItwoQb4jhGwANBa1V5O+ASbPkRCBA=;EntityPath=queue-rsp-pagamento-ted-des
		String conexao = ConstantesUtil.CONNECTION_QUEUE_RSP_PAGAMENTO_TED_NCR;
		//queue-rsp-pagamento-ted-des
		String fila = ConstantesUtil.QUEUE_RSP_PAGAMENTO_TED_NCR;
		receiverServiceBus.receiveMessagesQueue(conexao, fila, (context) -> {
			ServiceBusReceivedMessage message = context.getMessage();
			ObjectMapper om = new ObjectMapper();
			om.registerModule(new JavaTimeModule());
			try {
				final String json = message.getBody().toString();
				final DadosNCRTedDTO dto = om.readValue(json, DadosNCRTedDTO.class);
				atualizarStatusTedsPropriedadeNCR(dto);
				context.complete();
				LOG.log(Level.INFO, "\n\nprocessarRecebimentoNCR >>>>>>>>>>>>>>>>> {0}", json);
			} catch (JsonProcessingException e) {
				LOG.log(Level.SEVERE, "Falha ao fazer leitura ou parse do json para o objeto.", e);
				LOG.log(Level.SEVERE, e.getLocalizedMessage(), e);
			} catch (IOException e) {
				LOG.log(Level.SEVERE, "Falha ao fazer leitura ou parse do json para o objeto.", e);
				LOG.log(Level.SEVERE, e.getLocalizedMessage(), e);
			}
		});
	}

//	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void atualizarStatusTedsPropriedadeNCR(DadosNCRTedDTO dto) {
			try {
                if (dto.getCodMsg().equals(ConstantesUtil.STR0047R2)) {
                		super.begin();
						TEDHabitacao transferenciaeletronHabitacao = daotedHabitacao.obterPorNumeroTipoTed(dto.getNsuTrc(), ConstantesUtil.STR0047R2);
						super.commit();
						if (ObjectUtil.isFilled(transferenciaeletronHabitacao)) {
							if (dto.isPortddNcr()) {
								transferenciaeletronHabitacao.setNumeroEventoContabil(recuperaNumeroEventoContabil());
								transferenciaeletronHabitacao.setSituacaoEnvio(new SituacaoTED(SituacaoTEDEnum.TED_PROPRIEDADE_NCR.codigo()));
							} else {
								transferenciaeletronHabitacao.setSituacaoEnvio(new SituacaoTED(SituacaoTEDEnum.TED_RECEBIDA.codigo()));
							}
							super.begin();
							daotedHabitacao.atualizar(transferenciaeletronHabitacao);
							super.commit();
                            LOG.log(Level.INFO, "A TED foi atualizada com sucesso. Numero da TED: {0}", dto.getNsuTrc());
						}else{
                            LOG.log(Level.INFO, "A TED não foi localizada na base de dados. Numero da TED: {0}", dto.getNsuTrc());
                        }
				}else{
                    LOG.log(Level.SEVERE, "A mensagem não pertence nao atende ao formato esperado STR0047R2");
                }
			} catch (Exception e) {
                LOG.log(Level.SEVERE, "Falha ao processar atualização da TED NCR ({0}) {1}", new Object[] {dto.getCodMsg(), dto.getNsuTrc()});
				throw new MessageProcessException("Falha durante o processo de atualização",e);
			}
	}

	@Override
	public void processarRecebimentosBaseEnvioNCR() {
		try {
			// Trava FLAG para processamento batch R1/R2
			TransferenciaEletronicaLegacyCallNCRBean.PROCESSAR_RECEBIMENTO_BASE = Boolean.FALSE;
		
			super.begin();
	        //ENVIAR SOMENTE STR0047R1/STR0048R1 E STR0047R2/STR0048R2
			final List<TEDHabitacao> tedsAguardandoValidacaoHabitacao = daotedHabitacao.obterTedsAguardandoValidacaoNCR();
			final List<TEDHabitacao> tedsAguardandoEnvioHabitacao = daotedHabitacao.obterTedsAguardandoEnvioNCR();
			super.commit();
			
			/**
			 * Atualização de status e envio do STR0047R2
			 */
			if (ObjectUtil.isFilled(tedsAguardandoValidacaoHabitacao)) {
				LOG.log(Level.INFO, "\n\n>>>>>>> Qtd de TEDs STR0047R2 habitação aguardando validacao recuperados da base {0}", tedsAguardandoValidacaoHabitacao.size());
	
				super.begin();
				tedsAguardandoValidacaoHabitacao.forEach(ted -> {
					try {
						daotedHabitacao.atualizarSituacaoPorId(ted.getCodigo(), SituacaoTEDEnum.TED_ENVIADA_NCR.codigo(),	ted.getTipoTed());
					} catch (Exception e) {
						LOG.log(Level.SEVERE, "Falha ao persistir status de envio STR0047R2 para fila NCR.", e);
						LOG.log(Level.SEVERE, "Dados de falha - Numero agencia debito: {0}. Numero da TED: {1}. Numero Caixa: {2}. NSU FEBRABAN: {3}", new Object[] { ted.getNumeroAgenciaDebito(), ted.getNumeroTed(), ted.getCodigo(), ted.getNumeroFebraban() });
						LOG.log(Level.SEVERE, e.getLocalizedMessage(), e);
					} finally {
						enviarDadosFilaVerificacao(parseRecebimentoToDto(ted));
					}
				});
				super.commit();
			}
	
			/**
			 * Atualização de status e envio do STR0047R1 ou STR0048R2
			 */
			if (ObjectUtil.isFilled(tedsAguardandoEnvioHabitacao)) {
				LOG.log(Level.INFO, "\n\n>>>>>>> Qtd de TEDs resposta R1/R2 habitação aguardando envio recuperados da base {0}\n\n", tedsAguardandoEnvioHabitacao.size());
				
				tedsAguardandoEnvioHabitacao.forEach(ted -> {
					String tipoTed = ted.getTipoTed().trim();
					
					try {
						if (ConstantesUtil.STR0048R2.equals(tipoTed)) {
							LOG.log(Level.INFO, "Consultando STR0048R2...");
							super.begin();
							TEDHabitacao transferenciaTed = daotedHabitacao.obterPorNumeroBacen(ted.getCodigoBacen(), ConstantesUtil.STR0047R1);
							super.commit();
	
							if (ObjectUtil.isFilled(transferenciaTed)) {
								ted.setNumeroAgenciaDebito(transferenciaTed.getNumeroAgenciaDebito());
								ted.setSituacaoEnvio(new SituacaoTED(SituacaoTEDEnum.TED_DEVOLVIDA_OUTRA_IF.codigo()));
							}
	
						}
					} catch (Exception e) {
						LOG.log(Level.SEVERE, "Falha na consulta do STR0048R2. Numero da TED: {0)", ted.getNumeroTed());
						LOG.log(Level.SEVERE, e.getLocalizedMessage(), e);
					}
					
					try {
						if ((ConstantesUtil.STR0047.equals(tipoTed) || ConstantesUtil.STR0048.equals(tipoTed)) && ObjectUtil.isFilled(ted.getCodigoBacen()) && ConstantesUtil.SINCR.equals(ted.getSistemaOrigem())) {
							final StringBuilder composicaoTipoTed = new StringBuilder(tipoTed);
							tipoTed = composicaoTipoTed.append(ConstantesUtil.R1).toString();
							ted.setSituacaoEnvio(new SituacaoTED(SituacaoTEDEnum.TED_PROPRIEDADE_NCR.codigo()));
						}
					} catch (Exception e) {
						LOG.log(Level.SEVERE, "Falha na verificação STR0047 / STR0048. Numero da TED: {0}", ted.getNumeroTed());
						LOG.log(Level.SEVERE, e.getLocalizedMessage(), e);
					}
	
					try {
						if (!ObjectUtil.isFilled(StringUtils.trim(ted.getNumeroTed()))) {
							LOG.log(Level.WARNING, "\n\n>>>>>>>({0}) {1} Numero da TED vazio ou inválido.", new Object[] {tipoTed, ted.getNumeroTed()});
							return;
						}
						
						LOG.log(Level.INFO, "\n\n>>>>>>> Atualizando situacao da TED NCR ({0}) {1}", new Object[] {tipoTed, ted.getNumeroTed()});
						super.begin();
						daotedHabitacao.atualizarSituacaoPorId(ted.getCodigo(), ted.getSituacaoEnvio().getCodigo(), tipoTed);
						super.commit();
						LOG.log(Level.INFO, ">>>>>>> ({0}) {1} atualizado!", new Object[] {tipoTed, ted.getNumeroTed()});
	
						LOG.log(Level.INFO, ">>>>>>> Enviando ({0}) {1} ao NCR...", new Object[] {tipoTed, ted.getNumeroTed()});
						ted.setTipoTed(tipoTed);
						ted.setDataTransacao(new Date());
						ted.setHoraTransacao(new Date());
						enviarDadosFilaVerificacao(parseRecebimentoToDto(ted));
						LOG.log(Level.INFO, ">>>>>>> ({0}) {1} enviado!\n\n", new Object[] {tipoTed, ted.getNumeroTed()});
					} catch (Exception e) {
						LOG.log(Level.SEVERE, "Falha ao processar atualização e envio da TED NCR ({0}) {1}", new Object[] {tipoTed, ted.getNumeroTed()});
						LOG.log(Level.SEVERE, e.getLocalizedMessage(), e);
					}
				});
			}
		} catch (Exception e) {
			LOG.log(Level.SEVERE, "Falha ao processar recebimento da base e enviar a fila NCR.", e);
		} finally {
			// Libera FLAG para processamento batch R1/R2
			TransferenciaEletronicaLegacyCallNCRBean.PROCESSAR_RECEBIMENTO_BASE = Boolean.TRUE;
		}
	}

    private ConnectionFactory recebimentoTedConnectionFactory;

    private Queue queueVerificacaoTed;

	private synchronized void carregarRecursosRemoteJmsSobDemanda() {
		if (this.recebimentoTedConnectionFactory != null && this.queueVerificacaoTed != null) {
			return;
		}

		try {
			InitialContext initialContext = new InitialContext();
			if (this.recebimentoTedConnectionFactory == null) {
				this.recebimentoTedConnectionFactory = (ConnectionFactory) initialContext.lookup(JNDI_VERIFICACAO_TED_CONNECTION_FACTORY);
			}
			if (this.queueVerificacaoTed == null) {
				this.queueVerificacaoTed = (Queue) initialContext.lookup(JNDI_VERIFICACAO_TED_QUEUE);
			}
		} catch (NamingException e) {
			throw new RuntimeException("Falha no lookup JNDI dos recursos remoteJMS para verificacao TED.", e);
		}
	}

    private void enviarDadosFilaVerificacao(DadosNCRTedDTO body) {
        ObjectMapper om = new ObjectMapper();
        om.registerModule(new JavaTimeModule());

			carregarRecursosRemoteJmsSobDemanda();

        LOG.log(Level.INFO, "Respondendo mensagem para a fila verificacao ted");
            try{
                ObjectMapper mapper = new ObjectMapper();
                String bodyStr = mapper.writeValueAsString(body);

				LOG.log(Level.INFO, "Criando conexao com a fila verificacao ted");
				javax.jms.Connection connection = recebimentoTedConnectionFactory.createConnection();
				LOG.log(Level.INFO, "Criando sessao com a fila verificacao ted");
				javax.jms.Session session = connection.createSession(false, javax.jms.Session.AUTO_ACKNOWLEDGE);
				LOG.log(Level.INFO, "Criando producer com a fila verificacao ted");
				javax.jms.MessageProducer producer = session.createProducer(queueVerificacaoTed);
				LOG.log(Level.INFO, "Criando mensagem de texto com a fila verificacao ted");
				javax.jms.TextMessage textMessage = session.createTextMessage(bodyStr);
				String msgID = body.getNumcCrlStr() + "_" + body.getNsuTrc();
				textMessage.setJMSMessageID(msgID);
				LOG.log(Level.INFO, "Enviando mensagem para a fila verificacao ted id {0}, str {1}", new Object[] { body.getNumcCrlStr(), body.getNsuTrc() });
				producer.send(textMessage);
				LOG.log(Level.INFO, "Mensagem enviada para a fila verificacao ted com sucesso");
				LOG.log(Level.INFO, "Fechando producer com a fila verificacao ted");
				producer.close();
				LOG.log(Level.INFO, "Fechando conexao com a fila verificacao ted");
				session.close();
            }catch(Exception e){
                LOG.log(Level.SEVERE, "Erro ao responder mensagem", e);
                throw new RuntimeException("Erro ao responder mensagem: " + e.getMessage());
            }
    }
	
	/**
	 * 
	 * @param t
	 * @return
	 */
	private DadosNCRTedDTO parseRecebimentoToDto(TEDHabitacao t) {
		DadosNCRTedDTO d = new DadosNCRTedDTO();
		String dataHoraBc = null;
		
		if (ObjectUtil.isFilled(t.getDataTransacao()) && ObjectUtil.isFilled(t.getHoraTransacao())) {
			dataHoraBc = new StringBuilder().append(ConstantesUtil.FORMATO_DATA_TED_NCR.format(t.getDataTransacao())).append(ConstantesUtil.FORMATO_HORA_TED_NCR.format(t.getHoraTransacao())).toString();;
		}
		final String dataMovimento = ObjectUtil.isFilled(t.getDataMovimento1()) ? ConstantesUtil.FORMATO_DATA_TED_NCR.format(t.getDataMovimento1()) : null;
		
		d.setCodMsg(t.getTipoTed());
		d.setNumcCrlStr(t.getCodigoBacen());
		d.setDataHoraBc(dataHoraBc);
		d.setIspbIfDeb(t.getIspbDebito());
		d.setAgDeb(NumeroUtil.nullIfZeroInt(t.getNumeroAgenciaDebito()));
		d.setCtDeb(t.getNumeroContaDebito());
		d.setCnpjCliDeb(ObjectUtil.isFilled(t.getNumeroCnpjDebito()) ? t.getNumeroCnpjDebito().toString() : null);
		d.setNomCliDeb(t.getNomeClienteDebito());
		d.setIspbIfCred(t.getNumeroISPBCredito());
		d.setAgCred(t.getNumeroAgenciaCreditada());
		d.setCtCred(t.getNumeroContaCredito());
		d.setCnpjCliCred(ObjectUtil.isFilled(t.getNumeroCnpjClienteCredito()) ? t.getNumeroCnpjClienteCredito().toString() : "");
		d.setNomCliCred(t.getNomeClienteCredito());
		d.setValorLanc(t.getValorLancamento());
		d.setNuPortdd(t.getNumeroFebraban());
		d.setIspbPrestd(t.getIspbPrestador());
		d.setHistorico(t.getDescricaoHistorico());
		d.setDataMovto(dataMovimento);
		d.setNsuTrc(t.getNumeroTed());
		d.setCoMensagemTrc(ObjectUtil.isFilled(t.getMotivoDevolucaoLiquidacao()) ? t.getMotivoDevolucaoLiquidacao().toString() : null);
		d.setDeMensagemTrc(t.getDescricaoMotivoDevolucaoLiquidacao());
		
		return d;
	}
	
	/**
	 * 
	 * @return
	 */
	private Long recuperaNumeroEventoContabil() {
		super.begin();
		final TipoContratoEventoContabil tipoContratoEventoContabil = daoTipoContratoEventoContabil.obterPorTipoContratoSistema("9999", "NCR");
		super.commit();

		if (ObjectUtil.isFilled(tipoContratoEventoContabil)) {
			return tipoContratoEventoContabil.getId().getEventoContabil().getCodigo();
		}
		
		return 999999L;
	}
	
	/**
	 */
	private DadosGECTedDTO parseProcessarEnvioToDTO(TEDHabitacao t, Integer numeroBanco, Character origemPortabilide) {
		String modoOperacaoCredito = "00";

		return DadosGECTedDTO.builder()
				.identificadorEnvio(UUID.randomUUID().toString())
				.coBacen(t.getCodigoBacen())
				.coMensagem(t.getTipoTed())
				.deSistemaDestino(ConstantesUtil.SITRC)
				.deSistemaOrigem(ConstantesUtil.SINCR)
				.dtEnvioTed(LocalDate.now())
				.dtTransacao(LocalDate.now())
				.hhTransacao(t.getHoraTransacao().toString())
				.icOrigemPortabilidade(origemPortabilide)
				.noDevedor(StringUtil.removerEspacos(t.getNomeDevedor()))
				.noResponsavelEnvio(t.getNomeResponsavelEnvio())
				.nuAgenciaCreditada(t.getNumeroAgenciaCreditada())
				.nuCnpjClienteCredito(StringUtil.lpad(t.getNumeroCnpjClienteCredito(), 14, '0'))
				.nuContaCredito(t.getNumeroContaCredito())
				.nuCpfCnpjSolicitante(StringUtil.lpad(t.getNumeroCpfCnpjSolicitante(), 14, '0'))
				.nuFebraban(t.getNumeroFebraban())
				.nuIspbDebito(ObjectUtil.isFilled(t.getIspbDebito()) ? t.getIspbDebito().toString() : "")
				.nuIspbCredito(t.getCodigoISPBCreditada())
				.nuPvOrigemTransacao(t.getPvOrigem())
				.nuTed(t.getNumeroTed())
				.nuTipoContrato(t.getTipoContrato().getCodigo())
				.vrLancamento(t.getValorLancamento())
				.numeroBanco(numeroBanco)
				.nomeClienteCredito(t.getNomeClienteCredito())
				.numeroContratoCredito(t.getNumeroContratoOriginal())
				.modoOperacaoCredito(modoOperacaoCredito)
				.coMensagemTrc(ObjectUtil.isFilled(t.getMotivoDevolucaoLiquidacao()) ? t.getMotivoDevolucaoLiquidacao().toString() : "")
				.deMensagemTrc(StringUtil.removerEspacos(t.getDescricaoMotivoDevolucaoLiquidacao()))
				.build();
	}
	
	/**
	 * 
	 * @param t
	 * @param numeroBanco
	 * @param origemPortabilide
	 * @return
	 */
	private DadosGECTedDTO parseProcessarEnvioToDTOHabitacao(TEDHabitacao t, Integer numeroBanco, Character origemPortabilide) {
		String hhTransacao = DataUtil.format(DateUtil.convertToLocalDateTimeViaInstant(t.getHoraTransacao()), "HH:mm:ss");
		
		if (!ObjectUtil.isFilled(hhTransacao)) {
			hhTransacao = null;
		}

		String modoOperacaoCredito = "00";

		return DadosGECTedDTO.builder()
				.identificadorEnvio(UUID.randomUUID().toString())
				.coBacen(t.getCodigoBacen())
				.coMensagem(t.getTipoTed())
				.deSistemaDestino(ConstantesUtil.SINCR)
				.deSistemaOrigem(ConstantesUtil.SIGEC)
				.dtEnvioTed(DateUtil.convertToLocalDateViaInstant(t.getDataEnvio()))
				.dtTransacao(DateUtil.convertToLocalDateViaInstant(t.getDataTransacao()))
				.hhTransacao(hhTransacao)
				.icOrigemPortabilidade(origemPortabilide)
				.noDevedor(StringUtil.removerEspacos(t.getNomeDevedor()))
				.noResponsavelEnvio(t.getNomeResponsavelEnvio())
				.nuAgenciaCreditada(t.getNumeroAgenciaCreditada())
				.nuCnpjClienteCredito(StringUtil.lpad(t.getNumeroCnpjClienteCredito(), 14, '0'))
				.nuContaCredito(t.getNumeroContaCredito())
				.nuCpfCnpjSolicitante(StringUtil.lpad(t.getNumeroCpfCnpjSolicitante(), 14, '0'))
				.nuFebraban(t.getNumeroFebraban())
				.nuIspbDebito(ObjectUtil.isFilled(t.getIspbDebito()) ? t.getIspbDebito().toString() : "")
				.nuIspbCredito(t.getCodigoISPBCreditada())
				.nuPvOrigemTransacao(t.getPvOrigem())
				.nuTed(t.getNumeroTed())
				.nuTipoContrato(t.getTipoContrato().getCodigo())
				.vrLancamento(t.getValorLancamento())
				.numeroBanco(numeroBanco)
				.nomeClienteCredito(t.getNomeClienteCredito())
				.numeroContratoCredito(t.getNumeroContratoOriginal())
				.modoOperacaoCredito(modoOperacaoCredito)
				.coMensagemTrc(ObjectUtil.isFilled(t.getMotivoDevolucaoLiquidacao()) ? t.getMotivoDevolucaoLiquidacao().toString() : "")
				.deMensagemTrc(StringUtil.removerEspacos(t.getDescricaoMotivoDevolucaoLiquidacao()))
				.build();
	}
	
	/**
	 * @param daoPortabilidade
	 * @param daoTransferenciaEletronica
	 * @param daotedHabitacao
	 * @param transferenciaEletronicaService
	 * @param tedHabitacaoService
	 * @param transferenciaEletronicaNCR
	 * @param transferenciaEletronicaNCRHabitacao
	 */
	@Inject
	public TransferenciaEletronicaLegacyCallNCRBean(TEDHabitacaoService tedHabitacaoService, DAOTEDHabitacao daotedHabitacao, DAOTipoContratoEventoContabil daoTipoContratoEventoContabil) {
		super();
		this.tedHabitacaoService = tedHabitacaoService;
		this.daotedHabitacao = daotedHabitacao;
		this.daoTipoContratoEventoContabil = daoTipoContratoEventoContabil;
	}

}


gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java, ou pelo menos as linhas 165 a 180 e 283 a 297.


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
        acoes.put("NCR.listarMensagensEnvio", () -> {
            try {
                transferenciaEletronicaLegacyCallNCR.listarMensagensEnvioFilaNCR();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
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
            try {
                transferenciaEletronicaLegacyCallNCR.publicarMensagemEnvioFilaNCR(dto);
            } catch (Exception e) {
                return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                        .entity("Falha ao publicar payload NCR: " + e.getMessage())
                        .build();
            }

            return Response.ok(objectMapper.createObjectNode()
                    .put("status", "Mensagem publicada com sucesso")
            .put("fila", "QUEUE_ENVIO_TED_NCR")
                    .put("coMensagem", dto.getCoMensagem())
                    .put("nuTed", dto.getNuTed())
                    .toString()).build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Falha ao publicar payload NCR: " + e.getMessage())
                    .build();
        }
    }
}



Me mande os arquivos que eu devolvo a correção pronta.
