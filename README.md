Tem uma rota em TQS, com o location https://integra.iniciadora.caixa.gov.br/  apontando para o service do siinp-nucleo-tqs.

Ao tentar chamar no postman, quando eu passo, por exemplo: POST https://integra.iniciadora.caixa.gov.br/inic-pagto/nucleo/v1/jornada Eu tomo um 405.


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


Somente passando o /api, como sufixo, que conseguimos ver chamada ao backend. exemplo:  https://integra.iniciadora.caixa.gov.br/api/inic-pagto/nucleo/v1/jornada, mas a aplicação não espera o"/api" e quebra com erro 500.

Precisamos de suporte para configurar a rota, que ao ser chamada, chegue ao backend com o path /inic-pagto/nucleo/v1/jornada, por exemplo.


me ajuda com a nota para fechar a w.o informado que o ajuste foi relaizado 

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
integra
/
Name
integra

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
siinp-nucleo-web-tqs

Route
RT
integra.iniciadora-api
Accepted
https://integra.iniciadora.caixa.gov.br/api Copy to clipboard
Service
S
siinp-nucleo-tqs



aqui ja aparecem, ficando agora aguradadn o validadçao da comunidade. 


preciso fechar a w.o pois ela tem horario para vencer.. e como eles nao respoderam em sala acrediot que amanha respondam
