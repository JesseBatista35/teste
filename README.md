ASSUNTO: Deploy Sicia Frontend TQS - Resolução de Timeout

DESCRIÇÃO DO PROBLEMA RESOLVIDO:

Os timeouts ocorriam devido a limitação de ResourceQuota no namespace 
sicia-tqs, que estava configurado com limite de CPU de apenas 4 cores, 
tendo 3.5 cores já alocados.

SOLUÇÃO APLICADA:

1. Aumentado ResourceQuota do namespace sicia-tqs:
   - limits.cpu: 4 → 10 cores
   - limits.memory: 8Gi → mantido (suficiente)
   - pods: 8 → mantido (suficiente)

2. Limpeza de ReplicationControllers antigos que falharam:
   - Deletado: sicia-frontend-tqs-10
   - Deletado: sicia-frontend-tqs-11

3. Novo deployment acionado (versão 12)

RESULTADO FINAL:

✅ Pod sicia-frontend-tqs-12-ljm7t subiu com sucesso
✅ Aplicação respondendo normalmente (HTTP 200)
✅ Health checks passando
✅ Nginx operacional
✅ Prometheus exporter ativo

STATUS: RESOLVIDO ✓

Comandos executados:
- oc patch resourcequota quota-resources -n sicia-tqs -p '{"spec":{"hard":{"limits.cpu":"10"}}}'
- oc delete rc -n sicia-tqs sicia-frontend-tqs-11
- oc rollout latest dc/sicia-frontend-tqs -n sicia-tqs


Conforme regras da Caixa, não é permitido atender dois ambientes 
(Frontend + Backend) em uma única WO.

Para o SICIA-BACKEND-TQS será necessária a ABERTURA DE UMA NOVA 
REQUISIÇÃO/WO separada.

Obs: O mesmo problema de ResourceQuota pode estar afetando o backend.
Sugerimos verificar:

oc describe resourcequota -n sicia-tqs
oc get pods -n sicia-tqs | grep backend
