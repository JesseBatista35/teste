Avaliar erro ao tentar rodar a pipeline no github 

Prezados, ao tentarmos rodar as pipeline lines no github, estamos recebendo error.

Action: https://github.com/caixagithub/sisfm-mfe-host/actions/runs/36154830896/job/108137376620

Error:

Purge Cache
0s
Run echo "CUSTOM_DOMAIN=supergerenciador.des.caixa.gov.br"
  CUSTOM_DOMAIN=supergerenciador.des.caixa.gov.br
  * URL rejected: No host part in the URL
  * Closing connection
  curl: (3) URL rejected: No host part in the URL
  Error: Process completed with exit code 3.
Purge Cache
0s
Run echo "CUSTOM_DOMAIN=supergerenciador.des.caixa.gov.br"
  CUSTOM_DOMAIN=supergerenciador.des.caixa.gov.br
  * URL rejected: No host part in the URL
  * Closing connection
  curl: (3) URL rejected: No host part in the URL
  Error: Process completed with exit code 3.


Poderiam estar verificando, por favor?


Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
sisfm-mfe-host
Repository navigation
Code
Issues
Pull requests
Actions
Projects
Wiki
Security and quality
90
 (90)
Insights
Settings
CI/CD Workflow Generic
__. #60
All jobs
Run details
Annotations
1 error, 1 warning, and 1 notice
CI_DES / DEPLOY (DES)
failed 4 hours ago in 30s
Search logs
4s
1s
1s
7s
1s
1s
6s
4s
0s
Run caixagithub/DevSecOps-Actions/.github/integrations/azion/purge@main
  with:
    API_TOKEN: ***
    CUSTOM_DOMAIN: supergerenciador.des.caixa.gov.br
  env:
    DOCKER_TLS_VERIFY: 
    DOCKER_CERT_PATH: 
    pythonLocation: /opt/hostedtoolcache/Python/3.11.16/x64
    PKG_CONFIG_PATH: /opt/hostedtoolcache/Python/3.11.16/x64/lib/pkgconfig
    Python_ROOT_DIR: /opt/hostedtoolcache/Python/3.11.16/x64
    Python2_ROOT_DIR: /opt/hostedtoolcache/Python/3.11.16/x64
    Python3_ROOT_DIR: /opt/hostedtoolcache/Python/3.11.16/x64
    LD_LIBRARY_PATH: /opt/hostedtoolcache/Python/3.11.16/x64/lib
    ACCOUNT_KEY: 143495498779
    TESTE_FRONT_GERAL: qualquer_coisa
    LANGUAGE: node
    NODE_VERSION: v24.x
    BUILD_OUTPUT_DIRECTORY: dist
    BUCKET: s3-sisfm-mfe-host-des-nprd
    CLOUD_DISTRIBUTION_ID: E1YXXFWO38TOGA
    AWS_DEFAULT_REGION: sa-east-1
    AWS_REGION: sa-east-1
    AWS_ACCESS_KEY_ID: ***
    AWS_SECRET_ACCESS_KEY: ***
    AWS_SESSION_TOKEN: ***
Purge Cache
0s
Run echo "CUSTOM_DOMAIN=supergerenciador.des.caixa.gov.br"
  CUSTOM_DOMAIN=supergerenciador.des.caixa.gov.br
  * URL rejected: No host part in the URL
  * Closing connection
  curl: (3) URL rejected: No host part in the URL
  Error: Process completed with exit code 3.
0s
0s
0s
1s
0s
0s
0s
Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
DevSecOps-Actions
Repository navigation
Code
Issues
Pull requests
5
 (5)
Actions
Projects
Wiki
Security and quality
5
 (5)
Insights
Settings
Files
Go to file
t
T
chaintools content loaded
.github
android/default-build
chaintools
dockercontainer
dotnet
helm
maven
nodejs
python
integrations
apim
argocd
aws
azion/purge
azure
ibmCloud
nexus
openshift
sigsc
mobile
android
app/gcm
appdome
gradle
ios
mobile_first
python/prepare_python_for_IOS
siran/prepare_siran
xcode
security
codeql
owaspzap
util
check_valid_envs
create-pr
echo-env-test
ghas-security-check
git_tag
git_version
inject_secrets
install_jq_curl
load_variables_from_configmap
parse_config_map_to_vars
setting_image_vars
setting_initial_vars
summary
validate_deploy_envs
validate_qa_test
validate_topics
verificaCURLinstalado
windows/chaintools
ghostscript/ghostscript_setup
tesseract/tesseract_setup
wix
workflows
helm
appDomeReusableWorkflows.yml
buildGradle.yml
call-automated-topics-test.yaml
call-load-variables-from-configmap-test.yaml
check-code-scanning-alerts-test.yaml
check-dependabot-alerts-test.yaml
check-secret-scanning-test.yaml
gethostnametest.yaml
logBranchExpirada.yml
setting-initial-vars-test.yaml
validacaoIntegridade.yml
variaveis_xml.yaml
verificaVersaoBinario.yml
versioning.yml
zap-generate-full-rules.yaml
config
src
.gitignore
README.md
DevSecOps-Actions/.github/android
/default-build/
p564239_caixa
p564239_caixa
Update action.yaml
94eec4f
 · 
last week
Name	Last commit message	Last commit date
..
action.yaml
Update action.yaml
last week
 
chaintools content loaded


Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
code Search Results · repo:caixagithub/DevSecOps-Actions path:action
Filter by
Paths
Advanced
100 files
 (416 ms)
100 files
in
caixagithub/DevSecOps-Actions(press backspace or delete to remove)


.github/util/summary/action.yaml
YAML
·
0
 (0)
name: 'Gerar Sumário de Execução'
description: 'Gera um sumário detalhado da execução do workflow no GitHub Step Summary'
author: 'DevSecOps Team'
inputs:
  custom_title:
    description: 'Título customizado para o sumário'


.github/util/create-pr/action.yml
YAML
·
0
 (0)
name: Create PR
inputs:
  branch:
    required: true
  github_token:
    required: true


.github/security/codeql/action.yaml
YAML
·
0
 (0)
name: codeql_workflow
inputs:
language:
  description: linguagem analisada
  required: true 


.github/chaintools/dotnet/dotnet_lib_pack_and_push/action.yml
YAML
·
0
 (0)
name: Dotnet Pack and Push
description: Restaura, builda, empacota e faz push de uma lib .NET para o NuGet
inputs:
  versionApp:
    required: false
    default: ''


.github/util/git_version/action.yaml
YAML
·
0
 (0)
name: 'Git Version'
description: 'Formatando dados para versionamento semantico'
outputs:
  semantic_version:
    value: ${{ steps.setting_outputs.outputs.semantic_version }}
  major_minor_patch:


.github/mobile/mobile_first/action.yaml
YAML
·
0
 (0)
name: IOS Configura MOBILE PROVISION SET
description: 'IOS Configura MBILE PROVISION SET'
inputs:
  RUN_ENV:
    description: 'Ambiente de execução'
    required: true
    type: string


.github/integrations/argocd/pr/action.yml
YAML
·
0
 (0)
name: 'argocd-listener'
description: 'Argo CD Continuous Deployment'
inputs:
  repository:
    description: 'Nome do repositorio'
    required: false
    default: '${{ github.event.repository.name }}'


.github/chaintools/nodejs/build/action.yaml
YAML
·
0
 (0)
name: 'Node.js Build'
description: 'Node.js Build'
inputs:
  ng_goal:
    description: 'Comando node a ser executado'
    type: string
    default: 'npm run build'


.github/integrations/argocd/sync/action.yaml
YAML
·
0
 (0)
vname: 'ARGOCD SYNC'
description: 'ARGOCD SYNC'
inputs:
  ARGOCD_SERVER:  
    description: 'Argo SERVER'
    required: true
    type: string


.github/chaintools/dockercontainer/setup/action.yml
YAML
·
0
 (0)
name: 'Setup tools'
description: 'Reusable setup workflow for DevSecOps pipeline'
inputs:
  cloud_provider:
    description: 'Registry provider (azure ou onpremise) onde a imagem será implantada'
    required: true
    default: 'azure'


.github/integrations/nexus/verify/action.yaml
YAML
·
0
 (0)
name: 'Verify Nexus Artifact'
description: 'Verify Nexus Artifact'
runs:
  using: "composite"
  steps:
    - name: Verificar se artefato já existe


.github/integrations/argocd/repoinfra/action.yml
YAML
·
0
 (0)
name: 'argocd-listener'
description: 'Argo CD Continuous Deployment'
inputs:
  repository:  
    description: 'Nome do repositorio'
    required: false
    default: '${{ github.event.repository.name }}'


.github/mobile/ios/compilacao_ios/clean_build/action.yaml
YAML
·
0
 (0)
name: Clean & Build do projeto
description: 'Clean & Build do projeto'
inputs:
  versionApp:
    description: 'Versão da aplicação'
    required: true
    type: string


.github/integrations/apim/import/dotnet/action.yml
YAML
·
0
 (0)
name: Publish API Template
description: Importa o swagger da aplicação para o APIM
inputs:
  aks_url:
    required: true
  swagger_path:


.github/integrations/argocd/label/add/action.yaml
YAML
·
0
 (0)
name: 'Add Label'
description: 'Add Label'
inputs:
  repository:
    description: 'Nome do repositorio'
    required: false
    default: '${{ github.event.repository.name }}'


.github/mobile/siran/prepare_siran/action.yaml
YAML
·
0
 (0)
name: IOS Configura SIRAN
description: 'IOS Configura SIRAN'
runs:
  using: composite
  steps:
  - name: IOS Configura SIRAN
    run: chmod +x prebuild_siran.sh


.github/windows/chaintools/ghostscript/ghostscript_setup/action.yaml
YAML
·
0
 (0)
name: Install Ghostscript
description: 'Install Ghostscript'
runs:
  using: composite
  steps:


.github/chaintools/nodejs/nodejs_install_seguranca/action.yaml
YAML
·
0
 (0)
name: 'Instalar Pacote'
inputs:
  repository_name:
    description: 'Nome do repositório'
    required: true
    default: ${{ github.event.repository.name }}


.github/chaintools/helm/helm_replaceconfigmap/action.yml
YAML
·
0
 (0)
name: helm_helm_replaceconfigmap
runs:
  using: composite
  steps:
  - name: Replace tokens in values file
    uses: microsoft/variable-substitution@v1
    with:


.github/integrations/sigsc/reserveITSMts/action.yaml
YAML
·
0
 (0)
name: 'Reserve CRQ'
description: 'Reserves a CRQ and sets output variables'
inputs:
  environment_name:
    required: true
  api_token:
    required: true
