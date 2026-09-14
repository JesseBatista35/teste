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
