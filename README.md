#!/bin/bash

shopt -s extglob

CLUSTER="${AMBIENTE}_${SITE}"

case "${CLUSTER,,}" in
  # OKD 3
  +(des|tqs|hmp)_?(ctc_nprd))
	_okd_url="$(OKD_API)"
	;;
	
  prd_?(ctc_npcn))
    _okd_url="$(OKD_API_APL)"
    ;;

  prd_dtc_npcn)
	_okd_url="$(OKD_API_PRD_DTC)"
  ;;
  
  prd_ctc_canais)
	_okd_url="$(OKD_API_PRD_CANAIS_CTC)"
  ;;
  
  prd_dtc_canais)
	_okd_url="$(OKD_API_PRD_CANAIS_DTC)"
  ;;
  		
  # OKD 4
  +(des|tqs|hmp)_okd4_nprd)
	_okd_url="$(OKD_4_API)"
    ;;
	
  prd_okd4_prd)
	_okd_url="$(OKD_4_API_APL)"
    ;;

  # OCP
  +(des|tqs|hmp)_ocp_nprd)
	_okd_url="$(OCP_API)"
    ;;
	
  prd_ocp_prd)
	_okd_url="$(OCP_API_PRD)"
    ;;

  # OPENSHIFT-LOTERIAS-NPRD
  +(des|tqs|hmp)_openshift_nprd_loterias)
  _okd_url="$(OPENSHIFT_LOTERIAS_API_NPRD)"
    ;;

  # OPENSHIFT-LOTERIAS-PRD
  prd_openshift_prd_loterias)
	_okd_url="$(OPENSHIFT_LOTERIAS_API_PRD)"
    ;;

  # OCP LOTERIAS-PRD
  prd_ocp_loterias)
	_okd_url="$(OCP_LOTERIAS_API_PRD)"
    ;;

  # IBMCLOUD
  *_ibmcloud)
    echo "IBMCLOUD $AMBIENTE"
	_okd_url="$(OCP_API_IBMCLOUD)"
	;;
  *)
	echo "Não encontrei o registry para logar"
    exit 1 ;;
esac

if [[ -n "$SITE" && "$SITE" =~ (okd4|ocp|openshift) ]];
then
  app="$(REPOSITORIO)-$(AMBIENTE)"
else
  app="$(REPOSITORIO)-$(AMBIENTE)-esteiras"
fi


echo "URL do Projeto no OKD: $_okd_url/console/project/$(PROJETO)-$(AMBIENTE)/overview"

if [[ -n $(ISTIO_INJECTION) ]]; then
  if [[ $(ISTIO_INJECTION) == "enabled" ]]; then
    namespace='istio-system'
  else
    namespace=$(PROJETO)-$(AMBIENTE)
  fi
else
  namespace=$(PROJETO)-$(AMBIENTE)
fi

if [[ -n $(CONTEXTO_JBOSS) ]] ; then
   oc get route -l app="$app" -n $namespace -o jsonpath='{range .items[*].spec}{"APP Publicada na URL: https://"}{.host}'$(CONTEXTO_JBOSS)'{"\n"}{end}'
else
   oc get route -l app="$app" -n $namespace -o jsonpath='{range .items[*].spec}{"APP Publicada na URL: https://"}{.host}{"\n"}{end}'
fi
