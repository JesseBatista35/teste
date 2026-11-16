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
        // TODO(Cesti-test-001): TransferenciaEletronicaLegacyCallNCR#listarMensagensEnvioFilaNCR() nao existe mais
        // (a interface expoe recuperarDadosEnvioFilaNCR). Acao desativada ate o desenvolvimento definir o substituto.
        acoes.put("NCR.listarMensagensEnvio", () -> {
            throw new UnsupportedOperationException(
                    "NCR.listarMensagensEnvio indisponivel: metodo listarMensagensEnvioFilaNCR nao existe na versao atual do negocio");
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
            // TODO(Cesti-test-001): TransferenciaEletronicaLegacyCallNCR#publicarMensagemEnvioFilaNCR(DadosGECTedDTO)
            // nao existe mais. Endpoint mantido (rota estavel), mas responde 501 ate o desenvolvimento definir o substituto.
            return Response.status(501)
                    .entity("Publicacao NCR indisponivel: metodo publicarMensagemEnvioFilaNCR nao existe na versao atual do negocio. nuTed="
                            + dto.getNuTed())
                    .build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Falha ao publicar payload NCR: " + e.getMessage())
                    .build();
        }
    }
}
