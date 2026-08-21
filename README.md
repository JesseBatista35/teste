0s
Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/logs@main
Formate ARGO REPOSITORY
0s
Coletando logs dos pods
0s
Run RESOURCE_TREE_URL="https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/sirmc-api-registro-interacoes-clientes-des/resource-tree?appNamespace=openshift-gitops"
    RESOURCE_TREE_URL="https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/sirmc-api-registro-interacoes-clientes-des/resource-tree?appNamespace=openshift-gitops"
    echo "Fazendo requisição para: ${RESOURCE_TREE_URL}"
    
    RESOURCE_TREE_JSON=$(curl -s -H "Authorization: ***" "${RESOURCE_TREE_URL}")
    if [ $? -ne 0 ]; then
      echo "Erro ao fazer requisição para o resource-tree"
      exit 1
    fi
    
    echo "Resource-tree obtido com sucesso"
    
    echo "Filtrando pods e encontrando o mais recente..."
    
    LATEST_POD=$(echo "$RESOURCE_TREE_JSON" | jq -r '
      .nodes // [] |
      map(select(.kind == "Pod" and .createdAt != null)) |
      sort_by(.createdAt) |
      last |
      .name // empty
    ')
    
    if [ -z "$LATEST_POD" ]; then
      echo "Nenhum pod encontrado ou JSON não contém dados esperados"
      exit 0
    fi
    
    echo "Pod mais recente encontrado: ${LATEST_POD}"
    
    LOGS_URL="https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/sirmc-api-registro-interacoes-clientes-des/logs?appNamespace=openshift-gitops&container=sirmc-api-registro-interacoes-clientes-des&namespace=sirmc-api-registro-interacoes-clientes&follow=false&podName=${LATEST_POD}&tailLines=1000&sinceSeconds=0"
    echo "URL dos logs: ${LOGS_URL}"
    
    LOGS_RESPONSE=$(curl -s -H "Authorization: ***" "${LOGS_URL}")
    
    if [ $? -ne 0 ]; then
      echo "Erro ao obter logs do pod"
      exit 1
    fi
    
    echo "Logs obtidos com sucesso"
    echo "Logs do pod ${LATEST_POD}:"
    echo "================================================"
    
    echo "Exibindo os Logs:"
    echo "$LOGS_RESPONSE" | jq -r '.result.content'
    
    echo "================================================"
    echo "Script executado com sucesso!"
    echo "Pod utilizado: ${LATEST_POD}"
    
    if [ "false" = "false" ]; then
      echo "Falha na sincronização"
      exit 1
    fi
    shell: /usr/bin/bash --noprofile --norc -e -o pipefail {0}
    env:
      APIM_VERSIONAPI: 
      APIM_displaynameAPI: 
      APIM_PATH: 
      APIM_SWAGGERPATH: 
      APIM_TAGSAPI: 
      APIM_POLICIESALLOPERATIONSPATH: 
      AZ_INSTALL_STATUS: ms_repo_ok
      AZ_VERSION: latest
      INSTALL_PREREQUISITES: true
      AZ_LATEST_VERSION: 2.89.1
      environment: des
      repository_suffix: infranprd
      REPO: sirmc-api-registro-interacoes-clientes
      JOB_ID: 136477
      ARGOCD_AUTH_TOKEN: ***
      REPO_NAME: sirmc-api-registro-interacoes-clientes
      AMBIENTE_LOWER: des
  Fazendo requisição para: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/sirmc-api-registro-interacoes-clientes-des/resource-tree?appNamespace=openshift-gitops
  Resource-tree obtido com sucesso
  Filtrando pods e encontrando o mais recente...
  Pod mais recente encontrado: sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx
  URL dos logs: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/sirmc-api-registro-interacoes-clientes-des/logs?appNamespace=openshift-gitops&container=sirmc-api-registro-interacoes-clientes-des&namespace=sirmc-api-registro-interacoes-clientes&follow=false&podName=sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx&tailLines=1000&sinceSeconds=0
  Logs obtidos com sucesso
  Logs do pod sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx:
  ================================================
  Exibindo os Logs:
  I0821 19:15:23.903799       1 version.go:31] "version info" version="" commit="0eef8df" buildDate="2025-05-19T06:17:15Z" component="vaultenv"
  I0821 19:15:23.903902       1 main.go:184] "azure key vault env injector initializing"
  I0821 19:15:23.904063       1 main.go:253] "found original container command" cmd="/usr/bin/dotnet" args=["dotnet","ApiInteracoes.API.dll"]
  I0821 19:15:23.904115       1 authentication.go:110] "checking if current auth service credentials are stale" url="http://akv2k8s-envinjector.akv2k8s.svc:80/auth/sirmc-api-registro-interacoes-clientes/sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx?secret=akv2k8s-sirmc-api-registro-interacoes-clientes-des"
  I0821 19:15:23.996406       1 authentication.go:123] "auth service credentials ok" url="http://akv2k8s-envinjector.akv2k8s.svc:80/auth/sirmc-api-registro-interacoes-clientes/sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx?secret=akv2k8s-sirmc-api-registro-interacoes-clientes-des"
  I0821 19:15:23.996649       1 authentication.go:159] "requesting azure key vault oauth token" url="https://akv2k8s-envinjector.akv2k8s.svc:9443/auth/sirmc-api-registro-interacoes-clientes/sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx"
  I0821 19:15:24.028394       1 authentication.go:179] "successfully received oauth token"
  I0821 19:15:24.149725       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sirmc-api-registro-interacoes-clientes/akvs-shared-applicationinsights-connectionstring" env="ApplicationInsights__ConnectionString"
  I0821 19:15:24.209785       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sirmc-api-registro-interacoes-clientes/akvs-sirmc-sqlserver-transacao" env="Database__UserId"
  I0821 19:15:24.267738       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sirmc-api-registro-interacoes-clientes/akvs-sirmc-sqlserver-transacao-password" env="Database__Password"
  I0821 19:15:24.267768       1 main.go:343] "starting process with secrets in env vars" cmd="/usr/bin/dotnet" args=["dotnet","ApiInteracoes.API.dll"]
  {"Timestamp":"2026-08-21T19:15:24.5696861+00:00","Level":"Debug","MessageTemplate":"Hosting starting","RenderedMessage":"Hosting starting","Properties":{"EventId":{"Id":1,"Name":"Starting"},"SourceContext":"Microsoft.Extensions.Hosting.Internal.Host","MachineName":"sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx","Application":"ApiInteracoes.API","Environment":"DES"}}
  {"Timestamp":"2026-08-21T19:15:24.5859207+00:00","Level":"Warning","MessageTemplate":"Storing keys in a directory '{path}' that may not be persisted outside of the container. Protected data will be unavailable when container is destroyed. For more information go to https://aka.ms/aspnet/dataprotectionwarning","RenderedMessage":"Storing keys in a directory '\"/app/.aspnet/DataProtection-Keys\"' that may not be persisted outside of the container. Protected data will be unavailable when container is destroyed. For more information go to https://aka.ms/aspnet/dataprotectionwarning","Properties":{"path":"/app/.aspnet/DataProtection-Keys","EventId":{"Id":60,"Name":"UsingEphemeralFileSystemLocationInContainer"},"SourceContext":"Microsoft.AspNetCore.DataProtection.Repositories.FileSystemXmlRepository","MachineName":"sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx","Application":"ApiInteracoes.API","Environment":"DES"}}
  {"Timestamp":"2026-08-21T19:15:24.5868257+00:00","Level":"Information","MessageTemplate":"User profile is available. Using '{FullName}' as key repository; keys will not be encrypted at rest.","RenderedMessage":"User profile is available. Using '\"/app/.aspnet/DataProtection-Keys\"' as key repository; keys will not be encrypted at rest.","Properties":{"FullName":"/app/.aspnet/DataProtection-Keys","EventId":{"Id":62,"Name":"UsingProfileAsKeyRepository"},"SourceContext":"Microsoft.AspNetCore.DataProtection.KeyManagement.XmlKeyManager","MachineName":"sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx","Application":"ApiInteracoes.API","Environment":"DES"}}
  {"Timestamp":"2026-08-21T19:15:24.6659530+00:00","Level":"Debug","MessageTemplate":"Repository contains no viable default key. Caller should generate a key with immediate activation.","RenderedMessage":"Repository contains no viable default key. Caller should generate a key with immediate activation.","Properties":{"EventId":{"Id":53,"Name":"RepositoryContainsNoViableDefaultKey"},"SourceContext":"Microsoft.AspNetCore.DataProtection.KeyManagement.DefaultKeyResolver","MachineName":"sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx","Application":"ApiInteracoes.API","Environment":"DES"}}
  {"Timestamp":"2026-08-21T19:15:24.6662373+00:00","Level":"Debug","MessageTemplate":"Policy resolution states that a new key should be added to the key ring.","RenderedMessage":"Policy resolution states that a new key should be added to the key ring.","Properties":{"EventId":{"Id":57,"Name":"PolicyResolutionStatesThatANewKeyShouldBeAddedToTheKeyRing"},"SourceContext":"Microsoft.AspNetCore.DataProtection.KeyManagement.KeyRingProvider","MachineName":"sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx","Application":"ApiInteracoes.API","Environment":"DES"}}
  {"Timestamp":"2026-08-21T19:15:24.6685504+00:00","Level":"Information","MessageTemplate":"Creating key {KeyId:B} with creation date {CreationDate:u}, activation date {ActivationDate:u}, and expiration date {ExpirationDate:u}.","RenderedMessage":"Creating key {a5fc051e-6bf3-4fb8-b5e5-1e62193dbd37} with creation date 2026-08-21 19:15:24Z, activation date 2026-08-21 19:15:24Z, and expiration date 2026-11-19 19:15:24Z.","Properties":{"KeyId":"a5fc051e-6bf3-4fb8-b5e5-1e62193dbd37","CreationDate":"2026-08-21T19:15:24.6663523+00:00","ActivationDate":"2026-08-21T19:15:24.6621052+00:00","ExpirationDate":"2026-11-19T19:15:24.6621052+00:00","EventId":{"Id":58,"Name":"CreatingKey"},"SourceContext":"Microsoft.AspNetCore.DataProtection.KeyManagement.XmlKeyManager","MachineName":"sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx","Application":"ApiInteracoes.API","Environment":"DES"},"Renderings":{"KeyId":[{"Format":"B","Rendering":"{a5fc051e-6bf3-4fb8-b5e5-1e62193dbd37}"}],"CreationDate":[{"Format":"u","Rendering
  {"Timestamp":"2026-08-21T19:15:24.6787194+00:00","Level":"Debug","MessageTemplate":"Descriptor deserializer type for key {KeyId:B} is '{AssemblyQualifiedName}'.","RenderedMessage":"Descriptor deserializer type for key {a5fc051e-6bf3-4fb8-b5e5-1e62193dbd37} is '\"Microsoft.AspNetCore.DataProtection.AuthenticatedEncryption.ConfigurationModel.AuthenticatedEncryptorDescriptorDeserializer, Microsoft.AspNetCore.DataProtection, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60\"'.","Properties":{"KeyId":"a5fc051e-6bf3-4fb8-b5e5-1e62193dbd37","AssemblyQualifiedName":"Microsoft.AspNetCore.DataProtection.AuthenticatedEncryption.ConfigurationModel.AuthenticatedEncryptorDescriptorDeserializer, Microsoft.AspNetCore.DataProtection, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60","EventId":{"Id":32,"Name":"DescriptorDeserializerTypeForKeyIs"},"SourceContext":"Microsoft.AspNetCore.DataProtection.KeyManagement.XmlKeyManager","MachineName":"sirmc-api-registro-interacoes-clientes-des-7c8c8579f
  {"Timestamp":"2026-08-21T19:15:24.6808427+00:00","Level":"Debug","MessageTemplate":"No key escrow sink found. Not writing key {KeyId:B} to escrow.","RenderedMessage":"No key escrow sink found. Not writing key {a5fc051e-6bf3-4fb8-b5e5-1e62193dbd37} to escrow.","Properties":{"KeyId":"a5fc051e-6bf3-4fb8-b5e5-1e62193dbd37","EventId":{"Id":34,"Name":"NoKeyEscrowSinkFoundNotWritingKeyToEscrow"},"SourceContext":"Microsoft.AspNetCore.DataProtection.KeyManagement.XmlKeyManager","MachineName":"sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx","Application":"ApiInteracoes.API","Environment":"DES"},"Renderings":{"KeyId":[{"Format":"B","Rendering":"{a5fc051e-6bf3-4fb8-b5e5-1e62193dbd37}"}]}}
  {"Timestamp":"2026-08-21T19:15:24.6809367+00:00","Level":"Warning","MessageTemplate":"No XML encryptor configured. Key {KeyId:B} may be persisted to storage in unencrypted form.","RenderedMessage":"No XML encryptor configured. Key {a5fc051e-6bf3-4fb8-b5e5-1e62193dbd37} may be persisted to storage in unencrypted form.","Properties":{"KeyId":"a5fc051e-6bf3-4fb8-b5e5-1e62193dbd37","EventId":{"Id":35,"Name":"NoXMLEncryptorConfiguredKeyMayBePersistedToStorageInUnencryptedForm"},"SourceContext":"Microsoft.AspNetCore.DataProtection.KeyManagement.XmlKeyManager","MachineName":"sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx","Application":"ApiInteracoes.API","Environment":"DES"},"Renderings":{"KeyId":[{"Format":"B","Rendering":"{a5fc051e-6bf3-4fb8-b5e5-1e62193dbd37}"}]}}
  {"Timestamp":"2026-08-21T19:15:24.6849737+00:00","Level":"Information","MessageTemplate":"Writing data to file '{FileName}'.","RenderedMessage":"Writing data to file '\"/app/.aspnet/DataProtection-Keys/key-a5fc051e-6bf3-4fb8-b5e5-1e62193dbd37.xml\"'.","Properties":{"FileName":"/app/.aspnet/DataProtection-Keys/key-a5fc051e-6bf3-4fb8-b5e5-1e62193dbd37.xml","EventId":{"Id":39,"Name":"WritingDataToFile"},"SourceContext":"Microsoft.AspNetCore.DataProtection.Repositories.FileSystemXmlRepository","MachineName":"sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx","Application":"ApiInteracoes.API","Environment":"DES"}}
  {"Timestamp":"2026-08-21T19:15:24.6851305+00:00","Level":"Debug","MessageTemplate":"Key cache expiration token triggered by '{OperationName}' operation.","RenderedMessage":"Key cache expiration token triggered by '\"CreateNewKey\"' operation.","Properties":{"OperationName":"CreateNewKey","EventId":{"Id":23,"Name":"KeyCacheExpirationTokenTriggeredByOperation"},"SourceContext":"Microsoft.AspNetCore.DataProtection.KeyManagement.XmlKeyManager","MachineName":"sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx","Application":"ApiInteracoes.API","Environment":"DES"}}
  {"Timestamp":"2026-08-21T19:15:24.6856060+00:00","Level":"Debug","MessageTemplate":"Reading data from file '{FullPath}'.","RenderedMessage":"Reading data from file '\"/app/.aspnet/DataProtection-Keys/key-a5fc051e-6bf3-4fb8-b5e5-1e62193dbd37.xml\"'.","Properties":{"FullPath":"/app/.aspnet/DataProtection-Keys/key-a5fc051e-6bf3-4fb8-b5e5-1e62193dbd37.xml","EventId":{"Id":37,"Name":"ReadingDataFromFile"},"SourceContext":"Microsoft.AspNetCore.DataProtection.Repositories.FileSystemXmlRepository","MachineName":"sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx","Application":"ApiInteracoes.API","Environment":"DES"}}
  {"Timestamp":"2026-08-21T19:15:24.6876370+00:00","Level":"Debug","MessageTemplate":"Found key {KeyId:B}.","RenderedMessage":"Found key {a5fc051e-6bf3-4fb8-b5e5-1e62193dbd37}.","Properties":{"KeyId":"a5fc051e-6bf3-4fb8-b5e5-1e62193dbd37","EventId":{"Id":18,"Name":"FoundKey"},"SourceContext":"Microsoft.AspNetCore.DataProtection.KeyManagement.XmlKeyManager","MachineName":"sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx","Application":"ApiInteracoes.API","Environment":"DES"},"Renderings":{"KeyId":[{"Format":"B","Rendering":"{a5fc051e-6bf3-4fb8-b5e5-1e62193dbd37}"}]}}
  {"Timestamp":"2026-08-21T19:15:24.6899130+00:00","Level":"Debug","MessageTemplate":"Considering key {KeyId:B} with expiration date {ExpirationDate:u} as default key.","RenderedMessage":"Considering key {a5fc051e-6bf3-4fb8-b5e5-1e62193dbd37} with expiration date 2026-11-19 19:15:24Z as default key.","Properties":{"KeyId":"a5fc051e-6bf3-4fb8-b5e5-1e62193dbd37","ExpirationDate":"2026-11-19T19:15:24.6621052+00:00","EventId":{"Id":13,"Name":"ConsideringKeyWithExpirationDateAsDefaultKey"},"SourceContext":"Microsoft.AspNetCore.DataProtection.KeyManagement.DefaultKeyResolver","MachineName":"sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx","Application":"ApiInteracoes.API","Environment":"DES"},"Renderings":{"KeyId":[{"Format":"B","Rendering":"{a5fc051e-6bf3-4fb8-b5e5-1e62193dbd37}"}],"ExpirationDate":[{"Format":"u","Rendering":"2026-11-19 19:15:24Z"}]}}
  {"Timestamp":"2026-08-21T19:15:24.6908521+00:00","Level":"Debug","MessageTemplate":"Forwarded activator type request from {FromType} to {ToType}","RenderedMessage":"Forwarded activator type request from \"Microsoft.AspNetCore.DataProtection.AuthenticatedEncryption.ConfigurationModel.AuthenticatedEncryptorDescriptorDeserializer, Microsoft.AspNetCore.DataProtection, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60\" to \"Microsoft.AspNetCore.DataProtection.AuthenticatedEncryption.ConfigurationModel.AuthenticatedEncryptorDescriptorDeserializer, Microsoft.AspNetCore.DataProtection, Culture=neutral, PublicKeyToken=adb9793829ddae60\"","Properties":{"FromType":"Microsoft.AspNetCore.DataProtection.AuthenticatedEncryption.ConfigurationModel.AuthenticatedEncryptorDescriptorDeserializer, Microsoft.AspNetCore.DataProtection, Version=8.0.0.0, Culture=neutral, PublicKeyToken=adb9793829ddae60","ToType":"Microsoft.AspNetCore.DataProtection.AuthenticatedEncryption.ConfigurationModel.AuthenticatedEncryptorDesc
  {"Timestamp":"2026-08-21T19:15:24.7442475+00:00","Level":"Debug","MessageTemplate":"Using managed symmetric algorithm '{FullName}'.","RenderedMessage":"Using managed symmetric algorithm '\"System.Security.Cryptography.Aes\"'.","Properties":{"FullName":"System.Security.Cryptography.Aes","EventId":{"Id":11,"Name":"UsingManagedSymmetricAlgorithm"},"SourceContext":"Microsoft.AspNetCore.DataProtection.AuthenticatedEncryption.ManagedAuthenticatedEncryptorFactory","MachineName":"sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx","Application":"ApiInteracoes.API","Environment":"DES"}}
  {"Timestamp":"2026-08-21T19:15:24.7444292+00:00","Level":"Debug","MessageTemplate":"Using managed keyed hash algorithm '{FullName}'.","RenderedMessage":"Using managed keyed hash algorithm '\"System.Security.Cryptography.HMACSHA256\"'.","Properties":{"FullName":"System.Security.Cryptography.HMACSHA256","EventId":{"Id":10,"Name":"UsingManagedKeyedHashAlgorithm"},"SourceContext":"Microsoft.AspNetCore.DataProtection.AuthenticatedEncryption.ManagedAuthenticatedEncryptorFactory","MachineName":"sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx","Application":"ApiInteracoes.API","Environment":"DES"}}
  {"Timestamp":"2026-08-21T19:15:24.7459725+00:00","Level":"Debug","MessageTemplate":"Using key {KeyId:B} as the default key.","RenderedMessage":"Using key {a5fc051e-6bf3-4fb8-b5e5-1e62193dbd37} as the default key.","Properties":{"KeyId":"a5fc051e-6bf3-4fb8-b5e5-1e62193dbd37","EventId":{"Id":2,"Name":"UsingKeyAsDefaultKey"},"SourceContext":"Microsoft.AspNetCore.DataProtection.KeyManagement.KeyRingProvider","MachineName":"sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx","Application":"ApiInteracoes.API","Environment":"DES"},"Renderings":{"KeyId":[{"Format":"B","Rendering":"{a5fc051e-6bf3-4fb8-b5e5-1e62193dbd37}"}]}}
  {"Timestamp":"2026-08-21T19:15:24.7464977+00:00","Level":"Debug","MessageTemplate":"Key ring with default key {KeyId:B} was loaded during application startup.","RenderedMessage":"Key ring with default key {a5fc051e-6bf3-4fb8-b5e5-1e62193dbd37} was loaded during application startup.","Properties":{"KeyId":"a5fc051e-6bf3-4fb8-b5e5-1e62193dbd37","EventId":{"Id":65,"Name":"KeyRingWasLoadedOnStartup"},"SourceContext":"Microsoft.AspNetCore.DataProtection.Internal.DataProtectionHostedService","MachineName":"sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx","Application":"ApiInteracoes.API","Environment":"DES"},"Renderings":{"KeyId":[{"Format":"B","Rendering":"{a5fc051e-6bf3-4fb8-b5e5-1e62193dbd37}"}]}}
  {"Timestamp":"2026-08-21T19:15:25.6537555+00:00","Level":"Information","MessageTemplate":"Now listening on: {address}","RenderedMessage":"Now listening on: \"http://[::]:8080\"","Properties":{"address":"http://[::]:8080","EventId":{"Id":14,"Name":"ListeningOnAddress"},"SourceContext":"Microsoft.Hosting.Lifetime","MachineName":"sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx","Application":"ApiInteracoes.API","Environment":"DES"}}
  {"Timestamp":"2026-08-21T19:15:25.6538919+00:00","Level":"Debug","MessageTemplate":"Loaded hosting startup assembly {assemblyName}","RenderedMessage":"Loaded hosting startup assembly \"ApiInteracoes.API\"","Properties":{"assemblyName":"ApiInteracoes.API","EventId":{"Id":13,"Name":"HostingStartupAssemblyLoaded"},"SourceContext":"Microsoft.AspNetCore.Hosting.Diagnostics","MachineName":"sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx","Application":"ApiInteracoes.API","Environment":"DES"}}
  {"Timestamp":"2026-08-21T19:15:25.6540221+00:00","Level":"Information","MessageTemplate":"Application started. Press Ctrl+C to shut down.","RenderedMessage":"Application started. Press Ctrl+C to shut down.","Properties":{"SourceContext":"Microsoft.Hosting.Lifetime","MachineName":"sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx","Application":"ApiInteracoes.API","Environment":"DES"}}
  {"Timestamp":"2026-08-21T19:15:25.6541188+00:00","Level":"Information","MessageTemplate":"Hosting environment: {EnvName}","RenderedMessage":"Hosting environment: \"DES\"","Properties":{"EnvName":"DES","SourceContext":"Microsoft.Hosting.Lifetime","MachineName":"sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx","Application":"ApiInteracoes.API","Environment":"DES"}}
  {"Timestamp":"2026-08-21T19:15:25.6541939+00:00","Level":"Information","MessageTemplate":"Content root path: {ContentRoot}","RenderedMessage":"Content root path: \"/app\"","Properties":{"ContentRoot":"/app","SourceContext":"Microsoft.Hosting.Lifetime","MachineName":"sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx","Application":"ApiInteracoes.API","Environment":"DES"}}
  {"Timestamp":"2026-08-21T19:15:25.6542615+00:00","Level":"Debug","MessageTemplate":"Hosting started","RenderedMessage":"Hosting started","Properties":{"EventId":{"Id":2,"Name":"Started"},"SourceContext":"Microsoft.Extensions.Hosting.Internal.Host","MachineName":"sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx","Application":"ApiInteracoes.API","Environment":"DES"}}
  {"Timestamp":"2026-08-21T19:15:41.6522143+00:00","Level":"Error","MessageTemplate":"Health check {HealthCheckName} with status {HealthStatus} completed after {ElapsedMilliseconds}ms with message '{HealthCheckDescription}'","RenderedMessage":"Health check \"database\" with status Unhealthy completed after 898.2016ms with message 'null'","TraceId":"ce68f884a481868294bb1f2b391e1a40","SpanId":"313e2c01339f164d","Properties":{"HealthCheckName":"database","HealthStatus":"Unhealthy","ElapsedMilliseconds":898.2016,"HealthCheckDescription":null,"EventId":{"Id":103,"Name":"HealthCheckEnd"},"SourceContext":"Microsoft.Extensions.Diagnostics.HealthChecks.DefaultHealthCheckService","RequestId":"0HNNVN2BEHJK8:00000001","RequestPath":"/healthz","ConnectionId":"0HNNVN2BEHJK8","MachineName":"sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx","Application":"ApiInteracoes.API","Environment":"DES"}}
  {"Timestamp":"2026-08-21T19:15:41.6623585+00:00","Level":"Error","MessageTemplate":"HTTP {RequestMethod} {RequestPath} responded {StatusCode} in {Elapsed:0.0000} ms","RenderedMessage":"HTTP \"GET\" \"/healthz\" responded 500 in 1170.0742 ms","TraceId":"ce68f884a481868294bb1f2b391e1a40","SpanId":"313e2c01339f164d","Exception":"System.Threading.Tasks.TaskCanceledException: A task was canceled.\n   at Microsoft.Extensions.Diagnostics.HealthChecks.DefaultHealthCheckService.CheckHealthAsync(Func`2 predicate, CancellationToken cancellationToken)\n   at Microsoft.AspNetCore.Diagnostics.HealthChecks.HealthCheckMiddleware.InvokeAsync(HttpContext httpContext)\n   at Microsoft.AspNetCore.Routing.EndpointMiddleware.<Invoke>g__AwaitRequestTask|7_0(Endpoint endpoint, Task requestTask, ILogger logger)\n   at Microsoft.AspNetCore.Authorization.AuthorizationMiddleware.Invoke(HttpContext context)\n   at Microsoft.AspNetCore.Authentication.AuthenticationMiddleware.Invoke(HttpContext context)\n   at Serilog.AspNetCore.RequestLog
  ================================================
  Script executado com sucesso!
  Pod utilizado: sirmc-api-registro-interacoes-clientes-des-7c8c8579ff-xh2fx
  Falha na sincronização
  Error: Process completed with exit code 1.
