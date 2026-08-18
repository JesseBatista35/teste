Encerramento de Chamado — WO

Sistema: SIACI-API-Worker-Auditoria
Ambiente: TQS
Namespace: siaci-api-worker-auditoria

Descrição do problema:
Falha recorrente de sincronização no ArgoCD (Application siaci-api-worker-auditoria-tqs), com status SyncError no commit 886600c. Erro reportado pelo admission webhook do Istio: configuration is invalid: port number 0 must be in the range 1..65535.

Causa raiz:
Indentação incorreta no bloco istio do values.yaml (chart caixa-base-chart, ambiente TQS). As chaves prefix e targetPort estavam aninhadas incorretamente dentro do segundo item da lista servers (referente à porta 443/HTTPS), em vez de estarem no nível do item internal da lista istio. Isso fazia com que o template não localizasse o valor de targetPort para o server HTTP (porta 80), gerando port: {} no VirtualService siaci-api-worker-auditoria-tqs-internal — interpretado como porta 0 e rejeitado pelo webhook de validação do Istio.

Correção aplicada:
Ajustada a indentação do bloco istio no values.yaml do ambiente TQS, alinhando a estrutura com o padrão já validado e funcional do ambiente DES (chaves prefix e targetPort posicionadas no nível correto, fora do escopo do server HTTPS).

Validação:

Commit e3492dd sincronizado com sucesso via ArgoCD (Sync OK).
Application siaci-api-worker-auditoria-tqs: APP HEALTH = Healthy.
Recursos Gateway e VirtualService (siaci-api-worker-auditoria-tqs-internal) sincronizados sem erros.
Pod siaci-api-worker-auditoria-tqs-76755fdc77-v4njv em execução (1/1 Running).
Pipeline GitHub Actions (ArgoCD_Deploy (TQS)) concluído com sucesso.

Status: Resolvido.

Jessé Batista
CTIS/CESTI — Esteira DevOps DES TQS NPRD
