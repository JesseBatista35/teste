#!/bin/bash
set -o errexit
set -o pipefail

 

shopt -s extglob

 

echo "Nova APP: $(is_new_app)"

 

CONTAINER_PRINCIPAL=$(resource_app)

 

# -------------------------------
# NORMALIZA VARIÁVEIS
# -------------------------------

 

RAW_ENV='$(Enviroment)'

 

echo "$RAW_ENV" \
  | sed 's/ -e /\n/g' \
  | sed 's/^-e //' \
> env.tmp

 

# remove linhas inválidas (sem =)
grep -E '^[A-Za-z_][A-Za-z0-9_]*=' env.tmp > env.clean || true

 

# -------------------------------
# APPLY ENV VARS (SEGURO)
# -------------------------------

 

if [ -s env.clean ]; then
  echo "Aplicando variáveis..."

 

  while IFS= read -r line || [ -n "$line" ]; do
    echo "Aplicando: $line"

 

    oc set env $(KIND_DEPLOY) "$(resource_app)" \
      -n $(PROJETO)-$(AMBIENTE) \
      -c "$CONTAINER_PRINCIPAL" \
      --overwrite=true \
      "$line"

 

  done < env.clean

 

else
  echo "Nenhuma variável válida."
fi

 

rm -f env.tmp env.clean



o que esse scrpt faz?
