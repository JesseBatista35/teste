Favor fornecer  suporte em relação a esteira.:

- A esteira de CI/CD Workflow da erro de dockerfile not found. 

Recurso backend foi criado após REQ000144709677 que solicitei configuração dos templates do GitOps

Cluster do Aks: aks-hab-des
Namespace: sinsh-backend-simulador-pj

https://portal.azure.com/#view/Microsoft_Azure_ContainerService/AksK8ResourceMenuBlade/~/overview-Namespace/aksClusterId/%2Fsubscriptions%2F71c34861-6522-4717-9638-fb82b175936e%2FresourceGroups%2Frg-hab-des%2Fproviders%2FMicrosoft.ContainerService%2FmanagedClusters%2Faks-hab-des/resource~/%7B%22kind%22%3A%22Namespace%22%2C%22metadata%22%3A%7B%22name%22%3A%22sinsh-backend-simulador-pj%22%2C%22uid%22%3A%22b6291b6d-e1c2-49cc-8fbb-77d2aa851061%22%7D%7D/preloadK8sObjectsO11yContext~/%7B%22useUpgradedTier%22%3Afalse%2C%22isK8sObjectsOverviewO11yEnabled%22%3Atrue%7D


<img width="1871" height="959" alt="image" src="https://github.com/user-attachments/assets/fccc8ff5-9aed-4732-97b9-d84306f42c21" />


10m 3s
0s
Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/logs@main
Run echo "REPO_NAME=$(echo 'caixagithub/sinsh-backend-simulador-pj' | cut -d'/' -f2)" >> $GITHUB_ENV
INPUT_IMAGE_TAG: '29035105232'
Run RESOURCE_TREE_URL="https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/sinsh-backend-simulador-pj-des/resource-tree?appNamespace=openshift-gitops"
Fazendo requisição para: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/sinsh-backend-simulador-pj-des/resource-tree?appNamespace=openshift-gitops
Resource-tree obtido com sucesso
Filtrando pods e encontrando o mais recente...
Pod mais recente encontrado: sinsh-backend-simulador-pj-des-6476c6545b-bm52g
URL dos logs: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/sinsh-backend-simulador-pj-des/logs?appNamespace=openshift-gitops&container=sinsh-backend-simulador-pj-des&namespace=sinsh-backend-simulador-pj&follow=false&podName=sinsh-backend-simulador-pj-des-6476c6545b-bm52g&tailLines=1000&sinceSeconds=0
Logs obtidos com sucesso
Logs do pod sinsh-backend-simulador-pj-des-6476c6545b-bm52g:
================================================
Exibindo os Logs:
info: Microsoft.Hosting.Lifetime[14]
      Now listening on: http://[::]:8080
info: Microsoft.Hosting.Lifetime[0]
      Application started. Press Ctrl+C to shut down.
info: Microsoft.Hosting.Lifetime[0]
      Hosting environment: Production
info: Microsoft.Hosting.Lifetime[0]
      Content root path: /app
warn: Microsoft.AspNetCore.HttpsPolicy.HttpsRedirectionMiddleware[3]
      Failed to determine the https port for redirect.

================================================
Script executado com sucesso!
Pod utilizado: sinsh-backend-simulador-pj-des-6476c6545b-bm52g
Falha na sincronização
Error: Process completed with exit code 1.


AGORA TA MOSTRANDO OUTRO ERRO:

