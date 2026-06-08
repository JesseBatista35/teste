Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Task groups
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
Task groups

Exporta_Variable_Cria_Projeto_OKD

Tasks

History

References
Bash
Task version
3.*
Display name
Exportando Variáveis de Ambiente "_ENV."
Type


Script
#!/bin/bash

IFS=$'\n'
var_split="-e"

for OUTPUT in `printenv | sort`
do
if [[ "$OUTPUT" =~ ^_ENV_.*  ]]; then

    Enviroment="${Enviroment} $var_split ${OUTPUT#"_ENV_"}"
    echo ${OUTPUT#"_ENV_"}
fi
done

echo "##vso[task.setvariable variable=Enviroment;]$Enviroment"

Advanced
Control Options
Environment Variables
Showing filters 1 through 1



SCRITOS DESSA TASK. 

#!/bin/bash

IFS=$'\n'
var_split="-e"

for OUTPUT in `printenv | sort`
do
if [[ "$OUTPUT" =~ ^_ENV_.*  ]]; then

    Enviroment="${Enviroment} $var_split ${OUTPUT#"_ENV_"}"
    echo ${OUTPUT#"_ENV_"}
fi
done

echo "##vso[task.setvariable variable=Enviroment;]$Enviroment"

oc get project $(PROJETO)-$(AMBIENTE)
if [ "$?" -ne "0" ]; then
 oc new-project $(PROJETO)-$(AMBIENTE)
 oc adm policy add-scc-to-group anyuid system:serviceaccounts:$(PROJETO)-$(AMBIENTE)
fi
oc label namespace $(PROJETO)-$(AMBIENTE) createdby=ads --overwrite
oc label namespace $(PROJETO)-$(AMBIENTE) CGC_UNIDADE_DES=$(CGC_UNIDADE_DES) --overwrite
oc label namespace $(PROJETO)-$(AMBIENTE) CGC_UNIDADE_OPS=$(CGC_UNIDADE_OPS) --overwrite
oc label netnamespace $(PROJETO)-$(AMBIENTE) projeto=$(PROJETO)-$(AMBIENTE) --overwrite


if [ "$NODESELECTOR" == "ob" -a "$(AMBIENTE)" == "prd" ]
then
oc patch namespace $(PROJETO)-$(AMBIENTE) -p '{"metadata":{"annotations":{"openshift.io/node-selector":"sistema=ob"}}}'
fi

#if [[ "$AMBIENTE" == prd ]]; then
#
#   WILDCARD_APL=$(OKD_URL_SUFFIX_APL)
#   if [[ $WILDCARD_APL == ms.caixa ]]
#   then
#    echo oc label namespace $(PROJETO)-$(AMBIENTE) router=router-microservice
#  else
#   echo oc label namespace $(PROJETO)-$(AMBIENTE) router=router-default
#  fi
#fi

#!/bin/bash

echo "PROJETO=$(PROJETO)"
echo "AMBIENTE=$(AMBIENTE)"
echo "ISTIO_INJECTION=$(ISTIO_INJECTION)"

#A label abaixo somente e adicionada ao namespace que tem a variable group ISTIO_VARIABLES
oc label namespace $(PROJETO)-$(AMBIENTE) istio-injection=enabled --overwrite

