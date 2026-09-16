

À Sonda,

Solicitamos a avaliação e, se necessário, o ajuste dos repositórios abaixo, conforme o ambiente criado na REQ: "REQ000146016075":

sicia-frontend-v1

GitOps: Revisar e configurar, para os ambientes DES,TQS,HMP,PRD,PILOTO, os seguintes itens: 
  - APP 
  - Project 
  - Labels 
  - Source e SourceVar
  - Cluster (apontando para a infraestrutura criada)

Repositórios sicia-frontend-v1-infranprd e sicia-frontend-v1-infraprd

values.yaml (por ambiente):            

Avaliar e ajustar, se necessário: 
  - HPA 
  - Service 
  - Ingress 
  - Tolerations

Garantir aderência aos requisitos de cada ambiente.

Templates (por ambiente): 
  - Validar e ajustar os arquivos akvs* para correto apontamento ao Key Vault; 
  - Revisar ConfigMaps conforme padrão da esteira e garantir configuração no values.yaml;   

Istio: 
  - Validar a configuração do Istio no ambiente; 
  - Verificar se o certificado está corretamente configurado e válido;   

Chart.yaml (raiz do ambiente): 
  - Validar e atualizar para a versão mais recente suportada pelo time de nuvem;  

Evidências: Apresentar os ajustes realizados em cada repositório.   

At.te, CXNDE04



REQ000146016075

Ao time de núvem pública, solicitamos a disponibilização dos recursos abaixo no dev.azure:   

  CostCenter = 5533
  BusinessProject = SISTEMA DE INTELIGÊNCIA E ABERTURA DE AGÊNCIAS
  BusinessUnit = CMGIIA
  IncidentResolutionTeam = CESTI35
  Environment = DES,TQS,HMP,PRD,PILOTO
  Owner = C128321
  OwnerEmail = ricardo.berto@caixa.gov.br
  SupportTeam = cesti35@caixa.gov.br
  IacWorkspace = Terraform
  Sigla = SICIA

Recursos solicitados:

  Gerenciamento de APIs: 
    Serviço: Amazon API Gateway
    Tipo: Não solicitado

  Cluster Kubernetes: Amazon EKS (Elastic Kubernetes Service)

  Banco de Dados SQL: AWS RDS

  Banco de Dados NoSQL: Amazon DynamoDB

  Cache for Redis: Não solicitado

  Static Web Site: Não solicitado

  Armazenamento: 
    Tipo: S3
    Quantidade: Não solicitado

  Streaming de Eventos: MSK

  Mensageria: Event Bridge

Solicitamos a instalação, na infra a ser criada, os plugins abaixo:

  - Argo-CD (Azure e AWS)
  - Developer Hub Plugin (Azure e AWS)
  - external-dns (Azure)
  - akv2k8s (Azure)


  mesmo atendimento porem outro projeto

  coloquei a nota do outro assim:


  À CAIXA

Prezados,

Em atendimento à   REQ000146006908, informamos que a configuração dos itens solicitados (GitOps, values.yaml, templates, Istio e Chart.yaml) para o ambiente DES está condicionada à conclusão da solicitação de infraestrutura em aberto junto ao time de Nuvem Pública (recursos EKS, RDS, DynamoDB, MSK, EventBridge, S3, Static Web Site e plugins ArgoCD/Developer Hub/external-dns/akv2k8s referentes à app SIAAF - CostCenter 7762).

Como a infraestrutura ainda não foi disponibilizada, não é possível concluir os ajustes solicitados nesta REQ dentro do prazo de SLA vigente.

Diante disso, solicitamos o encerramento desta REQ. Assim que a infraestrutura estiver disponibilizada pelo time de Nuvem Pública,  e concluida a REQ000146006906 

solicitamos que seja aberta uma nova requisição específica para realizar os ajustes de GitOps pendentes (APP, Project, Labels, Source/SourceVar, Cluster, values.yaml, templates, Istio e Chart.yaml), conforme detalhado originalmente.

Permanecemos à disposição para eventuais esclarecimentos.


Atenciosamente,

Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD


me ajdua com a nota dessa tambem
