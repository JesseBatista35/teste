set -euo pipefail

NEXUS="http://binario.caixa:8081/repository"
GROUP_PATH="br/gov/caixa/siifx/caixinhas"
ARTIFACT="siifx-caixinhas-batch"
DESTINO="$(System.DefaultWorkingDirectory)/binario"

# Versão: VERSAO_BATCH (se informada) ou o número da build vinculada à release
VERSAO="${VERSAO_BATCH:-$(Build.BuildNumber)}"
echo "Versão: $VERSAO"

if [[ "$VERSAO" == *-SNAPSHOT ]]; then
  BASE="$NEXUS/snapshots/$GROUP_PATH/$ARTIFACT/$VERSAO"
  VALOR=$(curl -sf "$BASE/maven-metadata.xml" \
    | tr -d '\n\r\t ' \
    | sed 's/<snapshotVersion>/\n/g' \
    | grep '<extension>jar</extension>' | grep -v '<classifier>' \
    | grep -o '<value>[^<]*</value>' | sed 's/<[^>]*>//g' | tail -1)
  [ -z "$VALOR" ] && { echo "##vso[task.logissue type=error]Snapshot não encontrado para $VERSAO"; exit 1; }
  JAR="$ARTIFACT-$VALOR.jar"
elif [[ "$VERSAO" =~ ^[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+$ ]]; then
  BASE="$NEXUS/releases/$GROUP_PATH/$ARTIFACT/$VERSAO"
  JAR="$ARTIFACT-$VERSAO.jar"
else
  echo "##vso[task.logissue type=error]Versão '$VERSAO' fora do padrão (X.X.X.X ou *-SNAPSHOT)"; exit 1
fi

URL_CORRETA="$BASE/$JAR"
echo "Artefato: $URL_CORRETA"

mkdir -p "$DESTINO"
curl -f "$URL_CORRETA" -o "$DESTINO/$JAR"
ls -l "$DESTINO"

echo "##vso[task.setvariable variable=URL_DEPLOY]$URL_CORRETA"
