
- task: Bash@3
  displayName: 'Atualizando Variáveis de Ambiente'
  condition: ne(variables['is_new_app'], 'true')   # ajusta a condição conforme sua lógica
  inputs:
    targetType: inline
    script: |
      set -o errexit
      set -o pipefail

      CONTAINER_PRINCIPAL="$(resource_app)"

      # Garante que a variável existe
      if [ -z "$CONTAINER_PRINCIPAL" ]; then
        echo "resource_app vazio, abortando."
        exit 1
      fi

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

          oc set env $(KIND_DEPLOY) "$CONTAINER_PRINCIPAL" \
            -n $(PROJETO)-$(AMBIENTE) \
            -c "$CONTAINER_PRINCIPAL" \
            --overwrite=true \
            "$line"

        done < env.clean

      else
        echo "Nenhuma variável válida encontrada."
      fi

      rm -f env.tmp env.clean
