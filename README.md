Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
silce-backend-valida-assinatura
Repository navigation
Code
Issues
Pull requests
2
 (2)
Actions
Projects
Models
Wiki
Security and quality
5
 (5)
Insights
Settings
CI/CD Workflow Generic
caixagithub/silce-backend-valida-assinatura_main_30029704866.7 #7
All jobs
Run details
Annotations
1 error and 1 warning
deploy - [silce-backend-valida-assinatura] / ArgoCD_Deploy / ArgoCD_Deploy (DES)
failed 7 minutes ago in 3m 3s
Search logs
13s
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
0s
31s
0s
5s
0s
4s
0s
1s
0s
21s
4s
0s
0s
1s
1m 20s
1s
16s
Run caixagithub/DevSecOps-Actions/.github/integrations/apim/import/dotnet@main
Install Az CLI
12s
Login on Azure
4s
Publish API to APIM
1s
Run set -x  # Ativa o modo de depuração
  + echo 'Iniciando a publicação da API para APIM...'
  Iniciando a publicação da API para APIM...
  Verificando a URL do Swagger: http://silce-backend-valida-assinatura.apl.des-nprd.private.azure/q/openapi
  + swaggerUrl=http://silce-backend-valida-assinatura.apl.des-nprd.private.azure/q/openapi
  + echo 'Verificando a URL do Swagger: http://silce-backend-valida-assinatura.apl.des-nprd.private.azure/q/openapi'
  ++ curl -k --max-time 10 --write-out '%{http_code}' --silent --output /dev/null http://silce-backend-valida-assinatura.apl.des-nprd.private.azure/q/openapi
  + httpStatus=000
  Error: Process completed with exit code 6.
0s
0s
0s
0s
0s
0s
1s
0s
0s



deu bom passou 


I0723 14:36:12.609767       1 version.go:31] "version info" version="" commit="1e11cd2" buildDate="2024-10-04T10:20:06Z" component="vaultenv"
I0723 14:36:12.609895       1 main.go:184] "azure key vault env injector initializing"
I0723 14:36:12.610089       1 main.go:253] "found original container command" cmd="/usr/bin/java" args=["java","-jar","/opt/deploy/quarkus-run.jar"]
I0723 14:36:12.610140       1 authentication.go:110] "checking if current auth service credentials are stale" url="http://akv2k8s-envinjector.akv2k8s.svc:80/auth/silce-backend-valida-assinatura/silce-backend-valida-assinatura-des-6986b8dc7b-nm4b7?secret=akv2k8s-silce-backend-valida-assinatura-des"
I0723 14:36:12.685227       1 authentication.go:123] "auth service credentials ok" url="http://akv2k8s-envinjector.akv2k8s.svc:80/auth/silce-backend-valida-assinatura/silce-backend-valida-assinatura-des-6986b8dc7b-nm4b7?secret=akv2k8s-silce-backend-valida-assinatura-des"
I0723 14:36:12.685487       1 authentication.go:159] "requesting azure key vault oauth token" url="https://akv2k8s-envinjector.akv2k8s.svc:9443/auth/silce-backend-valida-assinatura/silce-backend-valida-assinatura-des-6986b8dc7b-nm4b7"
I0723 14:36:12.715924       1 authentication.go:179] "successfully received oauth token"
I0723 14:36:12.910128       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="silce-backend-valida-assinatura/akvs-env-siper-password" env="CICS_PASSWORD"
I0723 14:36:12.910159       1 main.go:343] "starting process with secrets in env vars" cmd="/usr/bin/java" args=["java","-jar","/opt/deploy/quarkus-run.jar"]
__  ____  __  _____   ___  __ ____  ______
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-07-23 14:36:15,746 WARN  [io.qua.cxf.fea.dep.log.DeprecatedLoggingRecorder] (main) io.quarkiverse.cxf:quarkus-cxf-rt-features-logging is deprecated and will be removed in the future. Use io.quarkiverse.cxf:quarkus-cxf instead.
2026-07-23 14:36:17,147 INFO  [io.quarkus] (main) backend-valida-assinatura 1.0.0 on JVM (powered by Quarkus 3.27.1) started in 4.179s. Listening on: http://0.0.0.0:8080
2026-07-23 14:36:17,147 INFO  [io.quarkus] (main) Profile prod activated.
2026-07-23 14:36:17,148 INFO  [io.quarkus] (main) Installed features: [cdi, cxf, hibernate-va

<img width="1630" height="904" alt="image" src="https://github.com/user-attachments/assets/2b29916e-2b95-4bcc-a102-8d6c97efd54f" />

