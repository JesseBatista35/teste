Problema: falha na esteira de deploy em DES (Nenhum pod encontrado ou JSON não contém dados esperados) e nenhum recurso exibido no FusionX para o sisph-api-painel-ddd.

Causa raiz: o config.yaml do GitOps (gitops/apps/sisph-api-painel-ddd/des) estava com os dados de HMP (nome, project e path) e apontava para o cluster aks-sisph-nprd, que não existe. Com isso, a aplicação não foi criada no ArgoCD e nenhum pod foi implantado.

Ações realizadas:

Corrigido o config.yaml para o ambiente DES, com destino no cluster aks-hab-des (confirmado pelo solicitante).
Ajustado o values.yaml do repositório sisph-api-painel-ddd-infranprd (DES), seguindo o padrão do sisph-api-auditoria:
Toleration do nodepool alterada para appshab.
Host interno: sisph-api-painel-ddd.apl.des.private.azure.
HTTPS configurado para sisph-api-painel-ddd.des.caixa.
Criado o template AKVS para leitura do certificado sisph-api-painel-ddd-des-caixa no Key Vault kv-hab-des.
Esteira reexecutada com sucesso.

Pendências sob responsabilidade do solicitante:

Abrir chamado para a área de Criptografia/Proteção de Dados para:
emissão do certificado sisph-api-painel-ddd.des.caixa;
importação no kv-hab-des com o nome sisph-api-painel-ddd-des-caixa;
criação do registro DNS.
Após a importação, o HTTPS passa a funcionar sem novas alterações.
Implementar o endpoint de health check /healthz na porta 8080, usado nas probes de liveness e readiness. Até essa implementação, o pod pode não ficar pronto e sofrer reinícios.
