package gov.caixa.microfpp.services.apiService.retry;

import gov.caixa.microfpp.dto.request.IncluirBoletoRequest;
import gov.caixa.microfpp.dto.response.IncluirBoletoResponse;
import gov.caixa.microfpp.infra.client.IncluirBoletoApiClient;
import gov.caixa.microfpp.infra.exceptions.ExternalServiceException;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import jakarta.ws.rs.ProcessingException;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.faulttolerance.Retry;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

@Singleton
public class IncluirBoletoApiRetryService {
    private static final Logger LOG = Logger.getLogger(IncluirBoletoApiRetryService.class);

    @Inject
    @RestClient
    IncluirBoletoApiClient boletoApiClient;

    @Retry(
            maxRetries = 3,
            delay = 2000,
            retryOn = RetryableExternalServiceException.class
    )
    public IncluirBoletoResponse incluiBoleto(String authHeader, IncluirBoletoRequest boletoRequest) {
        try {
            return boletoApiClient.incluiBoleto(authHeader, boletoRequest);
        } catch (WebApplicationException e) {
            int status = e.getResponse() != null ? e.getResponse().getStatus() : Response.Status.BAD_GATEWAY.getStatusCode();
            String responseBody = extractResponseBody(e);
            LOG.error("Erro HTTP ao consumir API de boleto - Status: " + status);
            if (!responseBody.isBlank()) {
                LOG.error("Response: " + responseBody);
            }

            if (status >= 500) {
                LOG.warn("Falha transitória na API de boleto. Retry via MicroProfile - código: BOLETO_API_ERROR");
                throw new RetryableExternalServiceException(
                        "BOLETO_API_ERROR",
                        "Falha ao consumir a API de boleto. Status HTTP upstream: " + status + formatDetail(responseBody),
                        status,
                        e
                );
            }

            throw new ExternalServiceException(
                    "BOLETO_API_ERROR",
                    "Falha ao consumir a API de boleto. Status HTTP upstream: " + status + formatDetail(responseBody),
                    status,
                    e
            );
        } catch (ProcessingException e) {
            LOG.error("Erro de comunicação ao consumir API de boleto", e);
            LOG.warn("Falha transitória na API de boleto. Retry via MicroProfile - código: BOLETO_API_COMMUNICATION_ERROR");
            throw new RetryableExternalServiceException(
                    "BOLETO_API_COMMUNICATION_ERROR",
                    "Falha de comunicação com a API de boleto: " + e.getMessage(),
                    Response.Status.BAD_GATEWAY.getStatusCode(),
                    e
            );
        }
    }

    private String extractResponseBody(WebApplicationException exception) {
        try {
            if (exception.getResponse() == null || !exception.getResponse().hasEntity()) {
                return "";
            }
            String body = exception.getResponse().readEntity(String.class);
            return body != null ? body.trim() : "";
        } catch (Exception ignored) {
            return "";
        }
    }

    private String formatDetail(String responseBody) {
        return responseBody.isBlank() ? "" : ". Detalhe: " + responseBody;
    }
}
