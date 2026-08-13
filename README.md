package gov.caixa.microfpp.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class IncluirBoletoRequest {

    @JsonProperty("flagAceite")
    private String flagAceite;

    @JsonProperty("fichaCompensacao")
    private FichaCompensacaoRequest fichaCompensacao;

    @JsonProperty("endereco")
    private EnderecoRequest endereco;

    @JsonProperty("pagador")
    private PagadorRequest pagador;

    @JsonProperty("tpidentcsacdravalst")
    private Integer tpidentcsacdravalst;

    @JsonProperty("multa")
    private MultaRequest multa;

    @JsonProperty("valor")
    private Double valor;

    @JsonProperty("posVencimento")
    private PosVencimentoRequest posVencimento;

    @JsonProperty("valorAbatimento")
    private Double valorAbatimento;

    @JsonProperty("tipoBoleto")
    private String tipoBoleto;

    @JsonProperty("dataEmissao")
    private String dataEmissao;

    @JsonProperty("tipoEspecie")
    private Integer tipoEspecie;

    @JsonProperty("reciboPagador")
    private ReciboPagadorRequest reciboPagador;

    @JsonProperty("idBeneficiario")
    private String idBeneficiario;

    @JsonProperty("jurosMora")
    private JurosMoraRequest jurosMora;

    @JsonProperty("descontos")
    private List<Object> descontos;

    @JsonProperty("dataVencimento")
    private String dataVencimento;

    @JsonProperty("carteira")
    private Integer carteira;

    @JsonProperty("nossoNumero")
    private String nossoNumero;

    @JsonProperty("numeroDocumento")
    private String numeroDocumento;

    @JsonProperty("codigoMoeda")
    private Integer codigoMoeda;

    @JsonProperty("pagamento")
    private PagamentoRequest pagamento;

    @JsonProperty("valorIof")
    private Double valorIof;

    @JsonProperty("identificacaoEmpresa")
    private Integer identificacaoEmpresa;

    // Getters e Setters
    public String getFlagAceite() { return flagAceite; }
    public void setFlagAceite(String flagAceite) { this.flagAceite = flagAceite; }

    public FichaCompensacaoRequest getFichaCompensacao() { return fichaCompensacao; }
    public void setFichaCompensacao(FichaCompensacaoRequest fichaCompensacao) { this.fichaCompensacao = fichaCompensacao; }

    public EnderecoRequest getEndereco() { return endereco; }
    public void setEndereco(EnderecoRequest endereco) { this.endereco = endereco; }

    public PagadorRequest getPagador() { return pagador; }
    public void setPagador(PagadorRequest pagador) { this.pagador = pagador; }

    public Integer getTpidentcsacdravalst() { return tpidentcsacdravalst; }
    public void setTpidentcsacdravalst(Integer tpidentcsacdravalst) { this.tpidentcsacdravalst = tpidentcsacdravalst; }

    public MultaRequest getMulta() { return multa; }
    public void setMulta(MultaRequest multa) { this.multa = multa; }

    public Double getValor() { return valor; }
    public void setValor(Double valor) { this.valor = valor; }

    public PosVencimentoRequest getPosVencimento() { return posVencimento; }
    public void setPosVencimento(PosVencimentoRequest posVencimento) { this.posVencimento = posVencimento; }

    public Double getValorAbatimento() { return valorAbatimento; }
    public void setValorAbatimento(Double valorAbatimento) { this.valorAbatimento = valorAbatimento; }

    public String getTipoBoleto() { return tipoBoleto; }
    public void setTipoBoleto(String tipoBoleto) { this.tipoBoleto = tipoBoleto; }

    public String getDataEmissao() { return dataEmissao; }
    public void setDataEmissao(String dataEmissao) { this.dataEmissao = dataEmissao; }

    public Integer getTipoEspecie() { return tipoEspecie; }
    public void setTipoEspecie(Integer tipoEspecie) { this.tipoEspecie = tipoEspecie; }

    public ReciboPagadorRequest getReciboPagador() { return reciboPagador; }
    public void setReciboPagador(ReciboPagadorRequest reciboPagador) { this.reciboPagador = reciboPagador; }

    public String getIdBeneficiario() { return idBeneficiario; }
    public void setIdBeneficiario(String idBeneficiario) { this.idBeneficiario = idBeneficiario; }

    public JurosMoraRequest getJurosMora() { return jurosMora; }
    public void setJurosMora(JurosMoraRequest jurosMora) { this.jurosMora = jurosMora; }

    public List<Object> getDescontos() { return descontos; }
    public void setDescontos(List<Object> descontos) { this.descontos = descontos; }

    public String getDataVencimento() { return dataVencimento; }
    public void setDataVencimento(String dataVencimento) { this.dataVencimento = dataVencimento; }

    public Integer getCarteira() { return carteira; }
    public void setCarteira(Integer carteira) { this.carteira = carteira; }

    public String getNossoNumero() { return nossoNumero; }
    public void setNossoNumero(String nossoNumero) { this.nossoNumero = nossoNumero; }

    public String getNumeroDocumento() { return numeroDocumento; }
    public void setNumeroDocumento(String numeroDocumento) { this.numeroDocumento = numeroDocumento; }

    public Integer getCodigoMoeda() { return codigoMoeda; }
    public void setCodigoMoeda(Integer codigoMoeda) { this.codigoMoeda = codigoMoeda; }

    public PagamentoRequest getPagamento() { return pagamento; }
    public void setPagamento(PagamentoRequest pagamento) { this.pagamento = pagamento; }

    public Double getValorIof() { return valorIof; }
    public void setValorIof(Double valorIof) { this.valorIof = valorIof; }

    public Integer getIdentificacaoEmpresa() { return identificacaoEmpresa; }
    public void setIdentificacaoEmpresa(Integer identificacaoEmpresa) { this.identificacaoEmpresa = identificacaoEmpresa;}
}




package gov.caixa.microfpp.dto.apiResponse;

import gov.caixa.microfpp.dto.response.IncluirBoletoResponse;

public class ApiResponseIncluirBoleto {
    private String message;
    private String token;
    private IncluirBoletoResponse boletoResponse;

    public ApiResponseIncluirBoleto() {
    }

    public ApiResponseIncluirBoleto(String message, String token, IncluirBoletoResponse boletoResponse) {
        this.message = message;
        this.token = token;
        this.boletoResponse = boletoResponse;
    }

    // Getters e Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public IncluirBoletoResponse getBoletoResponse() {
        return boletoResponse;
    }

    public void setBoletoResponse(IncluirBoletoResponse boletoResponse) {
        this.boletoResponse = boletoResponse;
    }

    @Override
    public String toString() {
        return "HelloResponse{" +
                "message='" + message + '\'' +
                ", token='" + (token != null ? token.substring(0, Math.min(20, token.length())) + "..." : "null") + '\'' +
                ", boletoResponse=" + boletoResponse +
                '}';
    }
}
