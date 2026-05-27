2026-05-27T19:17:09.4816640Z ##[section]Starting: Create BT Secret
2026-05-27T19:17:09.4820577Z ==============================================================================
2026-05-27T19:17:09.4820665Z Task         : Bash
2026-05-27T19:17:09.4820707Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-05-27T19:17:09.4820776Z Version      : 3.227.0
2026-05-27T19:17:09.4820819Z Author       : Microsoft Corporation
2026-05-27T19:17:09.4820870Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-05-27T19:17:09.4820963Z ==============================================================================
2026-05-27T19:17:09.6158767Z Generating script.
2026-05-27T19:17:09.6172260Z ========================== Starting Command Output ===========================
2026-05-27T19:17:09.6180773Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/f9575849-df0f-4174-a155-c5ee12988db3.sh
2026-05-27T19:17:09.6900318Z A secret 'bt-client-secret-sisgf-backend-des' já existe no namespace 'sisgf-des'.
2026-05-27T19:17:09.8506144Z A secret 'bt-client-secret-sisgf-backend-des' já contém os valores corretos. Nenhuma alteração necessária.
2026-05-27T19:17:09.8561653Z ##[section]Finishing: Create BT Secret




2026-05-27T19:17:12.0608386Z ##[section]Starting: Alterando valores placeholder no exec_secret.sh
2026-05-27T19:17:12.0611739Z ==============================================================================
2026-05-27T19:17:12.0611826Z Task         : Replace Tokens
2026-05-27T19:17:12.0611872Z Description  : Replace tokens in files
2026-05-27T19:17:12.0611956Z Version      : 3.3.1
2026-05-27T19:17:12.0611998Z Author       : Guillaume Rouchon
2026-05-27T19:17:12.0613580Z Help         : v3.3.1 - [More Information](https://github.com/qetza/vsts-replacetokens-task#readme)
2026-05-27T19:17:12.0613710Z ==============================================================================
2026-05-27T19:17:12.2603765Z replacing tokens in: /opt/ads-agent/_work/r6/a/exec_secret.sh
2026-05-27T19:17:12.2772319Z ##[section]Finishing: Alterando valores placeholder no exec_secret.sh



2026-05-27T19:17:12.2799988Z ##[section]Starting: Criando Secrets
2026-05-27T19:17:12.2803641Z ==============================================================================
2026-05-27T19:17:12.2803718Z Task         : Bash
2026-05-27T19:17:12.2803831Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-05-27T19:17:12.2803980Z Version      : 3.227.0
2026-05-27T19:17:12.2804024Z Author       : Microsoft Corporation
2026-05-27T19:17:12.2804147Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-05-27T19:17:12.2804221Z ==============================================================================
2026-05-27T19:17:12.4356581Z Generating script.
2026-05-27T19:17:12.4368012Z Formatted command: exec bash '/opt/ads-agent/_work/r6/a/exec_secret.sh'
2026-05-27T19:17:12.4370998Z ========================== Starting Command Output ===========================
2026-05-27T19:17:12.4378657Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/37d207cd-f611-4866-bc50-ae931e99ca58.sh
2026-05-27T19:17:12.5168873Z secret "sisgf-backend-des" deleted
2026-05-27T19:17:12.5933358Z secret/sisgf-backend-des created
2026-05-27T19:17:12.6015192Z ##[section]Finishing: Criando Secrets



2026-05-27T19:17:12.6039302Z ##[section]Starting: Vinculando Secrets
2026-05-27T19:17:12.6043000Z ==============================================================================
2026-05-27T19:17:12.6043155Z Task         : Bash
2026-05-27T19:17:12.6043200Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-05-27T19:17:12.6043263Z Version      : 3.227.0
2026-05-27T19:17:12.6043375Z Author       : Microsoft Corporation
2026-05-27T19:17:12.6043426Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-05-27T19:17:12.6043495Z ==============================================================================
2026-05-27T19:17:12.7684397Z Generating script.
2026-05-27T19:17:12.7695449Z ========================== Starting Command Output ===========================
2026-05-27T19:17:12.7702366Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/32f4372a-fc24-42d3-b2f1-2bc3d70c3788.sh
2026-05-27T19:17:12.7753651Z oc set env deploymentconfig/sisgf-backend-des --from=secret/sisgf-backend-des -n sisgf-des
2026-05-27T19:17:12.8732065Z deploymentconfig.apps.openshift.io/sisgf-backend-des updated
2026-05-27T19:17:12.8818534Z ##[section]Finishing: Vinculando Secrets



2026-05-27T19:17:12.8838824Z ##[section]Starting: Adicionando Multiplas Secrets
2026-05-27T19:17:12.8842036Z ==============================================================================
2026-05-27T19:17:12.8842115Z Task         : Bash
2026-05-27T19:17:12.8842158Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-05-27T19:17:12.8842252Z Version      : 3.227.0
2026-05-27T19:17:12.8842295Z Author       : Microsoft Corporation
2026-05-27T19:17:12.8842346Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-05-27T19:17:12.8842448Z ==============================================================================
2026-05-27T19:17:13.0325312Z Generating script.
2026-05-27T19:17:13.0337421Z ========================== Starting Command Output ===========================
2026-05-27T19:17:13.0345728Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/bb4bcab2-eef4-453e-b54a-34627ef3b8ff.sh
2026-05-27T19:17:13.0456764Z Variavel de ambiente com o certificado = CACERTIFICATE_SECUREFILEPATH=/opt/ads-agent/_work/_temp/caixa-truststore-acteste-nprd.jks
2026-05-27T19:17:13.0472604Z Encontrado certificado = caixa-truststore-acteste-nprd.jks com o PATH /opt/ads-agent/_work/_temp/caixa-truststore-acteste-nprd.jks
2026-05-27T19:17:13.0472890Z nome do arquivo final = caixa-truststore-acteste-nprd
2026-05-27T19:17:13.0502064Z nome da Secret Name = caixa-truststore-acteste-nprd
2026-05-27T19:17:13.0502308Z LOCALIZANDO SECRET OKD
2026-05-27T19:17:13.1128664Z NAME                            TYPE     DATA   AGE
2026-05-27T19:17:13.1129119Z caixa-truststore-acteste-nprd   Opaque   1      28m
2026-05-27T19:17:13.1153909Z EXCLUINDO SECRET OKD
2026-05-27T19:17:13.1882403Z secret "caixa-truststore-acteste-nprd" deleted
2026-05-27T19:17:13.1938306Z CRIANDO SECRET OKD
2026-05-27T19:17:13.2815615Z secret/caixa-truststore-acteste-nprd created
2026-05-27T19:17:13.2845804Z oc create secret generic caixa-truststore-acteste-nprd --from-file=caixa-truststore-acteste-nprd.jks -n sisgf-des
2026-05-27T19:17:13.2846285Z SET VOLUME COM NOVA SECRET
2026-05-27T19:17:13.3689474Z Variavel de ambiente com o certificado = DOWNLOADSECUREFILE1_SECUREFILEPATH=/opt/ads-agent/_work/_temp/caixa-truststore-acteste-nprd.jks
2026-05-27T19:17:13.3710579Z Encontrado certificado = caixa-truststore-acteste-nprd.jks com o PATH /opt/ads-agent/_work/_temp/caixa-truststore-acteste-nprd.jks
2026-05-27T19:17:13.3710870Z nome do arquivo final = caixa-truststore-acteste-nprd
2026-05-27T19:17:13.3742594Z nome da Secret Name = caixa-truststore-acteste-nprd
2026-05-27T19:17:13.3742815Z LOCALIZANDO SECRET OKD
2026-05-27T19:17:13.4404459Z NAME                            TYPE     DATA   AGE
2026-05-27T19:17:13.4405201Z caixa-truststore-acteste-nprd   Opaque   1      0s
2026-05-27T19:17:13.4431079Z EXCLUINDO SECRET OKD
2026-05-27T19:17:13.5158850Z secret "caixa-truststore-acteste-nprd" deleted
2026-05-27T19:17:13.5241078Z CRIANDO SECRET OKD
2026-05-27T19:17:13.5985049Z secret/caixa-truststore-acteste-nprd created
2026-05-27T19:17:13.6076666Z oc create secret generic caixa-truststore-acteste-nprd --from-file=caixa-truststore-acteste-nprd.jks -n sisgf-des
2026-05-27T19:17:13.6076932Z SET VOLUME COM NOVA SECRET
2026-05-27T19:17:13.6959308Z Variavel de ambiente com o certificado = DOWNLOADSECUREFILE2_SECUREFILEPATH=/opt/ads-agent/_work/_temp/caixa-truststore-acteste-nprd.jks
2026-05-27T19:17:13.6980164Z Encontrado certificado = caixa-truststore-acteste-nprd.jks com o PATH /opt/ads-agent/_work/_temp/caixa-truststore-acteste-nprd.jks
2026-05-27T19:17:13.6980544Z nome do arquivo final = caixa-truststore-acteste-nprd
2026-05-27T19:17:13.7009105Z nome da Secret Name = caixa-truststore-acteste-nprd
2026-05-27T19:17:13.7009738Z LOCALIZANDO SECRET OKD
2026-05-27T19:17:13.7676865Z NAME                            TYPE     DATA   AGE
2026-05-27T19:17:13.7677445Z caixa-truststore-acteste-nprd   Opaque   1      0s
2026-05-27T19:17:13.7703254Z EXCLUINDO SECRET OKD
2026-05-27T19:17:13.8488770Z secret "caixa-truststore-acteste-nprd" deleted
2026-05-27T19:17:13.8545136Z CRIANDO SECRET OKD
2026-05-27T19:17:13.9450884Z secret/caixa-truststore-acteste-nprd created
2026-05-27T19:17:13.9480714Z oc create secret generic caixa-truststore-acteste-nprd --from-file=caixa-truststore-acteste-nprd.jks -n sisgf-des
2026-05-27T19:17:13.9481354Z SET VOLUME COM NOVA SECRET
2026-05-27T19:17:14.0322371Z ##[section]Finishing: Adicionando Multiplas Secrets





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
SISGF-backend-okd4
/
SISGF-backend-20260527.1544-11.01.01.01-SNAPSHOT(3)
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
SISGF-backend-okd4

SISGF-backend-20260527.1544-11.01.01.01-SNAPSHOT(3)


EC DES

Failed


Pipeline

Tasks

Variables

Logs

Tests
Agent job
Started: 27/05/2026, 16:16:53
Pool:
Release-Linux-OKD4
·
Agent: azp-ads-agent-release-5cd876f98-rjttk

3m 49s

Initialize job
·
succeeded
<1s

Pre-job: Download secure file
·
succeeded
<1s

Pre-job: Download secure file
·
succeeded
<1s

Download Artifacts
·
succeeded
1 warning
<1s

Exportando as variáveis do arquivo Trust Store
·
succeeded
<1s

Recuperando nome do repositório
·
succeeded
1s

Convertendo Minúsculo e Definindo nome do Projeto/Repositório
·
succeeded
<1s

Git clone https://devops.caixa/projetos/Infraestrutura/_git/esteira-logs
·
succeeded
<1s

Cria Streams Graylog
·
succeeded
2s

Recupera VEC
·
succeeded
1s

VEC - Aferição
·
succeeded
1 warning
<1s

Login OpenShift
·
succeeded
<1s

Exportando Variáveis de Ambiente "_ENV."
·
succeeded
<1s

Criando novo Projeto
·
succeeded
<1s

Adicionando ISTIO_INJECTION
·
skipped


Criando nova APP
·
succeeded
<1s

Atualizando Variáveis de Ambiente
·
succeeded
5s

Criando Rota Customizada
·
succeeded
<1s

Aplicando Service Mesh
·
skipped


Git clone https://devops.caixa/projetos/Infraestrutura/_git/esteira-beyondtrust-check
·
succeeded
<1s

Create BT Secret
·
succeeded
<1s

Create BT Shared Volume
·
succeeded
<1s

Create BT Sidecar
·
succeeded
<1s

Create Secret Check Script
·
succeeded
<1s

Create Secret Check
·
succeeded
<1s

Create BT App Mount Volume
·
succeeded
<1s

Exporta Variáveis de Ambiente "_SECRET."
·
succeeded
<1s

Alterando valores placeholder no exec_secret.sh
·
succeeded
<1s

Criando Secrets
·
succeeded
<1s

Vinculando Secrets
·
succeeded
<1s

Adicionando Multiplas Secrets
·
succeeded
1s

Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
·
succeeded
20s

Concedendo Acesso OKD
·
succeeded
<1s

Verificando IP de Saída
·
succeeded
<1s

Configurando IP de Saída
·
succeeded
<1s

Cadastrando no Portal IIF
·
succeeded
<1s

Verificando Status do Deployment
·
canceled
3m 6s
The Operation will be canceled. The next steps may not contain expected logs.
The operation was canceled.

Logs da Aplicação
·
succeeded
<1s

Resumo da Release
·
skipped


Coletando dados da imagem
·
skipped


Atualizando versão no PortalIF
·
skipped


Realizando Logout OKD
·
succeeded
<1s

Finalize Job
·
succeeded
<1s
Task enabled

Showing filters 1 through 2

Row 2

Row 2

