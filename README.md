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
SIAVO

SIAVO-ms-spa

Tasks

Variables

Triggers

Options

History
Predefined variables
BUILD_VARIABLES (59)
Variáveis disponíveis para todas as builds.
ANSIBLE_INVENTORY
$(HOME_ADS_AGENT)/$(DIR_ANSIBLE)/hosts
ANSIBLE_VAULT
********
AZPAT
********
AZUSER
s736639
DIR_ANSIBLE
esteira-qa
DOTNET_TESTARGS
--configuration Release --collect "code coverage"
FORTIFY_API
https://novocodigoseguro.caixa/ssc/api/v1
FORTIFY_APITOKEN
********
FORTIFY_BUILD_FILE
.
FORTIFY_CI_TOKEN
********
FORTIFY_CLIENT_AUTH_TOKEN
********
FORTIFY_PASS
********
FORTIFY_POOL_COMPLEX_NOVO
55e6b358-710a-4c3d-ad15-4a3ec96c3dca
FORTIFY_POOL_DIAMOND_NOVO
9fa96d5a-3b13-4ecb-8639-e2ec97d1b4e9
FORTIFY_POOL_GOLD_NOVO
1a3e11fe-719a-475a-905b-e61b743e550d
FORTIFY_POOL_MONOLITO_NOVO
7c2e05fb-2f1d-4045-ac12-69c806df50be
FORTIFY_POOL_SILVER_NOVO
794601f7-da27-467b-a734-06f92c4d63aa
FORTIFY_REGEX
'(?:\*\/)?(\d{1,3}\.\d{1,3}\.\d{1,3})'
FORTIFY_REGISTRY_PASSWORD
********
FORTIFY_REGISTRY_USERNAME
ads-sa
FORTIFY_SENSOR_VERSION
24.4
FORTIFY_TOKEN
********
FORTIFY_UPTOKEN
********
FORTIFY_URL
https://sast.caixa/ssc
FORTIFY_URL_CONTROLLER
http://sast.caixa/scancentral-ctrl
FORTIFY_USER
admin
HOME_ADS_AGENT
/opt/ads-agent
KEYSTORE_PWD
********
KEYSTORE_SECUREFILEPATH
/etc/pki/ca-trust/source/anchors/keystore-ssc24.jks
NEXUS_REPOSITORY_ID
NEXUS_INTERNO
NEXUS_URL_ANGULAR_RELEASE
http://binario.caixa:8081/repository/caixa-raw-releases/angular
NEXUS_URL_ANGULAR_SNAPSHOT
http://binario.caixa:8081/repository/caixa-raw-snapshots/angular
NEXUS_URL_ASP_RELEASE
http://binario.caixa:8081/repository/caixa-raw-releases/asp
NEXUS_URL_ASP_SNAPHOT
http://binario.caixa:8081/repository/caixa-raw-snapshots/asp
NEXUS_URL_CAIXA_GROUP
http://binario.caixa:8081/repository/caixa-group-br/
NEXUS_URL_DOTNET_RELEASE
http://binario.caixa:8081/repository/caixa-raw-releases/dotnet
NEXUS_URL_DOTNET_SNAPSHOT
http://binario.caixa:8081/repository/caixa-raw-snapshots/dotnet
NEXUS_URL_MAVEN_RELEASE
http://binario.caixa:8081/repository/releases
NEXUS_URL_MAVEN_SNAPSHOT
http://binario.caixa:8081/repository/snapshots
NEXUS_URL_NODE_INTERNAL_RELEASE
http://binario.caixa:8081/repository/npm-internal
NEXUS_URL_NODE_RELEASE
http://binario.caixa:8081/repository/caixa-raw-releases/node
NEXUS_URL_NODE_SNAPSHOT
http://binario.caixa:8081/repository/caixa-raw-snapshots/node
NEXUS_URL_NPM_RELEASE
http://binario.caixa:8081/repository/caixa-npm-releases/
NEXUS_URL_NPM_SNAPSHOT
http://binario.caixa:8081/repository/caixa-npm-snapshots/
NEXUS_URL_PHP_RELEASE
http://binario.caixa:8081/repository/caixa-php-releases
NEXUS_URL_PHP_SNAPSHOT
http://binario.caixa:8081/repository/caixa-php-snapshots
NEXUS_URL_RAW_RELEASE
http://binario.caixa:8081/repository/caixa-raw-releases
NEXUS_URL_RAW_SNAPSHOT
http://binario.caixa:8081/repository/caixa-raw-snapshots
NEXUS_URL_ZCONBT_RELEASE
http://binario.caixa:8081/repository/caixa-raw-releases/zconbt
NEXUS_URL_ZCONBT_SNAPSHOT
http://binario.caixa:8081/repository/caixa-raw-snapshots/zconbt
NODE_EXTRA_CA_CERTS
/etc/pki/ca-trust/source/anchors/AC-V4.cer
SCANCENTRAL_URL
http://scancentral.apps.produtos4.caixa/scancentral-ctrl
SSC_URL
https://novocodigoseguro.caixa/ssc
ScanCentral.ClientToken
********
ScanCentral.SscCiToken
********
fortify_disable
false
nexus_interno_pass
********
nexus_interno_user
pipeline-agil
sonar_disable
false
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
KIND_DEPLOY
deploymentconfig
OKD_API_REGISTRY
api.produtos4.caixa:6443
OKD_REGISTRY
default-route-openshift-image-registry.apps.produtos4.caixa
OKD_TOKEN_REGISTRY
********
OKD_USER_SERVICE_REGISTRY
ads-sa
ProjetoBuild
build-images-ads
TIMEOUT_DEPLOY
300
SONAR_VARIABLES - ESTEIRA (8)
Variáveis do SONAR disponíveis para todas as builds.
SONAR_JAVA_BINARIES
.
SONAR_JAVA_COVERAGEPLUGIN
jacoco
SONAR_JAVA_LIBRARIES
.
SONAR_LOGIN
ads-sa
SONAR_PASSWORD
********
SONAR_PROPERTIES
-Dproject.settings=NONE -Dsonar.branch.name=$(sonar_branch) -Dsonar.java.binaries=$(SONAR_JAVA_BINARIES) -Dsonar.java.coveragePlugin=$(SONAR_JAVA_COVERAGEPLUGIN) -Dsonar.java.libraries=$(SONAR_JAVA_LIBRARIES) -Dsonar.coverage.jacoco.xmlReportPaths=`find . -path '*jacoco.xml' | sed 's/.*/&/' | tr '\n' ','` -Dsonar.junit.reportPaths=`find . -type d -name 'surefire-reports' | sed 's/.*/&/' | tr '\n' ','` -X
SONAR_URL
http://sonar-esteira.apps.produtos4.caixa
_SECRET.SONAR_PASSWORD
SONAR_PASSWORD
SAST_FORTIFY_COMUNIDADE_FOMENTO (4)
WO0000076688772
FORTIFY_COMUNIDADE
FOMENTO
FORTIFY_FILTERSET_GUARDRAIL
32142c2d-3f7f-4863-a1bf-9b1e2f34d2ed
FORTIFY_LDAP_GROUP
SAST_Fomento,SAST_Fomento_Fabrica
FORTIFY_SENSOR_POOL
a4993bd3-4bb1-4460-810a-965981db9cae
|Manage variable groups
Row 2

Row 2

Row 2

Row 2

Row 2

Row 2. Clickable

Row 2. Clickable

Showing 28 filtered items.

Showing 25 filtered items.

Row 2. Clickable

Row 2. Clickable

Showing 25 filtered items.

Get started and run this pipeline for the first time!

Showing 28 filtered items.

Showing 25 filtered items.

Row 13. Clickable

Showing 25 filtered items.

Get started and run this pipeline for the first time!

Showing 28 filtered items.

Showing 25 filtered items.

Cannot edit in read-only editor


<img width="1522" height="822" alt="image" src="https://github.com/user-attachments/assets/2ccceea7-39c0-4a27-b9c8-e5e659e5c43a" />



2026-11-09T15:28:06.9507064Z ##[section]Starting: npm install
2026-11-09T15:28:06.9511955Z ==============================================================================
2026-11-09T15:28:06.9512091Z Task         : npm
2026-11-09T15:28:06.9512140Z Description  : Install and publish npm packages, or run an npm command. Supports npmjs.com and authenticated registries like Azure Artifacts.
2026-11-09T15:28:06.9512237Z Version      : 1.221.0
2026-11-09T15:28:06.9512329Z Author       : Microsoft Corporation
2026-11-09T15:28:06.9512385Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/package/npm
2026-11-09T15:28:06.9512602Z ==============================================================================
2026-11-09T15:28:07.1776115Z [command]/opt/ads-agent/_work/_tool/node/18.19.0/x64/bin/npm --version
2026-11-09T15:28:07.4325310Z 10.2.3
2026-11-09T15:28:08.0172415Z [command]/opt/ads-agent/_work/_tool/node/18.19.0/x64/bin/npm config list
2026-11-09T15:28:08.2980880Z npm verb cli /opt/ads-agent/_work/_tool/node/18.19.0/x64/bin/node /opt/ads-agent/_work/_tool/node/18.19.0/x64/bin/npm
2026-11-09T15:28:08.2981327Z npm info using npm@10.2.3
2026-11-09T15:28:08.2981452Z npm info using node@v18.19.0
2026-11-09T15:28:08.2981667Z npm verb title npm config list
2026-11-09T15:28:08.2981818Z npm verb argv "config" "list"
2026-11-09T15:28:08.2982118Z npm verb logfile logs-max:10 dir:/opt/ads-agent/.npm/_logs/2026-11-09T15_28_08_226Z-
2026-11-09T15:28:08.2982406Z npm verb logfile /opt/ads-agent/.npm/_logs/2026-11-09T15_28_08_226Z-debug-0.log
2026-11-09T15:28:08.2982788Z npm verb exit 0
2026-11-09T15:28:08.2982927Z npm info ok 
2026-11-09T15:28:08.2983154Z ; "project" config from /opt/ads-agent/_work/15/s/.npmrc
2026-11-09T15:28:08.2983221Z 
2026-11-09T15:28:08.2983439Z disturl = "http://binario.caixa:8081/repository/nodejs/" 
2026-11-09T15:28:08.2983661Z email = "pipeline-agil@mail.caixa" 
2026-11-09T15:28:08.2983888Z registry = "http://binario.caixa:8081/repository/npm-all/" 
2026-11-09T15:28:08.2984112Z sass_binary_site = "http://binario.caixa:8081/repository/node-sass/" 
2026-11-09T15:28:08.2984633Z 
2026-11-09T15:28:08.2984794Z ; "env" config from environment
2026-11-09T15:28:08.2984845Z 
2026-11-09T15:28:08.2985014Z loglevel = "verbose" 
2026-11-09T15:28:08.2985249Z userconfig = "/opt/ads-agent/_work/15/npm/872867.npmrc" 
2026-11-09T15:28:08.2985308Z 
2026-11-09T15:28:08.2985541Z ; node bin location = /opt/ads-agent/_work/_tool/node/18.19.0/x64/bin/node
2026-11-09T15:28:08.2985722Z ; node version = v18.19.0
2026-11-09T15:28:08.2985926Z ; npm local prefix = /opt/ads-agent/_work/15/s
2026-11-09T15:28:08.2986078Z ; npm version = 10.2.3
2026-11-09T15:28:08.2986225Z ; cwd = /opt/ads-agent/_work/15/s
2026-11-09T15:28:08.2986426Z ; HOME = /opt/ads-agent
2026-11-09T15:28:08.2986621Z ; Run `npm config ls -l` to show all defaults.
2026-11-09T15:28:08.2988179Z [command]/opt/ads-agent/_work/_tool/node/18.19.0/x64/bin/npm install --no-audit --verbose
2026-11-09T15:28:21.2887940Z npm verb cli /opt/ads-agent/_work/_tool/node/18.19.0/x64/bin/node /opt/ads-agent/_work/_tool/node/18.19.0/x64/bin/npm
2026-11-09T15:28:21.2888258Z npm info using npm@10.2.3
2026-11-09T15:28:21.2888430Z npm info using node@v18.19.0
2026-11-09T15:28:21.2888723Z npm verb title npm install
2026-11-09T15:28:21.2888840Z 
2026-11-09T15:28:21.2888951Z added 1173 packages in 13s
2026-11-09T15:28:21.2889042Z 
2026-11-09T15:28:21.2889185Z 197 packages are looking for funding
2026-11-09T15:28:21.2889300Z   run `npm fund` for details
2026-11-09T15:28:21.2889732Z npm verb argv "install" "--no-audit" "--loglevel" "verbose"
2026-11-09T15:28:21.2890163Z npm verb logfile logs-max:10 dir:/opt/ads-agent/.npm/_logs/2026-11-09T15_28_08_503Z-
2026-11-09T15:28:21.2890446Z npm verb logfile /opt/ads-agent/.npm/_logs/2026-11-09T15_28_08_503Z-debug-0.log
2026-11-09T15:28:21.2890635Z npm WARN EBADENGINE Unsupported engine {
2026-11-09T15:28:21.2890888Z npm WARN EBADENGINE   package: '@angular-devkit/build-angular@19.2.27',
2026-11-09T15:28:21.2891119Z npm WARN EBADENGINE   required: {
2026-11-09T15:28:21.2891746Z npm WARN EBADENGINE     node: '^18.19.1 || ^20.11.1 || >=22.0.0',
2026-11-09T15:28:21.2892002Z npm WARN EBADENGINE     npm: '^6.11.0 || ^7.5.6 || >=8.0.0',
2026-11-09T15:28:21.2892179Z npm WARN EBADENGINE     yarn: '>= 1.13.0'
2026-11-09T15:28:21.2892437Z npm WARN EBADENGINE   },
2026-11-09T15:28:21.2892727Z npm WARN EBADENGINE   current: { node: 'v18.19.0', npm: '10.2.3' }
2026-11-09T15:28:21.2892894Z npm WARN EBADENGINE }
2026-11-09T15:28:21.2893052Z npm WARN EBADENGINE Unsupported engine {
2026-11-09T15:28:21.2893286Z npm WARN EBADENGINE   package: '@angular-devkit/architect@0.1902.27',
2026-11-09T15:28:21.2893458Z npm WARN EBADENGINE   required: {
2026-11-09T15:28:21.2893696Z npm WARN EBADENGINE     node: '^18.19.1 || ^20.11.1 || >=22.0.0',
2026-11-09T15:28:21.2893888Z npm WARN EBADENGINE     npm: '^6.11.0 || ^7.5.6 || >=8.0.0',
2026-11-09T15:28:21.2894095Z npm WARN EBADENGINE     yarn: '>= 1.13.0'
2026-11-09T15:28:21.2894252Z npm WARN EBADENGINE   },
2026-11-09T15:28:21.2894497Z npm WARN EBADENGINE   current: { node: 'v18.19.0', npm: '10.2.3' }
2026-11-09T15:28:21.2894767Z npm WARN EBADENGINE }
2026-11-09T15:28:21.2894919Z npm WARN EBADENGINE Unsupported engine {
2026-11-09T15:28:21.2895155Z npm WARN EBADENGINE   package: '@angular-devkit/build-webpack@0.1902.27',
2026-11-09T15:28:21.2895340Z npm WARN EBADENGINE   required: {
2026-11-09T15:28:21.2895565Z npm WARN EBADENGINE     node: '^18.19.1 || ^20.11.1 || >=22.0.0',
2026-11-09T15:28:21.2895753Z npm WARN EBADENGINE     npm: '^6.11.0 || ^7.5.6 || >=8.0.0',
2026-11-09T15:28:21.2895964Z npm WARN EBADENGINE     yarn: '>= 1.13.0'
2026-11-09T15:28:21.2896123Z npm WARN EBADENGINE   },
2026-11-09T15:28:21.2896398Z npm WARN EBADENGINE   current: { node: 'v18.19.0', npm: '10.2.3' }
2026-11-09T15:28:21.2896557Z npm WARN EBADENGINE }
2026-11-09T15:28:21.2896714Z npm WARN EBADENGINE Unsupported engine {
2026-11-09T15:28:21.2896944Z npm WARN EBADENGINE   package: '@angular-devkit/architect@0.1902.27',
2026-11-09T15:28:21.2897124Z npm WARN EBADENGINE   required: {
2026-11-09T15:28:21.2897307Z npm WARN EBADENGINE     node: '^18.19.1 || ^20.11.1 || >=22.0.0',
2026-11-09T15:28:21.2897664Z npm WARN EBADENGINE     npm: '^6.11.0 || ^7.5.6 || >=8.0.0',
2026-11-09T15:28:21.2897868Z npm WARN EBADENGINE     yarn: '>= 1.13.0'
2026-11-09T15:28:21.2898020Z npm WARN EBADENGINE   },
2026-11-09T15:28:21.2898259Z npm WARN EBADENGINE   current: { node: 'v18.19.0', npm: '10.2.3' }
2026-11-09T15:28:21.2898414Z npm WARN EBADENGINE }
2026-11-09T15:28:21.2898617Z npm WARN EBADENGINE Unsupported engine {
2026-11-09T15:28:21.2898857Z npm WARN EBADENGINE   package: '@angular-devkit/core@19.2.27',
2026-11-09T15:28:21.2898981Z npm WARN EBADENGINE   required: {
2026-11-09T15:28:21.2899199Z npm WARN EBADENGINE     node: '^18.19.1 || ^20.11.1 || >=22.0.0',
2026-11-09T15:28:21.2899433Z npm WARN EBADENGINE     npm: '^6.11.0 || ^7.5.6 || >=8.0.0',
2026-11-09T15:28:21.2899640Z npm WARN EBADENGINE     yarn: '>= 1.13.0'
2026-11-09T15:28:21.2899792Z npm WARN EBADENGINE   },
2026-11-09T15:28:21.2900040Z npm WARN EBADENGINE   current: { node: 'v18.19.0', npm: '10.2.3' }
2026-11-09T15:28:21.2900204Z npm WARN EBADENGINE }
2026-11-09T15:28:21.2900368Z npm WARN EBADENGINE Unsupported engine {
2026-11-09T15:28:21.2900556Z npm WARN EBADENGINE   package: '@angular-devkit/schematics@19.2.27',
2026-11-09T15:28:21.2900724Z npm WARN EBADENGINE   required: {
2026-11-09T15:28:21.2900949Z npm WARN EBADENGINE     node: '^18.19.1 || ^20.11.1 || >=22.0.0',
2026-11-09T15:28:21.2901180Z npm WARN EBADENGINE     npm: '^6.11.0 || ^7.5.6 || >=8.0.0',
2026-11-09T15:28:21.2901388Z npm WARN EBADENGINE     yarn: '>= 1.13.0'
2026-11-09T15:28:21.2901543Z npm WARN EBADENGINE   },
2026-11-09T15:28:21.2901780Z npm WARN EBADENGINE   current: { node: 'v18.19.0', npm: '10.2.3' }
2026-11-09T15:28:21.2901936Z npm WARN EBADENGINE }
2026-11-09T15:28:21.2902094Z npm WARN EBADENGINE Unsupported engine {
2026-11-09T15:28:21.2902276Z npm WARN EBADENGINE   package: '@angular/animations@19.2.25',
2026-11-09T15:28:21.2902517Z npm WARN EBADENGINE   required: { node: '^18.19.1 || ^20.11.1 || >=22.0.0' },
2026-11-09T15:28:21.2902833Z npm WARN EBADENGINE   current: { node: 'v18.19.0', npm: '10.2.3' }
2026-11-09T15:28:21.2902990Z npm WARN EBADENGINE }
2026-11-09T15:28:21.2903140Z npm WARN EBADENGINE Unsupported engine {
2026-11-09T15:28:21.2903358Z npm WARN EBADENGINE   package: '@angular/build@19.2.27',
2026-11-09T15:28:21.2903532Z npm WARN EBADENGINE   required: {
2026-11-09T15:28:21.2903760Z npm WARN EBADENGINE     node: '^18.19.1 || ^20.11.1 || >=22.0.0',
2026-11-09T15:28:21.2903947Z npm WARN EBADENGINE     npm: '^6.11.0 || ^7.5.6 || >=8.0.0',
2026-11-09T15:28:21.2904151Z npm WARN EBADENGINE     yarn: '>= 1.13.0'
2026-11-09T15:28:21.2904300Z npm WARN EBADENGINE   },
2026-11-09T15:28:21.2904575Z npm WARN EBADENGINE   current: { node: 'v18.19.0', npm: '10.2.3' }
2026-11-09T15:28:21.2904746Z npm WARN EBADENGINE }
2026-11-09T15:28:21.2904895Z npm WARN EBADENGINE Unsupported engine {
2026-11-09T15:28:21.2905124Z npm WARN EBADENGINE   package: '@angular-devkit/architect@0.1902.27',
2026-11-09T15:28:21.2905317Z npm WARN EBADENGINE   required: {
2026-11-09T15:28:21.2905498Z npm WARN EBADENGINE     node: '^18.19.1 || ^20.11.1 || >=22.0.0',
2026-11-09T15:28:21.2905756Z npm WARN EBADENGINE     npm: '^6.11.0 || ^7.5.6 || >=8.0.0',
2026-11-09T15:28:21.2905963Z npm WARN EBADENGINE     yarn: '>= 1.13.0'
2026-11-09T15:28:21.2906106Z npm WARN EBADENGINE   },
2026-11-09T15:28:21.2906335Z npm WARN EBADENGINE   current: { node: 'v18.19.0', npm: '10.2.3' }
2026-11-09T15:28:21.2906501Z npm WARN EBADENGINE }
2026-11-09T15:28:21.2906660Z npm WARN EBADENGINE Unsupported engine {
2026-11-09T15:28:21.2906883Z npm WARN EBADENGINE   package: '@angular/cli@19.2.27',
2026-11-09T15:28:21.2907064Z npm WARN EBADENGINE   required: {
2026-11-09T15:28:21.2907246Z npm WARN EBADENGINE     node: '^18.19.1 || ^20.11.1 || >=22.0.0',
2026-11-09T15:28:21.2907473Z npm WARN EBADENGINE     npm: '^6.11.0 || ^7.5.6 || >=8.0.0',
2026-11-09T15:28:21.2907679Z npm WARN EBADENGINE     yarn: '>= 1.13.0'
2026-11-09T15:28:21.2907832Z npm WARN EBADENGINE   },
2026-11-09T15:28:21.2908098Z npm WARN EBADENGINE   current: { node: 'v18.19.0', npm: '10.2.3' }
2026-11-09T15:28:21.2908255Z npm WARN EBADENGINE }
2026-11-09T15:28:21.2908401Z npm WARN EBADENGINE Unsupported engine {
2026-11-09T15:28:21.2908634Z npm WARN EBADENGINE   package: '@angular-devkit/architect@0.1902.27',
2026-11-09T15:28:21.2908759Z npm WARN EBADENGINE   required: {
2026-11-09T15:28:21.2909061Z npm WARN EBADENGINE     node: '^18.19.1 || ^20.11.1 || >=22.0.0',
2026-11-09T15:28:21.2909285Z npm WARN EBADENGINE     npm: '^6.11.0 || ^7.5.6 || >=8.0.0',
2026-11-09T15:28:21.2909491Z npm WARN EBADENGINE     yarn: '>= 1.13.0'
2026-11-09T15:28:21.2909649Z npm WARN EBADENGINE   },
2026-11-09T15:28:21.2909870Z npm WARN EBADENGINE   current: { node: 'v18.19.0', npm: '10.2.3' }
2026-11-09T15:28:21.2910028Z npm WARN EBADENGINE }
2026-11-09T15:28:21.2910246Z npm WARN EBADENGINE Unsupported engine {
2026-11-09T15:28:21.2910456Z npm WARN EBADENGINE   package: '@angular/common@19.2.25',
2026-11-09T15:28:21.2910708Z npm WARN EBADENGINE   required: { node: '^18.19.1 || ^20.11.1 || >=22.0.0' },
2026-11-09T15:28:21.2910970Z npm WARN EBADENGINE   current: { node: 'v18.19.0', npm: '10.2.3' }
2026-11-09T15:28:21.2911127Z npm WARN EBADENGINE }
2026-11-09T15:28:21.2911276Z npm WARN EBADENGINE Unsupported engine {
2026-11-09T15:28:21.2911493Z npm WARN EBADENGINE   package: '@angular/compiler@19.2.25',
2026-11-09T15:28:21.2911737Z npm WARN EBADENGINE   required: { node: '^18.19.1 || ^20.11.1 || >=22.0.0' },
2026-11-09T15:28:21.2911980Z npm WARN EBADENGINE   current: { node: 'v18.19.0', npm: '10.2.3' }
2026-11-09T15:28:21.2912152Z npm WARN EBADENGINE }
2026-11-09T15:28:21.2912264Z npm WARN EBADENGINE Unsupported engine {
2026-11-09T15:28:21.2912492Z npm WARN EBADENGINE   package: '@angular/compiler-cli@19.2.25',
2026-11-09T15:28:21.2912802Z npm WARN EBADENGINE   required: { node: '^18.19.1 || ^20.11.1 || >=22.0.0' },
2026-11-09T15:28:21.2913042Z npm WARN EBADENGINE   current: { node: 'v18.19.0', npm: '10.2.3' }
2026-11-09T15:28:21.2913251Z npm WARN EBADENGINE }
2026-11-09T15:28:21.2913404Z npm WARN EBADENGINE Unsupported engine {
2026-11-09T15:28:21.2913619Z npm WARN EBADENGINE   package: '@angular/core@19.2.25',
2026-11-09T15:28:21.2913873Z npm WARN EBADENGINE   required: { node: '^18.19.1 || ^20.11.1 || >=22.0.0' },
2026-11-09T15:28:21.2914071Z npm WARN EBADENGINE   current: { node: 'v18.19.0', npm: '10.2.3' }
2026-11-09T15:28:21.2914225Z npm WARN EBADENGINE }
2026-11-09T15:28:21.2914369Z npm WARN EBADENGINE Unsupported engine {
2026-11-09T15:28:21.2914676Z npm WARN EBADENGINE   package: '@angular/forms@19.2.25',
2026-11-09T15:28:21.2914931Z npm WARN EBADENGINE   required: { node: '^18.19.1 || ^20.11.1 || >=22.0.0' },
2026-11-09T15:28:21.2915168Z npm WARN EBADENGINE   current: { node: 'v18.19.0', npm: '10.2.3' }
2026-11-09T15:28:21.2915323Z npm WARN EBADENGINE }
2026-11-09T15:28:21.2915485Z npm WARN EBADENGINE Unsupported engine {
2026-11-09T15:28:21.2915712Z npm WARN EBADENGINE   package: '@angular/platform-browser@19.2.25',
2026-11-09T15:28:21.2915918Z npm WARN EBADENGINE   required: { node: '^18.19.1 || ^20.11.1 || >=22.0.0' },
2026-11-09T15:28:21.2916154Z npm WARN EBADENGINE   current: { node: 'v18.19.0', npm: '10.2.3' }
2026-11-09T15:28:21.2916313Z npm WARN EBADENGINE }
2026-11-09T15:28:21.2916481Z npm WARN EBADENGINE Unsupported engine {
2026-11-09T15:28:21.2916717Z npm WARN EBADENGINE   package: '@angular/platform-browser-dynamic@19.2.25',
2026-11-09T15:28:21.2916970Z npm WARN EBADENGINE   required: { node: '^18.19.1 || ^20.11.1 || >=22.0.0' },
2026-11-09T15:28:21.2917210Z npm WARN EBADENGINE   current: { node: 'v18.19.0', npm: '10.2.3' }
2026-11-09T15:28:21.2917388Z npm WARN EBADENGINE }
2026-11-09T15:28:21.2917538Z npm WARN EBADENGINE Unsupported engine {
2026-11-09T15:28:21.2917716Z npm WARN EBADENGINE   package: '@angular/router@19.2.25',
2026-11-09T15:28:21.2917959Z npm WARN EBADENGINE   required: { node: '^18.19.1 || ^20.11.1 || >=22.0.0' },
2026-11-09T15:28:21.2918197Z npm WARN EBADENGINE   current: { node: 'v18.19.0', npm: '10.2.3' }
2026-11-09T15:28:21.2918428Z npm WARN EBADENGINE }
2026-11-09T15:28:21.2918581Z npm WARN EBADENGINE Unsupported engine {
2026-11-09T15:28:21.2918799Z npm WARN EBADENGINE   package: '@ngtools/webpack@19.2.27',
2026-11-09T15:28:21.2918974Z npm WARN EBADENGINE   required: {
2026-11-09T15:28:21.2919194Z npm WARN EBADENGINE     node: '^18.19.1 || ^20.11.1 || >=22.0.0',
2026-11-09T15:28:21.2919382Z npm WARN EBADENGINE     npm: '^6.11.0 || ^7.5.6 || >=8.0.0',
2026-11-09T15:28:21.2919590Z npm WARN EBADENGINE     yarn: '>= 1.13.0'
2026-11-09T15:28:21.2919740Z npm WARN EBADENGINE   },
2026-11-09T15:28:21.2920020Z npm WARN EBADENGINE   current: { node: 'v18.19.0', npm: '10.2.3' }
2026-11-09T15:28:21.2920191Z npm WARN EBADENGINE }
2026-11-09T15:28:21.2920342Z npm WARN EBADENGINE Unsupported engine {
2026-11-09T15:28:21.2920568Z npm WARN EBADENGINE   package: '@schematics/angular@19.2.27',
2026-11-09T15:28:21.2920736Z npm WARN EBADENGINE   required: {
2026-11-09T15:28:21.2920919Z npm WARN EBADENGINE     node: '^18.19.1 || ^20.11.1 || >=22.0.0',
2026-11-09T15:28:21.2921148Z npm WARN EBADENGINE     npm: '^6.11.0 || ^7.5.6 || >=8.0.0',
2026-11-09T15:28:21.2921355Z npm WARN EBADENGINE     yarn: '>= 1.13.0'
2026-11-09T15:28:21.2921506Z npm WARN EBADENGINE   },
2026-11-09T15:28:21.2921724Z npm WARN EBADENGINE   current: { node: 'v18.19.0', npm: '10.2.3' }
2026-11-09T15:28:21.2921904Z npm WARN EBADENGINE }
2026-11-09T15:28:21.2922151Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/fsevents
2026-11-09T15:28:21.2922463Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/esbuild/node_modules/@esbuild/win32-x64
2026-11-09T15:28:21.2922779Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/esbuild/node_modules/@esbuild/win32-ia32
2026-11-09T15:28:21.2923093Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/esbuild/node_modules/@esbuild/win32-arm64
2026-11-09T15:28:21.2923405Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/esbuild/node_modules/@esbuild/sunos-x64
2026-11-09T15:28:21.2923731Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/esbuild/node_modules/@esbuild/openharmony-arm64
2026-11-09T15:28:21.2924043Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/esbuild/node_modules/@esbuild/openbsd-x64
2026-11-09T15:28:21.2924351Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/esbuild/node_modules/@esbuild/openbsd-arm64
2026-11-09T15:28:21.2924800Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/esbuild/node_modules/@esbuild/netbsd-x64
2026-11-09T15:28:21.2925122Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/esbuild/node_modules/@esbuild/netbsd-arm64
2026-11-09T15:28:21.2925430Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/esbuild/node_modules/@esbuild/linux-s390x
2026-11-09T15:28:21.2925748Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/esbuild/node_modules/@esbuild/linux-riscv64
2026-11-09T15:28:21.2926055Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/esbuild/node_modules/@esbuild/linux-ppc64
2026-11-09T15:28:21.2926361Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/esbuild/node_modules/@esbuild/linux-mips64el
2026-11-09T15:28:21.2926668Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/esbuild/node_modules/@esbuild/linux-loong64
2026-11-09T15:28:21.2926974Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/esbuild/node_modules/@esbuild/linux-ia32
2026-11-09T15:28:21.2927304Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/esbuild/node_modules/@esbuild/linux-arm64
2026-11-09T15:28:21.2927604Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/esbuild/node_modules/@esbuild/linux-arm
2026-11-09T15:28:21.2927953Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/esbuild/node_modules/@esbuild/freebsd-x64
2026-11-09T15:28:21.2928220Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/esbuild/node_modules/@esbuild/freebsd-arm64
2026-11-09T15:28:21.2928527Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/esbuild/node_modules/@esbuild/darwin-x64
2026-11-09T15:28:21.2928832Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/esbuild/node_modules/@esbuild/darwin-arm64
2026-11-09T15:28:21.2929198Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/esbuild/node_modules/@esbuild/android-x64
2026-11-09T15:28:21.2929501Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/esbuild/node_modules/@esbuild/android-arm64
2026-11-09T15:28:21.2929818Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/esbuild/node_modules/@esbuild/android-arm
2026-11-09T15:28:21.2930138Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/esbuild/node_modules/@esbuild/aix-ppc64
2026-11-09T15:28:21.2930439Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@rollup/rollup-win32-x64-msvc
2026-11-09T15:28:21.2930740Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@rollup/rollup-win32-x64-gnu
2026-11-09T15:28:21.2931044Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@rollup/rollup-win32-ia32-msvc
2026-11-09T15:28:21.2931343Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@rollup/rollup-win32-arm64-msvc
2026-11-09T15:28:21.2931637Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@rollup/rollup-openharmony-arm64
2026-11-09T15:28:21.2931930Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@rollup/rollup-openbsd-x64
2026-11-09T15:28:21.2932289Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@rollup/rollup-linux-s390x-gnu
2026-11-09T15:28:21.2932601Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@rollup/rollup-linux-riscv64-musl
2026-11-09T15:28:21.2932861Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@rollup/rollup-linux-riscv64-gnu
2026-11-09T15:28:21.2933163Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@rollup/rollup-linux-ppc64-musl
2026-11-09T15:28:21.2933460Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@rollup/rollup-linux-ppc64-gnu
2026-11-09T15:28:21.2933754Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@rollup/rollup-linux-loong64-musl
2026-11-09T15:28:21.2934107Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@rollup/rollup-linux-loong64-gnu
2026-11-09T15:28:21.2934632Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@rollup/rollup-linux-arm64-musl
2026-11-09T15:28:21.2935001Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@rollup/rollup-linux-arm64-gnu
2026-11-09T15:28:21.2935308Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@rollup/rollup-linux-arm-musleabihf
2026-11-09T15:28:21.2935638Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@rollup/rollup-linux-arm-gnueabihf
2026-11-09T15:28:21.2935955Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@rollup/rollup-freebsd-x64
2026-11-09T15:28:21.2936246Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@rollup/rollup-freebsd-arm64
2026-11-09T15:28:21.2936540Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@rollup/rollup-darwin-x64
2026-11-09T15:28:21.2936835Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@rollup/rollup-darwin-arm64
2026-11-09T15:28:21.2937204Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@rollup/rollup-android-arm64
2026-11-09T15:28:21.2937454Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@rollup/rollup-android-arm-eabi
2026-11-09T15:28:21.2937746Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@parcel/watcher-win32-x64
2026-11-09T15:28:21.2938044Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@parcel/watcher-win32-ia32
2026-11-09T15:28:21.2938359Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@parcel/watcher-win32-arm64
2026-11-09T15:28:21.2938651Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@parcel/watcher-linux-arm64-musl
2026-11-09T15:28:21.2938944Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@parcel/watcher-linux-arm64-glibc
2026-11-09T15:28:21.2939237Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@parcel/watcher-linux-arm-musl
2026-11-09T15:28:21.2939618Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@parcel/watcher-linux-arm-glibc
2026-11-09T15:28:21.2939911Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@parcel/watcher-freebsd-x64
2026-11-09T15:28:21.2940252Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@parcel/watcher-darwin-x64
2026-11-09T15:28:21.2940572Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@parcel/watcher-darwin-arm64
2026-11-09T15:28:21.2940890Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@parcel/watcher-android-arm64
2026-11-09T15:28:21.2941183Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@napi-rs/nice-win32-x64-msvc
2026-11-09T15:28:21.2941484Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@napi-rs/nice-win32-ia32-msvc
2026-11-09T15:28:21.2941782Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@napi-rs/nice-win32-arm64-msvc
2026-11-09T15:28:21.2942086Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@napi-rs/nice-openharmony-arm64
2026-11-09T15:28:21.2942439Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@napi-rs/nice-linux-s390x-gnu
2026-11-09T15:28:21.2942829Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@napi-rs/nice-linux-riscv64-gnu
2026-11-09T15:28:21.2943178Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@napi-rs/nice-linux-ppc64-gnu
2026-11-09T15:28:21.2943469Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@napi-rs/nice-linux-arm64-musl
2026-11-09T15:28:21.2943795Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@napi-rs/nice-linux-arm64-gnu
2026-11-09T15:28:21.2944088Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@napi-rs/nice-linux-arm-gnueabihf
2026-11-09T15:28:21.2944375Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@napi-rs/nice-freebsd-x64
2026-11-09T15:28:21.2944738Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@napi-rs/nice-darwin-x64
2026-11-09T15:28:21.2945037Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@napi-rs/nice-darwin-arm64
2026-11-09T15:28:21.2945327Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@napi-rs/nice-android-arm64
2026-11-09T15:28:21.2945580Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@napi-rs/nice-android-arm-eabi
2026-11-09T15:28:21.2945886Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@msgpackr-extract/msgpackr-extract-win32-x64
2026-11-09T15:28:21.2946271Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@msgpackr-extract/msgpackr-extract-linux-arm64
2026-11-09T15:28:21.2946738Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@msgpackr-extract/msgpackr-extract-linux-arm
2026-11-09T15:28:21.2947164Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@msgpackr-extract/msgpackr-extract-darwin-x64
2026-11-09T15:28:21.2947761Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@msgpackr-extract/msgpackr-extract-darwin-arm64
2026-11-09T15:28:21.2948222Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@lmdb/lmdb-win32-x64
2026-11-09T15:28:21.2948605Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@lmdb/lmdb-linux-arm64
2026-11-09T15:28:21.2948984Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@lmdb/lmdb-linux-arm
2026-11-09T15:28:21.2949377Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@lmdb/lmdb-darwin-x64
2026-11-09T15:28:21.2949800Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@lmdb/lmdb-darwin-arm64
2026-11-09T15:28:21.2950279Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@esbuild/win32-x64
2026-11-09T15:28:21.2950661Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@esbuild/win32-ia32
2026-11-09T15:28:21.2951045Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@esbuild/win32-arm64
2026-11-09T15:28:21.2951291Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@esbuild/sunos-x64
2026-11-09T15:28:21.2951582Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@esbuild/openharmony-arm64
2026-11-09T15:28:21.2951981Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@esbuild/openbsd-x64
2026-11-09T15:28:21.2952271Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@esbuild/openbsd-arm64
2026-11-09T15:28:21.2953029Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@esbuild/netbsd-x64
2026-11-09T15:28:21.2953330Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@esbuild/netbsd-arm64
2026-11-09T15:28:21.2953615Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@esbuild/linux-s390x
2026-11-09T15:28:21.2953898Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@esbuild/linux-riscv64
2026-11-09T15:28:21.2954183Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@esbuild/linux-ppc64
2026-11-09T15:28:21.2954612Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@esbuild/linux-mips64el
2026-11-09T15:28:21.2954911Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@esbuild/linux-loong64
2026-11-09T15:28:21.2955193Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@esbuild/linux-ia32
2026-11-09T15:28:21.2955540Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@esbuild/linux-arm64
2026-11-09T15:28:21.2955859Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@esbuild/linux-arm
2026-11-09T15:28:21.2956267Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@esbuild/freebsd-x64
2026-11-09T15:28:21.2956663Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@esbuild/freebsd-arm64
2026-11-09T15:28:21.2957072Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@esbuild/darwin-x64
2026-11-09T15:28:21.2957369Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@esbuild/darwin-arm64
2026-11-09T15:28:21.2957751Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@esbuild/android-x64
2026-11-09T15:28:21.2958034Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@esbuild/android-arm64
2026-11-09T15:28:21.2958321Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@esbuild/android-arm
2026-11-09T15:28:21.2958619Z npm verb reify failed optional dependency /opt/ads-agent/_work/15/s/node_modules/@esbuild/aix-ppc64
2026-11-09T15:28:21.2959047Z npm WARN deprecated inflight@1.0.6: This module is not supported, and leaks memory. Do not use it. Check out lru-cache if you want a good and tested way to coalesce async requests by a key value, which is much more comprehensive and powerful.
2026-11-09T15:28:21.2959465Z npm WARN deprecated whatwg-encoding@2.0.0: Use @exodus/bytes instead for a more spec-conformant and faster implementation
2026-11-09T15:28:21.2959761Z npm WARN deprecated abab@2.0.6: Use your platform's native atob() and btoa() methods instead
2026-11-09T15:28:21.2960053Z npm WARN deprecated glob@7.2.3: Old versions of glob are not supported, and contain widely publicized security vulnerabilities, which have been fixed in the current version. Please update. Support for old versions may be purchased (at exorbitant rates) by contacting i@izs.me
2026-11-09T15:28:21.2960479Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/esbuild 3274ms (cache hit)
2026-11-09T15:28:21.2960762Z npm WARN deprecated domexception@4.0.0: Use your platform's native DOMException instead
2026-11-09T15:28:21.2961027Z npm http fetch GET 200 http://binario.caixa:8081/repository/npm-all/esbuild/-/esbuild-0.28.0.tgz 483ms (cache hit)
2026-11-09T15:28:21.2961344Z npm WARN deprecated tar@6.2.1: Old versions of tar are not supported, and contain widely publicized security vulnerabilities, which have been fixed in the current version. Please update. Support for old versions may be purchased (at exorbitant rates) by contacting i@izs.me
2026-11-09T15:28:21.2961873Z npm WARN deprecated uuid@8.3.2: uuid@10 and below is no longer supported.  For ESM codebases, update to uuid@latest.  For CommonJS codebases, use uuid@11 (but be aware this version will likely be deprecated in 2028).
2026-11-09T15:28:21.2962495Z npm WARN deprecated glob@10.5.0: Old versions of glob are not supported, and contain widely publicized security vulnerabilities, which have been fixed in the current version. Please update. Support for old versions may be purchased (at exorbitant rates) by contacting i@izs.me
2026-11-09T15:28:21.2963101Z npm WARN deprecated glob@10.5.0: Old versions of glob are not supported, and contain widely publicized security vulnerabilities, which have been fixed in the current version. Please update. Support for old versions may be purchased (at exorbitant rates) by contacting i@izs.me
2026-11-09T15:28:21.2963515Z npm info run @parcel/watcher@2.5.6 install node_modules/@parcel/watcher node scripts/build-from-source.js
2026-11-09T15:28:21.2963754Z npm info run lmdb@3.2.6 install node_modules/lmdb node-gyp-build-optional-packages
2026-11-09T15:28:21.2964039Z npm info run msgpackr-extract@3.0.4 install node_modules/msgpackr-extract node-gyp-build-optional-packages
2026-11-09T15:28:21.2964261Z npm info run @parcel/watcher@2.5.6 install { code: 0, signal: null }
2026-11-09T15:28:21.2964452Z npm info run lmdb@3.2.6 install { code: 0, signal: null }
2026-11-09T15:28:21.2964807Z npm info run msgpackr-extract@3.0.4 install { code: 0, signal: null }
2026-11-09T15:28:21.2965033Z npm info run esbuild@0.28.0 postinstall node_modules/esbuild node install.js
2026-11-09T15:28:21.2965239Z npm info run esbuild@0.25.12 postinstall node_modules/vite/node_modules/esbuild node install.js
2026-11-09T15:28:21.2965465Z npm info run esbuild@0.25.12 postinstall node_modules/@angular/build/node_modules/vite/node_modules/esbuild node install.js
2026-11-09T15:28:21.2965678Z npm info run esbuild@0.28.0 postinstall { code: 0, signal: null }
2026-11-09T15:28:21.2966246Z npm info run esbuild@0.25.12 postinstall { code: 0, signal: null }
2026-11-09T15:28:21.2966434Z npm info run esbuild@0.25.12 postinstall { code: 0, signal: null }
2026-11-09T15:28:21.2966548Z npm verb exit 0
2026-11-09T15:28:21.2966687Z npm info ok 
2026-11-09T15:28:21.3077093Z ##[section]Finishing: npm install



# Variable 'ImageBuild_OKD' was defined in the Variables tab
# Variable 'NODE_VERSION' was defined in the Variables tab
# Variable 'nome_imagem' was defined in the Variables tab
# Variable 'SITE' was defined in the Variables tab
# Variable 'tag_imagem' was defined in the Variables tab
# Variable 'TemplateBuild_OKD' was defined in the Variables tab
# Variable 'TemplateVersaoProduto_OKD' was defined in the Variables tab
# Variable 'version.app' was defined in the Variables tab
# Variable Group 'BUILD_VARIABLES' was defined in the Variables tab
# Variable Group 'OKD-REGISTRY-CENTRALIZADO' was defined in the Variables tab
# Variable Group 'SONAR_VARIABLES - ESTEIRA' was defined in the Variables tab
# Variable Group 'SAST_FORTIFY_COMUNIDADE_FOMENTO' was defined in the Variables tab
name: $(version.app)
resources:
  repositories:
  - repository: self
    type: git
    ref: refs/heads/null
jobs:
- job: Job_1
  displayName: Agent job 1
  pool:
    name: Build-Linux-OKD4
  steps:
  - checkout: self
  - task: Bash@3
    displayName: Validação da VEC
    enabled: False
    inputs:
      targetType: inline
      script: "echo \"##[section]branch/tag: $BUILD_SOURCEBRANCHNAME\"\n\necho \"##[warning] -------------------- ATENÇÃO --------------------\n##[warning] Foi definido que a partir de 01/2025 apenas compilações oriundas de tag dentro do padrão estabelecido no PPDS poderão ser implantadas em HMP/PRD.\n##[warning] Para mais informações visite https://caixa.sharepoint.com/sites/PPDS/SitePages/GCM_Diretrizes_Padrao_Baseline.aspx ou consulte a GEQTI04\n-------------------------------------------------\"\n\npontos=`echo ${BUILD_SOURCEBRANCHNAME//[^\\.]} | sed 's/\\./\\.\\n/g' | wc -w`\nnumber=`echo $BUILD_SOURCEBRANCHNAME | sed 's/\\.//g'`\n\nif [[ ${pontos} = 3 ]];then\nif [[ ${number} =~ ^([0-9]+)$ ]];then\necho \"VEC $BUILD_SOURCEBRANCHNAME dentro do padrão estabelecido pelo PPDS.\nPacote apto a ser implantado em HMP/PRD.\"\nvec='true'\necho \"##vso[build.updatebuildnumber]\"$BUILD_SOURCEBRANCHNAME\"\"\nelse\necho \"A TAG $BUILD_SOURCEBRANCHNAME utilizada não se encontra dentro do padrão estabelecido pelo PPDS e este pacote não poderá ser implantado nos ambientes HMP/PRD.\"\nvec='false'\nfi\nelse\necho \"Foi selecionada para compilação uma branch ou tag fora do padrão estabelcido no PPDS. Esteja ciente de que este pacote poderá ser implantado somente em ambientes NPRD\"\nvec='false'\nfi\necho \"##[section]Valida VEC: $vec\"\necho \"##vso[task.setvariable variable=valida.vec;]$vec\"\n\necho \"------------------------------------------------- \nps: Essa regra se aplicará somente a projetos que possuem infra HMP/PRD criada na esteira devops.\nAté o presente momento esse passo é meramente INFORMATIVO, a aplicação da trava será realizada somente em janeiro de 2025\""
  - task: Bash@3
    displayName: Localização do Repositório
    inputs:
      targetType: inline
      script: >
        if [[ "$BUILD_REPOSITORY_URI" == *"github.com"* ]]; then

        echo "É um repositório do GitHub"

        REPO_FINAL_NAME=`basename "$BUILD_REPOSITORY_URI" .git`

        echo "##vso[task.setvariable variable=fortify_disable;]gecmi"

        echo "##vso[task.setvariable variable=sonar_disable;]true"

        else

        echo "É um repositório do Devops.Caixa"

        REPO_FINAL_NAME=`echo $(Build.Repository.Name)`

        fi

        echo "Nome do repositório: $REPO_FINAL_NAME"

        echo "##vso[task.setvariable variable=REPO_FINAL_NAME;]$REPO_FINAL_NAME"
  - task: Bash@3
    displayName: Validação da VEC
    inputs:
      targetType: inline
      script: "echo \"##[section]branch/tag: $BUILD_SOURCEBRANCHNAME\"\n\necho \"##[warning] -------------------- ATENÇÃO --------------------\n##[warning] Foi definido conforme CE GEQTI 011/2024 que a partir de 03/2025 apenas compilações oriundas de tag dentro do padrão estabelecido no PPDS poderão ser implantadas em TQS/HMP/PRD.\n##[warning] Para mais informações acesse as urls:\n##[warning] https://devops.caixa/projetos/Caixa/_wiki/wikis/Caixa.wiki/1689/Valida%C3%A7%C3%A3o-da-VEC\n##[warning] https://caixa.sharepoint.com/sites/PPDS/SitePages/GCM_Diretrizes_Padrao_Baseline.aspx ou consulte a GEQTI04\n-------------------------------------------------\"\necho $BUILD_SOURCEBRANCH\nif [[ `echo $BUILD_SOURCEBRANCH | grep -c tags` -gt 0 ]];then\npontos=`echo ${BUILD_SOURCEBRANCHNAME//[^\\.]} | sed 's/\\./\\.\\n/g' | wc -w`\nnumber=`echo $BUILD_SOURCEBRANCHNAME | sed 's/\\\\.//g'`\n\nif [[ ${pontos} = 3 ]];then\nif [[ ${number} =~ ^([0-9]+)$ ]];then\necho \"VEC $BUILD_SOURCEBRANCHNAME dentro do padrão estabelecido pelo PPDS.\nPacote apto a ser implantado em TQS/HMP/PRD.\"\nvec='true'\necho \"##vso[build.updatebuildnumber]\"$BUILD_SOURCEBRANCHNAME\"\"\nelse\necho \"A TAG $BUILD_SOURCEBRANCHNAME não se encontra dentro do padrão estabelecido pelo PPDS e este pacote não poderá ser implantado nos ambientes TQS/HMP/PRD.\"\nvec='false'\nfi\nelse\necho \"A TAG $BUILD_SOURCEBRANCHNAME não se encontra dentro do padrão estabelecido pelo PPDS e este pacote não poderá ser implantado nos ambientes TQS/HMP/PRD.\"\nvec='false'\nfi\nelif [[ `echo $BUILD_SOURCEBRANCH | grep -c heads` -gt 0 ]];then\necho \"##[warning]Foi selecionada para compilação uma branch. Esteja ciente de que este pacote poderá ser implantado somente em ambiente DES.\"\nvec='false'\nelse\necho \"##[warning]Foi selecionada para compilação uma branch. Esteja ciente de que este pacote poderá ser implantado somente em ambiente DES.\"\nvec='false'\nfi\n\necho \"##[section]Valida VEC: $vec\"\necho \"##vso[task.setvariable variable=valida.vec;]$vec\"\n\necho \"------------------------------------------------- \nps: Essa regra se aplica somente a projetos que possuem infra criada na esteira devops.\""
  - task: Bash@3
    displayName: Obtendo branch do Sonar
    enabled: False
    inputs:
      targetType: inline
      script: >-
        if [[ `echo $BUILD_SOURCEBRANCH | grep -c tags` -gt 0 ]];then

        token=$(AZPAT)


        #Apresenta object_id da tag

        object_id_tag=`curl -s -u :$token "https://devops.caixa/projetos/Caixa/_apis/git/repositories/$BUILD_REPOSITORY_NAME/refs?filter=tags/$BUILD_SOURCEBRANCHNAME&api-version=7.0" | jq -r '.value[0].objectId'`


        echo "Commit da TAG: " $object_id_tag


        #Apresenta commit_id branch

        object_id_commit=`curl -s -u :$token "https://devops.caixa/projetos/Caixa/_apis/git/repositories/$BUILD_REPOSITORY_NAME/annotatedtags/$object_id_tag?api-version=7.0" | jq -r '.taggedObject.objectId'`


        echo "Commit da branch que gerou a tag: " $object_id_commit


        #Pasea json localiza branch

        branch_of_tag=`curl -s -u :$token "https://devops.caixa/projetos/Caixa/_apis/git/repositories/$BUILD_REPOSITORY_NAME/refs?filter=heads&api-version=7.0" | jq -c '.value[] | select(.objectId | contains("'$object_id_commit'")).name' | awk 'NR==1'`


        if [ -z $branch_of_tag ];then

        echo "Não foi possível localizar a Branch que originou a TAG."

        sonar_branch=$BUILD_SOURCEBRANCHNAME

        else

        branch_of_tag=`echo $branch_of_tag | sed -e 's/\"//g'`

        echo "Branch que gerou a Tag: " $branch_of_tag

        sonar_branch=`echo $branch_of_tag | awk -F '/' '{print $NF'}`

        fi


        else


        sonar_branch=$BUILD_SOURCEBRANCHNAME


        fi


        echo $sonar_branch


        echo "##vso[task.setvariable variable=sonar_branch;]$sonar_branch"
  - task: Bash@3
    displayName: Obtendo branch do Sonar
    inputs:
      targetType: inline
      script: "#!/usr/bin/env bash\nset -euo pipefail\n\nif [[ `echo $BUILD_SOURCEBRANCH | grep -c tags` -gt 0 ]];then\n\necho \"Build originada de uma TAG.\"\n\n# ====== CONFIGURAÇÃO ======\nTAG=$BUILD_SOURCEBRANCH\nREMOTE=\"origin\"\n\n# ====== RESOLVER COMMIT FINAL DA TAG ======\nif ! COMMIT=`git rev-parse \"$TAG^{commit}\" 2>/dev/null`; then\n  echo \"Erro: a tag '$TAG' não existe ou não é válida.\"\n  exit 1\nfi\n\necho \"Tag        : $TAG\"\necho \"Commit     : $COMMIT\"\necho \"Remote     : $REMOTE\"\necho\necho \"Analisando branches que contêm o commit...\"\necho \"------------------------------------------------------------\"\nprintf \"%-8s %s\\n\" \"DISTÂNCIA\" \"BRANCH\"\necho \"------------------------------------------------------------\"\n\nFOUND=0\n\nwhile read -r BRANCH; do\n  if git merge-base --is-ancestor \"$COMMIT\" \"$BRANCH\"; then\n    DIST=`git rev-list --count \"$COMMIT..$BRANCH\"`\n    \n    # Remove origin/\n    BRANCH_DISPLAY=\"${BRANCH#origin/}\"    \n\n    printf \"%-8s %s\\n\" \"$DIST\" \"$BRANCH_DISPLAY\"\n    FOUND=1\n  fi\ndone < <(\n  git for-each-ref \\\n    --format='%(refname:short)' \\\n    \"refs/remotes/$REMOTE\"\n)\n\nif [[ \"$FOUND\" -eq 0 ]]; then\n  echo \"Nenhuma branch remota contém esse commit.\"\n  exit 1\nfi\n\necho \"------------------------------------------------------------\"\n\n# ====== BRANCH MAIS PROVÁVEL ======\nBEST_BRANCH=$(\n  while read -r BRANCH; do\n    if git merge-base --is-ancestor \"$COMMIT\" \"$BRANCH\"; then\n      # Remove origin/\n      BRANCH_DISPLAY=\"${BRANCH#origin/}\"    \n      echo \"`git rev-list --count \"$COMMIT..$BRANCH\"` $BRANCH_DISPLAY\"\n    fi\n  done < <(\n    git for-each-ref \\\n      --format='%(refname:short)' \\\n      \"refs/remotes/$REMOTE\"\n  ) | sort -n | head -n1\n)\n\nBEST_DISTANCE=`echo \"$BEST_BRANCH\" | awk '{print $1}'`\nBEST_NAME=`echo \"$BEST_BRANCH\" | awk '{print $2}'`\n\necho \"Branch mais provável de origem:\"\necho \"$BEST_NAME (distância: $BEST_DISTANCE commits)\"\n\nelse\n\necho \"Build originada de uma BRANCH.\"\nBEST_NAME=$BUILD_SOURCEBRANCHNAME\n\nfi\n\necho \"Branch que será informada para o SONAR: $BEST_NAME \"\n\necho \"##vso[task.setvariable variable=sonar_branch;]$BEST_NAME\"\n"
  - task: Bash@3
    displayName: Alterando package.json com versão da Build
    inputs:
      targetType: inline
      script: >-
        cd $(Build.SourcesDirectory)


        VERSION=`echo $(version.app)`

        if [[ $VERSION ]]

        then

        sed -i 's/"version":\s*".*"/"version": "'$VERSION'"/' $(Build.Repository.LocalPath)/package.json

        grep version $(Build.Repository.LocalPath)/package.json

        else

        package_version=`jq -r .version $(Build.Repository.LocalPath)/package.json`

        fi
      failOnStderr: true
  - task: Bash@3
    displayName: Recupera versão projeto
    inputs:
      targetType: inline
      script: "cd $(Build.SourcesDirectory)\nexport PROJECT='$(Build.Repository.LocalPath)/package.json'\n\np_version=`cat ${PROJECT} | jq -r .version` \np_name=`cat ${PROJECT} | jq -r .name` \np_extension=\"zip\"\np_projectKey=`echo $p_name| tr -cd '[:alnum:]'` \np_group=\"\"\n\necho \"${p_name}:${p_extension}:${p_version}\"\n\necho \"##vso[task.setvariable variable=project.group;]$p_group\"\n\necho \"##vso[task.setvariable variable=project.name;]$p_name\"\n\necho \"##vso[task.setvariable variable=project.version;]$p_version\"\n\necho \"##vso[task.setvariable variable=project.extension;]$p_extension\"\n\necho \"##vso[task.setvariable variable=project.key;]$p_projectKey\"\n\necho \"##vso[task.setvariable variable=project.release;]true\"\n\nif [[ ${p_version} == *\"snapshot\"* ]]; then\n  echo \"##vso[task.setvariable variable=project.release;]false\"\nfi\n\necho \"##vso[task.setvariable variable=PACKAGE_JSON_PATH;]$(Build.Repository.LocalPath)\""
      failOnStderr: true
  - task: Bash@3
    displayName: Recupera repositório nexus
    inputs:
      targetType: inline
      script: >-
        if [ $(project.release) = true ]; then

        NEXUS_URL=$(NEXUS_URL_ANGULAR_RELEASE)

        else

        NEXUS_URL=$(NEXUS_URL_ANGULAR_SNAPSHOT)

        fi



        p_repository=`echo ${NEXUS_URL##*/}`

        echo "##vso[task.setvariable variable=project.repository;]$p_repository"
  - task: NodeTool@0
    displayName: Use Node $(NODE_VERSION)
    retryCountOnTaskFailure: 5
    inputs:
      versionSpec: $(NODE_VERSION)
  - task: Bash@3
    displayName: Configurando Registry NPM
    inputs:
      targetType: inline
      script: >2-
          cat <<EOF > $(Build.Repository.LocalPath)/.npmrc
        registry=http://binario.caixa:8081/repository/npm-all

        email=pipeline-agil@mail.caixa

        sass_binary_site=http://binario.caixa:8081/repository/node-sass/

        disturl=http://binario.caixa:8081/repository/nodejs/

        EOF
  - task: Bash@3
    displayName: npm config check
    inputs:
      targetType: inline
      script: >-
        npm config rm proxy

        npm config rm http-proxy

        npm config rm https-proxy

        npm config list
  - task: Bash@3
    displayName: Configurando Registry NPMJS
    enabled: False
    inputs:
      targetType: inline
      script: >2-
          cat <<EOF > $(Build.Repository.LocalPath)/.npmrc
        registry=http://registry.npmjs.org/

        email=pipeline-agil@mail.caixa

        sass_binary_site=http://binario.caixa:8081/repository/node-sass/

        https-proxy = "http://proxyprd.caixa:80/"

        disturl=http://binario.caixa:8081/repository/nodejs/

        EOF
  - task: Npm@1
    displayName: npm install
    inputs:
      command: custom
      workingDir: $(Build.Repository.LocalPath)
      verbose: true
      customCommand: install --no-audit --verbose
  - task: Bash@3
    displayName: Build Application
    inputs:
      targetType: inline
      script: "export HOME=/tmp/firefox-home3    \nmkdir -p $HOME\n\ncd $(Build.Repository.LocalPath)/\necho \"ng build --configuration production --build-optimizer --aot --output-path=dist\"\necho \"<----ANGULAR---->\"\nnpx ng version\nng build --configuration production --build-optimizer --aot --output-path=dist\n"
  - task: Bash@3
    displayName: Zip dist
    inputs:
      targetType: inline
      script: >+
        #cd $(Build.SourcesDirectory)

        cd $(Build.Repository.LocalPath)


        p_name=$(project.name)

        p_version="$(project.version)"


        PROJECT_FILE=$(Build.ArtifactStagingDirectory)/${p_name}-${p_version}.zip


        zip -r $PROJECT_FILE dist


        echo "##vso[task.setvariable variable=project.file;]${PROJECT_FILE}"

      failOnStderr: true
  - task: DownloadSecureFile@1
    displayName: Download secure file
    inputs:
      secureFile: d2041121-de1c-45da-9c21-5e8a73c00647
  - task: Bash@3
    displayName: Definindo Linguagem de Programação
    inputs:
      targetType: inline
      script: >
        #!/bin/bash

        set -o errexit

        set -o nounset

        set -o pipefail


        cd $(Build.SourcesDirectory)

        for file in pom.xml angular.json tsconfig.json package.json project.ini *.csproj *.sln

        do
           f_language=`find . -maxdepth 3 -name "${file}" -exec basename {} \; | head -n 1`
           if [[ "${f_language}" == pom.xml ]]
            then
                p_language=java
                break
           elif [[ "${f_language}" == angular.json ]] || [[ "${f_language}" == tsconfig.json ]]
                 then
                    p_language=angular
                break
           elif [[ "${f_language}" == package.json ]]
             then
                    p_language=nodejs
                break
           elif [[ "${f_language}" == project.ini ]]
             then
                    p_language=php
                break
           elif [[ "${f_language}" == *".csproj" ]] || [[ "${f_language}" == *".sln" ]]
             then
                    p_language=dotnet
                break
             else
                echo "Não foi possivel determinar a linguagem da aplicação do codigo fonte"
                   p_language=null
           fi
        done


        echo "Linguagem de Programação:" $p_language

        echo "##vso[task.setvariable variable=p_language;]$p_language"



        RepositoryName=`(echo "$(REPO_FINAL_NAME)" | tr '[[:upper:]]' '[[:lower:]]')`

        echo "##vso[task.setvariable variable=REPOSITORIO;]$RepositoryName"
  - task: Bash@3
    displayName: Verifica se pacote existe no binario.caixa
    inputs:
      targetType: inline
      script: "if [ $(valida.vec) = true ]; then\n\nreplace=\"\\/\"\n\np_name=\"$(project.name)\"\np_version=\"$(project.version)\"\np_extension=\"$(project.extension)\"\np_group=$(project.group) || true\np_group=`[ -z \"$p_group\" ] && echo \"\"br.gov.caixa.$p_name\"\" || echo \"$p_group\"`\np_group=`echo $p_group | awk -F \":\" '{print $1}' | sed -e \"s/\\./${replace}/g\"`\n\np_group=`[ ! -z \"$p_group\" ] && echo \"/$p_group\"`\n	\np_version=$BUILD_SOURCEBRANCHNAME	\n\n	p_version=`echo \"${p_version}\" | sed -r 's/([A-Z]+)//g'`\n        [[ $p_version = *- ]] && p_version=`echo $p_version | sed 's/.$//'`\n\n	p_file=\"$p_name-$p_version.$p_extension\"\n\n       echo $(NEXUS_URL_ANGULAR_RELEASE)/$p_group/$p_name/$p_version/$p_file\n	response=`curl -s --head $(NEXUS_URL_ANGULAR_RELEASE)/$p_group/$p_name/$p_version/$p_file | head -n 1 | grep \"HTTP/1.[01] [234]..\"`\n\n	code=`echo $response | awk '{print $2}'` \n\n	if [ ${code} = \"200\" ]; then\n		echo \"Pacote com identificador $BUILD_SOURCEBRANCHNAME já existe no repositório, por favor compile utilizando outra TAG\";\n		exit 1\n	fi\nfi"
  - task: Bash@3
    displayName: Run Code Analisis
    condition: and(ne(variables['sonar_disable'], 'true'), succeeded())
    inputs:
      targetType: inline
      script: >-
        #!/bin/bash


        if [[ "$(p_language)" != "dotnet" ]]

        then


        p_name=$(REPO_FINAL_NAME)

        p_version=$(project.version)

        p_projectKey=$(REPO_FINAL_NAME)


        #p_properties=`echo $(SONAR_PROPERTIES)`

        #echo "SONAR_PROPERTIES" $(SONAR_PROPERTIES)

        #echo "p_properties" $p_properties


        echo sonar-scanner -Dsonar.host.url=$(SONAR_URL) -Dsonar.login=$(SONAR_LOGIN) -Dsonar.password=$(SONAR_PASSWORD) -Dsonar.projectKey=$p_projectKey -Dsonar.projectName=$p_name -Dsonar.projectVersion=$p_version -Dsonar.sources=. $(SONAR_PROPERTIES)


        sonar-scanner -Dsonar.host.url=$(SONAR_URL) -Dsonar.login=$(SONAR_LOGIN) -Dsonar.password=$(SONAR_PASSWORD) -Dsonar.projectKey=$p_projectKey -Dsonar.projectName=$p_name -Dsonar.projectVersion=$p_version -Dsonar.sources=. $(SONAR_PROPERTIES)


        fi
  - task: Bash@3
    displayName: Publish Quality Gate Result
    condition: and(ne(variables['sonar_disable'], 'true'), succeeded())
    timeoutInMinutes: 5
    inputs:
      targetType: inline
      script: >-
        #!/bin/bash


        if [[ "$(p_language)" != "dotnet" ]]

        then


        cd $(Build.SourcesDirectory)


        REPORT_PATH=".scannerwork/report-task.txt"

        CE_TASK_ID_KEY="ceTaskId="


        SONAR_INSTANCE=$(SONAR_URL)

        SONAR_ACCESS_LOGIN=$(SONAR_LOGIN)

        SONAR_ACCESS_PASSWORD=$(SONAR_PASSWORD)

        SLEEP_TIME=5


        echo "QG Script --> Using SonarQube instance ${SONAR_INSTANCE}"

        echo "QG Script --> Using SonarQube access login ${SONAR_ACCESS_LOGIN}"


        # get the compute engine task id

        ce_task_id=`cat $REPORT_PATH | grep $CE_TASK_ID_KEY | cut -d'=' -f2`

        echo "QG Script --> Using task id of ${ce_task_id}"


        if [ -z "$ce_task_id" ]; then
           echo "QG Script --> No task id found"
           exit 1
        fi


        # grab the status of the task

        # if CANCELLED or FAILED, fail the Build

        # if SUCCESS, stop waiting and grab the analysisId

        wait_for_success=true


        while [ "${wait_for_success}" = "true" ]

        do

          ce_status=`curl --connect-timeout 3 --max-time 7 --retry 7 --retry-delay 0 --retry-max-time 50 -s -u ${SONAR_ACCESS_LOGIN}:${SONAR_ACCESS_PASSWORD} "${SONAR_INSTANCE}"/api/ce/task?id=${ce_task_id} | jq -r .task.status`

          echo "QG Script --> Status of SonarQube task is ${ce_status}"

          if [ "${ce_status}" = "CANCELLED" ]; then
            echo "QG Script --> SonarQube Compute job has been cancelled - exiting with error"
            exit 1
          fi

          if [ "${ce_status}" = "FAILED" ]; then
            echo "QG Script --> Ocorrência prevista na TE102 - Não atendimento aos critérios de qualidade"
            exit 1
          fi

          if [ "${ce_status}" = "SUCCESS" ]; then
            wait_for_success=false
          fi

          sleep "${SLEEP_TIME}"

        done


        ce_analysis_id=`curl --connect-timeout 3 --max-time 7 --retry 7 --retry-delay 0 --retry-max-time 50 -s -u ${SONAR_ACCESS_LOGIN}:${SONAR_ACCESS_PASSWORD} $SONAR_INSTANCE/api/ce/task?id=$ce_task_id | jq -r .task.analysisId`

        echo "QG Script --> Using analysis id of ${ce_analysis_id}"


        # get the status of the quality gate for this analysisId

        qg_status=`curl --connect-timeout 3 --max-time 7 --retry 7 --retry-delay 0 --retry-max-time 50 -s -u ${SONAR_ACCESS_LOGIN}:${SONAR_ACCESS_PASSWORD} $SONAR_INSTANCE/api/qualitygates/project_status?analysisId="${ce_analysis_id}" | jq -r .projectStatus.status`

        echo "QG Script --> Quality Gate status is ${qg_status}"


        if [ "${qg_status}" != "OK" ]; then
          echo "##[error]QG Script --> Ocorrência prevista na TE102 - Não atendimento aos critérios de qualidade"
          exit 1
        fi


        fi
      failOnStderr: true
  - task: Bash@3
    displayName: Definindo Version no Fortify
    enabled: False
    inputs:
      targetType: inline
      script: >
        #!/bin/bash


        #set -x


        extrair_versao() {

        echo "$1" | grep -oE '^[0-9]+(\.[0-9]+){0,2}'

        }

        if [[ -n "$(version.app)" && "$(version.app)" =~ ^[0-9] ]] || [[ -n "$(versionApp)" && "$(versionApp)" =~ ^[0-9] ]]

        then

        FORTIFY_VERSION_BUILD=$(extrair_versao "$(version.app)" || extrair_versao "$(versionApp)" )

        if [[ -n "$(Agent.ReleaseDirectory)" && -n "$(Release.PrimaryArtifactSourceAlias)" ]]

        then

        Build_SourcesDirectory="$(Agent.ReleaseDirectory)/$(Release.PrimaryArtifactSourceAlias)"

        echo "##vso[task.setvariable variable=Build.SourcesDirectory;]$Build_SourcesDirectory"

        fi

        else

        FORTIFY_VERSION_BUILD=$(Build.BuildNumber)

        fi

        echo "##vso[task.setvariable variable=FORTIFY_VERSION_BUILD;]$FORTIFY_VERSION_BUILD"

        echo "FORTIFY_VERSION_BUILD=$FORTIFY_VERSION_BUILD"
  - task: Bash@3
    displayName: Checagem de bypass
    condition: and(succeeded(), ne(variables['p_language'], 'dotnet'))
    enabled: False
    inputs:
      targetType: inline
      script: "#!/bin/bash\n\n#set -x\nif [ ! -z \"$(fortify_disable)\" ] && [ $(fortify_disable) = \"true\" ];\nthen\necho - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \necho Análise do fortify encontra-se desabilitada, procure imediatamente o suporte da CESTI36 para que este passo seja habilitado. \necho Bypass a partir de 2024 somente com autorização da GECMI.\necho - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \nreturn 1 2>/dev/null\nexit 1\nelif [ $(fortify_disable) = \"gecmi\" ];\nthen\necho Bypass autorizado pela GECMI.\nelse\necho Projeto habilitado para análise do fortify.\nfi"
  - task: Bash@3
    displayName: Definindo variáveis Fortify
    condition: and(succeeded(), ne(variables['fortify_disable'], 'gecmi'))
    enabled: False
    timeoutInMinutes: 2
    inputs:
      targetType: inline
      script: >-
        #!/bin/bash

        set -o errexit

        set -o nounset

        set -o pipefail

        #set -x


        GitRepositoryName=$(Build.Repository.Name)

        DefinitionName=$(Build.DefinitionName)


        RepositoryName=`(echo "$GitRepositoryName" | tr '[[:upper:]]' '[[:lower:]]')`

        echo "##vso[task.setvariable variable=REPOSITORIO;]$RepositoryName"

        ProjectName=`(echo "$GitRepositoryName" | tr '[[:upper:]]' '[[:lower:]]' | cut -f1 -d"-")`

        echo "##vso[task.setvariable variable=PROJETO;]$ProjectName"


        echo "Definindo liguagem de programação"

        cd $(Build.SourcesDirectory)

        for file in pom.xml angular.json tsconfig.json package.json project.ini *.csproj *.sln build.gradle

        do
           f_language=`find . -maxdepth 3 -name "${file}" -exec basename {} \; | head -n 1`
           if [[ "${f_language}" == pom.xml ]]
            then
                p_language=java
                break
           elif [[ "${f_language}" == angular.json ]] || [[ "${f_language}" == tsconfig.json ]]
                 then
                    p_language=angular
                break
           elif [[ "${f_language}" == package.json ]]
             then
                    p_language=nodejs
                break
           elif [[ "${f_language}" == project.ini ]]
             then
                    p_language=php
                break
           elif [[ "${f_language}" == *".csproj" ]] || [[ "${f_language}" == *".sln" ]]
             then
                    p_language=dotnet
                break
        elif [[ "${f_language}" == "build.gradle" ]]

        then

        p_language=android

        break
             else
                echo "Não foi possivel determinar a linguagem da aplicação do codigo fonte"
                   p_language=null
           fi
        done


        echo "Linguagem de Programação:" $p_language


        echo "##vso[task.setvariable variable=p_language;]$p_language"


        p_lang=`echo "${p_language}" | sed 's/[[:punct:]]\+$//'`

        echo "Liguagem de programação: $p_lang"


        if [ $p_language == null ]
         then
           echo "Não foi possivel definir a linguagem de programação deste codigo fonte"
           exit 1
        fi


        echo "Autenticando no Fortify e adquirindo token"
        	get_token=`curl -s --user $(FORTIFY_USER):$(FORTIFY_PASS) -k -X POST -H "Content-Type:application/json" -d '{"type": "UnifiedLoginToken"}' '$(FORTIFY_API)/tokens'`
            token=`echo $get_token | jq -r '.data.token'`
        	token_id=`echo $get_token | jq -r '.data.id'`
        	response=`echo $get_token | jq -r '.responseCode'`
        	    if [[ $response != 201 ]]
                then
                    echo "Ocorreu um erro ao realizar ação no Fortify Status_code: $response"
        			exit 1
                fi

        echo "##vso[task.setvariable variable=token]$token"

        echo "##vso[task.setvariable variable=token_id]$token_id"
  - task: script-retryer@0
    displayName: Criando Application no Fortify
    condition: and(succeeded(), ne(variables['fortify_disable'], 'gecmi'), ne(variables['p_language'], 'dotnet'))
    enabled: False
    timeoutInMinutes: 2
    inputs:
      targetType: inline
      script: "#!/bin/bash\n\necho \"Repo: $(REPOSITORIO)\"\n#Corrigir caracter bizzaro que o ads coloca (java'\\''')\np_lang=`echo '$(p_language)' | sed 's/[[:punct:]]\\+$//'`\necho \"Liguagem de programação: $p_lang\"\n\necho \"Iniciando fluxo de criação de Application no Fortify\"\nlista_projeto=`curl -k -s -X POST \"$(FORTIFY_API)/projects/action/test\" -H \"Authorization:FortifyToken $(token)\" -H \"accept: application/json\" -H \"Content-Type: application/json\" -d \"{ \\\"applicationName\\\": \\\"$(REPOSITORIO)\\\"}\"`\nlprojeto=`echo $lista_projeto | jq -r '.data.found'`\nresponse=`echo $lista_projeto | jq -r '.responseCode'`\n        if [[ $response != 200 ]]\n        then\n            echo \"Ocorreu um erro ao realizar ação no Fortify Status_code: $response\"\n			exit 1\n        fi\necho \"Listando Application ==>\"$lprojeto\necho \"Listando Application response ==> \"$response\nif [ $lprojeto = false ]\nthen \n  echo \"Criando o Application no Fortify\"\n	cria_projeto=`curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d '{\"name\":\"'$(FORTIFY_VERSION_BUILD)'\",\"description\":\"\",\"active\":true,\"project\":{\"name\":\"'$(REPOSITORIO)'\",\"description\":\"\",\"issueTemplateId\":\"Prioritized-HighRisk-Project-Template\"},\"issueTemplateId\":\"Prioritized-HighRisk-Project-Template\",\"committed\":true}' '$(FORTIFY_API)/projectVersions'`\n	idFortify=`echo $cria_projeto | jq -r '.data.id'`\n    response=`echo $cria_projeto | jq -r '.responseCode'`\n	    if [[ $response != 201 ]]\n        then\n            echo \"Ocorreu um erro ao realizar ação no Fortify Status_code: $response\"\n			exit 1\n        fi	\n    echo \"Project Fortify ID ==> \"$idFortify\n    echo \"Project Fortify ID response ==> \"$response\nsleep 10	\n    #id_versao=`curl -k -s \"$(FORTIFY_API)/projectVersions?start=0&limit=2000&fulltextsearch=false\" -H \"Authorization:FortifyToken $(token)\" -H \"accept: application/json\" -H \"Content-Type: application/json\"`\n	#iversao=`echo $id_versao | jq -r '.data[] | select(.name==\"$(FORTIFY_VERSION_BUILD)\" and .project.name==\"$(REPOSITORIO)\") | .id'`\n	#response=`echo $id_versao | jq -r '.responseCode'`\n	#	if [[ $response != 200 ]]\n    #    then\n    #        echo \"Ocorreu um erro ao realizar ação no Fortify Status_code: $response\"\n	#		exit 1\n    #    fi	\n	#echo \"Project Version ID ==> \"$iversao\n	#echo \"Project Version ID response ==> \"$response\n	\n	if [ $p_lang == android ]\n	then\n		cat /opt/ads-agent/javaDefault.json | sed -e 's/idFortify/'$idFortify'/g' | curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d @- '$(FORTIFY_API)/bulk'	\n	elif [ $p_lang == java ]\n	  then\n	     cat /opt/ads-agent/javaDefault.json | sed -e 's/idFortify/'$idFortify'/g' | curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d @- '$(FORTIFY_API)/bulk'\n	elif [ $p_lang == angular ] || [ $p_lang == nodejs ]\n	   then\n	     cat /opt/ads-agent/javascriptDefault.json | sed -e 's/idFortify/'$idFortify'/g' | curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d @- '$(FORTIFY_API)/bulk'\n	elif [ $p_lang == php ]\n	   then\n	     cat /opt/ads-agent/phpDefault.json | sed -e 's/idFortify/'$idFortify'/g' | curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d @- '$(FORTIFY_API)/bulk'\n	fi\nelse \n  echo \"A Application $(REPOSITORIO) já esta criada no Fortify\"	\nfi"
      delay: 10
      retryTimes: 3
  - task: Bash@3
    displayName: Criando Version no Fortify
    condition: and(succeeded(), ne(variables['fortify_disable'], 'gecmi'), ne(variables['p_language'], 'dotnet'))
    enabled: False
    timeoutInMinutes: 2
    inputs:
      targetType: inline
      script: "#!/bin/bash\n\necho \"Repo: $(REPOSITORIO)\"\n#Corrigir caracter bizzaro que o ads coloca (java'\\''')\np_lang=`echo '$(p_language)' | sed 's/[[:punct:]]\\+$//'`\necho \"Liguagem de programação: $p_lang\"\n\necho \"Criando nova Application Version\"\nlista_versao=`curl -k -s -X POST \"$(FORTIFY_API)/projectVersions/action/test\" -H \"Authorization:FortifyToken $(token)\" -H \"accept: application/json\" -H \"Content-Type: application/json\" -d \"{ \\\"projectName\\\": \\\"$(REPOSITORIO)\\\", \\\"projectVersionName\\\": \\\"$(FORTIFY_VERSION_BUILD)\\\"}\"`\nlversao=`echo $lista_versao | jq -r '.data.found'`\nresponse=`echo $lista_versao | jq -r '.responseCode'`\n        if [[ $response != 200 ]]\n        then\n            echo \"Ocorreu um erro ao realizar ação no Fortify Status_code: $response\"\n			exit 1\n        fi\necho \"listar_versão ==>\"$lversao\necho \"listar_versão response ==>\"$response\nif [ $lversao = false ]\nthen \n  echo \"Criando o versão no fortify para o projeto '$(REPOSITORIO)'\"\n  id_project=`curl -k -s \"$(FORTIFY_API)/projects?start=0&limit=2000&fulltextsearch=false\" -H \"Authorization:FortifyToken $(token) \" -H \"accept: application/json\" -H \"Content-Type: application/json\"`\n    iproject=`echo $id_project | jq -r '.data[] | select (.name==\"$(REPOSITORIO)\") | .id'`\n    response=`echo $id_project | jq -r '.responseCode'`\n	    if [[ $response != 200 ]]\n        then\n            echo \"Ocorreu um erro ao realizar ação no Fortify Status_code: $response\"\n			exit 1\n        fi	\n    echo \"Project ID ==> \"$iproject\n    echo \"Project ID response ==> \"$response\nsleep 8	\n  cria_versao=`curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d '{\"name\":\"'$(FORTIFY_VERSION_BUILD)'\",\"description\":\"\",\"active\":true,\"committed\":true,\"project\":{\"name\":\"'$(REPOSITORIO)'\",\"description\":null,\"issueTemplateId\":\"Prioritized-HighRisk-Project-Template\",\"id\":'$iproject'},\"issueTemplateId\":\"Prioritized-HighRisk-Project-Template\"}' '$(FORTIFY_API)/projectVersions'`\n  	cversion=`echo $cria_versao | jq -r '.data.id'`\n    response=`echo $cria_versao | jq -r '.responseCode'`\n	    if [[ $response != 201 ]]\n        then\n            echo \"Ocorreu um erro ao realizar ação no Fortify Status_code: $response\"\n			exit 1\n        fi	\n    echo \"Criando Application Version ==> \"$cversion\n    echo \"Criando  Application Version response ==> \"$response\nsleep 8\necho \"Atribuindo atributos a Application Version\"$cversion\necho \"Linguagem de programacao $p_lang\"\n 	if [ $p_lang == android ]\n	  then\ncat /opt/ads-agent/javaDefault.json | sed -e 's/idFortify/'$cversion'/g' | curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d @- '$(FORTIFY_API)/bulk'\n 	elif [ $p_lang == java ]\n	  then\n	     cat /opt/ads-agent/javaDefault.json | sed -e 's/idFortify/'$cversion'/g' | curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d @- '$(FORTIFY_API)/bulk'\n	elif [ $p_lang == angular ] || [ $p_lang == nodejs ]\n	   then\n	     cat /opt/ads-agent/javascriptDefault.json | sed -e 's/idFortify/'$cversion'/g' | curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d @- '$(FORTIFY_API)/bulk'\n	elif [ $p_lang == php ]\n	   then\n	     cat /opt/ads-agent/phpDefault.json | sed -e 's/idFortify/'$cversion'/g' | curl -s -k -X POST -H \"Content-Type:application/json\" -H \"Authorization:FortifyToken $(token)\" -d @- '$(FORTIFY_API)/bulk'\n	fi\nelse \n  echo \"A Application Version: $(FORTIFY_VERSION_BUILD) já esta criada no Fortify\"	\nfi\necho \"##vso[task.setvariable variable=lista_versao;]$lista_versao\"\necho $lista_versao"
  - task: Bash@3
    displayName: Herdando Atributos
    condition: and(succeeded(), ne(variables['fortify_disable'], 'gecmi'), ne(variables['p_language'], 'dotnet'))
    enabled: False
    inputs:
      targetType: inline
      filePath: /opt/ads-agent/fortify_analisis.sh
      script: >
        #!/bin/bash

        #set -x

        echo "LANGUAGE $(p_language)"


        identificar_projeto=$(curl -s -k --location --request GET "$(FORTIFY_API)/projects?q=name:$(REPOSITORIO)" \

        --header "Accept: application/json" \

        --header "Authorization: FortifyToken $(FORTIFY_APITOKEN)" | jq '.data[].id')


        identificar_versao=`curl -k -s -X GET "$(FORTIFY_API)/projects/$identificar_projeto/versions?orderby=creationDate&limit=0" \

        -H "Authorization: FortifyToken $(FORTIFY_APITOKEN)" \

        -H "accept: application/json"`


        if [[ $(echo "$(lista_versao)" | grep "found":true) ]]

        then

        IdUltimaVersao=`echo "$identificar_versao" | jq -r '.data[-1].id'`

        else

        IdUltimaVersao=`echo "$identificar_versao" | jq -r '.data[-2].id'`

        fi


        IdAtualVersao=`curl -s -k --location --request GET "$(FORTIFY_API)/projects/$identificar_projeto/versions?orderby=creationDate&limit=0" --header "Accept: application/json" --header "Authorization: FortifyToken $(FORTIFY_APITOKEN)" | jq '.data[] | select(.name == "$(FORTIFY_VERSION_BUILD)") | .id'`

        echo "IdUltimaVersao: $IdUltimaVersao"

        echo "IdAtualVersao: $IdAtualVersao"

        version_count=`echo "$identificar_versao" | jq -r '.count'`

        if [[ $version_count -eq 1 ]]

        then
        	echo "Esta e a primeira versao, skip na heranca de atributos"
        	exit 0
        elif [[ "$IdUltimaVersao" == "$IdAtualVersao" ]]

        then
                echo "Esta e a ultima versao, skip na heranca de atributos"
        	exit 0
        else
        	echo "Fazendo a Heranca de Atributo da ultima para a versao atual"
        	refresh_audit=$(curl -o /dev/null -w "%{http_code}" -k -s -L -X POST "$(FORTIFY_API)/projectVersions/action/refresh" \
        	-H "accept: application/json" \
        	-H "Content-Type: application/json" \
        	-H "Authorization: FortifyToken $(token)" \
        	-d '{
        	 "projectVersionIds": [ '$IdUltimaVersao' ]
        	}')
        	if [[ $refresh_audit -ne 200 ]]
        	then
        		echo "Skip refresh"
        	else
        		echo "Refresh da ultima versao realizado com sucesso"
                        sleep 20
        	fi
        	replicar_atributos=$(curl -o /dev/null -w "%{http_code}" -k -s -L -X POST "$(FORTIFY_API)/projectVersions/action/copyCurrentState" \
        	-H "accept: application/json" \
        	-H "Content-Type: application/json" \
        	-H "Authorization: FortifyToken $(token)" \
        	-d '{
        	 "previousProjectVersionId": '$IdUltimaVersao',
        	 "projectVersionId": '$IdAtualVersao'
        	}')
        	if [[ $replicar_atributos -ne 200 ]]
        	then
        		echo "Erro ao copiar application state da ultima para a versao atual"
        		exit 1
        	else
        		echo "Replicado application state da ultima para a versao atual"
        	fi
        	response_acessos=$(curl -k -s -L -X GET "$(FORTIFY_API)/projectVersions/$IdUltimaVersao/authEntities" \
        	-H "accept: application/json" \
        	-H "Authorization: FortifyToken $(token)")
                 response_acessos_code=`echo $response_acessos | jq -r '.responseCode'`
        	if [[ $response_acessos_code -ne 200 ]]
        	then
        		echo "Erro ao capturar response de acessos da ultima versao"
        		exit 1
        	else
        		echo "Identificado o response de acesso da ultima versao"
        	fi
                 response_acessos_data=`echo $response_acessos | jq -r '.data'`
        	replicar_acessos=$(curl -o /dev/null -w "%{http_code}" -k -s -L -X PUT "$(FORTIFY_API)/projectVersions/$IdAtualVersao/authEntities" \
        	-H "accept: application/json" \
        	-H "Content-Type: application/json" \
        	-H "Authorization: FortifyToken $(token)" \
        	-d "$response_acessos_data")
        	if [[ $replicar_acessos -ne 200 ]]
        	then
        		echo "Erro ao atualizar acessos da versao atual"
        		exit 1
        	else
        		echo "Replicado acessos para a versao atual"
        	fi
        fi
  - task: Bash@3
    displayName: Iniciando Análise no Fortify
    condition: and(succeeded(), ne(variables['fortify_disable'], 'gecmi'), ne(variables['p_language'], 'dotnet'))
    enabled: False
    inputs:
      targetType: inline
      filePath: /opt/ads-agent/fortify_analisis.sh
      script: "#!/bin/bash\n\nexport PATH=/opt/apache-maven/apache-maven-3.8.5/bin:$PATH\nmvn -version\n\necho \"Iniciando Fortify Clean, Translate e Analysis\" \n\np_lang=`echo '$(p_language)' | sed 's/[[:punct:]]\\+$//'`\necho \"LANG $p_lang\"\n\nif [ $p_lang == java ]\n  then\n      \n	  DIR=$(Agent.BuildDirectory)/fortify\n     \n	  if [ -d \"$DIR\" ]; then\n		  echo \"Pasta ${DIR} existe...\"\n		  cd ${DIR}\n	  else\n	    DIR=$(Build.SourcesDirectory)\n	  fi\n	  \n	  if [ $POM_PATH ]\n	   then\n	     POM=`dirname $POM_PATH`\n	  cd ${DIR}/$POM\n	   else\n	  cd ${DIR}\n      fi\n\nscancentral -url $(SCANCENTRAL_URL) start -bt mvn -pool $(FORTIFY_POOL_SILVER_NOVO) -application $(REPOSITORIO) -version $(FORTIFY_VERSION_BUILD) -uptoken $(FORTIFY_UPTOKEN) -fprssc $(Build.BuildId).fpr -upload\n\nelif [ $p_lang == android ]\nthen\ncd $(Build.SourcesDirectory)\nchmod +x gradlew\nsed -i  \"s,distributionUrl=.*,distributionUrl=file:///opt/ferramentas/gradle/gradle-$(GradleVersion)-all.zip,\" gradle/wrapper/gradle-wrapper.properties\nscancentral arguments -o -targs \"-exclude './**/build/**/*'\"\nscancentral -url $(SCANCENTRAL_URL) start -bt gradle -bc $(FORTIFY_BUILD) -skipBuild -pool $(FORTIFY_POOL_GOLD_NOVO) -application $(REPOSITORIO) -version $(FORTIFY_VERSION_BUILD) -uptoken $(FORTIFY_UPTOKEN) -fprssc $(Build.BuildId).fpr -upload\n\nelse\n      if [ $PACKAGE_JSON_PATH ]\n	    then\n          cd $PACKAGE_JSON_PATH\n		else\n		  cd $(Build.SourcesDirectory)\n		fi\n	  scancentral arguments -o -targs \"-Dcom.fortify.sca.exclude.unimported.node.modules 'true'\" -targs \"-exclude './**/node_modules/**/*'\" -targs \"-exclude './**/*.min.js'\" -targs \"-exclude './**/dist/**/*'\"\n          scancentral -url $(SCANCENTRAL_URL) start -bt none -pool $(FORTIFY_POOL_GOLD_NOVO) -application $(REPOSITORIO) -version $(FORTIFY_VERSION_BUILD) -uptoken $(FORTIFY_UPTOKEN) -fprssc $(Build.BuildId).fpr -upload\nfi\n"
  - task: Bash@3
    displayName: Revogando Token
    condition: always()
    enabled: False
    inputs:
      targetType: inline
      filePath: /opt/ads-agent/fortify_analisis.sh
      script: >-
        #!/bin/bash

        set -o errexit

        set -o nounset

        set -o pipefail

        #set -x


        echo "Verificando se o token foi criado."

        if [[ -n $(token_id) ]]

        then
            echo "Revogando token"
        	delete_token=`curl -s --user $(FORTIFY_USER):$(FORTIFY_PASS) -k -X DELETE -H "Content-Type:application/json" '$(FORTIFY_API)/tokens/$(token_id)'`
        	response=`echo $delete_token | jq -r '.responseCode'`
        	    if [[ $response != 200 ]]
                    then
                        echo "Ocorreu um erro ao revogar o token no Fortify Status_code: $response"
        		#exit 1
                    fi
        else
          echo "Token não foi criado. Favor verificar se alguma task apresenta erro."
        fi
  - task: CmdLine@2
    displayName: 'SAST: Limpando MVN_GOAL'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), ne(variables['fortify_disable'], 'gecmi'), eq(variables['p_language'], 'java'))
    inputs:
      script: "if [[ -n $MVN_GOAL ]]; then\n  FTFY_MVN_GOAL=\"$(\n    printf '%s' \"$MVN_GOAL\" |\n      sed -E '\n        s/(^|[[:space:]])-DskipTests=(true|false)([[:space:]]|$)/ /g;\n        s/(^|[[:space:]])(clean|install)([[:space:]]|$)/ /g;\n        s/[[:space:]]+/ /g;\n        s/^ //; s/ $//\n      '\n  )\"\n\n  # Força -DskipTests=true no final para garantir que testes não sejam executados em análise\n  FTFY_MVN_GOAL=\"${FTFY_MVN_GOAL:+$FTFY_MVN_GOAL }-DskipTests=true\"\n  echo \"##vso[task.setvariable variable=FTFY_MVN_GOAL]$FTFY_MVN_GOAL\"\n  echo MVN_GOAL: $FTFY_MVN_GOAL  \nfi"
  - task: CmdLine@2
    displayName: 'SAST: Define Variáveis'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), ne(variables['fortify_disable'], 'gecmi'))
    inputs:
      script: >-
        echo "Verificando a existência das variáveis de comunidade..."

        if [[ -z $FORTIFY_SENSOR_POOL ]]; then
            echo "##vso[task.logissue type=error;]Não foi possível determinar a comunidade responsável por este sistema. Entre em contato com a CESET10 para vincular seu pipeline ao Variable Group correspondente à sua comunidade."
            exit 1
        fi


        if [[ -n $FORTIFY_SOBRESCREVE_POOL ]]; then
          echo "##vso[task.setvariable variable=FORTIFY_SENSOR_POOL;]$FORTIFY_SOBRESCREVE_POOL"
          echo POOL: $FORTIFY_SOBRESCREVE_POOL
        fi


        #######


        JAVA_HOME_17_X64=/usr/java/open-jdk-17.0.8

        echo "##[command]echo \$JAVA_HOME_17_X64"

        echo JAVA_HOME_17_X64: $JAVA_HOME_17_X64


        echo "##vso[task.setvariable variable=JAVA_HOME_17_X64;]$JAVA_HOME_17_X64"


        if [[ -n $MVN_GOAL ]]; then

        echo MVN_GOAL: $FTFY_MVN_GOAL

        fi


        #######


        echo Build.Repository.Name=$(Build.Repository.Name)

        echo Build.DefinitionName=$(Build.DefinitionName)

        echo Build.BuildNumber=$(Build.BuildNumber)

        echo Build.BuildId=$(Build.BuildId)

        echo Build.SourceBranch=$(Build.SourceBranch)

        echo Build.SourceBranchName=$(Build.SourceBranchName)

        echo Build.SourceVersion=$(Build.SourceVersion)


        echo "##[command]echo \$valida.vec"

        echo vec=$(valida.vec)


        echo "##[command]echo \$sonar_branch"

        echo branch=$sonar_branch

        if [[ $sonar_branch =~ ^INC(\d)* ]]; then
            echo "##[warning]Hotfix detectado. Aplicando bypass no Guardrail."
            echo "##vso[task.setvariable variable=guardrail.sec;]false"
        fi


        echo FORTIFY_APPLICATION=$FORTIFY_APPLICATION

        echo FORTIFY_SESSION=$FORTIFY_SESSION

        echo KEYSTORE_SECUREFILEPATH=$(KEYSTORE_SECUREFILEPATH)

        echo NODE_EXTRA_CA_CERTS=$(NODE_EXTRA_CA_CERTS)


        #verificar diretório contendo os certificados necessários para a próxima task

        #ls -lah /etc/pki/ca-trust/source/anchors/


        echo "Versão atual:"

        echo "##[command]git log --pretty=format:"%H %D" | sed -n '1p'"

        git -c safe.directory=* log --pretty=format:"%H %D" | sed -n '1p'

        echo "##[command]git describe --tags $(Build.SourceVersion)"

        git -c safe.directory=* describe --tags $(Build.SourceVersion)


        #######


        echo "Versões anteriores [tag] seguindo a branch atual:"


        FORTIFY_NEW_VERSION=`git -c safe.directory=* log --pretty=format:"%H %D" | grep -oP '(?<=tag: )[^\s]*([0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3})' | sed -n '1p'`

        FORTIFY_LAST_VERSION=`git -c safe.directory=* log --pretty=format:"%H %D" | grep -oP '(?<=tag: )[^\s]*([0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3})' | sed -n '2p'`

        FORTIFY_THIRD_VERSION=`git -c safe.directory=* log --pretty=format:"%H %D" | grep -oP '(?<=tag: )[^\s]*([0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3})' | sed -n '3p'`


        echo Última tag mais recente: $FORTIFY_NEW_VERSION

        echo Penúltima tag mais recente: $FORTIFY_LAST_VERSION

        echo Antepenúltima tag mais recente: $FORTIFY_THIRD_VERSION


        if [[ $FORTIFY_NEW_VERSION == null ]]; then
            echo "##[error]Incapaz de determinar a versão da aplicação."
            exit 1
        fi


        echo Validando VEC e versão...

        # A VEC dá false pois o valor $(Build.SourceBranchName) não passa o valor da tag quando o build é disparado a partir da branch.

        if [[ $(valida.vec) == false ]]; then

        echo "O nome de versão ' $(Build.SourceBranchName) ' NÃO ATENDE aos parâmetros da VEC."

        fi

        if [[ -n $FORTIFY_NEW_VERSION ]]; then
          FORTIFY_NEW_VERSION=`echo $FORTIFY_NEW_VERSION | grep -oP $(FORTIFY_REGEX)`
          FORTIFY_LAST_VERSION=`echo $FORTIFY_LAST_VERSION | grep -oP $(FORTIFY_REGEX)`
        else

        if [[ -n $FORTIFY_LAST_VERSION ]]; then
          FORTIFY_NEW_VERSION="develop"
        else
          FORTIFY_NEW_VERSION=`echo $FORTIFY_LAST_VERSION | grep -oP $(FORTIFY_REGEX)`
          FORTIFY_LAST_VERSION=`echo $FORTIFY_THIRD_VERSION | grep -oP $(FORTIFY_REGEX)`
        fi

        fi


        echo "##[debug]Seu resultado será publicado no Fortify sob a Versão de nome: ' $FORTIFY_APPLICATION:$FORTIFY_NEW_VERSION '"


        #######


        FORTIFY_FPR_NAME=`git -c safe.directory=* describe --tags $(Build.SourceVersion)`


        echo "##vso[task.setvariable variable=FORTIFY_NEW_VERSION]$FORTIFY_NEW_VERSION"

        echo "##vso[task.setvariable variable=FORTIFY_LAST_VERSION]$FORTIFY_LAST_VERSION"

        echo "##vso[task.setvariable variable=FORTIFY_FPR_NAME]$FORTIFY_FPR_NAME"


        #######


        echo "Agent Name: $AGENT_NAME"

        AGENT_SHORT_NAME=$(echo "$AGENT_NAME" | sed -E 's/^([a-zA-Z]+)[0-9]*\..*/\1/')


        echo "Nome curto do agente: $AGENT_SHORT_NAME"


        if [[ "$AGENT_SHORT_NAME" == "cadsvaprlx" && -n $DOTNET_VERSION ]]; then
            echo DOTNET_VERSION: $DOTNET_VERSION
            echo "##[warning]Este Agent não possui os requisitos para executar a ferramenta de SAST ( .NET 8.0 ). O Bypass do SAST será ativado."
            echo "##vso[task.setvariable variable=fortify_disable;]gecmi"
        fi


        if [[ "$AGENT_SHORT_NAME" == "cadsvaprlx" ]]; then
            CONTAINER_ENGINE=docker
            echo "##vso[task.setvariable variable=CONTAINER_ENGINE]docker"
        else
            CONTAINER_ENGINE=podman
            echo "##vso[task.setvariable variable=CONTAINER_ENGINE]podman"
        fi


        echo "##[debug]Container engine selecionado: $CONTAINER_ENGINE"
  - task: CmdLine@2
    displayName: '[MANTER] SAST: Validando a Passagem de Valores'
    enabled: False
    inputs:
      script: >-
        scancentral --version

        /opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/bin/scancentral --version


        echo FORTIFY_SESSION: $FORTIFY_SESSION

        echo FORTIFY_APPLICATION: $FORTIFY_APPLICATION


        echo FORTIFY_NEW_VERSION: $FORTIFY_NEW_VERSION

        echo FORTIFY_LAST_VERSION: $FORTIFY_LAST_VERSION

        echo FORTIFY_APPLICATION-FORTIFY_NEW_VERSION

        echo $FORTIFY_APPLICATION-$FORTIFY_NEW_VERSION

        #echo FORTIFY_APPLICATION-[ dependencies.A.outputs['FORTIFY_NEW_VERSION'] ]

        #echo $FORTIFY_APPLICATION-$[ dependencies.A.outputs['FORTIFY_NEW_VERSION'] ]
  - task: CmdLine@2
    displayName: 'SAST: Cria Aplicação - Backup'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), ne(variables['fortify_disable'], 'gecmi'))
    retryCountOnTaskFailure: 5
    enabled: False
    inputs:
      script: "command -v docker && docker --version\ncommand -v podman && podman --version\n\n#sudo usermod -aG docker $USER\n\n#ls -l /var/run/docker.sock\n\n#set -o errexit\n#set -o pipefail\n#echo Engine selecionado: $CONTAINER_ENGINE\n#echo Versão mais recente: $FORTIFY_NEW_VERSION\n#echo Versão anterior: $FORTIFY_LAST_VERSION\n\necho \"$FORTIFY_REGISTRY_PASSWORD\" | $CONTAINER_ENGINE login default-route-openshift-image-registry.apps.produtos4.caixa --username \"$FORTIFY_REGISTRY_USERNAME\" --password-stdin\n \necho FORTIFY_APPLICATION: $FORTIFY_APPLICATION\necho KEYSTORE_SECUREFILEPATH: $(KEYSTORE_SECUREFILEPATH)\nKEYSTORE_SECUREFILEPATH=$(KEYSTORE_SECUREFILEPATH)\ncp $KEYSTORE_SECUREFILEPATH $(System.DefaultWorkingDirectory)/keystore.jks\n#echo \"##vso[task.setvariable variable=KEYSTORE_SECUREFILEPATH]$KEYSTORE_SECUREFILEPATH\"\n\n# Valida Integridade do JKS (parte 1, fora do container)\necho Valida integridade do certificado FORA do container\necho \"##[command]md5sum /etc/pki/ca-trust/source/anchors/keystore-ssc24.jks\"\nmd5sum /etc/pki/ca-trust/source/anchors/keystore-ssc24.jks\necho \"##[command]md5sum $KEYSTORE_SECUREFILEPATH\"\nmd5sum $KEYSTORE_SECUREFILEPATH\necho \"##[command]md5sum $(System.DefaultWorkingDirectory)/keystore.jks\"\nmd5sum $(System.DefaultWorkingDirectory)/keystore.jks\n\n# Executa o container Fortify com as variáveis herdadas do ambiente\necho \"##[command]$CONTAINER_ENGINE --version\"\n$CONTAINER_ENGINE --version\necho \"##[command]$CONTAINER_ENGINE run -v $(System.DefaultWorkingDirectory):/src default-route-openshift-image-registry.apps.produtos4.caixa/fortify/fortify-ci-tools:7.0.0-jdk-17\"\n$CONTAINER_ENGINE run --rm \\\n  --security-opt seccomp=unconfined \\\n  --memory=12g \\\n  --memory-swap=12g \\\n  -v $(System.DefaultWorkingDirectory):/src \\\n  -w /src \\\n  -e FORTIFY_APPLICATION \\\n  -e FORTIFY_APP_VERSION=$FORTIFY_NEW_VERSION \\\n  -e FORTIFY_PREVIOUS_VERSION=$FORTIFY_LAST_VERSION \\\n  -e FORTIFY_SESSION \\\n  -e FORTIFY_URL \\\n  -e FORTIFY_CI_TOKEN \\\n  -e FORTIFY_CLIENT_AUTH_TOKEN \\\n  -e FORTIFY_SENSOR_VERSION \\\n  -e FORTIFY_SIGLA=$(Build.DefinitionName) \\\n  -e FORTIFY_COMUNIDADE \\\n  -e FORTIFY_LDAP_GROUP \\\n  default-route-openshift-image-registry.apps.produtos4.caixa/fortify/fortify-ci-tools:7.0.0-jdk-17 \\\n  bash -c \"\n    \n    echo Valida integridade do certificado DENTRO do container\n    echo md5sum /src/keystore.jks\n    md5sum /src/keystore.jks\n    \n    echo Configurando Key Store\n    fcli config truststore set \\\n      --file=/src/keystore.jks \\\n      --password=$KEYSTORE_PWD \\\n      --type=jks\n \n    echo \\\"Nome do Sistema: \\$FORTIFY_APPLICATION\\\"\n \n    echo \\\"Nome da Versão: \\$FORTIFY_APP_VERSION\\\"\n \n    echo \\\"Nome da Versão Anterior: \\$FORTIFY_PREVIOUS_VERSION\\\"\n \n   #FORTIFY_CI_TOKEN proveniente do Fortify (expira)\n   #FORTIFY_CLIENT_AUTH_TOKEN (não expira)\n    echo Login no Fortify...\n    fcli ssc session login \\\n      --url=\\$FORTIFY_URL \\\n      --token=\\$FORTIFY_CI_TOKEN \\\n      --client-auth-token=\\$FORTIFY_CLIENT_AUTH_TOKEN \\\n      --socket-timeout=10m \\\n      --connect-timeout=5m \\\n      --ssc-session=\\$FORTIFY_SESSION\n    \n \n    echo Criando aplicação no Fortify...\n    fcli ssc action run setup-appversion \\\n      --appversion=\\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION \\\n      --attributes=\\\"Comunidade=\\$FORTIFY_COMUNIDADE,Sigla=\\$FORTIFY_SIGLA\\\" \\\n      --add-users=\\$FORTIFY_LDAP_GROUP \\\n      --copy-from=\\$FORTIFY_APPLICATION:\\$FORTIFY_PREVIOUS_VERSION \\\n      --ssc-session=\\$FORTIFY_SESSION || true\n \n    fcli ssc action run setup-appversion \\\n      --appversion=\\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION \\\n      --attributes=\\\"Comunidade=\\$FORTIFY_COMUNIDADE,Sigla=\\$FORTIFY_SIGLA\\\" \\\n      --add-users=\\$FORTIFY_LDAP_GROUP \\\n      --ssc-session=\\$FORTIFY_SESSION || true\n \n    echo Atribuindo acessos ao Fortify...\n    fcli ssc appversion update \\\n      \\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION \\\n      --add-users=\\$FORTIFY_LDAP_GROUP \\\n      --ssc-session=\\$FORTIFY_SESSION || true\n \n    echo Logout do Fortify...\n    fcli ssc session logout \\\n      --ssc-session=\\$FORTIFY_SESSION \\\n      --no-revoke-token\n  \""
  - task: CmdLine@2
    displayName: 'SAST: Cria Aplicação'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), ne(variables['fortify_disable'], 'gecmi'))
    retryCountOnTaskFailure: 5
    inputs:
      script: "command -v docker && docker --version\ncommand -v podman && podman --version\n\n#sudo usermod -aG docker $USER\n\n#ls -l /var/run/docker.sock\n\n#set -o errexit\n#set -o pipefail\n#echo Engine selecionado: $CONTAINER_ENGINE\n#echo Versão mais recente: $FORTIFY_NEW_VERSION\n#echo Versão anterior: $FORTIFY_LAST_VERSION\n\necho \"$FORTIFY_REGISTRY_PASSWORD\" | $CONTAINER_ENGINE login default-route-openshift-image-registry.apps.produtos4.caixa --username \"$FORTIFY_REGISTRY_USERNAME\" --password-stdin\n \necho FORTIFY_APPLICATION: $FORTIFY_APPLICATION\necho KEYSTORE_SECUREFILEPATH: $(KEYSTORE_SECUREFILEPATH)\nKEYSTORE_SECUREFILEPATH=$(KEYSTORE_SECUREFILEPATH)\ncp $KEYSTORE_SECUREFILEPATH $(System.DefaultWorkingDirectory)/keystore.jks\n#echo \"##vso[task.setvariable variable=KEYSTORE_SECUREFILEPATH]$KEYSTORE_SECUREFILEPATH\"\n\n# Valida Integridade do JKS (parte 1, fora do container)\necho Valida integridade do certificado FORA do container\necho \"##[command]md5sum /etc/pki/ca-trust/source/anchors/keystore-ssc24.jks\"\nmd5sum /etc/pki/ca-trust/source/anchors/keystore-ssc24.jks\necho \"##[command]md5sum $KEYSTORE_SECUREFILEPATH\"\nmd5sum $KEYSTORE_SECUREFILEPATH\necho \"##[command]md5sum $(System.DefaultWorkingDirectory)/keystore.jks\"\nmd5sum $(System.DefaultWorkingDirectory)/keystore.jks\n\n# Executa o container Fortify com as variáveis herdadas do ambiente\necho \"##[command]$CONTAINER_ENGINE --version\"\n$CONTAINER_ENGINE --version\necho \"##[command]$CONTAINER_ENGINE run -v $(System.DefaultWorkingDirectory):/src default-route-openshift-image-registry.apps.produtos4.caixa/fortify/fortify-ci-tools:7.0.0-jdk-17\"\n$CONTAINER_ENGINE run --rm \\\n  --security-opt seccomp=unconfined \\\n  --memory=12g \\\n  --memory-swap=12g \\\n  -v $(System.DefaultWorkingDirectory):/src \\\n  -w /src \\\n  -e FORTIFY_APPLICATION \\\n  -e FORTIFY_APP_VERSION=$FORTIFY_NEW_VERSION \\\n  -e FORTIFY_PREVIOUS_VERSION=$FORTIFY_LAST_VERSION \\\n  -e FORTIFY_SESSION \\\n  -e FORTIFY_URL \\\n  -e FORTIFY_CI_TOKEN \\\n  -e FORTIFY_CLIENT_AUTH_TOKEN \\\n  -e FORTIFY_SENSOR_VERSION \\\n  -e FORTIFY_SIGLA=$(Build.DefinitionName) \\\n  -e FORTIFY_COMUNIDADE \\\n  -e FORTIFY_LDAP_GROUP \\\n  default-route-openshift-image-registry.apps.produtos4.caixa/fortify/fortify-ci-tools:7.0.0-jdk-17 \\\n  bash -c \"\n\n    echo Valida integridade do certificado DENTRO do container\n    echo md5sum /src/keystore.jks\n    md5sum /src/keystore.jks\n\n    echo Configurando Key Store\n    fcli config truststore set \\\n      --file=/src/keystore.jks \\\n      --password=$KEYSTORE_PWD \\\n      --type=jks\n\n    echo \\\"Nome do Sistema: \\$FORTIFY_APPLICATION\\\"\n\n    echo \\\"Nome da Versão: \\$FORTIFY_APP_VERSION\\\"\n\n    echo \\\"Nome da Versão Anterior: \\$FORTIFY_PREVIOUS_VERSION\\\"\n\n   #FORTIFY_CI_TOKEN proveniente do Fortify (expira)\n   #FORTIFY_CLIENT_AUTH_TOKEN (não expira)\n    echo Login no Fortify...\n    fcli ssc session login \\\n      --url=\\$FORTIFY_URL \\\n      --token=\\$FORTIFY_CI_TOKEN \\\n      --client-auth-token=\\$FORTIFY_CLIENT_AUTH_TOKEN \\\n      --socket-timeout=10m \\\n      --connect-timeout=5m \\\n      --ssc-session=\\$FORTIFY_SESSION\n\n    echo Criando aplicação no Fortify...\n    fcli ssc action run setup-appversion \\\n      --appversion=\\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION \\\n      --attributes=\\\"Comunidade=\\$FORTIFY_COMUNIDADE,Sigla=\\$FORTIFY_SIGLA\\\" \\\n      --add-users=\\$FORTIFY_LDAP_GROUP \\\n      --copy-from=\\$FORTIFY_APPLICATION:\\$FORTIFY_PREVIOUS_VERSION \\\n      --ssc-session=\\$FORTIFY_SESSION || true\n\n    fcli ssc action run setup-appversion \\\n      --appversion=\\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION \\\n      --attributes=\\\"Comunidade=\\$FORTIFY_COMUNIDADE,Sigla=\\$FORTIFY_SIGLA\\\" \\\n      --add-users=\\$FORTIFY_LDAP_GROUP \\\n      --ssc-session=\\$FORTIFY_SESSION || true\n \n    echo Atribuindo acessos ao Fortify...\n    fcli ssc appversion update \\\n      \\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION \\\n      --add-users=\\$FORTIFY_LDAP_GROUP \\\n      --ssc-session=\\$FORTIFY_SESSION || true\n\n    echo Pegando Rules\n    fcli ssc rest call \\\n      -X GET \\\n      -o json \\\n      --to-file rules.json \\\n      --ssc-session=\\\"\\$FORTIFY_SESSION\\\" \\\n      \\\"/api/v1/projectVersions/10000/resultProcessingRules\\\" || true\n\n    echo Pegando ID app\n    FRTF_ID_VERSION=\\$(\n     fcli ssc appversion get \\\n      --ssc-session=\\\"\\$FORTIFY_SESSION\\\" \\\n      -o expr=\\\"{id}\\\" \\\n      \\\"\\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION\\\"\n    ) || true\n\n    echo Atualizando Rules\n    fcli ssc rest call \\\n      -X PUT \\\n      -d '@@rules.json' \\\n      --ssc-session=\\\"\\$FORTIFY_SESSION\\\" \\\n      \\\"/api/v1/projectVersions/\\$FRTF_ID_VERSION/resultProcessingRules\\\" || true \n    echo \\\"FRTF_ID_VERSION: \\$FRTF_ID_VERSION\\\"\n\n    echo Logout do Fortify...\n    fcli ssc session logout \\\n      --ssc-session=\\$FORTIFY_SESSION \\\n      --no-revoke-token\n  \""
  - task: CmdLine@2
    displayName: '[MANTER] SAST: Disparando SAST no Fortify'
    enabled: False
    inputs:
      script: "echo Sistema: $FORTIFY_APPLICATION\necho Versão mais recente: $FORTIFY_NEW_VERSION\necho Versão anterior: $FORTIFY_LAST_VERSION\n\necho Empacotando aplicação...\n/opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/bin/scancentral package --output package.zip\n\necho Disparando requisição de análise SAST...\n/opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/bin/scancentral \\\n    -url $FORTIFY_URL_CONTROLLER \\\n    start --upload-to-ssc \\\n    -application $FORTIFY_APPLICATION \\\n    -version $FORTIFY_NEW_VERSION \\\n    --package package.zip \\\n    --ssc-upload-token $FORTIFY_CI_TOKEN "
  - task: CmdLine@2
    displayName: 'SAST: Confirmando Variáveis'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), ne(variables['fortify_disable'], 'gecmi'))
    inputs:
      script: >-
        echo "Definindo liguagem de programação"

        cd $(Build.SourcesDirectory)

        for file in pom.xml angular.json tsconfig.json package.json project.ini *.csproj *.sln build.gradle

        do
            f_language=`find . -maxdepth 3 -name "${file}" -exec basename {} \; | head -n 1`
            if [[ "${f_language}" == pom.xml ]]; then
                echo MVN_GOAL: $FTFY_MVN_GOAL
                p_language=java
                break
            elif [[ "${f_language}" == angular.json ]] || [[ "${f_language}" == tsconfig.json ]]; then
                p_language=angular
                break
            elif [[ "${f_language}" == package.json ]]; then
                p_language=nodejs
                break
            elif [[ "${f_language}" == project.ini ]]; then
                p_language=php
                break
            elif [[ "${f_language}" == *".csproj" ]] || [[ "${f_language}" == *".sln" ]];then
                p_language=dotnet
                break
            elif [[ "${f_language}" == "build.gradle" ]]; then
                p_language=android
                break
            else
                p_language=null
            fi
        done


        echo "Linguagem de Programação:" $p_language

        echo "##vso[task.setvariable variable=p_language;]$p_language"


        if [ $p_language == null ]; then
            echo "##[warning]Não foi possivel definir a linguagem de programação deste codigo fonte"
        fi


        #######


        JAVA_HOME_17_X64=/usr/java/open-jdk-17.0.8

        echo "##[command]echo \$JAVA_HOME_17_X64"

        echo JAVA_HOME_17_X64: $JAVA_HOME_17_X64


        echo "##vso[task.setvariable variable=JAVA_HOME_17_X64;]$JAVA_HOME_17_X64"


        echo MAVEN_VERSION: $MAVEN_VERSION


        if [[ -n $MAVEN_VERSION ]]; then
            export PATH=/opt/apache-maven/apache-maven-$MAVEN_VERSION/bin:$PATH
            echo "##vso[task.setvariable variable=PATH;]$PATH"
        fi

        echo PATH: $PATH


        #######


        echo Build.Repository.Name=$(Build.Repository.Name)


        echo FORTIFY_APPLICATION=$FORTIFY_APPLICATION

        echo FORTIFY_SESSION=$FORTIFY_SESSION


        echo "##[command]echo NODE_EXTRA_CA_CERTS"

        echo $(NODE_EXTRA_CA_CERTS)

        echo "##[command]md5sum NODE_EXTRA_CA_CERTS"

        md5sum $(NODE_EXTRA_CA_CERTS)


        #verificar diretório contendo os certificados necessários para a próxima task

        #ls -lah /etc/pki/ca-trust/source/anchors/


        echo Build.DefinitionName=$(Build.DefinitionName)

        echo Build.BuildNumber=$(Build.BuildNumber)

        echo Build.BuildId=$(Build.BuildId)

        echo Build.SourceBranch=$(Build.SourceBranch)

        echo Build.SourceBranchName=$(Build.SourceBranchName)

        echo Build.SourceVersion=$(Build.SourceVersion)


        echo "##[command]echo \$valida.vec"

        echo vec=$(valida.vec)


        #######


        echo "Versão atual:"

        echo "##[command]git log --pretty=format:"%H %D" | sed -n '1p'"

        git -c safe.directory=* log --pretty=format:"%H %D" | sed -n '1p'

        echo "##[command]git describe --tags $(Build.SourceVersion)"

        git -c safe.directory=* describe --tags $(Build.SourceVersion)


        #######


        echo "Versões anteriores [tag] seguindo a branch atual:"


        FORTIFY_NEW_VERSION=`git -c safe.directory=* log --pretty=format:"%H %D" | grep -oP '(?<=tag: )[^\s]*([0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3})' | sed -n '1p'`

        FORTIFY_LAST_VERSION=`git -c safe.directory=* log --pretty=format:"%H %D" | grep -oP '(?<=tag: )[^\s]*([0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3})' | sed -n '2p'`

        FORTIFY_THIRD_VERSION=`git -c safe.directory=* log --pretty=format:"%H %D" | grep -oP '(?<=tag: )[^\s]*([0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3})' | sed -n '3p'`


        echo Última tag mais recente: $FORTIFY_NEW_VERSION

        echo Penúltima tag mais recente: $FORTIFY_LAST_VERSION

        echo Antepenúltima tag mais recente: $FORTIFY_THIRD_VERSION


        echo Validando VEC e versão...

        # A VEC dá false pois o valor $(Build.SourceBranchName) não passa o valor da tag quando o build é disparado a partir da branch.

        if [[ $(valida.vec) == false ]]; then

        echo "O nome de versão ' $(Build.SourceBranchName) ' NÃO ATENDE aos parâmetros da VEC."

        fi

        if [[ -n $FORTIFY_NEW_VERSION ]]; then
          FORTIFY_NEW_VERSION=`echo $FORTIFY_NEW_VERSION | grep -oP $(FORTIFY_REGEX)`
          FORTIFY_LAST_VERSION=`echo $FORTIFY_LAST_VERSION | grep -oP $(FORTIFY_REGEX)`
        else

        if [[ -n $FORTIFY_LAST_VERSION ]]; then
          FORTIFY_NEW_VERSION="develop"
        else
          FORTIFY_NEW_VERSION=`echo $FORTIFY_LAST_VERSION | grep -oP $(FORTIFY_REGEX)`
          FORTIFY_LAST_VERSION=`echo $FORTIFY_THIRD_VERSION | grep -oP $(FORTIFY_REGEX)`
        fi

        fi

        #

        #echo FORTIFY_NEW_VERSION=$FORTIFY_NEW_VERSION

        #echo FORTIFY_LAST_VERSION=$FORTIFY_LAST_VERSION

        echo "##[debug]Seu resultado será publicado no Fortify sob a Versão de nome: ' $FORTIFY_APPLICATION:$FORTIFY_NEW_VERSION '"


        echo "##vso[task.setvariable variable=FORTIFY_NEW_VERSION]$FORTIFY_NEW_VERSION"

        echo "##vso[task.setvariable variable=FORTIFY_LAST_VERSION]$FORTIFY_LAST_VERSION"


        ########


        echo "Agent Name: $AGENT_NAME"

        AGENT_SHORT_NAME=$(echo "$AGENT_NAME" | sed -E 's/^([a-zA-Z]+)[0-9]*\..*/\1/')


        echo "Nome curto do agente: $AGENT_SHORT_NAME"


        if [[ "$AGENT_SHORT_NAME" == "cadsvaprlx" ]]; then
            CONTAINER_ENGINE=docker
            echo "##vso[task.setvariable variable=CONTAINER_ENGINE]docker"
        else
            CONTAINER_ENGINE=podman
            echo "##vso[task.setvariable variable=CONTAINER_ENGINE]podman"
        fi


        echo "##[debug]Container engine selecionado: $CONTAINER_ENGINE"
  - task: CmdLine@2
    displayName: '[MANTER] SAST: Validando Passagem de Variáveis'
    enabled: False
    inputs:
      script: >-
        scancentral --version

        /opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/bin/scancentral --version


        echo FORTIFY_SESSION: $FORTIFY_SESSION

        echo FORTIFY_APPLICATION: $FORTIFY_APPLICATION


        echo FORTIFY_NEW_VERSION: $FORTIFY_NEW_VERSION

        echo FORTIFY_LAST_VERSION: $FORTIFY_LAST_VERSION

        echo FORTIFY_APPLICATION-FORTIFY_NEW_VERSION

        echo $FORTIFY_APPLICATION-$FORTIFY_NEW_VERSION

        #echo FORTIFY_APPLICATION-[ dependencies.A.outputs['FORTIFY_NEW_VERSION'] ]

        #echo $FORTIFY_APPLICATION-$[ dependencies.A.outputs['FORTIFY_NEW_VERSION'] ]
  - task: CmdLine@2
    displayName: '[MANTER] SAST: Fortify ScanCentral SAST Assessment v1'
    enabled: False
    inputs:
      script: "echo Sistema: $FORTIFY_APPLICATION\necho Versão mais recente: $FORTIFY_NEW_VERSION\necho Versão anterior: $FORTIFY_LAST_VERSION\n\necho Empacotando aplicação...\n/opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/bin/scancentral package --output package.zip\n\necho Disparando requisição de análise SAST...\n/opt/ads-agent/_work/_tool/scancentral/24.4.0/x64/bin/scancentral \\\n    -url $FORTIFY_URL_CONTROLLER \\\n    start --upload-to-ssc \\\n    -application $FORTIFY_APPLICATION \\\n    -version $FORTIFY_NEW_VERSION \\\n    --fpr-filename-on-ssc $(Build.BuildNumber)\n    --package package.zip \\\n    --ssc-upload-token $FORTIFY_CI_TOKEN "
  - task: FortifyScanCentralSAST@7
    displayName: 'SAST: Análise Java [Assíncrona]'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), ne(variables['guardrail.sec'], 'true'), ne(variables['fortify_disable'], 'gecmi'), eq(variables['p_language'], 'java'))
    retryCountOnTaskFailure: 2
    inputs:
      scanCentralCtrlUrl: $(FORTIFY_URL_CONTROLLER)
      scanCentralClientToken: $(FORTIFY_CLIENT_AUTH_TOKEN)
      sscUrl: $(FORTIFY_URL)
      sscCiToken: $(FORTIFY_CI_TOKEN)
      uploadToSSC: true
      applicationName: $(Build.Repository.Name)
      applicationVersion: $(FORTIFY_NEW_VERSION)
      buildTool: mvn
      buildCommand: $(FTFY_MVN_GOAL)
      buildFile: $(POM_PATH)
      additionalTranslationArgs: >-
        -Dcom.fortify.sca.NullPtrMaxFunctionTime=30000

        -Dcom.fortify.sca.exclude.unimported.node.modules=true

        -Dcom.fortify.sca.EnableDOMModeling=true

        -Dcom.fortify.sca.fileextensions.inc=PHP

        -Dcom.fortify.sca.rules.password_regex.global=(?i)(s|_)?(user|usr|member|admin|guest|login|default|new|current|old|client|server|proxy|sqlserver|my|mysql|mongo|mongodb|db|database|ldap|smtp|email|email(_)?smtp)?(_|\.)?(pass(wd|word|phrase)|secret|senha)
      excludeArgs: >-
        ./**/node_modules/**/*

        ./**/*.min.js

        ./**/dist/**/*
      skipBuild: false
      excludeDisabledProjects: false
      includeTest: false
      includeNodeModules: false
      additionalScanArgs: >-
        -build-label $(FORTIFY_FPR_NAME)

        -build-version $(FORTIFY_FPR_NAME)-$(Build.BuildNumber)
      sensorPool: $(FORTIFY_SENSOR_POOL)
      overwrite: false
      quiet: false
      downloadDebugLogs: false
      debugLogFileName: $(Build.Repository.Name)-$(FORTIFY_FPR_NAME)-fortify-debug-logs.zip
  - task: FortifyScanCentralSAST@7
    displayName: 'SAST: Análise Default [Assíncrona]'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), ne(variables['guardrail.sec'], 'true'), ne(variables['fortify_disable'], 'gecmi'), ne(variables['p_language'], 'java'))
    retryCountOnTaskFailure: 2
    inputs:
      scanCentralCtrlUrl: $(FORTIFY_URL_CONTROLLER)
      scanCentralClientToken: $(FORTIFY_CLIENT_AUTH_TOKEN)
      sscUrl: $(FORTIFY_URL)
      sscCiToken: $(FORTIFY_CI_TOKEN)
      uploadToSSC: true
      applicationName: $(Build.Repository.Name)
      applicationVersion: $(FORTIFY_NEW_VERSION)
      autoDetectBuildTool: true
      additionalTranslationArgs: >-
        -Dcom.fortify.sca.exclude.unimported.node.modules=true

        -Dcom.fortify.sca.EnableDOMModeling=true

        -Dcom.fortify.sca.fileextensions.inc=PHP

        -Dcom.fortify.sca.rules.password_regex.global=(?i)(s|_)?(user|usr|member|admin|guest|login|default|new|current|old|client|server|proxy|sqlserver|my|mysql|mongo|mongodb|db|database|ldap|smtp|email|email(_)?smtp)?(_|\.)?(pass(wd|word|phrase)|secret|senha)
      excludeArgs: >-
        ./**/node_modules/**/*

        ./**/*.min.js

        ./**/dist/**/*
      skipBuild: false
      excludeDisabledProjects: false
      includeTest: false
      includeNodeModules: false
      additionalScanArgs: >-
        -build-label $(FORTIFY_FPR_NAME)

        -build-version $(FORTIFY_FPR_NAME)-$(Build.BuildNumber)
      sensorPool: $(FORTIFY_SENSOR_POOL)
      overwrite: false
      quiet: false
      downloadDebugLogs: false
      debugLogFileName: $(Build.Repository.Name)-$(FORTIFY_FPR_NAME)-fortify-debug-logs.zip
  - task: FortifyScanCentralSAST@7
    displayName: 'SAST: Análise Java [Síncrona]'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), eq(variables['guardrail.sec'], 'true'), ne(variables['fortify_disable'], 'gecmi'), eq(variables['p_language'], 'java'))
    retryCountOnTaskFailure: 2
    inputs:
      scanCentralCtrlUrl: $(FORTIFY_URL_CONTROLLER)
      scanCentralClientToken: $(FORTIFY_CLIENT_AUTH_TOKEN)
      sscUrl: $(FORTIFY_URL)
      sscCiToken: $(FORTIFY_CI_TOKEN)
      uploadToSSC: true
      applicationName: $(Build.Repository.Name)
      applicationVersion: $(FORTIFY_NEW_VERSION)
      buildTool: mvn
      buildCommand: $(FTFY_MVN_GOAL)
      buildFile: $(POM_PATH)
      additionalTranslationArgs: >-
        -Dcom.fortify.sca.NullPtrMaxFunctionTime=30000

        -Dcom.fortify.sca.exclude.unimported.node.modules=true

        -Dcom.fortify.sca.EnableDOMModeling=true

        -Dcom.fortify.sca.fileextensions.inc=PHP

        -Dcom.fortify.sca.rules.password_regex.global=(?i)(s|_)?(user|usr|member|admin|guest|login|default|new|current|old|client|server|proxy|sqlserver|my|mysql|mongo|mongodb|db|database|ldap|smtp|email|email(_)?smtp)?(_|\.)?(pass(wd|word|phrase)|secret|senha)
      excludeArgs: >-
        ./**/node_modules/**/*

        ./**/*.min.js

        ./**/dist/**/*
      skipBuild: false
      excludeDisabledProjects: false
      includeTest: false
      includeNodeModules: false
      additionalScanArgs: >-
        -build-label $(FORTIFY_FPR_NAME)

        -build-version $(FORTIFY_FPR_NAME)-$(Build.BuildNumber)
      sensorPool: $(FORTIFY_SENSOR_POOL)
      block: true
      logFile: $(Build.Repository.Name)-$(FORTIFY_NEW_VERSION)-$(Build.BuildNumber).log
      overwrite: true
      quiet: false
      downloadDebugLogs: false
      debugLogFileName: $(Build.Repository.Name)-$(FORTIFY_FPR_NAME)-fortify-debug-logs.zip
  - task: FortifyScanCentralSAST@7
    displayName: 'SAST: Análise Default [Síncrona]'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), eq(variables['guardrail.sec'], 'true'), ne(variables['fortify_disable'], 'gecmi'), ne(variables['p_language'], 'java'))
    retryCountOnTaskFailure: 2
    inputs:
      scanCentralCtrlUrl: $(FORTIFY_URL_CONTROLLER)
      scanCentralClientToken: $(FORTIFY_CLIENT_AUTH_TOKEN)
      sscUrl: $(FORTIFY_URL)
      sscCiToken: $(FORTIFY_CI_TOKEN)
      uploadToSSC: true
      applicationName: $(Build.Repository.Name)
      applicationVersion: $(FORTIFY_NEW_VERSION)
      autoDetectBuildTool: true
      additionalTranslationArgs: >-
        -Dcom.fortify.sca.exclude.unimported.node.modules=true

        -Dcom.fortify.sca.EnableDOMModeling=true

        -Dcom.fortify.sca.fileextensions.inc=PHP

        -Dcom.fortify.sca.rules.password_regex.global=(?i)(s|_)?(user|usr|member|admin|guest|login|default|new|current|old|client|server|proxy|sqlserver|my|mysql|mongo|mongodb|db|database|ldap|smtp|email|email(_)?smtp)?(_|\.)?(pass(wd|word|phrase)|secret|senha)
      excludeArgs: >-
        ./**/node_modules/**/*

        ./**/*.min.js

        ./**/dist/**/*
      skipBuild: false
      excludeDisabledProjects: false
      includeTest: false
      includeNodeModules: false
      additionalScanArgs: >-
        -build-label $(FORTIFY_FPR_NAME)

        -build-version $(FORTIFY_FPR_NAME)-$(Build.BuildNumber)
      sensorPool: $(FORTIFY_SENSOR_POOL)
      block: true
      logFile: $(Build.Repository.Name)-$(FORTIFY_NEW_VERSION)-$(Build.BuildNumber).log
      overwrite: true
      quiet: false
      downloadDebugLogs: false
      debugLogFileName: $(Build.Repository.Name)-$(FORTIFY_FPR_NAME)-fortify-debug-logs.zip
  - task: CmdLine@2
    displayName: '[MANTER] SAST: Imprime Log da execução -- Futuro Guardrail'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded())
    continueOnError: True
    enabled: False
    inputs:
      script: >-
        echo Imprimindo log da execução...


        echo "##[command]cat $(System.DefaultWorkingDirectory)/$(Build.Repository.Name)-$(FORTIFY_FPR_NAME)-$(Build.BuildNumber).log"


        cat $(System.DefaultWorkingDirectory)/$(Build.Repository.Name)-$(FORTIFY_FPR_NAME)-$(Build.BuildNumber).log
  - task: CmdLine@2
    displayName: 'SAST: Avalia Bypass do Guardrail'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), eq(variables['guardrail.sec'], 'true'), ne(variables['fortify_disable'], 'gecmi'))
    inputs:
      script: >-
        #!/usr/bin/env bash

        set -euo pipefail


        REF="${BUILD_SOURCEBRANCH:-}"

        COMMIT="${BUILD_SOURCEVERSION:-}"


        HOTFIX_REF_PREFIX='refs/remotes/origin/hotfix/'

        HOTFIX_BRANCH_REGEX='^origin/hotfix/INC[0-9]+$'

        MAX_DISTANCE=0


        echo "================================================="

        echo "##[section]VALIDAÇÃO DO BYPASS GUARDRAIL DE SEGURANÇA:"

        echo "Esta task verifica se a versão candidata pertence a um fluxo de correção emergencial autorizado."

        echo "- O bypass do guardrail somente será autorizado quando:"

        echo "- A pipeline for disparada por uma tag;"

        echo "- O commit da tag estiver em uma branch hotfix válida;"

        echo "- A branch seguir o padrão hotfix/INC<numero>;"

        echo ""

        echo "##[section]IMPORTANTE:"

        echo "- O bypass se aplica somente ao guardrail de segurança;"

        echo "- O fluxo de exceção deve estar vinculado a um incidente;"

        echo "- A utilização deste fluxo é monitorada."

        echo ""

        echo "##[section]Documentação:"

        echo "##[command]https://caixa.sharepoint.com/sites/PPDS/SitePages/Guardrail-de-Seguran%C3%A7a.aspx"

        echo "================================================="

        echo "BUILD_SOURCEBRANCH=${BUILD_SOURCEBRANCH:-N/A}"

        echo "BUILD_SOURCEBRANCHNAME=${BUILD_SOURCEBRANCHNAME:-N/A}"

        echo "BUILD_REASON=${BUILD_REASON:-N/A}"

        echo "BUILD_SOURCEVERSION=${BUILD_SOURCEVERSION:-N/A}"

        echo "MAX_DISTANCE=${MAX_DISTANCE}"

        echo "================================================="


        skip_guardrail=false

        is_hotfix=false


        if [[ "$REF" =~ ^refs/tags/ ]]; then

            TAG="${REF#refs/tags/}"

            echo "[guardrail-bypass] Build disparada por TAG."
            echo "[guardrail-bypass] Tag: ${TAG}"
            echo "[guardrail-bypass] Commit: ${COMMIT:-N/A}"

            if [[ -n "$COMMIT" ]]; then

                # Cada linha: <nome curto> <ref completa> <hash do HEAD da branch>
                HOTFIX_BRANCHES="$(git -c color.ui=never for-each-ref \
                    --contains "$COMMIT" \
                    --format='%(refname:short) %(refname) %(objectname)' \
                    "$HOTFIX_REF_PREFIX" 2>/dev/null | tr -d '\r' || true)"

                echo "-------------------------------------------------"
                echo "DEBUG - Branches hotfix remotas contendo o commit"
                echo "${HOTFIX_BRANCHES:-<nenhuma>}"

                while read -r branch full_ref branch_head; do

                    [[ -z "${branch:-}" ]] && continue

                    if ! [[ "$branch" =~ $HOTFIX_BRANCH_REGEX ]]; then
                        echo "[guardrail-bypass] Ignorada (fora do padrão INC): $branch"
                        continue
                    fi

                    echo "-------------------------------------------------"
                    echo "[guardrail-bypass] Hotfix candidata: $branch"
                    echo "[guardrail-bypass] HEAD da hotfix: ${branch_head}"

                    if [[ "$branch_head" == "$COMMIT" ]]; then
                        # Commit da tag É o HEAD: distância 0, sem percorrer histórico
                        DISTANCE=0
                    else
                        # Ref completa + "--" evita ambiguidade com tags/arquivos;
                        # stderr é capturado para aparecer no log em caso de falha
                        if ! DISTANCE=`git rev-list --count "${COMMIT}..${full_ref}" -- 2>&1`; then
                            echo "[guardrail-bypass] Falha no git rev-list: ${DISTANCE}"
                            continue
                        fi
                    fi

                    if ! [[ "$DISTANCE" =~ ^[0-9]+$ ]]; then
                        echo "[guardrail-bypass] Distância inválida: $DISTANCE . Ignorando."
                        continue
                    fi

                    echo "[guardrail-bypass] Distância até HEAD da hotfix: ${DISTANCE}"

                    if (( DISTANCE <= MAX_DISTANCE )); then
                        echo "[guardrail-bypass] Commit considerado RECENTE."
                        echo "[guardrail-bypass] Bypass autorizado."
                        skip_guardrail=true
                        is_hotfix=true
                        break
                    else
                        echo "[guardrail-bypass] Commit muito antigo para bypass."
                    fi

                done <<< "$HOTFIX_BRANCHES"

            else
                echo "[guardrail-bypass] BUILD_SOURCEVERSION vazio."
                echo "[guardrail-bypass] Mantendo guardrail."
            fi

        else
            echo "[guardrail-bypass] Build não foi disparada por TAG."
            echo "[guardrail-bypass] Mantendo guardrail."
        fi


        echo "##vso[task.setvariable variable=isHotfix]$is_hotfix"


        echo "[guardrail-bypass] RESULTADO FINAL"

        echo "[guardrail-bypass] isHotfix=${is_hotfix}"


        if [[ "$skip_guardrail" == "true" ]]; then
            echo "##vso[task.setvariable variable=guardrail.sec]false"
            echo "[guardrail-bypass] guardrail.sec=false"
        else
            echo "[guardrail-bypass] guardrail.sec preservado"
        fi
  - task: CmdLine@2
    displayName: 'SAST: Guardrail Segurança Cibernética'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), eq(variables['guardrail.sec'], 'true'), ne(variables['fortify_disable'], 'gecmi'))
    inputs:
      script: "command -v docker && docker --version\ncommand -v podman && podman --version\n\necho \"$FORTIFY_REGISTRY_PASSWORD\" | $CONTAINER_ENGINE login default-route-openshift-image-registry.apps.produtos4.caixa \\\n  --username \"$FORTIFY_REGISTRY_USERNAME\" \\\n  --password-stdin\n \necho FORTIFY_APPLICATION: $FORTIFY_APPLICATION\n\necho KEYSTORE_SECUREFILEPATH: $KEYSTORE_SECUREFILEPATH\ncp \"$KEYSTORE_SECUREFILEPATH\" \"$(System.DefaultWorkingDirectory)/keystore.jks\"\n\necho \"##[command]$CONTAINER_ENGINE --version\"\n$CONTAINER_ENGINE --version\n\necho \"##[command]Executando container Fortify...\"\n\n$CONTAINER_ENGINE run --rm \\\n  --security-opt seccomp=unconfined \\\n  --memory=12g \\\n  --memory-swap=12g \\\n  -v $(System.DefaultWorkingDirectory):/src \\\n  -w /src \\\n  -e FORTIFY_APPLICATION \\\n  -e FORTIFY_APP_VERSION=$FORTIFY_NEW_VERSION \\\n  -e FORTIFY_PREVIOUS_VERSION=$FORTIFY_LAST_VERSION \\\n  -e FORTIFY_SESSION \\\n  -e FORTIFY_URL \\\n  -e FORTIFY_CI_TOKEN \\\n  -e FORTIFY_CLIENT_AUTH_TOKEN \\\n  -e FORTIFY_FILTERSET_GUARDRAIL \\\n  -e FORTIFY_SENSOR_VERSION \\\n  -e FORTIFY_SIGLA=$(Build.DefinitionName) \\\n  -e FORTIFY_COMUNIDADE \\\n  -e FORTIFY_LDAP_GROUP \\\n  default-route-openshift-image-registry.apps.produtos4.caixa/fortify/fortify-ci-tools:7.0.0-jdk-17 \\\n  bash -c \"\n    \n    echo Configurando Key Store\n    fcli config truststore set \\\n      --file=/src/keystore.jks \\\n      --password=$KEYSTORE_PWD \\\n      --type=jks\n    \n    echo \\\"Nome do Sistema: \\$FORTIFY_APPLICATION\\\"\n    echo \\\"Nome da Versão: \\$FORTIFY_APP_VERSION\\\"\n    echo \\\"Nome da Versão Anterior: \\$FORTIFY_PREVIOUS_VERSION\\\"\n    \n    echo Login no Fortify...\n    fcli ssc session login \\\n      --ssc-session=\\$FORTIFY_SESSION \\\n      --url=\\$FORTIFY_URL \\\n      --token=\\$FORTIFY_CI_TOKEN \\\n      --client-auth-token=\\$FORTIFY_CLIENT_AUTH_TOKEN \\\n      --socket-timeout=180\n    \n    echo Atualizando aplicação no Fortify...\n    fcli ssc appversion refresh-metrics \\\n      \\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION \\\n      --ssc-session=\\$FORTIFY_SESSION || true\n\n    echo ===== BUSCANDO VULNERABILIDADES CRÍTICAS =====\n    rc=1\n    for tentativa in 1 2 3; do\n    echo \\\"Tentativa \\$tentativa de 3...\\\"\n     timeout -k 30s 2m fcli ssc issue list \\\n        --appversion=\\\"\\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION\\\" \\\n        --filterset=\\\"\\$FORTIFY_FILTERSET_GUARDRAIL\\\" \\\n        --filter='Folder:Critical' \\\n        --output=csv \\\n        --to-file=guardrail-raw.csv \\\n        --ssc-session=\\\"\\$FORTIFY_SESSION\\\" \\\n        --log-level=INFO --log-file=/src/fcli-issue-list.log\n      rc=\\$?\n      [ \\$rc -eq 0 ] && break\n      echo \\\"Tentativa \\$tentativa falhou (rc=\\$rc; 124 = timeout). Aguardando...\\\"\n      sleep 20\n  done\n  if [ \\$rc -ne 0 ]; then \n    echo \\\"ERRO: Falha ao consultar vulnerabilidades no SSC após 3 tentativas.\\\"\n    exit 1\n  fi\n\n    echo\n    echo ===== FILTRANDO ITENS INVÁLIDOS =====\n    \n    grep -v 'Not an Issue' guardrail-raw.csv > guardrail-results.csv || true\n\n    echo Resultado final:\n    cat guardrail-results.csv\n\n    echo\n    echo Logout do Fortify...\n    fcli ssc session logout \\\n      --ssc-session=\\$FORTIFY_SESSION \\\n      --no-revoke-token\n  \" || {\n    echo \"##vso[task.logissue type=error]Falha ao consultar Fortify. Build bloqueado.\"\n    exit 1\n       }\n\necho\necho \"##[debug]Resultado do Guardrail...\"\n\nguardrail_count=$(awk -F',' '\nNR > 1 {\n  for(i=1;i<=NF;i++){\n    if ($i == \"Critical\") {\n      count++\n      break\n    }\n  }\n}\nEND { print count+0 }\n' guardrail-results.csv)\n\nguardrail_count=${guardrail_count:-0}\n\necho \"##[debug]Total de vulnerabilidades críticas válidas: $guardrail_count\"\n\nif [ \"$guardrail_count\" -gt 0 ]; then\n  echo \"##vso[task.logissue type=error]Foram encontradas $guardrail_count vulnerabilidades críticas que violam os padrões de segurança exigidos.\"\n  exit 1\nelse\n  echo \"##[debug]Não foram encontradas vulnerabilidades críticas válidas.\"\nfi\n\necho \"##[debug]Resultado publicado no Fortify: '$FORTIFY_APPLICATION:$FORTIFY_NEW_VERSION'\""
  - task: CmdLine@2
    displayName: 'SAST: Guardrail Segurança Cibernética - Backup'
    condition: and(eq(variables['valida.vec'], 'true'), succeeded(), eq(variables['guardrail.sec'], 'true'), ne(variables['fortify_disable'], 'gecmi'))
    enabled: False
    inputs:
      script: "command -v docker && docker --version\ncommand -v podman && podman --version\n\n#sudo usermod -aG docker $USER\n\n#ls -l /var/run/docker.sock\n\n#set -o errexit\n#set -o pipefail\n#echo Engine selecionado: $CONTAINER_ENGINE\n#echo Versão mais recente: $FORTIFY_NEW_VERSION\n#echo Versão anterior: $FORTIFY_LAST_VERSION\n\necho \"$FORTIFY_REGISTRY_PASSWORD\" | $CONTAINER_ENGINE login default-route-openshift-image-registry.apps.produtos4.caixa --username \"$FORTIFY_REGISTRY_USERNAME\" --password-stdin\n \necho FORTIFY_APPLICATION: $FORTIFY_APPLICATION\necho KEYSTORE_SECUREFILEPATH: $(KEYSTORE_SECUREFILEPATH)\nKEYSTORE_SECUREFILEPATH=$(KEYSTORE_SECUREFILEPATH)\ncp $KEYSTORE_SECUREFILEPATH $(System.DefaultWorkingDirectory)/keystore.jks\n#echo \"##vso[task.setvariable variable=KEYSTORE_SECUREFILEPATH]$KEYSTORE_SECUREFILEPATH\"\n\n# Valida Integridade do JKS (parte 1, fora do container)\n#echo Valida integridade do certificado FORA do container\n#echo \"##[command]md5sum /etc/pki/ca-trust/source/anchors/keystore-ssc24.jks\"\n#md5sum /etc/pki/ca-trust/source/anchors/keystore-ssc24.jks\n#echo \"##[command]md5sum $KEYSTORE_SECUREFILEPATH\"\n#md5sum $KEYSTORE_SECUREFILEPATH\n#echo \"##[command]md5sum $(System.DefaultWorkingDirectory)/keystore.jks\"\n#md5sum $(System.DefaultWorkingDirectory)/keystore.jks\n\n# Executa o container Fortify com as variáveis herdadas do ambiente\necho \"##[command]$CONTAINER_ENGINE --version\"\n$CONTAINER_ENGINE --version\necho \"##[command]$CONTAINER_ENGINE run -v $(System.DefaultWorkingDirectory):/src default-route-openshift-image-registry.apps.produtos4.caixa/fortify/fortify-ci-tools:7.0.0-jdk-17\"\n$CONTAINER_ENGINE run --rm \\\n  --security-opt seccomp=unconfined \\\n  --memory=12g \\\n  --memory-swap=12g \\\n  -v $(System.DefaultWorkingDirectory):/src \\\n  -w /src \\\n  -e FORTIFY_APPLICATION \\\n  -e FORTIFY_APP_VERSION=$FORTIFY_NEW_VERSION \\\n  -e FORTIFY_PREVIOUS_VERSION=$FORTIFY_LAST_VERSION \\\n  -e FORTIFY_SESSION \\\n  -e FORTIFY_URL \\\n  -e FORTIFY_CI_TOKEN \\\n  -e FORTIFY_CLIENT_AUTH_TOKEN \\\n  -e FORTIFY_FILTERSET_GUARDRAIL \\\n  -e FORTIFY_SENSOR_VERSION \\\n  -e FORTIFY_SIGLA=$(Build.DefinitionName) \\\n  -e FORTIFY_COMUNIDADE \\\n  -e FORTIFY_LDAP_GROUP \\\n  default-route-openshift-image-registry.apps.produtos4.caixa/fortify/fortify-ci-tools:7.0.0-jdk-17 \\\n  bash -c \"\n    \n    #echo Valida integridade do certificado DENTRO do container\n    #echo md5sum /src/keystore.jks\n    #md5sum /src/keystore.jks\n    \n    echo Configurando Key Store\n    fcli config truststore set \\\n      --file=/src/keystore.jks \\\n      --password=$KEYSTORE_PWD \\\n      --type=jks\n    \n    echo \\\"Nome do Sistema: \\$FORTIFY_APPLICATION\\\"\n    \n    echo \\\"Nome da Versão: \\$FORTIFY_APP_VERSION\\\"\n    \n    echo \\\"Nome da Versão Anterior: \\$FORTIFY_PREVIOUS_VERSION\\\"\n    \n    echo Login no Fortify...\n    fcli ssc session login \\\n      --ssc-session=\\$FORTIFY_SESSION \\\n      --url=\\$FORTIFY_URL \\\n      --token=\\$FORTIFY_CI_TOKEN \\\n      --client-auth-token=\\$FORTIFY_CLIENT_AUTH_TOKEN \\\n    \n    \n    echo Atualizando aplicação no Fortify...\n    fcli ssc appversion refresh-metrics \\\n      \\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION \\\n      --ssc-session=\\$FORTIFY_SESSION || true\n    \n    echo Consultando número de vulnerabilidades da aplicação...\n    fcli ssc issue count \\\n      --appversion=\\$FORTIFY_APPLICATION:\\$FORTIFY_APP_VERSION \\\n      --by=FOLDER \\\n      --filterset=\\$FORTIFY_FILTERSET_GUARDRAIL \\\n      --filter='Folder:Critical' \\\n      --output=csv \\\n      --to-file=guardrail-results.csv \\\n      --ssc-session=\\$FORTIFY_SESSION || true\n    \n    cat guardrail-results.csv\n    \n    echo\n    echo Logout do Fortify...\n    fcli ssc session logout \\\n      --ssc-session=\\$FORTIFY_SESSION \\\n      --no-revoke-token\n  \"\n\necho \"##[debug]Resultado do Guardrail...\"\nguardrail_results=false\nwhile IFS=',' read -r id cleanName name totalCount auditedCount visibleCount; do\n  if [ \"$cleanName\" == \"Critical\" ] && [ \"$totalCount\" -gt 0 ]; then\n    guardrail_results=true\n    guardrail_count=$totalCount\n  fi\ndone < guardrail-results.csv\nif [ $guardrail_results == \"true\" ]; then\n  echo \"##vso[task.logissue type=error]Foram encontradas $guardrail_count vulnerabilidades que violam os padrões de segurança exigidos.\"\n  exit 1\nelse\n  echo \"##[debug]Não foram encontradas vulnerabilidades que violam os padrões de segurança exigidos.\"\nfi\necho \"##[debug]Seu resultado está publicado no Fortify sob a Versão de nome: ' $FORTIFY_APPLICATION:$FORTIFY_NEW_VERSION '\""
  - task: Bash@3
    displayName: md5
    inputs:
      targetType: inline
      script: >
        pwd

        ls $(project.file)

        HASH=`md5sum -b $(project.file)`

        SHA=`sha1sum -b $(project.file)`

        echo "MD5-BUILD: $HASH"

        echo "SHA1-BUILD: $SHA"
  - task: Bash@3
    displayName: Publica no Nexus
    inputs:
      targetType: inline
      script: >-
        cd $(Build.SourcesDirectory)


        p_group=$(project.group) || true

        p_name=$(project.name)

        p_version=$(project.version)

        p_extension=$(project.extension)


        p_group=`[ -z "$p_group" ] && echo ""br.gov.caixa.$p_name"" || echo "$p_group"`


        echo VEC $(valida.vec)

        if [ $(valida.vec) = true ];then

        p_version=$BUILD_SOURCEBRANCHNAME

        NEXUS_URL=$(NEXUS_URL_ANGULAR_RELEASE)

        else

        p_version=${p_version^^}

        p_version=${p_version/-SNAPSHOT/}-SNAPSHOT

        #definido por GECPA em Nov/2025 que todo artefato não release candidate deve conter sufixo -SNAPSHOT

        echo "##vso[build.updatebuildnumber]"$p_version""

        NEXUS_URL=$(NEXUS_URL_ANGULAR_SNAPSHOT)

        fi


        echo "##[section]=== Info do pacote ==="

        echo "##[section]groupid= $p_group"

        echo "##[section]artifact= $p_name"

        echo "##[section]version= $p_version"

        echo "========================================================="


        LIB="$(library)"

        # quando for uma pipeline do tipo lib o pom original do projeto precisa subir junto

        if [ "${LIB:-}" = "true" ] || [ "${LIB:-}" = "TRUE" ]; then


        echo -Dversion.app=$(Build.BuildNumber) -Dnexus_interno_user=$(nexus_interno_user) -Dnexus_interno_pass=$(nexus_interno_pass) -DgroupId="${p_group}" -DartifactId="${p_name}" -Dversion="${p_version}" -Dpackaging="${p_extension}" -Dfile="$(project.file)" -DpomFile="$(Build.SourcesDirectory)/$(POM_PATH)" -DrepositoryId=$(NEXUS_REPOSITORY_ID) -DgeneratePom=false -Durl=${NEXUS_URL} -Drevision="${p_version}"


        /opt/apache-maven/apache-maven-3.8.5/bin/mvn deploy:deploy-file -Dversion.app=$(Build.BuildNumber) -Dnexus_interno_user=$(nexus_interno_user) -Dnexus_interno_pass=$(nexus_interno_pass) -DgroupId="${p_group}" -DartifactId="${p_name}" -Dversion="${p_version}" -Dpackaging="${p_extension}" -Dfile="$(project.file)" -DpomFile="$(Build.SourcesDirectory)/$(POM_PATH)" -DrepositoryId=$(NEXUS_REPOSITORY_ID) -DgeneratePom=false -Durl=${NEXUS_URL} -Drevision="${p_version}"


        else


        echo -Dversion.app=$(Build.BuildNumber) -DgroupId="${p_group}" -DartifactId="${p_name}" -Dversion="${p_version}" -Dpackaging="${p_extension}" -Dfile="$(project.file)" -DrepositoryId=$(NEXUS_REPOSITORY_ID) -DgeneratePom=true -Durl=${NEXUS_URL}


        /opt/apache-maven/apache-maven-3.8.5/bin/mvn deploy:deploy-file -Dversion.app=$(Build.BuildNumber) -Dnexus_interno_user=$(nexus_interno_user) -Dnexus_interno_pass=$(nexus_interno_pass) -DgroupId="${p_group}" -DartifactId="${p_name}" -Dversion="${p_version}" -Dpackaging="${p_extension}" -Dfile="$(project.file)" -DrepositoryId=$(NEXUS_REPOSITORY_ID) -DgeneratePom=true -Durl=${NEXUS_URL} -Drevision="${p_version}"


        fi


        echo "##vso[task.setvariable variable=project.uploaded;]true"
  - task: Bash@3
    displayName: Publica no Nexus old
    enabled: False
    inputs:
      targetType: inline
      script: >-
        cd $(Build.SourcesDirectory)


        p_group=$(project.group) || true

        p_name=$(project.name)

        p_version=$(project.version)

        p_extension=$(project.extension)


        p_group=`[ -z "$p_group" ] && echo ""br.gov.caixa.$p_name"" || echo "$p_group"`



        if [ $(project.release) = true ]; then

        NEXUS_URL=$(NEXUS_URL_ANGULAR_RELEASE)

        else

        NEXUS_URL=$(NEXUS_URL_ANGULAR_SNAPSHOT)

        p_version=${p_version/-SNAPSHOT/}-SNAPSHOT

        fi


        echo $(valida.vec)

        if [ $(valida.vec) = true ];then

        p_version=$BUILD_SOURCEBRANCHNAME

        NEXUS_URL=$(NEXUS_URL_ANGULAR_RELEASE)

        fi


        echo "##[section]info: -Dversion.app=$(Build.BuildNumber) -DgroupId="${p_group}" -DartifactId="${p_name}" -Dversion="${p_version}" -Dpackaging="${p_extension}" -Dfile="$(project.file)" -DrepositoryId=$(NEXUS_REPOSITORY_ID) -DgeneratePom=true -Durl=${NEXUS_URL}"


        /opt/apache-maven/apache-maven-3.8.5/bin/mvn deploy:deploy-file -Dversion.app=$(Build.BuildNumber) -Dnexus_interno_user=$(nexus_interno_user) -Dnexus_interno_pass=$(nexus_interno_pass) -DgroupId="${p_group}" -DartifactId="${p_name}" -Dversion="${p_version}" -Dpackaging="${p_extension}" -Dfile="$(project.file)" -DrepositoryId=$(NEXUS_REPOSITORY_ID) -DgeneratePom=true -Durl=${NEXUS_URL} -Drevision="${p_version}"



        echo "##vso[task.setvariable variable=project.uploaded;]true"
      failOnStderr: true
  - task: Bash@3
    displayName: Bash Script
    enabled: False
    inputs:
      targetType: inline
      script: exit 1
  - task: Bash@3
    displayName: Convertendo Minúsculo e Definindo nome Projeto/Repo
    inputs:
      targetType: inline
      script: >-
        #!/bin/bash



        GitRepositoryName=$(REPO_FINAL_NAME)


        DefinitionName=$(Build.DefinitionName)


        if [ "$GitRepositoryName" == "repository" ] ; then


        RepositoryName=`(echo "$DefinitionName" | tr '[[:upper:]]' '[[:lower:]]')`

        echo "##vso[task.setvariable variable=REPOSITORIO;]$RepositoryName"

        ProjectName=`(echo "$DefinitionName" | tr '[[:upper:]]' '[[:lower:]]' | cut -f1 -d"-")`

        echo "##vso[task.setvariable variable=PROJETO;]$ProjectName"


        else


        RepositoryName=`(echo "$GitRepositoryName" | tr '[[:upper:]]' '[[:lower:]]')`

        echo "##vso[task.setvariable variable=REPOSITORIO;]$RepositoryName"

        ProjectName=`(echo "$GitRepositoryName" | tr '[[:upper:]]' '[[:lower:]]' | cut -f1 -d"-")`

        echo "##vso[task.setvariable variable=PROJETO;]$ProjectName"


        fi
  - task: Bash@3
    displayName: Corrigindo Codificação Arquivos dos2unix
    inputs:
      targetType: inline
      script: >-
        PASTA="$(Build.SourcesDirectory)/.s2i/bin"


        shopt -s nullglob

        arquivos=( "$PASTA"/* )


        if (( ${#arquivos[@]} == 0 )); then
          echo "##[error] Nenhum arquivo em .s2i/bin/ para converter (dos2unix não executado)."
          echo "##[error] Se tratam de arquivos obrigatórios para configuração do ambiente $(nome_imagem)"
          echo "##[error] Em caso de dúvidas acesse o link abaixo para exemplo com projetos angular (seção 'Pré-requisito: Criar a pasta .s2i/bin no repositório da aplicação') ou entre em contato com a CESTI36"
          echo "##[error] https://devops.caixa/projetos/Caixa/_wiki/wikis/Caixa.wiki/6/Pipeline-Angular-Conteiner?anchor=1.-crie-a-pasta-.s2i/bin-e-crie-os-arquivos-%22run%22%2C-%22assemble%22.-voc%C3%AA-pode-encontrar-os-modelos-dos-arquivos-no-reposit%C3%B3rio-%22sample-angular%22."
          exit 1
        fi


        dos2unix "${arquivos[@]}"
  - task: Bash@3
    displayName: Copiando S2I para StagingDirectory
    inputs:
      targetType: inline
      script: "#!/bin/bash\n\necho \"Artefato que será enviado para Imagem Docker:\" $(project.file)\n\nmv -vf $(project.file) $(Build.StagingDirectory)/\nmv -vf $(Build.SourcesDirectory)/.s2i $(Build.StagingDirectory)/\n\nmv -vf $(Build.StagingDirectory)/*.$(project.extension) $(Build.StagingDirectory)/$(REPOSITORIO).$(project.extension)\n\nif [[ -f $(Build.SourcesDirectory)/jmx_prometheus.yaml ]]\n then \n   mv -vf $(Build.SourcesDirectory)/jmx_prometheus.yaml $(Build.StagingDirectory)/\nfi\n\nif [[ -f $(Build.SourcesDirectory)/cli-offline.sh ]]\n then \n   mv -vf $(Build.SourcesDirectory)/cli-offline.sh $(Build.StagingDirectory)/\nfi\n\nif [[ -f $(Build.SourcesDirectory)/module.xml ]]\n then \n   mv -vf $(Build.SourcesDirectory)/module.xml $(Build.StagingDirectory)/\nfi"
  - task: Bash@3
    displayName: Login Cluster
    inputs:
      targetType: inline
      script: >-
        #!/bin/bash

        set -x


        if echo "$(SITE)" | egrep -q "^(okd4|ocp)"

        then

        oc login $(OKD_API_REGISTRY) --insecure-skip-tls-verify=true --token=$(OKD_TOKEN_REGISTRY) > /dev/null

        else

        oc login $(OKD_API) --insecure-skip-tls-verify=true --token=$(OKD_TOKEN) > /dev/null

        fi
  - task: Bash@3
    displayName: 'Login OKD-4 '
    condition: and(succeeded(), eq(variables['SITE'], 'okd4_nprd'))
    enabled: False
    inputs:
      targetType: inline
      script: >-
        oc login $(OKD_4_API) --insecure-skip-tls-verify=true -u $(OKD_4_USER_SERVICE) -p $(OKD_4_TOKEN) > /dev/null



        xxxxx
  - task: Bash@3
    displayName: Criando Projeto Build
    inputs:
      targetType: inline
      script: >-
        oc get project $(ProjetoBuild)

        if [ "$?" -ne "0" ]; then
         oc new-project $(ProjetoBuild)
        fi
  - task: Bash@3
    displayName: Criando novo BuildConfig
    inputs:
      targetType: inline
      script: >-
        #!/bin/bash

        set -x


        if echo "$(SITE)" | egrep -q "^(okd4|ocp)"

        then

        buildconfig=$(REPOSITORIO)

        else

        buildconfig=$(REPOSITORIO)-esteiras

        fi


        oc get imagestreams/$buildconfig -n $(ProjetoBuild)

        if [ "$?" -ne "0" ]; then

        oc new-app $(TemplateBuild_OKD) --labels=app=$buildconfig -p NAME=$buildconfig -p VERSION=$(tag_imagem) -n $(ProjetoBuild)

        fi
  - task: Bash@3
    displayName: Criando novo BuildConfig - OKD4
    condition: and(succeeded(), eq(variables['SITE'], 'okd4_nprd'))
    enabled: False
    inputs:
      targetType: inline
      script: >-
        #!/bin/bash


        oc get imagestreams/$(REPOSITORIO) -n $(ProjetoBuild)

        if [ "$?" -ne "0" ]; then

        oc new-app $(TemplateBuild_OKD) --labels=app=$(REPOSITORIO) -p NAME=$(REPOSITORIO) -p VERSION=$(TemplateVersaoProduto_OKD) -n $(ProjetoBuild)

        fi
  - task: Bash@3
    displayName: Atualizando valores BuildImage e TagImage
    inputs:
      targetType: inline
      script: >-
        #!/bin/bash

        if echo "$(SITE)" | egrep -q "^(okd4|ocp)"

        then

        buildconfig=$(REPOSITORIO)

        else

        buildconfig=$(REPOSITORIO)-esteiras

        fi


        oc patch bc $buildconfig --patch '{"spec": {"strategy": {"sourceStrategy": {"from": {"name": "$(nome_imagem):$(tag_imagem)"}}}}}' -n $(ProjetoBuild)
  - task: Bash@3
    displayName: Atualizando valores BuildImage e TagImage - OKD4
    condition: and(succeeded(), eq(variables['SITE'], 'okd4_nprd'))
    enabled: False
    inputs:
      targetType: inline
      script: >-
        #!/bin/bash


        oc patch bc $(REPOSITORIO) --patch '{"spec": {"strategy": {"sourceStrategy": {"from": {"name": "$(ImageBuild_OKD):$(TemplateVersaoProduto_OKD)"}}}}}' -n $(ProjetoBuild)
  - task: Bash@3
    displayName: Executando Build S2I Binary
    retryCountOnTaskFailure: 1
    timeoutInMinutes: 20
    inputs:
      targetType: inline
      script: >-
        #!/bin/bash

        set -x


        if echo "$(SITE)" | egrep -q "^(okd4|ocp)"

        then

        buildconfig=$(REPOSITORIO)

        else

        buildconfig=$(REPOSITORIO)-esteiras

        fi


        #Executando Build

        oc start-build $buildconfig --from-dir="$(Build.StagingDirectory)" --follow --wait=true -n $(ProjetoBuild) -v=5
  - task: Bash@3
    displayName: Executando Build S2I Binary - OKD4
    condition: and(succeeded(), eq(variables['SITE'], 'okd4_nprd'))
    enabled: False
    timeoutInMinutes: 20
    inputs:
      targetType: inline
      script: oc start-build $(REPOSITORIO) --from-dir="$(Build.StagingDirectory)" --follow --wait=true -n $(ProjetoBuild)  -v=5
  - task: Bash@3
    displayName: Criando Image Tag - Build.BuildNumber
    inputs:
      targetType: inline
      script: >-
        #!/bin/bash

        set -x


        if echo "$(SITE)" | egrep -q "^(okd4|ocp)"

        then

        buildconfig=$(REPOSITORIO)

        else

        buildconfig=$(REPOSITORIO)-esteiras

        fi


        oc tag $(ProjetoBuild)/$buildconfig:latest $(ProjetoBuild)/$buildconfig:$(Build.BuildNumber)
  - task: Bash@3
    displayName: Criando Image Tag - Build.BuildNumber - OKD4
    condition: and(succeeded(), eq(variables['SITE'], 'okd4_nprd'))
    enabled: False
    inputs:
      targetType: inline
      script: oc tag $(ProjetoBuild)/$(REPOSITORIO):latest $(ProjetoBuild)/$(REPOSITORIO):$(Build.BuildNumber)
  - task: Bash@3
    displayName: Leitura de variáveis de ambiente
    inputs:
      targetType: inline
      script: env
      noProfile: true
      noRc: true
  - task: Bash@3
    displayName: Cadastrar imagem no Infradevops
    enabled: False
    inputs:
      targetType: inline
      script: "if echo \"$(SITE)\" | egrep -q \"^okd4\"\nthen\nOPENSHIFT_API_URL=$(OKD_API_REGISTRY)\nelif echo \"$(SITE)\" | egrep -q \"^ocp\"\nthen\nOPENSHIFT_API_URL=$(OKD_API_REGISTRY)\nelif echo \"$(SITE)\" | egrep -q \"okd4_nprdz\"\nthen\nOPENSHIFT_API_URL=$(OKD_4_API)\nelse\nOPENSHIFT_API_URL=$(OKD_API)\nfi\nIMAGE_NAMESPACE=openshift\nif [  $(nome_imagem)  ]\nthen\nIMAGE_NAME=$(nome_imagem)\nelse\nIMAGE_NAME=$(ImageBuild_OKD)\nfi\nif [  $(tag_imagem)  ]\nthen\nIMAGE_TAG=$(tag_imagem)\nelse\nIMAGE_TAG=$(TemplateVersaoProduto_OKD)\nfi\necho \"IMAGE_NAME: \" $IMAGE_NAME\necho \"IMAGE_TAG: \" $IMAGE_TAG\nTOKEN=`oc whoami -t`\n# ObtÃ©m a lista de imagens \nif echo \"$(SITE)\" | egrep -q \"^(okd4|ocp)\"\nthen\nimagens=`curl -s -k -H \"Authorization: Bearer $TOKEN\" https://$OPENSHIFT_API_URL/apis/image.openshift.io/v1/namespaces/$IMAGE_NAMESPACE/imagestreams/$IMAGE_NAME`\nelse\nimagens=`curl -s -k -H \"Authorization: Bearer $TOKEN\" $OPENSHIFT_API_URL/apis/image.openshift.io/v1/namespaces/$IMAGE_NAMESPACE/imagestreams/$IMAGE_NAME`\nfi\n# Extrai os nomes da imagens \nnomes_imagens=`echo $imagens | jq -r --arg nome \"$IMAGE_TAG\" '.status.tags[] | select(.tag == $nome) | .items[].image'`\n# Exibe os nomes das imagens \nif [ ! -z \"$nomes_imagens\" ]; then\necho \"Hash da imagem no OpenShift:\" \nIMAGE_HASH=${nomes_imagens#\"$IMAGE_NAME@\"}\necho $IMAGE_HASH\nfi\n\nif [ ! -z \"$SITE\" ] && [ ! -z \"$IMAGE_HASH\" ]\nthen\nimagens=`curl -s -k -H \"Authorization: Bearer $TOKEN\" https://$OPENSHIFT_API_URL/apis/image.openshift.io/v1/images/$IMAGE_HASH`\nelse\nimagens=`curl -s -k -H \"Authorization: Bearer $TOKEN\" $OPENSHIFT_API_URL/apis/image.openshift.io/v1/images/$IMAGE_HASH`\nfi\n\nif [ ! -z \\\"$IMAGE_HASH\\\" ]; \nthen\n# Extrai os nomes das imagens\nenviroment=`echo $imagens | jq -r '.dockerImageMetadata.Config.Env'`\n\n# Remova os colchetes externos \njson_string=${enviroment:1:-1} \n# Substitua as vÃƒÂ­rgulas por quebras de linha \njson_string=`echo \"$json_string\" | tr ',' '\\n'` \n# Use awk para imprimir chave e valor sem aspas duplas, removendo espaÃƒÂ§os das chaves \njson_output=`echo \"$json_string\" | awk -F'=' '{gsub(/\"/, \"\", $1); gsub(/\"/, \"\", $2); gsub(/ /, \"\", $1); print \"\\\"\"$1\"\\\":\\\"\"$2\"\\\",\"}'`\n# Remova a vÃƒÂ­rgula extra do final \njson_output=${json_output%,} \n# Crie um objeto JSON \njson=\"{ $json_output }\" \n# Use jq para formatar a string JSON \nif [ $IMAGE_NAME = \"jboss-eap\" ];\nthen\nformatted_json=`echo \"$json\" | jq '.' | jq 'del(.\"\")' | jq 'del(.TZ)' | jq 'del(.JBOSS_PATCH_VERSION)' | jq 'del(.ADMIN_USERNAME)' | jq 'del(.ADMIN_PASSWORD)' | jq 'del(.NEXUS_URL)' | jq 'del(.JAVA_HOME)' | jq 'del(.PATH)' | jq 'del(.container)' | jq 'del(.HOME)' | jq 'del(.JBOSS_HOME)'`\nelif [ $IMAGE_NAME = \"nginx\" ];\nthen\nformatted_json=`echo \"$json\" | jq '.' | jq 'del(.\"\")' | jq 'del(.DESCRIPTION)'  | jq 'del(.PATH)'  | jq 'del(.CONTAINER)'  | jq 'del(.SUMMARY)'  | jq 'del(.SMTP)'  | jq 'del(.POP3andIMAPprotocols)'  | jq 'del(.withastrongfocusonhighconcurrency)' | jq 'del(.STI_SCRIPTS_URL)'  | jq 'del(.STI_SCRIPTS_PATH)'  | jq 'del(.APP_ROOT)'  | jq 'del(.BASH_ENV)' | jq 'del(.ENV)' | jq 'del(.PROMPT_COMMAND)' | jq 'del(.NGINX_SHORT_VER)' | jq 'del(.VERSION)' | jq 'del(.NGINX_CONFIGURATION_PATH)' | jq 'del(.NGINX_CONF_PATH)' | jq 'del(.NGINX_DEFAULT_CONF_PATH)' | jq 'del(.NGINX_CONTAINER_SCRIPTS_PATH)' | jq 'del(.NGINX_APP_ROOT)'`\nelse\nformatted_json=`echo \"$json\" | jq '.' | jq 'del(.\"\")'`\nfi\n\n# Imprima o resultado \necho \"$formatted_json\"\n\ncurl -v  --location --request PUT 'http://infradevops-novoportal-backend-des-esteiras.nprd2.caixa/api.php?acao=cadastrarImagem' \\\n--header 'Content-Type: application/json' \\\n--data \"{\n    \\\"nome\\\":\\\"$IMAGE_NAME\\\",\n    \\\"status\\\":\\\"ativo\\\",\n    \\\"detalhamento\\\":$formatted_json,\n    \\\"plataforma\\\":\\\"container\\\",\n    \\\"produto\\\":\\\"\\\",\n    \\\"versao\\\":\\\"$IMAGE_TAG\\\"\n    }\"\n\n\nelse\n\necho \"Imagem não encontrada\"\n\nfi"
      noProfile: true
      noRc: true
  - task: Bash@3
    displayName: Gera dados infradevops
    continueOnError: True
    inputs:
      targetType: inline
      script: >-
        if echo "$(SITE)" | egrep -q "^okd4"
            then
                OPENSHIFT_API_URL=$(OKD_API_REGISTRY)
            elif echo "$(SITE)" | egrep -q "^ocp"
            then
                OPENSHIFT_API_URL=$(OKD_API_REGISTRY)
            elif echo "$(SITE)" | egrep -q "okd4_nprdz"
            then
                OPENSHIFT_API_URL=$(OKD_4_API)
            else
                OPENSHIFT_API_URL=$(OKD_API)
        fi

        IMAGE_NAMESPACE=openshift

        if [  $(nome_imagem)  ]
            then
                IMAGE_NAME=$(nome_imagem)
            else
                IMAGE_NAME=$(ImageBuild_OKD)
        fi

        if [  $(tag_imagem)  ]
            then
                IMAGE_TAG=$(tag_imagem)
            else
                IMAGE_TAG=$(TemplateVersaoProduto_OKD)
        fi

        echo "IMAGE_NAME: " $IMAGE_NAME

        echo "IMAGE_TAG: " $IMAGE_TAG


        TOKEN=`oc whoami -t`

        echo "##vso[task.setvariable variable=IMAGE_NAME;]$IMAGE_NAME"

        echo "##vso[task.setvariable variable=IMAGE_TAG;]$IMAGE_TAG"

        echo "##vso[task.setvariable variable=OPENSHIFT_API_URL;]$OPENSHIFT_API_URL"

        echo "##vso[task.setvariable variable=TOKEN;]$TOKEN"

        echo "##vso[task.setvariable variable=IMAGE_NAMESPACE;]$IMAGE_NAMESPACE"
      noProfile: true
      noRc: true
  - task: Bash@3
    displayName: Cadastrar imagem no Infradevops
    continueOnError: True
    timeoutInMinutes: 1
    inputs:
      targetType: inline
      script: "# ObtÃ©m a lista de imagens \nif echo \"$(SITE)\" | egrep -q \"^(okd4|ocp)\"\n    then\n        imagens=`curl -s -k -H \"Authorization: Bearer $(TOKEN)\" https://$(OPENSHIFT_API_URL)/apis/image.openshift.io/v1/namespaces/$(IMAGE_NAMESPACE)/imagestreams/$(IMAGE_NAME)`\n    else\n        imagens=`curl -s -k -H \"Authorization: Bearer $(TOKEN)\" $(OPENSHIFT_API_URL)/apis/image.openshift.io/v1/namespaces/$(IMAGE_NAMESPACE)/imagestreams/$(IMAGE_NAME)`\nfi\n# Extrai os nomes da imagens \nnomes_imagens=`echo $imagens | jq -r --arg nome \"$(IMAGE_TAG)\" '.status.tags[] | select(.tag == $nome) | .items | sort_by(.created) | .[0].image' `\n#nomes_imagens=`echo $imagens | jq -r --arg nome \"$IMAGE_TAG\" '.status.tags[] | select(.tag == $nome) | .items[].image'`\n# Exibe os nomes das imagens\nif [ ! -z \"$nomes_imagens\" ]; then\n        echo \"Hash da imagem no OpenShift:\" \n        IMAGE_HASH=${nomes_imagens#\"$(IMAGE_NAME)@\"}\n        echo $IMAGE_HASH\n    else\n        echo \"Imagem não encontrada\"\n        return 1 2>/dev/null\n        exit 1\nfi\n\necho $IMAGE_HASH\nif [ ! -z \"$(SITE)\" ] && [ ! -z \"$IMAGE_HASH\" ]\n    then\n        imagens=`curl -s -k -H \"Authorization: Bearer $(TOKEN)\" https://$(OPENSHIFT_API_URL)/apis/image.openshift.io/v1/images/$IMAGE_HASH`\n    else\n        imagens=`curl -s -k -H \"Authorization: Bearer $(TOKEN)\" $(OPENSHIFT_API_URL)/apis/image.openshift.io/v1/images/$IMAGE_HASH`\nfi\n\nif [ ! -z \\\"$IMAGE_HASH\\\" ]; \n    then\n    # Extrai os nomes das imagens\n    enviroment=`echo $imagens | jq -r '.dockerImageMetadata.Config.Env'`\n\n    # Remova os colchetes externos \n    json_string=${enviroment:1:-1} \n    # Substitua as vÃƒÂ­rgulas por quebras de linha \n    json_string=`echo \"$json_string\" | tr ',' '\\n'` \n    # Use awk para imprimir chave e valor sem aspas duplas, removendo espaÃƒÂ§os das chaves \n    json_output=`echo \"$json_string\" | awk -F'=' '{gsub(/\"/, \"\", $1); gsub(/\"/, \"\", $2); gsub(/ /, \"\", $1); print \"\\\"\"$1\"\\\":\\\"\"$2\"\\\",\"}'`\n    # Remova a vÃƒÂ­rgula extra do final \n    json_output=${json_output%,} \n    # Crie um objeto JSON \n    json=\"{ $json_output }\" \nfi\n\n# Use jq para formatar a string JSON \nif [ $(IMAGE_NAME) = \"jboss-eap\" ];\n    then\n        formatted_json=`echo \"$json\" | jq '.' | jq '{JBOSS_VERSION: .JBOSS_VERSION, JAVA_VERSION: .JAVA_VERSION, JAVA_VENDOR: .JAVA_VENDOR, JAVA_HOME: .JAVA_HOME, MAVEN_VERSION: .MAVEN_VERSION}'`\n    elif [ $(IMAGE_NAME) = \"dotnet-runtime\" ];\n    then\n        formatted_json=`echo \"$json\" | jq '.' | jq '{DOTNET_APP_PATH: .DOTNET_APP_PATH, DOTNET_DATA_PATH: .DOTNET_DATA_PATH, DOTNET_CORE_VERSION: .DOTNET_CORE_VERSION, DOTNET_FRAMEWORK: .DOTNET_FRAMEWORK, DOTNET_SSL_CERT_DIR: .DOTNET_SSL_CERT_DIR}'`\n    elif [ $(IMAGE_NAME) = \"quarkus-java-binary-s2i\" ];\n    then\n        formatted_json=`echo \"$json\" | jq '.' | jq '{JAVA_VERSION: .JAVA_VERSION, JAVA_VENDOR: .JAVA_VENDOR, JAVA_HOME: .JAVA_HOME, LANG: .LANG}'`\n    elif [ $(IMAGE_NAME) = \"nginx\" ];\n    then\n        formatted_json=`echo \"$json\" | jq '.' | jq '{HOME: .HOME, NGINX_VERSION: .NGINX_VERSION, NGINX_LOG_PATH: .NGINX_LOG_PATH, NGINX_PERL_MODULE_PATH: .NGINX_PERL_MODULE_PATH, TZ: .TZ}'`\n    elif [ $(IMAGE_NAME) = \"spring-boot\" ];\n    then\n        formatted_json=`echo \"$json\" | jq '.' | jq '{JAVA_VERSION: .JAVA_VERSION, JAVA_VENDOR: .JAVA_VENDOR, JAVA_HOME: .JAVA_HOME, LANG: .LANG}'`\n    elif [ $(IMAGE_NAME) = \"php\" ];\n    then\n        formatted_json=`echo \"$json\" | jq '.' | jq '{PHP_VERSION: .PHP_VERSION, PHP_VER_SHORT: .PHP_VER_SHORT, APP_DATA: .APP_DATA, PHP_DEFAULT_INCLUDE_PATH: .PHP_DEFAULT_INCLUDE_PATH, PHP_SYSCONF_PATH: .PHP_SYSCONF_PATH, PHP_HTTPD_CONF_FILE: .PHP_HTTPD_CONF_FILE}'`\n    else\n        formatted_json=`echo \"$json\" | jq '.' | jq 'del(.\"\")'`\nfi\n# Imprima o resultado \necho \"Resultado JSON\"\necho \"$formatted_json\"\ncurl -v  --location --request PUT 'http://infradevops-api.apl.caixa/api.php?acao=cadastrarImagem' \\\n--header 'Content-Type: application/json' \\\n--data \"{\n    \\\"nome\\\":\\\"$(IMAGE_NAME)\\\",\n    \\\"status\\\":\\\"ativo\\\",\n    \\\"detalhamento\\\":$formatted_json,\n    \\\"plataforma\\\":\\\"container\\\",\n    \\\"produto\\\":\\\"\\\",\n    \\\"versao\\\":\\\"$(IMAGE_TAG)\\\"\n    }\""
      noProfile: true
      noRc: true
  - task: Bash@3
    displayName: Realizando Logout Cluster
    condition: always()
    inputs:
      targetType: inline
      script: oc logout
  - task: Bash@3
    displayName: Remove Binario Nexus em Caso de Falha
    condition: or(eq(variables['Agent.JobStatus'], 'Canceled'),eq(variables['Agent.JobStatus'], 'Failed'))
    inputs:
      targetType: inline
      script: >+
        set -x



        USER=$(nexus_interno_user)

        PASSWORD=$(nexus_interno_pass)


        repository=$(project.repository)

        group=$(project.group)

        name=$(project.name)

        version=$(project.version)

        uploaded=$(project.uploaded)



        if [[ ! -z "$uploaded" ]] && [ $uploaded = true ]; then


        response=`curl -X GET --user "$USER:$PASSWORD" "http://binario.caixa:8081/service/rest/v1/search?repository=$repository&group=$group&name=$name&version=$version" -H "accept: application/json"`


        echo "${response}" | jq '.items[0].assets[].id'


        jq_response=`echo "${response}" | jq '.items[0].assets[].id'`


        for row in $jq_response ; do
             temp="${row%\"}"
             temp="${temp#\"}"
             echo "$temp"
             curl -X DELETE  --user "$USER:$PASSWORD" "http://binario.caixa:8081/service/rest/v1/assets/$temp" -H "accept: application/json"
        done


        fi


...
