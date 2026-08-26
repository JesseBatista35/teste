Aqui está uma descrição pronta pra colar no chamado:

Descrição da necessidade:

Chamado aberto relatando geração de grande quantidade de pods no worker sigos-batch-worker-elegiveis (ambiente NPRD) e suposto mau funcionamento, mesmo após aumento do intervalo de execução do worker para 60 minutos.

Após análise técnica:

ArgoCD — as aplicações sigos-batch-worker-elegiveis-des e sigos-batch-worker-elegiveis-tqs estão com status Healthy e Synced, sem erros de sincronização.
O único warning presente refere-se a uma falha de resolução DNS do plugin de Kubernetes do Backstage ao consultar limitranges no endpoint privado do AKS (getaddrinfo ENOTFOUND dns-aks-edo-nprd-xvisbwnf.hcp.brazilsouth.azmk8s.io) — trata-se de um problema de conectividade/DNS do próprio Backstage com o cluster, sem relação com o funcionamento da aplicação.
GitHub Actions — o histórico do workflow CI/CD Workflow Generic mostra múltiplas execuções manuais recentes do pipeline, o que explica a criação de novos ReplicaSets/pods a cada deploy — comportamento esperado de rollout, não uma falha da aplicação.

Não foi identificada nenhuma falha real na aplicação, infraestrutura ou pipeline. A percepção de "grande quantidade de pods" está associada ao histórico de ReplicaSets retidos por deploys frequentes, e não a pods ativos com problema.

Encaminhamento: solicito o encerramento do chamado como sem falha identificada (comportamento esperado). Caso a demandante identifique um sintoma específico e reproduzível (ex.: erro em log, pod em CrashLoopBackOff), favor reabrir com esse detalhe para nova análise.
