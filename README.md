Se ele confirmar que quer SISAG-PROV, o comando para alterar é simples:
bashsed -i 's/"name": "SISAG-PROVISIONAMENTO-SAQUE-BACKEND-DES"/"name": "SISAG-PROV"/' /opt/azure/config/appinsights/applicationinsights.json
Depois verifica se ficou certo:
bashcat /opt/azure/config/appinsights/applicationinsights.json
