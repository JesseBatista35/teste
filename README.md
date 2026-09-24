
<img width="1007" height="356" alt="image" src="https://github.com/user-attachments/assets/3785d4e8-e8fd-4787-b669-55c602e516c0" />


Testando o Sipgc no ambiente de TQS, vi que está ocorrendo aquele erro de login no banco de dados.
Acredito que faltou apontar para essas duas libraries(SIPGC-BT-VAULT-SECRET-TQS e SIPG-API-BT-VAULT-TQS) nos pipelines da Api de Agrupamento e Api de Membros. As duas estão sem conseguir acessar o banco em TQS e, vendo os logs, notei que é porque não está resolvendo a variável da senha que vem do vault. Observei que as duas estão sem referência para essas libraries, enquanto a Api de Papel tem e está conseguindo acessar
 
Api de agrupamento
SIPGC-api-agrupamento - SIPGC-api-agrupamento-1.3.0.11(4) - Pipelines
 
Api de membros
SIPGC-api-membros - SIPGC-api-membros-1.3.0.21(3) - Pipelines
 
Api de Papel(referência, está funcional nesse aspecto)
SIPGC-api-papel - SIPGC-api-papel-1.5.1.9(4) - Pipelines


---> Running application ...
info: SIPGC.Infrastructure.BeyondTrust.BeyondTrustVariableResolver[0]
      [BT] Configurando BeyondTrust - Ambiente: tqs
info: SIPGC.Infrastructure.BeyondTrust.BeyondTrustConfigurationProvider[0]
      [BT] Carregando configurações BeyondTrust - Ambiente: tqs
info: SIPGC.Infrastructure.BeyondTrust.BeyondTrustService[0]
      [BT] Carregando secrets do diretório: /usr/src/app/secrets_files/SIPGC_TQS/
fail: SIPGC.Infrastructure.BeyondTrust.BeyondTrustService[0]
      [BT] Diretório de secrets não encontrado: /usr/src/app/secrets_files/SIPGC_TQS/
info: SIPGC.Infrastructure.BeyondTrust.BeyondTrustConfigurationProvider[0]
      [BT] Encontradas 1 variáveis com padrões ${}
info: SIPGC.Infrastructure.BeyondTrust.BeyondTrustVariableResolver[0]
      [BT-RESOLVER] Resolvendo 1 variáveis com padrões ${}
warn: SIPGC.Infrastructure.BeyondTrust.BeyondTrustService[0]
      [BT] Secret não encontrado: spgctr01_sqlserver
fail: SIPGC.Infrastructure.BeyondTrust.BeyondTrustVariableResolver[0]
      [BT-RESOLVER] Variável 'spgctr01_sqlserver' não encontrada no cofre para 'DB_PASSWORD_001'
info: SIPGC.Infrastructure.BeyondTrust.BeyondTrustVariableResolver[0]
      [BT-RESOLVER] Resolução concluída: 0/1 variáveis resolvidas
info: SIPGC.Infrastructure.BeyondTrust.BeyondTrustConfigurationProvider[0]
      [BT] Resolvidas 1 variáveis
info: SIPGC.Infrastructure.BeyondTrust.BeyondTrustConfigurationProvider[0]
      [BT] Configuração completa: 1 itens carregados
info: SIPGC.Infrastructure.BeyondTrust.BeyondTrustVariableResolver[0]
      [BT] BeyondTrust configurado com sucesso
info: Program[0]
      Service: Microsoft.Extensions.Hosting.IHostingEnvironment => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Hosting.IHostEnvironment => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Hosting.HostBuilderContext => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Configuration.IConfiguration => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Hosting.IApplicationLifetime => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Hosting.IHostApplicationLifetime => Microsoft.Extensions.Hosting.Internal.ApplicationLifetime (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Hosting.IHostLifetime => Microsoft.Extensions.Hosting.Internal.ConsoleLifetime (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Hosting.IHost => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IOptions`1 => Microsoft.Extensions.Options.UnnamedOptionsManager`1 (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IOptionsSnapshot`1 => Microsoft.Extensions.Options.OptionsManager`1 (Lifetime: Scoped)
info: Program[0]
      Service: Microsoft.Extensions.Options.IOptionsMonitor`1 => Microsoft.Extensions.Options.OptionsMonitor`1 (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IOptionsFactory`1 => Microsoft.Extensions.Options.OptionsFactory`1 (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.Extensions.Options.IOptionsMonitorCache`1 => Microsoft.Extensions.Options.OptionsCache`1 (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.Extensions.Hosting.HostOptions, Microsoft.Extensions.Hosting, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Logging.ILoggerFactory => Microsoft.Extensions.Logging.LoggerFactory (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Logging.ILogger`1 => Microsoft.Extensions.Logging.Logger`1 (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.Extensions.Logging.LoggerFilterOptions, Microsoft.Extensions.Logging, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Singleton)
info: Program[0]
      Service: System.Diagnostics.Metrics.IMeterFactory => Microsoft.Extensions.Diagnostics.Metrics.DefaultMeterFactory (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Diagnostics.Metrics.MetricsSubscriptionManager => Microsoft.Extensions.Diagnostics.Metrics.MetricsSubscriptionManager (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IStartupValidator => Microsoft.Extensions.Options.StartupValidator (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.Extensions.Options.StartupValidatorOptions, Microsoft.Extensions.Options, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.Extensions.DependencyInjection.MetricsServiceExtensions+NoOpOptions, Microsoft.Extensions.Diagnostics, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.Extensions.DependencyInjection.MetricsServiceExtensions+SubscriptionActivator (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Diagnostics.Metrics.Configuration.IMetricListenerConfigurationFactory => Microsoft.Extensions.Diagnostics.Metrics.Configuration.MetricListenerConfigurationFactory (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Logging.Configuration.ILoggerProviderConfigurationFactory => Microsoft.Extensions.Logging.Configuration.LoggerProviderConfigurationFactory (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Logging.Configuration.ILoggerProviderConfiguration`1 => Microsoft.Extensions.Logging.Configuration.LoggerProviderConfiguration`1 (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.Extensions.Logging.LoggerFilterOptions, Microsoft.Extensions.Logging, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IOptionsChangeTokenSource`1[[Microsoft.Extensions.Logging.LoggerFilterOptions, Microsoft.Extensions.Logging, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Logging.Configuration.LoggingConfiguration => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Logging.Console.ConsoleFormatter => Microsoft.Extensions.Logging.Console.JsonConsoleFormatter (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.Extensions.Logging.Console.JsonConsoleFormatterOptions, Microsoft.Extensions.Logging.Console, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.Extensions.Logging.ConsoleFormatterConfigureOptions (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IOptionsChangeTokenSource`1[[Microsoft.Extensions.Logging.Console.JsonConsoleFormatterOptions, Microsoft.Extensions.Logging.Console, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.Extensions.Logging.ConsoleLoggerFormatterOptionsChangeTokenSource`2[[Microsoft.Extensions.Logging.Console.JsonConsoleFormatter, Microsoft.Extensions.Logging.Console, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60],[Microsoft.Extensions.Logging.Console.JsonConsoleFormatterOptions, Microsoft.Extensions.Logging.Console, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Logging.Console.ConsoleFormatter => Microsoft.Extensions.Logging.Console.SystemdConsoleFormatter (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.Extensions.Logging.Console.ConsoleFormatterOptions, Microsoft.Extensions.Logging.Console, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.Extensions.Logging.ConsoleFormatterConfigureOptions (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IOptionsChangeTokenSource`1[[Microsoft.Extensions.Logging.Console.ConsoleFormatterOptions, Microsoft.Extensions.Logging.Console, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.Extensions.Logging.ConsoleLoggerFormatterOptionsChangeTokenSource`2[[Microsoft.Extensions.Logging.Console.SystemdConsoleFormatter, Microsoft.Extensions.Logging.Console, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60],[Microsoft.Extensions.Logging.Console.ConsoleFormatterOptions, Microsoft.Extensions.Logging.Console, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Logging.Console.ConsoleFormatter => Microsoft.Extensions.Logging.Console.SimpleConsoleFormatter (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.Extensions.Logging.Console.SimpleConsoleFormatterOptions, Microsoft.Extensions.Logging.Console, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.Extensions.Logging.ConsoleFormatterConfigureOptions (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IOptionsChangeTokenSource`1[[Microsoft.Extensions.Logging.Console.SimpleConsoleFormatterOptions, Microsoft.Extensions.Logging.Console, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.Extensions.Logging.ConsoleLoggerFormatterOptionsChangeTokenSource`2[[Microsoft.Extensions.Logging.Console.SimpleConsoleFormatter, Microsoft.Extensions.Logging.Console, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60],[Microsoft.Extensions.Logging.Console.SimpleConsoleFormatterOptions, Microsoft.Extensions.Logging.Console, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.Extensions.Logging.Console.ConsoleLoggerOptions, Microsoft.Extensions.Logging.Console, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.Extensions.Logging.ConsoleLoggerConfigureOptions (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IOptionsChangeTokenSource`1[[Microsoft.Extensions.Logging.Console.ConsoleLoggerOptions, Microsoft.Extensions.Logging.Console, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.Extensions.Logging.Configuration.LoggerProviderOptionsChangeTokenSource`2[[Microsoft.Extensions.Logging.Console.ConsoleLoggerOptions, Microsoft.Extensions.Logging.Console, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60],[Microsoft.Extensions.Logging.Console.ConsoleLoggerProvider, Microsoft.Extensions.Logging.Console, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Logging.EventSource.LoggingEventSource => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.Extensions.Logging.LoggerFilterOptions, Microsoft.Extensions.Logging, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.Extensions.Logging.EventLogFiltersConfigureOptions (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IOptionsChangeTokenSource`1[[Microsoft.Extensions.Logging.LoggerFilterOptions, Microsoft.Extensions.Logging, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.Extensions.Logging.EventLogFiltersConfigureOptionsChangeSource (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.Extensions.Logging.LoggerFactoryOptions, Microsoft.Extensions.Logging, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IStartupValidator => Microsoft.Extensions.Options.StartupValidator (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.Extensions.Options.StartupValidatorOptions, Microsoft.Extensions.Options, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.Extensions.Diagnostics.Metrics.MetricsOptions, Microsoft.Extensions.Diagnostics.Abstractions, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IOptionsChangeTokenSource`1[[Microsoft.Extensions.Diagnostics.Metrics.MetricsOptions, Microsoft.Extensions.Diagnostics.Abstractions, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Diagnostics.Metrics.Configuration.MetricsConfiguration => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Hosting.IWebHostEnvironment => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Hosting.IHostingEnvironment => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Hosting.IApplicationLifetime => Microsoft.AspNetCore.Hosting.GenericWebHostApplicationLifetime (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.AspNetCore.Hosting.GenericWebHostServiceOptions, Microsoft.AspNetCore.Hosting, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Singleton)
info: Program[0]
      Service: System.Diagnostics.DiagnosticListener => (null) (Lifetime: Singleton)
info: Program[0]
      Service: System.Diagnostics.DiagnosticSource => (null) (Lifetime: Singleton)
info: Program[0]
      Service: System.Diagnostics.ActivitySource => (null) (Lifetime: Singleton)
info: Program[0]
      Service: System.Diagnostics.DistributedContextPropagator => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Http.IHttpContextFactory => Microsoft.AspNetCore.Http.DefaultHttpContextFactory (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Http.IMiddlewareFactory => Microsoft.AspNetCore.Http.MiddlewareFactory (Lifetime: Scoped)
info: Program[0]
      Service: Microsoft.AspNetCore.Hosting.Builder.IApplicationBuilderFactory => Microsoft.AspNetCore.Hosting.Builder.ApplicationBuilderFactory (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IStartupValidator => Microsoft.Extensions.Options.StartupValidator (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.Extensions.Options.StartupValidatorOptions, Microsoft.Extensions.Options, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Hosting.HostingMetrics => Microsoft.AspNetCore.Hosting.HostingMetrics (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Connections.IConnectionListenerFactory => Microsoft.AspNetCore.Server.Kestrel.Transport.Sockets.SocketTransportFactory (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.AspNetCore.Server.Kestrel.Core.KestrelServerOptions, Microsoft.AspNetCore.Server.Kestrel.Core, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.AspNetCore.Server.Kestrel.Core.Internal.KestrelServerOptionsSetup (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Server.Kestrel.Core.IHttpsConfigurationService => Microsoft.AspNetCore.Server.Kestrel.Core.HttpsConfigurationService (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Hosting.Server.IServer => Microsoft.AspNetCore.Server.Kestrel.Core.KestrelServerImpl (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Server.Kestrel.Core.Internal.Infrastructure.KestrelMetrics => Microsoft.AspNetCore.Server.Kestrel.Core.Internal.Infrastructure.KestrelMetrics (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Server.Kestrel.Core.HttpsConfigurationService+IInitializer => Microsoft.AspNetCore.Server.Kestrel.Core.HttpsConfigurationService+Initializer (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.AspNetCore.Server.Kestrel.Transport.Quic.QuicTransportOptions, Microsoft.AspNetCore.Server.Kestrel.Transport.Quic, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.AspNetCore.Server.Kestrel.Core.KestrelServerOptions, Microsoft.AspNetCore.Server.Kestrel.Core, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IPostConfigureOptions`1[[Microsoft.AspNetCore.HostFiltering.HostFilteringOptions, Microsoft.AspNetCore.HostFiltering, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IOptionsChangeTokenSource`1[[Microsoft.AspNetCore.HostFiltering.HostFilteringOptions, Microsoft.AspNetCore.HostFiltering, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Hosting.IStartupFilter => Microsoft.AspNetCore.HostFilteringStartupFilter (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Hosting.IStartupFilter => Microsoft.AspNetCore.ForwardedHeadersStartupFilter (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.AspNetCore.Builder.ForwardedHeadersOptions, Microsoft.AspNetCore.HttpOverrides, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.AspNetCore.ForwardedHeadersOptionsSetup (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.Extensions.Options.IStartupValidator => Microsoft.Extensions.Options.StartupValidator (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.Extensions.Options.StartupValidatorOptions, Microsoft.Extensions.Options, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Routing.IInlineConstraintResolver => Microsoft.AspNetCore.Routing.DefaultInlineConstraintResolver (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.Extensions.ObjectPool.ObjectPoolProvider => Microsoft.Extensions.ObjectPool.DefaultObjectPoolProvider (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.Extensions.ObjectPool.ObjectPool`1[[Microsoft.AspNetCore.Routing.UriBuildingContext, Microsoft.AspNetCore.Routing, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Routing.Tree.TreeRouteBuilder => (null) (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Routing.RoutingMarkerService => Microsoft.AspNetCore.Routing.RoutingMarkerService (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.AspNetCore.Routing.RouteOptions, Microsoft.AspNetCore.Routing, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Routing.EndpointDataSource => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Routing.ParameterPolicyFactory => Microsoft.AspNetCore.Routing.DefaultParameterPolicyFactory (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Routing.Matching.MatcherFactory => Microsoft.AspNetCore.Routing.Matching.DfaMatcherFactory (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Routing.Matching.DfaMatcherBuilder => Microsoft.AspNetCore.Routing.Matching.DfaMatcherBuilder (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Routing.Internal.DfaGraphWriter => Microsoft.AspNetCore.Routing.Internal.DfaGraphWriter (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Routing.Matching.DataSourceDependentMatcher+Lifetime => Microsoft.AspNetCore.Routing.Matching.DataSourceDependentMatcher+Lifetime (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Routing.Matching.EndpointMetadataComparer => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Routing.LinkGenerator => Microsoft.AspNetCore.Routing.DefaultLinkGenerator (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Routing.IEndpointAddressScheme`1[[System.String, System.Private.CoreLib, Version=8.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e]] => Microsoft.AspNetCore.Routing.EndpointNameAddressScheme (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Routing.IEndpointAddressScheme`1[[Microsoft.AspNetCore.Routing.RouteValuesAddress, Microsoft.AspNetCore.Routing, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.AspNetCore.Routing.RouteValuesAddressScheme (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Routing.LinkParser => Microsoft.AspNetCore.Routing.DefaultLinkParser (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Routing.Matching.EndpointSelector => Microsoft.AspNetCore.Routing.Matching.DefaultEndpointSelector (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Routing.MatcherPolicy => Microsoft.AspNetCore.Routing.Matching.HttpMethodMatcherPolicy (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Routing.MatcherPolicy => Microsoft.AspNetCore.Routing.Matching.HostMatcherPolicy (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Routing.MatcherPolicy => Microsoft.AspNetCore.Routing.Matching.AcceptsMatcherPolicy (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Routing.Template.TemplateBinderFactory => Microsoft.AspNetCore.Routing.Template.DefaultTemplateBinderFactory (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Routing.Patterns.RoutePatternTransformer => Microsoft.AspNetCore.Routing.Patterns.DefaultRoutePatternTransformer (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Routing.RoutingMetrics => Microsoft.AspNetCore.Routing.RoutingMetrics (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.AspNetCore.Routing.RouteHandlerOptions, Microsoft.AspNetCore.Routing, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.AspNetCore.Routing.ConfigureRouteHandlerOptions (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.AspNetCore.Routing.RouteOptions, Microsoft.AspNetCore.Routing, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.Extensions.DependencyInjection.RegexInlineRouteConstraintSetup (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.AspNetCore.Hosting.GenericWebHostServiceOptions, Microsoft.AspNetCore.Hosting, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Singleton)
info: Program[0]
      Service: SIPGC.Infrastructure.BeyondTrust.BeyondTrustService => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Diagnostics.HealthChecks.HealthCheckService => Microsoft.Extensions.Diagnostics.HealthChecks.DefaultHealthCheckService (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Hosting.IHostedService => Microsoft.Extensions.Diagnostics.HealthChecks.HealthCheckPublisherHostedService (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.Extensions.Diagnostics.HealthChecks.HealthCheckServiceOptions, Microsoft.Extensions.Diagnostics.HealthChecks, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.EntityFrameworkCore.Infrastructure.ServiceProviderAccessor => Microsoft.EntityFrameworkCore.Infrastructure.ServiceProviderAccessor (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.EntityFrameworkCore.DbContextOptions`1[[BaseMVVM.Data.SharedDbContextAdapter, Api.SIPGC-3, Version=1.3.0.21, Culture=neutral, PublicKeyToken=null]] => (null) (Lifetime: Scoped)
info: Program[0]
      Service: Microsoft.EntityFrameworkCore.DbContextOptions => (null) (Lifetime: Scoped)
info: Program[0]
      Service: BaseMVVM.Data.SharedDbContextAdapter => BaseMVVM.Data.SharedDbContextAdapter (Lifetime: Scoped)
info: Program[0]
      Service: Microsoft.EntityFrameworkCore.DbContext => (null) (Lifetime: Scoped)
info: Program[0]
      Service: Microsoft.AspNetCore.Cors.Infrastructure.ICorsService => Microsoft.AspNetCore.Cors.Infrastructure.CorsService (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Cors.Infrastructure.ICorsPolicyProvider => Microsoft.AspNetCore.Cors.Infrastructure.DefaultCorsPolicyProvider (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.AspNetCore.Cors.Infrastructure.CorsOptions, Microsoft.AspNetCore.Cors, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Logging.ILoggerProvider => Microsoft.Extensions.Logging.Console.ConsoleLoggerProvider (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Logging.ILoggerProvider => Microsoft.Extensions.Logging.Debug.DebugLoggerProvider (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Authentication.IAuthenticationService => Microsoft.AspNetCore.Authentication.AuthenticationService (Lifetime: Scoped)
info: Program[0]
      Service: Microsoft.AspNetCore.Authentication.IClaimsTransformation => Microsoft.AspNetCore.Authentication.NoopClaimsTransformation (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Authentication.IAuthenticationHandlerProvider => Microsoft.AspNetCore.Authentication.AuthenticationHandlerProvider (Lifetime: Scoped)
info: Program[0]
      Service: Microsoft.AspNetCore.Authentication.IAuthenticationSchemeProvider => Microsoft.AspNetCore.Authentication.AuthenticationSchemeProvider (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.DataProtection.Internal.IActivator => Microsoft.AspNetCore.DataProtection.TypeForwardingActivator (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.AspNetCore.DataProtection.KeyManagement.KeyManagementOptions, Microsoft.AspNetCore.DataProtection, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.AspNetCore.DataProtection.Internal.KeyManagementOptionsSetup (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IPostConfigureOptions`1[[Microsoft.AspNetCore.DataProtection.KeyManagement.KeyManagementOptions, Microsoft.AspNetCore.DataProtection, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.AspNetCore.DataProtection.Internal.KeyManagementOptionsPostSetup (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.AspNetCore.DataProtection.DataProtectionOptions, Microsoft.AspNetCore.DataProtection, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.AspNetCore.DataProtection.Internal.DataProtectionOptionsSetup (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.DataProtection.KeyManagement.IKeyManager => Microsoft.AspNetCore.DataProtection.KeyManagement.XmlKeyManager (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.DataProtection.Infrastructure.IApplicationDiscriminator => Microsoft.AspNetCore.DataProtection.Internal.HostingApplicationDiscriminator (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Hosting.IHostedService => Microsoft.AspNetCore.DataProtection.Internal.DataProtectionHostedService (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.DataProtection.KeyManagement.Internal.IDefaultKeyResolver => Microsoft.AspNetCore.DataProtection.KeyManagement.DefaultKeyResolver (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.DataProtection.KeyManagement.Internal.IKeyRingProvider => Microsoft.AspNetCore.DataProtection.KeyManagement.KeyRingProvider (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.DataProtection.IDataProtectionProvider => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.DataProtection.XmlEncryption.ICertificateResolver => Microsoft.AspNetCore.DataProtection.XmlEncryption.CertificateResolver (Lifetime: Singleton)
info: Program[0]
      Service: System.Text.Encodings.Web.HtmlEncoder => (null) (Lifetime: Singleton)
info: Program[0]
      Service: System.Text.Encodings.Web.JavaScriptEncoder => (null) (Lifetime: Singleton)
info: Program[0]
      Service: System.Text.Encodings.Web.UrlEncoder => (null) (Lifetime: Singleton)
info: Program[0]
      Service: System.TimeProvider => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Authentication.ISystemClock => Microsoft.AspNetCore.Authentication.SystemClock (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Authentication.IAuthenticationConfigurationProvider => Microsoft.AspNetCore.Authentication.DefaultAuthenticationConfigurationProvider (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.AspNetCore.Authentication.AuthenticationOptions, Microsoft.AspNetCore.Authentication.Abstractions, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.AspNetCore.Authentication.JwtBearer.JwtBearerOptions, Microsoft.AspNetCore.Authentication.JwtBearer, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.AspNetCore.Authentication.JwtBearerConfigureOptions (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IPostConfigureOptions`1[[Microsoft.AspNetCore.Authentication.JwtBearer.JwtBearerOptions, Microsoft.AspNetCore.Authentication.JwtBearer, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.AspNetCore.Authentication.JwtBearer.JwtBearerPostConfigureOptions (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.AspNetCore.Authentication.AuthenticationOptions, Microsoft.AspNetCore.Authentication.Abstractions, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.AspNetCore.Authentication.JwtBearer.JwtBearerOptions, Microsoft.AspNetCore.Authentication.JwtBearer, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IValidateOptions`1[[Microsoft.AspNetCore.Authentication.JwtBearer.JwtBearerOptions, Microsoft.AspNetCore.Authentication.JwtBearer, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Authentication.JwtBearer.JwtBearerHandler => Microsoft.AspNetCore.Authentication.JwtBearer.JwtBearerHandler (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.Extensions.Options.IPostConfigureOptions`1[[Microsoft.AspNetCore.Authentication.JwtBearer.JwtBearerOptions, Microsoft.AspNetCore.Authentication.JwtBearer, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.AspNetCore.Authentication.AuthenticationBuilder+PostConfigureAuthenticationSchemeOptions`1[[Microsoft.AspNetCore.Authentication.JwtBearer.JwtBearerOptions, Microsoft.AspNetCore.Authentication.JwtBearer, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Identity.Web.IMergedOptionsStore => Microsoft.Identity.Web.MergedOptionsStore (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Http.IHttpContextAccessor => Microsoft.AspNetCore.Http.HttpContextAccessor (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IStartupValidator => Microsoft.Extensions.Options.StartupValidator (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.Extensions.Options.StartupValidatorOptions, Microsoft.Extensions.Options, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.Extensions.Http.HttpMessageHandlerBuilder => Microsoft.Extensions.Http.DefaultHttpMessageHandlerBuilder (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.Extensions.Http.DefaultHttpClientFactory => Microsoft.Extensions.Http.DefaultHttpClientFactory (Lifetime: Singleton)
info: Program[0]
      Service: System.Net.Http.IHttpClientFactory => (null) (Lifetime: Singleton)
info: Program[0]
      Service: System.Net.Http.IHttpMessageHandlerFactory => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Http.ITypedHttpClientFactory`1 => Microsoft.Extensions.Http.DefaultTypedHttpClientFactory`1 (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.Extensions.Http.DefaultTypedHttpClientFactory`1+Cache => Microsoft.Extensions.Http.DefaultTypedHttpClientFactory`1+Cache (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Http.IHttpMessageHandlerBuilderFilter => Microsoft.Extensions.Http.LoggingHttpMessageHandlerBuilderFilter (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Http.IHttpMessageHandlerBuilderFilter => Microsoft.Extensions.Http.MetricsFactoryHttpMessageHandlerFilter (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.DependencyInjection.HttpClientMappingRegistry => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.DependencyInjection.DefaultHttpClientConfigurationTracker => (null) (Lifetime: Singleton)
info: Program[0]
      Service: System.Net.Http.HttpClient => (null) (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.Identity.Web.Resource.MicrosoftIdentityIssuerValidatorFactory => Microsoft.Identity.Web.Resource.MicrosoftIdentityIssuerValidatorFactory (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Authorization.IAuthorizationService => Microsoft.AspNetCore.Authorization.DefaultAuthorizationService (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Authorization.IAuthorizationPolicyProvider => Microsoft.AspNetCore.Authorization.DefaultAuthorizationPolicyProvider (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Authorization.IAuthorizationHandlerProvider => Microsoft.AspNetCore.Authorization.DefaultAuthorizationHandlerProvider (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Authorization.IAuthorizationEvaluator => Microsoft.AspNetCore.Authorization.DefaultAuthorizationEvaluator (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Authorization.IAuthorizationHandlerContextFactory => Microsoft.AspNetCore.Authorization.DefaultAuthorizationHandlerContextFactory (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Authorization.IAuthorizationHandler => Microsoft.AspNetCore.Authorization.Infrastructure.PassThroughAuthorizationHandler (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Authorization.Policy.AuthorizationPolicyMarkerService => Microsoft.AspNetCore.Authorization.Policy.AuthorizationPolicyMarkerService (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Authorization.Policy.IPolicyEvaluator => Microsoft.AspNetCore.Authorization.Policy.PolicyEvaluator (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Authorization.IAuthorizationMiddlewareResultHandler => Microsoft.AspNetCore.Authorization.Policy.AuthorizationMiddlewareResultHandler (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Authorization.Policy.AuthorizationPolicyCache => Microsoft.AspNetCore.Authorization.Policy.AuthorizationPolicyCache (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IPostConfigureOptions`1[[Microsoft.AspNetCore.Authorization.AuthorizationOptions, Microsoft.AspNetCore.Authorization, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.Identity.Web.RequireScopeOptions (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Authorization.IAuthorizationHandler => Microsoft.Identity.Web.ScopeAuthorizationHandler (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IPostConfigureOptions`1[[Microsoft.AspNetCore.Authorization.AuthorizationOptions, Microsoft.AspNetCore.Authorization, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.Identity.Web.RequireScopeOrAppPermissionOptions (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Authorization.IAuthorizationHandler => Microsoft.Identity.Web.ScopeOrAppPermissionAuthorizationHandler (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IPostConfigureOptions`1[[Microsoft.Identity.Web.MicrosoftIdentityOptions, Microsoft.Identity.Web.TokenAcquisition, Version=3.15.1.0, Culture=neutral, PublicKeyToken=0a613f4dd989e8ae]] => Microsoft.Identity.Web.MicrosoftIdentityOptionsMerger (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.AspNetCore.Authentication.JwtBearer.JwtBearerOptions, Microsoft.AspNetCore.Authentication.JwtBearer, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.Identity.Web.MicrosoftIdentityOptions, Microsoft.Identity.Web.TokenAcquisition, Version=3.15.1.0, Culture=neutral, PublicKeyToken=0a613f4dd989e8ae]] => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Authentication.IClaimsTransformation => Shared.DataModel.Security.Authorization.RoleClaimTransformer (Lifetime: Transient)
info: Program[0]
      Service: Shared.DataModel.Security.Context.ICurrentUser => Shared.DataModel.Security.Context.CurrentUser (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.Security.Http.TokenForwardingHandler => Shared.DataModel.Security.Http.TokenForwardingHandler (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Authorization.IAuthorizationHandler => Shared.DataModel.Security.Authorization.LeituraAnonimaHandler (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.AspNetCore.Authorization.AuthorizationOptions, Microsoft.AspNetCore.Authorization, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.EntityFrameworkCore.DbContextOptions`1[[Shared.DataModel.Base.DataBaseSqlServerConnection, Shared.DataModel, Version=2.1.0.132, Culture=neutral, PublicKeyToken=null]] => (null) (Lifetime: Scoped)
info: Program[0]
      Service: Microsoft.EntityFrameworkCore.DbContextOptions => (null) (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.Base.DataBaseSqlServerConnection => Shared.DataModel.Base.DataBaseSqlServerConnection (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.Base.IDataBaseConnection => (null) (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.TipoAgrupamento.DataSource.ITipoAgrupamentoDBDataSource => Shared.DataModel.TipoAgrupamento.DataSource.TipoAgrupamentoDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.TipoAgrupamento.Repository.ITipoAgrupamentoRepository => Shared.DataModel.TipoAgrupamento.Repository.TipoAgrupamentoRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.DataSource.IAgrupamentoDBDataSource => Shared.DataModel.DataSource.AgrupamentoDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.Repository.IAgrupamentoRepository => Shared.DataModel.Repository.AgrupamentoRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.Membro.DataSource.IMembroDBDataSource => Shared.DataModel.Membro.DataSource.MembroDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.Membro.Repository.IMembroRepository => BaseMVVM.Data.Membro.Repository.MembroRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.Papel.DataSource.IPapelDBDataSource => Shared.DataModel.Papel.DataSource.PapelDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.Papel.Repository.IPapelRepository => Shared.DataModel.Papel.Repository.PapelRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.Parametrizacao.DataSource.IParametrizacaoDBDataSource => Shared.DataModel.Parametrizacao.DataSource.ParametrizacaoDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.Parametrizacao.Repository.IParametrizacaoRepository => Shared.DataModel.Parametrizacao.Repository.ParametrizacaoRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.RelAgrupamento.DataSource.IRelAgrupamentoDBDataSource => Shared.DataModel.RelAgrupamento.DataSource.RelAgrupamentoDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: IRelAgrupamentoRepository => Shared.DataModel.RelAgrupamento.Repository.RelAgrupamentoRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.Squad.DataSource.ISquadDBDataSource => Shared.DataModel.Squad.DataSource.SquadDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.Squad.Repository.ISquadRepository => BaseMVVM.Data.Squad.Repository.SquadRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.MembroSquad.DataSource.IMembroSquadDBDataSource => Shared.DataModel.MembroSquad.DataSource.MembroSquadDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: IMembroSquadRepository => Shared.DataModel.MembroSquad.Repository.MembroSquadRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.TipoSquad.ITipoSuqadDBDataSource => Shared.DataModel.TipoSquad.TipoSuqadDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.TipoSquad.Repository.ITipoSquadRepository => Shared.DataModel.TipoSquad.Repository.TipoSquadRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.ParametrizacaoSquadPapel.DataSource.IParametrizacaoSquadPapelDBDataSource => Shared.DataModel.ParametrizacaoSquadPapel.DataSource.ParametrizacaoSquadPapelDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.ParametrizacaoSquadPapel.Repository.IParametrizacaoSquadPapelRepository => Shared.DataModel.ParametrizacaoSquadPapel.Repository.ParametrizacaoSquadPapelRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.TipoSistema.DataSource.ITipoSistemaDBDataSource => Shared.DataModel.TipoSistema.DataSource.TipoSistemaDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.TipoSistema.Repository.ITipoSistemaRepository => Shared.DataModel.TipoSistema.Repository.TipoSistemaRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.CriticidadeBia.DataSource.ICriticidadeBiaDBDataSource => Shared.DataModel.CriticidadeBia.DataSource.CriticidadeBiaDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.CriticidadeBia.Repository.ICriticidadeBiaRepository => Shared.DataModel.CriticidadeBia.Repository.CriticidadeBiaRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.Sistema.DataSource.ISistemaDBDataSource => Shared.DataModel.Sistema.DataSource.SistemaDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.Sistema.Repository.ISistemaRepository => Shared.DataModel.Sistema.Repository.SistemaRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.AplicacaoSistema.DataSource.IAplicacaoSistemaDBDataSource => Shared.DataModel.AplicacaoSistema.DataSource.AplicacaoSistemaDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.AplicacaoSistema.Repository.IAplicacaoSistemaRepository => Shared.DataModel.AplicacaoSistema.Repository.AplicacaoSistemaRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.TipoItemPortfolio.DataSource.ITipoItemPortfolioDBDataSource => Shared.DataModel.TipoItemPortfolio.DataSource.TipoItemPortfolioDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.TipoItemPortfolio.Repository.ITipoItemPortfolioRepository => Shared.DataModel.TipoItemPortfolio.Repository.TipoItemPortfolioRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.SquadItemPortfolio.DataSource.ISquadItemPortfolioDBDataSource => Shared.DataModel.SquadItemPortfolio.DataSource.SquadItemPortfolioDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.SquadItemPortfolio.Repository.ISquadItemPortfolioRepository => Shared.DataModel.SquadItemPortfolio.Repository.SquadItemPortfolioRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.EstadoItemPortfolio.DataSource.IEstadoItemPortfolioDBDataSource => Shared.DataModel.EstadoItemPortfolio.DataSource.EstadoItemPortfolioDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.EstadoItemPortfolio.Repository.IEstadoItemPortfolioRepository => Shared.DataModel.EstadoItemPortfolio.Repository.EstadoItemPortfolioRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.ItemPortfolio.DataSource.IItemPortfolioDBDataSource => Shared.DataModel.ItemPortfolio.DataSource.ItemPortfolioDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.ItemPortfolio.Repository.IItemPortfolioRepository => Shared.DataModel.ItemPortfolio.Repository.ItemPortfolioRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.SituacaoDocumentacaoItemPortfolio.DataSource.ISituacaoDocumentacaoItemPortfolioDBDataSource => Shared.DataModel.SituacaoDocumentacaoItemPortfolio.DataSource.SituacaoDocumentacaoItemPortfolioDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.SituacaoDocumentacaoItemPortfolio.Repository.ISituacaoDocumentacaoItemPortfolioRepository => Shared.DataModel.SituacaoDocumentacaoItemPortfolio.Repository.SituacaoDocumentacaoItemPortfolioRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.ClassificacaoInformacao.DataSource.IClassificacaoInformacaoDBDataSource => Shared.DataModel.ClassificacaoInformacao.DataSource.ClassificacaoInformacaoDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.ClassificacaoInformacao.Repository.IClassificacaoInformacaoRepository => Shared.DataModel.ClassificacaoInformacao.Repository.ClassificacaoInformacaoRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.Menu.DataSource.IMenuDBDataSource => Shared.DataModel.Menu.DataSource.MenuDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.Menu.Repository.IMenuRepository => Shared.DataModel.Menu.Repository.MenuRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.AcessoMenu.DataSource.IAcessoMenuDBDataSource => Shared.DataModel.AcessoMenu.DataSource.AcessoMenuDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.AcessoMenu.Repository.IAcessoMenuRepository => Shared.DataModel.AcessoMenu.Repository.AcessoMenuRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.GestorItemPortfolio.DataSource.IGestorItemPortfolioDBDataSource => Shared.DataModel.GestorItemPortfolio.DataSource.GestorItemPortfolioDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.Gestor.Repository.IGestorItemPortfolioRepository => Shared.DataModel.Gestor.Repository.GestorItemPortfolioRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.InformacaoPortfolio.DataSource.IInformacaoPortfolioDBDataSource => Shared.DataModel.InformacaoPortfolio.DataSource.InformacaoPortfolioDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.InformacaoPortfolio.Repository.IInformacaoPortfolioRepository => Shared.DataModel.InformacaoPortfolio.Repository.InformacaoPortfolioRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.TipoContrato.DataSource.ITipoContratoDBDataSource => Shared.DataModel.TipoContrato.DataSource.TipoContratoDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.TipoContrato.Repository.ITipoContratoRepository => Shared.DataModel.TipoContrato.Repository.TipoContratoRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.Contrato.DataSource.IContratoDBDataSource => Shared.DataModel.Contrato.DataSource.ContratoDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.Contrato.Repository.IContratoRepository => Shared.DataModel.Contrato.Repository.ContratoRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.ContratoItemPortfolio.DataSource.IContratoItemPortfolioDBDataSource => Shared.DataModel.ContratoItemPortfolio.DataSource.ContratoItemPortfolioDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.ContratoItemPortfolio.Repository.IContratoItemPortfolioRepository => Shared.DataModel.ContratoItemPortfolio.Repository.ContratoItemPortfolioRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.UnidadeProducaoItemPortfolio.DataSource.IUnidadeProducaoItemPortfolioDBDataSource => Shared.DataModel.UnidadeProducaoItemPortfolio.DataSource.UnidadeProducaoItemPortfolioDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.UnidadeProducaoItemPortfolio.Repository.IUnidadeProducaoItemPortfolioRepository => Shared.DataModel.UnidadeProducaoItemPortfolio.Repository.UnidadeProducaoItemPortfolioRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.TipoTecnologia.DataSource.ITipoTecnologiaDBDataSource => Shared.DataModel.TipoTecnologia.DataSource.TipoTecnologiaDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.TipoTecnologia.Repository.ITipoTecnologiaRepository => Shared.DataModel.TipoTecnologia.Repository.TipoTecnologiaRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.Tecnologia.DataSource.ITecnologiaDBDataSource => Shared.DataModel.Tecnologia.DataSource.TecnologiaDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.Tecnologia.Repository.ITecnologiaRepository => Shared.DataModel.Tecnologia.Repository.TecnologiaRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.CaracteristicaTecnica.DataSource.ICaracteristicaTecnicaDBDataSource => Shared.DataModel.CaracteristicaTecnica.DataSource.CaracteristicaTecnicaDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.CaracteristicaTecnica.Repository.ICaracteristicaTecnicaRepository => Shared.DataModel.CaracteristicaTecnica.Repository.CaracteristicaTecnicaRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.CaracteristicaTecnicaItemPortfolio.DataSource.ICaracteristicaTecnicaItemPortfolioDBDataSource => Shared.DataModel.CaracteristicaTecnicaItemPortfolio.DataSource.CaracteristicaTecnicaItemPortfolioDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.CaracteristicaTecnicaItemPortfolio.Repository.ICaracteristicaTecnicaItemPortfolioRepository => Shared.DataModel.CaracteristicaTecnicaItemPortfolio.Repository.CaracteristicaTecnicaItemPortfolioRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.NivelSobreaviso.DataSource.INivelSobreavisoDBDataSource => Shared.DataModel.NivelSobreaviso.DataSource.NivelSobreavisoDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.NivelSobreaviso.Repository.INivelSobreavisoRepository => Shared.DataModel.NivelSobreaviso.Repository.NivelSobreavisoRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.CicloSobreaviso.DataSource.ICicloSobreavisoDBDataSource => Shared.DataModel.CicloSobreaviso.DataSource.CicloSobreavisoDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.CicloSobreaviso.Repository.ICicloSobreavisoRepository => Shared.DataModel.CicloSobreaviso.Repository.CicloSobreavisoRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.RegraSobreaviso.DataSource.IRegraSobreavisoDBDataSource => Shared.DataModel.RegraSobreaviso.DataSource.RegraSobreavisoDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.RegraSobreaviso.Repository.IRegraSobreavisoRepository => Shared.DataModel.RegraSobreaviso.Repository.RegraSobreavisoRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.NucleoSobreaviso.DataSource.INucleoSobreavisoDBDataSource => Shared.DataModel.NucleoSobreaviso.DataSource.NucleoSobreavisoDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.NucleoSobreaviso.Repository.INucleoSobreavisoRepository => Shared.DataModel.NucleoSobreaviso.Repository.NucleoSobreavisoRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.EmpregadoNucleoSobreaviso.DataSource.IEmpregadoNucleoSobreavisoDBDataSource => Shared.DataModel.EmpregadoNucleoSobreaviso.DataSource.EmpregadoNucleoSobreavisoDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.EmpregadoNucleoSobreaviso.Repository.IEmpregadoNucleoSobreavisoRepository => Shared.DataModel.EmpregadoNucleoSobreaviso.Repository.EmpregadoNucleoSobreavisoRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.ResponsavelNucleoSobreaviso.DataSource.IResponsavelNucleoSobreavisoDBDataSource => Shared.DataModel.ResponsavelNucleoSobreaviso.DataSource.ResponsavelNucleoSobreavisoDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.ResponsavelNucleoSobreaviso.Repository.IResponsavelNucleoSobreavisoRepository => Shared.DataModel.ResponsavelNucleoSobreaviso.Repository.ResponsavelNucleoSobreavisoRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.RegistroSobreaviso.DataSource.IRegistroSobreavisoDBDataSource => Shared.DataModel.RegistroSobreaviso.DataSource.RegistroSobreavisoDBDataSource (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.RegistroSobreaviso.Repository.IRegistroSobreavisoRepository => Shared.DataModel.RegistroSobreaviso.Repository.RegistroSobreavisoRepository (Lifetime: Scoped)
info: Program[0]
      Service: Shared.DataModel.RelatorioSobreaviso.Repository.IRelatorioSobreavisoRepository => Shared.DataModel.RelatorioSobreaviso.Repository.RelatorioSobreavisoRepository (Lifetime: Scoped)
info: Program[0]
      Service: BaseMVVM.Domain.RelAgrupamento.UseCase.IRelAgrupamentoUseCase => BaseMVVM.Domain.RelAgrupamento.UseCase.RelAgrupamentoUseCase (Lifetime: Scoped)
info: Program[0]
      Service: BaseMVVM.Domain.Membro.UseCase.IMembroSquadUseCase => BaseMVVM.Domain.Membro.UseCase.MembroSquadUseCase (Lifetime: Scoped)
info: Program[0]
      Service: BaseMVVM.Domain.Squad.UseCase.ISquadUseCase => BaseMVVM.Domain.Squad.UseCase.SquadUseCase (Lifetime: Scoped)
info: Program[0]
      Service: BaseMVVM.Domain.TipoSquad.UseCase.ITipoSquadUseCase => BaseMVVM.Domain.TipoSquad.UseCase.TipoSquadUseCase (Lifetime: Scoped)
info: Program[0]
      Service: BaseMVVM.UI.Membro.ViewModel.IMembroViewModel => BaseMVVM.UI.Membro.ViewModel.MembroViewModel (Lifetime: Scoped)
info: Program[0]
      Service: Services.RelAgrupamento.IRelAgrupamentoService => Services.RelAgrupamento.RelAgrupamentoService (Lifetime: Scoped)
info: Program[0]
      Service: Services.ParametrizacaoPapel.IParametrizacaoPapelService => Services.ParametrizacaoPapel.ParametrizacaoPapelService (Lifetime: Scoped)
info: Program[0]
      Service: BaseMVVM.UI.RelAgrupamento.ViewModel.IRelAgrupamentoViewModel => BaseMVVM.UI.RelAgrupamento.ViewModel.RelAgrupamentoViewModel (Lifetime: Scoped)
info: Program[0]
      Service: BaseMVVM.UI.Squad.ViewModel.ISquadViewModel => BaseMVVM.UI.Squad.ViewModel.SquadViewModel (Lifetime: Scoped)
info: Program[0]
      Service: BaseMVVM.Domain.MembroSquad.Service.IMembroSquadService => Services.MembroSquad.MembroSquadService (Lifetime: Scoped)
info: Program[0]
      Service: BaseMVVM.UI.TipoSquad.ViewModel.ITipoSquandViewModel => BaseMVVM.UI.TipoSquad.ViewModel.TipoSquandViewModel (Lifetime: Scoped)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.ApplicationParts.ApplicationPartManager => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IStartupValidator => Microsoft.Extensions.Options.StartupValidator (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.Extensions.Options.StartupValidatorOptions, Microsoft.Extensions.Options, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.AspNetCore.Mvc.MvcOptions, Microsoft.AspNetCore.Mvc.Core, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.AspNetCore.Mvc.MvcCoreMvcOptionsSetup (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.Extensions.Options.IPostConfigureOptions`1[[Microsoft.AspNetCore.Mvc.MvcOptions, Microsoft.AspNetCore.Mvc.Core, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.AspNetCore.Mvc.MvcCoreMvcOptionsSetup (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.AspNetCore.Mvc.ApiBehaviorOptions, Microsoft.AspNetCore.Mvc.Core, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.Extensions.DependencyInjection.ApiBehaviorOptionsSetup (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.AspNetCore.Routing.RouteOptions, Microsoft.AspNetCore.Routing, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.Extensions.DependencyInjection.MvcCoreRouteOptionsSetup (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.ApplicationModels.ApplicationModelFactory => Microsoft.AspNetCore.Mvc.ApplicationModels.ApplicationModelFactory (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.ApplicationModels.IApplicationModelProvider => Microsoft.AspNetCore.Mvc.ApplicationModels.DefaultApplicationModelProvider (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.ApplicationModels.IApplicationModelProvider => Microsoft.AspNetCore.Mvc.ApplicationModels.ApiBehaviorApplicationModelProvider (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Abstractions.IActionDescriptorProvider => Microsoft.AspNetCore.Mvc.ApplicationModels.ControllerActionDescriptorProvider (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Infrastructure.IActionDescriptorCollectionProvider => Microsoft.AspNetCore.Mvc.Infrastructure.DefaultActionDescriptorCollectionProvider (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Infrastructure.IActionSelector => Microsoft.AspNetCore.Mvc.Infrastructure.ActionSelector (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.ActionConstraints.ActionConstraintCache => Microsoft.AspNetCore.Mvc.ActionConstraints.ActionConstraintCache (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.ActionConstraints.IActionConstraintProvider => Microsoft.AspNetCore.Mvc.ActionConstraints.DefaultActionConstraintProvider (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Routing.MatcherPolicy => Microsoft.AspNetCore.Mvc.Routing.ActionConstraintMatcherPolicy (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Controllers.IControllerFactory => Microsoft.AspNetCore.Mvc.Controllers.DefaultControllerFactory (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Controllers.IControllerActivator => Microsoft.AspNetCore.Mvc.Controllers.DefaultControllerActivator (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Controllers.IControllerFactoryProvider => Microsoft.AspNetCore.Mvc.Controllers.ControllerFactoryProvider (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Controllers.IControllerActivatorProvider => Microsoft.AspNetCore.Mvc.Controllers.ControllerActivatorProvider (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Controllers.IControllerPropertyActivator => Microsoft.AspNetCore.Mvc.Controllers.DefaultControllerPropertyActivator (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Infrastructure.IActionInvokerFactory => Microsoft.AspNetCore.Mvc.Infrastructure.ActionInvokerFactory (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Abstractions.IActionInvokerProvider => Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvokerProvider (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvokerCache => Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionInvokerCache (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Filters.IFilterProvider => Microsoft.AspNetCore.Mvc.Filters.DefaultFilterProvider (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Infrastructure.IActionResultTypeMapper => Microsoft.AspNetCore.Mvc.Infrastructure.ActionResultTypeMapper (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Filters.RequestSizeLimitFilter => Microsoft.AspNetCore.Mvc.Filters.RequestSizeLimitFilter (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Filters.DisableRequestSizeLimitFilter => Microsoft.AspNetCore.Mvc.Filters.DisableRequestSizeLimitFilter (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Filters.RequestFormLimitsFilter => Microsoft.AspNetCore.Mvc.Filters.RequestFormLimitsFilter (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.ModelBinding.IModelMetadataProvider => Microsoft.AspNetCore.Mvc.ModelBinding.Metadata.DefaultModelMetadataProvider (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.ModelBinding.Metadata.ICompositeMetadataDetailsProvider => (null) (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.ModelBinding.IModelBinderFactory => Microsoft.AspNetCore.Mvc.ModelBinding.ModelBinderFactory (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.ModelBinding.Validation.IObjectModelValidator => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.ModelBinding.Validation.ClientValidatorCache => Microsoft.AspNetCore.Mvc.ModelBinding.Validation.ClientValidatorCache (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.ModelBinding.ParameterBinder => Microsoft.AspNetCore.Mvc.ModelBinding.ParameterBinder (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.DependencyInjection.MvcMarkerService => Microsoft.Extensions.DependencyInjection.MvcMarkerService (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Infrastructure.ITypeActivatorCache => Microsoft.AspNetCore.Mvc.Infrastructure.TypeActivatorCache (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Routing.IUrlHelperFactory => Microsoft.AspNetCore.Mvc.Routing.UrlHelperFactory (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Infrastructure.IHttpRequestStreamReaderFactory => Microsoft.AspNetCore.Mvc.Infrastructure.MemoryPoolHttpRequestStreamReaderFactory (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Infrastructure.IHttpResponseStreamWriterFactory => Microsoft.AspNetCore.Mvc.Infrastructure.MemoryPoolHttpResponseStreamWriterFactory (Lifetime: Singleton)
info: Program[0]
      Service: System.Buffers.ArrayPool`1[[System.Byte, System.Private.CoreLib, Version=8.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e]] => (null) (Lifetime: Singleton)
info: Program[0]
      Service: System.Buffers.ArrayPool`1[[System.Char, System.Private.CoreLib, Version=8.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e]] => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Infrastructure.OutputFormatterSelector => Microsoft.AspNetCore.Mvc.Infrastructure.DefaultOutputFormatterSelector (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Infrastructure.IActionResultExecutor`1[[Microsoft.AspNetCore.Mvc.ObjectResult, Microsoft.AspNetCore.Mvc.Core, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.AspNetCore.Mvc.Infrastructure.ObjectResultExecutor (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Infrastructure.IActionResultExecutor`1[[Microsoft.AspNetCore.Mvc.PhysicalFileResult, Microsoft.AspNetCore.Mvc.Core, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.AspNetCore.Mvc.Infrastructure.PhysicalFileResultExecutor (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Infrastructure.IActionResultExecutor`1[[Microsoft.AspNetCore.Mvc.VirtualFileResult, Microsoft.AspNetCore.Mvc.Core, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.AspNetCore.Mvc.Infrastructure.VirtualFileResultExecutor (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Infrastructure.IActionResultExecutor`1[[Microsoft.AspNetCore.Mvc.FileStreamResult, Microsoft.AspNetCore.Mvc.Core, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.AspNetCore.Mvc.Infrastructure.FileStreamResultExecutor (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Infrastructure.IActionResultExecutor`1[[Microsoft.AspNetCore.Mvc.FileContentResult, Microsoft.AspNetCore.Mvc.Core, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.AspNetCore.Mvc.Infrastructure.FileContentResultExecutor (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Infrastructure.IActionResultExecutor`1[[Microsoft.AspNetCore.Mvc.RedirectResult, Microsoft.AspNetCore.Mvc.Core, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.AspNetCore.Mvc.Infrastructure.RedirectResultExecutor (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Infrastructure.IActionResultExecutor`1[[Microsoft.AspNetCore.Mvc.LocalRedirectResult, Microsoft.AspNetCore.Mvc.Core, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.AspNetCore.Mvc.Infrastructure.LocalRedirectResultExecutor (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Infrastructure.IActionResultExecutor`1[[Microsoft.AspNetCore.Mvc.RedirectToActionResult, Microsoft.AspNetCore.Mvc.Core, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.AspNetCore.Mvc.Infrastructure.RedirectToActionResultExecutor (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Infrastructure.IActionResultExecutor`1[[Microsoft.AspNetCore.Mvc.RedirectToRouteResult, Microsoft.AspNetCore.Mvc.Core, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.AspNetCore.Mvc.Infrastructure.RedirectToRouteResultExecutor (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Infrastructure.IActionResultExecutor`1[[Microsoft.AspNetCore.Mvc.RedirectToPageResult, Microsoft.AspNetCore.Mvc.Core, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.AspNetCore.Mvc.Infrastructure.RedirectToPageResultExecutor (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Infrastructure.IActionResultExecutor`1[[Microsoft.AspNetCore.Mvc.ContentResult, Microsoft.AspNetCore.Mvc.Core, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.AspNetCore.Mvc.Infrastructure.ContentResultExecutor (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Infrastructure.IActionResultExecutor`1[[Microsoft.AspNetCore.Mvc.JsonResult, Microsoft.AspNetCore.Mvc.Core, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.AspNetCore.Mvc.Infrastructure.SystemTextJsonResultExecutor (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Infrastructure.IClientErrorFactory => Microsoft.AspNetCore.Mvc.Infrastructure.ProblemDetailsClientErrorFactory (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Routing.MvcRouteHandler => Microsoft.AspNetCore.Mvc.Routing.MvcRouteHandler (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Routing.MvcAttributeRouteHandler => Microsoft.AspNetCore.Mvc.Routing.MvcAttributeRouteHandler (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionEndpointDataSourceFactory => Microsoft.AspNetCore.Mvc.Infrastructure.ControllerActionEndpointDataSourceFactory (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Infrastructure.OrderedEndpointsSequenceProviderCache => Microsoft.AspNetCore.Mvc.Infrastructure.OrderedEndpointsSequenceProviderCache (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Routing.ControllerActionEndpointDataSourceIdProvider => Microsoft.AspNetCore.Mvc.Routing.ControllerActionEndpointDataSourceIdProvider (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Routing.ActionEndpointFactory => Microsoft.AspNetCore.Mvc.Routing.ActionEndpointFactory (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Routing.DynamicControllerEndpointSelectorCache => Microsoft.AspNetCore.Mvc.Routing.DynamicControllerEndpointSelectorCache (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Routing.MatcherPolicy => Microsoft.AspNetCore.Mvc.Routing.DynamicControllerEndpointMatcherPolicy (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Routing.IRequestDelegateFactory => Microsoft.AspNetCore.Mvc.Routing.ControllerRequestDelegateFactory (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Filters.MiddlewareFilterConfigurationProvider => Microsoft.AspNetCore.Mvc.Filters.MiddlewareFilterConfigurationProvider (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Filters.MiddlewareFilterBuilder => Microsoft.AspNetCore.Mvc.Filters.MiddlewareFilterBuilder (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Hosting.IStartupFilter => Microsoft.AspNetCore.Mvc.Filters.MiddlewareFilterBuilderStartupFilter (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Infrastructure.ProblemDetailsFactory => Microsoft.AspNetCore.Mvc.Infrastructure.DefaultProblemDetailsFactory (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Http.IProblemDetailsWriter => Microsoft.AspNetCore.Mvc.Infrastructure.DefaultApiProblemDetailsWriter (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.ApiExplorer.IApiDescriptionGroupCollectionProvider => Microsoft.AspNetCore.Mvc.ApiExplorer.ApiDescriptionGroupCollectionProvider (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.ApiExplorer.IApiDescriptionProvider => Microsoft.AspNetCore.Mvc.ApiExplorer.DefaultApiDescriptionProvider (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.ApplicationModels.IApplicationModelProvider => Microsoft.AspNetCore.Mvc.ApplicationModels.AuthorizationApplicationModelProvider (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.ApplicationModels.IApplicationModelProvider => Microsoft.AspNetCore.Mvc.Cors.CorsApplicationModelProvider (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Cors.CorsAuthorizationFilter => Microsoft.AspNetCore.Mvc.Cors.CorsAuthorizationFilter (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.AspNetCore.Mvc.MvcOptions, Microsoft.AspNetCore.Mvc.Core, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => Microsoft.Extensions.DependencyInjection.MvcDataAnnotationsMvcOptionsSetup (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.DataAnnotations.IValidationAttributeAdapterProvider => Microsoft.AspNetCore.Mvc.DataAnnotations.ValidationAttributeAdapterProvider (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.Formatters.FormatFilter => Microsoft.AspNetCore.Mvc.Formatters.FormatFilter (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.AspNetCore.Mvc.ApiExplorer.IApiDescriptionProvider => Microsoft.AspNetCore.Mvc.ApiExplorer.EndpointMetadataApiDescriptionProvider (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.AspNetCore.Mvc.MvcOptions, Microsoft.AspNetCore.Mvc.Core, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Swashbuckle.AspNetCore.SwaggerGen.SwaggerGeneratorOptions, Swashbuckle.AspNetCore.SwaggerGen, Version=6.4.0.0, Culture=neutral, PublicKeyToken=d84d99fb0135530a]] => Swashbuckle.AspNetCore.SwaggerGen.ConfigureSwaggerGeneratorOptions (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Swashbuckle.AspNetCore.SwaggerGen.SchemaGeneratorOptions, Swashbuckle.AspNetCore.SwaggerGen, Version=6.4.0.0, Culture=neutral, PublicKeyToken=d84d99fb0135530a]] => Swashbuckle.AspNetCore.SwaggerGen.ConfigureSchemaGeneratorOptions (Lifetime: Transient)
info: Program[0]
      Service: Swashbuckle.AspNetCore.Swagger.ISwaggerProvider => Swashbuckle.AspNetCore.SwaggerGen.SwaggerGenerator (Lifetime: Transient)
info: Program[0]
      Service: Swashbuckle.AspNetCore.Swagger.IAsyncSwaggerProvider => Swashbuckle.AspNetCore.SwaggerGen.SwaggerGenerator (Lifetime: Transient)
info: Program[0]
      Service: Swashbuckle.AspNetCore.SwaggerGen.SwaggerGeneratorOptions => (null) (Lifetime: Transient)
info: Program[0]
      Service: Swashbuckle.AspNetCore.SwaggerGen.ISchemaGenerator => Swashbuckle.AspNetCore.SwaggerGen.SchemaGenerator (Lifetime: Transient)
info: Program[0]
      Service: Swashbuckle.AspNetCore.SwaggerGen.SchemaGeneratorOptions => (null) (Lifetime: Transient)
info: Program[0]
      Service: Swashbuckle.AspNetCore.SwaggerGen.ISerializerDataContractResolver => (null) (Lifetime: Transient)
info: Program[0]
      Service: Microsoft.Extensions.ApiDescriptions.IDocumentProvider => Microsoft.Extensions.ApiDescriptions.DocumentProvider (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Swashbuckle.AspNetCore.SwaggerGen.SwaggerGenOptions, Swashbuckle.AspNetCore.SwaggerGen, Version=6.4.0.0, Culture=neutral, PublicKeyToken=d84d99fb0135530a]] => (null) (Lifetime: Singleton)
info: Program[0]
      Service: Microsoft.Extensions.Options.IConfigureOptions`1[[Microsoft.Extensions.Diagnostics.HealthChecks.HealthCheckServiceOptions, Microsoft.Extensions.Diagnostics.HealthChecks, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60]] => (null) (Lifetime: Singleton)
warn: Microsoft.AspNetCore.DataProtection.Repositories.FileSystemXmlRepository[60]
      Storing keys in a directory '/opt/app-root/.aspnet/DataProtection-Keys' that may not be persisted outside of the container. Protected data will be unavailable when container is destroyed. For more information go to https://aka.ms/aspnet/dataprotectionwarning
warn: Microsoft.AspNetCore.DataProtection.KeyManagement.XmlKeyManager[35]
      No XML encryptor configured. Key {e4019953-ef4d-4fa0-8fd9-db9f0499aeae} may be persisted to storage in unencrypted form.
info: Microsoft.Hosting.Lifetime[14]
      Now listening on: http://[::]:8080
info: Microsoft.Hosting.Lifetime[0]
      Application started. Press Ctrl+C to shut down.
info: Microsoft.Hosting.Lifetime[0]
      Hosting environment: tqs
info: Microsoft.Hosting.Lifetime[0]
      Content root path: /opt/app-root/app
warn: Microsoft.AspNetCore.HttpsPolicy.HttpsRedirectionMiddleware[3]
      Failed to determine the https port for redirect.
info: Microsoft.IdentityModel.LoggingExtensions.IdentityLoggerAdapter[0]
      Microsoft.IdentityModel Version: 8.14.0.0. Date 09/24/2026 12:02:30. PII logging is OFF. See https://aka.ms/IdentityModel/PII for details. 
      IDX10242: Security token: '[PII of type 'Microsoft.IdentityModel.JsonWebTokens.JsonWebToken' is hidden. For more details, see https://aka.ms/IdentityModel/PII.]' has a valid signature.
info: Microsoft.IdentityModel.LoggingExtensions.IdentityLoggerAdapter[0]
      IDX10239: Lifetime of the token is valid.
fail: Microsoft.IdentityModel.LoggingExtensions.IdentityLoggerAdapter[0]
      IDX10214: Audience validation failed. See https://aka.ms/identitymodel/app-context-switches
fail: Microsoft.EntityFrameworkCore.Database.Connection[20004]
      An error occurred using the connection to database 'PGCDB001' on server '10.116.29.228,1433'.
fail: Microsoft.EntityFrameworkCore.Query[10100]
      An exception occurred while iterating over the results of a query for context type 'Shared.DataModel.Base.DataBaseSqlServerConnection'.
      Microsoft.Data.SqlClient.SqlException (0x80131904): Login failed for user 'SPGCTR01'.
         at Microsoft.Data.SqlClient.SqlInternalConnection.OnError(SqlException exception, Boolean breakConnection, Action`1 wrapCloseInAction)
         at Microsoft.Data.SqlClient.TdsParser.ThrowExceptionAndWarning(TdsParserStateObject stateObj, SqlCommand command, Boolean callerHasConnectionLock, Boolean asyncClose)
         at Microsoft.Data.SqlClient.TdsParser.TryRun(RunBehavior runBehavior, SqlCommand cmdHandler, SqlDataReader dataStream, BulkCopySimpleResultSet bulkCopyHandler, TdsParserStateObject stateObj, Boolean& dataReady)
         at Microsoft.Data.SqlClient.TdsParser.Run(RunBehavior runBehavior, SqlCommand cmdHandler, SqlDataReader dataStream, BulkCopySimpleResultSet bulkCopyHandler, TdsParserStateObject stateObj)
         at Microsoft.Data.SqlClient.SqlInternalConnectionTds.CompleteLogin(Boolean enlistOK)
         at Microsoft.Data.SqlClient.SqlInternalConnectionTds.AttemptOneLogin(ServerInfo serverInfo, String newPassword, SecureString newSecurePassword, TimeoutTimer timeout, Boolean withFailover)
         at Microsoft.Data.SqlClient.SqlInternalConnectionTds.LoginNoFailover(ServerInfo serverInfo, String newPassword, SecureString newSecurePassword, Boolean redirectedUserInstance, SqlConnectionString connectionOptions, SqlCredential credential, TimeoutTimer timeout)
         at Microsoft.Data.SqlClient.SqlInternalConnectionTds.OpenLoginEnlist(TimeoutTimer timeout, SqlConnectionString connectionOptions, SqlCredential credential, String newPassword, SecureString newSecurePassword, Boolean redirectedUserInstance)
         at Microsoft.Data.SqlClient.SqlInternalConnectionTds..ctor(DbConnectionPoolIdentity identity, SqlConnectionString connectionOptions, SqlCredential credential, Object providerInfo, String newPassword, SecureString newSecurePassword, Boolean redirectedUserInstance, SqlConnectionString userConnectionOptions, SessionData reconnectSessionData, Boolean applyTransientFaultHandling, String accessToken, DbConnectionPool pool, Func`3 accessTokenCallback)
         at Microsoft.Data.SqlClient.SqlConnectionFactory.CreateConnection(DbConnectionOptions options, DbConnectionPoolKey poolKey, Object poolGroupProviderInfo, DbConnectionPool pool, DbConnection owningConnection, DbConnectionOptions userOptions)
         at Microsoft.Data.ProviderBase.DbConnectionFactory.CreatePooledConnection(DbConnectionPool pool, DbConnection owningObject, DbConnectionOptions options, DbConnectionPoolKey poolKey, DbConnectionOptions userOptions)
         at Microsoft.Data.ProviderBase.DbConnectionPool.CreateObject(DbConnection owningObject, DbConnectionOptions userOptions, DbConnectionInternal oldConnection)
         at Microsoft.Data.ProviderBase.DbConnectionPool.UserCreateRequest(DbConnection owningObject, DbConnectionOptions userOptions, DbConnectionInternal oldConnection)
         at Microsoft.Data.ProviderBase.DbConnectionPool.TryGetConnection(DbConnection owningObject, UInt32 waitForMultipleObjectsTimeout, Boolean allowCreate, Boolean onlyOneCheckConnection, DbConnectionOptions userOptions, DbConnectionInternal& connection)
         at Microsoft.Data.ProviderBase.DbConnectionPool.TryGetConnection(DbConnection owningObject, TaskCompletionSource`1 retry, DbConnectionOptions userOptions, DbConnectionInternal& connection)
         at Microsoft.Data.ProviderBase.DbConnectionFactory.TryGetConnection(DbConnection owningConnection, TaskCompletionSource`1 retry, DbConnectionOptions userOptions, DbConnectionInternal oldConnection, DbConnectionInternal& connection)
         at Microsoft.Data.ProviderBase.DbConnectionInternal.TryOpenConnectionInternal(DbConnection outerConnection, DbConnectionFactory connectionFactory, TaskCompletionSource`1 retry, DbConnectionOptions userOptions)
         at Microsoft.Data.ProviderBase.DbConnectionClosed.TryOpenConnection(DbConnection outerConnection, DbConnectionFactory connectionFactory, TaskCompletionSource`1 retry, DbConnectionOptions userOptions)
         at Microsoft.Data.SqlClient.SqlConnection.TryOpen(TaskCompletionSource`1 retry, SqlConnectionOverrides overrides)
         at Microsoft.Data.SqlClient.SqlConnection.Open(SqlConnectionOverrides overrides)
         at Microsoft.Data.SqlClient.SqlConnection.Open()
         at Microsoft.EntityFrameworkCore.SqlServer.Storage.Internal.SqlServerConnection.OpenDbConnection(Boolean errorsExpected)
         at Microsoft.EntityFrameworkCore.Storage.RelationalConnection.OpenInternal(Boolean errorsExpected)
         at Microsoft.EntityFrameworkCore.Storage.RelationalConnection.Open(Boolean errorsExpected)
         at Microsoft.EntityFrameworkCore.Storage.RelationalCommand.ExecuteReader(RelationalCommandParameterObject parameterObject)
         at Microsoft.EntityFrameworkCore.Query.Internal.SplitQueryingEnumerable`1.Enumerator.InitializeReader(Enumerator enumerator)
         at Microsoft.EntityFrameworkCore.Query.Internal.SplitQueryingEnumerable`1.Enumerator.<>c.<MoveNext>b__22_0(DbContext _, Enumerator enumerator)
         at Microsoft.EntityFrameworkCore.SqlServer.Storage.Internal.SqlServerExecutionStrategy.Execute[TState,TResult](TState state, Func`3 operation, Func`3 verifySucceeded)
         at Microsoft.EntityFrameworkCore.Query.Internal.SplitQueryingEnumerable`1.Enumerator.MoveNext()
      ClientConnectionId:2677a364-3834-48ac-b2b8-04f73f89ef87
      Error Number:18456,State:1,Class:14
      Microsoft.Data.SqlClient.SqlException (0x80131904): Login failed for user 'SPGCTR01'.
         at Microsoft.Data.SqlClient.SqlInternalConnection.OnError(SqlException exception, Boolean breakConnection, Action`1 wrapCloseInAction)
         at Microsoft.Data.SqlClient.TdsParser.ThrowExceptionAndWarning(TdsParserStateObject stateObj, SqlCommand command, Boolean callerHasConnectionLock, Boolean asyncClose)
         at Microsoft.Data.SqlClient.TdsParser.TryRun(RunBehavior runBehavior, SqlCommand cmdHandler, SqlDataReader dataStream, BulkCopySimpleResultSet bulkCopyHandler, TdsParserStateObject stateObj, Boolean& dataReady)
         at Microsoft.Data.SqlClient.TdsParser.Run(RunBehavior runBehavior, SqlCommand cmdHandler, SqlDataReader dataStream, BulkCopySimpleResultSet bulkCopyHandler, TdsParserStateObject stateObj)
         at Microsoft.Data.SqlClient.SqlInternalConnectionTds.CompleteLogin(Boolean enlistOK)
         at Microsoft.Data.SqlClient.SqlInternalConnectionTds.AttemptOneLogin(ServerInfo serverInfo, String newPassword, SecureString newSecurePassword, TimeoutTimer timeout, Boolean withFailover)
         at Microsoft.Data.SqlClient.SqlInternalConnectionTds.LoginNoFailover(ServerInfo serverInfo, String newPassword, SecureString newSecurePassword, Boolean redirectedUserInstance, SqlConnectionString connectionOptions, SqlCredential credential, TimeoutTimer timeout)
         at Microsoft.Data.SqlClient.SqlInternalConnectionTds.OpenLoginEnlist(TimeoutTimer timeout, SqlConnectionString connectionOptions, SqlCredential credential, String newPassword, SecureString newSecurePassword, Boolean redirectedUserInstance)
         at Microsoft.Data.SqlClient.SqlInternalConnectionTds..ctor(DbConnectionPoolIdentity identity, SqlConnectionString connectionOptions, SqlCredential credential, Object providerInfo, String newPassword, SecureString newSecurePassword, Boolean redirectedUserInstance, SqlConnectionString userConnectionOptions, SessionData reconnectSessionData, Boolean applyTransientFaultHandling, String accessToken, DbConnectionPool pool, Func`3 accessTokenCallback)
         at Microsoft.Data.SqlClient.SqlConnectionFactory.CreateConnection(DbConnectionOptions options, DbConnectionPoolKey poolKey, Object poolGroupProviderInfo, DbConnectionPool pool, DbConnection owningConnection, DbConnectionOptions userOptions)
         at Microsoft.Data.ProviderBase.DbConnectionFactory.CreatePooledConnection(DbConnectionPool pool, DbConnection owningObject, DbConnectionOptions options, DbConnectionPoolKey poolKey, DbConnectionOptions userOptions)
         at Microsoft.Data.ProviderBase.DbConnectionPool.CreateObject(DbConnection owningObject, DbConnectionOptions userOptions, DbConnectionInternal oldConnection)
         at Microsoft.Data.ProviderBase.DbConnectionPool.UserCreateRequest(DbConnection owningObject, DbConnectionOptions userOptions, DbConnectionInternal oldConnection)
         at Microsoft.Data.ProviderBase.DbConnectionPool.TryGetConnection(DbConnection owningObject, UInt32 waitForMultipleObjectsTimeout, Boolean allowCreate, Boolean onlyOneCheckConnection, DbConnectionOptions userOptions, DbConnectionInternal& connection)
         at Microsoft.Data.ProviderBase.DbConnectionPool.TryGetConnection(DbConnection owningObject, TaskCompletionSource`1 retry, DbConnectionOptions userOptions, DbConnectionInternal& connection)
         at Microsoft.Data.ProviderBase.DbConnectionFactory.TryGetConnection(DbConnection owningConnection, TaskCompletionSource`1 retry, DbConnectionOptions userOptions, DbConnectionInternal oldConnection, DbConnectionInternal& connection)
         at Microsoft.Data.ProviderBase.DbConnectionInternal.TryOpenConnectionInternal(DbConnection outerConnection, DbConnectionFactory connectionFactory, TaskCompletionSource`1 retry, DbConnectionOptions userOptions)
         at Microsoft.Data.ProviderBase.DbConnectionClosed.TryOpenConnection(DbConnection outerConnection, DbConnectionFactory connectionFactory, TaskCompletionSource`1 retry, DbConnectionOptions userOptions)
         at Microsoft.Data.SqlClient.SqlConnection.TryOpen(TaskCompletionSource`1 retry, SqlConnectionOverrides overrides)
         at Microsoft.Data.SqlClient.SqlConnection.Open(SqlConnectionOverrides overrides)
         at Microsoft.Data.SqlClient.SqlConnection.Open()
         at Microsoft.EntityFrameworkCore.SqlServer.Storage.Internal.SqlServerConnection.OpenDbConnection(Boolean errorsExpected)
         at Microsoft.EntityFrameworkCore.Storage.RelationalConnection.OpenInternal(Boolean errorsExpected)
         at Microsoft.EntityFrameworkCore.Storage.RelationalConnection.Open(Boolean errorsExpected)
         at Microsoft.EntityFrameworkCore.Storage.RelationalCommand.ExecuteReader(RelationalCommandParameterObject parameterObject)
         at Microsoft.EntityFrameworkCore.Query.Internal.SplitQueryingEnumerable`1.Enumerator.InitializeReader(Enumerator enumerator)
         at Microsoft.EntityFrameworkCore.Query.Internal.SplitQueryingEnumerable`1.Enumerator.<>c.<MoveNext>b__22_0(DbContext _, Enumerator enumerator)
         at Microsoft.EntityFrameworkCore.SqlServer.Storage.Internal.SqlServerExecutionStrategy.Execute[TState,TResult](TState state, Func`3 operation, Func`3 verifySucceeded)
         at Microsoft.EntityFrameworkCore.Query.Internal.SplitQueryingEnumerable`1.Enumerator.MoveNext()
      ClientConnectionId:2677a364-3834-48ac-b2b8-04f73f89ef87
      Error Number:18456,State:1,Class:14
fail: Microsoft.EntityFrameworkCore.Database.Connection[20004]
      An error occurred using the connection to database 'PGCDB001' on server '10.116.29.228,1433'.
fail: Microsoft.EntityFrameworkCore.Query[10100]
      An exception occurred while iterating over the results of a query for context type 'Shared.DataModel.Base.DataBaseSqlServerConnection'.
      Microsoft.Data.SqlClient.SqlException (0x80131904): Login failed for user 'SPGCTR01'.
         at Microsoft.Data.SqlClient.SqlInternalConnection.OnError(SqlException exception, Boolean breakConnection, Action`1 wrapCloseInAction)
         at Microsoft.Data.SqlClient.TdsParser.ThrowExceptionAndWarning(TdsParserStateObject stateObj, SqlCommand command, Boolean callerHasConnectionLock, Boolean asyncClose)
         at Microsoft.Data.SqlClient.TdsParser.TryRun(RunBehavior runBehavior, SqlCommand cmdHandler, SqlDataReader dataStream, BulkCopySimpleResultSet bulkCopyHandler, TdsParserStateObject stateObj, Boolean& dataReady)
         at Microsoft.Data.SqlClient.TdsParser.Run(RunBehavior runBehavior, SqlCommand cmdHandler, SqlDataReader dataStream, BulkCopySimpleResultSet bulkCopyHandler, TdsParserStateObject stateObj)
         at Microsoft.Data.SqlClient.SqlInternalConnectionTds.CompleteLogin(Boolean enlistOK)
         at Microsoft.Data.SqlClient.SqlInternalConnectionTds.AttemptOneLogin(ServerInfo serverInfo, String newPassword, SecureString newSecurePassword, TimeoutTimer timeout, Boolean withFailover)
         at Microsoft.Data.SqlClient.SqlInternalConnectionTds.LoginNoFailover(ServerInfo serverInfo, String newPassword, SecureString newSecurePassword, Boolean redirectedUserInstance, SqlConnectionString connectionOptions, SqlCredential credential, TimeoutTimer timeout)
         at Microsoft.Data.SqlClient.SqlInternalConnectionTds.OpenLoginEnlist(TimeoutTimer timeout, SqlConnectionString connectionOptions, SqlCredential credential, String newPassword, SecureString newSecurePassword, Boolean redirectedUserInstance)
         at Microsoft.Data.SqlClient.SqlInternalConnectionTds..ctor(DbConnectionPoolIdentity identity, SqlConnectionString connectionOptions, SqlCredential credential, Object providerInfo, String newPassword, SecureString newSecurePassword, Boolean redirectedUserInstance, SqlConnectionString userConnectionOptions, SessionData reconnectSessionData, Boolean applyTransientFaultHandling, String accessToken, DbConnectionPool pool, Func`3 accessTokenCallback)
         at Microsoft.Data.SqlClient.SqlConnectionFactory.CreateConnection(DbConnectionOptions options, DbConnectionPoolKey poolKey, Object poolGroupProviderInfo, DbConnectionPool pool, DbConnection owningConnection, DbConnectionOptions userOptions)
         at Microsoft.Data.ProviderBase.DbConnectionFactory.CreatePooledConnection(DbConnectionPool pool, DbConnection owningObject, DbConnectionOptions options, DbConnectionPoolKey poolKey, DbConnectionOptions userOptions)
         at Microsoft.Data.ProviderBase.DbConnectionPool.CreateObject(DbConnection owningObject, DbConnectionOptions userOptions, DbConnectionInternal oldConnection)
         at Microsoft.Data.ProviderBase.DbConnectionPool.UserCreateRequest(DbConnection owningObject, DbConnectionOptions userOptions, DbConnectionInternal oldConnection)
         at Microsoft.Data.ProviderBase.DbConnectionPool.TryGetConnection(DbConnection owningObject, UInt32 waitForMultipleObjectsTimeout, Boolean allowCreate, Boolean onlyOneCheckConnection, DbConnectionOptions userOptions, DbConnectionInternal& connection)
         at Microsoft.Data.ProviderBase.DbConnectionPool.TryGetConnection(DbConnection owningObject, TaskCompletionSource`1 retry, DbConnectionOptions userOptions, DbConnectionInternal& connection)
         at Microsoft.Data.ProviderBase.DbConnectionFactory.TryGetConnection(DbConnection owningConnection, TaskCompletionSource`1 retry, DbConnectionOptions userOptions, DbConnectionInternal oldConnection, DbConnectionInternal& connection)
         at Microsoft.Data.ProviderBase.DbConnectionInternal.TryOpenConnectionInternal(DbConnection outerConnection, DbConnectionFactory connectionFactory, TaskCompletionSource`1 retry, DbConnectionOptions userOptions)
         at Microsoft.Data.ProviderBase.DbConnectionClosed.TryOpenConnection(DbConnection outerConnection, DbConnectionFactory connectionFactory, TaskCompletionSource`1 retry, DbConnectionOptions userOptions)
         at Microsoft.Data.SqlClient.SqlConnection.TryOpen(TaskCompletionSource`1 retry, SqlConnectionOverrides overrides)
         at Microsoft.Data.SqlClient.SqlConnection.Open(SqlConnectionOverrides overrides)
         at Microsoft.Data.SqlClient.SqlConnection.Open()
         at Microsoft.EntityFrameworkCore.SqlServer.Storage.Internal.SqlServerConnection.OpenDbConnection(Boolean errorsExpected)
         at Microsoft.EntityFrameworkCore.Storage.RelationalConnection.OpenInternal(Boolean errorsExpected)
         at Microsoft.EntityFrameworkCore.Storage.RelationalConnection.Open(Boolean errorsExpected)
         at Microsoft.EntityFrameworkCore.Storage.RelationalCommand.ExecuteReader(RelationalCommandParameterObject parameterObject)
         at Microsoft.EntityFrameworkCore.Query.Internal.SplitQueryingEnumerable`1.Enumerator.InitializeReader(Enumerator enumerator)
         at Microsoft.EntityFrameworkCore.Query.Internal.SplitQueryingEnumerable`1.Enumerator.<>c.<MoveNext>b__22_0(DbContext _, Enumerator enumerator)
         at Microsoft.EntityFrameworkCore.SqlServer.Storage.Internal.SqlServerExecutionStrategy.Execute[TState,TResult](TState state, Func`3 operation, Func`3 verifySucceeded)
         at Microsoft.EntityFrameworkCore.Query.Internal.SplitQueryingEnumerable`1.Enumerator.MoveNext()
      ClientConnectionId:3d20e321-2200-4673-9b7b-3b5b4c8a0d43
      Error Number:18456,State:1,Class:14
      Microsoft.Data.SqlClient.SqlException (0x80131904): Login failed for user 'SPGCTR01'.
         at Microsoft.Data.SqlClient.SqlInternalConnection.OnError(SqlException exception, Boolean breakConnection, Action`1 wrapCloseInAction)
         at Microsoft.Data.SqlClient.TdsParser.ThrowExceptionAndWarning(TdsParserStateObject stateObj, SqlCommand command, Boolean callerHasConnectionLock, Boolean asyncClose)
         at Microsoft.Data.SqlClient.TdsParser.TryRun(RunBehavior runBehavior, SqlCommand cmdHandler, SqlDataReader dataStream, BulkCopySimpleResultSet bulkCopyHandler, TdsParserStateObject stateObj, Boolean& dataReady)
         at Microsoft.Data.SqlClient.TdsParser.Run(RunBehavior runBehavior, SqlCommand cmdHandler, SqlDataReader dataStream, BulkCopySimpleResultSet bulkCopyHandler, TdsParserStateObject stateObj)
         at Microsoft.Data.SqlClient.SqlInternalConnectionTds.CompleteLogin(Boolean enlistOK)
         at Microsoft.Data.SqlClient.SqlInternalConnectionTds.AttemptOneLogin(ServerInfo serverInfo, String newPassword, SecureString newSecurePassword, TimeoutTimer timeout, Boolean withFailover)
         at Microsoft.Data.SqlClient.SqlInternalConnectionTds.LoginNoFailover(ServerInfo serverInfo, String newPassword, SecureString newSecurePassword, Boolean redirectedUserInstance, SqlConnectionString connectionOptions, SqlCredential credential, TimeoutTimer timeout)
         at Microsoft.Data.SqlClient.SqlInternalConnectionTds.OpenLoginEnlist(TimeoutTimer timeout, SqlConnectionString connectionOptions, SqlCredential credential, String newPassword, SecureString newSecurePassword, Boolean redirectedUserInstance)
         at Microsoft.Data.SqlClient.SqlInternalConnectionTds..ctor(DbConnectionPoolIdentity identity, SqlConnectionString connectionOptions, SqlCredential credential, Object providerInfo, String newPassword, SecureString newSecurePassword, Boolean redirectedUserInstance, SqlConnectionString userConnectionOptions, SessionData reconnectSessionData, Boolean applyTransientFaultHandling, String accessToken, DbConnectionPool pool, Func`3 accessTokenCallback)
         at Microsoft.Data.SqlClient.SqlConnectionFactory.CreateConnection(DbConnectionOptions options, DbConnectionPoolKey poolKey, Object poolGroupProviderInfo, DbConnectionPool pool, DbConnection owningConnection, DbConnectionOptions userOptions)
         at Microsoft.Data.ProviderBase.DbConnectionFactory.CreatePooledConnection(DbConnectionPool pool, DbConnection owningObject, DbConnectionOptions options, DbConnectionPoolKey poolKey, DbConnectionOptions userOptions)
         at Microsoft.Data.ProviderBase.DbConnectionPool.CreateObject(DbConnection owningObject, DbConnectionOptions userOptions, DbConnectionInternal oldConnection)
         at Microsoft.Data.ProviderBase.DbConnectionPool.UserCreateRequest(DbConnection owningObject, DbConnectionOptions userOptions, DbConnectionInternal oldConnection)
         at Microsoft.Data.ProviderBase.DbConnectionPool.TryGetConnection(DbConnection owningObject, UInt32 waitForMultipleObjectsTimeout, Boolean allowCreate, Boolean onlyOneCheckConnection, DbConnectionOptions userOptions, DbConnectionInternal& connection)
         at Microsoft.Data.ProviderBase.DbConnectionPool.TryGetConnection(DbConnection owningObject, TaskCompletionSource`1 retry, DbConnectionOptions userOptions, DbConnectionInternal& connection)
         at Microsoft.Data.ProviderBase.DbConnectionFactory.TryGetConnection(DbConnection owningConnection, TaskCompletionSource`1 retry, DbConnectionOptions userOptions, DbConnectionInternal oldConnection, DbConnectionInternal& connection)
         at Microsoft.Data.ProviderBase.DbConnectionInternal.TryOpenConnectionInternal(DbConnection outerConnection, DbConnectionFactory connectionFactory, TaskCompletionSource`1 retry, DbConnectionOptions userOptions)
         at Microsoft.Data.ProviderBase.DbConnectionClosed.TryOpenConnection(DbConnection outerConnection, DbConnectionFactory connectionFactory, TaskCompletionSource`1 retry, DbConnectionOptions userOptions)
         at Microsoft.Data.SqlClient.SqlConnection.TryOpen(TaskCompletionSource`1 retry, SqlConnectionOverrides overrides)
         at Microsoft.Data.SqlClient.SqlConnection.Open(SqlConnectionOverrides overrides)
         at Microsoft.Data.SqlClient.SqlConnection.Open()
         at Microsoft.EntityFrameworkCore.SqlServer.Storage.Internal.SqlServerConnection.OpenDbConnection(Boolean errorsExpected)
         at Microsoft.EntityFrameworkCore.Storage.RelationalConnection.OpenInternal(Boolean errorsExpected)
         at Microsoft.EntityFrameworkCore.Storage.RelationalConnection.Open(Boolean errorsExpected)
         at Microsoft.EntityFrameworkCore.Storage.RelationalCommand.ExecuteReader(RelationalCommandParameterObject parameterObject)
         at Microsoft.EntityFrameworkCore.Query.Internal.SplitQueryingEnumerable`1.Enumerator.InitializeReader(Enumerator enumerator)
         at Microsoft.EntityFrameworkCore.Query.Internal.SplitQueryingEnumerable`1.Enumerator.<>c.<MoveNext>b__22_0(DbContext _, Enumerator enumerator)
         at Microsoft.EntityFrameworkCore.SqlServer.Storage.Internal.SqlServerExecutionStrategy.Execute[TState,TResult](TState state, Func`3 operation, Func`3 verifySucceeded)
         at Microsoft.EntityFrameworkCore.Query.Internal.SplitQueryingEnumerable`1.Enumerator.MoveNext()
      ClientConnectionId:3d20e321-2200-4673-9b7b-3b5b4c8a0d43
      Error Number:18456,State:1,Class:14



Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIPGC-api-membros
/
SIPGC-api-membros-1.3.0.21(3)
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings
SIPGC-api-membros

SIPGC-api-membros-1.3.0.21(3)


EC TQS

Succeeded


Pipeline

Tasks

Variables

Logs

Tests
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
EGRESS_IP_OKD (81)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
SIPGC-API-MEMBROS-DES (9)
Grupo de variáveis de SIPGC-API-MEMBROS-DES
Scopes: EC DES
DB_SCHEMA
PGC
INIT
Criado via api
KEY_SQLSERVER
********
_ENV.BD_SERVER
10.116.92.247,1433
_ENV.DB_DATABASE
PGCDB001
_ENV.DB_USER_001
SPGCDR01
_ENV.URL_FRONT
https://sipgc-front-des.apps.nprd.caixa
_SECRET.DB_PASSWORD_001
#{KEY_SQLSERVER}#
version.app
1.0.0-SNAPSHOT
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
CI_NAME
7366CLU-OKD4-NPRD
KIND_DEPLOY
deploymentconfig
OKD_4_API
api.nprd.caixa:6443
OKD_4_REGISTRY
default-route-openshift-image-registry.apps.nprd.caixa
OKD_4_TOKEN
********
OKD_4_URL_SUFFIX
apps.nprd.caixa
OKD_4_USER_SERVICE
ads-sa
OKD_URL_SUFFIX
apps.nprd.caixa
OKD_USER_SERVICE
ads-sa
TIMEOUT_DEPLOY
600
TOKEN_CRQ
********
URL_CRQ
https://infradevops-novoportal-backend-prd.apps.produtos4.caixa/api.php?acao=devopsCaixacriarMudancaPadrao
SIPGC-API-DES (19)
Grupo de variáveis de SIPGC-API-SEGURANCA-DES WO0000081444985 - Alteração do nome da library
Scopes: EC DES
AzureAd__Audience
api://ef9bda30-3695-462e-911b-5252dcf3b2de
AzureAd__ClientId
ef9bda30-3695-462e-911b-5252dcf3b2de
AzureAd__Instance
https://login.microsoftonline.com/
AzureAd__TenantId
23bc12fb-512d-4bc8-9d29-a2da7eb6d281
COMPlus_EnableDiagnostics
0
DB_SCHEMA
PGC
INIT
Criado via api
KEY_SQLSERVER
********
_ENV.ASPNETCORE_ENVIRONMENT
des
_ENV.BD_SERVER
10.116.92.247,1433
_ENV.BEYONDTRUST_LOGGING_ENABLED
true
_ENV.DB_DATABASE
PGCDB001
_ENV.DB_PASSWORD_001
'${spgcdr01_sqlserver}'
_ENV.DB_USER_001
SPGCDR01
_ENV.HTTPS_PROXY
http://proxydes.caixa:80
_ENV.HTTP_PROXY
http://proxydes.caixa:80
_ENV.NO_PROXY
.caixa,localhost,127.0.0.1,10.116.92.247,.svc,.svc.cluster.local,10.0.0.0/8
_ENV.VAULT_LOCATION
/usr/src/app/secrets_files/SIPGC_DES/
_SECRET.DB_PASSWORD_0010
#{KEY_SQLSERVER}#
SIPGC-API-TQS (14)
Grupo de variáveis de SIPGC-API-SEGURANCA-TQS WO0000081589941 - Alteração de nome
Scopes: EC TQS
DB_SCHEMA
PGC
INIT
Criado via api
KEY_SQLSERVER
********
_ENV.ASPNETCORE_ENVIRONMENT
tqs
_ENV.BD_SERVER
10.116.29.228,1433
_ENV.BEYONDTRUST_LOGGING_ENABLED
true
_ENV.DB_DATABASE
PGCDB001
_ENV.DB_PASSWORD_001
'${spgctr01_sqlserver}'
_ENV.DB_USER_001
SPGCTR01
_ENV.HTTPS_PROXY
http://proxydes.caixa:80
_ENV.HTTP_PROXY
http://proxydes.caixa:80
_ENV.NO_PROXY
.caixa,localhost,127.0.0.1,10.116.92.247,.svc,.svc.cluster.local,10.0.0.0/8
_ENV.VAULT_LOCATION
/usr/src/app/secrets_files/SIPGC_TQS/
_SECRET.DB_PASSWORD_0010
#{KEY_SQLSERVER}#
SIPGC-API-MEMBROS-HMP (1)
Grupo de variáveis de SIPGC-API-MEMBROS-HMP
Scopes: EC HMP
SIPGC-API-MEMBROS-PRD (6)
Grupo de variáveis de SIPGC-API-MEMBROS-PRD
Scopes: EC PRD
OKD-4-APL (12)
Scopes: EC PRD
Row 2. Clickable

Row 2. Clickable

Row 2. Clickable

Row 2. Clickable

Row 2. Clickable

Showing 25 filtered items.

Showing 4 items.

Finished loading items

Expanded

Collapsed

679 pipelines found

Select a release pipeline to view its releases

9 pipelines found

Select a release pipeline to view its releases

6 pipelines found

Select a release pipeline to view its releases

6 pipelines found

Row 4

Row 2

Showing filters 1 through 2


