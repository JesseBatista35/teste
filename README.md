#!/bin/bash
set -o pipefail

PROJECT_POM_PROPERTIES_FILE=$(timeout 30 find "$(Build.SourcesDirectory)/target" -maxdepth 6 -name pom.properties 2>/dev/null | head -n1)

if [ -z "$PROJECT_POM_PROPERTIES_FILE" ]; then
  echo "##vso[task.logissue type=error]pom.properties não encontrado em target/ dentro de 30s. Verifique se o Maven gerou o arquivo ou se há lentidão de storage/NFS no agente."
  exit 1
fi

p_version=$(egrep version "$PROJECT_POM_PROPERTIES_FILE" | awk -F = '{print $2}')

echo "##vso[task.setvariable variable=POM_VERSION;]$p_version"
echo "##vso[task.setvariable variable=POM_PATH;]pom.xml"
