I0723 19:41:01.728803       1 version.go:31] "version info" version="" commit="1e11cd2" buildDate="2024-10-04T10:20:06Z" component="vaultenv"
I0723 19:41:01.729053       1 main.go:184] "azure key vault env injector initializing"
I0723 19:41:01.729249       1 main.go:253] "found original container command" cmd="/usr/bin/java" args=["java","-jar","/opt/deploy/quarkus-run.jar"]
I0723 19:41:01.729299       1 authentication.go:110] "checking if current auth service credentials are stale" url="http://akv2k8s-envinjector.akv2k8s.svc:80/auth/silce-backend-valida-assinatura/silce-backend-valida-assinatura-tqs-779bb89578-5thvw?secret=akv2k8s-silce-backend-valida-assinatura-tqs"
I0723 19:41:01.791304       1 authentication.go:123] "auth service credentials ok" url="http://akv2k8s-envinjector.akv2k8s.svc:80/auth/silce-backend-valida-assinatura/silce-backend-valida-assinatura-tqs-779bb89578-5thvw?secret=akv2k8s-silce-backend-valida-assinatura-tqs"
I0723 19:41:01.791562       1 authentication.go:159] "requesting azure key vault oauth token" url="https://akv2k8s-envinjector.akv2k8s.svc:9443/auth/silce-backend-valida-assinatura/silce-backend-valida-assinatura-tqs-779bb89578-5thvw"
I0723 19:41:01.821933       1 authentication.go:179] "successfully received oauth token"
E0723 19:41:01.966338       1 main.go:330] "failed to read secret from azure key vault" err=<
	GET https://kv-silce-tqs.vault.azure.net/secrets/VALIDA-ASSINATURA-APP-DES--ENV-SIPER-PASSWORD/
	--------------------------------------------------------------------------------
	RESPONSE 404: 404 Not Found
	ERROR CODE: SecretNotFound
	--------------------------------------------------------------------------------
	{
	  "error": {
	    "code": "SecretNotFound",
	    "message": "A secret with (name/id) VALIDA-ASSINATURA-APP-DES--ENV-SIPER-PASSWORD was not found in this key vault. If you recently deleted this secret you may be able to recover it using the correct recovery command. For help resolving this issue, please see https://go.microsoft.com/fwlink/?linkid=2125182"
	  }
	}
	--------------------------------------------------------------------------------
 > azurekeyvaultsecret="silce-backend-valida-assinatura/akvs-env-siper-password"




 
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
6
OutOfSync
0
HEALTH STATUS
Progressing
3
Suspended
0
Healthy
2
Degraded
2
Missing
0
Unknown
0
Show Orphaned
Applications
 silce-backend-valida-assinatura-tqs
Application Details Tree
Log out
APP HEALTH 
 Progressing
SYNC STATUS 

 Synced
to HEAD (d7b1f94)
Auto sync is enabled.
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #23 from caixagithub/update-image-silce-backe
LAST SYNC 

 Sync OK
to d7b1f94
Succeeded 6 minutes ago (Thu Jul 23 2026 19:36:05 GMT-0300)
Author:
ansible-connect-emu[bot] <230244411+ansible-connect-emu[bot]@users.noreply.github.com> -
Comment:
Merge pull request #23 from caixagithub/update-image-silce-backe
APP CONDITIONS
 1 Warning
ConfigMap
cm
cm-silce-backend-valida-assinatura
8 hours

silce-backend-valida-assinatura-tqs
8 hours
Service
svc
silce-backend-valida-assinatura-tqs
8 hours
Endpoints
ep
silce-backend-valida-assinatura-tqs
8 hours
EndpointSlice
endpointslice
silce-backend-valida-assinatura-tqs-ncj9z
8 hours
Deployment
deploy
silce-backend-valida-assinatura-tqs
8 hoursRev:3
ReplicaSet
rs
silce-backend-valida-assinatura-tqs-779bb89578
16 minutesRev:3
Pod
pod
silce-backend-valida-assinatura-tqs-779bb89578-5thvw
6 minutesCrashLoopBackOff0/14
Secret
secret
akv2k8s-silce-backend-valida-assinatura-tqs
8 hours
ReplicaSet
rs
silce-backend-valida-assinatura-tqs-7f4d6db8b9
an hourRev:2
Pod
pod
silce-backend-valida-assinatura-tqs-7f4d6db8b9-cmrdq
14 minutesCrashLoopBackOff0/16
ReplicaSet
rs
silce-backend-valida-assinatura-tqs-9dfd9bd4f
8 hoursRev:1
G
gateway
silce-backend-valida-assinatura-tqs-internal
3 hours
VS
virtualservice
silce-backend-valida-assinatura-tqs-internal
3 hours
AKVS
azurekeyvaultsecret
akvs-env-siper-password
8 hours

Podpod
silce-backend-valida-assinatura-tqs-779bb89578-5thvw
 SUMMARY EVENTS LOGS
REASON
MESSAGE
COUNT
FIRST OCCURRED
LAST OCCURRED
BackOff
Back-off restarting failed container silce-backend-valida-assinatura-tqs in pod silce-backend-valida-assinatura-tqs-779bb89578-5thvw_silce-backend-valida-assinatura(51378868-950f-4f12-9036-4ffe4035e2eb)
13
5m ago
Today at 7:36 PM
33s ago
Today at 7:41 PM
Pulling
Pulling image "acrcentralcaixanprd.azurecr.io/silce/backend-valida-assinatura/silce-backend-valida-assinatura:30045899652"
7
5m ago
Today at 7:36 PM
35s ago
Today at 7:41 PM
Pulled
Successfully pulled image "acrcentralcaixanprd.azurecr.io/silce/backend-valida-assinatura/silce-backend-valida-assinatura:30045899652" in 69ms (69ms including waiting). Image size: 513098977 bytes.
2
4m ago
Today at 7:36 PM
35s ago
Today at 7:41 PM
Created
Container created
5
5m ago
Today at 7:36 PM
3m ago
Today at 7:38 PM
Started
Container started
5
5m ago
Today at 7:36 PM
3m ago
Today at 7:38 PM
Pulled
Successfully pulled image "acrcentralcaixanprd.azurecr.io/silce/backend-valida-assinatura/silce-backend-valida-assinatura:30045899652" in 68ms (68ms including waiting). Image size: 513098977 bytes.
1
3m ago
Today at 7:38 PM
3m ago
Today at 7:38 PM
Failed
Failed to pull image "acrcentralcaixanprd.azurecr.io/silce/backend-valida-assinatura/silce-backend-valida-assinatura:30045899652": failed to pull and unpack image "acrcentralcaixanprd.azurecr.io/silce/backend-valida-assinatura/silce-backend-valida-assinatura:30045899652": failed to resolve image: failed to do request: Head "https://acrcentralcaixanprd.azurecr.io/v2/silce/backend-valida-assinatura/silce-backend-valida-assinatura/manifests/30045899652": dial tcp 10.244.37.25:443: connect: connection refused
1
3m ago
Today at 7:37 PM
3m ago
Today at 7:37 PM
Failed
Error: ErrImagePull
1
3m ago
Today at 7:37 PM
3m ago
Today at 7:37 PM
Pulled
Successfully pulled image "acrcentralcaixanprd.azurecr.io/silce/backend-valida-assinatura/silce-backend-valida-assinatura:30045899652" in 60ms (60ms including waiting). Image size: 513098977 bytes.
1
5m ago
Today at 7:36 PM
5m ago
Today at 7:36 PM
Pulled
Successfully pulled image "acrcentralcaixanprd.azurecr.io/silce/backend-valida-assinatura/silce-backend-valida-assinatura:30045899652" in 88ms (88ms including waiting). Image size: 513098977 bytes.
1
5m ago
Today at 7:36 PM
5m ago
Today at 7:36 PM
Pulled
Successfully pulled image "acrcentralcaixanprd.azurecr.io/silce/backend-valida-assinatura/silce-backend-valida-assinatura:30045899652" in 13.589s (13.589s including waiting). Image size: 513098977 bytes.
1
5m ago
Today at 7:36 PM
5m ago
Today at 7:36 PM
Pulled
Container image "spvest/azure-keyvault-env:1.7.3" already present on machine and can be accessed by the pod
1
5m ago
Today at 7:36 PM
5m ago
Today at 7:36 PM
Created
Container created
1
5m ago
Today at 7:36 PM
5m ago
Today at 7:36 PM
Started
Container started
1
5m ago
Today at 7:36 PM
5m ago
Today at 7:36 PM
Scheduled
Successfully assigned silce-backend-valida-assinatura/silce-backend-valida-assinatura-tqs-779bb89578-5thvw to aks-workloads-30339714-vmss0002ev
5m ago
Today at 7:36 PM
5m ago
Today at 7:36 PM



Jesse Mouta Pereira Batista
📷
ah, outra coisa, o ingress de tqs ta diferente do de des, no values.yml
 
eu peguei o de des de um projeto nosso que funfa
 
opa mano
 
Joao Gustavo Matos Maranhao
ao invés de silce-backend-nsu ser silce-backend-gerador-nsu
fica mais claro de entender o projeto
 
posso criar aqui?
 
Joao Gustavo Matos Maranhao
ah, outra coisa, o ingress de tqs ta diferente do de des, no values.yml
sim esse era o problema da apim
 
o host tava com nprd
 
 
e na zonas de DNS tem esses aqui configurados
 
Joao Gustavo Matos Maranhao
posso criar aqui?
pode sim
 
vamos excluir  o outro
 
acho que ainda vai quebrar em TQS
 
