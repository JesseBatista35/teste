1. Primeiro valide se a tag existe no cluster

Rode no mesmo cluster onde a pipeline faz login:

oc get istag jboss-eap:7.4.14-openjdk17 -n openshift

Se der NotFound ou erro parecido, confirme quais tags existem:

oc get is jboss-eap -n openshift -o jsonpath='{range .status.tags[*]}{.tag}{"\n"}{end}' | sort

Também confira o BuildConfig atual:

oc get bc sisou-sac-okd -n build-images-ads \
  -o jsonpath='{.spec.strategy.sourceStrategy.from.kind}{" "}{.spec.strategy.sourceStrategy.from.namespace}{" "}{.spec.strategy.sourceStrategy.from.name}{"\n"}'

Provavelmente vai aparecer algo como:

ImageStreamTag openshift jboss-eap:7.4.14-openjdk17
2. Correção mais provável

Se existir outra tag válida, por exemplo 7.4-openjdk17, 7.4.13-openjdk17 ou parecida, altere no Azure DevOps Classic > Variables:

nome_imagem = jboss-eap
tag_imagem  = TAG_EXISTENTE_NO_CLUSTER

Exemplo:

nome_imagem = jboss-eap
tag_imagem  = 7.4-openjdk17

Depois rode novamente.

3. Correção direta via oc patch

Se você quiser corrigir o BuildConfig manualmente para testar:

oc patch bc sisou-sac-okd -n build-images-ads --type=merge -p '{
  "spec": {
    "strategy": {
      "sourceStrategy": {
        "from": {
          "kind": "ImageStreamTag",
          "namespace": "openshift",
          "name": "jboss-eap:TAG_EXISTENTE"
        }
      }
    }
  }
}'

Troque TAG_EXISTENTE por uma tag real encontrada no comando oc get is jboss-eap -n openshift.

4. Se a tag deveria existir, a equipe do cluster precisa importar

Se a imagem correta realmente é jboss-eap:7.4.14-openjdk17, então alguém com permissão no namespace openshift precisa importar ou recriar essa tag:

oc import-image jboss-eap:7.4.14-openjdk17 \
  --from=CAMINHO_DO_REGISTRY/jboss-eap:7.4.14-openjdk17 \
  --confirm \
  -n openshift

Sem essa imagem/tag, o oc start-build sempre vai falhar.

5. Tem outro erro no script, mas não é o principal

Esse trecho também está ruim:

DOTNET_ASSEMBLY=${DOTNET_STARTUP_ASSEMBLY}
DOTNET_CONFIG="${DOTNET_ASSEMBLY:: -4}.runtimeconfig.json"

Como seu projeto é Java/EAR, DOTNET_STARTUP_ASSEMBLY está vazio, por isso aparece:

substring expression < 0

Não foi ele que derrubou a build, mas vale corrigir para não gerar erro falso. Troque por:

DOTNET_CONFIG=""

if [[ -n "${DOTNET_STARTUP_ASSEMBLY:-}" ]]; then
  DOTNET_ASSEMBLY="${DOTNET_STARTUP_ASSEMBLY}"
  DOTNET_CONFIG="${DOTNET_ASSEMBLY::-4}.runtimeconfig.json"
fi

if [[ -n "$DOTNET_CONFIG" ]]; then
  FILES=(`find -maxdepth 1 -name "*.runtimeconfig*.json"`)

  for i in "${FILES[@]}"
  do
    if [[ "${i:2}" != "${DOTNET_CONFIG}" ]]; then
      echo "Removendo: ${i}"
      rm "$i"
    fi
  done
fi
6. Eu colocaria uma validação antes do start-build

Antes deste comando:

oc start-build $buildconfig --from-dir="$(Build.StagingDirectory)" --follow --wait=true -n $(ProjetoBuild) -v=5

coloque:

echo "Validando imagem base S2I: $(nome_imagem):$(tag_imagem)"

if ! oc get istag "$(nome_imagem):$(tag_imagem)" -n openshift; then
  echo "##[error]ImageStreamTag $(nome_imagem):$(tag_imagem) não existe no namespace openshift."
  echo "Tags disponíveis para $(nome_imagem):"
  oc get is "$(nome_imagem)" -n openshift -o jsonpath='{range .status.tags[*]}{.tag}{"\n"}{end}' || true
  exit 1
fi

Assim a pipeline para com uma mensagem clara, antes de tentar o S2I.

Resumo: corrija tag_imagem para uma tag existente ou importe a tag jboss-eap:7.4.14-openjdk17 no namespace openshift. Esse é o ponto que está quebrando o step Executando Build S2I Binary.
