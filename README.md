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
SIDSC

SIDSC-storybook-v21

Tasks

Variables

Triggers

Options

History
Angular-Build
Task version
6.*
Display name
Angular-Build 
AZPAT
$(AZPAT)
FORTIFY_API
$(FORTIFY_API)
FORTIFY_APITOKEN
$(FORTIFY_APITOKEN)
FORTIFY_BUILD
$(FORTIFY_BUILD)
FORTIFY_CI_TOKEN
$(FORTIFY_CI_TOKEN)
FORTIFY_CLIENT_AUTH_TOKEN
$(FORTIFY_CLIENT_AUTH_TOKEN)
fortify_disable
$(fortify_disable)
FORTIFY_FPR_NAME
$(FORTIFY_FPR_NAME)
FORTIFY_NEW_VERSION
$(FORTIFY_NEW_VERSION)
FORTIFY_PASS
$(FORTIFY_PASS)
FORTIFY_POOL_GOLD_NOVO
$(FORTIFY_POOL_GOLD_NOVO)
FORTIFY_POOL_SILVER_NOVO
$(FORTIFY_POOL_SILVER_NOVO)
FORTIFY_REGEX
$(FORTIFY_REGEX)
FORTIFY_SENSOR_POOL
$(FORTIFY_SENSOR_POOL)
FORTIFY_UPTOKEN
$(FORTIFY_UPTOKEN)
FORTIFY_URL
$(FORTIFY_URL)
FORTIFY_URL_CONTROLLER
$(FORTIFY_URL_CONTROLLER)
FORTIFY_USER
$(FORTIFY_USER)
FORTIFY_VERSION_BUILD
$(FORTIFY_VERSION_BUILD)
FTFY_MVN_GOAL
$(FTFY_MVN_GOAL)
GradleVersion
$(GradleVersion)
KEYSTORE_SECUREFILEPATH
$(KEYSTORE_SECUREFILEPATH)
library
$(library)
lista_versao
$(lista_versao)
nexus_interno_pass
$(nexus_interno_pass)
nexus_interno_user
$(nexus_interno_user)
NEXUS_REPOSITORY_ID
$(NEXUS_REPOSITORY_ID)
NEXUS_URL_RELEASE
$(NEXUS_URL_ANGULAR_RELEASE)
NEXUS_URL_SNAPSHOT
$(NEXUS_URL_ANGULAR_SNAPSHOT)
NEXUS_URL_SNAPSHOT_ALIAS
snapshot
NG_GOAL
ng build --configuration production --build-optimizer --aot --output-path=dist
NODE_EXTRA_CA_CERTS
$(NODE_EXTRA_CA_CERTS)
NODE_VERSION
$(NODE_VERSION)
p_language
$(p_language)
PACKAGE_JSON_PATH
$(Build.Repository.LocalPath)
POM_PATH
$(POM_PATH)
project.extension
$(project.extension)
project.file
$(project.file)
project.group
$(project.group)
project.name
$(project.name)
project.release
$(project.release)
project.version
$(project.version)
REPO_FINAL_NAME
$(REPO_FINAL_NAME)
REPOSITORIO
$(REPOSITORIO)
SCANCENTRAL_URL
$(SCANCENTRAL_URL)
SONAR_LOGIN
$(SONAR_LOGIN)
SONAR_PASSWORD
$(SONAR_PASSWORD)
SONAR_PROPERTIES
$(SONAR_PROPERTIES)
SONAR_URL
$(SONAR_URL)
token
$(token)
token_id
$(token_id)
valida.vec
$(valida.vec)
version.app
$(version.app)
versionApp
$(versionApp)
Control Options
Output Variables
Showing 6 deployments

Collapsed

Expanded

Row 4

Collapsed

Expanded

Row 3

Collapsed

Showing 1 deployments

Row 2

Row 2

Row 5. Clickable

Showing 2 filtered items.

Get started and run this pipeline for the first time!



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
SIDSC

SIDSC-storybook-v21

Tasks

Variables

Triggers

Options

History
Predefined variables
ImageBuild_OKD
nginx
NODE_VERSION
22.x
nome_imagem
nginx
SITE
okd4_nprd
system.collectionId
7b4c9d5c-b041-4798-8dcb-fb11786a173b
system.debug
false
system.definitionId
7379
system.teamProject
Caixa
tag_imagem
1.26
TemplateBuild_OKD
openshift/angular-caixa-binary-ads
TemplateVersaoProduto_OKD
1.18
version.app
1.0.0-snapshot

Showing 6 deployments

Collapsed

Expanded

Row 4

Collapsed

Expanded

Row 3

Collapsed

Showing 1 deployments

Row 2

Row 2

Row 5. Clickable

Showing 2 filtered items.

Get started and run this pipeline for the first time!


{
  "name": "sdsc-library",
  "version": "1.0.0",
  "scripts": {
    "ng": "ng",
    "build:lib": "ng build sdsc",
    "build:iconoir": "npm run iconoir:build && ng build sdsc",
    "watch": "ng build sdsc --watch",
    "test": "ng test sdsc",
    "package": "cd dist/sdsc && npm pack",
    "storybook": "ng run sdsc:storybook",
    "build:storybook": "ng run sdsc:build-storybook",
    "iconoir:build": "ts-node scripts/build-iconoir-icons.ts",
    "iconoir:update": "npm update iconoir && npm run iconoir:build"
  },
  "prettier": {
    "printWidth": 100,
    "singleQuote": true,
    "overrides": [
      {
        "files": "*.html",
        "options": {
          "parser": "angular"
        }
      }
    ]
  },
  "private": true,
  "packageManager": "npm@10.9.3",
  "dependencies": {
    "@angular/cdk": "^21.2.14",
    "@caixa/sidsc-sdsc-components": "^21.0.0-beta.0",
    "glob": "^13.0.6",
    "iconoir": "^7.11.1",
    "lottie-web": "^5.13.0",
    "ngx-mask": "^21.0.1",
    "rxjs": "~7.8.0",
    "tslib": "^2.3.0",
    "zone.js": "^0.16.2"
  },
  "devDependencies": {
    "@angular-devkit/architect": "^0.2102.18",
    "@angular-devkit/build-angular": "^21.2.18",
    "@angular-devkit/core": "^21.2.18",
    "@angular/build": "^21.2.17",
    "@angular/cli": "^21.2.17",
    "@angular/common": "^21.2.17",
    "@angular/compiler": "^21.2.17",
    "@angular/compiler-cli": "^21.2.0",
    "@angular/core": "^21.2.17",
    "@angular/forms": "^21.2.17",
    "@angular/platform-browser": "^21.2.17",
    "@angular/platform-browser-dynamic": "^21.2.17",
    "@angular/router": "^21.2.17",
    "@compodoc/compodoc": "^2.0.0",
    "@storybook/addon-a11y": "^10.4.6",
    "@storybook/addon-docs": "^10.4.6",
    "@storybook/angular": "^10.4.6",
    "@types/node": "^26.1.0",
    "create-storybook": "^10.4.6",
    "jsdom": "^28.1.0",
    "ng-packagr": "^21.2.0",
    "prettier": "^3.8.1",
    "storybook": "^10.4.6",
    "ts-node": "^10.9.2",
    "typescript": "~5.9.2",
    "vitest": "^4.0.8"
  }
}


