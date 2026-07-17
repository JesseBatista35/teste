<img width="1507" height="794" alt="image" src="https://github.com/user-attachments/assets/cd4fc4ea-0307-4281-b9cd-95673dee881d" />


eu ja fiz o ajustes do clustre para des e tqs acredito que tqs jaja aparece aqui


masi agora ta dano esse erro aqui:


NotTriggerScaleUp
pod didn't trigger scale-up: 9 node(s) had untolerated taint(s), 1 max node group size reached
54
11m ago
Today at 4:41 PM
1m ago
Today at 4:51 PM
FailedScheduling
0/17 nodes are available: 17 node(s) had untolerated taint(s). no new claims to deallocate, preemption: 0/17 nodes are available: 17 Preemption is not helpful for scheduling.
6m ago
Today at 4:46 PM
6m ago
Today at 4:46 PM
FailedScheduling
0/17 nodes are available: 17 node(s) had untolerated taint(s). no new claims to deallocate, preemption: 0/17 nodes 



Run caixagithub/DevSecOps-Actions/.github/integrations/argocd/logs@main
Run echo "REPO_NAME=$(echo 'caixagithub/siaci-api-integracao-padrao-java' | cut -d'/' -f2)" >> $GITHUB_ENV
INPUT_IMAGE_TAG: '29608138060'
Run RESOURCE_TREE_URL="https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/siaci-api-integracao-padrao-java-des/resource-tree?appNamespace=openshift-gitops"
Fazendo requisição para: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/siaci-api-integracao-padrao-java-des/resource-tree?appNamespace=openshift-gitops
Resource-tree obtido com sucesso
Filtrando pods e encontrando o mais recente...
Pod mais recente encontrado: siaci-api-integracao-padrao-java-des-548cf996b4-c4tcs
URL dos logs: https://openshift-gitops-server-openshift-gitops.apps.aroidpprd.brazilsouth.aroapp.io/api/v1/applications/siaci-api-integracao-padrao-java-des/logs?appNamespace=openshift-gitops&container=siaci-api-integracao-padrao-java-des&namespace=siaci-api-integracao-padrao-java&follow=false&podName=siaci-api-integracao-padrao-java-des-548cf996b4-c4tcs&tailLines=1000&sinceSeconds=0
Logs obtidos com sucesso
Logs do pod siaci-api-integracao-padrao-java-des-548cf996b4-c4tcs:
================================================
Exibindo os Logs:

================================================
Script executado com sucesso!
Pod utilizado: siaci-api-integracao-padrao-java-des-548cf996b4-c4tcs
Falha na sincronização
Error: Process completed with exit code 1.
