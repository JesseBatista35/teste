Ronaldo, sobre o Application Insights: como o agente precisa passar pelo proxydes.caixa pra enviar telemetria pra Azure, e você já solicitou a liberação dessa regra, ainda vamos precisar aguardar a conclusão dessa REQ antes de conseguir validar se está tudo funcionando corretamente.

Também seguimos aguardando a conclusão do chamado de aporte de memória (12GB) — a VM atual tem apenas 3,6Gi e não sobe com o heap de 4096m configurado, então o ambiente SIATD-intranet-vm em DES permanece indisponível até isso ser resolvido.

Assim que as duas pendências forem concluídas, faço um novo deploy e validamos tudo.
