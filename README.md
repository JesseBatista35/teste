me ajdua a fazer esse teste e resolver esse problema

Boa tarde 
Thiago Rafael Cavalcante Pereira, tudo bem?
O Saymon me acionou agora a pouco, solicitando um técnico para fazer alguns testes nas rotas do OKD de TQS (Aplicação SIINP)
 
Podemos agendar agora a tarde?
Saymom de Oliveira Ramalho providencia uma REQ por favor e postar aqui na sala o numero


pessoal, no caso é o siinp-nucleo-tqs.
 
Tem uma rota em TQS, com o location https://integra.iniciadora.caixa.gov.br/  apontando para o service do siinp-nucleo-tqs.
 
Ao tentar chamar no postman, quando eu passo, por exemplo: POST https://integra.iniciadora.caixa.gov.br/inic-pagto/nucleo/v1/jornada Eu tomo um 405. 
 
 
XML
<html>
<head>
    <title>405 Not Allowed</title>
</head>
<body>
    <center>
        <h1>405 Not Allowed</h1>
    </center>
    <hr>
    <center>nginx/1.24.0</center>
</body>
</html>
 
Vale lembrar que a url original era com /api no path da Rota. Foi solicitada a retirada via REQ, pois estava chamando o backend com o /api na frente do endpoint, o que não é esperado pela aplicação, causando erro 500.
 
Ainda assim, somente passando o /api que conseguimos ver chamada ao backend. exemplo:  https://integra.iniciadora.caixa.gov.br/api/inic-pagto/nucleo/v1/jornada


 OKD


Jesse Mouta Pereira Batista

Administrator
Home
Overview
Projects
Search
API Explorer
Events
Operators
OperatorHub
Installed Operators
Workloads
Pods
Deployments
DeploymentConfigs
StatefulSets
Secrets
ConfigMaps
CronJobs
Jobs
DaemonSets
ReplicaSets
ReplicationControllers
HorizontalPodAutoscalers
PodDisruptionBudgets
Networking
Storage
Builds
Observe
Compute
User Management
Administration

Project: siinp-tqs
Pods

Filter

Name
siip-nucleo-tqs
/
Name
siip-nucleo-tqs

Name

Status

Ready

Restarts

Owner

Memory

CPU

Created
Pod
P
siinp-nucleo-tqs2-tqs-33-deploy
Completed
0/1	0	
ReplicationController
RC
siinp-nucleo-tqs2-tqs-33
-	-	
11 de jun. de 2026, 14:19

Pod
P
siinp-nucleo-tqs2-tqs-34-7sspn
Running
1/1	0	
ReplicationController
RC
siinp-nucleo-tqs2-tqs-34
2.258,9 MiB	0,001 cores	
11 de jun. de 2026, 15:10

Pod
P
siinp-nucleo-tqs2-tqs-34-deploy
Completed
0/1	0	
ReplicationController
RC
siinp-nucleo-tqs2-tqs-34
-	-	
11 de jun. de 2026, 15:09

Pod
P
siinp-nucleo-tqs2-tqs-34-rc4bz
Running
1/1	0	
ReplicationController
RC
siinp-nucleo-tqs2-tqs-34
2.932,6 MiB	0,001 cores	
11 de jun. de 2026, 15:09

Pod
P
siinp-nucleo-tqs-512-deploy
Completed
0/1	0	
ReplicationController
RC
siinp-nucleo-tqs-512
-	-	
12 de jun. de 2026, 15:38

Pod
P
siinp-nucleo-tqs-513-7hgs9
Running
1/1	0	
ReplicationController
RC
siinp-nucleo-tqs-513
1.113,2 MiB	0,001 cores	
15 de jun. de 2026, 11:37

Pod
P
siinp-nucleo-tqs-513-58zt9
Running
1/1	0	
ReplicationController
RC
siinp-nucleo-tqs-513
1.178,7 MiB	0,001 cores	
15 de jun. de 2026, 11:38

Pod
P
siinp-nucleo-tqs-513-deploy
Completed
0/1	0	
ReplicationController
RC
siinp-nucleo-tqs-513
-	-	
15 de jun. de 2026, 11:37

Pod
P
siinp-nucleo-web-tqs2-tqs-42-deploy
Completed
0/1	0	
ReplicationController
RC
siinp-nucleo-web-tqs2-tqs-42
-	-	
15 de jun. de 2026, 09:02

Pod
P
siinp-nucleo-web-tqs2-tqs-43-ddn89
Running
2/2	0	
ReplicationController
RC
siinp-nucleo-web-tqs2-tqs-43
39,8 MiB	0,000 cores	
15 de jun. de 2026, 09:29

Pod
P
siinp-nucleo-web-tqs2-tqs-43-deploy
Completed
0/1	0	
ReplicationController
RC
siinp-nucleo-web-tqs2-tqs-43
-	-	
15 de jun. de 2026, 09:29

Pod
P
siinp-nucleo-web-tqs-186-deploy
Completed
0/1	0	
ReplicationController
RC
siinp-nucleo-web-tqs-186
-	-	
23 de abr. de 2026, 14:30

Pod
P
siinp-nucleo-web-tqs-187-deploy
Completed
0/1	0	
ReplicationController
RC
siinp-nucleo-web-tqs-187
-	-	
15 de mai. de 2026, 17:45

Pod
P
siinp-nucleo-web-tqs-187-k5vfz
Running
2/2	0	
ReplicationController
RC
siinp-nucleo-web-tqs-187
61,7 MiB	0,000 cores	
15 de mai. de 2026, 17:45


OKD


Jesse Mouta Pereira Batista

Administrator
Home
Overview
Projects
Search
API Explorer
Events
Operators
OperatorHub
Installed Operators
Workloads
Pods
Deployments
DeploymentConfigs
StatefulSets
Secrets
ConfigMaps
CronJobs
Jobs
DaemonSets
ReplicaSets
ReplicationControllers
HorizontalPodAutoscalers
PodDisruptionBudgets
Networking
Services
Routes
Ingresses
NetworkPolicies
Storage
Builds
Observe
Compute
User Management
Administration

Project: siinp-tqs
Routes

Filter

Name
Search by name...
/

Name
Status	
Location

Service
Route
RT
integra.iniciadora
Accepted
https://integra.iniciadora.caixa.gov.br/ Copy to clipboard
Service
S
siinp-nucleo-tqs

Route
RT
integra.iniciadora.caixa.gov.br
Accepted
https://integra.iniciadora.caixa.gov.br Copy to clipboard
Service
S
siinp-nucleo-web-tqs

Route
RT
siinp-gestao-tqs
Accepted
https://siinp-gestao-tqs.apps.nprd.caixa Copy to clipboard
Service
S
siinp-gestao-tqs

Route
RT
siinp-gestao-web-tqs
Accepted
https://siinp-gestao-web-tqs.apps.nprd.caixa Copy to clipboard
Service
S
siinp-gestao-web-tqs

Route
RT
siinp-nucleo-tqs
Accepted
https://siinp-nucleo-tqs.apps.nprd.caixa Copy to clipboard
Service
S
siinp-nucleo-tqs

Route
RT
siinp-nucleo-tqs2-tqs
Accepted
https://siinp-nucleo-tqs2-tqs.apps.nprd.caixa Copy to clipboard
Service
S
siinp-nucleo-tqs2-tqs

Route
RT
siinp-nucleo-web-tqs
Accepted
https://siinp-nucleo-web-tqs.apps.nprd.caixa Copy to clipboard
Service
S
siinp-nucleo-web-tqs

Route
RT
siinp-nucleo-web-tqs2-tqs
Accepted
https://siinp-nucleo-web-tqs2-tqs.apps.nprd.caixa Copy to clipboard
Service
S
siinp-nucleo-web-tqs2-tqs



OKD


Jesse Mouta Pereira Batista

Administrator
Home
Overview
Projects
Search
API Explorer
Events
Operators
OperatorHub
Installed Operators
Workloads
Pods
Deployments
DeploymentConfigs
StatefulSets
Secrets
ConfigMaps
CronJobs
Jobs
DaemonSets
ReplicaSets
ReplicationControllers
HorizontalPodAutoscalers
PodDisruptionBudgets
Networking
Services
Routes
Ingresses
NetworkPolicies
Storage
Builds
Observe
Compute
User Management
Administration

Project: siinp-tqs
Routes
Route details
Route
RT
siinp-nucleo-tqs
Accepted

Actions
Details
Metrics
YAML
Route details
siinp-nucleo-tqs
Namespace
NS
siinp-tqs
app
=
siinp-nucleo-tqs
application
=
siinp-nucleo-tqs
template
=
quarkus-caixa-release
Service
S
siinp-nucleo-tqs
web
26 de abr. de 2023, 12:27
No owner
Location
https://siinp-nucleo-tqs.apps.nprd.caixa Copy to clipboard
Status
Accepted
siinp-nucleo-tqs.apps.nprd.caixa
-
router-default.apps.nprd.caixa
TLS settings
edge
Redirect
-
Key
-
-
Router: default
siinp-nucleo-tqs.apps.nprd.caixa
None
router-default.apps.nprd.caixa
Conditions
TypeStatusUpdatedReasonMessage
AdmittedTrue
26 de abr. de 2023, 12:27
--
}

estou logado no okd.


$
-sh-4.2$
-sh-4.2$ oc project siinp-tqs
Now using project "siinp-tqs" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$


caso seja mais faciil rodar comandos.

