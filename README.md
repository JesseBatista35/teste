Assunto: Resolução — Falha de sincronização ArgoCD / CreateContainerConfigError — sirmc-api-registro-interacoes-clientes (DES)

Aplicação: sirmc-api-registro-interacoes-clientes-des
Ambiente: DES
Cluster: aks-crm-nprd

Descrição do problema:
A aplicação apresentava falha de sincronização no ArgoCD, com os pods entrando em CreateContainerConfigError e posteriormente em CrashLoopBackOff. A causa raiz identificada foi divergência entre os nomes dos secrets referenciados no values.yaml do chart Helm (caixa-base-chart) e os nomes reais dos objetos AzureKeyVaultSecret provisionados no Key Vault kv-crm-nprd.

Causas identificadas:

Referência a um secret inexistente akvs-sirmc-sqlserver-connectionstring no bloco secretRefs, sem manifesto correspondente no diretório des/templates.
Nome incorreto do secret de Application Insights na variável de ambiente ApplicationInsights__ConnectionString (akvs-applicationinsightsconnectionstring e posteriormente akvs-shared-applicationinsightsconnectionstring, ambos sem o hífen correto), divergente do objeto real akvs-shared-applicationinsights-connectionstring.

Correções aplicadas:

Remoção do secretRefs obsoleto referenciando o secret inexistente.
Correção do nome do secret de Application Insights no values.yaml para akvs-shared-applicationinsights-connectionstring@azurekeyvault.

Validação:
Após o commit das correções e resincronização automática via ArgoCD (revisão fe6c02e), o injetor de secrets (akv2k8s/vaultenv) passou a injetar corretamente as três variáveis de ambiente (Database__Password, Database__UserId, ApplicationInsights__ConnectionString). O container iniciou normalmente e a aplicação .NET subiu com sucesso, respondendo na porta 8080.

Status atual:

App Health: Healthy
Sync Status: Synced (HEAD fe6c02e)
Pod: running, 1/1
Observação: painel do ArgoCD sinaliza 1 Warning pendente de verificação — recomenda-se acompanhamento, sem impacto na disponibilidade atual da aplicação.

Encerramento: Incidente resolvido via correção de configuração no repositório de infraestrutura (sirmc-api-registro-interacoes-clientes-infranprd), dentro do escopo da esteira DevOps.
