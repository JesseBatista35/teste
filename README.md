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
SISPI-qrcode-api-validador
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
All pipelines

SISPI-QRCODE

SISPI-qrcode-api-validador
TAG_AMBIENTE_BUILD_OKD
Task version
12.*
Display name
TAG_AMBIENTE_BUILD_OKD
AMBIENTE
$(AMBIENTE)
AMBIENTE_BUILD
$(AMBIENTE_BUILD)
BUILDNAME
$(BUILDNAME)
KIND_DEPLOY
$(KIND_DEPLOY)
OKD_API_REGISTRY
$(OKD_API_REGISTRY)
OKD_REGISTRY
$(OKD_REGISTRY)
OKD_TOKEN_REGISTRY
$(OKD_TOKEN_REGISTRY)
OKD_USER_SERVICE_REGISTRY
$(OKD_USER_SERVICE_REGISTRY)
PROJETO
$(PROJETO)
ProjetoBuild
$(ProjetoBuild)
REPOSITORIO
$(REPOSITORIO)
SITE
$(SITE)
TemplateRelease_OKD
$(TemplateRelease_OKD)
Control Options
Output Variables
Expanded

Collapsed

Row 8. Clickable

Row 3. Clickable

Row 13

Expanded

Collapsed

157 pipelines found

Select a release pipeline to view its releases

155 pipelines found

Select a release pipeline to view its releases

16 pipelines found

Select a release pipeline to view its releases

16 pipelines found

Select a release pipeline to view its releases

10 pipelines found

Row 10

Showing filters 1 through 2





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
SISPI-dict-reivindicacoes
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
All pipelines

SISPI

SISPI-dict-reivindicacoes
TAG_AMBIENTE_BUILD_OKD
Task version
12.*
Display name
TAG_AMBIENTE_BUILD_OKD
AMBIENTE
$(AMBIENTE)
AMBIENTE_BUILD
$(AMBIENTE_BUILD)
BUILDNAME
$(BUILDNAME)
KIND_DEPLOY
$(KIND_DEPLOY)
OKD_API_REGISTRY
$(OKD_API_REGISTRY)
OKD_REGISTRY
$(OKD_REGISTRY)
OKD_TOKEN_REGISTRY
$(OKD_TOKEN_REGISTRY)
OKD_USER_SERVICE_REGISTRY
$(OKD_USER_SERVICE_REGISTRY)
PROJETO
$(PROJETO)
ProjetoBuild
$(ProjetoBuild)
REPOSITORIO
$(REPOSITORIO)
SITE
$(SITE)
TemplateRelease_OKD
$(TemplateRelease_OKD)
Control Options
Output Variables
Showing filters 1 through 2

Showing 7 deployments

OCP4 EC DESDeploy release

Showing filters 1 through 2

Showing filters 1 through 2

Showing 7 deployments

Expanded

Row 2

Collapsed

Showing 7 deployments

Showing 7 deployments

Row 2

OCP4 EC DESDeploy release

Expanded

Row 3

Collapsed

Row 2

Row 3

Showing 7 deployments

Row 2


#!/bin/bash
set -x

check_status_code() {
  local url=$1
  curl --location --request GET "$url" \
    --header "Authorization: Bearer $(OKD_TOKEN_REGISTRY)" \
    --header "Content-Type: text/plain" \
    -s -k -o /dev/null -w "%{http_code}"
}

handle_image_not_found() {
  local build_number=$1
  local project_build=$2
  local build_name=$3
  echo ""
  echo "A tag $build_number não foi encontrada no ImageStream de Build: https://console-openshift-console.apps.produtos4.caixa/k8s/ns/$project_build/imagestreams/$build_name"
  echo "Verifique se a tag $build_number foi gerada corretamente durante a Build"
  exit 1
}

if echo "$(SITE)" | egrep -q "^(okd4|ocp|openshift)"; then
  status_code=`check_status_code "https://$(OKD_REGISTRY)/v2/$(ProjetoBuild)/$(BUILDNAME)/manifests/$(Build.BuildNumber)"`

  if [[ $status_code -ne 200 && "$(AMBIENTE)" != "prd" ]]; then
    handle_image_not_found "$(Build.BuildNumber)" "$(ProjetoBuild)" "$(BUILDNAME)"
  else
    if [[ "$(AMBIENTE)" == "prd" ]]; then
      status_code_prd=`check_status_code "https://$(OKD_REGISTRY)/v2/images-prd/$(BUILDNAME)/manifests/$(Build.BuildNumber)"`
      if [[ $status_code -ne 200 && $status_code_prd -ne 200 ]]; then
        handle_image_not_found "$(Build.BuildNumber)" "images-prd" "$(BUILDNAME)"
      fi
      if [[ $status_code == 200 ]]; then
        CURRENT_CONTEXT=`oc config current-context`
        oc login --token=$(OKD_TOKEN_REGISTRY) --server=$(OKD_API_REGISTRY)
        oc tag $(ProjetoBuild)/$(BUILDNAME):$(Build.BuildNumber) images-prd/$(BUILDNAME):$(Build.BuildNumber)
        oc config use-context $CURRENT_CONTEXT
      fi
    fi
  fi

  build="$(BUILDNAME)"
  app="$(REPOSITORIO)-$(AMBIENTE)"
  if [[ "$(AMBIENTE)" == "prd" ]]; then
    oc set image $(KIND_DEPLOY)/$app $app=$(OKD_REGISTRY)/images-prd/$(BUILDNAME):$(Build.BuildNumber) -n $(PROJETO)-$(AMBIENTE)
  else
    oc set image $(KIND_DEPLOY)/$app $app=$(OKD_REGISTRY)/$(ProjetoBuild)/$(BUILDNAME):$(Build.BuildNumber) -n $(PROJETO)-$(AMBIENTE)
  fi

  if echo "$(TemplateRelease_OKD)" | egrep -q "openshift/angular-caixa-release"; then
    echo "Realizando replace exporter angular"
    oc set image $(KIND_DEPLOY)/$app $app-exporter=$(OKD_REGISTRY)/openshift/nginx-prometheus-exporter -n $(PROJETO)-$(AMBIENTE)
  elif echo "$(TemplateRelease_OKD)" | egrep -q "openshift/php-caixa-release"; then
    echo "Realizando replace exporter php"
    oc set image $(KIND_DEPLOY)/$app $app-exporter=$(OKD_REGISTRY)/openshift/apache-exporter -n $(PROJETO)-$(AMBIENTE)
  else
    echo "Template não é angular nem php e não precisa deste replace"
  fi

  oc patch --type merge $(KIND_DEPLOY)/$app -p '{"spec":{"template":{"spec":{"imagePullSecrets":[{"name":"registry-secret"}]}}}}' -n $(PROJETO)-$(AMBIENTE)
  if ! oc get secret registry-secret -n $(PROJETO)-$(AMBIENTE); then
    oc project $(PROJETO)-$(AMBIENTE)
    oc create secret docker-registry registry-secret --docker-server=$(OKD_REGISTRY) --docker-username=$(OKD_USER_SERVICE_REGISTRY) --docker-password=$(OKD_TOKEN_REGISTRY) --docker-email=$(OKD_USER_SERVICE_REGISTRY)@corp.caixa.gov.br
  fi
else
  build="$(BUILDNAME)-esteiras"
  app="$(REPOSITORIO)-$(AMBIENTE)-esteiras"
  oc tag $(AMBIENTE_BUILD)/"$build":$(Build.BuildNumber) $(PROJETO)-$(AMBIENTE)/$app:$(Build.BuildNumber)
  if [[ $? -ne 0 ]]; then
    echo ""
    echo "A imagem não foi encontrada no ImageStream de Build: $(AMBIENTE_BUILD)/$build:$(Build.BuildNumber)"
    echo "Verifique se a imagem foi gerada corretamente durante a Build"
    exit 1
  fi
  oc set image $(KIND_DEPLOY)/$app $app=$(PROJETO)-$(AMBIENTE)/$app:$(Build.BuildNumber) --source=imagestreamtag -n $(PROJETO)-$(AMBIENTE)
fi

if [[ $(KIND_DEPLOY) == deployment ]]; then
  oc rollout pause $(KIND_DEPLOY)/$app -n $(PROJETO)-$(AMBIENTE)
  sleep 20
  oc rollout resume $(KIND_DEPLOY)/$app -n $(PROJETO)-$(AMBIENTE)
  oc rollout restart $(KIND_DEPLOY)/$app -n $(PROJETO)-$(AMBIENTE)
else
  oc rollout cancel $(KIND_DEPLOY)/$app -n $(PROJETO)-$(AMBIENTE)
  sleep 20
  oc rollout latest $(KIND_DEPLOY)/$app -n $(PROJETO)-$(AMBIENTE)
fi



voce chtou chutou chou e nada
