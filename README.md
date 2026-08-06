Segue a nota formal, em texto puro (sem markdown), pronta pra colar na OS/chamado:

Assunto: Indisponibilidade de agendamento de pods no cluster AKS aks-edo-nprd - impacto em múltiplos sistemas

Prezados,

Identificamos falha de agendamento (scheduling) afetando múltiplos sistemas no cluster AKS aks-edo-nprd, ambiente TQS/DES. O sintoma inicial foi reportado na esteira DevOps do sistema SIBKO (pipeline sibko-pos-venda-api, PR 344, execução 31125472127), onde a etapa de QA permanece presa no status "Waiting for a runner to pick up this job" ha mais de 2 horas, indicando que o runner do GitHub Actions Runner Controller (label arc-runner-set-default-nprod) nao esta conseguindo ser agendado em nenhum no do cluster.

Ao consultar os eventos do cluster via portal Azure, identificamos que o problema nao e especifico do runner, mas sim uma condicao geral do cluster. O evento abaixo se repete de forma recorrente desde aproximadamente 20:04 (horario de Brasilia) do dia 06/08/2026, afetando pods de diversos sistemas:

0/19 nodes are available: 19 node(s) had untolerated taint(s). no new claims to deallocate, preemption: 0/19 nodes are available: 19 Preemption is not helpful for scheduling.

Sistemas e workloads impactados nos eventos coletados: sibko-originacao-digital-cron, sibko-pos-venda-asyncapi, sibko-sibko-api, sidgc-registro-eletronico-cron, sidgc-shared, siidx-shared, siidx-assinador-api-neosigner, simtr-backend-pre-validacao-bff, simtr-pre-validacao-doctree, simtr-backend-pre-validacao-core-ia, alem do runner de QA do GitHub Actions (arc-runner-set-default-nprod).

Adicionalmente, foi observada uma sequencia de eventos NodeNotReady por volta de 20:23, atingindo multiplos nos e componentes de sistema (kube-proxy, csi-azuredisk-node, ama-logs, ama-metrics-node, secrets-store-csi-driver, entre outros), sugerindo instabilidade ou reciclagem de nos no cluster proximo ao horario em que o problema comecou a se manifestar.

Diante do exposto, solicitamos que a equipe de Nuvem Publica verifique:

Se todos os 19 nos do cluster aks-edo-nprd estao atualmente com taints que impedem o agendamento normal de workloads (possivelmente relacionado a taint de Spot Instance kubernetes.azure.com/scalesetpriority=spot ou taint de nodepool aplicado incorretamente apos reciclagem de nos).
Se houve evento de manutencao, upgrade, rotacao de nos Spot ou escala automatica que tenha originado nos sem a configuracao de taint/toleration esperada.
Se o node pool responsavel pelos runners do GitHub Actions (label arc-runner-set-default-nprod) esta disponivel e com capacidade de escala.

Este problema tem carater urgente por impactar multiplas esteiras e aplicacoes simultaneamente, nao se restringindo ao pipeline do SIBKO.

Ficamos a disposicao para fornecer prints adicionais dos eventos do cluster, se necessario.

Atenciosamente,
Jesse Batista
Analista de Esteiras - CTIS/CESTI
Esteira DevOps DES TQS NPRD - Caixa Economica Federal
