Favor verificar,  	Erro ao rodar a pipeline TQS em Actions, no github.

Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/logs@main
Run echo "REPO_NAME=$(echo 'caixagithub/sibko-originacao-digital-api-dossie' | cut -d'/' -f2)" >> $GITHUB_ENV
INPUT_IMAGE_TAG: '27765539065'
Run RESOURCE_TREE_URL="https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/sibko-originacao-digital-api-dossie-tqs/resource-tree?appNamespace=openshift-gitops"
Fazendo requisição para: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/sibko-originacao-digital-api-dossie-tqs/resource-tree?appNamespace=openshift-gitops
Resource-tree obtido com sucesso
Filtrando pods e encontrando o mais recente...
Pod mais recente encontrado: sibko-originacao-digital-api-dossie-tqs-8d478bc94-lvhhk
URL dos logs: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/sibko-originacao-digital-api-dossie-tqs/logs?appNamespace=openshift-gitops&container=sibko-originacao-digital-api-dossie-tqs&namespace=sibko-originacao-digital-api-dossie&follow=false&podName=sibko-originacao-digital-api-dossie-tqs-8d478bc94-lvhhk&tailLines=1000&sinceSeconds=0
Logs obtidos com sucesso
Logs do pod sibko-originacao-digital-api-dossie-tqs-8d478bc94-lvhhk:
================================================
Exibindo os Logs:
I0618 16:26:16.548246       1 version.go:31] "version info" version="" commit="0eef8df" buildDate="2025-05-19T06:17:15Z" component="vaultenv"
I0618 16:26:16.548329       1 main.go:184] "azure key vault env injector initializing"
I0618 16:26:16.548477       1 main.go:253] "found original container command" cmd="/usr/bin/dotnet" args=["dotnet","SIBKO.OriginacaoDigitalApiDossie.dll"]
I0618 16:26:16.548535       1 authentication.go:110] "checking if current auth service credentials are stale" url="http://akv2k8s-envinjector.akv2k8s.svc:80/auth/sibko-originacao-digital-api-dossie/sibko-originacao-digital-api-dossie-tqs-8d478bc94-lvhhk?secret=akv2k8s-sibko-originacao-digital-api-dossie-tqs"
I0618 16:26:16.624174       1 authentication.go:123] "auth service credentials ok" url="http://akv2k8s-envinjector.akv2k8s.svc:80/auth/sibko-originacao-digital-api-dossie/sibko-originacao-digital-api-dossie-tqs-8d478bc94-lvhhk?secret=akv2k8s-sibko-originacao-digital-api-dossie-tqs"
I0618 16:26:16.624507       1 authentication.go:159] "requesting azure key vault oauth token" url="https://akv2k8s-envinjector.akv2k8s.svc:9443/auth/sibko-originacao-digital-api-dossie/sibko-originacao-digital-api-dossie-tqs-8d478bc94-lvhhk"
I0618 16:26:16.655601       1 authentication.go:179] "successfully received oauth token"
I0618 16:26:16.761311       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sibko-originacao-digital-api-dossie/akvs-tkn-keyintranet-kid-edo-sibko-tqs" env="Tkn__keyIntranet__kid"
I0618 16:26:16.808117       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sibko-originacao-digital-api-dossie/akvs-apimanager-apikey-edo-sibko-tqs" env="ApiManager__Apikey"
I0618 16:26:16.859408       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sibko-originacao-digital-api-dossie/akvs-tkn-keyinternet-kid-edo-sibko-tqs" env="Tkn__keyInternet__kid"
I0618 16:26:16.914465       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sibko-originacao-digital-api-dossie/akvs-tkn-keyinternet-n-edo-sibko-tqs" env="Tkn__keyInternet__n"
I0618 16:26:16.952821       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sibko-originacao-digital-api-dossie/akvs-applicationinsights-connection-string-edo-sibko-tqs" env="ApplicationInsights__ConnectionString"
I0618 16:26:17.000053       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sibko-originacao-digital-api-dossie/akvs-sso-client-server-secret-edo-sibko-tqs" env="Tkn__UserServ__ClientSecret"
I0618 16:26:17.068178       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sibko-originacao-digital-api-dossie/akvs-database-default-password-edo-sibko-des" env="Database__Default__Password"
I0618 16:26:17.105999       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sibko-originacao-digital-api-dossie/akvs-tkn-keyintranet-n-edo-sibko-tqs" env="Tkn__keyIntranet__n"
I0618 16:26:17.106037       1 main.go:343] "starting process with secrets in env vars" cmd="/usr/bin/dotnet" args=["dotnet","SIBKO.OriginacaoDigitalApiDossie.dll"]

================================================
Script executado com sucesso!
Pod utilizado: sibko-originacao-digital-api-dossie-tqs-8d478bc94-lvhhk
Falha na sincronização
Error: Process completed with exit code 1.
