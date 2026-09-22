À Sonda,

Solicitamos a avaliação e, se necessário, o ajuste dos repositórios abaixo, conforme o ambiente criado na REQ: "REQ000145922883":

siidp-backend-arquitetura-referencia

GitOps: Revisar e configurar, para os ambientes DES,HMP,PRD,TQS, os seguintes itens: 
  - APP 
  - Project 
  - Labels 
  - Source e SourceVar
  - Cluster (apontando para a infraestrutura criada)

Repositórios siidp-backend-arquitetura-referencia-infranprd e siidp-backend-arquitetura-referencia-infraprd

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



Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081641979
Criado em	 18/09/2026 22:10:13
Criado por	 P507043
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados~

Esta REQ permanece pendente, aguardando a conclusão da REQ000145922883 pelo time de Nuvem Pública, para que os ajustes de GitOps (APP, Project, Labels, Source/SourceVar, Cluster, values.yaml, templates, Istio e Chart.yaml) possam ser realizados.

Atte.

CTIS / CESTI / ESTEIRAS DEVOPS DES TQS
ID da Ordem de Trabalho	 WO0000081641979
Criado em	 17/09/2026 15:16:50
Criado por	 P585600
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Pendencia.




Nota de atendimento — REQ000145922885

Em atendimento à REQ000145922885, informamos que a configuração dos itens solicitados (GitOps, values.yaml, templates, Istio e Chart.yaml) para o ambiente DES está condicionada à conclusão da solicitação de infraestrutura em aberto junto ao time de Nuvem Pública, registrada na REQ000145922883 (recursos EKS, RDS, DynamoDB, MSK, EventBridge, S3, Static Web Site e plugins ArgoCD/Developer Hub/external-dns/akv2k8s referentes à app siidp-backend-arquitetura-referencia).

Como a infraestrutura ainda não foi disponibilizada, esta REQ permanece pendente, aguardando a conclusão da REQ000145922883 pelo time de Nuvem Pública, para que os ajustes de GitOps (APP, Project, Labels, Source/SourceVar, Cluster, values.yaml, templates, Istio e Chart.yaml) possam ser realizados.


Atenciosamente,

Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081641979
Criado em	 16/09/2026 08:13:17
Criado por	 P768728
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 A CAIXA,

Reitero a solicitação registrada por nosso analista em 15/06, às 10:52, referente à necessidade de informar:

GitOps (ArgoCD) - DES/TQS:

Nome/endpoint do Cluster de destino criado na infraestrutura referente à REQ, para os ambientes DES e TQS.
Padrão esperado de nomenclatura para APP, Project e Labels a serem configurados.
Repositório, branch e path de Source a serem apontados, além dos valores esperados de SourceVar.

values.yaml (por ambiente DES/TQS):

Parâmetros de HPA esperados (réplicas mínima/máxima, thresholds de CPU/memória).
Configuração esperada de Service (porta, tipo) e Ingress (host, path).
Tolerations aplicáveis (node pool/taint de destino).

Templates:

Nome do Key Vault e identificação dos secrets a serem referenciados nos arquivos akvs*, para DES e TQS.
Chaves e valores esperados de ConfigMap pela aplicação, para configuração no values.yaml.

Istio:

Certificado a ser utilizado (domínio/validade) e eventuais regras específicas de Istio esperadas para o serviço.

Chart.yaml:

Confirmação, junto ao time de nuvem, da versão mais recente suportada do caixa-base-chart a ser aplicada, para que possamos prosseguir com o atendimento.

Conforme orientação da CESTI36, requisições que não forem respondidas no prazo de 72h após a solicitação das informações complementares serão encerradas

Após o encerramento, será necessário registrar uma nova REQ, informando o número da WO finalizada, para fins de continuidade.

Ressaltamos ainda que reaberturas serão novamente encerradas, sendo obrigatório o registro de uma nova REQ conforme orientado acima.

Permaneço à disposição.

Atenciosamente,

Esteira Devops - NPRD
ID da Ordem de Trabalho	 WO0000081641979
Criado em	 15/09/2026 10:52:03
Criado por	 P585600
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados,

Em atendimento, informamos que os ajustes solicitados para o repositório siidp-backend-arquitetura-referencia serão realizados nos ambientes DES e TQS.

Para darmos andamento aos itens listados, solicitamos as seguintes informações:

GitOps (ArgoCD) - DES/TQS:

Nome/endpoint do Cluster de destino criado na infraestrutura referente à REQ, para os ambientes DES e TQS.
Padrão esperado de nomenclatura para APP, Project e Labels a serem configurados.
Repositório, branch e path de Source a serem apontados, além dos valores esperados de SourceVar.

values.yaml (por ambiente DES/TQS):

Parâmetros de HPA esperados (réplicas mínima/máxima, thresholds de CPU/memória).
Configuração esperada de Service (porta, tipo) e Ingress (host, path).
Tolerations aplicáveis (node pool/taint de destino).

Templates:

Nome do Key Vault e identificação dos secrets a serem referenciados nos arquivos akvs*, para DES e TQS.
Chaves e valores esperados de ConfigMap pela aplicação, para configuração no values.yaml.

Istio:

Certificado a ser utilizado (domínio/validade) e eventuais regras específicas de Istio esperadas para o serviço.

Chart.yaml:

Confirmação, junto ao time de nuvem, da versão mais recente suportada do caixa-base-chart a ser aplicada.

Assim que recebermos essas informações, daremos sequência aos ajustes e apresentaremos as evidências por repositório, conforme solicitado.


Atenciosamente,

Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081641979
Criado em	 11/09/2026 16:27:26
Criado por	 P590474
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial sem viés de falha, erro, degradação ou esgotamento de infraestrutura, serviço, máquina, armazenamento, rotina ou situação que não esteja na iminência de tornar-se incidente. Previsto atendimento no prazo indicado pelo demandante. [CENTRAL-SID]
ID da Ordem de Trabalho	 WO0000081641979
Criado em	 11/09/2026 15:43:44
Criado por	 P768728
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),

Informamos que sua solicitação foi recebida.

Analisaremos a solicitação para nos certificarmos que o atendimento está dentro do escopo de atuação da nossa equipe.

Caso seja identificado que o atendimento não corresponde ao nosso escopo, a solicitação será redirecionada à equipe responsável.

Novas informações e atualizações serão registradas diretamente nesta WO.

Atte.

Esteira Devops DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081641979
Criado em	 11/09/2026 15:33:08
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Terça-feira, 22/09/2026 19:55:03



Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081641977
Criado em	 21/09/2026 18:41:00
Criado por	 P640827
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À CAIXA,

Prezados,

Seguem as informações da conta:

ID da conta: 385545779011
nome da conta: accestruturantestinprd
SSO: https://d-946760baff.awsapps.com/start

Para o time de desenvolvimento: será necessário solicitar a matriz de acesso conforme alinhado com o COE.

Atenciosamente,
Ana Elisa Ferreira Bertoldo
CTIS/CESTI/EquipeNuvem
ID da Ordem de Trabalho	 WO0000081641977
Criado em	 21/09/2026 18:05:42
Criado por	 P640827
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À CAIXA,

A conta o e toda sua estrutura de Azure DevOps e Terraform foram criados com sucesso.  Evidências em anexo.

Atenciosamente,
Ana Elisa Ferreira Bertoldo
CTIS/CESTI/EquipeNuvem
ID da Ordem de Trabalho	 WO0000081641977
Criado em	 17/09/2026 12:36:26
Criado por	 P528436
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Provisionamento de recursos sendo realizado na conta.
ID da Ordem de Trabalho	 WO0000081641977
Criado em	 16/09/2026 15:47:13
Criado por	 P528436
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Aguardando finalização de configurações de rotas para a rede VPC da conta e prosseguir com a subida dos recursos.
ID da Ordem de Trabalho	 WO0000081641977
Criado em	 15/09/2026 16:25:28
Criado por	 P528436
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Aguardando liberação pela CETEL do range de rede para criação da conta aws e criação dos serviço via IaC.
ID da Ordem de Trabalho	 WO0000081641977
Criado em	 11/09/2026 16:25:56
Criado por	 P590474
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial sem viés de falha, erro, degradação ou esgotamento de infraestrutura, serviço, máquina, armazenamento, rotina ou situação que não esteja na iminência de tornar-se incidente. Previsto atendimento no prazo indicado pelo demandante. [CENTRAL-SID]
ID da Ordem de Trabalho	 WO0000081641977
Criado em	 11/09/2026 15:39:35
Criado por	 P962331
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a)   

Informamos que sua solicitação foi recebida em nossa fila e seguirá o fluxo de atendimento.   

Trata-se de uma atividade de complexidade baixa e será atendida o mais breve possível.   

Em complemento as informações, destaca-se que:   

Será necessário fazer planejamento para sua execução.   

Informações futuras serão adicionadas a esta WO.   

Qualquer dúvida, estamos à disposição   

Antonia Costa  

Preposta  

CTIS /CESTI/Nuvem Publica  
ID da Ordem de Trabalho	 WO0000081641977
Criado em	 11/09/2026 15:32:31
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Terça-feira, 22/09/2026 19:54:15



<img width="1816" height="877" alt="image" src="https://github.com/user-attachments/assets/c3b3c2fa-f32a-4ff0-9465-4bedd6c6fce2" />




Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
siidp-backend-arquitetura-referencia
Repository navigation
Code
Issues
Pull requests
Actions
Projects
Wiki
Security and quality
2
 (2)
Insights
Settings
CI/CD Workflow Generic
caixagithub/siidp-backend-arquitetura-referencia_develop_35361748176.2 #2
All jobs
Run details
Annotations
1 error and 1 warning
CI_DES / BUILD / BUILD
failed 4 days ago in 1m 15s
Search logs
10s
1s
0s
1s
23s
0s
0s
0s
0s
23s
Set up Docker Buildx
6s
Configure AWS Credentials
1s
Assume role in PAAS account
0s
Login to ECR
0s
Connecting on Registry
0s
Docker meta
1s
Checkout DevSecOps config repo
1s
Localiza arquivos nexus
0s
Show nexus
0s
Inject nexus repo
0s
Build and push
3s
  Node 20 is being deprecated. This workflow is running with Node 24 by default. If you need to temporarily use Node 20, you can set the ACTIONS_ALLOW_USE_UNSECURE_NODE_VERSION=true environment variable. For more information see: https://github.blog/changelog/2025-09-19-deprecation-of-node-20-on-github-actions-runners/
Run docker/build-push-action@v6
  (node:1126) [DEP0040] DeprecationWarning: The `punycode` module is deprecated. Please use a userland alternative instead.
  (Use `node --trace-deprecation ...` to show where the warning was created)
GitHub Actions runtime token ACs
Docker info
Proxy configuration
Buildx version
Builder info
  /usr/bin/docker buildx build --cache-from type=registry,ref=027574771582.dkr.ecr.sa-east-1.amazonaws.com/siidp/backend-arquitetura-referencia/siidp-backend-arquitetura-referencia:buildcache --cache-to type=registry,ref=027574771582.dkr.ecr.sa-east-1.amazonaws.com/siidp/backend-arquitetura-referencia/siidp-backend-arquitetura-referencia:cache,mode=max --file ./Dockerfile --iidfile /home/runner/_work/_temp/docker-actions-toolkit-w8bI2b/build-iidfile-e3eeec61df.txt --label org.opencontainers.image.created=2026-09-18T15:21:34.247Z --label org.opencontainers.image.description=Adicionando aplicação: siidp-backend-arquitetura-referencia --label org.opencontainers.image.licenses= --label org.opencontainers.image.revision=de84a0b18a94d18b491c2a71d920f87209216ee5 --label org.opencontainers.image.source=https://github.com/caixagithub/siidp-backend-arquitetura-referencia --label org.opencontainers.image.title=siidp-backend-arquitetura-referencia --label org.opencontainers.image.url=https://github.com/caixagithub/siidp-backend-arquitetura-referencia --label org.opencontainers.image.version=35361748176 --platform linux/amd64 --attest type=provenance,mode=min,inline-only=true,builder-id=https://github.com/caixagithub/siidp-backend-arquitetura-referencia/actions/runs/35361748176/attempts/1 --tag 027574771582.dkr.ecr.sa-east-1.amazonaws.com/siidp/backend-arquitetura-referencia/siidp-backend-arquitetura-referencia:35361748176 --metadata-file /home/runner/_work/_temp/docker-actions-toolkit-w8bI2b/build-metadata-c82c813066.json --push .
  #0 building with "builder-64a037b9-8aa5-4bde-8726-98d6748ebdd9" instance using docker-container driver
  
  #1 [internal] load build definition from Dockerfile
  #1 transferring dockerfile: 971B done
  #1 DONE 0.0s
  
  #2 [internal] load metadata for docker.io/library/maven:3-eclipse-temurin-25
  #2 ...
  
  #3 [internal] load metadata for registry.access.redhat.com/ubi9/openjdk-25:latest
  #3 DONE 1.0s
  
  #2 [internal] load metadata for docker.io/library/maven:3-eclipse-temurin-25
  #2 DONE 1.2s
  
  #4 [internal] load .dockerignore
  #4 transferring context: 168B done
  #4 DONE 0.0s
  
  #5 [internal] load build context
  #5 DONE 0.0s
  
  #6 [build 1/5] FROM docker.io/library/maven:3-eclipse-temurin-25@sha256:dd8e01b3be719853578c07b57ff8d9bbbbfe746f802226f05b19689420815221
  #6 resolve docker.io/library/maven:3-eclipse-temurin-25@sha256:dd8e01b3be719853578c07b57ff8d9bbbbfe746f802226f05b19689420815221 0.0s done
  #6 DONE 0.0s
  
  #7 [deploy 1/5] FROM registry.access.redhat.com/ubi9/openjdk-25:latest@sha256:513275ae909d56667d30f3420dbb6e6384ee33ec24c7527b6cccd0f1f5d1d54b
  #7 resolve registry.access.redhat.com/ubi9/openjdk-25:latest@sha256:513275ae909d56667d30f3420dbb6e6384ee33ec24c7527b6cccd0f1f5d1d54b 0.0s done
  #7 DONE 0.0s
  
  #8 [auth] sharing credentials for 027574771582.dkr.ecr.sa-east-1.amazonaws.com
  #8 DONE 0.0s
  
  #9 importing cache manifest from 027574771582.dkr.ecr.sa-east-1.amazonaws.com/siidp/backend-arquitetura-referencia/siidp-backend-arquitetura-referencia:buildcache
  #9 ERROR: failed to configure registry cache importer: 027574771582.dkr.ecr.sa-east-1.amazonaws.com/siidp/backend-arquitetura-referencia/siidp-backend-arquitetura-referencia:buildcache: not found
  
  #5 [internal] load build context
  #5 transferring context: 2B 0.0s done
  #5 DONE 0.0s
  
0s
9s
0s
1s
0s
1s
0s


eles tetnaram rodar e deu erro sera se falta relamten configuraçoes??
