Demanda de configuração dos templates padrão de GitHub Actions para sinsh-backend-simulador-pj concluída.

Workflow adicionado:
• call-docs-pipelines.yaml (Documentação) → aponta caixagithub/DevSecOps-Solutions/techdocs-pipelines.yaml@main

Workflows já existentes no repositório:
• call-generic-pipelines.yaml (CI/CD)
• call-generic-qa-pipelines.yaml (SAST)
• call-generic-sec-pipelines.yaml (CodeQL)

Status atual:
- PR aberto e aguardando aprovação de revisor com write access
- CodeQL em andamento
- Após aprovação, será realizado o merge

Bloqueadores externos:
- Cluster AKS (aks-sinsh-nprd) ainda não foi provisionado no Azure
- Deploy em DES/TQS depende da criação do cluster pela infraestrutura

Próximas ações:
- Aprovação do PR pelos mantenedores do repositório
- Merge no main
- Solicitar ao time de infraestrutura (CETEL) provisionamento do AKS para habilitar deploy
