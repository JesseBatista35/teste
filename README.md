Com os dados informados, ajustamos o GitOps para o cluster aks-hab-des e configuramos o Istio para o host sisph-api-painel-ddd.des.caixa, com o certificado lido do Key Vault kv-hab-des. Também corrigimos a configuração de nodepool (toleration) e o host interno (sisph-api-painel-ddd.apl.des.private.azure), seguindo o padrão do sisph-api-auditoria.

A emissão do certificado não é feita pela nossa equipe. O chamado deve ser aberto para a área de Criptografia/Proteção de Dados, solicitando:

Certificado com CN sisph-api-painel-ddd.des.caixa
Importação no Key Vault kv-hab-des com o nome sisph-api-painel-ddd-des-caixa
Criação do registro DNS sisph-api-painel-ddd.des.caixa, apontando para o ingress do cluster aks-hab-des (mesmo destino do sisph-api-auditoria.des.caixa)

Para garantir que a aplicação suba corretamente, precisamos que nos informem:

Secrets: a aplicação precisa de alguma variável vinda do Key Vault (por exemplo: CosmosDB, EventHub, Blob Storage, Application Insights, como no sisph-api-auditoria)? Se sim, favor informar o nome da variável esperada pela aplicação e o nome do secret no Key Vault.
ConfigMap: existem variáveis de ambiente não sensíveis que a aplicação precise? Hoje o ConfigMap está só com um valor de exemplo.
Health check: a aplicação expõe o endpoint /healthz na porta 8080? Ele é usado nas probes de liveness e readiness.

Enquanto isso, vamos reexecutar o deploy para validar a subida dos pods. Quando o certificado estiver disponível no Key Vault, o acesso HTTPS passa a funcionar sem novas alterações.
