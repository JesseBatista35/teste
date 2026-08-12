Identificado que o workflow CI/CD (GitHub Actions) do repositório sigos-processamento-arquivos possuía apenas o job CI_DES, configurado com DEPLOY_ENVIRONMENTS: '["DES"]', sem job correspondente para o ambiente TQS — causa raiz da indisponibilidade do ambiente TQS no CI/CD Workflow. Validado que a estrutura GitOps (ArgoCD Application e manifests em infranprd) para o ambiente TQS já estava corretamente configurada, não havendo impacto nessa camada.

Ajuste realizado no arquivo de workflow (.github/workflows/) adicionando job CI_TQS com DEPLOY_ENVIRONMENTS: '["TQS"]', replicando o padrão já existente para DES. Commit efetuado e Pull Request aberto para avaliação do time responsável pelo repositório.

Status atual:

PR aguardando:

Aprovação de reviewer com write access (bloqueio: mudanças exigem aprovação de alguém além do último autor do push);
Conclusão do check obrigatório "QA / Quality Assurance";
Resultado do code scanning (CodeQL) para os commits 94ac499 e 747f39c.

Encaminhamento: demanda pendente de aprovação/merge pelo time de desenvolvimento (squad dono do repositório). Esteira DevOps sem pendência técnica adicional no momento.
