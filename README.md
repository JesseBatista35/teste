Prezados,

A etapa de QA da esteira do sistema SIBKO esta parada ha mais de 2h em "Waiting for a runner to pick up this job" (execucao 31125472127, PR 344, label arc-runner-set-default-nprod).

Verificamos os eventos do cluster aks-edo-nprd (portal Azure) e constatamos que os 19 nos do cluster estao recusando o agendamento de pods por taint nao tolerado:

0/19 nodes are available: 19 node(s) had untolerated taint(s).

Esse mesmo erro atinge tambem outros sistemas (sidgc, siidx, simtr), o que indica problema no cluster e nao no pipeline do SIBKO.

Solicitamos verificacao da equipe de Nuvem Publica quanto aos taints aplicados nos nos do cluster aks-edo-nprd e disponibilidade do node pool do runner (arc-runner-set-default-nprod), para desbloqueio da esteira.

Atenciosamente,
Jesse Batista
Analista de Esteiras - CTIS/CESTI
