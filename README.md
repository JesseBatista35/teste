Prezados,

Identificado que a aplicação sirmc-frontend-campanhas-gestao não realiza o deploy em ambiente TQS pois não existe destino provisionado para esse ambiente.

Verificado o seguinte:

No Centro do Kubernetes (Azure), o subscription BOX - Dados possui apenas os clusters aks-sicrm-des e aks-sicrm-prd. Não existe cluster AKS provisionado para o ambiente TQS.
No repositório GitOps (gitops/apps/sirmc-frontend-campanhas-gestao), existem apenas as pastas des e prd. Não existe a pasta tqs com o respectivo config.yaml apontando o destination do ArgoCD.
Como consequência, o pipeline de deploy falha ao consultar a Application no ArgoCD Server com o erro permission denied, pois a Application sirmc-frontend-campanhas-gestao-tqs não está registrada.

Cheguei a criar manualmente a pasta tqs no repositório GitOps para teste, porém revertida a alteração em seguida, visto que esse repositório é de alta criticidade e edições manuais podem quebrar as automações existentes nos merges.

Solicito ao time de Nuvem a avaliação e execução dos seguintes pontos:

Provisionamento do cluster AKS para o ambiente TQS
Criação padronizada da pasta tqs no repositório GitOps infranprd, com o config.yaml correto apontando o destination do novo cluster
Registro do destination e da Application sirmc-frontend-campanhas-gestao-tqs no ArgoCD, com o AppProject e RBAC liberando o acesso via pipeline

Ficamos no aguardo do retorno para prosseguirmos com o deploy em TQS.

Atenciosamente,
Jessé Batista / CTIS/CESTI — Esteira DevOps DES TQS NPRD
