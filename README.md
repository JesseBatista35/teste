using Asp.Versioning.ApiExplorer;
using HealthChecks.UI.Client;
using Microsoft.AspNetCore.Diagnostics.HealthChecks;
using Microsoft.AspNetCore.HttpOverrides;
using Microsoft.AspNetCore.Localization;
using SiopiBackendConstrucaoCivilPJ.API.Configuration;
using System.Globalization;

var builder = WebApplication.CreateBuilder(args);

var configuration = builder.Configuration;
var environment = builder.Environment;

// ----------------------------------------------------
// Logging (estruturado e amigável para Dev/Container)
// ----------------------------------------------------
builder.Logging.ClearProviders();
builder.Logging.AddSimpleConsole(options =>
{
    options.TimestampFormat = "[HH:mm:ss] ";
    options.IncludeScopes = false;
    options.SingleLine = true;
});

// ----------------------------------------------------
// Dependency Injection
// ----------------------------------------------------
builder.Services.AddMemoryCache();
builder.Services.AddHttpContextAccessor();
builder.Services.AddEndpointsApiExplorer();
builder.Services.AddUseCases(builder.Configuration);
builder.Services.AddSwaggerConfigureCollection();
//builder.Services.AddDbConnections(builder.Configuration); //TODO: DESCOMENTAR APENAS QUANDO O BANCO ESTIVER 100% PREPARADO E CREDENCIAIS DELE DISPONÍVEIS E CONFIGURADAS
builder.Services.AddHttpClientConfig(builder.Configuration);
builder.Services.AddCorsCollection();
builder.Services.AddHealthChecksCollection(environment, configuration);
builder.Services.AddConfigureControllers();

var app = builder.Build();

// ----------------------------------------------------
// Localização (pt-BR)
// ----------------------------------------------------
var defaultCulture = new CultureInfo("pt-BR");
app.UseRequestLocalization(new RequestLocalizationOptions
{
    DefaultRequestCulture = new RequestCulture(defaultCulture),
    SupportedCultures = new List<CultureInfo> { defaultCulture },
    SupportedUICultures = new List<CultureInfo> { defaultCulture }
});

// ----------------------------------------------------
// Forwarded Headers (essencial para AKS / Ingress / Istio)
// ----------------------------------------------------
app.UseForwardedHeaders(new ForwardedHeadersOptions
{
    ForwardedHeaders = ForwardedHeaders.XForwardedFor
                     | ForwardedHeaders.XForwardedProto
                     | ForwardedHeaders.XForwardedHost,
    KnownNetworks = { },
    KnownProxies = { },
    ForwardLimit = null
});

// ----------------------------------------------------
// Exception handling por ambiente
// ----------------------------------------------------
if (environment.IsDevelopment())
{
    app.UseDeveloperExceptionPage();
}
else
{
    app.UseExceptionHandler("/error");
    app.UseHsts();
}

// ----------------------------------------------------
// Swagger (Dev e DES)
// ----------------------------------------------------
if (environment.IsDevelopment() || environment.IsEnvironment("DES"))
{
    app.UseSwagger();
    app.UseSwaggerUI(c =>
    {
        var provider = app.Services.GetRequiredService<IApiVersionDescriptionProvider>();

        foreach (var description in provider.ApiVersionDescriptions.OrderByDescending(x => x.ApiVersion))
        {
            c.SwaggerEndpoint(
                $"/swagger/{description.GroupName}/swagger.json",
                $"Jornada PJ - Construção Cívil {description.GroupName.ToUpperInvariant()}"
            );
        }

        c.DefaultModelsExpandDepth(-1);
        c.DocExpansion(Swashbuckle.AspNetCore.SwaggerUI.DocExpansion.None);
    });
}

// ----------------------------------------------------
// Pipeline HTTP
// ----------------------------------------------------
app.UseRouting();

app.UseCors(environment.IsDevelopment() ? "Development" : "Production");

// TODO: ativar quando JWT estiver configurado
// app.UseAuthentication();
// app.UseAuthorization();

app.MapControllers();

// ----------------------------------------------------
// Health Checks
// ----------------------------------------------------
app.UseHealthChecks("/healthz", new HealthCheckOptions
{
    Predicate = _ => true,
    ResponseWriter = UIResponseWriter.WriteHealthCheckUIResponse
});

// Dashboard apenas em ambientes não-produtivos
if (environment.IsDevelopment() || environment.IsEnvironment("DES"))
{
    app.UseHealthChecksUI(options => options.UIPath = "/dashboard");
}

app.Run();
