Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
silce-backend-valida-assinatura
Repository navigation
Code
Issues
Pull requests
2
 (2)
Actions
Projects
Models
Wiki
Security and quality
5
 (5)
Insights
Settings
CI/CD Workflow Generic
caixagithub/silce-backend-valida-assinatura_main_30029704866.7 #7
All jobs
Run details
Annotations
1 error and 1 warning
deploy - [silce-backend-valida-assinatura] / ArgoCD_Deploy / ArgoCD_Deploy (DES)
failed 3 hours ago in 3m 3s
Search logs
13s
0s
0s
0s
0s
0s
0s
0s
0s
0s
0s
0s
31s
0s
5s
0s
4s
0s
1s
0s
21s
4s
0s
0s
1s
1m 20s
1s
16s
Publish API to APIM
1s
Run set -x  # Ativa o modo de depuração
    set -x  # Ativa o modo de depuração
    echo "Iniciando a publicação da API para APIM..."
    
    swaggerUrl="http://silce-backend-valida-assinatura.apl.des-nprd.private.azure/q/openapi"
    echo "Verificando a URL do Swagger: $swaggerUrl"
    httpStatus=$(curl -k --max-time 10 --write-out "%{http_code}" --silent --output /dev/null $swaggerUrl)
    echo "HTTP STATUS=$httpStatus"
    
    if [ "$httpStatus" -eq 200 ]; then
      echo "Swagger JSON encontrado na URL padrão. Prosseguindo com a validação..."
      curl -k -o swagger.json "$swaggerUrl"
      echo "Swagger JSON baixado com sucesso."
    
      az apim api import --api-id silce-backend-valida-assinatura \
      --resource-group rg-silce-des \
      --service-name apim-silce-des \
      --service-url http://silce-backend-valida-assinatura.apl.des-nprd.private.azure \
      --path loterias-web/valida-assinatura \
      --specification-format "OpenApi" \
      --specification-path swagger.json \
      --display-name silce-backend-valida-assinatura \
      --subscription-required false --verbose
      echo "API importada com sucesso no APIM."
    
      echo "Acesse: http://silce-backend-valida-assinatura.apl.des-nprd.private.azure/q/openapi"
    
    else
      echo "Swagger JSON não encontrado ou erro ao acessar $swaggerUrl. Código de status HTTP: $httpStatus. A publicação foi cancelada."
      exit 1
    fi
    set +x  # Desativa o modo de depuração
    shell: /usr/bin/bash --noprofile --norc -e -o pipefail {0}
    env:
      APIM_VERSIONAPI: 
      APIM_displaynameAPI: 
      APIM_PATH: 
      APIM_SWAGGERPATH: 
      APIM_TAGSAPI: 
      APIM_POLICIESALLOPERATIONSPATH: 
      environment: des
      repository_suffix: infranprd
      REPO: silce-backend-valida-assinatura
      JOB_ID: 121947
      ARGOCD_AUTH_TOKEN: ***
      REPO_NAME: silce-backend-valida-assinatura
      AMBIENTE_LOWER: des
  + echo 'Iniciando a publicação da API para APIM...'
  Iniciando a publicação da API para APIM...
  Verificando a URL do Swagger: http://silce-backend-valida-assinatura.apl.des-nprd.private.azure/q/openapi
  + swaggerUrl=http://silce-backend-valida-assinatura.apl.des-nprd.private.azure/q/openapi
  + echo 'Verificando a URL do Swagger: http://silce-backend-valida-assinatura.apl.des-nprd.private.azure/q/openapi'
  ++ curl -k --max-time 10 --write-out '%{http_code}' --silent --output /dev/null http://silce-backend-valida-assinatura.apl.des-nprd.private.azure/q/openapi
  + httpStatus=000
  Error: Process completed with exit code 6.
0s
0s
0s
0s
0s
0s
1s
0s
0s
