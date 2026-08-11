2026-08-11T14:23:11.8156165Z ##[section]Starting: Criando nova APP
2026-08-11T14:23:11.8159051Z ==============================================================================
2026-08-11T14:23:11.8159126Z Task         : Bash
2026-08-11T14:23:11.8159177Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-11T14:23:11.8159238Z Version      : 3.227.0
2026-08-11T14:23:11.8159282Z Author       : Microsoft Corporation
2026-08-11T14:23:11.8159343Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-11T14:23:11.8159421Z ==============================================================================
2026-08-11T14:23:11.9728360Z Generating script.
2026-08-11T14:23:11.9729372Z ========================== Starting Command Output ===========================
2026-08-11T14:23:11.9732626Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/e0d63111-ad43-4791-8674-f303d3154592.sh
2026-08-11T14:23:11.9791112Z OKD4 NPRD - des, tqs ou hmp
2026-08-11T14:23:12.0467349Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-08-11T14:23:12.0467724Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-08-11T14:23:12.0467942Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-08-11T14:23:12.1613991Z Iniciando criação da APP
2026-08-11T14:23:12.2658087Z error: error processing template "openshift/angular-caixa-release": the namespace of the provided object does not match the namespace sent on the request
2026-08-11T14:23:12.2713113Z ##[error]Bash exited with code '1'.
2026-08-11T14:23:12.2754240Z ##[section]Finishing: Criando nova APP



#!/bin/bash
set -o errexit
set -o pipefail

shopt -s extglob
shopt -s expand_aliases
CLUSTER="${AMBIENTE}_${SITE}"

case "${CLUSTER,,}" in
  # OKD 3
  +(des|tqs|hmp)_?(ctc_nprd))
   echo "NPRD - des, tqs ou hmp"
	_app="$(REPOSITORIO)-$(AMBIENTE)-esteiras"
	_application_domain="$(REPOSITORIO)-$(AMBIENTE)-esteiras.$(OKD_URL_SUFFIX)"
	;;
	
  prd_?(ctc_npcn))
    echo "CTC_NPCN - prd"
	_app="$(REPOSITORIO)-$(AMBIENTE)-esteiras"
	_application_domain="$(REPOSITORIO)-$(AMBIENTE)-esteiras.$(OKD_URL_SUFFIX_APL)"
    ;;

  prd_dtc_npcn)
    echo "DTC_NPCN - prd"
	_app="$(REPOSITORIO)-$(AMBIENTE)-esteiras"
	_application_domain="$(REPOSITORIO)-$(AMBIENTE)-esteiras.$(OKD_URL_SUFFIX_APL)"
  ;;
  
  prd_ctc_canais)
    echo "CTC_CANAIS - prd"
	_app="$(REPOSITORIO)-$(AMBIENTE)-esteiras"
	_application_domain="$(REPOSITORIO)-$(AMBIENTE)-esteiras.$(OKD_URL_SUFFIX_APL)"
  ;;
  
  prd_dtc_canais)
    echo "DTC_CANAIS - prd"
	_app="$(REPOSITORIO)-$(AMBIENTE)-esteiras"
	_application_domain="$(REPOSITORIO)-$(AMBIENTE)-esteiras.$(OKD_URL_SUFFIX_APL)"
  ;;
  
  # OKD 4
  +(des|tqs|hmp)_okd4_nprd)
    echo "OKD4 NPRD - des, tqs ou hmp"
	_app="$(REPOSITORIO)-$(AMBIENTE)"
	_application_domain="$(REPOSITORIO)-$(AMBIENTE).$(OKD_URL_SUFFIX)"
    ;;
	
  prd_okd4_prd)
    echo "OKD4 CTC_NPCN - prd"
	_app="$(REPOSITORIO)-$(AMBIENTE)"
	_application_domain="$(REPOSITORIO)-$(AMBIENTE).$(OKD_URL_SUFFIX_APL)"
    ;;

+(des|tqs|hmp)_okd4_nprdz)
echo "OKD4 NPRDZ - des, tqs ou hmp"
	_app="$(REPOSITORIO)-$(AMBIENTE)"
	_application_domain="$(REPOSITORIO)-$(AMBIENTE).$(OKD_URL_SUFFIX_NPRDZ)"
    ;;

  # OCP
  +(des|tqs|hmp)_ocp_nprd)
    echo "OCP NPRD - des, tqs ou hmp"
	_app="$(REPOSITORIO)-$(AMBIENTE)"
	_application_domain="$(REPOSITORIO)-$(AMBIENTE).$(OCP_URL_SUFFIX)"
    ;;
	
  prd_ocp_prd)
    echo "OCP PRD - prd"
	_app="$(REPOSITORIO)-$(AMBIENTE)"
	_application_domain="$(REPOSITORIO)-$(AMBIENTE).$(OCP_URL_SUFFIX_PRD)"
    ;;

  # IBMCLOUD
  *_ibmcloud)
    echo "IBM CLOUD"
	_app="$(REPOSITORIO)-$(AMBIENTE)-esteiras"

    ;;
  *)
	echo "Não encontrei o cluster"
    exit 1 ;;
esac

if [[ -n "$SITE" && "$(SITE)" =~ "ocp" ]]
then
arquivo="/usr/local/bin/oc-v4.13"
  if [ -e "$arquivo" ]; then 
    alias oc="$arquivo"
  fi
fi

oc version

is_new_app=false
is_app_created=`oc get svc,$(KIND_DEPLOY),is,route -l app="$_app" -o=jsonpath='{range .items[*]}{.metadata.name}{"\n"}' -n $(PROJETO)-$(AMBIENTE) | wc -l`

if [ "$is_app_created" -ge "4" ]; then
   echo "Essa aplicação já está criada."
else
	echo "Iniciando criação da APP"
	is_new_app=true
	oc new-app $(TemplateRelease_OKD) $(Enviroment) --labels=app="$_app"  -p NAME="$_app" -p APPLICATION_DOMAIN="$_application_domain" -p BUILD_NUMBER=$(Build.BuildNumber) -n $(PROJETO)-$(AMBIENTE)
fi

if [[ $(KIND_DEPLOY) == deployment ]]
then 
  is_paused=`oc get $(KIND_DEPLOY)/"$_app" -o=jsonpath='{.spec.paused}' -n $(PROJETO)-$(AMBIENTE)`
  if [[ $is_paused != "true" ]]
    then 
      oc rollout pause $(KIND_DEPLOY)/"$_app" -n $(PROJETO)-$(AMBIENTE)
  fi
fi

# oc patch $(KIND_DEPLOY) "$_app" -p '{"metadata":{ "labels":{"UNIDADE":"$(UNIDADE)"}},"spec": {"template": {"metadata": {"labels": {"UNIDADE": "$(UNIDADE)"}}}}}' -n $(PROJETO)-$(AMBIENTE)

oc patch  $(KIND_DEPLOY) "$_app" -p '{"metadata":{ "labels":{"CGC_DES":"$(CGC_UNIDADE_DES)","CGC_OPS":"$(CGC_UNIDADE_OPS)"}},"spec": {"template": {"metadata": {"labels": {"CGC_DES":"$(CGC_UNIDADE_DES)","CGC_OPS":"$(CGC_UNIDADE_OPS)"}}}}}' -n $(PROJETO)-$(AMBIENTE)

oc label $(KIND_DEPLOY) "$_app" UNIDADE=$(UNIDADE) --overwrite -n $(PROJETO)-$(AMBIENTE)
echo "##vso[task.setvariable variable=is_new_app;]$is_new_app"






