REASON
MESSAGE
COUNT
FIRST OCCURRED
LAST OCCURRED
BackOff
Back-off restarting failed container sirmc-api-registro-interacoes-clientes-des in pod sirmc-api-registro-interacoes-clientes-des-55d4dfcbc9-75mhf_sirmc-api-registro-interacoes-clientes(2ee0b048-8076-46f0-b136-1db4ae2a4acb)


logs

I0821 19:05:20.990720       1 version.go:31] "version info" version="" commit="0eef8df" buildDate="2025-05-19T06:17:15Z" component="vaultenv"
I0821 19:05:20.990978       1 main.go:184] "azure key vault env injector initializing"
I0821 19:05:20.991236       1 main.go:253] "found original container command" cmd="/usr/bin/dotnet" args=["dotnet","ApiInteracoes.API.dll"]
I0821 19:05:20.991322       1 authentication.go:110] "checking if current auth service credentials are stale" url="http://akv2k8s-envinjector.akv2k8s.svc:80/auth/sirmc-api-registro-interacoes-clientes/sirmc-api-registro-interacoes-clientes-des-55d4dfcbc9-75mhf?secret=akv2k8s-sirmc-api-registro-interacoes-clientes-des"
I0821 19:05:21.066031       1 authentication.go:123] "auth service credentials ok" url="http://akv2k8s-envinjector.akv2k8s.svc:80/auth/sirmc-api-registro-interacoes-clientes/sirmc-api-registro-interacoes-clientes-des-55d4dfcbc9-75mhf?secret=akv2k8s-sirmc-api-registro-interacoes-clientes-des"
I0821 19:05:21.066310       1 authentication.go:159] "requesting azure key vault oauth token" url="https://akv2k8s-envinjector.akv2k8s.svc:9443/auth/sirmc-api-registro-interacoes-clientes/sirmc-api-registro-interacoes-clientes-des-55d4dfcbc9-75mhf"
I0821 19:05:21.100991       1 authentication.go:179] "successfully received oauth token"
I0821 19:05:21.239225       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sirmc-api-registro-interacoes-clientes/akvs-sirmc-sqlserver-transacao-password" env="Database__Password"
E0821 19:05:21.247588       1 main.go:309] "failed to get azurekeyvaultsecret" err="azurekeyvaultsecrets.spv.no \"akvs-applicationinsightsconnectionstring\" not found" azurekeyvaultsecret="sirmc-api-registro-interacoes-clientes/akvs-applicationinsightsconnectionstring"
I0821 19:05:21.247609       1 main.go:310] "will retry getting azurekeyvaultsecret" azurekeyvaultsecret="sirmc-api-registro-interacoes-clientes/akvs-applicationinsightsconnectionstring" retryTimes=3 delay=3
E0821 19:05:30.280347       1 main.go:322] "error getting azurekeyvaultsecret" err="azurekeyvaultsecrets.spv.no \"akvs-applicationinsightsconnectionstring\" not found" azurekeyvaultsecret="sirmc-api-registro-interacoes-clientes/akvs-applicationinsightsconnectionstring"
