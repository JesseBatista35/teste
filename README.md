Verificar Falha de sincronização ao publicar aplicação em DES:

https://github.com/caixagithub/sirmc-api-registro-interacoes-clientes/actions/runs/32487917318/job/96789596596


2s
Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/logs@main
Formate ARGO REPOSITORY
0s
Coletando logs dos pods
2s
Run RESOURCE_TREE_URL="https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/sirmc-api-registro-interacoes-clientes-des/resource-tree?appNamespace=openshift-gitops"
  Fazendo requisição para: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/sirmc-api-registro-interacoes-clientes-des/resource-tree?appNamespace=openshift-gitops
  Resource-tree obtido com sucesso
  Filtrando pods e encontrando o mais recente...
  Pod mais recente encontrado: sirmc-api-registro-interacoes-clientes-des-655fbd9f59-snvq2
  URL dos logs: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/sirmc-api-registro-interacoes-clientes-des/logs?appNamespace=openshift-gitops&container=sirmc-api-registro-interacoes-clientes-des&namespace=sirmc-api-registro-interacoes-clientes&follow=false&podName=sirmc-api-registro-interacoes-clientes-des-655fbd9f59-snvq2&tailLines=1000&sinceSeconds=0
  Logs obtidos com sucesso
  Logs do pod sirmc-api-registro-interacoes-clientes-des-655fbd9f59-snvq2:
  ================================================
  Exibindo os Logs:
  container "sirmc-api-registro-interacoes-clientes-des" in pod "sirmc-api-registro-interacoes-clientes-des-655fbd9f59-snvq2" is waiting to start: CreateContainerConfigError
  
  ================================================
  Script executado com sucesso!
  Pod utilizado: sirmc-api-registro-interacoes-clientes-des-655fbd9f59-snvq2
  Falha na sincronização
  Error: Process completed with exit code 1.


  
Podpod
sirmc-api-registro-interacoes-clientes-des-655fbd9f59-snvq2
 SUMMARY EVENTS LOGS
REASON
MESSAGE
COUNT
FIRST OCCURRED
LAST OCCURRED
Pulling
Pulling image "acrcentralcaixanprd.azurecr.io/sirmc/api-registro-interacoes-clientes/sirmc-api-registro-interacoes-clientes:32487917318"
1359
4h ago
Today at 10:44 AM
4m ago
Today at 3:39 PM
Failed
Error: secret "akvs-sirmc-sqlserver-connectionstring" not found
1357
4h ago
Today at 10:44 AM
4m ago
Tod



log:


container "sirmc-api-registro-interacoes-clientes-des" in pod "sirmc-api-registro-interacoes-clientes-des-655fbd9f59-snvq2" is waiting to start: CreateContainerConfigError

  
