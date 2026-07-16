1 - Prezados, ao tentar rodar a seguinte ralease em TQS, foi apresentado erro nos passos referentes ao BeyondTrust do módulo "sidce-conta-destino":

https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=500943&environmentId=2327713

Apesar de o erro ser apresentado na etapa "Create BT Sidecar", já na etapa "Create BT Secret" é criada a Secret "'bt-client-secret-'" ao invés de "bt-client-secret-sidce-back-tqs" como é criado em DES com o devido namespace.

***********************************************
2 - Esse erro já aconteceu e foi corrigido no módulo "sidce-back", mas após a correção acontece o erro na etapa "Atualizando Variáveis de Ambiente".

https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=500938&environmentId=2327690


o erro atual erra esse , mais quano pegue na esteira naao estva assim 

