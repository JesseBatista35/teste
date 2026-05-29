Ajustar o Yaml das pipelines citadas acima para exportar o conteúdo da variável e inserir no build.gradle do app.


Criação solicitada por:REQ000095661629 Qual o tipo de serviço?: Ajustar ambiente ou parametrização de software


Qual o tipo de serviço?*:	Ajustar ambiente ou parametrização de software
Informar o Ambiente:*:	DES
Nome do serviço ou sistema:*:	SIAPT
Janela de atendimento:*:	27/5/2026 13:44:00
Prazo final da janela de atendimento:*:	28/5/2026 13:44:00
Haverá previsão de indisponibilidade durante a execução do serviço:*:	Não
Contato do responsável pela validação do ambiente após alteração:*:	Teams - C079249
Descrição da solicitação:*:	A
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
Pipeline devops.caixa

SIAPT

https://devops.caixa/projetos/Caixa/_git/SIAPT-android

Com a criação da variável de ambiente SD_KEY_BIOMETRIA, já atendido na REQ000144028419, será necessário ajustar o Yaml das pipelines citadas acima para exportar o conteúdo da variável e inserir no build.gradle do app.

Segue exemplo de implementação

variables:
  SD_KEY_BIOMETRIA: $(SD_KEY_BIOMETRIA)

steps:
  - script: ./gradlew assembleDebug

Será necessário ajustar o estágio da pipeline TQS.
Informar formas de contato:*:	Teams - C079249


Favor verificar se a criação da variavel conforme anexo em escopo de release TQS atende a equipe.

Caso contrário, edição de task terá que ser feita pela equipe de INFRA.



Peço reavaliar.
Atendimento similar foi realizado pelo Jessé Mouta Pereira batista na REQ000143846061


Segue mensagem de erro após a alteração:

2026-05-28T18:05:57.5873618Z ##[warning]Unable to expand variable 'SD_KEY_BIOMETRIA'. A cyclical reference was detected.


https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=477807&environmentId=2225466



SEGUE LINHA DE RACIOANCIO NO ATENDOMENTO A REQ000143846061


À CAIXA,

Prezados

WO0000080102789 - Concluida


Com autorizacao  de Flavio de Almeida Gagliardi, e Emerson Leal  foram realizados os ajustes nas pipelines de Release no Azure DevOps para exportar a variavel SD_KEY_BIOMETRIA e disponibilizar no build.gradle das aplicacoes Android.


Ajustes realizados:


SIFAM-Android-Nativo (Azure DevOps - Release):
Adicionado o parametro -PSD_KEY_BIOMETRIA=$(SD_KEY_BIOMETRIA) na variavel BuildGradle com scope Release, aplicando-se a todos os estagios (TQS, PLT e PRD)


A variavel SD_KEY_BIOMETRIA ja existia no Variable Group vinculado a pipeline


SIFGM-FGTS-Android (Azure DevOps - Release):
Adicionado o parametro -PSD_KEY_BIOMETRIA=$(SD_KEY_BIOMETRIA) na variavel BuildGradle com scope Release, aplicando-se a todos os estagios (TQS, PLT e PRD)


A variavel SD_KEY_BIOMETRIA ja existia no Variable Group vinculado a pipeline



Atenciosamente, 

Jesse Mouta Pereira Batista 
Analista - CTIS / CESTI Esteira DEVOPS DES TQS NPRD



Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIAPT-Android-Nativo
/
SIAPT-Android-Nativo 4.12.0 | ID 478684 | Code 238
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings
SIAPT-Android-Nativo

SIAPT-Android-Nativo 4.12.0 | ID 478684 | Code 238


TQS - Firebase

Succeeded


Pipeline

Tasks

Variables

Logs

Tests
Agent job
Started: 29/05/2026, 17:03:53
Pool:
Mobilidade-Linux-Proxy
·
Agent: AgentMobile-Proxy-3

30s

Initialize job
·
succeeded
<1s

Download App - Nexus
·
succeeded
<1s

Android - Firebase Distribution App
·
succeeded
29s

Finalize Job
·
succeeded
<1s
Row 2



AO VERIIFCAR O AMBEINDE DE DES E TQS RODOU AS 17:03. 

ME AJDA SO COM TEXTO PARA FECHAR A DEMANDA


