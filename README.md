Está apresentando erro para rodar a pipeline no github do projeto silce-carrinho:

https://github.com/caixagithub/silce-carrinho/actions/runs/29845763509/job/88928079012

Logs do pod otel-silce-carrinho-des-56cfd9f455-wbtpv:
================================================
Exibindo os Logs:
container silce-carrinho-des is not valid for pod otel-silce-carrinho-des-56cfd9f455-wbtpv

================================================
Script executado com sucesso!
Pod utilizado: otel-silce-carrinho-des-56cfd9f455-wbtpv
Falha na sincronização
Error: Process completed with exit code 1.


Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/logs@main
Run echo "REPO_NAME=$(echo 'caixagithub/silce-carrinho' | cut -d'/' -f2)" >> $GITHUB_ENV
INPUT_IMAGE_TAG: '29845763509'
Run RESOURCE_TREE_URL="https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/silce-carrinho-des/resource-tree?appNamespace=openshift-gitops"
Fazendo requisição para: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/silce-carrinho-des/resource-tree?appNamespace=openshift-gitops
Resource-tree obtido com sucesso
Filtrando pods e encontrando o mais recente...
Pod mais recente encontrado: otel-silce-carrinho-des-56cfd9f455-wbtpv
URL dos logs: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/silce-carrinho-des/logs?appNamespace=openshift-gitops&container=silce-carrinho-des&namespace=silce-carrinho&follow=false&podName=otel-silce-carrinho-des-56cfd9f455-wbtpv&tailLines=1000&sinceSeconds=0
Logs obtidos com sucesso
Logs do pod otel-silce-carrinho-des-56cfd9f455-wbtpv:
================================================
Exibindo os Logs:
container silce-carrinho-des is not valid for pod otel-silce-carrinho-des-56cfd9f455-wbtpv

================================================
Script executado com sucesso!
Pod utilizado: otel-silce-carrinho-des-56cfd9f455-wbtpv
Falha na sincronização
Error: Process completed with exit code 1.


