nova demadna:

Favor verificar o problema tanto em TQS quanto em DES quando estou tentando fazer deploy na esteira do github actions.
com o erro de falha na sincronização do POD mesmo sem erro aparente.

Para o ambiente TQS foi esta tentativa:
https://github.com/caixagithub/sigec-opf/actions/runs/26474538432

Para o ambiente de DES foi esta tentativa:
https://github.com/caixagithub/sigec-opf/actions/runs/26468901287

No pod de TQS estou com erro de secret para o keyvault conforme mensagem abaixo que está em log do fusionx:
 
I0526 18:04:58.638815       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sigec-opf/akvs-jdbc-sql-authentication2" env="SPRING__DATASOURCE__PASSWORD"

E0526 18:04:58.776993       1 main.go:330] "failed to read secret from azure key vault" err=<
GET https://kv-crc-nprd.vault.azure.net/secrets/apim-tqs-caixa/
--------------------------------------------------------------------------------
RESPONSE 404: 404 Not Found
ERROR CODE: SecretNotFound
--------------------------------------------------------------------------------
{
  "error": {
    "code": "SecretNotFound",
    "message": "A secret with (name/id) apim-tqs-caixa was not found in this key vault. If you recently deleted this secret you may be able to recover it using the correct recovery command. For help resolving this issue, please see https://go.microsoft.com/fwlink/?linkid=2125182
"
  }
}
--------------------------------------------------------------------------------
> azurekeyvaultsecret="sigec-opf/akvs-api-tqs-caixa".



m e ajuda a resolver isso nno gitops..

foi criado recentemente ambiend de tqs... na osei se tem relao se foi cirado de forma errada.


Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
sigec-opf
Repository navigation
Code
Issues
2
 (2)
Pull requests
1
 (1)
Actions
Projects
Models
Wiki
Security and quality
4
 (4)
Insights
Settings
CI/CD Workflow
caixagithub/sigec-opf_dev_26468901287.393 #393
All jobs
Run details
Annotations
1 error and 1 warning
CI_DES / ArgoCD_Deploy / ArgoCD_Deploy (DES)
failed 7 hours ago in 11m 23s
Search logs
10s
1s
0s
0s
0s
0s
0s
0s
0s
0s
0s
0s
23s
0s
6s
0s
5s
0s
0s
0s
21s
5s
0s
0s
1s
10m 4s
0s
Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/logs@main
Run echo "REPO_NAME=$(echo 'caixagithub/sigec-opf' | cut -d'/' -f2)" >> $GITHUB_ENV
INPUT_IMAGE_TAG: '26468901287'
Run RESOURCE_TREE_URL="https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/sigec-opf-des/resource-tree?appNamespace=openshift-gitops"
Fazendo requisição para: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/sigec-opf-des/resource-tree?appNamespace=openshift-gitops
Resource-tree obtido com sucesso
Filtrando pods e encontrando o mais recente...
Pod mais recente encontrado: sigec-opf-des-58df8799dc-k2bpv
URL dos logs: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/sigec-opf-des/logs?appNamespace=openshift-gitops&container=sigec-opf-des&namespace=sigec-opf&follow=false&podName=sigec-opf-des-58df8799dc-k2bpv&tailLines=1000&sinceSeconds=0
Logs obtidos com sucesso
Logs do pod sigec-opf-des-58df8799dc-k2bpv:
================================================
Exibindo os Logs:
I0528 06:20:09.446868       1 version.go:31] "version info" version="" commit="0eef8df" buildDate="2025-05-19T06:17:15Z" component="vaultenv"
I0528 06:20:09.447001       1 main.go:184] "azure key vault env injector initializing"
I0528 06:20:09.447213       1 main.go:253] "found original container command" cmd="/usr/bin/java" args=["java","-jar","./app.jar"]
I0528 06:20:09.447270       1 authentication.go:110] "checking if current auth service credentials are stale" url="http://akv2k8s-envinjector.akv2k8s.svc:80/auth/sigec-opf/sigec-opf-des-58df8799dc-k2bpv?secret=akv2k8s-sigec-opf-des"
I0528 06:20:09.535268       1 authentication.go:123] "auth service credentials ok" url="http://akv2k8s-envinjector.akv2k8s.svc:80/auth/sigec-opf/sigec-opf-des-58df8799dc-k2bpv?secret=akv2k8s-sigec-opf-des"
I0528 06:20:09.535583       1 authentication.go:159] "requesting azure key vault oauth token" url="https://akv2k8s-envinjector.akv2k8s.svc:9443/auth/sigec-opf/sigec-opf-des-58df8799dc-k2bpv"
I0528 06:20:09.567679       1 authentication.go:179] "successfully received oauth token"
I0528 06:20:09.702756       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sigec-opf/akvs-login-des-caixa" env="login_key"
I0528 06:20:09.769040       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sigec-opf/akvs-api-sigec-opf" env="API_KEY"
I0528 06:20:09.825412       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sigec-opf/akvs-api-des-caixa" env="apim-key"
I0528 06:20:09.899148       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="sigec-opf/akvs-jdbc-sql-authentication2" env="SPRING__DATASOURCE__PASSWORD"
I0528 06:20:09.899181       1 main.go:343] "starting process with secrets in env vars" cmd="/usr/bin/java" args=["java","-jar","./app.jar"]
WARNING: A Java agent has been loaded dynamically (/tmp/otel-agent14414831316539717513/agent.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.5.3)

2026-05-28T06:20:38.804-03:00  INFO 1 --- [opf] [           main] br.gov.caixa.sigec.opf.OpfApplication    : Starting OpfApplication v28.6.0.0 using Java 21.0.8 with PID 1 (/home/jboss/app.jar started by jboss in /home/jboss)
2026-05-28T06:20:38.922-03:00  INFO 1 --- [opf] [           main] br.gov.caixa.sigec.opf.OpfApplication    : No active profile set, falling back to 1 default profile: "default"
2026-05-28T06:20:52.641-03:00  INFO 1 --- [opf] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
0s
0s
0s
0s
0s
0s
0s
1s
0s

