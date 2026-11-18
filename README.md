package br.gov.caixa.sigec.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.gov.caixa.sigec.dominio.dto.PosicaoPortabilidadeDTO;
import br.gov.caixa.sigec.enums.SituacaoContratacaoEnum;
import br.gov.caixa.sigec.persistencia.DefaultOrder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(schema = "GEC", name = "GECTB001_PORTABILIDADE")
@DefaultOrder(columns = { "dataSituacao" })
@NamedQueries({
	@NamedQuery(name = "Portabilidade.AguardandoEnvio", 
			query =   "select p "
					+ "from Portabilidade p "
					+ "join p.pedidoPortabilidade pp "
					+ "where p.situacaoPortabilidade.codigo=:codigoSituacao "
					+ "and p.linhaCredito.codigo=:codigoLinhaCredito "
					+ "order by p.numeroSigec desc "),
		@NamedQuery(name = "Portabilidade.ListarPorSituacao", query = "select p from Portabilidade p where p.situacaoPortabilidade.codigo = :codigoSituacao"),
		@NamedQuery(name = "Portabilidade.ObterPorNumeroFebraban", query = "select p from Portabilidade p where p.numeroFebraban = :numeroFebraban and p.numeroSigec = ( select max( p2.numeroSigec ) "
				+ "from Portabilidade p2 where p2.numeroFebraban = :numeroFebraban )"),
		@NamedQuery(name = "Portabilidade.ListaPortabilidadeAcatamentoAutomatico", query = "select p from Portabilidade p where p.origemPortabilidade = 'R' and p.situacaoPortabilidade.codigo = '0018' and p.linhaCredito.codigo = :linhaCredito "
				+ " and p.respostaPortabilidade.dataReferenciaSaldoDevedorContabil <= CURRENT_DATE"),
		@NamedQuery(name = "Portabilidade.ObterPorOrigemSigec", query = "select p from Portabilidade p where p.origemPortabilidade = :origemPortabilidade and p.numeroSigec = :nuSigec"),
		@NamedQuery(name = "Portabilidade.ObterPorOrigem", query = "select p from Portabilidade p where p.origemPortabilidade = :origemPortabilidade and p.dataSituacao = :dataSituacao"),
		@NamedQuery(name = "Portabilidade.ValidaLinhaCredito", query = "select count(p) from Portabilidade p where p.linhaCredito.codigo=:codigo"),
		@NamedQuery(name = "Portabilidade.ValidaLSituacaoPortabilidade", query = "select count(p) from Portabilidade p where p.situacaoPortabilidade.codigo=:codigo"),
		@NamedQuery(name = "Portabilidade.ListarPortabilidadeContaSalarioPorCPFCliente", 
					query =   "SELECT p "
							+ "FROM Portabilidade p "
							+ "where p.pedidoPortabilidade.numeroCNPJCPFCliente "
							+ "      in (:cpfCnpjCliente11, :cpfCnpjCliente14) "
							+ "and p.linhaCredito.codigo = :codigoLinhaCredito "
							+ "and p.origemPortabilidade='P'"
							+ "order by p.numeroSigec desc "),
		@NamedQuery(name = "Portabilidade.ListarPortabilidadeRetencaoContaSalarioPorCPFCliente", 
					query =   "SELECT p "
							+ "FROM Portabilidade p "
							+ "where p.pedidoPortabilidade.numeroCNPJCPFCliente "
							+ "      in (:cpfCnpjCliente11, :cpfCnpjCliente14) "
							+ "and p.linhaCredito.codigo = :codigoLinhaCredito "
							+ "and p.origemPortabilidade='R'"
							+ "order by p.numeroSigec desc "),
		@NamedQuery(name = "Portabilidade.listarReprocessamentoGMC", 
					query =   "SELECT P "
							+ "FROM Portabilidade P "
							+ "WHERE exists ( SELECT 1  " 
							+ "               FROM HistoricoMotivoLiberacaoRetencao H "
							+ "               WHERE H.respostaPortabilidade.numeroSigec = P.numeroSigec  "
							+ "               AND H.motivoLiberacaoRetencao.codigo =:codigoContem ) " 
							+ "AND NOT exists ( SELECT 1  "
							+ "                 FROM HistoricoMotivoLiberacaoRetencao H "
							+ "                 WHERE H.respostaPortabilidade.numeroSigec = P.numeroSigec  "
							+ "                 AND H.motivoLiberacaoRetencao.codigo =:codigoNaoContem) "
							+ "order by P.numeroSigec desc ") 
		})
@Data
@EqualsAndHashCode(callSuper = false)
public class Portabilidade extends EntidadeBase {
	private static final long serialVersionUID = -733095900822589200L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "NU_SIGEC", unique = true, length = 18, nullable = false)
	private Long numeroSigec;

	@OneToOne(mappedBy = "portabilidade")
	private PedidoPortabilidade pedidoPortabilidade;

	@OneToOne(mappedBy = "portabilidadeResposta")
	private RespostaPortabilidade respostaPortabilidade;

	@Column(name = "NU_FEBRABAN", length = 21, nullable = true)
	private String numeroFebraban;

	@ManyToOne
	@JoinColumn(name = "CO_SITUACAO_PORTABILIDADE", nullable = false)
	private SituacaoPortabilidade situacaoPortabilidade;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_SITUACAO", nullable = false)
	private Date dataSituacao;

	@ManyToOne
	@JoinColumn(name = "NU_LINHA_CREDITO", nullable = false)
	private LinhaCredito linhaCredito;

	@ManyToOne
	@JoinColumn(name = "NU_ERRO", nullable = true)
	private Erro erroPortabilidade;

	@Column(name = "IC_ORIGEM_PORTABILIDADE", length = 1, nullable = false)
	private String origemPortabilidade;

	@Column(name = "CO_MATRICULA_CADASTRO", length = 10, nullable = true)
	private String codigoMatriculaCadastro;

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "id.portabilidade")
	private List<HistoricoPedidoPortabilidade> historicoPedidoPortabilidade = new ArrayList<>();

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "id.portabilidade")
	private List<HistoricoPosicaoPortabilidade> historicoPosicaoPortabilidade = new ArrayList<>();

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "portabilidade")
	private List<HistoricoSituacaoPortabilidade> listaHistoricoSituacaoPortabilidade = new ArrayList<>();

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "portabilidade")
	private List<PosicaoPortabilidade> listaPosicaoPortabilidade = new ArrayList<>();

	@Column(name = "CO_IDENTIFICADOR_CANAL")
	private Integer autorizacaoCanal;

	@Column(name = "CO_CONTRATO_CAIXA", length = 20, nullable = true)
	private String numeroContratoCAIXA; // BR201605659_RTC1547309

	/**
	 * @see SituacaoContratacaoEnum
	 */
	@Column(name = "CO_SITUACAO_CONTRATACAO", nullable = false)
	private Integer codigoSituacaoContratacao; // BR201605659_RTC1547309

	@Transient
	private Double valorEmissaoTED;

	@Transient
	private Integer quantidadeParcelasContrato;

	@Transient
	private Integer quantidadeParcelasContratoAVencer;

	@Transient
	private String qualValidacao;

	@Transient
	private PosicaoPortabilidade posicaoPortabilidade;

	@Transient
	private transient List<PosicaoPortabilidadeDTO> listPosicaoPortabilidade;

	@Transient
	private CancelamentoPortabilidade cancelamentoPortabilidade;

	@Transient
	private LiquidacaoPortabilidade liquidacaoPortabilidade;

	@Transient
	private Long transferenciaEletronicaEnvio;

	@Transient
	private Long transferenciaEletronicaRecepcao;

	@Transient
	private Long historico;

	@Transient
	private Long situacao;

	@Transient
	private String nomeIF;

	@Transient
	private TransferenciaEletronica transferenciaEletronica;

	@Transient
	private int existePosicoes;

	@Transient
	private String nomeConvenente;

	@Transient
	private String cnpjConvenente;

	@Transient
	private String convenenteAtivo;

	@Transient
	private String telefoneLigacao;

	@Transient
	private String telefoneOrigem;

	@Transient
	private String observacao;

	@Transient
	private MotivoLiberacaoRetencao motivoLiberacaoRetencao;

	@Transient
	private int qtdTempoEdicaoPortabilidade;

	@Transient
	private boolean validado;

	@Transient
	private SituacaoTED ultimaSituacaoTedSTR0048;

	@Transient
	private String descricaoCanal;

	@Transient
	private String siglaSIICO;

	@Transient
	private boolean existeRegistroPendente;

	@Transient
	private String mensagemNegocial; // BR201605652_RTC1547333

	@Transient
	private Double taxaJurosFaixaA; // BR201605652_RTC1547333

	@Transient
	private Double taxaJurosFaixaB; // BR201605652_RTC1547333

	@Transient
	private Double taxaJurosFaixaC; // BR201605652_RTC1547333

	@Transient
	private Integer diaCreditoSalario; // BR201605652_RTC1547333

	@Transient
	private Integer prazoEmissaoExtrato; // BR201605652_RTC1547333

	@Transient
	private Date dataBaseContrato; // BR201605652_RTC1547333

	@Transient
	private Date dataVencimento1hPrestacao; // BR201605652_RTC1547333

	@Transient
	private String tipoProspeccao; // RTC13286698 e RTC13287675

	@Transient
	private String adiantamentoDepositante; // RTC13286698 e RTC13287675

	@Transient
	private String parcelaNormal;

	@Transient
	private String parcelaIrregular;

	@Transient
	private Integer tipoLinhaCreditoTrocaModalidade;

	@Transient
	private LinhaCredito linhaCreditoProp;

	@Transient
	private boolean trocaModalidade = false;

//	@JsonIgnore
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "portabilidade")
	@Transient
	private List<LiberacaoComplementar> liberacoesComplementar;

	@Transient
	private String arquivoHistoricoSituacao;

	@Transient
	private boolean pronampe;

	@Transient
	private EvidenciaPortabilidade evidenciaPortabildiade;

	@Transient
	private String idDocumentoMTR;

	/**
	 * Método construtor.
	 */
	public Portabilidade() {
		super();
	}

	/**
	 * Método construtor.
	 *
	 * @param numeroSigec
	 */
	public Portabilidade(final Long numeroSigec) {
		this.setNumeroSigec(numeroSigec);
	}

	/**
	 *
	 * @param pedidoPortabilidade
	 */
	public Portabilidade(final PedidoPortabilidade pedidoPortabilidade) {
		this.pedidoPortabilidade = pedidoPortabilidade;
	}

	/**
	 *
	 * @param numeroSigec
	 * @param situacaoPortabilidade
	 * @param numeroCNPJCPFCliente
	 * @param canal
	 * @param nuOrigemTransacao
	 */
	public Portabilidade(final Long numeroSigec, final SituacaoPortabilidade situacaoPortabilidade,
			final LinhaCredito linhaCredito, final String numeroCNPJCPFCliente, final String canal,
			final Long nuOrigemTransacao) {
		this.numeroSigec = numeroSigec;
		this.situacaoPortabilidade = situacaoPortabilidade;
		this.linhaCredito = linhaCredito;
		this.pedidoPortabilidade = new PedidoPortabilidade(numeroCNPJCPFCliente, canal, nuOrigemTransacao);
	}

}
