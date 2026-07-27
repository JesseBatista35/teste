Pessoal, sobre o deploy do SIGFA-api-aplicacao no ambiente TGE, identificamos 3 problemas distintos na esteira:

1) Task "Create BT Sidecar" falhando com erro "RESOURCE_APP: comando não encontrado" e "resource name may not be empty". A variável RESOURCE_APP não estava sendo reconhecida no script, então o nome do deploymentconfig chegou vazio nos comandos oc, e a task não conseguiu adicionar/recriar o container secrets-agent-sidecar. Isso ainda não foi corrigido, precisa de ajuste no script da task.

2) O deploymentconfig sigfa-api-aplicacao-okd4-pos-tqs estava pausado (paused), por isso o rollout cancel e o rollout latest falhavam. Resolvido com:
oc rollout resume dc/sigfa-api-aplicacao-okd4-pos-tqs -n sigfa-tqs
oc rollout latest dc/sigfa-api-aplicacao-okd4-pos-tqs -n sigfa-tqs

3) Depois do deploy subir, o container secrets-agent-sidecar do pod deu erro client_id parameter is missing ao autenticar no BeyondTrust. Verificamos o variable group SIGFA-API-APLICACAO-BT-VAULT-TGE no Azure DevOps e confirmamos que só existe a variável BT_SECRETS_LIST cadastrada. Faltam as variáveis BT_CLIENT_ID e BT_CLIENT_SECRET, que existem nos grupos equivalentes de DES e PRD (SIGFA-BT-VAULT-SECRET-DES e SIGFA-BT-VAULT-SECRET-PRD) mas não têm um grupo correspondente para TGE.

Precisamos que seja criado o client_id/client_secret do BeyondTrust para a app SIGFA no ambiente TGE (path SIGFA_TGE), para que o time responsável cadastre essas credenciais no grupo de variáveis do TGE.

Jessé Batista / CTIS/CESTI — Esteira DevOps DES TQS NPRD
