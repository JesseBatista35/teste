Situação: Resolvido.

Causa raiz:
Ambiente TQS ativado pelo template Fusionx/Backstage sem nunca ter sido efetivamente utilizado (primeira ativação, confirmado com o demandante). O values-tqs.yaml permanecia com placeholders de imagem não substituídos pela pipeline (TQS ausente do DEPLOY_ENVIRONMENTS do workflow), causando falha de pull de imagem (UNAUTHORIZED) e, em paralelo, falha de permissão ao consultar a Application no ArgoCD.

Ação tomada:
A pedido do demandante, o ambiente TQS foi desativado. Removida a pasta tqs/ (config.yaml e values.yaml) dos repositórios siopi-backend-jornada-pj-infranprd e gitops/apps/siopi-backend-jornada-pj. Após um novo ciclo de sync/deploy (disparado manualmente via pipeline), a Application siopi-backend-jornada-pj-tqs foi removida automaticamente pelo ArgoCD, permanecendo apenas o ambiente DES ativo, conforme solicitado.

Encerramento: W.O. concluída. Reativação futura do TQS, se necessária, requer restaurar a pasta tqs/ nos repositórios de infra/gitops e incluir "TQS" no DEPLOY_ENVIRONMENTS do workflow antes do primeiro sync.
