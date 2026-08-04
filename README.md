#!/bin/bash
set -o pipefail

POM_FILE="pom.xml"

if [ ! -f "$POM_FILE" ]; then
  echo "##[error]pom.xml não encontrado em $(pwd)"
  exit 1
fi

# Pega o <version> filho direto de <project>, ignorando versões de dependências
p_version=$(xmllint --xpath "string(/*[local-name()='project']/*[local-name()='version'])" "$POM_FILE" 2>/dev/null)

if [ -z "$p_version" ]; then
  echo "##[error]Não foi possível extrair a versão do pom.xml"
  exit 1
fi

echo "Versão extraída do POM: $p_version"
echo "##vso[task.setvariable variable=POM_VERSION;]$p_version"
echo "##vso[task.setvariable variable=POM_PATH;]$POM_FILE"
