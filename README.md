<img width="1885" height="907" alt="image" src="https://github.com/user-attachments/assets/ec0c83bb-6c57-416c-992b-ead9f28c422e" />



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
