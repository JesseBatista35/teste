#!/bin/bash

STANDALONE_CONF="/opt/jboss/bin/standalone.conf"
AGENT_PATH="/opt/azure/config/appinsights/applicationinsights-agent.jar"
JSON_PATH="/opt/azure/config/appinsights/applicationinsights.json"

echo "### Configurando Application Insights no standalone.conf ###"

# Verifica se já foi configurado para evitar duplicação
if grep -q "applicationinsights-agent" "$STANDALONE_CONF"; then
  echo "Application Insights já configurado. Pulando."
  exit 0
fi

# Remove configuração do APM Elastic, se houver
sed -i '/elastic-apm-agent/d' "$STANDALONE_CONF"

# Adiciona o agente e proxy após a seção "Specify options to pass to the Java VM"
sed -i "/# Specify options to pass to the Java VM/a \\
JAVA_OPTS=\"\$JAVA_OPTS -javaagent:${AGENT_PATH} -Dapplicationinsights.configuration.file=${JSON_PATH}\"\\
\\
# CONFIGURACAO DE PROXY PARA O APPLICATION INSIGHTS\\
JAVA_OPTS=\"\$JAVA_OPTS -Djava.net.useSystemProxies=false\"\\
JAVA_OPTS=\"\$JAVA_OPTS -Dhttp.proxyHost=proxydes.caixa\"\\
JAVA_OPTS=\"\$JAVA_OPTS -Dhttp.proxyPort=80\"\\
JAVA_OPTS=\"\$JAVA_OPTS -Dhttps.proxyHost=proxydes.caixa\"\\
JAVA_OPTS=\"\$JAVA_OPTS -Dhttps.proxyPort=80\"\\
JAVA_OPTS=\"\$JAVA_OPTS -Dhttp.nonProxyHosts=localhost\|127.0.0.1\|*.caixa\|*.caixa.gov.br\"" \
"$STANDALONE_CONF"

echo "### Configuração concluída ###"
