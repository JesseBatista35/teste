package gov.caixa.microfpp.resources;

import gov.caixa.microfpp.dto.apiResponse.ApiResponseIncluirBoleto;
import gov.caixa.microfpp.dto.apiResponse.ErrorResponse;
import gov.caixa.microfpp.dto.request.IncluirBoletoRequest;
import gov.caixa.microfpp.dto.response.IncluirBoletoResponse;
import gov.caixa.microfpp.infra.exceptions.ExternalServiceException;
import gov.caixa.microfpp.services.IncluirBoletoService;
import gov.caixa.microfpp.services.apiService.SSOService;
import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.jboss.logging.Logger;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.cert.X509Certificate;
import java.util.Base64;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;


@Path("/boletos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Tag(name = "Boletos", description = "Operações de geração de boletos")
public class BoletoResource {

    private static final Logger LOG = Logger.getLogger(BoletoResource.class);

    @Inject
    SSOService ssoService;

    @Inject
    IncluirBoletoService boletoService;

    @POST
    @Path("/incluir")
    @Operation(
            summary = "Inclui um novo boleto",
            description = "Executa a seguinte sequência:\n" +
                    "1. Obtém token de autenticação do SSO (Keycloak)\n" +
                    "2. Utiliza o token e os dados fornecidos para incluir boleto\n" +
                    "3. Retorna os dados do boleto criado"
    )
    public Response incluirBoleto(IncluirBoletoRequest incluirBoletoRequest) {
        try {
            LOG.info("========================================");
            LOG.info("POST /boletos/incluir - Iniciando inclusão de boleto");
            LOG.info("========================================");

            if (incluirBoletoRequest == null) {
                LOG.error("Dados do boleto não fornecidos");
                return Response.status(Response.Status.BAD_REQUEST)
                        .entity(new ErrorResponse("INVALID_REQUEST", "Dados do boleto obrigatórios"))
                        .build();
            }

            boletoService.validarBoletoRequest(incluirBoletoRequest);

            // 1. Obter token SSO
            LOG.info("PASSO 1/2: Solicitando token ao SSO (Keycloak)...");
            String token = ssoService.obterToken();
            LOG.info("✓ PASSO 1/2 CONCLUÍDO");

            // 2. Incluir boleto com dados fornecidos
            LOG.info("PASSO 2/2: Chamando API de inclusão de boleto...");
            LOG.info("Numero Documento: " + incluirBoletoRequest.getNumeroDocumento());
            LOG.info("Valor: " + incluirBoletoRequest.getValor());
            LOG.info("Data Vencimento: " + incluirBoletoRequest.getDataVencimento());

            IncluirBoletoResponse boletoResponse = boletoService.gerarBoleto(token, incluirBoletoRequest);
            LOG.info("✓ PASSO 2/2 CONCLUÍDO");

            // 3. Montar resposta
            ApiResponseIncluirBoleto response = new ApiResponseIncluirBoleto(
                    "Boleto incluído com sucesso",
                    token,
                    boletoResponse
            );

            String urlAjustado = ajustarUrlBoleto(response.getBoletoResponse().getUrlBoleto());
            LOG.info(urlAjustado);
            String base64 = converteURLComoBase64(urlAjustado);
            response.getBoletoResponse().setBase64(base64);
            LOG.info("========================================");
            LOG.info("✓ BASE 64 = " + base64);
            LOG.info("========================================");

            LOG.info("========================================");
            LOG.info("✓ Inclusão de boleto concluída com SUCESSO");
            LOG.info("========================================");

            return Response.ok(response).build();

        } catch (IllegalArgumentException e) {
            LOG.error("✗ Requisição inválida em /boletos/incluir", e);
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(new ErrorResponse("INVALID_REQUEST", e.getMessage()))
                    .build();
        } catch (ExternalServiceException e) {
            LOG.error("✗ Falha em integracao no fluxo /boletos/incluir", e);
            return Response.status(Response.Status.BAD_GATEWAY)
                    .entity(new ErrorResponse(e.getErrorCode(), e.getMessage()))
                    .build();
        } catch (Exception e) {
            LOG.error("========================================");
            LOG.error("✗ Erro ao processar /boletos/incluir", e);
            LOG.error("========================================");

            ErrorResponse errorResponse = new ErrorResponse(
                    "INTERNAL_SERVER_ERROR",
                    e.getMessage()
            );

            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity(errorResponse)
                    .build();
        }
    }

    public String ajustarUrlBoleto(String url) {
        if (url.isEmpty()) return "";
        return url.replace("200.201.168.67", "10.116.82.66");
    }



public static String converteURLComoBase64(String url) throws Exception {

    // ignora verificação de hostname (ESSENCIAL)
    System.setProperty("jdk.internal.httpclient.disableHostnameVerification", "true");

    HttpClient client = createUnsafeClient();

    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .GET()
            .build();

    HttpResponse<byte[]> response =
            client.send(request, HttpResponse.BodyHandlers.ofByteArray());

    return Base64.getEncoder().encodeToString(response.body());
}


public static HttpClient createUnsafeClient() throws Exception {

    TrustManager[] trustAllCerts = new TrustManager[]{
        new X509TrustManager() {
            public void checkClientTrusted(X509Certificate[] chain, String authType) {}
            public void checkServerTrusted(X509Certificate[] chain, String authType) {}
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        }
    };

    SSLContext sslContext = SSLContext.getInstance("TLS");
    sslContext.init(null, trustAllCerts, new java.security.SecureRandom());

    return HttpClient.newBuilder()
            .sslContext(sslContext)
            .build();
}


}

