gec-ejb/src/main/java/br/gov/caixa/sigec/barramento/sicli/consulta/CamposRetornados.java

package br.gov.caixa.sigec.barramento.sicli.consulta;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.persistence.Transient;

import br.gov.caixa.sigec.barramento.sicli.ClienteMQ;
import br.gov.caixa.sigec.barramento.sicli.CocliAtivo;
import br.gov.caixa.sigec.barramento.sicli.EnderecoExterior;
import br.gov.caixa.sigec.barramento.sicli.EnderecoNacional;
import br.gov.caixa.sigec.barramento.sicli.EnderecoNacionalComplemento;
import br.gov.caixa.sigec.barramento.sicli.MeioComunicacao;
import br.gov.caixa.sigec.barramento.sicli.RendaCliente;

public class CamposRetornados implements Serializable {
	private static final long serialVersionUID = -7708257491711971490L;

	private CocliAtivo cocliAtivo;
	private ClienteMQ cliente;
	private DataNascimento dtNascimento;
	private PaiCliente pai;
	private MaeCliente mae;
	private Sexo sexo;
	private CPF cpf;
	private List<IdentidadeSICLI> identidade;
	private EstadoCivil estadoCivil;
	private List<MeioComunicacao> meioComunicacao;

	private CNPJ cnpj; // CNPJ
	private RazaoSocial razaoSocial;
	private NomeFantasia nomeFantasia; // NOME_FANTASIA
	private DataConstituicaoEmpresa dataConstituicaoEmpresa; // DT_CONST_EMPRESA
	private RamoAtividadeCNAE ramoAtividadeCNAE; // RAMO_ATIVIDADE_CNAE
	private NaturezaJuridica naturezaJuridica; // NATUREZA_JURIDICA
	private IdentificacaoPorte identificacaoPorte; // IDENTIFICACAO_PORTE
	private FinalidadeEmpresa finalidadeEmpresa; // FINALIDADE_EMPRESA
	private List<ResponsavelCarteira> responsavelCarteira; // RESPONSAVEL_CARTEIRA

	private List<EnderecoNacional> enderecoNacional;
	private List<EnderecoNacionalComplemento> complemento;
	private List<EnderecoExterior> enderecoExterior;
	private SituacaoMenor situacaoMenor;
	private Naturalidade naturalidade;
	private TipoPessoa tipoPessoa;
	private CarteiraCliente carteiraCliente;
	private GrauInstrucao grauInstrucao;
	private ProfissaoSIRIC profissaoSIRIC;
	private PaisOrigem paisOrigem;
	private List<RendaCliente> renda;
	private CarteiraGRC carteiraGRC;
	private Residencia residencia;
	private List<Vinculo> vinculos;
	private List<Passaporte> passaporte;
	private List<CarteiraTrabalho> carteiraTrabalho;
	private List<CarteiraNacionalHabilitacao> carteiraNacionalHabilitacao;
	private List<Dependente> dependentes;
	private CertidaoNascimento certidaoNascimento;

	@Transient
	private List<Map<String, Object>> contas;

	private String concla;

	public CocliAtivo getCocliAtivo() {
		return this.cocliAtivo;
	}

	public ClienteMQ getCliente() {
		return this.cliente;
	}

	public List<MeioComunicacao> getMeioComunicacao() {
		return this.meioComunicacao;
	}

	public List<EnderecoNacional> getEnderecoNacional() {
		return this.enderecoNacional;
	}

	public List<EnderecoNacionalComplemento> getComplemento() {
		return this.complemento;
	}

	public CPF getCpf() {
		return this.cpf;
	}

	public List<RendaCliente> getRenda() {
		return this.renda;
	}

	public void setCocliAtivo(CocliAtivo cocliAtivo) {
		this.cocliAtivo = cocliAtivo;
	}

	public void setCliente(ClienteMQ cliente) {
		this.cliente = cliente;
	}

	public void setMeioComunicacao(List<MeioComunicacao> meioComunicacao) {
		this.meioComunicacao = meioComunicacao;
	}

	public void setEnderecoNacional(List<EnderecoNacional> enderecoNacional) {
		this.enderecoNacional = enderecoNacional;
	}

	public void setComplemento(List<EnderecoNacionalComplemento> complemento) {
		this.complemento = complemento;
	}

	public void setCpf(CPF cpf) {
		this.cpf = cpf;
	}

	public void setRenda(List<RendaCliente> renda) {
		this.renda = renda;
	}

	public DataNascimento getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(DataNascimento dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public PaiCliente getPai() {
		return pai;
	}

	public void setPai(PaiCliente pai) {
		this.pai = pai;
	}

	public MaeCliente getMae() {
		return mae;
	}

	public void setMae(MaeCliente mae) {
		this.mae = mae;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public List<IdentidadeSICLI> getIdentidade() {
		return identidade;
	}

	public void setIdentidade(List<IdentidadeSICLI> identidade) {
		this.identidade = identidade;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Naturalidade getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(Naturalidade naturalidade) {
		this.naturalidade = naturalidade;
	}

	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public CarteiraCliente getCarteiraCliente() {
		return carteiraCliente;
	}

	public void setCarteiraCliente(CarteiraCliente carteiraCliente) {
		this.carteiraCliente = carteiraCliente;
	}

	public GrauInstrucao getGrauInstrucao() {
		return grauInstrucao;
	}

	public void setGrauInstrucao(GrauInstrucao grauInstrucao) {
		this.grauInstrucao = grauInstrucao;
	}

	public ProfissaoSIRIC getProfissaoSIRIC() {
		return profissaoSIRIC;
	}

	public void setProfissaoSIRIC(ProfissaoSIRIC profissaoSIRIC) {
		this.profissaoSIRIC = profissaoSIRIC;
	}

	public CarteiraGRC getCarteiraGRC() {
		return carteiraGRC;
	}

	public void setCarteiraGRC(CarteiraGRC carteiraGRC) {
		this.carteiraGRC = carteiraGRC;
	}

	public Residencia getResidencia() {
		return residencia;
	}

	public void setResidencia(Residencia residencia) {
		this.residencia = residencia;
	}

	public RazaoSocial getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(RazaoSocial razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public PaisOrigem getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(PaisOrigem paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	public SituacaoMenor getSituacaoMenor() {
		return situacaoMenor;
	}

	public void setSituacaoMenor(SituacaoMenor situacaoMenor) {
		this.situacaoMenor = situacaoMenor;
	}

	public List<Vinculo> getVinculos() {
		return vinculos;
	}

	public void setVinculos(List<Vinculo> vinculos) {
		this.vinculos = vinculos;
	}

	public List<Passaporte> getPassaporte() {
		return passaporte;
	}

	public void setPassaporte(List<Passaporte> passaporte) {
		this.passaporte = passaporte;
	}

	public List<CarteiraNacionalHabilitacao> getCarteiraNacionalHabilitacao() {
		return carteiraNacionalHabilitacao;
	}

	public void setCarteiraNacionalHabilitacao(List<CarteiraNacionalHabilitacao> carteiraNacionalHabilitacao) {
		this.carteiraNacionalHabilitacao = carteiraNacionalHabilitacao;
	}

	public List<CarteiraTrabalho> getCarteiraTrabalho() {
		return carteiraTrabalho;
	}

	public void setCarteiraTrabalho(List<CarteiraTrabalho> carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}

	public List<Dependente> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}

	public List<EnderecoExterior> getEnderecoExterior() {
		return enderecoExterior;
	}

	public void setEnderecoExterior(List<EnderecoExterior> enderecoExterior) {
		this.enderecoExterior = enderecoExterior;
	}

	public CertidaoNascimento getCertidaoNascimento() {
		return certidaoNascimento;
	}

	public void setCertidaoNascimento(CertidaoNascimento certidaoNascimento) {
		this.certidaoNascimento = certidaoNascimento;
	}

	public CNPJ getCnpj() {
		return cnpj;
	}

	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(CNPJ cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * @return the nomeFantasia
	 */
	public NomeFantasia getNomeFantasia() {
		return nomeFantasia;
	}

	/**
	 * @param nomeFantasia the nomeFantasia to set
	 */
	public void setNomeFantasia(NomeFantasia nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	/**
	 * @return the dataConstituicaoEmpresa
	 */
	public DataConstituicaoEmpresa getDataConstituicaoEmpresa() {
		return dataConstituicaoEmpresa;
	}

	/**
	 * @param dataConstituicaoEmpresa the dataConstituicaoEmpresa to set
	 */
	public void setDataConstituicaoEmpresa(DataConstituicaoEmpresa dataConstituicaoEmpresa) {
		this.dataConstituicaoEmpresa = dataConstituicaoEmpresa;
	}

	/**
	 * @return the ramoAtividadeCNAE
	 */
	public RamoAtividadeCNAE getRamoAtividadeCNAE() {
		return ramoAtividadeCNAE;
	}

	/**
	 * @param ramoAtividadeCNAE the ramoAtividadeCNAE to set
	 */
	public void setRamoAtividadeCNAE(RamoAtividadeCNAE ramoAtividadeCNAE) {
		this.ramoAtividadeCNAE = ramoAtividadeCNAE;
	}

	/**
	 * @return the naturezaJuridica
	 */
	public NaturezaJuridica getNaturezaJuridica() {
		return naturezaJuridica;
	}

	/**
	 * @param naturezaJuridica the naturezaJuridica to set
	 */
	public void setNaturezaJuridica(NaturezaJuridica naturezaJuridica) {
		this.naturezaJuridica = naturezaJuridica;
	}

	/**
	 * @return the identificacaoPorte
	 */
	public IdentificacaoPorte getIdentificacaoPorte() {
		return identificacaoPorte;
	}

	/**
	 * @param identificacaoPorte the identificacaoPorte to set
	 */
	public void setIdentificacaoPorte(IdentificacaoPorte identificacaoPorte) {
		this.identificacaoPorte = identificacaoPorte;
	}

	/**
	 * @return the finalidadeEmpresa
	 */
	public FinalidadeEmpresa getFinalidadeEmpresa() {
		return finalidadeEmpresa;
	}

	/**
	 * @param finalidadeEmpresa the finalidadeEmpresa to set
	 */
	public void setFinalidadeEmpresa(FinalidadeEmpresa finalidadeEmpresa) {
		this.finalidadeEmpresa = finalidadeEmpresa;
	}

	/**
	 * @return the responsavelCarteira
	 */
	public List<ResponsavelCarteira> getResponsavelCarteira() {
		return responsavelCarteira;
	}

	/**
	 * @param responsavelCarteira the responsavelCarteira to set
	 */
	public void setResponsavelCarteira(List<ResponsavelCarteira> responsavelCarteira) {
		this.responsavelCarteira = responsavelCarteira;
	}

	public List<Map<String, Object>> getContas() {
		return contas;
	}

	public void setContas(List<Map<String, Object>> contas) {
		this.contas = contas;
	}

	public String getConcla() {
		return concla;
	}

	public void setConcla(String concla) {
		this.concla = concla;
	}

}

gec-ejb/src/main/java/br/gov/caixa/sigec/dominio/PedidoPortabilidade.java



package br.gov.caixa.sigec.dominio;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import br.gov.caixa.portabilidade.entity.CartaoCreditoPortabilidadeEntity;
import br.gov.caixa.sigec.anotacoes.RegraObrigatoriedade;
import br.gov.caixa.sigec.anotacoes.TipoArquivoObrigatoriedade;
import br.gov.caixa.sigec.enums.TipoArquivoEnum;
import br.gov.caixa.sigec.enums.TipoEmpregadorEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(schema = "GEC", name = "GECTB002_PEDIDO_PORTABILIDADE")
@NamedQueries({
	@NamedQuery(name = "PedidoPortabilidade.ObterPorPortabilidade", query = "select p from PedidoPortabilidade p where p.numeroSigec=:numeroSigec"),
	@NamedQuery(name = "PedidoPortabilidade.ValidaTipoCliente", query = "select count(p) from PedidoPortabilidade p where p.tipoCliente.codigo=:codigo"),
	@NamedQuery(name = "PedidoPortabilidade.ValidaTipoContratoSCR", query = "select count(p) from PedidoPortabilidade p where p.tipoContrato.codigo=:codigo"),
	@NamedQuery(name = "PedidoPortabilidade.ValidaTipoEnteConsignante", query = "select count(p) from PedidoPortabilidade p where p.tipoEntidadeConsignante.codigo=:codigo"),
	@NamedQuery(name = "PedidoPortabilidade.ValidaTipoFluxoPagamento", query = "select count(p) from PedidoPortabilidade p where p.tipoFluxoPagamento.codigo=:codigo"),
	@NamedQuery(name = "PedidoPortabilidade.ValidaTipoIndiceRemuneracao", query = "select count(p) from PedidoPortabilidade p where p.tipoIndiceRemuneracao.codigo=:codigo"),
	@NamedQuery(name = "PedidoPortabilidade.ValidaTipoRegimeAmortizacao", query = "select count(p) from PedidoPortabilidade p where p.tipoRegimeAmortizacao.codigo=:codigo"),
	@NamedQuery(name = "PedidoPortabilidade.ValidaTipoTaxa", query = "select count(p) from PedidoPortabilidade p where p.tipoTaxa.codigo=:codigo") })
@RegraObrigatoriedade(tipoArquivos = {
		@TipoArquivoObrigatoriedade(tipoArquivo = TipoArquivoEnum.ACTC101, campos = { "numeroSigec",
				"codigoIdentificadorIFProponente", "codigoTipoEntidadeConsignante", "codigoContratoOriginal",
				"cnpjIFCredoraOriginal", "codigoTipoContrato", "codigoTipoCliente", "codigoCNPJCPFCliente",
				"nomeCliente", "telefoneCelular", "dataReferenciaSaldoDevedor", "valorReferenciaSaldoDevedor",
				"codigoTipoTaxa", "valorTaxaJurosNominal", "valorTaxaJurosEfetiva", "valorTaxaCET",
				"codigoRegimeAmortizacao", "quantidadeTotalParcelasContrato", "valorFaceParcelaContrato",
				"dataVencPrimeiraParcelaContrato", "dataVencUltimaParcelaContrato", "logradouroCartaPortabilidade",
				"numeroCartaPortabilidade", "sgUfCartaPortabilidade", "nomeCidadeCartaPortabilidade",
				"numeroCEPCartaPortabilidade", "codigoCnpjCorrespondenteBncro" }),
		@TipoArquivoObrigatoriedade(tipoArquivo = TipoArquivoEnum.ACTC301, campos = { "numeroSigec",
				"codigoIdentificadorIFProponente", "codigoTipoEntidadeConsignante", "codigoContratoOriginal",
				"cnpjIFCredoraOriginal", "codigoTipoContrato", "codigoTipoCliente", "codigoCNPJCPFCliente",
				"nomeCliente", "telefoneCelular", "dataReferenciaSaldoDevedor", "valorReferenciaSaldoDevedor",
				"codigoTipoTaxa", "valorTaxaJurosNominal", "valorTaxaJurosEfetiva", "valorTaxaCET",
				"codigoRegimeAmortizacao", "quantidadeTotalParcelasContrato", "valorFaceParcelaContrato",
				"dataVencPrimeiraParcelaContrato", "dataVencUltimaParcelaContrato", "logradouroCartaPortabilidade",
				"numeroCartaPortabilidade", "sgUfCartaPortabilidade", "nomeCidadeCartaPortabilidade",
		"numeroCEPCartaPortabilidade" }),
		@TipoArquivoObrigatoriedade(tipoArquivo = TipoArquivoEnum.ACTC401, campos = { "numeroSigec",
				"codigoIdentificadorIFProponente", "codigoFluxoPagamento", "codigoContratoOriginal",
				"cnpjIFCredoraOriginal", "codigoTipoContrato", "codigoTipoCliente", "codigoCNPJCPFCliente",
				"nomeCliente", "telefoneCelular", "dataReferenciaSaldoDevedor", "valorReferenciaSaldoDevedor",
				"codigoTipoTaxa", "valorTaxaJurosNominal", "valorTaxaJurosEfetiva", "valorTaxaCET",
				"codigoRegimeAmortizacao", "quantidadeTotalParcelasContrato", "valorFaceParcelaContrato",
				"dataVencPrimeiraParcelaContrato", "dataVencUltimaParcelaContrato", "logradouroCartaPortabilidade",
				"numeroCartaPortabilidade", "sgUfCartaPortabilidade", "nomeCidadeCartaPortabilidade",
		"numeroCEPCartaPortabilidade" }) })
@Data
@EqualsAndHashCode(callSuper = false)
public class PedidoPortabilidade extends EntidadeBase {
	private static final long serialVersionUID = 2629503457199848864L;

	private static final String TIPO_PESSOA_JURIDICA = "J";

	private static final String TIPO_PESSOA_FISICA = "F";

	@Id
	@Column(name = "NU_SIGEC", unique = true, nullable = false, length = 18)
	private Long numeroSigec;

	@JsonIgnore
	@OneToOne
	@JoinColumn(name = "NU_SIGEC", nullable = false, insertable = false, updatable = false)
	private Portabilidade portabilidade;

	@ManyToOne
	@JoinColumn(name = "NU_TIPO_ENTIDADE_CONSIGNANTE")
	private TipoEntidadeConsignante tipoEntidadeConsignante;

	@ManyToOne
	@JoinColumn(name = "NU_TIPO_INDICE_REMUNERACAO")
	private TipoIndiceRemuneracao tipoIndiceRemuneracao;

	@OneToOne
	@JoinColumn(name = "NU_SIGEC", nullable = false, insertable = false, updatable = false)
	private VeiculoPortabilidade veiculoPortabilidade;

	@OneToOne
	@JoinColumn(name = "NU_SIGEC", nullable = false, insertable = false, updatable = false)
	private DetalhePortabilidadeConsignado detalhePortabilidadeConsignado;

	@ManyToOne
	@JoinColumn(name = "NU_TIPO_TAXA")
	private TipoTaxa tipoTaxa;

	@ManyToOne
	@JoinColumn(name = "NU_TIPO_REGIME_AMORTIZACAO")
	private TipoRegimeAmortizacao tipoRegimeAmortizacao;

	@ManyToOne
	@JoinColumn(name = "IC_TIPO_CLIENTE")
	private TipoCliente tipoCliente;

	@ManyToOne
	@JoinColumn(name = "NU_TIPO_CONTRATO")
	private TipoContratoSCR tipoContrato;

	@ManyToOne
	@JoinColumn(name = "IC_TIPO_FLUXO_PAGAMENTO")
	private TipoFluxoPagamento tipoFluxoPagamento;

	@Column(name = "CO_IF_PROPONENTE",  length = 8)
	private String numeroCodigoIdentificadorIFProponente;

	@Column(name = "NU_CONTRATO_ORIGINAL",  length = 40)
	private String numeroContratoOriginal;

	@Column(name = "CO_CNPJ_IF_ORIGINAL", length = 8)
	private String codigoCnpjIFCredoraOriginal;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_CONTRATACAO_OPERACAO")
	private Date dataContratacaoOperacao;

	@Column(name = "CO_CNPJ_CPF_CLIENTE", length = 14)
	private String numeroCNPJCPFCliente;

	@Column(name = "NO_CLIENTE",  length = 80)
	private String nomeCliente;

	@Column(name = "CO_TELEFONE_CLIENTE", length = 15)
	private String numeroTelefoneCliente;

	@Column(name = "DE_EMAIL_CLIENTE",  length = 80)
	private String emailCliente;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_RFRNA_SLDO_DVDR_CONTABIL")
	private Date dataReferenciaSaldoDevedor;

	@Column(name = "VR_REFERENCIA_SALDO_DEVEDOR")
	private Double valorReferenciaSaldoDevedor;

	@Column(name = "VR_TAXA_JUROS_NOMINAL")
	private Double valorTaxaJurosNominal;

	@Column(name = "VR_TAXA_JUROS_NOMINAL_MENSAL")
	private Double valorTaxaJurosNominalMensal;

	@Column(name = "VR_TAXA_JUROS_EFETIVA")
	private Double valorTaxaJurosEfetiva;

	@Column(name = "VR_TAXA_JUROS_EFETIVA_MENSAL")
	private Double valorTaxaJurosEfetivaMensal;

	@Column(name = "VR_TAXA_CET")
	private Double valorTaxaCET;

	@Column(name = "VR_TAXA_CET_MENSAL")
	private Double valorTaxaCETMensal;

	@Column(name = "VR_IOF")
	private Double valorIOF;

	@Column(name = "QT_TOTAL_PARCELA_CONTRATO")
	private Integer quantidadeTotalParcelasContrato;

	@Column(name = "VR_FACE_PARCELA_CONTRATO")
	private Double valorFaceParcelaContrato;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_VNCMO_PRMRA_PRCLA_CNTRO")
	private Date dataVencPrimeiraParcelaContrato;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_VNCMO_ULTMA_PRCLA_CNTRO")
	private Date dataVencUltimaParcelaContrato;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_VNCMO_PARCELA_IRREGULAR")
	private Date dataVencParcelaIrregular;

	@Column(name = "VR_FACE_PARCELA_IRREGULAR")
	private Double valorFaceParcelaIrregular;

	@Column(name = "ED_LOGRADOURO_CARTA_PRTBE",  length = 50)
	private String logradouroCartaPortabilidade;

	@Column(name = "ED_COMPLEMENTO_CARTA_PRTBE")
	private String complementoCartaPortabilidade;

	@Column(name = "NU_CARTA_PORTABILIDADE", length = 9)
	private String numeroCartaPortabilidade;

	@Column(name = "SG_UF_CARTA_PORTABILIDADE",  length = 2)
	private String sgUfCartaPortabilidade;

	@Column(name = "NO_CIDADE_CARTA_PORTABILIDADE",  length = 50)
	private String nomeCidadeCartaPortabilidade;

	@Column(name = "NU_CEP_CARTA_PORTABILIDADE", length = 8)
	private Integer numeroCEPCartaPortabilidade;

	@Column(name = "NU_AGENCIA_MOVIMENTO", length = 4)
	private Integer numeroAgenciaMovimento;

	@Column(name = "NU_AVALIACAO", length = 15)
	private Long numeroAvaliacao;

	@Column(name = "CO_CLIENTE", length = 13)
	private Long numeroCoCli;

	@Column(name = "IC_SERVIDOR_EFETIVO", length = 1)
	private String icServidorEfetivo;

	@Column(name = "NU_MATRICULA_SERVIDOR_EFETIVO", length = 20)
	private String matriculaServidorEfetivo;

	@Column(name = "IC_TIPO_CORRESPONDENTE", length = 2)
	private String icTipoCorrespondente;

	@Column(name = "CO_CORRESPONDENTE", length = 11)
	private String codigoCorrespondente;

	@Column(name = "NO_MAE_CLIENTE", length = 100,  insertable = true, updatable = false)
	private String nomeMae;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_NASCIMENTO_CLIENTE",  insertable = true, updatable = false)
	private Date dataNascimento;

	@Column(name = "CO_RIC_CLIENTE", length = 20,  insertable = true, updatable = false)
	private String numeroIdentidade;

	@Column(name = "DE_ORGAO_EMISSOR_RG", length = 30,  insertable = true, updatable = false)
	private String orgaoEmissorRG;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_EMISSAO_RIC_CLIENTE",  insertable = true, updatable = false)
	private Date dataEmissaoRG;

	@Column(name = "SG_UF_EMISSAO_RIC_CLIENTE", length = 2,  insertable = true, updatable = false)
	private String ufEmissaoRG;

	@Column(name = "CO_ESTADO_CIVIL",  insertable = true, updatable = false)
	private Integer codigoEstadoCivil;

	@Column(name = "ED_LOCALIZACAO_CLIENTE", length = 100,  insertable = true, updatable = false)
	private String localizacaoCliente;

	@Column(name = "ED_LOGRADOURO_CLIENTE", length = 100,  insertable = true, updatable = false)
	private String logradouroSicli;

	@Column(name = "CO_ENDERECO_CLIENTE", length = 10,  insertable = true, updatable = false)
	private String numeroSicli;

	@Column(name = "ED_CIDADE_CLIENTE", length = 100,  insertable = true, updatable = false)
	private String nomeCidadeSicli;

	@Column(name = "ED_BAIRRO_CLIENTE", length = 100,  insertable = true, updatable = false)
	private String bairroSicli;

	@Column(name = "SG_UF_CLIENTE", length = 2,  insertable = true, updatable = false)
	private String sgUfSicli;

	@Column(name = "CO_CEP_CLIENTE", precision = 8, scale = 0,  insertable = true, updatable = false)
	private Long cepSicli;

	@Column(name = "DE_COMPLEMENTO_ENDRO_CLIENTE", length = 100,  insertable = true, updatable = false)
	private String complementoSicli;

	@Column(name = "NU_TELEFONE_CELULAR", length = 25,  insertable = true, updatable = false)
	private String telefoneCelular;

	@Column(name = "CO_MDLDE_OPERACAO_CONSIGNACAO", length = 3)
	private String codigoModalidadeSIAPX; // BR201605659_RTC1547309

	@Column(name = "NU_BANCO_CREDITO")
	private Integer numeroBancoCredito; // BR201605659_RTC1547309

	@Column(name = "NU_AGENCIA_CREDITO")
	private Integer numeroAgenciaCredito; // BR201605659_RTC1547309

	@Column(name = "NU_CONTA_CORRENTE_CREDITO")
	private Long numeroContaCorrenteCredito; // BR201605659_RTC1547309

	@Column(name = "NU_OPERACAO_CC_CREDITO")
	private Integer numeroOperacaoContaCorrenteCredito; // BR201605659_RTC1547309

	@Column(name = "NU_PRODUTO",  length = 4)
	private Integer numeroProduto; // RTC5924903

	@Column(name = "CO_MATRICULA_NEGOCIADOR",  length = 10)
	private String codigoMatriculaNegociador;

	@Transient
	private String descricaoOrgaoEmissorRG;

	@Transient
	private String flagDOI;

	@Transient
	private String estadoCivil;

	@Transient
	private String matriculaInstituidor;

	@Transient
	private String codigoLotacao;

	@Transient
	private String organizacaoMilitar;

	@Transient
	private Long codigoConvenente;

	@Transient
	private Integer bancoInss;

	@Transient
	private Integer agenciaInss;

	@Transient
	private Long contaCorrenteInss;

	@Transient
	private Integer diaUtilCreditoInss;

	@Transient
	private String marcaVeiculo;

	@Transient
	private String modeloVeiculo;

	@Transient
	private String categoriaVeiculo;

	@Transient
	private Integer anoVeiculo;

	@Transient
	private String chassiVeiculo;

	@Transient
	private String renavanVeiculo;

	@Transient
	private String placaVeiculo;

	@Transient
	private int tipoOrgaoPublico;

	@Transient
	private Long codigoConvenenteValidado;

	@Transient
	private Long enteConsignante;

	@Transient
	private String existeVeiculo;

	@Transient
	private String existeConsignado;

	@Transient
	private String correspondente;

	@Transient
	private String descricaoTipoOrgaoPublico;

	@Transient
	private String beneficioInss;

	@Transient
	private Date dataVencimento1hPrestacao;

	@ManyToOne
	@JoinColumn(name = "CO_TIPO_CONTA_BANCARIA")
	private TipoContaBancaria tipoContaBancaria;

	@Column(name = "CO_CNPJ_EMPREGADOR", length = 14)
	private String cnpjCpfEmpregador;

	@Column(name = "NO_RAZAO_SOCIAL_EMPREGADOR", length = 50)
	private String nomeEmpregador;

	@ManyToOne
	@JoinColumn(name = "NU_TIPO_MOEDA")
	private TipoMoeda tipoMoeda;

	// RTC 10357150 - Contestacao Regularizacao
	/**
	 * movimentacaoContestacaoCtslr - MovimentacaoContestacaoCtslr.
	 */
	@OneToOne(mappedBy = "pedidoPortabilidade")
	@JsonManagedReference
	private MovimentacaoContestacaoCtslr movimentacaoContestacaoCtslr;

	/**
	 * movimentacaoRegularizacaoCtslr - MovimentacaoRegularizacaoCtslr.
	 */
	@OneToOne(mappedBy = "pedidoPortabilidade")
	@JsonManagedReference
	private MovimentacaoRegularizacaoCtslr movimentacaoRegularizacaoCtslr;

	@Transient
	private Date dataFimContestacao;

	@Transient
	private boolean isContestar;

	@Transient
	private boolean isResponderContestacao;

	@Transient
	private boolean isRegularizarContestacao;

	// RTC 10368574
	@Column(name = "CO_CNPJ_CORRESPONDENTE_BNCRO", length = 14)
	private String codigoCnpjCorrespondenteBncro;

	// RTC 10195734
	@Column(name = "IC_TIPO_EMPREGADOR", length = 1)
	private String tipoEmpregador;

	@Transient
	private List<Map<String, Object>> contas;

	@Column(name = "NU_CONTA_PAGAMENTO", length = 13)
	private Long numeroContaPagamento;

	@Column(name = "IC_CONTA_CONJUNTA_SOLIDARIA", length = 1, nullable = false)
	private String icContaConjuntaSolidaria;

	@Column(name = "VR_MAXIMO_COBERTURA")
	private Double valorMaximoCobertura;

	@Column(name = "VR_TARIFA_CHEQUE_ESPECIAL")
	private Double valorTarifaChequeEspecial;

	@Column(name = "VR_SALDO_DEVEDOR_CNTBL_ADNTO")
	private Double valorSaldoDevedorContabilAD;

	@Column(name = "VR_TAXA_JUROS_NMNL_ADNTO")
	private Double valorTaxaJurosNominalAD;

	@Column(name = "VR_TAXA_JUROS_EFTVA_ADNTO")
	private Double valorTaxaJurosEfetivaAD;

	@Column(name = "VR_TAXA_CET_ADIANTAMENTO")
	private Double valorTaxaCETAD;

	@Column(name = "VR_TARIFA_ADIANTAMENTO")
	private Double valorTarifaAD;

	@Column(name = "QT_DIA_ISENCAO")
	private Integer quantidadeDiasIsencao;

	@ManyToOne
	@JoinColumn(name = "NU_ORIGEM_RECURSO")
	private OrigemRecurso origemRecurso;

	@ManyToOne
	@JoinColumn(name = "NU_TIPO_TAXA_ADIANTAMENTO")
	private TipoTaxa tipoTaxaAD;

	@ManyToOne
	@JoinColumn(name = "NU_TIPO_CONTRATO_PROPOSTA")
	private TipoContratoSCR tipoContratoProposta;

	@OneToOne(mappedBy = "pedidoPortabilidade")
	@JsonManagedReference
	//	@Transient
	private ComplementoPedidoHabitacao complementoPedidoHabitacao;

	@Column(name = "DE_NATUREZA_JURIDICA")
	private String naturezaJuridica;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_CONSTITUICAO_EMPRESA")
	private Date dataConstituicaoEmpresa;

	@Column(name = "CO_RAMO_ATIVIDADE_CNAE")
	private String ramoAtividadeCNAE;

	@Column(name = "NU_NATUREZA_JURIDICA")
	private Integer numeroNaturezaJuridica;

	@Column(name = "SG_SISTEMA_ORIGEM_PRCNO")
	private String canal;

	@Column(name = "NU_CONTA_MOVIMENTO")
	private Long numeroContaMovimento;

	@Column(name = "NU_OPERACAO_MOVIMENTO")
	private Integer numeroOperacaoMovimento;

	@Column(name = "CO_ORIGEM_TRANSACAO")
	private Long nuOrigemTransacao;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_DIGITACAO_PROPOSTA")
	private Date dataDigitacaoProposta;

	@Column(name = "IC_APOIO_NACIONAL_MICROEMPRESA", length = 1, nullable = false)
	private String icApoioNacionalMicroempresa;
	
	@Transient
	private Double valorRco = 0D;
	
	@Transient
	private CartaoCreditoPortabilidadeEntity cartaoCredito;

	public PedidoPortabilidade() {

	}

	/**
	 *
	 * @param numeroCNPJCPFCliente
	 * @param canal
	 * @param nuOrigemTransacao
	 */
	public PedidoPortabilidade(final String numeroCNPJCPFCliente, final String canal, final Long nuOrigemTransacao) {
		this.numeroCNPJCPFCliente = numeroCNPJCPFCliente;
		this.canal = canal;
		this.nuOrigemTransacao = nuOrigemTransacao;
	}

	/**
	 *
	 * @param numeroSigec
	 */
	public PedidoPortabilidade(final Long numeroSigec) {
		this.numeroSigec = numeroSigec;
	}

	// RTC10195734
	public String getTipoEmpregador() {
		if (tipoEmpregador == null) {
			if (cnpjCpfEmpregador != null && cnpjCpfEmpregador.trim().length() == 14) {
				return TipoEmpregadorEnum.JURIDICA.toString();
			} else if (cnpjCpfEmpregador != null && cnpjCpfEmpregador.trim().length() == 11) {
				return TipoEmpregadorEnum.FISICA.toString();
			} else {
				return "";
			}

		}
		return tipoEmpregador;
	}

	public void setTipoEmpregador(final String tipoEmpregador) {
		if (TIPO_PESSOA_FISICA.equals(tipoEmpregador) || TIPO_PESSOA_JURIDICA.equals(tipoEmpregador)) {
			this.tipoEmpregador = tipoEmpregador;
		} else {
			this.tipoEmpregador = null;
		}
	}


	@PrePersist
	@PreUpdate
	void defaultValue() {
		if (this.icContaConjuntaSolidaria == null) {
			this.icContaConjuntaSolidaria = "N";
		}
		if (this.icApoioNacionalMicroempresa == null) {
			this.icApoioNacionalMicroempresa = "N";
		}
	}
	
	public Double getValorRco() {
		return valorRco;
	}

	public void setValorRco(Double valorRco) {
		this.valorRco = valorRco;
	}

}

gec-ejb/src/main/java/br/gov/caixa/sigec/dominio/Portabilidade.java


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
	private List<PosicaoPortabilidadeDTO> listPosicaoPortabilidade;

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
