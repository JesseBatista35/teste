pod
sisph-bff-jnd-baixa-garantia-des-d6fbd8459-cxtfs


I1020 17:53:09.438919       1 version.go:31] "version info" version="" commit="0eef8df" buildDate="2025-05-19T06:17:15Z" component="vaultenv"
I1020 17:53:09.439166       1 main.go:184] "azure key vault env injector initializing"
I1020 17:53:09.439386       1 main.go:253] "found original container command" cmd="/usr/bin/dotnet" args=["dotnet","BffJndBaixaGarantia.API.dll"]
I1020 17:53:09.439441       1 authentication.go:110] "checking if current auth service credentials are stale" url="http://akv2k8s-envinjector.akv2k8s.svc:80/auth/sisph-bff-jnd-baixa-garantia/sisph-bff-jnd-baixa-garantia-des-d6fbd8459-cxtfs?secret=akv2k8s-sisph-bff-jnd-baixa-garantia-des"
I1020 17:53:09.510859       1 authentication.go:123] "auth service credentials ok" url="http://akv2k8s-envinjector.akv2k8s.svc:80/auth/sisph-bff-jnd-baixa-garantia/sisph-bff-jnd-baixa-garantia-des-d6fbd8459-cxtfs?secret=akv2k8s-sisph-bff-jnd-baixa-garantia-des"
I1020 17:53:09.511065       1 authentication.go:159] "requesting azure key vault oauth token" url="https://akv2k8s-envinjector.akv2k8s.svc:9443/auth/sisph-bff-jnd-baixa-garantia/sisph-bff-jnd-baixa-garantia-des-d6fbd8459-cxtfs"
I1020 17:53:09.540125       1 authentication.go:179] "successfully received oauth token"
I1020 17:53:09.657569       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sisph-bff-jnd-baixa-garantia/akvs-sisph-token-clientsecret-des" env="SSO_CAIXA_SER_CLIENT_SECRET"
I1020 17:53:09.721850       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sisph-bff-jnd-baixa-garantia/akvs-sisph-apm-appinsights-conn-string-des" env="APPLICATIONINSIGHTS_CONNECTION_STRING"
I1020 17:53:09.783344       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sisph-bff-jnd-baixa-garantia/akvs-sisph-api-key-des" env="API_MANAGER_API_KEY"
I1020 17:53:09.842690       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sisph-bff-jnd-baixa-garantia/akvs-sisph-kv-eventhub-conn-string-des" env="sisph-kv-eventhub-conn-string"
I1020 17:53:09.842744       1 main.go:343] "starting process with secrets in env vars" cmd="/usr/bin/dotnet" args=["dotnet","BffJndBaixaGarantia.API.dll"]
Telemetria configurada com sucesso
warn: Microsoft.AspNetCore.DataProtection.Repositories.FileSystemXmlRepository[60]
      Storing keys in a directory '/root/.aspnet/DataProtection-Keys' that may not be persisted outside of the container. Protected data will be unavailable when container is destroyed. For more information go to https://aka.ms/aspnet/dataprotectionwarning
warn: Microsoft.AspNetCore.DataProtection.KeyManagement.XmlKeyManager[35]
      No XML encryptor configured. Key {57638de7-52ee-4e7e-8a31-6a2983e80fd3} may be persisted to storage in unencrypted form.
info: Microsoft.Hosting.Lifetime[14]
      Now listening on: http://[::]:8080
info: Microsoft.Hosting.Lifetime[0]
      Application started. Press Ctrl+C to shut down.
info: Microsoft.Hosting.Lifetime[0]
      Hosting environment: DES
info: Microsoft.Hosting.Lifetime[0]
      Content root path: /app


      
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
9 monthsRev:75
ReplicaSet
rs
sisph-bff-jnd-baixa-garantia-des-d6fbd8459
a minuteRev:75
Pod
pod
sisph-bff-jnd-baixa-garantia-des-d6fbd8459-cxtfs
a minuteRunning1/1
Secret
secret
akv2k8s-sisph-bff-jnd-baixa-garantia-des
9 months
ReplicaSet
rs
sisph-bff-jnd-baixa-garantia-des-56fb5579c8
a dayRev:74
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
