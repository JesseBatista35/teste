Tentativa 30 - Phase: Succeeded, Health: Progressing, Sync: Synced, Argo_Tag: 28187675677, Image_Tag: 28188889097
0s
Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/logs@main
Run echo "REPO_NAME=$(echo 'caixagithub/sipgs-batch-poc' | cut -d'/' -f2)" >> $GITHUB_ENV
INPUT_IMAGE_TAG: '28188889097'
Run RESOURCE_TREE_URL="https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/sipgs-batch-poc-des/resource-tree?appNamespace=openshift-gitops"
  RESOURCE_TREE_URL="https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/sipgs-batch-poc-des/resource-tree?appNamespace=openshift-gitops"
  echo "Fazendo requisição para: ${RESOURCE_TREE_URL}"
  
  RESOURCE_TREE_JSON=$(curl -s -H "Authorization: ***" "${RESOURCE_TREE_URL}")
  if [ $? -ne 0 ]; then
    echo "Erro ao fazer requisição para o resource-tree"
    exit 1
  fi
  
  echo "Resource-tree obtido com sucesso"
  
  echo "Filtrando pods e encontrando o mais recente..."
  
  LATEST_POD=$(echo "$RESOURCE_TREE_JSON" | jq -r '
    .nodes // [] |
    map(select(.kind == "Pod" and .createdAt != null)) |
    sort_by(.createdAt) |
    last |
    .name // empty
  ')
  
  if [ -z "$LATEST_POD" ]; then
    echo "Nenhum pod encontrado ou JSON não contém dados esperados"
    exit 0
  fi
  
  echo "Pod mais recente encontrado: ${LATEST_POD}"
  
  LOGS_URL="https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/sipgs-batch-poc-des/logs?appNamespace=openshift-gitops&container=sipgs-batch-poc-des&namespace=sipgs-batch-poc&follow=false&podName=${LATEST_POD}&tailLines=1000&sinceSeconds=0"
  echo "URL dos logs: ${LOGS_URL}"
  
  LOGS_RESPONSE=$(curl -s -H "Authorization: ***" "${LOGS_URL}")
  
  if [ $? -ne 0 ]; then
    echo "Erro ao obter logs do pod"
    exit 1
  fi
  
  echo "Logs obtidos com sucesso"
  echo "Logs do pod ${LATEST_POD}:"
  echo "================================================"
  
  echo "Exibindo os Logs:"
  echo "$LOGS_RESPONSE" | jq -r '.result.content'
  
  echo "================================================"
  echo "Script executado com sucesso!"
  echo "Pod utilizado: ${LATEST_POD}"
  
  if [ "false" = "false" ]; then
    echo "Falha na sincronização"
    exit 1
  fi
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
    REPO: sipgs-batch-poc
    JOB_ID: 111665
    ARGOCD_AUTH_TOKEN: ***
    REPO_NAME: sipgs-batch-poc
    AMBIENTE_LOWER: des
Fazendo requisição para: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/sipgs-batch-poc-des/resource-tree?appNamespace=openshift-gitops
Resource-tree obtido com sucesso
Filtrando pods e encontrando o mais recente...
Pod mais recente encontrado: sipgs-batch-poc-des-6946f896bc-h868r
URL dos logs: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/sipgs-batch-poc-des/logs?appNamespace=openshift-gitops&container=sipgs-batch-poc-des&namespace=sipgs-batch-poc&follow=false&podName=sipgs-batch-poc-des-6946f896bc-h868r&tailLines=1000&sinceSeconds=0
Logs obtidos com sucesso
Logs do pod sipgs-batch-poc-des-6946f896bc-h868r:
================================================
Exibindo os Logs:
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v4.1.0)
2026-06-25T17:47:56.028Z  INFO 1 --- [           main] b.gov.caixa.batch.SipgsBatchApplication  : Starting SipgsBatchApplication v1.0.0.0-SNAPSHOT using Java 21.0.11 with PID 1 (/app/app.jar started by springuser in /app)
2026-06-25T17:47:56.040Z  INFO 1 --- [           main] b.gov.caixa.batch.SipgsBatchApplication  : No active profile set, falling back to 1 default profile: "default"
2026-06-25T17:47:59.643Z  INFO 1 --- [           main] b.gov.caixa.batch.SipgsBatchApplication  : Started SipgsBatchApplication in 7.094 seconds (process running for 9.993)
2026-06-25T17:47:59.724Z  INFO 1 --- [           main] o.s.b.b.a.JobLauncherApplicationRunner   : Running default command line with: []
================================================
Script executado com sucesso!
Pod utilizado: sipgs-batch-poc-des-6946f896bc-h868r
Falha na sincronização
Error: Process completed with exit code 1.



REASON
MESSAGE
COUNT
FIRST OCCURRED
LAST OCCURRED
BackOff
Back-off restarting failed container sipgs-batch-poc-des in pod sipgs-batch-poc-des-6946f896bc-h868r_sipgs-batch-poc(448e2603-286e-4206-af46-d2a8e1834fea)
28
24m ago
Today at 2:41 PM
36s ago
Today at 3:05 PM
Pulling
Pulling image "027574771582.dkr.ecr.sa-east-1.amazonaws.com/sipgs/batch-poc/sipgs-batch-poc:28188889097"
10
24m ago
Today at 2:40 PM
2m ago
Today at 3:03 PM
Pulled
Successfully pulled image "027574771582.dkr.ecr.sa-east-1.amazonaws.com/sipgs/batch-poc/sipgs-batch-poc:28188889097" in 149ms (149ms including waiting). Image size: 222302511 bytes.
1
18m ago
Today at 2:47 PM
18m ago
Today at 2:47 PM
Created
Container created
6
24m ago
Today at 2:40 PM
21m ago
Today at 2:44 PM
Started
Container started
6
24m ago
Today at 2:40 PM
21m ago
Today at 2:44 PM
Pulled
Successfully pulled image "027574771582.dkr.ecr.sa-east-1.amazonaws.com/sipgs/batch-poc/sipgs-batch-poc:28188889097" in 131ms (131ms including waiting). Image size: 222302511 bytes.
1
21m ago
Today at 2:44 PM
21m ago
Today at 2:44 PM
Pulled
Successfully pulled image "027574771582.dkr.ecr.sa-east-1.amazonaws.com/sipgs/batch-poc/sipgs-batch-poc:28188889097" in 112ms (112ms including waiting). Image size: 222302511 bytes.
1
22m ago
Today at 2:43 PM
22m ago
Today at 2:43 PM
Pulled
Successfully pulled image "027574771582.dkr.ecr.sa-east-1.amazonaws.com/sipgs/batch-poc/sipgs-batch-poc:28188889097" in 116ms (116ms including waiting). Image size: 222302511 bytes.
1
23m ago
Today at 2:42 PM
23m ago
Today at 2:42 PM
Pulled
Successfully pulled image "027574771582.dkr.ecr.sa-east-1.amazonaws.com/sipgs/batch-poc/sipgs-batch-poc:28188889097" in 126ms (126ms including waiting). Image size: 222302511 bytes.
1
24m ago
Today at 2:41 PM
24m ago
Today at 2:41 PM
Pulled
Successfully pulled image "027574771582.dkr.ecr.sa-east-1.amazonaws.com/sipgs/batch-poc/sipgs-batch-poc:28188889097" in 119ms (119ms including waiting). Image size: 222302511 bytes.
1
24m ago
Today at 2:41 PM
24m ago
Today at 2:41 PM
Pulled
Successfully pulled image "027574771582.dkr.ecr.sa-east-1.amazonaws.com/sipgs/batch-poc/sipgs-batch-poc:28188889097" in 5.973s (5.973s including waiting). Image size: 222302511 bytes.
1
24m ago
Today at 2:40 PM
24m ago
Today at 2:40 PM
Scheduled
Successfully assigned sipgs-batch-poc/sipgs-batch-poc-des-6946f896bc-h868r to ip-10-249-73-127.sa-east-1.compute.internal
1
25m ago
Today at 2:40 PM
25m ago
Today at 2:40 PM





  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v4.1.0)

2026-06-25T18:03:51.738Z  INFO 1 --- [           main] b.gov.caixa.batch.SipgsBatchApplication  : Starting SipgsBatchApplication v1.0.0.0-SNAPSHOT using Java 21.0.11 with PID 1 (/app/app.jar started by springuser in /app)
2026-06-25T18:03:51.823Z  INFO 1 --- [           main] b.gov.caixa.batch.SipgsBatchApplication  : No active profile set, falling back to 1 default profile: "default"
2026-06-25T18:03:55.891Z  INFO 1 --- [           main] b.gov.caixa.batch.SipgsBatchApplication  : Started SipgsBatchApplication in 7.152 seconds (process running for 10.17)
2026-06-25T18:03:55.926Z  INFO 1 --- [           main] o.s.b.b.a.JobLauncherApplicationRunner   : Running default command line with: []
