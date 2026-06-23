fiz o commit e ele fez na main

Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
gitops
Repository navigation
Code
Issues
Pull requests
8
 (8)
Actions
Projects
Models
Wiki
Security and quality
Insights
Settings
Commits
Breadcrumbs
History for
gitopsappssiacx-chatcaixa-mcp-serverdesconfig.yaml
onmain
User selector
Datepicker
Commit History
Commits on Jun 23, 2026
Update config.yaml
p585600_caixa
Jesse Mouta Pereira Batista (p585600_caixa)
authored
14 minutes ago
Verified
Commits on Apr 28, 2026
Adicionar configuração ArgoCD (Infra NPRD) para: siacx-chatcaixa-mcp-server
devhub-connect-emu[bot]
devhub-connect-emu[bot]
authored
on Apr 28
Verified
End of commit history for this file
Footer
© 2026 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Community
Docs
Contact
Manage cookies
Do not share my personal information


porem ao rodar aqui na dev

deu o memso problema

Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
siacx-chatcaixa-mcp-server
Repository navigation
Code
Issues
Pull requests
Actions
Projects
Models
Wiki
Security and quality
2
 (2)
Insights
Settings
CI/CD Workflow Generic
caixagithub/siacx-chatcaixa-mcp-server_dev_28042976043.5 #5
All jobs
Run details
Annotations
1 error and 1 warning
CI_DES / ArgoCD_Deploy / ArgoCD_Deploy (DES)
failed 9 minutes ago in 1m 17s
Search logs
9s
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
25s
0s
5s
0s
4s
0s
1s
0s
21s
5s
0s
Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/argocd-get-destination@main
Run set -euo pipefail
ENVIRONMENT_LOWER=des
APP_NAME_LOWER=siacx-chatcaixa-mcp-server
Falha ao obter Application ou erro retornado:
{"error":"permission denied","code":7,"message":"permission denied"}
Error: Process completed with exit code 1.
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
1s
0s


na verdade acho que an otem relçao.. com oqe faz pra que aqui receba a aplicação


e aqcabei de verificar no argo cd ele ja criou a aplicação:



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
9
OutOfSync
0
HEALTH STATUS
Progressing
2
Suspended
0
Healthy
4
Degraded
1
Missing
0
Unknown
0
NAMESPACES
NAMESPACES
Show Orphaned
Applications
 siacx-chatcaixa-mcp-server-des
Application Details List
Log out
APP HEALTH 
 Progressing
SYNC STATUS 

 Synced
to HEAD (8a2d341)
Auto sync is enabled.
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #3 from caixagithub/update-image-siacx-chatca
LAST SYNC 

 Sync OK
to 8a2d341
Succeeded 9 minutes ago (Tue Jun 23 2026 14:09:50 GMT-0300)
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #3 from caixagithub/update-image-siacx-chatca
APP CONDITIONS
 1 Warning
Previous12Next
Items per page: 10 
NAME
GROUP/KIND
SYNC ORDER
NAMESPACE
CREATED AT
STATUS
Endpoints
ep
siacx-chatcaixa-mcp-server-des
Endpoints
-
siacx-chatcaixa-mcp-server
9 minutes ago   06/23/26
Pod
pod
siacx-chatcaixa-mcp-server-des-c886bc7cc-r9cch
Pod
-
siacx-chatcaixa-mcp-server
9 minutes ago   06/23/26
 Degraded  
Secret
secret
api-chat-mcp-server-des-caixa
Secret
-
aks-istio-ingress
9 minutes ago   06/23/26
Secret
secret
akv2k8s-siacx-chatcaixa-mcp-server-des
Secret
-
siacx-chatcaixa-mcp-server
9 minutes ago   06/23/26
Service
svc
siacx-chatcaixa-mcp-server-des
Service
-
siacx-chatcaixa-mcp-server
9 minutes ago   06/23/26
 Healthy   Synced
Deployment
deploy
siacx-chatcaixa-mcp-server-des
apps/Deployment
-
siacx-chatcaixa-mcp-server
9 minutes ago   06/23/26
 Progressing   Synced
ReplicaSet
rs
siacx-chatcaixa-mcp-server-des-c886bc7cc
apps/ReplicaSet
-
siacx-chatcaixa-mcp-server
9 minutes ago   06/23/26
 Progressing  
HorizontalPodAutoscaler
hpa
siacx-chatcaixa-mcp-server-des
autoscaling/HorizontalPodAutoscaler
-
siacx-chatcaixa-mcp-server
9 minutes ago   06/23/26
 Healthy   Synced
EndpointSlice
endpointslice
siacx-chatcaixa-mcp-server-des-lhcl5
discovery.k8s.io/EndpointSlice
-
siacx-chatcaixa-mcp-server
9 minutes ago   06/23/26
ConfigMap
cm
cm-siacx-chatcaixa-mcp-server
ConfigMap
-
siacx-chatcaixa-mcp-server
9 minutes ago   06/23/26
 Synced
Previous12Next
Items per page: 10 





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
9
OutOfSync
0
HEALTH STATUS
Progressing
1
Suspended
0
Healthy
4
Degraded
2
Missing
0
Unknown
0
NAMESPACES
NAMESPACES
Show Orphaned
Applications
 siacx-chatcaixa-mcp-server-des
Application Details List
Log out
APP HEALTH 
 Degraded
SYNC STATUS 

 Synced
to HEAD (8a2d341)
Auto sync is enabled.
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #3 from caixagithub/update-image-siacx-chatca
LAST SYNC 

 Sync OK
to 8a2d341
Succeeded 10 minutes ago (Tue Jun 23 2026 14:09:50 GMT-0300)
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #3 from caixagithub/update-image-siacx-chatca
APP CONDITIONS
 1 Warning
Previous12Next
Items per page: 10 
NAME
GROUP/KIND
SYNC ORDER
NAMESPACE
CREATED AT
STATUS
Endpoints
ep
siacx-chatcaixa-mcp-server-des
Endpoints
-
siacx-chatcaixa-mcp-server
10 minutes ago   06/23/26
Pod
pod
siacx-chatcaixa-mcp-server-des-c886bc7cc-r9cch
Pod
-
siacx-chatcaixa-mcp-server
10 minutes ago   06/23/26
 Degraded  
Secret
secret
api-chat-mcp-server-des-caixa
Secret
-
aks-istio-ingress
10 minutes ago   06/23/26
Secret
secret
akv2k8s-siacx-chatcaixa-mcp-server-des
Secret
-
siacx-chatcaixa-mcp-server
10 minutes ago   06/23/26
Service
svc
siacx-chatcaixa-mcp-server-des
Service
-
siacx-chatcaixa-mcp-server
10 minutes ago   06/23/26
 Healthy   Synced
Deployment
deploy
siacx-chatcaixa-mcp-server-des
apps/Deployment
-
siacx-chatcaixa-mcp-server
10 minutes ago   06/23/26
 Degraded   Synced
ReplicaSet
rs
siacx-chatcaixa-mcp-server-des-c886bc7cc
apps/ReplicaSet
-
siacx-chatcaixa-mcp-server
10 minutes ago   06/23/26
 Progressing  
HorizontalPodAutoscaler
hpa
siacx-chatcaixa-mcp-server-des
autoscaling/HorizontalPodAutoscaler
-
siacx-chatcaixa-mcp-server
10 minutes ago   06/23/26
 Healthy   Synced
EndpointSlice
endpointslice
siacx-chatcaixa-mcp-server-des-lhcl5
discovery.k8s.io/EndpointSlice
-
siacx-chatcaixa-mcp-server
10 minutes ago   06/23/26
ConfigMap
cm
cm-siacx-chatcaixa-mcp-server
ConfigMap
-
siacx-chatcaixa-mcp-server
10 minutes ago   06/23/26
 Synced
Previous12Next
Items per page: 10 

Podpod
siacx-chatcaixa-mcp-server-des-c886bc7cc-r9cch
 SUMMARY EVENTS LOGS
REASON
MESSAGE
COUNT
FIRST OCCURRED
LAST OCCURRED
Pulling
Pulling image "acrcentralcaixanprd.azurecr.io/siacx/chatcaixa-mcp-server/siacx-chatcaixa-mcp-server:28042976043"
7
9m ago
Today at 2:09 PM
3m ago
Today at 2:15 PM
BackOff
Back-off restarting failed container siacx-chatcaixa-mcp-server-des in pod siacx-chatcaixa-mcp-server-des-c886bc7cc-r9cch_siacx-chatcaixa-mcp-server(95b2fdd0-c04c-4859-9a30-f276f93c4cc5)
26
9m ago
Today at 2:10 PM
4m ago
Today at 2:15 PM
Pulled
Successfully pulled image "acrcentralcaixanprd.azurecr.io/siacx/chatcaixa-mcp-server/siacx-chatcaixa-mcp-server:28042976043" in 73ms (73ms including waiting). Image size: 187422943 bytes.
1
6m ago
Today at 2:13 PM
6m ago
Today at 2:13 PM
Created
Created container: siacx-chatcaixa-mcp-server-des
5
9m ago
Today at 2:09 PM
8m ago
Today at 2:11 PM
Started
Started container siacx-chatcaixa-mcp-server-des
5
9m ago
Today at 2:09 PM
8m ago
Today at 2:11 PM
Pulled
Successfully pulled image "acrcentralcaixanprd.azurecr.io/siacx/chatcaixa-mcp-server/siacx-chatcaixa-mcp-server:28042976043" in 71ms (71ms including waiting). Image size: 187422943 bytes.
1
8m ago
Today at 2:11 PM
8m ago
Today at 2:11 PM
Pulled
Successfully pulled image "acrcentralcaixanprd.azurecr.io/siacx/chatcaixa-mcp-server/siacx-chatcaixa-mcp-server:28042976043" in 62ms (62ms including waiting). Image size: 187422943 bytes.
1
9m ago
Today at 2:10 PM
9m ago
Today at 2:10 PM
Pulled
Successfully pulled image "acrcentralcaixanprd.azurecr.io/siacx/chatcaixa-mcp-server/siacx-chatcaixa-mcp-server:28042976043" in 60ms (60ms including waiting). Image size: 187422943 bytes.
1
9m ago
Today at 2:10 PM
9m ago
Today at 2:10 PM
Pulled
Successfully pulled image "acrcentralcaixanprd.azurecr.io/siacx/chatcaixa-mcp-server/siacx-chatcaixa-mcp-server:28042976043" in 55ms (55ms including waiting). Image size: 187422943 bytes.
1
9m ago
Today at 2:10 PM
9m ago
Today at 2:10 PM
Pulled
Successfully pulled image "acrcentralcaixanprd.azurecr.io/siacx/chatcaixa-mcp-server/siacx-chatcaixa-mcp-server:28042976043" in 2.512s (2.512s including waiting). Image size: 187422943 bytes.
1
9m ago
Today at 2:09 PM
9m ago
Today at 2:09 PM
Pulled
Container image "spvest/azure-keyvault-env:1.7.4" already present on machine
1
10m ago
Today at 2:09 PM
10m ago
Today at 2:09 PM
Created
Created container: copy-azurekeyvault-env
1
10m ago
Today at 2:09 PM
10m ago
Today at 2:09 PM
Started
Started container copy-azurekeyvault-env
1
10m ago
Today at 2:09 PM
10m ago
Today at 2:09 PM
Scheduled
Successfully assigned siacx-chatcaixa-mcp-server/siacx-chatcaixa-mcp-server-des-c886bc7cc-r9cch to aks-workloads-98993596-vmss00014y
10m ago
Today at 2:09 PM
10m ago
Today at 2:09 PM


segue log:


I0623 17:15:58.013901       1 version.go:31] "version info" version="" commit="0eef8df" buildDate="2025-05-19T06:17:15Z" component="vaultenv"
I0623 17:15:58.013992       1 main.go:184] "azure key vault env injector initializing"
I0623 17:15:58.014302       1 main.go:253] "found original container command" cmd="/usr/local/bin/python" args=["python","-m","src.main"]
I0623 17:15:58.014366       1 authentication.go:110] "checking if current auth service credentials are stale" url="http://akv2k8s-envinjector.akv2k8s.svc:80/auth/siacx-chatcaixa-mcp-server/siacx-chatcaixa-mcp-server-des-c886bc7cc-r9cch?secret=akv2k8s-siacx-chatcaixa-mcp-server-des"
I0623 17:15:58.127435       1 authentication.go:123] "auth service credentials ok" url="http://akv2k8s-envinjector.akv2k8s.svc:80/auth/siacx-chatcaixa-mcp-server/siacx-chatcaixa-mcp-server-des-c886bc7cc-r9cch?secret=akv2k8s-siacx-chatcaixa-mcp-server-des"
I0623 17:15:58.127715       1 authentication.go:159] "requesting azure key vault oauth token" url="https://akv2k8s-envinjector.akv2k8s.svc:9443/auth/siacx-chatcaixa-mcp-server/siacx-chatcaixa-mcp-server-des-c886bc7cc-r9cch"
I0623 17:15:58.172018       1 authentication.go:179] "successfully received oauth token"
I0623 17:15:58.294665       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="siacx-chatcaixa-mcp-server/akvs-aiser-siacx-des-api-key" env="AZURE_AI_SERVICES_KEY"
I0623 17:15:58.343040       1 main.go:338] "secret injected into env var" azurekeyvaultsecret="siacx-chatcaixa-mcp-server/akvs-ass-siacx-des-admin-key" env="COGNITIVE_SEARCH_API_KEY"
I0623 17:15:58.343068       1 main.go:343] "starting process with secrets in env vars" cmd="/usr/local/bin/python" args=["python","-m","src.main"]
Traceback (most recent call last):
  File "<frozen runpy>", line 198, in _run_module_as_main
  File "<frozen runpy>", line 88, in _run_code
  File "/app/src/main.py", line 7, in <module>
    from .tools.busca_ai_caixa import busca_ai_caixa_tool
  File "/app/src/tools/busca_ai_caixa/__init__.py", line 1, in <module>
    from .busca_ai_caixa import busca_ai_caixa_tool
  File "/app/src/tools/busca_ai_caixa/busca_ai_caixa.py", line 6, in <module>
    from src.services.busca_ai_caixa import AISearchService
  File "/app/src/services/busca_ai_caixa.py", line 16, in <module>
    class AISearchService:
  File "/app/src/services/busca_ai_caixa.py", line 23, in AISearchService
    ai_search_client: SearchClient = get_ai_search_client(),
                                     ^^^^^^^^^^^^^^^^^^^^^^
  File "/app/src/config/settings.py", line 137, in get_ai_search_client
    return SearchClient(
           ^^^^^^^^^^^^^
  File "/usr/local/lib/python3.12/site-packages/azure/search/documents/aio/_patch.py", line 53, in __init__
    super().__init__(endpoint=endpoint, credential=credential, index_name=index_name, **kwargs)
  File "/usr/local/lib/python3.12/site-packages/azure/search/documents/aio/_client.py", line 72, in __init__
    self._client: AsyncPipelineClient = AsyncPipelineClient(base_url=_endpoint, policies=_policies, **kwargs)
                                        ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/local/lib/python3.12/site-packages/azure/core/_pipeline_client_async.py", line 166, in __init__
    self._pipeline = pipeline or self._build_pipeline(self._config, **kwargs)
                                 ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
  File "/usr/local/lib/python3.12/site-packages/azure/core/_pipeline_client_async.py", line 260, in _build_pipeline
    from .pipeline.transport._aiohttp import AioHttpTransport
  File "/usr/local/lib/python3.12/site-packages/azure/core/pipeline/transport/_aiohttp.py", line 49, in <module>
    import aiohttp
ModuleNotFoundError: No module named 'aiohttp'




