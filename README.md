Passo 2 — Copia o novo jar e faz backup:
bashcp /opt/azure/config/appinsights/applicationinsights-agent-3.3.1.jar /opt/azure/config/appinsights/applicationinsights-agent-3.3.1.jar.bkp
cp /tmp/applicationinsights-agent-3.7.8.jar /opt/azure/config/appinsights/applicationinsights-agent-3.7.8.jar
Passo 3 — Dá permissão:
bashchmod 644 /opt/azure/config/appinsights/applicationinsights-agent-3.7.8.jar
Passo 4 — Confirma:
bashls -la /opt/azure/config/appinsights/
Cola o resultado que aí vemos se precisa atualizar o apontamento no domain.xml! 🎯
