Demanda de configuração dos templates padrão de GitHub Actions para sinsh-backend-simulador-pj concluída.

Workflows adicionados:
• call-generic-pipelines.yaml (CI/CD) → aponta caixagithub/DevSecOps-Solutions/generic-pipelines.yaml@main
• call-generic-qa-pipelines.yaml (SAST) → aponta caixagithub/DevSecOps-Solutions/quality-assurance.yml@main
• call-generic-sec-pipelines.yaml (CodeQL) → aponta caixagithub/DevSecOps-Solutions/codeql-pipelines.yaml@main
• call-docs-pipelines.yaml (Documentação) → aponta caixagithub/DevSecOps-Solutions/techdocs-pipelines.yaml@main

Status atual:
- PR aberto e aguardando aprovação de revisor com write access
- CodeQL em andamento
- Após aprovação, será realizado o merge

Próximas ações:
- Aprovação do PR pelos mantenedores do repositório
- Merge no main
- Deploy ainda depende do provisionamento do cluster AKS (aks-sinsh-nprd) no Azure
