I0709 20:12:38.395625       1 version.go:31] "version info" version="" commit="0eef8df" buildDate="2025-05-19T06:17:15Z" component="vaultenv"
I0709 20:12:38.395704       1 main.go:184] "azure key vault env injector initializing"
I0709 20:12:38.395845       1 main.go:253] "found original container command" cmd="/usr/bin/dotnet" args=["dotnet","SinshBackendSimuladorPJ.API.dll"]
I0709 20:12:38.395888       1 authentication.go:110] "checking if current auth service credentials are stale" url="http://akv2k8s-envinjector.akv2k8s.svc:80/auth/sinsh-backend-simulador-pj/sinsh-backend-simulador-pj-des-f8c44986-2kh9m?secret=akv2k8s-sinsh-backend-simulador-pj-des"
I0709 20:12:38.475115       1 authentication.go:123] "auth service credentials ok" url="http://akv2k8s-envinjector.akv2k8s.svc:80/auth/sinsh-backend-simulador-pj/sinsh-backend-simulador-pj-des-f8c44986-2kh9m?secret=akv2k8s-sinsh-backend-simulador-pj-des"
I0709 20:12:38.475417       1 authentication.go:159] "requesting azure key vault oauth token" url="https://akv2k8s-envinjector.akv2k8s.svc:9443/auth/sinsh-backend-simulador-pj/sinsh-backend-simulador-pj-des-f8c44986-2kh9m"
I0709 20:12:38.508158       1 authentication.go:179] "successfully received oauth token"
I0709 20:12:38.671337       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sinsh-backend-simulador-pj/akvs-apikey" env="ApiKey"
I0709 20:12:38.742320       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sinsh-backend-simulador-pj/akvs-clientid-intrasecret" env="SinshClientSecret"
I0709 20:12:38.742388       1 main.go:343] "starting process with secrets in env vars" cmd="/usr/bin/dotnet" args=["dotnet","SinshBackendSimuladorPJ.API.dll"]
[20:12:39] info: HealthChecks.UI.Core.HostedService.UIInitializationHostedService[0] Initializing UI Database
[20:12:40] info: HealthChecks.UI.Core.HostedService.UIInitializationHostedService[0] Saving healthchecks configuration to database
[20:12:40] fail: Microsoft.Extensions.Hosting.Internal.Host[11] Hosting failed to start System.InvalidOperationException: Unable to configure HTTPS endpoint. No server certificate was specified, and the default developer certificate could not be found or is out of date. To generate a developer certificate run 'dotnet dev-certs https'. To trust the certificate (Windows and macOS only) run 'dotnet dev-certs https --trust'. For more information on configuring HTTPS see https://go.microsoft.com/fwlink/?linkid=848054.    at Microsoft.AspNetCore.Server.Kestrel.Core.TlsConfigurationLoader.UseHttpsWithSni(ListenOptions listenOptions, HttpsConnectionAdapterOptions httpsOptions, EndpointConfig endpoint)    at Microsoft.AspNetCore.Server.Kestrel.KestrelConfigurationLoader.Reload()    at Microsoft.AspNetCore.Server.Kestrel.KestrelConfigurationLoader.LoadInternal()    at Microsoft.AspNetCore.Server.Kestrel.Core.KestrelServerImpl.BindAsync(CancellationToken cancellationToken)    at Microsoft.AspNetCore.Server.Kestrel.Core.KestrelServerImpl.StartAsync[TContext](IHttpApplication`1 application, CancellationToken cancellationToken)    at Microsoft.AspNetCore.Hosting.GenericWebHostService.StartAsync(CancellationToken cancellationToken)    at Microsoft.Extensions.Hosting.Internal.Host.<StartAsync>b__15_1(IHostedService service, CancellationToken token)    at Microsoft.Extensions.Hosting.Internal.Host.ForeachService[T](IEnumerable`1 services, CancellationToken token, Boolean concurrent, Boolean abortOnFirstException, List`1 exceptions, Func`3 operation)
Unhandled exception. System.InvalidOperationException: Unable to configure HTTPS endpoint. No server certificate was specified, and the default developer certificate could not be found or is out of date.
To generate a developer certificate run 'dotnet dev-certs https'. To trust the certificate (Windows and macOS only) run 'dotnet dev-certs https --trust'.
For more information on configuring HTTPS see https://go.microsoft.com/fwlink/?linkid=848054.
   at Microsoft.AspNetCore.Server.Kestrel.Core.TlsConfigurationLoader.UseHttpsWithSni(ListenOptions listenOptions, HttpsConnectionAdapterOptions httpsOptions, EndpointConfig endpoint)
   at Microsoft.AspNetCore.Server.Kestrel.KestrelConfigurationLoader.Reload()
   at Microsoft.AspNetCore.Server.Kestrel.KestrelConfigurationLoader.LoadInternal()
   at Microsoft.AspNetCore.Server.Kestrel.Core.KestrelServerImpl.BindAsync(CancellationToken cancellationToken)
   at Microsoft.AspNetCore.Server.Kestrel.Core.KestrelServerImpl.StartAsync[TContext](IHttpApplication`1 application, CancellationToken cancellationToken)
   at Microsoft.AspNetCore.Hosting.GenericWebHostService.StartAsync(CancellationToken cancellationToken)
   at Microsoft.Extensions.Hosting.Internal.Host.<StartAsync>b__15_1(IHostedService service, CancellationToken token)
   at Microsoft.Extensions.Hosting.Internal.Host.ForeachService[T](IEnumerable`1 services, CancellationToken token, Boolean concurrent, Boolean abortOnFirstException, List`1 exceptions, Func`3 operation)
   at Microsoft.Extensions.Hosting.Internal.Host.StartAsync(CancellationToken cancellationToken)
   at Microsoft.Extensions.Hosting.HostingAbstractionsHostExtensions.RunAsync(IHost host, CancellationToken token)
   at Microsoft.Extensions.Hosting.HostingAbstractionsHostExtensions.RunAsync(IHost host, CancellationToken token)
   at Microsoft.Extensions.Hosting.HostingAbstractionsHostExtensions.Run(IHost host)
   at Program.<Main>$(String[] args) in /src/SinshBackendSimuladorPJ.API/Program.cs:line 129
