ssunto: Falha em Action de publicação APIM — runner sem acesso à VNET (host interno não resolve)

Olá, pessoal do time de Nuvem,

Estamos com falha na execução da Action de publicação no APIM do repositório sirmc-api-emailmarketing-rastreamento (workflow reutilizável generic-apim.yaml, em DevSecOps-Solutions).

O erro ocorre no step "Publish API to APIM", ao tentar validar a URL do Swagger interno:

http://sirmc-api-emailmarketing-rastreamento.apl.des.private.azure/swagger/v1/swagger.json

Retorno: httpStatus=000, Error: Process completed with exit code 6 (curl: Could not resolve host).

Esse host é o ingress interno do Istio, resolvido via Private DNS Zone vinculada à VNET do cluster aks-crm-nprd. A configuração da zone/DNS foi validada e está correta.

Pela sequência do log (instalação do Az CLI via curl público, apt do Ubuntu, download de kubectl/kubelogin direto do GitHub releases), o job parece estar executando em um runner GitHub-hosted, sem peering/link com a VNET do aks-crm-nprd — por isso a resolução do host interno falha.

Solicitamos verificação de qual runner está configurado no workflow generic-apim.yaml (repositório DevSecOps-Solutions) e se ele possui rota/DNS para a VNET do cluster aks-crm-nprd.
