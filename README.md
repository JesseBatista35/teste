Nota de fechamento:

Ambiente TQS habilitado com sucesso no CI/CD do repositório sigos-processamento-arquivos / sigos-backend-processamento-arquivos.

Resumo:

Ajustado o workflow (call-generic-pipelines.yaml) para incluir o deploy em TQS junto com DES.
Corrigido travamento de checks obrigatórios (QA/CodeQL) nos PRs, adicionando trigger pull_request ao workflow.
Repositório recriado e acessos de time reconfigurados.
Corrigido erro de deploy no ArgoCD: cluster de destino incorreto e toleration de node incompatível com o taint real do node pool (appmcmv).

Status final: aplicações DES e TQS em estado Healthy/Synced no ArgoCD, pipeline executando com sucesso nos dois ambientes. Demanda concluída.
