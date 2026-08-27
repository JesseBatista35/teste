using Polly;
using Polly.Extensions.Http;
using SiopiBackendConstrucaoCivilPJ.API.Handlers;
using System.Security.Authentication;

namespace SiopiBackendConstrucaoCivilPJ.API.Configuration
{
    /// <summary>
    /// Configuração de HttpClients utilizados pela aplicação.
    /// </summary>
    public static class HttpClientConfiguration
    {
        /// <summary>
        /// Registra os HttpClients e handlers necessários para integrações externas.
        /// </summary>
        /// <param name="services">Coleção de serviços da aplicação.</param>
        /// <param name="configuration">Configuração da aplicação.</param>
        /// <returns>A coleção de serviços atualizada.</returns>
        /// <exception cref="InvalidOperationException">Quando as configurações obrigatórias não são encontradas.</exception>
        public static IServiceCollection AddHttpClientConfig(
            this IServiceCollection services,
            IConfiguration configuration)
        {
            var urlBaseApim = configuration["ApimIntranet"]
                ?? throw new InvalidOperationException("A configuração 'ApimIntranet' é obrigatória.");
            var apiKey = configuration["ApiKey"]
                ?? throw new InvalidOperationException("A configuração 'ApiKey' é obrigatória.");
            var ssoUrl = configuration["IntranetIssuer"]
                ?? throw new InvalidOperationException("A configuração 'IntranetIssuer' é obrigatória.");


            // Método local para configurar o HttpClientHandler
            HttpClientHandler CreateHttpClientHandler() => new()
            {
                ClientCertificateOptions = ClientCertificateOption.Manual,
                SslProtocols =
                    SslProtocols.Tls12 | SslProtocols.Tls13,
            };

            services.AddHttpClient("ApimIntranet", httpClient =>
            {
                httpClient.BaseAddress = new Uri(urlBaseApim);
                httpClient.AddHeadersApiKey(apiKey);
            }).ConfigurePrimaryHttpMessageHandler(CreateHttpClientHandler)
            .AddPolicyHandler(HttpPolicyExtensions
            .HandleTransientHttpError()
            .WaitAndRetryAsync(3, attempt => TimeSpan.FromSeconds(Math.Pow(2, attempt))))
            .AddHttpMessageHandler<TokenHandler>()
            .AddHttpMessageHandler(sp =>
              {
                  var logger = sp.GetRequiredService<ILogger<GlobalHttpErrorHandler>>();
                  return new GlobalHttpErrorHandler(logger);
              });

            services.AddHttpClient("Siset", httpClient =>
            {
                httpClient.BaseAddress = new Uri(ssoUrl);
            }).ConfigurePrimaryHttpMessageHandler(CreateHttpClientHandler);
            return services;
        }
    }
}
