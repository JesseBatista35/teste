Criando nova APP

#!/bin/bash
set -o errexit
set -o pipefail
shopt -s extglob
shopt -s expand_aliases
CLUSTER="${AMBIENTE}_${SITE}"
epoch_now=`date +%s`
start_date=`date -d "@$epoch_now" +"%Y-%m-%dT%H:%M:%S-03:00"`
end_epoch=$((epoch_now + 300))
end_date=`date -d "@$end_epoch" +"%Y-%m-%dT%H:%M:%S-03:00"`
cmdb_sistema=`echo $REPOSITORIO | tr '[:lower:]' '[:upper:]'`
cmdb_ambiente=`echo $AMBIENTE | tr '[:lower:]' '[:upper:]'`
case "${CLUSTER,,}" in
  # OKD4
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
  # OPENSHIFT NPRD LOTERIAS
  +(des|tqs|hmp)_openshift_nprd_loterias)
    echo "OPENSHIFT NPRD LOTERIAS - des, tqs ou hmp"
 _app="$(REPOSITORIO)-$(AMBIENTE)"
 _application_domain="$(REPOSITORIO)-$(AMBIENTE).$(OPENSHIFT_LOTERIAS_URL_SUFFIX_NPRD)"
    ;;
  prd_openshift_prd_loterias)
    echo "OPENSHIFT PRD LOTERIAS"
 _app="$(REPOSITORIO)-$(AMBIENTE)"
 _application_domain="$(REPOSITORIO)-$(AMBIENTE).$(OPENSHIFT_LOTERIAS_URL_SUFFIX_PRD)"
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
  prd_ocp_loterias)
    echo "OCP LOTERIAS PRD - prd"
 _app="$(REPOSITORIO)-$(AMBIENTE)"
 _application_domain="$(REPOSITORIO)-$(AMBIENTE).$(OCP_LOTERIAS_URL_SUFFIX_PRD)"
    ;;
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
  if [-e "$arquivo"]; then 
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
        TemplateRelease=$(TemplateRelease_OKD)
        TemplateRelease=`echo "$TemplateRelease" | sed 's,/,//,' ` 
        oc process "$TemplateRelease" --labels=app="$_app" -p NAME="$_app" -p APPLICATION_DOMAIN="$_application_domain" -p BUILD_NUMBER=$(Build.BuildNumber) -n openshift | oc create -f - -n $(PROJETO)-$(AMBIENTE)
        json_data=`cat <<EOF
          {
          "Description": "Padrão DevOps Criação de Aplicação - Sistema: $cmdb_ambiente $cmdb_sistema Ambiente: $cmdb_ambiente",
          "Detailed Description": "Padrão DevOps Criação de Aplicação - Sistema: $cmdb_ambiente $cmdb_sistema Ambiente: $cmdb_ambiente",
          "Change Target Date": "$end_date",
          "Environment": "Production",
          "CI Name": "$CI_NAME",
          "Scheduled Start Date": "$start_date",
          "Scheduled End Date": "$end_date",
          "Actual Start Date": "$start_date",
          "Actual End Date": "$end_date",         
          "ambiente": "$cmdb_ambiente",
          "lista_hostnames": [ "$cmdb_sistema-$cmdb_ambiente" ],
          "Reason For Change": "New Functionality"
          }
EOF
` 
      curl  -X POST $URL_CRQ \
            -H "Authorization: $TOKEN_CRQ" \
            -H "Content-Type: application/json" \
            -d "$json_data"
fi
 if [[ $(KIND_DEPLOY) == deployment ]]
then 
  is_paused=`oc get $(KIND_DEPLOY)/"$_app" -o=jsonpath='{.spec.paused}' -n $(PROJETO)-$(AMBIENTE)`
  if [[ $is_paused != "true" ]]
    then 
      oc rollout pause $(KIND_DEPLOY)/"$_app" -n $(PROJETO)-$(AMBIENTE)
  fi
fi
oc patch  $(KIND_DEPLOY) "$_app" -p '{"metadata":{ "labels":{"CGC_DES":"$(CGC_UNIDADE_DES)","CGC_OPS":"$(CGC_UNIDADE_OPS)"}},"spec": {"template": {"metadata": {"labels": {"CGC_DES":"$(CGC_UNIDADE_DES)","CGC_OPS":"$(CGC_UNIDADE_OPS)"}}}}}' -n $(PROJETO)-$(AMBIENTE)
oc adm policy add-scc-to-group anyuid system:serviceaccounts:$(PROJETO)-$(AMBIENTE)
echo "##vso[task.setvariable variable=is_new_app;]$is_new_app"
echo "##vso[task.setvariable variable=resource_app;]$_app"



Atualizando Variáveis de Ambiente


#!/bin/bash
set -o errexit
set -o pipefail

shopt -s extglob
echo "Nova APP: $(is_new_app)"

CONTAINER_PRINCIPAL=$(resource_app)  # nome do container principal da aplicação

for UNSET_VAR in $(oc set env $(KIND_DEPLOY) "$(resource_app)" -n $(PROJETO)-$(AMBIENTE) --list -c "$CONTAINER_PRINCIPAL" | egrep -wv '^#|TZ|INSTANCE_IP' | cut -f1 -d"=")
do 
oc set env $(KIND_DEPLOY) "$(resource_app)" -n $(PROJETO)-$(AMBIENTE) -c "$CONTAINER_PRINCIPAL" $UNSET_VAR- 
done

for UNSET_SECRET in $(oc set env $(KIND_DEPLOY) "$(resource_app)" -n $(PROJETO)-$(AMBIENTE) --list -c "$CONTAINER_PRINCIPAL" | grep 'from secret' | awk '{print $2}')
do
  if [ -n $UNSET_SECRET ]
  then
    oc set env $(KIND_DEPLOY) "$(resource_app)" -n $(PROJETO)-$(AMBIENTE) -c "$CONTAINER_PRINCIPAL" $UNSET_SECRET- 
  fi
done

if [[ -n '$(Enviroment)' ]]; then 
   oc set env $(Enviroment) $(KIND_DEPLOY) "$(resource_app)" -c "$CONTAINER_PRINCIPAL" --overwrite=true -n $(PROJETO)-$(AMBIENTE)
fi




Criando Rota Customizada


#!/bin/bash
#set -o errexit
set -o pipefail

shopt -s extglob

if [[ -n "$URL_CUSTOMIZADA" && "$AMBIENTE" == prd ]]; then
  if  [ "${ISTIO_INJECTION:-disabled}" == "enabled" ]; then
    echo "PROJETO=$(PROJETO)"
    echo "AMBIENTE=$(AMBIENTE)"
    echo "ISTIO_INJECTION=$(ISTIO_INJECTION)"
    ISTIO_INJECTION="$(ISTIO_INJECTION)"
    echo "KIND_DEPLOY=$(KIND_DEPLOY)"
    echo "REPOSITORIO=$(REPOSITORIO)"
    echo "RELEASE_ENVIRONMENTNAME=$(RELEASE.ENVIRONMENTNAME)"

    #condicional para ocp loterias
    if echo "$SITE" | egrep -q "loterias"
    then
    URL_SUFFIX="$(OCP_LOTERIAS_URL_SUFFIX_PRD)"
    else
    URL_SUFFIX="${OCP_URL_SUFFIX_PRD:-$OCP_URL_SUFFIX}"
    fi

    echo "URL_CUSTOMIZADA=$(URL_CUSTOMIZADA)"
    URL_CUSTOMIZADA=$(URL_CUSTOMIZADA)
    echo "URL_SUFFIX=$URL_SUFFIX"  
  
    # WO0000073196710 - Ambiente com Service Mesh
    
    oc project "$(PROJETO)-$(AMBIENTE)"
    oc process template/service-mesh-vs-release-custom -p NAME="$(REPOSITORIO)-$(AMBIENTE)" -p NAMESPACE="$(PROJETO)-$(AMBIENTE)" -n openshift | oc apply -f -
    oc get virtualservice "vs-$(REPOSITORIO)-$(AMBIENTE)-custom"

    oc process template/service-mesh-gt-release-custom -p NAME="$(REPOSITORIO)-$(AMBIENTE)" -p NAMESPACE="$(PROJETO)-$(AMBIENTE)" -p APPLICATION_DOMAIN="${URL_CUSTOMIZADA}" -n openshift | oc apply -f -
    oc get gateway "gt-$(REPOSITORIO)-$(AMBIENTE)-custom"

    oc project istio-system
    oc process template/service-mesh-route-release-custom -p NAME="$(REPOSITORIO)-$(AMBIENTE)" -p APPLICATION_DOMAIN="${URL_CUSTOMIZADA}" -n openshift | oc apply -f -
    oc get route "$(REPOSITORIO)-$(AMBIENTE)-custom"
    oc project "$(PROJETO)-$(AMBIENTE)"
  else
    # Ambiente sem Service Mesh
    if ! oc get route "$URL_CUSTOMIZADA" -n "$(PROJETO)-$AMBIENTE"; then
      echo "Criando URL $URL_CUSTOMIZADA"
      ##TRECHO ABAIXO COMENTADO WO0000070886234O
      ##oc expose service "$(resource_app)" -l app="$(resource_app)" --name="$URL_CUSTOMIZADA" --hostname="$URL_CUSTOMIZADA" -n "$(PROJETO)"-"$AMBIENTE"
      if ! oc create route edge "$URL_CUSTOMIZADA" --service="$(resource_app)" --insecure-policy=Redirect --hostname="$URL_CUSTOMIZADA" -n "$(PROJETO)"-"$AMBIENTE"; then
        echo "Erro ao criar rota"
        echo "São caracteres permitidos na variável URL_CUSTOMIZADA: $URL_CUSTOMIZADA - letras minúsculas, números, pontos e hifens. Deve começar e terminar com uma letra ou número."
        exit 1
      fi
    else
      echo "Rota já está criada"
    fi
  fi
fi


Aplicando Service Mesh


#!/bin/bash
#set -o errexit
set -o pipefail

echo "PROJETO=$(PROJETO)"
echo "AMBIENTE=$(AMBIENTE)"
echo "ISTIO_INJECTION=$(ISTIO_INJECTION)"
echo "KIND_DEPLOY=$(KIND_DEPLOY)"
echo "REPOSITORIO=$(REPOSITORIO)"
echo "RELEASE_ENVIRONMENTNAME=$(RELEASE.ENVIRONMENTNAME)"

#condicional para ocp loterias
if echo "$SITE" | egrep -q "loterias"
then
URL_SUFFIX="$(OCP_LOTERIAS_URL_SUFFIX_PRD)"
else
URL_SUFFIX="${OCP_URL_SUFFIX_PRD:-$OCP_URL_SUFFIX}"
fi

echo "URL_SUFFIX=$URL_SUFFIX"

oc patch $(KIND_DEPLOY) $(REPOSITORIO)-$(AMBIENTE) -n $(PROJETO)-$(AMBIENTE) --type='merge' -p '{"spec":{"template":{"metadata":{"annotations":{"sidecar.istio.io/inject":"true"}}}}}'

oc project $(PROJETO)-$(AMBIENTE)

is_new_app=false
is_app_created=`oc get virtualservice,gateway,route -l app="$(REPOSITORIO)-$(AMBIENTE)" -o=jsonpath='{range .items[*]}{.metadata.name}{"\n"}' --all-namespaces --no-headers | grep . | wc -l`

if [ "$is_app_created" -ge "3" ]; then
   echo "Essa aplicação já tem os resources virtualservice gateway e route criados."
else
  echo "Criando os resources virtualservice gateway e route."

  oc project $(PROJETO)-$(AMBIENTE)
  oc process template/service-mesh-vs-release -p NAME=$(REPOSITORIO)-$(AMBIENTE) -p NAMESPACE=$(PROJETO)-$(AMBIENTE) -n openshift | oc apply -f -
  oc get virtualservice vs-$(REPOSITORIO)-$(AMBIENTE)
  
  oc patch route $(REPOSITORIO)-$(AMBIENTE) -p '{"spec":{"host":"$(REPOSITORIO)-$(AMBIENTE).'${URL_SUFFIX}'"}}'
  
  oc process template/service-mesh-gt-release -p NAME=$(REPOSITORIO)-$(AMBIENTE) -p NAMESPACE=$(PROJETO)-$(AMBIENTE) -p APPLICATION_DOMAIN=$(REPOSITORIO)-$(AMBIENTE)."${URL_SUFFIX}" -n   openshift | oc apply -f -
  oc get gateway gt-$(REPOSITORIO)-$(AMBIENTE)
  
  oc project istio-system
  oc process template/service-mesh-route-release -p NAME=$(REPOSITORIO)-$(AMBIENTE) -p APPLICATION_DOMAIN=$(REPOSITORIO)-$(AMBIENTE)."${URL_SUFFIX}" -n openshift | oc apply -f -
  oc get route $(REPOSITORIO)-$(AMBIENTE)
  oc project $(PROJETO)-$(AMBIENTE)
fi
