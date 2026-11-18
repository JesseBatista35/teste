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
	private transient List<Map<String, Object>> contas;

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
