sispm-backend-informe-segregacao-infranprd/des
/values.yaml


caixa-base-chart:
#-------#
# IMAGE #
#-------#
  image:
    # variavel de imagem do tipo de aplicação
    repository: 027574771582.dkr.ecr.sa-east-1.amazonaws.com/sispm/backend-informe-segregacao/sispm-backend-informe-segregacao
    tag: "37830677100"
    pullPolicy: Always

  serviceAccount:
    create: true
    annotations: {}
    automount: true
    name: "sa-sispm-backend-informe-segregacao"
#-----#
# HPA #
#-----#
  replicaCount: 1
  autoscaling:
    enabled: false
    minReplicas: 1
    maxReplicas: 3
    targetCPUUtilizationPercentage: 85
    targetMemoryUtilizationPercentage: 85
#-----------------#
# ROLLING UPDATE STRATEGY #
#-----------------#
  strategy:
    maxSurge: 25%
    maxUnavailable: 50%
#-----------#
#  SERVICE  #
#-----------#
  service:
    type: "ClusterIP"
    ports:
      - name: "port"
        protocol: TCP
        port: 80
        targetPort: 8080
#---------#
# INGRESS #
#---------#
  istio:  
    - name: internal
      enabled: true
      certificate: false
      gateway_prefix: eks
      servers:
      - port:
          number: 443
          name: https-default
          protocol: HTTPS
        tls:
          mode: SIMPLE
          credentialName: sispm-backend-informe-segregacao-des-nprd
        hosts:
        - "sispm-backend-informe-segregacao.apl.des.private.aws"
      #- port:
      #    number: 443
      #    name: https-custom
      #    protocol: HTTPS
      #  tls:
      #    mode: SIMPLE
      #    credentialName: akvs-sispm-backend-informe-segregacao-certificate # Nome do secret do certificado
      #  hosts:
      #    - sispm-backend-informe-segregacao.des-nprd.caixa
      prefix:
        - /
      targetPort: 80 
#-------------#
#  RESOURCES  #
#-------------#
  resources:
    requests:
      cpu: 250m
      memory: 256Mi
    limits:
      cpu: 500m
      memory: 512Mi
#----------#
#  PROBES  #
#----------#
  probes:  
    enabled: true
    useDefaults: false  
    livenessProbe: 
      initialDelaySeconds: 30
      periodSeconds: 15
      failureThreshold: 10
      successThreshold: 1
      httpGet:
        path: /q/health/live     
        port: 8080
    readinessProbe: 
      initialDelaySeconds: 15
      periodSeconds: 15
      failureThreshold: 3
      successThreshold: 1
      httpGet:
        path: /q/health/ready     
        port: 8080
#-------------#
#  CONFIGMAP  #
#-------------#
  configMapRefs:
    - name: cm-sispm-backend-informe-segregacao
#-------------# 
#   SECRETS   # 
#-------------# 
#  secretRefs:
#  env:
#    - name: <NOME_DA_VARIAVEL_NA_APLICACAO>
#      value: akvs-sispm-backend-informe-segregacao@azurekeyvault




apiVersion: v2
name: caixa-base-chart
description: A Helm chart for Kubernetes
type: application
version: 1.0.0
appVersion: "1.16.0"
dependencies:
   - name: caixa-base-chart
     version: 1.2.2-beta11
     repository: oci://acrportalidpprd.azurecr.io/helm





     apiVersion: v1
kind: ConfigMap
metadata:
  name: cm-sispm-backend-informe-segregacao
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
data:
  KEY: "VALUE"


  # ============================================================================= #
#             CAIXA DEVSECOPS - TEMPLATE DE WORKFLOW CI/CD v1.0                 #
# ============================================================================= #
# Este workflow é um modelo padrão para todos os desenvolvedores da Caixa.      #
# Ele automatiza processos de integração contínua (CI) e entrega contínua (CD), #
# promovendo segurança, padronização e eficiência no ciclo de desenvolvimento.  #
# Todas as alterações devem ser realizadas por meio do Fusionx                  #
# ============================================================================= #
# ============================================================================= #
# Nome do workflow para facilitar a identificação nas execuções                 #
# ============================================================================= #
name: CI/CD Workflow Generic
# ============================================================================= #
# Nome dinâmico da execução, útil para rastreamento e auditoria                 #
# ============================================================================= #
run-name: ${{ github.repository }}_${{ github.ref_name }}_${{ github.run_id }}.${{ github.run_number }}
# ========================================================================================================================== #
# Eventos que disparam o workflow                                                                                            #
# ========================================================================================================================== #
# workflow_dispatch -> Permite execução manual via interface do GitHub                                                       #
# push              -> Executa automaticamente em push, de acordo com os filtros                                             #
# branches          -> Filtro de execução. O workflow, no evento push, será executado apenas nas branches main e develop     #
# paths-ignore      -> Filtro de execução. O workflow, no evento push, não será executado quando existir alteração           #
#                   -> nos caminhos .github/** e no arquivo catalog-info.yaml                                                #
#                                                                                                                            #
# Documentação de referência                                                                                                 #
# https://docs.github.com/en/actions/how-tos/write-workflows/choose-when-workflows-run/trigger-a-workflow                    #
# ========================================================================================================================== #
on:
  workflow_dispatch:
  push:
    branches:
      - main
      - develop
    paths-ignore:
      - '.github/**'
      - 'catalog-info.yaml'
# ============================================================================================================================ #
# Permissões necessárias para o workflow interagir com o repositório de automação de CI/CD e serviços                          #
# ============================================================================================================================ #
# contents: write        -> Permite escrever nos arquivos do repositório                                                       #
# security-events: write -> Permite registrar eventos de segurança                                                             #
# packages: read         -> Permite ler pacotes (ex: npm, docker)                                                              #
# actions: read          -> Permite ler ações do GitHub                                                                        #
# issues: write          -> Permite criar/editar issues                                                                        #
# pull-requests: write   -> Permite criar/editar pull requests                                                                 #
# pull-requests: write   -> Permite gerar token oidc do github                                                                 #
#                                                                                                                              #
# Documentação de referência                                                                                                   #
# https://docs.github.com/en/actions/tutorials/authenticate-with-github_token#modifying-the-permissions-for-the-github_token   #
# ============================================================================================================================ #
permissions:
  contents: write
  security-events: write
  packages: read
  actions: read
  issues: write
  pull-requests: write
  id-token: write
# ====================================================================================================================================================== #
# Definição dos jobs que serão executados                                                                                                                #
# ====================================================================================================================================================== #
# name: CI_DES                                                                        -> Nome do job, aparece na interface do GitHub Actions             #
# uses: caixagithub/DevSecOps-Solutions/.github/workflows/generic-pipelines.yaml@main -> Template reutilizado                                            #
# secrets: inherit                                                                    -> Herda os segredos definidos no repositório principal            #
# DEPLOY_ENVIRONMENTS: '["DES"]'                                                      -> Define o ambiente de implantação como Desenvolvimento (DES).    #
#                                                                                     -> PossÍveis ambientes: DES, TST, TQS, SANDBOX, HMP, PTL E PRD     #
# IMPORT_APIM: false                                                                  -> Desativa importação automática de APIs no Azure API Management. #
#                                                                                     -> Possíveis valores: true ou false                                #
#                                                                                                                                                        #
# Documentação de referência                                                                                                                             #
# https://docs.github.com/en/actions/how-tos/write-workflows/choose-what-workflows-do/use-jobs                                                           #
# https://docs.github.com/en/actions/how-tos/reuse-automations/reuse-workflows                                                                           #
# ====================================================================================================================================================== #
jobs:
  Generic-Solution:
    name: CI_DES
    uses: caixagithub/DevSecOps-Solutions/.github/workflows/generic-pipelines.yaml@main
    secrets: inherit
    with:
      DEPLOY_ENVIRONMENTS: '["DES"]'
      IMPORT_APIM: false


gitops/apps/sispm-backend-informe-segregacao/des
/config.yaml



      app:
  name: sispm-backend-informe-segregacao-des
project:
  name: des
labels:
  appName: sispm-backend-informe-segregacao
  environment: des
source:
  repo: "https://github.com/caixagithub/sispm-backend-informe-segregacao-infranprd"
  path: des
sourcevar:
  repo: "https://github.com/caixagithub/sispm-globalnprd"
  path: des
  values: global.yaml  
cluster:
  destination:  
    name: eks-cdc-nprd
    namespace: sispm-backend-informe-segregacao




    Portal de acesso da AWS (ícone de sorriso da AWS)
portal de acesso


Jesse
Portal de acesso da AWS

Contas

Aplicações
Contas da AWS (52)

Criar atalho

1


Nome da conta
	
ID da conta
	
E-mail


accantifraudenprd

859153839408

saws043@caixa.gov.br

accarreconvnprd

843916761196

saws039@caixa.gov.br

accboxesteiradigitalnprd

351235967781

saws070@caixa.gov.br

acccapitulocodnprd

207852393571

saws049@caixa.gov.br

acccobopbancnprd

294015961802

saws040@caixa.gov.br

acccoeianprd

434097521116

saws052@caixa.gov.br

acccomfomentofiesnprd

435240837288

saws025@caixa.gov.br

accdepecapnprd

225632394003

saws042@caixa.gov.br

accfgtsnprd

916218008765

saws045@caixa.gov.br

accfinopsprd

251050869252

saws053@caixa.gov.br

accgerenciadorfinpjnprd

143495498779

saws016@caixa.gov.br

accgerenciadorfinpjprd

626274382776

saws036@caixa.gov.br

accgestaoidentidadenprd

563586108835

saws064@caixa.gov.br

accinfraservices

991660220044

saws051@caixa.gov.br

accintaberturaagenciasnprd

398031303138

saws069@caixa.gov.br

acckmskeysnprd

069301571276

saws026@caixa.gov.br

acckmskeysprd

150479998604

saws027@caixa.gov.br

acclabgerenciadorpj

332896939420

saws054@caixa.gov.br

acclabproducao

285168796686

saws022@caixa.gov.br

acclabseguranca

352246554503

saws023@caixa.gov.br

acclabsuporte

023254205879

saws024@caixa.gov.br

accmodernizaappnprd

538498974083

saws063@caixa.gov.br

accoperacoesdigitaisnprd

456788081266

saws055@caixa.gov.br

accoperacoesdigitaisprd

402040564780

saws061@caixa.gov.br

accountcoelab

690509490210

saws001@caixa.gov.br

accountspokeprd011

272117124980

saws011@caixa.gov.br

accoutorgasnprd

114757333216

saws056@caixa.gov.br

accpacmcmvnprd

980649752434

saws038@caixa.gov.br

accpacmcmvprd

728327099256

saws048@caixa.gov.br

accpaginstantnprd

996860765914

saws041@caixa.gov.br

accpaginstantprd

459632520982

saws057@caixa.gov.br

accpolicystagingnprd

331773568239

saws060@caixa.gov.br

accpolicystagingprd

456651118709

saws062@caixa.gov.br

accprogramsociaisnprd

013644998398

saws046@caixa.gov.br

accsecuritytooling

482311061213

saws044@caixa.gov.br

accsistemadepermissoesnprd

223910471507

saws068@caixa.gov.br

accteamcloudcoenprd

749054615823

saws066@caixa.gov.br

accteamcloudnprd

781547812319

saws065@caixa.gov.br

accteamcloudprd

207283262046

saws067@caixa.gov.br

acctesteaftprd

331928726376

saws012@caixa.gov.br

acctestenprdou3

656867846941

saws032@caixa.gov.br

acctesteoupcnprd

010133602341

saws059@caixa.gov.br

acctesteredenprd

633911632411

saws028@caixa.gov.br

Audit

987277324478

saws003@caixa.gov.br

caaccount

556684849922

saws035@caixa.gov.br

cccefgov13579pro

065388464907

saws008@caixa.gov.br

contaacccilliumnprd

207630839217

saws029@caixa.gov.br

DevOps

469345420048

saws005@caixa.gov.br

LogsArchive

996818459544

saws004@caixa.gov.br

Networking

854768054370

saws006@caixa.gov.br

paasnprd

027574771582

saws020@caixa.gov.br

paasprd

675826764263

saws021@caixa.gov.br

©2026, Amazon Web Services, Inc. ou suas afiliadas. Todos os direitos reservados.
Privacidade
Termos
Preferências de cookies
