<img width="1909" height="915" alt="image" src="https://github.com/user-attachments/assets/5b533218-aa92-42f4-ae04-20ec6da9a4ad" />


Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
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

SIHDG

SIHDG-jboss8

Tasks

Variables

Triggers

Options

History
Predefined variables
nome_imagem
eap81-openjdk21-builder-openshift-rhel9
SITE
okd4_nprd
system.collectionId
7b4c9d5c-b041-4798-8dcb-fb11786a173b
system.definitionId
6651
system.teamProject
Caixa
tag_imagem
1.0.1
version.app
1.0.0-SNAPSHOT

Row 5

Row 2

Showing filters 1 through 2

Row 2

Row 3

Showing filters 1 through 2

Expanded

Collapsed

Row 7. Clickable

Showing 25 filtered items.

Get started and run this pipeline for the first time!

Showing 45 filtered items.

Showing 25 filtered items.

Row 2. Clickable

Row 2. Clickable

Showing 25 filtered items.

Get started and run this pipeline for the first time!

Showing 45 filtered items.

Showing 25 filtered items.






Login no Fortify...
 Name                          Type  Url                                          Created                  Expires                  Expired  Action  
 SIHDG-jboss8-3.12.0.7-773634  SSC   SSC:     https://sast.caixa/ssc              2026-07-17 14:26:49 UTC  2027-04-29 17:06:42 UTC  No       CREATED 
                                     SC-SAST: http://sast.caixa/scancentral-ctrl                                                                     
                                     SC-DAST: N/A (Disabled in SSC)                                                                                  


Criando aplicação no Fortify...
Loading action setup-appversion
Executing action setup-appversion
Creating SSC application version if non-existing
Executing fcli ssc av create SIHDG-jboss8:3.12.0 --skip-if-exists --auto-required-attrs --refresh "--add-users=SAST_Finan,SAST_Finan_Fabrica" "--attrs=Comunidade=FINANCEIRO E CONTROLADORIA,Sigla=SIHDG-jboss8" "--copy-from=SIHDG-jboss8:3.12.0" "--refresh-timeout=300s" 
 Id     Application name  Name    Active  Issue template name                   Created by            Action           
 27088  SIHDG-jboss8      3.12.0  true    Prioritized High Risk Issue Template  esteira_devops.caixa  SKIPPED_EXISTING 


Loading action setup-appversion
Executing action setup-appversion
Creating SSC application version if non-existing
Executing fcli ssc av create SIHDG-jboss8:3.12.0 --skip-if-exists --auto-required-attrs --refresh "--add-users=SAST_Finan,SAST_Finan_Fabrica" "--attrs=Comunidade=FINANCEIRO E CONTROLADORIA,Sigla=SIHDG-jboss8" "--refresh-timeout=300s" 
 Id     Application name  Name    Active  Issue template name                   Created by            Action           
 27088  SIHDG-jboss8      3.12.0  true    Prioritized High Risk Issue Template  esteira_devops.caixa  SKIPPED_EXISTING 


Atribuindo acessos ao Fortify...
 Id     Application name  Name    Active  Issue template name                   Created by            Action  
 27088  SIHDG-jboss8      3.12.0  true    Prioritized High Risk Issue Template  esteira_devops.caixa  UPDATED 


Logout do Fortify...
 Name                          Type  Url                                          Created                  Expires                  Expired  Action     
 SIHDG-jboss8-3.12.0.7-773634  SSC   SSC:     https://sast.caixa/ssc              2026-07-17 14:26:49 UTC  2027-04-29 17:06:42 UTC  No       TERMINATED 
                                     SC-SAST: http://sast.caixa/scancentral-ctrl                                                                        
                                     SC-DAST: N/A (Disabled in SSC)                                                                                     


Finishing: SAST: Cria Aplicação





Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
SIHDG-jboss8
/
3.12.0.7
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

Jobs in run #3.12.0.7
Login Cluster

View raw log

Starting: Login Cluster
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/b3fbf457-9c0f-4229-85f4-4f8708e40e5b.sh
+ echo okd4_nprd
+ egrep -q '^(okd4|ocp)'
+ oc login api.produtos4.caixa:6443 --insecure-skip-tls-verify=true --token=***
Finishing: Login Cluster
Row 2

Row 2

Row 3

Expanded

Collapsed

Row 7. Clickable

Showing 45 filtered items.

Showing 25 filtered items.

Row 2. Clickable

Row 2. Clickable

Showing 25 filtered items.

Get started and run this pipeline for the first time!

Showing 45 filtered items.

Showing 25 filtered items.

Showing 25 filtered items.

Get started and run this pipeline for the first time!

Showing 45 filtered items.

Showing 25 filtered items.

Row 2. Clickable

Row 2. Clickable



Login Cluster

View raw log

Starting: Login Cluster
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/b3fbf457-9c0f-4229-85f4-4f8708e40e5b.sh
+ echo okd4_nprd
+ egrep -q '^(okd4|ocp)'
+ oc login api.produtos4.caixa:6443 --insecure-skip-tls-verify=true --token=***
Finishing: Login Cluster


Starting: Criando Projeto Build
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/0b612aeb-1ea9-4782-baad-86e7c4438d58.sh
NAME               DISPLAY NAME   STATUS
build-images-ads                  Active
Finishing: Criando Projeto Build



Starting: Criando novo BuildConfig
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/a67b5c8b-dda5-4a87-be2d-9ea5e88250be.sh
+ echo okd4_nprd
+ egrep -q '^(okd4|ocp)'
+ buildconfig=sihdg-jboss8
+ oc get bc/sihdg-jboss8 -n build-images-ads
NAME           TYPE     FROM     LATEST
sihdg-jboss8   Source   Binary   25
+ '[' 0 -ne 0 ']'
Finishing: Criando novo BuildConfig



Starting: Atualizando valores BuildImage e TagImage
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/8edabe52-ed20-4d3f-82a6-699ddb712114.sh
buildconfig.build.openshift.io/sihdg-jboss8 patched (no change)
Finishing: Atualizando valores BuildImage e TagImage


Starting: Criando Image Tag - Build.BuildNumber
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/39f7d6d9-dec4-4ee4-b16b-f1d529c0c981.sh
+ echo okd4_nprd
+ egrep -q '^(okd4|ocp)'
+ buildconfig=sihdg-jboss8
+ oc tag build-images-ads/sihdg-jboss8:latest build-images-ads/sihdg-jboss8:3.12.0.7
Tag build-images-ads/sihdg-jboss8:3.12.0.7 set to build-images-ads/sihdg-jboss8@sha256:a65a6044971a37d4b6b74e9611365a0e6053fe1ecadd33c31c35922fa2b9d0d4.
Finishing: Criando Image Tag - Build.BuildNumber
