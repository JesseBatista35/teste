
Argo
v2.14.21+206a6ee
Argo
Applications
Settings
User Info
Documentation
Resource filters
NAME
NAME
KINDS
KINDS
SYNC STATUS
Synced
10
OutOfSync
0
HEALTH STATUS
Progressing
0
Suspended
0
Healthy
9
Degraded
0
Missing
0
Unknown
0
NAMESPACES
NAMESPACES
Show Orphaned
Applications
 sisph-bff-jnd-baixa-garantia-des
Application Details Tree
Log out
APP HEALTH 
 Healthy
SYNC STATUS 

 Synced
to HEAD (35e18ab)
Auto sync is enabled.
Author:
Arthur Augusto Alves <arthur.a.alves@caixa.gov.br> -
Comment:
Update cm-sisph-bff-jnd-baixa-garantia-des.yaml
LAST SYNC 

 Sync OK
to 35e18ab
Succeeded 3 hours ago (Tue Oct 20 2026 12:04:19 GMT-0300)
Author:
Arthur Augusto Alves <arthur.a.alves@caixa.gov.br> -
Comment:
Update cm-sisph-bff-jnd-baixa-garantia-des.yaml
APP CONDITIONS
 1 Warning
ConfigMap
cm
cm-sisph-bff-jnd-baixa-garantia-des
5 months

sisph-bff-jnd-baixa-garantia-des
7 months
Service
svc
sisph-bff-jnd-baixa-garantia-des
9 months
Endpoints
ep
sisph-bff-jnd-baixa-garantia-des
9 months
EndpointSlice
endpointslice
sisph-bff-jnd-baixa-garantia-des-vnx2m
9 months
Deployment
deploy
sisph-bff-jnd-baixa-garantia-des
9 monthsRev:74
ReplicaSet
rs
sisph-bff-jnd-baixa-garantia-des-56fb5579c8
a dayRev:74
Pod
pod
sisph-bff-jnd-baixa-garantia-des-56fb5579c8-lgd8v
6 hoursRunning1/136
Secret
secret
akv2k8s-sisph-bff-jnd-baixa-garantia-des
9 months
ReplicaSet
rs
sisph-bff-jnd-baixa-garantia-des-5f8bcbdfb7
19 daysRev:73
ReplicaSet
rs
sisph-bff-jnd-baixa-garantia-des-9d89dcd7
2 monthsRev:72
ReplicaSet
rs
sisph-bff-jnd-baixa-garantia-des-76f69f597
2 monthsRev:71
ReplicaSet
rs
sisph-bff-jnd-baixa-garantia-des-5dfb6547cb
4 monthsRev:70
ReplicaSet
rs
sisph-bff-jnd-baixa-garantia-des-54f5986bcd
5 monthsRev:69
G
gateway
sisph-bff-jnd-baixa-garantia-des-internal
9 months
VS
virtualservice
sisph-bff-jnd-baixa-garantia-des-internal
9 months
AKVS
azurekeyvaultsecret
akvs-sisph-bff-jnd-baixa-garantia-des-caixa
5 months
Secret
secret
akvs-sisph-bff-jnd-baixa-garantia-des-caixa
5 months
AKVS
azurekeyvaultsecret
akvs-sisph-api-key-des
5 months
AKVS
azurekeyvaultsecret
akvs-sisph-apm-appinsights-conn-string-des
5 months
AKVS
azurekeyvaultsecret
akvs-sisph-kv-eventhub-conn-string-des
5 months
AKVS
azurekeyvaultsecret
akvs-sisph-token-clientsecret-des
5 months

Podpod
sisph-bff-jnd-baixa-garantia-des-56fb5579c8-lgd8v
 SUMMARY EVENTS LOGS

sisph-bff-jnd-baixa-garantia-des
containing
I1020 13:59:08.493763       1 version.go:31] "version info" version="" commit="0eef8df" buildDate="2025-05-19T06:17:15Z" component="vaultenv"
I1020 13:59:08.493884       1 main.go:184] "azure key vault env injector initializing"
I1020 13:59:08.494070       1 main.go:253] "found original container command" cmd="/usr/bin/dotnet" args=["dotnet","BffJndBaixaGarantia.API.dll"]
I1020 13:59:08.494126       1 authentication.go:110] "checking if current auth service credentials are stale" url="http://akv2k8s-envinjector.akv2k8s.svc:80/auth/sisph-bff-jnd-baixa-garantia/sisph-bff-jnd-baixa-garantia-des-56fb5579c8-lgd8v?secret=akv2k8s-sisph-bff-jnd-baixa-garantia-des"
I1020 13:59:08.558422       1 authentication.go:123] "auth service credentials ok" url="http://akv2k8s-envinjector.akv2k8s.svc:80/auth/sisph-bff-jnd-baixa-garantia/sisph-bff-jnd-baixa-garantia-des-56fb5579c8-lgd8v?secret=akv2k8s-sisph-bff-jnd-baixa-garantia-des"
I1020 13:59:08.558721       1 authentication.go:159] "requesting azure key vault oauth token" url="https://akv2k8s-envinjector.akv2k8s.svc:9443/auth/sisph-bff-jnd-baixa-garantia/sisph-bff-jnd-baixa-garantia-des-56fb5579c8-lgd8v"
I1020 13:59:08.594485       1 authentication.go:179] "successfully received oauth token"
I1020 13:59:08.746294       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sisph-bff-jnd-baixa-garantia/akvs-sisph-kv-eventhub-conn-string-des" env="sisph-kv-eventhub-conn-string"
I1020 13:59:08.875200       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sisph-bff-jnd-baixa-garantia/akvs-sisph-token-clientsecret-des" env="SSO_CAIXA_SER_CLIENT_SECRET"
I1020 13:59:08.946458       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sisph-bff-jnd-baixa-garantia/akvs-sisph-api-key-des" env="API_MANAGER_API_KEY"
I1020 13:59:09.021558       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sisph-bff-jnd-baixa-garantia/akvs-sisph-apm-appinsights-conn-string-des" env="APPLICATIONINSIGHTS_CONNECTION_STRING"
I1020 13:59:09.021598       1 main.go:343] "starting process with secrets in env vars" cmd="/usr/bin/dotnet" args=["dotnet","BffJndBaixaGarantia.API.dll"]
Telemetria configurada com sucesso
warn: Microsoft.AspNetCore.DataProtection.Repositories.FileSystemXmlRepository[60]
      Storing keys in a directory '/root/.aspnet/DataProtection-Keys' that may not be persisted outside of the container. Protected data will be unavailable when container is destroyed. For more information go to https://aka.ms/aspnet/dataprotectionwarning
fail: Microsoft.Extensions.Hosting.Internal.Host[11]
      Hosting failed to start
      System.AggregateException: One or more errors occurred. (GeracaoDocumento:Provedor deve ser GestaoMo, GerenciadorDocumentos ou Simulado.) (Dados:Provedor deve ser Simulado enquanto não houver integração real.) (HistoricoEntrega:Provedor deve ser Simulado enquanto não houver integração real.) (DocumentoPreview:Provedor deve ser Simulado enquanto não houver integração real.)
       ---> Microsoft.Extensions.Options.OptionsValidationException: GeracaoDocumento:Provedor deve ser GestaoMo, GerenciadorDocumentos ou Simulado.
         at Microsoft.Extensions.Options.OptionsFactory`1.Create(String name)
         at Microsoft.Extensions.Options.OptionsMonitor`1.<>c.<Get>b__10_0(String name, IOptionsFactory`1 factory)
         at Microsoft.Extensions.Options.OptionsCache`1.<>c__DisplayClass3_1`1.<GetOrAdd>b__2()
         at System.Lazy`1.ViaFactory(LazyThreadSafetyMode mode)
         at System.Lazy`1.ExecutionAndPublication(LazyHelper executionAndPublication, Boolean useDefaultConstructor)
         at System.Lazy`1.CreateValue()
         at Microsoft.Extensions.Options.OptionsCache`1.GetOrAdd[TArg](String name, Func`3 createOptions, TArg factoryArgument)
         at Microsoft.Extensions.Options.OptionsMonitor`1.Get(String name)
         at Microsoft.Extensions.DependencyInjection.OptionsBuilderExtensions.<>c__DisplayClass0_1`1.<ValidateOnStart>b__1()
         at Microsoft.Extensions.Options.StartupValidator.Validate()
         --- End of inner exception stack trace ---
         at Microsoft.Extensions.Options.StartupValidator.Validate()
         at Microsoft.Extensions.Hosting.Internal.Host.StartAsync(CancellationToken cancellationToken)
       ---> (Inner Exception #1) Microsoft.Extensions.Options.OptionsValidationException: Dados:Provedor deve ser Simulado enquanto não houver integração real.
         at Microsoft.Extensions.Options.OptionsFactory`1.Create(String name)
         at Microsoft.Extensions.Options.OptionsMonitor`1.<>c.<Get>b__10_0(String name, IOptionsFactory`1 factory)
         at Microsoft.Extensions.Options.OptionsCache`1.<>c__DisplayClass3_1`1.<GetOrAdd>b__2()
         at System.Lazy`1.ViaFactory(LazyThreadSafetyMode mode)
         at System.Lazy`1.ExecutionAndPublication(LazyHelper executionAndPublication, Boolean useDefaultConstructor)
         at System.Lazy`1.CreateValue()
         at Microsoft.Extensions.Options.OptionsCache`1.GetOrAdd[TArg](String name, Func`3 createOptions, TArg factoryArgument)
         at Microsoft.Extensions.Options.OptionsMonitor`1.Get(String name)
         at Microsoft.Extensions.DependencyInjection.OptionsBuilderExtensions.<>c__DisplayClass0_1`1.<ValidateOnStart>b__1()
         at Microsoft.Extensions.Options.StartupValidator.Validate()<---
       ---> (Inner Exception #2) Microsoft.Extensions.Options.OptionsValidationException: HistoricoEntrega:Provedor deve ser Simulado enquanto não houver integração real.
         at Microsoft.Extensions.Options.OptionsFactory`1.Create(String name)
         at Microsoft.Extensions.Options.OptionsMonitor`1.<>c.<Get>b__10_0(String name, IOptionsFactory`1 factory)
         at Microsoft.Extensions.Options.OptionsCache`1.<>c__DisplayClass3_1`1.<GetOrAdd>b__2()
         at System.Lazy`1.ViaFactory(LazyThreadSafetyMode mode)
         at System.Lazy`1.ExecutionAndPublication(LazyHelper executionAndPublication, Boolean useDefaultConstructor)
         at System.Lazy`1.CreateValue()
         at Microsoft.Extensions.Options.OptionsCache`1.GetOrAdd[TArg](String name, Func`3 createOptions, TArg factoryArgument)
         at Microsoft.Extensions.Options.OptionsMonitor`1.Get(String name)
         at Microsoft.Extensions.DependencyInjection.OptionsBuilderExtensions.<>c__DisplayClass0_1`1.<ValidateOnStart>b__1()
         at Microsoft.Extensions.Options.StartupValidator.Validate()<---
       ---> (Inner Exception #3) Microsoft.Extensions.Options.OptionsValidationException: DocumentoPreview:Provedor deve ser Simulado enquanto não houver integração real.
         at Microsoft.Extensions.Options.OptionsFactory`1.Create(String name)
         at Microsoft.Extensions.Options.OptionsMonitor`1.<>c.<Get>b__10_0(String name, IOptionsFactory`1 factory)
         at Microsoft.Extensions.Options.OptionsCache`1.<>c__DisplayClass3_1`1.<GetOrAdd>b__2()
         at System.Lazy`1.ViaFactory(LazyThreadSafetyMode mode)
         at System.Lazy`1.ExecutionAndPublication(LazyHelper executionAndPublication, Boolean useDefaultConstructor)
         at System.Lazy`1.CreateValue()
         at Microsoft.Extensions.Options.OptionsCache`1.GetOrAdd[TArg](String name, Func`3 createOptions, TArg factoryArgument)
         at Microsoft.Extensions.Options.OptionsMonitor`1.Get(String name)
         at Microsoft.Extensions.DependencyInjection.OptionsBuilderExtensions.<>c__DisplayClass0_1`1.<ValidateOnStart>b__1()
         at Microsoft.Extensions.Options.StartupValidator.Validate()<---
Unhandled exception. System.AggregateException: One or more errors occurred. (GeracaoDocumento:Provedor deve ser GestaoMo, GerenciadorDocumentos ou Simulado.) (Dados:Provedor deve ser Simulado enquanto não houver integração real.) (HistoricoEntrega:Provedor deve ser Simulado enquanto não houver integração real.) (DocumentoPreview:Provedor deve ser Simulado enquanto não houver integração real.)
 ---> Microsoft.Extensions.Options.OptionsValidationException: GeracaoDocumento:Provedor deve ser GestaoMo, GerenciadorDocumentos ou Simulado.
   at Microsoft.Extensions.Options.OptionsFactory`1.Create(String name)
   at Microsoft.Extensions.Options.OptionsMonitor`1.<>c.<Get>b__10_0(String name, IOptionsFactory`1 factory)
   at Microsoft.Extensions.Options.OptionsCache`1.<>c__DisplayClass3_1`1.<GetOrAdd>b__2()
   at System.Lazy`1.ViaFactory(LazyThreadSafetyMode mode)
   at System.Lazy`1.ExecutionAndPublication(LazyHelper executionAndPublication, Boolean useDefaultConstructor)
   at System.Lazy`1.CreateValue()
   at Microsoft.Extensions.Options.OptionsCache`1.GetOrAdd[TArg](String name, Func`3 createOptions, TArg factoryArgument)
   at Microsoft.Extensions.Options.OptionsMonitor`1.Get(String name)
   at Microsoft.Extensions.DependencyInjection.OptionsBuilderExtensions.<>c__DisplayClass0_1`1.<ValidateOnStart>b__1()
   at Microsoft.Extensions.Options.StartupValidator.Validate()
   --- End of inner exception stack trace ---
   at Microsoft.Extensions.Options.StartupValidator.Validate()
   at Microsoft.Extensions.Hosting.Internal.Host.StartAsync(CancellationToken cancellationToken)
   at Microsoft.Extensions.Hosting.Internal.Host.StartAsync(CancellationToken cancellationToken)
   at Microsoft.Extensions.Hosting.HostingAbstractionsHostExtensions.RunAsync(IHost host, CancellationToken token)
   at Microsoft.Extensions.Hosting.HostingAbstractionsHostExtensions.RunAsync(IHost host, CancellationToken token)
   at Microsoft.Extensions.Hosting.HostingAbstractionsHostExtensions.Run(IHost host)
   at Program.<Main>$(String[] args) in /app/BffJndBaixaGarantia.API/Program.cs:line 114
 ---> (Inner Exception #1) Microsoft.Extensions.Options.OptionsValidationException: Dados:Provedor deve ser Simulado enquanto não houver integração real.
   at Microsoft.Extensions.Options.OptionsFactory`1.Create(String name)
   at Microsoft.Extensions.Options.OptionsMonitor`1.<>c.<Get>b__10_0(String name, IOptionsFactory`1 factory)
   at Microsoft.Extensions.Options.OptionsCache`1.<>c__DisplayClass3_1`1.<GetOrAdd>b__2()
   at System.Lazy`1.ViaFactory(LazyThreadSafetyMode mode)
   at System.Lazy`1.ExecutionAndPublication(LazyHelper executionAndPublication, Boolean useDefaultConstructor)
   at System.Lazy`1.CreateValue()
   at Microsoft.Extensions.Options.OptionsCache`1.GetOrAdd[TArg](String name, Func`3 createOptions, TArg factoryArgument)
   at Microsoft.Extensions.Options.OptionsMonitor`1.Get(String name)
   at Microsoft.Extensions.DependencyInjection.OptionsBuilderExtensions.<>c__DisplayClass0_1`1.<ValidateOnStart>b__1()
   at Microsoft.Extensions.Options.StartupValidator.Validate()<---
 ---> (Inner Exception #2) Microsoft.Extensions.Options.OptionsValidationException: HistoricoEntrega:Provedor deve ser Simulado enquanto não houver integração real.
   at Microsoft.Extensions.Options.OptionsFactory`1.Create(String name)
   at Microsoft.Extensions.Options.OptionsMonitor`1.<>c.<Get>b__10_0(String name, IOptionsFactory`1 factory)
   at Microsoft.Extensions.Options.OptionsCache`1.<>c__DisplayClass3_1`1.<GetOrAdd>b__2()
   at System.Lazy`1.ViaFactory(LazyThreadSafetyMode mode)
   at System.Lazy`1.ExecutionAndPublication(LazyHelper executionAndPublication, Boolean useDefaultConstructor)
   at System.Lazy`1.CreateValue()
   at Microsoft.Extensions.Options.OptionsCache`1.GetOrAdd[TArg](String name, Func`3 createOptions, TArg factoryArgument)
   at Microsoft.Extensions.Options.OptionsMonitor`1.Get(String name)
   at Microsoft.Extensions.DependencyInjection.OptionsBuilderExtensions.<>c__DisplayClass0_1`1.<ValidateOnStart>b__1()
   at Microsoft.Extensions.Options.StartupValidator.Validate()<---
 ---> (Inner Exception #3) Microsoft.Extensions.Options.OptionsValidationException: DocumentoPreview:Provedor deve ser Simulado enquanto não houver integração real.
   at Microsoft.Extensions.Options.OptionsFactory`1.Create(String name)
   at Microsoft.Extensions.Options.OptionsMonitor`1.<>c.<Get>b__10_0(String name, IOptionsFactory`1 factory)
   at Microsoft.Extensions.Options.OptionsCache`1.<>c__DisplayClass3_1`1.<GetOrAdd>b__2()
   at System.Lazy`1.ViaFactory(LazyThreadSafetyMode mode)
   at System.Lazy`1.ExecutionAndPublication(LazyHelper executionAndPublication, Boolean useDefaultConstructor)
   at System.Lazy`1.CreateValue()
   at Microsoft.Extensions.Options.OptionsCache`1.GetOrAdd[TArg](String name, Func`3 createOptions, TArg factoryArgument)
   at Microsoft.Extensions.Options.OptionsMonitor`1.Get(String name)
   at Microsoft.Extensions.DependencyInjection.OptionsBuilderExtensions.<>c__DisplayClass0_1`1.<ValidateOnStart>b__1()
   at Microsoft.Extensions.Options.StartupValidator.Validate()<---


<img width="1899" height="995" alt="image" src="https://github.com/user-attachments/assets/82c6a6fc-7180-4507-88c0-1d4e739519d9" />


