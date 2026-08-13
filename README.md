package gov.caixa.microfpp.infra.client;


import gov.caixa.microfpp.dto.request.IncluirBoletoRequest;
import gov.caixa.microfpp.dto.response.IncluirBoletoResponse;
import gov.caixa.microfpp.infra.filter.BoletoClientRequestFilter;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
 * Cliente REST para a API de Boletos Caixa
 *
 * O header "apikey" é injetado automaticamente pelo BoletoClientRequestFilter,
 * eliminando a necessidade de passá-lo como parâmetro.
 *
 * Endpoint: POST /cobranca/boletos/v1/incluiBoleto
 */
@RegisterRestClient(configKey = "boleto.api")
@RegisterProvider(BoletoClientRequestFilter.class)
public interface IncluirBoletoApiClient {

    @POST
    @Path("/cobranca/boletos/v1/incluiBoleto")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    IncluirBoletoResponse incluiBoleto(
            @HeaderParam("Authorization") String token,
            IncluirBoletoRequest boletoRequest
    );
}

