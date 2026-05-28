Contexto completo — sigec-opf DES e TQS (28/05/2026)

Ambiente DES — Deploy bloqueado por falta de CPU
O que aconteceu:
Novos deploys falhavam desde o início da tarde. ArgoCD mostrava o app como Degraded com dois pods travados em Progressing há mais de 1 hora.
Causa raiz:
O cluster ARO (aroidpprd) estava sem CPU disponível no nodepool Spot. O autoscaler havia atingido o limite máximo de nós e não conseguia expandir. Durante o rolling update, o Kubernetes precisava de CPU para dois pods simultâneos e nunca conseguia agendar o novo.
Erro: 0/4 nodes available — 2 Insufficient cpu — max node group size reached
O que foi feito:
Ajuste no values.yaml do DES no GitOps para matar o pod antigo antes de subir o novo:
yamlstrategy:
  maxSurge: 0%
  maxUnavailable: 100%
Time de infraestrutura aumentou o max node count do nodepool Spot.
Resultado: App voltou como Healthy às 18:39.

Ambiente TQS — Secret faltando após criação do ambiente
O que aconteceu:
O ambiente TQS foi criado recentemente e os deploys falham com o pod não conseguindo iniciar.
Causa raiz:
Durante a criação do ambiente TQS, o secret apim-tqs-caixa não foi provisionado no Key Vault kv-crc-nprd. O componente FusionX (akv2k8s) tenta injetar esse secret como variável de ambiente no pod mas recebe 404 do vault e aborta a inicialização.
Erro no log FusionX:
GET https://kv-crc-nprd.vault.azure.net/secrets/apim-tqs-caixa/
RESPONSE 404 — SecretNotFound
azurekeyvaultsecret="sigec-opf/akvs-api-tqs-caixa"
Pendência para amanhã:
Criar o secret apim-tqs-caixa no Key Vault kv-crc-nprd com a chave APIM do ambiente TQS — ou verificar se ele foi criado com outro nome e corrigir o manifesto akvs-api-tqs-caixa.yaml no GitOps.
Responsável: Time que gerencia o Key Vault / provisionamento do ambiente TQS.
